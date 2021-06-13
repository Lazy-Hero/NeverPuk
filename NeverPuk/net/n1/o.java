package net.n1;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.k.n;
import net.k.v;
import net.n0.ks;
import net.n2.k;
import net.ne.bl;
import net.no.i1;
import net.r.h;
import net.u.d;
import net.u.e;
import net.yv.r;
import net.yz.ai;
import net.yz.m_;

public abstract class o extends net.ne.l implements bl {
   private static final Predicate kb = Predicates.and(new Predicate[]{net.yz.q.n, net.yz.q.Y, new Predicate() {
      public boolean w(@Nullable net.ne.l var1) {
         return var1.w();
      }
   }});
   private static final v kZ = n.q(o.class, net.k.y.g);
   private int kP;
   private int kU;
   private int kE;
   private net.y9.l kY;
   private int k3;
   protected boolean k_;
   protected int k9;
   public o.s kc;
   public int kB;
   public net.ne.l kx;
   private int kj;
   private int kI;
   private double kM;
   private int kR;

   public o(r var1) {
      super(var1);
      this.kP = -1;
      this.kU = -1;
      this.kE = -1;
      this.kc = o.s.DISALLOWED;
      this.kM = 2.0D;
      this.S(0.5F, 0.5F);
   }

   public o(r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
   }

   public o(r var1, net.ne.a var2) {
      this(var1, var2.b, var2.hS + (double)var2.A() - 0.10000000149011612D, var2.hr);
      this.kx = var2;
      if(var2 instanceof net.r.r) {
         this.kc = o.s.ALLOWED;
      }

   }

   public boolean p(double var1) {
      double var3 = this.i().O() * 10.0D;
      if(Double.isNaN(var3)) {
         var3 = 1.0D;
      }

      var3 = var3 * 64.0D * v();
      return var1 < var3 * var3;
   }

   protected void g() {
      this.G.r(kZ, Byte.valueOf((byte)0));
   }

   public void x(net.ne.l var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = -net.u.t.A(var3 * 0.017453292F) * net.u.t.m(var2 * 0.017453292F);
      float var8 = -net.u.t.A(var2 * 0.017453292F);
      float var9 = net.u.t.m(var3 * 0.017453292F) * net.u.t.m(var2 * 0.017453292F);
      this.w((double)var7, (double)var8, (double)var9, var5, var6);
      this.hf += var1.hf;
      this.J += var1.J;
      if(!var1.k) {
         this.K += var1.K;
      }

   }

   public void w(double var1, double var3, double var5, float var7, float var8) {
      float var9 = net.u.t.R(var1 * var1 + var3 * var3 + var5 * var5);
      var1 = var1 / (double)var9;
      var3 = var3 / (double)var9;
      var5 = var5 / (double)var9;
      var1 = var1 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 = var3 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 = var5 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 = var1 * (double)var7;
      var3 = var3 * (double)var7;
      var5 = var5 * (double)var7;
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      float var10 = net.u.t.R(var1 * var1 + var5 * var5);
      this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(var3, (double)var10) * 57.29577951308232D);
      this.hq = this.hN;
      this.d = this.V;
      this.kj = 0;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.t(var1, var3, var5);
      this.r(var7, var8);
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      if(this.d == 0.0F && this.hq == 0.0F) {
         float var7 = net.u.t.R(var1 * var1 + var5 * var5);
         this.V = (float)(net.u.t.V(var3, (double)var7) * 57.29577951308232D);
         this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
         this.d = this.V;
         this.hq = this.hN;
         this.S(this.b, this.hS, this.hr, this.hN, this.V);
         this.kj = 0;
      }

   }

   public void A() {
      o.s.m;
      super.A();
      if(Float.compare(this.d, 0.0F) == 0 && this.hq == 0.0F) {
         float var2 = net.u.t.R(this.hf * this.hf + this.J * this.J);
         this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
         this.V = (float)(net.u.t.V(this.K, (double)var2) * 57.29577951308232D);
         this.hq = this.hN;
         this.d = this.V;
      }

      net.u.j var14 = new net.u.j(this.kP, this.kU, this.kE);
      net.yw.n var3 = this.hl.Z(var14);
      net.y9.l var4 = var3.Q();
      if(var3.n() != net.y1.l.q) {
         e var5 = var3.D(this.hl, var14);
         if(var5 != net.y9.l.q && var5.c(var14).R(new net.u.r(this.b, this.hS, this.hr))) {
            this.k_ = true;
         }
      }

      if(this.kB > 0) {
         --this.kB;
      }

      if(this.k_) {
         int var15 = var4.d(var3);
         if((var4 != this.kY || var15 != this.k3) && !this.hl.v(this.i().x(0.05D))) {
            this.k_ = false;
            this.hf *= (double)(this.p.nextFloat() * 0.2F);
            this.K *= (double)(this.p.nextFloat() * 0.2F);
            this.J *= (double)(this.p.nextFloat() * 0.2F);
            this.kj = 0;
            this.kI = 0;
         }

         ++this.kj;
         if(this.kj >= 1200) {
            this.B();
         }

         ++this.k9;
      }

      this.k9 = 0;
      ++this.kI;
      net.u.r var16 = new net.u.r(this.b, this.hS, this.hr);
      net.u.r var6 = new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      net.u.m var7 = this.hl.s(var16, var6, false, true, false);
      var16 = new net.u.r(this.b, this.hS, this.hr);
      new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      var6 = new net.u.r(var7.z.p, var7.z.H, var7.z.a);
      net.ne.l var8 = this.W(var16, var6);
      var7 = new net.u.m(var8);
      if(var7 != null && var7.e instanceof net.r.r) {
         net.r.r var9 = (net.r.r)var7.e;
         if(this.kx instanceof net.r.r && !((net.r.r)this.kx).A(var9)) {
            var7 = null;
         }
      }

      if(var7 != null) {
         this.r(var7);
      }

      if(this.E()) {
         int var20 = 0;
         this.hl.n(ai.CRIT, this.b + this.hf * (double)var20 / 4.0D, this.hS + this.K * (double)var20 / 4.0D, this.hr + this.J * (double)var20 / 4.0D, -this.hf, -this.K + 0.2D, -this.J, new int[0]);
         ++var20;
      }

      this.b += this.hf;
      this.hS += this.K;
      this.hr += this.J;
      float var22 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var22) * 57.29577951308232D);
      if(this.V - this.d < -180.0F) {
         this.d -= 360.0F;
      }

      if(this.V - this.d >= 180.0F) {
         this.d += 360.0F;
      }

      if(this.hN - this.hq < -180.0F) {
         this.hq -= 360.0F;
      }

      if(this.hN - this.hq >= 180.0F) {
         this.hq += 360.0F;
      }

      this.V = this.d + (this.V - this.d) * 0.2F;
      this.hN = this.hq + (this.hN - this.hq) * 0.2F;
      float var10 = 0.99F;
      float var10000 = 0.05F;
      if(this.p()) {
         int var12 = 0;
         var10000 = 0.25F;
         this.hl.n(ai.WATER_BUBBLE, this.b - this.hf * 0.25D, this.hS - this.K * 0.25D, this.hr - this.J * 0.25D, this.hf, this.K, this.J, new int[0]);
         ++var12;
         var10 = 0.6F;
      }

      if(this.J()) {
         this.e();
      }

      this.hf *= (double)var10;
      this.K *= (double)var10;
      this.J *= (double)var10;
      if(!this.j()) {
         this.K -= 0.05000000074505806D;
      }

      this.t(this.b, this.hS, this.hr);
      this.P();
      if(d.y() == null) {
         o.s.m = "kftoob";
      }

   }

   protected void r(net.u.m var1) {
      net.ne.l var2 = var1.e;
      float var3 = net.u.t.R(this.hf * this.hf + this.K * this.K + this.J * this.J);
      int var4 = net.u.t.o((double)var3 * this.kM);
      if(this.E()) {
         var4 += this.p.nextInt(var4 / 2 + 2);
      }

      net.yz.z var5;
      if(this.kx == null) {
         var5 = net.yz.z.k(this, this);
      } else {
         var5 = net.yz.z.k(this, this.kx);
      }

      if(this.a() && !(var2 instanceof net.nk.u)) {
         var2.n(5);
      }

      if(var2.H(var5, (float)var4)) {
         if(var2 instanceof net.ne.a) {
            net.ne.a var6 = (net.ne.a)var2;
            if(!this.hl.x) {
               var6.s(var6.T() + 1);
            }

            if(this.kR > 0) {
               float var7 = net.u.t.R(this.hf * this.hf + this.J * this.J);
               if(var7 > 0.0F) {
                  var6.u(this.hf * (double)this.kR * 0.6000000238418579D / (double)var7, 0.1D, this.J * (double)this.kR * 0.6000000238418579D / (double)var7);
               }
            }

            if(this.kx instanceof net.ne.a) {
               net.c1.y.f(var6, this.kx);
               net.c1.y.Z((net.ne.a)this.kx, var6);
            }

            this.d(var6);
            if(this.kx != null && var6 != this.kx && var6 instanceof net.r.r && this.kx instanceof h) {
               ((h)this.kx).t1.h((k)(new i1(6, 0.0F)));
            }
         }

         this.I(net.nb.l.e, 1.0F, 1.2F / (this.p.nextFloat() * 0.2F + 0.9F));
         if(!(var2 instanceof net.nk.u)) {
            this.B();
         }
      } else {
         this.hf *= -0.10000000149011612D;
         this.K *= -0.10000000149011612D;
         this.J *= -0.10000000149011612D;
         this.hN += 180.0F;
         this.hq += 180.0F;
         this.kI = 0;
         if(!this.hl.x && this.hf * this.hf + this.K * this.K + this.J * this.J < 0.0010000000474974513D) {
            if(this.kc == o.s.ALLOWED) {
               this.O(this.C(), 0.1F);
            }

            this.B();
         }
      }

   }

   public void N(net.ne.f var1, double var2, double var4, double var6) {
      super.N(var1, var2, var4, var6);
      if(this.k_) {
         this.kP = net.u.t.L(this.b);
         this.kU = net.u.t.L(this.hS);
         this.kE = net.u.t.L(this.hr);
      }

   }

   protected void d(net.ne.a var1) {
   }

   @Nullable
   protected net.ne.l W(net.u.r var1, net.u.r var2) {
      net.ne.l var3 = null;
      List var4 = this.hl.S(this, this.i().T(this.hf, this.K, this.J).x(1.0D), kb);
      double var5 = 0.0D;

      for(int var7 = 0; var7 < var4.size(); ++var7) {
         net.ne.l var8 = (net.ne.l)var4.get(var7);
         if(var8 != this.kx || this.kI >= 5) {
            e var9 = var8.i().x(0.30000001192092896D);
            net.u.m var10 = var9.G(var1, var2);
            double var11 = var1.Y(var10.z);
            if(var11 >= var5) {
               double var13;
               int var10000 = (var13 = var5 - 0.0D) == 0.0D?0:(var13 < 0.0D?-1:1);
            }

            var3 = var8;
            var5 = var11;
         }
      }

      return var3;
   }

   public static void w(net.c0.d var0, String var1) {
   }

   public static void I(net.c0.d var0) {
      w(var0, "Arrow");
   }

   public void I(net.nj.f var1) {
      var1.r("xTile", this.kP);
      var1.r("yTile", this.kU);
      var1.r("zTile", this.kE);
      var1.h("life", (short)this.kj);
      m_ var2 = (m_)net.y9.l.m.t(this.kY);
      var1.b("inTile", "");
      var1.D("inData", (byte)this.k3);
      var1.D("shake", (byte)this.kB);
      var1.D("inGround", (byte)(this.k_?1:0));
      var1.D("pickup", (byte)this.kc.ordinal());
      var1.a("damage", this.kM);
      var1.c("crit", this.E());
   }

   public void o(net.nj.f var1) {
      this.kP = var1.P("xTile");
      this.kU = var1.P("yTile");
      this.kE = var1.P("zTile");
      this.kj = var1.E("life");
      if(var1.K("inTile", 8)) {
         this.kY = net.y9.l.d(var1.J("inTile"));
      } else {
         this.kY = net.y9.l.I(var1.R("inTile") & 255);
      }

      this.k3 = var1.R("inData") & 255;
      this.kB = var1.R("shake") & 255;
      this.k_ = var1.R("inGround") == 1;
      if(var1.K("damage", 99)) {
         this.kM = var1.g("damage");
      }

      if(var1.K("pickup", 99)) {
         this.kc = o.s.C(var1.R("pickup"));
      } else if(var1.K("player", 99)) {
         this.kc = var1.i("player")?o.s.ALLOWED:o.s.DISALLOWED;
      }

      this.f(var1.i("crit"));
   }

   public void H(net.r.r var1) {
      if(!this.hl.x && this.k_ && this.kB <= 0) {
         if(this.kc != o.s.ALLOWED && (this.kc != o.s.CREATIVE_ONLY || !var1.a6.V)) {
            boolean var3 = false;
         } else {
            boolean var10000 = true;
         }

         if(this.kc == o.s.ALLOWED && !var1.a8.D(this.C())) {
            boolean var2 = false;
         }

         var1.U(this, 1);
         this.B();
      }

   }

   protected abstract ks C();

   protected boolean k() {
      return false;
   }

   public void k(double var1) {
      this.kM = var1;
   }

   public double i() {
      return this.kM;
   }

   public void c(int var1) {
      this.kR = var1;
   }

   public boolean C() {
      return false;
   }

   public float A() {
      return 0.0F;
   }

   public void f(boolean var1) {
      byte var2 = ((Byte)this.G.a(kZ)).byteValue();
      this.G.d(kZ, Byte.valueOf((byte)(var2 | 1)));
   }

   public boolean E() {
      byte var1 = ((Byte)this.G.a(kZ)).byteValue();
      return (var1 & 1) != 0;
   }

   public void s(net.ne.a var1, float var2) {
      int var3 = net.c1.y.g(net.nb.u.E, var1);
      int var4 = net.c1.y.g(net.nb.u.w, var1);
      this.k((double)(var2 * 2.0F) + this.p.nextGaussian() * 0.25D + (double)((float)this.hl.k().L() * 0.11F));
      this.k(this.i() + (double)var3 * 0.5D + 0.5D);
      this.c(var4);
      if(net.c1.y.g(net.nb.u.G, var1) > 0) {
         this.n(100);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum s {
      DISALLOWED,
      ALLOWED,
      CREATIVE_ONLY;

      private static String m;

      public static o.s C(int var0) {
         String var1 = H();
         if(var0 < 0 || var0 > values().length) {
            var0 = 0;
         }

         return values()[var0];
      }

      static {
         Y("KNQ3ac");
      }

      public static void Y(String var0) {
         m = var0;
      }

      public static String H() {
         return m;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
