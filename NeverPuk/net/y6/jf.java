package net.y6;

import net.xn;
import net.y6.ex;
import net.y6.j7;
import net.y6.jb;

public class jf {
   private final ex[] B;
   private final j7[] z;
   public final float Q;
   public final float H;
   public final float I;
   public final float r;
   public final float O;
   public final float p;
   public String S;

   public jf(jb var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var1.x);
   }

   public jf(jb var1, int[][] var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10) {
      this.Q = var3;
      this.H = var4;
      this.I = var5;
      this.r = var3 + var6;
      this.O = var4 + var7;
      this.p = var5 + var8;
      this.B = new ex[8];
      this.z = new j7[6];
      net.y6.z.C();
      float var12 = var3 + var6;
      float var13 = var4 + var7;
      float var14 = var5 + var8;
      var3 = var3 - var9;
      var4 = var4 - var9;
      var5 = var5 - var9;
      var12 = var12 + var9;
      var13 = var13 + var9;
      var14 = var14 + var9;
      ex var35 = new ex(var12, var4, var5, 0.0F, 0.0F);
      ex var16 = new ex(var3, var4, var5, 0.0F, 8.0F);
      ex var17 = new ex(var3, var13, var5, 8.0F, 8.0F);
      ex var18 = new ex(var12, var13, var5, 8.0F, 0.0F);
      ex var19 = new ex(var12, var4, var14, 0.0F, 0.0F);
      ex var20 = new ex(var3, var4, var14, 0.0F, 8.0F);
      ex var21 = new ex(var3, var13, var14, 8.0F, 8.0F);
      ex var22 = new ex(var12, var13, var14, 8.0F, 0.0F);
      this.B[0] = var35;
      this.B[1] = var16;
      this.B[2] = var17;
      this.B[3] = var18;
      this.B[4] = var19;
      this.B[5] = var20;
      this.B[6] = var21;
      this.B[7] = var22;
      this.z[0] = this.G(new ex[]{var20, var16, var17, var21}, var2[4], false, var1.E, var1.K);
      this.z[1] = this.G(new ex[]{var35, var19, var22, var18}, var2[5], false, var1.E, var1.K);
      this.z[2] = this.G(new ex[]{var20, var19, var35, var16}, var2[1], true, var1.E, var1.K);
      this.z[3] = this.G(new ex[]{var17, var18, var22, var21}, var2[0], true, var1.E, var1.K);
      this.z[4] = this.G(new ex[]{var16, var35, var18, var17}, var2[2], false, var1.E, var1.K);
      this.z[5] = this.G(new ex[]{var19, var20, var21, var22}, var2[3], false, var1.E, var1.K);
      j7[] var23 = this.z;
      int var24 = var23.length;
      int var25 = 0;
      if(var25 < var24) {
         j7 var26 = var23[var25];
         var26.J();
         ++var25;
      }

   }

   private j7 G(ex[] var1, int[] var2, boolean var3, float var4, float var5) {
      return null;
   }

   public jf(jb var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, boolean var11) {
      this.Q = var4;
      this.H = var5;
      this.I = var6;
      this.r = var4 + (float)var7;
      this.O = var5 + (float)var8;
      this.p = var6 + (float)var9;
      this.B = new ex[8];
      this.z = new j7[6];
      float var12 = var4 + (float)var7;
      float var13 = var5 + (float)var8;
      float var14 = var6 + (float)var9;
      var4 = var4 - var10;
      var5 = var5 - var10;
      var6 = var6 - var10;
      var12 = var12 + var10;
      var13 = var13 + var10;
      var14 = var14 + var10;
      ex var35 = new ex(var12, var5, var6, 0.0F, 0.0F);
      ex var16 = new ex(var4, var5, var6, 0.0F, 8.0F);
      ex var17 = new ex(var4, var13, var6, 8.0F, 8.0F);
      ex var18 = new ex(var12, var13, var6, 8.0F, 0.0F);
      ex var19 = new ex(var12, var5, var14, 0.0F, 0.0F);
      ex var20 = new ex(var4, var5, var14, 0.0F, 8.0F);
      ex var21 = new ex(var4, var13, var14, 8.0F, 8.0F);
      ex var22 = new ex(var12, var13, var14, 8.0F, 0.0F);
      this.B[0] = var35;
      this.B[1] = var16;
      this.B[2] = var17;
      this.B[3] = var18;
      this.B[4] = var19;
      this.B[5] = var20;
      this.B[6] = var21;
      this.B[7] = var22;
      this.z[0] = new j7(new ex[]{var20, var16, var17, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.E, var1.K);
      this.z[1] = new j7(new ex[]{var35, var19, var22, var18}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.E, var1.K);
      this.z[2] = new j7(new ex[]{var20, var19, var35, var16}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.E, var1.K);
      this.z[3] = new j7(new ex[]{var17, var18, var22, var21}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.E, var1.K);
      this.z[4] = new j7(new ex[]{var16, var35, var18, var17}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.E, var1.K);
      this.z[5] = new j7(new ex[]{var19, var20, var21, var22}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.E, var1.K);

      for(j7 var26 : this.z) {
         var26.J();
      }

   }

   public void M(net.y.p var1, float var2) {
      for(j7 var6 : this.z) {
         var6.h(var1, var2);
      }

   }

   public jf w(String var1) {
      this.S = var1;
      return this;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
