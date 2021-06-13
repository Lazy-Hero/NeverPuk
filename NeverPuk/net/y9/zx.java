package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;

public class zx extends l {
   public static final net.yr.l E = net.yr.l.J("level", 0, 3);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D);
   protected static final net.u.e n = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.125D);
   protected static final net.u.e H = new net.u.e(0.0D, 0.0D, 0.875D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e l = new net.u.e(0.875D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e h = new net.u.e(0.0D, 0.0D, 0.0D, 0.125D, 1.0D, 1.0D);

   public zx() {
      super(net.y1.l.i, net.y1.h.q);
      this.r(this.b.T().s(E, Integer.valueOf(0)));
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      F(var3, var4, var5, u);
      F(var3, var4, var5, h);
      F(var3, var4, var5, n);
      F(var3, var4, var5, l);
      F(var3, var4, var5, H);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return I;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      int var5 = ((Integer)var3.i(E)).intValue();
      float var6 = (float)var2.h() + (6.0F + (float)(3 * var5)) / 16.0F;
      if(!var1.x && var4.a() && var4.i().u <= (double)var6) {
         var4.e();
         this.c(var1, var2, var3, var5 - 1);
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      g3.v.w();
      ks var11 = var4.o((net.yz.k)var5);
      if(var11.B()) {
         return true;
      } else {
         int var12 = ((Integer)var3.i(E)).intValue();
         net.n0.y var13 = var11.Z();
         if(var13 == net.nb.j.Wb) {
            if(var12 < 3 && !var1.x) {
               if(!var4.a6.V) {
                  var4.e(var5, new ks(net.nb.j.YF));
               }

               var4.S(net.v.q.O);
               this.c(var1, var2, var3, 3);
               var1.M((net.r.r)null, var2, net.nb.l.PQ, net.yz.p.BLOCKS, 1.0F, 1.0F);
            }

            return true;
         } else if(var13 == net.nb.j.YF) {
            if(var12 == 3 && !var1.x) {
               if(!var4.a6.V) {
                  var11.H(1);
                  if(var11.B()) {
                     var4.e(var5, new ks(net.nb.j.Wb));
                  }

                  if(!var4.a8.D(new ks(net.nb.j.Wb))) {
                     var4.Y(new ks(net.nb.j.Wb), false);
                  }
               }

               var4.S(net.v.q.gr);
               this.c(var1, var2, var3, 0);
               var1.M((net.r.r)null, var2, net.nb.l.M8, net.yz.p.BLOCKS, 1.0F, 1.0F);
            }

            return true;
         } else if(var13 == net.nb.j.SG) {
            if(var12 > 0 && !var1.x) {
               if(!var4.a6.V) {
                  ks var17 = net.n_.y.b(new ks(net.nb.j.I), net.nb.w.d);
                  var4.S(net.v.q.gr);
                  var11.H(1);
                  if(var11.B()) {
                     var4.e(var5, var17);
                  }

                  if(!var4.a8.D(var17)) {
                     var4.Y(var17, false);
                  }

                  if(var4 instanceof net.r.h) {
                     ((net.r.h)var4).J(var4.aW);
                  }
               }

               var1.M((net.r.r)null, var2, net.nb.l.wB, net.yz.p.BLOCKS, 1.0F, 1.0F);
               this.c(var1, var2, var3, var12 - 1);
            }

            return true;
         } else if(var13 == net.nb.j.I && net.n_.y.h(var11) == net.nb.w.d) {
            if(var12 < 3 && !var1.x) {
               if(!var4.a6.V) {
                  ks var16 = new ks(net.nb.j.SG);
                  var4.S(net.v.q.gr);
                  var4.e(var5, var16);
                  if(var4 instanceof net.r.h) {
                     ((net.r.h)var4).J(var4.aW);
                  }
               }

               var1.M((net.r.r)null, var2, net.nb.l.wa, net.yz.p.BLOCKS, 1.0F, 1.0F);
               this.c(var1, var2, var3, var12 + 1);
            }

            return true;
         } else {
            if(var12 > 0 && var13 instanceof net.n0.j) {
               net.n0.j var14 = (net.n0.j)var13;
               if(var14.R() == net.n0.j.LEATHER && var14.G(var11) && !var1.x) {
                  var14.k(var11);
                  this.c(var1, var2, var3, var12 - 1);
                  var4.S(net.v.q.S);
                  return true;
               }
            }

            if(var12 > 0 && var13 instanceof net.n0.c) {
               if(net.ni.g.h(var11) > 0 && !var1.x) {
                  ks var15 = var11.s();
                  var15.u(1);
                  net.ni.g.D(var15);
                  var4.S(net.v.q.c);
                  if(!var4.a6.V) {
                     var11.H(1);
                     this.c(var1, var2, var3, var12 - 1);
                  }

                  if(var11.B()) {
                     var4.e(var5, var15);
                  }

                  if(!var4.a8.D(var15)) {
                     var4.Y(var15, false);
                  }

                  if(var4 instanceof net.r.h) {
                     ((net.r.h)var4).J(var4.aW);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   public void c(net.yv.r var1, net.u.j var2, net.yw.n var3, int var4) {
      var1.k(var2, var3.s(E, Integer.valueOf(net.u.t.g(var4, 0, 3))), 2);
      var1.Z((net.u.j)var2, (l)this);
   }

   public void R(net.yv.r var1, net.u.j var2) {
      if(var1.G.nextInt(20) == 1) {
         float var3 = var1.P(var2).D(var2);
         if(var1.V().H(var3, var2.h()) >= 0.15F) {
            net.yw.n var4 = var1.Z(var2);
            if(((Integer)var4.i(E)).intValue() < 3) {
               var1.k(var2, var4.C(E), 2);
            }
         }
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.W3;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.W3);
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return ((Integer)var1.i(E)).intValue();
   }

   public net.yw.n D(int var1) {
      return this.p().s(E, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(E)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{E});
   }

   public boolean c(o8 var1, net.u.j var2) {
      return true;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.UP?net.yw.g.BOWL:(var4 == aq.DOWN?net.yw.g.UNDEFINED:net.yw.g.SOLID);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
