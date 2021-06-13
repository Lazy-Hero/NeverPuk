package net.w;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.gh;
import net.y9.l2;

public class g extends x {
   private Random O;
   private net.yv.r E;
   private net.u.j B = net.u.j.V;
   int M;
   int R;
   double v = 0.618D;
   double b = 0.381D;
   double W = 1.0D;
   double d = 1.0D;
   int H = 1;
   int L = 12;
   int i = 4;
   List c;

   public g(boolean var1) {
      super(var1);
   }

   void o() {
      f.j();
      this.R = (int)((double)this.M * this.v);
      if(this.R >= this.M) {
         this.R = this.M - 1;
      }

      int var2 = (int)(1.382D + Math.pow(this.d * (double)this.M / 13.0D, 2.0D));
      if(var2 < 1) {
         var2 = 1;
      }

      int var3 = this.B.h() + this.R;
      int var4 = this.M - this.i;
      this.c = Lists.newArrayList();
      this.c.add(new g.x(this.B.J(var4), var3));
      float var5 = this.g(var4);
      if(var5 >= 0.0F) {
         int var6 = 0;
         if(var6 < var2) {
            double var7 = this.W * (double)var5 * ((double)this.O.nextFloat() + 0.328D);
            double var9 = (double)(this.O.nextFloat() * 2.0F) * 3.141592653589793D;
            double var11 = var7 * Math.sin(var9) + 0.5D;
            double var13 = var7 * Math.cos(var9) + 0.5D;
            net.u.j var15 = this.B.G(var11, (double)(var4 - 1), var13);
            net.u.j var16 = var15.J(this.i);
            if(this.R(var15, var16) == -1) {
               int var17 = this.B.t() - var15.t();
               int var18 = this.B.y() - var15.y();
               double var19 = (double)var15.h() - Math.sqrt((double)(var17 * var17 + var18 * var18)) * this.b;
               int var21 = var19 > (double)var3?var3:(int)var19;
               net.u.j var22 = new net.u.j(this.B.t(), var21, this.B.y());
               if(this.R(var22, var15) == -1) {
                  this.c.add(new g.x(var15, var22.h()));
               }
            }

            ++var6;
         }
      }

      --var4;
   }

   void B(net.u.j var1, float var2, net.yw.n var3) {
      int var4 = (int)((double)var2 + 0.618D);

      for(int var5 = -var4; var5 <= var4; ++var5) {
         for(int var6 = -var4; var6 <= var4; ++var6) {
            if(Math.pow((double)Math.abs(var5) + 0.5D, 2.0D) + Math.pow((double)Math.abs(var6) + 0.5D, 2.0D) <= (double)(var2 * var2)) {
               net.u.j var7 = var1.F(var5, 0, var6);
               net.y1.l var8 = this.E.Z(var7).n();
               if(var8 == net.y1.l.q || var8 == net.y1.l.h) {
                  this.k(this.E, var7, var3);
               }
            }
         }
      }

   }

   float g(int var1) {
      if((float)var1 < (float)this.M * 0.3F) {
         return -1.0F;
      } else {
         float var2 = (float)this.M / 2.0F;
         float var3 = var2 - (float)var1;
         float var4 = net.u.t.g(var2 * var2 - var3 * var3);
         if(var3 == 0.0F) {
            var4 = var2;
         } else if(Math.abs(var3) >= var2) {
            return 0.0F;
         }

         return var4 * 0.5F;
      }
   }

   float q(int var1) {
      return var1 < this.i?(var1 != this.i - 1?3.0F:2.0F):-1.0F;
   }

   void h(net.u.j var1) {
      for(int var2 = 0; var2 < this.i; ++var2) {
         this.B(var1.J(var2), this.q(var2), net.nb.f.Tu.p().s(gh.u, Boolean.valueOf(false)));
      }

   }

   void O(net.u.j var1, net.u.j var2, net.y9.l var3) {
      net.u.j var4 = var2.F(-var1.t(), -var1.h(), -var1.y());
      int var5 = this.D(var4);
      float var6 = (float)var4.t() / (float)var5;
      float var7 = (float)var4.h() / (float)var5;
      float var8 = (float)var4.y() / (float)var5;

      for(int var9 = 0; var9 <= var5; ++var9) {
         net.u.j var10 = var1.G((double)(0.5F + (float)var9 * var6), (double)(0.5F + (float)var9 * var7), (double)(0.5F + (float)var9 * var8));
         l2.g var11 = this.M(var1, var10);
         this.k(this.E, var10, var3.p().s(l2.l, var11));
      }

   }

   private int D(net.u.j var1) {
      int var2 = net.u.t.l(var1.t());
      int var3 = net.u.t.l(var1.h());
      int var4 = net.u.t.l(var1.y());
      return var4 > var2 && var4 > var3?var4:(var3 > var2?var3:var2);
   }

   private l2.g M(net.u.j var1, net.u.j var2) {
      l2.g var3 = l2.g.Y;
      int var4 = Math.abs(var2.t() - var1.t());
      int var5 = Math.abs(var2.y() - var1.y());
      int var6 = Math.max(var4, var5);
      if(var4 == var6) {
         var3 = l2.g.X;
      } else if(var5 == var6) {
         var3 = l2.g.Z;
      }

      return var3;
   }

   void z() {
      for(g.x var2 : this.c) {
         this.h(var2);
      }

   }

   boolean m(int var1) {
      return (double)var1 >= (double)this.M * 0.2D;
   }

   void n() {
      net.u.j var1 = this.B;
      net.u.j var2 = this.B.J(this.R);
      net.y9.l var3 = net.nb.f.u6;
      this.O(var1, var2, var3);
      if(this.H == 2) {
         this.O(var1.g(), var2.g(), var3);
         this.O(var1.g().d(), var2.g().d(), var3);
         this.O(var1.d(), var2.d(), var3);
      }

   }

   void g() {
      for(g.x var2 : this.c) {
         int var3 = var2.d();
         net.u.j var4 = new net.u.j(this.B.t(), var3, this.B.y());
         if(!var4.equals(var2) && this.m(var3 - this.B.h())) {
            this.O(var4, var2, net.nb.f.u6);
         }
      }

   }

   int R(net.u.j var1, net.u.j var2) {
      net.u.j var3 = var2.F(-var1.t(), -var1.h(), -var1.y());
      int var4 = this.D(var3);
      float var10000 = (float)var3.t() / (float)var4;
      var10000 = (float)var3.h() / (float)var4;
      var10000 = (float)var3.y() / (float)var4;
      return -1;
   }

   public void W() {
      this.i = 5;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      this.E = var1;
      this.B = var3;
      this.O = new Random(var2.nextLong());
      if(this.M == 0) {
         this.M = 5 + this.O.nextInt(this.L);
      }

      if(!this.N()) {
         return false;
      } else {
         this.o();
         this.z();
         this.n();
         this.g();
         return true;
      }
   }

   private boolean N() {
      net.y9.l var1 = this.E.Z(this.B.b()).Q();
      if(var1 != net.nb.f.dl && var1 != net.nb.f.p && var1 != net.nb.f.dJ) {
         return false;
      } else {
         int var2 = this.R(this.B, this.B.J(this.M - 1));
         if(var2 == -1) {
            return true;
         } else if(var2 < 6) {
            return false;
         } else {
            this.M = var2;
            return true;
         }
      }
   }

   private static xn b(xn var0) {
      return var0;
   }

   static class x extends net.u.j {
      private final int Q;

      public x(net.u.j var1, int var2) {
         super(var1.t(), var1.h(), var1.y());
         this.Q = var2;
      }

      public int d() {
         return this.Q;
      }
   }
}
