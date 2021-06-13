package net;

import net.mf;
import net.xn;
import net.z9;

public class wi {
   private final int b;
   private int[] f;

   public wi(int var1) {
      this(var1, (int[])null);
   }

   public wi(int var1, int var2) {
      this(var1, new int[]{var2});
   }

   public wi(int var1, int[] var2) {
      this.b = var1;
      this.f = var2;
   }

   public boolean L(int var1, int var2) {
      String var3 = mf.O();
      return this.b != var1?false:this.f == null || z9.W(var2, this.f);
   }

   private boolean o(int var1) {
      return this.f != null && z9.W(var1, this.f);
   }

   public boolean H(int var1) {
      String var2 = mf.O();
      if(this.f == null) {
         this.f = new int[]{var1};
         return true;
      } else if(this.o(var1)) {
         return false;
      } else {
         this.f = z9.a(this.f, var1);
         return true;
      }
   }

   public int i() {
      return this.b;
   }

   public int[] k() {
      return this.f;
   }

   public String toString() {
      return this.f == null?"" + this.b:"" + this.b + ":" + z9.n(this.f);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
