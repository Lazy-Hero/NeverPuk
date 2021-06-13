package net.ns;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nk.f0;
import net.nk.f_;
import net.nk.fu;
import net.nk.fy;
import net.ns.a;
import net.ns.c;
import net.ns.d;
import net.ns.e;
import net.ns.f;
import net.ns.g;
import net.ns.h;
import net.ns.i9;
import net.ns.j;
import net.ns.k;
import net.ns.l;
import net.ns.n;
import net.ns.o;
import net.ns.p;
import net.ns.q;
import net.ns.t;
import net.ns.u;
import net.ns.v;
import net.ns.w;
import net.ns.x;
import net.ns.y;
import net.w.fb;
import net.y9.zu;
import net.yz.a9;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class i {
   private static final Logger L = LogManager.getLogger();
   protected static final net.yw.n H = net.nb.f.oy.p();
   protected static final net.yw.n z = net.nb.f.ou.p();
   protected static final net.yw.n E = net.nb.f.T8.p();
   protected static final net.yw.n O = net.nb.f.D.p();
   protected static final net.yw.n e = net.nb.f.Tj.p();
   protected static final net.yw.n F = net.nb.f.ul.p();
   protected static final net.yw.n f = net.nb.f.oD.p();
   protected static final net.yw.n D = net.nb.f.uM.p();
   public static final a9 I = new a9();
   protected static final net.cn.d S = new net.cn.d(new Random(1234L), 1);
   protected static final net.cn.d g = new net.cn.d(new Random(2345L), 1);
   protected static final net.w.v G = new net.w.v();
   protected static final net.w.w V = new net.w.w(false);
   protected static final net.w.g d = new net.w.g(false);
   protected static final net.w.y c = new net.w.y();
   public static final net.c.d q = new net.c.d();
   private final String Y;
   private final float M;
   private final float X;
   private final float J;
   private final float Z;
   private final int w;
   private final boolean t;
   private final boolean P;
   @Nullable
   private final String W;
   public net.yw.n j = net.nb.f.p.p();
   public net.yw.n y = net.nb.f.dl.p();
   public e K;
   protected List b;
   protected List v;
   protected List T;
   protected List N;

   public static int y(i var0) {
      return q.D(var0);
   }

   @Nullable
   public static i u(int var0) {
      return (i)q.T(var0);
   }

   @Nullable
   public static i f(i var0) {
      return (i)I.j(y(var0));
   }

   protected i(i.g var1) {
      i9.M();
      this.b = Lists.newArrayList();
      this.v = Lists.newArrayList();
      this.T = Lists.newArrayList();
      this.N = Lists.newArrayList();
      this.Y = var1.d;
      this.M = var1.C;
      this.X = var1.y;
      this.J = var1.k;
      this.Z = var1.h;
      this.w = var1.A;
      this.t = var1.s;
      this.P = var1.T;
      this.W = var1.D;
      this.K = this.Q();
      this.v.add(new i.w(net.yn.b.class, 12, 4, 4));
      this.v.add(new i.w(net.yn.u.class, 10, 4, 4));
      this.v.add(new i.w(net.yn.a.class, 10, 4, 4));
      this.v.add(new i.w(net.yn.i.class, 8, 4, 4));
      this.b.add(new i.w(net.nk.a.class, 100, 4, 4));
      this.b.add(new i.w(fu.class, 95, 4, 4));
      this.b.add(new i.w(fy.class, 5, 1, 1));
      this.b.add(new i.w(net.nk.g.class, 100, 4, 4));
      this.b.add(new i.w(net.nk.m.class, 100, 4, 4));
      this.b.add(new i.w(f0.class, 100, 4, 4));
      this.b.add(new i.w(net.nk.u.class, 10, 1, 4));
      this.b.add(new i.w(f_.class, 5, 1, 1));
      this.T.add(new i.w(net.yn.m.class, 10, 4, 4));
      this.N.add(new i.w(net.yn.y.class, 10, 8, 8));
      if(net.u.d.y() == null) {
         i9.w(new int[2]);
      }

   }

   protected e Q() {
      return new e();
   }

   public boolean G() {
      return this.W != null;
   }

   public net.w.x q(Random var1) {
      return (net.w.x)(var1.nextInt(10) == 0?d:V);
   }

   public net.w.f A(Random var1) {
      return new fb(zu.i.GRASS);
   }

   public net.y9.n j(Random var1, net.u.j var2) {
      return var1.nextInt(3) > 0?net.y9.n.DANDELION:net.y9.n.POPPY;
   }

   public int R(float var1) {
      var1 = var1 / 3.0F;
      var1 = net.u.t.T(var1, -1.0F, 1.0F);
      return net.u.t.C(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F);
   }

   public List v(net.ne.q var1) {
      switch(null.F[var1.ordinal()]) {
      case 1:
         return this.b;
      case 2:
         return this.v;
      case 3:
         return this.T;
      case 4:
         return this.N;
      default:
         return Collections.emptyList();
      }
   }

   public boolean r() {
      return this.i();
   }

   public boolean D() {
      return !this.i() && this.P;
   }

   public boolean P() {
      return this.M() > 0.85F;
   }

   public float J() {
      return 0.1F;
   }

   public final float D(net.u.j var1) {
      if(var1.h() > 64) {
         float var2 = (float)(S.Q((double)((float)var1.t() / 8.0F), (double)((float)var1.y() / 8.0F)) * 4.0D);
         return this.D() - (var2 + (float)var1.h() - 64.0F) * 0.05F / 30.0F;
      } else {
         return this.D();
      }
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      this.K.e(var1, var2, this, var3);
   }

   public int r(net.u.j var1) {
      double var2 = (double)net.u.t.T(this.D(var1), 0.0F, 1.0F);
      double var4 = (double)net.u.t.T(this.M(), 0.0F, 1.0F);
      return net.yv.e.A(var2, var4);
   }

   public int d(net.u.j var1) {
      double var2 = (double)net.u.t.T(this.D(var1), 0.0F, 1.0F);
      double var4 = (double)net.u.t.T(this.M(), 0.0F, 1.0F);
      return net.yv.v.j(var2, var4);
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      this.B(var1, var2, var3, var4, var5, var6);
   }

   public final void B(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      int var9 = var1.k();
      i9.M();
      net.yw.n var10 = this.j;
      net.yw.n var11 = this.y;
      boolean var12 = true;
      int var13 = (int)(var6 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      int var14 = var4 & 15;
      int var15 = var5 & 15;
      net.u.j var16 = new net.u.j();
      int var17 = 255;
      if(var17 <= var2.nextInt(5)) {
         var3.Q(var15, var17, var14, E);
      }

      net.yw.n var18 = var3.b(var15, var17, var14);
      if(var18.n() == net.y1.l.q) {
         var12 = true;
      }

      if(var18.Q() == net.nb.f.oy) {
         if(var13 <= 0) {
            var10 = z;
            var11 = H;
         }

         if(var17 >= var9 - 4 && var17 <= var9 + 1) {
            var10 = this.j;
            var11 = this.y;
         }

         if(var17 < var9 && (var10 == null || var10.n() == net.y1.l.q)) {
            if(this.D(var16.V(var4, var17, var5)) < 0.15F) {
               var10 = f;
            }

            var10 = D;
         }

         if(var17 >= var9 - 1) {
            var3.Q(var15, var17, var14, var10);
         }

         if(var17 < var9 - 7 - var13) {
            var10 = z;
            var11 = H;
            var3.Q(var15, var17, var14, O);
         }

         var3.Q(var15, var17, var14, var11);
      }

      --var17;
   }

   public Class g() {
      return this.getClass();
   }

   public i.h T() {
      return (double)this.D() < 0.2D?i.h.COLD:((double)this.D() < 1.0D?i.h.MEDIUM:i.h.WARM);
   }

   @Nullable
   public static i F(int var0) {
      return z(var0, (i)null);
   }

   public static i z(int var0, i var1) {
      i var2 = u(var0);
      return var1;
   }

   public boolean Y() {
      return false;
   }

   public final float Q() {
      return this.M;
   }

   public final float M() {
      return this.Z;
   }

   public final String l() {
      return this.Y;
   }

   public final float c() {
      return this.X;
   }

   public final float D() {
      return this.J;
   }

   public final int A() {
      return this.w;
   }

   public final boolean i() {
      return this.t;
   }

   public static void J() {
      r(0, "ocean", new g((new i.g("Ocean")).m(-1.0F).w(0.1F)));
      r(1, "plains", new t(false, (new i.g("Plains")).m(0.125F).w(0.05F).t(0.8F).i(0.4F)));
      r(2, "desert", new l((new i.g("Desert")).m(0.125F).w(0.05F).t(2.0F).i(0.0F).l()));
      r(3, "extreme_hills", new d(d.y.NORMAL, (new i.g("Extreme Hills")).m(1.0F).w(0.5F).t(0.2F).i(0.3F)));
      r(4, "forest", new h(h.s.NORMAL, (new i.g("Forest")).t(0.7F).i(0.8F)));
      r(5, "taiga", new f(f.r.NORMAL, (new i.g("Taiga")).m(0.2F).w(0.2F).t(0.25F).i(0.8F)));
      r(6, "swampland", new o((new i.g("Swampland")).m(-0.2F).w(0.1F).t(0.8F).i(0.9F).T(14745518)));
      r(7, "river", new y((new i.g("River")).m(-0.5F).w(0.0F)));
      r(8, "hell", new a((new i.g("Hell")).t(2.0F).i(0.0F).l()));
      r(9, "sky", new n((new i.g("The End")).l()));
      r(10, "frozen_ocean", new g((new i.g("FrozenOcean")).m(-1.0F).w(0.1F).t(0.0F).i(0.5F).C()));
      r(11, "frozen_river", new y((new i.g("FrozenRiver")).m(-0.5F).w(0.0F).t(0.0F).i(0.5F).C()));
      r(12, "ice_flats", new x(false, (new i.g("Ice Plains")).m(0.125F).w(0.05F).t(0.0F).i(0.5F).C()));
      r(13, "ice_mountains", new x(false, (new i.g("Ice Mountains")).m(0.45F).w(0.3F).t(0.0F).i(0.5F).C()));
      r(14, "mushroom_island", new c((new i.g("MushroomIsland")).m(0.2F).w(0.3F).t(0.9F).i(1.0F)));
      r(15, "mushroom_island_shore", new c((new i.g("MushroomIslandShore")).m(0.0F).w(0.025F).t(0.9F).i(1.0F)));
      r(16, "beaches", new u((new i.g("Beach")).m(0.0F).w(0.025F).t(0.8F).i(0.4F)));
      r(17, "desert_hills", new l((new i.g("DesertHills")).m(0.45F).w(0.3F).t(2.0F).i(0.0F).l()));
      r(18, "forest_hills", new h(h.s.NORMAL, (new i.g("ForestHills")).m(0.45F).w(0.3F).t(0.7F).i(0.8F)));
      r(19, "taiga_hills", new f(f.r.NORMAL, (new i.g("TaigaHills")).t(0.25F).i(0.8F).m(0.45F).w(0.3F)));
      r(20, "smaller_extreme_hills", new d(d.y.EXTRA_TREES, (new i.g("Extreme Hills Edge")).m(0.8F).w(0.3F).t(0.2F).i(0.3F)));
      r(21, "jungle", new k(false, (new i.g("Jungle")).t(0.95F).i(0.9F)));
      r(22, "jungle_hills", new k(false, (new i.g("JungleHills")).m(0.45F).w(0.3F).t(0.95F).i(0.9F)));
      r(23, "jungle_edge", new k(true, (new i.g("JungleEdge")).t(0.95F).i(0.8F)));
      r(24, "deep_ocean", new g((new i.g("Deep Ocean")).m(-1.8F).w(0.1F)));
      r(25, "stone_beach", new net.ns.z((new i.g("Stone Beach")).m(0.1F).w(0.8F).t(0.2F).i(0.3F)));
      r(26, "cold_beach", new u((new i.g("Cold Beach")).m(0.0F).w(0.025F).t(0.05F).i(0.3F).C()));
      r(27, "birch_forest", new h(h.s.BIRCH, (new i.g("Birch Forest")).t(0.6F).i(0.6F)));
      r(28, "birch_forest_hills", new h(h.s.BIRCH, (new i.g("Birch Forest Hills")).m(0.45F).w(0.3F).t(0.6F).i(0.6F)));
      i9.M();
      r(29, "roofed_forest", new h(h.s.ROOFED, (new i.g("Roofed Forest")).t(0.7F).i(0.8F)));
      r(30, "taiga_cold", new f(f.r.NORMAL, (new i.g("Cold Taiga")).m(0.2F).w(0.2F).t(-0.5F).i(0.4F).C()));
      r(31, "taiga_cold_hills", new f(f.r.NORMAL, (new i.g("Cold Taiga Hills")).m(0.45F).w(0.3F).t(-0.5F).i(0.4F).C()));
      r(32, "redwood_taiga", new f(f.r.MEGA, (new i.g("Mega Taiga")).t(0.3F).i(0.8F).m(0.2F).w(0.2F)));
      r(33, "redwood_taiga_hills", new f(f.r.MEGA, (new i.g("Mega Taiga Hills")).m(0.45F).w(0.3F).t(0.3F).i(0.8F)));
      r(34, "extreme_hills_with_trees", new d(d.y.EXTRA_TREES, (new i.g("Extreme Hills+")).m(1.0F).w(0.5F).t(0.2F).i(0.3F)));
      r(35, "savanna", new q((new i.g("Savanna")).m(0.125F).w(0.05F).t(1.2F).i(0.0F).l()));
      r(36, "savanna_rock", new q((new i.g("Savanna Plateau")).m(1.5F).w(0.025F).t(1.0F).i(0.0F).l()));
      r(37, "mesa", new w(false, false, (new i.g("Mesa")).t(2.0F).i(0.0F).l()));
      r(38, "mesa_rock", new w(false, true, (new i.g("Mesa Plateau F")).m(1.5F).w(0.025F).t(2.0F).i(0.0F).l()));
      r(39, "mesa_clear_rock", new w(false, false, (new i.g("Mesa Plateau")).m(1.5F).w(0.025F).t(2.0F).i(0.0F).l()));
      r(127, "void", new p((new i.g("The Void")).l()));
      r(129, "mutated_plains", new t(true, (new i.g("Sunflower Plains")).G("plains").m(0.125F).w(0.05F).t(0.8F).i(0.4F)));
      r(130, "mutated_desert", new l((new i.g("Desert M")).G("desert").m(0.225F).w(0.25F).t(2.0F).i(0.0F).l()));
      r(131, "mutated_extreme_hills", new d(d.y.MUTATED, (new i.g("Extreme Hills M")).G("extreme_hills").m(1.0F).w(0.5F).t(0.2F).i(0.3F)));
      r(132, "mutated_forest", new h(h.s.FLOWER, (new i.g("Flower Forest")).G("forest").w(0.4F).t(0.7F).i(0.8F)));
      r(133, "mutated_taiga", new f(f.r.NORMAL, (new i.g("Taiga M")).G("taiga").m(0.3F).w(0.4F).t(0.25F).i(0.8F)));
      r(134, "mutated_swampland", new o((new i.g("Swampland M")).G("swampland").m(-0.1F).w(0.3F).t(0.8F).i(0.9F).T(14745518)));
      r(140, "mutated_ice_flats", new x(true, (new i.g("Ice Plains Spikes")).G("ice_flats").m(0.425F).w(0.45000002F).t(0.0F).i(0.5F).C()));
      r(149, "mutated_jungle", new k(false, (new i.g("Jungle M")).G("jungle").m(0.2F).w(0.4F).t(0.95F).i(0.9F)));
      r(151, "mutated_jungle_edge", new k(true, (new i.g("JungleEdge M")).G("jungle_edge").m(0.2F).w(0.4F).t(0.95F).i(0.8F)));
      r(155, "mutated_birch_forest", new j((new i.g("Birch Forest M")).G("birch_forest").m(0.2F).w(0.4F).t(0.6F).i(0.6F)));
      r(156, "mutated_birch_forest_hills", new j((new i.g("Birch Forest Hills M")).G("birch_forest_hills").m(0.55F).w(0.5F).t(0.6F).i(0.6F)));
      r(157, "mutated_roofed_forest", new h(h.s.ROOFED, (new i.g("Roofed Forest M")).G("roofed_forest").m(0.2F).w(0.4F).t(0.7F).i(0.8F)));
      r(158, "mutated_taiga_cold", new f(f.r.NORMAL, (new i.g("Cold Taiga M")).G("taiga_cold").m(0.3F).w(0.4F).t(-0.5F).i(0.4F).C()));
      r(160, "mutated_redwood_taiga", new f(f.r.MEGA_SPRUCE, (new i.g("Mega Spruce Taiga")).G("redwood_taiga").m(0.2F).w(0.2F).t(0.25F).i(0.8F)));
      r(161, "mutated_redwood_taiga_hills", new f(f.r.MEGA_SPRUCE, (new i.g("Redwood Taiga Hills M")).G("redwood_taiga_hills").m(0.2F).w(0.2F).t(0.25F).i(0.8F)));
      r(162, "mutated_extreme_hills_with_trees", new d(d.y.MUTATED, (new i.g("Extreme Hills+ M")).G("extreme_hills_with_trees").m(1.0F).w(0.5F).t(0.2F).i(0.3F)));
      r(163, "mutated_savanna", new v((new i.g("Savanna M")).G("savanna").m(0.3625F).w(1.225F).t(1.1F).i(0.0F).l()));
      r(164, "mutated_savanna_rock", new v((new i.g("Savanna Plateau M")).G("savanna_rock").m(1.05F).w(1.2125001F).t(1.0F).i(0.0F).l()));
      r(165, "mutated_mesa", new w(true, false, (new i.g("Mesa (Bryce)")).G("mesa").t(2.0F).i(0.0F).l()));
      r(166, "mutated_mesa_rock", new w(false, true, (new i.g("Mesa Plateau F M")).G("mesa_rock").m(0.45F).w(0.3F).t(2.0F).i(0.0F).l()));
      r(167, "mutated_mesa_clear_rock", new w(false, false, (new i.g("Mesa Plateau M")).G("mesa_clear_rock").m(0.45F).w(0.3F).t(2.0F).i(0.0F).l()));
      net.u.d.h(new net.u.d[4]);
   }

   private static void r(int var0, String var1, i var2) {
      q.D(var0, new m_(var1), var2);
      if(var2.G()) {
         I.u(var2, y((i)q.B(new m_(var2.W))));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class g {
      private final String d;
      private float C = 0.1F;
      private float y = 0.2F;
      private float k = 0.5F;
      private float h = 0.5F;
      private int A = 16777215;
      private boolean s;
      private boolean T = true;
      @Nullable
      private String D;

      public g(String var1) {
         this.d = var1;
      }

      protected i.g t(float var1) {
         int[] var2 = i9.M();
         if(var1 > 0.1F && var1 < 0.2F) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
         } else {
            this.k = var1;
            return this;
         }
      }

      protected i.g i(float var1) {
         this.h = var1;
         return this;
      }

      protected i.g m(float var1) {
         this.C = var1;
         return this;
      }

      protected i.g w(float var1) {
         this.y = var1;
         return this;
      }

      protected i.g l() {
         this.T = false;
         return this;
      }

      protected i.g C() {
         this.s = true;
         return this;
      }

      protected i.g T(int var1) {
         this.A = var1;
         return this;
      }

      protected i.g G(String var1) {
         this.D = var1;
         return this;
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }
   }

   public static enum h {
      OCEAN,
      COLD,
      MEDIUM,
      WARM;
   }

   public static class w extends net.yz.b {
      public Class N;
      public int q;
      public int k;

      public w(Class var1, int var2, int var3, int var4) {
         super(var2);
         this.N = var1;
         this.q = var3;
         this.k = var4;
      }

      public String toString() {
         return this.N.getSimpleName() + "*(" + this.q + "-" + this.k + "):" + this.a;
      }
   }
}
