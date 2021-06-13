package net.y9;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lg;
import net.y9.lm;
import net.y9.t;
import net.y9.v;
import net.yv.o8;
import net.yz.aq;

public class zh extends t implements lm {
   public static final net.yr.l l = net.yr.l.J("age", 0, 7);
   public static final net.yr.g p = lg.n;
   private final l o;
   protected static final net.u.e[] d = new net.u.e[]{new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.125D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.375D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.5D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.625D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.75D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.875D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D)};

   protected zh(l var1) {
      this.r(this.b.T().s(l, Integer.valueOf(0)).s(p, aq.UP));
      this.o = var1;
      this.R(true);
      this.f((net.ys.r)null);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return d[((Integer)var1.i(l)).intValue()];
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      int var4 = ((Integer)var1.i(l)).intValue();
      var1 = var1.s(p, aq.UP);

      for(aq var6 : aq.u.HORIZONTAL) {
         if(var2.Z(var3.C(var6)).Q() == this.o && var4 == 7) {
            var1 = var1.s(p, var6);
            break;
         }
      }

      return var1;
   }

   protected boolean H(net.yw.n var1) {
      return var1.Q() == net.nb.f.dJ;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      super.P(var1, var2, var3, var4);
      if(var1.y(var2.h()) >= 9) {
         float var6 = v.D(this, var1, var2);
         if(var4.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = ((Integer)var3.i(l)).intValue();
            if(var7 < 7) {
               var3 = var3.s(l, Integer.valueOf(var7 + 1));
               var1.k(var2, var3, 2);
            }

            Iterator var8 = aq.u.HORIZONTAL.iterator();
            if(var8.hasNext()) {
               aq var9 = (aq)var8.next();
               if(var1.Z(var2.C(var9)).Q() == this.o) {
                  return;
               }
            }

            var2 = var2.C(aq.u.HORIZONTAL.N(var4));
            l var12 = var1.Z(var2.b()).Q();
            if(var1.Z(var2).Q().C == net.y1.l.q && (var12 == net.nb.f.dJ || var12 == net.nb.f.dl || var12 == net.nb.f.p)) {
               var1.U(var2, this.o.p());
            }
         }
      }

   }

   public void W(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = ((Integer)var3.i(l)).intValue() + net.u.t.A(var1.G, 2, 5);
      var1.k(var2, var3.s(l, Integer.valueOf(Math.min(7, var4))), 2);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      super.P(var1, var2, var3, var4, var5);
      if(!var1.x) {
         net.n0.y var6 = this.a();
         int var7 = ((Integer)var3.i(l)).intValue();
         int var8 = 0;

         while(true) {
            if(var1.G.nextInt(15) <= var7) {
               e(var1, var2, new ks(var6));
            }

            ++var8;
         }
      }

   }

   @Nullable
   protected net.n0.y a() {
      return this.o == net.nb.f.TS?net.nb.j.Y:(this.o == net.nb.f.dm?net.nb.j.Y3:null);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.n0.y var4 = this.a();
      return ks.a;
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return ((Integer)var3.i(l)).intValue() != 7;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      this.W(var1, var3, var4);
   }

   public net.yw.n D(int var1) {
      return this.p().s(l, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(l)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l, p});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
