package net;

import java.util.Arrays;
import net._r;
import net.i6;
import net.mf;
import net.oq;
import net.xn;
import net.z9;
import net.ns.i;
import net.u.j;
import net.yv.q;
import net.yw.n;
import net.yz.aq;

public class w5 implements net.yv.o8 {
   private final q j;
   private final int b;
   private final int N;
   private final int F;
   private int[] I;
   private n[] o;
   private static final _r l = new _r(Integer.TYPE, 16);
   private static final _r q = new _r(n.class, 16);
   private static final int X = 8000;

   public w5(q var1, j var2, int var3) {
      this.j = var1;
      this.b = var2.t() - var3;
      this.N = var2.h() - var3;
      this.F = var2.y() - var3;
   }

   public int z(j var1, int var2) {
      String var3 = mf.O();
      if(this.I == null) {
         int var6 = this.j.z(var1, var2);
         if(z9.I() && !this.Z(var1).j()) {
            var6 = oq.K(var1, var6);
         }

         return var6;
      } else {
         int var4 = this.W(var1);
         if(var4 >= 0 && var4 < this.I.length) {
            int var5 = this.I[var4];
            if(var5 == -1) {
               var5 = this.j.z(var1, var2);
               if(z9.I() && !this.Z(var1).j()) {
                  var5 = oq.K(var1, var5);
               }

               this.I[var4] = var5;
            }

            return var5;
         } else {
            return this.j.z(var1, var2);
         }
      }
   }

   public n Z(j var1) {
      if(this.o == null) {
         return this.j.Z(var1);
      } else {
         int var2 = this.W(var1);
         if(var2 < this.o.length) {
            n var3 = this.o[var2];
            var3 = this.j.Z(var1);
            this.o[var2] = var3;
            return var3;
         } else {
            return this.j.Z(var1);
         }
      }
   }

   private int W(j var1) {
      int var2 = var1.t() - this.b;
      int var3 = var1.h() - this.N;
      int var4 = var1.y() - this.F;
      return var2 * 400 + var4 * 20 + var3;
   }

   public void Z() {
      if(this.I == null) {
         this.I = (int[])((int[])l.i(8000));
      }

      Arrays.fill(this.I, -1);
      if(this.o == null) {
         this.o = (n[])((n[])q.i(8000));
      }

      Arrays.fill(this.o, (Object)null);
   }

   public void h() {
      l.P(this.I);
      this.I = null;
      q.P(this.o);
      this.o = null;
   }

   public boolean h() {
      return this.j.I();
   }

   public i P(j var1) {
      return this.j.P(var1);
   }

   public int N(j var1, aq var2) {
      return this.j.N(var1, var2);
   }

   public net.ni.v L(j var1) {
      return this.j.S(var1, net.l.q.CHECK);
   }

   public net.ni.v f(j var1, net.l.q var2) {
      return this.j.S(var1, var2);
   }

   public net.yv.j t() {
      return this.j.t();
   }

   public boolean y(j var1) {
      return this.j.y(var1);
   }

   public boolean c(j var1, aq var2, boolean var3) {
      return i6.I(this.j, i6.C9, new Object[]{var1, var2, Boolean.valueOf(var3)});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
