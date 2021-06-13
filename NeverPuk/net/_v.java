package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.in;
import net.cb.l;
import net.u.d;

public class _v implements in {
   public static String g = "§7[" + ChatFormatting.LIGHT_PURPLE + "N" + ChatFormatting.WHITE + "ever" + ChatFormatting.LIGHT_PURPLE + "H" + ChatFormatting.WHITE + "ook" + ChatFormatting.RESET + "§7] §8>> §f";
   private static d[] k;

   public static void A(String var0) {
      E.sf.r(new l(g + var0));
   }

   static {
      I((d[])null);
   }

   public static void I(d[] var0) {
      k = var0;
   }

   public static d[] L() {
      return k;
   }
}
