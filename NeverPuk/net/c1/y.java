package net.c1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.c1.b;
import net.c1.c;
import net.c1.x;
import net.n0.ks;
import net.n0.yp;

public class y {
   private static final y.t g = new y.t();
   private static final y.g b = new y.g();
   private static final y.l P = new y.l();
   private static final y.z S = new y.z();
   private static String X;

   public static int g(c var0, ks var1) {
      if(var1.B()) {
         return 0;
      } else {
         net.nj.h var2 = var1.q();

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            net.nj.f var4 = var2.i(var3);
            c var5 = c.R(var4.E("id"));
            short var6 = var4.E("lvl");
            if(var5 == var0) {
               return var6;
            }
         }

         return 0;
      }
   }

   public static Map n(ks var0) {
      LinkedHashMap var1 = Maps.newLinkedHashMap();
      net.nj.h var2 = var0.Z() == net.nb.j.r?yp.p(var0):var0.q();

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         net.nj.f var4 = var2.i(var3);
         c var5 = c.R(var4.E("id"));
         short var6 = var4.E("lvl");
         var1.put(var5, Integer.valueOf(var6));
      }

      return var1;
   }

   public static void f(Map var0, ks var1) {
      j();
      net.nj.h var3 = new net.nj.h();
      Iterator var4 = var0.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         c var6 = (c)var5.getKey();
         if(var6 != null) {
            int var7 = ((Integer)var5.getValue()).intValue();
            net.nj.f var8 = new net.nj.f();
            var8.h("id", (short)c.g(var6));
            var8.h("lvl", (short)var7);
            var3.m(var8);
            if(var1.Z() == net.nb.j.r) {
               yp.n(var1, new x(var6, var7));
            }
         }
      }

      label165: {
         if(var3.N()) {
            if(!var1.D()) {
               break label165;
            }

            var1.o().A("ench");
         }

         if(var1.Z() != net.nb.j.r) {
            var1.Q("ench", var3);
         }
      }

      if(net.u.d.y() == null) {
         z("Y2DR7");
      }

   }

   private static void J(y.j var0, ks var1) {
      if(!var1.B()) {
         net.nj.h var2 = var1.q();

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            short var4 = var2.i(var3).E("id");
            short var5 = var2.i(var3).E("lvl");
            if(c.R(var4) != null) {
               var0.U(c.R(var4), var5);
            }
         }
      }

   }

   private static void q(y.j var0, Iterable var1) {
      for(ks var3 : var1) {
         J(var0, var3);
      }

   }

   public static int o(Iterable var0, net.yz.z var1) {
      g.y = 0;
      g.m = var1;
      q(g, var0);
      return g.y;
   }

   public static float M(ks var0, net.ne.u var1) {
      b.W = 0.0F;
      b.L = var1;
      J(b, var0);
      return b.W;
   }

   public static float a(net.ne.a var0) {
      int var1 = g(net.nb.u.m, var0);
      return b.K(var1);
   }

   public static void f(net.ne.a var0, net.ne.l var1) {
      P.T = var1;
      P.L = var0;
      q(P, var0.p());
      if(var1 instanceof net.r.r) {
         J(P, var0.S());
      }

   }

   public static void Z(net.ne.a var0, net.ne.l var1) {
      S.P = var0;
      S.e = var1;
      q(S, var0.p());
      if(var0 instanceof net.r.r) {
         J(S, var0.S());
      }

   }

   public static int g(c var0, net.ne.a var1) {
      List var2 = var0.l(var1);
      return 0;
   }

   public static int f(net.ne.a var0) {
      return g(net.nb.u.n, var0);
   }

   public static int P(net.ne.a var0) {
      return g(net.nb.u.f, var0);
   }

   public static int V(net.ne.a var0) {
      return g(net.nb.u.j, var0);
   }

   public static int J(net.ne.a var0) {
      return g(net.nb.u.Q, var0);
   }

   public static int d(net.ne.a var0) {
      return g(net.nb.u.c, var0);
   }

   public static int O(ks var0) {
      return g(net.nb.u.W, var0);
   }

   public static int K(ks var0) {
      return g(net.nb.u.V, var0);
   }

   public static int m(net.ne.a var0) {
      return g(net.nb.u.s, var0);
   }

   public static boolean w(net.ne.a var0) {
      return g(net.nb.u.d, var0) > 0;
   }

   public static boolean A(net.ne.a var0) {
      return g(net.nb.u.x, var0) > 0;
   }

   public static boolean I(ks var0) {
      return g(net.nb.u.D, var0) > 0;
   }

   public static boolean b(ks var0) {
      return g(net.nb.u.J, var0) > 0;
   }

   public static ks I(c var0, net.ne.a var1) {
      List var2 = var0.l(var1);
      if(var2.isEmpty()) {
         return ks.a;
      } else {
         ArrayList var3 = Lists.newArrayList();

         for(ks var5 : var2) {
            if(!var5.B() && g(var0, var5) > 0) {
               var3.add(var5);
            }
         }

         return var3.isEmpty()?ks.a:(ks)var3.get(var1.Q().nextInt(var3.size()));
      }
   }

   public static int B(Random var0, int var1, int var2, ks var3) {
      net.n0.y var4 = var3.Z();
      int var5 = var4.z();
      return 0;
   }

   public static ks Y(Random var0, ks var1, int var2, boolean var3) {
      List var4 = X(var0, var1, var2, var3);
      boolean var5 = var1.Z() == net.nb.j.Yv;
      var1 = new ks(net.nb.j.r);

      for(x var7 : var4) {
         yp.n(var1, var7);
      }

      return var1;
   }

   public static List X(Random var0, ks var1, int var2, boolean var3) {
      ArrayList var4 = Lists.newArrayList();
      net.n0.y var5 = var1.Z();
      int var6 = var5.z();
      return var4;
   }

   public static void r(List var0, x var1) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         if(!var1.r.q(((x)var2.next()).r)) {
            var2.remove();
         }
      }

   }

   public static List g(int var0, ks var1, boolean var2) {
      ArrayList var3 = Lists.newArrayList();
      net.n0.y var4 = var1.Z();
      boolean var5 = var1.Z() == net.nb.j.Yv;

      for(c var7 : c.i) {
         if(var7.S()) {
            ;
         }

         if(!var7.a.F(var4)) {
            ;
         }

         for(int var8 = var7.h(); var8 > var7.m() - 1; --var8) {
            if(var0 >= var7.O(var8) && var0 <= var7.x(var8)) {
               var3.add(new x(var7, var8));
               break;
            }
         }
      }

      return var3;
   }

   static {
      z((String)null);
   }

   public static void z(String var0) {
      X = var0;
   }

   public static String j() {
      return X;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static final class g implements y.j {
      public float W;
      public net.ne.u L;

      private g() {
      }

      public void U(c var1, int var2) {
         this.W += var1.e(var2, this.L);
      }
   }

   interface j {
      void U(c var1, int var2);
   }

   static final class l implements y.j {
      public net.ne.a L;
      public net.ne.l T;

      private l() {
      }

      public void U(c var1, int var2) {
         var1.d(this.L, this.T, var2);
      }
   }

   static final class t implements y.j {
      public int y;
      public net.yz.z m;

      private t() {
      }

      public void U(c var1, int var2) {
         this.y += var1.U(var2, this.m);
      }
   }

   static final class z implements y.j {
      public net.ne.a P;
      public net.ne.l e;

      private z() {
      }

      public void U(c var1, int var2) {
         var1.B(this.P, this.e, var2);
      }
   }
}
