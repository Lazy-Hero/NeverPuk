package net;

import net.mf;
import net.xn;

public class my {
   private final int t;
   private final int c;
   private final int z;
   private final String u;

   public my(int var1, int var2) {
      this(var1, var2, 0);
   }

   public my(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public my(int var1, int var2, int var3, String var4) {
      this.t = var1;
      this.c = var2;
      this.z = var3;
      this.u = var4;
   }

   public int S() {
      return this.t;
   }

   public int U() {
      return this.c;
   }

   public int m() {
      return this.z;
   }

   public int C() {
      String var1 = mf.O();
      return this.c > 9?this.t * 100 + this.c:(this.z > 9?this.t * 100 + this.c * 10 + 9:this.t * 100 + this.c * 10 + this.z);
   }

   public String toString() {
      String var1 = mf.O();
      return this.u == null?"" + this.t + "." + this.c + "." + this.z:"" + this.t + "." + this.c + "." + this.z + this.u;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
