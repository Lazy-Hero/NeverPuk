package net.nk;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.nk.d;
import net.nk.fc;
import net.nk.m;
import net.nk.n;
import net.y_.o2;
import net.y_.o8;
import net.y_.o9;
import net.y_.oa;
import net.y_.oh;
import net.y_.oi;
import net.y_.ok;
import net.y_.oo;
import net.y_.ow;
import net.y_.oz;
import net.yz.ai;
import net.yz.m_;

public class b extends d {
   protected static final net.k.v ah = net.k.n.q(b.class, net.k.y.g);
   private int a4;
   @Nullable
   net.nq.d aH;
   private int aI;
   private int aq;

   public b(net.yv.r var1) {
      super(var1);
      this.S(1.4F, 2.7F);
   }

   protected void D() {
      this.p_.X(1, new net.y_.k(this, 1.0D, true));
      this.p_.X(2, new oh(this, 0.9D, 32.0F));
      this.p_.X(3, new oi(this, 0.6D, true));
      this.p_.X(4, new o2(this, 1.0D));
      this.p_.X(5, new oz(this));
      this.p_.X(6, new ow(this, 0.6D));
      this.p_.X(7, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(8, new oa(this));
      this.pM.X(1, new o9(this));
      this.pM.X(2, new oo(this, false, new Class[0]));
      this.pM.X(3, new o8(this, net.ne.y.class, 10, false, true, new Predicate() {
         public boolean E(@Nullable net.ne.y var1) {
            net.u.d[] var2 = n.o.y();
            return fc.N.apply(var1) && !(var1 instanceof m);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }));
   }

   protected void g() {
      super.g();
      this.G.r(ah, Byte.valueOf((byte)0));
   }

   protected void T() {
      if(--this.a4 <= 0) {
         this.a4 = 70 + this.p.nextInt(50);
         this.aH = this.hl.v().s(new net.u.j(this), 32);
         if(this.aH == null) {
            this.DI();
         } else {
            net.u.j var1 = this.aH.w();
            this.y(var1, (int)((float)this.aH.T() * 0.6F));
         }
      }

      super.T();
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(100.0D);
      this.t(net.ne.d.G).t(0.25D);
      this.t(net.ne.d.l).t(1.0D);
   }

   protected int M(int var1) {
      return var1;
   }

   protected void I(net.ne.l var1) {
      if(var1 instanceof fc && !(var1 instanceof m) && this.Q().nextInt(20) == 0) {
         this.C((net.ne.a)var1);
      }

      super.I(var1);
   }

   public void d() {
      n.o.y();
      super.d();
      if(this.aI > 0) {
         --this.aI;
      }

      if(this.aq > 0) {
         --this.aq;
      }

      if(Double.compare(this.hf * this.hf + this.J * this.J, 2.500000277905201E-7D) > 0 && this.p.nextInt(5) == 0) {
         int var2 = net.u.t.L(this.b);
         int var3 = net.u.t.L(this.hS - 0.20000000298023224D);
         int var4 = net.u.t.L(this.hr);
         net.yw.n var5 = this.hl.Z(new net.u.j(var2, var3, var4));
         if(var5.n() != net.y1.l.q) {
            this.hl.n(ai.BLOCK_CRACK, this.b + ((double)this.p.nextFloat() - 0.5D) * (double)this.h9, this.i().u + 0.1D, this.hr + ((double)this.p.nextFloat() - 0.5D) * (double)this.h9, 4.0D * ((double)this.p.nextFloat() - 0.5D), 0.5D, ((double)this.p.nextFloat() - 0.5D) * 4.0D, new int[]{net.y9.l.m(var5)});
         }
      }

   }

   public boolean i(Class var1) {
      return this.D() && net.r.r.class.isAssignableFrom(var1)?false:var1 != m.class && super.i(var1);
   }

   public static void Y(net.c0.d var0) {
      net.ne.y.J(var0, b.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("PlayerCreated", this.D());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.b(var1.i("PlayerCreated"));
   }

   public boolean S(net.ne.l var1) {
      this.aI = 10;
      this.hl.k(this, (byte)4);
      boolean var2 = var1.H(net.yz.z.O(this), (float)(7 + this.p.nextInt(15)));
      var1.K += 0.4000000059604645D;
      this.q(this, var1);
      this.I(net.nb.l.DV, 1.0F, 1.0F);
      return var2;
   }

   public void R(byte var1) {
      if(var1 == 4) {
         this.aI = 10;
         this.I(net.nb.l.DV, 1.0F, 1.0F);
      } else if(var1 == 11) {
         this.aq = 400;
      } else if(var1 == 34) {
         this.aq = 0;
      } else {
         super.R(var1);
      }

   }

   public net.nq.d B() {
      return this.aH;
   }

   public int o() {
      return this.aI;
   }

   public void x(boolean var1) {
      this.aq = 400;
      this.hl.k(this, (byte)11);
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.H7;
   }

   protected net.yz.a r() {
      return net.nb.l.os;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.T, 1.0F, 1.0F);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.N;
   }

   public int t() {
      return this.aq;
   }

   public boolean D() {
      return (((Byte)this.G.a(ah)).byteValue() & 1) != 0;
   }

   public void b(boolean var1) {
      byte var2 = ((Byte)this.G.a(ah)).byteValue();
      this.G.d(ah, Byte.valueOf((byte)(var2 | 1)));
   }

   public void O(net.yz.z var1) {
      if(!this.D() && this.AR != null && this.aH != null) {
         this.aH.b(this.AR.Q(), -5);
      }

      super.O(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
