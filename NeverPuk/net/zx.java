package net;

import java.io.Serializable;
import net._0;
import net._m;
import net.bc;
import net.dm;
import net.go;
import net.op;
import net.ra;
import net.uo;
import net.x_;

public class zx implements Serializable, Cloneable {
   private int y;
   double[] K;
   static final long serialVersionUID = 1398850036893875112L;

   public zx(int var1) {
      this.y = var1;
      this.K = new double[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public zx(double[] var1) {
      this.y = var1.length;
      this.K = new double[var1.length];

      for(int var2 = 0; var2 < this.y; ++var2) {
         this.K[var2] = var1[var2];
      }

   }

   public zx(zx var1) {
      this.K = new double[var1.y];
      this.y = var1.y;

      for(int var2 = 0; var2 < this.y; ++var2) {
         this.K[var2] = var1.K[var2];
      }

   }

   public zx(_0 var1) {
      this.K = new double[2];
      this.K[0] = (double)var1.t;
      this.K[1] = (double)var1.J;
      this.y = 2;
   }

   public zx(x_ var1) {
      this.K = new double[3];
      this.K[0] = (double)var1.q;
      this.K[1] = (double)var1.Q;
      this.K[2] = (double)var1.G;
      this.y = 3;
   }

   public zx(go var1) {
      this.K = new double[3];
      this.K[0] = var1.n;
      this.K[1] = var1.Z;
      this.K[2] = var1.B;
      this.y = 3;
   }

   public zx(ra var1) {
      this.K = new double[4];
      this.K[0] = (double)var1.j;
      this.K[1] = (double)var1.v;
      this.K[2] = (double)var1.M;
      this.K[3] = (double)var1.U;
      this.y = 4;
   }

   public zx(uo var1) {
      this.K = new double[4];
      this.K[0] = var1.M;
      this.K[1] = var1.b;
      this.K[2] = var1.G;
      this.K[3] = var1.d;
      this.y = 4;
   }

   public zx(double[] var1, int var2) {
      this.y = var2;
      this.K = new double[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.K[var3] = var1[var3];
      }

   }

   public final double C() {
      double var1 = 0.0D;

      for(int var3 = 0; var3 < this.y; ++var3) {
         var1 += this.K[var3] * this.K[var3];
      }

      return Math.sqrt(var1);
   }

   public final double W() {
      double var1 = 0.0D;

      for(int var3 = 0; var3 < this.y; ++var3) {
         var1 += this.K[var3] * this.K[var3];
      }

      return var1;
   }

   public final void m(zx var1) {
      double var2 = 0.0D;
      if(this.y != var1.y) {
         throw new dm(bc.I("GVector0"));
      } else {
         for(int var4 = 0; var4 < this.y; ++var4) {
            var2 += var1.K[var4] * var1.K[var4];
         }

         double var5 = 1.0D / Math.sqrt(var2);

         for(int var7 = 0; var7 < this.y; ++var7) {
            this.K[var7] = var1.K[var7] * var5;
         }

      }
   }

   public final void u() {
      double var1 = 0.0D;

      for(int var3 = 0; var3 < this.y; ++var3) {
         var1 += this.K[var3] * this.K[var3];
      }

      double var4 = 1.0D / Math.sqrt(var1);

      for(int var6 = 0; var6 < this.y; ++var6) {
         this.K[var6] *= var4;
      }

   }

   public final void e(double var1, zx var3) {
      if(this.y != var3.y) {
         throw new dm(bc.I("GVector1"));
      } else {
         for(int var4 = 0; var4 < this.y; ++var4) {
            this.K[var4] = var3.K[var4] * var1;
         }

      }
   }

   public final void m(double var1) {
      for(int var3 = 0; var3 < this.y; ++var3) {
         this.K[var3] *= var1;
      }

   }

   public final void l(double var1, zx var3, zx var4) {
      if(var4.y != var3.y) {
         throw new dm(bc.I("GVector2"));
      } else if(this.y != var3.y) {
         throw new dm(bc.I("GVector3"));
      } else {
         for(int var5 = 0; var5 < this.y; ++var5) {
            this.K[var5] = var3.K[var5] * var1 + var4.K[var5];
         }

      }
   }

   public final void a(zx var1) {
      if(this.y != var1.y) {
         throw new dm(bc.I("GVector4"));
      } else {
         for(int var2 = 0; var2 < this.y; ++var2) {
            this.K[var2] += var1.K[var2];
         }

      }
   }

   public final void Q(zx var1, zx var2) {
      if(var1.y != var2.y) {
         throw new dm(bc.I("GVector5"));
      } else if(this.y != var1.y) {
         throw new dm(bc.I("GVector6"));
      } else {
         for(int var3 = 0; var3 < this.y; ++var3) {
            this.K[var3] = var1.K[var3] + var2.K[var3];
         }

      }
   }

   public final void F(zx var1) {
      if(this.y != var1.y) {
         throw new dm(bc.I("GVector7"));
      } else {
         for(int var2 = 0; var2 < this.y; ++var2) {
            this.K[var2] -= var1.K[var2];
         }

      }
   }

   public final void g(zx var1, zx var2) {
      if(var1.y != var2.y) {
         throw new dm(bc.I("GVector8"));
      } else if(this.y != var1.y) {
         throw new dm(bc.I("GVector9"));
      } else {
         for(int var3 = 0; var3 < this.y; ++var3) {
            this.K[var3] = var1.K[var3] - var2.K[var3];
         }

      }
   }

   public final void B(_m var1, zx var2) {
      if(var1.W() != var2.y) {
         throw new dm(bc.I("GVector10"));
      } else {
         if(this.y == var1.p()) {
            double[] var3;
            if(var2 != this) {
               var3 = var2.K;
            } else {
               var3 = (double[])this.K.clone();
            }

            int var4 = this.y - 1;
            this.K[var4] = 0.0D;
            int var5 = var2.y - 1;

            while(true) {
               this.K[var4] += var1.d[var4][var5] * var3[var5];
               --var5;
            }
         }

         throw new dm(bc.I("GVector11"));
      }
   }

   public final void B(zx var1, _m var2) {
      if(var2.p() != var1.y) {
         throw new dm(bc.I("GVector12"));
      } else {
         if(this.y == var2.W()) {
            double[] var3;
            if(var1 != this) {
               var3 = var1.K;
            } else {
               var3 = (double[])this.K.clone();
            }

            int var4 = this.y - 1;
            this.K[var4] = 0.0D;
            int var5 = var1.y - 1;

            while(true) {
               this.K[var4] += var2.d[var5][var4] * var3[var5];
               --var5;
            }
         }

         throw new dm(bc.I("GVector13"));
      }
   }

   public final void O() {
      int var1 = this.y - 1;

      while(true) {
         this.K[var1] *= -1.0D;
         --var1;
      }
   }

   public final void o() {
      for(int var1 = 0; var1 < this.y; ++var1) {
         this.K[var1] = 0.0D;
      }

   }

   public final void X(int var1) {
      double[] var2 = new double[var1];
      int var4;
      if(this.y < var1) {
         var4 = this.y;
      } else {
         var4 = var1;
      }

      for(int var3 = 0; var3 < var4; ++var3) {
         var2[var3] = this.K[var3];
      }

      this.y = var1;
      this.K = var2;
   }

   public final void f(double[] var1) {
      int var2 = this.y - 1;

      while(true) {
         this.K[var2] = var1[var2];
         --var2;
      }
   }

   public final void O(zx var1) {
      if(this.y < var1.y) {
         this.y = var1.y;
         this.K = new double[this.y];

         for(int var2 = 0; var2 < this.y; ++var2) {
            this.K[var2] = var1.K[var2];
         }
      } else {
         for(int var3 = 0; var3 < var1.y; ++var3) {
            this.K[var3] = var1.K[var3];
         }

         for(int var4 = var1.y; var4 < this.y; ++var4) {
            this.K[var4] = 0.0D;
         }
      }

   }

   public final void x(_0 var1) {
      if(this.y < 2) {
         this.y = 2;
         this.K = new double[2];
      }

      this.K[0] = (double)var1.t;
      this.K[1] = (double)var1.J;

      for(int var2 = 2; var2 < this.y; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public final void U(x_ var1) {
      if(this.y < 3) {
         this.y = 3;
         this.K = new double[3];
      }

      this.K[0] = (double)var1.q;
      this.K[1] = (double)var1.Q;
      this.K[2] = (double)var1.G;

      for(int var2 = 3; var2 < this.y; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public final void J(go var1) {
      if(this.y < 3) {
         this.y = 3;
         this.K = new double[3];
      }

      this.K[0] = var1.n;
      this.K[1] = var1.Z;
      this.K[2] = var1.B;

      for(int var2 = 3; var2 < this.y; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public final void n(ra var1) {
      if(this.y < 4) {
         this.y = 4;
         this.K = new double[4];
      }

      this.K[0] = (double)var1.j;
      this.K[1] = (double)var1.v;
      this.K[2] = (double)var1.M;
      this.K[3] = (double)var1.U;

      for(int var2 = 4; var2 < this.y; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public final void O(uo var1) {
      if(this.y < 4) {
         this.y = 4;
         this.K = new double[4];
      }

      this.K[0] = var1.M;
      this.K[1] = var1.b;
      this.K[2] = var1.G;
      this.K[3] = var1.d;

      for(int var2 = 4; var2 < this.y; ++var2) {
         this.K[var2] = 0.0D;
      }

   }

   public final int K() {
      return this.K.length;
   }

   public final double z(int var1) {
      return this.K[var1];
   }

   public final void c(int var1, double var2) {
      this.K[var1] = var2;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer(this.y * 8);

      for(int var2 = 0; var2 < this.y; ++var2) {
         var1.append(this.K[var2]).append(" ");
      }

      return var1.toString();
   }

   public int hashCode() {
      long var1 = 1L;

      for(int var3 = 0; var3 < this.y; ++var3) {
         var1 = op.l(var1, this.K[var3]);
      }

      return op.K(var1);
   }

   public boolean H(zx var1) {
      if(this.y != var1.y) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.y; ++var2) {
            if(this.K[var2] != var1.K[var2]) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean equals(Object var1) {
      zx var2 = (zx)var1;
      if(this.y != var2.y) {
         return false;
      } else {
         for(int var3 = 0; var3 < this.y; ++var3) {
            if(this.K[var3] != var2.K[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean E(zx var1, double var2) {
      if(this.y != var1.y) {
         return false;
      } else {
         for(int var6 = 0; var6 < this.y; ++var6) {
            double var4 = this.K[var6] - var1.K[var6];
            if((var4 < 0.0D?-var4:var4) > var2) {
               return false;
            }
         }

         return true;
      }
   }

   public final double Q(zx var1) {
      if(this.y != var1.y) {
         throw new dm(bc.I("GVector14"));
      } else {
         double var2 = 0.0D;

         for(int var4 = 0; var4 < this.y; ++var4) {
            var2 += this.K[var4] * var1.K[var4];
         }

         return var2;
      }
   }

   public final void w(_m var1, _m var2, _m var3, zx var4) {
      if(var1.u == var4.K() && var1.u == var1.Z && var1.u == var2.u) {
         if(var2.Z == this.K.length && var2.Z == var3.Z && var2.Z == var3.u) {
            _m var5 = new _m(var1.u, var2.Z);
            var5.h(var1, var3);
            var5.e(var1, var2);
            var5.r();
            this.B(var5, var4);
         } else {
            throw new dm(bc.I("GVector23"));
         }
      } else {
         throw new dm(bc.I("GVector15"));
      }
   }

   public final void A(_m var1, zx var2, zx var3) {
      ra.C();
      int var5 = var1.u * var1.Z;
      double[] var6 = new double[var5];
      double[] var7 = new double[var5];
      int[] var8 = new int[var2.K()];
      if(var1.u != var2.K()) {
         throw new dm(bc.I("GVector16"));
      } else if(var1.u != var3.K()) {
         throw new dm(bc.I("GVector24"));
      } else if(var1.u != var1.Z) {
         throw new dm(bc.I("GVector25"));
      } else {
         int var9 = 0;
         if(var9 < var1.u) {
            int var10 = 0;
            if(var10 < var1.Z) {
               var6[var9 * var1.Z + var10] = var1.d[var9][var10];
               ++var10;
            }

            ++var9;
         }

         var9 = 0;
         if(var9 < var5) {
            var7[var9] = 0.0D;
            ++var9;
         }

         var9 = 0;
         if(var9 < var1.u) {
            var7[var9 * var1.Z] = var2.K[var9];
            ++var9;
         }

         var9 = 0;
         if(var9 < var1.Z) {
            var8[var9] = (int)var3.K[var9];
            ++var9;
         }

         _m.g(var1.u, var6, var8, var7);
         var9 = 0;
         if(var9 < var1.u) {
            this.K[var9] = var7[var9 * var1.Z];
            ++var9;
         }

      }
   }

   public final double h(zx var1) {
      return Math.acos(this.Q(var1) / (this.C() * var1.C()));
   }

   /** @deprecated */
   public final void l(zx var1, zx var2, float var3) {
      this.l(var1, var2, (double)var3);
   }

   /** @deprecated */
   public final void z(zx var1, float var2) {
      this.E(var1, (double)var2);
   }

   public final void l(zx var1, zx var2, double var3) {
      if(var2.y != var1.y) {
         throw new dm(bc.I("GVector20"));
      } else if(this.y != var1.y) {
         throw new dm(bc.I("GVector21"));
      } else {
         for(int var5 = 0; var5 < this.y; ++var5) {
            this.K[var5] = (1.0D - var3) * var1.K[var5] + var3 * var2.K[var5];
         }

      }
   }

   public final void E(zx var1, double var2) {
      if(var1.y != this.y) {
         throw new dm(bc.I("GVector22"));
      } else {
         for(int var4 = 0; var4 < this.y; ++var4) {
            this.K[var4] = (1.0D - var2) * this.K[var4] + var2 * var1.K[var4];
         }

      }
   }

   public Object clone() {
      zx var1 = null;
      var1 = (zx)super.clone();
      var1.K = new double[this.y];

      for(int var2 = 0; var2 < this.y; ++var2) {
         var1.K[var2] = this.K[var2];
      }

      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
