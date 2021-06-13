package net;

import net.mf;
import net.pc;
import net.pt;
import net.uj;
import net.xn;
import net.c9.b;
import net.nr.d;
import net.z.m;
import net.z.th;
import net.z.tu;

public class pl extends tu {
   private final tu p;
   protected String H;
   private final d y;
   private static final d.l[] J = new d.l[]{d.l.SMOOTH_FPS, d.l.SMOOTH_WORLD, d.l.FAST_RENDER, d.l.FAST_MATH, d.l.CHUNK_UPDATES, d.l.CHUNK_UPDATES_DYNAMIC, d.l.LAZY_CHUNK_LOADING};
   private final uj Y = new uj(this);

   public pl(tu var1, d var2) {
      this.p = var1;
      this.y = var2;
   }

   public void L() {
      mf.O();
      this.H = b.x("of.options.performanceTitle", new Object[0]);
      this.m.clear();
      int var2 = 0;
      if(var2 < J.length) {
         d.l var3 = J[var2];
         int var4 = q / 2 - 155 + var2 % 2 * 160;
         int var5 = V / 6 + 21 * (var2 / 2) - 12;
         if(!var3.k()) {
            this.m.add(new pc(var3.p(), var4, var5, var3, this.y.L(var3)));
         }

         this.m.add(new pt(var3.p(), var4, var5, var3));
         ++var2;
      }

      this.m.add(new m(200, q / 2 - 100, V / 6 + 168 + 11, b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof th) {
            this.y.T(((th)var1).P(), 1);
            var1.J = this.y.L(d.l.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.p);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.H, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
      this.Y.b(var1, var2, this.m);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
