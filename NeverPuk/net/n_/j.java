package net.n_;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.cr.l;
import net.n0.ks;
import net.n0.yk;
import net.n0.yw;
import net.n_.b;
import net.n_.i;
import net.n_.y;

public class j {
   private static final List G = Lists.newArrayList();
   private static final List k = Lists.newArrayList();
   private static final List x = Lists.newArrayList();
   private static final Predicate h = new Predicate() {
      public boolean t(ks var1) {
         i.z();
         Iterator var3 = j.x.iterator();
         if(var3.hasNext()) {
            l var4 = (l)var3.next();
            if(var4.j(var1)) {
               return true;
            }
         }

         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public static boolean K(ks var0) {
      return j(var0) || B(var0);
   }

   protected static boolean j(ks var0) {
      int var1 = 0;

      for(int var2 = k.size(); var1 < var2; ++var1) {
         if(((j.f)k.get(var1)).s.j(var0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean B(ks var0) {
      int var1 = 0;

      for(int var2 = G.size(); var1 < var2; ++var1) {
         if(((j.f)G.get(var1)).s.j(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean Q(ks var0, ks var1) {
      return !h.apply(var0)?false:m(var0, var1) || L(var0, var1);
   }

   protected static boolean m(ks var0, ks var1) {
      net.n0.y var2 = var0.Z();
      int var3 = 0;

      for(int var4 = k.size(); var3 < var4; ++var3) {
         j.f var5 = (j.f)k.get(var3);
         if(var5.k == var2 && var5.s.j(var1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean L(ks var0, ks var1) {
      b var2 = y.h(var0);
      int var3 = 0;

      for(int var4 = G.size(); var3 < var4; ++var3) {
         j.f var5 = (j.f)G.get(var3);
         if(var5.k == var2 && var5.s.j(var1)) {
            return true;
         }
      }

      return false;
   }

   public static ks H(ks var0, ks var1) {
      boolean var2 = i.M();
      if(!var1.B()) {
         b var3 = y.h(var1);
         net.n0.y var4 = var1.Z();
         int var5 = 0;
         int var6 = k.size();
         if(var5 < var6) {
            j.f var7 = (j.f)k.get(var5);
            if(var7.k == var4 && var7.s.j(var0)) {
               return y.b(new ks((net.n0.y)var7.P), var3);
            }

            ++var5;
         }

         var5 = 0;
         var6 = G.size();
         if(var5 < var6) {
            j.f var12 = (j.f)G.get(var5);
            if(var12.k == var3 && var12.s.j(var0)) {
               return y.b(new ks(var4), (b)var12.P);
            }

            ++var5;
         }
      }

      return var1;
   }

   public static void a() {
      v(net.nb.j.I);
      v(net.nb.j.YD);
      v(net.nb.j.Wg);
      p(net.nb.j.I, net.nb.j.YP, net.nb.j.YD);
      p(net.nb.j.YD, net.nb.j.Ym, net.nb.j.Wg);
      z(net.nb.w.d, net.nb.j.YX, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.Yy, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.Wi, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.H, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.Wk, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.WE, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.WI, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.Wo, net.nb.w.R);
      z(net.nb.w.d, net.nb.j.A, net.nb.w.y);
      z(net.nb.w.d, net.nb.j.YG, net.nb.w.w);
      z(net.nb.w.w, net.nb.j.b, net.nb.w.N);
      z(net.nb.w.N, net.nb.j.A, net.nb.w.J);
      z(net.nb.w.N, net.nb.j.Sn, net.nb.w.p);
      z(net.nb.w.J, net.nb.j.Sn, net.nb.w.a);
      z(net.nb.w.p, net.nb.j.A, net.nb.w.a);
      z(net.nb.w.w, net.nb.j.WI, net.nb.w.r);
      z(net.nb.w.r, net.nb.j.A, net.nb.w.A);
      z(net.nb.w.w, net.nb.j.Wi, net.nb.w.n);
      z(net.nb.w.n, net.nb.j.A, net.nb.w.q);
      z(net.nb.w.n, net.nb.j.Wo, net.nb.w.x);
      z(net.nb.w.n, net.nb.j.Sn, net.nb.w.E);
      z(net.nb.w.q, net.nb.j.Sn, net.nb.w.M);
      z(net.nb.w.E, net.nb.j.A, net.nb.w.M);
      z(net.nb.w.H, net.nb.j.Sn, net.nb.w.E);
      z(net.nb.w.K, net.nb.j.Sn, net.nb.w.M);
      z(net.nb.w.w, net.nb.j.WE, net.nb.w.H);
      z(net.nb.w.H, net.nb.j.A, net.nb.w.K);
      z(net.nb.w.H, net.nb.j.Wo, net.nb.w.c);
      I(net.nb.w.w, l.b(new ks[]{new ks(net.nb.j.YB, 1, yw.i.PUFFERFISH.W())}), net.nb.w.t);
      z(net.nb.w.t, net.nb.j.A, net.nb.w.L);
      z(net.nb.w.w, net.nb.j.YX, net.nb.w.Z);
      z(net.nb.w.Z, net.nb.j.Wo, net.nb.w.f);
      z(net.nb.w.Z, net.nb.j.Sn, net.nb.w.B);
      z(net.nb.w.f, net.nb.j.Sn, net.nb.w.g);
      z(net.nb.w.B, net.nb.j.Wo, net.nb.w.g);
      z(net.nb.w.D, net.nb.j.Sn, net.nb.w.B);
      z(net.nb.w.k, net.nb.j.Sn, net.nb.w.B);
      z(net.nb.w.S, net.nb.j.Sn, net.nb.w.g);
      z(net.nb.w.w, net.nb.j.Wk, net.nb.w.D);
      z(net.nb.w.D, net.nb.j.A, net.nb.w.k);
      z(net.nb.w.D, net.nb.j.Wo, net.nb.w.S);
      z(net.nb.w.w, net.nb.j.Yy, net.nb.w.Y);
      z(net.nb.w.Y, net.nb.j.A, net.nb.w.e);
      z(net.nb.w.Y, net.nb.j.Wo, net.nb.w.h);
      z(net.nb.w.w, net.nb.j.H, net.nb.w.G);
      z(net.nb.w.G, net.nb.j.A, net.nb.w.X);
      z(net.nb.w.G, net.nb.j.Wo, net.nb.w.O);
      z(net.nb.w.d, net.nb.j.Sn, net.nb.w.P);
      z(net.nb.w.P, net.nb.j.A, net.nb.w.z);
   }

   private static void p(yk var0, net.n0.y var1, yk var2) {
      k.add(new j.f(var0, l.t(new net.n0.y[]{var1}), var2));
   }

   private static void v(yk var0) {
      x.add(l.t(new net.n0.y[]{var0}));
   }

   private static void z(b var0, net.n0.y var1, b var2) {
      I(var0, l.t(new net.n0.y[]{var1}), var2);
   }

   private static void I(b var0, l var1, b var2) {
      G.add(new j.f(var0, var1, var2));
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class f {
      final Object k;
      final l s;
      final Object P;

      public f(Object var1, l var2, Object var3) {
         this.k = var1;
         this.s = var2;
         this.P = var3;
      }
   }
}
