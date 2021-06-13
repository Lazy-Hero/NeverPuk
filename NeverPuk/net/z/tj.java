package net.z;

import net.xn;
import net.z.g;
import net.z.m;
import net.z.v;

public class tj extends m {
   private boolean B;
   private final String j;
   private final v.e m;

   public tj(v.e var1, int var2, int var3, int var4, String var5, boolean var6) {
      super(var2, var3, var4, 150, 20, "");
      this.j = var5;
      this.B = var6;
      this.J = this.k();
      this.m = var1;
   }

   private String k() {
      boolean var1 = g.C();
      return net.c9.b.x(this.j, new Object[0]) + ": " + net.c9.b.x(this.B?"gui.yes":"gui.no", new Object[0]);
   }

   public void m(boolean var1) {
      this.B = var1;
      this.J = this.k();
      this.m.n(this.g, var1);
   }

   public boolean X(net.nn.j var1, int var2, int var3) {
      boolean var4 = g.B();
      if(super.X(var1, var2, var3)) {
         this.B = !this.B;
         this.J = this.k();
         this.m.n(this.g, this.B);
         return true;
      } else {
         return false;
      }
   }

   private static xn c(xn var0) {
      return var0;
   }
}
