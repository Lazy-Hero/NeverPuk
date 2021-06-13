package net.nf;

import net.xn;
import net.nf.a;
import net.nf.b;
import net.nf.c;
import net.nf.d;
import net.nf.e;
import net.nf.g;
import net.nf.h;
import net.nf.j;
import net.nf.k;
import net.nf.l;
import net.nf.p;
import net.nf.q;
import net.nf.s;
import net.nf.t;
import net.nf.v;
import net.nf.x;
import net.nf.y;

public abstract class i {
   private long G;
   protected i j;
   private long S;
   protected long q;
   private static net.u.d[] A;

   public static i[] x(long var0, net.yv.j var2, net.cn.z var3) {
      D();
      b var5 = new b(1L);
      p var33 = new p(2000L, var5);
      k var6 = new k(1L, var33);
      l var7 = new l(2001L, var6);
      k var8 = new k(2L, var7);
      var8 = new k(50L, var8);
      var8 = new k(70L, var8);
      q var9 = new q(2L, var8);
      c var10 = new c(2L, var9);
      k var11 = new k(3L, var10);
      g var12 = new g(2L, var11, g.q.COOL_WARM);
      var12 = new g(2L, var12, g.q.HEAT_ICE);
      var12 = new g(3L, var12, g.q.SPECIAL);
      l var13 = new l(2002L, var12);
      var13 = new l(2003L, var13);
      k var14 = new k(4L, var13);
      v var15 = new v(5L, var14);
      j var16 = new j(4L, var15);
      i var17 = l.n(1000L, var16, 0);
      int var18 = 4;
      int var19 = var18;
      if(var3 != null) {
         var18 = var3.vF;
         var19 = var3.K;
      }

      if(var2 == net.yv.j.p) {
         var18 = 6;
      }

      i var20 = l.n(1000L, var17, 0);
      h var21 = new h(100L, var20);
      y var22 = new y(200L, var17, var2, var3);
      i var23 = l.n(1000L, var22, 2);
      e var24 = new e(1000L, var23);
      i var25 = l.n(1000L, var21, 2);
      a var26 = new a(1000L, var24, var25);
      i var27 = l.n(1000L, var21, 2);
      var27 = l.n(1000L, var27, var19);
      t var28 = new t(1L, var27);
      d var29 = new d(1000L, var28);
      s var41 = new s(1001L, var26);
      int var30 = 0;
      l var42 = new l((long)(1000 + var30), var41);
      k var43 = new k(3L, var42);
      ++var30;
      net.u.d.h(new net.u.d[5]);
      d var46 = new d(1000L, var43);
      net.nf.z var31 = new net.nf.z(100L, var46, var29);
      x var32 = new x(10L, var31);
      var31.y(var0);
      var32.y(var0);
      return new i[]{var31, var32, var31};
   }

   public i(long var1) {
      this.q = var1;
      this.q *= this.q * 6364136223846793005L + 1442695040888963407L;
      this.q += var1;
      this.q *= this.q * 6364136223846793005L + 1442695040888963407L;
      this.q += var1;
      this.q *= this.q * 6364136223846793005L + 1442695040888963407L;
      this.q += var1;
   }

   public void y(long var1) {
      this.G = var1;
      if(this.j != null) {
         this.j.y(var1);
      }

      this.G *= this.G * 6364136223846793005L + 1442695040888963407L;
      this.G += this.q;
      this.G *= this.G * 6364136223846793005L + 1442695040888963407L;
      this.G += this.q;
      this.G *= this.G * 6364136223846793005L + 1442695040888963407L;
      this.G += this.q;
   }

   public void N(long var1, long var3) {
      this.S = this.G;
      this.S *= this.S * 6364136223846793005L + 1442695040888963407L;
      this.S += var1;
      this.S *= this.S * 6364136223846793005L + 1442695040888963407L;
      this.S += var3;
      this.S *= this.S * 6364136223846793005L + 1442695040888963407L;
      this.S += var1;
      this.S *= this.S * 6364136223846793005L + 1442695040888963407L;
      this.S += var3;
   }

   protected int u(int var1) {
      int var2 = (int)((this.S >> 24) % (long)var1);
      var2 = var2 + var1;
      this.S *= this.S * 6364136223846793005L + 1442695040888963407L;
      this.S += this.G;
      return var2;
   }

   public abstract int[] Y(int var1, int var2, int var3, int var4);

   protected static boolean C(int var0, int var1) {
      if(var0 == var1) {
         return true;
      } else {
         net.ns.i var2 = net.ns.i.F(var0);
         net.ns.i var3 = net.ns.i.F(var1);
         return var2 != net.nb.x.n && var2 != net.nb.x.y?var2 == var3 || var2.g() == var3.g():var3 == net.nb.x.n || var3 == net.nb.x.y;
      }
   }

   protected static boolean h(int var0) {
      net.ns.i var1 = net.ns.i.F(var0);
      return var1 == net.nb.x.r || var1 == net.nb.x.b || var1 == net.nb.x.R;
   }

   protected int G(int... var1) {
      return var1[this.u(var1.length)];
   }

   protected int p(int var1, int var2, int var3, int var4) {
      return var2 == var3 && var3 == var4?var2:(var1 == var2 && var1 == var3?var1:(var1 == var2 && var1 == var4?var1:(var1 == var3 && var1 == var4?var1:(var1 == var2 && var3 != var4?var1:(var1 == var3 && var2 != var4?var1:(var1 == var4 && var2 != var3?var1:(var2 == var3 && var1 != var4?var2:(var2 == var4 && var1 != var3?var2:(var3 == var4 && var1 != var2?var3:this.G(new int[]{var1, var2, var3, var4}))))))))));
   }

   public static void u(net.u.d[] var0) {
      A = var0;
   }

   public static net.u.d[] D() {
      return A;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(D() == null) {
         u(new net.u.d[1]);
      }

   }
}
