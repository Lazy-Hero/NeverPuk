package net.y6;

import net.xn;
import net.y6.jb;

public class k extends net.y6.z {
   private final jb J;
   private final jb I;
   private jb k;

   public k(float var1, boolean var2) {
      net.y6.z.C();
      super();
      this.I = new jb(this, "glass");
      this.I.k(0, 0).U(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.J = new jb(this, "cube");
      this.J.k(32, 0).U(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      this.k = new jb(this, "base");
      this.k.k(0, 16).U(-6.0F, 0.0F, -6.0F, 12, 4, 12);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y.d.c();
      net.y.d.W(2.0F, 2.0F, 2.0F);
      net.y6.z.C();
      net.y.d.O(0.0F, -0.5F, 0.0F);
      if(this.k != null) {
         this.k.B(var7);
      }

      net.y.d.P(var3, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.0F, 0.8F + var4, 0.0F);
      net.y.d.P(60.0F, 0.7071F, 0.0F, 0.7071F);
      this.I.B(var7);
      float var10000 = 0.875F;
      net.y.d.W(0.875F, 0.875F, 0.875F);
      net.y.d.P(60.0F, 0.7071F, 0.0F, 0.7071F);
      net.y.d.P(var3, 0.0F, 1.0F, 0.0F);
      this.I.B(var7);
      net.y.d.W(0.875F, 0.875F, 0.875F);
      net.y.d.P(60.0F, 0.7071F, 0.0F, 0.7071F);
      net.y.d.P(var3, 0.0F, 1.0F, 0.0F);
      this.J.B(var7);
      net.y.d.Y();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
