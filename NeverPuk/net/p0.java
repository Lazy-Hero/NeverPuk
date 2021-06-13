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

public class p0 extends tu {
   private final tu r;
   protected String f;
   private final d u;
   private static final d.l[] z = new d.l[]{d.l.CLOUDS, d.l.CLOUD_HEIGHT, d.l.TREES, d.l.RAIN, d.l.SKY, d.l.STARS, d.l.SUN_MOON, d.l.SHOW_CAPES, d.l.FOG_FANCY, d.l.FOG_START, d.l.TRANSLUCENT_BLOCKS, d.l.HELD_ITEM_TOOLTIPS, d.l.DROPPED_ITEMS, d.l.ENTITY_SHADOWS, d.l.VIGNETTE, d.l.ALTERNATE_BLOCKS};
   private final uj Z = new uj(this);

   public p0(tu var1, d var2) {
      this.r = var1;
      this.u = var2;
   }

   public void L() {
      mf.O();
      this.f = b.x("of.options.detailsTitle", new Object[0]);
      this.m.clear();
      int var2 = 0;
      if(var2 < z.length) {
         d.l var3 = z[var2];
         int var4 = q / 2 - 155 + var2 % 2 * 160;
         int var5 = V / 6 + 21 * (var2 / 2) - 12;
         if(!var3.k()) {
            this.m.add(new pc(var3.p(), var4, var5, var3, this.u.L(var3)));
         }

         this.m.add(new pt(var3.p(), var4, var5, var3));
         ++var2;
      }

      this.m.add(new m(200, q / 2 - 100, V / 6 + 168 + 11, b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof th) {
            this.u.T(((th)var1).P(), 1);
            var1.J = this.u.L(d.l.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.r);
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.f, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
      this.Z.b(var1, var2, this.m);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
