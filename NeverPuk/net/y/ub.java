package net.y;

import com.google.common.base.MoreObjects;
import java.awt.Color;
import java.util.Objects;
import net._x;
import net.gn;
import net.i6;
import net.oq;
import net.oz;
import net.si;
import net.v3;
import net.vf;
import net.vn;
import net.wl;
import net.xn;
import net.z3;
import net.z9;
import net.n0.ks;
import net.n0.yn;
import net.y.d;
import net.y.p;
import net.y.r;
import net.y.t;
import net.y.u1;
import net.y.ui;
import net.y0.ct;
import net.yz.aa;
import net.yz.ac;
import net.yz.m_;
import org.lwjgl.opengl.GL11;

public class ub {
   private static final m_ h = new m_("textures/map/map_background.png");
   private static final m_ H = new m_("textures/misc/underwater.png");
   public final net.nn.j N;
   public ks K = ks.a;
   public ks R = ks.a;
   public float m;
   public float V;
   public float s;
   public float l;
   public final net.y0.d O;
   public final t I;

   public ub(net.nn.j var1) {
      this.N = var1;
      this.O = var1.N();
      this.I = var1.K();
   }

   public void L(net.ne.a var1, ks var2, net.ym.s var3) {
      this.N(var1, var2, var3, false);
   }

   public void N(net.ne.a var1, ks var2, net.ym.s var3, boolean var4) {
      if(!var2.B()) {
         net.n0.y var5 = var2.Z();
         net.y9.l var6 = net.y9.l.F(var5);
         d.c();
         if(this.I.G(var2) && var6.k() == ac.TRANSLUCENT) {
            boolean var8 = true;
         } else {
            boolean var10000 = false;
         }

         if(!z9.Q() || !oz.Ee) {
            d.Y(false);
         }

         this.I.i(var2, var1, var3, var4);
         d.Y(true);
         d.Y();
      }

   }

   private void p(float var1, float var2) {
      d.c();
      d.P(var1, 1.0F, 0.0F, 0.0F);
      d.P(var2, 0.0F, 1.0F, 0.0F);
      u1.B();
      d.Y();
   }

   private void u() {
      net.yy.g var1 = this.N.sf;
      int var2 = this.N.s8.z(new net.u.j(var1.b, var1.hS + (double)var1.A(), var1.hr), 0);
      if(z9.I()) {
         var2 = oq.u(this.N.A(), var2);
      }

      float var3 = (float)(var2 & '\uffff');
      float var4 = (float)(var2 >> 16);
      ui.c(ui.w, var3, var4);
   }

   private void N(float var1) {
      net.yy.g var2 = this.N.sf;
      float var3 = var2.xR + (var2.xs - var2.xR) * var1;
      float var4 = var2.x_ + (var2.x2 - var2.x_) * var1;
      d.P((var2.V - var3) * 0.1F, 1.0F, 0.0F, 0.0F);
      d.P((var2.hN - var4) * 0.1F, 0.0F, 1.0F, 0.0F);
   }

   private float m(float var1) {
      float var2 = 1.0F - var1 / 45.0F + 0.1F;
      var2 = net.u.t.T(var2, 0.0F, 1.0F);
      var2 = -net.u.t.m(var2 * 3.1415927F) * 0.5F + 0.5F;
      return var2;
   }

   private void Y() {
      if(!this.N.sf.e()) {
         d.j();
         d.c();
         d.P(90.0F, 0.0F, 1.0F, 0.0F);
         this.i(aa.RIGHT);
         this.i(aa.LEFT);
         d.Y();
         d.a();
      }

   }

   private void i(aa var1) {
      this.N.n().E(this.N.sf.g());
      net.y0.c var2 = this.O.Q(this.N.sf);
      ct var3 = (ct)var2;
      d.c();
      float var4 = var1 == aa.RIGHT?1.0F:-1.0F;
      d.P(92.0F, 0.0F, 1.0F, 0.0F);
      d.P(45.0F, 1.0F, 0.0F, 0.0F);
      d.P(var4 * -41.0F, 0.0F, 0.0F, 1.0F);
      d.O(var4 * 0.3F, -1.1F, 0.45F);

      assert false;

      if(var1 == aa.RIGHT) {
         var3.t(this.N.sf);
      } else {
         var3.A(this.N.sf);
      }

      d.Y();
   }

   private void S(float var1, aa var2, float var3, ks var4) {
      float var5 = var2 == aa.RIGHT?1.0F:-1.0F;
      d.O(var5 * 0.125F, -0.125F, 0.0F);
      if(!this.N.sf.e()) {
         d.c();
         d.P(var5 * 10.0F, 0.0F, 0.0F, 1.0F);
         this.Q(var1, var3, var2);
         d.Y();
      }

      d.c();
      d.O(var5 * 0.51F, -0.08F + var1 * -1.2F, -0.75F);
      float var6 = net.u.t.g(var3);
      float var7 = net.u.t.A(var6 * 3.1415927F);
      float var8 = -0.5F * var7;
      float var9 = 0.4F * net.u.t.A(var6 * 6.2831855F);
      float var10 = -0.3F * net.u.t.A(var3 * 3.1415927F);
      d.O(var5 * var8, var9 - 0.3F * var7, var10);
      d.P(var7 * -45.0F, 1.0F, 0.0F, 0.0F);
      d.P(var5 * var7 * -30.0F, 0.0F, 1.0F, 0.0F);
      this.t(var4);
      d.Y();
   }

   private void R(float var1, float var2, float var3) {
      float var4 = net.u.t.g(var3);
      float var5 = -0.2F * net.u.t.A(var3 * 3.1415927F);
      float var6 = -0.4F * net.u.t.A(var4 * 3.1415927F);
      d.O(0.0F, -var5 / 2.0F, var6);
      float var7 = this.m(var1);
      d.O(0.0F, 0.04F + var2 * -1.2F + var7 * -0.5F, -0.72F);
      d.P(var7 * -85.0F, 1.0F, 0.0F, 0.0F);
      this.Y();
      float var8 = net.u.t.A(var4 * 3.1415927F);
      d.P(var8 * 20.0F, 1.0F, 0.0F, 0.0F);
      d.W(2.0F, 2.0F, 2.0F);
      this.t(this.K);
   }

   private void t(ks var1) {
      d.P(180.0F, 0.0F, 1.0F, 0.0F);
      d.P(180.0F, 0.0F, 0.0F, 1.0F);
      d.W(0.38F, 0.38F, 0.38F);
      d.i();
      this.N.n().E(h);
      r var2 = r.f();
      p var3 = var2.k();
      d.O(-0.5F, -0.5F, 0.0F);
      d.W(0.0078125F, 0.0078125F, 0.0078125F);
      var3.m(7, net.y8.x.H);
      var3.H(-7.0D, 135.0D, 0.0D).Y(0.0D, 1.0D).W();
      var3.H(135.0D, 135.0D, 0.0D).Y(1.0D, 1.0D).W();
      var3.H(135.0D, -7.0D, 0.0D).Y(1.0D, 0.0D).W();
      var3.H(-7.0D, -7.0D, 0.0D).Y(0.0D, 0.0D).W();
      var2.p();
      net.cg.s var4 = wl.t(net.nb.j.WN, var1, this.N.s8);
      this.N.s4.v().A(var4, false);
      d.K();
   }

   private void Q(float var1, float var2, aa var3) {
      boolean var4 = var3 != aa.LEFT;
      float var5 = 1.0F;
      float var6 = net.u.t.g(var2);
      float var7 = -0.3F * net.u.t.A(var6 * 3.1415927F);
      float var8 = 0.4F * net.u.t.A(var6 * 6.2831855F);
      float var9 = -0.4F * net.u.t.A(var2 * 3.1415927F);
      d.O(var5 * (var7 + 0.64000005F), var8 + -0.6F + var1 * -0.6F, var9 + -0.71999997F);
      d.P(var5 * 45.0F, 0.0F, 1.0F, 0.0F);
      float var10 = net.u.t.A(var2 * var2 * 3.1415927F);
      float var11 = net.u.t.A(var6 * 3.1415927F);
      d.P(var5 * var11 * 70.0F, 0.0F, 1.0F, 0.0F);
      d.P(var5 * var10 * -20.0F, 0.0F, 0.0F, 1.0F);
      net.yy.g var12 = this.N.sf;
      this.N.n().E(var12.g());
      d.O(var5 * -1.0F, 3.6F, 3.5F);
      d.P(var5 * 120.0F, 0.0F, 0.0F, 1.0F);
      d.P(200.0F, 1.0F, 0.0F, 0.0F);
      d.P(var5 * -135.0F, 0.0F, 1.0F, 0.0F);
      d.O(var5 * 5.6F, 0.0F, 0.0F);
      ct var13 = (ct)this.O.Q(var12);
      d.j();
      Color var14 = new Color(vn.d.T());
      Color var15 = new Color(var14.getRed(), var14.getGreen(), var14.getBlue());
      if(gn.Q.j.d(vn.class).v()) {
         GL11.glPushMatrix();
         GL11.glEnable(10754);
         GL11.glPolygonOffset(1.0F, 1000000.0F);
         ui.c(ui.w, 240.0F, 240.0F);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glBlendFunc(770, 771);
         if(!vn.F.Q()) {
            GL11.glColor4f((float)var15.darker().getRed() / 255.0F, (float)var15.darker().darker().getGreen() / 255.0F, (float)var15.darker().getBlue() / 255.0F, vn.r.e());
         } else {
            GL11.glColor4f((float)gn.M().darker().getRed() / 255.0F, (float)gn.M().darker().getGreen() / 255.0F, (float)gn.M().darker().getBlue() / 255.0F, vn.r.e());
         }

         GL11.glDisable(2929);
         GL11.glDepthMask(false);
      }

      assert false;

      var13.t(var12);
      if(gn.Q.j.d(vn.class).v()) {
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         if(!vn.F.Q()) {
            GL11.glColor4f((float)var15.darker().getRed() / 255.0F, (float)var15.darker().darker().getGreen() / 255.0F, (float)var15.darker().getBlue() / 255.0F, vn.r.e());
         } else {
            GL11.glColor4f((float)gn.M().darker().getRed() / 255.0F, (float)gn.M().darker().getGreen() / 255.0F, (float)gn.M().darker().getBlue() / 255.0F, vn.r.e());
         }

         var13.t(var12);
         GL11.glEnable(3553);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(2896);
         GL11.glPolygonOffset(1.0F, -1000000.0F);
         GL11.glDisable(10754);
         GL11.glPopMatrix();
      }

      d.a();
   }

   private void G(float var1, aa var2, ks var3) {
      z3 var4 = new z3(var2);
      _x.m(var4);
      float var5 = (float)this.N.sf.M() - var1 + 1.0F;
      float var6 = var5 / (float)var3.o();
      if(var6 < 0.8F) {
         float var7 = net.u.t.J(net.u.t.m(var5 / 4.0F * 3.1415927F) * 0.1F);
         d.O(0.0F, var7, 0.0F);
      }

      float var9 = 1.0F - (float)Math.pow((double)var6, 27.0D);
      int var8 = var2 == aa.RIGHT?1:-1;
      d.O(var9 * 0.6F * (float)var8, var9 * -0.5F, var9 * 0.0F);
      d.P((float)var8 * var9 * 90.0F, 0.0F, 1.0F, 0.0F);
      d.P(var9 * 10.0F, 1.0F, 0.0F, 0.0F);
      d.P((float)var8 * var9 * 30.0F, 0.0F, 0.0F, 1.0F);
   }

   private void x(aa var1, float var2) {
      float var3 = (float)(System.currentTimeMillis() / 3L % 360L);
      int var4 = var1 == aa.RIGHT?1:-1;
      float var5 = net.u.t.A(var2 * var2 * 3.1415927F);
      d.P((float)var4 * (45.0F + var5 * -20.0F), 0.0F, 1.0F, 0.0F);
      float var6 = net.u.t.A(net.u.t.g(var2) * 3.1415927F);
      d.P((float)var4 * var6 * -20.0F, 0.0F, 0.0F, 1.0F);
      d.P(var6 * -80.0F, 1.0F, 0.0F, 0.0F);
      if(gn.Q.j.d(vf.class).v() && vf.H.Q()) {
         d.P(var3, 0.0F, 1.0F, 0.0F);
      } else {
         d.P((float)var4 * -45.0F, 0.0F, 1.0F, 0.0F);
      }

      d.O(0.0F, 0.02F, 0.0F);
   }

   private void Z(aa var1, float var2) {
      z3 var3 = new z3(var1);
      _x.m(var3);
      int var4 = var1 == aa.RIGHT?1:-1;
      d.O((float)var4 * 0.56F, -0.52F + var2 * -0.6F, -0.72F);
   }

   private void r() {
      d.O(-0.5F, 0.08F, 0.0F);
      d.P(20.0F, 0.0F, 1.0F, 0.0F);
      d.P(-80.0F, 1.0F, 0.0F, 0.0F);
      d.P(20.0F, 0.0F, 1.0F, 0.0F);
   }

   private void u(float var1, float var2) {
      d.O(0.56F, -0.44F, -0.71999997F);
      d.O(0.0F, var1 * -0.6F, 0.0F);
      d.P(45.0F, 0.0F, 1.0F, 0.0F);
      float var3 = net.u.t.A(var2 * var2 * 3.1415927F);
      float var4 = net.u.t.A(net.u.t.g(var2) * 3.1415927F);
      d.P(var3 * -20.0F, 0.0F, 0.0F, 0.0F);
      d.P(var4 * -20.0F, 0.0F, 0.0F, 1.0F);
      d.P(var4 * -80.0F, 0.01F, 0.0F, 0.0F);
      d.O(0.4F, 0.2F, 0.2F);
   }

   public void Z(float var1) {
      net.yy.g var2 = this.N.sf;
      float var3 = var2.p(var1);
      net.yz.k var4 = (net.yz.k)MoreObjects.firstNonNull(var2.XE, net.yz.k.MAIN_HAND);
      float var5 = var2.d + (var2.V - var2.d) * var1;
      float var6 = var2.hq + (var2.hN - var2.hq) * var1;
      boolean var7 = true;
      boolean var8 = true;
      if(var2.F()) {
         ks var9 = var2.t();
         if(!var9.B() && var9.Z() == net.nb.j.w) {
            net.yz.k var10 = var2.H();
            var7 = var10 == net.yz.k.MAIN_HAND;
            var8 = true;
         }
      }

      this.p(var5, var6);
      this.u();
      this.N(var1);
      d.F();
      float var13 = var4 == net.yz.k.MAIN_HAND?var3:0.0F;
      float var15 = 1.0F - (this.V + (this.m - this.V) * var1);
      if(!i6.t.r() || !i6.G(i6.t, new Object[]{net.yz.k.MAIN_HAND, Float.valueOf(var1), Float.valueOf(var5), Float.valueOf(var13), Float.valueOf(var15), this.K})) {
         this.l(var2, var1, var5, net.yz.k.MAIN_HAND, var13, this.K, var15);
      }

      var13 = var4 == net.yz.k.OFF_HAND?var3:0.0F;
      var15 = 1.0F - (this.l + (this.s - this.l) * var1);
      if(!i6.t.r() || !i6.G(i6.t, new Object[]{net.yz.k.OFF_HAND, Float.valueOf(var1), Float.valueOf(var5), Float.valueOf(var13), Float.valueOf(var15), this.R})) {
         this.l(var2, var1, var5, net.yz.k.OFF_HAND, var13, this.R, var15);
      }

      d.g();
      u1.m();
   }

   public void l(net.yy.f var1, float var2, float var3, net.yz.k var4, float var5, ks var6, float var7) {
      String var8 = p.S();
      if(!z9.Q() || !oz.R(var4)) {
         boolean var9 = var4 == net.yz.k.MAIN_HAND;
         aa var10 = var1.a();
         d.c();
         if(!var6.B()) {
            if(var6.Z() instanceof yn) {
               this.S(var7, var10, var5, var6);
            }

            boolean var11 = var10 == aa.RIGHT;
            if(var1.F() && var1.M() > 0 && var1.H() == var4) {
               byte var12 = -1;
               switch(null.c[var6.D().ordinal()]) {
               case 1:
                  this.Z(var10, var7);
               case 2:
               case 3:
                  this.G(var2, var10, var6);
                  this.Z(var10, var7);
               case 4:
                  this.Z(var10, var7);
               case 5:
                  this.Z(var10, var7);
                  d.O((float)var12 * -0.2785682F, 0.18344387F, 0.15731531F);
                  d.P(-13.935F, 1.0F, 0.0F, 0.0F);
                  d.P((float)var12 * 35.3F, 0.0F, 1.0F, 0.0F);
                  d.P((float)var12 * -9.785F, 0.0F, 0.0F, 1.0F);
                  float var13 = (float)var6.o() - ((float)this.N.sf.M() - var2 + 1.0F);
                  float var14 = var13 / 20.0F;
                  var14 = (var14 * var14 + var14 * 2.0F) / 3.0F;
                  if(Float.compare(var14, 1.0F) > 0) {
                     var14 = 1.0F;
                  }

                  if(Float.compare(var14, 0.1F) > 0) {
                     float var15 = net.u.t.A((var13 - 0.1F) * 1.3F);
                     float var16 = var14 - 0.1F;
                     float var17 = var15 * var16;
                     d.O(var17 * 0.0F, var17 * 0.004F, var17 * 0.0F);
                  }

                  d.O(var14 * 0.0F, var14 * 0.0F, var14 * 0.04F);
                  d.W(1.0F, 1.0F, 1.0F + var14 * 0.2F);
                  d.P((float)var12 * 45.0F, 0.0F, -1.0F, 0.0F);
               }
            }

            float var18 = -0.4F * net.u.t.A(net.u.t.g(var5) * 3.1415927F);
            float var19 = 0.2F * net.u.t.A(net.u.t.g(var5) * 6.2831855F);
            float var21 = -0.2F * net.u.t.A(var5 * 3.1415927F);
            byte var22 = -1;
            float var23 = 1.0F - (this.V + (this.m - this.V) * var2);
            float var24 = this.N.sf.p(var2);
            if(vf.u.Q() && gn.Q.j.d(si.class).v() && si.d != null && Float.compare(this.N.sf.d(si.d), si.n.e()) <= 0 && gn.Q.j.d(vf.class).v()) {
               if(vf.u.Q() && gn.Q.j.d(si.class).v() && si.d != null && this.N.sf.d(si.d) <= si.n.e() && gn.Q.j.d(vf.class).v()) {
                  if(var10 != aa.LEFT) {
                     this.u(var23 / 3.0F, var24);
                     this.r();
                  }

                  d.O((float)var22 * var18, var19, var21);
                  this.Z(var10, var7);
                  this.x(var10, var5);
               }

               this.Z(var10, var7);
               this.x(var10, var5);
            }

            d.O((float)var22 * var18, var19, var21);
            this.Z(var10, var7);
            this.x(var10, var5);
            this.N(var1, var6, net.ym.s.FIRST_PERSON_RIGHT_HAND, true);
         }

         d.Y();
      }

   }

   public void k(float var1) {
      d.d();
      if(this.N.sf.A()) {
         this.N.s8.Z(new net.u.j(this.N.sf));
         new net.u.j(this.N.sf);
         net.yy.g var4 = this.N.sf;
         int var5 = 0;

         while(true) {
            double var6 = var4.b + (double)(((float)(var5 % 2) - 0.5F) * var4.h9 * 0.8F);
            double var8 = var4.hS + (double)(((float)((var5 >> 1) % 2) - 0.5F) * 0.1F);
            double var10 = var4.hr + (double)(((float)((var5 >> 2) % 2) - 0.5F) * var4.h9 * 0.8F);
            net.u.j var12 = new net.u.j(var6, var8 + (double)var4.A(), var10);
            net.yw.n var13 = this.N.s8.Z(var12);
            if(var13.b()) {
               ;
            }

            ++var5;
         }
      }

      if(!this.N.sf.VX()) {
         if(this.N.sf.A(net.y1.l.p) && !i6.G(i6.MC, new Object[]{this.N.sf, Float.valueOf(var1)})) {
            this.a(var1);
         }

         if(this.N.sf.a() && !i6.G(i6.CI, new Object[]{this.N.sf, Float.valueOf(var1)})) {
            this.n();
         }
      }

      d.m();
   }

   private void k(net.n9.v var1) {
      this.N.n().E(net.n9.b.N);
      r var2 = r.f();
      p var3 = var2.k();
      d.T(0.1F, 0.1F, 0.1F, 0.5F);
      d.c();
      float var4 = var1.q();
      float var5 = var1.o();
      float var6 = var1.n();
      float var7 = var1.r();
      var3.m(7, net.y8.x.H);
      var3.H(-1.0D, -1.0D, -0.5D).Y((double)var5, (double)var7).W();
      var3.H(1.0D, -1.0D, -0.5D).Y((double)var4, (double)var7).W();
      var3.H(1.0D, 1.0D, -0.5D).Y((double)var4, (double)var6).W();
      var3.H(-1.0D, 1.0D, -0.5D).Y((double)var5, (double)var6).W();
      var2.p();
      d.Y();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(float var1) {
      if(!z9.Q() || oz.M()) {
         this.N.n().E(H);
         r var2 = r.f();
         p var3 = var2.k();
         float var4 = this.N.sf.d();
         d.T(var4, var4, var4, 0.5F);
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         d.c();
         float var5 = -this.N.sf.hN / 64.0F;
         float var6 = this.N.sf.V / 64.0F;
         var3.m(7, net.y8.x.H);
         var3.H(-1.0D, -1.0D, -0.5D).Y((double)(4.0F + var5), (double)(4.0F + var6)).W();
         var3.H(1.0D, -1.0D, -0.5D).Y((double)(0.0F + var5), (double)(4.0F + var6)).W();
         var3.H(1.0D, 1.0D, -0.5D).Y((double)(0.0F + var5), (double)(0.0F + var6)).W();
         var3.H(-1.0D, 1.0D, -0.5D).Y((double)(4.0F + var5), (double)(0.0F + var6)).W();
         var2.p();
         d.Y();
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.E();
      }

   }

   private void n() {
      if(gn.Q.j.d(v3.class).v() && v3.Y.Q()) {
         GL11.glTranslatef(0.0F, -0.5F, 0.0F);
      }

      r var1 = r.f();
      p var2 = var1.k();
      d.T(1.0F, 1.0F, 1.0F, 0.9F);
      d.n(519);
      d.Y(false);
      d.C();
      d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
      int var3 = 0;

      while(true) {
         d.c();
         net.n9.v var4 = this.N.p().O("minecraft:blocks/fire_layer_1");
         this.N.n().E(net.n9.b.N);
         float var5 = var4.q();
         float var6 = var4.o();
         float var7 = var4.n();
         float var8 = var4.r();
         d.O((float)(-(var3 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         d.P((float)(var3 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.m(7, net.y8.x.H);
         var2.H(-0.5D, -0.5D, -0.5D).Y((double)var6, (double)var8).W();
         var2.H(0.5D, -0.5D, -0.5D).Y((double)var5, (double)var8).W();
         var2.H(0.5D, 0.5D, -0.5D).Y((double)var5, (double)var7).W();
         var2.H(-0.5D, 0.5D, -0.5D).Y((double)var6, (double)var7).W();
         var1.p();
         d.Y();
         ++var3;
      }
   }

   public void m() {
      this.V = this.m;
      this.l = this.s;
      net.yy.g var1 = this.N.sf;
      ks var2 = var1.S();
      ks var3 = var1.L();
      if(var1.FY()) {
         this.m = net.u.t.T(this.m - 0.4F, 0.0F, 1.0F);
         this.s = net.u.t.T(this.s - 0.4F, 0.0F, 1.0F);
      } else {
         float var4 = var1.B(1.0F);
         if(i6.uP.r()) {
            boolean var5 = i6.G(i6.uP, new Object[]{this.K, var2, Integer.valueOf(var1.a8.r)});
            boolean var6 = i6.G(i6.uP, new Object[]{this.R, var3, Integer.valueOf(-1)});
            if(!Objects.equals(this.K, var2)) {
               this.K = var2;
            }

            if(!Objects.equals(this.R, var3)) {
               this.R = var3;
            }

            this.m += net.u.t.T(var4 * var4 * var4 - this.m, -0.4F, 0.4F);
            this.s += net.u.t.T((float)1 - this.s, -0.4F, 0.4F);
         } else {
            this.m += net.u.t.T((Objects.equals(this.K, var2)?var4 * var4 * var4:0.0F) - this.m, -0.4F, 0.4F);
            this.s += net.u.t.T((float)(Objects.equals(this.R, var3)?1:0) - this.s, -0.4F, 0.4F);
         }
      }

      if(this.m < 0.1F) {
         this.K = var2;
         if(z9.Q()) {
            oz.B(this.K);
         }
      }

      if(this.s < 0.1F) {
         this.R = var3;
         if(z9.Q()) {
            oz.k(this.R);
         }
      }

   }

   public void d(net.yz.k var1) {
      if(var1 == net.yz.k.MAIN_HAND) {
         this.m = 0.0F;
      } else {
         this.s = 0.0F;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
