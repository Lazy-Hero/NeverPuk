package net.e;

import com.google.common.base.MoreObjects;
import java.util.List;
import net.xn;
import net.e.k;
import net.p.n;
import net.p.p;
import net.p.u;

public class e {
   private final u J;
   private final List S;
   private final int d;

   public e(u var1, List var2, int var3) {
      this.J = var1;
      this.S = var2;
      this.d = var3;
   }

   public n i(int var1) {
      String var2 = k.k();
      return var1 >= 0 && var1 < this.S.size()?(n)MoreObjects.firstNonNull(this.S.get(var1), p.b):p.b;
   }

   public int K() {
      return this.d;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
