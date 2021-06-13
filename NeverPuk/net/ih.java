package net;

import java.util.Arrays;
import java.util.regex.Pattern;
import net.mf;
import net.wh;
import net.z9;
import net.nj.f;
import net.nj.h;
import net.nj.q;
import net.nj.u;
import org.apache.commons.lang3.StringEscapeUtils;

public class ih {
   private String[] D = null;
   private String S;
   private boolean I;
   private int m;
   private String M;
   private int e;
   private static final int i = 0;
   private static final int E = 1;
   private static final int P = 2;
   private static final int g = 3;
   private static final int Y = 4;
   private static final String y = "pattern:";
   private static final String z = "ipattern:";
   private static final String B = "regex:";
   private static final String s = "iregex:";
   private static final int J = 0;
   private static final int n = 1;
   private static final String h = "#";
   private static final Pattern C = Pattern.compile("^#[0-9a-f]{6}+$");

   public ih(String var1, String var2) {
      mf.O();
      this.S = null;
      this.I = false;
      this.m = 0;
      this.M = null;
      this.e = 0;
      String[] var4 = z9.Y(var1, ".");
      this.D = (String[])Arrays.copyOfRange(var4, 0, var4.length - 1);
      this.S = var4[var4.length - 1];
      if(var2.startsWith("!")) {
         this.I = true;
         var2 = var2.substring(1);
      }

      if(var2.startsWith("pattern:")) {
         this.m = 1;
         var2 = var2.substring("pattern:".length());
      }

      if(var2.startsWith("ipattern:")) {
         this.m = 2;
         var2 = var2.substring("ipattern:".length()).toLowerCase();
      }

      if(var2.startsWith("regex:")) {
         this.m = 3;
         var2 = var2.substring("regex:".length());
      }

      if(var2.startsWith("iregex:")) {
         this.m = 4;
         var2 = var2.substring("iregex:".length()).toLowerCase();
      }

      this.m = 0;
      var2 = StringEscapeUtils.unescapeJava(var2);
      if(this.m == 0 && C.matcher(var2).matches()) {
         this.e = 1;
      }

      this.M = var2;
   }

   public boolean K(f var1) {
      return this.I?!this.r(var1):this.r(var1);
   }

   public boolean r(f var1) {
      return false;
   }

   private boolean W(q var1) {
      if(var1 instanceof f) {
         f var2 = (f)var1;

         for(String var4 : var2.b()) {
            q var5 = var2.m(var4);
            if(this.L(var5)) {
               return true;
            }
         }
      }

      if(var1 instanceof h) {
         h var6 = (h)var1;
         int var7 = var6.z();

         for(int var8 = 0; var8 < var7; ++var8) {
            q var9 = var6.h(var8);
            if(this.L(var9)) {
               return true;
            }
         }
      }

      return false;
   }

   private static q r(q var0, String var1) {
      if(var0 instanceof f) {
         f var4 = (f)var0;
         return var4.m(var1);
      } else if(var0 instanceof h) {
         h var2 = (h)var0;
         if(var1.equals("count")) {
            return new u(var2.z());
         } else {
            int var3 = z9.F(var1, -1);
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean L(q var1) {
      return false;
   }

   public boolean R(String var1) {
      return false;
   }

   private boolean m(String var1, String var2) {
      return wh.y(var1, var2, '*', '?');
   }

   private boolean O(String var1, String var2) {
      return var1.matches(var2);
   }

   private static String i(q var0, int var1) {
      return null;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < this.D.length; ++var2) {
         String var3 = this.D[var2];
         var1.append(".");
         var1.append(var3);
      }

      if(var1.length() > 0) {
         var1.append(".");
      }

      var1.append(this.S);
      var1.append(" = ");
      var1.append(this.M);
      return var1.toString();
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
