package net.yz;

public enum ac {
   SOLID("Solid"),
   CUTOUT_MIPPED("Mipped Cutout"),
   CUTOUT("Cutout"),
   TRANSLUCENT("Translucent");

   private final String L;

   private ac(String var3) {
      this.L = var3;
   }

   public String toString() {
      return this.L;
   }
}
