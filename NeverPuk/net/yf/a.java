package net.yf;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.xn;
import net.yf.p;
import org.apache.commons.lang3.StringUtils;

public class a extends IOException {
   private final List b = Lists.newArrayList();
   private final String i;

   public a(String var1) {
      this.b.add(new a.b());
      this.i = var1;
   }

   public a(String var1, Throwable var2) {
      super(var2);
      this.b.add(new a.b());
      this.i = var1;
   }

   public void Q(String var1) {
      ((a.b)this.b.get(0)).E(var1);
   }

   public void e(String var1) {
      ((a.b)this.b.get(0)).Y = var1;
      this.b.add(0, new a.b());
   }

   public String getMessage() {
      return "Invalid " + this.b.get(this.b.size() - 1) + ": " + this.i;
   }

   public static a w(Exception var0) {
      boolean var1 = p.M();
      if(var0 instanceof a) {
         return (a)var0;
      } else {
         String var2 = var0.getMessage();
         if(var0 instanceof FileNotFoundException) {
            var2 = "File not found";
         }

         return new a(var2, var0);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b {
      private String Y;
      private final List c;

      private b() {
         this.c = Lists.newArrayList();
      }

      private void E(String var1) {
         this.c.add(0, var1);
      }

      public String H() {
         return StringUtils.join(this.c, "->");
      }

      public String toString() {
         boolean var1 = p.M();
         return this.Y != null?(this.c.isEmpty()?this.Y:this.Y + " " + this.H()):(this.c.isEmpty()?"(Unknown file)":"(Unknown file) " + this.H());
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
