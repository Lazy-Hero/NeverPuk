package net.ni;

import net.ni.v;

public class t extends v {
   private int z;

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.r("OutputSignal", this.z);
      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.z = var1.P("OutputSignal");
   }

   public int j() {
      return this.z;
   }

   public void D(int var1) {
      this.z = var1;
   }
}
