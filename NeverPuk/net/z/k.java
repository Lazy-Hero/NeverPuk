package net.z;

import net.xn;
import net.z.g;
import net.z.t9;

public class k implements net.z.z {
   private final t9 L;
   protected final net.nn.j x;
   protected final net.yp.o W;
   private long c;

   protected k(t9 var1, net.yp.o var2) {
      this.L = var1;
      this.W = var2;
      this.x = net.nn.j.b();
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      g.C();
      this.x.sO.v(net.c9.b.x("lanServer.title", new Object[0]), (float)(var2 + 32 + 3), (float)(var3 + 1), 16777215);
      this.x.sO.v(this.W.Z(), (float)(var2 + 32 + 3), (float)(var3 + 12), 8421504);
      if(this.x.T.n) {
         this.x.sO.v(net.c9.b.x("selectServer.hiddenAddress", new Object[0]), (float)(var2 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      }

      this.x.sO.v(this.W.o(), (float)(var2 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
   }

   public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
      g.B();
      this.L.M(var1);
      if(Long.compare(net.nn.j.E() - this.c, 250L) < 0) {
         this.L.v();
      }

      this.c = net.nn.j.E();
      return false;
   }

   public void h(int var1, int var2, int var3, float var4) {
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public net.yp.o k() {
      return this.W;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
