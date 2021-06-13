package net.yu;

import net.cb.h;
import net.cs.p;
import net.n2.a;
import net.n2.t;
import net.nx.f;
import net.yb.r;
import net.yg.o;
import net.yu.e;
import net.yu.n;

public class w implements r {
   private final f G;
   private final a M;

   public w(f var1, a var2) {
      this.G = var1;
      this.M = var2;
   }

   public void v(o var1) {
      String var2 = e.u();
      switch(null.K[var1.u().ordinal()]) {
      case 1:
         this.M.d(t.LOGIN);
         if(var1.Z() > 340) {
            h var3 = new h("multiplayer.disconnect.outdated_server", new Object[]{"1.12.2"});
            this.M.F(new p(var3));
            this.M.R(var3);
         }

         if(var1.Z() < 340) {
            h var4 = new h("multiplayer.disconnect.outdated_client", new Object[]{"1.12.2"});
            this.M.F(new p(var4));
            this.M.R(var4);
         }

         this.M.Y(new e(this.G, this.M));
      case 2:
         this.M.d(t.STATUS);
         this.M.Y(new n(this.G, this.M));
      default:
         throw new UnsupportedOperationException("Invalid intention " + var1.u());
      }
   }

   public void d(net.cb.t var1) {
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
