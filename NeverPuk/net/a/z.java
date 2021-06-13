package net.a;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.b.s;
import net.c0.d;
import net.k.n;
import net.k.v;
import net.k.y;
import net.n1.o;
import net.n1.w;
import net.ne.a;
import net.ne.l;
import net.ne.u;
import net.nj.f;
import net.nk.i;
import net.r.h;
import net.r.r;
import net.u.j;
import net.y_.b;
import net.y_.g;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yv.o6;
import net.yv.of;
import net.yz.q;

public class z extends i implements net.ne.x {
   private static final v wy = n.q(net.a.z.class, y.d);
   private static final v wf = n.q(net.a.z.class, y.d);
   private static final v w0 = n.q(net.a.z.class, y.d);
   private static final v[] wh = new v[]{wy, wf, w0};
   private static final v wY = n.q(net.a.z.class, y.d);
   private final float[] w5 = new float[2];
   private final float[] ws = new float[2];
   private final float[] w2 = new float[2];
   private final float[] wg = new float[2];
   private final int[] w8 = new int[2];
   private final int[] wF = new int[2];
   private int wV;
   private final o6 w3 = (o6)(new o6(this.b(), of.y.PURPLE, of.f.PROGRESS)).u(true);
   private static final Predicate w_ = new Predicate() {
      public boolean R(@Nullable l var1) {
         boolean var2 = r.D();
         return var1 instanceof a && ((a)var1).g() != u.UNDEAD && ((a)var1).N();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public z(net.yv.r var1) {
      super(var1);
      this.u(this.w());
      this.S(0.9F, 3.5F);
      this.hw = true;
      ((s)this.H()).f(true);
      this.p0 = 50;
   }

   protected void D() {
      this.p_.X(0, new net.a.z());
      this.p_.X(1, new op(this));
      this.p_.X(2, new g(this, 1.0D, 40, 20.0F));
      this.p_.X(5, new ow(this, 1.0D));
      this.p_.X(6, new ok(this, r.class, 8.0F));
      this.p_.X(7, new oa(this));
      this.pM.X(1, new oo(this, false, new Class[0]));
      this.pM.X(2, new o8(this, net.ne.y.class, 0, false, false, w_));
   }

   protected void g() {
      super.g();
      this.G.r(wy, Integer.valueOf(0));
      this.G.r(wf, Integer.valueOf(0));
      this.G.r(w0, Integer.valueOf(0));
      this.G.r(wY, Integer.valueOf(0));
   }

   public static void J(d var0) {
      net.ne.y.J(var0, net.a.z.class);
   }

   public void I(f var1) {
      super.I(var1);
      var1.r("Invul", this.i());
   }

   public void o(f var1) {
      super.o(var1);
      this.o(var1.P("Invul"));
      if(this.H()) {
         this.w3.T(this.b());
      }

   }

   public void K(String var1) {
      super.K(var1);
      this.w3.T(this.b());
   }

   protected net.yz.a T() {
      return net.nb.l.wA;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.DF;
   }

   protected net.yz.a r() {
      return net.nb.l.b;
   }

   public void d() {
      this.K *= 0.6000000238418579D;
      if(!this.hl.x && this.Q(0) > 0) {
         l var1 = this.hl.S(this.Q(0));
         if(this.hS < var1.hS || !this.Kd() && this.hS < var1.hS + 5.0D) {
            if(this.K < 0.0D) {
               this.K = 0.0D;
            }

            this.K += (0.5D - this.K) * 0.6000000238418579D;
         }

         double var2 = var1.b - this.b;
         double var4 = var1.hr - this.hr;
         double var6 = var2 * var2 + var4 * var4;
         if(var6 > 9.0D) {
            double var8 = (double)net.u.t.R(var6);
            this.hf += (var2 / var8 * 0.5D - this.hf) * 0.6000000238418579D;
            this.J += (var4 / var8 * 0.5D - this.J) * 0.6000000238418579D;
         }
      }

      if(this.hf * this.hf + this.J * this.J > 0.05000000074505806D) {
         this.hN = (float)net.u.t.V(this.J, this.hf) * 57.295776F - 90.0F;
      }

      super.d();
      int var20 = 0;

      while(true) {
         this.wg[var20] = this.ws[var20];
         this.w2[var20] = this.w5[var20];
         ++var20;
      }
   }

   protected void T() {
      boolean var1 = r.D();
      if(this.i() > 0) {
         int var2 = this.i() - 1;
         if(var2 <= 0) {
            this.hl.c(this, this.b, this.hS + (double)this.A(), this.hr, 7.0F, false, this.hl.N().b("mobGriefing"));
            this.hl.A(1023, new j(this), 0);
         }

         this.o(var2);
         if(this.x % 10 == 0) {
            this.d(10.0F);
         }
      }

      super.T();
      int var15 = 1;
      if(this.x >= this.w8[var15 - 1]) {
         this.w8[var15 - 1] = this.x + 10 + this.p.nextInt(10);
         if(this.hl.k() == net.yv.l.NORMAL || this.hl.k() == net.yv.l.HARD) {
            int var3 = var15 - 1;
            int var4 = this.wF[var15 - 1];
            this.wF[var3] = this.wF[var15 - 1] + 1;
            if(var4 > 15) {
               float var5 = 10.0F;
               float var6 = 5.0F;
               double var7 = net.u.t.w(this.p, this.b - 10.0D, this.b + 10.0D);
               double var9 = net.u.t.w(this.p, this.hS - 5.0D, this.hS + 5.0D);
               double var11 = net.u.t.w(this.p, this.hr - 10.0D, this.hr + 10.0D);
               this.Z(var15 + 1, var7, var9, var11, true);
               this.wF[var15 - 1] = 0;
            }
         }

         int var18 = this.Q(var15);
         if(var18 > 0) {
            l var20 = this.hl.S(var18);
            if(var20 != null && var20.P() && this.F(var20) <= 900.0D && this.b(var20)) {
               if(var20 instanceof r && ((r)var20).a6.T) {
                  this.q(var15, 0);
               }

               this.B(var15 + 1, (a)var20);
               this.w8[var15 - 1] = this.x + 40 + this.p.nextInt(20);
               this.wF[var15 - 1] = 0;
            }

            this.q(var15, 0);
         }

         List var21 = this.hl.L(a.class, this.i().f(20.0D, 8.0D, 20.0D), Predicates.and(w_, q.n));
         int var23 = 0;
         if(!var21.isEmpty()) {
            label627: {
               a var26 = (a)var21.get(this.p.nextInt(var21.size()));
               if(var26 != this && var26.P() && this.b(var26)) {
                  if(var26 instanceof r) {
                     if(((r)var26).a6.T) {
                        break label627;
                     }

                     this.q(var15, var26.G());
                  }

                  this.q(var15, var26.G());
               }

               var21.remove(var26);
               ++var23;
            }
         }
      }

      ++var15;
      if(this.M() != null) {
         this.q(0, this.M().G());
      }

      this.q(0, 0);
      if(this.wV > 0) {
         --this.wV;
         if(this.wV == 0 && this.hl.N().b("mobGriefing")) {
            var15 = net.u.t.L(this.hS);
            int var19 = net.u.t.L(this.b);
            int var22 = net.u.t.L(this.hr);
            boolean var25 = false;
            int var27 = -1;
            int var29 = -1;
            int var8 = 0;
            int var32 = var19 + var27;
            int var10 = var15 + var8;
            int var33 = var22 + var29;
            j var12 = new j(var32, var10, var33);
            net.yw.n var13 = this.hl.Z(var12);
            net.y9.l var14 = var13.Q();
            if(var13.n() != net.y1.l.q && J(var14)) {
               boolean var10000 = this.hl.e(var12, true);
            }

            ++var8;
            ++var29;
            ++var27;
         }
      }

      if(this.x % 20 == 0) {
         this.d(1.0F);
      }

      this.w3.n(this.h() / this.w());
      if(net.u.d.y() == null) {
         r.Y(false);
      }

   }

   public static boolean J(net.y9.l var0) {
      return var0 != net.nb.f.T8 && var0 != net.nb.f.TG && var0 != net.nb.f.dE && var0 != net.nb.f.i && var0 != net.nb.f.M && var0 != net.nb.f.Tc && var0 != net.nb.f.dr && var0 != net.nb.f.TJ && var0 != net.nb.f.f && var0 != net.nb.f.dK && var0 != net.nb.f.dU;
   }

   public void H() {
      this.o(220);
      this.u(this.w() / 3.0F);
   }

   public void K() {
   }

   public void b(h var1) {
      super.b(var1);
      this.w3.k(var1);
   }

   public void Q(h var1) {
      super.Q(var1);
      this.w3.a(var1);
   }

   private double Y(int var1) {
      return this.b;
   }

   private double i(int var1) {
      return this.hS + 3.0D;
   }

   private double a(int var1) {
      return this.hr;
   }

   private float D(float var1, float var2, float var3) {
      float var4 = net.u.t.k(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private void B(int var1, a var2) {
      this.Z(var1, var2.b, var2.hS + (double)var2.A() * 0.5D, var2.hr, this.p.nextFloat() < 0.001F);
   }

   private void Z(int var1, double var2, double var4, double var6, boolean var8) {
      this.hl.N((r)null, 1024, new j(this), 0);
      double var9 = this.Y(var1);
      double var11 = this.i(var1);
      double var13 = this.a(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      w var21 = new w(this.hl, this, var15, var17, var19);
      var21.m(true);
      var21.hS = var11;
      var21.b = var9;
      var21.hr = var13;
      this.hl.S(var21);
   }

   public void x(a var1, float var2) {
      this.B(0, var1);
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(var1 != net.yz.z.N && !(var1.v() instanceof net.a.z)) {
         if(this.i() > 0 && var1 != net.yz.z.s) {
            return false;
         } else {
            if(this.Kd()) {
               l var3 = var1.g();
               if(var3 instanceof o) {
                  return false;
               }
            }

            l var5 = var1.v();
            if(!(var5 instanceof r) && var5 instanceof a && ((a)var5).g() == this.g()) {
               return false;
            } else {
               if(this.wV <= 0) {
                  this.wV = 20;
               }

               for(int var4 = 0; var4 < this.wF.length; ++var4) {
                  this.wF[var4] += 3;
               }

               return super.H(var1, var2);
            }
         }
      } else {
         return false;
      }
   }

   protected void J(boolean var1, int var2) {
      net.nm.i var3 = this.S(net.nb.j.WG, 1);
      var3.S();
   }

   protected void b() {
      this.AP = 0;
   }

   public int L() {
      return 15728880;
   }

   public void v(float var1, float var2) {
   }

   public void o(net.n_.i var1) {
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(300.0D);
      this.t(net.ne.d.G).t(0.6000000238418579D);
      this.t(net.ne.d.L).t(40.0D);
      this.t(net.ne.d.g).t(4.0D);
   }

   public float i(int var1) {
      return this.ws[var1];
   }

   public float v(int var1) {
      return this.w5[var1];
   }

   public int i() {
      return ((Integer)this.G.a(wY)).intValue();
   }

   public void o(int var1) {
      this.G.d(wY, Integer.valueOf(var1));
   }

   public int Q(int var1) {
      return ((Integer)this.G.a(wh[var1])).intValue();
   }

   public void q(int var1, int var2) {
      this.G.d(wh[var1], Integer.valueOf(var2));
   }

   public boolean Kd() {
      return this.h() <= this.w() / 2.0F;
   }

   public u g() {
      return u.UNDEAD;
   }

   protected boolean P(l var1) {
      return false;
   }

   public boolean S() {
      return false;
   }

   public void c(boolean var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }

   class x extends b {
      public x() {
         this.h(7);
      }

      public boolean f() {
         boolean var1 = r.D();
         return z.this.i() > 0;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
