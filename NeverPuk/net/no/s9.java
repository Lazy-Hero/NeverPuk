package net.no;

import java.io.IOException;

public class s9 implements net.n2.k {
   private float h;
   private int b;
   private int d;

   public s9() {
   }

   public s9(float var1, int var2, int var3) {
      this.h = var1;
      this.b = var2;
      this.d = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.h = var1.readFloat();
      this.d = var1.q();
      this.b = var1.q();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeFloat(this.h);
      var1.a(this.d);
      var1.a(this.b);
   }

   public void s(net.x.t var1) {
      var1.E(this);
   }

   public float p() {
      return this.h;
   }

   public int f() {
      return this.b;
   }

   public int o() {
      return this.d;
   }
}
