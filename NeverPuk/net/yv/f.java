package net.yv;

import javax.annotation.concurrent.Immutable;
import net.xn;
import net.yv.r;

@Immutable
public class f {
   public static final f Q = new f("");
   private final String G;

   public f(String var1) {
      this.G = var1;
   }

   public boolean T() {
      net.u.d[] var1 = r.C();
      return this.G == null || this.G.isEmpty();
   }

   public String J() {
      return this.G;
   }

   public void e(net.nj.f var1) {
      var1.b("Lock", this.G);
   }

   public static f S(net.nj.f var0) {
      net.u.d[] var1 = r.C();
      if(var0.K("Lock", 8)) {
         String var2 = var0.J("Lock");
         return new f(var2);
      } else {
         return Q;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
