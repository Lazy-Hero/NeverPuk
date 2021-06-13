package net.yn;

import com.google.common.base.Predicate;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yt;
import net.nk.fb;
import net.y_.o0;
import net.y_.o1;
import net.y_.o8;
import net.y_.oa;
import net.y_.oc;
import net.y_.oj;
import net.y_.ok;
import net.y_.ol;
import net.y_.oo;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.yn.b;
import net.yn.d;
import net.yn.j;
import net.yn.l;
import net.yn.w;
import net.yz.ai;
import net.yz.m_;

public class x extends d {
   private static final net.k.v ta = net.k.n.q(x.class, net.k.y.r);
   private static final net.k.v te = net.k.n.q(x.class, net.k.y.f);
   private static final net.k.v tN = net.k.n.q(x.class, net.k.y.d);
   private float tn;
   private float tH;
   private boolean tM;
   private boolean tJ;
   private float tV;
   private float t_;

   public x(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 0.85F);
      this.c(false);
   }

   protected void D() {
      this.I9 = new o0(this);
      this.p_.X(1, new op(this));
      this.p_.X(2, this.I9);
      this.p_.X(3, new x.h(this, l.class, 24.0F, 1.5D, 1.5D));
      this.p_.X(4, new oc(this, 0.4F));
      this.p_.X(5, new net.y_.k(this, 1.0D, true));
      this.p_.X(6, new net.y_.v(this, 1.0D, 10.0F, 2.0F));
      this.p_.X(7, new ot(this, 1.0D));
      this.p_.X(8, new ow(this, 1.0D));
      this.p_.X(9, new net.y_.l(this, 8.0F));
      this.p_.X(10, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(10, new oa(this));
      this.pM.X(1, new o1(this));
      this.pM.X(2, new ol(this));
      this.pM.X(3, new oo(this, true, new Class[0]));
      this.pM.X(4, new oj(this, w.class, false, new Predicate() {
         public boolean r(@Nullable net.ne.l var1) {
            int var2 = net.yn.z.C();
            return var1 instanceof b || var1 instanceof net.yn.z;
         }

         private static xn a(xn var0) {
            return var0;
         }
      }));
      this.pM.X(5, new o8(this, net.nk.q.class, false));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.30000001192092896D);
      if(this.D()) {
         this.t(net.ne.d.C).t(20.0D);
      } else {
         this.t(net.ne.d.C).t(8.0D);
      }

      this.T().i(net.ne.d.S).t(2.0D);
   }

   public void C(@Nullable net.ne.a var1) {
      super.C(var1);
      this.Y(false);
   }

   protected void T() {
      this.G.d(ta, Float.valueOf(this.h()));
   }

   protected void g() {
      super.g();
      this.G.r(ta, Float.valueOf(this.h()));
      this.G.r(te, Boolean.valueOf(false));
      this.G.r(tN, Integer.valueOf(kw.RED.G()));
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.V, 0.15F, 1.0F);
   }

   public static void Y(net.c0.d var0) {
      net.ne.y.J(var0, x.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("Angry", this.d9());
      var1.D("CollarColor", (byte)this.P().G());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.Y(var1.i("Angry"));
      if(var1.K("CollarColor", 99)) {
         this.Q(kw.q(var1.R("CollarColor")));
      }

   }

   protected net.yz.a T() {
      return this.d9()?net.nb.l.CY:(this.p.nextInt(3) != 0?net.nb.l.DO:(this.D() && ((Float)this.G.a(ta)).floatValue() < 10.0F?net.nb.l.Y:net.nb.l.K3));
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Px;
   }

   protected net.yz.a r() {
      return net.nb.l.om;
   }

   protected float G() {
      return 0.4F;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pw;
   }

   public void d() {
      super.d();
      if(!this.hl.x && this.tM && !this.tJ && !this.DI() && this.k) {
         this.tJ = true;
         this.tV = 0.0F;
         this.t_ = 0.0F;
         this.hl.k(this, (byte)8);
      }

      if(!this.hl.x && this.M() == null && this.d9()) {
         this.Y(false);
      }

   }

   public void A() {
      super.A();
      this.tH = this.tn;
      if(this.ds()) {
         this.tn += (1.0F - this.tn) * 0.4F;
      } else {
         this.tn += (0.0F - this.tn) * 0.4F;
      }

      if(this.J()) {
         this.tM = true;
         this.tJ = false;
         this.tV = 0.0F;
         this.t_ = 0.0F;
      } else if((this.tM || this.tJ) && this.tJ) {
         if(this.tV == 0.0F) {
            this.I(net.nb.l.of, this.G(), (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         }

         this.t_ = this.tV;
         this.tV += 0.05F;
         if(this.t_ >= 2.0F) {
            this.tM = false;
            this.tJ = false;
            this.t_ = 0.0F;
            this.tV = 0.0F;
         }

         if(this.tV > 0.4F) {
            float var1 = (float)this.i().u;
            int var2 = (int)(net.u.t.A((this.tV - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9 * 0.5F;
               float var5 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9 * 0.5F;
               this.hl.n(ai.WATER_SPLASH, this.b + (double)var4, (double)(var1 + 0.8F), this.hr + (double)var5, this.hf, this.K, this.J, new int[0]);
            }
         }
      }

   }

   public boolean dT() {
      return this.tM;
   }

   public float I(float var1) {
      return 0.75F + (this.t_ + (this.tV - this.t_) * var1) / 2.0F * 0.25F;
   }

   public float H(float var1, float var2) {
      float var3 = (this.t_ + (this.tV - this.t_) * var1 + var2) / 1.8F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      } else if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return net.u.t.A(var3 * 3.1415927F) * net.u.t.A(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
   }

   public float T(float var1) {
      return (this.tH + (this.tn - this.tH) * var1) * 0.15F * 3.1415927F;
   }

   public float A() {
      return this.m * 0.8F;
   }

   public int w() {
      return this.Ke()?20:super.w();
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         net.ne.l var3 = var1.v();
         if(this.I9 != null) {
            this.I9.n(false);
         }

         if(!(var3 instanceof net.r.r) && !(var3 instanceof net.n1.o)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.H(var1, var2);
      }
   }

   public boolean S(net.ne.l var1) {
      boolean var2 = var1.H(net.yz.z.O(this), (float)((int)this.t(net.ne.d.S).K()));
      this.q(this, var1);
      return var2;
   }

   public void c(boolean var1) {
      super.c(var1);
      this.t(net.ne.d.C).t(20.0D);
      this.t(net.ne.d.S).t(4.0D);
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      if(this.D()) {
         if(!var4.B()) {
            if(var4.Z() instanceof yt) {
               yt var5 = (yt)var4.Z();
               if(var5.K() && ((Float)this.G.a(ta)).floatValue() < 20.0F) {
                  if(!var1.a6.V) {
                     var4.H(1);
                  }

                  this.d((float)var5.Z(var4));
                  return true;
               }
            }

            if(var4.Z() == net.nb.j.n) {
               kw var6 = kw.q(var4.n());
               if(var6 != this.P()) {
                  this.Q(var6);
                  if(!var1.a6.V) {
                     var4.H(1);
                  }

                  return true;
               }
            }
         }

         if(!this.s(var1) || this.hl.x || this.V(var4)) {
            return super.R(var1, var2);
         }

         this.I9.n(!this.Ke());
         this.XL = false;
         this.p6.u();
         this.C((net.ne.a)null);
      }

      if(var4.Z() == net.nb.j.SU && !this.d9()) {
         if(!var1.a6.V) {
            var4.H(1);
         }

         if(!this.hl.x) {
            if(this.p.nextInt(3) == 0) {
               this.q(var1);
               this.p6.u();
               this.C((net.ne.a)null);
               this.I9.n(true);
               this.u(20.0F);
               this.P(true);
               this.hl.k(this, (byte)7);
            }

            this.P(false);
            this.hl.k(this, (byte)6);
         }

         return true;
      } else {
         return super.R(var1, var2);
      }
   }

   public void R(byte var1) {
      if(var1 == 8) {
         this.tJ = true;
         this.tV = 0.0F;
         this.t_ = 0.0F;
      } else {
         super.R(var1);
      }

   }

   public float o() {
      return this.d9()?1.5393804F:(this.D()?(0.55F - (this.w() - ((Float)this.G.a(ta)).floatValue()) * 0.02F) * 3.1415927F:0.62831855F);
   }

   public boolean V(ks var1) {
      return var1.Z() instanceof yt && ((yt)var1.Z()).K();
   }

   public int W() {
      return 8;
   }

   public boolean d9() {
      return (((Byte)this.G.a(Ib)).byteValue() & 2) != 0;
   }

   public void Y(boolean var1) {
      byte var2 = ((Byte)this.G.a(Ib)).byteValue();
      this.G.d(Ib, Byte.valueOf((byte)(var2 | 2)));
   }

   public kw P() {
      return kw.q(((Integer)this.G.a(tN)).intValue() & 15);
   }

   public void Q(kw var1) {
      this.G.d(tN, Integer.valueOf(var1.G()));
   }

   public x P(net.ne.j var1) {
      x var2 = new x(this.hl);
      UUID var3 = this.q();
      var2.w(var3);
      var2.c(true);
      return var2;
   }

   public void F(boolean var1) {
      this.G.d(te, Boolean.valueOf(var1));
   }

   public boolean b(w var1) {
      if(var1 == this) {
         return false;
      } else if(!this.D()) {
         return false;
      } else if(!(var1 instanceof x)) {
         return false;
      } else {
         x var2 = (x)var1;
         return !var2.D()?false:(var2.Ke()?false:this.BZ() && var2.BZ());
      }
   }

   public boolean ds() {
      return ((Boolean)this.G.a(te)).booleanValue();
   }

   public boolean l(net.ne.a var1, net.ne.a var2) {
      if(!(var1 instanceof net.nk.m) && !(var1 instanceof fb)) {
         if(var1 instanceof x) {
            x var3 = (x)var1;
            if(var3.D() && var3.L() == var2) {
               return false;
            }
         }

         return var1 instanceof net.r.r && var2 instanceof net.r.r && !((net.r.r)var2).A((net.r.r)var1)?false:!(var1 instanceof j) || !((j)var1).Up();
      } else {
         return false;
      }
   }

   public boolean p(net.r.r var1) {
      return !this.d9() && super.p(var1);
   }

   private static xn d(xn var0) {
      return var0;
   }

   class h extends net.y_.n {
      private final x O;

      public h(x var2, Class var3, float var4, double var5, double var7) {
         super(var2, var3, var4, var5, var7);
         this.O = var2;
      }

      public boolean f() {
         int var1 = net.yn.z.B();
         return super.f() && this.T instanceof l?!this.O.D() && this.Y((l)this.T):false;
      }

      private boolean Y(l var1) {
         return var1.N() >= x.this.p.nextInt(5);
      }

      public void I() {
         x.this.C((net.ne.a)null);
         super.I();
      }

      public void E() {
         x.this.C((net.ne.a)null);
         super.E();
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
