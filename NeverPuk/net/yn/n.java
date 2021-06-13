package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;

public enum n {
   NONE(0),
   IRON(5, "iron", "meo"),
   GOLD(7, "gold", "goo"),
   DIAMOND(11, "diamond", "dio");

   private final String g;
   private final String p;
   private final int c;

   private n(int var3) {
      this.c = var3;
      this.g = null;
      this.p = "";
   }

   private n(int var3, String var4, String var5) {
      this.c = var3;
      this.g = "textures/entity/horse/armor/horse_armor_" + var4 + ".png";
      this.p = var5;
   }

   public int d() {
      return this.ordinal();
   }

   public String P() {
      return this.p;
   }

   public int y() {
      return this.c;
   }

   @Nullable
   public String B() {
      return this.g;
   }

   public static n X(int var0) {
      return values()[var0];
   }

   public static n o(ks var0) {
      int var1 = net.yn.z.C();
      return var0.B()?NONE:E(var0.Z());
   }

   public static n E(net.n0.y var0) {
      int var1 = net.yn.z.B();
      return var0 == net.nb.j.z?IRON:(var0 == net.nb.j.YQ?GOLD:(var0 == net.nb.j.Yq?DIAMOND:NONE));
   }

   public static boolean J(net.n0.y var0) {
      return E(var0) != NONE;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
