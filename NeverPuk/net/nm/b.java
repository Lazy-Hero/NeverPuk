package net.nm;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.n0.ks;
import net.nm.w;
import net.y9.g5;
import net.y9.gc;
import net.yz.aq;

public class b extends net.ne.l {
   private static final net.k.v lb = net.k.n.q(b.class, y.d);
   private static final net.k.v lZ = net.k.n.q(b.class, y.d);
   private static final net.k.v lj = net.k.n.q(b.class, y.r);
   private static final net.k.v la = net.k.n.q(b.class, y.d);
   private static final net.k.v[] lJ = new net.k.v[]{net.k.n.q(b.class, y.f), net.k.n.q(b.class, y.f)};
   private final float[] lc;
   private float ln;
   private float lM;
   private float lo;
   private int l3;
   private double lx;
   private double lW;
   private double lR;
   private double lF;
   private double lU;
   private boolean lv;
   private boolean lu;
   private boolean l1;
   private boolean lX;
   private double lw;
   private float lt;
   private b.n le;
   private b.n lC;
   private double lD;

   public b(net.yv.r var1) {
      super(var1);
      this.lc = new float[2];
      this.a = true;
      this.S(1.375F, 0.5625F);
   }

   public b(net.yv.r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      this.h = var2;
      this.h6 = var4;
      this.l = var6;
   }

   protected boolean k() {
      return false;
   }

   protected void g() {
      this.G.r(lb, Integer.valueOf(0));
      this.G.r(lZ, Integer.valueOf(1));
      this.G.r(lj, Float.valueOf(0.0F));
      this.G.r(la, Integer.valueOf(b.k.OAK.ordinal()));

      for(net.k.v var4 : lJ) {
         this.G.r(var4, Boolean.valueOf(false));
      }

   }

   @Nullable
   public net.u.e a(net.ne.l var1) {
      return var1.b()?var1.i():null;
   }

   @Nullable
   public net.u.e F() {
      return this.i();
   }

   public boolean b() {
      return true;
   }

   public double e() {
      return -0.1D;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(!this.hl.x && !this.Z) {
         if(var1 instanceof net.yz.j && var1.v() != null && this.m(var1.v())) {
            return false;
         } else {
            this.L(-this.s());
            this.i(10);
            this.b(this.Z() + var2 * 10.0F);
            this.E();
            boolean var3 = var1.v() instanceof net.r.r && ((net.r.r)var1.v()).a6.V;
            if(this.Z() > 40.0F) {
               if(this.hl.N().b("doEntityDrops")) {
                  this.v(this.J(), 1, 0.0F);
               }

               this.B();
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public void W(net.ne.l var1) {
      if(var1 instanceof b) {
         if(var1.i().u < this.i().c) {
            super.W(var1);
         }
      } else if(var1.i().u <= this.i().u) {
         super.W(var1);
      }

   }

   public net.n0.y J() {
      switch(null.D[this.U().ordinal()]) {
      case 1:
      default:
         return net.nb.j.Yb;
      case 2:
         return net.nb.j.M;
      case 3:
         return net.nb.j.S;
      case 4:
         return net.nb.j.Yx;
      case 5:
         return net.nb.j.d;
      case 6:
         return net.nb.j.Wf;
      }
   }

   public void I() {
      this.L(-this.s());
      this.i(10);
      this.b(this.Z() * 11.0F);
   }

   public boolean w() {
      return !this.Z;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.lx = var1;
      this.lW = var3;
      this.lR = var5;
      this.lF = (double)var7;
      this.lU = (double)var8;
      this.l3 = 10;
   }

   public aq C() {
      return this.V().R();
   }

   public void A() {
      w.h.u();
      this.lC = this.le;
      this.le = this.b();
      if(this.le != b.n.UNDER_WATER && this.le != b.n.UNDER_FLOWING_WATER) {
         this.lM = 0.0F;
      }

      ++this.lM;
      if(!this.hl.x && Float.compare(this.lM, 60.0F) >= 0) {
         this.Y();
      }

      if(this.J() > 0) {
         this.i(this.J() - 1);
      }

      if(Float.compare(this.Z(), 0.0F) > 0) {
         this.b(this.Z() - 1.0F);
      }

      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      super.A();
      this.b();
      if(this.V()) {
         if(this.H().isEmpty() || !(this.H().get(0) instanceof net.r.r)) {
            this.D(false, false);
         }

         this.t();
         if(this.hl.x) {
            this.n();
            this.hl.Q(new net.m.u(this.G(0), this.G(1)));
         }

         this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      }

      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      int var2 = 0;
      if(this.G(var2)) {
         if(!this.c() && (double)(this.lc[var2] % 6.2831855F) <= 0.7853981633974483D && ((double)this.lc[var2] + 0.39269909262657166D) % 6.283185307179586D >= 0.7853981633974483D) {
            net.yz.a var3 = this.B();
            net.u.r var4 = this.r(1.0F);
            double var5 = var4.a;
            double var7 = -var4.p;
            this.hl.L((net.r.r)null, this.b + var5, this.hS, this.hr + var7, var3, this.E(), 1.0F, 0.8F + 0.4F * this.p.nextFloat());
         }

         this.lc[var2] = (float)((double)this.lc[var2] + 0.39269909262657166D);
      }

      this.lc[var2] = 0.0F;
      ++var2;
      this.P();
      List var10 = this.hl.S(this, this.i().f(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), net.yz.q.K(this));
      if(!var10.isEmpty()) {
         if(!this.hl.x && !(this.C() instanceof net.r.r)) {
            boolean var14 = true;
         } else {
            boolean var10000 = false;
         }

         int var11 = 0;
         if(var11 < var10.size()) {
            net.ne.l var13 = (net.ne.l)var10.get(var11);
            if(!var13.m(this)) {
               this.W(var13);
            }

            ++var11;
         }
      }

   }

   @Nullable
   protected net.yz.a B() {
      switch(null.n[this.b().ordinal()]) {
      case 1:
      case 2:
      case 3:
         return net.nb.l.HC;
      case 4:
         return net.nb.l.HH;
      case 5:
      default:
         return null;
      }
   }

   private void b() {
      if(this.l3 > 0 && !this.V()) {
         double var1 = this.b + (this.lx - this.b) / (double)this.l3;
         double var3 = this.hS + (this.lW - this.hS) / (double)this.l3;
         double var5 = this.hr + (this.lR - this.hr) / (double)this.l3;
         double var7 = net.u.t.p(this.lF - (double)this.hN);
         this.hN = (float)((double)this.hN + var7 / (double)this.l3);
         this.V = (float)((double)this.V + (this.lU - (double)this.V) / (double)this.l3);
         --this.l3;
         this.t(var1, var3, var5);
         this.r(this.hN, this.V);
      }

   }

   public void D(boolean var1, boolean var2) {
      this.G.d(lJ[0], Boolean.valueOf(var1));
      this.G.d(lJ[1], Boolean.valueOf(var2));
   }

   public float r(int var1, float var2) {
      return this.G(var1)?(float)net.u.t.z((double)this.lc[var1] - 0.39269909262657166D, (double)this.lc[var1], (double)var2):0.0F;
   }

   private b.n b() {
      b.n var1 = this.d();
      this.lw = this.i().c;
      return var1;
   }

   public float T() {
      net.u.e var1 = this.i();
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.o(var1.d);
      int var4 = net.u.t.L(var1.c);
      int var5 = net.u.t.o(var1.c - this.lD);
      int var6 = net.u.t.L(var1.N);
      int var7 = net.u.t.o(var1.r);
      net.u.j var8 = net.u.j.u();
      int var9 = var4;
      if(var4 >= var5) {
         float var15 = (float)(var5 + 1);
         var8.T();
         return var15;
      } else {
         float var10 = 0.0F;

         for(int var11 = var2; var11 < var3; ++var11) {
            for(int var12 = var6; var12 < var7; ++var12) {
               var8.c(var11, var9, var12);
               net.yw.n var13 = this.hl.Z(var8);
               if(var13.n() == net.y1.l.p) {
                  var10 = Math.max(var10, g5.H(var13, this.hl, var8));
               }

               float var18;
               int var10000 = (var18 = var10 - 1.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
            }
         }

         float var19;
         int var17 = (var19 = var10 - 1.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
         float var16 = (float)var8.h() + var10;
         var8.T();
         return var16;
      }
   }

   public float x() {
      net.u.e var1 = this.i();
      net.u.e var2 = new net.u.e(var1.n, var1.u - 0.001D, var1.N, var1.d, var1.u, var1.r);
      int var3 = net.u.t.L(var2.n) - 1;
      int var4 = net.u.t.o(var2.d) + 1;
      int var10000 = net.u.t.L(var2.u) - 1;
      var10000 = net.u.t.o(var2.c) + 1;
      int var7 = net.u.t.L(var2.N) - 1;
      int var8 = net.u.t.o(var2.r) + 1;
      Lists.newArrayList();
      float var10 = 0.0F;
      byte var11 = 0;
      net.u.j var12 = net.u.j.u();

      for(int var13 = var3; var13 < var4; ++var13) {
         for(int var14 = var7; var14 < var8; ++var14) {
            int var15 = (var13 != var3 && var13 != var4 - 1?0:1) + (var14 != var7 && var14 != var8 - 1?0:1);
         }
      }

      var12.T();
      return var10 / (float)var11;
   }

   private boolean l() {
      net.u.e var1 = this.i();
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.o(var1.d);
      int var4 = net.u.t.L(var1.u);
      int var5 = net.u.t.o(var1.u + 0.001D);
      int var6 = net.u.t.L(var1.N);
      int var7 = net.u.t.o(var1.r);
      boolean var8 = false;
      this.lw = Double.MIN_VALUE;
      net.u.j var9 = net.u.j.u();

      for(int var10 = var2; var10 < var3; ++var10) {
         for(int var11 = var4; var11 < var5; ++var11) {
            for(int var12 = var6; var12 < var7; ++var12) {
               var9.c(var10, var11, var12);
               net.yw.n var13 = this.hl.Z(var9);
               if(var13.n() == net.y1.l.p) {
                  float var14 = g5.h(var13, this.hl, var9);
                  this.lw = Math.max((double)var14, this.lw);
                  var8 |= var1.u < (double)var14;
               }
            }
         }
      }

      var9.T();
      return var8;
   }

   @Nullable
   private b.n d() {
      net.u.e var1 = this.i();
      double var2 = var1.c + 0.001D;
      int var4 = net.u.t.L(var1.n);
      int var5 = net.u.t.o(var1.d);
      int var6 = net.u.t.L(var1.c);
      int var7 = net.u.t.o(var2);
      int var8 = net.u.t.L(var1.N);
      int var9 = net.u.t.o(var1.r);
      boolean var10 = false;
      net.u.j var11 = net.u.j.u();

      for(int var12 = var4; var12 < var5; ++var12) {
         for(int var13 = var6; var13 < var7; ++var13) {
            for(int var14 = var8; var14 < var9; ++var14) {
               var11.c(var12, var13, var14);
               net.yw.n var15 = this.hl.Z(var11);
               if(var15.n() == net.y1.l.p && var2 < (double)g5.h(var15, this.hl, var11)) {
                  if(((Integer)var15.i(g5.J)).intValue() != 0) {
                     b.n var16 = b.n.UNDER_FLOWING_WATER;
                     var11.T();
                     return var16;
                  }

                  var10 = true;
               }
            }
         }
      }

      var11.T();
      return b.n.UNDER_WATER;
   }

   private void t() {
      double var10000 = -0.03999999910593033D;
      double var3 = this.j()?0.0D:-0.03999999910593033D;
      double var5 = 0.0D;
      this.ln = 0.05F;
      if(this.lC == b.n.IN_AIR && this.le != b.n.IN_AIR && this.le != b.n.ON_LAND) {
         this.lw = this.i().u + (double)this.m;
         this.t(this.b, (double)(this.T() - this.m) + 0.101D, this.hr);
         this.K = 0.0D;
         this.lD = 0.0D;
         this.le = b.n.IN_WATER;
      } else {
         if(this.le == b.n.IN_WATER) {
            var5 = (this.lw - this.i().u) / (double)this.m;
            this.ln = 0.9F;
         } else if(this.le == b.n.UNDER_FLOWING_WATER) {
            var3 = -7.0E-4D;
            this.ln = 0.9F;
         } else if(this.le == b.n.UNDER_WATER) {
            var5 = 0.009999999776482582D;
            this.ln = 0.45F;
         } else if(this.le == b.n.IN_AIR) {
            this.ln = 0.9F;
         } else if(this.le == b.n.ON_LAND) {
            this.ln = this.lt;
            if(this.C() instanceof net.r.r) {
               this.lt /= 2.0F;
            }
         }

         this.hf *= (double)this.ln;
         this.J *= (double)this.ln;
         this.lo *= this.ln;
         this.K += var3;
         double var12;
         int var11 = (var12 = var5 - 0.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
      }

   }

   private void n() {
      if(this.t()) {
         float var1 = 0.0F;
         if(this.lv) {
            this.lo += -1.0F;
         }

         if(this.lu) {
            ++this.lo;
         }

         if(this.lu != this.lv && !this.l1 && !this.lX) {
            var1 += 0.005F;
         }

         this.hN += this.lo;
         if(this.l1) {
            var1 += 0.04F;
         }

         if(this.lX) {
            var1 -= 0.005F;
         }

         this.hf += (double)(net.u.t.A(-this.hN * 0.017453292F) * var1);
         this.J += (double)(net.u.t.m(this.hN * 0.017453292F) * var1);
         this.D(this.lu && !this.lv || this.l1, this.lv && !this.lu || this.l1);
      }

   }

   public void F(net.ne.l var1) {
      if(this.m(var1)) {
         float var2 = 0.0F;
         float var3 = (float)((this.Z?0.009999999776482582D:this.e()) + var1.O());
         if(this.H().size() > 1) {
            int var4 = this.H().indexOf(var1);
            var2 = 0.2F;
            if(var1 instanceof net.yn.w) {
               var2 = (float)((double)var2 + 0.2D);
            }
         }

         net.u.r var6 = (new net.u.r((double)var2, 0.0D, 0.0D)).T(-this.hN * 0.017453292F - 1.5707964F);
         var1.t(this.b + var6.p, this.hS + (double)var3, this.hr + var6.a);
         var1.hN += this.lo;
         var1.A(var1.X() + this.lo);
         this.z(var1);
         if(var1 instanceof net.yn.w && this.H().size() > 1) {
            int var5 = var1.G() % 2 == 0?90:270;
            var1.X(((net.yn.w)var1).AK + (float)var5);
            var1.A(var1.X() + (float)var5);
         }
      }

   }

   protected void z(net.ne.l var1) {
      var1.X(this.hN);
      float var2 = net.u.t.k(var1.hN - this.hN);
      float var3 = net.u.t.T(var2, -105.0F, 105.0F);
      var1.hq += var3 - var2;
      var1.hN += var3 - var2;
      var1.A(var1.hN);
   }

   public void k(net.ne.l var1) {
      this.z(var1);
   }

   protected void I(net.nj.f var1) {
      var1.b("Type", this.U().P());
   }

   protected void o(net.nj.f var1) {
      if(var1.K("Type", 8)) {
         this.e(b.k.g(var1.J("Type")));
      }

   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      if(var1.Q()) {
         return false;
      } else {
         if(!this.hl.x && this.lM < 60.0F) {
            var1.W(this);
         }

         return true;
      }
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
      this.lD = this.K;
      if(!this.M()) {
         if(this.hI > 3.0F) {
            if(this.le != b.n.ON_LAND) {
               this.hI = 0.0F;
               return;
            }

            this.v(this.hI, 1.0F);
            if(!this.hl.x && !this.Z) {
               this.B();
               if(this.hl.N().b("doEntityDrops")) {
                  int var6 = 0;

                  while(true) {
                     this.O(new ks(net.n0.y.q(net.nb.f.oN), 1, this.U().T()), 0.0F);
                     ++var6;
                  }
               }
            }
         }

         this.hI = 0.0F;
      }

   }

   public boolean G(int var1) {
      return ((Boolean)this.G.a(lJ[var1])).booleanValue() && this.C() != null;
   }

   public void b(float var1) {
      this.G.d(lj, Float.valueOf(var1));
   }

   public float Z() {
      return ((Float)this.G.a(lj)).floatValue();
   }

   public void i(int var1) {
      this.G.d(lb, Integer.valueOf(var1));
   }

   public int J() {
      return ((Integer)this.G.a(lb)).intValue();
   }

   public void L(int var1) {
      this.G.d(lZ, Integer.valueOf(var1));
   }

   public int s() {
      return ((Integer)this.G.a(lZ)).intValue();
   }

   public void e(b.k var1) {
      this.G.d(la, Integer.valueOf(var1.ordinal()));
   }

   public b.k U() {
      return b.k.N(((Integer)this.G.a(la)).intValue());
   }

   protected boolean C(net.ne.l var1) {
      return this.H().size() < 2;
   }

   @Nullable
   public net.ne.l C() {
      List var1 = this.H();
      return var1.isEmpty()?null:(net.ne.l)var1.get(0);
   }

   public void U(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.lv = var1;
      this.lu = var2;
      this.l1 = var3;
      this.lX = var4;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum k {
      OAK(gc.i.OAK.B(), "oak"),
      SPRUCE(gc.i.SPRUCE.B(), "spruce"),
      BIRCH(gc.i.BIRCH.B(), "birch"),
      JUNGLE(gc.i.JUNGLE.B(), "jungle"),
      ACACIA(gc.i.ACACIA.B(), "acacia"),
      DARK_OAK(gc.i.DARK_OAK.B(), "dark_oak");

      private final String C;
      private final int w;

      private k(int var3, String var4) {
         this.C = var4;
         this.w = var3;
      }

      public String P() {
         return this.C;
      }

      public int T() {
         return this.w;
      }

      public String toString() {
         return this.C;
      }

      public static b.k N(int var0) {
         if(var0 >= values().length) {
            var0 = 0;
         }

         return values()[var0];
      }

      public static b.k g(String var0) {
         w.h.s();
         int var2 = 0;
         if(var2 < values().length) {
            if(values()[var2].P().equals(var0)) {
               return values()[var2];
            }

            ++var2;
         }

         return values()[0];
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum n {
      IN_WATER,
      UNDER_WATER,
      UNDER_FLOWING_WATER,
      ON_LAND,
      IN_AIR;
   }
}
