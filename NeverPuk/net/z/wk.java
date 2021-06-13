package net.z;

import java.io.IOException;
import net.y.ui;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.wd;
import org.apache.commons.io.FileUtils;
import org.lwjgl.input.Keyboard;

public class wk extends tu {
   private final tu s;
   private wd w;
   private final String H;

   public wk(tu var1, String var2) {
      this.s = var1;
      this.H = var2;
   }

   public void K() {
      this.w.K();
   }

   public void L() {
      Keyboard.enableRepeatEvents(true);
      this.m.clear();
      m var2 = this.x(new m(3, q / 2 - 100, V / 4 + 24 + 12, net.c9.b.x("selectWorld.edit.resetIcon", new Object[0])));
      this.m.add(new m(4, q / 2 - 100, V / 4 + 48 + 12, net.c9.b.x("selectWorld.edit.openFolder", new Object[0])));
      this.m.add(new m(0, q / 2 - 100, V / 4 + 96 + 12, net.c9.b.x("selectWorld.edit.save", new Object[0])));
      this.m.add(new m(1, q / 2 - 100, V / 4 + 120 + 12, net.c9.b.x("gui.cancel", new Object[0])));
      g.B();
      var2.O = this.A.l().P(this.H, "icon.png").isFile();
      net.cg.j var3 = this.A.l();
      net.cg.z var4 = var3.y(this.H);
      String var5 = var4 == null?"":var4.M();
      this.w = new wd(2, this.O, q / 2 - 100, 60, 200, 20);
      this.w.n(true);
      this.w.u(var5);
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.C();
      if(var1.O) {
         if(var1.g == 1) {
            this.A.s(this.s);
         }

         if(var1.g == 0) {
            net.cg.j var3 = this.A.l();
            var3.d(this.H, this.w.u().trim());
            this.A.s(this.s);
         }

         if(var1.g == 3) {
            net.cg.j var4 = this.A.l();
            FileUtils.deleteQuietly(var4.P(this.H, "icon.png"));
            var1.O = false;
         }

         if(var1.g == 4) {
            net.cg.j var5 = this.A.l();
            ui.z(var5.P(this.H, "icon.png").getParentFile());
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      this.w.l(var1, var2);
      ((m)this.m.get(2)).O = !this.w.u().trim().isEmpty();
      if(var2 == 28 || var2 == 156) {
         this.t((m)this.m.get(2));
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.w.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, net.c9.b.x("selectWorld.edit.title", new Object[0]), q / 2, 20, 16777215);
      this.n(this.O, net.c9.b.x("selectWorld.enterName", new Object[0]), q / 2 - 100, 47, 10526880);
      this.w.Z();
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
