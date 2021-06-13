package net.nt;

import net.nt.x;

public class w extends net.nv.h {
   public String k() {
      return "save-on";
   }

   public String K(net.nv.f var1) {
      return "commands.save-on.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      x.O();
      boolean var5 = false;
      int var6 = 0;
      if(var6 < var1.w1.length) {
         if(var1.w1[var6] != null) {
            net.yv.d var7 = var1.w1[var6];
            if(var7.Y) {
               var7.Y = false;
               var5 = true;
            }
         }

         ++var6;
      }

      g(var2, this, "commands.save.enabled", new Object[0]);
      throw new net.nv.t("commands.save-on.alreadyOn", new Object[0]);
   }

   private static net.nv.t a(net.nv.t var0) {
      return var0;
   }
}
