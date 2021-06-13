package net;

import net.m8;
import net.mf;
import net.pc;
import net.pt;
import net.xn;
import net.c9.b;
import net.nr.d;
import net.z.m;
import net.z.t;
import net.z.th;
import net.z.tu;

public class pe extends tu {
   private final tu K;
   protected String W;
   private final d D;
   private static final d.l[] u = new d.l[]{d.l.ANIMATED_WATER, d.l.ANIMATED_LAVA, d.l.ANIMATED_FIRE, d.l.ANIMATED_PORTAL, d.l.ANIMATED_REDSTONE, d.l.ANIMATED_EXPLOSION, d.l.ANIMATED_FLAME, d.l.ANIMATED_SMOKE, d.l.VOID_PARTICLES, d.l.WATER_PARTICLES, d.l.RAIN_SPLASH, d.l.PORTAL_PARTICLES, d.l.POTION_PARTICLES, d.l.DRIPPING_WATER_LAVA, d.l.ANIMATED_TERRAIN, d.l.ANIMATED_TEXTURES, d.l.FIREWORK_PARTICLES, d.l.PARTICLES};

   public pe(tu var1, d var2) {
      this.K = var1;
      this.D = var2;
   }

   public void L() {
      this.W = b.x("of.options.animationsTitle", new Object[0]);
      mf.O();
      this.m.clear();
      int var2 = 0;
      if(var2 < u.length) {
         d.l var3 = u[var2];
         int var4 = q / 2 - 155 + var2 % 2 * 160;
         int var5 = V / 6 + 21 * (var2 / 2) - 12;
         if(!var3.k()) {
            this.m.add(new pc(var3.p(), var4, var5, var3, this.D.L(var3)));
         }

         this.m.add(new pt(var3.p(), var4, var5, var3));
         ++var2;
      }

      this.m.add(new m(210, q / 2 - 155, V / 6 + 168 + 11, 70, 20, m8.i("of.options.animation.allOn")));
      this.m.add(new m(211, q / 2 - 155 + 80, V / 6 + 168 + 11, 70, 20, m8.i("of.options.animation.allOff")));
      this.m.add(new th(200, q / 2 + 5, V / 6 + 168 + 11, b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof th) {
            this.D.T(((th)var1).P(), 1);
            var1.J = this.D.L(d.l.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.K);
         }

         if(var1.g == 210) {
            this.A.T.I(true);
         }

         if(var1.g == 211) {
            this.A.T.I(false);
         }

         t var2 = new t(this.A);
         this.b(this.A, var2.u(), var2.v());
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.W, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
