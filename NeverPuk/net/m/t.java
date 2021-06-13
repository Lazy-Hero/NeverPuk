package net.m;

import java.io.IOException;

public class t implements net.n2.k {
   private double X;
   private double l;
   private double o;
   private float m;
   private float H;

   public t() {
   }

   public t(net.ne.l var1) {
      this.X = var1.b;
      this.l = var1.hS;
      this.o = var1.hr;
      this.m = var1.hN;
      this.H = var1.V;
   }

   public void E(net.n2.h var1) throws IOException {
      this.X = var1.readDouble();
      this.l = var1.readDouble();
      this.o = var1.readDouble();
      this.m = var1.readFloat();
      this.H = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeDouble(this.X);
      var1.writeDouble(this.l);
      var1.writeDouble(this.o);
      var1.writeFloat(this.m);
      var1.writeFloat(this.H);
   }

   public void x(net.x.x var1) {
      var1.f(this);
   }

   public double U() {
      return this.X;
   }

   public double T() {
      return this.l;
   }

   public double q() {
      return this.o;
   }

   public float Z() {
      return this.m;
   }

   public float g() {
      return this.H;
   }
}
