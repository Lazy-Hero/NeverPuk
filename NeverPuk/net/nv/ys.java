package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.s;
import net.nv.t;
import net.nv.x;
import net.yz.m_;

public class ys extends h {
   public String k() {
      return "function";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.function.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length != 1 && var3.length != 3) {
         throw new x("commands.function.usage", new Object[0]);
      } else {
         m_ var5 = new m_(var3[0]);
         s var6 = var1.J().S(var5);
         throw new t("commands.function.unknown", new Object[]{var5});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?o(var3, var1.J().W().keySet()):(var3.length == 2?D(var3, new String[]{"if", "unless"}):(var3.length == 3?D(var3, var1.k()):Collections.emptyList()));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
