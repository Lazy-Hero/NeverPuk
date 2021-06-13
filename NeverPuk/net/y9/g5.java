package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.y9.g0;
import net.y9.g3;
import net.y9.gx;
import net.y9.l;
import net.y9.l_;
import net.yv.o8;
import net.yz.a5;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;

public abstract class g5 extends l {
   public static final net.yr.l J = net.yr.l.J("level", 0, 15);

   protected g5(net.y1.l var1) {
      super(var1);
      this.r(this.b.T().s(J, Integer.valueOf(0)));
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return I;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return this.C != net.y1.l.U;
   }

   public static float P(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      return (float)(var0 + 1) / 9.0F;
   }

   protected int P(net.yw.n var1) {
      return var1.n() == this.C?((Integer)var1.i(J)).intValue():-1;
   }

   protected int j(net.yw.n var1) {
      int var2 = this.P(var1);
      return var2 >= 8?0:var2;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean f(net.yw.n var1, boolean var2) {
      return ((Integer)var1.i(J)).intValue() == 0;
   }

   private boolean T(o8 var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      l var5 = var4.Q();
      net.y1.l var6 = var4.n();
      if(var6 == this.C) {
         return false;
      } else if(var3 == aq.UP) {
         return true;
      } else if(var6 == net.y1.l.V) {
         return false;
      } else {
         boolean var7 = m(var5) || var5 instanceof l_;
         return var4.B(var1, var2, var3) == net.yw.g.SOLID;
      }
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var2.Z(var3.C(var4)).n() == this.C?false:var4 == aq.UP || super.v(var1, var2, var3, var4);
   }

   public boolean J(o8 var1, net.u.j var2) {
      byte var3 = -1;
      int var4 = -1;

      while(true) {
         net.yw.n var5 = var1.Z(var2.F(var3, 0, var4));
         if(var5.n() != this.C && !var5.E()) {
            return true;
         }

         ++var4;
      }
   }

   public a5 o(net.yw.n var1) {
      return a5.LIQUID;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public int T(Random var1) {
      return 0;
   }

   protected net.u.r U(o8 var1, net.u.j var2, net.yw.n var3) {
      double var4 = 0.0D;
      double var6 = 0.0D;
      double var8 = 0.0D;
      int var10 = this.j(var3);
      net.u.j var11 = net.u.j.u();

      for(aq var13 : aq.u.HORIZONTAL) {
         var11.G(var2).O(var13);
         int var14 = this.j(var1.Z(var11));
         if(!var1.Z(var11).n().f()) {
            var14 = this.j(var1.Z(var11.b()));
            int var15 = var14 - (var10 - 8);
            var4 += (double)(var13.v() * var15);
            var6 += (double)(var13.z() * var15);
            var8 += (double)(var13.P() * var15);
         }
      }

      net.u.r var16 = new net.u.r(var4, var6, var8);
      if(((Integer)var3.i(J)).intValue() >= 8) {
         for(aq var19 : aq.u.HORIZONTAL) {
            var11.G(var2).O(var19);
            if(this.T(var1, var11, var19) || this.T(var1, var11.h(), var19)) {
               var16 = var16.I().s(0.0D, -6.0D, 0.0D);
               break;
            }
         }
      }

      var11.T();
      return var16.I();
   }

   public net.u.r V(net.yv.r var1, net.u.j var2, net.ne.l var3, net.u.r var4) {
      return var4.v(this.U(var1, var2, var1.Z(var2)));
   }

   public int u(net.yv.r var1) {
      return this.C == net.y1.l.p?5:(this.C == net.y1.l.U?(var1.F.k()?10:30):0);
   }

   public int w(net.yw.n var1, o8 var2, net.u.j var3) {
      int var4 = var2.z(var3, 0);
      int var5 = var2.z(var3.h(), 0);
      int var6 = var4 & 255;
      int var7 = var5 & 255;
      int var8 = var4 >> 16 & 255;
      int var9 = var5 >> 16 & 255;
      return (var6 > var7?var6:var7) | (var8 > var9?var8:var9) << 16;
   }

   public ac k() {
      return this.C == net.y1.l.p?ac.TRANSLUCENT:ac.SOLID;
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      g3.v.w();
      double var6 = (double)var3.t();
      double var8 = (double)var3.h();
      double var10 = (double)var3.y();
      if(this.C == net.y1.l.p) {
         label42: {
            int var12 = ((Integer)var1.i(J)).intValue();
            if(var12 > 0 && var12 < 8) {
               if(var4.nextInt(64) != 0) {
                  break label42;
               }

               var2.m(var6 + 0.5D, var8 + 0.5D, var10 + 0.5D, net.nb.l.Pj, net.yz.p.BLOCKS, var4.nextFloat() * 0.25F + 0.75F, var4.nextFloat() + 0.5F, false);
            }

            if(var4.nextInt(10) == 0) {
               var2.n(ai.SUSPENDED, var6 + (double)var4.nextFloat(), var8 + (double)var4.nextFloat(), var10 + (double)var4.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
            }
         }
      }

      if(this.C == net.y1.l.U && var2.Z(var3.h()).n() == net.y1.l.q && !var2.Z(var3.h()).j()) {
         if(var4.nextInt(100) == 0) {
            double var19 = var6 + (double)var4.nextFloat();
            double var14 = var8 + var1.q(var2, var3).c;
            double var16 = var10 + (double)var4.nextFloat();
            var2.n(ai.LAVA, var19, var14, var16, 0.0D, 0.0D, 0.0D, new int[0]);
            var2.m(var19, var14, var16, net.nb.l.Cx, net.yz.p.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }

         if(var4.nextInt(200) == 0) {
            var2.m(var6, var8, var10, net.nb.l.X, net.yz.p.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }
      }

      if(var4.nextInt(10) == 0 && var2.Z(var3.b()).z()) {
         net.y1.l var20 = var2.Z(var3.p(2)).n();
         if(!var20.f() && !var20.y()) {
            double var13 = var6 + (double)var4.nextFloat();
            double var15 = var8 - 1.05D;
            double var17 = var10 + (double)var4.nextFloat();
            if(this.C == net.y1.l.p) {
               var2.n(ai.DRIP_WATER, var13, var15, var17, 0.0D, 0.0D, 0.0D, new int[0]);
            }

            var2.n(ai.DRIP_LAVA, var13, var15, var17, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      }

   }

   public static float M(o8 var0, net.u.j var1, net.y1.l var2, net.yw.n var3) {
      net.u.r var4 = Y(var2).U(var0, var1, var3);
      return var4.p == 0.0D && var4.a == 0.0D?-1000.0F:(float)net.u.t.V(var4.a, var4.p) - 1.5707964F;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.r(var1, var2, var3);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.r(var2, var3, var1);
   }

   public boolean r(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.C == net.y1.l.U) {
         boolean var4 = false;

         for(aq var8 : aq.values()) {
            if(var8 != aq.DOWN && var1.Z(var2.C(var8)).n() == net.y1.l.p) {
               var4 = true;
               break;
            }
         }

         Integer var10 = (Integer)var3.i(J);
         if(var10.intValue() == 0) {
            var1.U(var2, net.nb.f.c.p());
            this.N(var1, var2);
            return true;
         }

         if(var10.intValue() <= 4) {
            var1.U(var2, net.nb.f.TD.p());
            this.N(var1, var2);
            return true;
         }
      }

      return false;
   }

   protected void N(net.yv.r var1, net.u.j var2) {
      double var3 = (double)var2.t();
      double var5 = (double)var2.h();
      double var7 = (double)var2.y();
      var1.M((net.r.r)null, var2, net.nb.l.wp, net.yz.p.BLOCKS, 0.5F, 2.6F + (var1.G.nextFloat() - var1.G.nextFloat()) * 0.8F);
      int var9 = 0;

      while(true) {
         var1.n(ai.SMOKE_LARGE, var3 + Math.random(), var5 + 1.2D, var7 + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
         ++var9;
      }
   }

   public net.yw.n D(int var1) {
      return this.p().s(J, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(J)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{J});
   }

   public static gx Y(net.y1.l var0) {
      if(var0 == net.y1.l.p) {
         return net.nb.f.dy;
      } else if(var0 == net.y1.l.U) {
         return net.nb.f.dj;
      } else {
         throw new IllegalArgumentException("Invalid material");
      }
   }

   public static g0 N(net.y1.l var0) {
      if(var0 == net.y1.l.p) {
         return net.nb.f.uM;
      } else if(var0 == net.y1.l.U) {
         return net.nb.f.TL;
      } else {
         throw new IllegalArgumentException("Invalid material");
      }
   }

   public static float H(net.yw.n var0, o8 var1, net.u.j var2) {
      int var3 = ((Integer)var0.i(J)).intValue();
      return (var3 & 7) == 0 && var1.Z(var2.h()).n() == net.y1.l.p?1.0F:1.0F - P(var3);
   }

   public static float h(net.yw.n var0, o8 var1, net.u.j var2) {
      return (float)var2.h() + H(var0, var1, var2);
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
