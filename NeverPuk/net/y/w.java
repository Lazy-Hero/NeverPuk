package net.y;

import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;
import net._c;
import net.i6;
import net.o3;
import net.wk;
import net.wl;
import net.wq;
import net.x7;
import net.xn;
import net.z9;
import net.zzzzxyCustomizer;
import net.y.b;
import net.y.d;
import net.y.n;
import net.y.p;
import net.y.r;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class w {
   private final net.yo.j v;
   private static float A = 0.2F;
   private static final ac[] l = new ac[]{ac.CUTOUT, ac.CUTOUT_MIPPED, ac.TRANSLUCENT};

   public w(net.yo.j var1) {
      this.v = var1;
      if(i6.uh.I()) {
         i6.q(i6.uh, Boolean.valueOf(false));
      }

   }

   public boolean x(o8 var1, net.ym.j var2, net.yw.n var3, net.u.j var4, p var5, boolean var6) {
      return this.C(var1, var2, var3, var4, var5, var6, net.u.t.a((net.u.d)var4));
   }

   public boolean C(o8 var1, net.ym.j var2, net.yw.n var3, net.u.j var4, p var5, boolean var6, long var7) {
      boolean var9 = net.nn.j.K() && wl.n(var3, var1, var4) == 0 && var2.a();
      if(z9.Q()) {
         wk.j(var3, var4, var1, var5);
      }

      if(!z9.SY()) {
         var7 = 0L;
      }

      _c var10 = var5.X(var1, var3, var4);
      var2 = zzzzxyCustomizer.M(var2, var3, var10);
      boolean var11 = this.A(var1, var2, var3, var4, var5, var6, var7);
      this.H(var1, var2, var3, var4, var5, var6, var7, var10, var9);
      if(z9.Q()) {
         wk.w(var5);
      }

      return var11;
   }

   public boolean A(o8 var1, net.ym.j var2, net.yw.n var3, net.u.j var4, p var5, boolean var6, long var7) {
      boolean var9 = false;
      _c var10 = var5.X(var1, var3, var4);

      for(aq var14 : aq.VALUES) {
         List var15 = var2.h(var3, var14, var7);
         if(!var15.isEmpty() && var3.F(var1, var4, var14)) {
            var15 = zzzzxyCustomizer.q(var15, var1, var3, var4, var14, var7, var10);
            this.q(var1, var3, var4, var5, var15, var10);
            var9 = true;
         }
      }

      List var16 = var2.h(var3, (aq)null, var7);
      if(!var16.isEmpty()) {
         var16 = zzzzxyCustomizer.q(var16, var1, var3, var4, (aq)null, var7, var10);
         this.q(var1, var3, var4, var5, var16, var10);
         var9 = true;
      }

      return var9;
   }

   public boolean W(o8 var1, net.ym.j var2, net.yw.n var3, net.u.j var4, p var5, boolean var6, long var7) {
      boolean var9 = false;
      _c var10 = var5.X(var1, var3, var4);

      for(aq var14 : aq.VALUES) {
         List var15 = var2.h(var3, var14, var7);
         if(!var15.isEmpty() && var3.F(var1, var4, var14)) {
            int var16 = var3.T(var1, var4.C(var14));
            var15 = zzzzxyCustomizer.q(var15, var1, var3, var4, var14, var7, var10);
            this.u(var1, var3, var4, var16, false, var5, var15, var10);
            var9 = true;
         }
      }

      List var17 = var2.h(var3, (aq)null, var7);
      if(!var17.isEmpty()) {
         var17 = zzzzxyCustomizer.q(var17, var1, var3, var4, (aq)null, var7, var10);
         this.u(var1, var3, var4, -1, true, var5, var17, var10);
         var9 = true;
      }

      return var9;
   }

   private void q(o8 var1, net.yw.n var2, net.u.j var3, p var4, List var5, _c var6) {
      float[] var7 = var6.p();
      BitSet var8 = var6.O();
      w.c var9 = var6.H();
      net.u.r var10 = var2.F(var1, var3);
      double var11 = (double)var3.t() + var10.p;
      double var13 = (double)var3.h() + var10.H;
      double var15 = (double)var3.y() + var10.a;
      int var17 = 0;

      for(int var18 = var5.size(); var17 < var18; ++var17) {
         net.ym.t var19 = (net.ym.t)var5.get(var17);
         this.P(var2, var19.I(), var19.c(), var7, var8);
         var9.o(var1, var2, var3, var19.c(), var7, var8);
         if(var4.b()) {
            var4.o(var19.G());
            var4.J(var19.t());
         } else {
            var4.o(var19.I());
         }

         var4.w(var9.l[0], var9.l[1], var9.l[2], var9.l[3]);
         if(var19.H()) {
            float var20 = net.ym.i.m(var19.c());
            float[] var21 = var9.Z;
            var21[0] *= var20;
            var21 = var9.Z;
            var21[1] *= var20;
            var21 = var9.Z;
            var21[2] *= var20;
            var21 = var9.Z;
            var21[3] *= var20;
         }

         int var25 = x7.W(var19, var2, var1, var3, var6);
         if(!var19.D() && var25 == -1) {
            var4.X(var9.Z[0], var9.Z[0], var9.Z[0], 4);
            var4.X(var9.Z[1], var9.Z[1], var9.Z[1], 3);
            var4.X(var9.Z[2], var9.Z[2], var9.Z[2], 2);
            var4.X(var9.Z[3], var9.Z[3], var9.Z[3], 1);
         } else {
            int var29 = var25;
            if(var25 == -1) {
               var29 = this.v.I(var2, var1, var3, var19.N());
            }

            if(n.mZ) {
               var29 = net.n9.y.I(var29);
            }

            float var22 = (float)(var29 >> 16 & 255) / 255.0F;
            float var23 = (float)(var29 >> 8 & 255) / 255.0F;
            float var24 = (float)(var29 & 255) / 255.0F;
            var4.X(var9.Z[0] * var22, var9.Z[0] * var23, var9.Z[0] * var24, 4);
            var4.X(var9.Z[1] * var22, var9.Z[1] * var23, var9.Z[1] * var24, 3);
            var4.X(var9.Z[2] * var22, var9.Z[2] * var23, var9.Z[2] * var24, 2);
            var4.X(var9.Z[3] * var22, var9.Z[3] * var23, var9.Z[3] * var24, 1);
         }

         var4.n(var11, var13, var15);
      }

   }

   private void P(net.yw.n var1, int[] var2, aq var3, @Nullable float[] var4, BitSet var5) {
      float var7 = 32.0F;
      p.S();
      float var8 = 32.0F;
      float var9 = 32.0F;
      float var10 = -32.0F;
      float var11 = -32.0F;
      float var12 = -32.0F;
      int var13 = var2.length / 4;
      int var14 = 0;
      float var15 = Float.intBitsToFloat(var2[var14 * var13]);
      float var16 = Float.intBitsToFloat(var2[var14 * var13 + 1]);
      float var17 = Float.intBitsToFloat(var2[var14 * var13 + 2]);
      var7 = Math.min(var7, var15);
      var8 = Math.min(var8, var16);
      var9 = Math.min(var9, var17);
      var10 = Math.max(var10, var15);
      var11 = Math.max(var11, var16);
      var12 = Math.max(var12, var17);
      ++var14;
      if(var4 != null) {
         var4[aq.WEST.w()] = var7;
         var4[aq.EAST.w()] = var10;
         var4[aq.DOWN.w()] = var8;
         var4[aq.UP.w()] = var11;
         var4[aq.NORTH.w()] = var9;
         var4[aq.SOUTH.w()] = var12;
         var14 = aq.VALUES.length;
         var4[aq.WEST.w() + var14] = 1.0F - var7;
         var4[aq.EAST.w() + var14] = 1.0F - var10;
         var4[aq.DOWN.w() + var14] = 1.0F - var8;
         var4[aq.UP.w() + var14] = 1.0F - var11;
         var4[aq.NORTH.w() + var14] = 1.0F - var9;
         var4[aq.SOUTH.w() + var14] = 1.0F - var12;
      }

      float var26 = 1.0E-4F;
      var15 = 0.9999F;
      switch(null.s[var3.ordinal()]) {
      case 1:
         Float.compare(var7, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var8, 1.0E-4F);
         if(var1.O()) {
            float var38;
            int var10002 = (var38 = var8 - var11) == 0.0F?0:(var38 < 0.0F?-1:1);
         }

         var5.set(0, false);
      case 2:
         Float.compare(var7, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var11, 0.9999F);
         if(var1.O()) {
            float var37;
            int var28 = (var37 = var8 - var11) == 0.0F?0:(var37 < 0.0F?-1:1);
         }

         var5.set(0, false);
      case 3:
         Float.compare(var7, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var9, 1.0E-4F);
         if(var1.O()) {
            float var36;
            int var29 = (var36 = var9 - var12) == 0.0F?0:(var36 < 0.0F?-1:1);
         }

         var5.set(0, false);
      case 4:
         Float.compare(var7, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var12, 0.9999F);
         if(var1.O()) {
            float var35;
            int var30 = (var35 = var9 - var12) == 0.0F?0:(var35 < 0.0F?-1:1);
         }

         var5.set(0, false);
      case 5:
         Float.compare(var8, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var7, 1.0E-4F);
         if(var1.O()) {
            float var34;
            int var31 = (var34 = var7 - var10) == 0.0F?0:(var34 < 0.0F?-1:1);
         }

         var5.set(0, false);
      case 6:
         Float.compare(var8, 1.0E-4F);
         var5.set(1, true);
         Float.compare(var10, 0.9999F);
         if(var1.O()) {
            float var33;
            int var32 = (var33 = var7 - var10) == 0.0F?0:(var33 < 0.0F?-1:1);
         }

         var5.set(0, false);
      default:
      }
   }

   private void u(o8 var1, net.yw.n var2, net.u.j var3, int var4, boolean var5, p var6, List var7, _c var8) {
      BitSet var9 = var8.O();
      net.u.r var10 = var2.F(var1, var3);
      double var11 = (double)var3.t() + var10.p;
      double var13 = (double)var3.h() + var10.H;
      double var15 = (double)var3.y() + var10.a;
      int var17 = 0;

      for(int var18 = var7.size(); var17 < var18; ++var17) {
         net.ym.t var19 = (net.ym.t)var7.get(var17);
         this.P(var2, var19.I(), var19.c(), (float[])null, var9);
         net.u.j var20 = var9.get(0)?var3.C(var19.c()):var3;
         var4 = var2.T(var1, var20);
         if(var6.b()) {
            var6.o(var19.G());
            var6.J(var19.t());
         } else {
            var6.o(var19.I());
         }

         var6.w(var4, var4, var4, var4);
         int var27 = x7.W(var19, var2, var1, var3, var8);
         if(!var19.D() && var27 == -1) {
            if(var19.H()) {
               float var28 = net.ym.i.m(var19.c());
               var6.X(var28, var28, var28, 4);
               var6.X(var28, var28, var28, 3);
               var6.X(var28, var28, var28, 2);
               var6.X(var28, var28, var28, 1);
            }
         } else {
            int var21 = var27;
            if(var27 == -1) {
               var21 = this.v.I(var2, var1, var3, var19.N());
            }

            if(n.mZ) {
               var21 = net.n9.y.I(var21);
            }

            float var22 = (float)(var21 >> 16 & 255) / 255.0F;
            float var23 = (float)(var21 >> 8 & 255) / 255.0F;
            float var24 = (float)(var21 & 255) / 255.0F;
            if(var19.H()) {
               float var25 = net.ym.i.m(var19.c());
               var22 *= var25;
               var23 *= var25;
               var24 *= var25;
            }

            var6.X(var22, var23, var24, 4);
            var6.X(var22, var23, var24, 3);
            var6.X(var22, var23, var24, 2);
            var6.X(var22, var23, var24, 1);
         }

         var6.n(var11, var13, var15);
      }

   }

   public void k(net.ym.j var1, float var2, float var3, float var4, float var5) {
      this.n((net.yw.n)null, var1, var2, var3, var4, var5);
   }

   public void n(net.yw.n var1, net.ym.j var2, float var3, float var4, float var5, float var6) {
      for(aq var10 : aq.VALUES) {
         this.a(var3, var4, var5, var6, var2.h(var1, var10, 0L));
      }

      this.a(var3, var4, var5, var6, var2.h(var1, (aq)null, 0L));
   }

   public void d(net.ym.j var1, net.yw.n var2, float var3, boolean var4) {
      var2.Q();
      d.P(90.0F, 0.0F, 1.0F, 0.0F);
      int var6 = this.v.I(var2, (o8)null, (net.u.j)null, 0);
      if(n.mZ) {
         var6 = net.n9.y.I(var6);
      }

      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      d.T(var3, var3, var3, 1.0F);
      this.n(var2, var1, var3, var7, var8, var9);
   }

   private void a(float var1, float var2, float var3, float var4, List var5) {
      r var6 = r.f();
      p var7 = var6.k();
      int var8 = 0;

      for(int var9 = var5.size(); var8 < var9; ++var8) {
         net.ym.t var10 = (net.ym.t)var5.get(var8);
         var7.m(7, net.y8.x.d);
         var7.o(var10.I());
         if(var10.D()) {
            var7.m(var2 * var1, var3 * var1, var4 * var1);
         } else {
            var7.m(var1, var1, var1);
         }

         net.u.d var11 = var10.c().E();
         var7.g((float)var11.t(), (float)var11.h(), (float)var11.y());
         var6.p();
      }

   }

   public static float d(float var0) {
      return var0 == 0.2F?A:var0;
   }

   public static void y() {
      A = 1.0F - z9.F() * 0.8F;
   }

   private void H(o8 var1, net.ym.j var2, net.yw.n var3, net.u.j var4, p var5, boolean var6, long var7, _c var9, boolean var10) {
      if(var9.L()) {
         for(int var11 = 0; var11 < l.length; ++var11) {
            ac var12 = l[var11];
            o3 var13 = var9.Q(var12);
            if(var13.H() > 0) {
               b var14 = var9.s();
               p var15 = var14.M(var12);
               if(!var15.l()) {
                  var15.m(7, net.y8.x.M);
                  var15.S(var5.I(), var5.l(), var5.z());
               }

               for(int var16 = 0; var16 < var13.H(); ++var16) {
                  net.ym.t var17 = var13.Z(var16);
                  List var18 = var13.H(var17);
                  net.yw.n var19 = var13.d(var16);
                  var9.S(var1, var19, var4);
                  this.q(var1, var19, var4, var15, var18, var9);
               }

               var13.A();
            }
         }
      }

      if(z9.R() && !var9.X() && wq.S(var1, var3, var4)) {
         net.ym.j var21 = wq.b();
         net.yw.n var22 = wq.Y();
         this.C(var1, var21, var22, var4, var5, var6, var7);
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static enum a {
      DOWN(0, 1, 2, 3),
      UP(2, 3, 0, 1),
      NORTH(3, 0, 1, 2),
      SOUTH(0, 1, 2, 3),
      WEST(3, 0, 1, 2),
      EAST(1, 2, 3, 0);

      private final int c;
      private final int a;
      private final int Y;
      private final int x;
      private static final w.a[] g = new w.a[6];

      private a(int var3, int var4, int var5, int var6) {
         this.c = var3;
         this.a = var4;
         this.Y = var5;
         this.x = var6;
      }

      public static w.a z(aq var0) {
         return g[var0.w()];
      }

      static {
         g[aq.DOWN.w()] = DOWN;
         g[aq.UP.w()] = UP;
         g[aq.NORTH.w()] = NORTH;
         g[aq.SOUTH.w()] = SOUTH;
         g[aq.WEST.w()] = WEST;
         g[aq.EAST.w()] = EAST;
      }
   }

   public static enum b {
      DOWN(new aq[]{aq.WEST, aq.EAST, aq.NORTH, aq.SOUTH}, 0.5F, true, new w.y[]{w.y.FLIP_WEST, w.y.SOUTH, w.y.FLIP_WEST, w.y.FLIP_SOUTH, w.y.WEST, w.y.FLIP_SOUTH, w.y.WEST, w.y.SOUTH}, new w.y[]{w.y.FLIP_WEST, w.y.NORTH, w.y.FLIP_WEST, w.y.FLIP_NORTH, w.y.WEST, w.y.FLIP_NORTH, w.y.WEST, w.y.NORTH}, new w.y[]{w.y.FLIP_EAST, w.y.NORTH, w.y.FLIP_EAST, w.y.FLIP_NORTH, w.y.EAST, w.y.FLIP_NORTH, w.y.EAST, w.y.NORTH}, new w.y[]{w.y.FLIP_EAST, w.y.SOUTH, w.y.FLIP_EAST, w.y.FLIP_SOUTH, w.y.EAST, w.y.FLIP_SOUTH, w.y.EAST, w.y.SOUTH}),
      UP(new aq[]{aq.EAST, aq.WEST, aq.NORTH, aq.SOUTH}, 1.0F, true, new w.y[]{w.y.EAST, w.y.SOUTH, w.y.EAST, w.y.FLIP_SOUTH, w.y.FLIP_EAST, w.y.FLIP_SOUTH, w.y.FLIP_EAST, w.y.SOUTH}, new w.y[]{w.y.EAST, w.y.NORTH, w.y.EAST, w.y.FLIP_NORTH, w.y.FLIP_EAST, w.y.FLIP_NORTH, w.y.FLIP_EAST, w.y.NORTH}, new w.y[]{w.y.WEST, w.y.NORTH, w.y.WEST, w.y.FLIP_NORTH, w.y.FLIP_WEST, w.y.FLIP_NORTH, w.y.FLIP_WEST, w.y.NORTH}, new w.y[]{w.y.WEST, w.y.SOUTH, w.y.WEST, w.y.FLIP_SOUTH, w.y.FLIP_WEST, w.y.FLIP_SOUTH, w.y.FLIP_WEST, w.y.SOUTH}),
      NORTH(new aq[]{aq.UP, aq.DOWN, aq.EAST, aq.WEST}, 0.8F, true, new w.y[]{w.y.UP, w.y.FLIP_WEST, w.y.UP, w.y.WEST, w.y.FLIP_UP, w.y.WEST, w.y.FLIP_UP, w.y.FLIP_WEST}, new w.y[]{w.y.UP, w.y.FLIP_EAST, w.y.UP, w.y.EAST, w.y.FLIP_UP, w.y.EAST, w.y.FLIP_UP, w.y.FLIP_EAST}, new w.y[]{w.y.DOWN, w.y.FLIP_EAST, w.y.DOWN, w.y.EAST, w.y.FLIP_DOWN, w.y.EAST, w.y.FLIP_DOWN, w.y.FLIP_EAST}, new w.y[]{w.y.DOWN, w.y.FLIP_WEST, w.y.DOWN, w.y.WEST, w.y.FLIP_DOWN, w.y.WEST, w.y.FLIP_DOWN, w.y.FLIP_WEST}),
      SOUTH(new aq[]{aq.WEST, aq.EAST, aq.DOWN, aq.UP}, 0.8F, true, new w.y[]{w.y.UP, w.y.FLIP_WEST, w.y.FLIP_UP, w.y.FLIP_WEST, w.y.FLIP_UP, w.y.WEST, w.y.UP, w.y.WEST}, new w.y[]{w.y.DOWN, w.y.FLIP_WEST, w.y.FLIP_DOWN, w.y.FLIP_WEST, w.y.FLIP_DOWN, w.y.WEST, w.y.DOWN, w.y.WEST}, new w.y[]{w.y.DOWN, w.y.FLIP_EAST, w.y.FLIP_DOWN, w.y.FLIP_EAST, w.y.FLIP_DOWN, w.y.EAST, w.y.DOWN, w.y.EAST}, new w.y[]{w.y.UP, w.y.FLIP_EAST, w.y.FLIP_UP, w.y.FLIP_EAST, w.y.FLIP_UP, w.y.EAST, w.y.UP, w.y.EAST}),
      WEST(new aq[]{aq.UP, aq.DOWN, aq.NORTH, aq.SOUTH}, 0.6F, true, new w.y[]{w.y.UP, w.y.SOUTH, w.y.UP, w.y.FLIP_SOUTH, w.y.FLIP_UP, w.y.FLIP_SOUTH, w.y.FLIP_UP, w.y.SOUTH}, new w.y[]{w.y.UP, w.y.NORTH, w.y.UP, w.y.FLIP_NORTH, w.y.FLIP_UP, w.y.FLIP_NORTH, w.y.FLIP_UP, w.y.NORTH}, new w.y[]{w.y.DOWN, w.y.NORTH, w.y.DOWN, w.y.FLIP_NORTH, w.y.FLIP_DOWN, w.y.FLIP_NORTH, w.y.FLIP_DOWN, w.y.NORTH}, new w.y[]{w.y.DOWN, w.y.SOUTH, w.y.DOWN, w.y.FLIP_SOUTH, w.y.FLIP_DOWN, w.y.FLIP_SOUTH, w.y.FLIP_DOWN, w.y.SOUTH}),
      EAST(new aq[]{aq.DOWN, aq.UP, aq.NORTH, aq.SOUTH}, 0.6F, true, new w.y[]{w.y.FLIP_DOWN, w.y.SOUTH, w.y.FLIP_DOWN, w.y.FLIP_SOUTH, w.y.DOWN, w.y.FLIP_SOUTH, w.y.DOWN, w.y.SOUTH}, new w.y[]{w.y.FLIP_DOWN, w.y.NORTH, w.y.FLIP_DOWN, w.y.FLIP_NORTH, w.y.DOWN, w.y.FLIP_NORTH, w.y.DOWN, w.y.NORTH}, new w.y[]{w.y.FLIP_UP, w.y.NORTH, w.y.FLIP_UP, w.y.FLIP_NORTH, w.y.UP, w.y.FLIP_NORTH, w.y.UP, w.y.NORTH}, new w.y[]{w.y.FLIP_UP, w.y.SOUTH, w.y.FLIP_UP, w.y.FLIP_SOUTH, w.y.UP, w.y.FLIP_SOUTH, w.y.UP, w.y.SOUTH});

      private final aq[] O;
      private final float c;
      private final boolean G;
      private final w.y[] H;
      private final w.y[] g;
      private final w.y[] K;
      private final w.y[] i;
      private static final w.b[] S = new w.b[6];

      private b(aq[] var3, float var4, boolean var5, w.y[] var6, w.y[] var7, w.y[] var8, w.y[] var9) {
         this.O = var3;
         this.c = var4;
         this.G = var5;
         this.H = var6;
         this.g = var7;
         this.K = var8;
         this.i = var9;
      }

      public static w.b b(aq var0) {
         return S[var0.w()];
      }

      static {
         S[aq.DOWN.w()] = DOWN;
         S[aq.UP.w()] = UP;
         S[aq.NORTH.w()] = NORTH;
         S[aq.SOUTH.w()] = SOUTH;
         S[aq.WEST.w()] = WEST;
         S[aq.EAST.w()] = EAST;
      }
   }

   public static class c {
      private final float[] Z = new float[4];
      private final int[] l = new int[4];

      public c() {
      }

      public c(w var1) {
      }

      public void o(o8 var1, net.yw.n var2, net.u.j var3, aq var4, float[] var5, BitSet var6) {
         String var7 = p.S();
         net.u.j var8 = var6.get(0)?var3.C(var4):var3;
         net.u.j var9 = net.u.j.u();
         w.b var10 = w.b.b(var4);
         net.u.j var11 = net.u.j.D(var8).O(var10.O[0]);
         net.u.j var12 = net.u.j.D(var8).O(var10.O[1]);
         net.u.j var13 = net.u.j.D(var8).O(var10.O[2]);
         net.u.j var14 = net.u.j.D(var8).O(var10.O[3]);
         int var15 = var2.T(var1, var11);
         int var16 = var2.T(var1, var12);
         int var17 = var2.T(var1, var13);
         int var18 = var2.T(var1, var14);
         float var19 = var1.Z(var11).p();
         float var20 = var1.Z(var12).p();
         float var21 = var1.Z(var13).p();
         float var22 = var1.Z(var14).p();
         var19 = w.d(var19);
         var20 = w.d(var20);
         var21 = w.d(var21);
         var22 = w.d(var22);
         boolean var23 = var1.Z(var9.G(var11).O(var4)).f();
         boolean var24 = var1.Z(var9.G(var12).O(var4)).f();
         boolean var25 = var1.Z(var9.G(var13).O(var4)).f();
         boolean var26 = var1.Z(var9.G(var14).O(var4)).f();
         if(!var25 && !var23) {
            net.u.d.h(new net.u.d[4]);
         }

         net.u.j var29 = var9.G(var11).O(var10.O[2]);
         float var28 = var1.Z(var29).p();
         var28 = w.d(var28);
         int var27 = var2.T(var1, var29);
         if(!var26 && !var23) {
            ;
         }

         net.u.j var31 = var9.G(var11).O(var10.O[3]);
         float var30 = var1.Z(var31).p();
         var30 = w.d(var30);
         int var67 = var2.T(var1, var31);
         if(!var25 && !var24) {
            ;
         }

         net.u.j var33 = var9.G(var12).O(var10.O[2]);
         float var32 = var1.Z(var33).p();
         var32 = w.d(var32);
         int var69 = var2.T(var1, var33);
         if(!var26 && !var24) {
            ;
         }

         net.u.j var35 = var9.G(var12).O(var10.O[3]);
         float var34 = var1.Z(var35).p();
         var34 = w.d(var34);
         int var71 = var2.T(var1, var35);
         int var73 = var2.T(var1, var3);
         if(var6.get(0) || !var1.Z(var3.C(var4)).j()) {
            var73 = var2.T(var1, var3.C(var4));
         }

         float var36 = var6.get(0)?var1.Z(var8).p():var1.Z(var3).p();
         var36 = w.d(var36);
         w.a var37 = w.a.z(var4);
         var9.T();
         var11.T();
         var12.T();
         var13.T();
         var14.T();
         if(var6.get(1) && var10.G) {
            float var38 = (var22 + var19 + var30 + var36) * 0.25F;
            float var39 = (var21 + var19 + var28 + var36) * 0.25F;
            float var40 = (var21 + var20 + var32 + var36) * 0.25F;
            float var41 = (var22 + var20 + var34 + var36) * 0.25F;
            float var42 = var5[var10.H[0].p] * var5[var10.H[1].p];
            float var43 = var5[var10.H[2].p] * var5[var10.H[3].p];
            float var44 = var5[var10.H[4].p] * var5[var10.H[5].p];
            float var45 = var5[var10.H[6].p] * var5[var10.H[7].p];
            float var46 = var5[var10.g[0].p] * var5[var10.g[1].p];
            float var47 = var5[var10.g[2].p] * var5[var10.g[3].p];
            float var48 = var5[var10.g[4].p] * var5[var10.g[5].p];
            float var49 = var5[var10.g[6].p] * var5[var10.g[7].p];
            float var50 = var5[var10.K[0].p] * var5[var10.K[1].p];
            float var51 = var5[var10.K[2].p] * var5[var10.K[3].p];
            float var52 = var5[var10.K[4].p] * var5[var10.K[5].p];
            float var53 = var5[var10.K[6].p] * var5[var10.K[7].p];
            float var54 = var5[var10.i[0].p] * var5[var10.i[1].p];
            float var55 = var5[var10.i[2].p] * var5[var10.i[3].p];
            float var56 = var5[var10.i[4].p] * var5[var10.i[5].p];
            float var57 = var5[var10.i[6].p] * var5[var10.i[7].p];
            this.Z[var37.c] = var38 * var42 + var39 * var43 + var40 * var44 + var41 * var45;
            this.Z[var37.a] = var38 * var46 + var39 * var47 + var40 * var48 + var41 * var49;
            this.Z[var37.Y] = var38 * var50 + var39 * var51 + var40 * var52 + var41 * var53;
            this.Z[var37.x] = var38 * var54 + var39 * var55 + var40 * var56 + var41 * var57;
            int var58 = this.X(var18, var15, var67, var73);
            int var59 = this.X(var17, var15, var27, var73);
            int var60 = this.X(var17, var16, var69, var73);
            int var61 = this.X(var18, var16, var71, var73);
            this.l[var37.c] = this.O(var58, var59, var60, var61, var42, var43, var44, var45);
            this.l[var37.a] = this.O(var58, var59, var60, var61, var46, var47, var48, var49);
            this.l[var37.Y] = this.O(var58, var59, var60, var61, var50, var51, var52, var53);
            this.l[var37.x] = this.O(var58, var59, var60, var61, var54, var55, var56, var57);
         }

         float var75 = (var22 + var19 + var30 + var36) * 0.25F;
         float var76 = (var21 + var19 + var28 + var36) * 0.25F;
         float var77 = (var21 + var20 + var32 + var36) * 0.25F;
         float var78 = (var22 + var20 + var34 + var36) * 0.25F;
         this.l[var37.c] = this.X(var18, var15, var67, var73);
         this.l[var37.a] = this.X(var17, var15, var27, var73);
         this.l[var37.Y] = this.X(var17, var16, var69, var73);
         this.l[var37.x] = this.X(var18, var16, var71, var73);
         this.Z[var37.c] = var75;
         this.Z[var37.a] = var76;
         this.Z[var37.Y] = var77;
         this.Z[var37.x] = var78;
      }

      private int X(int var1, int var2, int var3, int var4) {
         return var4 + var4 + var4 + var4 >> 2 & 16711935;
      }

      private int O(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
         int var9 = (int)((float)(var1 >> 16 & 255) * var5 + (float)(var2 >> 16 & 255) * var6 + (float)(var3 >> 16 & 255) * var7 + (float)(var4 >> 16 & 255) * var8) & 255;
         int var10 = (int)((float)(var1 & 255) * var5 + (float)(var2 & 255) * var6 + (float)(var3 & 255) * var7 + (float)(var4 & 255) * var8) & 255;
         return var9 << 16 | var10;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum y {
      DOWN(aq.DOWN, false),
      UP(aq.UP, false),
      NORTH(aq.NORTH, false),
      SOUTH(aq.SOUTH, false),
      WEST(aq.WEST, false),
      EAST(aq.EAST, false),
      FLIP_DOWN(aq.DOWN, true),
      FLIP_UP(aq.UP, true),
      FLIP_NORTH(aq.NORTH, true),
      FLIP_SOUTH(aq.SOUTH, true),
      FLIP_WEST(aq.WEST, true),
      FLIP_EAST(aq.EAST, true);

      private final int p;

      private y(aq var3, boolean var4) {
         this.p = var3.w() + aq.values().length;
      }
   }
}
