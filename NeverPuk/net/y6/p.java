package net.y6;

import net.xn;
import net.y6.t;

public class p extends t {
   public p() {
      this(0.0F);
   }

   public p(float var1) {
      this(var1, 64, 32);
   }

   protected p(float var1, int var2, int var3) {
      super(var1, 0.0F, var2, var3);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      boolean var8 = net.y6.z.W();
      if(var7 instanceof net.nm.z) {
         net.nm.z var9 = (net.nm.z)var7;
         this.G.b = 0.017453292F * var9.u().D();
         this.G.N = 0.017453292F * var9.u().L();
         this.G.c = 0.017453292F * var9.u().K();
         this.G.n(0.0F, 1.0F, 0.0F);
         this.N.b = 0.017453292F * var9.G().D();
         this.N.N = 0.017453292F * var9.G().L();
         this.N.c = 0.017453292F * var9.G().K();
         this.B.b = 0.017453292F * var9.o().D();
         this.B.N = 0.017453292F * var9.o().L();
         this.B.c = 0.017453292F * var9.o().K();
         this.A.b = 0.017453292F * var9.Y().D();
         this.A.N = 0.017453292F * var9.Y().L();
         this.A.c = 0.017453292F * var9.Y().K();
         this.a.b = 0.017453292F * var9.O().D();
         this.a.N = 0.017453292F * var9.O().L();
         this.a.c = 0.017453292F * var9.O().K();
         this.a.n(1.9F, 11.0F, 0.0F);
         this.H.b = 0.017453292F * var9.b().D();
         this.H.N = 0.017453292F * var9.b().L();
         this.H.c = 0.017453292F * var9.b().K();
         this.H.n(-1.9F, 11.0F, 0.0F);
         b(this.G, this.P);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
