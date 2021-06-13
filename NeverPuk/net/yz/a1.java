package net.yz;

import net.xn;
import net.yz.m_;

public class a1 {
   private final long[] z = new long[240];
   private int X;
   private int G;
   private int E;

   public void C(long var1) {
      m_.g();
      this.z[this.E] = var1;
      ++this.E;
      if(this.E == 240) {
         this.E = 0;
      }

      if(this.G < 240) {
         this.X = 0;
         ++this.G;
      }

      this.X = this.N(this.E + 1);
   }

   public int L(long var1, int var3) {
      double var4 = (double)var1 / 1.6666666E7D;
      return (int)(var4 * (double)var3);
   }

   public int D() {
      return this.X;
   }

   public int s() {
      return this.E;
   }

   public int N(int var1) {
      return var1 % 240;
   }

   public long[] N() {
      return this.z;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
