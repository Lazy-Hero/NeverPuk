package net.z;

import java.util.List;

public abstract class s extends net.z.z {
   protected final net.nn.j Y;
   protected final List u;

   public s(net.nn.j var1, int var2, int var3, List var4) {
      super(var1, var2, var3, 32, var3 - 55 + 4, 36);
      this.Y = var1;
      this.u = var4;
      this.K = false;
      this.y(true, (int)((float)var1.sO.R * 1.5F));
   }

   protected void A(int var1, int var2, net.y.r var3) {
      String var4 = net.cb.z.UNDERLINE + "" + net.cb.z.BOLD + this.N();
      this.Y.sO.v(var4, (float)(var1 + this.x / 2 - this.Y.sO.r(var4) / 2), (float)Math.min(this.a + 3, var2), 16777215);
   }

   protected abstract String N();

   public List g() {
      return this.u;
   }

   protected int V() {
      return this.g().size();
   }

   public net.c9.u v(int var1) {
      return (net.c9.u)this.g().get(var1);
   }

   public int C() {
      return this.x;
   }

   protected int I() {
      return this.y - 6;
   }
}
