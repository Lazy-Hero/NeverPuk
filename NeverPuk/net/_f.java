package net;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import net.mf;
import net.xn;
import net.u.j;
import net.u.t;
import net.yz.aq;

public class _f extends j {
   private int Y;
   private int r;
   private int I;
   private final int H;
   private _f[] x;
   private boolean N;

   public _f(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public _f(double var1, double var3, double var5) {
      this(t.L(var1), t.L(var3), t.L(var5));
   }

   public _f(int var1, int var2, int var3, int var4) {
      super(0, 0, 0);
      this.Y = var1;
      this.r = var2;
      this.I = var3;
      this.H = var4;
   }

   public int t() {
      return this.Y;
   }

   public int h() {
      return this.r;
   }

   public int y() {
      return this.I;
   }

   public void S(int var1, int var2, int var3) {
      this.Y = var1;
      this.r = var2;
      this.I = var3;
      this.N = true;
   }

   public void r(double var1, double var3, double var5) {
      this.S(t.L(var1), t.L(var3), t.L(var5));
   }

   public j C(aq var1) {
      String var2 = mf.O();
      if(this.H <= 0) {
         return super.a(var1, 1).F();
      } else {
         if(this.x == null) {
            this.x = new _f[aq.VALUES.length];
         }

         if(this.N) {
            this.H();
         }

         int var3 = var1.w();
         _f var4 = this.x[var3];
         if(var4 == null) {
            int var5 = this.Y + var1.v();
            int var6 = this.r + var1.z();
            int var7 = this.I + var1.P();
            var4 = new _f(var5, var6, var7, this.H - 1);
            this.x[var3] = var4;
         }

         return var4;
      }
   }

   public j a(aq var1, int var2) {
      return var2 == 1?this.C(var1):super.a(var1, var2).F();
   }

   private void H() {
      int var1 = 0;

      while(true) {
         _f var2 = this.x[var1];
         aq var3 = aq.VALUES[var1];
         int var4 = this.Y + var3.v();
         int var5 = this.r + var3.z();
         int var6 = this.I + var3.P();
         var2.S(var4, var5, var6);
         ++var1;
      }
   }

   public j F() {
      return new j(this.Y, this.r, this.I);
   }

   public static Iterable H(j var0, j var1) {
      final j var2 = new j(Math.min(var0.t(), var1.t()), Math.min(var0.h(), var1.h()), Math.min(var0.y(), var1.y()));
      final j var3 = new j(Math.max(var0.t(), var1.t()), Math.max(var0.h(), var1.h()), Math.max(var0.y(), var1.y()));
      return new Iterable() {
         public Iterator iterator() {
            return new AbstractIterator() {
               private _f W = null;

               protected _f x() {
                  String var1 = mf.O();
                  if(this.W == null) {
                     this.W = new _f(var2.t(), var2.h(), var2.y(), 3);
                     return this.W;
                  } else if(this.W.equals(var3)) {
                     return (_f)this.endOfData();
                  } else {
                     int var2x = this.W.t();
                     int var3x = this.W.h();
                     int var4 = this.W.y();
                     if(var2x < var3.t()) {
                        ++var2x;
                     }

                     if(var3x < var3.h()) {
                        var2x = var2.t();
                        ++var3x;
                     }

                     if(var4 < var3.y()) {
                        var2x = var2.t();
                        var3x = var2.h();
                        ++var4;
                     }

                     this.W.S(var2x, var3x, var4);
                     return this.W;
                  }
               }

               protected Object computeNext() {
                  return this.x();
               }

               private static xn a(xn var0) {
                  return var0;
               }
            };
         }
      };
   }

   private static xn a(xn var0) {
      return var0;
   }
}
