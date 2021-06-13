package net.z;

import net.xn;
import net.z.g;
import net.z.h;

public abstract class z extends h {
   public z(net.nn.j var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   protected void E(int var1, boolean var2, int var3, int var4) {
   }

   protected boolean z(int var1) {
      return false;
   }

   protected void x() {
   }

   protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      this.m(var1).c(var1, var2, var3, this.C(), var4, var5, var6, this.A(var6) && this.p(var5, var6) == var1, var7);
   }

   protected void N(int var1, int var2, int var3, float var4) {
      this.m(var1).h(var1, var2, var3, var4);
   }

   public boolean x(int var1, int var2, int var3) {
      boolean var4 = g.B();
      if(this.A(var2)) {
         int var5 = this.p(var1, var2);
         if(var5 >= 0) {
            int var6 = this.v + this.x / 2 - this.C() / 2 + 2;
            int var7 = this.a + 4 - this.h() + var5 * this.E + this.B;
            int var8 = var1 - var6;
            int var9 = var2 - var7;
            if(this.m(var5).i(var5, var1, var2, var3, var8, var9)) {
               this.b(false);
               return true;
            }
         }
      }

      return false;
   }

   public boolean U(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.V(); ++var4) {
         int var5 = this.v + this.x / 2 - this.C() / 2 + 2;
         int var6 = this.a + 4 - this.h() + var4 * this.E + this.B;
         int var7 = var1 - var5;
         int var8 = var2 - var6;
         this.m(var4).i(var4, var1, var2, var3, var7, var8);
      }

      this.b(true);
      return false;
   }

   public abstract net.z.z m(int var1);

   private static xn b(xn var0) {
      return var0;
   }

   public interface w {
      void h(int var1, int var2, int var3, float var4);

      void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9);

      boolean i(int var1, int var2, int var3, int var4, int var5, int var6);

      void i(int var1, int var2, int var3, int var4, int var5, int var6);
   }
}
