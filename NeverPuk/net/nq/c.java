package net.nq;

import net.xn;
import net.nq.x;
import net.u.j;
import net.yz.aq;

public class c {
   private final j O;
   private final j x;
   private final aq a;
   private int i;
   private boolean E;
   private int Z;

   public c(j var1, int var2, int var3, int var4) {
      this(var1, U(var2, var3), var4);
   }

   private static aq U(int var0, int var1) {
      int[] var2 = x.R();
      return var0 < 0?aq.WEST:(var0 > 0?aq.EAST:(var1 < 0?aq.NORTH:aq.SOUTH));
   }

   public c(j var1, aq var2, int var3) {
      this.O = var1;
      this.a = var2;
      this.x = var1.a(var2, 2);
      this.i = var3;
   }

   public int R(int var1, int var2, int var3) {
      return (int)this.O.s((double)var1, (double)var2, (double)var3);
   }

   public int C(j var1) {
      return (int)var1.n(this.a());
   }

   public int y(j var1) {
      return (int)this.x.n(var1);
   }

   public boolean w(j var1) {
      int var3 = var1.t() - this.O.t();
      x.R();
      int var4 = var1.y() - this.O.h();
      return var3 * this.a.v() + var4 * this.a.P() >= 0;
   }

   public void Q() {
      this.Z = 0;
   }

   public void D() {
      ++this.Z;
   }

   public int K() {
      return this.Z;
   }

   public j a() {
      return this.O;
   }

   public j h() {
      return this.x;
   }

   public int g() {
      return this.a.v() * 2;
   }

   public int O() {
      return this.a.P() * 2;
   }

   public int l() {
      return this.i;
   }

   public void l(int var1) {
      this.i = var1;
   }

   public boolean p() {
      return this.E;
   }

   public void f(boolean var1) {
      this.E = var1;
   }

   public aq f() {
      return this.a;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
