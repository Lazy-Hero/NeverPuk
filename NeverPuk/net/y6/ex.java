package net.y6;

public class ex {
   public net.u.r Q;
   public float v;
   public float c;

   public ex(float var1, float var2, float var3, float var4, float var5) {
      this(new net.u.r((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public ex i(float var1, float var2) {
      return new ex(this, var1, var2);
   }

   public ex(ex var1, float var2, float var3) {
      this.Q = var1.Q;
      this.v = var2;
      this.c = var3;
   }

   public ex(net.u.r var1, float var2, float var3) {
      this.Q = var1;
      this.v = var2;
      this.c = var3;
   }
}
