package net.z;

import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.io.IOException;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.z.g;
import net.z.m;
import net.z.t1;
import net.z.t3;
import net.z.tj;
import net.z.ts;
import net.z.tu;
import net.z.v;
import net.z.wd;

public class t5 extends tu implements t3.o, v.e {
   private final t1 B;
   protected String T = "Customize World Settings";
   protected String z = "Page 1 of 3";
   protected String J = "Basic Settings";
   protected String[] Q = new String[4];
   private v W;
   private m p;
   private m R;
   private m D;
   private m b;
   private m I;
   private m f;
   private m H;
   private m r;
   private boolean S;
   private int o;
   private boolean w;
   private final Predicate u = new Predicate() {
      public boolean N(@Nullable String var1) {
         g.C();
         Float var3 = Floats.tryParse(var1);
         return var1.isEmpty() || var3 != null && Floats.isFinite(var3.floatValue()) && var3.floatValue() >= 0.0F;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final net.cn.z n = new net.cn.z();
   private net.cn.z y;
   private final Random Y = new Random();

   public t5(tu var1, String var2) {
      this.B = (t1)var1;
      this.Z(var2);
   }

   public void L() {
      int var1 = 0;
      int var2 = 0;
      if(this.W != null) {
         var1 = this.W.D();
         var2 = this.W.h();
      }

      this.T = net.c9.b.x("options.customizeTitle", new Object[0]);
      this.m.clear();
      this.b = this.x(new m(302, 20, 5, 80, 20, net.c9.b.x("createWorld.customize.custom.prev", new Object[0])));
      this.I = this.x(new m(303, q - 100, 5, 80, 20, net.c9.b.x("createWorld.customize.custom.next", new Object[0])));
      this.D = this.x(new m(304, q / 2 - 187, V - 27, 90, 20, net.c9.b.x("createWorld.customize.custom.defaults", new Object[0])));
      this.R = this.x(new m(301, q / 2 - 92, V - 27, 90, 20, net.c9.b.x("createWorld.customize.custom.randomize", new Object[0])));
      this.r = this.x(new m(305, q / 2 + 3, V - 27, 90, 20, net.c9.b.x("createWorld.customize.custom.presets", new Object[0])));
      this.p = this.x(new m(300, q / 2 + 98, V - 27, 90, 20, net.c9.b.x("gui.done", new Object[0])));
      this.D.O = this.S;
      this.f = new m(306, q / 2 - 55, 160, 50, 20, net.c9.b.x("gui.yes", new Object[0]));
      this.f.F = false;
      this.m.add(this.f);
      this.H = new m(307, q / 2 + 5, 160, 50, 20, net.c9.b.x("gui.no", new Object[0]));
      this.H.F = false;
      this.m.add(this.H);
      if(this.o != 0) {
         this.f.F = true;
         this.H.F = true;
      }

      this.d();
      this.W.r(var1);
      this.W.O(var2);
      this.c();
   }

   public void m() throws IOException {
      super.m();
      this.W.q();
   }

   private void d() {
      g.B();
      v.f[] var2 = new v.f[]{new v.k(160, net.c9.b.x("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0F, 255.0F, (float)this.y.b), new v.i(148, net.c9.b.x("createWorld.customize.custom.useCaves", new Object[0]), true, this.y.K), new v.i(150, net.c9.b.x("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.y.a), new v.i(151, net.c9.b.x("createWorld.customize.custom.useVillages", new Object[0]), true, this.y.NZ), new v.i(152, net.c9.b.x("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.y.N2), new v.i(153, net.c9.b.x("createWorld.customize.custom.useTemples", new Object[0]), true, this.y.NJ), new v.i(210, net.c9.b.x("createWorld.customize.custom.useMonuments", new Object[0]), true, this.y.w), new v.i(211, net.c9.b.x("createWorld.customize.custom.useMansions", new Object[0]), true, this.y.E), new v.i(154, net.c9.b.x("createWorld.customize.custom.useRavines", new Object[0]), true, this.y.NE), new v.i(149, net.c9.b.x("createWorld.customize.custom.useDungeons", new Object[0]), true, this.y.D), new v.k(157, net.c9.b.x("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0F, 100.0F, (float)this.y.c), new v.i(155, net.c9.b.x("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.y.B), new v.k(158, net.c9.b.x("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0F, 100.0F, (float)this.y.e), new v.i(156, net.c9.b.x("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.y.N9), new v.k(159, net.c9.b.x("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0F, 100.0F, (float)this.y.Nr), new v.i(161, net.c9.b.x("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.y.g), new v.k(162, net.c9.b.x("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0F, 37.0F, (float)this.y.ND), new v.k(163, net.c9.b.x("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0F, 8.0F, (float)this.y.R), new v.k(164, net.c9.b.x("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0F, 5.0F, (float)this.y.r)};
      v.f[] var3 = new v.f[]{new v.w(416, net.c9.b.x("tile.dirt.name", new Object[0]), false), null, new v.k(165, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.Nu), new v.k(166, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.t), new v.k(167, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.k), new v.k(168, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.p), new v.w(417, net.c9.b.x("tile.gravel.name", new Object[0]), false), null, new v.k(169, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.NP), new v.k(170, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.f), new v.k(171, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.NF), new v.k(172, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.G), new v.w(418, net.c9.b.x("tile.stone.granite.name", new Object[0]), false), null, new v.k(173, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.y), new v.k(174, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.q), new v.k(175, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.m), new v.k(176, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.NB), new v.w(419, net.c9.b.x("tile.stone.diorite.name", new Object[0]), false), null, new v.k(177, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.Np), new v.k(178, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.M), new v.k(179, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.Nt), new v.k(180, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.I), new v.w(420, net.c9.b.x("tile.stone.andesite.name", new Object[0]), false), null, new v.k(181, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.Ne), new v.k(182, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.H), new v.k(183, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.A), new v.k(184, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.n), new v.w(421, net.c9.b.x("tile.oreCoal.name", new Object[0]), false), null, new v.k(185, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.l), new v.k(186, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.C), new v.k(187, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.d), new v.k(189, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.NL), new v.w(422, net.c9.b.x("tile.oreIron.name", new Object[0]), false), null, new v.k(190, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.N6), new v.k(191, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.Nx), new v.k(192, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.Nh), new v.k(193, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.X), new v.w(423, net.c9.b.x("tile.oreGold.name", new Object[0]), false), null, new v.k(194, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.O), new v.k(195, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.F), new v.k(196, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.W), new v.k(197, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.N_), new v.w(424, net.c9.b.x("tile.oreRedstone.name", new Object[0]), false), null, new v.k(198, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.NK), new v.k(199, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.z), new v.k(200, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.o), new v.k(201, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.j), new v.w(425, net.c9.b.x("tile.oreDiamond.name", new Object[0]), false), null, new v.k(202, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.T), new v.k(203, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.s), new v.k(204, net.c9.b.x("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.Nw), new v.k(205, net.c9.b.x("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.Na), new v.w(426, net.c9.b.x("tile.oreLapis.name", new Object[0]), false), null, new v.k(206, net.c9.b.x("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, (float)this.y.N), new v.k(207, net.c9.b.x("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, (float)this.y.NW), new v.k(208, net.c9.b.x("createWorld.customize.custom.center", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.Nv), new v.k(209, net.c9.b.x("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0F, 255.0F, (float)this.y.v)};
      v.f[] var4 = new v.f[]{new v.k(100, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0F, 5000.0F, this.y.S), new v.k(101, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0F, 5000.0F, this.y.V), new v.k(102, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0F, 5000.0F, this.y.Y), new v.k(103, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0F, 2000.0F, this.y.Nq), new v.k(104, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0F, 2000.0F, this.y.h), new v.k(105, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01F, 20.0F, this.y.P), new v.k(106, net.c9.b.x("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0F, 25.0F, this.y.NG), new v.k(107, net.c9.b.x("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0F, 6000.0F, this.y.Z), new v.k(108, net.c9.b.x("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0F, 6000.0F, this.y.Q), new v.k(109, net.c9.b.x("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01F, 50.0F, this.y.L), new v.k(110, net.c9.b.x("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, this.y.NC), new v.k(111, net.c9.b.x("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, this.y.N8), new v.k(112, net.c9.b.x("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0F, 20.0F, this.y.i), new v.k(113, net.c9.b.x("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0F, 20.0F, this.y.J), new v.k(114, net.c9.b.x("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0F, 20.0F, this.y.U), new v.k(115, net.c9.b.x("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0F, 20.0F, this.y.x)};
      v.f[] var5 = new v.f[]{new v.w(400, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new v.b(132, String.format("%5.3f", new Object[]{Float.valueOf(this.y.S)}), false, this.u), new v.w(401, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new v.b(133, String.format("%5.3f", new Object[]{Float.valueOf(this.y.V)}), false, this.u), new v.w(402, net.c9.b.x("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new v.b(134, String.format("%5.3f", new Object[]{Float.valueOf(this.y.Y)}), false, this.u), new v.w(403, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new v.b(135, String.format("%5.3f", new Object[]{Float.valueOf(this.y.Nq)}), false, this.u), new v.w(404, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new v.b(136, String.format("%5.3f", new Object[]{Float.valueOf(this.y.h)}), false, this.u), new v.w(405, net.c9.b.x("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new v.b(137, String.format("%2.3f", new Object[]{Float.valueOf(this.y.P)}), false, this.u), new v.w(406, net.c9.b.x("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new v.b(138, String.format("%2.3f", new Object[]{Float.valueOf(this.y.NG)}), false, this.u), new v.w(407, net.c9.b.x("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new v.b(139, String.format("%5.3f", new Object[]{Float.valueOf(this.y.Z)}), false, this.u), new v.w(408, net.c9.b.x("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new v.b(140, String.format("%5.3f", new Object[]{Float.valueOf(this.y.Q)}), false, this.u), new v.w(409, net.c9.b.x("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new v.b(141, String.format("%2.3f", new Object[]{Float.valueOf(this.y.L)}), false, this.u), new v.w(410, net.c9.b.x("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new v.b(142, String.format("%5.3f", new Object[]{Float.valueOf(this.y.NC)}), false, this.u), new v.w(411, net.c9.b.x("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new v.b(143, String.format("%5.3f", new Object[]{Float.valueOf(this.y.N8)}), false, this.u), new v.w(412, net.c9.b.x("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new v.b(144, String.format("%2.3f", new Object[]{Float.valueOf(this.y.i)}), false, this.u), new v.w(413, net.c9.b.x("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new v.b(145, String.format("%2.3f", new Object[]{Float.valueOf(this.y.J)}), false, this.u), new v.w(414, net.c9.b.x("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new v.b(146, String.format("%2.3f", new Object[]{Float.valueOf(this.y.U)}), false, this.u), new v.w(415, net.c9.b.x("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new v.b(147, String.format("%2.3f", new Object[]{Float.valueOf(this.y.x)}), false, this.u)};
      this.W = new v(this.A, q, V, 32, V - 32, 25, this, new v.f[][]{var2, var3, var4, var5});
      int var6 = 0;
      this.Q[var6] = net.c9.b.x("createWorld.customize.custom.page" + var6, new Object[0]);
      ++var6;
      this.c();
   }

   public String l() {
      return this.y.toString().replace("\n", "");
   }

   public void Z(String var1) {
      if(!var1.isEmpty()) {
         this.y = net.cn.z.P(var1);
      } else {
         this.y = new net.cn.z();
      }

   }

   public void T(int var1, String var2) {
      float var3 = 0.0F;
      var3 = Float.parseFloat(var2);
      float var4 = 0.0F;
      switch(var1) {
      case 132:
         this.y.S = net.u.t.T(var3, 1.0F, 5000.0F);
         var4 = this.y.S;
         break;
      case 133:
         this.y.V = net.u.t.T(var3, 1.0F, 5000.0F);
         var4 = this.y.V;
         break;
      case 134:
         this.y.Y = net.u.t.T(var3, 1.0F, 5000.0F);
         var4 = this.y.Y;
         break;
      case 135:
         this.y.Nq = net.u.t.T(var3, 1.0F, 2000.0F);
         var4 = this.y.Nq;
         break;
      case 136:
         this.y.h = net.u.t.T(var3, 1.0F, 2000.0F);
         var4 = this.y.h;
         break;
      case 137:
         this.y.P = net.u.t.T(var3, 0.01F, 20.0F);
         var4 = this.y.P;
         break;
      case 138:
         this.y.NG = net.u.t.T(var3, 1.0F, 25.0F);
         var4 = this.y.NG;
         break;
      case 139:
         this.y.Z = net.u.t.T(var3, 1.0F, 6000.0F);
         var4 = this.y.Z;
         break;
      case 140:
         this.y.Q = net.u.t.T(var3, 1.0F, 6000.0F);
         var4 = this.y.Q;
         break;
      case 141:
         this.y.L = net.u.t.T(var3, 0.01F, 50.0F);
         var4 = this.y.L;
         break;
      case 142:
         this.y.NC = net.u.t.T(var3, 1.0F, 5000.0F);
         var4 = this.y.NC;
         break;
      case 143:
         this.y.N8 = net.u.t.T(var3, 1.0F, 5000.0F);
         var4 = this.y.N8;
         break;
      case 144:
         this.y.i = net.u.t.T(var3, 1.0F, 20.0F);
         var4 = this.y.i;
         break;
      case 145:
         this.y.J = net.u.t.T(var3, 0.0F, 20.0F);
         var4 = this.y.J;
         break;
      case 146:
         this.y.U = net.u.t.T(var3, 1.0F, 20.0F);
         var4 = this.y.U;
         break;
      case 147:
         this.y.x = net.u.t.T(var3, 0.0F, 20.0F);
         var4 = this.y.x;
      }

      if(var4 != var3 && var3 != 0.0F) {
         ((wd)this.W.z(var1)).u(this.I(var1, var4));
      }

      ((t3)this.W.z(var1 - 132 + 100)).j(var4, false);
      if(!this.y.equals(this.n)) {
         this.q(true);
      }

   }

   private void q(boolean var1) {
      this.S = var1;
      this.D.O = var1;
   }

   public String B(int var1, String var2, float var3) {
      return var2 + ": " + this.I(var1, var3);
   }

   private String I(int var1, float var2) {
      switch(var1) {
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 107:
      case 108:
      case 110:
      case 111:
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 139:
      case 140:
      case 142:
      case 143:
         return String.format("%5.3f", new Object[]{Float.valueOf(var2)});
      case 105:
      case 106:
      case 109:
      case 112:
      case 113:
      case 114:
      case 115:
      case 137:
      case 138:
      case 141:
      case 144:
      case 145:
      case 146:
      case 147:
         return String.format("%2.3f", new Object[]{Float.valueOf(var2)});
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 126:
      case 127:
      case 128:
      case 129:
      case 130:
      case 131:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      default:
         return String.format("%d", new Object[]{Integer.valueOf((int)var2)});
      case 162:
         if(var2 < 0.0F) {
            return net.c9.b.x("gui.all", new Object[0]);
         } else if((int)var2 >= net.ns.i.y(net.nb.x.l)) {
            net.ns.i var4 = net.ns.i.u((int)var2 + 2);
            return var4.l();
         } else {
            net.ns.i var3 = net.ns.i.u((int)var2);
            return var3.l();
         }
      }
   }

   public void n(int var1, boolean var2) {
      switch(var1) {
      case 148:
         this.y.K = var2;
         break;
      case 149:
         this.y.D = var2;
         break;
      case 150:
         this.y.a = var2;
         break;
      case 151:
         this.y.NZ = var2;
         break;
      case 152:
         this.y.N2 = var2;
         break;
      case 153:
         this.y.NJ = var2;
         break;
      case 154:
         this.y.NE = var2;
         break;
      case 155:
         this.y.B = var2;
         break;
      case 156:
         this.y.N9 = var2;
         break;
      case 161:
         this.y.g = var2;
         break;
      case 210:
         this.y.w = var2;
         break;
      case 211:
         this.y.E = var2;
      }

      if(!this.y.equals(this.n)) {
         this.q(true);
      }

   }

   public void t(int var1, float var2) {
      boolean var3 = g.B();
      switch(var1) {
      case 100:
         this.y.S = var2;
      case 101:
         this.y.V = var2;
      case 102:
         this.y.Y = var2;
      case 103:
         this.y.Nq = var2;
      case 104:
         this.y.h = var2;
      case 105:
         this.y.P = var2;
      case 106:
         this.y.NG = var2;
      case 107:
         this.y.Z = var2;
      case 108:
         this.y.Q = var2;
      case 109:
         this.y.L = var2;
      case 110:
         this.y.NC = var2;
      case 111:
         this.y.N8 = var2;
      case 112:
         this.y.i = var2;
      case 113:
         this.y.J = var2;
      case 114:
         this.y.U = var2;
      case 115:
         this.y.x = var2;
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 126:
      case 127:
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 139:
      case 140:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 161:
      case 188:
      default:
      case 157:
         this.y.c = (int)var2;
      case 158:
         this.y.e = (int)var2;
      case 159:
         this.y.Nr = (int)var2;
      case 160:
         this.y.b = (int)var2;
      case 162:
         this.y.ND = (int)var2;
      case 163:
         this.y.R = (int)var2;
      case 164:
         this.y.r = (int)var2;
      case 165:
         this.y.Nu = (int)var2;
      case 166:
         this.y.t = (int)var2;
      case 167:
         this.y.k = (int)var2;
      case 168:
         this.y.p = (int)var2;
      case 169:
         this.y.NP = (int)var2;
      case 170:
         this.y.f = (int)var2;
      case 171:
         this.y.NF = (int)var2;
      case 172:
         this.y.G = (int)var2;
      case 173:
         this.y.y = (int)var2;
      case 174:
         this.y.q = (int)var2;
      case 175:
         this.y.m = (int)var2;
      case 176:
         this.y.NB = (int)var2;
      case 177:
         this.y.Np = (int)var2;
      case 178:
         this.y.M = (int)var2;
      case 179:
         this.y.Nt = (int)var2;
      case 180:
         this.y.I = (int)var2;
      case 181:
         this.y.Ne = (int)var2;
      case 182:
         this.y.H = (int)var2;
      case 183:
         this.y.A = (int)var2;
      case 184:
         this.y.n = (int)var2;
      case 185:
         this.y.l = (int)var2;
      case 186:
         this.y.C = (int)var2;
      case 187:
         this.y.d = (int)var2;
      case 189:
         this.y.NL = (int)var2;
      case 190:
         this.y.N6 = (int)var2;
      case 191:
         this.y.Nx = (int)var2;
      case 192:
         this.y.Nh = (int)var2;
      case 193:
         this.y.X = (int)var2;
      case 194:
         this.y.O = (int)var2;
      case 195:
         this.y.F = (int)var2;
      case 196:
         this.y.W = (int)var2;
      case 197:
         this.y.N_ = (int)var2;
      case 198:
         this.y.NK = (int)var2;
      case 199:
         this.y.z = (int)var2;
      case 200:
         this.y.o = (int)var2;
      case 201:
         this.y.j = (int)var2;
      case 202:
         this.y.T = (int)var2;
      case 203:
         this.y.s = (int)var2;
      case 204:
         this.y.Nw = (int)var2;
      case 205:
         this.y.Na = (int)var2;
      case 206:
         this.y.N = (int)var2;
      case 207:
         this.y.NW = (int)var2;
      case 208:
         this.y.Nv = (int)var2;
      case 209:
         this.y.v = (int)var2;
         if(var1 >= 100 && var1 < 116) {
            g var4 = this.W.z(var1 - 100 + 132);
            ((wd)var4).u(this.I(var1, var2));
         }

         if(!this.y.equals(this.n)) {
            this.q(true);
         }

      }
   }

   protected void t(m var1) throws IOException {
      if(var1.O) {
         switch(var1.g) {
         case 300:
            this.B.U = this.y.toString();
            this.A.s(this.B);
            break;
         case 301:
            for(int var2 = 0; var2 < this.W.V(); ++var2) {
               v.c var3 = this.W.V(var2);
               g var4 = var3.e();
               if(var4 instanceof m) {
                  m var5 = (m)var4;
                  if(var5 instanceof t3) {
                     float var6 = ((t3)var5).i() * (0.75F + this.Y.nextFloat() * 0.5F) + (this.Y.nextFloat() * 0.1F - 0.05F);
                     ((t3)var5).X(net.u.t.T(var6, 0.0F, 1.0F));
                  } else if(var5 instanceof tj) {
                     ((tj)var5).m(this.Y.nextBoolean());
                  }
               }

               g var8 = var3.O();
               if(var8 instanceof m) {
                  m var9 = (m)var8;
                  if(var9 instanceof t3) {
                     float var7 = ((t3)var9).i() * (0.75F + this.Y.nextFloat() * 0.5F) + (this.Y.nextFloat() * 0.1F - 0.05F);
                     ((t3)var9).X(net.u.t.T(var7, 0.0F, 1.0F));
                  } else if(var9 instanceof tj) {
                     ((tj)var9).m(this.Y.nextBoolean());
                  }
               }
            }

            return;
         case 302:
            this.W.r();
            this.c();
            break;
         case 303:
            this.W.J();
            this.c();
            break;
         case 304:
            if(this.S) {
               this.W(304);
            }
            break;
         case 305:
            this.A.s(new ts(this));
            break;
         case 306:
            this.t();
            break;
         case 307:
            this.o = 0;
            this.t();
         }
      }

   }

   private void f() {
      this.y.N();
      this.d();
      this.q(false);
   }

   private void W(int var1) {
      this.o = var1;
      this.S(true);
   }

   private void t() throws IOException {
      switch(this.o) {
      case 300:
         this.t((tj)this.W.z(300));
         break;
      case 304:
         this.f();
      }

      this.o = 0;
      this.w = true;
      this.S(false);
   }

   private void S(boolean var1) {
      this.f.F = var1;
      this.H.F = var1;
      this.R.O = true;
      this.p.O = true;
      this.b.O = true;
      this.I.O = true;
      this.D.O = this.S;
      this.r.O = true;
      this.W.c(true);
   }

   private void c() {
      this.b.O = this.W.D() != 0;
      this.I.O = this.W.D() != this.W.O() - 1;
      this.z = net.c9.b.x("book.pageIndicator", new Object[]{Integer.valueOf(this.W.D() + 1), Integer.valueOf(this.W.O())});
      this.J = this.Q[this.W.D()];
      this.R.O = this.W.D() != this.W.O() - 1;
   }

   protected void Q(char var1, int var2) throws IOException {
      super.Q(var1, var2);
      if(this.o == 0) {
         switch(var2) {
         case 200:
            this.Q(1.0F);
            break;
         case 208:
            this.Q(-1.0F);
            break;
         default:
            this.W.s(var1, var2);
         }
      }

   }

   private void Q(float var1) {
      g var2 = this.W.C();
      if(var2 instanceof wd) {
         float var3 = var1;
         if(tu.s()) {
            var3 = var1 * 0.1F;
            if(tu.T()) {
               var3 *= 0.1F;
            }
         } else if(tu.T()) {
            var3 = var1 * 10.0F;
            if(tu.I()) {
               var3 *= 10.0F;
            }
         }

         wd var4 = (wd)var2;
         Float var5 = Floats.tryParse(var4.u());
         var5 = Float.valueOf(var5.floatValue() + var3);
         int var6 = var4.H();
         String var7 = this.I(var4.H(), var5.floatValue());
         var4.u(var7);
         this.T(var6, var7);
      }

   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      if(this.o == 0 && !this.w) {
         this.W.x(var1, var2, var3);
      }

   }

   protected void E(int var1, int var2, int var3) {
      super.E(var1, var2, var3);
      if(this.w) {
         this.w = false;
      } else if(this.o == 0) {
         this.W.U(var1, var2, var3);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.W.Z(var1, var2, var3);
      this.d(this.O, this.T, q / 2, 2, 16777215);
      this.d(this.O, this.z, q / 2, 12, 16777215);
      this.d(this.O, this.J, q / 2, 22, 16777215);
      super.v(var1, var2, var3);
      if(this.o != 0) {
         u(0, 0, q, V, Integer.MIN_VALUE);
         this.Y(q / 2 - 91, q / 2 + 90, 99, -2039584);
         this.Y(q / 2 - 91, q / 2 + 90, 185, -6250336);
         this.z(q / 2 - 91, 99, 185, -2039584);
         this.z(q / 2 + 90, 99, 185, -6250336);
         float var10000 = 85.0F;
         var10000 = 180.0F;
         net.y.d.i();
         net.y.d.V();
         net.y.r var6 = net.y.r.f();
         net.y.p var7 = var6.k();
         this.A.n().E(v);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = 32.0F;
         var7.m(7, net.y8.x.r);
         var7.H((double)(q / 2 - 90), 185.0D, 0.0D).Y(0.0D, 2.65625D).V(64, 64, 64, 64).W();
         var7.H((double)(q / 2 + 90), 185.0D, 0.0D).Y(5.625D, 2.65625D).V(64, 64, 64, 64).W();
         var7.H((double)(q / 2 + 90), 100.0D, 0.0D).Y(5.625D, 0.0D).V(64, 64, 64, 64).W();
         var7.H((double)(q / 2 - 90), 100.0D, 0.0D).Y(0.0D, 0.0D).V(64, 64, 64, 64).W();
         var6.p();
         this.d(this.O, net.c9.b.x("createWorld.customize.custom.confirmTitle", new Object[0]), q / 2, 105, 16777215);
         this.d(this.O, net.c9.b.x("createWorld.customize.custom.confirm1", new Object[0]), q / 2, 125, 16777215);
         this.d(this.O, net.c9.b.x("createWorld.customize.custom.confirm2", new Object[0]), q / 2, 135, 16777215);
         this.f.Z(this.A, var1, var2, var3);
         this.H.Z(this.A, var1, var2, var3);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
