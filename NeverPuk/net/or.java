package net;

import java.awt.Color;

public enum or {
   Combat((new Color(220, 20, 60)).getRGB(), (new Color(137, 3, 42)).getRGB(), "Combat"),
   Movement((new Color(123, 104, 238)).getRGB(), (new Color(73, 63, 151)).getRGB(), "Movement"),
   Visuals((new Color(0, 206, 209)).getRGB(), (new Color(2, 121, 123)).getRGB(), "Visuals"),
   Player((new Color(244, 164, 96)).getRGB(), (new Color(132, 68, 9)).getRGB(), "Player"),
   World((new Color(60, 179, 113)).getRGB(), (new Color(28, 88, 57)).getRGB(), "Misc"),
   Hud((new Color(186, 85, 211)).getRGB(), (new Color(91, 41, 102)).getRGB(), "Hud");

   private final int Q;
   private final int t;
   public String name;
   private static String[] p;

   private or(int var3, int var4, String var5) {
      this.Q = var3;
      this.t = var4;
      this.name = var5;
   }

   public String r() {
      return this.name;
   }

   public int B() {
      return this.Q;
   }

   public int b() {
      return this.t;
   }

   static {
      J(new String[2]);
   }

   public static void J(String[] var0) {
      p = var0;
   }

   public static String[] o() {
      return p;
   }
}
