package net;

import java.util.Iterator;
import net._f;
import net.ud;
import net.n5.m;
import net.u.j;

public class w6 implements Iterator {
   private final net.y.uu y;
   private final ud m;
   private final _f c = new _f(0, 0, 0);

   public w6(net.y.uu var1, j var2, j var3, int var4, int var5) {
      this.y = var1;
      this.m = new ud(var2, var3, var4, var5);
   }

   public boolean hasNext() {
      return this.m.hasNext();
   }

   public m O() {
      j var1 = this.m.S();
      this.c.S(var1.t() << 4, var1.h() << 4, var1.y() << 4);
      m var2 = this.y.J(this.c);
      return var2;
   }

   public void remove() {
      throw new RuntimeException("Not implemented");
   }
}
