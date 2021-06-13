package net.nk;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.i;
import net.nk.n;
import net.nk.y;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.ai;
import net.yz.m_;

public class u extends i {
   private static final UUID Lk = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final net.s.k L5 = (new net.s.k(Lk, "Attacking speed boost", 0.15000000596046448D, 0)).A(false);
   private static final Set LZ = Sets.newIdentityHashSet();
   private static final net.k.v Lg = net.k.n.q(u.class, net.k.y.m);
   private static final net.k.v Lu = net.k.n.q(u.class, net.k.y.f);
   private int LH;
   private int LU;

   public u(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 2.9F);
      this.ha = 1.0F;
      this.v(net.b.m.WATER, -1.0F);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(2, new net.y_.k(this, 1.0D, false));
      this.p_.X(7, new ow(this, 1.0D, 0.0F));
      this.p_.X(8, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(8, new oa(this));
      this.p_.X(10, new u.f(this));
      this.p_.X(11, new u.v(this));
      this.pM.X(1, new u.x(this));
      this.pM.X(2, new oo(this, false, new Class[0]));
      this.pM.X(3, new o8(this, y.class, 10, true, false, new Predicate() {
         public boolean F(@Nullable y var1) {
            return var1.wf();
         }
      }));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(40.0D);
      this.t(net.ne.d.G).t(0.30000001192092896D);
      this.t(net.ne.d.S).t(7.0D);
      this.t(net.ne.d.L).t(64.0D);
   }

   public void C(@Nullable net.ne.a var1) {
      super.C(var1);
      net.s.i var2 = this.t(net.ne.d.G);
      this.LU = 0;
      this.G.d(Lu, Boolean.valueOf(false));
      var2.n(L5);
   }

   protected void g() {
      super.g();
      this.G.r(Lg, Optional.absent());
      this.G.r(Lu, Boolean.valueOf(false));
   }

   public void H() {
      if(this.x >= this.LH + 400) {
         this.LH = this.x;
         if(!this.c()) {
            this.hl.m(this.b, this.hS + (double)this.A(), this.hr, net.nb.l.KN, this.E(), 2.5F, 1.0F, false);
         }
      }

   }

   public void O(net.k.v var1) {
      if(Lu.equals(var1) && this.xp() && this.hl.x) {
         this.H();
      }

      super.O(var1);
   }

   public static void v(net.c0.d var0) {
      net.ne.y.J(var0, u.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      net.yw.n var2 = this.S();
      var1.h("carried", (short)net.y9.l.h(var2.Q()));
      var1.h("carriedData", (short)var2.Q().d(var2));
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      net.yw.n var2;
      if(var1.K("carried", 8)) {
         var2 = net.y9.l.d(var1.J("carried")).D(var1.E("carriedData") & '\uffff');
      } else {
         var2 = net.y9.l.I(var1.E("carried")).D(var1.E("carriedData") & '\uffff');
      }

      if(var2.Q() == null || var2.n() == net.y1.l.q) {
         var2 = null;
      }

      this.Y(var2);
   }

   private boolean k(net.r.r var1) {
      ks var2 = (ks)var1.a8.P.get(3);
      if(var2.Z() == net.n0.y.q(net.nb.f.TS)) {
         return false;
      } else {
         net.u.r var3 = var1.r(1.0F).I();
         net.u.r var4 = new net.u.r(this.b - var1.b, this.i().u + (double)this.A() - (var1.hS + (double)var1.A()), this.hr - var1.hr);
         double var5 = var4.c();
         var4 = var4.I();
         double var7 = var3.d(var4);
         return var7 > 1.0D - 0.025D / var5 && var1.b(this);
      }
   }

   public float A() {
      return 2.55F;
   }

   public void d() {
      net.u.d[] var1 = n.o.y();
      if(this.hl.x) {
         int var2 = 0;
         this.hl.n(ai.PORTAL, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m - 0.25D, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, (this.p.nextDouble() - 0.5D) * 2.0D, -this.p.nextDouble(), (this.p.nextDouble() - 0.5D) * 2.0D, new int[0]);
         ++var2;
      }

      this.XL = false;
      super.d();
   }

   protected void T() {
      if(this.J()) {
         this.H(net.yz.z.N, 1.0F);
      }

      if(this.hl.u() && this.x >= this.LU + 600) {
         float var1 = this.d();
         if(var1 > 0.5F && this.hl.V(new net.u.j(this)) && this.p.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.C((net.ne.a)null);
            this.xy();
         }
      }

      super.T();
   }

   protected boolean xy() {
      double var1 = this.b + (this.p.nextDouble() - 0.5D) * 64.0D;
      double var3 = this.hS + (double)(this.p.nextInt(64) - 32);
      double var5 = this.hr + (this.p.nextDouble() - 0.5D) * 64.0D;
      return this.M(var1, var3, var5);
   }

   protected boolean l(net.ne.l var1) {
      net.u.r var2 = new net.u.r(this.b - var1.b, this.i().u + (double)(this.m / 2.0F) - var1.hS + (double)var1.A(), this.hr - var1.hr);
      var2 = var2.I();
      double var10000 = 16.0D;
      double var5 = this.b + (this.p.nextDouble() - 0.5D) * 8.0D - var2.p * 16.0D;
      double var7 = this.hS + (double)(this.p.nextInt(16) - 8) - var2.H * 16.0D;
      double var9 = this.hr + (this.p.nextDouble() - 0.5D) * 8.0D - var2.a * 16.0D;
      return this.M(var5, var7, var9);
   }

   private boolean M(double var1, double var3, double var5) {
      boolean var7 = this.W(var1, var3, var5);
      this.hl.L((net.r.r)null, this.h, this.h6, this.l, net.nb.l.C8, this.E(), 1.0F, 1.0F);
      this.I(net.nb.l.C8, 1.0F, 1.0F);
      return var7;
   }

   protected net.yz.a T() {
      return this.xp()?net.nb.l.MV:net.nb.l.W;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.oG;
   }

   protected net.yz.a r() {
      return net.nb.l.wg;
   }

   protected void n(boolean var1, int var2) {
      super.n(var1, var2);
      net.yw.n var3 = this.S();
      net.n0.y var4 = net.n0.y.q(var3.Q());
      int var5 = var4.I()?var3.Q().d(var3):0;
      this.O(new ks(var4, 1, var5), 0.0F);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.u;
   }

   public void Y(@Nullable net.yw.n var1) {
      this.G.d(Lg, Optional.fromNullable(var1));
   }

   @Nullable
   public net.yw.n S() {
      return (net.yw.n)((Optional)this.G.a(Lg)).orNull();
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(!(var1 instanceof net.yz.j)) {
         boolean var4 = super.H(var1, var2);
         if(var1.i() && this.p.nextInt(10) != 0) {
            this.xy();
         }

         return var4;
      } else {
         for(int var3 = 0; !this.xy(); ++var3) {
            ;
         }

         return true;
      }
   }

   public boolean xp() {
      return ((Boolean)this.G.a(Lu)).booleanValue();
   }

   static {
      LZ.add(net.nb.f.p);
      LZ.add(net.nb.f.dl);
      LZ.add(net.nb.f.TF);
      LZ.add(net.nb.f.D);
      LZ.add(net.nb.f.dO);
      LZ.add(net.nb.f.d2);
      LZ.add(net.nb.f.df);
      LZ.add(net.nb.f.T);
      LZ.add(net.nb.f.T7);
      LZ.add(net.nb.f.dW);
      LZ.add(net.nb.f.uz);
      LZ.add(net.nb.f.TS);
      LZ.add(net.nb.f.dm);
      LZ.add(net.nb.f.u2);
      LZ.add(net.nb.f.R);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class f extends net.y_.b {
      private final u U;

      public f(u var1) {
         this.U = var1;
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return this.U.S() == null?false:(!this.U.hl.N().b("mobGriefing")?false:this.U.Q().nextInt(2000) == 0);
      }

      public void E() {
         Random var2 = this.U.Q();
         net.yv.r var3 = this.U.hl;
         int var4 = net.u.t.L(this.U.b - 1.0D + var2.nextDouble() * 2.0D);
         n.o.y();
         int var5 = net.u.t.L(this.U.hS + var2.nextDouble() * 2.0D);
         int var6 = net.u.t.L(this.U.hr - 1.0D + var2.nextDouble() * 2.0D);
         net.u.j var7 = new net.u.j(var4, var5, var6);
         net.yw.n var8 = var3.Z(var7);
         net.yw.n var9 = var3.Z(var7.b());
         net.yw.n var10 = this.U.S();
         if(this.R(var3, var7, var10.Q(), var8, var9)) {
            var3.k(var7, var10, 3);
            this.U.Y((net.yw.n)null);
         }

      }

      private boolean R(net.yv.r var1, net.u.j var2, net.y9.l var3, net.yw.n var4, net.yw.n var5) {
         return !var3.J(var1, var2)?false:(var4.n() != net.y1.l.q?false:(var5.n() == net.y1.l.q?false:var5.O()));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class v extends net.y_.b {
      private final u T;

      public v(u var1) {
         this.T = var1;
      }

      public boolean f() {
         return this.T.S() != null?false:(!this.T.hl.N().b("mobGriefing")?false:this.T.Q().nextInt(20) == 0);
      }

      public void E() {
         Random var2 = this.T.Q();
         net.yv.r var3 = this.T.hl;
         n.o.y();
         int var4 = net.u.t.L(this.T.b - 2.0D + var2.nextDouble() * 4.0D);
         int var5 = net.u.t.L(this.T.hS + var2.nextDouble() * 3.0D);
         int var6 = net.u.t.L(this.T.hr - 2.0D + var2.nextDouble() * 4.0D);
         net.u.j var7 = new net.u.j(var4, var5, var6);
         net.yw.n var8 = var3.Z(var7);
         net.y9.l var9 = var8.Q();
         net.u.m var10 = var3.s(new net.u.r((double)((float)net.u.t.L(this.T.b) + 0.5F), (double)((float)var5 + 0.5F), (double)((float)net.u.t.L(this.T.hr) + 0.5F)), new net.u.r((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F)), false, true, false);
         if(var10 != null && var10.j().equals(var7)) {
            boolean var12 = true;
         } else {
            boolean var10000 = false;
         }

         if(u.LZ.contains(var9)) {
            ;
         }

         if(net.u.d.y() == null) {
            n.o.I(new net.u.d[5]);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class x extends o8 {
      private final u i;
      private net.r.r F;
      private int p;
      private int G;

      public x(u var1) {
         super(var1, net.r.r.class, false);
         this.i = var1;
      }

      public boolean f() {
         double var1 = this.h();
         this.F = this.i.hl.m(this.i.b, this.i.hS, this.i.hr, var1, var1, (Function)null, new Predicate() {
            public boolean X(@Nullable net.r.r var1) {
               net.u.d[] var2 = n.o.y();
               return x.this.i.k(var1);
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
         return this.F != null;
      }

      public void I() {
         this.p = 5;
         this.G = 0;
      }

      public void C() {
         this.F = null;
         super.C();
      }

      public boolean X() {
         if(this.F != null) {
            if(!this.i.k(this.F)) {
               return false;
            } else {
               this.i.S(this.F, 10.0F, 10.0F);
               return true;
            }
         } else {
            return this.T != null && ((net.r.r)this.T).P() || super.X();
         }
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(this.F != null) {
            if(--this.p > 0) {
               return;
            }

            this.T = this.F;
            this.F = null;
            super.I();
         }

         if(this.T != null) {
            if(this.i.k((net.r.r)this.T)) {
               if(((net.r.r)this.T).F(this.i) < 16.0D) {
                  this.i.xy();
               }

               this.G = 0;
            }

            if(((net.r.r)this.T).F(this.i) > 256.0D && this.G++ >= 30 && this.i.l(this.T)) {
               this.G = 0;
            }
         }

         super.E();
      }

      private static xn d(xn var0) {
         return var0;
      }
   }
}
