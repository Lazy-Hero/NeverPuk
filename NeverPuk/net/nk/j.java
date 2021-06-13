package net.nk;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.kw;
import net.nk.d;
import net.nk.fc;
import net.nk.n;
import net.y9.ra;
import net.y9.rj;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.yz.aq;
import net.yz.m_;

public class j extends d implements fc {
   private static final UUID ls = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final net.s.k lv = (new net.s.k(ls, "Covered armor bonus", 20.0D, 0)).A(false);
   protected static final net.k.v lF = net.k.n.q(j.class, net.k.y.P);
   protected static final net.k.v lW = net.k.n.q(j.class, net.k.y.I);
   protected static final net.k.v lB = net.k.n.q(j.class, net.k.y.g);
   protected static final net.k.v lx = net.k.n.q(j.class, net.k.y.g);
   public static final kw lI = kw.PURPLE;
   private float lk;
   private float lZ;
   private net.u.j lG;
   private int l_;

   public j(net.yv.r var1) {
      super(var1);
      this.S(1.0F, 1.0F);
      this.Az = 180.0F;
      this.AK = 180.0F;
      this.hw = true;
      this.lG = null;
      this.p0 = 5;
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      this.AK = 180.0F;
      this.Az = 180.0F;
      this.hN = 180.0F;
      this.hq = 180.0F;
      this.A3 = 180.0F;
      this.AH = 180.0F;
      return super.t(var1, var2);
   }

   protected void D() {
      this.p_.X(1, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(4, new j.o());
      this.p_.X(7, new j.n());
      this.p_.X(8, new oa(this));
      this.pM.X(1, new oo(this, true, new Class[0]));
      this.pM.X(2, new j.c(this));
      this.pM.X(3, new j.h(this));
   }

   protected boolean k() {
      return false;
   }

   public net.yz.p E() {
      return net.yz.p.HOSTILE;
   }

   protected net.yz.a T() {
      return net.nb.l.oj;
   }

   public void m() {
      if(!this.D()) {
         super.m();
      }

   }

   protected net.yz.a r() {
      return net.nb.l.DN;
   }

   protected net.yz.a m(net.yz.z var1) {
      return this.D()?net.nb.l.CG:net.nb.l.HX;
   }

   protected void g() {
      super.g();
      this.G.r(lF, aq.DOWN);
      this.G.r(lW, Optional.absent());
      this.G.r(lB, Byte.valueOf((byte)0));
      this.G.r(lx, Byte.valueOf((byte)lI.d()));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(30.0D);
   }

   protected net.ne.z a() {
      return new j.v(this);
   }

   public static void E(net.c0.d var0) {
      net.ne.y.J(var0, j.class);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.G.d(lF, aq.l(var1.R("AttachFace")));
      this.G.d(lB, Byte.valueOf(var1.R("Peek")));
      this.G.d(lx, Byte.valueOf(var1.R("Color")));
      if(var1.G("APX")) {
         int var2 = var1.P("APX");
         int var3 = var1.P("APY");
         int var4 = var1.P("APZ");
         this.G.d(lW, Optional.of(new net.u.j(var2, var3, var4)));
      } else {
         this.G.d(lW, Optional.absent());
      }

   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.D("AttachFace", (byte)((aq)this.G.a(lF)).w());
      var1.D("Peek", ((Byte)this.G.a(lB)).byteValue());
      var1.D("Color", ((Byte)this.G.a(lx)).byteValue());
      net.u.j var2 = this.G();
      var1.r("APX", var2.t());
      var1.r("APY", var2.h());
      var1.r("APZ", var2.y());
   }

   public void A() {
      super.A();
      n.o.y();
      net.u.j var2 = (net.u.j)((Optional)this.G.a(lW)).orNull();
      if(!this.hl.x) {
         var2 = new net.u.j(this);
         this.G.d(lW, Optional.of(var2));
      }

      if(this.M()) {
         var2 = null;
         float var3 = this.D().hN;
         this.hN = var3;
         this.AK = var3;
         this.Az = var3;
         this.l_ = 0;
      } else if(!this.hl.x) {
         net.yw.n var20 = this.hl.Z(var2);
         if(var20.n() != net.y1.l.q) {
            if(var20.Q() == net.nb.f.dK) {
               aq var4 = (aq)var20.i(ra.n);
               if(this.hl.y(var2.C(var4))) {
                  var2 = var2.C(var4);
                  this.G.d(lW, Optional.of(var2));
               }

               this.Hw();
            }

            if(var20.Q() == net.nb.f.dZ) {
               aq var22 = (aq)var20.i(rj.n);
               if(this.hl.y(var2.C(var22))) {
                  var2 = var2.C(var22);
                  this.G.d(lW, Optional.of(var2));
               }

               this.Hw();
            }

            this.Hw();
         }

         net.u.j var23 = var2.C(this.z());
         if(!this.hl.E(var23, false)) {
            boolean var5 = false;
            aq[] var6 = aq.values();
            int var7 = var6.length;
            int var8 = 0;
            if(var8 < var7) {
               aq var9 = var6[var8];
               var23 = var2.C(var9);
               if(this.hl.E(var23, false)) {
                  this.G.d(lF, var9);
                  var5 = true;
               }

               ++var8;
            }

            this.Hw();
         }

         net.u.j var27 = var2.C(this.z().f());
         if(this.hl.E(var27, false)) {
            this.Hw();
         }
      }

      float var21 = (float)this.Z() * 0.01F;
      this.lk = this.lZ;
      if(Float.compare(this.lZ, var21) > 0) {
         this.lZ = net.u.t.T(this.lZ - 0.05F, var21, 1.0F);
      }

      if(this.lZ < var21) {
         this.lZ = net.u.t.T(this.lZ + 0.05F, 0.0F, var21);
      }

      if(this.hl.x) {
         if(this.l_ > 0 && this.lG != null) {
            --this.l_;
         }

         this.lG = var2;
      }

      this.b = (double)var2.t() + 0.5D;
      this.hS = (double)var2.h();
      this.hr = (double)var2.y() + 0.5D;
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      this.hL = this.b;
      this.F = this.hS;
      this.A = this.hr;
      double var25 = 0.5D - (double)net.u.t.A((0.5F + this.lZ) * 3.1415927F) * 0.5D;
      double var28 = 0.5D - (double)net.u.t.A((0.5F + this.lk) * 3.1415927F) * 0.5D;
      double var30 = var25 - var28;
      double var10 = 0.0D;
      double var12 = 0.0D;
      double var14 = 0.0D;
      aq var16 = this.z();
      switch(null.d[var16.ordinal()]) {
      case 1:
         this.g(new net.u.e(this.b - 0.5D, this.hS, this.hr - 0.5D, this.b + 0.5D, this.hS + 1.0D + var25, this.hr + 0.5D));
      case 2:
         this.g(new net.u.e(this.b - 0.5D, this.hS - var25, this.hr - 0.5D, this.b + 0.5D, this.hS + 1.0D, this.hr + 0.5D));
         var12 = -var30;
      case 3:
         this.g(new net.u.e(this.b - 0.5D, this.hS, this.hr - 0.5D, this.b + 0.5D, this.hS + 1.0D, this.hr + 0.5D + var25));
      case 4:
         this.g(new net.u.e(this.b - 0.5D, this.hS, this.hr - 0.5D - var25, this.b + 0.5D, this.hS + 1.0D, this.hr + 0.5D));
         var14 = -var30;
      case 5:
         this.g(new net.u.e(this.b - 0.5D, this.hS, this.hr - 0.5D, this.b + 0.5D + var25, this.hS + 1.0D, this.hr + 0.5D));
      case 6:
         this.g(new net.u.e(this.b - 0.5D - var25, this.hS, this.hr - 0.5D, this.b + 0.5D, this.hS + 1.0D, this.hr + 0.5D));
         var10 = -var30;
      default:
         if(var30 > 0.0D) {
            List var17 = this.hl.u(this, this.i());
            if(!var17.isEmpty()) {
               Iterator var18 = var17.iterator();
               if(var18.hasNext()) {
                  net.ne.l var19 = (net.ne.l)var18.next();
                  if(!(var19 instanceof j) && !var19.r) {
                     var19.N(net.ne.f.SHULKER, var10, var12, var14);
                  }
               }
            }
         }

      }
   }

   public void N(net.ne.f var1, double var2, double var4, double var6) {
      if(var1 == net.ne.f.SHULKER_BOX) {
         this.Hw();
      } else {
         super.N(var1, var2, var4, var6);
      }

   }

   public void t(double var1, double var3, double var5) {
      super.t(var1, var3, var5);
      if(this.G != null && this.x != 0) {
         Optional var7 = (Optional)this.G.a(lW);
         Optional var8 = Optional.of(new net.u.j(var1, var3, var5));
         if(!var8.equals(var7)) {
            this.G.d(lW, var8);
            this.G.d(lB, Byte.valueOf((byte)0));
            this.w = true;
         }
      }

   }

   protected boolean Hw() {
      if(!this.lJ() && this.P()) {
         net.u.j var1 = new net.u.j(this);
         int var2 = 0;

         while(true) {
            net.u.j var3 = var1.F(8 - this.p.nextInt(17), 8 - this.p.nextInt(17), 8 - this.p.nextInt(17));
            if(var3.h() > 0 && this.hl.y(var3) && this.hl.x((net.ne.l)this) && this.hl.h(this, new net.u.e(var3)).isEmpty()) {
               boolean var4 = false;

               for(aq var8 : aq.values()) {
                  if(this.hl.E(var3.C(var8), false)) {
                     this.G.d(lF, var8);
                     var4 = true;
                     break;
                  }
               }

               this.I(net.nb.l.wb, 1.0F, 1.0F);
               this.G.d(lW, Optional.of(var3));
               this.G.d(lB, Byte.valueOf((byte)0));
               this.C((net.ne.a)null);
               return true;
            }

            ++var2;
         }
      } else {
         return true;
      }
   }

   public void d() {
      super.d();
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      this.Az = 180.0F;
      this.AK = 180.0F;
      this.hN = 180.0F;
   }

   public void O(net.k.v var1) {
      if(lW.equals(var1) && this.hl.x && !this.M()) {
         net.u.j var2 = this.G();
         if(this.lG == null) {
            this.lG = var2;
         } else {
            this.l_ = 6;
         }

         this.b = (double)var2.t() + 0.5D;
         this.hS = (double)var2.h();
         this.hr = (double)var2.y() + 0.5D;
         this.h = this.b;
         this.h6 = this.hS;
         this.l = this.hr;
         this.hL = this.b;
         this.F = this.hS;
         this.A = this.hr;
      }

      super.O(var1);
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.A9 = 0;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.D()) {
         net.ne.l var3 = var1.g();
         if(var3 instanceof net.n1.o) {
            return false;
         }
      }

      if(super.H(var1, var2)) {
         if((double)this.h() < (double)this.w() * 0.5D && this.p.nextInt(4) == 0) {
            this.Hw();
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean D() {
      return this.Z() == 0;
   }

   @Nullable
   public net.u.e F() {
      return this.P()?this.i():null;
   }

   public aq z() {
      return (aq)this.G.a(lF);
   }

   @Nullable
   public net.u.j G() {
      return (net.u.j)((Optional)this.G.a(lW)).orNull();
   }

   public void B(@Nullable net.u.j var1) {
      this.G.d(lW, Optional.fromNullable(var1));
   }

   public int Z() {
      return ((Byte)this.G.a(lB)).byteValue();
   }

   public void d(int var1) {
      if(!this.hl.x) {
         this.t(net.ne.d.g).n(lv);
         this.t(net.ne.d.g).g(lv);
         this.I(net.nb.l.H6, 1.0F, 1.0F);
      }

      this.G.d(lB, Byte.valueOf((byte)var1));
   }

   public float V(float var1) {
      return this.lk + (this.lZ - this.lk) * var1;
   }

   public int O() {
      return this.l_;
   }

   public net.u.j d() {
      return this.lG;
   }

   public float A() {
      return 0.5F;
   }

   public int w() {
      return 180;
   }

   public int v() {
      return 180;
   }

   public void W(net.ne.l var1) {
   }

   public float t() {
      return 0.0F;
   }

   public boolean HS() {
      return this.lG != null && this.G() != null;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.D;
   }

   public kw A() {
      return kw.h(((Byte)this.G.a(lx)).byteValue());
   }

   private static xn a(xn var0) {
      return var0;
   }

   class c extends o8 {
      public c(j var2) {
         super(var2, net.r.r.class, true);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return j.this.hl.k() != net.yv.l.PEACEFUL && super.f();
      }

      protected net.u.e Q(double var1) {
         n.o.y();
         aq var4 = ((j)this.k).z();
         return var4.r() == aq.l.X?this.k.i().f(4.0D, var1, var1):(var4.r() == aq.l.Z?this.k.i().f(var1, var1, 4.0D):this.k.i().f(var1, 4.0D, var1));
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   static class h extends o8 {
      public h(j var1) {
         super(var1, net.ne.a.class, 10, true, false, new Predicate() {
            public boolean Q(@Nullable net.ne.a var1) {
               return var1 instanceof fc;
            }
         });
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return this.k.f() != null && super.f();
      }

      protected net.u.e Q(double var1) {
         n.o.y();
         aq var4 = ((j)this.k).z();
         return var4.r() == aq.l.X?this.k.i().f(4.0D, var1, var1):(var4.r() == aq.l.Z?this.k.i().f(var1, var1, 4.0D):this.k.i().f(var1, 4.0D, var1));
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   class n extends net.y_.b {
      private int a;

      private n() {
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return j.this.M() == null && j.this.p.nextInt(40) == 0;
      }

      public boolean X() {
         net.u.d[] var1 = n.o.y();
         return j.this.M() == null && this.a > 0;
      }

      public void I() {
         this.a = 20 * (1 + j.this.p.nextInt(3));
         j.this.d(30);
      }

      public void C() {
         if(j.this.M() == null) {
            j.this.d(0);
         }

      }

      public void E() {
         --this.a;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class o extends net.y_.b {
      private int q;

      public o() {
         this.h(3);
      }

      public boolean f() {
         net.ne.a var1 = j.this.M();
         return var1.P()?j.this.hl.k() != net.yv.l.PEACEFUL:false;
      }

      public void I() {
         this.q = 20;
         j.this.d(100);
      }

      public void C() {
         j.this.d(0);
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(j.this.hl.k() != net.yv.l.PEACEFUL) {
            label25: {
               --this.q;
               net.ne.a var2 = j.this.M();
               j.this.E().n(var2, 180.0F, 180.0F);
               double var3 = j.this.F(var2);
               if(Double.compare(var3, 400.0D) < 0) {
                  if(this.q > 0) {
                     break label25;
                  }

                  this.q = 20 + j.this.p.nextInt(10) * 20 / 2;
                  net.n1.a var5 = new net.n1.a(j.this.hl, j.this, var2, j.this.z().r());
                  j.this.hl.S(var5);
                  j.this.I(net.nb.l.CU, 2.0F, (j.this.p.nextFloat() - j.this.p.nextFloat()) * 0.2F + 1.0F);
               }

               j.this.C((net.ne.a)null);
            }

            super.E();
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class v extends net.ne.z {
      public v(net.ne.a var2) {
         super(var2);
      }

      public void j() {
      }
   }
}
