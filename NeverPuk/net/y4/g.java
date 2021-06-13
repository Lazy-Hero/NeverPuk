package net.y4;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.xn;
import net.y4.b;
import net.y4.p;
import net.y4.v;
import net.y9.gi;
import net.yz.aq;

public class g {
   public static void f() {
      b.v(g.q.class, "OMB");
      b.v(g.w.class, "OMCR");
      b.v(g.b.class, "OMDXR");
      b.v(g.u.class, "OMDXYR");
      b.v(g.d.class, "OMDYR");
      b.v(g.p.class, "OMDYZR");
      b.v(g.z.class, "OMDZR");
      b.v(g.i.class, "OMEntry");
      b.v(g.s.class, "OMPenthouse");
      b.v(g.h.class, "OMSimple");
      b.v(g.j.class, "OMSimpleT");
   }

   static class a implements g.n {
      private a() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         return var1.v[aq.UP.w()] && !var1.r[aq.UP.w()].l;
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         var2.r[aq.UP.w()].l = true;
         return new g.d(var1, var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class b extends g.v {
      public b() {
      }

      public b(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 2, 1, 1);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         g.c var5 = this.c.r[aq.EAST.w()];
         p.d();
         g.c var6 = this.c;
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 8, 0, var5.v[aq.DOWN.w()]);
            this.v(var1, var3, 0, 0, var6.v[aq.DOWN.w()]);
         }

         if(var6.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 4, 1, 7, 4, 6, v);
         }

         if(var5.r[aq.UP.w()] == null) {
            this.W(var1, var3, 8, 4, 1, 14, 4, 6, v);
         }

         this.E(var1, var3, 0, 3, 0, 0, 3, 7, Z, Z, false);
         this.E(var1, var3, 15, 3, 0, 15, 3, 7, Z, Z, false);
         this.E(var1, var3, 1, 3, 0, 15, 3, 0, Z, Z, false);
         this.E(var1, var3, 1, 3, 7, 14, 3, 7, Z, Z, false);
         this.E(var1, var3, 0, 2, 0, 0, 2, 7, v, v, false);
         this.E(var1, var3, 15, 2, 0, 15, 2, 7, v, v, false);
         this.E(var1, var3, 1, 2, 0, 15, 2, 0, v, v, false);
         this.E(var1, var3, 1, 2, 7, 14, 2, 7, v, v, false);
         this.E(var1, var3, 0, 1, 0, 0, 1, 7, Z, Z, false);
         this.E(var1, var3, 15, 1, 0, 15, 1, 7, Z, Z, false);
         this.E(var1, var3, 1, 1, 0, 15, 1, 0, Z, Z, false);
         this.E(var1, var3, 1, 1, 7, 14, 1, 7, Z, Z, false);
         this.E(var1, var3, 5, 1, 0, 10, 1, 4, Z, Z, false);
         this.E(var1, var3, 6, 2, 0, 9, 2, 3, v, v, false);
         this.E(var1, var3, 5, 3, 0, 10, 3, 4, Z, Z, false);
         this.N(var1, T, 6, 2, 3, var3);
         this.N(var1, T, 9, 2, 3, var3);
         if(var6.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
         }

         if(var6.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 1, 7, 4, 2, 7, false);
         }

         if(var6.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 3, 0, 2, 4, false);
         }

         if(var5.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 11, 1, 0, 12, 2, 0, false);
         }

         if(var5.v[aq.NORTH.w()]) {
            this.A(var1, var3, 11, 1, 7, 12, 2, 7, false);
         }

         if(var5.v[aq.EAST.w()]) {
            this.A(var1, var3, 15, 1, 3, 15, 2, 4, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class c {
      int f;
      g.c[] r = new g.c[6];
      boolean[] v = new boolean[6];
      boolean l;
      boolean A;
      int d;

      public c(int var1) {
         this.f = var1;
      }

      public void u(aq var1, g.c var2) {
         this.r[var1.w()] = var2;
         var2.r[var1.f().w()] = this;
      }

      public void u() {
         int var1 = 0;

         while(true) {
            this.v[var1] = this.r[var1] != null;
            ++var1;
         }
      }

      public boolean c(int var1) {
         int[] var2 = p.d();
         if(this.A) {
            return true;
         } else {
            this.d = var1;
            int var3 = 0;
            if(this.r[var3] != null && this.v[var3] && this.r[var3].d != var1 && this.r[var3].c(var1)) {
               return true;
            } else {
               ++var3;
               return false;
            }
         }
      }

      public boolean r() {
         return this.f >= 75;
      }

      public int M() {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class d extends g.v {
      public d() {
      }

      public d(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 1, 2, 1);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 0, 0, this.c.v[aq.DOWN.w()]);
         }

         g.c var5 = this.c.r[aq.UP.w()];
         if(var5.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 8, 1, 6, 8, 6, v);
         }

         this.E(var1, var3, 0, 4, 0, 0, 4, 7, Z, Z, false);
         this.E(var1, var3, 7, 4, 0, 7, 4, 7, Z, Z, false);
         this.E(var1, var3, 1, 4, 0, 6, 4, 0, Z, Z, false);
         this.E(var1, var3, 1, 4, 7, 6, 4, 7, Z, Z, false);
         this.E(var1, var3, 2, 4, 1, 2, 4, 2, Z, Z, false);
         this.E(var1, var3, 1, 4, 2, 1, 4, 2, Z, Z, false);
         this.E(var1, var3, 5, 4, 1, 5, 4, 2, Z, Z, false);
         this.E(var1, var3, 6, 4, 2, 6, 4, 2, Z, Z, false);
         this.E(var1, var3, 2, 4, 5, 2, 4, 6, Z, Z, false);
         this.E(var1, var3, 1, 4, 5, 1, 4, 5, Z, Z, false);
         this.E(var1, var3, 5, 4, 5, 5, 4, 6, Z, Z, false);
         this.E(var1, var3, 6, 4, 5, 6, 4, 5, Z, Z, false);
         g.c var6 = this.c;
         int var7 = 1;
         byte var8 = 0;
         if(var6.v[aq.SOUTH.w()]) {
            this.E(var1, var3, 2, var7, var8, 2, var7 + 2, var8, Z, Z, false);
            this.E(var1, var3, 5, var7, var8, 5, var7 + 2, var8, Z, Z, false);
            this.E(var1, var3, 3, var7 + 2, var8, 4, var7 + 2, var8, Z, Z, false);
         }

         this.E(var1, var3, 0, var7, var8, 7, var7 + 2, var8, Z, Z, false);
         this.E(var1, var3, 0, var7 + 1, var8, 7, var7 + 1, var8, v, v, false);
         var8 = 7;
         if(var6.v[aq.NORTH.w()]) {
            this.E(var1, var3, 2, var7, var8, 2, var7 + 2, var8, Z, Z, false);
            this.E(var1, var3, 5, var7, var8, 5, var7 + 2, var8, Z, Z, false);
            this.E(var1, var3, 3, var7 + 2, var8, 4, var7 + 2, var8, Z, Z, false);
         }

         this.E(var1, var3, 0, var7, var8, 7, var7 + 2, var8, Z, Z, false);
         this.E(var1, var3, 0, var7 + 1, var8, 7, var7 + 1, var8, v, v, false);
         byte var9 = 0;
         if(var6.v[aq.WEST.w()]) {
            this.E(var1, var3, var9, var7, 2, var9, var7 + 2, 2, Z, Z, false);
            this.E(var1, var3, var9, var7, 5, var9, var7 + 2, 5, Z, Z, false);
            this.E(var1, var3, var9, var7 + 2, 3, var9, var7 + 2, 4, Z, Z, false);
         }

         this.E(var1, var3, var9, var7, 0, var9, var7 + 2, 7, Z, Z, false);
         this.E(var1, var3, var9, var7 + 1, 0, var9, var7 + 1, 7, v, v, false);
         var9 = 7;
         if(var6.v[aq.EAST.w()]) {
            this.E(var1, var3, var9, var7, 2, var9, var7 + 2, 2, Z, Z, false);
            this.E(var1, var3, var9, var7, 5, var9, var7 + 2, 5, Z, Z, false);
            this.E(var1, var3, var9, var7 + 2, 3, var9, var7 + 2, 4, Z, Z, false);
         }

         this.E(var1, var3, var9, var7, 0, var9, var7 + 2, 7, Z, Z, false);
         this.E(var1, var3, var9, var7 + 1, 0, var9, var7 + 1, 7, v, v, false);
         var7 = var7 + 4;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class e implements g.n {
      private e() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         return var1.v[aq.NORTH.w()] && !var1.r[aq.NORTH.w()].l;
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         p.d();
         g.c var5 = var2;
         if(!var2.v[aq.NORTH.w()] || var2.r[aq.NORTH.w()].l) {
            var5 = var2.r[aq.SOUTH.w()];
         }

         var5.l = true;
         var5.r[aq.NORTH.w()].l = true;
         return new g.z(var1, var5, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class f extends g.v {
      private int f;

      public f() {
      }

      public f(aq var1, v var2, int var3) {
         super(var1, var2);
         this.f = var3 & 1;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.f == 0) {
            int var5 = 0;
            this.E(var1, var3, 10 - var5, 3 - var5, 20 - var5, 12 + var5, 3 - var5, 20, Z, Z, false);
            ++var5;
            this.E(var1, var3, 7, 0, 6, 15, 0, 16, Z, Z, false);
            this.E(var1, var3, 6, 0, 6, 6, 3, 20, Z, Z, false);
            this.E(var1, var3, 16, 0, 6, 16, 3, 20, Z, Z, false);
            this.E(var1, var3, 7, 1, 7, 7, 1, 20, Z, Z, false);
            this.E(var1, var3, 15, 1, 7, 15, 1, 20, Z, Z, false);
            this.E(var1, var3, 7, 1, 6, 9, 3, 6, Z, Z, false);
            this.E(var1, var3, 13, 1, 6, 15, 3, 6, Z, Z, false);
            this.E(var1, var3, 8, 1, 7, 9, 1, 7, Z, Z, false);
            this.E(var1, var3, 13, 1, 7, 14, 1, 7, Z, Z, false);
            this.E(var1, var3, 9, 0, 5, 13, 0, 5, Z, Z, false);
            this.E(var1, var3, 10, 0, 7, 12, 0, 7, W, W, false);
            this.E(var1, var3, 8, 0, 10, 8, 0, 12, W, W, false);
            this.E(var1, var3, 14, 0, 10, 14, 0, 12, W, W, false);
            var5 = 18;
            this.N(var1, T, 6, 3, var5, var3);
            this.N(var1, T, 16, 3, var5, var3);
            var5 = var5 - 3;
            this.N(var1, T, 10, 0, 10, var3);
            this.N(var1, T, 12, 0, 10, var3);
            this.N(var1, T, 10, 0, 12, var3);
            this.N(var1, T, 12, 0, 12, var3);
            this.N(var1, T, 8, 3, 6, var3);
            this.N(var1, T, 14, 3, 6, var3);
            this.N(var1, Z, 4, 2, 4, var3);
            this.N(var1, T, 4, 1, 4, var3);
            this.N(var1, Z, 4, 0, 4, var3);
            this.N(var1, Z, 18, 2, 4, var3);
            this.N(var1, T, 18, 1, 4, var3);
            this.N(var1, Z, 18, 0, 4, var3);
            this.N(var1, Z, 4, 2, 18, var3);
            this.N(var1, T, 4, 1, 18, var3);
            this.N(var1, Z, 4, 0, 18, var3);
            this.N(var1, Z, 18, 2, 18, var3);
            this.N(var1, T, 18, 1, 18, var3);
            this.N(var1, Z, 18, 0, 18, var3);
            this.N(var1, Z, 9, 7, 20, var3);
            this.N(var1, Z, 13, 7, 20, var3);
            this.E(var1, var3, 6, 0, 21, 7, 4, 21, Z, Z, false);
            this.E(var1, var3, 15, 0, 21, 16, 4, 21, Z, Z, false);
            this.D(var1, var3, 11, 2, 16);
         }

         if(this.f == 1) {
            this.E(var1, var3, 9, 3, 18, 13, 3, 20, Z, Z, false);
            this.E(var1, var3, 9, 0, 18, 9, 2, 18, Z, Z, false);
            this.E(var1, var3, 13, 0, 18, 13, 2, 18, Z, Z, false);
            byte var12 = 9;
            boolean var10000 = true;
            var10000 = true;
            int var8 = 0;
            this.N(var1, Z, var12, 6, 20, var3);
            this.N(var1, T, var12, 5, 20, var3);
            this.N(var1, Z, var12, 4, 20, var3);
            var12 = 13;
            ++var8;
            this.E(var1, var3, 7, 3, 7, 15, 3, 14, Z, Z, false);
            var12 = 10;
            var8 = 0;
            this.E(var1, var3, var12, 0, 10, var12, 6, 10, Z, Z, false);
            this.E(var1, var3, var12, 0, 12, var12, 6, 12, Z, Z, false);
            this.N(var1, T, var12, 0, 10, var3);
            this.N(var1, T, var12, 0, 12, var3);
            this.N(var1, T, var12, 4, 10, var3);
            this.N(var1, T, var12, 4, 12, var3);
            var12 = 12;
            ++var8;
            var12 = 8;
            var8 = 0;
            this.E(var1, var3, var12, 0, 7, var12, 2, 7, Z, Z, false);
            this.E(var1, var3, var12, 0, 14, var12, 2, 14, Z, Z, false);
            var12 = 14;
            ++var8;
            this.E(var1, var3, 8, 3, 8, 8, 3, 13, W, W, false);
            this.E(var1, var3, 14, 3, 8, 14, 3, 13, W, W, false);
            this.D(var1, var3, 11, 5, 13);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class h extends g.v {
      private int O;

      public h() {
      }

      public h(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 1, 1, 1);
         this.O = var3.nextInt(3);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 0, 0, this.c.v[aq.DOWN.w()]);
         }

         if(this.c.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 4, 1, 6, 4, 6, v);
         }

         if(this.O != 0 && var2.nextBoolean() && !this.c.v[aq.DOWN.w()] && !this.c.v[aq.UP.w()] && this.c.M() > 1) {
            boolean var6 = true;
         } else {
            boolean var10000 = false;
         }

         if(this.O == 0) {
            this.E(var1, var3, 0, 1, 0, 2, 1, 2, Z, Z, false);
            this.E(var1, var3, 0, 3, 0, 2, 3, 2, Z, Z, false);
            this.E(var1, var3, 0, 2, 0, 0, 2, 2, v, v, false);
            this.E(var1, var3, 1, 2, 0, 2, 2, 0, v, v, false);
            this.N(var1, T, 1, 2, 1, var3);
            this.E(var1, var3, 5, 1, 0, 7, 1, 2, Z, Z, false);
            this.E(var1, var3, 5, 3, 0, 7, 3, 2, Z, Z, false);
            this.E(var1, var3, 7, 2, 0, 7, 2, 2, v, v, false);
            this.E(var1, var3, 5, 2, 0, 6, 2, 0, v, v, false);
            this.N(var1, T, 6, 2, 1, var3);
            this.E(var1, var3, 0, 1, 5, 2, 1, 7, Z, Z, false);
            this.E(var1, var3, 0, 3, 5, 2, 3, 7, Z, Z, false);
            this.E(var1, var3, 0, 2, 5, 0, 2, 7, v, v, false);
            this.E(var1, var3, 1, 2, 7, 2, 2, 7, v, v, false);
            this.N(var1, T, 1, 2, 6, var3);
            this.E(var1, var3, 5, 1, 5, 7, 1, 7, Z, Z, false);
            this.E(var1, var3, 5, 3, 5, 7, 3, 7, Z, Z, false);
            this.E(var1, var3, 7, 2, 5, 7, 2, 7, v, v, false);
            this.E(var1, var3, 5, 2, 7, 6, 2, 7, v, v, false);
            this.N(var1, T, 6, 2, 6, var3);
            if(this.c.v[aq.SOUTH.w()]) {
               this.E(var1, var3, 3, 3, 0, 4, 3, 0, Z, Z, false);
            }

            this.E(var1, var3, 3, 3, 0, 4, 3, 1, Z, Z, false);
            this.E(var1, var3, 3, 2, 0, 4, 2, 0, v, v, false);
            this.E(var1, var3, 3, 1, 0, 4, 1, 1, Z, Z, false);
            if(this.c.v[aq.NORTH.w()]) {
               this.E(var1, var3, 3, 3, 7, 4, 3, 7, Z, Z, false);
            }

            this.E(var1, var3, 3, 3, 6, 4, 3, 7, Z, Z, false);
            this.E(var1, var3, 3, 2, 7, 4, 2, 7, v, v, false);
            this.E(var1, var3, 3, 1, 6, 4, 1, 7, Z, Z, false);
            if(this.c.v[aq.WEST.w()]) {
               this.E(var1, var3, 0, 3, 3, 0, 3, 4, Z, Z, false);
            }

            this.E(var1, var3, 0, 3, 3, 1, 3, 4, Z, Z, false);
            this.E(var1, var3, 0, 2, 3, 0, 2, 4, v, v, false);
            this.E(var1, var3, 0, 1, 3, 1, 1, 4, Z, Z, false);
            if(this.c.v[aq.EAST.w()]) {
               this.E(var1, var3, 7, 3, 3, 7, 3, 4, Z, Z, false);
            }

            this.E(var1, var3, 6, 3, 3, 7, 3, 4, Z, Z, false);
            this.E(var1, var3, 7, 2, 3, 7, 2, 4, v, v, false);
            this.E(var1, var3, 6, 1, 3, 7, 1, 4, Z, Z, false);
         }

         if(this.O == 1) {
            this.E(var1, var3, 2, 1, 2, 2, 3, 2, Z, Z, false);
            this.E(var1, var3, 2, 1, 5, 2, 3, 5, Z, Z, false);
            this.E(var1, var3, 5, 1, 5, 5, 3, 5, Z, Z, false);
            this.E(var1, var3, 5, 1, 2, 5, 3, 2, Z, Z, false);
            this.N(var1, T, 2, 2, 2, var3);
            this.N(var1, T, 2, 2, 5, var3);
            this.N(var1, T, 5, 2, 5, var3);
            this.N(var1, T, 5, 2, 2, var3);
            this.E(var1, var3, 0, 1, 0, 1, 3, 0, Z, Z, false);
            this.E(var1, var3, 0, 1, 1, 0, 3, 1, Z, Z, false);
            this.E(var1, var3, 0, 1, 7, 1, 3, 7, Z, Z, false);
            this.E(var1, var3, 0, 1, 6, 0, 3, 6, Z, Z, false);
            this.E(var1, var3, 6, 1, 7, 7, 3, 7, Z, Z, false);
            this.E(var1, var3, 7, 1, 6, 7, 3, 6, Z, Z, false);
            this.E(var1, var3, 6, 1, 0, 7, 3, 0, Z, Z, false);
            this.E(var1, var3, 7, 1, 1, 7, 3, 1, Z, Z, false);
            this.N(var1, v, 1, 2, 0, var3);
            this.N(var1, v, 0, 2, 1, var3);
            this.N(var1, v, 1, 2, 7, var3);
            this.N(var1, v, 0, 2, 6, var3);
            this.N(var1, v, 6, 2, 7, var3);
            this.N(var1, v, 7, 2, 6, var3);
            this.N(var1, v, 6, 2, 0, var3);
            this.N(var1, v, 7, 2, 1, var3);
            if(!this.c.v[aq.SOUTH.w()]) {
               this.E(var1, var3, 1, 3, 0, 6, 3, 0, Z, Z, false);
               this.E(var1, var3, 1, 2, 0, 6, 2, 0, v, v, false);
               this.E(var1, var3, 1, 1, 0, 6, 1, 0, Z, Z, false);
            }

            if(!this.c.v[aq.NORTH.w()]) {
               this.E(var1, var3, 1, 3, 7, 6, 3, 7, Z, Z, false);
               this.E(var1, var3, 1, 2, 7, 6, 2, 7, v, v, false);
               this.E(var1, var3, 1, 1, 7, 6, 1, 7, Z, Z, false);
            }

            if(!this.c.v[aq.WEST.w()]) {
               this.E(var1, var3, 0, 3, 1, 0, 3, 6, Z, Z, false);
               this.E(var1, var3, 0, 2, 1, 0, 2, 6, v, v, false);
               this.E(var1, var3, 0, 1, 1, 0, 1, 6, Z, Z, false);
            }

            if(this.c.v[aq.EAST.w()]) {
               return true;
            }

            this.E(var1, var3, 7, 3, 1, 7, 3, 6, Z, Z, false);
            this.E(var1, var3, 7, 2, 1, 7, 2, 6, v, v, false);
            this.E(var1, var3, 7, 1, 1, 7, 1, 6, Z, Z, false);
         }

         if(this.O == 2) {
            this.E(var1, var3, 0, 1, 0, 0, 1, 7, Z, Z, false);
            this.E(var1, var3, 7, 1, 0, 7, 1, 7, Z, Z, false);
            this.E(var1, var3, 1, 1, 0, 6, 1, 0, Z, Z, false);
            this.E(var1, var3, 1, 1, 7, 6, 1, 7, Z, Z, false);
            this.E(var1, var3, 0, 2, 0, 0, 2, 7, W, W, false);
            this.E(var1, var3, 7, 2, 0, 7, 2, 7, W, W, false);
            this.E(var1, var3, 1, 2, 0, 6, 2, 0, W, W, false);
            this.E(var1, var3, 1, 2, 7, 6, 2, 7, W, W, false);
            this.E(var1, var3, 0, 3, 0, 0, 3, 7, Z, Z, false);
            this.E(var1, var3, 7, 3, 0, 7, 3, 7, Z, Z, false);
            this.E(var1, var3, 1, 3, 0, 6, 3, 0, Z, Z, false);
            this.E(var1, var3, 1, 3, 7, 6, 3, 7, Z, Z, false);
            this.E(var1, var3, 0, 1, 3, 0, 2, 4, W, W, false);
            this.E(var1, var3, 7, 1, 3, 7, 2, 4, W, W, false);
            this.E(var1, var3, 3, 1, 0, 4, 2, 0, W, W, false);
            this.E(var1, var3, 3, 1, 7, 4, 2, 7, W, W, false);
            if(this.c.v[aq.SOUTH.w()]) {
               this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
            }

            if(this.c.v[aq.NORTH.w()]) {
               this.A(var1, var3, 3, 1, 7, 4, 2, 7, false);
            }

            if(this.c.v[aq.WEST.w()]) {
               this.A(var1, var3, 0, 1, 3, 0, 2, 4, false);
            }

            if(this.c.v[aq.EAST.w()]) {
               this.A(var1, var3, 7, 1, 3, 7, 2, 4, false);
            }
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class i extends g.v {
      public i() {
      }

      public i(aq var1, g.c var2) {
         super(1, var1, var2, 1, 1, 1);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 3, 0, 2, 3, 7, Z, Z, false);
         p.d();
         this.E(var1, var3, 5, 3, 0, 7, 3, 7, Z, Z, false);
         this.E(var1, var3, 0, 2, 0, 1, 2, 7, Z, Z, false);
         this.E(var1, var3, 6, 2, 0, 7, 2, 7, Z, Z, false);
         this.E(var1, var3, 0, 1, 0, 0, 1, 7, Z, Z, false);
         this.E(var1, var3, 7, 1, 0, 7, 1, 7, Z, Z, false);
         this.E(var1, var3, 0, 1, 7, 7, 3, 7, Z, Z, false);
         this.E(var1, var3, 1, 1, 0, 2, 3, 0, Z, Z, false);
         this.E(var1, var3, 5, 1, 0, 6, 3, 0, Z, Z, false);
         if(this.c.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 1, 7, 4, 2, 7, false);
         }

         if(this.c.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 3, 1, 2, 4, false);
         }

         if(this.c.v[aq.EAST.w()]) {
            this.A(var1, var3, 6, 1, 3, 7, 2, 4, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class j extends g.v {
      public j() {
      }

      public j(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 1, 1, 1);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 0, 0, this.c.v[aq.DOWN.w()]);
         }

         if(this.c.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 4, 1, 6, 4, 6, v);
         }

         int var5 = 1;
         int var6 = 1;
         if(var2.nextInt(3) != 0) {
            int var7 = 2 + (var2.nextInt(4) == 0?0:1);
            this.E(var1, var3, var5, var7, var6, var5, 3, var6, net.nb.f.um.D(1), net.nb.f.um.D(1), false);
         }

         ++var6;
         ++var5;
         this.E(var1, var3, 0, 1, 0, 0, 1, 7, Z, Z, false);
         this.E(var1, var3, 7, 1, 0, 7, 1, 7, Z, Z, false);
         this.E(var1, var3, 1, 1, 0, 6, 1, 0, Z, Z, false);
         this.E(var1, var3, 1, 1, 7, 6, 1, 7, Z, Z, false);
         this.E(var1, var3, 0, 2, 0, 0, 2, 7, W, W, false);
         this.E(var1, var3, 7, 2, 0, 7, 2, 7, W, W, false);
         this.E(var1, var3, 1, 2, 0, 6, 2, 0, W, W, false);
         this.E(var1, var3, 1, 2, 7, 6, 2, 7, W, W, false);
         this.E(var1, var3, 0, 3, 0, 0, 3, 7, Z, Z, false);
         this.E(var1, var3, 7, 3, 0, 7, 3, 7, Z, Z, false);
         this.E(var1, var3, 1, 3, 0, 6, 3, 0, Z, Z, false);
         this.E(var1, var3, 1, 3, 7, 6, 3, 7, Z, Z, false);
         this.E(var1, var3, 0, 1, 3, 0, 2, 4, W, W, false);
         this.E(var1, var3, 7, 1, 3, 7, 2, 4, W, W, false);
         this.E(var1, var3, 3, 1, 0, 4, 2, 0, W, W, false);
         this.E(var1, var3, 3, 1, 7, 4, 2, 7, W, W, false);
         if(this.c.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class k implements g.n {
      private k() {
      }

      public boolean L(g.c var1) {
         return true;
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         return new g.h(var1, var2, var3);
      }
   }

   static class m implements g.n {
      private m() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         if(var1.v[aq.EAST.w()] && !var1.r[aq.EAST.w()].l && var1.v[aq.UP.w()] && !var1.r[aq.UP.w()].l) {
            g.c var3 = var1.r[aq.EAST.w()];
            return var3.v[aq.UP.w()] && !var3.r[aq.UP.w()].l;
         } else {
            return false;
         }
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         var2.r[aq.EAST.w()].l = true;
         var2.r[aq.UP.w()].l = true;
         var2.r[aq.EAST.w()].r[aq.UP.w()].l = true;
         return new g.u(var1, var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   interface n {
      boolean L(g.c var1);

      g.v p(aq var1, g.c var2, Random var3);
   }

   static class o implements g.n {
      private o() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         if(var1.v[aq.NORTH.w()] && !var1.r[aq.NORTH.w()].l && var1.v[aq.UP.w()] && !var1.r[aq.UP.w()].l) {
            g.c var3 = var1.r[aq.NORTH.w()];
            return var3.v[aq.UP.w()] && !var3.r[aq.UP.w()].l;
         } else {
            return false;
         }
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         var2.r[aq.NORTH.w()].l = true;
         var2.r[aq.UP.w()].l = true;
         var2.r[aq.NORTH.w()].r[aq.UP.w()].l = true;
         return new g.p(var1, var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class p extends g.v {
      public p() {
      }

      public p(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 1, 2, 2);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         g.c var5 = this.c.r[aq.NORTH.w()];
         p.d();
         g.c var6 = this.c;
         g.c var7 = var5.r[aq.UP.w()];
         g.c var8 = var6.r[aq.UP.w()];
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 0, 8, var5.v[aq.DOWN.w()]);
            this.v(var1, var3, 0, 0, var6.v[aq.DOWN.w()]);
         }

         if(var8.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 8, 1, 6, 8, 7, v);
         }

         if(var7.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 8, 8, 6, 8, 14, v);
         }

         int var9 = 1;
         net.yw.n var10 = Z;
         this.E(var1, var3, 0, var9, 0, 0, var9, 15, var10, var10, false);
         this.E(var1, var3, 7, var9, 0, 7, var9, 15, var10, var10, false);
         this.E(var1, var3, 1, var9, 0, 6, var9, 0, var10, var10, false);
         this.E(var1, var3, 1, var9, 15, 6, var9, 15, var10, var10, false);
         ++var9;
         var9 = 1;
         var10 = W;
         this.E(var1, var3, 3, var9, 7, 4, var9, 8, var10, var10, false);
         ++var9;
         if(var6.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
         }

         if(var6.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 1, 3, 7, 2, 4, false);
         }

         if(var6.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 3, 0, 2, 4, false);
         }

         if(var5.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 1, 15, 4, 2, 15, false);
         }

         if(var5.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 11, 0, 2, 12, false);
         }

         if(var5.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 1, 11, 7, 2, 12, false);
         }

         if(var8.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 5, 0, 4, 6, 0, false);
         }

         if(var8.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 5, 3, 7, 6, 4, false);
            this.E(var1, var3, 5, 4, 2, 6, 4, 5, Z, Z, false);
            this.E(var1, var3, 6, 1, 2, 6, 3, 2, Z, Z, false);
            this.E(var1, var3, 6, 1, 5, 6, 3, 5, Z, Z, false);
         }

         if(var8.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 5, 3, 0, 6, 4, false);
            this.E(var1, var3, 1, 4, 2, 2, 4, 5, Z, Z, false);
            this.E(var1, var3, 1, 1, 2, 1, 3, 2, Z, Z, false);
            this.E(var1, var3, 1, 1, 5, 1, 3, 5, Z, Z, false);
         }

         if(var7.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 5, 15, 4, 6, 15, false);
         }

         if(var7.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 5, 11, 0, 6, 12, false);
            this.E(var1, var3, 1, 4, 10, 2, 4, 13, Z, Z, false);
            this.E(var1, var3, 1, 1, 10, 1, 3, 10, Z, Z, false);
            this.E(var1, var3, 1, 1, 13, 1, 3, 13, Z, Z, false);
         }

         if(var7.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 5, 11, 7, 6, 12, false);
            this.E(var1, var3, 5, 4, 10, 6, 4, 13, Z, Z, false);
            this.E(var1, var3, 6, 1, 10, 6, 3, 10, Z, Z, false);
            this.E(var1, var3, 6, 1, 13, 6, 3, 13, Z, Z, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class q extends g.v {
      private g.c p;
      private g.c U;
      private final List j = Lists.newArrayList();

      public q() {
      }

      public q(Random var1, int var2, int var3, aq var4) {
         super(0);
         this.n(var4);
         aq var5 = this.L();
         if(var5.r() == aq.l.Z) {
            this.w = new v(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
         } else {
            this.w = new v(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
         }

         List var6 = this.C(var1);
         this.p.l = true;
         this.j.add(new g.i(var5, this.p));
         this.j.add(new g.w(var5, this.U, var1));
         ArrayList var7 = Lists.newArrayList();
         var7.add(new g.m());
         var7.add(new g.o());
         var7.add(new g.e());
         var7.add(new g.x());
         var7.add(new g.a());
         var7.add(new g.t());
         var7.add(new g.k());

         label294:
         for(g.c var9 : var6) {
            if(!var9.l && !var9.r()) {
               Iterator var10 = var7.iterator();

               g.n var11;
               while(true) {
                  if(!var10.hasNext()) {
                     continue label294;
                  }

                  var11 = (g.n)var10.next();
                  if(var11.L(var9)) {
                     break;
                  }
               }

               this.j.add(var11.p(var5, var9, var1));
            }
         }

         int var15 = this.w.D;
         int var16 = this.g(9, 22);
         int var17 = this.w(9, 22);

         for(g.v var12 : this.j) {
            var12.J().D(var16, var15, var17);
         }

         v var19 = v.c(this.g(1, 1), this.Z(1), this.w(1, 1), this.g(23, 21), this.Z(8), this.w(23, 21));
         v var20 = v.c(this.g(34, 1), this.Z(1), this.w(34, 1), this.g(56, 21), this.Z(8), this.w(56, 21));
         v var13 = v.c(this.g(22, 22), this.Z(13), this.w(22, 22), this.g(35, 35), this.Z(17), this.w(35, 35));
         int var14 = var1.nextInt();
         this.j.add(new g.f(var5, var19, var14++));
         this.j.add(new g.f(var5, var20, var14++));
         this.j.add(new g.s(var5, var13));
      }

      private List C(Random var1) {
         p.d();
         g.c[] var3 = new g.c[75];
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = C(var4, 0, var5);
         var3[var7] = new g.c(var7);
         ++var5;
         ++var4;
         var4 = 0;
         var5 = 0;
         var6 = (boolean)1;
         var7 = C(var4, 1, var5);
         var3[var7] = new g.c(var7);
         ++var5;
         ++var4;
         var4 = 1;
         var5 = 0;
         var6 = (boolean)2;
         var7 = C(var4, 2, var5);
         var3[var7] = new g.c(var7);
         ++var5;
         ++var4;
         this.p = var3[S];
         var4 = 0;
         var5 = 0;
         var6 = 0;
         var7 = C(var4, var6, var5);
         if(var3[var7] != null) {
            aq[] var8 = aq.values();
            int var9 = var8.length;
            int var10 = 0;
            if(var10 < var9) {
               aq var11 = var8[var10];
               int var12 = var4 + var11.v();
               int var13 = var6 + var11.z();
               int var14 = var5 + var11.P();
               if(var12 >= 0 && var12 < 5 && var14 >= 0 && var14 < 5 && var13 >= 0 && var13 < 3) {
                  int var15 = C(var12, var13, var14);
                  if(var3[var15] != null) {
                     if(var14 == var5) {
                        var3[var7].u(var11, var3[var15]);
                     }

                     var3[var7].u(var11.f(), var3[var15]);
                  }
               }

               ++var10;
            }
         }

         ++var6;
         ++var5;
         ++var4;
         g.c var23 = new g.c(1003);
         g.c var31 = new g.c(1001);
         g.c var36 = new g.c(1002);
         var3[M].u(aq.UP, var23);
         var3[Q].u(aq.SOUTH, var31);
         var3[L].u(aq.SOUTH, var36);
         var23.l = true;
         var31.l = true;
         var36.l = true;
         this.p.A = true;
         this.U = var3[C(var1.nextInt(4), 0, 2)];
         this.U.l = true;
         this.U.r[aq.EAST.w()].l = true;
         this.U.r[aq.NORTH.w()].l = true;
         this.U.r[aq.EAST.w()].r[aq.NORTH.w()].l = true;
         this.U.r[aq.UP.w()].l = true;
         this.U.r[aq.EAST.w()].r[aq.UP.w()].l = true;
         this.U.r[aq.NORTH.w()].r[aq.UP.w()].l = true;
         this.U.r[aq.EAST.w()].r[aq.NORTH.w()].r[aq.UP.w()].l = true;
         ArrayList var40 = Lists.newArrayList();
         int var44 = var3.length;
         int var47 = 0;
         if(var47 < var44) {
            g.c var50 = var3[var47];
            if(var50 != null) {
               var50.u();
               var40.add(var50);
            }

            ++var47;
         }

         var23.u();
         Collections.shuffle(var40, var1);
         int var41 = 1;
         Iterator var45 = var40.iterator();
         if(var45.hasNext()) {
            g.c var49 = (g.c)var45.next();
            int var51 = 0;
            int var53 = 0;
            ++var53;
            int var55 = var1.nextInt(6);
            if(var49.v[var55]) {
               int var56 = aq.l(var55).f().w();
               var49.v[var55] = false;
               var49.r[var55].v[var56] = false;
               if(var49.c(var41++) && var49.r[var55].c(var41++)) {
                  ++var51;
               }

               var49.v[var55] = true;
               var49.r[var55].v[var56] = true;
            }
         }

         var40.add(var23);
         var40.add(var31);
         var40.add(var36);
         return var40;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int var4 = Math.max(var1.k(), 64) - this.w.D;
         this.A(var1, var3, 0, 0, 0, 58, var4, 58, false);
         this.V(false, 0, var1, var2, var3);
         this.V(true, 33, var1, var2, var3);
         this.x(var1, var2, var3);
         this.B(var1, var2, var3);
         this.k(var1, var2, var3);
         this.S(var1, var2, var3);
         this.E(var1, var2, var3);
         this.g(var1, var2, var3);
         byte var5 = 0;
         byte var6 = 0;
         int var7 = var5 * 9;
         int var8 = var6 * 9;
         byte var9 = 0;
         int var10 = 0;

         while(true) {
            this.N(var1, Z, var7 + var9, 0, var8 + var10, var3);
            this.X(var1, Z, var7 + var9, -1, var8 + var10, var3);
            ++var10;
         }
      }

      private void V(boolean var1, int var2, net.yv.r var3, Random var4, v var5) {
         boolean var10000 = true;
         if(this.X(var5, var2, 0, var2 + 23, 20)) {
            this.E(var3, var5, var2 + 0, 0, 0, var2 + 24, 0, 20, v, v, false);
            this.A(var3, var5, var2 + 0, 1, 0, var2 + 24, 10, 20, false);
            int var7 = 0;

            while(true) {
               this.E(var3, var5, var2 + var7, var7 + 1, var7, var2 + var7, var7 + 1, 20, Z, Z, false);
               this.E(var3, var5, var2 + var7 + 7, var7 + 5, var7 + 7, var2 + var7 + 7, var7 + 5, 20, Z, Z, false);
               this.E(var3, var5, var2 + 17 - var7, var7 + 5, var7 + 7, var2 + 17 - var7, var7 + 5, 20, Z, Z, false);
               this.E(var3, var5, var2 + 24 - var7, var7 + 1, var7, var2 + 24 - var7, var7 + 1, 20, Z, Z, false);
               this.E(var3, var5, var2 + var7 + 1, var7 + 1, var7, var2 + 23 - var7, var7 + 1, var7, Z, Z, false);
               this.E(var3, var5, var2 + var7 + 8, var7 + 5, var7 + 7, var2 + 16 - var7, var7 + 5, var7 + 7, Z, Z, false);
               ++var7;
            }
         }

      }

      private void x(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 22, 5, 35, 17)) {
            this.A(var1, var3, 25, 0, 0, 32, 8, 20, false);
            int var4 = 0;

            while(true) {
               this.E(var1, var3, 24, 2, 5 + var4 * 4, 24, 4, 5 + var4 * 4, Z, Z, false);
               this.E(var1, var3, 22, 4, 5 + var4 * 4, 23, 4, 5 + var4 * 4, Z, Z, false);
               this.N(var1, Z, 25, 5, 5 + var4 * 4, var3);
               this.N(var1, Z, 26, 6, 5 + var4 * 4, var3);
               this.N(var1, T, 26, 5, 5 + var4 * 4, var3);
               this.E(var1, var3, 33, 2, 5 + var4 * 4, 33, 4, 5 + var4 * 4, Z, Z, false);
               this.E(var1, var3, 34, 4, 5 + var4 * 4, 35, 4, 5 + var4 * 4, Z, Z, false);
               this.N(var1, Z, 32, 5, 5 + var4 * 4, var3);
               this.N(var1, Z, 31, 6, 5 + var4 * 4, var3);
               this.N(var1, T, 31, 5, 5 + var4 * 4, var3);
               this.E(var1, var3, 27, 6, 5 + var4 * 4, 30, 6, 5 + var4 * 4, v, v, false);
               ++var4;
            }
         }

      }

      private void B(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 15, 20, 42, 21)) {
            this.E(var1, var3, 15, 0, 21, 42, 0, 21, v, v, false);
            this.A(var1, var3, 26, 1, 21, 31, 3, 21, false);
            this.E(var1, var3, 21, 12, 21, 36, 12, 21, v, v, false);
            this.E(var1, var3, 17, 11, 21, 40, 11, 21, v, v, false);
            this.E(var1, var3, 16, 10, 21, 41, 10, 21, v, v, false);
            this.E(var1, var3, 15, 7, 21, 42, 9, 21, v, v, false);
            this.E(var1, var3, 16, 6, 21, 41, 6, 21, v, v, false);
            this.E(var1, var3, 17, 5, 21, 40, 5, 21, v, v, false);
            this.E(var1, var3, 21, 4, 21, 36, 4, 21, v, v, false);
            this.E(var1, var3, 22, 3, 21, 26, 3, 21, v, v, false);
            this.E(var1, var3, 31, 3, 21, 35, 3, 21, v, v, false);
            this.E(var1, var3, 23, 2, 21, 25, 2, 21, v, v, false);
            this.E(var1, var3, 32, 2, 21, 34, 2, 21, v, v, false);
            this.E(var1, var3, 28, 4, 20, 29, 4, 21, Z, Z, false);
            this.N(var1, Z, 27, 3, 21, var3);
            this.N(var1, Z, 30, 3, 21, var3);
            this.N(var1, Z, 26, 2, 21, var3);
            this.N(var1, Z, 31, 2, 21, var3);
            this.N(var1, Z, 25, 1, 21, var3);
            this.N(var1, Z, 32, 1, 21, var3);
            int var4 = 0;

            while(true) {
               this.N(var1, W, 28 - var4, 6 + var4, 21, var3);
               this.N(var1, W, 29 + var4, 6 + var4, 21, var3);
               ++var4;
            }
         }

      }

      private void k(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 21, 21, 36, 36)) {
            this.E(var1, var3, 21, 0, 22, 36, 0, 36, v, v, false);
            this.A(var1, var3, 21, 1, 22, 36, 23, 36, false);
            int var4 = 0;

            while(true) {
               this.E(var1, var3, 21 + var4, 13 + var4, 21 + var4, 36 - var4, 13 + var4, 21 + var4, Z, Z, false);
               this.E(var1, var3, 21 + var4, 13 + var4, 36 - var4, 36 - var4, 13 + var4, 36 - var4, Z, Z, false);
               this.E(var1, var3, 21 + var4, 13 + var4, 22 + var4, 21 + var4, 13 + var4, 35 - var4, Z, Z, false);
               this.E(var1, var3, 36 - var4, 13 + var4, 22 + var4, 36 - var4, 13 + var4, 35 - var4, Z, Z, false);
               ++var4;
            }
         }

      }

      private void S(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 0, 21, 6, 58)) {
            this.E(var1, var3, 0, 0, 21, 6, 0, 57, v, v, false);
            this.A(var1, var3, 0, 1, 21, 6, 7, 57, false);
            this.E(var1, var3, 4, 4, 21, 6, 4, 53, v, v, false);
            int var6 = 0;

            while(true) {
               this.E(var1, var3, var6, var6 + 1, 21, var6, var6 + 1, 57 - var6, Z, Z, false);
               ++var6;
            }
         }

         if(this.X(var3, 51, 21, 58, 58)) {
            this.E(var1, var3, 51, 0, 21, 57, 0, 57, v, v, false);
            this.A(var1, var3, 51, 1, 21, 57, 7, 57, false);
            this.E(var1, var3, 51, 4, 21, 53, 4, 53, v, v, false);
            int var5 = 0;

            while(true) {
               this.E(var1, var3, 57 - var5, var5 + 1, 21, 57 - var5, var5 + 1, 57 - var5, Z, Z, false);
               ++var5;
            }
         }

         if(this.X(var3, 0, 51, 57, 57)) {
            this.E(var1, var3, 7, 0, 51, 50, 0, 57, v, v, false);
            this.A(var1, var3, 7, 1, 51, 50, 10, 57, false);
            int var4 = 0;

            while(true) {
               this.E(var1, var3, var4 + 1, var4 + 1, 57 - var4, 56 - var4, var4 + 1, 57 - var4, Z, Z, false);
               ++var4;
            }
         }

      }

      private void E(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 7, 21, 13, 50)) {
            this.E(var1, var3, 7, 0, 21, 13, 0, 50, v, v, false);
            this.A(var1, var3, 7, 1, 21, 13, 10, 50, false);
            this.E(var1, var3, 11, 8, 21, 13, 8, 53, v, v, false);
            int var6 = 0;

            while(true) {
               this.E(var1, var3, var6 + 7, var6 + 5, 21, var6 + 7, var6 + 5, 54, Z, Z, false);
               ++var6;
            }
         }

         if(this.X(var3, 44, 21, 50, 54)) {
            this.E(var1, var3, 44, 0, 21, 50, 0, 50, v, v, false);
            this.A(var1, var3, 44, 1, 21, 50, 10, 50, false);
            this.E(var1, var3, 44, 8, 21, 46, 8, 53, v, v, false);
            int var5 = 0;

            while(true) {
               this.E(var1, var3, 50 - var5, var5 + 5, 21, 50 - var5, var5 + 5, 54, Z, Z, false);
               ++var5;
            }
         }

         if(this.X(var3, 8, 44, 49, 54)) {
            this.E(var1, var3, 14, 0, 44, 43, 0, 50, v, v, false);
            this.A(var1, var3, 14, 1, 44, 43, 10, 50, false);
            int var4 = 12;

            while(true) {
               this.N(var1, P, var4, 9, 45, var3);
               this.N(var1, P, var4, 9, 52, var3);
               this.N(var1, P, var4, 9, 47, var3);
               this.N(var1, P, var4, 9, 50, var3);
               this.N(var1, P, var4, 10, 45, var3);
               this.N(var1, P, var4, 10, 46, var3);
               this.N(var1, P, var4, 10, 51, var3);
               this.N(var1, P, var4, 10, 52, var3);
               this.N(var1, P, var4, 11, 47, var3);
               this.N(var1, P, var4, 11, 50, var3);
               this.N(var1, P, var4, 12, 48, var3);
               this.N(var1, P, var4, 12, 49, var3);
               var4 += 3;
            }
         }

      }

      private void g(net.yv.r var1, Random var2, v var3) {
         if(this.X(var3, 14, 21, 20, 43)) {
            this.E(var1, var3, 14, 0, 21, 20, 0, 43, v, v, false);
            this.A(var1, var3, 14, 1, 22, 20, 14, 43, false);
            this.E(var1, var3, 18, 12, 22, 20, 12, 39, v, v, false);
            this.E(var1, var3, 18, 12, 21, 20, 12, 21, Z, Z, false);
            int var6 = 0;

            while(true) {
               this.E(var1, var3, var6 + 14, var6 + 9, 21, var6 + 14, var6 + 9, 43 - var6, Z, Z, false);
               ++var6;
            }
         }

         if(this.X(var3, 37, 21, 43, 43)) {
            this.E(var1, var3, 37, 0, 21, 43, 0, 43, v, v, false);
            this.A(var1, var3, 37, 1, 22, 43, 14, 43, false);
            this.E(var1, var3, 37, 12, 22, 39, 12, 39, v, v, false);
            this.E(var1, var3, 37, 12, 21, 39, 12, 21, Z, Z, false);
            int var5 = 0;

            while(true) {
               this.E(var1, var3, 43 - var5, var5 + 9, 21, 43 - var5, var5 + 9, 43 - var5, Z, Z, false);
               ++var5;
            }
         }

         if(this.X(var3, 15, 37, 42, 43)) {
            this.E(var1, var3, 21, 0, 37, 36, 0, 43, v, v, false);
            this.A(var1, var3, 21, 1, 37, 36, 14, 43, false);
            this.E(var1, var3, 21, 12, 37, 36, 12, 39, v, v, false);
            int var4 = 0;

            while(true) {
               this.E(var1, var3, 15 + var4, var4 + 9, 43 - var4, 42 - var4, var4 + 9, 43 - var4, Z, Z, false);
               ++var4;
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class s extends g.v {
      public s() {
      }

      public s(aq var1, v var2) {
         super(var1, var2);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 2, -1, 2, 11, -1, 11, Z, Z, false);
         this.E(var1, var3, 0, -1, 0, 1, -1, 11, v, v, false);
         this.E(var1, var3, 12, -1, 0, 13, -1, 11, v, v, false);
         this.E(var1, var3, 2, -1, 0, 11, -1, 1, v, v, false);
         this.E(var1, var3, 2, -1, 12, 11, -1, 13, v, v, false);
         this.E(var1, var3, 0, 0, 0, 0, 0, 13, Z, Z, false);
         p.d();
         this.E(var1, var3, 13, 0, 0, 13, 0, 13, Z, Z, false);
         this.E(var1, var3, 1, 0, 0, 12, 0, 0, Z, Z, false);
         this.E(var1, var3, 1, 0, 13, 12, 0, 13, Z, Z, false);
         int var5 = 2;
         this.N(var1, T, 0, 0, var5, var3);
         this.N(var1, T, 13, 0, var5, var3);
         this.N(var1, T, var5, 0, 0, var3);
         var5 = var5 + 3;
         this.E(var1, var3, 2, 0, 3, 4, 0, 9, Z, Z, false);
         this.E(var1, var3, 9, 0, 3, 11, 0, 9, Z, Z, false);
         this.E(var1, var3, 4, 0, 9, 9, 0, 11, Z, Z, false);
         this.N(var1, Z, 5, 0, 8, var3);
         this.N(var1, Z, 8, 0, 8, var3);
         this.N(var1, Z, 10, 0, 10, var3);
         this.N(var1, Z, 3, 0, 10, var3);
         this.E(var1, var3, 3, 0, 3, 3, 0, 7, W, W, false);
         this.E(var1, var3, 10, 0, 3, 10, 0, 7, W, W, false);
         this.E(var1, var3, 6, 0, 10, 7, 0, 10, W, W, false);
         var5 = 3;
         int var6 = 0;
         int var7 = 2;
         this.E(var1, var3, var5, 0, var7, var5, 2, var7, Z, Z, false);
         var7 = var7 + 3;
         var5 = 10;
         ++var6;
         this.E(var1, var3, 5, 0, 10, 5, 2, 10, Z, Z, false);
         this.E(var1, var3, 8, 0, 10, 8, 2, 10, Z, Z, false);
         this.E(var1, var3, 6, -1, 7, 7, -1, 8, W, W, false);
         this.A(var1, var3, 6, -1, 3, 7, -1, 4, false);
         this.D(var1, var3, 6, 1, 6);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class t implements g.n {
      private t() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         return !var1.v[aq.WEST.w()] && !var1.v[aq.EAST.w()] && !var1.v[aq.NORTH.w()] && !var1.v[aq.SOUTH.w()] && !var1.v[aq.UP.w()];
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         return new g.j(var1, var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class u extends g.v {
      public u() {
      }

      public u(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 2, 2, 1);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         p.d();
         g.c var5 = this.c.r[aq.EAST.w()];
         g.c var6 = this.c;
         g.c var7 = var6.r[aq.UP.w()];
         g.c var8 = var5.r[aq.UP.w()];
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 8, 0, var5.v[aq.DOWN.w()]);
            this.v(var1, var3, 0, 0, var6.v[aq.DOWN.w()]);
         }

         if(var7.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 8, 1, 7, 8, 6, v);
         }

         if(var8.r[aq.UP.w()] == null) {
            this.W(var1, var3, 8, 8, 1, 14, 8, 6, v);
         }

         int var9 = 1;
         net.yw.n var10 = Z;
         this.E(var1, var3, 0, var9, 0, 0, var9, 7, var10, var10, false);
         this.E(var1, var3, 15, var9, 0, 15, var9, 7, var10, var10, false);
         this.E(var1, var3, 1, var9, 0, 15, var9, 0, var10, var10, false);
         this.E(var1, var3, 1, var9, 7, 14, var9, 7, var10, var10, false);
         ++var9;
         this.E(var1, var3, 2, 1, 3, 2, 7, 4, Z, Z, false);
         this.E(var1, var3, 3, 1, 2, 4, 7, 2, Z, Z, false);
         this.E(var1, var3, 3, 1, 5, 4, 7, 5, Z, Z, false);
         this.E(var1, var3, 13, 1, 3, 13, 7, 4, Z, Z, false);
         this.E(var1, var3, 11, 1, 2, 12, 7, 2, Z, Z, false);
         this.E(var1, var3, 11, 1, 5, 12, 7, 5, Z, Z, false);
         this.E(var1, var3, 5, 1, 3, 5, 3, 4, Z, Z, false);
         this.E(var1, var3, 10, 1, 3, 10, 3, 4, Z, Z, false);
         this.E(var1, var3, 5, 7, 2, 10, 7, 5, Z, Z, false);
         this.E(var1, var3, 5, 5, 2, 5, 7, 2, Z, Z, false);
         this.E(var1, var3, 10, 5, 2, 10, 7, 2, Z, Z, false);
         this.E(var1, var3, 5, 5, 5, 5, 7, 5, Z, Z, false);
         this.E(var1, var3, 10, 5, 5, 10, 7, 5, Z, Z, false);
         this.N(var1, Z, 6, 6, 2, var3);
         this.N(var1, Z, 9, 6, 2, var3);
         this.N(var1, Z, 6, 6, 5, var3);
         this.N(var1, Z, 9, 6, 5, var3);
         this.E(var1, var3, 5, 4, 3, 6, 4, 4, Z, Z, false);
         this.E(var1, var3, 9, 4, 3, 10, 4, 4, Z, Z, false);
         this.N(var1, T, 5, 4, 2, var3);
         this.N(var1, T, 5, 4, 5, var3);
         this.N(var1, T, 10, 4, 2, var3);
         this.N(var1, T, 10, 4, 5, var3);
         if(var6.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
         }

         if(var6.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 1, 7, 4, 2, 7, false);
         }

         if(var6.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 3, 0, 2, 4, false);
         }

         if(var5.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 11, 1, 0, 12, 2, 0, false);
         }

         if(var5.v[aq.NORTH.w()]) {
            this.A(var1, var3, 11, 1, 7, 12, 2, 7, false);
         }

         if(var5.v[aq.EAST.w()]) {
            this.A(var1, var3, 15, 1, 3, 15, 2, 4, false);
         }

         if(var7.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 5, 0, 4, 6, 0, false);
         }

         if(var7.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 5, 7, 4, 6, 7, false);
         }

         if(var7.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 5, 3, 0, 6, 4, false);
         }

         if(var8.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 11, 5, 0, 12, 6, 0, false);
         }

         if(var8.v[aq.NORTH.w()]) {
            this.A(var1, var3, 11, 5, 7, 12, 6, 7, false);
         }

         if(var8.v[aq.EAST.w()]) {
            this.A(var1, var3, 15, 5, 3, 15, 6, 4, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public abstract static class v extends p {
      protected static final net.yw.n v = net.nb.f.oT.D(gi.N);
      protected static final net.yw.n Z = net.nb.f.oT.D(gi.Y);
      protected static final net.yw.n W = net.nb.f.oT.D(gi.W);
      protected static final net.yw.n P = Z;
      protected static final net.yw.n T = net.nb.f.uO.p();
      protected static final net.yw.n A = net.nb.f.uM.p();
      protected static final int S = C(2, 0, 0);
      protected static final int M = C(2, 2, 0);
      protected static final int Q = C(0, 1, 0);
      protected static final int L = C(4, 1, 0);
      protected g.c c;

      protected static final int C(int var0, int var1, int var2) {
         return var1 * 25 + var2 * 5 + var0;
      }

      public v() {
         super(0);
      }

      public v(int var1) {
         super(var1);
      }

      public v(aq var1, v var2) {
         super(1);
         this.n(var1);
         this.w = var2;
      }

      protected v(int var1, aq var2, g.c var3, int var4, int var5, int var6) {
         p.d();
         super(var1);
         this.n(var2);
         this.c = var3;
         int var8 = var3.f;
         int var9 = var8 % 5;
         int var10 = var8 / 5 % 5;
         int var11 = var8 / 25;
         if(var2 != aq.NORTH && var2 != aq.SOUTH) {
            this.w = new v(0, 0, 0, var6 * 8 - 1, var5 * 4 - 1, var4 * 8 - 1);
         }

         this.w = new v(0, 0, 0, var4 * 8 - 1, var5 * 4 - 1, var6 * 8 - 1);
         switch(null.s[var2.ordinal()]) {
         case 1:
            this.w.D(var9 * 8, var11 * 4, -(var10 + var6) * 8 + 1);
         case 2:
            this.w.D(var9 * 8, var11 * 4, var10 * 8);
         case 3:
            this.w.D(-(var10 + var6) * 8 + 1, var11 * 4, var9 * 8);
         default:
            this.w.D(var10 * 8, var11 * 4, var9 * 8);
         }
      }

      protected void x(net.nj.f var1) {
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
      }

      protected void A(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
         for(int var10 = var4; var10 <= var7; ++var10) {
            for(int var11 = var3; var11 <= var6; ++var11) {
               for(int var12 = var5; var12 <= var8; ++var12) {
                  if(this.r(var1, var11, var10, var12, var2).n() != net.y1.l.q) {
                     if(this.Z(var10) >= var1.k()) {
                        this.N(var1, net.nb.f.ou.p(), var11, var10, var12, var2);
                     } else {
                        this.N(var1, A, var11, var10, var12, var2);
                     }
                  }
               }
            }
         }

      }

      protected void v(net.yv.r var1, v var2, int var3, int var4, boolean var5) {
         int[] var6 = p.d();
         this.E(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, v, v, false);
         this.E(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, v, v, false);
         this.E(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, v, v, false);
         this.E(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, v, v, false);
         this.E(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, Z, Z, false);
         this.E(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, Z, Z, false);
         this.E(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, Z, Z, false);
         this.E(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, Z, Z, false);
         this.E(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, v, v, false);
      }

      protected void W(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8, net.yw.n var9) {
         for(int var10 = var4; var10 <= var7; ++var10) {
            for(int var11 = var3; var11 <= var6; ++var11) {
               for(int var12 = var5; var12 <= var8; ++var12) {
                  if(this.r(var1, var11, var10, var12, var2) == A) {
                     this.N(var1, var9, var11, var10, var12, var2);
                  }
               }
            }
         }

      }

      protected boolean X(v var1, int var2, int var3, int var4, int var5) {
         int var6 = this.g(var2, var3);
         int var7 = this.w(var2, var3);
         int var8 = this.g(var4, var5);
         int var9 = this.w(var4, var5);
         return var1.D(Math.min(var6, var8), Math.min(var7, var9), Math.max(var6, var8), Math.max(var7, var9));
      }

      protected boolean D(net.yv.r var1, v var2, int var3, int var4, int var5) {
         int var6 = this.g(var3, var5);
         int var7 = this.Z(var4);
         int var8 = this.w(var3, var5);
         if(var2.Y(new net.u.j(var6, var7, var8))) {
            net.nk.l var9 = new net.nk.l(var1);
            var9.d(var9.w());
            var9.S((double)var6 + 0.5D, (double)var7, (double)var8 + 0.5D, 0.0F, 0.0F);
            var9.t(var1.G(new net.u.j(var9)), (net.ne.g)null);
            var1.S(var9);
            return true;
         } else {
            return false;
         }
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class w extends g.v {
      public w() {
      }

      public w(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 2, 2, 2);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.W(var1, var3, 1, 8, 0, 14, 8, 14, v);
         boolean var10000 = true;
         p.d();
         net.yw.n var6 = Z;
         this.E(var1, var3, 0, 7, 0, 0, 7, 15, var6, var6, false);
         this.E(var1, var3, 15, 7, 0, 15, 7, 15, var6, var6, false);
         this.E(var1, var3, 1, 7, 0, 15, 7, 0, var6, var6, false);
         this.E(var1, var3, 1, 7, 15, 14, 7, 15, var6, var6, false);
         int var7 = 1;
         var6 = Z;
         int var8 = 0;
         this.E(var1, var3, var8, var7, 0, var8, var7, 1, var6, var6, false);
         this.E(var1, var3, var8, var7, 6, var8, var7, 9, var6, var6, false);
         this.E(var1, var3, var8, var7, 14, var8, var7, 15, var6, var6, false);
         var8 = var8 + 15;
         this.E(var1, var3, 1, var7, 0, 1, var7, 0, var6, var6, false);
         this.E(var1, var3, 6, var7, 0, 9, var7, 0, var6, var6, false);
         this.E(var1, var3, 14, var7, 0, 14, var7, 0, var6, var6, false);
         this.E(var1, var3, 1, var7, 15, 14, var7, 15, var6, var6, false);
         ++var7;
         this.E(var1, var3, 6, 3, 6, 9, 6, 9, W, W, false);
         this.E(var1, var3, 7, 4, 7, 8, 5, 8, net.nb.f.uW.p(), net.nb.f.uW.p(), false);
         var7 = 3;
         var8 = 6;
         this.N(var1, T, var8, var7, 6, var3);
         this.N(var1, T, var8, var7, 9, var3);
         var8 = var8 + 3;
         var7 = var7 + 3;
         this.E(var1, var3, 5, 1, 6, 5, 2, 6, Z, Z, false);
         this.E(var1, var3, 5, 1, 9, 5, 2, 9, Z, Z, false);
         this.E(var1, var3, 10, 1, 6, 10, 2, 6, Z, Z, false);
         this.E(var1, var3, 10, 1, 9, 10, 2, 9, Z, Z, false);
         this.E(var1, var3, 6, 1, 5, 6, 2, 5, Z, Z, false);
         this.E(var1, var3, 9, 1, 5, 9, 2, 5, Z, Z, false);
         this.E(var1, var3, 6, 1, 10, 6, 2, 10, Z, Z, false);
         this.E(var1, var3, 9, 1, 10, 9, 2, 10, Z, Z, false);
         this.E(var1, var3, 5, 2, 5, 5, 6, 5, Z, Z, false);
         this.E(var1, var3, 5, 2, 10, 5, 6, 10, Z, Z, false);
         this.E(var1, var3, 10, 2, 5, 10, 6, 5, Z, Z, false);
         this.E(var1, var3, 10, 2, 10, 10, 6, 10, Z, Z, false);
         this.E(var1, var3, 5, 7, 1, 5, 7, 6, Z, Z, false);
         this.E(var1, var3, 10, 7, 1, 10, 7, 6, Z, Z, false);
         this.E(var1, var3, 5, 7, 9, 5, 7, 14, Z, Z, false);
         this.E(var1, var3, 10, 7, 9, 10, 7, 14, Z, Z, false);
         this.E(var1, var3, 1, 7, 5, 6, 7, 5, Z, Z, false);
         this.E(var1, var3, 1, 7, 10, 6, 7, 10, Z, Z, false);
         this.E(var1, var3, 9, 7, 5, 14, 7, 5, Z, Z, false);
         this.E(var1, var3, 9, 7, 10, 14, 7, 10, Z, Z, false);
         this.E(var1, var3, 2, 1, 2, 2, 1, 3, Z, Z, false);
         this.E(var1, var3, 3, 1, 2, 3, 1, 2, Z, Z, false);
         this.E(var1, var3, 13, 1, 2, 13, 1, 3, Z, Z, false);
         this.E(var1, var3, 12, 1, 2, 12, 1, 2, Z, Z, false);
         this.E(var1, var3, 2, 1, 12, 2, 1, 13, Z, Z, false);
         this.E(var1, var3, 3, 1, 13, 3, 1, 13, Z, Z, false);
         this.E(var1, var3, 13, 1, 12, 13, 1, 13, Z, Z, false);
         this.E(var1, var3, 12, 1, 13, 12, 1, 13, Z, Z, false);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class x implements g.n {
      private x() {
      }

      public boolean L(g.c var1) {
         int[] var2 = p.d();
         return var1.v[aq.EAST.w()] && !var1.r[aq.EAST.w()].l;
      }

      public g.v p(aq var1, g.c var2, Random var3) {
         var2.l = true;
         var2.r[aq.EAST.w()].l = true;
         return new g.b(var1, var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends g.v {
      public z() {
      }

      public z(aq var1, g.c var2, Random var3) {
         super(1, var1, var2, 1, 1, 2);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         g.c var5 = this.c.r[aq.NORTH.w()];
         p.d();
         g.c var6 = this.c;
         if(this.c.f / 25 > 0) {
            this.v(var1, var3, 0, 8, var5.v[aq.DOWN.w()]);
            this.v(var1, var3, 0, 0, var6.v[aq.DOWN.w()]);
         }

         if(var6.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 4, 1, 6, 4, 7, v);
         }

         if(var5.r[aq.UP.w()] == null) {
            this.W(var1, var3, 1, 4, 8, 6, 4, 14, v);
         }

         this.E(var1, var3, 0, 3, 0, 0, 3, 15, Z, Z, false);
         this.E(var1, var3, 7, 3, 0, 7, 3, 15, Z, Z, false);
         this.E(var1, var3, 1, 3, 0, 7, 3, 0, Z, Z, false);
         this.E(var1, var3, 1, 3, 15, 6, 3, 15, Z, Z, false);
         this.E(var1, var3, 0, 2, 0, 0, 2, 15, v, v, false);
         this.E(var1, var3, 7, 2, 0, 7, 2, 15, v, v, false);
         this.E(var1, var3, 1, 2, 0, 7, 2, 0, v, v, false);
         this.E(var1, var3, 1, 2, 15, 6, 2, 15, v, v, false);
         this.E(var1, var3, 0, 1, 0, 0, 1, 15, Z, Z, false);
         this.E(var1, var3, 7, 1, 0, 7, 1, 15, Z, Z, false);
         this.E(var1, var3, 1, 1, 0, 7, 1, 0, Z, Z, false);
         this.E(var1, var3, 1, 1, 15, 6, 1, 15, Z, Z, false);
         this.E(var1, var3, 1, 1, 1, 1, 1, 2, Z, Z, false);
         this.E(var1, var3, 6, 1, 1, 6, 1, 2, Z, Z, false);
         this.E(var1, var3, 1, 3, 1, 1, 3, 2, Z, Z, false);
         this.E(var1, var3, 6, 3, 1, 6, 3, 2, Z, Z, false);
         this.E(var1, var3, 1, 1, 13, 1, 1, 14, Z, Z, false);
         this.E(var1, var3, 6, 1, 13, 6, 1, 14, Z, Z, false);
         this.E(var1, var3, 1, 3, 13, 1, 3, 14, Z, Z, false);
         this.E(var1, var3, 6, 3, 13, 6, 3, 14, Z, Z, false);
         this.E(var1, var3, 2, 1, 6, 2, 3, 6, Z, Z, false);
         this.E(var1, var3, 5, 1, 6, 5, 3, 6, Z, Z, false);
         this.E(var1, var3, 2, 1, 9, 2, 3, 9, Z, Z, false);
         this.E(var1, var3, 5, 1, 9, 5, 3, 9, Z, Z, false);
         this.E(var1, var3, 3, 2, 6, 4, 2, 6, Z, Z, false);
         this.E(var1, var3, 3, 2, 9, 4, 2, 9, Z, Z, false);
         this.E(var1, var3, 2, 2, 7, 2, 2, 8, Z, Z, false);
         this.E(var1, var3, 5, 2, 7, 5, 2, 8, Z, Z, false);
         this.N(var1, T, 2, 2, 5, var3);
         this.N(var1, T, 5, 2, 5, var3);
         this.N(var1, T, 2, 2, 10, var3);
         this.N(var1, T, 5, 2, 10, var3);
         this.N(var1, Z, 2, 3, 5, var3);
         this.N(var1, Z, 5, 3, 5, var3);
         this.N(var1, Z, 2, 3, 10, var3);
         this.N(var1, Z, 5, 3, 10, var3);
         if(var6.v[aq.SOUTH.w()]) {
            this.A(var1, var3, 3, 1, 0, 4, 2, 0, false);
         }

         if(var6.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 1, 3, 7, 2, 4, false);
         }

         if(var6.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 3, 0, 2, 4, false);
         }

         if(var5.v[aq.NORTH.w()]) {
            this.A(var1, var3, 3, 1, 15, 4, 2, 15, false);
         }

         if(var5.v[aq.WEST.w()]) {
            this.A(var1, var3, 0, 1, 11, 0, 2, 12, false);
         }

         if(var5.v[aq.EAST.w()]) {
            this.A(var1, var3, 7, 1, 11, 7, 2, 12, false);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
