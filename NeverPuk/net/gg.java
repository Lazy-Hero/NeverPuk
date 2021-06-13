package net;

import java.awt.Color;
import net._6;
import net.gj;
import net.gq;
import net.mc;
import net.xh;
import net.xn;
import net.y.d;
import net.y6.jb;

public class gg extends gq {
   private final _6 m;
   public float X;
   public float L;
   public boolean Y;
   public boolean i;
   private boolean t;
   private int P;

   public gg(mc var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
      this.X = 0.0F;
      this.P = 0;
      this.L = 0.0F;
      this.m = new _6();
      this.i = false;
      this.t = false;
      this.Y = false;
   }

   public static float X(float var0, float var1, float var2, float var3, float var4) {
      return (var0 - var1) / (var2 - var1) * (var4 - var3) + var3;
   }

   public static float[] p(float var0, float var1, float var2) {
      float var3 = var2 * var1;
      float var4 = var0 / 60.0F;
      float var5 = var3 * (1.0F - Math.abs(var4 % 2.0F - 1.0F));
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      if(var4 >= 0.0F && var4 <= 1.0F) {
         var6 = var3;
         var7 = var5;
         var8 = 0.0F;
      } else if(var4 >= 1.0F && var4 <= 2.0F) {
         var6 = var5;
         var7 = var3;
         var8 = 0.0F;
      } else if(var4 >= 2.0F && var4 <= 3.0F) {
         var6 = 0.0F;
         var7 = var3;
         var8 = var5;
      } else if(var4 >= 3.0F && var4 <= 4.0F) {
         var6 = 0.0F;
         var7 = var5;
         var8 = var3;
      } else if(var4 >= 4.0F && var4 <= 5.0F) {
         var6 = var5;
         var7 = 0.0F;
         var8 = var3;
      } else if(var4 >= 5.0F && var4 <= 6.0F) {
         var6 = var3;
         var7 = 0.0F;
         var8 = var5;
      }

      float var9 = var2 - var3;
      float var10 = var6 + var9;
      float var11 = var7 + var9;
      float var12 = var8 + var9;
      return new float[]{var10, var11, var12};
   }

   public void j(int var1, int var2) {
      gj var4 = this.U();
      int var5 = var4.H() + this.Z();
      jb.J();
      int var6 = var4.i() + this.x() - 4;
      float var7 = (float)var5 + 4.0F;
      float var8 = (float)var6 + 8.0F;
      d.c();
      d.E();
      xh.T(new net.yz.m_("neverhook/picker.png"), var7 - 3.0F, var8, 98.0F, 10.5F, Color.white);
      D.R.l(this.d.q(), (double)(var5 + 6), (double)(var8 + 3.5F), -1);
      xh.J((double)((float)var5 + this.L - 2.0F + 2.0F), (double)((float)var6 + 6.5F), (double)((float)var5 + this.L + 5.0F - 0.5F), (double)((float)((double)var6 + this.C / 2.0D + 10.5D)), Color.BLACK.getRGB());
      xh.J((double)((float)var5 + this.L - 2.0F + 3.0F), (double)((float)var6 + 7.5F), (double)((float)var5 + this.L + 5.0F - 1.5F), (double)((float)((double)var6 + this.C / 2.0D + 9.5D)), Color.WHITE.getRGB());
      d.Y();
      if(this.t) {
         var1 -= var5;
         var2 -= var6;
         this.L = (float)var1;
         if(Float.compare(this.L, 98.0F) >= 0) {
            this.L = 98.0F;
            return;
         }

         if(this.L <= -2.0F) {
            this.L = -2.0F;
            return;
         }

         float[] var10 = p(this.X, 1.0F, 1.0F);
         if(Float.compare(this.L, 97.0F) >= 0) {
            int var9 = (new Color(255, 255, 255)).getRGB();
         }

         int var11 = (new Color(var10[0], var10[1], var10[2])).getRGB();
         if(this.L <= -1.0F) {
            var11 = Color.BLACK.getRGB();
         }

         this.X = X((float)var1, 0.0F, (float)this.e, 0.0F, 360.0F);
         this.d.R(var11);
      }

      super.j(var1, var2);
   }

   public void a(int var1, int var2, int var3) {
      if(this.R(var1, (int)((float)var2 - (float)((int)this.C) / 4.0F))) {
         if(this.m.Z(350.0D)) {
            this.P = 0;
            this.m.B();
         }

         ++this.P;
         if(this.P > 1) {
            if(this.d.W()) {
               this.Y = !this.Y;
            }

            this.P = 0;
         }
      }

      if(this.R(var1, (int)((float)var2 - (float)((int)this.C) / 4.0F)) && this.d.W()) {
         this.t = true;
      }

      super.a(var1, var2, var3);
   }

   public void T(int var1, int var2, int var3) {
      this.t = false;
      super.T(var1, var2, var3);
   }

   public void m(int var1, int var2) {
      super.m(var1, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
