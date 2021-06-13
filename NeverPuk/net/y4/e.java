package net.y4;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y4.b;
import net.y4.p;
import net.y4.v;
import net.y9.l_;
import net.yz.aq;

public class e {
   private static final e.j[] C = new e.j[]{new e.j(e.g.class, 30, 0, true), new e.j(e.k.class, 10, 4), new e.j(e.y.class, 10, 4), new e.j(e.w.class, 10, 3), new e.j(e.a.class, 5, 2), new e.j(e.h.class, 5, 1)};
   private static final e.j[] a = new e.j[]{new e.j(e.i.class, 25, 0, true), new e.j(e.x.class, 15, 5), new e.j(e.n.class, 5, 10), new e.j(e.z.class, 5, 10), new e.j(e.o.class, 10, 3, true), new e.j(e.t.class, 7, 2), new e.j(e.r.class, 5, 2)};

   public static void i() {
      b.v(e.k.class, "NeBCr");
      b.v(e.d.class, "NeBEF");
      b.v(e.g.class, "NeBS");
      b.v(e.o.class, "NeCCS");
      b.v(e.t.class, "NeCTB");
      b.v(e.h.class, "NeCE");
      b.v(e.x.class, "NeSCSC");
      b.v(e.z.class, "NeSCLT");
      b.v(e.i.class, "NeSC");
      b.v(e.n.class, "NeSCRT");
      b.v(e.r.class, "NeCSR");
      b.v(e.a.class, "NeMT");
      b.v(e.y.class, "NeRC");
      b.v(e.w.class, "NeSR");
      b.v(e.q.class, "NeStart");
   }

   private static e.b h(e.j var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      Class var9 = var0.c;
      p.d();
      Object var10 = null;
      if(var9 == e.g.class) {
         var10 = e.g.V(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.k.class) {
         var10 = e.k.C(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.y.class) {
         var10 = e.y.Q(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.w.class) {
         var10 = e.w.b(var1, var2, var3, var4, var5, var7, var6);
      } else if(var9 == e.a.class) {
         var10 = e.a.O(var1, var2, var3, var4, var5, var7, var6);
      } else if(var9 == e.h.class) {
         var10 = e.h.H(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.i.class) {
         var10 = e.i.T(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.n.class) {
         var10 = e.n.o(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.z.class) {
         var10 = e.z.c(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.o.class) {
         var10 = e.o.i(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.t.class) {
         var10 = e.t.T(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.x.class) {
         var10 = e.x.U(var1, var2, var3, var4, var5, var6, var7);
      } else if(var9 == e.r.class) {
         var10 = e.r.v(var1, var2, var3, var4, var5, var6, var7);
      }

      return (e.b)var10;
   }

   // $FF: synthetic method
   static e.b access$000(e.j var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      return h(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class a extends e.b {
      private boolean d;

      public a() {
      }

      public a(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.d = var1.i("Mob");
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Mob", this.d);
      }

      public static e.a O(List var0, Random var1, int var2, int var3, int var4, int var5, aq var6) {
         v var7 = v.V(var2, var3, var4, -2, 0, 0, 7, 8, 9, var6);
         return z(var7) && p.H(var0, var7) == null?new e.a(var5, var1, var7, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 2, 0, 6, 7, 7, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 0, 0, 5, 1, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 2, 1, 5, 2, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 3, 2, 5, 3, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 4, 3, 5, 4, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 2, 0, 1, 4, 2, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 2, 0, 5, 4, 2, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 1, 5, 2, 1, 5, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 5, 2, 5, 5, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 5, 3, 0, 5, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 5, 3, 6, 5, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 5, 8, 5, 5, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.N(var1, net.nb.f.Tx.p(), 1, 6, 3, var3);
         this.N(var1, net.nb.f.Tx.p(), 5, 6, 3, var3);
         this.E(var1, var3, 0, 6, 3, 0, 6, 8, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 6, 6, 3, 6, 6, 8, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 1, 6, 8, 5, 7, 8, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 2, 8, 8, 4, 8, 8, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         if(!this.d) {
            net.u.j var5 = new net.u.j(this.g(3, 5), this.Z(5), this.w(3, 5));
            if(var3.Y(var5)) {
               this.d = true;
               var1.k(var5, net.nb.f.uw.p(), 2);
               net.ni.v var6 = var1.L(var5);
               if(var6 instanceof net.ni.u) {
                  ((net.ni.u)var6).H().S(net.ne.v.P(net.nk.x.class));
               }
            }
         }

         int var7 = 0;
         int var9 = 0;
         this.X(var1, net.nb.f.Tb.p(), var7, -1, var9, var3);
         ++var9;
         ++var7;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   abstract static class b extends p {
      public b() {
      }

      protected b(int var1) {
         super(var1);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
      }

      protected void x(net.nj.f var1) {
      }

      private int j(List var1) {
         boolean var2 = false;
         int var3 = 0;

         for(e.j var5 : var1) {
            if(var5.f > 0 && var5.J < var5.f) {
               var2 = true;
            }

            var3 += var5.e;
         }

         return var3;
      }

      private e.b U(e.q var1, List var2, List var3, Random var4, int var5, int var6, int var7, aq var8, int var9) {
         p.d();
         int var11 = this.j(var2);
         boolean var12 = var11 > 0 && var9 <= 30;
         boolean var13 = false;
         return e.d.i(var3, var4, var5, var6, var7, var8, var9);
      }

      private p H(e.q var1, List var2, Random var3, int var4, int var5, int var6, @Nullable aq var7, int var8, boolean var9) {
         if(Math.abs(var4 - var1.J().i) <= 112 && Math.abs(var6 - var1.J().p) <= 112) {
            List var10 = var1.D;
            var10 = var1.m;
            e.b var11 = this.U(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
            var2.add(var11);
            var1.c.add(var11);
            return var11;
         } else {
            return e.d.i(var2, var3, var4, var5, var6, var7, var8);
         }
      }

      @Nullable
      protected p T(e.q var1, List var2, Random var3, int var4, int var5, boolean var6) {
         aq var7 = this.L();
         switch(null.O[var7.ordinal()]) {
         case 1:
            return this.H(var1, var2, var3, this.w.i + var4, this.w.D + var5, this.w.p - 1, var7, this.Q(), var6);
         case 2:
            return this.H(var1, var2, var3, this.w.i + var4, this.w.D + var5, this.w.J + 1, var7, this.Q(), var6);
         case 3:
            return this.H(var1, var2, var3, this.w.i - 1, this.w.D + var5, this.w.p + var4, var7, this.Q(), var6);
         case 4:
            return this.H(var1, var2, var3, this.w.e + 1, this.w.D + var5, this.w.p + var4, var7, this.Q(), var6);
         default:
            return null;
         }
      }

      @Nullable
      protected p I(e.q var1, List var2, Random var3, int var4, int var5, boolean var6) {
         aq var7 = this.L();
         switch(null.O[var7.ordinal()]) {
         case 1:
            return this.H(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q(), var6);
         case 2:
            return this.H(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q(), var6);
         case 3:
            return this.H(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q(), var6);
         case 4:
            return this.H(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q(), var6);
         default:
            return null;
         }
      }

      @Nullable
      protected p o(e.q var1, List var2, Random var3, int var4, int var5, boolean var6) {
         aq var7 = this.L();
         switch(null.O[var7.ordinal()]) {
         case 1:
            return this.H(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q(), var6);
         case 2:
            return this.H(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q(), var6);
         case 3:
            return this.H(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q(), var6);
         case 4:
            return this.H(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q(), var6);
         default:
            return null;
         }
      }

      protected static boolean z(v var0) {
         return var0.D > 10;
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class d extends e.b {
      private int R;

      public d() {
      }

      public d(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
         this.R = var2.nextInt();
      }

      public static e.d i(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
         return z(var7) && p.H(var0, var7) == null?new e.d(var6, var1, var7, var5):null;
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.R = var1.P("Seed");
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("Seed", this.R);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         Random var5 = new Random((long)this.R);
         p.d();
         int var6 = 0;
         int var7 = 3;
         int var8 = var5.nextInt(8);
         this.E(var1, var3, var6, var7, 0, var6, var7, var8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         ++var7;
         ++var6;
         var6 = var5.nextInt(8);
         this.E(var1, var3, 0, 5, 0, 0, 5, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         var6 = var5.nextInt(8);
         this.E(var1, var3, 4, 5, 0, 4, 5, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         var7 = 0;
         var8 = var5.nextInt(5);
         this.E(var1, var3, var7, 2, 0, var7, 2, var8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         ++var7;
         var7 = 0;
         var8 = 0;
         int var9 = var5.nextInt(3);
         this.E(var1, var3, var7, var8, 0, var7, var8, var9, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         ++var8;
         ++var7;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class g extends e.b {
      public g() {
      }

      public g(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 1, 3, false);
      }

      public static e.g V(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
         return z(var7) && p.H(var0, var7) == null?new e.g(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 3, 0, 4, 4, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 5, 0, 3, 7, 18, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 5, 0, 0, 5, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 5, 0, 4, 5, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 4, 2, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 0, 2, 13, 4, 2, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 0, 0, 4, 1, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 0, 15, 4, 1, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         this.X(var1, net.nb.f.Tb.p(), var5, -1, 18 - var6, var3);
         ++var6;
         ++var5;
         this.E(var1, var3, 0, 1, 1, 0, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 4, 0, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 14, 0, 4, 14, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 1, 17, 0, 4, 17, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 1, 1, 4, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 3, 4, 4, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 3, 14, 4, 4, 14, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 1, 17, 4, 4, 17, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class h extends e.b {
      public h() {
      }

      public h(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 5, 3, true);
      }

      public static e.h H(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
         return z(var7) && p.H(var0, var7) == null?new e.h(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 3, 0, 12, 4, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 0, 5, 0, 12, 13, 12, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 5, 0, 1, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 0, 12, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 11, 4, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 5, 11, 10, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 9, 11, 7, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 0, 4, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 5, 0, 10, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 9, 0, 7, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 11, 2, 10, 12, 10, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 8, 0, 7, 8, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         int var5 = 1;
         this.E(var1, var3, var5, 10, 0, var5, 11, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, var5, 10, 12, var5, 11, 12, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 10, var5, 0, 11, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 12, 10, var5, 12, 11, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.N(var1, net.nb.f.Tb.p(), var5, 13, 0, var3);
         this.N(var1, net.nb.f.Tb.p(), var5, 13, 12, var3);
         this.N(var1, net.nb.f.Tb.p(), 0, 13, var5, var3);
         this.N(var1, net.nb.f.Tb.p(), 12, 13, var5, var3);
         this.N(var1, net.nb.f.Tx.p(), var5 + 1, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), var5 + 1, 13, 12, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, var5 + 1, var3);
         this.N(var1, net.nb.f.Tx.p(), 12, 13, var5 + 1, var3);
         var5 = var5 + 2;
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 12, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), 12, 13, 0, var3);
         var5 = 3;
         this.E(var1, var3, 1, 7, var5, 1, 8, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 11, 7, var5, 11, 8, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         var5 = var5 + 2;
         this.E(var1, var3, 4, 2, 0, 8, 2, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 4, 12, 2, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 0, 0, 8, 1, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 0, 9, 8, 1, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 0, 4, 3, 1, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 9, 0, 4, 12, 1, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         var5 = 4;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         this.X(var1, net.nb.f.Tb.p(), var5, -1, 12 - var6, var3);
         ++var6;
         ++var5;
         var5 = 0;
         var6 = 4;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         this.X(var1, net.nb.f.Tb.p(), 12 - var5, -1, var6, var3);
         ++var6;
         ++var5;
         this.E(var1, var3, 5, 5, 5, 7, 5, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 1, 6, 6, 4, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, net.nb.f.Tb.p(), 6, 0, 6, var3);
         net.yw.n var14 = net.nb.f.dj.p();
         this.N(var1, var14, 6, 5, 6, var3);
         net.u.j var18 = new net.u.j(this.g(6, 6), this.Z(5), this.w(6, 6));
         if(var3.Y(var18)) {
            var1.L(var18, var14, var2);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class i extends e.b {
      public i() {
      }

      public i(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 1, 0, true);
      }

      public static e.i T(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
         return z(var7) && p.H(var0, var7) == null?new e.i(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 4, 1, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 4, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 2, 0, 0, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 2, 0, 4, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 3, 1, 0, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 3, 0, 4, 3, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         p.d();
         this.E(var1, var3, 4, 3, 1, 4, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 3, 3, 4, 4, 3, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 6, 0, 4, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class j {
      public Class c;
      public final int e;
      public int J;
      public int f;
      public boolean Y;

      public j(Class var1, int var2, int var3, boolean var4) {
         this.c = var1;
         this.e = var2;
         this.f = var3;
         this.Y = var4;
      }

      public j(Class var1, int var2, int var3) {
         this(var1, var2, var3, false);
      }

      public boolean N(int var1) {
         int[] var2 = p.d();
         return this.f == 0 || this.J < this.f;
      }

      public boolean s() {
         int[] var1 = p.d();
         return this.f == 0 || this.J < this.f;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class k extends e.b {
      public k() {
      }

      public k(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      protected k(Random var1, int var2, int var3) {
         super(0);
         this.n(aq.u.HORIZONTAL.N(var1));
         if(this.L().r() == aq.l.Z) {
            this.w = new v(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
         } else {
            this.w = new v(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
         }

      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 8, 3, false);
         this.I((e.q)var1, var2, var3, 3, 8, false);
         this.o((e.q)var1, var2, var3, 3, 8, false);
      }

      public static e.k C(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
         return z(var7) && p.H(var0, var7) == null?new e.k(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 7, 3, 0, 11, 4, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 3, 7, 18, 4, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 5, 0, 10, 7, 18, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 5, 8, 18, 7, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 7, 5, 0, 7, 5, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 7, 5, 11, 7, 5, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 0, 11, 5, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 11, 11, 5, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 5, 7, 7, 5, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 7, 18, 5, 7, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 5, 11, 7, 5, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 11, 18, 5, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 7, 2, 0, 11, 2, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 7, 2, 13, 11, 2, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 7, 0, 0, 11, 1, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 7, 0, 15, 11, 1, 18, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 7;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         this.X(var1, net.nb.f.Tb.p(), var5, -1, 18 - var6, var3);
         ++var6;
         ++var5;
         this.E(var1, var3, 0, 2, 7, 5, 2, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 13, 2, 7, 18, 2, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 0, 7, 3, 1, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 15, 0, 7, 18, 1, 11, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         var5 = 0;
         var6 = 7;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         this.X(var1, net.nb.f.Tb.p(), 18 - var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class n extends e.b {
      private boolean K;

      public n() {
      }

      public n(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
         this.K = var2.nextInt(3) == 0;
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.K = var1.i("Chest");
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Chest", this.K);
      }

      public void S(p var1, List var2, Random var3) {
         this.o((e.q)var1, var2, var3, 0, 1, true);
      }

      public static e.n o(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
         return z(var7) && p.H(var0, var7) == null?new e.n(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 4, 1, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 0, 2, 0, 4, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 2, 0, 0, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 3, 1, 0, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 3, 0, 4, 3, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 2, 0, 4, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 2, 4, 4, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 3, 4, 1, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 3, 3, 4, 3, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tb.p(), false);
         if(this.K && var3.Y(new net.u.j(this.g(1, 3), this.Z(2), this.w(1, 3)))) {
            this.K = false;
            this.Y(var1, var3, var2, 1, 2, 3, net.y7.p.Q);
         }

         this.E(var1, var3, 0, 6, 0, 4, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class o extends e.b {
      public o() {
      }

      public o(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 1, 0, true);
      }

      public static e.o i(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
         return z(var7) && p.H(var0, var7) == null?new e.o(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         p.d();
         net.yw.n var5 = net.nb.f.uk.p().s(l_.F, aq.SOUTH);
         int var6 = 0;
         int var7 = Math.max(1, 7 - var6);
         int var8 = Math.min(Math.max(var7 + 5, 14 - var6), 13);
         this.E(var1, var3, 0, 0, var6, 4, var7, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, var7 + 1, var6, 3, var8 - 1, var6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, var5, 1, var7 + 1, var6, var3);
         this.N(var1, var5, 2, var7 + 1, var6, var3);
         this.N(var1, var5, 3, var7 + 1, var6, var3);
         this.E(var1, var3, 0, var8, var6, 4, var8, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, var7 + 1, var6, 0, var8 - 1, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, var7 + 1, var6, 4, var8 - 1, var6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var10000 = var6 & 1;
         this.E(var1, var3, 0, var7 + 2, var6, 0, var7 + 3, var6, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, var7 + 2, var6, 4, var7 + 3, var6, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         int var10 = 0;
         this.X(var1, net.nb.f.Tb.p(), var10, -1, var6, var3);
         ++var10;
         ++var6;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class q extends e.k {
      public e.j N;
      public List D;
      public List m;
      public List c;

      public q() {
         this.c = Lists.newArrayList();
      }

      public q(Random var1, int var2, int var3) {
         super(var1, var2, var3);
         p.d();
         this.c = Lists.newArrayList();
         this.D = Lists.newArrayList();
         e.j[] var5 = e.C;
         int var6 = var5.length;
         int var7 = 0;
         if(var7 < var6) {
            e.j var8 = var5[var7];
            var8.J = 0;
            this.D.add(var8);
            ++var7;
         }

         this.m = Lists.newArrayList();
         var5 = e.a;
         var6 = var5.length;
         var7 = 0;
         if(var7 < var6) {
            e.j var14 = var5[var7];
            var14.J = 0;
            this.m.add(var14);
            ++var7;
         }

      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   public static class r extends e.b {
      public r() {
      }

      public r(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 5, 3, true);
         this.T((e.q)var1, var2, var3, 5, 11, true);
      }

      public static e.r v(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
         return z(var7) && p.H(var0, var7) == null?new e.r(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 3, 0, 12, 4, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 0, 5, 0, 12, 13, 12, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 5, 0, 1, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 11, 5, 0, 12, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 11, 4, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 5, 11, 10, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 9, 11, 7, 12, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 0, 4, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 5, 0, 10, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 9, 0, 7, 12, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 11, 2, 10, 12, 10, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 1;
         this.E(var1, var3, var5, 10, 0, var5, 11, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, var5, 10, 12, var5, 11, 12, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 10, var5, 0, 11, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 12, 10, var5, 12, 11, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.N(var1, net.nb.f.Tb.p(), var5, 13, 0, var3);
         this.N(var1, net.nb.f.Tb.p(), var5, 13, 12, var3);
         this.N(var1, net.nb.f.Tb.p(), 0, 13, var5, var3);
         this.N(var1, net.nb.f.Tb.p(), 12, 13, var5, var3);
         this.N(var1, net.nb.f.Tx.p(), var5 + 1, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), var5 + 1, 13, 12, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, var5 + 1, var3);
         this.N(var1, net.nb.f.Tx.p(), 12, 13, var5 + 1, var3);
         var5 = var5 + 2;
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 12, var3);
         this.N(var1, net.nb.f.Tx.p(), 0, 13, 0, var3);
         this.N(var1, net.nb.f.Tx.p(), 12, 13, 0, var3);
         var5 = 3;
         this.E(var1, var3, 1, 7, var5, 1, 8, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 11, 7, var5, 11, 8, var5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         var5 = var5 + 2;
         net.yw.n var13 = net.nb.f.uk.p().s(l_.F, aq.NORTH);
         int var6 = 0;
         int var7 = var6 + 4;
         int var8 = 5;
         this.N(var1, var13, var8, 5 + var6, var7, var3);
         ++var8;
         ++var6;
         var6 = 5;
         this.N(var1, var13, var6, 12, 11, var3);
         ++var6;
         this.E(var1, var3, 5, 6, 7, 5, 7, 7, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 7, 6, 7, 7, 7, 7, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 5, 13, 12, 7, 13, 12, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 5, 2, 3, 5, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 9, 3, 5, 10, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 4, 2, 5, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 9, 5, 2, 10, 5, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 9, 5, 9, 10, 5, 10, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 10, 5, 4, 10, 5, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         net.yw.n var17 = var13.s(l_.F, aq.EAST);
         net.yw.n var18 = var13.s(l_.F, aq.WEST);
         this.N(var1, var18, 4, 5, 2, var3);
         this.N(var1, var18, 4, 5, 3, var3);
         this.N(var1, var18, 4, 5, 9, var3);
         this.N(var1, var18, 4, 5, 10, var3);
         this.N(var1, var17, 8, 5, 2, var3);
         this.N(var1, var17, 8, 5, 3, var3);
         this.N(var1, var17, 8, 5, 9, var3);
         this.N(var1, var17, 8, 5, 10, var3);
         this.E(var1, var3, 3, 4, 4, 4, 4, 8, net.nb.f.u9.p(), net.nb.f.u9.p(), false);
         this.E(var1, var3, 8, 4, 4, 9, 4, 8, net.nb.f.u9.p(), net.nb.f.u9.p(), false);
         this.E(var1, var3, 3, 5, 4, 4, 5, 8, net.nb.f.dP.p(), net.nb.f.dP.p(), false);
         this.E(var1, var3, 8, 5, 4, 9, 5, 8, net.nb.f.dP.p(), net.nb.f.dP.p(), false);
         this.E(var1, var3, 4, 2, 0, 8, 2, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 4, 12, 2, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 0, 0, 8, 1, 3, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 0, 9, 8, 1, 12, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 0, 4, 3, 1, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 9, 0, 4, 12, 1, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         var8 = 4;
         int var9 = 0;
         this.X(var1, net.nb.f.Tb.p(), var8, -1, var9, var3);
         this.X(var1, net.nb.f.Tb.p(), var8, -1, 12 - var9, var3);
         ++var9;
         ++var8;
         var8 = 0;
         var9 = 4;
         this.X(var1, net.nb.f.Tb.p(), var8, -1, var9, var3);
         this.X(var1, net.nb.f.Tb.p(), 12 - var8, -1, var9, var3);
         ++var9;
         ++var8;
         if(net.u.d.y() == null) {
            p.u(new int[2]);
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class t extends e.b {
      public t() {
      }

      public t(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         byte var4 = 1;
         aq var5 = this.L();
         if(var5 == aq.WEST || var5 == aq.NORTH) {
            var4 = 5;
         }

         this.I((e.q)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
         this.o((e.q)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
      }

      public static e.t T(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
         return z(var7) && p.H(var0, var7) == null?new e.t(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 8, 1, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 8, 5, 8, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 6, 0, 8, 6, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 2, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 2, 0, 8, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 3, 0, 1, 4, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 7, 3, 0, 7, 4, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 2, 4, 8, 2, 8, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 1, 4, 2, 2, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 6, 1, 4, 7, 2, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 3, 8, 8, 3, 8, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 6, 0, 3, 7, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         p.d();
         this.E(var1, var3, 8, 3, 6, 8, 3, 7, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 3, 4, 0, 5, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 8, 3, 4, 8, 5, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 3, 5, 2, 5, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 3, 5, 7, 5, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 4, 5, 1, 5, 5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 7, 4, 5, 7, 5, 5, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var6, -1, var5, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class w extends e.b {
      public w() {
      }

      public w(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.o((e.q)var1, var2, var3, 6, 2, false);
      }

      public static e.w b(List var0, Random var1, int var2, int var3, int var4, int var5, aq var6) {
         v var7 = v.V(var2, var3, var4, -2, 0, 0, 7, 11, 7, var6);
         return z(var7) && p.H(var0, var7) == null?new e.w(var5, var1, var7, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 6, 1, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 6, 10, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 2, 0, 1, 8, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 2, 0, 6, 8, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 1, 0, 8, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 6, 2, 1, 6, 8, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 2, 6, 5, 8, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 3, 2, 0, 5, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 6, 3, 2, 6, 5, 2, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 6, 3, 4, 6, 5, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.N(var1, net.nb.f.Tb.p(), 5, 2, 5, var3);
         this.E(var1, var3, 4, 2, 5, 4, 3, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 3, 2, 5, 3, 4, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 2, 5, 2, 5, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 2, 5, 1, 6, 5, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 7, 1, 5, 7, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 8, 2, 6, 8, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 6, 0, 4, 8, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 0, 4, 5, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class x extends e.b {
      public x() {
      }

      public x(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 1, 0, true);
         this.I((e.q)var1, var2, var3, 0, 1, true);
         this.o((e.q)var1, var2, var3, 0, 1, true);
      }

      public static e.x U(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
         return z(var7) && p.H(var0, var7) == null?new e.x(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 4, 1, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 4, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 2, 0, 0, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 2, 0, 4, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 0, 2, 4, 0, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 2, 4, 4, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 6, 0, 4, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class y extends e.b {
      public y() {
      }

      public y(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.T((e.q)var1, var2, var3, 2, 0, false);
         this.I((e.q)var1, var2, var3, 0, 2, false);
         this.o((e.q)var1, var2, var3, 0, 2, false);
      }

      public static e.y Q(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -2, 0, 0, 7, 9, 7, var5);
         return z(var7) && p.H(var0, var7) == null?new e.y(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         this.E(var1, var3, 0, 0, 0, 6, 1, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 6, 7, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 2, 0, 1, 6, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 6, 1, 6, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         p.d();
         this.E(var1, var3, 5, 2, 0, 6, 6, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 5, 2, 6, 6, 6, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 0, 6, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 5, 0, 6, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 2, 0, 6, 6, 1, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 2, 5, 6, 6, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 6, 0, 4, 6, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 0, 4, 5, 0, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 2, 6, 6, 4, 6, 6, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 2, 5, 6, 4, 5, 6, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 6, 2, 0, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 5, 2, 0, 5, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 6, 6, 2, 6, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 6, 5, 2, 6, 5, 4, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends e.b {
      private boolean D;

      public z() {
      }

      public z(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
         this.D = var2.nextInt(3) == 0;
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.D = var1.i("Chest");
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Chest", this.D);
      }

      public void S(p var1, List var2, Random var3) {
         this.I((e.q)var1, var2, var3, 0, 1, true);
      }

      public static e.z c(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
         return z(var7) && p.H(var0, var7) == null?new e.z(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         p.d();
         this.E(var1, var3, 0, 0, 0, 4, 1, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 0, 4, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 4, 2, 0, 4, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 4, 3, 1, 4, 4, 1, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 4, 3, 3, 4, 4, 3, net.nb.f.Tx.p(), net.nb.f.Tx.p(), false);
         this.E(var1, var3, 0, 2, 0, 0, 5, 0, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 0, 2, 4, 3, 5, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 1, 3, 4, 1, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tb.p(), false);
         this.E(var1, var3, 3, 3, 4, 3, 4, 4, net.nb.f.Tx.p(), net.nb.f.Tb.p(), false);
         if(this.D && var3.Y(new net.u.j(this.g(3, 3), this.Z(2), this.w(3, 3)))) {
            this.D = false;
            this.Y(var1, var3, var2, 3, 2, 3, net.y7.p.Q);
         }

         this.E(var1, var3, 0, 6, 0, 4, 6, 4, net.nb.f.Tb.p(), net.nb.f.Tb.p(), false);
         int var5 = 0;
         int var6 = 0;
         this.X(var1, net.nb.f.Tb.p(), var5, -1, var6, var3);
         ++var6;
         ++var5;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
