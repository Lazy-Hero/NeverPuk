package net.no;

import java.io.IOException;

public class sh implements net.n2.k {
   private double c;
   private double q;
   private double C;
   private float S;
   private float L;

   public sh() {
   }

   public sh(net.ne.l var1) {
      this.c = var1.b;
      this.q = var1.hS;
      this.C = var1.hr;
      this.S = var1.hN;
      this.L = var1.V;
   }

   public void E(net.n2.h var1) throws IOException {
      this.c = var1.readDouble();
      this.q = var1.readDouble();
      this.C = var1.readDouble();
      this.S = var1.readFloat();
      this.L = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeDouble(this.c);
      var1.writeDouble(this.q);
      var1.writeDouble(this.C);
      var1.writeFloat(this.S);
      var1.writeFloat(this.L);
   }

   public void w(net.x.t var1) {
      var1.Z(this);
   }

   public double W() {
      return this.c;
   }

   public double L() {
      return this.q;
   }

   public double S() {
      return this.C;
   }

   public float J() {
      return this.S;
   }

   public float P() {
      return this.L;
   }
}
