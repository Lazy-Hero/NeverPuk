package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gn;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public abstract class g2 extends rw {
   protected static final net.u.e p = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
   protected final boolean W;

   protected g2(boolean var1) {
      super(net.y1.l.c);
      this.W = var1;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return p;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).z() && super.J(var1, var2);
   }

   public boolean g(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).z();
   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!this.w(var1, var2, var3)) {
         boolean var6 = this.b(var1, var2, var3);
         if(this.W && !var6) {
            var1.k(var2, this.h(var3), 2);
         }

         if(!this.W) {
            var1.k(var2, this.w(var3), 2);
            if(!var6) {
               var1.V(var2, this.w(var3).Q(), this.K(var3), -1);
            }
         }
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4.r() != aq.l.Y;
   }

   protected boolean I(net.yw.n var1) {
      return this.W;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var1.M(var2, var3, var4);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !this.I(var1)?0:(var1.i(N) == var4?this.e(var2, var3, var1):0);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(this.g(var2, var3)) {
         this.z(var2, var3, var1);
      } else {
         this.N(var2, var3, var1, 0);
         var2.J(var3);

         for(aq var9 : aq.values()) {
            var2.b(var3.C(var9), this, false);
         }
      }

   }

   protected void z(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.w(var1, var2, var3)) {
         boolean var4 = this.b(var1, var2, var3);
         if(this.W != var4 && !var1.M(var2, this)) {
            byte var5 = -1;
            if(this.F(var1, var2, var3)) {
               var5 = -3;
            } else if(this.W) {
               var5 = -2;
            }

            var1.V(var2, this, this.j(var3), var5);
         }
      }

   }

   public boolean w(o8 var1, net.u.j var2, net.yw.n var3) {
      return false;
   }

   protected boolean b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return this.H(var1, var2, var3) > 0;
   }

   protected int H(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = (aq)var3.i(N);
      net.u.j var5 = var2.C(var4);
      int var6 = var1.f(var5, var4);
      if(var6 >= 15) {
         return var6;
      } else {
         net.yw.n var7 = var1.Z(var5);
         return Math.max(var6, var7.Q() == net.nb.f.dv?((Integer)var7.i(gn.J)).intValue():0);
      }
   }

   protected int x(o8 var1, net.u.j var2, net.yw.n var3) {
      aq var4 = (aq)var3.i(N);
      aq var5 = var4.R();
      aq var6 = var4.i();
      return Math.max(this.S(var1, var2.C(var5), var5), this.S(var1, var2.C(var6), var6));
   }

   protected int S(o8 var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      l var5 = var4.Q();
      return this.x(var4)?(var5 == net.nb.f.dL?15:(var5 == net.nb.f.dv?((Integer)var4.i(gn.J)).intValue():var1.N(var2, var3))):0;
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(N, var8.V().f());
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      if(this.b(var1, var2, var3)) {
         var1.c(var2, this, 1);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.q(var1, var2, var3);
   }

   protected void q(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = (aq)var3.i(N);
      net.u.j var5 = var2.C(var4.f());
      var1.H(var5, this, var2);
      var1.Q((net.u.j)var5, (l)this, var4);
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.W) {
         for(aq var7 : aq.values()) {
            var1.b(var2.C(var7), this, false);
         }
      }

      super.N(var1, var2, var3);
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   protected boolean x(net.yw.n var1) {
      return var1.o();
   }

   protected int e(o8 var1, net.u.j var2, net.yw.n var3) {
      return 15;
   }

   public static boolean R(net.yw.n var0) {
      return net.nb.f.dQ.g(var0) || net.nb.f.dA.g(var0);
   }

   public boolean g(net.yw.n var1) {
      l var2 = var1.Q();
      return var2 == this.w(this.p()).Q() || var2 == this.h(this.p()).Q();
   }

   public boolean F(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = ((aq)var3.i(N)).f();
      net.u.j var5 = var2.C(var4);
      return R(var1.Z(var5))?var1.Z(var5).i(N) != var4:false;
   }

   protected int K(net.yw.n var1) {
      return this.j(var1);
   }

   protected abstract int j(net.yw.n var1);

   protected abstract net.yw.n w(net.yw.n var1);

   protected abstract net.yw.n h(net.yw.n var1);

   public boolean a(l var1) {
      return this.g(var1.p());
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
