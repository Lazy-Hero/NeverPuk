package net;

import net.od;
import net.xn;
import net.zg;
import net.u.d;

public class z2 extends od {
   public static float p;
   public static float J;
   public static float c;
   public static float n;
   public static boolean q;
   private final boolean a;
   private float i;
   private float y;
   private double D;
   private double G;
   private double W;
   private boolean k;
   private boolean K;
   private boolean C;

   public z2(double var1, double var3, double var5, float var7, float var8, boolean var9, boolean var10) {
      zg.L();
      super();
      this.G = var3;
      this.D = var1;
      this.W = var5;
      this.a = true;
      this.i = var7;
      this.y = var8;
      this.k = var10;
      this.C = var9;
      d.h(new d[3]);
   }

   public z2() {
      c = p;
      n = J;
      p = this.i;
      J = this.y;
      q = this.C;
      this.a = false;
   }

   public boolean c() {
      return this.a;
   }

   public boolean d() {
      String var1 = zg.L();
      return !this.a;
   }

   public float S() {
      return this.i;
   }

   public void f(float var1) {
      this.i = var1;
   }

   public float w() {
      return this.y;
   }

   public void v(float var1) {
      this.y = var1;
   }

   public double Q() {
      return this.D;
   }

   public void R(double var1) {
      this.D = var1;
   }

   public double B() {
      return this.G;
   }

   public void W(double var1) {
      this.G = var1;
   }

   public double V() {
      return this.W;
   }

   public void p(double var1) {
      this.W = var1;
   }

   public boolean g() {
      return this.C;
   }

   public void q(boolean var1) {
      this.C = var1;
   }

   public boolean Q() {
      return this.k;
   }

   public boolean q() {
      return this.K;
   }

   public void r(boolean var1) {
      this.k = var1;
   }

   public void T(boolean var1) {
      this.K = var1;
   }

   public void p(boolean var1) {
      this.k = var1;
   }

   public boolean l() {
      zg.L();
      double var2 = (double)(this.i - this.i);
      double var4 = (double)(this.y - this.y);
      return Double.compare(Math.abs(var2), 0.0D) != 0 || Double.compare(Math.abs(var4), 0.0D) != 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
