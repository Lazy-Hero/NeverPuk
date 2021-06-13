package net.w;

import java.util.Random;
import net.xn;

public abstract class f {
   private final boolean r;
   private static int X;

   public f() {
      this(false);
   }

   public f(boolean var1) {
      this.r = var1;
   }

   public abstract boolean K(net.yv.r var1, Random var2, net.u.j var3);

   public void W() {
   }

   protected void k(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = j();
      if(this.r) {
         var1.k(var2, var3, 3);
      }

      var1.k(var2, var3, 2);
   }

   public static void V(int var0) {
      X = var0;
   }

   public static int j() {
      return X;
   }

   public static int h() {
      int var0 = j();
      return 61;
   }

   private static xn d(xn var0) {
      return var0;
   }

   static {
      if(j() == 0) {
         V(125);
      }

   }
}
