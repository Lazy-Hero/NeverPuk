package net.r;

import net.cb.t;

public enum j {
   CAPE(0, "cape"),
   JACKET(1, "jacket"),
   LEFT_SLEEVE(2, "left_sleeve"),
   RIGHT_SLEEVE(3, "right_sleeve"),
   LEFT_PANTS_LEG(4, "left_pants_leg"),
   RIGHT_PANTS_LEG(5, "right_pants_leg"),
   HAT(6, "hat");

   private final int t;
   private final int N;
   private final String h;
   private final t u;

   private j(int var3, String var4) {
      this.t = var3;
      this.N = 1 << var3;
      this.h = var4;
      this.u = new net.cb.h("options.modelPart." + var4, new Object[0]);
   }

   public int b() {
      return this.N;
   }

   public int h() {
      return this.t;
   }

   public String x() {
      return this.h;
   }

   public t r() {
      return this.u;
   }
}
