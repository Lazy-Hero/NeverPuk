package net.yo;

import javax.annotation.Nullable;
import net.xn;
import net.nb.f;
import net.ni.m;
import net.ni.v;
import net.ns.ih;
import net.u.d;
import net.y1.h;
import net.y9.g6;
import net.y9.gc;
import net.y9.gn;
import net.y9.l;
import net.y9.y;
import net.y9.zh;
import net.y9.zu;
import net.yo.c;
import net.yv.e;
import net.yv.o8;
import net.yv.r;
import net.yw.n;
import net.yz.a9;

public class j {
   private final a9 A = new a9(32);
   private static String U;

   public static j v() {
      final j var1 = new j();
      S();
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            j.U;
            y.t var6 = (y.t)var1.i(y.o);
            return var6 != y.t.GRASS && var6 != y.t.FERN?-1:ih.q(var2, var1.i(y.J) == y.m.UPPER?var3.b():var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.Tg});
      var1.C(new c() {
         public int F(n var1x, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            String var5 = j.U;
            v var6 = var2.L(var3);
            if(var6 instanceof m) {
               net.n0.y var7 = ((m)var6).X();
               n var8 = l.F(var7).p();
               return var1.I(var8, var2, var3, var4);
            } else {
               return -1;
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.uh});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return ih.q(var2, var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.p});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            j.U;
            gc.i var6 = (gc.i)var1.i(g6.A);
            return var6 == gc.i.SPRUCE?net.yv.v.D():(var6 == gc.i.BIRCH?net.yv.v.H():ih.y(var2, var3));
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.Tu});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return ih.y(var2, var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.G});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return ih.p(var2, var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.uM, f.dy});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return gn.R(((Integer)var1.i(gn.J)).intValue());
         }
      }, new l[]{f.dv});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return ih.q(var2, var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.dF});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            int var5 = ((Integer)var1.i(zh.l)).intValue();
            int var6 = var5 * 32;
            int var7 = 255 - var5 * 8;
            int var8 = var5 * 4;
            return var6 << 16 | var7 << 8 | var8;
         }
      }, new l[]{f.TB, f.H});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            String var5 = j.U;
            return var3 != null?ih.q(var2, var3):(var1.i(zu.p) == zu.i.DEAD_BUSH?16777215:e.A(0.5D, 1.0D));
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.TU});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return ih.y(var2, var3);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.To});
      var1.C(new c() {
         public int F(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
            return 2129968;
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.dD});
      d.h(new d[2]);
      return var1;
   }

   public int I(n var1, r var2, net.u.j var3) {
      S();
      c var5 = (c)this.A.j(l.h(var1.Q()));
      if(var5 != null) {
         return var5.F(var1, (o8)null, (net.u.j)null, 0);
      } else {
         h var6 = var1.c(var2, var3);
         return var6 != null?var6.L:-1;
      }
   }

   public int I(n var1, @Nullable o8 var2, @Nullable net.u.j var3, int var4) {
      S();
      c var6 = (c)this.A.j(l.h(var1.Q()));
      return var6 == null?-1:var6.F(var1, var2, var3, var4);
   }

   public void C(c var1, l... var2) {
      for(l var6 : var2) {
         this.A.u(var1, l.h(var6));
      }

   }

   public static void r(String var0) {
      U = var0;
   }

   public static String S() {
      return U;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(S() != null) {
         r("kdOntc");
      }

   }
}
