package net.s;

import javax.annotation.Nullable;
import net.s.b;
import net.s.p;
import net.u.t;

public class r extends p {
   private final double S;
   private final double w;
   private String W;

   public r(@Nullable b var1, String var2, double var3, double var5, double var7) {
      super(var1, var2, var3);
      this.S = var5;
      this.w = var7;
      if(var5 > var7) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if(var3 < var5) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if(var3 > var7) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   public r k(String var1) {
      this.W = var1;
      return this;
   }

   public String f() {
      return this.W;
   }

   public double H(double var1) {
      var1 = t.F(var1, this.S, this.w);
      return var1;
   }

   private static IllegalArgumentException b(IllegalArgumentException var0) {
      return var0;
   }
}
