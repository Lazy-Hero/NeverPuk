package net.y9;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g2;
import net.y9.g3;
import net.y9.g7;
import net.y9.l;
import net.y9.r0;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class gn extends l {
   public static final net.yr.w r = net.yr.w.l("north", gn.k.class);
   public static final net.yr.w n = net.yr.w.l("east", gn.k.class);
   public static final net.yr.w c = net.yr.w.l("south", gn.k.class);
   public static final net.yr.w Y = net.yr.w.l("west", gn.k.class);
   public static final net.yr.l J = net.yr.l.J("power", 0, 15);
   protected static final net.u.e[] f = new net.u.e[]{new net.u.e(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 0.8125D), new net.u.e(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 0.8125D), new net.u.e(0.0D, 0.0D, 0.1875D, 0.8125D, 0.0625D, 1.0D), new net.u.e(0.1875D, 0.0D, 0.0D, 0.8125D, 0.0625D, 0.8125D), new net.u.e(0.1875D, 0.0D, 0.0D, 0.8125D, 0.0625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 0.8125D, 0.0625D, 0.8125D), new net.u.e(0.0D, 0.0D, 0.0D, 0.8125D, 0.0625D, 1.0D), new net.u.e(0.1875D, 0.0D, 0.1875D, 1.0D, 0.0625D, 0.8125D), new net.u.e(0.1875D, 0.0D, 0.1875D, 1.0D, 0.0625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.1875D, 1.0D, 0.0625D, 0.8125D), new net.u.e(0.0D, 0.0D, 0.1875D, 1.0D, 0.0625D, 1.0D), new net.u.e(0.1875D, 0.0D, 0.0D, 1.0D, 0.0625D, 0.8125D), new net.u.e(0.1875D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 0.8125D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D)};
   private boolean F = true;
   private final Set l = Sets.newHashSet();

   public gn() {
      super(net.y1.l.c);
      this.r(this.b.T().s(r, gn.k.NONE).s(n, gn.k.NONE).s(c, gn.k.NONE).s(Y, gn.k.NONE).s(J, Integer.valueOf(0)));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return f[P(var1.J(var2, var3))];
   }

   private static int P(net.yw.n var0) {
      int var1 = 0;
      boolean var2 = var0.i(r) != gn.k.NONE;
      boolean var3 = var0.i(n) != gn.k.NONE;
      boolean var4 = var0.i(c) != gn.k.NONE;
      boolean var5 = var0.i(Y) != gn.k.NONE;
      var1 = var1 | 1 << aq.NORTH.u();
      var1 = var1 | 1 << aq.EAST.u();
      var1 = var1 | 1 << aq.SOUTH.u();
      var1 = var1 | 1 << aq.WEST.u();
      return var1;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = var1.s(Y, this.t(var2, var3, aq.WEST));
      var1 = var1.s(n, this.t(var2, var3, aq.EAST));
      var1 = var1.s(r, this.t(var2, var3, aq.NORTH));
      var1 = var1.s(c, this.t(var2, var3, aq.SOUTH));
      return var1;
   }

   private gn.k t(o8 var1, net.u.j var2, aq var3) {
      net.u.j var4 = var2.C(var3);
      net.yw.n var5 = var1.Z(var2.C(var3));
      if(!D(var1.Z(var4), var3) && (var5.i() || !n(var1.Z(var4.b())))) {
         net.yw.n var6 = var1.Z(var2.h());
         if(!var6.i()) {
            if(!var1.Z(var4).z() && var1.Z(var4).Q() != net.nb.f.Tr) {
               boolean var8 = false;
            } else {
               boolean var10000 = true;
            }

            if(n(var1.Z(var4.h()))) {
               if(var5.w()) {
                  return gn.k.UP;
               }

               return gn.k.SIDE;
            }
         }

         return gn.k.NONE;
      } else {
         return gn.k.SIDE;
      }
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).z() || var1.Z(var2.b()).Q() == net.nb.f.Tr;
   }

   private net.yw.n g(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var3 = this.H(var1, var2, var2, var3);
      ArrayList var4 = Lists.newArrayList(this.l);
      this.l.clear();

      for(net.u.j var6 : var4) {
         var1.b(var6, this, false);
      }

      return var3;
   }

   private net.yw.n H(net.yv.r var1, net.u.j var2, net.u.j var3, net.yw.n var4) {
      net.yw.n var6 = var4;
      g3.v.w();
      int var7 = ((Integer)var4.i(J)).intValue();
      int var8 = 0;
      var8 = this.x(var1, var3, var8);
      this.F = false;
      int var9 = var1.g(var2);
      this.F = true;
      if(var9 > 0 && var9 > var8 - 1) {
         var8 = var9;
      }

      int var10 = 0;
      Iterator var11 = aq.u.HORIZONTAL.iterator();
      if(var11.hasNext()) {
         label111: {
            aq var12 = (aq)var11.next();
            net.u.j var13 = var2.C(var12);
            if(var13.t() == var3.t() && var13.y() == var3.y()) {
               boolean var22 = false;
            } else {
               boolean var10000 = true;
            }

            var10 = this.x(var1, var13, var10);
            if(var1.Z(var13).i() && !var1.Z(var2.h()).i()) {
               if(var2.h() < var3.h()) {
                  break label111;
               }

               var10 = this.x(var1, var13.h(), var10);
            }

            if(!var1.Z(var13).i() && var2.h() <= var3.h()) {
               var10 = this.x(var1, var13.b(), var10);
            }
         }
      }

      if(var10 > var8) {
         var8 = var10 - 1;
      }

      if(var8 > 0) {
         --var8;
      }

      var8 = 0;
      if(var9 > var8 - 1) {
         var8 = var9;
      }

      if(var7 != var8) {
         var4 = var4.s(J, Integer.valueOf(var8));
         if(var1.Z(var2) == var6) {
            var1.k(var2, var4, 2);
         }

         this.l.add(var2);
         aq[] var18 = aq.values();
         int var19 = var18.length;
         int var20 = 0;
         if(var20 < var19) {
            aq var14 = var18[var20];
            this.l.add(var2.C(var14));
            ++var20;
         }
      }

      return var4;
   }

   private void t(net.yv.r var1, net.u.j var2) {
      if(var1.Z(var2).Q() == this) {
         var1.b(var2, this, false);

         for(aq var6 : aq.values()) {
            var1.b(var2.C(var6), this, false);
         }
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x) {
         this.g(var1, var2, var3);

         for(aq var5 : aq.u.VERTICAL) {
            var1.b(var2.C(var5), this, false);
         }

         for(aq var9 : aq.u.HORIZONTAL) {
            this.t(var1, var2.C(var9));
         }

         for(aq var10 : aq.u.HORIZONTAL) {
            net.u.j var6 = var2.C(var10);
            if(var1.Z(var6).i()) {
               this.t(var1, var6.h());
            } else {
               this.t(var1, var6.b());
            }
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      if(!var1.x) {
         for(aq var7 : aq.values()) {
            var1.b(var2.C(var7), this, false);
         }

         this.g(var1, var2, var3);

         for(aq var10 : aq.u.HORIZONTAL) {
            this.t(var1, var2.C(var10));
         }

         for(aq var11 : aq.u.HORIZONTAL) {
            net.u.j var12 = var2.C(var11);
            if(var1.Z(var12).i()) {
               this.t(var1, var12.h());
            } else {
               this.t(var1, var12.b());
            }
         }
      }

   }

   private int x(net.yv.r var1, net.u.j var2, int var3) {
      if(var1.Z(var2).Q() != this) {
         return var3;
      } else {
         int var4 = ((Integer)var1.Z(var2).i(J)).intValue();
         return var4 > var3?var4:var3;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         if(this.J(var2, var3)) {
            this.g(var2, var3, var1);
         } else {
            this.N(var2, var3, var1, 0);
            var2.J(var3);
         }
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.A;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !this.F?0:var1.M(var2, var3, var4);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      if(!this.F) {
         return 0;
      } else {
         int var5 = ((Integer)var1.i(J)).intValue();
         return 0;
      }
   }

   private boolean H(o8 var1, net.u.j var2, aq var3) {
      net.u.j var4 = var2.C(var3);
      net.yw.n var5 = var1.Z(var4);
      boolean var6 = var5.i();
      boolean var7 = var1.Z(var2.h()).i();
      return N(var1, var4.h())?true:(D(var5, var3)?true:(var5.Q() == net.nb.f.da && var5.i(g2.N) == var3?true:N(var1, var4.b())));
   }

   protected static boolean N(o8 var0, net.u.j var1) {
      return n(var0.Z(var1));
   }

   protected static boolean n(net.yw.n var0) {
      return D(var0, (aq)null);
   }

   protected static boolean D(net.yw.n var0, @Nullable aq var1) {
      l var2 = var0.Q();
      if(var2 == net.nb.f.dv) {
         return true;
      } else if(!net.nb.f.dQ.g(var0)) {
         return net.nb.f.ui == var0.Q()?var1 == var0.i(r0.n):var0.o();
      } else {
         aq var3 = (aq)var0.i(g7.N);
         return var3 == var1 || var3.f() == var1;
      }
   }

   public boolean s(net.yw.n var1) {
      return this.F;
   }

   public static int R(int var0) {
      float var1 = (float)var0 / 15.0F;
      float var2 = var1 * 0.6F + 0.4F;
      var2 = 0.3F;
      float var3 = var1 * var1 * 0.7F - 0.5F;
      float var4 = var1 * var1 * 0.6F - 0.7F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      int var5 = net.u.t.g((int)(var2 * 255.0F), 0, 255);
      int var6 = net.u.t.g((int)(var3 * 255.0F), 0, 255);
      int var7 = net.u.t.g((int)(var4 * 255.0F), 0, 255);
      return -16777216 | var5 << 16 | var6 << 8 | var7;
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      int var5 = ((Integer)var1.i(J)).intValue();
      double var6 = (double)var3.t() + 0.5D + ((double)var4.nextFloat() - 0.5D) * 0.2D;
      double var8 = (double)((float)var3.h() + 0.0625F);
      double var10 = (double)var3.y() + 0.5D + ((double)var4.nextFloat() - 0.5D) * 0.2D;
      float var12 = (float)var5 / 15.0F;
      float var13 = var12 * 0.6F + 0.4F;
      float var14 = Math.max(0.0F, var12 * var12 * 0.7F - 0.5F);
      float var15 = Math.max(0.0F, var12 * var12 * 0.6F - 0.7F);
      var2.n(ai.REDSTONE, var6, var8, var10, (double)var13, (double)var14, (double)var15, new int[0]);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.A);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(J, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(J)).intValue();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.S[var2.ordinal()]) {
      case 1:
         return var1.s(r, var1.i(c)).s(n, var1.i(Y)).s(c, var1.i(r)).s(Y, var1.i(n));
      case 2:
         return var1.s(r, var1.i(n)).s(n, var1.i(c)).s(c, var1.i(Y)).s(Y, var1.i(r));
      case 3:
         return var1.s(r, var1.i(Y)).s(n, var1.i(r)).s(c, var1.i(n)).s(Y, var1.i(c));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.f[var2.ordinal()]) {
      case 1:
         return var1.s(r, var1.i(c)).s(c, var1.i(r));
      case 2:
         return var1.s(n, var1.i(Y)).s(Y, var1.i(n));
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{r, n, c, Y, J});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static enum k implements au {
      UP("up"),
      SIDE("side"),
      NONE("none");

      private final String S;

      private k(String var3) {
         this.S = var3;
      }

      public String toString() {
         return this.f();
      }

      public String f() {
         return this.S;
      }
   }
}
