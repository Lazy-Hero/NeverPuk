package net.yz;

import java.util.Map;
import java.util.Set;
import net.xn;

public enum p {
   MASTER,
   MUSIC,
   RECORDS,
   WEATHER,
   BLOCKS,
   HOSTILE,
   NEUTRAL,
   PLAYERS,
   AMBIENT,
   VOICE;

   private static final Map a;
   private final String M;

   private p(String var3) {
      this.M = var3;
   }

   public String W() {
      return this.M;
   }

   public static p j(String var0) {
      return (p)a.get(var0);
   }

   public static Set n() {
      return a.keySet();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
