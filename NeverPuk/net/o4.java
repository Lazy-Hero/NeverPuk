package net;

import java.awt.Color;
import java.io.IOException;
import net.ov;
import net.p9;
import net.wm;
import net.xh;
import net.z9;
import net.u.d;
import net.z.m;
import net.z.r;
import net.z.tu;
import org.lwjgl.input.Keyboard;

public class o4 extends tu {
   private final ov Q;
   public String D = "";
   private p9 T;
   private net.z.wd S;

   public o4(tu var1) {
      this.Q = (ov)var1;
   }

   public void t(m var1) throws IOException {
      String[] var2 = z9.F();
      if(var1.O) {
         switch(var1.g) {
         case 0:
            this.A.s(this.Q);
         case 1:
            this.D = wm.x(this.S.u());
         default:
            super.t(var1);
         }
      }
   }

   public void v(int var1, int var2, float var3) {
      xh.J(0.0D, 0.0D, (double)q, (double)V, (new Color(50, 45, 45, 255)).getRGB());
      z9.F();
      this.A.x.I("TheMaltening", (float)q / 2.0F, 6.0F, 16777215);
      this.A.x.I(this.D, (float)q / 2.0F, 18.0F, 16777215);
      this.S.Z();
      if(this.S.u().isEmpty() && !this.S.Y()) {
         this.n(this.A.sO, "Token", q / 2 - 96, 156, -7829368);
      }

      super.v(var1, var2, var3);
      if(d.y() == null) {
         z9.n(new String[5]);
      }

   }

   public void L() {
      r var2 = this.A.sO;
      Keyboard.enableRepeatEvents(true);
      z9.F();
      this.T = new p9(1, q / 2 - 100, 175, "Generate");
      this.m.add(this.T);
      this.m.add(new p9(0, q / 2 - 100, V - 60, "Back"));
      this.S = new net.z.wd(666, var2, q / 2 - 100, 150, 200, 20);
      this.S.u = Integer.MAX_VALUE;
      super.L();
      d.h(new d[1]);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(1 == var2) {
         this.A.s(this.Q);
      } else {
         if(this.S.w) {
            this.S.l(var1, var2);
         }

         super.Q(var1, var2);
      }
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      this.S.N(var1, var2, var3);
      super.C(var1, var2, var3);
   }

   public void K() {
      this.S.K();
      super.K();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
      super.x();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
