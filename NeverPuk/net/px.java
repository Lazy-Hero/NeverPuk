package net;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import net.o7;
import net.p1;
import net.p9;
import net.wz;
import net.xh;
import net.u.d;
import net.z.m;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public final class px extends tu {
   private final tu S;
   private o7 F;
   private wz r;
   private net.z.wd Y;

   public px(tu var1) {
      this.S = var1;
   }

   protected void t(m var1) {
      switch(var1.g) {
      case 0:
         (this.r = new wz(new p1(this.Y.u(), this.F.s()))).start();
         break;
      case 1:
         this.A.s(this.S);
         break;
      case 2:
         String var2 = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
         if(var2.contains(":")) {
            String[] var3 = var2.split(":");
            this.Y.u(var3[0]);
            this.F.n(var3[1]);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      xh.T(0.0D, 0.0D, (double)q, (double)V, 0.5D, (new Color(22, 22, 22, 255)).getRGB(), (new Color(60, 60, 60, 255)).getRGB(), true);
      xh.T(new net.yz.m_("neverhook/skeet.png"), 1.0F, 1.0F, 958.0F, 1.0F, Color.white);
      int var10000 = p1.K();
      this.Y.Z();
      this.F.K();
      int var4 = var10000;
      this.A.x.I("Alt Login", (float)q / 2.0F, 20.0F, -1);
      this.A.x.I(this.r == null?net.cb.z.GRAY + "Alts...":this.r.H(), (float)q / 2.0F, 29.0F, -1);
      if(this.Y.u().isEmpty() && !this.Y.Y()) {
         this.n(this.A.sO, "Username / E-Mail", q / 2 - 96, 66, -7829368);
      }

      if(this.F.s().isEmpty() && !this.F.K()) {
         this.n(this.A.sO, "Password", q / 2 - 96, 106, -7829368);
      }

      super.v(var1, var2, var3);
      if(d.y() == null) {
         ++var4;
         p1.w(var4);
      }

   }

   public void L() {
      int var1 = V / 4 + 24;
      this.m.add(new p9(0, q / 2 - 100, var1 + 72 + 12, "Login"));
      this.m.add(new p9(1, q / 2 - 100, var1 + 72 + 12 + 24, "Back"));
      this.m.add(new p9(2, q / 2 - 100, var1 + 72 + 12 - 24, "Import user:pass"));
      this.Y = new net.z.wd(var1, this.A.sO, q / 2 - 100, 60, 200, 20);
      this.F = new o7(this.A.sO, q / 2 - 100, 100, 200, 20);
      this.Y.n(true);
      Keyboard.enableRepeatEvents(true);
   }

   protected void Q(char var1, int var2) {
      super.Q(var1, var2);
      if(var1 == 9) {
         if(!this.Y.Y() && !this.F.K()) {
            this.Y.n(true);
         } else {
            this.Y.n(this.F.K());
            this.F.P(!this.Y.Y());
         }
      }

      if(var1 == 13) {
         this.t((m)this.m.get(0));
      }

      this.Y.l(var1, var2);
      this.F.O(var1, var2);
   }

   protected void C(int var1, int var2, int var3) {
      super.C(var1, var2, var3);
      this.Y.N(var1, var2, var3);
      this.F.k(var1, var2, var3);
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   public void K() {
      this.Y.K();
      this.F.I();
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
