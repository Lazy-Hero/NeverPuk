package net.y6;

import net.xn;
import net.y6.jb;

public class eh extends net.y6.z {
   jb o;
   jb S;
   jb G;
   jb W;

   public eh(int var1) {
      net.y6.z.W();
      super();
      this.o = new jb(this, 0, var1);
      this.o.U(-3.0F, 17.0F, -3.0F, 6, 6, 6);
      this.S = new jb(this, 32, 0);
      this.S.U(-3.25F, 18.0F, -3.5F, 2, 2, 2);
      this.G = new jb(this, 32, 4);
      this.G.U(1.25F, 18.0F, -3.5F, 2, 2, 2);
      this.W = new jb(this, 32, 8);
      this.W.U(0.0F, 21.0F, -3.5F, 1, 1, 1);
      this.o = new jb(this, 0, var1);
      this.o.U(-4.0F, 16.0F, -4.0F, 8, 8, 8);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.C();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      net.y.d.O(0.0F, 0.001F, 0.0F);
      this.o.B(var7);
      if(this.S != null) {
         this.S.B(var7);
         this.G.B(var7);
         this.W.B(var7);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
