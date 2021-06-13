package net.y9;

import java.util.Iterator;
import net.xn;
import net.y9.g3;
import net.y9.ge;
import net.y9.gh;
import net.y9.lk;
import net.yz.aq;
import net.yz.au;

public abstract class l2 extends ge {
   public static final net.yr.w l = net.yr.w.l("axis", l2.g.class);

   public l2() {
      super(net.y1.l.S);
      this.f(net.ys.r.M);
      this.r(2.0F);
      this.i(lk.v);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      g3.v.w();
      boolean var10001 = true;
      var10001 = true;
      if(var1.C(var2.F(-5, -5, -5), var2.F(5, 5, 5))) {
         Iterator var7 = net.u.j.e(var2.F(-4, -4, -4), var2.F(4, 4, 4)).iterator();
         if(var7.hasNext()) {
            net.u.j var8 = (net.u.j)var7.next();
            net.yw.n var9 = var1.Z(var8);
            if(var9.n() == net.y1.l.h && !((Boolean)var9.i(gh.u)).booleanValue()) {
               var1.k(var8, var9.s(gh.u, Boolean.valueOf(true)), 4);
            }
         }
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.D(var7).s(l, l2.g.a(var3.r()));
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.Q[var2.ordinal()]) {
      case 1:
      case 2:
         switch(null.e[((l2.g)var1.i(l)).ordinal()]) {
         case 1:
            return var1.s(l, l2.g.Z);
         case 2:
            return var1.s(l, l2.g.X);
         default:
            return var1;
         }
      default:
         return var1;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum g implements au {
      X("x"),
      Y("y"),
      Z("z"),
      NONE("none");

      private final String P;

      private g(String var3) {
         this.P = var3;
      }

      public String toString() {
         return this.P;
      }

      public static l2.g a(aq.l var0) {
         switch(null.J[var0.ordinal()]) {
         case 1:
            return X;
         case 2:
            return Y;
         case 3:
            return Z;
         default:
            return NONE;
         }
      }

      public String f() {
         return this.P;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
