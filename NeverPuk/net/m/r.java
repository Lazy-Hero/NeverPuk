package net.m;

import java.io.IOException;
import net.yz.aq;

public class r implements net.n2.k {
   public net.u.j l;
   public aq u;
   public net.yz.k P;
   public float T;
   public float h;
   public float E;

   public r() {
   }

   public r(net.u.j var1, aq var2, net.yz.k var3, float var4, float var5, float var6) {
      this.l = var1;
      this.u = var2;
      this.P = var3;
      this.T = var4;
      this.h = var5;
      this.E = var6;
   }

   public void E(net.n2.h var1) throws IOException {
      this.l = var1.S();
      this.u = (aq)var1.S(aq.class);
      this.P = (net.yz.k)var1.S(net.yz.k.class);
      this.T = var1.readFloat();
      this.h = var1.readFloat();
      this.E = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.B(this.l);
      var1.A(this.u);
      var1.A(this.P);
      var1.writeFloat(this.T);
      var1.writeFloat(this.h);
      var1.writeFloat(this.E);
   }

   public void F(net.x.x var1) {
      var1.v(this);
   }

   public net.u.j g() {
      return this.l;
   }

   public aq x() {
      return this.u;
   }

   public net.yz.k o() {
      return this.P;
   }

   public float k() {
      return this.T;
   }

   public float u() {
      return this.h;
   }

   public float V() {
      return this.E;
   }
}
