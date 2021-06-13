package net.y4;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y4.b;
import net.y4.k;
import net.y4.p;
import net.y4.v;
import net.y9.g3;
import net.y9.gc;
import net.y9.gg;
import net.y9.lg;
import net.yz.aq;
import net.yz.m_;

public class f {
   public static void A() {
      b.v(f.j.class, "MSCorridor");
      b.v(f.g.class, "MSCrossing");
      b.v(f.z.class, "MSRoom");
      b.v(f.i.class, "MSStairs");
   }

   private static f.x I(List var0, Random var1, int var2, int var3, int var4, @Nullable aq var5, int var6, k.n var7) {
      p.d();
      int var9 = var1.nextInt(100);
      if(var9 >= 80) {
         v var12 = f.g.E(var0, var1, var2, var3, var4, var5);
         return new f.g(var6, var1, var12, var5, var7);
      } else if(var9 >= 70) {
         v var11 = f.i.s(var0, var1, var2, var3, var4, var5);
         return new f.i(var6, var1, var11, var5, var7);
      } else {
         v var10 = f.j.I(var0, var1, var2, var3, var4, var5);
         return new f.j(var6, var1, var10, var5, var7);
      }
   }

   private static f.x L(p var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      if(var7 > 8) {
         return null;
      } else if(Math.abs(var3 - var0.J().i) <= 80 && Math.abs(var5 - var0.J().p) <= 80) {
         k.n var8 = ((f.x)var0).g;
         f.x var9 = I(var1, var2, var3, var4, var5, var6, var7 + 1, var8);
         var1.add(var9);
         var9.S(var0, var1, var2);
         return var9;
      } else {
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class g extends f.x {
      private aq d;
      private boolean B;

      public g() {
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("tf", this.B);
         var1.r("D", this.d.u());
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.B = var1.i("tf");
         this.d = aq.Q(var1.P("D"));
      }

      public g(int var1, Random var2, v var3, @Nullable aq var4, k.n var5) {
         super(var1, var5);
         this.d = var4;
         this.w = var3;
         this.B = var3.I() > 3;
      }

      public static v E(List var0, Random var1, int var2, int var3, int var4, aq var5) {
         v var6 = new v(var2, var3, var4, var2, var3 + 2, var4);
         if(var1.nextInt(4) == 0) {
            var6.P += 4;
         }

         switch(null.C[var5.ordinal()]) {
         case 1:
         default:
            var6.i = var2 - 1;
            var6.e = var2 + 3;
            var6.p = var4 - 4;
            break;
         case 2:
            var6.i = var2 - 1;
            var6.e = var2 + 3;
            var6.J = var4 + 3 + 1;
            break;
         case 3:
            var6.i = var2 - 4;
            var6.p = var4 - 1;
            var6.J = var4 + 3;
            break;
         case 4:
            var6.e = var2 + 3 + 1;
            var6.p = var4 - 1;
            var6.J = var4 + 3;
         }

         return p.H(var0, var6) != null?null:var6;
      }

      public void S(p var1, List var2, Random var3) {
         int var4 = this.Q();
         switch(null.C[this.d.ordinal()]) {
         case 1:
         default:
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.p - 1, aq.NORTH, var4);
            f.L(var1, var2, var3, this.w.i - 1, this.w.D, this.w.p + 1, aq.WEST, var4);
            f.L(var1, var2, var3, this.w.e + 1, this.w.D, this.w.p + 1, aq.EAST, var4);
            break;
         case 2:
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.J + 1, aq.SOUTH, var4);
            f.L(var1, var2, var3, this.w.i - 1, this.w.D, this.w.p + 1, aq.WEST, var4);
            f.L(var1, var2, var3, this.w.e + 1, this.w.D, this.w.p + 1, aq.EAST, var4);
            break;
         case 3:
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.p - 1, aq.NORTH, var4);
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.J + 1, aq.SOUTH, var4);
            f.L(var1, var2, var3, this.w.i - 1, this.w.D, this.w.p + 1, aq.WEST, var4);
            break;
         case 4:
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.p - 1, aq.NORTH, var4);
            f.L(var1, var2, var3, this.w.i + 1, this.w.D, this.w.J + 1, aq.SOUTH, var4);
            f.L(var1, var2, var3, this.w.e + 1, this.w.D, this.w.p + 1, aq.EAST, var4);
         }

         if(this.B) {
            if(var3.nextBoolean()) {
               f.L(var1, var2, var3, this.w.i + 1, this.w.D + 3 + 1, this.w.p - 1, aq.NORTH, var4);
            }

            if(var3.nextBoolean()) {
               f.L(var1, var2, var3, this.w.i - 1, this.w.D + 3 + 1, this.w.p + 1, aq.WEST, var4);
            }

            if(var3.nextBoolean()) {
               f.L(var1, var2, var3, this.w.e + 1, this.w.D + 3 + 1, this.w.p + 1, aq.EAST, var4);
            }

            if(var3.nextBoolean()) {
               f.L(var1, var2, var3, this.w.i + 1, this.w.D + 3 + 1, this.w.J + 1, aq.SOUTH, var4);
            }
         }

      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            net.yw.n var5 = this.l();
            if(this.B) {
               this.E(var1, var3, this.w.i + 1, this.w.D, this.w.p, this.w.e - 1, this.w.D + 3 - 1, this.w.J, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
               this.E(var1, var3, this.w.i, this.w.D, this.w.p + 1, this.w.e, this.w.D + 3 - 1, this.w.J - 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
               this.E(var1, var3, this.w.i + 1, this.w.P - 2, this.w.p, this.w.e - 1, this.w.P, this.w.J, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
               this.E(var1, var3, this.w.i, this.w.P - 2, this.w.p + 1, this.w.e, this.w.P, this.w.J - 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
               this.E(var1, var3, this.w.i + 1, this.w.D + 3, this.w.p + 1, this.w.e - 1, this.w.D + 3, this.w.J - 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            this.E(var1, var3, this.w.i + 1, this.w.D, this.w.p, this.w.e - 1, this.w.P, this.w.J, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.E(var1, var3, this.w.i, this.w.D, this.w.p + 1, this.w.e, this.w.P, this.w.J - 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.y(var1, var3, this.w.i + 1, this.w.D, this.w.p + 1, this.w.P);
            this.y(var1, var3, this.w.i + 1, this.w.D, this.w.J - 1, this.w.P);
            this.y(var1, var3, this.w.e - 1, this.w.D, this.w.p + 1, this.w.P);
            this.y(var1, var3, this.w.e - 1, this.w.D, this.w.J - 1, this.w.P);
            int var6 = this.w.i;
            if(var6 <= this.w.e) {
               int var7 = this.w.p;
               if(var7 <= this.w.J) {
                  if(this.r(var1, var6, this.w.D - 1, var7, var3).n() == net.y1.l.q && this.N(var1, var6, this.w.D - 1, var7, var3) < 8) {
                     this.N(var1, var5, var6, this.w.D - 1, var7, var3);
                  }

                  ++var7;
               }

               ++var6;
            }

            return true;
         }
      }

      private void y(net.yv.r var1, v var2, int var3, int var4, int var5, int var6) {
         if(this.r(var1, var3, var6 + 1, var5, var2).n() != net.y1.l.q) {
            this.E(var1, var2, var3, var4, var5, var3, var6, var5, this.l(), net.nb.f.ou.p(), false);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class i extends f.x {
      public i() {
      }

      public i(int var1, Random var2, v var3, aq var4, k.n var5) {
         super(var1, var5);
         this.n(var4);
         this.w = var3;
      }

      public static v s(List var0, Random var1, int var2, int var3, int var4, aq var5) {
         v var6 = new v(var2, var3 - 5, var4, var2, var3 + 2, var4);
         switch(null.C[var5.ordinal()]) {
         case 1:
         default:
            var6.e = var2 + 2;
            var6.p = var4 - 8;
            break;
         case 2:
            var6.e = var2 + 2;
            var6.J = var4 + 8;
            break;
         case 3:
            var6.i = var2 - 8;
            var6.J = var4 + 2;
            break;
         case 4:
            var6.e = var2 + 8;
            var6.J = var4 + 2;
         }

         return p.H(var0, var6) != null?null:var6;
      }

      public void S(p var1, List var2, Random var3) {
         int var5 = this.Q();
         p.d();
         aq var6 = this.L();
         switch(null.C[var6.ordinal()]) {
         case 1:
         default:
            f.L(var1, var2, var3, this.w.i, this.w.D, this.w.p - 1, aq.NORTH, var5);
         case 2:
            f.L(var1, var2, var3, this.w.i, this.w.D, this.w.J + 1, aq.SOUTH, var5);
         case 3:
            f.L(var1, var2, var3, this.w.i - 1, this.w.D, this.w.p, aq.WEST, var5);
         case 4:
            f.L(var1, var2, var3, this.w.e + 1, this.w.D, this.w.p, aq.EAST, var5);
         }
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         if(!this.w(var1, var3)) {
            this.E(var1, var3, 0, 5, 0, 2, 7, 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.E(var1, var3, 0, 0, 7, 2, 2, 8, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            int var4 = 0;

            while(true) {
               this.E(var1, var3, 0, 5 - var4 - 1, 2 + var4, 2, 7 - var4, 2 + var4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
               ++var4;
            }
         }

         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class j extends f.x {
      private boolean E;
      private boolean T;
      private boolean N;
      private int M;

      public j() {
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("hr", this.E);
         var1.c("sc", this.T);
         var1.c("hps", this.N);
         var1.r("Num", this.M);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.E = var1.i("hr");
         this.T = var1.i("sc");
         this.N = var1.i("hps");
         this.M = var1.P("Num");
      }

      public j(int var1, Random var2, v var3, aq var4, k.n var5) {
         super(var1, var5);
         this.n(var4);
         this.w = var3;
         this.E = var2.nextInt(3) == 0;
         this.T = !this.E && var2.nextInt(23) == 0;
         if(this.L().r() == aq.l.Z) {
            this.M = var3.X() / 5;
         } else {
            this.M = var3.t() / 5;
         }

      }

      public static v I(List var0, Random var1, int var2, int var3, int var4, aq var5) {
         v var6 = new v(var2, var3, var4, var2, var3 + 2, var4);
         int var7 = var1.nextInt(3) + 2;

         while(true) {
            int var8 = var7 * 5;
            switch(null.C[var5.ordinal()]) {
            case 1:
            default:
               var6.e = var2 + 2;
               var6.p = var4 - (var8 - 1);
               break;
            case 2:
               var6.e = var2 + 2;
               var6.J = var4 + (var8 - 1);
               break;
            case 3:
               var6.i = var2 - (var8 - 1);
               var6.J = var4 + 2;
               break;
            case 4:
               var6.e = var2 + (var8 - 1);
               var6.J = var4 + 2;
            }

            if(p.H(var0, var6) == null) {
               return var6;
            }

            --var7;
         }
      }

      public void S(p var1, List var2, Random var3) {
         p.d();
         int var5 = this.Q();
         int var6 = var3.nextInt(4);
         aq var7 = this.L();
         switch(null.C[var7.ordinal()]) {
         case 1:
         default:
            if(var6 <= 1) {
               f.L(var1, var2, var3, this.w.i, this.w.D - 1 + var3.nextInt(3), this.w.p - 1, var7, var5);
            }

            if(var6 == 2) {
               f.L(var1, var2, var3, this.w.i - 1, this.w.D - 1 + var3.nextInt(3), this.w.p, aq.WEST, var5);
            }

            f.L(var1, var2, var3, this.w.e + 1, this.w.D - 1 + var3.nextInt(3), this.w.p, aq.EAST, var5);
         case 2:
            if(var6 <= 1) {
               f.L(var1, var2, var3, this.w.i, this.w.D - 1 + var3.nextInt(3), this.w.J + 1, var7, var5);
            }

            if(var6 == 2) {
               f.L(var1, var2, var3, this.w.i - 1, this.w.D - 1 + var3.nextInt(3), this.w.J - 3, aq.WEST, var5);
            }

            f.L(var1, var2, var3, this.w.e + 1, this.w.D - 1 + var3.nextInt(3), this.w.J - 3, aq.EAST, var5);
         case 3:
            if(var6 <= 1) {
               f.L(var1, var2, var3, this.w.i - 1, this.w.D - 1 + var3.nextInt(3), this.w.p, var7, var5);
            }

            if(var6 == 2) {
               f.L(var1, var2, var3, this.w.i, this.w.D - 1 + var3.nextInt(3), this.w.p - 1, aq.NORTH, var5);
            }

            f.L(var1, var2, var3, this.w.i, this.w.D - 1 + var3.nextInt(3), this.w.J + 1, aq.SOUTH, var5);
         case 4:
            if(var6 <= 1) {
               f.L(var1, var2, var3, this.w.e + 1, this.w.D - 1 + var3.nextInt(3), this.w.p, var7, var5);
            }

            if(var6 == 2) {
               f.L(var1, var2, var3, this.w.e - 3, this.w.D - 1 + var3.nextInt(3), this.w.p - 1, aq.NORTH, var5);
            }

            f.L(var1, var2, var3, this.w.e - 3, this.w.D - 1 + var3.nextInt(3), this.w.J + 1, aq.SOUTH, var5);
            if(var5 < 8) {
               if(var7 != aq.NORTH && var7 != aq.SOUTH) {
                  int var8 = this.w.i + 3;
                  if(var8 + 3 <= this.w.e) {
                     int var9 = var3.nextInt(5);
                     if(var9 == 0) {
                        f.L(var1, var2, var3, var8, this.w.D, this.w.p - 1, aq.NORTH, var5 + 1);
                     }

                     if(var9 == 1) {
                        f.L(var1, var2, var3, var8, this.w.D, this.w.J + 1, aq.SOUTH, var5 + 1);
                     }

                     var8 = var8 + 5;
                  }
               }

               int var11 = this.w.p + 3;
               if(var11 + 3 <= this.w.J) {
                  int var13 = var3.nextInt(5);
                  if(var13 == 0) {
                     f.L(var1, var2, var3, this.w.i - 1, this.w.D, var11, aq.WEST, var5 + 1);
                  }

                  if(var13 == 1) {
                     f.L(var1, var2, var3, this.w.e + 1, this.w.D, var11, aq.EAST, var5 + 1);
                  }

                  var11 = var11 + 5;
               }
            }

         }
      }

      protected boolean Y(net.yv.r var1, v var2, Random var3, int var4, int var5, int var6, m_ var7) {
         net.u.j var8 = new net.u.j(this.g(var4, var6), this.Z(var5), this.w(var4, var6));
         if(var2.Y(var8) && var1.Z(var8).n() == net.y1.l.q && var1.Z(var8.b()).n() != net.y1.l.q) {
            net.yw.n var9 = net.nb.f.uU.p().s(gg.p, var3.nextBoolean()?g3.v.NORTH_SOUTH:g3.v.EAST_WEST);
            this.N(var1, var9, var4, var5, var6, var2);
            net.nm.t var10 = new net.nm.t(var1, (double)((float)var8.t() + 0.5F), (double)((float)var8.h() + 0.5F), (double)((float)var8.y() + 0.5F));
            var10.f(var7, var3.nextLong());
            var1.S(var10);
            return true;
         } else {
            return false;
         }
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         if(!this.w(var1, var3)) {
            boolean var10000 = false;
            var10000 = true;
            var10000 = false;
            var10000 = true;
            int var8 = this.M * 5 - 1;
            net.yw.n var9 = this.l();
            this.E(var1, var3, 0, 0, 0, 2, 1, var8, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.A(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var8, net.nb.f.ou.p(), net.nb.f.ou.p(), false, 0);
            if(this.T) {
               this.A(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var8, net.nb.f.o.p(), net.nb.f.ou.p(), false, 8);
            }

            for(int var10 = 0; var10 < this.M; ++var10) {
               int var11 = 2 + var10 * 5;
               this.W(var1, var3, 0, 0, var11, 2, 2, var2);
               this.C(var1, var3, var2, 0.1F, 0, 2, var11 - 1);
               this.C(var1, var3, var2, 0.1F, 2, 2, var11 - 1);
               this.C(var1, var3, var2, 0.1F, 0, 2, var11 + 1);
               this.C(var1, var3, var2, 0.1F, 2, 2, var11 + 1);
               this.C(var1, var3, var2, 0.05F, 0, 2, var11 - 2);
               this.C(var1, var3, var2, 0.05F, 2, 2, var11 - 2);
               this.C(var1, var3, var2, 0.05F, 0, 2, var11 + 2);
               this.C(var1, var3, var2, 0.05F, 2, 2, var11 + 2);
               if(var2.nextInt(100) == 0) {
                  this.Y(var1, var3, var2, 2, 0, var11 - 1, net.y7.p.pv);
               }

               if(var2.nextInt(100) == 0) {
                  this.Y(var1, var3, var2, 0, 0, var11 + 1, net.y7.p.pv);
               }

               if(this.T && !this.N) {
                  int var12 = this.Z(0);
                  int var13 = var11 - 1 + var2.nextInt(3);
                  int var14 = this.g(1, var13);
                  int var15 = this.w(1, var13);
                  net.u.j var16 = new net.u.j(var14, var12, var15);
                  if(var3.Y(var16) && this.N(var1, 1, 0, var13, var3) < 8) {
                     this.N = true;
                     var1.k(var16, net.nb.f.uw.p(), 2);
                     net.ni.v var17 = var1.L(var16);
                     if(var17 instanceof net.ni.u) {
                        ((net.ni.u)var17).H().S(net.ne.v.P(net.nk.o.class));
                     }
                  }
               }
            }

            int var18 = 0;

            while(true) {
               for(int var19 = 0; var19 <= var8; ++var19) {
                  boolean var20 = true;
                  net.yw.n var21 = this.r(var1, var18, -1, var19, var3);
                  if(var21.n() == net.y1.l.q && this.N(var1, var18, -1, var19, var3) < 8) {
                     boolean var22 = true;
                     this.N(var1, var9, var18, -1, var19, var3);
                  }
               }

               ++var18;
            }
         }

         return false;
      }

      private void W(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, Random var8) {
         if(this.f(var1, var2, var3, var7, var6, var5)) {
            net.yw.n var9 = this.l();
            net.yw.n var10 = this.U();
            net.yw.n var11 = net.nb.f.ou.p();
            this.E(var1, var2, var3, var4, var5, var3, var6 - 1, var5, var10, var11, false);
            this.E(var1, var2, var7, var4, var5, var7, var6 - 1, var5, var10, var11, false);
            if(var8.nextInt(4) == 0) {
               this.E(var1, var2, var3, var6, var5, var3, var6, var5, var9, var11, false);
               this.E(var1, var2, var7, var6, var5, var7, var6, var5, var9, var11, false);
            } else {
               this.E(var1, var2, var3, var6, var5, var7, var6, var5, var9, var11, false);
               this.e(var1, var2, var8, 0.05F, var3 + 1, var6, var5 - 1, net.nb.f.uZ.p().s(lg.n, aq.NORTH));
               this.e(var1, var2, var8, 0.05F, var3 + 1, var6, var5 + 1, net.nb.f.uZ.p().s(lg.n, aq.SOUTH));
            }
         }

      }

      private void C(net.yv.r var1, v var2, Random var3, float var4, int var5, int var6, int var7) {
         if(this.N(var1, var5, var6, var7, var2) < 8) {
            this.e(var1, var2, var3, var4, var5, var6, var7, net.nb.f.o.p());
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   abstract static class x extends p {
      protected k.n g;

      public x() {
      }

      public x(int var1, k.n var2) {
         super(var1);
         this.g = var2;
      }

      protected void x(net.nj.f var1) {
         var1.r("MST", this.g.ordinal());
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         this.g = k.n.i(var1.P("MST"));
      }

      protected net.yw.n l() {
         switch(null.e[this.g.ordinal()]) {
         case 1:
         default:
            return net.nb.f.oN.p();
         case 2:
            return net.nb.f.oN.p().s(gc.F, gc.i.DARK_OAK);
         }
      }

      protected net.yw.n U() {
         switch(null.e[this.g.ordinal()]) {
         case 1:
         default:
            return net.nb.f.I.p();
         case 2:
            return net.nb.f.TX.p();
         }
      }

      protected boolean f(net.yv.r var1, v var2, int var3, int var4, int var5, int var6) {
         int[] var7 = p.d();
         if(var3 <= var4) {
            if(this.r(var1, var3, var5 + 1, var6, var2).n() == net.y1.l.q) {
               return false;
            }

            int var8 = var3 + 1;
         }

         return true;
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class z extends f.x {
      private final List Z = Lists.newLinkedList();

      public z() {
      }

      public z(int var1, Random var2, int var3, int var4, k.n var5) {
         super(var1, var5);
         this.g = var5;
         this.w = new v(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
      }

      public void S(p var1, List var2, Random var3) {
         p.d();
         int var5 = this.Q();
         int var6 = this.w.I() - 3 - 1;
         if(var6 <= 0) {
            var6 = 1;
         }

         int var7 = 0;
         if(var7 < this.w.t()) {
            var7 = var7 + var3.nextInt(this.w.t());
            if(var7 + 3 > this.w.t()) {
               ;
            }

            f.x var8 = f.L(var1, var2, var3, this.w.i + var7, this.w.D + var3.nextInt(var6) + 1, this.w.p - 1, aq.NORTH, var5);
            v var9 = var8.J();
            this.Z.add(new v(var9.i, var9.D, this.w.p, var9.e, var9.P, this.w.p + 1));
            var7 = var7 + 4;
         }

         var7 = 0;
         if(var7 < this.w.t()) {
            var7 = var7 + var3.nextInt(this.w.t());
            if(var7 + 3 > this.w.t()) {
               ;
            }

            f.x var21 = f.L(var1, var2, var3, this.w.i + var7, this.w.D + var3.nextInt(var6) + 1, this.w.J + 1, aq.SOUTH, var5);
            v var24 = var21.J();
            this.Z.add(new v(var24.i, var24.D, this.w.J - 1, var24.e, var24.P, this.w.J));
            var7 = var7 + 4;
         }

         var7 = 0;
         if(var7 < this.w.X()) {
            var7 = var7 + var3.nextInt(this.w.X());
            if(var7 + 3 > this.w.X()) {
               ;
            }

            f.x var22 = f.L(var1, var2, var3, this.w.i - 1, this.w.D + var3.nextInt(var6) + 1, this.w.p + var7, aq.WEST, var5);
            v var25 = var22.J();
            this.Z.add(new v(this.w.i, var25.D, var25.p, this.w.i + 1, var25.P, var25.J));
            var7 = var7 + 4;
         }

         var7 = 0;
         if(var7 < this.w.X()) {
            var7 = var7 + var3.nextInt(this.w.X());
            if(var7 + 3 > this.w.X()) {
               ;
            }

            f.x var23 = f.L(var1, var2, var3, this.w.e + 1, this.w.D + var3.nextInt(var6) + 1, this.w.p + var7, aq.EAST, var5);
            v var26 = var23.J();
            this.Z.add(new v(this.w.e - 1, var26.D, var26.p, this.w.e, var26.P, var26.J));
            var7 = var7 + 4;
         }

      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.E(var1, var3, this.w.i, this.w.D, this.w.p, this.w.e, this.w.D, this.w.J, net.nb.f.dl.p(), net.nb.f.ou.p(), true);
            this.E(var1, var3, this.w.i, this.w.D + 1, this.w.p, this.w.e, Math.min(this.w.D + 3, this.w.P), this.w.J, net.nb.f.ou.p(), net.nb.f.ou.p(), false);

            for(v var5 : this.Z) {
               this.E(var1, var3, var5.i, var5.P - 2, var5.p, var5.e, var5.P, var5.J, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            this.m(var1, var3, this.w.i, this.w.D + 4, this.w.p, this.w.e, this.w.P, this.w.J, net.nb.f.ou.p(), false);
            return true;
         }
      }

      public void g(int var1, int var2, int var3) {
         super.g(var1, var2, var3);

         for(v var5 : this.Z) {
            var5.D(var1, var2, var3);
         }

      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         net.nj.h var2 = new net.nj.h();

         for(v var4 : this.Z) {
            var2.m(var4.I());
         }

         var1.K("Entrances", var2);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         net.nj.h var3 = var1.A("Entrances", 11);

         for(int var4 = 0; var4 < var3.z(); ++var4) {
            this.Z.add(new v(var3.h(var4)));
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
