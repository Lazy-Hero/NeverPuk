package net.yz;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.xn;
import org.apache.commons.lang3.StringUtils;

public class a7 {
   private static final Pattern h = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

   public static String N(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 = var1 % 60;
      return var1 < 10?var2 + ":0" + var1:var2 + ":" + var1;
   }

   public static String z(String var0) {
      return h.matcher(var0).replaceAll("");
   }

   public static boolean Y(@Nullable String var0) {
      return StringUtils.isEmpty(var0);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
