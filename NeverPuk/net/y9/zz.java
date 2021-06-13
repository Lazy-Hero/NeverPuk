package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.ru;
import net.y9.z4;
import net.yz.a5;
import net.yz.aq;
import net.yz.ax;

public class zz extends z4 {
   public static final net.yr.g H = ru.n;
   public static final net.yr.o J = net.yr.o.k("triggered");
   public static final net.c.j f = new net.c.j(new net.n4.y());
   protected Random v = new Random();

   protected zz() {
      super(net.y1.l.z);
      this.r(this.b.T().s(H, aq.NORTH).s(J, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
   }

   public int u(net.yv.r var1) {
      return 4;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      this.D(var1, var2, var3);
   }

   private void D(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!var1.x) {
         aq var5 = (aq)var3.i(H);
         boolean var6 = var1.Z(var2.D()).E();
         boolean var7 = var1.Z(var2.d()).E();
         if(var5 == aq.NORTH && var6 && !var7) {
            var5 = aq.SOUTH;
         }

         if(var5 == aq.SOUTH && var7 && !var6) {
            var5 = aq.NORTH;
         }

         boolean var8 = var1.Z(var2.H()).E();
         boolean var9 = var1.Z(var2.g()).E();
         if(var5 == aq.WEST && var8 && !var9) {
            var5 = aq.EAST;
         }

         if(var5 == aq.EAST && var9 && !var8) {
            var5 = aq.WEST;
         }

         var1.k(var2, var3.s(H, var5).s(J, Boolean.valueOf(false)), 2);
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.p) {
            var4.n((net.ni.p)var10);
            if(var10 instanceof net.ni.x) {
               var4.S(net.v.q.i);
            } else {
               var4.S(net.v.q.gz);
            }
         }

         return true;
      }
   }

   protected void o(net.yv.r var1, net.u.j var2) {
      net.y9.z var3 = new net.y9.z(var1, var2);
      net.ni.p var4 = (net.ni.p)var3.L();
      int var5 = var4.b();
      var1.s(1001, var2, 0);
   }

   protected net.n4.k H(ks var1) {
      return (net.n4.k)f.B(var1.Z());
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.B(var3) && !var2.B(var3.h())) {
         boolean var8 = false;
      } else {
         boolean var10000 = true;
      }

      boolean var7 = ((Boolean)var1.i(J)).booleanValue();
      var2.c(var3, this, this.u(var2));
      var2.k(var3, var1.s(J, Boolean.valueOf(true)), 4);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         this.o(var1, var2);
      }

   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.p();
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(H, aq.i(var2, var8)).s(J, Boolean.valueOf(false));
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      var1.k(var2, var3.s(H, aq.i(var2, var4)), 2);
      if(var5.v()) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof net.ni.p) {
            ((net.ni.p)var6).b(var5.j());
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof net.ni.p) {
         net.nl.z3.Z(var1, var2, (net.ni.p)var4);
         var1.Z((net.u.j)var2, (l)this);
      }

      super.V(var1, var2, var3);
   }

   public static net.n4.h S(net.n4.i var0) {
      aq var1 = (aq)var0.K().i(H);
      double var2 = var0.e() + 0.7D * (double)var1.v();
      double var4 = var0.A() + 0.7D * (double)var1.z();
      double var6 = var0.x() + 0.7D * (double)var1.P();
      return new net.n4.q(var2, var4, var6);
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.D(var2.L(var3));
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.yw.n D(int var1) {
      return this.p().s(H, aq.l(var1 & 7)).s(J, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(H)).w();
      if(((Boolean)var1.i(J)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(H, var2.d((aq)var1.i(H)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(H)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{H, J});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
