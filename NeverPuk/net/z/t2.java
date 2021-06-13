package net.z;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.xn;
import net.n0.ks;
import net.y.u1;
import net.y9.zu;
import net.z.g;
import net.z.h;
import net.z.m;
import net.z.tm;
import net.z.tu;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class t2 extends tu {
   private static final List r = Lists.newArrayList();
   private final tm S;
   private String w;
   private String H;
   private String o;
   private t2.b B;
   private m y;
   private wd a;

   public t2(tm var1) {
      this.S = var1;
   }

   public void L() {
      this.m.clear();
      Keyboard.enableRepeatEvents(true);
      this.w = net.c9.b.x("createWorld.customize.presets.title", new Object[0]);
      this.H = net.c9.b.x("createWorld.customize.presets.share", new Object[0]);
      this.o = net.c9.b.x("createWorld.customize.presets.list", new Object[0]);
      this.a = new wd(2, this.O, 50, 40, q - 100, 20);
      this.B = new t2.b();
      this.a.r(1230);
      this.a.u(this.S.E());
      this.y = this.x(new m(0, q / 2 - 155, V - 28, 150, 20, net.c9.b.x("createWorld.customize.presets.select", new Object[0])));
      this.m.add(new m(1, q / 2 + 5, V - 28, 150, 20, net.c9.b.x("gui.cancel", new Object[0])));
      this.z();
   }

   public void m() throws IOException {
      super.m();
      this.B.q();
   }

   public void x() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      this.a.N(var1, var2, var3);
      super.C(var1, var2, var3);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(!this.a.l(var1, var2)) {
         super.Q(var1, var2);
      }

   }

   protected void t(m var1) throws IOException {
      boolean var2 = g.C();
      if(var1.g == 0 && this.P()) {
         this.S.Z(this.a.u());
         this.A.s(this.S);
      }

      if(var1.g == 1) {
         this.A.s(this.S);
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.B.Z(var1, var2, var3);
      this.d(this.O, this.w, q / 2, 8, 16777215);
      this.n(this.O, this.H, 50, 30, 10526880);
      this.n(this.O, this.o, 50, 70, 10526880);
      this.a.Z();
      super.v(var1, var2, var3);
   }

   public void K() {
      this.a.K();
      super.K();
   }

   public void z() {
      this.y.O = this.P();
   }

   private boolean P() {
      return this.B.k > -1 && this.B.k < r.size() || this.a.u().length() > 1;
   }

   private static void n(String var0, net.n0.y var1, net.ns.i var2, List var3, net.cn.p... var4) {
      R(var0, var1, 0, var2, var3, var4);
   }

   private static void R(String var0, net.n0.y var1, int var2, net.ns.i var3, List var4, net.cn.p... var5) {
      net.cn.a var6 = new net.cn.a();
      int var7 = var5.length - 1;

      while(true) {
         var6.N().add(var5[var7]);
         --var7;
      }
   }

   static {
      n(net.c9.b.x("createWorld.customize.preset.classic_flat", new Object[0]), net.n0.y.q(net.nb.f.p), net.nb.x.v, Arrays.asList(new String[]{"village"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.p), new net.cn.p(2, net.nb.f.dl), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.tunnelers_dream", new Object[0]), net.n0.y.q(net.nb.f.oy), net.nb.x.q, Arrays.asList(new String[]{"biome_1", "dungeon", "decoration", "stronghold", "mineshaft"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.p), new net.cn.p(5, net.nb.f.dl), new net.cn.p(230, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.water_world", new Object[0]), net.nb.j.Wb, net.nb.x.b, Arrays.asList(new String[]{"biome_1", "oceanmonument"}), new net.cn.p[]{new net.cn.p(90, net.nb.f.uM), new net.cn.p(5, net.nb.f.TF), new net.cn.p(5, net.nb.f.dl), new net.cn.p(5, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      R(net.c9.b.x("createWorld.customize.preset.overworld", new Object[0]), net.n0.y.q(net.nb.f.TU), zu.i.GRASS.j(), net.nb.x.v, Arrays.asList(new String[]{"village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.p), new net.cn.p(3, net.nb.f.dl), new net.cn.p(59, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.snowy_kingdom", new Object[0]), net.n0.y.q(net.nb.f.Tl), net.nb.x.F, Arrays.asList(new String[]{"village", "biome_1"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.Tl), new net.cn.p(1, net.nb.f.p), new net.cn.p(3, net.nb.f.dl), new net.cn.p(59, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.bottomless_pit", new Object[0]), net.nb.j.YL, net.nb.x.v, Arrays.asList(new String[]{"village", "biome_1"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.p), new net.cn.p(3, net.nb.f.dl), new net.cn.p(2, net.nb.f.TD)});
      n(net.c9.b.x("createWorld.customize.preset.desert", new Object[0]), net.n0.y.q(net.nb.f.TF), net.nb.x.m, Arrays.asList(new String[]{"village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"}), new net.cn.p[]{new net.cn.p(8, net.nb.f.TF), new net.cn.p(52, net.nb.f.ul), new net.cn.p(3, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.redstone_ready", new Object[0]), net.nb.j.A, net.nb.x.m, Collections.emptyList(), new net.cn.p[]{new net.cn.p(52, net.nb.f.ul), new net.cn.p(3, net.nb.f.oy), new net.cn.p(1, net.nb.f.T8)});
      n(net.c9.b.x("createWorld.customize.preset.the_void", new Object[0]), net.n0.y.q(net.nb.f.dr), net.nb.x.N, Arrays.asList(new String[]{"decoration"}), new net.cn.p[]{new net.cn.p(1, net.nb.f.ou)});
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class b extends h {
      public int k = -1;

      public b() {
         super(t2.this.A, tu.q, tu.V, 80, tu.V - 37, 24);
      }

      private void d(int var1, int var2, net.n0.y var3, int var4) {
         this.t(var1 + 1, var2 + 1);
         net.y.d.F();
         u1.A();
         t2.this.t.i(new ks(var3, 1, var3.I()?var4:0), var1 + 2, var2 + 2);
         u1.m();
         net.y.d.g();
      }

      private void t(int var1, int var2) {
         this.s(var1, var2, 0, 0);
      }

      private void s(int var1, int var2, int var3, int var4) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.s.n().E(g.G);
         float var10000 = 0.0078125F;
         var10000 = 0.0078125F;
         boolean var12 = true;
         var12 = true;
         net.y.r var9 = net.y.r.f();
         net.y.p var10 = var9.k();
         var10.m(7, net.y8.x.H);
         var10.H((double)(var1 + 0), (double)(var2 + 18), (double)g.d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
         var10.H((double)(var1 + 18), (double)(var2 + 18), (double)g.d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F)).W();
         var10.H((double)(var1 + 18), (double)(var2 + 0), (double)g.d).Y((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
         var10.H((double)(var1 + 0), (double)(var2 + 0), (double)g.d).Y((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F)).W();
         var9.p();
      }

      protected int V() {
         return t2.r.size();
      }

      protected void E(int var1, boolean var2, int var3, int var4) {
         this.k = var1;
         t2.this.z();
         t2.this.a.u(((t2.y)t2.r.get(t2.this.B.k)).R);
      }

      protected boolean z(int var1) {
         boolean var2 = g.C();
         return var1 == this.k;
      }

      protected void x() {
      }

      protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
         t2.y var8 = (t2.y)t2.r.get(var1);
         this.d(var2, var3, var8.N, var8.I);
         t2.this.O.v(var8.a, (float)(var2 + 18 + 5), (float)(var3 + 6), 16777215);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class y {
      public net.n0.y N;
      public int I;
      public String a;
      public String R;

      public y(net.n0.y var1, int var2, String var3, String var4) {
         this.N = var1;
         this.I = var2;
         this.a = var3;
         this.R = var4;
      }
   }
}
