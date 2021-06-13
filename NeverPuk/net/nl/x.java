package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.a;
import net.nl.v;
import net.nl.z1;

public class x implements net.yv.x {
   private final String f;
   private final net.yv.x R;
   private final net.yv.x V;

   public x(String var1, net.yv.x var2, net.yv.x var3) {
      v.N();
      this.f = var1;
      if(var2 == null) {
         var2 = var3;
      }

      if(var3 == null) {
         var3 = var2;
      }

      this.R = var2;
      this.V = var3;
      if(var2.U()) {
         var3.P(var2.z());
      }

      if(var3.U()) {
         var2.P(var3.z());
      }

   }

   public int e() {
      return this.R.e() + this.V.e();
   }

   public boolean N() {
      return this.R.N() && this.V.N();
   }

   public boolean g(z1 var1) {
      return this.R == var1 || this.V == var1;
   }

   public String Q() {
      return this.R.H()?this.R.Q():(this.V.H()?this.V.Q():this.f);
   }

   public boolean H() {
      return this.R.H() || this.V.H();
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public ks A(int var1) {
      return var1 >= this.R.e()?this.V.A(var1 - this.R.e()):this.R.A(var1);
   }

   public ks W(int var1, int var2) {
      return var1 >= this.R.e()?this.V.W(var1 - this.R.e(), var2):this.R.W(var1, var2);
   }

   public ks S(int var1) {
      return var1 >= this.R.e()?this.V.S(var1 - this.R.e()):this.R.S(var1);
   }

   public void S(int var1, ks var2) {
      if(var1 >= this.R.e()) {
         this.V.S(var1 - this.R.e(), var2);
      } else {
         this.R.S(var1, var2);
      }

   }

   public int m() {
      return this.R.m();
   }

   public void W() {
      this.R.W();
      this.V.W();
   }

   public boolean m(net.r.r var1) {
      return this.R.m(var1) && this.V.m(var1);
   }

   public void o(net.r.r var1) {
      this.R.o(var1);
      this.V.o(var1);
   }

   public void b(net.r.r var1) {
      this.R.b(var1);
      this.V.b(var1);
   }

   public boolean s(int var1, ks var2) {
      return true;
   }

   public int e(int var1) {
      return 0;
   }

   public void Z(int var1, int var2) {
   }

   public int r() {
      return 0;
   }

   public boolean U() {
      return this.R.U() || this.V.U();
   }

   public void P(net.yv.f var1) {
      this.R.P(var1);
      this.V.P(var1);
   }

   public net.yv.f z() {
      return this.R.z();
   }

   public String H() {
      return this.R.H();
   }

   public v A(net.r.i var1, net.r.r var2) {
      return new a(var1, this, var2);
   }

   public void T() {
      this.R.T();
      this.V.T();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
