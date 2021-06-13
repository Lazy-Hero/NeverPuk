package net.c5;

import java.util.Calendar;
import net.xn;
import net.c5.e;
import net.y.d;
import net.y9.l;
import net.y9.z_;
import net.yz.m_;

public class n extends e {
   private static final m_ x = new m_("textures/entity/chest/trapped_double.png");
   private static final m_ g = new m_("textures/entity/chest/christmas_double.png");
   private static final m_ s = new m_("textures/entity/chest/normal_double.png");
   private static final m_ K = new m_("textures/entity/chest/trapped.png");
   private static final m_ S = new m_("textures/entity/chest/christmas.png");
   private static final m_ l = new m_("textures/entity/chest/normal.png");
   private final net.y6.m y = new net.y6.m();
   private final net.y6.m C = new net.y6.y();
   private boolean v;

   public n() {
      Calendar var1 = Calendar.getInstance();
      if(var1.get(2) + 1 == 12 && var1.get(5) >= 24 && var1.get(5) <= 26) {
         this.v = true;
      }

   }

   public void q(net.ni.k var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      e.F();
      d.B();
      d.n(515);
      d.Y(true);
      if(var1.j()) {
         l var13 = var1.a();
         int var12 = var1.B();
         if(var13 instanceof z_ && var12 == 0) {
            ((z_)var13).W(var1.B(), var1.C(), var1.B().Z(var1.C()));
            var12 = var1.B();
         }

         var1.a();
      }

      boolean var18 = false;
      if(var1.j == null && var1.d == null) {
         if(var1.p == null && var1.X == null) {
            net.y6.m var19 = this.y;
            if(var9 >= 0) {
               this.L(L[var9]);
               d.G(5890);
               d.c();
               d.W(4.0F, 4.0F, 1.0F);
               d.O(0.0625F, 0.0625F, 0.0625F);
               d.G(5888);
            }

            if(this.v) {
               this.L(S);
            }

            if(var1.r() == z_.o.TRAP) {
               this.L(K);
            }

            this.L(l);
         }

         net.y6.m var20 = this.C;
         if(var9 >= 0) {
            this.L(L[var9]);
            d.G(5890);
            d.c();
            d.W(8.0F, 4.0F, 1.0F);
            d.O(0.0625F, 0.0625F, 0.0625F);
            d.G(5888);
         }

         if(this.v) {
            this.L(g);
         }

         if(var1.r() == z_.o.TRAP) {
            this.L(x);
         }

         this.L(s);
         d.c();
         d.F();
         if(var9 < 0) {
            d.T(1.0F, 1.0F, 1.0F, var10);
         }

         d.O((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         d.W(1.0F, -1.0F, -1.0F);
         d.O(0.5F, 0.5F, 0.5F);
         byte var14 = 0;
         d.P((float)var14, 0.0F, 1.0F, 0.0F);
         d.O(-0.5F, -0.5F, -0.5F);
         float var15 = var1.R + (var1.z - var1.R) * var8;
         if(var1.j != null) {
            float var16 = var1.j.R + (var1.j.z - var1.j.R) * var8;
            if(var16 > var15) {
               var15 = var16;
            }
         }

         if(var1.d != null) {
            float var23 = var1.d.R + (var1.d.z - var1.d.R) * var8;
            if(Float.compare(var23, var15) > 0) {
               var15 = var23;
            }
         }

         var15 = 1.0F - var15;
         var15 = 1.0F - var15 * var15 * var15;
         var20.p.b = -(var15 * 1.5707964F);
         var20.x();
         d.g();
         d.Y();
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         if(var9 >= 0) {
            d.G(5890);
            d.Y();
            d.G(5888);
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
