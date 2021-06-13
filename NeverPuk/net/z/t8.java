package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.t0;
import net.z.tb;
import net.z.tc;
import net.z.td;
import net.z.th;
import net.z.tl;
import net.z.tu;
import net.z.tv;
import net.z.we;
import net.z.wl;
import net.z.wv;
import net.z.wy;
import net.z.wz;

public class t8 extends tu {
   private static final net.nr.d[] U = new net.nr.d[]{net.nr.d.FOV};
   private final tu Y;
   private final net.nr.d R;
   private m H;
   private t0 Z;
   protected String B = "Options";

   public t8(tu var1, net.nr.d var2) {
      this.Y = var1;
      this.R = var2;
   }

   public void L() {
      g.C();
      this.B = net.c9.b.x("options.title", new Object[0]);
      int var2 = 0;
      net.nr.d[] var3 = U;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.nr.d var6 = var3[var5];
         if(var6.k()) {
            this.m.add(new tl(var6.p(), q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), var6));
         }

         th var7 = new th(var6.p(), q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), var6, this.R.L(var6));
         this.m.add(var7);
         ++var2;
         ++var5;
      }

      if(this.A.s8 != null) {
         net.yv.l var8 = this.A.s8.k();
         this.H = new m(108, q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), 150, 20, this.D(var8));
         this.m.add(this.H);
         if(this.A.T() && !this.A.s8.B().b()) {
            this.H.V(this.H.h() - 20);
            this.Z = new t0(109, this.H.D + this.H.h(), this.H.R);
            this.m.add(this.Z);
            this.Z.A(this.A.s8.B().s());
            this.Z.O = !this.Z.y();
            this.H.O = !this.Z.y();
         }

         this.H.O = false;
      } else {
         this.m.add(new th(net.nr.d.REALMS_NOTIFICATIONS.p(), q / 2 - 155 + var2 % 2 * 160, V / 6 - 12 + 24 * (var2 >> 1), net.nr.d.REALMS_NOTIFICATIONS, this.R.L(net.nr.d.REALMS_NOTIFICATIONS)));
      }

      this.m.add(new m(110, q / 2 - 155, V / 6 + 48 - 6, 150, 20, net.c9.b.x("options.skinCustomisation", new Object[0])));
      this.m.add(new m(106, q / 2 + 5, V / 6 + 48 - 6, 150, 20, net.c9.b.x("options.sounds", new Object[0])));
      this.m.add(new m(101, q / 2 - 155, V / 6 + 72 - 6, 150, 20, net.c9.b.x("options.video", new Object[0])));
      this.m.add(new m(100, q / 2 + 5, V / 6 + 72 - 6, 150, 20, net.c9.b.x("options.controls", new Object[0])));
      this.m.add(new m(102, q / 2 - 155, V / 6 + 96 - 6, 150, 20, net.c9.b.x("options.language", new Object[0])));
      this.m.add(new m(103, q / 2 + 5, V / 6 + 96 - 6, 150, 20, net.c9.b.x("options.chat.title", new Object[0])));
      this.m.add(new m(105, q / 2 - 155, V / 6 + 120 - 6, 150, 20, net.c9.b.x("options.resourcepack", new Object[0])));
      this.m.add(new m(104, q / 2 + 5, V / 6 + 120 - 6, 150, 20, net.c9.b.x("options.snooper.view", new Object[0])));
      this.m.add(new m(200, q / 2 - 100, V / 6 + 168, net.c9.b.x("gui.done", new Object[0])));
   }

   public String D(net.yv.l var1) {
      net.cb.l var2 = new net.cb.l("");
      var2.h(new net.cb.h("options.difficulty", new Object[0]));
      var2.z(": ");
      var2.h(new net.cb.h(var1.E(), new Object[0]));
      return var2.c();
   }

   public void y(boolean var1, int var2) {
      this.A.s(this);
      if(var2 == 109 && this.A.s8 != null) {
         this.A.s8.B().k(true);
         this.Z.A(true);
         this.Z.O = false;
         this.H.O = false;
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.A.T.m();
      }

      super.Q(var1, var2);
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         if(var1.g < 100 && var1 instanceof th) {
            net.nr.d var2 = ((th)var1).P();
            this.R.T(var2, 1);
            var1.J = this.R.L(net.nr.d.i(var1.g));
         }

         if(var1.g == 108) {
            this.A.s8.B().b(net.yv.l.w(this.A.s8.k().L() + 1));
            this.H.J = this.D(this.A.s8.k());
         }

         if(var1.g == 109) {
            this.A.s(new wz(this, (new net.cb.h("difficulty.lock.title", new Object[0])).c(), (new net.cb.h("difficulty.lock.question", new Object[]{new net.cb.h(this.A.s8.B().k().E(), new Object[0])})).c(), 109));
         }

         if(var1.g == 110) {
            this.A.T.m();
            this.A.s(new td(this));
         }

         if(var1.g == 101) {
            this.A.T.m();
            this.A.s(new wv(this, this.R));
         }

         if(var1.g == 100) {
            this.A.T.m();
            this.A.s(new tv(this, this.R));
         }

         if(var1.g == 102) {
            this.A.T.m();
            this.A.s(new tc(this, this.R, this.A.I()));
         }

         if(var1.g == 103) {
            this.A.T.m();
            this.A.s(new wy(this, this.R));
         }

         if(var1.g == 104) {
            this.A.T.m();
            this.A.s(new wl(this, this.R));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.Y);
         }

         if(var1.g == 105) {
            this.A.T.m();
            this.A.s(new we(this));
         }

         if(var1.g == 106) {
            this.A.T.m();
            this.A.s(new tb(this, this.R));
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.B, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
