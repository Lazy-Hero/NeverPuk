package net;

import net._v;
import net.sy;
import net.u9;
import net.un;
import net.xn;
import net.u.d;

public class u6 extends un {
   public u6() {
      super("password", "Change text displayed on watermark.", "§6.password §3<password]>", new String[]{"password"});
   }

   public void o(String... var1) {
      String var2 = u9.A();
      if(var1.length >= 2) {
         StringBuilder var3 = new StringBuilder();
         int var4 = 1;
         if(var4 < var1.length) {
            String var5 = var1[var4];
            var5 = var5.replace('&', '§');
            var3.append(var5).append(" ");
            ++var4;
         }

         _v.A(String.format("§lChanged password to §f\"§a§l%s§f\" was §f\"§c§l%s§f\".", new Object[]{var3.toString().trim(), sy.I}));
         sy.I = var3.toString().trim();
      }

      this.I();
      if(d.y() == null) {
         u9.y("lfueUb");
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
