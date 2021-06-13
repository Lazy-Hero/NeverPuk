package net.y4;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.n0.kw;
import net.nk.f_;
import net.u.d;
import net.y4.b;
import net.y4.p;
import net.y4.v;
import net.y9.g7;
import net.y9.gb;
import net.y9.gc;
import net.y9.l_;
import net.y9.lb;
import net.y9.li;
import net.y9.lo;
import net.y9.lr;
import net.y9.lw;
import net.y9.ly;
import net.y9.ra;
import net.y9.zr;
import net.yz.aq;
import net.yz.m_;

public class h {
   public static void y() {
      b.v(h.o.class, "TeDP");
      b.v(h.l.class, "TeJP");
      b.v(h.e.class, "TeSH");
      b.v(h.z.class, "Iglu");
   }

   abstract static class b extends p {
      protected int X;
      protected int K;
      protected int L;
      protected int W = -1;

      public b() {
      }

      protected b(Random var1, int var2, int var3, int var4, int var5, int var6, int var7) {
         super(0);
         this.X = var5;
         this.K = var6;
         this.L = var7;
         this.n(aq.u.HORIZONTAL.N(var1));
         if(this.L().r() == aq.l.Z) {
            this.w = new v(var2, var3, var4, var2 + var5 - 1, var3 + var6 - 1, var4 + var7 - 1);
         } else {
            this.w = new v(var2, var3, var4, var2 + var7 - 1, var3 + var6 - 1, var4 + var5 - 1);
         }

      }

      protected void x(net.nj.f var1) {
         var1.r("Width", this.X);
         var1.r("Height", this.K);
         var1.r("Depth", this.L);
         var1.r("HPos", this.W);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         this.X = var1.P("Width");
         this.K = var1.P("Height");
         this.L = var1.P("Depth");
         this.W = var1.P("HPos");
      }

      protected boolean g(net.yv.r var1, v var2, int var3) {
         int[] var4 = p.d();
         if(this.W >= 0) {
            return true;
         } else {
            byte var5 = 0;
            int var6 = 0;
            net.u.j var7 = new net.u.j();
            int var8 = this.w.p;
            if(var8 <= this.w.J) {
               int var9 = this.w.i;
               if(var9 <= this.w.e) {
                  var7.V(var9, 64, var8);
                  if(var2.Y(var7)) {
                     int var10000 = var5 + Math.max(var1.D((net.u.j)var7).h(), var1.F.v());
                     ++var6;
                  }

                  ++var9;
               }

               ++var8;
            }

            return false;
         }
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class e extends h.b {
      private boolean Q;

      public e() {
      }

      public e(Random var1, int var2, int var3) {
         super(var1, var2, 64, var3, 7, 7, 9);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Witch", this.Q);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.Q = var1.i("Witch");
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(!this.g(var1, var3, 0)) {
            return false;
         } else {
            this.E(var1, var3, 1, 1, 1, 5, 1, 7, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 1, 4, 2, 5, 4, 7, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 2, 1, 0, 4, 1, 0, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 2, 2, 2, 3, 3, 2, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 1, 2, 3, 1, 3, 6, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 5, 2, 3, 5, 3, 6, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 2, 2, 7, 4, 3, 7, net.nb.f.oN.D(gc.i.SPRUCE.B()), net.nb.f.oN.D(gc.i.SPRUCE.B()), false);
            this.E(var1, var3, 1, 0, 2, 1, 3, 2, net.nb.f.u6.p(), net.nb.f.u6.p(), false);
            this.E(var1, var3, 5, 0, 2, 5, 3, 2, net.nb.f.u6.p(), net.nb.f.u6.p(), false);
            this.E(var1, var3, 1, 0, 7, 1, 3, 7, net.nb.f.u6.p(), net.nb.f.u6.p(), false);
            this.E(var1, var3, 5, 0, 7, 5, 3, 7, net.nb.f.u6.p(), net.nb.f.u6.p(), false);
            this.N(var1, net.nb.f.I.p(), 2, 3, 2, var3);
            this.N(var1, net.nb.f.I.p(), 3, 3, 7, var3);
            this.N(var1, net.nb.f.ou.p(), 1, 3, 4, var3);
            this.N(var1, net.nb.f.ou.p(), 5, 3, 4, var3);
            this.N(var1, net.nb.f.ou.p(), 5, 3, 5, var3);
            this.N(var1, net.nb.f.uh.p().s(zr.n, zr.c.MUSHROOM_RED), 1, 3, 5, var3);
            this.N(var1, net.nb.f.uj.p(), 3, 2, 6, var3);
            this.N(var1, net.nb.f.dh.p(), 4, 2, 6, var3);
            this.N(var1, net.nb.f.I.p(), 1, 2, 1, var3);
            this.N(var1, net.nb.f.I.p(), 5, 2, 1, var3);
            net.yw.n var5 = net.nb.f.TK.p().s(l_.F, aq.NORTH);
            net.yw.n var6 = net.nb.f.TK.p().s(l_.F, aq.EAST);
            net.yw.n var7 = net.nb.f.TK.p().s(l_.F, aq.WEST);
            net.yw.n var8 = net.nb.f.TK.p().s(l_.F, aq.SOUTH);
            this.E(var1, var3, 0, 4, 1, 6, 4, 1, var5, var5, false);
            this.E(var1, var3, 0, 4, 2, 0, 4, 7, var6, var6, false);
            this.E(var1, var3, 6, 4, 2, 6, 4, 7, var7, var7, false);
            this.E(var1, var3, 0, 4, 8, 6, 4, 8, var8, var8, false);
            int var9 = 2;
            int var10 = 1;
            this.X(var1, net.nb.f.u6.p(), var10, -1, var9, var3);
            var10 = var10 + 4;
            var9 = var9 + 5;
            if(!this.Q) {
               var9 = this.g(2, 5);
               var10 = this.Z(2);
               int var11 = this.w(2, 5);
               if(var3.Y(new net.u.j(var9, var10, var11))) {
                  this.Q = true;
                  f_ var12 = new f_(var1);
                  var12.gz();
                  var12.S((double)var9 + 0.5D, (double)var10, (double)var11 + 0.5D, 0.0F, 0.0F);
                  var12.t(var1.G(new net.u.j(var9, var10, var11)), (net.ne.g)null);
                  var1.S(var12);
               }
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class l extends h.b {
      private boolean A;
      private boolean O;
      private boolean s;
      private boolean I;
      private static final h.l.c k = new h.l.c();

      public l() {
      }

      public l(Random var1, int var2, int var3) {
         super(var1, var2, 64, var3, 12, 10, 15);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("placedMainChest", this.A);
         var1.c("placedHiddenChest", this.O);
         var1.c("placedTrap1", this.s);
         var1.c("placedTrap2", this.I);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.A = var1.i("placedMainChest");
         this.O = var1.i("placedHiddenChest");
         this.s = var1.i("placedTrap1");
         this.I = var1.i("placedTrap2");
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(!this.g(var1, var3, 0)) {
            return false;
         } else {
            this.u(var1, var3, 0, -4, 0, this.X - 1, 0, this.L - 1, false, var2, k);
            this.u(var1, var3, 2, 1, 2, 9, 2, 2, false, var2, k);
            this.u(var1, var3, 2, 1, 12, 9, 2, 12, false, var2, k);
            this.u(var1, var3, 2, 1, 3, 2, 2, 11, false, var2, k);
            this.u(var1, var3, 9, 1, 3, 9, 2, 11, false, var2, k);
            this.u(var1, var3, 1, 3, 1, 10, 6, 1, false, var2, k);
            this.u(var1, var3, 1, 3, 13, 10, 6, 13, false, var2, k);
            this.u(var1, var3, 1, 3, 2, 1, 6, 12, false, var2, k);
            this.u(var1, var3, 10, 3, 2, 10, 6, 12, false, var2, k);
            this.u(var1, var3, 2, 3, 2, 9, 3, 12, false, var2, k);
            this.u(var1, var3, 2, 6, 2, 9, 6, 12, false, var2, k);
            this.u(var1, var3, 3, 7, 3, 8, 7, 11, false, var2, k);
            this.u(var1, var3, 4, 8, 4, 7, 8, 10, false, var2, k);
            this.y(var1, var3, 3, 1, 3, 8, 2, 11);
            this.y(var1, var3, 4, 3, 6, 7, 3, 9);
            this.y(var1, var3, 2, 4, 2, 9, 5, 12);
            this.y(var1, var3, 4, 6, 5, 7, 6, 9);
            this.y(var1, var3, 5, 7, 6, 6, 7, 8);
            this.y(var1, var3, 5, 1, 2, 6, 2, 2);
            this.y(var1, var3, 5, 2, 12, 6, 2, 12);
            this.y(var1, var3, 5, 5, 1, 6, 5, 1);
            this.y(var1, var3, 5, 5, 13, 6, 5, 13);
            this.N(var1, net.nb.f.ou.p(), 1, 5, 5, var3);
            this.N(var1, net.nb.f.ou.p(), 10, 5, 5, var3);
            this.N(var1, net.nb.f.ou.p(), 1, 5, 9, var3);
            this.N(var1, net.nb.f.ou.p(), 10, 5, 9, var3);
            int var5 = 0;
            this.u(var1, var3, 2, 4, var5, 2, 5, var5, false, var2, k);
            this.u(var1, var3, 4, 4, var5, 4, 5, var5, false, var2, k);
            this.u(var1, var3, 7, 4, var5, 7, 5, var5, false, var2, k);
            this.u(var1, var3, 9, 4, var5, 9, 5, var5, false, var2, k);
            var5 = var5 + 14;
            this.u(var1, var3, 5, 6, 0, 6, 6, 0, false, var2, k);
            var5 = 0;
            int var6 = 2;
            this.u(var1, var3, var5, 4, var6, var5, 5, var6, false, var2, k);
            var6 = var6 + 2;
            this.u(var1, var3, var5, 6, 5, var5, 6, 5, false, var2, k);
            this.u(var1, var3, var5, 6, 9, var5, 6, 9, false, var2, k);
            var5 = var5 + 11;
            this.u(var1, var3, 2, 7, 2, 2, 9, 2, false, var2, k);
            this.u(var1, var3, 9, 7, 2, 9, 9, 2, false, var2, k);
            this.u(var1, var3, 2, 7, 12, 2, 9, 12, false, var2, k);
            this.u(var1, var3, 9, 7, 12, 9, 9, 12, false, var2, k);
            this.u(var1, var3, 4, 9, 4, 4, 9, 4, false, var2, k);
            this.u(var1, var3, 7, 9, 4, 7, 9, 4, false, var2, k);
            this.u(var1, var3, 4, 9, 10, 4, 9, 10, false, var2, k);
            this.u(var1, var3, 7, 9, 10, 7, 9, 10, false, var2, k);
            this.u(var1, var3, 5, 9, 7, 6, 9, 7, false, var2, k);
            net.yw.n var13 = net.nb.f.uI.p().s(l_.F, aq.EAST);
            net.yw.n var15 = net.nb.f.uI.p().s(l_.F, aq.WEST);
            net.yw.n var7 = net.nb.f.uI.p().s(l_.F, aq.SOUTH);
            net.yw.n var8 = net.nb.f.uI.p().s(l_.F, aq.NORTH);
            this.N(var1, var8, 5, 9, 6, var3);
            this.N(var1, var8, 6, 9, 6, var3);
            this.N(var1, var7, 5, 9, 8, var3);
            this.N(var1, var7, 6, 9, 8, var3);
            this.N(var1, var8, 4, 0, 0, var3);
            this.N(var1, var8, 5, 0, 0, var3);
            this.N(var1, var8, 6, 0, 0, var3);
            this.N(var1, var8, 7, 0, 0, var3);
            this.N(var1, var8, 4, 1, 8, var3);
            this.N(var1, var8, 4, 2, 9, var3);
            this.N(var1, var8, 4, 3, 10, var3);
            this.N(var1, var8, 7, 1, 8, var3);
            this.N(var1, var8, 7, 2, 9, var3);
            this.N(var1, var8, 7, 3, 10, var3);
            this.u(var1, var3, 4, 1, 9, 4, 1, 9, false, var2, k);
            this.u(var1, var3, 7, 1, 9, 7, 1, 9, false, var2, k);
            this.u(var1, var3, 4, 1, 10, 7, 2, 10, false, var2, k);
            this.u(var1, var3, 5, 4, 5, 6, 4, 5, false, var2, k);
            this.N(var1, var13, 4, 4, 5, var3);
            this.N(var1, var15, 7, 4, 5, var3);
            int var9 = 0;
            this.N(var1, var7, 5, 0 - var9, 6 + var9, var3);
            this.N(var1, var7, 6, 0 - var9, 6 + var9, var3);
            this.y(var1, var3, 5, 0 - var9, 7 + var9, 6, 0 - var9, 9 + var9);
            ++var9;
            this.y(var1, var3, 1, -3, 12, 10, -1, 13);
            this.y(var1, var3, 1, -3, 1, 3, -1, 13);
            this.y(var1, var3, 1, -3, 1, 9, -1, 5);
            var9 = 1;
            this.u(var1, var3, 1, -3, var9, 1, -2, var9, false, var2, k);
            var9 = var9 + 2;
            var9 = 2;
            this.u(var1, var3, 1, -1, var9, 3, -1, var9, false, var2, k);
            var9 = var9 + 2;
            this.u(var1, var3, 2, -2, 1, 5, -2, 1, false, var2, k);
            this.u(var1, var3, 7, -2, 1, 9, -2, 1, false, var2, k);
            this.u(var1, var3, 6, -3, 1, 6, -3, 1, false, var2, k);
            this.u(var1, var3, 6, -1, 1, 6, -1, 1, false, var2, k);
            this.N(var1, net.nb.f.d5.p().s(lr.D, aq.EAST).s(lr.A, Boolean.valueOf(true)), 1, -3, 8, var3);
            this.N(var1, net.nb.f.d5.p().s(lr.D, aq.WEST).s(lr.A, Boolean.valueOf(true)), 4, -3, 8, var3);
            this.N(var1, net.nb.f.u1.p().s(ly.W, Boolean.valueOf(true)), 2, -3, 8, var3);
            this.N(var1, net.nb.f.u1.p().s(ly.W, Boolean.valueOf(true)), 3, -3, 8, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 7, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 6, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 5, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 4, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 3, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 2, var3);
            this.N(var1, net.nb.f.dv.p(), 5, -3, 1, var3);
            this.N(var1, net.nb.f.dv.p(), 4, -3, 1, var3);
            this.N(var1, net.nb.f.T9.p(), 3, -3, 1, var3);
            if(!this.s) {
               this.s = this.B(var1, var3, var2, 3, -2, 1, aq.NORTH, net.y7.p.P);
            }

            this.N(var1, net.nb.f.To.p().s(lw.J, Boolean.valueOf(true)), 3, -2, 2, var3);
            this.N(var1, net.nb.f.d5.p().s(lr.D, aq.NORTH).s(lr.A, Boolean.valueOf(true)), 7, -3, 1, var3);
            this.N(var1, net.nb.f.d5.p().s(lr.D, aq.SOUTH).s(lr.A, Boolean.valueOf(true)), 7, -3, 5, var3);
            this.N(var1, net.nb.f.u1.p().s(ly.W, Boolean.valueOf(true)), 7, -3, 2, var3);
            this.N(var1, net.nb.f.u1.p().s(ly.W, Boolean.valueOf(true)), 7, -3, 3, var3);
            this.N(var1, net.nb.f.u1.p().s(ly.W, Boolean.valueOf(true)), 7, -3, 4, var3);
            this.N(var1, net.nb.f.dv.p(), 8, -3, 6, var3);
            this.N(var1, net.nb.f.dv.p(), 9, -3, 6, var3);
            this.N(var1, net.nb.f.dv.p(), 9, -3, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 9, -3, 4, var3);
            this.N(var1, net.nb.f.dv.p(), 9, -2, 4, var3);
            if(!this.I) {
               this.I = this.B(var1, var3, var2, 9, -2, 3, aq.WEST, net.y7.p.P);
            }

            this.N(var1, net.nb.f.To.p().s(lw.f, Boolean.valueOf(true)), 8, -1, 3, var3);
            this.N(var1, net.nb.f.To.p().s(lw.f, Boolean.valueOf(true)), 8, -2, 3, var3);
            if(!this.A) {
               this.A = this.Y(var1, var3, var2, 8, -3, 3, net.y7.p.v);
            }

            this.N(var1, net.nb.f.T9.p(), 9, -3, 2, var3);
            this.N(var1, net.nb.f.T9.p(), 8, -3, 1, var3);
            this.N(var1, net.nb.f.T9.p(), 4, -3, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 5, -2, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 5, -1, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 6, -3, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 7, -2, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 7, -1, 5, var3);
            this.N(var1, net.nb.f.T9.p(), 8, -3, 5, var3);
            this.u(var1, var3, 9, -1, 1, 9, -1, 5, false, var2, k);
            this.y(var1, var3, 8, -3, 8, 10, -1, 10);
            this.N(var1, net.nb.f.TM.D(li.D), 8, -2, 11, var3);
            this.N(var1, net.nb.f.TM.D(li.D), 9, -2, 11, var3);
            this.N(var1, net.nb.f.TM.D(li.D), 10, -2, 11, var3);
            net.yw.n var21 = net.nb.f.T_.p().s(gb.N, gb.p.NORTH);
            this.N(var1, var21, 8, -2, 12, var3);
            this.N(var1, var21, 9, -2, 12, var3);
            this.N(var1, var21, 10, -2, 12, var3);
            this.u(var1, var3, 8, -3, 8, 8, -3, 10, false, var2, k);
            this.u(var1, var3, 10, -3, 8, 10, -3, 10, false, var2, k);
            this.N(var1, net.nb.f.T9.p(), 10, -2, 9, var3);
            this.N(var1, net.nb.f.dv.p(), 8, -2, 9, var3);
            this.N(var1, net.nb.f.dv.p(), 8, -2, 10, var3);
            this.N(var1, net.nb.f.dv.p(), 10, -1, 9, var3);
            this.N(var1, net.nb.f.oG.p().s(ra.n, aq.UP), 9, -2, 8, var3);
            this.N(var1, net.nb.f.oG.p().s(ra.n, aq.WEST), 10, -2, 8, var3);
            this.N(var1, net.nb.f.oG.p().s(ra.n, aq.WEST), 10, -1, 8, var3);
            this.N(var1, net.nb.f.dQ.p().s(g7.N, aq.NORTH), 10, -2, 10, var3);
            if(!this.O) {
               this.O = this.Y(var1, var3, var2, 9, -3, 10, net.y7.p.v);
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }

      static class c extends p.s {
         private c() {
         }

         public void N(Random var1, int var2, int var3, int var4, boolean var5) {
            int[] var6 = p.d();
            if(var1.nextFloat() < 0.4F) {
               this.R = net.nb.f.TD.p();
            }

            this.R = net.nb.f.T9.p();
         }

         private static xn a(xn var0) {
            return var0;
         }
      }
   }

   public static class o extends h.b {
      private final boolean[] J = new boolean[4];

      public o() {
      }

      public o(Random var1, int var2, int var3) {
         super(var1, var2, 64, var3, 21, 15, 21);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("hasPlacedChest0", this.J[0]);
         var1.c("hasPlacedChest1", this.J[1]);
         var1.c("hasPlacedChest2", this.J[2]);
         var1.c("hasPlacedChest3", this.J[3]);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.J[0] = var1.i("hasPlacedChest0");
         this.J[1] = var1.i("hasPlacedChest1");
         this.J[2] = var1.i("hasPlacedChest2");
         this.J[3] = var1.i("hasPlacedChest3");
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         p.d();
         this.E(var1, var3, 0, -4, 0, this.X - 1, 0, this.L - 1, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         int var5 = 1;
         this.E(var1, var3, var5, var5, var5, this.X - 1 - var5, var5, this.L - 1 - var5, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, var5 + 1, var5, var5 + 1, this.X - 2 - var5, var5, this.L - 2 - var5, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         ++var5;
         d.h(new d[4]);
         var5 = 0;
         if(var5 < this.X) {
            int var6 = 0;
            if(var6 < this.L) {
               boolean var7 = true;
               this.X(var1, net.nb.f.ul.p(), var5, -5, var6, var3);
               ++var6;
            }

            ++var5;
         }

         net.yw.n var18 = net.nb.f.TA.p().s(l_.F, aq.NORTH);
         net.yw.n var20 = net.nb.f.TA.p().s(l_.F, aq.SOUTH);
         net.yw.n var21 = net.nb.f.TA.p().s(l_.F, aq.EAST);
         net.yw.n var8 = net.nb.f.TA.p().s(l_.F, aq.WEST);
         int var9 = ~kw.ORANGE.G() & 15;
         int var10 = ~kw.BLUE.G() & 15;
         this.E(var1, var3, 0, 0, 0, 4, 9, 4, net.nb.f.ul.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 10, 1, 3, 10, 3, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.N(var1, var18, 2, 10, 0, var3);
         this.N(var1, var20, 2, 10, 4, var3);
         this.N(var1, var21, 0, 10, 2, var3);
         this.N(var1, var8, 4, 10, 2, var3);
         this.E(var1, var3, this.X - 5, 0, 0, this.X - 1, 9, 4, net.nb.f.ul.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, this.X - 4, 10, 1, this.X - 2, 10, 3, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.N(var1, var18, this.X - 3, 10, 0, var3);
         this.N(var1, var20, this.X - 3, 10, 4, var3);
         this.N(var1, var21, this.X - 5, 10, 2, var3);
         this.N(var1, var8, this.X - 1, 10, 2, var3);
         this.E(var1, var3, 8, 0, 0, 12, 4, 4, net.nb.f.ul.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 9, 1, 0, 11, 3, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 9, 1, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 9, 2, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 9, 3, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 10, 3, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 11, 3, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 11, 2, 1, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 11, 1, 1, var3);
         this.E(var1, var3, 4, 1, 1, 8, 3, 3, net.nb.f.ul.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 4, 1, 2, 8, 2, 2, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 12, 1, 1, 16, 3, 3, net.nb.f.ul.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 12, 1, 2, 16, 2, 2, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 5, 4, 5, this.X - 6, 4, this.L - 6, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, 9, 4, 9, 11, 4, 11, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 8, 1, 8, 8, 3, 8, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 12, 1, 8, 12, 3, 8, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 8, 1, 12, 8, 3, 12, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 12, 1, 12, 12, 3, 12, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 1, 1, 5, 4, 4, 11, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, this.X - 5, 1, 5, this.X - 2, 4, 11, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, 6, 7, 9, 6, 7, 11, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, this.X - 7, 7, 9, this.X - 7, 7, 11, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, 5, 5, 9, 5, 7, 11, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, this.X - 6, 5, 9, this.X - 6, 7, 11, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.N(var1, net.nb.f.ou.p(), 5, 5, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 5, 6, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 6, 6, 10, var3);
         this.N(var1, net.nb.f.ou.p(), this.X - 6, 5, 10, var3);
         this.N(var1, net.nb.f.ou.p(), this.X - 6, 6, 10, var3);
         this.N(var1, net.nb.f.ou.p(), this.X - 7, 6, 10, var3);
         this.E(var1, var3, 2, 4, 4, 2, 6, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, this.X - 3, 4, 4, this.X - 3, 6, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, var18, 2, 4, 5, var3);
         this.N(var1, var18, 2, 3, 4, var3);
         this.N(var1, var18, this.X - 3, 4, 5, var3);
         this.N(var1, var18, this.X - 3, 3, 4, var3);
         this.E(var1, var3, 1, 1, 3, 2, 2, 3, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, this.X - 3, 1, 3, this.X - 2, 2, 3, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.N(var1, net.nb.f.ul.p(), 1, 1, 2, var3);
         this.N(var1, net.nb.f.ul.p(), this.X - 2, 1, 2, var3);
         this.N(var1, net.nb.f.Tt.D(lb.p.SAND.e()), 1, 2, 2, var3);
         this.N(var1, net.nb.f.Tt.D(lb.p.SAND.e()), this.X - 2, 2, 2, var3);
         this.N(var1, var8, 2, 1, 2, var3);
         this.N(var1, var21, this.X - 3, 1, 2, var3);
         this.E(var1, var3, 4, 3, 5, 4, 3, 18, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, this.X - 5, 3, 5, this.X - 5, 3, 17, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, 3, 1, 5, 4, 2, 16, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, this.X - 6, 1, 5, this.X - 5, 2, 16, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         int var11 = 5;
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 4, 1, var11, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 4, 2, var11, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), this.X - 5, 1, var11, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), this.X - 5, 2, var11, var3);
         var11 = var11 + 2;
         this.N(var1, net.nb.f.Ty.D(var9), 10, 0, 7, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 10, 0, 8, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 9, 0, 9, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 11, 0, 9, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 8, 0, 10, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 12, 0, 10, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 7, 0, 10, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 13, 0, 10, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 9, 0, 11, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 11, 0, 11, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 10, 0, 12, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 10, 0, 13, var3);
         this.N(var1, net.nb.f.Ty.D(var10), 10, 0, 10, var3);
         var11 = 0;
         if(var11 <= this.X - 1) {
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 2, 1, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 2, 2, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 2, 3, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 3, 1, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 3, 2, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 3, 3, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 4, 1, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), var11, 4, 2, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 4, 3, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 5, 1, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 5, 2, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 5, 3, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 6, 1, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), var11, 6, 2, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 6, 3, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 7, 1, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 7, 2, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 7, 3, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 8, 1, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 8, 2, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 8, 3, var3);
            int var10000 = var11 + (this.X - 1);
         }

         var11 = 2;
         if(var11 <= this.X - 3) {
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 - 1, 2, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 2, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 + 1, 2, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 - 1, 3, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 3, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 + 1, 3, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 - 1, 4, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), var11, 4, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 + 1, 4, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 - 1, 5, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 5, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 + 1, 5, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 - 1, 6, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), var11, 6, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 + 1, 6, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 - 1, 7, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11, 7, 0, var3);
            this.N(var1, net.nb.f.Ty.D(var9), var11 + 1, 7, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 - 1, 8, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11, 8, 0, var3);
            this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), var11 + 1, 8, 0, var3);
            int var26 = var11 + (this.X - 3 - 2);
         }

         this.E(var1, var3, 8, 4, 0, 12, 6, 0, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.N(var1, net.nb.f.ou.p(), 8, 6, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 12, 6, 0, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 9, 5, 0, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 10, 5, 0, var3);
         this.N(var1, net.nb.f.Ty.D(var9), 11, 5, 0, var3);
         this.E(var1, var3, 8, -14, 8, 12, -11, 12, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 8, -10, 8, 12, -10, 12, net.nb.f.ul.D(lo.h.CHISELED.r()), net.nb.f.ul.D(lo.h.CHISELED.r()), false);
         this.E(var1, var3, 8, -9, 8, 12, -9, 12, net.nb.f.ul.D(lo.h.SMOOTH.r()), net.nb.f.ul.D(lo.h.SMOOTH.r()), false);
         this.E(var1, var3, 8, -8, 8, 12, -1, 12, net.nb.f.ul.p(), net.nb.f.ul.p(), false);
         this.E(var1, var3, 9, -11, 9, 11, -1, 11, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, net.nb.f.Td.p(), 10, -11, 10, var3);
         this.E(var1, var3, 9, -13, 9, 11, -13, 11, net.nb.f.T7.p(), net.nb.f.ou.p(), false);
         this.N(var1, net.nb.f.ou.p(), 8, -11, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 8, -10, 10, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 7, -10, 10, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 7, -11, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 12, -11, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 12, -10, 10, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 13, -10, 10, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 13, -11, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 10, -11, 8, var3);
         this.N(var1, net.nb.f.ou.p(), 10, -10, 8, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 10, -10, 7, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 10, -11, 7, var3);
         this.N(var1, net.nb.f.ou.p(), 10, -11, 12, var3);
         this.N(var1, net.nb.f.ou.p(), 10, -10, 12, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.CHISELED.r()), 10, -10, 13, var3);
         this.N(var1, net.nb.f.ul.D(lo.h.SMOOTH.r()), 10, -11, 13, var3);
         Iterator var25 = aq.u.HORIZONTAL.iterator();
         if(var25.hasNext()) {
            aq var12 = (aq)var25.next();
            if(!this.J[var12.u()]) {
               int var13 = var12.v() * 2;
               int var14 = var12.P() * 2;
               this.J[var12.u()] = this.Y(var1, var3, var2, 10 + var13, -11, 10 + var14, net.y7.p.y);
            }
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends h.b {
      private static final m_ B = new m_("igloo/igloo_top");
      private static final m_ D = new m_("igloo/igloo_middle");
      private static final m_ r = new m_("igloo/igloo_bottom");

      public z() {
      }

      public z(Random var1, int var2, int var3) {
         super(var1, var2, 64, var3, 7, 5, 8);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(!this.g(var1, var3, -1)) {
            return false;
         } else {
            v var5 = this.J();
            net.u.j var6 = new net.u.j(var5.i, var5.D, var5.p);
            net.yz.l[] var7 = net.yz.l.values();
            net.nx.f var8 = var1.v();
            net.yj.e var9 = var1.q().N();
            net.yj.y var10 = (new net.yj.y()).o(var7[var2.nextInt(var7.length)]).k(net.nb.f.f).X(var5);
            net.yj.f var11 = var9.O(var8, B);
            var11.Y(var1, var6, var10);
            if(var2.nextDouble() < 0.5D) {
               net.yj.f var12 = var9.O(var8, D);
               net.yj.f var13 = var9.O(var8, r);
               int var14 = var2.nextInt(8) + 4;
               int var15 = 0;
               if(var15 < var14) {
                  net.u.j var16 = var11.W(var10, new net.u.j(3, -1 - var15 * 3, 5), var10, new net.u.j(1, 2, 1));
                  var12.Y(var1, var6.z(var16), var10);
                  ++var15;
               }

               net.u.j var23 = var6.z(var11.W(var10, new net.u.j(3, -1 - var14 * 3, 5), var10, new net.u.j(3, 5, 7)));
               var13.Y(var1, var23, var10);
               Map var24 = var13.U(var23, var10);
               Iterator var17 = var24.entrySet().iterator();
               if(var17.hasNext()) {
                  Entry var18 = (Entry)var17.next();
                  if("chest".equals(var18.getValue())) {
                     net.u.j var19 = (net.u.j)var18.getKey();
                     var1.k(var19, net.nb.f.ou.p(), 3);
                     net.ni.v var20 = var1.L(var19.b());
                     if(var20 instanceof net.ni.k) {
                        ((net.ni.k)var20).G(net.y7.p.H, var2.nextLong());
                     }
                  }
               }
            }

            net.u.j var21 = net.yj.f.M(var10, new net.u.j(3, 0, 5));
            var1.k(var6.z(var21), net.nb.f.V.p(), 3);
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
