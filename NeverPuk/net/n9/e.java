package net.n9;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net._i;
import net.gh;
import net.x4;
import net.z9;
import net.n9.f;
import net.n9.j;
import net.n9.o;
import net.n9.p;
import net.n9.r;
import net.n9.t;
import net.n9.x;
import net.n9.y;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e implements j, net.c9.v {
   private static final Logger K = LogManager.getLogger();
   public static final m_ g = new m_("");
   private final Map s = Maps.newHashMap();
   private final List W = Lists.newArrayList();
   private final Map z = Maps.newHashMap();
   private final net.c9.p p;
   private static String[] Z;

   public e(net.c9.p var1) {
      this.p = var1;
   }

   public void E(m_ var1) {
      if(z9.n()) {
         var1 = x4.G(var1);
      }

      if(z9.L()) {
         var1 = _i.F(var1);
      }

      t var2 = (t)this.s.get(var1);
      p var3 = new p(var1);
      this.E(var1, var3);
      if(z9.Q()) {
         gh.A(var3);
      } else {
         y.n(var3.L());
      }

   }

   public boolean e(m_ var1, o var2) {
      if(this.E(var1, var2)) {
         this.W.add(var2);
         return true;
      } else {
         return false;
      }
   }

   public boolean E(m_ var1, t var2) {
      boolean var3 = true;
      var2.c(this.p);
      this.s.put(var1, var2);
      return var3;
   }

   public t m(m_ var1) {
      return (t)this.s.get(var1);
   }

   public m_ u(String var1, x var2) {
      if(var1.equals("logo")) {
         var2 = z9.W(var2);
      }

      Integer var3 = (Integer)this.z.get(var1);
      var3 = Integer.valueOf(1);
      this.z.put(var1, var3);
      m_ var4 = new m_(String.format("dynamic/%s_%d", new Object[]{var1, var3}));
      this.E(var4, var2);
      return var4;
   }

   public void I() {
      for(j var2 : this.W) {
         var2.I();
      }

   }

   public void q(m_ var1) {
      t var2 = this.m(var1);
      this.s.remove(var1);
      y.R(var2.L());
   }

   public void s(net.c9.p var1) {
      d();
      z9.v("*** Reloading textures ***");
      z9.c("Resource packs: " + z9.t());
      Iterator var3 = this.s.keySet().iterator();
      if(var3.hasNext()) {
         m_ var4 = (m_)var3.next();
         String var5 = var4.v();
         if(var5.startsWith("mcpatcher/") || var5.startsWith("optifine/")) {
            t var6 = (t)this.s.get(var4);
            if(var6 instanceof f) {
               f var7 = (f)var6;
               var7.P();
            }

            var3.remove();
         }
      }

      Iterator var8 = this.s.entrySet().iterator();
      if(var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         t var10 = (t)var9.getValue();
         if(var10 == y.J) {
            var8.remove();
         }

         this.E((m_)var9.getKey(), var10);
      }

   }

   public void B() {
      for(Entry var2 : this.s.entrySet()) {
         m_ var3 = (m_)var2.getKey();
         t var4 = (t)var2.getValue();
         if(var4 instanceof r) {
            this.E(var3, var4);
         }
      }

   }

   static {
      K(new String[1]);
   }

   public static void K(String[] var0) {
      Z = var0;
   }

   public static String[] d() {
      return Z;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
