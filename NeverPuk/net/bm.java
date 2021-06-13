package net;

import java.io.Serializable;
import net.ra;

public abstract class bm implements Serializable, Cloneable {
   static final long serialVersionUID = -8226727741811898211L;
   public byte T;
   public byte I;
   public byte y;
   public byte v;

   public bm(byte var1, byte var2, byte var3, byte var4) {
      this.T = var1;
      this.I = var2;
      this.y = var3;
      this.v = var4;
   }

   public bm(byte[] var1) {
      this.T = var1[0];
      this.I = var1[1];
      this.y = var1[2];
      this.v = var1[3];
   }

   public bm(bm var1) {
      this.T = var1.T;
      this.I = var1.I;
      this.y = var1.y;
      this.v = var1.v;
   }

   public bm() {
      this.T = 0;
      this.I = 0;
      this.y = 0;
      this.v = 0;
   }

   public String toString() {
      return "(" + (this.T & 255) + ", " + (this.I & 255) + ", " + (this.y & 255) + ", " + (this.v & 255) + ")";
   }

   public final void y(byte[] var1) {
      var1[0] = this.T;
      var1[1] = this.I;
      var1[2] = this.y;
      var1[3] = this.v;
   }

   public final void u(bm var1) {
      var1.T = this.T;
      var1.I = this.I;
      var1.y = this.y;
      var1.v = this.v;
   }

   public final void X(bm var1) {
      this.T = var1.T;
      this.I = var1.I;
      this.y = var1.y;
      this.v = var1.v;
   }

   public final void o(byte[] var1) {
      this.T = var1[0];
      this.I = var1[1];
      this.y = var1[2];
      this.v = var1[3];
   }

   public boolean C(bm var1) {
      return this.T == var1.T && this.I == var1.I && this.y == var1.y && this.v == var1.v;
   }

   public boolean equals(Object var1) {
      String[] var2 = ra.C();
      bm var3 = (bm)var1;
      return this.T == var3.T && this.I == var3.I && this.y == var3.y && this.v == var3.v;
   }

   public int hashCode() {
      return (this.T & 255) << 0 | (this.I & 255) << 8 | (this.y & 255) << 16 | (this.v & 255) << 24;
   }

   public Object clone() {
      return super.clone();
   }

   public final byte F() {
      return this.T;
   }

   public final void E(byte var1) {
      this.T = var1;
   }

   public final byte M() {
      return this.I;
   }

   public final void S(byte var1) {
      this.I = var1;
   }

   public final byte b() {
      return this.y;
   }

   public final void M(byte var1) {
      this.y = var1;
   }

   public final byte P() {
      return this.v;
   }

   public final void t(byte var1) {
      this.v = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
