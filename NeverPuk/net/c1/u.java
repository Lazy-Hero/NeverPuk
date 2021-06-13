package net.c1;

import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.nl.z2;

public class u extends c {
   public final u.n Q;

   public u(c.u var1, u.n var2, z2... var3) {
      super(var1, d.ARMOR, var3);
      this.Q = var2;
      if(var2 == u.n.FALL) {
         this.a = d.ARMOR_FEET;
      }

   }

   public int O(int var1) {
      return this.Q.K() + (var1 - 1) * this.Q.V();
   }

   public int x(int var1) {
      return this.O(var1) + this.Q.V();
   }

   public int h() {
      return 4;
   }

   public int U(int var1, net.yz.z var2) {
      String var3 = y.j();
      return var2.a()?0:(this.Q == u.n.ALL?var1:(this.Q == u.n.FIRE && var2.q()?var1 * 2:(this.Q == u.n.FALL && var2 == net.yz.z.H?var1 * 3:(this.Q == u.n.EXPLOSION && var2.e()?var1 * 2:(this.Q == u.n.PROJECTILE && var2.R()?var1 * 2:0)))));
   }

   public String i() {
      return "enchantment.protect." + this.Q.l();
   }

   public boolean k(c var1) {
      if(var1 instanceof u) {
         u var2 = (u)var1;
         return this.Q == var2.Q?false:this.Q == u.n.FALL || var2.Q == u.n.FALL;
      } else {
         return super.k(var1);
      }
   }

   public static int u(net.ne.a var0, int var1) {
      int var2 = y.g(net.nb.u.a, var0);
      var1 = var1 - net.u.t.M((float)var1 * (float)var2 * 0.15F);
      return var1;
   }

   public static double Y(net.ne.a var0, double var1) {
      int var3 = y.g(net.nb.u.T, var0);
      var1 = var1 - (double)net.u.t.L(var1 * (double)((float)var3 * 0.15F));
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n {
      ALL("all", 1, 11, 20),
      FIRE("fire", 10, 8, 12),
      FALL("fall", 5, 6, 10),
      EXPLOSION("explosion", 5, 8, 12),
      PROJECTILE("projectile", 3, 6, 15);

      private final String Z;
      private final int V;
      private final int P;
      private final int G;

      private n(String var3, int var4, int var5, int var6) {
         this.Z = var3;
         this.V = var4;
         this.P = var5;
         this.G = var6;
      }

      public String l() {
         return this.Z;
      }

      public int K() {
         return this.V;
      }

      public int V() {
         return this.P;
      }
   }
}
