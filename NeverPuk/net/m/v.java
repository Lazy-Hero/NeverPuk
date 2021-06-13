package net.m;

import java.io.IOException;
import net.xn;
import net.m.qo;

public class v implements net.n2.k {
   private String B;

   public v() {
   }

   public v(String var1) {
      qo.y();
      super();
      if(var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.B = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.B = var1.Z(256);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.B);
   }

   public void I(net.x.x var1) {
      var1.p(this);
   }

   public String d() {
      return this.B;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
