package net.v;

import net.cb.t;
import net.v.g;
import net.v.n;
import net.v.q;

public class o extends n {
   public o(String var1, t var2, g var3) {
      super(var1, var2, var3);
   }

   public o(String var1, t var2) {
      super(var1, var2);
   }

   public n i() {
      super.i();
      q.L.add(this);
      return this;
   }
}
