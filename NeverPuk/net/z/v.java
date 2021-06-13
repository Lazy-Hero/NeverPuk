package net.z;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.yz.a4;
import net.z.g;
import net.z.m;
import net.z.t3;
import net.z.t_;
import net.z.tj;
import net.z.tu;
import net.z.wd;

public class v extends net.z.z {
   private final List L = Lists.newArrayList();
   private final a4 o = new a4();
   private final List f = Lists.newArrayList();
   private final v.f[][] M;
   private int S;
   private final v.e h;
   private g r;

   public v(net.nn.j var1, int var2, int var3, int var4, int var5, int var6, v.e var7, v.f[]... var8) {
      super(var1, var2, var3, var4, var5, var6);
      this.h = var7;
      this.M = var8;
      this.K = false;
      this.M();
      this.i();
   }

   private void M() {
      for(v.f[] var4 : this.M) {
         for(int var5 = 0; var5 < var4.length; var5 += 2) {
            v.f var6 = var4[var5];
            v.f var7 = var5 < var4.length - 1?var4[var5 + 1]:null;
            g var8 = this.g(var6, 0, true);
            g var9 = this.g(var7, 160, true);
            v.c var10 = new v.c(var8, var9);
            this.L.add(var10);
            this.o.t(var6.R(), var8);
            if(var8 instanceof wd) {
               this.f.add((wd)var8);
            }

            this.o.t(var7.R(), var9);
            if(var9 instanceof wd) {
               this.f.add((wd)var9);
            }
         }
      }

   }

   private void i() {
      this.L.clear();

      for(int var1 = 0; var1 < this.M[this.S].length; var1 += 2) {
         v.f var2 = this.M[this.S][var1];
         v.f var3 = var1 < this.M[this.S].length - 1?this.M[this.S][var1 + 1]:null;
         g var4 = (g)this.o.b(var2.R());
         g var5 = (g)this.o.b(var3.R());
         v.c var6 = new v.c(var4, var5);
         this.L.add(var6);
      }

   }

   public void r(int var1) {
      if(var1 != this.S) {
         int var2 = this.S;
         this.S = var1;
         this.i();
         this.l(var2, var1);
         this.g = 0.0F;
      }

   }

   public int D() {
      return this.S;
   }

   public int O() {
      return this.M.length;
   }

   public g C() {
      return this.r;
   }

   public void r() {
      if(this.S > 0) {
         this.r(this.S - 1);
      }

   }

   public void J() {
      if(this.S < this.M.length - 1) {
         this.r(this.S + 1);
      }

   }

   public g z(int var1) {
      return (g)this.o.b(var1);
   }

   private void l(int var1, int var2) {
      for(v.f var6 : this.M[var1]) {
         this.P((g)this.o.b(var6.R()), false);
      }

      for(v.f var10 : this.M[var2]) {
         this.P((g)this.o.b(var10.R()), true);
      }

   }

   private void P(g var1, boolean var2) {
      if(var1 instanceof m) {
         ((m)var1).F = var2;
      } else if(var1 instanceof wd) {
         ((wd)var1).l(var2);
      } else if(var1 instanceof t_) {
         ((t_)var1).T = var2;
      }

   }

   @Nullable
   private g g(@Nullable v.f var1, int var2, boolean var3) {
      return (g)(var1 instanceof v.k?this.l(this.x / 2 - 155 + var2, 0, (v.k)var1):(var1 instanceof v.i?this.w(this.x / 2 - 155 + var2, 0, (v.i)var1):(var1 instanceof v.b?this.d(this.x / 2 - 155 + var2, 0, (v.b)var1):(var1 instanceof v.w?this.q(this.x / 2 - 155 + var2, 0, (v.w)var1, var3):null))));
   }

   public void c(boolean var1) {
      for(v.c var3 : this.L) {
         if(var3.z instanceof m) {
            ((m)var3.z).O = var1;
         }

         if(var3.I instanceof m) {
            ((m)var3.I).O = var1;
         }
      }

   }

   public boolean x(int var1, int var2, int var3) {
      boolean var4 = super.x(var1, var2, var3);
      int var5 = this.p(var1, var2);
      v.c var6 = this.V(var5);
      if(this.r != var6.A && this.r != null && this.r instanceof wd) {
         ((wd)this.r).n(false);
      }

      this.r = var6.A;
      return var4;
   }

   private t3 l(int var1, int var2, v.k var3) {
      t3 var4 = new t3(this.h, var3.R(), var1, var2, var3.S(), var3.U(), var3.N(), var3.h(), var3.z());
      var4.F = var3.r();
      return var4;
   }

   private tj w(int var1, int var2, v.i var3) {
      tj var4 = new tj(this.h, var3.R(), var1, var2, var3.S(), var3.j());
      var4.F = var3.r();
      return var4;
   }

   private wd d(int var1, int var2, v.b var3) {
      wd var4 = new wd(var3.R(), this.s.sO, var1, var2, 150, 20);
      var4.u(var3.S());
      var4.i(this.h);
      var4.l(var3.r());
      var4.n(var3.d());
      return var4;
   }

   private t_ q(int var1, int var2, v.w var3, boolean var4) {
      t_ var5 = new t_(this.s.sO, var3.R(), var1, var2, this.x - var1 * 2, 20, -1);
      var5.T = var3.r();
      var5.U(var3.S());
      var5.B();
      return var5;
   }

   public void s(char var1, int var2) {
      boolean var3 = g.B();
      if(this.r instanceof wd) {
         wd var4 = (wd)this.r;
         if(!tu.L(var2)) {
            if(var2 == 15) {
               var4.n(false);
               int var5 = this.f.indexOf(this.r);
               if(tu.s()) {
                  if(var5 == 0) {
                     var5 = this.f.size() - 1;
                  }

                  --var5;
               }

               if(var5 == this.f.size() - 1) {
                  var5 = 0;
               }

               ++var5;
               this.r = (g)this.f.get(var5);
               var4 = (wd)this.r;
               var4.n(true);
               int var6 = var4.Q + this.E;
               int var7 = var4.Q;
               if(var6 > this.G) {
                  this.g += (float)(var6 - this.G);
               }

               if(var7 < this.a) {
                  this.g = (float)var7;
               }
            }

            var4.l(var1, var2);
         }

         String var15 = tu.s();
         String[] var16 = var15.split(";");
         int var17 = this.f.indexOf(this.r);
         int var8 = var17;
         int var10 = var16.length;
         int var11 = 0;
         if(var11 < var10) {
            String var12 = var16[var11];
            wd var13 = (wd)this.f.get(var17);
            var13.u(var12);
            var13.y(var13.H(), var12);
            if(var17 == this.f.size() - 1) {
               var8 = 0;
            }

            ++var8;
            if(var8 == var17) {
               ;
            }

            ++var11;
         }
      }

   }

   public v.c V(int var1) {
      return (v.c)this.L.get(var1);
   }

   public int V() {
      return this.L.size();
   }

   public int C() {
      return 400;
   }

   protected int I() {
      return super.I() + 32;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b extends v.f {
      private final Predicate A;

      public b(int var1, String var2, boolean var3, Predicate var4) {
         super(var1, var2, var3);
         this.A = (Predicate)MoreObjects.firstNonNull(var4, Predicates.alwaysTrue());
      }

      public Predicate d() {
         return this.A;
      }
   }

   public static class c implements net.z.z {
      private final net.nn.j o = net.nn.j.b();
      private final g z;
      private final g I;
      private g A;

      public c(@Nullable g var1, @Nullable g var2) {
         this.z = var1;
         this.I = var2;
      }

      public g e() {
         return this.z;
      }

      public g O() {
         return this.I;
      }

      public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
         this.K(this.z, var3, var6, var7, false, var9);
         this.K(this.I, var3, var6, var7, false, var9);
      }

      private void K(g var1, int var2, int var3, int var4, boolean var5, float var6) {
         boolean var7 = g.C();
         if(var1 != null) {
            if(var1 instanceof m) {
               this.F((m)var1, var2, var3, var4, var5, var6);
            }

            if(var1 instanceof wd) {
               this.Y((wd)var1, var2, var5);
            }

            if(var1 instanceof t_) {
               this.o((t_)var1, var2, var3, var4, var5);
            }
         }

      }

      private void F(m var1, int var2, int var3, int var4, boolean var5, float var6) {
         var1.R = var2;
         var1.Z(this.o, var3, var4, var6);
      }

      private void Y(wd var1, int var2, boolean var3) {
         var1.Q = var2;
         var1.Z();
      }

      private void o(t_ var1, int var2, int var3, int var4, boolean var5) {
         var1.u = var2;
         var1.r(this.o, var3, var4);
      }

      public void h(int var1, int var2, int var3, float var4) {
         this.K(this.z, var3, 0, 0, true, var4);
         this.K(this.I, var3, 0, 0, true, var4);
      }

      public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
         boolean var7 = this.h(this.z, var2, var3, var4);
         boolean var8 = this.h(this.I, var2, var3, var4);
         return true;
      }

      private boolean h(g var1, int var2, int var3, int var4) {
         return false;
      }

      private boolean L(m var1, int var2, int var3, int var4) {
         boolean var5 = var1.X(this.o, var2, var3);
         this.A = var1;
         return var5;
      }

      private void n(wd var1, int var2, int var3, int var4) {
         var1.N(var2, var3, var4);
         if(var1.Y()) {
            this.A = var1;
         }

      }

      public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
         this.e(this.z, var2, var3, var4);
         this.e(this.I, var2, var3, var4);
      }

      private void e(g var1, int var2, int var3, int var4) {
         if(var1 instanceof m) {
            this.Q((m)var1, var2, var3, var4);
         }

      }

      private void Q(m var1, int var2, int var3, int var4) {
         var1.A(var2, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public interface e {
      void n(int var1, boolean var2);

      void t(int var1, float var2);

      void T(int var1, String var2);
   }

   public static class f {
      private final int T;
      private final String O;
      private final boolean M;

      public f(int var1, String var2, boolean var3) {
         this.T = var1;
         this.O = var2;
         this.M = var3;
      }

      public int R() {
         return this.T;
      }

      public String S() {
         return this.O;
      }

      public boolean r() {
         return this.M;
      }
   }

   public static class i extends v.f {
      private final boolean Q;

      public i(int var1, String var2, boolean var3, boolean var4) {
         super(var1, var2, var3);
         this.Q = var4;
      }

      public boolean j() {
         return this.Q;
      }
   }

   public static class k extends v.f {
      private final t3.o b;
      private final float e;
      private final float l;
      private final float k;

      public k(int var1, String var2, boolean var3, t3.o var4, float var5, float var6, float var7) {
         super(var1, var2, var3);
         this.b = var4;
         this.e = var5;
         this.l = var6;
         this.k = var7;
      }

      public t3.o z() {
         return this.b;
      }

      public float U() {
         return this.e;
      }

      public float N() {
         return this.l;
      }

      public float h() {
         return this.k;
      }
   }

   public static class w extends v.f {
      public w(int var1, String var2, boolean var3) {
         super(var1, var2, var3);
      }
   }
}
