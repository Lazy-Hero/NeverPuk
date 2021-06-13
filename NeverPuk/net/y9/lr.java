package net.y9;

import com.google.common.base.MoreObjects;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.ly;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class lr extends l {
   public static final net.yr.g D = rw.N;
   public static final net.yr.o l = net.yr.o.k("powered");
   public static final net.yr.o A = net.yr.o.k("attached");
   protected static final net.u.e Q = new net.u.e(0.3125D, 0.0D, 0.625D, 0.6875D, 0.625D, 1.0D);
   protected static final net.u.e u = new net.u.e(0.3125D, 0.0D, 0.0D, 0.6875D, 0.625D, 0.375D);
   protected static final net.u.e o = new net.u.e(0.625D, 0.0D, 0.3125D, 1.0D, 0.625D, 0.6875D);
   protected static final net.u.e h = new net.u.e(0.0D, 0.0D, 0.3125D, 0.375D, 0.625D, 0.6875D);

   public lr() {
      super(net.y1.l.c);
      this.r(this.b.T().s(D, aq.NORTH).s(l, Boolean.valueOf(false)).s(A, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.C[((aq)var1.i(D)).ordinal()]) {
      case 1:
      default:
         return h;
      case 2:
         return o;
      case 3:
         return u;
      case 4:
         return Q;
      }
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      aq var4 = var3.f();
      net.u.j var5 = var2.C(var4);
      net.yw.n var6 = var1.Z(var5);
      boolean var7 = m(var6.Q());
      return var3.r().P() && var6.B(var1, var5, var3) == net.yw.g.SOLID && !var6.o();
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      for(aq var4 : aq.u.HORIZONTAL) {
         if(this.C(var1, var2, var4)) {
            return true;
         }
      }

      return false;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      net.yw.n var9 = this.p().s(l, Boolean.valueOf(false)).s(A, Boolean.valueOf(false));
      if(var3.r().P()) {
         var9 = var9.s(D, var3);
      }

      return var9;
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      this.h(var1, var2, var3, false, false, -1, (net.yw.n)null);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(var4 != this && this.n(var2, var3, var1)) {
         aq var6 = (aq)var1.i(D);
         if(!this.C(var2, var3, var6)) {
            this.N(var2, var3, var1, 0);
            var2.J(var3);
         }
      }

   }

   public void h(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4, boolean var5, int var6, @Nullable net.yw.n var7) {
      aq var9 = (aq)var3.i(D);
      g3.v.w();
      boolean var10 = ((Boolean)var3.i(A)).booleanValue();
      boolean var11 = ((Boolean)var3.i(l)).booleanValue();
      boolean var12 = !var4;
      boolean var13 = false;
      boolean var14 = false;
      net.yw.n[] var15 = new net.yw.n[42];
      int var16 = 1;
      net.u.j var17 = var2.a(var9, var16);
      net.yw.n var18 = var1.Z(var17);
      if(var18.Q() != net.nb.f.d5 || var18.i(D) == var9.f()) {
         if(var18.Q() != net.nb.f.u1 && var16 != var6) {
            var15[var16] = null;
            var12 = false;
         }

         if(var16 == var6) {
            var18 = (net.yw.n)MoreObjects.firstNonNull(var7, var18);
         }

         boolean var19 = !((Boolean)var18.i(ly.u)).booleanValue();
         ((Boolean)var18.i(ly.n)).booleanValue();
         var13 |= false;
         var15[var16] = var18;
         if(var16 == var6) {
            var1.c(var2, this, this.u(var1));
            var12 &= var19;
         }

         ++var16;
      }

      var12 = var12 & false;
      var13 = var13 & var12;
      net.yw.n var24 = this.p().s(A, Boolean.valueOf(var12)).s(l, Boolean.valueOf(var13));
      this.U(var1, var2, var12, var13, var10, var11);
      if(!var4) {
         var1.k(var2, var24.s(D, var9), 3);
         if(var5) {
            this.g(var1, var2, var9);
         }
      }

      if(var10 != var12) {
         boolean var25 = true;
      }

   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      this.h(var1, var2, var3, false, true, -1, (net.yw.n)null);
   }

   private void U(net.yv.r var1, net.u.j var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      var1.M((net.r.r)null, var2, net.nb.l.wG, net.yz.p.BLOCKS, 0.4F, 0.6F);
   }

   private void g(net.yv.r var1, net.u.j var2, aq var3) {
      var1.b(var2, this, false);
      var1.b(var2.C(var3.f()), this, false);
   }

   private boolean n(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.J(var1, var2)) {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      } else {
         return true;
      }
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      boolean var4 = ((Boolean)var3.i(A)).booleanValue();
      boolean var5 = ((Boolean)var3.i(l)).booleanValue();
      this.h(var1, var2, var3, true, false, -1, (net.yw.n)null);
      var1.b(var2, this, false);
      var1.b(var2.C(((aq)var3.i(D)).f()), this, false);
      super.V(var1, var2, var3);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Boolean)var1.i(l)).booleanValue()?15:0;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !((Boolean)var1.i(l)).booleanValue()?0:(var1.i(D) == var4?15:0);
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public ac k() {
      return ac.CUTOUT_MIPPED;
   }

   public net.yw.n D(int var1) {
      return this.p().s(D, aq.Q(var1 & 3)).s(l, Boolean.valueOf((var1 & 8) > 0)).s(A, Boolean.valueOf((var1 & 4) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(D)).u();
      if(((Boolean)var1.i(l)).booleanValue()) {
         var2 |= 8;
      }

      if(((Boolean)var1.i(A)).booleanValue()) {
         var2 |= 4;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(D, var2.d((aq)var1.i(D)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(D)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D, l, A});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
