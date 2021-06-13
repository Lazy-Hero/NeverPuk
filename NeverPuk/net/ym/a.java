package net.ym;

import java.util.Locale;
import net.xn;
import net.ym.t;
import net.yz.m_;
import org.apache.commons.lang3.StringUtils;

public class a extends m_ {
   private final String r;

   protected a(int var1, String... var2) {
      super(0, new String[]{var2[0], var2[1]});
      this.r = StringUtils.isEmpty(var2[2])?"normal":var2[2].toLowerCase(Locale.ROOT);
   }

   public a(String var1) {
      this(0, i(var1));
   }

   public a(m_ var1, String var2) {
      this(var1.toString(), var2);
   }

   public a(String var1, String var2) {
      this(0, i(var1 + '#' + "normal"));
   }

   protected static String[] i(String var0) {
      String[] var1 = new String[]{null, var0, null};
      int var2 = var0.indexOf(35);
      String var3 = var0;
      var1[2] = var0.substring(var2 + 1);
      if(var2 > 1) {
         var3 = var0.substring(0, var2);
      }

      System.arraycopy(m_.E(var3), 0, var1, 0, 2);
      return var1;
   }

   public String w() {
      return this.r;
   }

   public boolean equals(Object var1) {
      int var2 = t.v();
      if(this == var1) {
         return true;
      } else if(var1 instanceof a && super.equals(var1)) {
         a var3 = (a)var1;
         return this.r.equals(var3.r);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return 31 * super.hashCode() + this.r.hashCode();
   }

   public String toString() {
      return super.toString() + '#' + this.r;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
