package net.cl;

import javax.annotation.Nullable;
import net.xn;
import net.cb.q;
import net.cb.t;
import net.cl.p;
import net.cl.r;
import net.cp.v;
import net.n0.ks;
import net.nn.j;
import net.yv.o9;
import net.yz.ab;
import net.yz.m;

public class e {
   private final j v;
   @Nullable
   private r S;
   private static int[] R;

   public e(j var1) {
      this.v = var1;
   }

   public void l(m var1) {
      if(this.S != null) {
         this.S.v(var1);
      }

   }

   public void m(ab var1) {
      if(this.S != null) {
         this.S.J(var1);
      }

   }

   public void f(@Nullable v var1, @Nullable net.u.m var2) {
      if(this.S != null) {
         this.S.H(var1, var2);
      }

   }

   public void O(v var1, net.u.j var2, net.yw.n var3, float var4) {
      if(this.S != null) {
         this.S.l(var1, var2, var3, var4);
      }

   }

   public void f() {
      if(this.S != null) {
         this.S.T();
      }

   }

   public void H(ks var1) {
      if(this.S != null) {
         this.S.f(var1);
      }

   }

   public void O() {
      if(this.S != null) {
         this.S.A();
         this.S = null;
      }

   }

   public void J() {
      if(this.S != null) {
         this.O();
      }

      this.S = this.v.T.iY.r(this);
   }

   public void Y() {
      int[] var1 = j();
      if(this.S != null) {
         if(this.v.s8 != null) {
            this.S.e();
         }

         this.O();
      }

      if(this.v.s8 != null) {
         this.J();
      }

   }

   public void x(p var1) {
      this.v.T.iY = var1;
      this.v.T.m();
      if(this.S != null) {
         this.S.A();
         this.S = var1.r(this);
      }

   }

   public j U() {
      return this.v;
   }

   public o9 y() {
      return this.v.sE == null?o9.NOT_SET:this.v.sE.O();
   }

   public static t n(String var0) {
      q var1 = new q("key." + var0);
      var1.E().f(Boolean.valueOf(true));
      return var1;
   }

   public static void g(int[] var0) {
      R = var0;
   }

   public static int[] j() {
      return R;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(j() != null) {
         g(new int[5]);
      }

   }
}
