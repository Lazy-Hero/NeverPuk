package net.yv;

import java.lang.reflect.Constructor;
import net.yv.a;
import net.yv.b;
import net.yv.c;
import net.yv.k;
import net.yv.r;

public enum h {
   OVERWORLD(0, "overworld", "", a.class),
   NETHER(-1, "the_nether", "_nether", b.class),
   THE_END(1, "the_end", "_end", k.class);

   private final int K;
   private final String R;
   private final String b;
   private final Class A;

   private h(int var3, String var4, String var5, Class var6) {
      this.K = var3;
      this.R = var4;
      this.b = var5;
      this.A = var6;
   }

   public int M() {
      return this.K;
   }

   public String t() {
      return this.R;
   }

   public String E() {
      return this.b;
   }

   public c H() {
      Constructor var1 = this.A.getConstructor(new Class[0]);
      return (c)var1.newInstance(new Object[0]);
   }

   public static h M(int var0) {
      h[] var2 = values();
      r.C();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         h var5 = var2[var4];
         if(var5.M() == var0) {
            return var5;
         }

         ++var4;
      }

      throw new IllegalArgumentException("Invalid dimension id " + var0);
   }

   public static h u(String var0) {
      r.C();
      h[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         h var5 = var2[var4];
         if(var5.t().equals(var0)) {
            return var5;
         }

         ++var4;
      }

      throw new IllegalArgumentException("Invalid dimension " + var0);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
