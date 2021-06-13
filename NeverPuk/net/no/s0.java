package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class s0 implements net.n2.k {
   private int N;
   private double Z;
   private double I;
   private double d;
   private int y;

   public s0() {
   }

   public s0(net.ne.l var1) {
      s8.Y();
      this.N = var1.G();
      this.Z = var1.b;
      this.I = var1.hS;
      this.d = var1.hr;
      if(var1 instanceof net.yi.e) {
         this.y = 1;
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.N = var1.q();
      this.y = var1.readByte();
      this.Z = var1.readDouble();
      this.I = var1.readDouble();
      this.d = var1.readDouble();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.N);
      var1.writeByte(this.y);
      var1.writeDouble(this.Z);
      var1.writeDouble(this.I);
      var1.writeDouble(this.d);
   }

   public void X(net.x.t var1) {
      var1.d(this);
   }

   public int X() {
      return this.N;
   }

   public double j() {
      return this.Z;
   }

   public double G() {
      return this.I;
   }

   public double N() {
      return this.d;
   }

   public int c() {
      return this.y;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
