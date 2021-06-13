package net.c5;

import net.bx;
import net.xn;
import net.c5.g;
import net.ne.l;
import net.ni.v;
import net.u.d;
import net.y.ui;
import net.yv.r;
import net.yz.m_;

public abstract class e implements bx {
   protected static final m_[] L = new m_[]{new m_("textures/blocks/destroy_stage_0.png"), new m_("textures/blocks/destroy_stage_1.png"), new m_("textures/blocks/destroy_stage_2.png"), new m_("textures/blocks/destroy_stage_3.png"), new m_("textures/blocks/destroy_stage_4.png"), new m_("textures/blocks/destroy_stage_5.png"), new m_("textures/blocks/destroy_stage_6.png"), new m_("textures/blocks/destroy_stage_7.png"), new m_("textures/blocks/destroy_stage_8.png"), new m_("textures/blocks/destroy_stage_9.png")};
   protected g r;
   private Class D = null;
   private m_ Z = null;
   private static d[] X;

   public void A(v var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      net.cb.t var11 = var1.b();
      if(this.r.j != null && var1.C().equals(this.r.j.j())) {
         this.k(true);
         this.d(var1, var11.c(), var2, var4, var6, 12);
         this.k(false);
      }

   }

   protected void k(boolean var1) {
      F();
      net.y.d.t(ui.w);
      net.y.d.w();
      net.y.d.S();
      net.y.d.t(ui.V);
   }

   protected void L(m_ var1) {
      F();
      net.n9.e var3 = this.r.c;
      if(var3 != null) {
         var3.E(var1);
      }

   }

   protected r K() {
      return this.r.s;
   }

   public void m(g var1) {
      this.r = var1;
   }

   public net.z.r j() {
      return this.r.T();
   }

   public boolean A(v var1) {
      return false;
   }

   protected void d(v var1, String var2, double var3, double var5, double var7, int var9) {
      l var10 = this.r.F;
      double var11 = var1.Q(var10.b, var10.hS, var10.hr);
      if(var11 <= (double)(var9 * var9)) {
         float var13 = this.r.H;
         float var14 = this.r.X;
         boolean var10000 = false;
         net.y.n.H(this.j(), var2, (float)var3 + 0.5F, (float)var5 + 1.5F, (float)var7 + 0.5F, 0, var13, var14, false, false);
      }

   }

   public void o(v var1, double var2, double var4, double var6, float var8, int var9, float var10, net.y.p var11) {
   }

   public Class j() {
      return this.D;
   }

   public void Z(Class var1) {
      this.D = var1;
   }

   public m_ P() {
      return this.Z;
   }

   public void b(m_ var1) {
      this.Z = var1;
   }

   static {
      Q((d[])null);
   }

   public static void Q(d[] var0) {
      X = var0;
   }

   public static d[] F() {
      return X;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
