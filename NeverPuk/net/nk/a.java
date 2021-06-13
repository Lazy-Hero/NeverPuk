package net.nk;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nk.b;
import net.nk.g;
import net.nk.i;
import net.nk.n;
import net.y_.o8;
import net.y_.oa;
import net.y_.oc;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.m_;

public class a extends i {
   private static final net.k.v JQ = net.k.n.q(a.class, net.k.y.g);

   public a(net.yv.r var1) {
      super(var1);
      this.S(1.4F, 0.9F);
   }

   public static void h(net.c0.d var0) {
      net.ne.y.J(var0, a.class);
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(3, new oc(this, 0.4F));
      this.p_.X(4, new a.c(this));
      this.p_.X(5, new ow(this, 0.8D));
      this.p_.X(6, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(6, new oa(this));
      this.pM.X(1, new oo(this, false, new Class[0]));
      this.pM.X(2, new a.k(this, net.r.r.class));
      this.pM.X(3, new a.k(this, b.class));
   }

   public double e() {
      return (double)(this.m * 0.5F);
   }

   protected net.b.n I(net.yv.r var1) {
      return new net.b.q(this, var1);
   }

   protected void g() {
      super.g();
      this.G.r(JQ, Byte.valueOf((byte)0));
   }

   public void A() {
      super.A();
      if(!this.hl.x) {
         this.E(this.t);
      }

   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(16.0D);
      this.t(net.ne.d.G).t(0.30000001192092896D);
   }

   protected net.yz.a T() {
      return net.nb.l.D3;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.P3;
   }

   protected net.yz.a r() {
      return net.nb.l.Pl;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.HM, 0.15F, 1.0F);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.c;
   }

   public boolean K() {
      return this.cX();
   }

   public void K() {
   }

   public net.ne.u g() {
      return net.ne.u.ARTHROPOD;
   }

   public boolean Y(net.n_.i var1) {
      return var1.i() != net.nb.b.j && super.Y(var1);
   }

   public boolean cX() {
      return (((Byte)this.G.a(JQ)).byteValue() & 1) != 0;
   }

   public void E(boolean var1) {
      byte var2 = ((Byte)this.G.a(JQ)).byteValue();
      var2 = (byte)(var2 | 1);
      this.G.d(JQ, Byte.valueOf(var2));
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      net.u.d[] var3 = n.o.y();
      var2 = super.t(var1, var2);
      if(this.hl.G.nextInt(100) == 0) {
         g var4 = new g(this.hl);
         var4.S(this.b, this.hS, this.hr, this.hN, 0.0F);
         var4.t(var1, (net.ne.g)null);
         this.hl.S(var4);
         var4.W(this);
      }

      if(var2 == null) {
         var2 = new a.s();
         if(this.hl.k() == net.yv.l.HARD && Float.compare(this.hl.G.nextFloat(), 0.1F * var1.l()) < 0) {
            ((a.s)var2).q(this.hl.G);
         }
      }

      if(var2 instanceof a.s) {
         net.n_.f var6 = ((a.s)var2).t;
         this.o(new net.n_.i(var6, Integer.MAX_VALUE));
      }

      return var2;
   }

   public float A() {
      return 0.65F;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class c extends net.y_.k {
      public c(a var1) {
         super(var1, 1.0D, true);
      }

      public boolean X() {
         n.o.y();
         float var2 = this.D.d();
         if(Float.compare(var2, 0.5F) >= 0 && this.D.Q().nextInt(100) == 0) {
            this.D.C((net.ne.a)null);
            return false;
         } else {
            return super.X();
         }
      }

      protected double n(net.ne.a var1) {
         return (double)(4.0F + var1.h9);
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   static class k extends o8 {
      public k(a var1, Class var2) {
         super(var1, var2, true);
      }

      public boolean f() {
         n.o.y();
         float var2 = this.k.d();
         return Float.compare(var2, 0.5F) < 0 && super.f();
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   public static class s implements net.ne.g {
      public net.n_.f t;

      public void q(Random var1) {
         n.o.y();
         int var3 = var1.nextInt(5);
         if(var3 <= 1) {
            this.t = net.nb.b.E;
         }

         if(var3 <= 2) {
            this.t = net.nb.b.L;
         }

         if(var3 <= 3) {
            this.t = net.nb.b.n;
         }

         if(var3 <= 4) {
            this.t = net.nb.b.y;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
