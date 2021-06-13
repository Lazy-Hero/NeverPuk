package net.z;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;
import net.z.g;

public class wo {
   private static final m_ Y = new m_("textures/map/map_icons.png");
   private final net.n9.e W;
   private final Map l = Maps.newHashMap();

   public wo(net.n9.e var1) {
      this.W = var1;
   }

   public void e(net.cg.s var1) {
      this.Q(var1).y();
   }

   public void A(net.cg.s var1, boolean var2) {
      this.Q(var1).K(var2);
   }

   private wo.g Q(net.cg.s var1) {
      g.B();
      wo.g var3 = (wo.g)this.l.get(var1.D);
      if(var3 == null) {
         var3 = new wo.g(var1);
         this.l.put(var1.D, var3);
      }

      return var3;
   }

   @Nullable
   public wo.g A(String var1) {
      return (wo.g)this.l.get(var1);
   }

   public void P() {
      g.B();
      Iterator var2 = this.l.values().iterator();
      if(var2.hasNext()) {
         wo.g var3 = (wo.g)var2.next();
         this.W.q(var3.G);
      }

      this.l.clear();
   }

   @Nullable
   public net.cg.s r(@Nullable wo.g var1) {
      return var1.u;
   }

   private static xn a(xn var0) {
      return var0;
   }

   class g {
      private final net.cg.s u;
      private final net.n9.x i;
      private final m_ G;
      private final int[] n;

      private g(net.cg.s var2) {
         this.u = var2;
         this.i = new net.n9.x(128, 128);
         this.n = this.i.X();
         this.G = wo.this.W.u("map/" + var2.D, this.i);

         for(int var3 = 0; var3 < this.n.length; ++var3) {
            this.n[var3] = 0;
         }

      }

      private void y() {
         int var1 = 0;

         while(true) {
            int var2 = this.u.E[var1] & 255;
            if(var2 / 4 == 0) {
               this.n[var1] = (var1 + var1 / 128 & 1) * 8 + 16 << 24;
            } else {
               this.n[var1] = net.y1.h.n[var2 / 4].Q(var2 & 3);
            }

            ++var1;
         }
      }

      private void K(boolean var1) {
         boolean var10000 = false;
         var10000 = false;
         net.y.r var5 = net.y.r.f();
         net.y.p var6 = var5.k();
         float var19 = 0.0F;
         wo.this.W.E(this.G);
         net.y.d.C();
         net.y.d.e(net.y.d.ONE, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ZERO, net.y.d.ONE);
         net.y.d.d();
         var6.m(7, net.y8.x.H);
         g.B();
         var6.H(0.0D, 128.0D, -0.009999999776482582D).Y(0.0D, 1.0D).W();
         var6.H(128.0D, 128.0D, -0.009999999776482582D).Y(1.0D, 1.0D).W();
         var6.H(128.0D, 0.0D, -0.009999999776482582D).Y(1.0D, 0.0D).W();
         var6.H(0.0D, 0.0D, -0.009999999776482582D).Y(0.0D, 0.0D).W();
         var5.p();
         net.y.d.m();
         net.y.d.E();
         wo.this.W.E(wo.Y);
         int var8 = 0;
         Iterator var9 = this.u.Q.values().iterator();
         if(var9.hasNext()) {
            net.cg.n var10 = (net.cg.n)var9.next();
            if(!var1 || var10.m()) {
               net.y.d.c();
               net.y.d.O(0.0F + (float)var10.k() / 2.0F + 64.0F, 0.0F + (float)var10.A() / 2.0F + 64.0F, -0.02F);
               net.y.d.P((float)(var10.h() * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
               net.y.d.W(4.0F, 4.0F, 3.0F);
               net.y.d.O(-0.125F, 0.125F, 0.0F);
               byte var11 = var10.Y();
               float var12 = (float)(var11 % 4 + 0) / 4.0F;
               float var13 = (float)(var11 / 4 + 0) / 4.0F;
               float var14 = (float)(var11 % 4 + 1) / 4.0F;
               float var15 = (float)(var11 / 4 + 1) / 4.0F;
               var6.m(7, net.y8.x.H);
               var19 = -0.001F;
               var6.H(-1.0D, 1.0D, (double)((float)var8 * -0.001F)).Y((double)var12, (double)var13).W();
               var6.H(1.0D, 1.0D, (double)((float)var8 * -0.001F)).Y((double)var14, (double)var13).W();
               var6.H(1.0D, -1.0D, (double)((float)var8 * -0.001F)).Y((double)var14, (double)var15).W();
               var6.H(-1.0D, -1.0D, (double)((float)var8 * -0.001F)).Y((double)var12, (double)var15).W();
               var5.p();
               net.y.d.Y();
               ++var8;
            }
         }

         net.y.d.c();
         net.y.d.O(0.0F, 0.0F, -0.04F);
         net.y.d.W(1.0F, 1.0F, 1.0F);
         net.y.d.Y();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
