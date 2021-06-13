package net;

import java.io.Serializable;
import net.ra;

public abstract class uw implements Serializable, Cloneable {
   static final long serialVersionUID = -483782685323607044L;
   public byte m;
   public byte A;
   public byte Q;

   public uw(byte var1, byte var2, byte var3) {
      this.m = var1;
      this.A = var2;
      this.Q = var3;
   }

   public uw(byte[] var1) {
      this.m = var1[0];
      this.A = var1[1];
      this.Q = var1[2];
   }

   public uw(uw var1) {
      this.m = var1.m;
      this.A = var1.A;
      this.Q = var1.Q;
   }

   public uw() {
      this.m = 0;
      this.A = 0;
      this.Q = 0;
   }

   public String toString() {
      return "(" + (this.m & 255) + ", " + (this.A & 255) + ", " + (this.Q & 255) + ")";
   }

   public final void I(byte[] var1) {
      var1[0] = this.m;
      var1[1] = this.A;
      var1[2] = this.Q;
   }

   public final void K(uw var1) {
      var1.m = this.m;
      var1.A = this.A;
      var1.Q = this.Q;
   }

   public final void x(uw var1) {
      this.m = var1.m;
      this.A = var1.A;
      this.Q = var1.Q;
   }

   public final void Q(byte[] var1) {
      this.m = var1[0];
      this.A = var1[1];
      this.Q = var1[2];
   }

   public boolean F(uw var1) {
      return this.m == var1.m && this.A == var1.A && this.Q == var1.Q;
   }

   public boolean equals(Object var1) {
      String[] var2 = ra.C();
      uw var3 = (uw)var1;
      return this.m == var3.m && this.A == var3.A && this.Q == var3.Q;
   }

   public int hashCode() {
      return (this.m & 255) << 0 | (this.A & 255) << 8 | (this.Q & 255) << 16;
   }

   public Object clone() {
      return super.clone();
   }

   public final byte j() {
      return this.m;
   }

   public final void u(byte var1) {
      this.m = var1;
   }

   public final byte R() {
      return this.A;
   }

   public final void y(byte var1) {
      this.A = var1;
   }

   public final byte C() {
      return this.Q;
   }

   public final void x(byte var1) {
      this.Q = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
