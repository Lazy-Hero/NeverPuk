package net.nv;

import java.util.Iterator;
import net.nv.f;
import net.nv.t;
import net.nv.x;
import net.nv.yy;
import net.yv.o9;

public class yn extends yy {
   public String k() {
      return "defaultgamemode";
   }

   public String K(f var1) {
      return "commands.defaultgamemode.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      if(var3.length <= 0) {
         throw new x("commands.defaultgamemode.usage", new Object[0]);
      } else {
         o9 var4 = this.r(var2, var3[0]);
         this.x(var4, var1);
         g(var2, this, "commands.defaultgamemode.success", new Object[]{new net.cb.h("gameMode." + var4.t(), new Object[0])});
      }
   }

   protected void x(o9 var1, net.nx.f var2) {
      t.Y();
      var2.C(var1);
      if(var2.u()) {
         Iterator var4 = var2.c().D().iterator();
         if(var4.hasNext()) {
            net.r.h var5 = (net.r.h)var4.next();
            var5.s(var1);
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
