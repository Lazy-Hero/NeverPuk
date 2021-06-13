package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.rv;
import net.y9.rz;
import net.yv.o8;
import net.yz.aq;

public class ry extends l {
   protected static final net.u.e Y = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.9375D, 1.0D);

   protected ry() {
      super(net.y1.l.E);
      this.R(255);
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      int[] var5 = g3.v.w();
      switch(null.M[var4.ordinal()]) {
      case 1:
         return true;
      case 2:
      case 3:
      case 4:
      case 5:
         net.yw.n var6 = var2.Z(var3.C(var4));
         l var7 = var6.Q();
         return !var6.j() && var7 != net.nb.f.dJ && var7 != net.nb.f.A;
      default:
         return super.v(var1, var2, var3, var4);
      }
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      this.y(var1, var2);
   }

   private void y(net.yv.r var1, net.u.j var2) {
      int[] var3 = g3.v.w();
      if(var1.Z(var2.h()).n().B()) {
         rz.N(var1, var2);
      }

   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return Y;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.f.dl.X(net.nb.f.dl.p().s(rv.l, rv.m.DIRT), var2, var3);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      super.Z(var1, var2, var3, var4, var5);
      this.y(var2, var3);
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
