package net.ct;

import net.xn;
import net.ct.i;
import net.ct.t;

public class s extends i {
   public float E;
   public boolean p;
   private final float M;
   private final float U;
   private int X;

   public s(int var1, int var2, int var3, int var4, int var5, int var6) {
      this(var1, var2, var3, var4, var6, 0, 1.0F, (float)var5);
   }

   public s(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      super(var1, var2, var3, var4, 20, "");
      this.E = 1.0F;
      this.M = var7;
      this.U = var8;
      this.E = this.D((float)var6);
      this.j().J = this.F();
   }

   public String F() {
      return "";
   }

   public float D(float var1) {
      return net.u.t.T((this.a(var1) - this.M) / (this.U - this.M), 0.0F, 1.0F);
   }

   public float I(float var1) {
      return this.a(this.M + (this.U - this.M) * net.u.t.T(var1, 0.0F, 1.0F));
   }

   public float a(float var1) {
      var1 = this.H(var1);
      return net.u.t.T(var1, this.M, this.U);
   }

   protected float H(float var1) {
      int var2 = t.K();
      if(this.X > 0) {
         var1 = (float)(this.X * Math.round(var1 / (float)this.X));
      }

      return var1;
   }

   public int h(boolean var1) {
      return 0;
   }

   public void n(int var1, int var2) {
      int var3 = t.j();
      if(this.j().F) {
         if(this.p) {
            this.E = (float)(var1 - (this.j().D + 4)) / (float)(this.j().h() - 8);
            this.E = net.u.t.T(this.E, 0.0F, 1.0F);
            float var4 = this.I(this.E);
            this.D(var4);
            this.E = this.D(var4);
            this.j().J = this.F();
         }

         net.nn.j.b().n().E(C);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.p(this.j().D + (int)(this.E * (float)(this.j().h() - 8)), this.j().R, 0, 66, 4, 20);
         this.p(this.j().D + (int)(this.E * (float)(this.j().h() - 8)) + 4, this.j().R, 196, 66, 4, 20);
      }

   }

   public void T(int var1, int var2) {
      this.E = (float)(var1 - (this.j().D + 4)) / (float)(this.j().h() - 8);
      this.E = net.u.t.T(this.E, 0.0F, 1.0F);
      this.D(this.I(this.E));
      int var10000 = t.j();
      this.j().J = this.F();
      int var3 = var10000;
      this.p = true;
      if(net.u.d.y() == null) {
         ++var3;
         t.s(var3);
      }

   }

   public void D(float var1) {
   }

   public void H(int var1, int var2) {
      this.p = false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
