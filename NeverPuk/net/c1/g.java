package net.c1;

import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.nl.z2;

public class g extends c {
   protected g(c.u var1, d var2, z2... var3) {
      y.j();
      super(var1, var2, var3);
      if(var2 == d.DIGGER) {
         this.Q("lootBonusDigger");
      }

      if(var2 == d.FISHING_ROD) {
         this.Q("lootBonusFishing");
      }

      this.Q("lootBonus");
   }

   public int O(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   public int x(int var1) {
      return super.O(var1) + 50;
   }

   public int h() {
      return 3;
   }

   public boolean k(c var1) {
      return super.k(var1) && var1 != net.nb.u.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
