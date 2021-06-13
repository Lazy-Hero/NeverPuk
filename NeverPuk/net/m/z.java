package net.m;

import java.io.IOException;
import net.xn;
import net.m.qo;

public class z implements net.n2.k {
   private net.u.j G;
   private String[] A;

   public z() {
   }

   public z(net.u.j var1, net.cb.t[] var2) {
      qo.y();
      super();
      this.G = var1;
      this.A = new String[]{var2[0].l(), var2[1].l(), var2[2].l(), var2[3].l()};
      if(net.u.d.y() == null) {
         qo.e(new net.u.d[2]);
      }

   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.G = var1.S();
      this.A = new String[4];
      int var3 = 0;
      this.A[var3] = var1.Z(384);
      ++var3;
   }

   public void O(net.n2.h var1) throws IOException {
      qo.y();
      var1.B(this.G);
      int var3 = 0;
      var1.R(this.A[var3]);
      ++var3;
   }

   public void J(net.x.x var1) {
      var1.D(this);
   }

   public net.u.j a() {
      return this.G;
   }

   public String[] U() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
