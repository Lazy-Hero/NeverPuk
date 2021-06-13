package net.nz;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.ne.l;
import net.nz.t;
import net.nz.v;
import net.u.d;
import net.u.e;
import net.u.j;

public class p {
   private final List z = Lists.newArrayList();
   private double B;
   private double h;
   private double y = 6.0E7D;
   private double P;
   private long H;
   private long Y;
   private int f;
   private double d;
   private double s;
   private int L;
   private int m;
   private static int v;

   public p() {
      this.P = this.y;
      this.f = 29999984;
      this.d = 0.2D;
      this.s = 5.0D;
      this.L = 15;
      this.m = 5;
   }

   public boolean U(j var1) {
      return (double)(var1.t() + 1) > this.S() && (double)var1.t() < this.M() && (double)(var1.y() + 1) > this.U() && (double)var1.y() < this.Z();
   }

   public boolean s(net.u.p var1) {
      return (double)var1.S() > this.S() && (double)var1.e() < this.M() && (double)var1.o() > this.U() && (double)var1.P() < this.Z();
   }

   public boolean V(e var1) {
      return var1.d > this.S() && var1.n < this.M() && var1.r > this.U() && var1.N < this.Z();
   }

   public double H(l var1) {
      return this.M(var1.b, var1.hr);
   }

   public double M(double var1, double var3) {
      double var5 = var3 - this.U();
      double var7 = this.Z() - var3;
      double var9 = var1 - this.S();
      double var11 = this.M() - var1;
      double var13 = Math.min(var9, var11);
      var13 = Math.min(var13, var5);
      return Math.min(var13, var7);
   }

   public t t() {
      return this.P < this.y?t.SHRINKING:(this.P > this.y?t.GROWING:t.STATIONARY);
   }

   public double S() {
      double var1 = this.s() - this.b() / 2.0D;
      if(var1 < (double)(-this.f)) {
         var1 = (double)(-this.f);
      }

      return var1;
   }

   public double U() {
      double var1 = this.A() - this.b() / 2.0D;
      if(var1 < (double)(-this.f)) {
         var1 = (double)(-this.f);
      }

      return var1;
   }

   public double M() {
      double var1 = this.s() + this.b() / 2.0D;
      if(var1 > (double)this.f) {
         var1 = (double)this.f;
      }

      return var1;
   }

   public double Z() {
      double var1 = this.A() + this.b() / 2.0D;
      if(var1 > (double)this.f) {
         var1 = (double)this.f;
      }

      return var1;
   }

   public double s() {
      return this.B;
   }

   public double A() {
      return this.h;
   }

   public void w(double var1, double var3) {
      this.B = var1;
      this.h = var3;

      for(v var6 : this.O()) {
         var6.D(this, var1, var3);
      }

   }

   public double b() {
      int var1 = y();
      if(this.t() != t.STATIONARY) {
         double var2 = (double)((float)(System.currentTimeMillis() - this.Y) / (float)(this.H - this.Y));
         if(var2 < 1.0D) {
            return this.y + (this.P - this.y) * var2;
         }

         this.h(this.P);
      }

      return this.y;
   }

   public long P() {
      return this.t() == t.STATIONARY?0L:this.H - System.currentTimeMillis();
   }

   public double E() {
      return this.P;
   }

   public void h(double var1) {
      this.y = var1;
      this.P = var1;
      int var10000 = F();
      this.H = System.currentTimeMillis();
      int var3 = var10000;
      this.Y = this.H;
      Iterator var4 = this.O().iterator();
      if(var4.hasNext()) {
         v var5 = (v)var4.next();
         var5.q(this, var1);
      }

      if(d.y() == null) {
         ++var3;
         Z(var3);
      }

   }

   public void n(double var1, double var3, long var5) {
      this.y = var1;
      y();
      this.P = var3;
      this.Y = System.currentTimeMillis();
      this.H = this.Y + var5;
      Iterator var8 = this.O().iterator();
      if(var8.hasNext()) {
         v var9 = (v)var8.next();
         var9.A(this, var1, var3, var5);
         d.h(new d[2]);
      }

   }

   protected List O() {
      return Lists.newArrayList(this.z);
   }

   public void H(v var1) {
      this.z.add(var1);
   }

   public void p(int var1) {
      this.f = var1;
   }

   public int r() {
      return this.f;
   }

   public double C() {
      return this.s;
   }

   public void B(double var1) {
      this.s = var1;

      for(v var4 : this.O()) {
         var4.t(this, var1);
      }

   }

   public double t() {
      return this.d;
   }

   public void t(double var1) {
      this.d = var1;

      for(v var4 : this.O()) {
         var4.L(this, var1);
      }

   }

   public double m() {
      return this.H == this.Y?0.0D:Math.abs(this.y - this.P) / (double)(this.H - this.Y);
   }

   public int N() {
      return this.L;
   }

   public void D(int var1) {
      this.L = var1;

      for(v var3 : this.O()) {
         var3.E(this, var1);
      }

   }

   public int l() {
      return this.m;
   }

   public void H(int var1) {
      this.m = var1;

      for(v var3 : this.O()) {
         var3.f(this, var1);
      }

   }

   public static void Z(int var0) {
      v = var0;
   }

   public static int F() {
      return v;
   }

   public static int y() {
      int var0 = F();
      return 77;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(F() != 0) {
         Z(55);
      }

   }
}
