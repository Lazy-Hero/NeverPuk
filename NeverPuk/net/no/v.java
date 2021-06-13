package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class v implements net.n2.k {
   private int W;
   private byte p;
   private byte d;
   private int b;
   private byte P;

   public v() {
   }

   public v(int var1, net.n_.i var2) {
      s8.Y();
      this.W = var1;
      this.p = (byte)(net.n_.f.N(var2.i()) & 255);
      this.d = (byte)(var2.d() & 255);
      if(var2.S() > 32767) {
         this.b = 32767;
      }

      this.b = var2.S();
      this.P = 0;
      if(var2.b()) {
         this.P = (byte)(this.P | 1);
      }

      if(var2.q()) {
         this.P = (byte)(this.P | 2);
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.W = var1.q();
      this.p = var1.readByte();
      this.d = var1.readByte();
      this.b = var1.q();
      this.P = var1.readByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.W);
      var1.writeByte(this.p);
      var1.writeByte(this.d);
      var1.a(this.b);
      var1.writeByte(this.P);
   }

   public boolean w() {
      return this.b == 32767;
   }

   public void h(net.x.t var1) {
      var1.H(this);
   }

   public int P() {
      return this.W;
   }

   public byte m() {
      return this.p;
   }

   public byte J() {
      return this.d;
   }

   public int R() {
      return this.b;
   }

   public boolean R() {
      return (this.P & 2) == 2;
   }

   public boolean L() {
      return (this.P & 1) == 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
