package net.y9;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lr;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class ly extends l {
   public static final net.yr.o n = net.yr.o.k("powered");
   public static final net.yr.o W = net.yr.o.k("attached");
   public static final net.yr.o u = net.yr.o.k("disarmed");
   public static final net.yr.o D = net.yr.o.k("north");
   public static final net.yr.o R = net.yr.o.k("east");
   public static final net.yr.o i = net.yr.o.k("south");
   public static final net.yr.o A = net.yr.o.k("west");
   protected static final net.u.e N = new net.u.e(0.0D, 0.0625D, 0.0D, 1.0D, 0.15625D, 1.0D);
   protected static final net.u.e r = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

   public ly() {
      super(net.y1.l.c);
      this.r(this.b.T().s(n, Boolean.valueOf(false)).s(W, Boolean.valueOf(false)).s(u, Boolean.valueOf(false)).s(D, Boolean.valueOf(false)).s(R, Boolean.valueOf(false)).s(i, Boolean.valueOf(false)).s(A, Boolean.valueOf(false)));
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return !((Boolean)var1.i(W)).booleanValue()?r:N;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.s(D, Boolean.valueOf(X(var2, var3, var1, aq.NORTH))).s(R, Boolean.valueOf(X(var2, var3, var1, aq.EAST))).s(i, Boolean.valueOf(X(var2, var3, var1, aq.SOUTH))).s(A, Boolean.valueOf(X(var2, var3, var1, aq.WEST)));
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

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Yd;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.Yd);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var1.k(var2, var3, 3);
      this.r(var1, var2, var3);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.r(var1, var2, var3.s(n, Boolean.valueOf(true)));
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      if(!var1.x && !var4.S().B() && var4.S().Z() == net.nb.j.W5) {
         var1.k(var2, var3.s(u, Boolean.valueOf(true)), 4);
      }

   }

   private void r(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      for(aq var7 : new aq[]{aq.SOUTH, aq.WEST}) {
         int var8 = 1;

         while(true) {
            net.u.j var9 = var2.a(var7, var8);
            net.yw.n var10 = var1.Z(var9);
            if(var10.Q() == net.nb.f.d5) {
               if(var10.i(lr.D) == var7.f()) {
                  net.nb.f.d5.h(var1, var9, var10, false, true, var8, var3);
               }
               break;
            }

            if(var10.Q() != net.nb.f.u1) {
               break;
            }

            ++var8;
         }
      }

   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var1.x && !((Boolean)var3.i(n)).booleanValue()) {
         this.y(var1, var2);
      }

   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x && ((Boolean)var1.Z(var2).i(n)).booleanValue()) {
         this.y(var1, var2);
      }

   }

   private void y(net.yv.r var1, net.u.j var2) {
      net.yw.n var4 = var1.Z(var2);
      g3.v.w();
      boolean var5 = ((Boolean)var4.i(n)).booleanValue();
      boolean var6 = false;
      List var7 = var1.u((net.ne.l)null, var4.q(var1, var2).c(var2));
      if(!var7.isEmpty()) {
         Iterator var8 = var7.iterator();
         if(var8.hasNext()) {
            net.ne.l var9 = (net.ne.l)var8.next();
            if(!var9.v()) {
               var6 = true;
            }
         }
      }

      if(var6 != var5) {
         var4 = var4.s(n, Boolean.valueOf(var6));
         var1.k(var2, var4, 3);
         this.r(var1, var2, var4);
      }

   }

   public static boolean X(o8 var0, net.u.j var1, net.yw.n var2, aq var3) {
      net.u.j var4 = var1.C(var3);
      net.yw.n var5 = var0.Z(var4);
      l var6 = var5.Q();
      if(var6 == net.nb.f.d5) {
         aq var7 = var3.f();
         return var5.i(lr.D) == var7;
      } else {
         return var6 == net.nb.f.u1;
      }
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, Boolean.valueOf((var1 & 1) > 0)).s(W, Boolean.valueOf((var1 & 4) > 0)).s(u, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      if(((Boolean)var1.i(n)).booleanValue()) {
         var2 |= 1;
      }

      if(((Boolean)var1.i(W)).booleanValue()) {
         var2 |= 4;
      }

      if(((Boolean)var1.i(u)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.x[var2.ordinal()]) {
      case 1:
         return var1.s(D, var1.i(i)).s(R, var1.i(A)).s(i, var1.i(D)).s(A, var1.i(R));
      case 2:
         return var1.s(D, var1.i(R)).s(R, var1.i(i)).s(i, var1.i(A)).s(A, var1.i(D));
      case 3:
         return var1.s(D, var1.i(A)).s(R, var1.i(D)).s(i, var1.i(R)).s(A, var1.i(i));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.i[var2.ordinal()]) {
      case 1:
         return var1.s(D, var1.i(i)).s(i, var1.i(D));
      case 2:
         return var1.s(R, var1.i(A)).s(A, var1.i(R));
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n, W, u, D, R, A, i});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
