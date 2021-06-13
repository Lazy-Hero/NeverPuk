package net.b;

import net.xn;
import net.b.n;
import net.b.t;
import net.b.u;
import net.ne.y;
import net.u.j;

public class k extends n {
   public k(y var1, net.yv.r var2) {
      super(var1, var2);
   }

   protected u O() {
      this.e = new net.b.z();
      this.e.V(true);
      return new u(this.e);
   }

   protected boolean w() {
      return this.g() && this.c() || !this.U.M();
   }

   protected net.u.r U() {
      return new net.u.r(this.U.b, this.U.hS, this.U.hr);
   }

   public t v(net.ne.l var1) {
      return this.S(new j(var1));
   }

   public void I() {
      ++this.f;
      if(this.B) {
         this.v();
      }

      if(!this.q()) {
         if(this.w()) {
            this.e();
         } else if(this.a != null && this.a.P() < this.a.R()) {
            net.u.r var1 = this.a.C(this.U, this.a.P());
            if(net.u.t.L(this.U.b) == net.u.t.L(var1.p) && net.u.t.L(this.U.hS) == net.u.t.L(var1.H) && net.u.t.L(this.U.hr) == net.u.t.L(var1.a)) {
               this.a.X(this.a.P() + 1);
            }
         }

         this.M();
         if(!this.q()) {
            net.u.r var2 = this.a.i(this.U);
            this.U.m().Q(var2.p, var2.H, var2.a, this.A);
         }
      }

   }

   protected boolean D(net.u.r var1, net.u.r var2, int var3, int var4, int var5) {
      int var7 = net.u.t.L(var1.p);
      n.q();
      int var8 = net.u.t.L(var1.H);
      int var9 = net.u.t.L(var1.a);
      double var10 = var2.p - var1.p;
      double var12 = var2.H - var1.H;
      double var14 = var2.a - var1.a;
      double var16 = var10 * var10 + var12 * var12 + var14 * var14;
      if(var16 < 1.0E-8D) {
         return false;
      } else {
         double var18 = 1.0D / Math.sqrt(var16);
         var10 = var10 * var18;
         var12 = var12 * var18;
         var14 = var14 * var18;
         double var20 = 1.0D / Math.abs(var10);
         double var22 = 1.0D / Math.abs(var12);
         double var24 = 1.0D / Math.abs(var14);
         double var26 = (double)var7 - var1.p;
         double var28 = (double)var8 - var1.H;
         double var30 = (double)var9 - var1.a;
         if(Double.compare(var10, 0.0D) >= 0) {
            ++var26;
         }

         if(Double.compare(var12, 0.0D) >= 0) {
            ++var28;
         }

         if(Double.compare(var14, 0.0D) >= 0) {
            ++var30;
         }

         var26 = var26 / var10;
         var28 = var28 / var12;
         var30 = var30 / var14;
         int var32 = Double.compare(var10, 0.0D) < 0?-1:1;
         int var33 = Double.compare(var12, 0.0D) < 0?-1:1;
         int var34 = Double.compare(var14, 0.0D) < 0?-1:1;
         int var35 = net.u.t.L(var2.p);
         int var36 = net.u.t.L(var2.H);
         int var37 = net.u.t.L(var2.a);
         int var38 = var35 - var7;
         int var39 = var36 - var8;
         int var40 = var37 - var9;
         if(var38 * var32 > 0 || var39 * var33 > 0 || var40 * var34 > 0) {
            if(var26 < var30 && Double.compare(var26, var28) <= 0) {
               var26 += var20;
               var7 = var7 + var32;
               int var10000 = var35 - var7;
            }

            if(Double.compare(var28, var26) < 0 && Double.compare(var28, var30) <= 0) {
               double var50 = var28 + var22;
               var8 = var8 + var33;
               int var51 = var36 - var8;
            }

            double var52 = var30 + var24;
            var9 = var9 + var34;
            int var53 = var37 - var9;
         }

         return true;
      }
   }

   public void o(boolean var1) {
      this.e.s(var1);
   }

   public void N(boolean var1) {
      this.e.V(var1);
   }

   public void B(boolean var1) {
      this.e.O(var1);
   }

   public boolean g() {
      return this.e.R();
   }

   public boolean n(j var1) {
      return this.P.Z(var1).z();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
