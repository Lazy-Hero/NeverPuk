package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class i0 implements net.n2.k {
   private net.cb.t b;
   private net.cb.c N;

   public i0() {
   }

   public i0(net.cb.t var1) {
      this(var1, net.cb.c.SYSTEM);
   }

   public i0(net.cb.t var1, net.cb.c var2) {
      this.b = var1;
      this.N = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.b = var1.g();
      this.N = net.cb.c.m(var1.readByte());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.p(this.b);
      var1.writeByte(this.N.N());
   }

   public void C(net.x.t var1) {
      var1.r(this);
   }

   public net.cb.t O() {
      return this.b;
   }

   public boolean l() {
      int var1 = s8.x();
      return this.N == net.cb.c.SYSTEM || this.N == net.cb.c.GAME_INFO;
   }

   public net.cb.c Z() {
      return this.N;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
