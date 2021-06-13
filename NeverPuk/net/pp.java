package net;

import net.mf;
import net.pc;
import net.pt;
import net.uj;
import net.xn;
import net.c9.b;
import net.nr.d;
import net.z.m;
import net.z.t;
import net.z.th;
import net.z.tu;

public class pp extends tu {
   private final tu Q;
   protected String K;
   private final d R;
   private static final d.l[] s = new d.l[]{d.l.MIPMAP_LEVELS, d.l.MIPMAP_TYPE, d.l.AF_LEVEL, d.l.AA_LEVEL, d.l.CLEAR_WATER, d.l.RANDOM_MOBS, d.l.BETTER_GRASS, d.l.BETTER_SNOW, d.l.CUSTOM_FONTS, d.l.CUSTOM_COLORS, d.l.SWAMP_COLORS, d.l.SMOOTH_BIOMES, d.l.CONNECTED_TEXTURES, d.l.NATURAL_TEXTURES, d.l.CUSTOM_SKY, d.l.CUSTOM_ITEMS, d.l.CUSTOM_ENTITY_MODELS, d.l.CUSTOM_GUIS};
   private final uj D = new uj(this);

   public pp(tu var1, d var2) {
      this.Q = var1;
      this.R = var2;
   }

   public void L() {
      this.K = b.x("of.options.qualityTitle", new Object[0]);
      mf.O();
      this.m.clear();
      int var2 = 0;
      if(var2 < s.length) {
         d.l var3 = s[var2];
         int var4 = q / 2 - 155 + var2 % 2 * 160;
         int var5 = V / 6 + 21 * (var2 / 2) - 12;
         if(!var3.k()) {
            this.m.add(new pc(var3.p(), var4, var5, var3, this.R.L(var3)));
         }

         this.m.add(new pt(var3.p(), var4, var5, var3));
         ++var2;
      }

      this.m.add(new m(200, q / 2 - 100, V / 6 + 168 + 11, b.x("gui.done", new Object[0])));
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof th) {
            this.R.T(((th)var1).P(), 1);
            var1.J = this.R.L(d.l.i(var1.g));
         }

         if(var1.g == 200) {
            this.A.T.m();
            this.A.s(this.Q);
         }

         if(var1.g != d.l.AA_LEVEL.ordinal()) {
            t var2 = new t(this.A);
            this.b(this.A, var2.u(), var2.v());
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.d(this.O, this.K, q / 2, 15, 16777215);
      super.v(var1, var2, var3);
      this.D.b(var1, var2, this.m);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
