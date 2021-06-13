package net.z;

import java.io.IOException;
import java.net.URI;
import net.yz.m_;
import net.z.g;
import net.z.m;
import net.z.tu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class tp extends tu {
   private static final Logger F = LogManager.getLogger();
   private static final m_ r = new m_("textures/gui/demo_background.png");

   public void L() {
      this.m.clear();
      boolean var10000 = true;
      this.m.add(new m(1, q / 2 - 116, V / 2 + 62 + -16, 114, 20, net.c9.b.x("demo.help.buy", new Object[0])));
      this.m.add(new m(2, q / 2 + 2, V / 2 + 62 + -16, 114, 20, net.c9.b.x("demo.help.later", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      switch(var1.g) {
      case 1:
         var1.O = false;
         Class var3 = Class.forName("java.awt.Desktop");
         Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
         var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{new URI("http://www.minecraft.net/store?source=demo")});
         break;
      case 2:
         this.A.s((tu)null);
         this.A.p();
      }

   }

   public void C() {
      super.C();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(r);
      int var1 = (q - 248) / 2;
      int var2 = (V - 166) / 2;
      this.g(var1, var2, 0, 0, 248, 166);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      int var4 = (q - 248) / 2 + 10;
      int var5 = (V - 166) / 2 + 8;
      this.O.v(net.c9.b.x("demo.help.title", new Object[0]), (float)var4, (float)var5, 2039583);
      var5 = var5 + 12;
      net.nr.d var6 = this.A.T;
      this.O.v(net.c9.b.x("demo.help.movementShort", new Object[]{net.nr.d.y(var6.ib.m()), net.nr.d.y(var6.w2.m()), net.nr.d.y(var6.P.m()), net.nr.d.y(var6.tT.m())}), (float)var4, (float)var5, 5197647);
      this.O.v(net.c9.b.x("demo.help.movementMouse", new Object[0]), (float)var4, (float)(var5 + 12), 5197647);
      this.O.v(net.c9.b.x("demo.help.jump", new Object[]{net.nr.d.y(var6.iD.m())}), (float)var4, (float)(var5 + 24), 5197647);
      this.O.v(net.c9.b.x("demo.help.inventory", new Object[]{net.nr.d.y(var6.iH.m())}), (float)var4, (float)(var5 + 36), 5197647);
      this.O.O(net.c9.b.x("demo.help.fullWrapped", new Object[0]), var4, var5 + 68, 218, 2039583);
      super.v(var1, var2, var3);
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
