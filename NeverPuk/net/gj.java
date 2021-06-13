package net;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.gf;
import net.gi;
import net.gn;
import net.gq;
import net.mk;
import net.mw;
import net.oh;
import net.or;
import net.xg;
import net.xh;
import net.xn;
import net.nn.j;
import net.u.d;
import net.z.g;
import org.lwjgl.opengl.GL11;

public class gj {
   public or A;
   public List l = new ArrayList();
   public int h;
   public double c;
   public int D;
   public int j;
   public int g;
   public int L;
   public int Y;
   public oh z = oh.STATIC;
   public boolean r;
   private static d[] R;

   public gj(or var1, int var2, int var3) {
      this.A = var1;
      this.D = var2;
      this.g = var3;
      this.h = 100;
      int var4 = 20;

      for(mk var6 : gn.Q.j.M(var1)) {
         gf var7 = new gf(var6, this, 0, var4, this.h, 15);
         this.l.add(var7);
         var4 += 15;
      }

      this.Y = var4 - 20;
   }

   public int H() {
      return this.D;
   }

   public int i() {
      return this.g;
   }

   public void O(int var1) {
      this.g = var1;
   }

   public int K() {
      return this.h;
   }

   public void P(int var1) {
      this.h = var1;
   }

   public int v() {
      return this.Y;
   }

   public void K(int var1) {
      this.Y = var1;
   }

   private void R() {
      int var1 = 20;

      for(gq var3 : this.l) {
         var3.j(var1);
         var1 = (int)((double)var1 + (double)var3.H() + var3.k());
      }

      this.Y = var1 - 20;
   }

   public void P(int var1, int var2) {
      c();
      int var4 = this.D;
      int var5 = this.g;
      int var6 = this.h;
      this.R();
      this.H();
      this.m(var1, var2);
      double var7 = this.c;
      int var9 = (new Color(12, 12, 12)).getRGB();
      xh.u((float)(var4 - 2), (float)var5, (double)((float)(var4 + var6 + 2)), (double)((float)((double)((float)(var5 + 20)) + var7)), var9);
      xh.s((float)((double)var4 + -2.5D), (float)var5, (float)(this.h + 5), 20.0F, (new Color(24, 24, 24)).brighter().getRGB(), (new Color(var9)).darker().getRGB());
      xh.s((float)((double)var4 + -2.5D), (float)var5, (float)(this.h + 5), 20.0F, xg.m(14, 235), xg.m(48, 0));
      xh.u((float)(var4 - 2), (float)var5, (double)((float)(var4 + var6 + 2)), (double)((float)(var5 + 20)), var9);
      String var10 = "neverhook/clickguiicons/" + this.A.name + ".png";
      xh.u((float)(this.D + -2), (float)(this.g + -2), (double)(this.D + this.h + 2), (double)this.g, this.A.B());
      j.b().n().E(new net.yz.m_(var10));
      g.r((float)(var4 + this.K() - 20), (float)(this.g - -2), 0.0F, 0.0F, 13.0F, 13.0F, 13.0F, 13.0F);
      j.b().x.i(this.A.name, (float)(var4 + 2), (float)var5 + 10.0F - 3.0F, -1);
      GL11.glPushMatrix();
      GL11.glEnable(3089);
      xh.Z((float)(var4 - 2), (float)(var5 + 20 - 2), (float)(var4 + var6 + 2), (double)((float)((double)(var5 + 20) + var7)));
      this.l.sort(new gi());
      Iterator var11 = this.l.iterator();
      if(var11.hasNext()) {
         gq var12 = (gq)var11.next();
         var12.j(var1, var2);
         xh.Z((float)(var4 - 2), (float)(var5 + 20), (float)(var4 + var6 + 2), (double)((float)((double)(var5 + 20) + var7)));
         d.h(new d[2]);
      }

      GL11.glDisable(3089);
      GL11.glPopMatrix();
   }

   public void t(int var1, int var2, int var3) {
      c();
      int var5 = this.D;
      int var6 = this.g;
      int var7 = this.h;
      double var8 = this.c;
      if(var1 > var5 - 2 && var1 < var5 + var7 + 2 && var2 > var6 && var2 < var6 + 20) {
         label96: {
            if(var3 == 1) {
               if(Double.compare(var8, 0.0D) > 0 && (this.z == oh.EXPANDING || this.z == oh.STATIC)) {
                  this.z = oh.RETRACTING;
               }

               if(var8 >= (double)(this.Y + 2) || this.z != oh.EXPANDING && this.z != oh.STATIC) {
                  break label96;
               }

               this.z = oh.EXPANDING;
            }

            if(var3 == 0 && !this.r) {
               this.j = var5 - var1;
               this.L = var6 - var2;
               this.r = true;
            }
         }
      }

      Iterator var10 = this.l.iterator();
      if(var10.hasNext()) {
         gq var11 = (gq)var10.next();
         int var12 = var11.x();
         if((double)var12 < var8 + 20.0D) {
            var11.a(var1, var2, var3);
         }
      }

      if(d.y() == null) {
         w(new d[1]);
      }

   }

   public void J(int var1, int var2, int var3) {
      if(this.r) {
         this.r = false;
      }

      if(this.c > 0.0D) {
         for(gq var5 : this.l) {
            var5.T(var1, var2, var3);
         }
      }

   }

   public void I(char var1, int var2) {
      if(this.c > 0.0D) {
         for(gq var4 : this.l) {
            var4.m(var1, var2);
         }
      }

   }

   private void m(int var1, int var2) {
      if(this.r) {
         this.D = var1 + this.j;
         this.g = var2 + this.L;
      }

   }

   private void H() {
      int var1 = this.Y;
      switch(null.i[this.z.ordinal()]) {
      case 1:
         if(this.c < (double)(var1 + 2)) {
            this.c = mw.g((double)(var1 + 2), this.c, 0.045D * j.Y / 5.0D);
         } else if(this.c >= (double)(var1 + 2)) {
            this.z = oh.STATIC;
         }
         break;
      case 2:
         if(this.c > 0.0D) {
            this.c = mw.g(0.0D, this.c, 0.045D * j.Y / 5.0D);
         } else if(this.c <= 0.0D) {
            this.z = oh.STATIC;
         }
         break;
      case 3:
         if(this.c > 0.0D && this.c != (double)(var1 + 2)) {
            this.c = mw.g((double)(var1 + 2), this.c, 0.045D * j.Y / 5.0D);
         }

         this.c = this.k(this.c, (double)(var1 + 2));
      }

   }

   private double k(double var1, double var3) {
      return var1 < 0.0D?0.0D:Math.min(var1, var3);
   }

   public static void w(d[] var0) {
      R = var0;
   }

   public static d[] c() {
      return R;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      w(new d[5]);
   }
}
