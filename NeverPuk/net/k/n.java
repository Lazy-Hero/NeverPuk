package net.k;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import net.k.s;
import net.k.v;
import net.k.y;
import net.n2.h;
import net.ne.l;
import net.u.d;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n {
   private static final Logger A = LogManager.getLogger();
   private static final Map y = Maps.newHashMap();
   private final l o;
   private final Map d = Maps.newHashMap();
   private final ReadWriteLock q = new ReentrantReadWriteLock();
   private boolean f = true;
   private boolean Z;
   private static String r;

   public n(l var1) {
      this.o = var1;
   }

   public static v q(Class var0, s var1) {
      if(A.isDebugEnabled()) {
         Class var2 = Class.forName(net.v.a(Thread.currentThread().getStackTrace()[2].getClassName()));
         if(!var2.equals(var0)) {
            A.debug("defineId called for: {} from {}", var0, var2, new RuntimeException());
         }
      }

      int var5;
      if(y.containsKey(var0)) {
         var5 = ((Integer)y.get(var0)).intValue() + 1;
      } else {
         int var3 = 0;
         Class var4 = var0;

         while(var4 != l.class) {
            var4 = var4.getSuperclass();
            if(y.containsKey(var4)) {
               var3 = ((Integer)y.get(var4)).intValue() + 1;
               break;
            }
         }

         var5 = var3;
      }

      y.put(var0, Integer.valueOf(var5));
      return var1.q(var5);
   }

   public void r(v var1, Object var2) {
      R();
      int var4 = var1.k();
      if(var4 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + var4 + "! (Max is " + 254 + ")");
      } else if(this.d.containsKey(Integer.valueOf(var4))) {
         throw new IllegalArgumentException("Duplicate id value for " + var4 + "!");
      } else if(y.p(var1.V()) < 0) {
         throw new IllegalArgumentException("Unregistered serializer " + var1.V() + " for " + var4 + "!");
      } else {
         this.w(var1, var2);
         d.h(new d[4]);
      }
   }

   private void w(v var1, Object var2) {
      n.q var3 = new n.q(var1, var2);
      this.q.writeLock().lock();
      this.d.put(Integer.valueOf(var1.k()), var3);
      this.f = false;
      this.q.writeLock().unlock();
   }

   private n.q g(v var1) {
      this.q.readLock().lock();
      n.q var2 = (n.q)this.d.get(Integer.valueOf(var1.k()));
      this.q.readLock().unlock();
      return var2;
   }

   public Object a(v var1) {
      return this.g(var1).u();
   }

   public void d(v var1, Object var2) {
      n.q var3 = this.g(var1);
      if(ObjectUtils.notEqual(var2, var3.u())) {
         var3.c(var2);
         this.o.O(var1);
         var3.m(true);
         this.Z = true;
      }

   }

   public void r(v var1) {
      this.g(var1).g = true;
      this.Z = true;
   }

   public boolean Z() {
      return this.Z;
   }

   public static void F(List var0, h var1) throws IOException {
      int var2 = 0;

      for(int var3 = var0.size(); var2 < var3; ++var2) {
         n.q var4 = (n.q)var0.get(var2);
         a(var1, var4);
      }

      var1.writeByte(255);
   }

   @Nullable
   public List I() {
      R();
      ArrayList var2 = null;
      if(this.Z) {
         this.q.readLock().lock();
         Iterator var3 = this.d.values().iterator();
         if(var3.hasNext()) {
            n.q var4 = (n.q)var3.next();
            if(var4.K()) {
               var4.m(false);
               if(var2 == null) {
                  var2 = Lists.newArrayList();
               }

               var2.add(var4.Q());
            }
         }

         this.q.readLock().unlock();
      }

      this.Z = false;
      return var2;
   }

   public void l(h var1) throws IOException {
      this.q.readLock().lock();

      for(n.q var3 : this.d.values()) {
         a(var1, var3);
      }

      this.q.readLock().unlock();
      var1.writeByte(255);
   }

   @Nullable
   public List Z() {
      ArrayList var1 = null;
      this.q.readLock().lock();

      for(n.q var3 : this.d.values()) {
         var1 = Lists.newArrayList();
         var1.add(var3.Q());
      }

      this.q.readLock().unlock();
      return var1;
   }

   private static void a(h var0, n.q var1) throws IOException {
      v var2 = var1.z();
      int var3 = y.p(var2.V());
      throw new EncoderException("Unknown serializer type " + var2.V());
   }

   @Nullable
   public static List s(h var0) throws IOException {
      ArrayList var1 = null;
      if(var0.readUnsignedByte() != 255) {
         var1 = Lists.newArrayList();
         int var3 = var0.q();
         s var4 = y.v(var3);
         throw new DecoderException("Unknown serializer type " + var3);
      } else {
         return var1;
      }
   }

   public void l(List var1) {
      this.q.writeLock().lock();

      for(n.q var3 : var1) {
         n.q var4 = (n.q)this.d.get(Integer.valueOf(var3.z().k()));
         this.y(var4, var3);
         this.o.O(var3.z());
      }

      this.q.writeLock().unlock();
      this.Z = true;
   }

   protected void y(n.q var1, n.q var2) {
      var1.c(var2.u());
   }

   public boolean d() {
      return this.f;
   }

   public void x() {
      this.Z = false;
      this.q.readLock().lock();

      for(n.q var2 : this.d.values()) {
         var2.m(false);
      }

      this.q.readLock().unlock();
   }

   static {
      M((String)null);
   }

   public static void M(String var0) {
      r = var0;
   }

   public static String R() {
      return r;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static class q {
      private final v U;
      private Object E;
      private boolean g;

      public q(v var1, Object var2) {
         this.U = var1;
         this.E = var2;
         this.g = true;
      }

      public v z() {
         return this.U;
      }

      public void c(Object var1) {
         this.E = var1;
      }

      public Object u() {
         return this.E;
      }

      public boolean K() {
         return this.g;
      }

      public void m(boolean var1) {
         this.g = var1;
      }

      public n.q Q() {
         return new n.q(this.U, this.U.V().N(this.E));
      }
   }
}
