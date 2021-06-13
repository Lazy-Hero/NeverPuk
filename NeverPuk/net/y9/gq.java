package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class gq extends l {
   public static final net.yr.l R = net.yr.l.J("age", 0, 15);
   protected static final net.u.e Q = new net.u.e(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);

   protected gq() {
      super(net.y1.l.u);
      this.r(this.b.T().s(R, Integer.valueOf(0)));
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return Q;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if((var1.Z(var2.b()).Q() == net.nb.f.dF || this.W(var1, var2, var3)) && var1.y(var2.h())) {
         int var6 = 1;
         if(var1.Z(var2.p(var6)).Q() == this) {
            ++var6;
         }

         int var7 = ((Integer)var3.i(R)).intValue();
         if(var7 == 15) {
            var1.U(var2.h(), this.p());
            var1.k(var2, var3.s(R, Integer.valueOf(0)), 4);
         }

         var1.k(var2, var3.s(R, Integer.valueOf(var7 + 1)), 4);
      }

   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      l var3 = var1.Z(var2.b()).Q();
      if(var3 == this) {
         return true;
      } else if(var3 != net.nb.f.p && var3 != net.nb.f.dl && var3 != net.nb.f.TF) {
         return false;
      } else {
         net.u.j var4 = var2.b();

         for(aq var6 : aq.u.HORIZONTAL) {
            net.yw.n var7 = var1.Z(var4.C(var6));
            if(var7.n() == net.y1.l.p || var7.Q() == net.nb.f.uu) {
               return true;
            }
         }

         return false;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.W(var2, var3, var1);
   }

   protected final boolean W(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.b(var1, var2)) {
         return true;
      } else {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      }
   }

   public boolean b(net.yv.r var1, net.u.j var2) {
      return this.J(var1, var2);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.q);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(R, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(R)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{R});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
