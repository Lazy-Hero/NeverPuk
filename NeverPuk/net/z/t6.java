package net.z;

import java.io.IOException;
import net.m4;
import net.z.g;
import net.z.m;
import net.z.t8;
import net.z.tt;
import net.z.tu;
import net.z.wh;

public class t6 extends tu {
   private int n;
   private int Z;

   public void L() {
      g.B();
      this.n = 0;
      this.m.clear();
      boolean var10000 = true;
      var10000 = true;
      this.m.add(new m(1, q / 2 - 100, V / 4 + 120 + -16, net.c9.b.x("menu.returnToMenu", new Object[0])));
      if(!this.A.w()) {
         ((m)this.m.get(0)).J = net.c9.b.x("menu.disconnect", new Object[0]);
         this.m.add(new m(90, q / 2 - 100, V / 4 + 72 + -16, "Reconnect"));
      }

      this.m.add(new m(4, q / 2 - 100, V / 4 + 24 + -16, net.c9.b.x("menu.returnToGame", new Object[0])));
      this.m.add(new m(0, q / 2 - 100, V / 4 + 96 + -16, 98, 20, net.c9.b.x("menu.options", new Object[0])));
      m var4 = this.x(new m(7, q / 2 + 2, V / 4 + 96 + -16, 98, 20, net.c9.b.x("menu.shareToLan", new Object[0])));
      var4.O = this.A.T() && !this.A.V().w();
      this.m.add(new m(5, q / 2 - 100, V / 4 + 48 + -16, 98, 20, net.c9.b.x("gui.advancements", new Object[0])));
      this.m.add(new m(6, q / 2 + 2, V / 4 + 48 + -16, 98, 20, net.c9.b.x("gui.stats", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      switch(var1.g) {
      case 0:
         this.A.s(new t8(this, this.A.T));
         break;
      case 1:
         boolean var2 = this.A.w();
         this.A.I();
         var1.O = false;
         this.A.s8.Z();
         this.A.J((net.cp.v)null);
         this.A.s(new tt());
      case 2:
      case 3:
      default:
         break;
      case 4:
         this.A.s((tu)null);
         this.A.p();
         break;
      case 5:
         this.A.s(new net.yx.e(this.A.sf.x3.T()));
         break;
      case 6:
         this.A.s(new net.n7.c(this, this.A.sf.q()));
         break;
      case 7:
         this.A.s(new wh(this));
         break;
      case 90:
         this.A.s8.Z();
         this.A.J((net.cp.v)null);
         this.A.s(new net.cp.e(new tt(), this.A, m4.J));
      }

   }

   public void K() {
      super.K();
      ++this.Z;
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("menu.game", new Object[0]), q / 2, 40, 16777215);
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
