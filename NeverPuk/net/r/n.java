package net.r;

import net.xn;
import net.nj.f;
import net.u.d;

public class n {
   public boolean T;
   public boolean n;
   public boolean P;
   public boolean V;
   public boolean s = true;
   private float J = 0.05F;
   private float D = 0.1F;
   private static String M;

   public void k(f var1) {
      f var3 = new f();
      var3.c("invulnerable", this.T);
      o();
      var3.c("flying", this.n);
      var3.c("mayfly", this.P);
      var3.c("instabuild", this.V);
      var3.c("mayBuild", this.s);
      var3.d("flySpeed", this.J);
      var3.d("walkSpeed", this.D);
      var1.K("abilities", var3);
      if(d.y() == null) {
         b("cF4h0");
      }

   }

   public void q(f var1) {
      String var2 = o();
      if(var1.K("abilities", 10)) {
         f var3 = var1.o("abilities");
         this.T = var3.i("invulnerable");
         this.n = var3.i("flying");
         this.P = var3.i("mayfly");
         this.V = var3.i("instabuild");
         if(var3.K("flySpeed", 99)) {
            this.J = var3.S("flySpeed");
            this.D = var3.S("walkSpeed");
         }

         if(var3.K("mayBuild", 1)) {
            this.s = var3.i("mayBuild");
         }
      }

   }

   public float m() {
      return this.J;
   }

   public void A(float var1) {
      this.J = var1;
   }

   public float V() {
      return this.D;
   }

   public void f(float var1) {
      this.D = var1;
   }

   public static void b(String var0) {
      M = var0;
   }

   public static String o() {
      return M;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      b((String)null);
   }
}
