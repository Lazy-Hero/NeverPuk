package net.n6;

import java.util.Map;
import net.xn;

public class k {
   private final k.n R;
   private final String G;
   private static String[] p;

   public k(k.n var1, String var2) {
      this.R = var1;
      this.G = var2;
   }

   public k.n J() {
      return this.R;
   }

   public String q() {
      return this.G;
   }

   public boolean equals(Object var1) {
      String[] var2 = U();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         k var3 = (k)var1;
         return this.R != var3.R?false:(this.G != null?this.G.equals(var3.G):var3.G == null);
      } else {
         return false;
      }
   }

   public String toString() {
      return "ClickEvent{action=" + this.R + ", value=\'" + this.G + '\'' + '}';
   }

   public int hashCode() {
      int var1 = this.R.hashCode();
      var1 = 31 * var1 + (this.G != null?this.G.hashCode():0);
      return var1;
   }

   public static void k(String[] var0) {
      p = var0;
   }

   public static String[] U() {
      return p;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      k(new String[5]);
   }

   public static enum n {
      OPEN_URL,
      OPEN_FILE,
      RUN_COMMAND,
      SUGGEST_COMMAND,
      CHANGE_PAGE;

      private static final Map I;
      private final boolean M;
      private final String F;

      private n(String var3, boolean var4) {
         this.F = var3;
         this.M = var4;
      }

      public boolean O() {
         return this.M;
      }

      public String t() {
         return this.F;
      }

      public static k.n Y(String var0) {
         return (k.n)I.get(var0);
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }
}
