package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class z6 extends l {
   public static final net.yr.l f = net.yr.l.J("age", 0, 15);
   protected static final net.u.e k = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
   protected static final net.u.e N = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 1.0D, 0.9375D);

   protected z6() {
      super(net.y1.l.B);
      this.r(this.b.T().s(f, Integer.valueOf(0)));
      this.R(true);
      this.f(net.ys.r.X);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      g3.v.w();
      net.u.j var6 = var2.h();
      if(var1.y(var6)) {
         int var7 = 1;
         if(var1.Z(var2.p(var7)).Q() == this) {
            ++var7;
         }

         int var8 = ((Integer)var3.i(f)).intValue();
         if(var8 == 15) {
            var1.U(var6, this.p());
            net.yw.n var9 = var3.s(f, Integer.valueOf(0));
            var1.k(var2, var9, 4);
            var9.q(var1, var6, this, var2);
         }

         var1.k(var2, var3.s(f, Integer.valueOf(var8 + 1)), 4);
      }

   }

   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return k;
   }

   public net.u.e d(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return N.c(var3);
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.f(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.f(var2, var3)) {
         var2.e(var3, true);
      }

   }

   public boolean f(net.yv.r var1, net.u.j var2) {
      for(aq var4 : aq.u.HORIZONTAL) {
         net.y1.l var5 = var1.Z(var2.C(var4)).n();
         if(var5.B() || var5 == net.y1.l.U) {
            return false;
         }
      }

      l var6 = var1.Z(var2.b()).Q();
      return var6 == net.nb.f.dW || var6 == net.nb.f.TF && !var1.Z(var2.h()).n().y();
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      var4.H(net.yz.z.I, 1.0F);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(f, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(f)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{f});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
