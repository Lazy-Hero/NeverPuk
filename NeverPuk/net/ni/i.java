package net.ni;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.f;
import net.ni.k;
import net.ni.sp;
import net.ni.v;
import net.ni.w;
import net.nl.z1;
import net.y9.z_;
import net.y9.zn;
import net.yz.aq;

public class i extends f implements sp, net.yz.i {
   private net.yz.w k = net.yz.w.C(5, ks.a);
   private int L = -1;
   private long y;

   public static void Q(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.u(i.class, new String[]{"Items"}));
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.k = net.yz.w.C(this.e(), ks.a);
      if(!this.W(var1)) {
         net.nl.h.W(var1, this.k);
      }

      if(var1.K("CustomName", 8)) {
         this.T = var1.J("CustomName");
      }

      this.L = var1.P("TransferCooldown");
   }

   public net.nj.f b(net.nj.f var1) {
      super.b((net.nj.f)var1);
      if(!this.A(var1)) {
         net.nl.h.l(var1, this.k);
      }

      var1.r("TransferCooldown", this.L);
      if(this.H()) {
         var1.b("CustomName", this.T);
      }

      return var1;
   }

   public int e() {
      return this.k.size();
   }

   public ks W(int var1, int var2) {
      this.r((net.r.r)null);
      ks var3 = net.nl.h.n(this.p(), var1, var2);
      return var3;
   }

   public void S(int var1, ks var2) {
      this.r((net.r.r)null);
      this.p().set(var1, var2);
      if(var2.U() > this.m()) {
         var2.u(this.m());
      }

   }

   public String Q() {
      return this.H()?this.T:"container.hopper";
   }

   public int m() {
      return 64;
   }

   public void m() {
      if(this.J != null && !this.J.x) {
         --this.L;
         this.y = this.J.y();
         if(!this.f()) {
            this.t(0);
            this.I();
         }
      }

   }

   private boolean I() {
      if(this.J != null && !this.J.x) {
         if(!this.f() && zn.g(this.B())) {
            boolean var1 = false;
            if(!this.T()) {
               var1 = this.x();
            }

            if(!this.G()) {
               if(!A(this)) {
                  ;
               }

               var1 = true;
            }

            this.t(8);
            this.W();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean T() {
      for(ks var2 : this.k) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public boolean N() {
      return this.T();
   }

   private boolean G() {
      for(ks var2 : this.k) {
         if(var2.B() || var2.U() != var2.j()) {
            return false;
         }
      }

      return true;
   }

   private boolean x() {
      z1 var1 = this.O();
      return false;
   }

   private boolean r(z1 var1, aq var2) {
      if(var1 instanceof net.nl.z) {
         net.nl.z var10 = (net.nl.z)var1;
         int[] var11 = var10.e(var2);

         for(int var8 : var11) {
            ks var9 = var10.A(var8);
            if(var9.B() || var9.U() != var9.j()) {
               return false;
            }
         }
      } else {
         int var3 = var1.e();

         for(int var4 = 0; var4 < var3; ++var4) {
            ks var5 = var1.A(var4);
            if(var5.B() || var5.U() != var5.j()) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean l(z1 var0, aq var1) {
      if(var0 instanceof net.nl.z) {
         net.nl.z var2 = (net.nl.z)var0;
         int[] var3 = var2.e(var1);

         for(int var7 : var3) {
            if(!var2.A(var7).B()) {
               return false;
            }
         }
      } else {
         int var8 = var0.e();

         for(int var9 = 0; var9 < var8; ++var9) {
            if(!var0.A(var9).B()) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean A(sp var0) {
      z1 var1 = g(var0);
      aq var2 = aq.DOWN;
      if(l(var1, var2)) {
         return false;
      } else {
         if(var1 instanceof net.nl.z) {
            net.nl.z var3 = (net.nl.z)var1;
            int[] var4 = var3.e(var2);

            for(int var8 : var4) {
               if(K(var0, var1, var8, var2)) {
                  return true;
               }
            }
         } else {
            int var9 = var1.e();

            for(int var10 = 0; var10 < var9; ++var10) {
               if(K(var0, var1, var10, var2)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean K(sp var0, z1 var1, int var2, aq var3) {
      ks var4 = var1.A(var2);
      if(!var4.B() && Q(var1, var4, var2, var3)) {
         ks var5 = var4.s();
         ks var6 = Q(var1, var0, var1.W(var2, 1), (aq)null);
         if(var6.B()) {
            var1.W();
            return true;
         }

         var1.S(var2, var5);
      }

      return false;
   }

   public static boolean t(z1 var0, z1 var1, net.nm.i var2) {
      boolean var10000 = false;
      return false;
   }

   public static ks Q(z1 var0, z1 var1, ks var2, @Nullable aq var3) {
      if(var1 instanceof net.nl.z) {
         net.nl.z var4 = (net.nl.z)var1;
         int[] var5 = var4.e(var3);

         for(int var6 = 0; var6 < var5.length && !var2.B(); ++var6) {
            var2 = y(var0, var1, var2, var5[var6], var3);
         }
      } else {
         int var7 = var1.e();

         for(int var8 = 0; var8 < var7 && !var2.B(); ++var8) {
            var2 = y(var0, var1, var2, var8, var3);
         }
      }

      return var2;
   }

   private static boolean X(z1 var0, ks var1, int var2, aq var3) {
      return !var0.s(var2, var1)?false:!(var0 instanceof net.nl.z) || ((net.nl.z)var0).Q(var2, var1, var3);
   }

   private static boolean Q(z1 var0, ks var1, int var2, aq var3) {
      return !(var0 instanceof net.nl.z) || ((net.nl.z)var0).i(var2, var1, var3);
   }

   private static ks y(z1 var0, z1 var1, ks var2, int var3, aq var4) {
      ks var5 = var1.A(var3);
      if(X(var1, var2, var3, var4)) {
         boolean var6 = false;
         boolean var7 = var1.N();
         if(var5.B()) {
            var1.S(var3, var2);
            var2 = ks.a;
            var6 = true;
         } else if(N(var5, var2)) {
            int var8 = var2.j() - var5.U();
            int var9 = Math.min(var2.U(), var8);
            var2.H(var9);
            var5.A(var9);
            var6 = true;
         }

         if(var1 instanceof i) {
            i var13 = (i)var1;
            if(!var13.z()) {
               byte var14 = 0;
               if(var0 instanceof i) {
                  i var10 = (i)var0;
                  if(var13.y >= var10.y) {
                     var14 = 1;
                  }
               }

               var13.t(8 - var14);
            }
         }

         var1.W();
      }

      return var2;
   }

   private z1 O() {
      aq var1 = zn.W(this.B());
      return c(this.B(), this.z() + (double)var1.v(), this.h() + (double)var1.z(), this.j() + (double)var1.P());
   }

   public static z1 g(sp var0) {
      return c(var0.B(), var0.z(), var0.h() + 1.0D, var0.j());
   }

   public static List t(net.yv.r var0, double var1, double var3, double var5) {
      return var0.L(net.nm.i.class, new net.u.e(var1 - 0.5D, var3, var5 - 0.5D, var1 + 0.5D, var3 + 1.5D, var5 + 0.5D), net.yz.q.Y);
   }

   public static z1 c(net.yv.r var0, double var1, double var3, double var5) {
      Object var8 = null;
      int var9 = net.u.t.L(var1);
      w.C();
      int var10 = net.u.t.L(var3);
      int var11 = net.u.t.L(var5);
      net.u.j var12 = new net.u.j(var9, var10, var11);
      net.y9.l var13 = var0.Z(var12).Q();
      if(var13.W()) {
         v var14 = var0.L(var12);
         if(var14 instanceof z1) {
            var8 = (z1)var14;
            if(var8 instanceof k && var13 instanceof z_) {
               var8 = ((z_)var13).v(var0, var12, true);
            }
         }
      }

      if(var8 == null) {
         List var15 = var0.S((net.ne.l)null, new net.u.e(var1 - 0.5D, var3 - 0.5D, var5 - 0.5D, var1 + 0.5D, var3 + 0.5D, var5 + 0.5D), net.yz.q.v);
         if(!var15.isEmpty()) {
            var8 = (z1)var15.get(var0.G.nextInt(var15.size()));
         }
      }

      return (z1)var8;
   }

   private static boolean N(ks var0, ks var1) {
      return var0.Z() != var1.Z()?false:(var0.n() != var1.n()?false:(var0.U() > var0.j()?false:ks.a(var0, var1)));
   }

   public double z() {
      return (double)this.S.t() + 0.5D;
   }

   public double h() {
      return (double)this.S.h() + 0.5D;
   }

   public double j() {
      return (double)this.S.y() + 0.5D;
   }

   private void t(int var1) {
      this.L = var1;
   }

   private boolean f() {
      return this.L > 0;
   }

   private boolean z() {
      return this.L > 8;
   }

   public String H() {
      return "minecraft:hopper";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      this.r(var2);
      return new net.nl.k(var1, this, var2);
   }

   protected net.yz.w p() {
      return this.k;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
