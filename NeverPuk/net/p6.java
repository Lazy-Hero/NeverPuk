package net;

import java.awt.Color;
import net._d;
import net.xh;
import net.xn;
import net.h.a;
import net.nb.l;
import net.nn.j;
import net.y.d;
import net.z.m;
import org.lwjgl.input.Mouse;

public class p6 extends m {
   private int S;

   public p6(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 35, var4);
   }

   public p6(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.S = 20;
   }

   public static int d() {
      return Mouse.getX() * L.u() / j.b().sB;
   }

   public static int m() {
      return L.v() - Mouse.getY() * L.v() / j.b().st - 1;
   }

   public void Z(j var1, int var2, int var3, float var4) {
      boolean var5 = _d.C();
      if(this.F) {
         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h + 10;
         Color var6 = new Color(255, 255, 255, 255);
         Color var7 = new Color(this.S + 14, this.S + 14, this.S + 14, 125);
         if(this.O) {
            if(this.P) {
               if(this.S < 100) {
                  this.S += 8;
               }

               var6 = Color.white;
            }

            if(this.S > 20) {
               this.S -= 8;
            }
         }

         d.C();
         d.G(770, 771, 1, 0);
         d.D(770, 771);
         int var8 = this.h + 11;
         xh.u((float)this.D, (float)this.R, (double)(this.s + this.D), (double)(var8 + this.R), var7.getRGB());
         var1.sy.k(this.J, (float)this.D + (float)this.s / 2.0F, (float)(this.R + (this.h - 12)), var6.getRGB());
         this.N(var1, var2, var3);
      }

   }

   protected void N(j var1, int var2, int var3) {
   }

   public void A(int var1, int var2) {
   }

   public boolean X(j var1, int var2, int var3) {
      return this.O && this.F && var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h + 10;
   }

   public boolean Z() {
      return this.P;
   }

   public void W(int var1, int var2) {
   }

   public void i(net.h.m var1) {
      var1.g((net.h.d)a.v(l.Ku, 1.0F));
   }

   public int h() {
      return this.s;
   }

   public void V(int var1) {
      this.s = var1;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
