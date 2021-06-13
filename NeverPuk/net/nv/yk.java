package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class yk extends h {
   public String k() {
      return "playsound";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.playsound.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x(this.K(var2), new Object[0]);
      } else {
         int var5 = 0;
         String var10000 = var3[var5++];
         String var7 = var3[var5++];
         net.yz.p var8 = net.yz.p.j(var7);
         throw new t("commands.playsound.unknownSoundSource", new Object[]{var7});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?o(var3, net.yz.a.h.i()):(var3.length == 2?o(var3, net.yz.p.n()):(var3.length == 3?D(var3, var1.k()):(var3.length > 3 && var3.length <= 6?h(var3, 3, var4):Collections.emptyList())));
   }

   public boolean T(String[] var1, int var2) {
      return var2 == 2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
