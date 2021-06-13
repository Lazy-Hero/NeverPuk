package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.y9.z4;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class zf extends z4 {
   public static final net.yr.g E = rw.N;
   public static final net.yr.l W = net.yr.l.J("rotation", 0, 15);
   protected static final net.u.e A = new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);

   protected zf() {
      super(net.y1.l.S);
   }

   public String U() {
      return net.yq.e.E("item.banner.white.name");
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return true;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean a() {
      return true;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.g();
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Yi;
   }

   private ks C(net.yv.r var1, net.u.j var2) {
      net.ni.v var3 = var1.L(var2);
      return var3 instanceof net.ni.g?((net.ni.g)var3).g():ks.a;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      ks var4 = this.C(var1, var2);
      return var4.B()?new ks(net.nb.j.Yi):var4;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      g3.v.w();
      ks var7 = this.C(var1, var2);
      if(var7.B()) {
         super.P(var1, var2, var3, var4, var5);
      }

      e(var1, var2, var7);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return !this.H(var1, var2) && super.J(var1, var2);
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      int[] var7 = g3.v.w();
      if(var5 instanceof net.ni.g) {
         net.ni.g var8 = (net.ni.g)var5;
         ks var9 = var8.g();
         e(var1, var3, var9);
      }

      super.U(var1, var2, var3, var4, (net.ni.v)null, var6);
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class d extends zf {
      public d() {
         this.r(this.b.T().s(W, Integer.valueOf(0)));
      }

      public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
         return A;
      }

      public net.yw.n G(net.yw.n var1, net.yz.l var2) {
         return var1.s(W, Integer.valueOf(var2.K(((Integer)var1.i(W)).intValue(), 16)));
      }

      public net.yw.n P(net.yw.n var1, ax var2) {
         return var1.s(W, Integer.valueOf(var2.l(((Integer)var1.i(W)).intValue(), 16)));
      }

      public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
         int[] var6 = g3.v.w();
         if(!var2.Z(var3.b()).n().B()) {
            this.N(var2, var3, var1, 0);
            var2.J(var3);
         }

         super.Z(var1, var2, var3, var4, var5);
      }

      public net.yw.n D(int var1) {
         return this.p().s(W, Integer.valueOf(var1));
      }

      public int d(net.yw.n var1) {
         return ((Integer)var1.i(W)).intValue();
      }

      protected net.yw.q k() {
         return new net.yw.q(this, new net.yr.h[]{W});
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class o extends zf {
      protected static final net.u.e p = new net.u.e(0.0D, 0.0D, 0.875D, 1.0D, 0.78125D, 1.0D);
      protected static final net.u.e R = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.78125D, 0.125D);
      protected static final net.u.e k = new net.u.e(0.875D, 0.0D, 0.0D, 1.0D, 0.78125D, 1.0D);
      protected static final net.u.e H = new net.u.e(0.0D, 0.0D, 0.0D, 0.125D, 0.78125D, 1.0D);

      public o() {
         this.r(this.b.T().s(E, aq.NORTH));
      }

      public net.yw.n G(net.yw.n var1, net.yz.l var2) {
         return var1.s(E, var2.d((aq)var1.i(E)));
      }

      public net.yw.n P(net.yw.n var1, ax var2) {
         return var1.b(var2.S((aq)var1.i(E)));
      }

      public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
         switch(null.b[((aq)var1.i(E)).ordinal()]) {
         case 1:
         default:
            return p;
         case 2:
            return R;
         case 3:
            return k;
         case 4:
            return H;
         }
      }

      public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
         g3.v.w();
         aq var7 = (aq)var1.i(E);
         if(!var2.Z(var3.C(var7.f())).n().B()) {
            this.N(var2, var3, var1, 0);
            var2.J(var3);
         }

         super.Z(var1, var2, var3, var4, var5);
      }

      public net.yw.n D(int var1) {
         g3.v.w();
         aq var3 = aq.l(var1);
         if(var3.r() == aq.l.Y) {
            var3 = aq.NORTH;
         }

         return this.p().s(E, var3);
      }

      public int d(net.yw.n var1) {
         return ((aq)var1.i(E)).w();
      }

      protected net.yw.q k() {
         return new net.yw.q(this, new net.yr.h[]{E});
      }

      private static xn b(xn var0) {
         return var0;
      }
   }
}
