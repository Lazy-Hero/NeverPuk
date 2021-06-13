package net.y;

import java.awt.Color;
import java.util.List;
import javax.annotation.Nullable;
import net.be;
import net.gn;
import net.i6;
import net.oz;
import net.rd;
import net.v8;
import net.wl;
import net.x7;
import net.z9;
import net.n0.ks;
import net.n0.kw;
import net.n0.yw;
import net.ni.sl;
import net.y.d;
import net.y.n;
import net.y.p;
import net.y.r;
import net.y.ua;
import net.y9.gc;
import net.y9.gi;
import net.y9.go;
import net.y9.gy;
import net.y9.gz;
import net.y9.l0;
import net.y9.lb;
import net.y9.lc;
import net.y9.lh;
import net.y9.li;
import net.y9.ln;
import net.y9.lo;
import net.y9.ri;
import net.y9.rv;
import net.y9.zu;
import net.yz.a_;
import net.yz.ac;
import net.yz.aq;
import net.yz.m_;

public class t implements net.c9.v {
   private static final m_ l = new m_("textures/misc/enchanted_item_glint.png");
   private final boolean g = true;
   public float t;
   private final ua V;
   private final net.n9.e H;
   private final net.yo.b y;
   private m_ x = null;
   private boolean p = false;
   public net.ym.v h = null;

   public t(net.n9.e var1, net.ym.v var2, net.yo.b var3) {
      this.H = var1;
      this.h = var2;
      if(i6.uD.Z()) {
         this.V = (ua)i6.K(i6.uD, new Object[]{var2});
      } else {
         this.V = new ua(var2);
      }

      this.V();
      this.y = var3;
   }

   public ua k() {
      return this.V;
   }

   protected void h(net.n0.y var1, int var2, String var3) {
      this.V.Y(var1, var2, new net.ym.a(var3, "inventory"));
   }

   protected void e(net.y9.l var1, int var2, String var3) {
      this.h(net.n0.y.q(var1), var2, var3);
   }

   private void f(net.y9.l var1, String var2) {
      this.e(var1, 0, var2);
   }

   private void s(net.n0.y var1, String var2) {
      this.h(var1, 0, var2);
   }

   private void L(net.ym.j var1, ks var2) {
      this.O(var1, -1, var2);
   }

   public void m(net.ym.j var1, int var2) {
      this.O(var1, var2, ks.a);
   }

   private void O(net.ym.j var1, int var2, ks var3) {
      r var4 = r.f();
      p var5 = var4.k();
      boolean var6 = net.nn.j.b().p().D();
      boolean var7 = z9.Sk();
      var5.U(ac.SOLID);
      var5.m(7, net.y8.x.d);

      for(aq var11 : aq.VALUES) {
         this.o(var5, var1.h((net.yw.n)null, var11, 0L), var2, var3);
      }

      this.o(var5, var1.h((net.yw.n)null, (aq)null, 0L), var2, var3);
      var4.p();
      var5.U((ac)null);
      d.J();
   }

   public void w(ks var1, net.ym.j var2) {
      if(!var1.B()) {
         d.c();
         d.O(-0.5F, -0.5F, -0.5F);
         if(var2.t()) {
            d.T(1.0F, 1.0F, 1.0F, 1.0F);
            d.F();
            net.c5.y.w.c(var1);
         } else {
            if(z9.r()) {
               var2 = rd.p(var1, var2, this.x, false);
               this.x = null;
            }

            this.L(var2, var1);
            if(var1.q() && (!z9.r() || !rd.R(this, var1, var2))) {
               this.N(var2);
            }
         }

         d.Y();
      }

   }

   private void N(net.ym.j var1) {
      v8 var10000 = (v8)gn.Q.j.d(v8.class);
      if(!z9.r() || rd.P()) {
         if(!z9.Q() || !oz.Hr) {
            d.Y(false);
            d.n(514);
            d.i();
            d.m(d.l.SRC_COLOR, d.k.ONE);
            this.H.E(l);
            if(z9.Q() && !this.p) {
               be.j();
            }

            d.G(5890);
            d.c();
            d.W(8.0F, 8.0F, 8.0F);
            float var3 = (float)(net.nn.j.E() % 3000L) / 3000.0F / 8.0F;
            d.O(var3, 0.0F, 0.0F);
            d.P(-50.0F, 0.0F, 0.0F, 1.0F);
            String var4 = gn.Q.J.S("Enchant color").M();
            if(gn.Q.j.d(v8.class).v()) {
               if(var4.equalsIgnoreCase("Rgb")) {
                  this.m(var1, Color.getHSBColor(v8.N / 255.0F, 1.0F, 1.0F).getRGB());
               }

               if(var4.equalsIgnoreCase("Custom")) {
                  this.m(var1, Color.WHITE.getRGB());
               }
            }

            this.m(var1, -8372020);
         }

         d.Y();
         d.c();
         d.W(8.0F, 8.0F, 8.0F);
         float var5 = (float)(net.nn.j.E() % 4873L) / 4873.0F / 8.0F;
         d.O(-var5, 0.0F, 0.0F);
         d.P(10.0F, 0.0F, 0.0F, 1.0F);
         String var6 = gn.Q.J.S("Enchant color").M();
         if(gn.Q.j.d(v8.class).v()) {
            if(var6.equalsIgnoreCase("Rgb")) {
               this.m(var1, Color.getHSBColor(v8.N / 255.0F, 1.0F, 1.0F).getRGB());
            }

            if(var6.equalsIgnoreCase("Custom")) {
               this.m(var1, Color.WHITE.getRGB());
            }
         }

         this.m(var1, -8372020);
      }

      d.Y();
      d.G(5888);
      d.m(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA);
      d.K();
      d.n(515);
      d.Y(true);
      this.H.E(net.n9.b.N);
      if(z9.Q() && !this.p) {
         be.Y();
      }

   }

   private void V(p var1, net.ym.t var2) {
      net.u.d var3 = var2.c().E();
      var1.g((float)var3.t(), (float)var3.h(), (float)var3.y());
   }

   private void Q(p var1, net.ym.t var2, int var3) {
      if(var1.b()) {
         var1.o(var2.G());
         var1.J(var2.t());
      } else {
         var1.o(var2.I());
      }

      if(i6.o.r()) {
         i6.H(i6.o, new Object[]{var1, var2, Integer.valueOf(var3)});
      } else {
         var1.Q(var3);
      }

      this.V(var1, var2);
   }

   private void o(p var1, List var2, int var3, ks var4) {
      boolean var5 = var3 == -1 && !var4.B();
      int var6 = 0;

      for(int var7 = var2.size(); var6 < var7; ++var6) {
         net.ym.t var8 = (net.ym.t)var2.get(var6);
         int var9 = var3;
         if(var8.D()) {
            var9 = this.y.u(var4, var8.N());
            if(z9.v()) {
               var9 = x7.X(var4, var8.N(), var9);
            }

            if(n.mZ) {
               var9 = net.n9.y.I(var9);
            }

            var9 = var9 | -16777216;
         }

         this.Q(var1, var8, var9);
      }

   }

   public boolean G(ks var1) {
      net.ym.j var2 = this.V.a(var1);
      return var2.M();
   }

   public void w(ks var1, net.ym.s var2) {
      if(!var1.B()) {
         net.ym.j var3 = this.O(var1, (net.yv.r)null, (net.ne.a)null);
         this.E(var1, var3, var2, false);
      }

   }

   public net.ym.j O(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
      net.ym.j var4 = this.V.a(var1);
      net.n0.y var5 = var1.Z();
      if(z9.r()) {
         if(var5.v()) {
            this.x = var4.q().J(var1, var2, var3);
         }

         net.ym.j var6 = rd.p(var1, var4, this.x, true);
         if(var6 != var4) {
            return var6;
         }
      }

      if(i6.BV.r()) {
         return (net.ym.j)i6.b(var4.q(), i6.BV, new Object[]{var4, var1, var2, var3});
      } else if(var5.v()) {
         m_ var7 = var4.q().J(var1, var2, var3);
         return var4;
      } else {
         return var4;
      }
   }

   public void i(ks var1, net.ne.a var2, net.ym.s var3, boolean var4) {
      if(!var1.B()) {
         net.ym.j var5 = this.O(var1, var2.hl, var2);
         this.E(var1, var5, var3, var4);
      }

   }

   protected void E(ks var1, net.ym.j var2, net.ym.s var3, boolean var4) {
      if(!var1.B()) {
         this.H.E(net.n9.b.N);
         this.H.m(net.n9.b.N).s(false, false);
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.F();
         d.d(516, 0.1F);
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         d.c();
         if(i6.BE.r()) {
            var2 = (net.ym.j)i6.H(i6.BE, new Object[]{var2, var3, Boolean.valueOf(var4)});
         } else {
            net.ym.s var5 = var2.D();
            net.ym.s.r(var5.v(var3), var4);
            if(this.m(var5.v(var3))) {
               d.s(d.o.FRONT);
            }
         }

         rd.e(var4);
         this.w(var1, var2);
         rd.e(false);
         d.s(d.o.BACK);
         d.Y();
         d.g();
         d.E();
         this.H.E(net.n9.b.N);
         this.H.m(net.n9.b.N).f();
      }

   }

   private boolean m(net.ym.c var1) {
      return var1.N.x < 0.0F ^ var1.N.y < 0.0F ^ var1.N.z < 0.0F;
   }

   public void i(ks var1, int var2, int var3) {
      this.n(var1, var2, var3, this.O(var1, (net.yv.r)null, (net.ne.a)null));
   }

   protected void n(ks var1, int var2, int var3, net.ym.j var4) {
      this.p = true;
      d.c();
      this.H.E(net.n9.b.N);
      this.H.m(net.n9.b.N).s(false, false);
      d.F();
      d.m();
      d.d(516, 0.1F);
      d.C();
      d.m(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.l(var2, var3, var4.M());
      if(i6.BE.r()) {
         var4 = (net.ym.j)i6.H(i6.BE, new Object[]{var4, net.ym.s.GUI, Boolean.valueOf(false)});
      } else {
         var4.D().q(net.ym.s.GUI);
      }

      this.w(var1, var4);
      d.d();
      d.g();
      d.i();
      d.Y();
      this.H.E(net.n9.b.N);
      this.H.m(net.n9.b.N).f();
      this.p = false;
   }

   private void l(int var1, int var2, boolean var3) {
      d.O((float)var1, (float)var2, 100.0F + this.t);
      d.O(8.0F, 8.0F, 0.0F);
      d.W(1.0F, -1.0F, 1.0F);
      d.W(16.0F, 16.0F, 16.0F);
      d.K();
   }

   public void M(ks var1, int var2, int var3) {
      this.g(net.nn.j.b().sf, var1, var2, var3);
   }

   public void g(@Nullable net.ne.a var1, ks var2, int var3, int var4) {
      if(!var2.B()) {
         this.t += 50.0F;
         this.n(var2, var3, var4, this.O(var2, (net.yv.r)null, var1));
         this.t -= 50.0F;
      }

   }

   public void q(net.z.r var1, ks var2, int var3, int var4) {
      this.G(var1, var2, var3, var4, (String)null);
   }

   public void G(net.z.r var1, ks var2, int var3, int var4, @Nullable String var5) {
      if(!var2.B()) {
         if(var2.U() == 1) {
            ;
         }

         String var6 = String.valueOf(var2.U());
         d.i();
         d.z();
         d.E();
         var1.U(var6, (float)(var3 + 19 - 2 - var1.r(var6)), (float)(var4 + 6 + 3), 16777215);
         d.K();
         d.B();
         d.C();
         if(wl.z(var2)) {
            d.i();
            d.z();
            d.w();
            d.d();
            d.E();
            r var16 = r.f();
            p var7 = var16.k();
            float var8 = (float)var2.z();
            float var9 = (float)var2.Z();
            float var10 = Math.max(0.0F, (var9 - var8) / var9);
            int var11 = Math.round(13.0F - var8 * 13.0F / var9);
            int var12 = net.u.t.C(var10 / 3.0F, 1.0F, 1.0F);
            if(i6.uE.r() && i6.T.r()) {
               double var13 = i6.z(var2.Z(), i6.uE, new Object[]{var2});
               int var15 = i6.B(var2.Z(), i6.T, new Object[]{var2});
               var11 = Math.round(13.0F - (float)var13 * 13.0F);
               var12 = var15;
            }

            if(z9.v()) {
               var12 = x7.M(var10, var12);
            }

            if(i6.uE.r() && i6.T.r()) {
               double var19 = i6.z(var2.Z(), i6.uE, new Object[]{var2});
               int var20 = i6.B(var2.Z(), i6.T, new Object[]{var2});
               var11 = Math.round(13.0F - (float)var19 * 13.0F);
               var12 = var20;
            }

            if(z9.v()) {
               var12 = x7.M(var10, var12);
            }

            this.r(var7, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
            this.r(var7, var3 + 2, var4 + 13, var11, 1, var12 >> 16 & 255, var12 >> 8 & 255, var12 & 255, 255);
            d.C();
            d.m();
            d.S();
            d.K();
            d.B();
         }

         net.yy.g var17 = net.nn.j.b().sf;
         float var18 = 0.0F;
         float var21;
         int var10000 = (var21 = var18 - 0.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
      }

   }

   private void r(p var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.m(7, net.y8.x.F);
      var1.H((double)(var2 + 0), (double)(var3 + 0), 0.0D).V(var6, var7, var8, var9).W();
      var1.H((double)(var2 + 0), (double)(var3 + var5), 0.0D).V(var6, var7, var8, var9).W();
      var1.H((double)(var2 + var4), (double)(var3 + var5), 0.0D).V(var6, var7, var8, var9).W();
      var1.H((double)(var2 + var4), (double)(var3 + 0), 0.0D).V(var6, var7, var8, var9).W();
      r.f().p();
   }

   private void V() {
      this.f(net.nb.f.uc, "anvil_intact");
      this.e(net.nb.f.uc, 1, "anvil_slightly_damaged");
      this.e(net.nb.f.uc, 2, "anvil_very_damaged");
      this.e(net.nb.f.uK, kw.BLACK.d(), "black_carpet");
      this.e(net.nb.f.uK, kw.BLUE.d(), "blue_carpet");
      this.e(net.nb.f.uK, kw.BROWN.d(), "brown_carpet");
      this.e(net.nb.f.uK, kw.CYAN.d(), "cyan_carpet");
      this.e(net.nb.f.uK, kw.GRAY.d(), "gray_carpet");
      this.e(net.nb.f.uK, kw.GREEN.d(), "green_carpet");
      this.e(net.nb.f.uK, kw.LIGHT_BLUE.d(), "light_blue_carpet");
      this.e(net.nb.f.uK, kw.LIME.d(), "lime_carpet");
      this.e(net.nb.f.uK, kw.MAGENTA.d(), "magenta_carpet");
      this.e(net.nb.f.uK, kw.ORANGE.d(), "orange_carpet");
      this.e(net.nb.f.uK, kw.PINK.d(), "pink_carpet");
      this.e(net.nb.f.uK, kw.PURPLE.d(), "purple_carpet");
      this.e(net.nb.f.uK, kw.RED.d(), "red_carpet");
      this.e(net.nb.f.uK, kw.SILVER.d(), "silver_carpet");
      this.e(net.nb.f.uK, kw.WHITE.d(), "white_carpet");
      this.e(net.nb.f.uK, kw.YELLOW.d(), "yellow_carpet");
      this.e(net.nb.f.od, ln.n.MOSSY.p(), "mossy_cobblestone_wall");
      this.e(net.nb.f.od, ln.n.NORMAL.p(), "cobblestone_wall");
      this.e(net.nb.f.dl, rv.m.COARSE_DIRT.e(), "coarse_dirt");
      this.e(net.nb.f.dl, rv.m.DIRT.e(), "dirt");
      this.e(net.nb.f.dl, rv.m.PODZOL.e(), "podzol");
      this.e(net.nb.f.Tg, net.y9.y.FERN.l(), "double_fern");
      this.e(net.nb.f.Tg, net.y9.y.GRASS.l(), "double_grass");
      this.e(net.nb.f.Tg, net.y9.y.PAEONIA.l(), "paeonia");
      this.e(net.nb.f.Tg, net.y9.y.ROSE.l(), "double_rose");
      this.e(net.nb.f.Tg, net.y9.y.SUNFLOWER.l(), "sunflower");
      this.e(net.nb.f.Tg, net.y9.y.SYRINGA.l(), "syringa");
      this.e(net.nb.f.Tu, gc.i.BIRCH.B(), "birch_leaves");
      this.e(net.nb.f.Tu, gc.i.JUNGLE.B(), "jungle_leaves");
      this.e(net.nb.f.Tu, gc.i.OAK.B(), "oak_leaves");
      this.e(net.nb.f.Tu, gc.i.SPRUCE.B(), "spruce_leaves");
      this.e(net.nb.f.G, gc.i.ACACIA.B() - 4, "acacia_leaves");
      this.e(net.nb.f.G, gc.i.DARK_OAK.B() - 4, "dark_oak_leaves");
      this.e(net.nb.f.u6, gc.i.BIRCH.B(), "birch_log");
      this.e(net.nb.f.u6, gc.i.JUNGLE.B(), "jungle_log");
      this.e(net.nb.f.u6, gc.i.OAK.B(), "oak_log");
      this.e(net.nb.f.u6, gc.i.SPRUCE.B(), "spruce_log");
      this.e(net.nb.f.ub, gc.i.ACACIA.B() - 4, "acacia_log");
      this.e(net.nb.f.ub, gc.i.DARK_OAK.B() - 4, "dark_oak_log");
      this.e(net.nb.f.uX, lh.m.CHISELED_STONEBRICK.U(), "chiseled_brick_monster_egg");
      this.e(net.nb.f.uX, lh.m.COBBLESTONE.U(), "cobblestone_monster_egg");
      this.e(net.nb.f.uX, lh.m.CRACKED_STONEBRICK.U(), "cracked_brick_monster_egg");
      this.e(net.nb.f.uX, lh.m.MOSSY_STONEBRICK.U(), "mossy_brick_monster_egg");
      this.e(net.nb.f.uX, lh.m.STONE.U(), "stone_monster_egg");
      this.e(net.nb.f.uX, lh.m.STONEBRICK.U(), "stone_brick_monster_egg");
      this.e(net.nb.f.oN, gc.i.ACACIA.B(), "acacia_planks");
      this.e(net.nb.f.oN, gc.i.BIRCH.B(), "birch_planks");
      this.e(net.nb.f.oN, gc.i.DARK_OAK.B(), "dark_oak_planks");
      this.e(net.nb.f.oN, gc.i.JUNGLE.B(), "jungle_planks");
      this.e(net.nb.f.oN, gc.i.OAK.B(), "oak_planks");
      this.e(net.nb.f.oN, gc.i.SPRUCE.B(), "spruce_planks");
      this.e(net.nb.f.oT, gi.x.BRICKS.q(), "prismarine_bricks");
      this.e(net.nb.f.oT, gi.x.DARK.q(), "dark_prismarine");
      this.e(net.nb.f.oT, gi.x.ROUGH.q(), "prismarine");
      this.e(net.nb.f.dd, gz.b.CHISELED.s(), "chiseled_quartz_block");
      this.e(net.nb.f.dd, gz.b.DEFAULT.s(), "quartz_block");
      this.e(net.nb.f.dd, gz.b.LINES_Y.s(), "quartz_column");
      this.e(net.nb.f.d2, net.y9.n.ALLIUM.z(), "allium");
      this.e(net.nb.f.d2, net.y9.n.BLUE_ORCHID.z(), "blue_orchid");
      this.e(net.nb.f.d2, net.y9.n.HOUSTONIA.z(), "houstonia");
      this.e(net.nb.f.d2, net.y9.n.ORANGE_TULIP.z(), "orange_tulip");
      this.e(net.nb.f.d2, net.y9.n.OXEYE_DAISY.z(), "oxeye_daisy");
      this.e(net.nb.f.d2, net.y9.n.PINK_TULIP.z(), "pink_tulip");
      this.e(net.nb.f.d2, net.y9.n.POPPY.z(), "poppy");
      this.e(net.nb.f.d2, net.y9.n.RED_TULIP.z(), "red_tulip");
      this.e(net.nb.f.d2, net.y9.n.WHITE_TULIP.z(), "white_tulip");
      this.e(net.nb.f.TF, ri.g.RED_SAND.r(), "red_sand");
      this.e(net.nb.f.TF, ri.g.SAND.r(), "sand");
      this.e(net.nb.f.ul, lo.h.CHISELED.r(), "chiseled_sandstone");
      this.e(net.nb.f.ul, lo.h.DEFAULT.r(), "sandstone");
      this.e(net.nb.f.ul, lo.h.SMOOTH.r(), "smooth_sandstone");
      this.e(net.nb.f.Tj, gy.w.CHISELED.R(), "chiseled_red_sandstone");
      this.e(net.nb.f.Tj, gy.w.DEFAULT.R(), "red_sandstone");
      this.e(net.nb.f.Tj, gy.w.SMOOTH.R(), "smooth_red_sandstone");
      this.e(net.nb.f.X, gc.i.ACACIA.B(), "acacia_sapling");
      this.e(net.nb.f.X, gc.i.BIRCH.B(), "birch_sapling");
      this.e(net.nb.f.X, gc.i.DARK_OAK.B(), "dark_oak_sapling");
      this.e(net.nb.f.X, gc.i.JUNGLE.B(), "jungle_sapling");
      this.e(net.nb.f.X, gc.i.OAK.B(), "oak_sapling");
      this.e(net.nb.f.X, gc.i.SPRUCE.B(), "spruce_sapling");
      this.e(net.nb.f.um, 0, "sponge");
      this.e(net.nb.f.um, 1, "sponge_wet");
      this.e(net.nb.f.T5, kw.BLACK.d(), "black_stained_glass");
      this.e(net.nb.f.T5, kw.BLUE.d(), "blue_stained_glass");
      this.e(net.nb.f.T5, kw.BROWN.d(), "brown_stained_glass");
      this.e(net.nb.f.T5, kw.CYAN.d(), "cyan_stained_glass");
      this.e(net.nb.f.T5, kw.GRAY.d(), "gray_stained_glass");
      this.e(net.nb.f.T5, kw.GREEN.d(), "green_stained_glass");
      this.e(net.nb.f.T5, kw.LIGHT_BLUE.d(), "light_blue_stained_glass");
      this.e(net.nb.f.T5, kw.LIME.d(), "lime_stained_glass");
      this.e(net.nb.f.T5, kw.MAGENTA.d(), "magenta_stained_glass");
      this.e(net.nb.f.T5, kw.ORANGE.d(), "orange_stained_glass");
      this.e(net.nb.f.T5, kw.PINK.d(), "pink_stained_glass");
      this.e(net.nb.f.T5, kw.PURPLE.d(), "purple_stained_glass");
      this.e(net.nb.f.T5, kw.RED.d(), "red_stained_glass");
      this.e(net.nb.f.T5, kw.SILVER.d(), "silver_stained_glass");
      this.e(net.nb.f.T5, kw.WHITE.d(), "white_stained_glass");
      this.e(net.nb.f.T5, kw.YELLOW.d(), "yellow_stained_glass");
      this.e(net.nb.f.J, kw.BLACK.d(), "black_stained_glass_pane");
      this.e(net.nb.f.J, kw.BLUE.d(), "blue_stained_glass_pane");
      this.e(net.nb.f.J, kw.BROWN.d(), "brown_stained_glass_pane");
      this.e(net.nb.f.J, kw.CYAN.d(), "cyan_stained_glass_pane");
      this.e(net.nb.f.J, kw.GRAY.d(), "gray_stained_glass_pane");
      this.e(net.nb.f.J, kw.GREEN.d(), "green_stained_glass_pane");
      this.e(net.nb.f.J, kw.LIGHT_BLUE.d(), "light_blue_stained_glass_pane");
      p.S();
      this.e(net.nb.f.J, kw.LIME.d(), "lime_stained_glass_pane");
      this.e(net.nb.f.J, kw.MAGENTA.d(), "magenta_stained_glass_pane");
      this.e(net.nb.f.J, kw.ORANGE.d(), "orange_stained_glass_pane");
      this.e(net.nb.f.J, kw.PINK.d(), "pink_stained_glass_pane");
      this.e(net.nb.f.J, kw.PURPLE.d(), "purple_stained_glass_pane");
      this.e(net.nb.f.J, kw.RED.d(), "red_stained_glass_pane");
      this.e(net.nb.f.J, kw.SILVER.d(), "silver_stained_glass_pane");
      this.e(net.nb.f.J, kw.WHITE.d(), "white_stained_glass_pane");
      this.e(net.nb.f.J, kw.YELLOW.d(), "yellow_stained_glass_pane");
      this.e(net.nb.f.Ty, kw.BLACK.d(), "black_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.BLUE.d(), "blue_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.BROWN.d(), "brown_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.CYAN.d(), "cyan_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.GRAY.d(), "gray_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.GREEN.d(), "green_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.LIGHT_BLUE.d(), "light_blue_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.LIME.d(), "lime_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.MAGENTA.d(), "magenta_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.ORANGE.d(), "orange_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.PINK.d(), "pink_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.PURPLE.d(), "purple_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.RED.d(), "red_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.SILVER.d(), "silver_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.WHITE.d(), "white_stained_hardened_clay");
      this.e(net.nb.f.Ty, kw.YELLOW.d(), "yellow_stained_hardened_clay");
      this.e(net.nb.f.oy, lc.d.ANDESITE.R(), "andesite");
      this.e(net.nb.f.oy, lc.d.ANDESITE_SMOOTH.R(), "andesite_smooth");
      this.e(net.nb.f.oy, lc.d.DIORITE.R(), "diorite");
      this.e(net.nb.f.oy, lc.d.DIORITE_SMOOTH.R(), "diorite_smooth");
      this.e(net.nb.f.oy, lc.d.GRANITE.R(), "granite");
      this.e(net.nb.f.oy, lc.d.GRANITE_SMOOTH.R(), "granite_smooth");
      this.e(net.nb.f.oy, lc.d.STONE.R(), "stone");
      this.e(net.nb.f.TM, li.t.CRACKED.A(), "cracked_stonebrick");
      this.e(net.nb.f.TM, li.t.DEFAULT.A(), "stonebrick");
      this.e(net.nb.f.TM, li.t.CHISELED.A(), "chiseled_stonebrick");
      this.e(net.nb.f.TM, li.t.MOSSY.A(), "mossy_stonebrick");
      this.e(net.nb.f.Tt, lb.p.BRICK.e(), "brick_slab");
      this.e(net.nb.f.Tt, lb.p.COBBLESTONE.e(), "cobblestone_slab");
      this.e(net.nb.f.Tt, lb.p.WOOD.e(), "old_wood_slab");
      this.e(net.nb.f.Tt, lb.p.NETHERBRICK.e(), "nether_brick_slab");
      this.e(net.nb.f.Tt, lb.p.QUARTZ.e(), "quartz_slab");
      this.e(net.nb.f.Tt, lb.p.SAND.e(), "sandstone_slab");
      this.e(net.nb.f.Tt, lb.p.SMOOTHBRICK.e(), "stone_brick_slab");
      this.e(net.nb.f.Tt, lb.p.STONE.e(), "stone_slab");
      this.e(net.nb.f.T4, l0.u.RED_SANDSTONE.Z(), "red_sandstone_slab");
      this.e(net.nb.f.TU, zu.i.DEAD_BUSH.j(), "dead_bush");
      this.e(net.nb.f.TU, zu.i.FERN.j(), "fern");
      this.e(net.nb.f.TU, zu.i.GRASS.j(), "tall_grass");
      this.e(net.nb.f.S, gc.i.ACACIA.B(), "acacia_slab");
      this.e(net.nb.f.S, gc.i.BIRCH.B(), "birch_slab");
      this.e(net.nb.f.S, gc.i.DARK_OAK.B(), "dark_oak_slab");
      this.e(net.nb.f.S, gc.i.JUNGLE.B(), "jungle_slab");
      this.e(net.nb.f.S, gc.i.OAK.B(), "oak_slab");
      this.e(net.nb.f.S, gc.i.SPRUCE.B(), "spruce_slab");
      this.e(net.nb.f.ur, kw.BLACK.d(), "black_wool");
      this.e(net.nb.f.ur, kw.BLUE.d(), "blue_wool");
      this.e(net.nb.f.ur, kw.BROWN.d(), "brown_wool");
      this.e(net.nb.f.ur, kw.CYAN.d(), "cyan_wool");
      this.e(net.nb.f.ur, kw.GRAY.d(), "gray_wool");
      this.e(net.nb.f.ur, kw.GREEN.d(), "green_wool");
      this.e(net.nb.f.ur, kw.LIGHT_BLUE.d(), "light_blue_wool");
      this.e(net.nb.f.ur, kw.LIME.d(), "lime_wool");
      this.e(net.nb.f.ur, kw.MAGENTA.d(), "magenta_wool");
      this.e(net.nb.f.ur, kw.ORANGE.d(), "orange_wool");
      this.e(net.nb.f.ur, kw.PINK.d(), "pink_wool");
      this.e(net.nb.f.ur, kw.PURPLE.d(), "purple_wool");
      this.e(net.nb.f.ur, kw.RED.d(), "red_wool");
      this.e(net.nb.f.ur, kw.SILVER.d(), "silver_wool");
      this.e(net.nb.f.ur, kw.WHITE.d(), "white_wool");
      this.e(net.nb.f.ur, kw.YELLOW.d(), "yellow_wool");
      this.f(net.nb.f.dJ, "farmland");
      this.f(net.nb.f.dN, "acacia_stairs");
      this.f(net.nb.f.j, "activator_rail");
      this.f(net.nb.f.uB, "beacon");
      this.f(net.nb.f.T8, "bedrock");
      this.f(net.nb.f.x, "birch_stairs");
      this.f(net.nb.f.W, "bookshelf");
      this.f(net.nb.f.E, "brick_block");
      this.f(net.nb.f.E, "brick_block");
      this.f(net.nb.f.u8, "brick_stairs");
      this.f(net.nb.f.df, "brown_mushroom");
      this.f(net.nb.f.dW, "cactus");
      this.f(net.nb.f.uz, "clay");
      this.f(net.nb.f.TR, "coal_block");
      this.f(net.nb.f.oK, "coal_ore");
      this.f(net.nb.f.TD, "cobblestone");
      this.f(net.nb.f.uj, "crafting_table");
      this.f(net.nb.f.dG, "dark_oak_stairs");
      this.f(net.nb.f.u3, "daylight_detector");
      this.f(net.nb.f.dY, "dead_bush");
      this.f(net.nb.f.dw, "detector_rail");
      this.f(net.nb.f.ud, "diamond_block");
      this.f(net.nb.f.TT, "diamond_ore");
      this.f(net.nb.f.v, "dispenser");
      this.f(net.nb.f.Ta, "dropper");
      this.f(net.nb.f.du, "emerald_block");
      this.f(net.nb.f.m, "emerald_ore");
      this.f(net.nb.f.TZ, "enchanting_table");
      this.f(net.nb.f.dE, "end_portal_frame");
      this.f(net.nb.f.Tz, "end_stone");
      this.f(net.nb.f.I, "oak_fence");
      this.f(net.nb.f.u4, "spruce_fence");
      this.f(net.nb.f.d1, "birch_fence");
      this.f(net.nb.f.e, "jungle_fence");
      this.f(net.nb.f.TX, "dark_oak_fence");
      this.f(net.nb.f.op, "acacia_fence");
      this.f(net.nb.f.P, "oak_fence_gate");
      this.f(net.nb.f.u, "spruce_fence_gate");
      this.f(net.nb.f.u_, "birch_fence_gate");
      this.f(net.nb.f.C, "jungle_fence_gate");
      this.f(net.nb.f.q, "dark_oak_fence_gate");
      this.f(net.nb.f.T2, "acacia_fence_gate");
      this.f(net.nb.f.uY, "furnace");
      this.f(net.nb.f.Tm, "glass");
      this.f(net.nb.f.L, "glass_pane");
      this.f(net.nb.f.Tr, "glowstone");
      this.f(net.nb.f.uR, "golden_rail");
      this.f(net.nb.f.uW, "gold_block");
      this.f(net.nb.f.z, "gold_ore");
      this.f(net.nb.f.p, "grass");
      this.f(net.nb.f.A, "grass_path");
      this.f(net.nb.f.D, "gravel");
      this.f(net.nb.f.oY, "hardened_clay");
      this.f(net.nb.f.ow, "hay_block");
      this.f(net.nb.f.dX, "heavy_weighted_pressure_plate");
      this.f(net.nb.f.uq, "hopper");
      this.f(net.nb.f.oD, "ice");
      this.f(net.nb.f.d8, "iron_bars");
      this.f(net.nb.f.TE, "iron_block");
      this.f(net.nb.f.u7, "iron_ore");
      this.f(net.nb.f.up, "iron_trapdoor");
      this.f(net.nb.f.ue, "jukebox");
      this.f(net.nb.f.u5, "jungle_stairs");
      this.f(net.nb.f.K, "ladder");
      this.f(net.nb.f.Ti, "lapis_block");
      this.f(net.nb.f.dT, "lapis_ore");
      this.f(net.nb.f.T_, "lever");
      this.f(net.nb.f.uS, "light_weighted_pressure_plate");
      this.f(net.nb.f.N, "lit_pumpkin");
      this.f(net.nb.f.dm, "melon_block");
      this.f(net.nb.f.T9, "mossy_cobblestone");
      this.f(net.nb.f.u2, "mycelium");
      this.f(net.nb.f.R, "netherrack");
      this.f(net.nb.f.Tb, "nether_brick");
      this.f(net.nb.f.Tx, "nether_brick_fence");
      this.f(net.nb.f.uk, "nether_brick_stairs");
      this.f(net.nb.f.ug, "noteblock");
      this.f(net.nb.f.TQ, "oak_stairs");
      this.f(net.nb.f.c, "obsidian");
      this.f(net.nb.f.d4, "packed_ice");
      this.f(net.nb.f.TP, "piston");
      this.f(net.nb.f.TS, "pumpkin");
      this.f(net.nb.f.s, "quartz_ore");
      this.f(net.nb.f.y, "quartz_stairs");
      this.f(net.nb.f.uU, "rail");
      this.f(net.nb.f.dL, "redstone_block");
      this.f(net.nb.f.uv, "redstone_lamp");
      this.f(net.nb.f.uT, "redstone_ore");
      this.f(net.nb.f.ut, "redstone_torch");
      this.f(net.nb.f.T, "red_mushroom");
      this.f(net.nb.f.TA, "sandstone_stairs");
      this.f(net.nb.f.uD, "red_sandstone_stairs");
      this.f(net.nb.f.uO, "sea_lantern");
      this.f(net.nb.f.di, "slime");
      this.f(net.nb.f.V, "snow");
      this.f(net.nb.f.Tl, "snow_layer");
      this.f(net.nb.f.u9, "soul_sand");
      this.f(net.nb.f.TK, "spruce_stairs");
      this.f(net.nb.f.oG, "sticky_piston");
      this.f(net.nb.f.TV, "stone_brick_stairs");
      this.f(net.nb.f.uE, "stone_button");
      this.f(net.nb.f.Td, "stone_pressure_plate");
      this.f(net.nb.f.uI, "stone_stairs");
      this.f(net.nb.f.T7, "tnt");
      this.f(net.nb.f.uZ, "torch");
      this.f(net.nb.f.or, "trapdoor");
      this.f(net.nb.f.d5, "tripwire_hook");
      this.f(net.nb.f.To, "vine");
      this.f(net.nb.f.dD, "waterlily");
      this.f(net.nb.f.o, "web");
      this.f(net.nb.f.uo, "wooden_button");
      this.f(net.nb.f.dp, "wooden_pressure_plate");
      this.e(net.nb.f.dO, net.y9.n.DANDELION.z(), "dandelion");
      this.f(net.nb.f.dg, "end_rod");
      this.f(net.nb.f.TW, "chorus_plant");
      this.f(net.nb.f.Tn, "chorus_flower");
      this.f(net.nb.f.uA, "purpur_block");
      this.f(net.nb.f.us, "purpur_pillar");
      this.f(net.nb.f.uQ, "purpur_stairs");
      this.f(net.nb.f.dM, "purpur_slab");
      this.f(net.nb.f.T6, "purpur_double_slab");
      this.f(net.nb.f.dV, "end_bricks");
      this.f(net.nb.f.U, "magma");
      this.f(net.nb.f.TH, "nether_wart_block");
      this.f(net.nb.f.Tq, "red_nether_brick");
      this.f(net.nb.f.TI, "bone_block");
      this.f(net.nb.f.f, "structure_void");
      this.f(net.nb.f.ui, "observer");
      this.f(net.nb.f.Tv, "white_shulker_box");
      this.f(net.nb.f.uH, "orange_shulker_box");
      this.f(net.nb.f.TC, "magenta_shulker_box");
      this.f(net.nb.f.d3, "light_blue_shulker_box");
      this.f(net.nb.f.dq, "yellow_shulker_box");
      this.f(net.nb.f.Tp, "lime_shulker_box");
      this.f(net.nb.f.Z, "pink_shulker_box");
      this.f(net.nb.f.dx, "gray_shulker_box");
      this.f(net.nb.f.dC, "silver_shulker_box");
      this.f(net.nb.f.Tw, "cyan_shulker_box");
      this.f(net.nb.f.u0, "purple_shulker_box");
      this.f(net.nb.f.h, "blue_shulker_box");
      this.f(net.nb.f.t, "brown_shulker_box");
      this.f(net.nb.f.dk, "green_shulker_box");
      this.f(net.nb.f.dt, "red_shulker_box");
      this.f(net.nb.f.Te, "black_shulker_box");
      this.f(net.nb.f.Th, "white_glazed_terracotta");
      this.f(net.nb.f.oU, "orange_glazed_terracotta");
      this.f(net.nb.f.Y, "magenta_glazed_terracotta");
      this.f(net.nb.f.n, "light_blue_glazed_terracotta");
      this.f(net.nb.f.T3, "yellow_glazed_terracotta");
      this.f(net.nb.f.ux, "lime_glazed_terracotta");
      this.f(net.nb.f.ua, "pink_glazed_terracotta");
      this.f(net.nb.f.uC, "gray_glazed_terracotta");
      this.f(net.nb.f.un, "silver_glazed_terracotta");
      this.f(net.nb.f.dS, "cyan_glazed_terracotta");
      this.f(net.nb.f.dR, "purple_glazed_terracotta");
      this.f(net.nb.f.oA, "blue_glazed_terracotta");
      this.f(net.nb.f.O, "brown_glazed_terracotta");
      this.f(net.nb.f.d9, "green_glazed_terracotta");
      this.f(net.nb.f.TN, "red_glazed_terracotta");
      this.f(net.nb.f.de, "black_glazed_terracotta");
      kw[] var2 = kw.values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         kw var5 = var2[var4];
         this.e(net.nb.f.w, var5.d(), var5.L() + "_concrete");
         this.e(net.nb.f.db, var5.d(), var5.L() + "_concrete_powder");
         ++var4;
      }

      this.f(net.nb.f.uG, "chest");
      this.f(net.nb.f.dI, "trapped_chest");
      this.f(net.nb.f.uy, "ender_chest");
      this.s(net.nb.j.YC, "iron_shovel");
      this.s(net.nb.j.X, "iron_pickaxe");
      this.s(net.nb.j.Wv, "iron_axe");
      this.s(net.nb.j.YU, "flint_and_steel");
      this.s(net.nb.j.W8, "apple");
      this.s(net.nb.j.w, "bow");
      this.s(net.nb.j.W_, "arrow");
      this.s(net.nb.j.WT, "spectral_arrow");
      this.s(net.nb.j.l, "tipped_arrow");
      this.h(net.nb.j.u, 0, "coal");
      this.h(net.nb.j.u, 1, "charcoal");
      this.s(net.nb.j.B, "diamond");
      this.s(net.nb.j.S1, "iron_ingot");
      this.s(net.nb.j.F, "gold_ingot");
      this.s(net.nb.j.O, "iron_sword");
      this.s(net.nb.j.Yo, "wooden_sword");
      this.s(net.nb.j.Sg, "wooden_shovel");
      this.s(net.nb.j.WA, "wooden_pickaxe");
      this.s(net.nb.j.Y7, "wooden_axe");
      this.s(net.nb.j.S0, "stone_sword");
      this.s(net.nb.j.Wl, "stone_shovel");
      this.s(net.nb.j.Wy, "stone_pickaxe");
      this.s(net.nb.j.Wt, "stone_axe");
      this.s(net.nb.j.YA, "diamond_sword");
      this.s(net.nb.j.WP, "diamond_shovel");
      this.s(net.nb.j.Sx, "diamond_pickaxe");
      this.s(net.nb.j.SY, "diamond_axe");
      this.s(net.nb.j.Wu, "stick");
      this.s(net.nb.j.o, "bowl");
      this.s(net.nb.j.Z, "mushroom_stew");
      this.s(net.nb.j.SP, "golden_sword");
      this.s(net.nb.j.SW, "golden_shovel");
      this.s(net.nb.j.YW, "golden_pickaxe");
      this.s(net.nb.j.G, "golden_axe");
      this.s(net.nb.j.Yd, "string");
      this.s(net.nb.j.YL, "feather");
      this.s(net.nb.j.YP, "gunpowder");
      this.s(net.nb.j.Y8, "wooden_hoe");
      this.s(net.nb.j.Wz, "stone_hoe");
      this.s(net.nb.j.Ye, "iron_hoe");
      this.s(net.nb.j.WX, "diamond_hoe");
      this.s(net.nb.j.SN, "golden_hoe");
      this.s(net.nb.j.Q, "wheat_seeds");
      this.s(net.nb.j.Sd, "wheat");
      this.s(net.nb.j.Y4, "bread");
      this.s(net.nb.j.Sb, "leather_helmet");
      this.s(net.nb.j.SE, "leather_chestplate");
      this.s(net.nb.j.Sf, "leather_leggings");
      this.s(net.nb.j.E, "leather_boots");
      this.s(net.nb.j.YO, "chainmail_helmet");
      this.s(net.nb.j.Wa, "chainmail_chestplate");
      this.s(net.nb.j.Wd, "chainmail_leggings");
      this.s(net.nb.j.Yc, "chainmail_boots");
      this.s(net.nb.j.j, "iron_helmet");
      this.s(net.nb.j.YE, "iron_chestplate");
      this.s(net.nb.j.Y_, "iron_leggings");
      this.s(net.nb.j.YS, "iron_boots");
      this.s(net.nb.j.y, "diamond_helmet");
      this.s(net.nb.j.WJ, "diamond_chestplate");
      this.s(net.nb.j.WO, "diamond_leggings");
      this.s(net.nb.j.x, "diamond_boots");
      this.s(net.nb.j.W, "golden_helmet");
      this.s(net.nb.j.WR, "golden_chestplate");
      this.s(net.nb.j.WM, "golden_leggings");
      this.s(net.nb.j.p, "golden_boots");
      this.s(net.nb.j.YT, "flint");
      this.s(net.nb.j.WC, "porkchop");
      this.s(net.nb.j.Wh, "cooked_porkchop");
      this.s(net.nb.j.Yz, "painting");
      this.s(net.nb.j.J, "golden_apple");
      this.h(net.nb.j.J, 1, "golden_apple");
      this.s(net.nb.j.Wj, "sign");
      this.s(net.nb.j.s, "oak_door");
      this.s(net.nb.j.WK, "spruce_door");
      this.s(net.nb.j.Ya, "birch_door");
      this.s(net.nb.j.Yk, "jungle_door");
      this.s(net.nb.j.i, "acacia_door");
      this.s(net.nb.j.W0, "dark_oak_door");
      this.s(net.nb.j.YF, "bucket");
      this.s(net.nb.j.Wb, "water_bucket");
      this.s(net.nb.j.T, "lava_bucket");
      this.s(net.nb.j.Y2, "minecart");
      this.s(net.nb.j.h, "saddle");
      this.s(net.nb.j.Y5, "iron_door");
      this.s(net.nb.j.A, "redstone");
      this.s(net.nb.j.f, "snowball");
      this.s(net.nb.j.Yb, "oak_boat");
      this.s(net.nb.j.M, "spruce_boat");
      this.s(net.nb.j.S, "birch_boat");
      this.s(net.nb.j.Yx, "jungle_boat");
      this.s(net.nb.j.d, "acacia_boat");
      this.s(net.nb.j.Wf, "dark_oak_boat");
      this.s(net.nb.j.Yr, "leather");
      this.s(net.nb.j.Sl, "milk_bucket");
      this.s(net.nb.j.Yp, "brick");
      this.s(net.nb.j.v, "clay_ball");
      this.s(net.nb.j.q, "reeds");
      this.s(net.nb.j.YZ, "paper");
      this.s(net.nb.j.Yv, "book");
      this.s(net.nb.j.P, "slime_ball");
      this.s(net.nb.j.t, "chest_minecart");
      this.s(net.nb.j.Wx, "furnace_minecart");
      this.s(net.nb.j.YV, "egg");
      this.s(net.nb.j.W9, "compass");
      this.s(net.nb.j.WQ, "fishing_rod");
      this.s(net.nb.j.Yj, "clock");
      this.s(net.nb.j.Wo, "glowstone_dust");
      this.h(net.nb.j.YB, yw.i.COD.W(), "cod");
      this.h(net.nb.j.YB, yw.i.SALMON.W(), "salmon");
      this.h(net.nb.j.YB, yw.i.CLOWNFISH.W(), "clownfish");
      this.h(net.nb.j.YB, yw.i.PUFFERFISH.W(), "pufferfish");
      this.h(net.nb.j.YY, yw.i.COD.W(), "cooked_cod");
      this.h(net.nb.j.YY, yw.i.SALMON.W(), "cooked_salmon");
      this.h(net.nb.j.n, kw.BLACK.G(), "dye_black");
      this.h(net.nb.j.n, kw.RED.G(), "dye_red");
      this.h(net.nb.j.n, kw.GREEN.G(), "dye_green");
      this.h(net.nb.j.n, kw.BROWN.G(), "dye_brown");
      this.h(net.nb.j.n, kw.BLUE.G(), "dye_blue");
      this.h(net.nb.j.n, kw.PURPLE.G(), "dye_purple");
      this.h(net.nb.j.n, kw.CYAN.G(), "dye_cyan");
      this.h(net.nb.j.n, kw.SILVER.G(), "dye_silver");
      this.h(net.nb.j.n, kw.GRAY.G(), "dye_gray");
      this.h(net.nb.j.n, kw.PINK.G(), "dye_pink");
      this.h(net.nb.j.n, kw.LIME.G(), "dye_lime");
      this.h(net.nb.j.n, kw.YELLOW.G(), "dye_yellow");
      this.h(net.nb.j.n, kw.LIGHT_BLUE.G(), "dye_light_blue");
      this.h(net.nb.j.n, kw.MAGENTA.G(), "dye_magenta");
      this.h(net.nb.j.n, kw.ORANGE.G(), "dye_orange");
      this.h(net.nb.j.n, kw.WHITE.G(), "dye_white");
      this.s(net.nb.j.SU, "bone");
      this.s(net.nb.j.WE, "sugar");
      this.s(net.nb.j.WS, "cake");
      this.s(net.nb.j.Wr, "repeater");
      this.s(net.nb.j.Ss, "cookie");
      this.s(net.nb.j.W5, "shears");
      this.s(net.nb.j.k, "melon");
      this.s(net.nb.j.Y, "pumpkin_seeds");
      this.s(net.nb.j.Y3, "melon_seeds");
      this.s(net.nb.j.U, "beef");
      this.s(net.nb.j.S4, "cooked_beef");
      this.s(net.nb.j.Y0, "chicken");
      this.s(net.nb.j.Y6, "cooked_chicken");
      this.s(net.nb.j.S2, "rabbit");
      this.s(net.nb.j.W4, "cooked_rabbit");
      this.s(net.nb.j.R, "mutton");
      this.s(net.nb.j.S8, "cooked_mutton");
      this.s(net.nb.j.Wi, "rabbit_foot");
      this.s(net.nb.j.g, "rabbit_hide");
      this.s(net.nb.j.YI, "rabbit_stew");
      this.s(net.nb.j.Wm, "rotten_flesh");
      this.s(net.nb.j.Ys, "ender_pearl");
      this.s(net.nb.j.K, "blaze_rod");
      this.s(net.nb.j.Yy, "ghast_tear");
      this.s(net.nb.j.Ww, "gold_nugget");
      this.s(net.nb.j.YG, "nether_wart");
      this.s(net.nb.j.YN, "beetroot");
      this.s(net.nb.j.WY, "beetroot_seeds");
      this.s(net.nb.j.Yt, "beetroot_soup");
      this.s(net.nb.j.YJ, "totem");
      this.s(net.nb.j.I, "bottle_drinkable");
      this.s(net.nb.j.YD, "bottle_splash");
      this.s(net.nb.j.Wg, "bottle_lingering");
      this.s(net.nb.j.SG, "glass_bottle");
      this.s(net.nb.j.Ym, "dragon_breath");
      this.s(net.nb.j.Wk, "spider_eye");
      this.s(net.nb.j.Sn, "fermented_spider_eye");
      this.s(net.nb.j.H, "blaze_powder");
      this.s(net.nb.j.WI, "magma_cream");
      this.s(net.nb.j.Wn, "brewing_stand");
      this.s(net.nb.j.W3, "cauldron");
      this.s(net.nb.j.SV, "ender_eye");
      this.s(net.nb.j.YX, "speckled_melon");
      this.V.p(net.nb.j.N, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("spawn_egg", "inventory");
         }
      });
      this.s(net.nb.j.Yg, "experience_bottle");
      this.s(net.nb.j.Yu, "fire_charge");
      this.s(net.nb.j.WZ, "writable_book");
      this.s(net.nb.j.WL, "emerald");
      this.s(net.nb.j.SH, "item_frame");
      this.s(net.nb.j.Yn, "flower_pot");
      this.s(net.nb.j.Wq, "carrot");
      this.s(net.nb.j.We, "potato");
      this.s(net.nb.j.W2, "baked_potato");
      this.s(net.nb.j.Sy, "poisonous_potato");
      this.s(net.nb.j.WW, "map");
      this.s(net.nb.j.b, "golden_carrot");
      this.h(net.nb.j.Y9, 0, "skull_skeleton");
      this.h(net.nb.j.Y9, 1, "skull_wither");
      this.h(net.nb.j.Y9, 2, "skull_zombie");
      this.h(net.nb.j.Y9, 3, "skull_char");
      this.h(net.nb.j.Y9, 4, "skull_creeper");
      this.h(net.nb.j.Y9, 5, "skull_dragon");
      this.s(net.nb.j.WB, "carrot_on_a_stick");
      this.s(net.nb.j.WG, "nether_star");
      this.s(net.nb.j.WU, "end_crystal");
      this.s(net.nb.j.Yf, "pumpkin_pie");
      this.s(net.nb.j.c, "firework_charge");
      this.s(net.nb.j.W7, "comparator");
      this.s(net.nb.j.W6, "netherbrick");
      this.s(net.nb.j.Su, "quartz");
      this.s(net.nb.j.Sm, "tnt_minecart");
      this.s(net.nb.j.Sq, "hopper_minecart");
      this.s(net.nb.j.YH, "armor_stand");
      this.s(net.nb.j.z, "iron_horse_armor");
      this.s(net.nb.j.YQ, "golden_horse_armor");
      this.s(net.nb.j.Yq, "diamond_horse_armor");
      this.s(net.nb.j.S6, "lead");
      this.s(net.nb.j.YR, "name_tag");
      this.V.p(net.nb.j.Yi, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("banner", "inventory");
         }
      });
      this.V.p(net.nb.j.W1, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("bed", "inventory");
         }
      });
      this.V.p(net.nb.j.Yl, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("shield", "inventory");
         }
      });
      this.s(net.nb.j.SB, "elytra");
      this.s(net.nb.j.Y1, "chorus_fruit");
      this.s(net.nb.j.WV, "chorus_fruit_popped");
      this.s(net.nb.j.SK, "shulker_shell");
      this.s(net.nb.j.SI, "iron_nugget");
      this.s(net.nb.j.a, "record_13");
      this.s(net.nb.j.YM, "record_cat");
      this.s(net.nb.j.Yh, "record_blocks");
      this.s(net.nb.j.m, "record_chirp");
      this.s(net.nb.j.WH, "record_far");
      this.s(net.nb.j.WD, "record_mall");
      this.s(net.nb.j.C, "record_mellohi");
      this.s(net.nb.j.SR, "record_stal");
      this.s(net.nb.j.Ws, "record_strad");
      this.s(net.nb.j.Yw, "record_ward");
      this.s(net.nb.j.SZ, "record_11");
      this.s(net.nb.j.Wc, "record_wait");
      this.s(net.nb.j.D, "prismarine_shard");
      this.s(net.nb.j.WF, "prismarine_crystals");
      this.s(net.nb.j.YK, "knowledge_book");
      this.V.p(net.nb.j.r, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("enchanted_book", "inventory");
         }
      });
      this.V.p(net.nb.j.WN, new net.y.z() {
         public net.ym.a S(ks var1) {
            return new net.ym.a("filled_map", "inventory");
         }
      });
      this.f(net.nb.f.i, "command_block");
      this.s(net.nb.j.Wp, "fireworks");
      this.s(net.nb.j.V, "command_block_minecart");
      this.f(net.nb.f.dr, "barrier");
      this.f(net.nb.f.uw, "mob_spawner");
      this.s(net.nb.j.e, "written_book");
      this.e(net.nb.f.d, go.n.ALL_INSIDE.Y(), "brown_mushroom_block");
      this.e(net.nb.f.Q, go.n.ALL_INSIDE.Y(), "red_mushroom_block");
      this.f(net.nb.f.Ts, "dragon_egg");
      this.f(net.nb.f.M, "repeating_command_block");
      this.f(net.nb.f.Tc, "chain_command_block");
      this.e(net.nb.f.TJ, sl.s.SAVE.H(), "structure_block");
      this.e(net.nb.f.TJ, sl.s.LOAD.H(), "structure_block");
      this.e(net.nb.f.TJ, sl.s.CORNER.H(), "structure_block");
      this.e(net.nb.f.TJ, sl.s.DATA.H(), "structure_block");
      if(i6.M7.r()) {
         i6.H(i6.M7, new Object[]{this.V});
      }

   }

   public void s(net.c9.p var1) {
      this.V.O();
   }

   private static a_ a(a_ var0) {
      return var0;
   }
}
