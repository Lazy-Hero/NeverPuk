package net.y9;

import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.gc;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class re extends rw {
   public static final net.yr.o A = net.yr.o.k("open");
   public static final net.yr.o W = net.yr.o.k("powered");
   public static final net.yr.o O = net.yr.o.k("in_wall");
   protected static final net.u.e E = new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);
   protected static final net.u.e d = new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D);
   protected static final net.u.e o = new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 0.8125D, 0.625D);
   protected static final net.u.e J = new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 0.8125D, 1.0D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D);
   protected static final net.u.e H = new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 1.0D);

   public re(gc.i var1) {
      super(net.y1.l.S, var1.t());
      this.r(this.b.T().s(A, Boolean.valueOf(false)).s(W, Boolean.valueOf(false)).s(O, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = this.v(var1, var2, var3);
      return ((Boolean)var1.i(O)).booleanValue()?(((aq)var1.i(N)).r() == aq.l.X?J:o):(((aq)var1.i(N)).r() == aq.l.X?d:E);
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      aq.l var4 = ((aq)var1.i(N)).r();
      if(var4 == aq.l.Z && (var2.Z(var3.H()).Q() == net.nb.f.od || var2.Z(var3.g()).Q() == net.nb.f.od) || var4 == aq.l.X && (var2.Z(var3.D()).Q() == net.nb.f.od || var2.Z(var3.d()).Q() == net.nb.f.od)) {
         var1 = var1.s(O, Boolean.valueOf(true));
      }

      return var1;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).n().B() && super.J(var1, var2);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((Boolean)var1.i(A)).booleanValue()?q:(((aq)var1.i(N)).r() == aq.l.Z?u:H);
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return ((Boolean)var1.Z(var2).i(A)).booleanValue();
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      boolean var9 = var1.B(var2);
      return this.p().s(N, var8.V()).s(A, Boolean.valueOf(var9)).s(W, Boolean.valueOf(var9)).s(O, Boolean.valueOf(false));
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(((Boolean)var3.i(A)).booleanValue()) {
         var3 = var3.s(A, Boolean.valueOf(false));
         var1.k(var2, var3, 10);
      }

      aq var11 = aq.d((double)var4.hN);
      if(var3.i(N) == var11.f()) {
         var3 = var3.s(N, var11);
      }

      var3 = var3.s(A, Boolean.valueOf(true));
      var1.k(var2, var3, 10);
      var1.N(var4, ((Boolean)var3.i(A)).booleanValue()?1008:1014, var2, 0);
      return true;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         boolean var6 = var2.B(var3);
         if(((Boolean)var1.i(W)).booleanValue() != var6) {
            var2.k(var3, var1.s(W, Boolean.valueOf(var6)).s(A, Boolean.valueOf(var6)), 2);
            if(((Boolean)var1.i(A)).booleanValue() != var6) {
               var2.N((net.r.r)null, 1008, var3, 0);
            }
         }
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1)).s(A, Boolean.valueOf((var1 & 4) != 0)).s(W, Boolean.valueOf((var1 & 8) != 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      if(((Boolean)var1.i(W)).booleanValue()) {
         var2 |= 8;
      }

      if(((Boolean)var1.i(A)).booleanValue()) {
         var2 |= 4;
      }

      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, A, W, O});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 != aq.UP && var4 != aq.DOWN?(((aq)var2.i(N)).r() == var4.R().r()?net.yw.g.MIDDLE_POLE:net.yw.g.UNDEFINED):net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
