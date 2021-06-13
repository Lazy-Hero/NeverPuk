package net.y9;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.aq;
import net.yz.ax;

public class r2 extends z4 {
   public static final net.yr.w n = net.yr.g.l("facing");
   private final kw W;

   public r2(kw var1) {
      super(net.y1.l.z, net.y1.h.d);
      this.W = var1;
      this.f(net.ys.r.X);
      this.r(this.b.T().s(n, aq.UP));
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.e(this.W);
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean e(net.yw.n var1) {
      return true;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean j(net.yw.n var1) {
      return true;
   }

   public a5 o(net.yw.n var1) {
      return a5.ENTITYBLOCK_ANIMATED;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else if(var4.VX()) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.e) {
            aq var11 = (aq)var3.i(n);
            if(((net.ni.e)var10).C() == net.ni.e.CLOSED) {
               net.u.e var13 = I.T((double)(0.5F * (float)var11.v()), (double)(0.5F * (float)var11.z()), (double)(0.5F * (float)var11.P())).e((double)var11.v(), (double)var11.z(), (double)var11.P());
               boolean var12 = !var1.v(var13.c(var2.C(var11)));
            } else {
               boolean var14 = true;
            }

            var4.S(net.v.q.u);
            var4.n((net.nl.z1)var10);
            return true;
         } else {
            return false;
         }
      }
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(n, var3);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(n)).w();
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.l(var1);
      return this.p().s(n, var2);
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      if(var1.L(var2) instanceof net.ni.e) {
         net.ni.e var5 = (net.ni.e)var1.L(var2);
         var5.d(var4.a6.V);
         var5.r(var4);
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      if(var5.v()) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof net.ni.e) {
            ((net.ni.e)var6).b((String)var5.j());
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof net.ni.e) {
         net.ni.e var5 = (net.ni.e)var4;
         if(!var5.y() && var5.w()) {
            ks var6 = new ks(net.n0.y.q(this));
            net.nj.f var7 = new net.nj.f();
            net.nj.f var8 = new net.nj.f();
            var7.K("BlockEntityTag", ((net.ni.e)var4).D(var8));
            var6.t(var7);
            if(var5.H()) {
               var6.m(var5.Q());
               var5.b((String)"");
            }

            e(var1, var2, var6);
         }

         var1.Z(var2, var3.Q());
      }

      super.V(var1, var2, var3);
   }

   public void l(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      g3.v.w();
      super.l(var1, var2, var3, var4);
      net.nj.f var6 = var1.o();
      if(var6 != null && var6.K("BlockEntityTag", 10)) {
         net.nj.f var7 = var6.o("BlockEntityTag");
         if(var7.K("LootTable", 8)) {
            var3.add("???????");
         }

         if(var7.K("Items", 9)) {
            net.yz.w var8 = net.yz.w.C(27, ks.a);
            net.nl.h.W(var7, var8);
            int var9 = 0;
            int var10 = 0;
            Iterator var11 = var8.iterator();
            if(var11.hasNext()) {
               ks var12 = (ks)var11.next();
               if(!var12.B()) {
                  ++var10;
                  ++var9;
                  var3.add(String.format("%s x%d", new Object[]{var12.j(), Integer.valueOf(var12.U())}));
               }
            }

            int var10000 = var10 - var9;
         }
      }

   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.DESTROY;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      net.ni.v var4 = var2.L(var3);
      return var4 instanceof net.ni.e?((net.ni.e)var4).z(var1):I;
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.e((net.nl.z1)var2.L(var3));
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      ks var4 = super.N(var1, var2, var3);
      net.ni.e var5 = (net.ni.e)var1.L(var2);
      net.nj.f var6 = var5.D(new net.nj.f());
      if(!var6.N()) {
         var4.Q("BlockEntityTag", var6);
      }

      return var4;
   }

   public static kw B(net.n0.y var0) {
      return V(l.F(var0));
   }

   public static kw V(l var0) {
      return var0 instanceof r2?((r2)var0).x():kw.PURPLE;
   }

   public static l j(kw var0) {
      switch(null.o[var0.ordinal()]) {
      case 1:
         return net.nb.f.Tv;
      case 2:
         return net.nb.f.uH;
      case 3:
         return net.nb.f.TC;
      case 4:
         return net.nb.f.d3;
      case 5:
         return net.nb.f.dq;
      case 6:
         return net.nb.f.Tp;
      case 7:
         return net.nb.f.Z;
      case 8:
         return net.nb.f.dx;
      case 9:
         return net.nb.f.dC;
      case 10:
         return net.nb.f.Tw;
      case 11:
      default:
         return net.nb.f.u0;
      case 12:
         return net.nb.f.h;
      case 13:
         return net.nb.f.t;
      case 14:
         return net.nb.f.dk;
      case 15:
         return net.nb.f.dt;
      case 16:
         return net.nb.f.Te;
      }
   }

   public kw x() {
      return this.W;
   }

   public static ks M(kw var0) {
      return new ks(j(var0));
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(n)));
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      var2 = this.v(var2, var1, var3);
      aq var5 = (aq)var2.i(n);
      net.ni.e var6 = ((net.ni.e)var1.L(var3)).C();
      return var6 == net.ni.e.CLOSED || var6 == net.ni.e.OPENED && (var5 == var4.f() || var5 == var4)?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
