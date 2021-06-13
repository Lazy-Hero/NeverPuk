package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;

public class l4 extends l {
   public static final net.yr.l H = net.yr.l.J("layers", 1, 8);
   protected static final net.u.e[] M = new net.u.e[]{new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

   protected l4() {
      super(net.y1.l.C);
      this.r(this.b.T().s(H, Integer.valueOf(1)));
      this.R(true);
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return M[((Integer)var1.i(H)).intValue()];
   }

   public boolean c(o8 var1, net.u.j var2) {
      return ((Integer)var1.Z(var2).i(H)).intValue() < 5;
   }

   public boolean L(net.yw.n var1) {
      return ((Integer)var1.i(H)).intValue() == 8;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      int var4 = ((Integer)var1.i(H)).intValue() - 1;
      float var10000 = 0.125F;
      net.u.e var6 = var1.q(var2, var3);
      return new net.u.e(var6.n, var6.u, var6.N, var6.d, (double)((float)var4 * 0.125F), var6.r);
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      net.yw.n var4 = var1.Z(var2.b());
      l var5 = var4.Q();
      if(var5 != net.nb.f.oD && var5 != net.nb.f.d4 && var5 != net.nb.f.dr) {
         net.yw.g var6 = var4.B(var1, var2.b(), aq.UP);
         return var6 == net.yw.g.SOLID || var4.n() == net.y1.l.h || var5 == this && ((Integer)var4.i(H)).intValue() == 8;
      } else {
         return false;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.T(var2, var3, var1);
   }

   private boolean T(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.J(var1, var2)) {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      } else {
         return true;
      }
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      e(var1, var3, new ks(net.nb.j.f, ((Integer)var4.i(H)).intValue() + 1, 0));
      var1.J(var3);
      var2.S(net.v.q.i(this));
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.f;
   }

   public int T(Random var1) {
      return 0;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(var1.d(net.yv.w.BLOCK, var2) > 11) {
         this.N(var1, var2, var1.Z(var2), 0);
         var1.J(var2);
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      if(var4 == aq.UP) {
         return true;
      } else {
         net.yw.n var5 = var2.Z(var3.C(var4));
         return (var5.Q() != this || ((Integer)var5.i(H)).intValue() < ((Integer)var1.i(H)).intValue()) && super.v(var1, var2, var3, var4);
      }
   }

   public net.yw.n D(int var1) {
      return this.p().s(H, Integer.valueOf((var1 & 7) + 1));
   }

   public boolean X(o8 var1, net.u.j var2) {
      return ((Integer)var1.Z(var2).i(H)).intValue() == 1;
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(H)).intValue() - 1;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{H});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
