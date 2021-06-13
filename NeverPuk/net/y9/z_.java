package net.y9;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.aq;
import net.yz.ax;

public class z_ extends z4 {
   public static final net.yr.g R = rw.N;
   protected static final net.u.e r = new net.u.e(0.0625D, 0.0D, 0.0D, 0.9375D, 0.875D, 0.9375D);
   protected static final net.u.e O = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 1.0D);
   protected static final net.u.e D = new net.u.e(0.0D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D);
   protected static final net.u.e E = new net.u.e(0.0625D, 0.0D, 0.0625D, 1.0D, 0.875D, 0.9375D);
   protected static final net.u.e k = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D);
   public final z_.o a;

   protected z_(z_.o var1) {
      super(net.y1.l.S);
      this.r(this.b.T().s(R, aq.NORTH));
      this.a = var1;
      this.f(var1 == z_.o.TRAP?net.ys.r.i:net.ys.r.X);
   }

   public boolean V(net.yw.n var1) {
      return false;
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

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return var2.Z(var3.D()).Q() == this?r:(var2.Z(var3.d()).Q() == this?O:(var2.Z(var3.H()).Q() == this?D:(var2.Z(var3.g()).Q() == this?E:k)));
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.W(var1, var2, var3);

      for(aq var5 : aq.u.HORIZONTAL) {
         net.u.j var6 = var2.C(var5);
         net.yw.n var7 = var1.Z(var6);
         if(var7.Q() == this) {
            this.W(var1, var6, var7);
         }
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(R, var8.V());
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      aq var6 = aq.Q(net.u.t.L((double)(var4.hN * 4.0F / 360.0F) + 0.5D) & 3).f();
      var3 = var3.s(R, var6);
      net.u.j var7 = var2.D();
      net.u.j var8 = var2.d();
      net.u.j var9 = var2.H();
      net.u.j var10 = var2.g();
      boolean var11 = this == var1.Z(var7).Q();
      boolean var12 = this == var1.Z(var8).Q();
      boolean var13 = this == var1.Z(var9).Q();
      boolean var14 = this == var1.Z(var10).Q();
      var1.k(var2, var3, 3);
      if(var5.v()) {
         net.ni.v var15 = var1.L(var2);
         if(var15 instanceof net.ni.k) {
            ((net.ni.k)var15).b((String)var5.j());
         }
      }

   }

   public net.yw.n W(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(var1.x) {
         return var3;
      } else {
         net.yw.n var5 = var1.Z(var2.D());
         net.yw.n var6 = var1.Z(var2.d());
         net.yw.n var7 = var1.Z(var2.H());
         net.yw.n var8 = var1.Z(var2.g());
         aq var9 = (aq)var3.i(R);
         if(var5.Q() != this && var6.Q() != this) {
            boolean var10 = var5.E();
            boolean var11 = var6.E();
            if(var7.Q() == this || var8.Q() == this) {
               net.u.j var12 = var7.Q() == this?var2.H():var2.g();
               net.yw.n var13 = var1.Z(var12.D());
               net.yw.n var14 = var1.Z(var12.d());
               var9 = aq.SOUTH;
               if(var7.Q() == this) {
                  aq var15 = (aq)var7.i(R);
               }

               aq var27 = (aq)var8.i(R);
               if(var27 == aq.NORTH) {
                  var9 = aq.NORTH;
               }

               if((var10 || var13.E()) && !var11 && !var14.E()) {
                  var9 = aq.SOUTH;
               }

               if((var11 || var14.E()) && !var10 && !var13.E()) {
                  var9 = aq.NORTH;
               }
            }
         }

         net.u.j var22 = var5.Q() == this?var2.D():var2.d();
         net.yw.n var23 = var1.Z(var22.H());
         net.yw.n var24 = var1.Z(var22.g());
         var9 = aq.EAST;
         if(var5.Q() == this) {
            aq var25 = (aq)var5.i(R);
         }

         aq var26 = (aq)var6.i(R);
         if(var26 == aq.WEST) {
            var9 = aq.WEST;
         }

         if((var7.E() || var23.E()) && !var8.E() && !var24.E()) {
            var9 = aq.EAST;
         }

         if((var8.E() || var24.E()) && !var7.E() && !var23.E()) {
            var9 = aq.WEST;
         }

         var3 = var3.s(R, var9);
         var1.k(var2, var3, 3);
         return var3;
      }
   }

   public net.yw.n p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      Object var4 = null;

      for(aq var6 : aq.u.HORIZONTAL) {
         net.yw.n var7 = var1.Z(var2.C(var6));
         if(var7.Q() == this) {
            return var3;
         }

         if(var7.E()) {
            var4 = null;
            break;
         }
      }

      return var3.s(R, ((aq)var4).f());
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      int var3 = 0;
      net.u.j var4 = var2.H();
      net.u.j var5 = var2.g();
      net.u.j var6 = var2.D();
      net.u.j var7 = var2.d();
      if(var1.Z(var4).Q() == this) {
         if(this.a(var1, var4)) {
            return false;
         }

         ++var3;
      }

      if(var1.Z(var5).Q() == this) {
         if(this.a(var1, var5)) {
            return false;
         }

         ++var3;
      }

      if(var1.Z(var6).Q() == this) {
         if(this.a(var1, var6)) {
            return false;
         }

         ++var3;
      }

      if(var1.Z(var7).Q() == this) {
         if(this.a(var1, var7)) {
            return false;
         }

         ++var3;
      }

      return true;
   }

   private boolean a(net.yv.r var1, net.u.j var2) {
      if(var1.Z(var2).Q() != this) {
         return false;
      } else {
         for(aq var4 : aq.u.HORIZONTAL) {
            if(var1.Z(var2.C(var4)).Q() == this) {
               return true;
            }
         }

         return false;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      super.Z(var1, var2, var3, var4, var5);
      net.ni.v var6 = var2.L(var3);
      if(var6 instanceof net.ni.k) {
         var6.K();
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof net.nl.z1) {
         net.nl.z3.Z(var1, var2, (net.nl.z1)var4);
         var1.Z((net.u.j)var2, (l)this);
      }

      super.V(var1, var2, var3);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.yv.x var10 = this.p(var1, var2);
         var4.n(var10);
         if(this.a == z_.o.BASIC) {
            var4.S(net.v.q.A);
         } else if(this.a == z_.o.TRAP) {
            var4.S(net.v.q.G);
         }

         return true;
      }
   }

   @Nullable
   public net.yv.x p(net.yv.r var1, net.u.j var2) {
      return this.v(var1, var2, false);
   }

   @Nullable
   public net.yv.x v(net.yv.r var1, net.u.j var2, boolean var3) {
      net.ni.v var4 = var1.L(var2);
      if(!(var4 instanceof net.ni.k)) {
         return null;
      } else {
         Object var5 = (net.ni.k)var4;
         if(this.V(var1, var2)) {
            return null;
         } else {
            for(aq var7 : aq.u.HORIZONTAL) {
               net.u.j var8 = var2.C(var7);
               l var9 = var1.Z(var8).Q();
               if(var9 == this) {
                  if(this.V(var1, var8)) {
                     return null;
                  }

                  net.ni.v var10 = var1.L(var8);
                  if(var10 instanceof net.ni.k) {
                     if(var7 != aq.WEST && var7 != aq.NORTH) {
                        var5 = new net.nl.x("container.chestDouble", (net.yv.x)var5, (net.ni.k)var10);
                     } else {
                        var5 = new net.nl.x("container.chestDouble", (net.ni.k)var10, (net.yv.x)var5);
                     }
                  }
               }
            }

            return (net.yv.x)var5;
         }
      }
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.k();
   }

   public boolean s(net.yw.n var1) {
      return this.a == z_.o.TRAP;
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      if(!var1.o()) {
         return 0;
      } else {
         int var5 = 0;
         net.ni.v var6 = var2.L(var3);
         if(var6 instanceof net.ni.k) {
            var5 = ((net.ni.k)var6).x;
         }

         return net.u.t.g(var5, 0, 15);
      }
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4 == aq.UP?var1.M(var2, var3, var4):0;
   }

   private boolean V(net.yv.r var1, net.u.j var2) {
      return this.N(var1, var2) || this.w(var1, var2);
   }

   private boolean N(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.h()).i();
   }

   private boolean w(net.yv.r var1, net.u.j var2) {
      for(net.ne.l var4 : var1.p(net.yn.g.class, new net.u.e((double)var2.t(), (double)(var2.h() + 1), (double)var2.y(), (double)(var2.t() + 1), (double)(var2.h() + 2), (double)(var2.y() + 1)))) {
         net.yn.g var5 = (net.yn.g)var4;
         if(var5.Ke()) {
            return true;
         }
      }

      return false;
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.e(this.p(var2, var3));
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.l(var1);
      if(var2.r() == aq.l.Y) {
         var2 = aq.NORTH;
      }

      return this.p().s(R, var2);
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(R)).w();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(R, var2.d((aq)var1.i(R)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(R)));
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

   public static enum o {
      BASIC,
      TRAP;
   }
}
