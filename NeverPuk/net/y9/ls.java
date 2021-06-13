package net.y9;

import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class ls extends l {
   public static final net.yr.g c = rw.N;
   public static final net.yr.o H = net.yr.o.k("open");
   public static final net.yr.w a = net.yr.w.l("half", ls.n.class);
   protected static final net.u.e J = new net.u.e(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
   protected static final net.u.e k = new net.u.e(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e i = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
   protected static final net.u.e M = new net.u.e(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e W = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D);
   protected static final net.u.e O = new net.u.e(0.0D, 0.8125D, 0.0D, 1.0D, 1.0D, 1.0D);

   protected ls(net.y1.l var1) {
      super(var1);
      this.r(this.b.T().s(c, aq.NORTH).s(H, Boolean.valueOf(false)).s(a, ls.n.BOTTOM));
      this.f(net.ys.r.i);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      int[] var4 = g3.v.w();
      if(((Boolean)var1.i(H)).booleanValue()) {
         switch(null.S[((aq)var1.i(c)).ordinal()]) {
         case 1:
         default:
            net.u.e var5 = M;
         case 2:
            net.u.e var6 = i;
         case 3:
            net.u.e var7 = k;
         case 4:
            net.u.e var8 = J;
         }
      }

      if(var1.i(a) == ls.n.TOP) {
         net.u.e var9 = O;
      }

      net.u.e var10 = W;
      return var10;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return !((Boolean)var1.Z(var2).i(H)).booleanValue();
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(this.C == net.y1.l.i) {
         return false;
      } else {
         var3 = var3.C(H);
         var1.k(var2, var3, 2);
         this.A(var4, var1, var2, ((Boolean)var3.i(H)).booleanValue());
         return true;
      }
   }

   protected void A(@Nullable net.r.r var1, net.yv.r var2, net.u.j var3, boolean var4) {
      int var5 = this.C == net.y1.l.i?1037:1007;
      var2.N(var1, var5, var3, 0);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         boolean var6 = var2.B(var3);
         if(var4.p().o()) {
            boolean var7 = ((Boolean)var1.i(H)).booleanValue();
            if(var7 != var6) {
               var2.k(var3, var1.s(H, Boolean.valueOf(var6)), 2);
               this.A((net.r.r)null, var2, var3, var6);
            }
         }
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      g3.v.w();
      net.yw.n var10 = this.p();
      if(var3.r().P()) {
         var10 = var10.s(c, var3).s(H, Boolean.valueOf(false));
         var10 = var10.s(a, var5 > 0.5F?ls.n.TOP:ls.n.BOTTOM);
      }

      var10 = var10.s(c, var8.V().f()).s(H, Boolean.valueOf(false));
      var10 = var10.s(a, var3 == aq.UP?ls.n.BOTTOM:ls.n.TOP);
      if(var1.B(var2)) {
         var10 = var10.s(H, Boolean.valueOf(true));
      }

      return var10;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return true;
   }

   protected static aq K(int var0) {
      switch(var0 & 3) {
      case 0:
         return aq.NORTH;
      case 1:
         return aq.SOUTH;
      case 2:
         return aq.WEST;
      case 3:
      default:
         return aq.EAST;
      }
   }

   protected static int V(aq var0) {
      switch(null.S[var0.ordinal()]) {
      case 1:
         return 0;
      case 2:
         return 1;
      case 3:
         return 2;
      case 4:
      default:
         return 3;
      }
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(c, K(var1)).s(H, Boolean.valueOf((var1 & 4) != 0)).s(a, (var1 & 8) == 0?ls.n.BOTTOM:ls.n.TOP);
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | V((aq)var1.i(c));
      if(((Boolean)var1.i(H)).booleanValue()) {
         var2 |= 4;
      }

      if(var1.i(a) == ls.n.TOP) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(c, var2.d((aq)var1.i(c)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(c)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{c, H, a});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return (var4 == aq.UP && var2.i(a) == ls.n.TOP || var4 == aq.DOWN && var2.i(a) == ls.n.BOTTOM) && !((Boolean)var2.i(H)).booleanValue()?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n implements au {
      TOP("top"),
      BOTTOM("bottom");

      private final String c;

      private n(String var3) {
         this.c = var3;
      }

      public String toString() {
         return this.c;
      }

      public String f() {
         return this.c;
      }
   }
}
