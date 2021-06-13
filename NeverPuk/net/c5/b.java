package net.c5;

import net.xn;
import net.c5.e;
import net.n0.kw;
import net.u.d;
import net.yz.aq;
import net.yz.m_;

public class b extends e {
   private static final m_[] T;
   private net.y6.u q = new net.y6.u();
   private int t;

   public b() {
      this.t = this.q.M();
   }

   public void G(net.ni.y var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d[] var11 = e.F();
      if(this.t != this.q.M()) {
         this.q = new net.y6.u();
         this.t = this.q.M();
      }

      boolean var12 = var1.B() != null;
      boolean var13 = true;
      kw var14 = var1 != null?var1.f():kw.RED;
      byte var15 = 0;
      if(var9 >= 0) {
         this.L(L[var9]);
         net.y.d.G(5890);
         net.y.d.c();
         net.y.d.W(4.0F, 4.0F, 1.0F);
         net.y.d.O(0.0625F, 0.0625F, 0.0625F);
         net.y.d.G(5888);
      }

      m_ var16 = T[var14.d()];
      this.L(var16);
      this.W(var13, var2, var4, var6, var15, var10);
      net.y.d.c();
      this.W(true, var2, var4, var6, var15, var10);
      this.W(false, var2, var4, var6 - 1.0D, var15, var10);
      net.y.d.Y();
      if(var9 >= 0) {
         net.y.d.G(5890);
         net.y.d.Y();
         net.y.d.G(5888);
      }

   }

   private void W(boolean var1, double var2, double var4, double var6, int var8, float var9) {
      this.q.q(var1);
      net.y.d.c();
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      if(var8 == aq.NORTH.u()) {
         var10 = 0.0F;
      } else if(var8 == aq.SOUTH.u()) {
         var10 = 180.0F;
         var11 = 1.0F;
         var12 = 1.0F;
      } else if(var8 == aq.WEST.u()) {
         var10 = -90.0F;
         var12 = 1.0F;
      } else if(var8 == aq.EAST.u()) {
         var10 = 90.0F;
         var11 = 1.0F;
      }

      net.y.d.O((float)var2 + var11, (float)var4 + 0.5625F, (float)var6 + var12);
      net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.P(var10, 0.0F, 0.0F, 1.0F);
      net.y.d.F();
      net.y.d.c();
      this.q.v();
      net.y.d.Y();
      net.y.d.T(1.0F, 1.0F, 1.0F, var9);
      net.y.d.Y();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
