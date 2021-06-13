package net.z;

import java.io.IOException;
import net.yv.o9;
import net.z.g;
import net.z.m;
import net.z.tu;

public class wh extends tu {
   private final tu W;
   private m R;
   private m D;
   private String s = "survival";
   private boolean o;

   public wh(tu var1) {
      this.W = var1;
   }

   public void L() {
      this.m.clear();
      this.m.add(new m(101, q / 2 - 155, V - 28, 150, 20, net.c9.b.x("lanServer.start", new Object[0])));
      this.m.add(new m(102, q / 2 + 5, V - 28, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.D = this.x(new m(104, q / 2 - 155, 100, 150, 20, net.c9.b.x("selectWorld.gameMode", new Object[0])));
      this.R = this.x(new m(103, q / 2 + 5, 100, 150, 20, net.c9.b.x("selectWorld.allowCommands", new Object[0])));
      this.n();
   }

   private void n() {
      this.D.J = net.c9.b.x("selectWorld.gameMode", new Object[0]) + ": " + net.c9.b.x("selectWorld.gameMode." + this.s, new Object[0]);
      this.R.J = net.c9.b.x("selectWorld.allowCommands", new Object[0]) + " ";
      if(this.o) {
         this.R.J = this.R.J + net.c9.b.x("options.on", new Object[0]);
      } else {
         this.R.J = this.R.J + net.c9.b.x("options.off", new Object[0]);
      }

   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.B();
      if(var1.g == 102) {
         this.A.s(this.W);
      }

      if(var1.g == 104) {
         if("spectator".equals(this.s)) {
            this.s = "creative";
         }

         if("creative".equals(this.s)) {
            this.s = "adventure";
         }

         if("adventure".equals(this.s)) {
            this.s = "survival";
         }

         this.s = "spectator";
         this.n();
      }

      if(var1.g == 103) {
         this.o = !this.o;
         this.n();
      }

      if(var1.g == 101) {
         this.A.s((tu)null);
         String var3 = this.A.V().e(o9.p(this.s), this.o);
         new net.cb.h("commands.publish.started", new Object[]{var3});
         net.cb.l var4 = new net.cb.l("commands.publish.failed");
         this.A.y.I().G(var4);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("lanServer.title", new Object[0]), q / 2, 50, 16777215);
      this.d(this.O, net.c9.b.x("lanServer.otherPlayers", new Object[0]), q / 2, 82, 16777215);
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
