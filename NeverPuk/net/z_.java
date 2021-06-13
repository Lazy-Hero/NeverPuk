package net;

import java.awt.Color;
import net.u.d;

public enum z_ {
   SUCCESS((new Color(100, 255, 100)).getRGB()),
   INFO((new Color(100, 100, 255)).getRGB()),
   ERROR((new Color(255, 100, 100)).getRGB()),
   WARNING((new Color(255, 211, 53)).getRGB());

   private final int e;
   private static d[] E;

   private z_(int var3) {
      this.e = var3;
   }

   public int t() {
      return this.e;
   }

   static {
      X(new d[2]);
   }

   public static void X(d[] var0) {
      E = var0;
   }

   public static d[] P() {
      return E;
   }
}
