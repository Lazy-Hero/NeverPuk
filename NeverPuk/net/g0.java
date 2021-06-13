package net;

import net.mf;
import net.xn;
import net.yz.aq;

public class g0 {
   private float p;
   private float V;
   private float I;
   private float t;
   private float u;
   private float q;

   public g0(int[] var1) {
      mf.O();
      this.p = Float.MAX_VALUE;
      this.V = Float.MAX_VALUE;
      this.I = Float.MAX_VALUE;
      this.t = -3.4028235E38F;
      this.u = -3.4028235E38F;
      this.q = -3.4028235E38F;
      int var3 = var1.length / 4;
      int var4 = 0;
      int var5 = var4 * var3;
      float var6 = Float.intBitsToFloat(var1[var5 + 0]);
      float var7 = Float.intBitsToFloat(var1[var5 + 1]);
      float var8 = Float.intBitsToFloat(var1[var5 + 2]);
      if(Float.compare(this.p, var6) > 0) {
         this.p = var6;
      }

      if(Float.compare(this.V, var7) > 0) {
         this.V = var7;
      }

      if(Float.compare(this.I, var8) > 0) {
         this.I = var8;
      }

      if(Float.compare(this.t, var6) < 0) {
         this.t = var6;
      }

      if(Float.compare(this.u, var7) < 0) {
         this.u = var7;
      }

      if(this.q < var8) {
         this.q = var8;
      }

      ++var4;
   }

   public float F() {
      return this.p;
   }

   public float w() {
      return this.V;
   }

   public float L() {
      return this.I;
   }

   public float S() {
      return this.t;
   }

   public float m() {
      return this.u;
   }

   public float a() {
      return this.q;
   }

   public boolean g(aq var1) {
      float var2;
      float var3;
      float var4;
      switch(null.r[var1.ordinal()]) {
      case 1:
         var2 = this.w();
         var3 = this.m();
         var4 = 0.0F;
         break;
      case 2:
         var2 = this.w();
         var3 = this.m();
         var4 = 1.0F;
         break;
      case 3:
         var2 = this.L();
         var3 = this.a();
         var4 = 0.0F;
         break;
      case 4:
         var2 = this.L();
         var3 = this.a();
         var4 = 1.0F;
         break;
      case 5:
         var2 = this.F();
         var3 = this.S();
         var4 = 0.0F;
         break;
      case 6:
         var2 = this.F();
         var3 = this.S();
         var4 = 1.0F;
         break;
      default:
         return false;
      }

      return var2 == var4 && var3 == var4;
   }

   public boolean j(aq var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      switch(null.r[var1.ordinal()]) {
      case 1:
      case 2:
         var2 = this.F();
         var3 = this.S();
         var4 = this.L();
         var5 = this.a();
         break;
      case 3:
      case 4:
         var2 = this.F();
         var3 = this.S();
         var4 = this.w();
         var5 = this.m();
         break;
      case 5:
      case 6:
         var2 = this.w();
         var3 = this.m();
         var4 = this.L();
         var5 = this.a();
         break;
      default:
         return false;
      }

      return var2 == 0.0F && var3 == 1.0F && var4 == 0.0F && var5 == 1.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
