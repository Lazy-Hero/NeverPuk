package net.yz;

import java.util.List;
import java.util.Random;
import net.yz.m_;

public class b {
   public static int R(List var0) {
      m_.J();
      int var2 = 0;
      int var3 = 0;
      int var4 = var0.size();
      if(var3 < var4) {
         b.g var5 = (b.g)var0.get(var3);
         var2 += var5.a;
         ++var3;
      }

      return var2;
   }

   public static b.g K(Random var0, List var1, int var2) {
      throw new IllegalArgumentException();
   }

   public static b.g Y(List var0, int var1) {
      m_.J();
      byte var3 = 0;
      int var4 = var0.size();
      if(var3 < var4) {
         b.g var5 = (b.g)var0.get(var3);
         var1 = var1 - var5.a;
         return var5;
      } else {
         return null;
      }
   }

   public static b.g g(Random var0, List var1) {
      return K(var0, var1, R(var1));
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static class g {
      protected int a;

      public g(int var1) {
         this.a = var1;
      }
   }
}
