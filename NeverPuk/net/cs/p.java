package net.cs;

import java.io.IOException;
import net.cb.t;
import net.n2.k;
import net.ya.s;

public class p implements k {
   private t v;

   public p() {
   }

   public p(t var1) {
      this.v = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.v = t.w.h(var1.Z(32767));
   }

   public void O(net.n2.h var1) throws IOException {
      var1.p(this.v);
   }

   public void v(s var1) {
      var1.H(this);
   }

   public t X() {
      return this.v;
   }
}
