package net.c1;

import java.util.Random;
import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.n0.ks;
import net.nl.z2;

public class m extends c {
   protected m(c.u var1, z2... var2) {
      super(var1, d.BREAKABLE, var2);
      this.Q("durability");
   }

   public int O(int var1) {
      return 5 + (var1 - 1) * 8;
   }

   public int x(int var1) {
      return super.O(var1) + 50;
   }

   public int h() {
      return 3;
   }

   public boolean U(ks var1) {
      return var1.M() || super.U(var1);
   }

   public static boolean l(ks var0, int var1, Random var2) {
      String var3 = y.j();
      return var0.Z() instanceof net.n0.j && Float.compare(var2.nextFloat(), 0.6F) < 0?false:var2.nextInt(var1 + 1) > 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
