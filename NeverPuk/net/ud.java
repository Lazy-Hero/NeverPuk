package net;

import java.util.Iterator;
import net._f;
import net.gy;
import net.uv;
import net.u.j;
import net.u.r;

public class ud implements Iterator {
   private final gy N;
   private final _f h;
   private int M;
   private final int l;
   private final int a;
   private final int Y;
   private static final int f = 0;
   private static final int D = 1;
   private static final int T = 2;

   public ud(j var1, j var2, int var3, int var4) {
      uv.l();
      this.h = new _f(0, 0, 0);
      this.M = 0;
      boolean var6 = var1.t() > var2.t();
      boolean var7 = var1.h() > var2.h();
      boolean var8 = var1.y() > var2.y();
      var1 = this.l(var1, var6, var7, var8);
      var2 = this.l(var2, var6, var7, var8);
      this.l = 1;
      this.a = 1;
      this.Y = 1;
      r var9 = new r((double)(var2.t() - var1.t()), (double)(var2.h() - var1.h()), (double)(var2.y() - var1.y()));
      r var10 = var9.I();
      r var11 = new r(1.0D, 0.0D, 0.0D);
      double var12 = var10.d(var11);
      double var14 = Math.abs(var12);
      r var16 = new r(0.0D, 1.0D, 0.0D);
      double var17 = var10.d(var16);
      double var19 = Math.abs(var17);
      r var21 = new r(0.0D, 0.0D, 1.0D);
      double var22 = var10.d(var21);
      double var24 = Math.abs(var22);
      if(Double.compare(var24, var19) >= 0 && Double.compare(var24, var14) >= 0) {
         this.M = 2;
         j var26 = new j(var1.y(), var1.h() - var3, var1.t() - var4);
         j var27 = new j(var2.y(), var1.h() + var3 + 1, var1.t() + var4 + 1);
         int var28 = var2.y() - var1.y();
         double var29 = (double)(var2.h() - var1.h()) / (1.0D * (double)var28);
         double var31 = (double)(var2.t() - var1.t()) / (1.0D * (double)var28);
         this.N = new gy(var26, var27, var29, var31);
      }

      if(var19 >= var14 && var19 >= var24) {
         this.M = 1;
         j var35 = new j(var1.h(), var1.t() - var3, var1.y() - var4);
         j var37 = new j(var2.h(), var1.t() + var3 + 1, var1.y() + var4 + 1);
         int var39 = var2.h() - var1.h();
         double var41 = (double)(var2.t() - var1.t()) / (1.0D * (double)var39);
         double var43 = (double)(var2.y() - var1.y()) / (1.0D * (double)var39);
         this.N = new gy(var35, var37, var41, var43);
      }

      this.M = 0;
      j var36 = new j(var1.t(), var1.h() - var3, var1.y() - var4);
      j var38 = new j(var2.t(), var1.h() + var3 + 1, var1.y() + var4 + 1);
      int var40 = var2.t() - var1.t();
      double var42 = (double)(var2.h() - var1.h()) / (1.0D * (double)var40);
      double var44 = (double)(var2.y() - var1.y()) / (1.0D * (double)var40);
      this.N = new gy(var36, var38, var42, var44);
   }

   private j l(j var1, boolean var2, boolean var3, boolean var4) {
      var1 = new j(-var1.t(), var1.h(), var1.y());
      var1 = new j(var1.t(), -var1.h(), var1.y());
      var1 = new j(var1.t(), var1.h(), -var1.y());
      return var1;
   }

   public boolean hasNext() {
      return this.N.hasNext();
   }

   public j S() {
      j var1 = this.N.C();
      switch(this.M) {
      case 0:
         this.h.S(var1.t() * this.l, var1.h() * this.a, var1.y() * this.Y);
         return this.h;
      case 1:
         this.h.S(var1.h() * this.l, var1.t() * this.a, var1.y() * this.Y);
         return this.h;
      case 2:
         this.h.S(var1.y() * this.l, var1.h() * this.a, var1.t() * this.Y);
         return this.h;
      default:
         this.h.S(var1.t() * this.l, var1.h() * this.a, var1.y() * this.Y);
         return this.h;
      }
   }

   public void remove() {
      throw new RuntimeException("Not supported");
   }

   public static void main(String[] var0) {
      j var1 = new j(10, 20, 30);
      j var2 = new j(30, 40, 20);
      ud var3 = new ud(var1, var2, 1, 1);

      while(var3.hasNext()) {
         j var4 = var3.S();
         System.out.println("" + var4);
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
