package net.ni;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.w;

public enum s {
   BASE("base", "b"),
   SQUARE_BOTTOM_LEFT("square_bottom_left", "bl", "   ", "   ", "#  "),
   SQUARE_BOTTOM_RIGHT("square_bottom_right", "br", "   ", "   ", "  #"),
   SQUARE_TOP_LEFT("square_top_left", "tl", "#  ", "   ", "   "),
   SQUARE_TOP_RIGHT("square_top_right", "tr", "  #", "   ", "   "),
   STRIPE_BOTTOM("stripe_bottom", "bs", "   ", "   ", "###"),
   STRIPE_TOP("stripe_top", "ts", "###", "   ", "   "),
   STRIPE_LEFT("stripe_left", "ls", "#  ", "#  ", "#  "),
   STRIPE_RIGHT("stripe_right", "rs", "  #", "  #", "  #"),
   STRIPE_CENTER("stripe_center", "cs", " # ", " # ", " # "),
   STRIPE_MIDDLE("stripe_middle", "ms", "   ", "###", "   "),
   STRIPE_DOWNRIGHT("stripe_downright", "drs", "#  ", " # ", "  #"),
   STRIPE_DOWNLEFT("stripe_downleft", "dls", "  #", " # ", "#  "),
   STRIPE_SMALL("small_stripes", "ss", "# #", "# #", "   "),
   CROSS("cross", "cr", "# #", " # ", "# #"),
   STRAIGHT_CROSS("straight_cross", "sc", " # ", "###", " # "),
   TRIANGLE_BOTTOM("triangle_bottom", "bt", "   ", " # ", "# #"),
   TRIANGLE_TOP("triangle_top", "tt", "# #", " # ", "   "),
   TRIANGLES_BOTTOM("triangles_bottom", "bts", "   ", "# #", " # "),
   TRIANGLES_TOP("triangles_top", "tts", " # ", "# #", "   "),
   DIAGONAL_LEFT("diagonal_left", "ld", "## ", "#  ", "   "),
   DIAGONAL_RIGHT("diagonal_up_right", "rd", "   ", "  #", " ##"),
   DIAGONAL_LEFT_MIRROR("diagonal_up_left", "lud", "   ", "#  ", "## "),
   DIAGONAL_RIGHT_MIRROR("diagonal_right", "rud", " ##", "  #", "   "),
   CIRCLE_MIDDLE("circle", "mc", "   ", " # ", "   "),
   RHOMBUS_MIDDLE("rhombus", "mr", " # ", "# #", " # "),
   HALF_VERTICAL("half_vertical", "vh", "## ", "## ", "## "),
   HALF_HORIZONTAL("half_horizontal", "hh", "###", "###", "   "),
   HALF_VERTICAL_MIRROR("half_vertical_right", "vhr", " ##", " ##", " ##"),
   HALF_HORIZONTAL_MIRROR("half_horizontal_bottom", "hhb", "   ", "###", "###"),
   BORDER("border", "bo", "###", "# #", "###"),
   CURLY_BORDER("curly_border", "cbo", new ks(net.nb.f.To)),
   CREEPER("creeper", "cre", new ks(net.nb.j.Y9, 1, 4)),
   GRADIENT("gradient", "gra", "# #", " # ", " # "),
   GRADIENT_UP("gradient_up", "gru", " # ", " # ", "# #"),
   BRICKS("bricks", "bri", new ks(net.nb.f.E)),
   SKULL("skull", "sku", new ks(net.nb.j.Y9, 1, 1)),
   FLOWER("flower", "flo", new ks(net.nb.f.d2, 1, net.y9.n.OXEYE_DAISY.z())),
   MOJANG("mojang", "moj", new ks(net.nb.j.J, 1, 1));

   private final String J;
   private final String l;
   private final String[] K;
   private ks r;

   private s(String var3, String var4) {
      this.K = new String[3];
      this.r = ks.a;
      this.J = var3;
      this.l = var4;
   }

   private s(String var3, String var4, ks var5) {
      this(var3, var4);
      this.r = var5;
   }

   private s(String var3, String var4, String var5, String var6, String var7) {
      this(var3, var4);
      this.K[0] = var5;
      this.K[1] = var6;
      this.K[2] = var7;
   }

   public String u() {
      return this.J;
   }

   public String z() {
      return this.l;
   }

   public String[] B() {
      return this.K;
   }

   public boolean s() {
      int[] var1 = w.C();
      return !this.r.B() || this.K[0] != null;
   }

   public boolean B() {
      return !this.r.B();
   }

   public ks N() {
      return this.r;
   }

   @Nullable
   public static s z(String var0) {
      w.C();
      s[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         s var5 = var2[var4];
         if(var5.l.equals(var0)) {
            return var5;
         }

         ++var4;
      }

      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
