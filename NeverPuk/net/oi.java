package net;

import java.awt.Color;
import net.o7;
import net.ov;
import net.p1;
import net.p9;
import net.xh;
import net.xn;
import net.z.m;
import net.z.tu;

public class oi extends tu {
   private final ov y;
   private net.z.wd p;
   private o7 Q;
   private String a = net.cb.z.GRAY + "Waiting...";

   public oi(ov var1) {
      this.y = var1;
   }

   public void t(m var1) {
      switch(var1.g) {
      case 0:
         this.y.u.G(this.p.u());
         this.y.u.v(this.Q.s());
         this.a = "Edited!";
         break;
      case 1:
         this.A.s(this.y);
      }

   }

   public void v(int var1, int var2, float var3) {
      xh.J(0.0D, 0.0D, (double)q, (double)V, (new Color(50, 45, 45, 255)).getRGB());
      p1.o();
      this.A.x.I("Edit Alt", (float)q / 2.0F, 10.0F, -1);
      this.A.x.I(this.a, (float)q / 2.0F, 20.0F, -1);
      this.p.Z();
      this.Q.K();
      if(this.p.u().isEmpty() && !this.p.Y()) {
         this.n(this.A.sO, "New name", q / 2 - 96, 66, -7829368);
      }

      if(this.Q.s().isEmpty() && !this.Q.K()) {
         this.n(this.A.sO, "New password", q / 2 - 96, 106, -7829368);
      }

      super.v(var1, var2, var3);
   }

   public void L() {
      this.m.add(new p9(0, q / 2 - 100, V / 4 + 92 + 12, "Edit"));
      this.m.add(new p9(1, q / 2 - 100, V / 4 + 116 + 12, "Cancel"));
      this.p = new net.z.wd(this.P, this.A.sO, q / 2 - 100, 60, 200, 20);
      this.Q = new o7(this.A.sO, q / 2 - 100, 100, 200, 20);
   }

   protected void Q(char var1, int var2) {
      this.p.l(var1, var2);
      this.Q.O(var1, var2);
      if(var1 == 9 && (this.p.Y() || this.Q.K())) {
         this.p.n(!this.p.Y());
         this.Q.P(!this.Q.K());
      }

      if(var1 == 13) {
         this.t((m)this.m.get(0));
      }

   }

   protected void C(int var1, int var2, int var3) {
      super.C(var1, var2, var3);
      this.p.N(var1, var2, var3);
      this.Q.k(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
