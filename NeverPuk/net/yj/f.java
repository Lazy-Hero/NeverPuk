package net.yj;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.c0.d;
import net.c0.q;
import net.ni.sl;
import net.ni.v;
import net.nj.h;
import net.nj.u;
import net.nl.z1;
import net.u.j;
import net.y9.l;
import net.yj.w;
import net.yj.y;
import net.yw.n;
import net.yz.a9;
import net.yz.ax;

public class f {
   private final List f = Lists.newArrayList();
   private final List y = Lists.newArrayList();
   private j c = j.V;
   private String w = "?";
   private static int X;

   public j a() {
      return this.c;
   }

   public void p(String var1) {
      this.w = var1;
   }

   public String B() {
      return this.w;
   }

   public void t(net.yv.r var1, j var2, j var3, boolean var4, @Nullable l var5) {
      if(var3.t() >= 1 && var3.h() >= 1 && var3.y() >= 1) {
         j var6 = var2.z(var3).F(-1, -1, -1);
         ArrayList var7 = Lists.newArrayList();
         ArrayList var8 = Lists.newArrayList();
         ArrayList var9 = Lists.newArrayList();
         j var10 = new j(Math.min(var2.t(), var6.t()), Math.min(var2.h(), var6.h()), Math.min(var2.y(), var6.y()));
         j var11 = new j(Math.max(var2.t(), var6.t()), Math.max(var2.h(), var6.h()), Math.max(var2.y(), var6.y()));
         this.c = var3;

         for(j.v var13 : j.X(var10, var11)) {
            j var14 = var13.m(var10);
            n var15 = var1.Z(var13);
            if(var5 != var15.Q()) {
               v var16 = var1.L(var13);
               net.nj.f var17 = var16.b(new net.nj.f());
               var17.A("x");
               var17.A("y");
               var17.A("z");
               var8.add(new f.k(var14, var15, var17));
            }
         }

         this.f.clear();
         this.f.addAll(var7);
         this.f.addAll(var8);
         this.f.addAll(var9);
         this.D(var1, var10, var11.F(1, 1, 1));
      }

   }

   private void D(net.yv.r var1, j var2, j var3) {
      List var4 = var1.L(net.ne.l.class, new net.u.e(var2, var3), new Predicate() {
         public boolean a(@Nullable net.ne.l var1) {
            int var2 = f.W();
            return !(var1 instanceof net.r.r);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.y.clear();

      for(net.ne.l var6 : var4) {
         net.u.r var7 = new net.u.r(var6.b - (double)var2.t(), var6.hS - (double)var2.h(), var6.hr - (double)var2.y());
         net.nj.f var8 = new net.nj.f();
         var6.d(var8);
         j var9;
         if(var6 instanceof net.nm.l) {
            var9 = ((net.nm.l)var6).r().m(var2);
         } else {
            var9 = new j(var7);
         }

         this.y.add(new f.o(var7, var9, var8));
      }

   }

   public Map U(j var1, y var2) {
      HashMap var3 = Maps.newHashMap();
      net.y4.v var4 = var2.t();

      for(f.k var6 : this.f) {
         j var7 = M(var2, var6.n).z(var1);
         if(var4.Y(var7)) {
            n var8 = var6.X;
            if(var8.Q() == net.nb.f.TJ && var6.i != null) {
               sl.s var9 = sl.s.valueOf(var6.i.J("mode"));
               if(var9 == sl.s.DATA) {
                  var3.put(var7, var6.i.J("metadata"));
               }
            }
         }
      }

      return var3;
   }

   public j W(y var1, j var2, y var3, j var4) {
      j var5 = M(var1, var2);
      j var6 = M(var3, var4);
      return var5.m(var6);
   }

   public static j M(y var0, j var1) {
      return T(var1, var0.O(), var0.L());
   }

   public void Y(net.yv.r var1, j var2, y var3) {
      var3.U();
      this.P(var1, var2, var3);
   }

   public void P(net.yv.r var1, j var2, y var3) {
      this.b(var1, var2, new net.yj.z(var2, var3), var3, 2);
   }

   public void b(net.yv.r var1, j var2, y var3, int var4) {
      this.b(var1, var2, new net.yj.z(var2, var3), var3, var4);
   }

   public void b(net.yv.r var1, j var2, @Nullable w var3, y var4, int var5) {
      int var6 = b();
      if((!this.f.isEmpty() || !var4.a() && !this.y.isEmpty()) && this.c.t() >= 1 && this.c.h() >= 1 && this.c.y() >= 1) {
         l var7 = var4.d();
         net.y4.v var8 = var4.t();
         Iterator var9 = this.f.iterator();
         if(var9.hasNext()) {
            f.k var10 = (f.k)var9.next();
            j var11 = M(var4, var10.n).z(var2);
            f.k var12 = var3 != null?var3.R(var1, var11, var10):var10;
            if(var12 != null) {
               l var13 = var12.X.Q();
               if((var7 == null || var7 != var13) && (!var4.Y() || var13 != net.nb.f.TJ) && (var8 == null || var8.Y(var11))) {
                  n var14 = var12.X.f(var4.O());
                  n var15 = var14.b(var4.L());
                  if(var12.i != null) {
                     v var16 = var1.L(var11);
                     if(var16 instanceof z1) {
                        ((z1)var16).T();
                     }

                     var1.k(var11, net.nb.f.dr.p(), 4);
                  }

                  if(var1.k(var11, var15, var5) && var12.i != null) {
                     v var21 = var1.L(var11);
                     if(var21 != null) {
                        var12.i.r("x", var11.t());
                        var12.i.r("y", var11.h());
                        var12.i.r("z", var11.y());
                        var21.G(var12.i);
                        var21.w(var4.O());
                        var21.v(var4.L());
                     }
                  }
               }
            }
         }

         var9 = this.f.iterator();
         if(var9.hasNext()) {
            f.k var18 = (f.k)var9.next();
            if(var7 == null || var7 != var18.X.Q()) {
               j var19 = M(var4, var18.n).z(var2);
               if(var8.Y(var19)) {
                  var1.c(var19, var18.X.Q(), false);
                  if(var18.i != null) {
                     v var20 = var1.L(var19);
                     if(var20 != null) {
                        var20.W();
                     }
                  }
               }
            }
         }

         if(!var4.a()) {
            this.Q(var1, var2, var4.O(), var4.L(), var8);
         }
      }

   }

   private void Q(net.yv.r var1, j var2, ax var3, net.yz.l var4, @Nullable net.y4.v var5) {
      for(f.o var7 : this.y) {
         j var8 = T(var7.E, var3, var4).z(var2);
         if(var5.Y(var8)) {
            net.nj.f var9 = var7.Y;
            net.u.r var10 = X(var7.k, var3, var4);
            net.u.r var11 = var10.s((double)var2.t(), (double)var2.h(), (double)var2.y());
            h var12 = new h();
            var12.m(new net.nj.v(var11.p));
            var12.m(new net.nj.v(var11.H));
            var12.m(new net.nj.v(var11.a));
            var9.K("Pos", var12);
            var9.h("UUID", UUID.randomUUID());
            net.ne.l var13 = net.ne.v.K(var9, var1);
            float var14 = var13.r(var3);
            var14 = var14 + (var13.hN - var13.q(var4));
            var13.S(var11.p, var11.H, var11.a, var14, var13.V);
            var1.S(var13);
         }
      }

   }

   public j e(net.yz.l var1) {
      switch(null.D[var1.ordinal()]) {
      case 1:
      case 2:
         return new j(this.c.y(), this.c.h(), this.c.t());
      default:
         return this.c;
      }
   }

   private static j T(j var0, ax var1, net.yz.l var2) {
      int var3 = var0.t();
      int var4 = var0.h();
      int var5 = var0.y();
      boolean var6 = true;
      switch(null.z[var1.ordinal()]) {
      case 1:
         var5 = -var5;
         break;
      case 2:
         var3 = -var3;
         break;
      default:
         var6 = false;
      }

      switch(null.D[var2.ordinal()]) {
      case 1:
         return new j(var5, var4, -var3);
      case 2:
         return new j(-var5, var4, var3);
      case 3:
         return new j(-var3, var4, -var5);
      default:
         return new j(var3, var4, var5);
      }
   }

   private static net.u.r X(net.u.r var0, ax var1, net.yz.l var2) {
      double var3 = var0.p;
      double var5 = var0.H;
      double var7 = var0.a;
      boolean var9 = true;
      switch(null.z[var1.ordinal()]) {
      case 1:
         var7 = 1.0D - var7;
         break;
      case 2:
         var3 = 1.0D - var3;
         break;
      default:
         var9 = false;
      }

      switch(null.D[var2.ordinal()]) {
      case 1:
         return new net.u.r(var7, var5, 1.0D - var3);
      case 2:
         return new net.u.r(1.0D - var7, var5, var3);
      case 3:
         return new net.u.r(1.0D - var3, var5, 1.0D - var7);
      default:
         return new net.u.r(var3, var5, var7);
      }
   }

   public j J(j var1, ax var2, net.yz.l var3) {
      return d(var1, var2, var3, this.a().t(), this.a().y());
   }

   public static j d(j var0, ax var1, net.yz.l var2, int var3, int var4) {
      --var3;
      --var4;
      int var5 = var1 == ax.FRONT_BACK?var3:0;
      int var6 = var1 == ax.LEFT_RIGHT?var4:0;
      j var7 = var0;
      switch(null.D[var2.ordinal()]) {
      case 1:
         var7 = var0.F(var6, 0, var3 - var5);
         break;
      case 2:
         var7 = var0.F(var4 - var6, 0, var5);
         break;
      case 3:
         var7 = var0.F(var3 - var5, 0, var4 - var6);
         break;
      case 4:
         var7 = var0.F(var5, 0, var6);
      }

      return var7;
   }

   public static void p(d var0) {
      var0.U(q.STRUCTURE, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            int var4 = f.W();
            if(var2.K("entities", 9)) {
               h var5 = var2.A("entities", 10);
               int var6 = 0;
               if(var6 < var5.z()) {
                  net.nj.f var7 = (net.nj.f)var5.h(var6);
                  if(var7.K("nbt", 10)) {
                     var7.K("nbt", var1.w(q.ENTITY, var7.o("nbt"), var3));
                  }

                  ++var6;
               }
            }

            if(var2.K("blocks", 9)) {
               h var8 = var2.A("blocks", 10);
               int var10 = 0;
               if(var10 < var8.z()) {
                  net.nj.f var12 = (net.nj.f)var8.h(var10);
                  if(var12.K("nbt", 10)) {
                     var12.K("nbt", var1.w(q.BLOCK_ENTITY, var12.o("nbt"), var3));
                  }

                  ++var10;
               }
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public net.nj.f Z(net.nj.f var1) {
      f.r var2 = new f.r();
      h var3 = new h();

      for(f.k var5 : this.f) {
         net.nj.f var6 = new net.nj.f();
         var6.K("pos", this.M(new int[]{var5.n.t(), var5.n.h(), var5.n.y()}));
         var6.r("state", var2.L(var5.X));
         if(var5.i != null) {
            var6.K("nbt", var5.i);
         }

         var3.m(var6);
      }

      h var8 = new h();

      for(f.o var11 : this.y) {
         net.nj.f var7 = new net.nj.f();
         var7.K("pos", this.R(new double[]{var11.k.p, var11.k.H, var11.k.a}));
         var7.K("blockPos", this.M(new int[]{var11.E.t(), var11.E.h(), var11.E.y()}));
         if(var11.Y != null) {
            var7.K("nbt", var11.Y);
         }

         var8.m(var7);
      }

      h var10 = new h();

      for(n var13 : var2) {
         var10.m(net.nj.e.K(new net.nj.f(), var13));
      }

      var1.K("palette", var10);
      var1.K("blocks", var3);
      var1.K("entities", var8);
      var1.K("size", this.M(new int[]{this.c.t(), this.c.h(), this.c.y()}));
      var1.b("author", this.w);
      var1.r("DataVersion", 1343);
      return var1;
   }

   public void t(net.nj.f var1) {
      this.f.clear();
      this.y.clear();
      h var2 = var1.A("size", 3);
      this.c = new j(var2.H(0), var2.H(1), var2.H(2));
      this.w = var1.J("author");
      f.r var3 = new f.r();
      h var4 = var1.A("palette", 10);

      for(int var5 = 0; var5 < var4.z(); ++var5) {
         var3.p(net.nj.e.r(var4.i(var5)), var5);
      }

      h var14 = var1.A("blocks", 10);

      for(int var6 = 0; var6 < var14.z(); ++var6) {
         net.nj.f var7 = var14.i(var6);
         h var8 = var7.A("pos", 3);
         j var9 = new j(var8.H(0), var8.H(1), var8.H(2));
         n var10 = var3.L(var7.P("state"));
         net.nj.f var11;
         if(var7.G("nbt")) {
            var11 = var7.o("nbt");
         } else {
            var11 = null;
         }

         this.f.add(new f.k(var9, var10, var11));
      }

      h var15 = var1.A("entities", 10);

      for(int var16 = 0; var16 < var15.z(); ++var16) {
         net.nj.f var17 = var15.i(var16);
         h var18 = var17.A("pos", 6);
         net.u.r var19 = new net.u.r(var18.U(0), var18.U(1), var18.U(2));
         h var20 = var17.A("blockPos", 3);
         j var12 = new j(var20.H(0), var20.H(1), var20.H(2));
         if(var17.G("nbt")) {
            net.nj.f var13 = var17.o("nbt");
            this.y.add(new f.o(var19, var12, var13));
         }
      }

   }

   private h M(int... var1) {
      h var2 = new h();

      for(int var6 : var1) {
         var2.m(new u(var6));
      }

      return var2;
   }

   private h R(double... var1) {
      h var2 = new h();

      for(double var6 : var1) {
         var2.m(new net.nj.v(var6));
      }

      return var2;
   }

   public static void s(int var0) {
      X = var0;
   }

   public static int b() {
      return X;
   }

   public static int W() {
      int var0 = b();
      return 63;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      s(32);
   }

   public static class k {
      public final j n;
      public final n X;
      public final net.nj.f i;

      public k(j var1, n var2, @Nullable net.nj.f var3) {
         f.W();
         super();
         this.n = var1;
         this.X = var2;
         this.i = var3;
         net.u.d.h(new net.u.d[5]);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class o {
      public final net.u.r k;
      public final j E;
      public final net.nj.f Y;

      public o(net.u.r var1, j var2, net.nj.f var3) {
         this.k = var1;
         this.E = var2;
         int var10000 = f.W();
         this.Y = var3;
         int var4 = var10000;
         if(net.u.d.y() == null) {
            ++var4;
            f.X = var4;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class r implements Iterable {
      public static final n X = net.nb.f.ou.p();
      final a9 x;
      private int S;

      private r() {
         this.x = new a9(16);
      }

      public int L(n var1) {
         f.W();
         int var3 = this.x.X(var1);
         if(var3 == -1) {
            var3 = this.S++;
            this.x.u(var1, var3);
         }

         return var3;
      }

      @Nullable
      public n L(int var1) {
         f.X;
         n var3 = (n)this.x.j(var1);
         return var3 == null?X:var3;
      }

      public Iterator iterator() {
         return this.x.iterator();
      }

      public void p(n var1, int var2) {
         this.x.u(var1, var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
