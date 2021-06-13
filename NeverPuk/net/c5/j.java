package net.c5;

import net.xn;
import net.c5.e;
import net.ne.l;
import net.y.d;
import net.y6.h;
import net.yz.m_;

public class j extends e {
   private static final m_ Q = new m_("textures/entity/enchanting_table_book.png");
   private final h N = new h();

   public void B(net.ni.j var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d.c();
      d.O((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      e.F();
      float var12 = (float)var1.F + var8;
      d.O(0.0F, 0.1F + net.u.t.A(var12 * 0.1F) * 0.01F, 0.0F);
      float var13 = var1.M - var1.r;
      if(var13 >= 3.1415927F) {
         var13 -= 6.2831855F;
      }

      if(var13 < -3.1415927F) {
         var13 += 6.2831855F;
      }

      float var14 = var1.r + var13 * var8;
      d.P(-var14 * 57.295776F, 0.0F, 1.0F, 0.0F);
      d.P(80.0F, 0.0F, 0.0F, 1.0F);
      this.L(Q);
      float var15 = var1.Y + (var1.y - var1.Y) * var8 + 0.25F;
      float var16 = var1.Y + (var1.y - var1.Y) * var8 + 0.75F;
      var15 = (var15 - (float)net.u.t.N((double)var15)) * 1.6F - 0.3F;
      var16 = (var16 - (float)net.u.t.N((double)var16)) * 1.6F - 0.3F;
      if(Float.compare(var15, 0.0F) < 0) {
         var15 = 0.0F;
      }

      if(Float.compare(var16, 0.0F) < 0) {
         var16 = 0.0F;
      }

      if(Float.compare(var15, 1.0F) > 0) {
         var15 = 1.0F;
      }

      if(var16 > 1.0F) {
         var16 = 1.0F;
      }

      float var17 = var1.T + (var1.A - var1.T) * var8;
      d.a();
      this.N.V((l)null, var12, var15, var16, var17, 0.0F, 0.0625F);
      d.Y();
      if(net.u.d.y() == null) {
         e.Q(new net.u.d[4]);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
