package net.ni;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.v;
import net.ni.w;
import net.yz.m_;

public class m extends v {
   private net.n0.y j;
   private int A;

   public m() {
   }

   public m(net.n0.y var1, int var2) {
      this.j = var1;
      this.A = var2;
   }

   public static void d(net.c0.d var0) {
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      w.C();
      m_ var3 = (m_)net.n0.y.V.t(this.j);
      var1.b("Item", var3 == null?"":var3.toString());
      var1.r("Data", this.A);
      return var1;
   }

   public void G(net.nj.f var1) {
      int[] var2 = w.C();
      super.G(var1);
      if(var1.K("Item", 8)) {
         this.j = net.n0.y.H(var1.J("Item"));
      }

      this.j = net.n0.y.k(var1.P("Item"));
      this.A = var1.P("Data");
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 5, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public void U(ks var1) {
      this.j = var1.Z();
      this.A = var1.n();
   }

   public ks S() {
      return this.j == null?ks.a:new ks(this.j, 1, this.A);
   }

   @Nullable
   public net.n0.y X() {
      return this.j;
   }

   public int m() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
