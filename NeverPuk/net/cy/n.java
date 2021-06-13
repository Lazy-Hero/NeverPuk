package net.cy;

import net.xn;
import net.cy.b;
import net.cy.p;
import net.cy.s;
import net.u.d;
import net.u.e;

public class n implements s {
   private final b d;
   private double X;
   private double j;
   private double k;

   public n() {
      this(p.K());
   }

   public n(b var1) {
      this.d = var1;
   }

   public void o(double var1, double var3, double var5) {
      this.X = var1;
      this.j = var3;
      this.k = var5;
   }

   public boolean P(double var1, double var3, double var5, double var7, double var9, double var11) {
      b.C();
      boolean var10000 = this.d.r(var1 - this.X, var3 - this.j, var5 - this.k, var7 - this.X, var9 - this.j, var11 - this.k);
      if(d.y() == null) {
         b.Z("Xkjv8b");
      }

      return var10000;
   }

   public boolean E(e var1) {
      return this.P(var1.n, var1.u, var1.N, var1.d, var1.c, var1.r);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
