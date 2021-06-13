package net.no;

import java.io.IOException;
import java.util.Locale;
import javax.annotation.Nullable;
import net.xn;
import net.no.s8;

public class sa implements net.n2.k {
   private sa.t i;
   private net.cb.t L;
   private int j;
   private int N;
   private int x;

   public sa() {
   }

   public sa(sa.t var1, net.cb.t var2) {
      this(var1, var2, -1, -1, -1);
   }

   public sa(int var1, int var2, int var3) {
      this(sa.t.TIMES, (net.cb.t)null, var1, var2, var3);
   }

   public sa(sa.t var1, @Nullable net.cb.t var2, int var3, int var4, int var5) {
      this.i = var1;
      this.L = var2;
      this.j = var3;
      this.N = var4;
      this.x = var5;
   }

   public void E(net.n2.h var1) throws IOException {
      this.i = (sa.t)var1.S(sa.t.class);
      if(this.i == sa.t.TITLE || this.i == sa.t.SUBTITLE || this.i == sa.t.ACTIONBAR) {
         this.L = var1.g();
      }

      if(this.i == sa.t.TIMES) {
         this.j = var1.readInt();
         this.N = var1.readInt();
         this.x = var1.readInt();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      int var2 = s8.Y();
      var1.A(this.i);
      if(this.i == sa.t.TITLE || this.i == sa.t.SUBTITLE || this.i == sa.t.ACTIONBAR) {
         var1.p(this.L);
      }

      if(this.i == sa.t.TIMES) {
         var1.writeInt(this.j);
         var1.writeInt(this.N);
         var1.writeInt(this.x);
      }

   }

   public void v(net.x.t var1) {
      var1.t(this);
   }

   public sa.t N() {
      return this.i;
   }

   public net.cb.t n() {
      return this.L;
   }

   public int T() {
      return this.j;
   }

   public int g() {
      return this.N;
   }

   public int s() {
      return this.x;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum t {
      TITLE,
      SUBTITLE,
      ACTIONBAR,
      TIMES,
      CLEAR,
      RESET;

      public static sa.t Z(String var0) {
         s8.Y();
         sa.t[] var2 = values();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            sa.t var5 = var2[var4];
            if(var5.name().equalsIgnoreCase(var0)) {
               return var5;
            }

            ++var4;
         }

         return TITLE;
      }

      public static String[] f() {
         s8.x();
         String[] var1 = new String[values().length];
         int var2 = 0;
         sa.t[] var3 = values();
         int var4 = var3.length;
         int var5 = 0;
         if(var5 < var4) {
            sa.t var6 = var3[var5];
            var1[var2++] = var6.name().toLowerCase(Locale.ROOT);
            ++var5;
         }

         return var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
