package net;

import net.gt;
import net.o2;
import net.oz;
import net.xn;
import net.c9.b;
import net.z.m;

public class p3 extends m {
   private gt z = null;

   public p3(gt var1, int var2, int var3, int var4, int var5) {
      super(var1.ordinal(), var2, var3, var4, var5, C(var1));
      this.z = var1;
   }

   public gt c() {
      return this.z;
   }

   private static String C(gt var0) {
      String var1 = b.x(var0.m(), new Object[0]) + ": ";
      switch(null.w[var0.ordinal()]) {
      case 1:
         return var1 + o2.I(oz.K);
      case 2:
         return var1 + o2.m(oz.ek);
      case 3:
         return var1 + o2.m(oz.H3);
      case 4:
         return var1 + o2.e(oz.c);
      case 5:
         return var1 + o2.e(oz._f);
      case 6:
         return var1 + o2.M(oz.H_);
      case 7:
         return var1 + o2.m(oz.ER);
      case 8:
         return var1 + oz.ep.e();
      case 9:
         return var1 + oz.H9.e();
      case 10:
         return var1 + o2.m(oz.eA);
      case 11:
         return var1 + o2.m(oz._y);
      default:
         return var1 + oz.g(var0);
      }
   }

   public void L() {
      this.J = C(this.z);
   }

   private static xn c(xn var0) {
      return var0;
   }
}
