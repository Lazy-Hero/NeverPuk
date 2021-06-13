package net.ns;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.ns.i;
import net.ns.i9;

public class i6 extends i9 {
   private final i w;

   public i6(i var1) {
      this.w = var1;
   }

   public i b(net.u.j var1) {
      return this.w;
   }

   public i[] U(i[] var1, int var2, int var3, int var4, int var5) {
      int[] var6 = i9.M();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new i[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.w);
      return var1;
   }

   public i[] h(@Nullable i[] var1, int var2, int var3, int var4, int var5) {
      int[] var6 = i9.M();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new i[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.w);
      return var1;
   }

   public i[] y(@Nullable i[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.h(var1, var2, var3, var4, var5);
   }

   @Nullable
   public net.u.j R(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.w)?new net.u.j(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)):null;
   }

   public boolean q(int var1, int var2, int var3, List var4) {
      return var4.contains(this.w);
   }

   public boolean a() {
      return true;
   }

   public i S() {
      return this.w;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
