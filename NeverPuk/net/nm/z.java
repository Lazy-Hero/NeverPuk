package net.nm;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.n0.ks;
import net.n1.o;
import net.nl.z2;
import net.nm.w;
import net.yz.aa;
import net.yz.ad;
import net.yz.ai;

public class z extends net.ne.a {
   private static final net.u.f V8 = new net.u.f(0.0F, 0.0F, 0.0F);
   private static final net.u.f Ve = new net.u.f(0.0F, 0.0F, 0.0F);
   private static final net.u.f VW = new net.u.f(-10.0F, 0.0F, -10.0F);
   private static final net.u.f VU = new net.u.f(-15.0F, 0.0F, 10.0F);
   private static final net.u.f VG = new net.u.f(-1.0F, 0.0F, -1.0F);
   private static final net.u.f Vl = new net.u.f(1.0F, 0.0F, 1.0F);
   public static final net.k.v VJ = net.k.n.q(net.nm.z.class, y.g);
   public static final net.k.v Va = net.k.n.q(net.nm.z.class, y.G);
   public static final net.k.v VK = net.k.n.q(net.nm.z.class, y.G);
   public static final net.k.v VE = net.k.n.q(net.nm.z.class, y.G);
   public static final net.k.v V5 = net.k.n.q(net.nm.z.class, y.G);
   public static final net.k.v V7 = net.k.n.q(net.nm.z.class, y.G);
   public static final net.k.v VT = net.k.n.q(net.nm.z.class, y.G);
   private static final Predicate Vz = new Predicate() {
      public boolean n(@Nullable net.ne.l var1) {
         boolean var2 = w.h.s();
         return var1 instanceof w && ((w)var1).R() == w.h.RIDEABLE;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final net.yz.w V4;
   private final net.yz.w Vo;
   private boolean VI;
   public long VF;
   private int Vh;
   private boolean Vq;
   private net.u.f Vu;
   private net.u.f VY;
   private net.u.f VR;
   private net.u.f Vy;
   private net.u.f VP;
   private net.u.f V6;

   public z(net.yv.r var1) {
      super(var1);
      this.V4 = net.yz.w.C(2, ks.a);
      this.Vo = net.yz.w.C(4, ks.a);
      this.Vu = V8;
      this.VY = Ve;
      this.VR = VW;
      this.Vy = VU;
      this.VP = VG;
      this.V6 = Vl;
      this.r = this.j();
      this.S(0.5F, 1.975F);
   }

   public z(net.yv.r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
   }

   protected final void S(float var1, float var2) {
      double var3 = this.b;
      double var5 = this.hS;
      double var7 = this.hr;
      float var9 = this.Ji()?0.0F:(this.H9()?0.5F:1.0F);
      super.S(var1 * var9, var2 * var9);
      this.t(var3, var5, var7);
   }

   public boolean H7() {
      return super.H7() && !this.j();
   }

   protected void g() {
      super.g();
      this.G.r(VJ, Byte.valueOf((byte)0));
      this.G.r(Va, V8);
      this.G.r(VK, Ve);
      this.G.r(VE, VW);
      this.G.r(V5, VU);
      this.G.r(V7, VG);
      this.G.r(VT, Vl);
   }

   public Iterable g() {
      return this.V4;
   }

   public Iterable J() {
      return this.Vo;
   }

   public ks U(z2 var1) {
      switch(null.z[var1.x().ordinal()]) {
      case 1:
         return (ks)this.V4.get(var1.l());
      case 2:
         return (ks)this.Vo.get(var1.l());
      default:
         return ks.a;
      }
   }

   public void u(z2 var1, ks var2) {
      switch(null.z[var1.x().ordinal()]) {
      case 1:
         this.R(var2);
         this.V4.set(var1.l(), var2);
         break;
      case 2:
         this.R(var2);
         this.Vo.set(var1.l(), var2);
      }

   }

   public boolean K(int var1, ks var2) {
      z2 var3;
      if(var1 == 98) {
         var3 = z2.MAINHAND;
      } else if(var1 == 99) {
         var3 = z2.OFFHAND;
      } else if(var1 == 100 + z2.HEAD.l()) {
         var3 = z2.HEAD;
      } else if(var1 == 100 + z2.CHEST.l()) {
         var3 = z2.CHEST;
      } else if(var1 == 100 + z2.LEGS.l()) {
         var3 = z2.LEGS;
      } else {
         if(var1 != 100 + z2.FEET.l()) {
            return false;
         }

         var3 = z2.FEET;
      }

      if(!var2.B() && !net.ne.y.z(var3, var2) && var3 != z2.HEAD) {
         return false;
      } else {
         this.u(var3, var2);
         return true;
      }
   }

   public static void l(net.c0.d var0) {
      var0.U(net.c0.q.ENTITY, new net.ng.u(net.nm.z.class, new String[]{"ArmorItems", "HandItems"}));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      net.nj.h var2 = new net.nj.h();

      for(ks var4 : this.Vo) {
         net.nj.f var5 = new net.nj.f();
         if(!var4.B()) {
            var4.Z(var5);
         }

         var2.m(var5);
      }

      var1.K("ArmorItems", var2);
      net.nj.h var7 = new net.nj.h();

      for(ks var9 : this.V4) {
         net.nj.f var6 = new net.nj.f();
         if(!var9.B()) {
            var9.Z(var6);
         }

         var7.m(var6);
      }

      var1.K("HandItems", var7);
      var1.c("Invisible", this.e());
      var1.c("Small", this.JI());
      var1.c("ShowArms", this.D());
      var1.r("DisabledSlots", this.Vh);
      var1.c("NoBasePlate", this.JY());
      if(this.Ji()) {
         var1.c("Marker", this.Ji());
      }

      var1.K("Pose", this.r());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("ArmorItems", 9)) {
         net.nj.h var2 = var1.A("ArmorItems", 10);

         for(int var3 = 0; var3 < this.Vo.size(); ++var3) {
            this.Vo.set(var3, new ks(var2.i(var3)));
         }
      }

      if(var1.K("HandItems", 9)) {
         net.nj.h var4 = var1.A("HandItems", 10);

         for(int var6 = 0; var6 < this.V4.size(); ++var6) {
            this.V4.set(var6, new ks(var4.i(var6)));
         }
      }

      this.i(var1.i("Invisible"));
      this.u(var1.i("Small"));
      this.B(var1.i("ShowArms"));
      this.Vh = var1.P("DisabledSlots");
      this.n(var1.i("NoBasePlate"));
      this.m(var1.i("Marker"));
      this.Vq = !this.Ji();
      this.r = this.j();
      net.nj.f var5 = var1.o("Pose");
      this.h(var5);
   }

   private void h(net.nj.f var1) {
      net.nj.h var2 = var1.A("Head", 5);
      this.i(var2.N()?V8:new net.u.f(var2));
      net.nj.h var3 = var1.A("Body", 5);
      this.q(var3.N()?Ve:new net.u.f(var3));
      net.nj.h var4 = var1.A("LeftArm", 5);
      this.C(var4.N()?VW:new net.u.f(var4));
      net.nj.h var5 = var1.A("RightArm", 5);
      this.p(var5.N()?VU:new net.u.f(var5));
      net.nj.h var6 = var1.A("LeftLeg", 5);
      this.P(var6.N()?VG:new net.u.f(var6));
      net.nj.h var7 = var1.A("RightLeg", 5);
      this.E(var7.N()?Vl:new net.u.f(var7));
   }

   private net.nj.f r() {
      net.nj.f var1 = new net.nj.f();
      if(!V8.equals(this.Vu)) {
         var1.K("Head", this.Vu.x());
      }

      if(!Ve.equals(this.VY)) {
         var1.K("Body", this.VY.x());
      }

      if(!VW.equals(this.VR)) {
         var1.K("LeftArm", this.VR.x());
      }

      if(!VU.equals(this.Vy)) {
         var1.K("RightArm", this.Vy.x());
      }

      if(!VG.equals(this.VP)) {
         var1.K("LeftLeg", this.VP.x());
      }

      if(!Vl.equals(this.V6)) {
         var1.K("RightLeg", this.V6.x());
      }

      return var1;
   }

   public boolean b() {
      return false;
   }

   protected void I(net.ne.l var1) {
   }

   protected void z() {
      List var1 = this.hl.S(this, this.i(), Vz);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         net.ne.l var3 = (net.ne.l)var1.get(var2);
         if(this.F(var3) <= 0.2D) {
            var3.W(this);
         }
      }

   }

   public ad v(net.r.r var1, net.u.r var2, net.yz.k var3) {
      ks var4 = var1.o((net.yz.k)var3);
      if(!this.Ji() && var4.Z() != net.nb.j.YR) {
         if(!this.hl.x && !var1.VX()) {
            z2 var5 = net.ne.y.M(var4);
            if(var4.B()) {
               z2 var6 = this.G(var2);
               z2 var7 = this.T(var6)?var5:var6;
               if(this.A(var7)) {
                  this.u(var1, var7, var4, var3);
               }
            } else {
               if(this.T(var5)) {
                  return ad.FAIL;
               }

               if(var5.x() == z2.w.HAND && !this.D()) {
                  return ad.FAIL;
               }

               this.u(var1, var5, var4, var3);
            }

            return ad.SUCCESS;
         } else {
            return ad.SUCCESS;
         }
      } else {
         return ad.PASS;
      }
   }

   protected z2 G(net.u.r var1) {
      z2 var2 = z2.MAINHAND;
      boolean var3 = this.JI();
      double var4 = var1.H * 2.0D;
      z2 var6 = z2.FEET;
      if(var4 >= 0.1D && var4 < 0.1D + 0.8D && this.A(var6)) {
         var2 = z2.FEET;
      } else if(var4 >= 0.9D + 0.3D && var4 < 0.9D + 1.0D && this.A(z2.CHEST)) {
         var2 = z2.CHEST;
      } else if(var4 >= 0.4D && var4 < 0.4D + 1.0D && this.A(z2.LEGS)) {
         var2 = z2.LEGS;
      } else if(var4 >= 1.6D && this.A(z2.HEAD)) {
         var2 = z2.HEAD;
      }

      return var2;
   }

   private boolean T(z2 var1) {
      return (this.Vh & 1 << var1.B()) != 0;
   }

   private void u(net.r.r var1, z2 var2, ks var3, net.yz.k var4) {
      ks var5 = this.U(var2);
      if((var5.B() || (this.Vh & 1 << var2.B() + 8) == 0) && (!var5.B() || (this.Vh & 1 << var2.B() + 16) == 0)) {
         if(var1.a6.V && var5.B() && !var3.B()) {
            ks var7 = var3.s();
            var7.u(1);
            this.u(var2, var7);
         } else if(!var3.B() && var3.U() > 1) {
            if(var5.B()) {
               ks var6 = var3.s();
               var6.u(1);
               this.u(var2, var6);
               var3.H(1);
            }
         } else {
            this.u(var2, var3);
            var1.e(var4, var5);
         }
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      boolean var3 = w.h.s();
      if(!this.hl.x && !this.Z) {
         if(net.yz.z.s.equals(var1)) {
            this.B();
            return false;
         } else if(!this.w(var1) && !this.VI && !this.Ji()) {
            if(var1.e()) {
               this.v();
               this.B();
               return false;
            } else if(net.yz.z.p.equals(var1)) {
               if(this.a()) {
                  this.T(0.15F);
               }

               this.n(5);
               return false;
            } else if(net.yz.z.y.equals(var1) && Float.compare(this.h(), 0.5F) > 0) {
               this.T(4.0F);
               return false;
            } else {
               boolean var4 = "arrow".equals(var1.V());
               boolean var5 = "player".equals(var1.V());
               if(!var5 && !var4) {
                  return false;
               } else {
                  if(var1.g() instanceof o) {
                     var1.g().B();
                  }

                  if(var1.v() instanceof net.r.r && !((net.r.r)var1.v()).a6.s) {
                     return false;
                  } else if(var1.Q()) {
                     this.b();
                     this.m();
                     this.B();
                     return false;
                  } else {
                     long var6 = this.hl.y();
                     if(var6 - this.VF > 5L) {
                        this.hl.k(this, (byte)32);
                        this.VF = var6;
                     }

                     this.D();
                     this.m();
                     this.B();
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void R(byte var1) {
      if(var1 == 32) {
         if(this.hl.x) {
            this.hl.m(this.b, this.hS, this.hr, net.nb.l.wf, this.E(), 0.3F, 1.0F, false);
            this.VF = this.hl.y();
         }
      } else {
         super.R(var1);
      }

   }

   public boolean p(double var1) {
      double var3 = this.i().O() * 4.0D;
      if(Double.isNaN(var3) || var3 == 0.0D) {
         var3 = 4.0D;
      }

      var3 = var3 * 64.0D;
      return var1 < var3 * var3;
   }

   private void m() {
      if(this.hl instanceof net.yv.d) {
         ((net.yv.d)this.hl).q(ai.BLOCK_DUST, this.b, this.hS + (double)this.m / 1.5D, this.hr, 10, (double)(this.h9 / 4.0F), (double)(this.m / 4.0F), (double)(this.h9 / 4.0F), 0.05D, new int[]{net.y9.l.m(net.nb.f.oN.p())});
      }

   }

   private void T(float var1) {
      float var2 = this.h();
      var2 = var2 - var1;
      if(var2 <= 0.5F) {
         this.v();
         this.B();
      } else {
         this.u(var2);
      }

   }

   private void D() {
      net.y9.l.e(this.hl, new net.u.j(this), new ks(net.nb.j.YH));
      this.v();
   }

   private void v() {
      this.b();

      for(int var1 = 0; var1 < this.V4.size(); ++var1) {
         ks var2 = (ks)this.V4.get(var1);
         if(!var2.B()) {
            net.y9.l.e(this.hl, (new net.u.j(this)).h(), var2);
            this.V4.set(var1, ks.a);
         }
      }

      for(int var3 = 0; var3 < this.Vo.size(); ++var3) {
         ks var4 = (ks)this.Vo.get(var3);
         if(!var4.B()) {
            net.y9.l.e(this.hl, (new net.u.j(this)).h(), var4);
            this.Vo.set(var3, ks.a);
         }
      }

   }

   private void b() {
      this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.CI, this.E(), 1.0F, 1.0F);
   }

   protected float z(float var1, float var2) {
      this.Az = this.hq;
      this.AK = this.hN;
      return 0.0F;
   }

   public float A() {
      return this.H9()?this.m * 0.5F:this.m * 0.9F;
   }

   public double O() {
      return this.Ji()?0.0D:0.10000000149011612D;
   }

   public void E(float var1, float var2, float var3) {
      if(!this.j()) {
         super.E(var1, var2, var3);
      }

   }

   public void X(float var1) {
      this.Az = this.hq = var1;
      this.AH = this.A3 = var1;
   }

   public void A(float var1) {
      this.Az = this.hq = var1;
      this.AH = this.A3 = var1;
   }

   public void A() {
      super.A();
      net.u.f var1 = (net.u.f)this.G.a(Va);
      if(!this.Vu.equals(var1)) {
         this.i(var1);
      }

      net.u.f var2 = (net.u.f)this.G.a(VK);
      if(!this.VY.equals(var2)) {
         this.q(var2);
      }

      net.u.f var3 = (net.u.f)this.G.a(VE);
      if(!this.VR.equals(var3)) {
         this.C(var3);
      }

      net.u.f var4 = (net.u.f)this.G.a(V5);
      if(!this.Vy.equals(var4)) {
         this.p(var4);
      }

      net.u.f var5 = (net.u.f)this.G.a(V7);
      if(!this.VP.equals(var5)) {
         this.P(var5);
      }

      net.u.f var6 = (net.u.f)this.G.a(VT);
      if(!this.V6.equals(var6)) {
         this.E(var6);
      }

      boolean var7 = this.Ji();
      if(this.Vq != var7) {
         this.f(var7);
         this.a = true;
         this.Vq = var7;
      }

   }

   private void f(boolean var1) {
      this.S(0.0F, 0.0F);
   }

   protected void t() {
      this.i(this.VI);
   }

   public void i(boolean var1) {
      this.VI = var1;
      super.i(var1);
   }

   public boolean H9() {
      return this.JI();
   }

   public void L() {
      this.B();
   }

   public boolean T() {
      return this.e();
   }

   public net.y1.v J() {
      return this.Ji()?net.y1.v.IGNORE:super.J();
   }

   private void u(boolean var1) {
      this.G.d(VJ, Byte.valueOf(this.a(((Byte)this.G.a(VJ)).byteValue(), 1, var1)));
      this.S(0.5F, 1.975F);
   }

   public boolean JI() {
      return (((Byte)this.G.a(VJ)).byteValue() & 1) != 0;
   }

   private void B(boolean var1) {
      this.G.d(VJ, Byte.valueOf(this.a(((Byte)this.G.a(VJ)).byteValue(), 4, var1)));
   }

   public boolean D() {
      return (((Byte)this.G.a(VJ)).byteValue() & 4) != 0;
   }

   private void n(boolean var1) {
      this.G.d(VJ, Byte.valueOf(this.a(((Byte)this.G.a(VJ)).byteValue(), 8, var1)));
   }

   public boolean JY() {
      return (((Byte)this.G.a(VJ)).byteValue() & 8) != 0;
   }

   private void m(boolean var1) {
      this.G.d(VJ, Byte.valueOf(this.a(((Byte)this.G.a(VJ)).byteValue(), 16, var1)));
      this.S(0.5F, 1.975F);
   }

   public boolean Ji() {
      return (((Byte)this.G.a(VJ)).byteValue() & 16) != 0;
   }

   private byte a(byte var1, int var2, boolean var3) {
      var1 = (byte)(var1 | var2);
      return var1;
   }

   public void i(net.u.f var1) {
      this.Vu = var1;
      this.G.d(Va, var1);
   }

   public void q(net.u.f var1) {
      this.VY = var1;
      this.G.d(VK, var1);
   }

   public void C(net.u.f var1) {
      this.VR = var1;
      this.G.d(VE, var1);
   }

   public void p(net.u.f var1) {
      this.Vy = var1;
      this.G.d(V5, var1);
   }

   public void P(net.u.f var1) {
      this.VP = var1;
      this.G.d(V7, var1);
   }

   public void E(net.u.f var1) {
      this.V6 = var1;
      this.G.d(VT, var1);
   }

   public net.u.f u() {
      return this.Vu;
   }

   public net.u.f G() {
      return this.VY;
   }

   public net.u.f o() {
      return this.VR;
   }

   public net.u.f Y() {
      return this.Vy;
   }

   public net.u.f O() {
      return this.VP;
   }

   public net.u.f b() {
      return this.V6;
   }

   public boolean w() {
      return super.w() && !this.Ji();
   }

   public aa a() {
      return aa.RIGHT;
   }

   protected net.yz.a s(int var1) {
      return net.nb.l.Mu;
   }

   @Nullable
   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.wf;
   }

   @Nullable
   protected net.yz.a r() {
      return net.nb.l.CI;
   }

   public void j(net.yi.e var1) {
   }

   public boolean U() {
      return false;
   }

   public void O(net.k.v var1) {
      if(VJ.equals(var1)) {
         this.S(0.5F, 1.975F);
      }

      super.O(var1);
   }

   public boolean N() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
