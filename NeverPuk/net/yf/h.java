package net.yf;

import com.google.gson.JsonObject;
import java.util.Locale;
import net.xn;
import net.yf.p;

public class h {
   private static h r;
   private final int F;
   private final int C;
   private final int s;
   private final int g;
   private final int K;
   private final boolean e;
   private final boolean m;

   private h(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      this.e = var1;
      this.F = var3;
      this.s = var4;
      this.C = var5;
      this.g = var6;
      this.m = var2;
      this.K = var7;
   }

   public h() {
      this(false, true, 1, 0, 1, 0, '耆');
   }

   public h(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public h(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void G() {
      if(!this.equals(r)) {
         if(r == null || this.m != r.S()) {
            r = this;
            if(this.m) {
               net.y.d.E();
               return;
            }

            net.y.d.C();
         }

         net.y.d.s(this.K);
         if(this.e) {
            net.y.d.G(this.F, this.s, this.C, this.g);
         } else {
            net.y.d.D(this.F, this.s);
         }
      }

   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof h)) {
         return false;
      } else {
         h var2 = (h)var1;
         return this.K != var2.K?false:(this.g != var2.g?false:(this.s != var2.s?false:(this.m != var2.m?false:(this.e != var2.e?false:(this.C != var2.C?false:this.F == var2.F)))));
      }
   }

   public int hashCode() {
      int var1 = this.F;
      var1 = 31 * var1 + this.C;
      var1 = 31 * var1 + this.s;
      var1 = 31 * var1 + this.g;
      var1 = 31 * var1 + this.K;
      var1 = 31 * var1 + (this.e?1:0);
      var1 = 31 * var1 + (this.m?1:0);
      return var1;
   }

   public boolean S() {
      return this.m;
   }

   public static h r(JsonObject var0) {
      p.M();
      return new h();
   }

   private static int u(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      return "add".equals(var1)?'耆':("subtract".equals(var1)?'耊':("reversesubtract".equals(var1)?'耋':("reverse_subtract".equals(var1)?'耋':("min".equals(var1)?'耇':("max".equals(var1)?'耈':'耆')))));
   }

   private static int x(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      var1 = var1.replaceAll("_", "");
      var1 = var1.replaceAll("one", "1");
      var1 = var1.replaceAll("zero", "0");
      var1 = var1.replaceAll("minus", "-");
      return "0".equals(var1)?0:("1".equals(var1)?1:("srccolor".equals(var1)?768:("1-srccolor".equals(var1)?769:("dstcolor".equals(var1)?774:("1-dstcolor".equals(var1)?775:("srcalpha".equals(var1)?770:("1-srcalpha".equals(var1)?771:("dstalpha".equals(var1)?772:("1-dstalpha".equals(var1)?773:-1)))))))));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
