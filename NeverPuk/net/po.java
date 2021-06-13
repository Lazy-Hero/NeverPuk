package net;

import net.mf;
import net.pc;
import net.pt;
import net.uj;
import net.xn;
import net.c9.b;
import net.nr.d;
import net.z.f;
import net.z.m;
import net.z.th;
import net.z.tu;

public class po extends tu implements f {
   private final tu z;
   protected String U;
   private final d r;
   private static final d.l[] W = new d.l[]{d.l.LAGOMETER, d.l.PROFILER, d.l.SHOW_FPS, d.l.ADVANCED_TOOLTIPS, d.l.WEATHER, d.l.TIME, d.l.USE_FULLSCREEN, d.l.FULLSCREEN_MODE, d.l.ANAGLYPH, d.l.AUTOSAVE_TICKS, d.l.SCREENSHOT_SIZE};
   private final uj K = new uj(this);

   public po(tu var1, d var2) {
      this.z = var1;
      this.r = var2;
   }

   public void L() {
      this.U = b.x("of.options.otherTitle", new Object[0]);
      mf.O();
      this.m.clear();
      int var2 = 0;
      if(var2 < W.length) {
         d.l var3 = W[var2];
         int var4 = q / 2 - 155 + var2 % 2 * 160;
         int var5 = V / 6 + 21 * (var2 / 2) - 12;
         if(!var3.k()) {
            this.m.add(new pc(var3.p(), var4, var5, var3, this.r.L(var3)));
         }

         this.m.add(new pt(var3.p(), var4, var5, var3));
         ++var2;
      }

      this.m.add(new m(210, q / 2 - 100, V / 6 + 168 + 11 - 44, b.x("of.options.other.reset", new Object[0])));
      this.m.add(new m(200, q / 2 - 100, V / 6 + 168 + 11, b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof th) {
            this.r.T(((th)var1).P(), 1);
            var1.J = this.r.L(d.l.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.z);
         }

         if(var1.g == 210) {
            this.A.T.m();
            net.z.wz var2 = new net.z.wz(this, b.x("of.message.other.reset", new Object[0]), "", 9999);
            this.A.s(var2);
         }
      }

   }

   public void y(boolean var1, int var2) {
      this.A.T.I();
      this.A.s(this);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.U, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
      this.K.b(var1, var2, this.m);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
