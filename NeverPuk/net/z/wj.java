package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class wj extends tu {
   private final tu F;
   private final net.cp.d Y;
   private wd n;

   public wj(tu var1, net.cp.d var2) {
      this.F = var1;
      this.Y = var2;
   }

   public void K() {
      this.n.K();
   }

   public void L() {
      g.B();
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      this.m.add(new m(0, q / 2 - 100, V / 4 + 96 + 12, net.c9.b.x("selectServer.select", new Object[0])));
      this.m.add(new m(1, q / 2 - 100, V / 4 + 120 + 12, net.c9.b.x("gui.cancel", new Object[0])));
      this.n = new wd(2, this.O, q / 2 - 100, 116, 200, 20);
      this.n.r(128);
      this.n.n(true);
      this.n.u(this.A.T.wI);
      ((m)this.m.get(0)).O = !this.n.u().isEmpty() && this.n.u().split(":").length > 0;
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      this.A.T.wI = this.n.u();
      this.A.T.m();
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g == 1) {
            this.F.y(false, 0);
         } else if(var1.g == 0) {
            this.Y.C = this.n.u();
            this.F.y(true, 0);
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      boolean var3 = g.C();
      if(this.n.l(var1, var2)) {
         ((m)this.m.get(0)).O = !this.n.u().isEmpty() && this.n.u().split(":").length > 0;
      }

      if(var2 == 28 || var2 == 156) {
         this.t((m)this.m.get(0));
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.n.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("selectServer.direct", new Object[0]), q / 2, 20, 16777215);
      this.n(this.O, net.c9.b.x("addServer.enterIp", new Object[0]), q / 2 - 100, 100, 10526880);
      this.n.Z();
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
