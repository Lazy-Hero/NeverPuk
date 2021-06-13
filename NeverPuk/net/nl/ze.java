package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.h;
import net.nl.v;
import net.nl.z1;

public class ze implements z1 {
   private final net.yz.w e;
   private final int F;
   private final int s;
   private final v y;

   public ze(v var1, int var2, int var3) {
      this.e = net.yz.w.C(var2 * var3, ks.a);
      this.y = var1;
      this.F = var2;
      this.s = var3;
   }

   public int e() {
      return this.e.size();
   }

   public boolean N() {
      for(ks var2 : this.e) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      return var1 >= this.e()?ks.a:(ks)this.e.get(var1);
   }

   public ks P(int var1, int var2) {
      int var3 = v.Q();
      return var1 >= 0 && var1 < this.F && var2 >= 0 && var2 <= this.s?this.A(var1 + var2 * this.F):ks.a;
   }

   public String Q() {
      return "container.crafting";
   }

   public boolean H() {
      return false;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public ks S(int var1) {
      return h.m(this.e, var1);
   }

   public ks W(int var1, int var2) {
      ks var3 = h.n(this.e, var1, var2);
      if(!var3.B()) {
         this.y.d(this);
      }

      return var3;
   }

   public void S(int var1, ks var2) {
      this.e.set(var1, var2);
      this.y.d(this);
   }

   public int m() {
      return 64;
   }

   public void W() {
   }

   public boolean m(net.r.r var1) {
      return true;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
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

   public void T() {
      this.e.clear();
   }

   public int X() {
      return this.s;
   }

   public int Q() {
      return this.F;
   }

   public void G(net.yf.p var1) {
      for(ks var3 : this.e) {
         var1.x(var3);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
