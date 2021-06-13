package net.no;

import java.io.IOException;
import net.no.s8;

public class c implements net.n2.k {
   private boolean W;
   private boolean B;
   private boolean A;
   private boolean o;
   private float g;
   private float F;

   public c() {
   }

   public c(net.r.n var1) {
      this.I(var1.T);
      this.k(var1.n);
      this.q(var1.P);
      this.e(var1.V);
      this.L(var1.m());
      this.W(var1.V());
   }

   public void E(net.n2.h var1) throws IOException {
      s8.Y();
      byte var3 = var1.readByte();
      this.I((var3 & 1) > 0);
      this.k((var3 & 2) > 0);
      this.q((var3 & 4) > 0);
      this.e((var3 & 8) > 0);
      this.L(var1.readFloat());
      this.W(var1.readFloat());
   }

   public void O(net.n2.h var1) throws IOException {
      byte var2 = 0;
      if(this.P()) {
         var2 = (byte)(var2 | 1);
      }

      if(this.w()) {
         var2 = (byte)(var2 | 2);
      }

      if(this.R()) {
         var2 = (byte)(var2 | 4);
      }

      if(this.k()) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeFloat(this.g);
      var1.writeFloat(this.F);
   }

   public void y(net.x.t var1) {
      var1.s(this);
   }

   public boolean P() {
      return this.W;
   }

   public void I(boolean var1) {
      this.W = var1;
   }

   public boolean w() {
      return this.B;
   }

   public void k(boolean var1) {
      this.B = var1;
   }

   public boolean R() {
      return this.A;
   }

   public void q(boolean var1) {
      this.A = var1;
   }

   public boolean k() {
      return this.o;
   }

   public void e(boolean var1) {
      this.o = var1;
   }

   public float F() {
      return this.g;
   }

   public void L(float var1) {
      this.g = var1;
   }

   public float m() {
      return this.F;
   }

   public void W(float var1) {
      this.F = var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
