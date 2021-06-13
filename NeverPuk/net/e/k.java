package net.e;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.xn;
import net.cb.h;
import net.cb.t;
import net.e.f;
import net.nc.y;
import net.nn.j;
import net.p.n;
import net.p.p;
import net.p.u;
import net.u.d;
import net.yp.b;
import net.yz.m_;
import net.z.g;
import net.z.r;
import net.z.wm;

public class k implements u, n {
   private final List v = Lists.newArrayList();
   private static String t;

   public k() {
      k();
      j var2 = j.b();
      Iterator var3 = var2.s8.J().S().iterator();
      if(var3.hasNext()) {
         y var4 = (y)var3.next();
         this.v.add(new k.l(var4));
      }

   }

   public List U() {
      return this.v;
   }

   public t o() {
      return new h("spectatorMenu.team_teleport.prompt", new Object[0]);
   }

   public void X(p var1) {
      var1.J(this);
   }

   public t m() {
      return new h("spectatorMenu.team_teleport", new Object[0]);
   }

   public void A(float var1, int var2) {
      j.b().n().E(wm.f);
      g.r(0.0F, 0.0F, 16.0F, 0.0F, 16.0F, 16.0F, 256.0F, 256.0F);
   }

   public boolean C() {
      k();
      Iterator var2 = this.v.iterator();
      if(var2.hasNext()) {
         n var3 = (n)var2.next();
         if(var3.C()) {
            return true;
         }
      }

      return false;
   }

   public static void W(String var0) {
      t = var0;
   }

   public static String k() {
      return t;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      W("kjAx9b");
   }

   class l implements n {
      private final y n;
      private final m_ d;
      private final List f;

      public l(y var2) {
         k.t;
         super();
         this.n = var2;
         this.f = Lists.newArrayList();
         Iterator var4 = var2.Q().iterator();
         if(var4.hasNext()) {
            String var5 = (String)var4.next();
            b var6 = j.b().d().L(var5);
            if(var6 != null) {
               this.f.add(var6);
            }
         }

         if(this.f.isEmpty()) {
            this.d = net.c9.y.H();
         }

         String var7 = ((b)this.f.get((new Random()).nextInt(this.f.size()))).J().getName();
         this.d = net.yy.f.m(var7);
         net.yy.f.e(this.d, var7);
         if(d.y() == null) {
            k.t = "p4KJnc";
         }

      }

      public void X(p var1) {
         var1.J(new f(this.f));
      }

      public t m() {
         return new net.cb.l(this.n.a());
      }

      public void A(float var1, int var2) {
         int var4 = -1;
         k.t;
         String var5 = r.N(this.n.G());
         if(var5.length() >= 2) {
            var4 = j.b().sO.Z(var5.charAt(1));
         }

         j.b().n().E(this.d);
         net.y.d.T(var1, var1, var1, (float)var2 / 255.0F);
         g.v(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
         g.v(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
         d.h(new d[3]);
      }

      public boolean C() {
         return !this.f.isEmpty();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
