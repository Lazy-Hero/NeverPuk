package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.ni.sl;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yz.a5;
import net.yz.aq;

public class rh extends z4 {
   public static final net.yr.w c = net.yr.w.l("mode", sl.s.class);

   public rh() {
      super(net.y1.l.i, net.y1.h.Z);
      this.r(this.b.T());
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new sl();
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      net.ni.v var10 = var1.L(var2);
      return var10 instanceof sl && ((sl)var10).H(var4);
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      if(!var1.x) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof sl) {
            sl var7 = (sl)var6;
            var7.D(var4);
         }
      }

   }

   public int T(Random var1) {
      return 0;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(c, sl.s.DATA);
   }

   public net.yw.n D(int var1) {
      return this.p().s(c, sl.s.O(var1));
   }

   public int d(net.yw.n var1) {
      return ((sl.s)var1.i(c)).H();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{c});
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      int[] var6 = g3.v.w();
      if(!var2.x) {
         net.ni.v var7 = var2.L(var3);
         if(var7 instanceof sl) {
            sl var8 = (sl)var7;
            boolean var9 = var2.B(var3);
            boolean var10 = var8.I();
            if(var9 && !var10) {
               var8.e(true);
               this.r(var8);
            }

            if(!var9 && var10) {
               var8.e(false);
            }
         }
      }

   }

   private void r(sl var1) {
      switch(null.p[var1.x().ordinal()]) {
      case 1:
         var1.D(false);
         break;
      case 2:
         var1.z(false);
         break;
      case 3:
         var1.y();
      case 4:
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
