package net;

import net._v;
import net.sf;
import net.u9;
import net.un;
import net.xn;
import net.u.d;

public class us extends un {
   public us() {
      super("clientname", "Change text displayed on watermark.", "§6.clientname §3<name>", new String[]{"clientname", "name", "rename"});
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
            d.h(new d[2]);
         }

         _v.A(String.format("§lChanged client name to §f\"§a§l%s§f\" was §f\"§c§l%s§f\".", new Object[]{var3.toString().trim(), sf.z}));
         sf.z = var3.toString().trim();
      }

      this.I();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
