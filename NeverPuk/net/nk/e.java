package net.nk;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nk.i;
import net.nk.n;
import net.y9.lh;
import net.y_.o8;
import net.y_.of;
import net.y_.oo;
import net.y_.op;
import net.yz.aq;
import net.yz.m_;

public class e extends i {
   private e.d KL;

   public e(net.yv.r var1) {
      super(var1);
      this.S(0.4F, 0.3F);
   }

   public static void D(net.c0.d var0) {
      net.ne.y.J(var0, e.class);
   }

   protected void D() {
      this.KL = new e.d(this);
      this.p_.X(1, new op(this));
      this.p_.X(3, this.KL);
      this.p_.X(4, new net.y_.k(this, 1.0D, false));
      this.p_.X(5, new e.i(this));
      this.pM.X(1, new oo(this, true, new Class[0]));
      this.pM.X(2, new o8(this, net.r.r.class, true));
   }

   public double O() {
      return 0.1D;
   }

   public float A() {
      return 0.1F;
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(8.0D);
      this.t(net.ne.d.G).t(0.25D);
      this.t(net.ne.d.S).t(1.0D);
   }

   protected boolean k() {
      return false;
   }

   protected net.yz.a T() {
      return net.nb.l.oK;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Ko;
   }

   protected net.yz.a r() {
      return net.nb.l.CL;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.w1, 0.15F, 1.0F);
   }

   public boolean H(net.yz.z var1, float var2) {
      net.u.d[] var3 = n.o.y();
      if(this.w(var1)) {
         return false;
      } else {
         if((var1 instanceof net.yz.v || var1 == net.yz.z.B) && this.KL != null) {
            this.KL.M();
         }

         return super.H(var1, var2);
      }
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.S;
   }

   public void A() {
      this.AK = this.hN;
      super.A();
   }

   public void X(float var1) {
      this.hN = var1;
      super.X(var1);
   }

   public float O(net.u.j var1) {
      return this.hl.Z(var1.b()).Q() == net.nb.f.oy?10.0F:super.O(var1);
   }

   protected boolean D() {
      return true;
   }

   public boolean l4() {
      if(super.l4()) {
         net.r.r var1 = this.hl.x(this, 5.0D);
         return true;
      } else {
         return false;
      }
   }

   public net.ne.u g() {
      return net.ne.u.ARTHROPOD;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class d extends net.y_.b {
      private final e B;
      private int c;

      public d(e var1) {
         this.B = var1;
      }

      public void M() {
         if(this.c == 0) {
            this.c = 20;
         }

      }

      public boolean f() {
         return this.c > 0;
      }

      public void E() {
         n.o.y();
         --this.c;
         if(this.c <= 0) {
            net.yv.r var2 = this.B.hl;
            Random var3 = this.B.Q();
            net.u.j var4 = new net.u.j(this.B);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            net.u.j var8 = var4.F(var6, var5, var7);
            net.yw.n var9 = var2.Z(var8);
            if(var9.Q() == net.nb.f.uX) {
               if(var2.N().b("mobGriefing")) {
                  var2.e(var8, true);
               }

               var2.k(var8, ((lh.m)var9.i(lh.a)).p(), 3);
               if(var3.nextBoolean()) {
                  return;
               }
            }

            var7 = 1 - var7;
            var6 = 1 - var6;
            var5 = 1 - var5;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class i extends of {
      private aq o;
      private boolean k;

      public i(e var1) {
         super(var1, 1.0D, 10);
         this.h(1);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         if(this.p.M() != null) {
            return false;
         } else if(!this.p.H().q()) {
            return false;
         } else {
            Random var2 = this.p.Q();
            if(this.p.hl.N().b("mobGriefing") && var2.nextInt(10) == 0) {
               this.o = aq.k(var2);
               net.u.j var3 = (new net.u.j(this.p.b, this.p.hS + 0.5D, this.p.hr)).C(this.o);
               net.yw.n var4 = this.p.hl.Z(var3);
               if(lh.h(var4)) {
                  this.k = true;
                  return true;
               }
            }

            this.k = false;
            return super.f();
         }
      }

      public boolean X() {
         return !this.k && super.X();
      }

      public void I() {
         if(!this.k) {
            super.I();
         } else {
            net.yv.r var1 = this.p.hl;
            net.u.j var2 = (new net.u.j(this.p.b, this.p.hS + 0.5D, this.p.hr)).C(this.o);
            net.yw.n var3 = var1.Z(var2);
            if(lh.h(var3)) {
               var1.k(var2, net.nb.f.uX.p().s(lh.a, lh.m.q(var3)), 3);
               this.p.x();
               this.p.B();
            }
         }

      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
