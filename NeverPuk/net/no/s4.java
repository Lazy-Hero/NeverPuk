package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class s4 implements net.n2.k {
   private int b;
   private String C;

   public s4() {
   }

   public s4(int var1, net.nc.l var2) {
      s8.Y();
      super();
      this.b = var1;
      this.C = "";
      this.C = var2.e();
   }

   public void E(net.n2.h var1) throws IOException {
      this.b = var1.readByte();
      this.C = var1.Z(16);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.b);
      var1.R(this.C);
   }

   public void d(net.x.t var1) {
      var1.r(this);
   }

   public int E() {
      return this.b;
   }

   public String v() {
      return this.C;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
