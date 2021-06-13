package net.y0;

import java.util.Random;
import net.gn;
import net.v9;
import net.xn;
import net.n0.ks;
import net.y.u1;
import net.y0.c;
import net.y0.d;
import net.yz.m_;
import org.lwjgl.opengl.GL11;

public class f extends c {
   private final net.y.t x;
   private final Random v = new Random();
   public static Random N = new Random();
   public static net.nn.j e = net.nn.j.b();
   public static net.y.t k = e.K();
   public static long B;
   public static double V;

   public f(d var1, net.y.t var2) {
      super(var1);
      this.x = var2;
      this.W = 0.15F;
      this.r = 0.75F;
   }

   private int S(net.nm.i var1, double var2, double var4, double var6, float var8, net.ym.j var9) {
      ks var10 = var1.S();
      net.n0.y var11 = var10.Z();
      return 0;
   }

   private int W(ks var1) {
      byte var2 = 1;
      if(var1.U() > 48) {
         var2 = 5;
      } else if(var1.U() > 32) {
         var2 = 4;
      } else if(var1.U() > 16) {
         var2 = 3;
      } else if(var1.U() > 1) {
         var2 = 2;
      }

      return var2;
   }

   public static boolean x() {
      return true;
   }

   public void r(net.nm.i var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.C();
      if(!gn.Q.j.d(v9.class).v()) {
         ks var11 = var1.S();
         int var12 = var11.B()?187:net.n0.y.h(var11.Z()) + var11.n();
         this.v.setSeed((long)var12);
         boolean var13 = false;
         if(this.j(var1)) {
            this.A.H.m(this.V(var1)).s(false, false);
            var13 = true;
         }

         net.y.d.F();
         net.y.d.d(516, 0.1F);
         net.y.d.C();
         u1.B();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         net.y.d.c();
         net.ym.j var14 = this.x.O(var11, var1.hl, (net.ne.a)null);
         int var15 = this.S(var1, var2, var4, var6, var9, var14);
         float var16 = var14.D().Z.N.x;
         float var17 = var14.D().Z.N.y;
         float var18 = var14.D().Z.N.z;
         boolean var19 = var14.M();
         if(!var19) {
            float var20 = -0.0F * (float)(var15 - 1) * 0.5F * var16;
            float var21 = -0.0F * (float)(var15 - 1) * 0.5F * var17;
            float var22 = -0.09375F * (float)(var15 - 1) * 0.5F * var18;
            net.y.d.O(var20, var21, var22);
         }

         if(this.g) {
            net.y.d.G();
            net.y.d.o(this.B(var1));
         }

         int var37 = 0;
         if(var37 < var15) {
            if(var19) {
               net.y.d.c();
               float var40 = (this.v.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var41 = (this.v.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var23 = (this.v.nextFloat() * 2.0F - 1.0F) * 0.15F;
               net.y.d.O(var40, var41, var23);
               var14.D().q(net.ym.s.GROUND);
               this.x.w(var11, var14);
               net.y.d.Y();
            }

            net.y.d.c();
            var14.D().q(net.ym.s.GROUND);
            this.x.w(var11, var14);
            net.y.d.Y();
            net.y.d.O(0.0F * var16, 0.0F * var17, 0.09375F * var18);
            ++var37;
         }

         if(this.g) {
            net.y.d.o();
            net.y.d.e();
         }

         net.y.d.Y();
         net.y.d.g();
         net.y.d.E();
         this.j(var1);
      }

      V = (double)(System.nanoTime() - B) / 3000000.0D * (double)v9.l.e();
      if(!e.sr) {
         V = 0.0D;
      }

      ks var24 = var1.S();
      if(var24.Z() != null) {
         N.setSeed(187L);
         boolean var25 = false;
         if(net.n9.b.N != null) {
            e.N().H.E(net.n9.b.N);
            e.N().H.m(net.n9.b.N).s(false, false);
            var25 = true;
         }

         net.y.d.F();
         net.y.d.d(516, 0.1F);
         net.y.d.C();
         net.y.d.G(770, 771, 1, 0);
         net.y.d.c();
         net.ym.j var28 = k.k().a(var24);
         int var29 = this.S(var1, var2, var4, var6, var9, var28);
         net.u.j var30 = new net.u.j(var1);
         if(var1.V > 360.0F) {
            var1.V = 0.0F;
         }

         if(var1 != null && !Double.isNaN((double)var1.O()) && !Double.isNaN((double)var1.b()) && !Double.isNaN((double)var1.G()) && var1.z() != null && !var1.k) {
            net.u.j var31 = new net.u.j(var1);
            var31.F(0, 1, 0);
            net.y1.l var34 = var1.hl.Z(var31).Q().H((net.yw.n)null);
            net.y1.l var35 = var1.hl.Z(var30).Q().H((net.yw.n)null);
            boolean var36 = var1.A(net.y1.l.p);
            boolean var39 = var1.p();
            if(var36 | var34 == net.y1.l.p | var35 == net.y1.l.p | var39) {
               var1.V += (float)(V / 4.0D);
            }

            var1.V += (float)(V * 2.0D);
         }

         GL11.glRotatef(var1.hN, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var1.V + 90.0F, 1.0F, 0.0F, 0.0F);
         int var32 = 0;
         if(var32 < var29) {
            if(var28.a()) {
               net.y.d.c();
               net.y.d.W(0.3F, 0.3F, 0.3F);
               k.w(var24, var28);
               net.y.d.Y();
            }

            net.y.d.c();
            net.y.d.W(0.6F, 0.6F, 0.6F);
            k.w(var24, var28);
            if(!x()) {
               net.y.d.O(0.0F, 0.0F, 0.046875F);
            }

            net.y.d.Y();
            ++var32;
         }

         net.y.d.Y();
         net.y.d.g();
         net.y.d.E();
         e.N().H.E(net.n9.b.N);
      }

      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ V(net.nm.i var1) {
      return net.n9.b.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
