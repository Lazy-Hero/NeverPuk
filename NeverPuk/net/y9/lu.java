package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;

public abstract class lu extends l {
   public static final net.yr.w R = net.yr.w.l("half", lu.k.class);
   protected static final net.u.e f = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);

   public lu(net.y1.l var1) {
      this(var1, var1.f());
   }

   public lu(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
      this.t = this.l();
      this.R(255);
   }

   protected boolean u() {
      return false;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return this.l()?I:(var1.i(R) == lu.k.TOP?u:f);
   }

   public boolean L(net.yw.n var1) {
      return ((lu)var1.Q()).l() || var1.i(R) == lu.k.TOP;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return ((lu)var2.Q()).l()?net.yw.g.SOLID:(var4 == aq.UP && var2.i(R) == lu.k.TOP?net.yw.g.SOLID:(var4 == aq.DOWN && var2.i(R) == lu.k.BOTTOM?net.yw.g.SOLID:net.yw.g.UNDEFINED));
   }

   public boolean V(net.yw.n var1) {
      return this.l();
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      net.yw.n var9 = super.U(var1, var2, var3, var4, var5, var6, var7, var8).s(R, lu.k.BOTTOM);
      return this.l()?var9:(var3 == aq.DOWN || var3 != aq.UP && (double)var5 > 0.5D?var9.s(R, lu.k.TOP):var9);
   }

   public int T(Random var1) {
      return this.l()?2:1;
   }

   public boolean k(net.yw.n var1) {
      return this.l();
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      int[] var5 = g3.v.w();
      if(this.l()) {
         return super.v(var1, var2, var3, var4);
      } else if(var4 != aq.UP && var4 != aq.DOWN && !super.v(var1, var2, var3, var4)) {
         return false;
      } else {
         net.yw.n var6 = var2.Z(var3.C(var4));
         if(d(var6) && var6.i(R) == lu.k.TOP) {
            boolean var9 = true;
         } else {
            boolean var10000 = false;
         }

         if(d(var1) && var1.i(R) == lu.k.TOP) {
            boolean var11 = true;
         } else {
            boolean var10 = false;
         }

         if(var4 == aq.DOWN) {
            return true;
         } else if(var4 == aq.UP && super.v(var1, var2, var3, var4)) {
            return true;
         } else {
            if(d(var6)) {
               ;
            }

            return true;
         }
      }
   }

   protected static boolean d(net.yw.n var0) {
      l var1 = var0.Q();
      return var1 == net.nb.f.Tt || var1 == net.nb.f.S || var1 == net.nb.f.T4 || var1 == net.nb.f.dM;
   }

   public abstract String G(int var1);

   public abstract boolean l();

   public abstract net.yr.h R();

   public abstract Comparable b(ks var1);

   private static xn b(xn var0) {
      return var0;
   }

   public static enum k implements au {
      TOP("top"),
      BOTTOM("bottom");

      private final String P;

      private k(String var3) {
         this.P = var3;
      }

      public String toString() {
         return this.P;
      }

      public String f() {
         return this.P;
      }
   }
}
