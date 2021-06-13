package net.m;

import java.io.IOException;
import javax.annotation.Nullable;
import net.xc;
import net.m.qo;
import net.yz.m_;

public class y implements net.n2.k {
   private y.m O;
   private m_ b;

   public y() {
   }

   public y(y.m var1, @Nullable m_ var2) {
      this.O = var1;
      this.b = var2;
   }

   public static y M(xc var0) {
      return new y(y.m.OPENED_TAB, var0.S());
   }

   public static y b() {
      return new y(y.m.CLOSED_SCREEN, (m_)null);
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.O = (y.m)var1.S(y.m.class);
      if(this.O == y.m.OPENED_TAB) {
         this.b = var1.z();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      net.u.d[] var2 = qo.y();
      var1.A(this.O);
      if(this.O == y.m.OPENED_TAB) {
         var1.Q(this.b);
      }

   }

   public void r(net.x.x var1) {
      var1.G(this);
   }

   public y.m D() {
      return this.O;
   }

   public m_ y() {
      return this.b;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum m {
      OPENED_TAB,
      CLOSED_SCREEN;
   }
}
