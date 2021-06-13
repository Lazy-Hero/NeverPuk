package net.yz;

public class a6 {
   public static float A(float var0, float var1, float var2) {
      float var3 = 2.0F + var2 / 4.0F;
      float var4 = net.u.t.T(var1 - var0 / var3, var1 * 0.2F, 20.0F);
      return var0 * (1.0F - var4 / 25.0F);
   }

   public static float S(float var0, float var1) {
      float var2 = net.u.t.T(var1, 0.0F, 20.0F);
      return var0 * (1.0F - var2 / 25.0F);
   }
}
