package net.l;

import net.xn;
import net.l.q;
import net.nb.f;
import net.y9.l;

public class o {
   private static final net.yw.n z = f.ou.p();
   private final char[] h = new char[65536];

   public net.yw.n b(int var1, int var2, int var3) {
      q.O();
      net.yw.n var5 = (net.yw.n)l.x.j(this.h[r(var1, var2, var3)]);
      return var5 == null?z:var5;
   }

   public void Q(int var1, int var2, int var3, net.yw.n var4) {
      this.h[r(var1, var2, var3)] = (char)l.x.X(var4);
   }

   private static int r(int var0, int var1, int var2) {
      return var0 << 12 | var2 << 8 | var1;
   }

   public int a(int var1, int var2) {
      int var4 = (var1 << 12 | var2 << 8) + 256 - 1;
      q.O();
      int var5 = 255;
      net.yw.n var6 = (net.yw.n)l.x.j(this.h[var4 + var5]);
      if(var6 != z) {
         return var5;
      } else {
         --var5;
         return 0;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
