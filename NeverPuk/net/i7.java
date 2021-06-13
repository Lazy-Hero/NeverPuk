package net;

import net._6;
import net.ij;
import net.xk;
import net.xn;
import net.z_;
import net.nn.j;
import net.u.d;
import net.z.t;

public class i7 {
   private final xk Z;
   private final ij U;
   private final String l;
   private final String W;
   private final int L;
   private final z_ x;
   private final _6 f;
   public double N;

   public i7(String var1, String var2, z_ var3, int var4, ij var5) {
      this.l = var1;
      z_.P();
      this.W = var2;
      this.L = var4;
      this.x = var3;
      this.f = new _6();
      this.U = var5;
      t var7 = new t(j.b());
      this.Z = new xk((float)(var7.u() - this.x()), (float)(var7.v() - 30));
      d.h(new d[5]);
   }

   public int x() {
      z_.P();
      int var10000 = Math.max(100, Math.max(this.U.s(this.l), this.U.s(this.W)) + 40);
      if(d.y() == null) {
         z_.X(new d[5]);
      }

      return var10000;
   }

   public String y() {
      return this.l;
   }

   public String B() {
      return this.W;
   }

   public int J() {
      return this.L;
   }

   public z_ G() {
      return this.x;
   }

   public _6 X() {
      return this.f;
   }

   public xk U() {
      return this.Z;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
