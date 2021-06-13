package net.c1;

import java.util.Random;
import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.n0.ks;
import net.nl.z2;

public class v extends c {
   public v(c.u var1, z2... var2) {
      super(var1, d.ARMOR_CHEST, var2);
      this.Q("thorns");
   }

   public int O(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int x(int var1) {
      return super.O(var1) + 50;
   }

   public int h() {
      return 3;
   }

   public boolean U(ks var1) {
      return var1.Z() instanceof net.n0.j || super.U(var1);
   }

   public void d(net.ne.a var1, net.ne.l var2, int var3) {
      y.j();
      Random var5 = var1.Q();
      ks var6 = y.I(net.nb.u.v, var1);
      if(j(var3, var5)) {
         if(var2 != null) {
            var2.H(net.yz.z.y(var1), (float)X(var3, var5));
         }

         if(var6.B()) {
            return;
         }

         var6.S(3, var1);
      }

      if(!var6.B()) {
         var6.S(1, var1);
      }

   }

   public static boolean j(int var0, Random var1) {
      return false;
   }

   public static int X(int var0, Random var1) {
      return var0 > 10?var0 - 10:1 + var1.nextInt(4);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
