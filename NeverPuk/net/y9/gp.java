package net.y9;

import java.util.Iterator;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class gp extends l {
   public static final net.yr.g i = rw.N;
   protected static final net.u.e O = new net.u.e(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
   protected static final net.u.e N = new net.u.e(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e a = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
   protected static final net.u.e D = new net.u.e(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);

   protected gp() {
      super(net.y1.l.c);
      this.r(this.b.T().s(i, aq.NORTH));
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.q[((aq)var1.i(i)).ordinal()]) {
      case 1:
         return D;
      case 2:
         return a;
      case 3:
         return N;
      case 4:
      default:
         return O;
      }
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return this.T(var1, var2.H(), var3)?true:(this.T(var1, var2.g(), var3)?true:(this.T(var1, var2.D(), var3)?true:this.T(var1, var2.d(), var3)));
   }

   private boolean T(net.yv.r var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      boolean var5 = m(var4.Q());
      return var4.B(var1, var2, var3) == net.yw.g.SOLID && !var4.o();
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      int[] var9 = g3.v.w();
      if(var3.r().P() && this.T(var1, var2.C(var3.f()), var3)) {
         return this.p().s(i, var3);
      } else {
         Iterator var10 = aq.u.HORIZONTAL.iterator();
         if(var10.hasNext()) {
            aq var11 = (aq)var10.next();
            if(this.T(var1, var2.C(var11.f()), var11)) {
               return this.p().s(i, var11);
            }
         }

         return this.p();
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      aq var6 = (aq)var1.i(i);
      if(!this.T(var2, var3.C(var6.f()), var6)) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

      super.Z(var1, var2, var3, var4, var5);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.l(var1);
      if(var2.r() == aq.l.Y) {
         var2 = aq.NORTH;
      }

      return this.p().s(i, var2);
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(i)).w();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(i, var2.d((aq)var1.i(i)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(i)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{i});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
