package net.ns;

import java.util.Random;
import net.ns.i;
import net.ns.i9;
import net.w.f0;
import net.w.f5;
import net.w.fk;
import net.w.fm;
import net.w.fo;
import net.w.fw;
import net.w.fy;
import net.y9.lc;

public class e {
   protected boolean j;
   protected net.u.j o;
   protected net.cn.z W;
   protected net.w.f L = new net.w.u(4);
   protected net.w.f J = new f5(net.nb.f.TF, 7);
   protected net.w.f C = new f5(net.nb.f.D, 6);
   protected net.w.f i;
   protected net.w.f p;
   protected net.w.f B;
   protected net.w.f Z;
   protected net.w.f t;
   protected net.w.f c;
   protected net.w.f T;
   protected net.w.f R;
   protected net.w.f X;
   protected net.w.f f;
   protected net.w.f l;
   protected fk M = new fk(net.nb.f.dO, net.y9.n.DANDELION);
   protected net.w.f s = new net.w.b(net.nb.f.df);
   protected net.w.f V = new net.w.b(net.nb.f.T);
   protected net.w.f w = new net.w.a();
   protected net.w.f Y = new fm();
   protected net.w.f n = new net.w.r();
   protected net.w.f b = new fy();
   protected int m;
   protected int E;
   protected float e = 0.1F;
   protected int D = 2;
   protected int N = 1;
   protected int P;
   protected int z;
   protected int g;
   protected int h;
   protected int G = 1;
   protected int U = 3;
   protected int x = 1;
   protected int d;
   public boolean q = true;

   public void e(net.yv.r var1, Random var2, i var3, net.u.j var4) {
      if(this.j) {
         throw new RuntimeException("Already decorating");
      } else {
         this.W = net.cn.z.P(var1.B().X()).n();
         this.o = var4;
         this.i = new f0(net.nb.f.dl.p(), this.W.A);
         this.p = new f0(net.nb.f.D.p(), this.W.vl);
         this.B = new f0(net.nb.f.oy.p().s(lc.W, lc.d.GRANITE), this.W.g);
         this.Z = new f0(net.nb.f.oy.p().s(lc.W, lc.d.DIORITE), this.W.vV);
         this.t = new f0(net.nb.f.oy.p().s(lc.W, lc.d.ANDESITE), this.W.U);
         this.c = new f0(net.nb.f.oK.p(), this.W.vS);
         this.T = new f0(net.nb.f.u7.p(), this.W.vq);
         this.R = new f0(net.nb.f.z.p(), this.W.C);
         this.X = new f0(net.nb.f.uT.p(), this.W.S);
         this.f = new f0(net.nb.f.TT.p(), this.W.vt);
         this.l = new f0(net.nb.f.dT.p(), this.W.W);
         this.K(var3, var1, var2);
         this.j = false;
      }
   }

   protected void K(i var1, net.yv.r var2, Random var3) {
      i9.M();
      this.T(var2, var3);
      int var5 = 0;
      if(var5 < this.U) {
         int var6 = var3.nextInt(16) + 8;
         int var7 = var3.nextInt(16) + 8;
         this.J.K(var2, var3, var2.D(this.o.F(var6, 0, var7)));
         ++var5;
      }

      var5 = 0;
      if(var5 < this.x) {
         int var20 = var3.nextInt(16) + 8;
         int var49 = var3.nextInt(16) + 8;
         this.L.K(var2, var3, var2.D(this.o.F(var20, 0, var49)));
         ++var5;
      }

      var5 = 0;
      if(var5 < this.G) {
         int var21 = var3.nextInt(16) + 8;
         int var50 = var3.nextInt(16) + 8;
         this.C.K(var2, var3, var2.D(this.o.F(var21, 0, var50)));
         ++var5;
      }

      var5 = this.E;
      if(Float.compare(var3.nextFloat(), this.e) < 0) {
         ++var5;
      }

      int var22 = 0;
      if(var22 < var5) {
         int var51 = var3.nextInt(16) + 8;
         int var8 = var3.nextInt(16) + 8;
         net.w.x var9 = var1.q(var3);
         var9.W();
         net.u.j var10 = var2.A(this.o.F(var51, 0, var8));
         if(var9.K(var2, var3, var10)) {
            var9.J(var2, var3, var10);
         }

         ++var22;
      }

      var22 = 0;
      if(var22 < this.d) {
         int var52 = var3.nextInt(16) + 8;
         int var67 = var3.nextInt(16) + 8;
         this.w.K(var2, var3, var2.A(this.o.F(var52, 0, var67)));
         ++var22;
      }

      var22 = 0;
      if(var22 < this.D) {
         int var53 = var3.nextInt(16) + 8;
         int var68 = var3.nextInt(16) + 8;
         int var82 = var2.A(this.o.F(var53, 0, var68)).h() + 32;
         if(var82 > 0) {
            int var96 = var3.nextInt(var82);
            net.u.j var11 = this.o.F(var53, var96, var68);
            net.y9.n var12 = var1.j(var3, var11);
            net.y9.n var13 = var12.p().s();
            if(var13.p().n() != net.y1.l.q) {
               this.M.g(var13, var12);
               this.M.K(var2, var3, var11);
            }
         }

         ++var22;
      }

      var22 = 0;
      if(var22 < this.N) {
         int var54 = var3.nextInt(16) + 8;
         int var69 = var3.nextInt(16) + 8;
         int var83 = var2.A(this.o.F(var54, 0, var69)).h() * 2;
         if(var83 > 0) {
            int var97 = var3.nextInt(var83);
            var1.A(var3).K(var2, var3, this.o.F(var54, var97, var69));
         }

         ++var22;
      }

      var22 = 0;
      if(var22 < this.P) {
         int var55 = var3.nextInt(16) + 8;
         int var70 = var3.nextInt(16) + 8;
         int var84 = var2.A(this.o.F(var55, 0, var70)).h() * 2;
         if(var84 > 0) {
            int var98 = var3.nextInt(var84);
            (new net.w.j()).K(var2, var3, this.o.F(var55, var98, var70));
         }

         ++var22;
      }

      var22 = 0;
      if(var22 < this.m) {
         int var56 = var3.nextInt(16) + 8;
         int var71 = var3.nextInt(16) + 8;
         int var85 = var2.A(this.o.F(var56, 0, var71)).h() * 2;
         if(var85 > 0) {
            int var99 = var3.nextInt(var85);
            net.u.j var106 = this.o.F(var56, var99, var71);
            if(var106.h() > 0) {
               net.u.j var109 = var106.b();
               if(!var2.y(var109)) {
                  ;
               }

               var106 = var109;
            }

            this.b.K(var2, var3, var106);
         }

         ++var22;
      }

      var22 = 0;
      if(var22 < this.z) {
         if(var3.nextInt(4) == 0) {
            int var57 = var3.nextInt(16) + 8;
            int var72 = var3.nextInt(16) + 8;
            net.u.j var86 = var2.A(this.o.F(var57, 0, var72));
            this.s.K(var2, var3, var86);
         }

         if(var3.nextInt(8) == 0) {
            int var58 = var3.nextInt(16) + 8;
            int var73 = var3.nextInt(16) + 8;
            int var87 = var2.A(this.o.F(var58, 0, var73)).h() * 2;
            int var100 = var3.nextInt(var87);
            net.u.j var107 = this.o.F(var58, var100, var73);
            this.V.K(var2, var3, var107);
         }

         ++var22;
      }

      if(var3.nextInt(4) == 0) {
         var22 = var3.nextInt(16) + 8;
         int var59 = var3.nextInt(16) + 8;
         int var74 = var2.A(this.o.F(var22, 0, var59)).h() * 2;
         if(var74 > 0) {
            int var88 = var3.nextInt(var74);
            this.s.K(var2, var3, this.o.F(var22, var88, var59));
         }
      }

      if(var3.nextInt(8) == 0) {
         var22 = var3.nextInt(16) + 8;
         int var60 = var3.nextInt(16) + 8;
         int var75 = var2.A(this.o.F(var22, 0, var60)).h() * 2;
         if(var75 > 0) {
            int var89 = var3.nextInt(var75);
            this.V.K(var2, var3, this.o.F(var22, var89, var60));
         }
      }

      var22 = 0;
      if(var22 < this.g) {
         int var61 = var3.nextInt(16) + 8;
         int var76 = var3.nextInt(16) + 8;
         int var90 = var2.A(this.o.F(var61, 0, var76)).h() * 2;
         if(var90 > 0) {
            int var101 = var3.nextInt(var90);
            this.Y.K(var2, var3, this.o.F(var61, var101, var76));
         }

         ++var22;
      }

      var22 = 0;
      int var62 = var3.nextInt(16) + 8;
      int var77 = var3.nextInt(16) + 8;
      int var91 = var2.A(this.o.F(var62, 0, var77)).h() * 2;
      if(var91 > 0) {
         int var102 = var3.nextInt(var91);
         this.Y.K(var2, var3, this.o.F(var62, var102, var77));
      }

      ++var22;
      if(var3.nextInt(32) == 0) {
         var22 = var3.nextInt(16) + 8;
         var62 = var3.nextInt(16) + 8;
         var77 = var2.A(this.o.F(var22, 0, var62)).h() * 2;
         if(var77 > 0) {
            var91 = var3.nextInt(var77);
            (new fo()).K(var2, var3, this.o.F(var22, var91, var62));
         }
      }

      var22 = 0;
      if(var22 < this.h) {
         var62 = var3.nextInt(16) + 8;
         var77 = var3.nextInt(16) + 8;
         var91 = var2.A(this.o.F(var62, 0, var77)).h() * 2;
         if(var91 > 0) {
            int var103 = var3.nextInt(var91);
            this.n.K(var2, var3, this.o.F(var62, var103, var77));
         }

         ++var22;
      }

      if(this.q) {
         var22 = 0;
         var62 = var3.nextInt(16) + 8;
         var77 = var3.nextInt(16) + 8;
         var91 = var3.nextInt(248) + 8;
         if(var91 > 0) {
            int var104 = var3.nextInt(var91);
            net.u.j var108 = this.o.F(var62, var104, var77);
            (new fw(net.nb.f.dy)).K(var2, var3, var108);
         }

         ++var22;
         var22 = 0;
         var62 = var3.nextInt(16) + 8;
         var77 = var3.nextInt(16) + 8;
         var91 = var3.nextInt(var3.nextInt(var3.nextInt(240) + 8) + 8);
         net.u.j var105 = this.o.F(var62, var91, var77);
         (new fw(net.nb.f.dj)).K(var2, var3, var105);
         ++var22;
      }

   }

   protected void T(net.yv.r var1, Random var2) {
      this.o(var1, var2, this.W.m, this.i, this.W.F, this.W.B);
      this.o(var1, var2, this.W.vo, this.p, this.W.v7, this.W.L);
      this.o(var1, var2, this.W.M, this.Z, this.W.a, this.W.y);
      this.o(var1, var2, this.W.vP, this.B, this.W.k, this.W.vB);
      this.o(var1, var2, this.W.b, this.t, this.W.O, this.W.z);
      this.o(var1, var2, this.W.s, this.c, this.W.vM, this.W.x);
      this.o(var1, var2, this.W.f, this.T, this.W.G, this.W.p);
      this.o(var1, var2, this.W.vj, this.R, this.W.H, this.W.vY);
      this.o(var1, var2, this.W.vm, this.X, this.W.vf, this.W.X);
      this.o(var1, var2, this.W.n, this.f, this.W.j, this.W.v6);
      this.s(var1, var2, this.W.E, this.l, this.W.i, this.W.w);
   }

   protected void o(net.yv.r var1, Random var2, int var3, net.w.f var4, int var5, int var6) {
      if(var6 < var5) {
         int var7 = var5;
         var5 = var6;
         var6 = var7;
      } else if(var6 == var5) {
         if(var5 < 255) {
            ++var6;
         } else {
            --var5;
         }
      }

      for(int var9 = 0; var9 < var3; ++var9) {
         net.u.j var8 = this.o.F(var2.nextInt(16), var2.nextInt(var6 - var5) + var5, var2.nextInt(16));
         var4.K(var1, var2, var8);
      }

   }

   protected void s(net.yv.r var1, Random var2, int var3, net.w.f var4, int var5, int var6) {
      for(int var7 = 0; var7 < var3; ++var7) {
         net.u.j var8 = this.o.F(var2.nextInt(16), var2.nextInt(var6) + var2.nextInt(var6) + var5 - var6, var2.nextInt(16));
         var4.K(var1, var2, var8);
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
