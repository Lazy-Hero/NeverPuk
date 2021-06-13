package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.r1;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;

public class rd extends l {
   protected static final net.u.e o = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 1.0D, 0.9375D);

   public rd() {
      super(net.y1.l.f, net.y1.h.c);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return o;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var1.c(var2, this, this.u(var1));
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      var2.c(var3, this, this.u(var2));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      this.N(var1, var2);
   }

   private void N(net.yv.r var1, net.u.j var2) {
      if(r1.T(var1.Z(var2.b())) && var2.h() >= 0) {
         boolean var10000 = true;
         if(!r1.D && var1.C(var2.F(-32, -32, -32), var2.F(32, 32, 32))) {
            var1.S(new net.nm.v(var1, (double)((float)var2.t() + 0.5F), (double)var2.h(), (double)((float)var2.y() + 0.5F), this.p()));
         } else {
            var1.J(var2);

            net.u.j var4;
            for(var4 = var2; r1.T(var1.Z(var4)) && var4.h() > 0; var4 = var4.b()) {
               ;
            }

            if(var4.h() > 0) {
               var1.k(var4, this.p(), 2);
            }
         }
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      this.O(var1, var2);
      return true;
   }

   public void w(net.yv.r var1, net.u.j var2, net.r.r var3) {
      this.O(var1, var2);
   }

   private void O(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      net.yw.n var4 = var1.Z(var2);
      if(var4.Q() == this) {
         int var5 = 0;
         net.u.j var6 = var2.F(var1.G.nextInt(16) - var1.G.nextInt(16), var1.G.nextInt(8) - var1.G.nextInt(8), var1.G.nextInt(16) - var1.G.nextInt(16));
         if(var1.Z(var6).Q().C == net.y1.l.q) {
            if(var1.x) {
               int var7 = 0;
               double var8 = var1.G.nextDouble();
               float var10 = (var1.G.nextFloat() - 0.5F) * 0.2F;
               float var11 = (var1.G.nextFloat() - 0.5F) * 0.2F;
               float var12 = (var1.G.nextFloat() - 0.5F) * 0.2F;
               double var13 = (double)var6.t() + (double)(var2.t() - var6.t()) * var8 + (var1.G.nextDouble() - 0.5D) + 0.5D;
               double var15 = (double)var6.h() + (double)(var2.h() - var6.h()) * var8 + var1.G.nextDouble() - 0.5D;
               double var17 = (double)var6.y() + (double)(var2.y() - var6.y()) * var8 + (var1.G.nextDouble() - 0.5D) + 0.5D;
               var1.n(ai.PORTAL, var13, var15, var17, (double)var10, (double)var11, (double)var12, new int[0]);
               ++var7;
            }

            var1.k(var6, var4, 2);
            var1.J(var2);
            return;
         }

         ++var5;
      }

   }

   public int u(net.yv.r var1) {
      return 5;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
