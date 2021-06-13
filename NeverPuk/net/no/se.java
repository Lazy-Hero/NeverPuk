package net.no;

import java.io.IOException;
import javax.annotation.Nullable;

public class se implements net.n2.k {
   private int B;
   private net.n_.f N;

   public se() {
   }

   public se(int var1, net.n_.f var2) {
      this.B = var1;
      this.N = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.B = var1.q();
      this.N = net.n_.f.Q(var1.readUnsignedByte());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.B);
      var1.writeByte(net.n_.f.N(this.N));
   }

   public void u(net.x.t var1) {
      var1.f(this);
   }

   @Nullable
   public net.ne.l l(net.yv.r var1) {
      return var1.S(this.B);
   }

   @Nullable
   public net.n_.f j() {
      return this.N;
   }
}
