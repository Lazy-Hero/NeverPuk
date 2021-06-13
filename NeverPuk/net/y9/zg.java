package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.ai;
import net.yz.aq;

public class zg extends z4 {
   protected static final net.u.e f = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);

   protected zg() {
      super(net.y1.l.z, net.y1.h.j);
      this.R(0);
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return f;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      g3.v.w();
      super.Y(var1, var2, var3, var4);
      int var6 = -2;
      int var7 = -2;
      if(var4.nextInt(16) == 0) {
         int var8 = 0;
         net.u.j var9 = var3.F(var6, var8, var7);
         if(var2.Z(var9).Q() == net.nb.f.W) {
            if(!var2.y(var3.F(var6 / 2, 0, var7 / 2))) {
               ;
            }

            var2.n(ai.ENCHANTMENT_TABLE, (double)var3.t() + 0.5D, (double)var3.h() + 2.0D, (double)var3.y() + 0.5D, (double)((float)var6 + var4.nextFloat()) - 0.5D, (double)((float)var8 - var4.nextFloat() - 1.0F), (double)((float)var7 + var4.nextFloat()) - 0.5D, new int[0]);
         }

         ++var8;
      }

      ++var7;
      ++var6;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.j();
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.j) {
            var4.x((net.yv.z)((net.ni.j)var10));
         }

         return true;
      }
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      super.o(var1, var2, var3, var4, var5);
      if(var5.v()) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof net.ni.j) {
            ((net.ni.j)var6).O(var5.j());
         }
      }

   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
