package net.no;

import java.io.IOException;

public class m implements net.n2.k {
   private int K;
   private double t;
   private double Q;
   private double p;
   private int O;

   public m() {
   }

   public m(net.nm.s var1) {
      this.K = var1.G();
      this.t = var1.b;
      this.Q = var1.hS;
      this.p = var1.hr;
      this.O = var1.h();
   }

   public void E(net.n2.h var1) throws IOException {
      this.K = var1.q();
      this.t = var1.readDouble();
      this.Q = var1.readDouble();
      this.p = var1.readDouble();
      this.O = var1.readShort();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.K);
      var1.writeDouble(this.t);
      var1.writeDouble(this.Q);
      var1.writeDouble(this.p);
      var1.writeShort(this.O);
   }

   public void E(net.x.t var1) {
      var1.x(this);
   }

   public int R() {
      return this.K;
   }

   public double W() {
      return this.t;
   }

   public double e() {
      return this.Q;
   }

   public double a() {
      return this.p;
   }

   public int N() {
      return this.O;
   }
}
