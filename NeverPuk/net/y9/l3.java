package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yz.aq;

public class l3 extends l {
   public static final net.yr.o R = net.yr.o.k("explode");

   public l3() {
      super(net.y1.l.O);
      this.r(this.b.T().s(R, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      if(var1.B(var2)) {
         this.N(var1, var2, var3.s(R, Boolean.valueOf(true)));
         var1.J(var2);
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(var2.B(var3)) {
         this.N(var2, var3, var1.s(R, Boolean.valueOf(true)));
         var2.J(var3);
      }

   }

   public void S(net.yv.r var1, net.u.j var2, net.yv.u var3) {
      if(!var1.x) {
         net.nm.k var4 = new net.nm.k(var1, (double)((float)var2.t() + 0.5F), (double)var2.h(), (double)((float)var2.y() + 0.5F), var3.s());
         var4.d((short)(var1.G.nextInt(var4.z() / 4) + var4.z() / 8));
         var1.S(var4);
      }

   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.d(var1, var2, var3, (net.ne.a)null);
   }

   public void d(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4) {
      if(!var1.x && ((Boolean)var3.i(R)).booleanValue()) {
         net.nm.k var5 = new net.nm.k(var1, (double)((float)var2.t() + 0.5F), (double)var2.h(), (double)((float)var2.y() + 0.5F), var4);
         var1.S(var5);
         var1.L((net.r.r)null, var5.b, var5.hS, var5.hr, net.nb.l.H8, net.yz.p.BLOCKS, 1.0F, 1.0F);
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      g3.v.w();
      ks var11 = var4.o((net.yz.k)var5);
      if(!var11.B() && (var11.Z() == net.nb.j.YU || var11.Z() == net.nb.j.Yu)) {
         this.d(var1, var2, var3.s(R, Boolean.valueOf(true)), var4);
         var1.k(var2, net.nb.f.ou.p(), 11);
         if(var11.Z() == net.nb.j.YU) {
            var11.S(1, var4);
         }

         if(!var4.a6.V) {
            var11.H(1);
         }

         return true;
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var1.x && var4 instanceof net.n1.o) {
         net.n1.o var5 = (net.n1.o)var4;
         if(var5.a()) {
            this.d(var1, var2, var1.Z(var2).s(R, Boolean.valueOf(true)), var5.kx instanceof net.ne.a?(net.ne.a)var5.kx:null);
            var1.J(var2);
         }
      }

   }

   public boolean q(net.yv.u var1) {
      return false;
   }

   public net.yw.n D(int var1) {
      return this.p().s(R, Boolean.valueOf((var1 & 1) > 0));
   }

   public int d(net.yw.n var1) {
      return ((Boolean)var1.i(R)).booleanValue()?1:0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{R});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
