package net.no;

import java.io.IOException;

public class q implements net.n2.k {
   private int P;
   private double g;
   private double p;
   private double w;
   private byte X;
   private byte J;
   private boolean Q;

   public q() {
   }

   public q(net.ne.l var1) {
      this.P = var1.G();
      this.g = var1.b;
      this.p = var1.hS;
      this.w = var1.hr;
      this.X = (byte)((int)(var1.hN * 256.0F / 360.0F));
      this.J = (byte)((int)(var1.V * 256.0F / 360.0F));
      this.Q = var1.k;
   }

   public void E(net.n2.h var1) throws IOException {
      this.P = var1.q();
      this.g = var1.readDouble();
      this.p = var1.readDouble();
      this.w = var1.readDouble();
      this.X = var1.readByte();
      this.J = var1.readByte();
      this.Q = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.P);
      var1.writeDouble(this.g);
      var1.writeDouble(this.p);
      var1.writeDouble(this.w);
      var1.writeByte(this.X);
      var1.writeByte(this.J);
      var1.writeBoolean(this.Q);
   }

   public void d(net.x.t var1) {
      var1.W(this);
   }

   public int F() {
      return this.P;
   }

   public double B() {
      return this.g;
   }

   public double S() {
      return this.p;
   }

   public double I() {
      return this.w;
   }

   public byte O() {
      return this.X;
   }

   public byte f() {
      return this.J;
   }

   public boolean I() {
      return this.Q;
   }
}
