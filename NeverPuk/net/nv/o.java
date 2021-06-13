package net.nv;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.k;
import net.nv.l;
import net.nv.m;
import net.nv.t;
import net.nv.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class o implements w {
   private static final Logger U = LogManager.getLogger();
   private final Map Y = Maps.newHashMap();
   private final Set d = Sets.newHashSet();

   public int L(f var1, String var2) {
      t.Y();
      var2 = var2.trim();
      if(var2.startsWith("/")) {
         var2 = var2.substring(1);
      }

      String[] var4 = var2.split(" ");
      String var5 = var4[0];
      var4 = B(var4);
      net.nv.z var6 = (net.nv.z)this.Y.get(var5);
      int var7 = 0;
      int var8 = this.p(var6, var4);
      if(var6 == null) {
         net.cb.h var9 = new net.cb.h("commands.generic.notFound", new Object[0]);
         var9.E().i(net.cb.z.RED);
         var1.r(var9);
      }

      label126: {
         if(var6.F(this.Y(), var1)) {
            if(var8 > -1) {
               List var15 = m.F(var1, var4[var8], net.ne.l.class);
               String var10 = var4[var8];
               var1.n(l.p.AFFECTED_ENTITIES, var15.size());
               if(var15.isEmpty()) {
                  throw new k("commands.generic.selector.notFound", new Object[]{var4[var8]});
               }

               Iterator var11 = var15.iterator();
               if(var11.hasNext()) {
                  net.ne.l var12 = (net.ne.l)var11.next();
                  var4[var8] = var12.r();
                  if(this.L(var1, var4, var6, var2)) {
                     ++var7;
                  }
               }

               var4[var8] = var10;
            }

            var1.n(l.p.AFFECTED_ENTITIES, 1);
            if(!this.L(var1, var4, var6, var2)) {
               break label126;
            }

            ++var7;
         }

         net.cb.h var16 = new net.cb.h("commands.generic.permission", new Object[0]);
         var16.E().i(net.cb.z.RED);
         var1.r(var16);
      }

      var1.n(l.p.SUCCESS_COUNT, var7);
      return var7;
   }

   protected boolean L(f var1, String[] var2, net.nv.z var3, String var4) {
      var3.c(this.Y(), var1, var2);
      return true;
   }

   protected abstract net.nx.f Y();

   public net.nv.z s(net.nv.z var1) {
      this.Y.put(var1.k(), var1);
      this.d.add(var1);

      for(String var3 : var1.s()) {
         net.nv.z var4 = (net.nv.z)this.Y.get(var3);
         if(!var4.k().equals(var3)) {
            this.Y.put(var3, var1);
         }
      }

      return var1;
   }

   private static String[] B(String[] var0) {
      String[] var1 = new String[var0.length - 1];
      System.arraycopy(var0, 1, var1, 0, var0.length - 1);
      return var1;
   }

   public List X(f var1, String var2, @Nullable net.u.j var3) {
      String[] var4 = var2.split(" ", -1);
      String var5 = var4[0];
      if(var4.length == 1) {
         ArrayList var9 = Lists.newArrayList();

         for(Entry var8 : this.Y.entrySet()) {
            if(h.A(var5, (String)var8.getKey()) && ((net.nv.z)var8.getValue()).F(this.Y(), var1)) {
               var9.add(var8.getKey());
            }
         }

         return var9;
      } else {
         if(var4.length > 1) {
            net.nv.z var6 = (net.nv.z)this.Y.get(var5);
            if(var6.F(this.Y(), var1)) {
               return var6.E(this.Y(), var1, B(var4), var3);
            }
         }

         return Collections.emptyList();
      }
   }

   public List C(f var1) {
      ArrayList var2 = Lists.newArrayList();

      for(net.nv.z var4 : this.d) {
         if(var4.F(this.Y(), var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public Map g() {
      return this.Y;
   }

   private int p(net.nv.z var1, String[] var2) throws t {
      return -1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
