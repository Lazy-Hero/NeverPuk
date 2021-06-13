package net.no;

import java.io.IOException;
import net.n0.ks;

public class r implements net.n2.k {
   private int n;
   private int J;
   private ks a = ks.a;

   public r() {
   }

   public r(int var1, int var2, ks var3) {
      this.n = var1;
      this.J = var2;
      this.a = var3.s();
   }

   public void F(net.x.t var1) {
      var1.S(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.n = var1.readByte();
      this.J = var1.readShort();
      this.a = var1.C();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.n);
      var1.writeShort(this.J);
      var1.D(this.a);
   }

   public int z() {
      return this.n;
   }

   public int o() {
      return this.J;
   }

   public ks h() {
      return this.a;
   }
}
