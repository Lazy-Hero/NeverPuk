package net.y4;

public class z extends net.cg.h {
   private net.nj.f j = new net.nj.f();

   public z(String var1) {
      super(var1);
   }

   public void I(net.nj.f var1) {
      this.j = var1.o("Features");
   }

   public net.nj.f v(net.nj.f var1) {
      var1.K("Features", this.j);
      return var1;
   }

   public void d(net.nj.f var1, int var2, int var3) {
      this.j.K(v(var2, var3), var1);
   }

   public static String v(int var0, int var1) {
      return "[" + var0 + "," + var1 + "]";
   }

   public net.nj.f x() {
      return this.j;
   }
}
