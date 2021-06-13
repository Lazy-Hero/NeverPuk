package net.c1;

import net.c1.c;
import net.c1.d;
import net.nl.z2;

public class p extends c {
   protected p(c.u var1, z2... var2) {
      super(var1, d.WEAPON, var2);
      this.Q("fire");
   }

   public int O(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   public int x(int var1) {
      return super.O(var1) + 50;
   }

   public int h() {
      return 2;
   }
}
