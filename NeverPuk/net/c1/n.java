package net.c1;

import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.n0.k1;
import net.n0.ks;
import net.nl.z2;

public class n extends c {
   private static final String[] Y = new String[]{"all", "undead", "arthropods"};
   private static final int[] n = new int[]{1, 5, 5};
   private static final int[] Q = new int[]{11, 8, 8};
   private static final int[] K = new int[]{20, 20, 20};
   public final int E;

   public n(c.u var1, int var2, z2... var3) {
      super(var1, d.WEAPON, var3);
      this.E = var2;
   }

   public int O(int var1) {
      return n[this.E] + (var1 - 1) * Q[this.E];
   }

   public int x(int var1) {
      return this.O(var1) + K[this.E];
   }

   public int h() {
      return 5;
   }

   public float e(int var1, net.ne.u var2) {
      String var3 = y.j();
      return this.E == 0?1.0F + (float)Math.max(0, var1 - 1) * 0.5F:(this.E == 1 && var2 == net.ne.u.UNDEAD?(float)var1 * 2.5F:(this.E == 2 && var2 == net.ne.u.ARTHROPOD?(float)var1 * 2.5F:0.0F));
   }

   public String i() {
      return "enchantment.damage." + Y[this.E];
   }

   public boolean k(c var1) {
      return !(var1 instanceof n);
   }

   public boolean U(ks var1) {
      return var1.Z() instanceof k1 || super.U(var1);
   }

   public void B(net.ne.a var1, net.ne.l var2, int var3) {
      String var4 = y.j();
      if(var2 instanceof net.ne.a) {
         net.ne.a var5 = (net.ne.a)var2;
         if(this.E == 2 && var5.g() == net.ne.u.ARTHROPOD) {
            int var6 = 20 + var1.Q().nextInt(10 * var3);
            var5.o(new net.n_.i(net.nb.b.h, var6, 3));
         }
      }

   }

   static {
      String[] var10000 = new String[]{"all", "undead", "arthropods"};
   }

   private static xn a(xn var0) {
      return var0;
   }
}
