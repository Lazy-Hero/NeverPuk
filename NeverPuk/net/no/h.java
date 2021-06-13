package net.no;

import java.io.IOException;

public class h implements net.n2.k {
   private float d;
   private int b;
   private float n;

   public h() {
   }

   public h(float var1, int var2, float var3) {
      this.d = var1;
      this.b = var2;
      this.n = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.d = var1.readFloat();
      this.b = var1.q();
      this.n = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeFloat(this.d);
      var1.a(this.b);
      var1.writeFloat(this.n);
   }

   public void F(net.x.t var1) {
      var1.a(this);
   }

   public float d() {
      return this.d;
   }

   public int X() {
      return this.b;
   }

   public float V() {
      return this.n;
   }
}
