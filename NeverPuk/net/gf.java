package net;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.gb;
import net.gg;
import net.gj;
import net.gn;
import net.gq;
import net.gr;
import net.gu;
import net.gw;
import net.mc;
import net.mk;
import net.mw;
import net.oh;
import net.xg;
import net.xh;
import net.xn;
import net.nn.j;
import net.y6.jb;
import org.lwjgl.input.Keyboard;

public class gf extends gq {
   private static final Color M = new Color(23, 23, 23);
   private mk m;
   public float U = 0.0F;
   public List B = new ArrayList();
   private int H = 120;
   private int z;
   private double X;
   private oh F = oh.STATIC;
   private boolean n;
   private float u = 0.0F;

   public gf(mk var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.m = var1;
      int var7 = var6;
      if(gn.Q.J.D(var1) != null) {
         for(mc var9 : gn.Q.J.D(var1)) {
            if(var9.C()) {
               this.B.add(new gr(var9, this.U(), var3, var4 + var7, var5, var6));
               var7 += var6 + 20;
            }

            if(var9.v()) {
               this.B.add(new gb(var9, this.U(), var3, var4 + var7 - 10, var5, 16));
               var7 += var6 + 20;
            }

            if(var9.G()) {
               this.B.add(new gg(var9, this.U(), var3, var4 + var7 - 10, var5, 16));
               var7 += var6 + 20;
            }

            if(var9.V()) {
               this.B.add(new gu(var9, this.U(), var3, var4 + var7, var5, var6));
               var7 += var6 + 20;
            }
         }
      }

      this.B.add(new gw(var1, this.U(), var3, var4, var5, var6));
      this.T();
   }

   public mk j() {
      return this.m;
   }

   public double k() {
      return this.X;
   }

   private void r(int var1, int var2) {
      int var3 = 15;

      for(gq var5 : this.B) {
         if(!var5.r()) {
            var5.j(this.x() + var3);
            var5.j(var1, var2);
            var3 += 15;
         }
      }

   }

   private int T() {
      int var1 = 0;

      for(gq var3 : this.B) {
         if(!var3.r()) {
            var1 = (int)((double)(var1 + var3.H()) + var3.k());
         }
      }

      return var1;
   }

   public void j(int var1, int var2) {
      gj var4;
      int var5;
      int var6;
      int var7;
      int var8;
      label0: {
         var4 = this.U();
         var5 = var4.H() + this.Z();
         var6 = var4.i() + this.x();
         var7 = this.H();
         var8 = this.V();
         jb.J();
         boolean var9 = this.R(var1, var2);
         this.i();
         this.z = this.T();
         if(var9) {
            if(this.H >= 200) {
               break label0;
            }

            this.H += 5;
         }

         if(this.H > 120) {
            this.H -= 5;
         }
      }

      this.u = mw.w(this.u, 4.0F, 0.001F);
      xh.J((double)var5, (double)var6, (double)(var5 + var8), (double)((float)((double)(var6 + var7) + this.k())), xg.h(M, 255 - this.H).getRGB());
      int var10 = this.m.v()?var4.A.B():(new Color(this.H, this.H, this.H)).getRGB();
      D.s3.k(this.n?"Binding... Key:" + Keyboard.getKeyName(this.m.o()):this.m.i(), (float)var5 + 48.0F + this.u, (float)var6 + (float)var7 / 1.5F - 5.5F, var10);
      if(this.X > 0.0D) {
         if(var4.z != oh.RETRACTING) {
            xh.Z((float)var5, (float)var6, (float)(var5 + var8), (double)((float)((double)var6 + Math.min(this.X, var4.c) + (double)var7)));
         }

         this.r(var1, var2);
      }

   }

   public void a(int var1, int var2, int var3) {
      if(this.X > 0.0D) {
         for(gq var5 : this.B) {
            var5.a(var1, var2, var3);
         }
      }

      if(this.R(var1, var2) && var3 == 2) {
         this.n = !this.n;
      }

      if(this.R(var1, var2)) {
         this.m.g();
      }

   }

   public void T(int var1, int var2, int var3) {
      if(this.X > 0.0D) {
         for(gq var5 : this.B) {
            var5.T(var1, var2, var3);
         }
      }

   }

   public void m(int var1, int var2) {
      if(this.n) {
         this.m.z(var2);
         this.n = false;
         if(var2 == 211) {
            this.m.z(0);
         } else if(var2 == 1) {
            this.X(false);
         }
      }

      if(this.X > 0.0D) {
         for(gq var4 : this.B) {
            var4.m(var1, var2);
         }
      }

   }

   public void X(boolean var1) {
      this.n = var1;
   }

   private void i() {
      int var1 = this.z;
      switch(null.y[this.F.ordinal()]) {
      case 1:
         if(this.X < (double)var1) {
            this.X = mw.g((double)((float)var1), (double)((float)this.X), 0.045D * j.Y / 5.0D);
         } else if(this.X >= (double)var1) {
            this.F = oh.STATIC;
         }

         this.X = this.i(this.X, (double)var1);
         break;
      case 2:
         if(this.X > 0.0D) {
            this.X = mw.g(0.0D, (double)((float)this.X), 0.045D * j.Y / 5.0D);
         } else if(this.X <= 0.0D) {
            this.F = oh.STATIC;
         }

         this.X = this.i(this.X, (double)var1);
         break;
      case 3:
         if(this.X > 0.0D && this.X != (double)var1) {
            this.X = mw.g((double)var1, (double)((float)this.X), 0.045D * j.Y / 5.0D);
         }

         this.X = this.i(this.X, (double)var1);
      }

   }

   private double i(double var1, double var3) {
      return var1 < 0.0D?0.0D:Math.min(var1, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
