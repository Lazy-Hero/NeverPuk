package net.n9;

import java.awt.image.BufferedImage;
import java.io.IOException;
import net.gh;
import net.xn;
import net.z9;
import net.n9.f;
import net.n9.y;

public class x extends f {
   private final int[] m;
   private final int Z;
   private final int B;
   private boolean s;

   public x(BufferedImage var1) {
      this(var1.getWidth(), var1.getHeight());
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), this.m, 0, var1.getWidth());
      this.g();
   }

   public x(int var1, int var2) {
      this.s = false;
      this.Z = var1;
      this.B = var2;
      this.m = new int[var1 * var2 * 3];
      if(z9.Q()) {
         gh.W(this.L(), var1, var2, this);
         this.s = true;
      } else {
         y.i(this.L(), var1, var2);
      }

   }

   public void c(net.c9.p var1) throws IOException {
   }

   public void g() {
      if(z9.Q()) {
         if(!this.s) {
            gh.W(this.L(), this.Z, this.B, this);
            this.s = true;
         }

         gh.J(this.L(), this.m, this.Z, this.B, this);
      } else {
         y.c(this.L(), this.m, this.Z, this.B);
      }

   }

   public int[] X() {
      return this.m;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
