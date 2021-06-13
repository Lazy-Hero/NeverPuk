package net.nl;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.v;
import net.nl.z1;

public class o {
   private final int P;
   public final z1 M;
   public int d;
   public int Y;
   public int S;

   public o(z1 var1, int var2, int var3, int var4) {
      this.M = var1;
      this.P = var2;
      this.Y = var3;
      this.S = var4;
   }

   public void q(ks var1, ks var2) {
      int var3 = var2.U() - var1.U();
      this.O(var2, var3);
   }

   protected void O(ks var1, int var2) {
   }

   protected void p(int var1) {
   }

   protected void q(ks var1) {
   }

   public ks H(net.r.r var1, ks var2) {
      this.y();
      return var2;
   }

   public boolean s(ks var1) {
      return true;
   }

   public ks y() {
      return this.M.A(this.P);
   }

   public boolean T() {
      int var1 = v.Q();
      return !this.y().B();
   }

   public void e(ks var1) {
      this.M.S(this.P, var1);
      this.y();
   }

   public void y() {
      this.M.W();
   }

   public int t() {
      return this.M.m();
   }

   public int v(ks var1) {
      return this.t();
   }

   @Nullable
   public String L() {
      return null;
   }

   public ks h(int var1) {
      return this.M.W(this.P, var1);
   }

   public boolean e(z1 var1, int var2) {
      int var3 = v.Q();
      return var1 == this.M && var2 == this.P;
   }

   public boolean I(net.r.r var1) {
      return true;
   }

   public boolean c() {
      return true;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
