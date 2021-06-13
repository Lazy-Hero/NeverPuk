package net;

import java.util.ArrayList;
import java.util.function.Supplier;
import net.mk;
import net.xn;
import net.u.d;

public class mc {
   private final String O;
   private final mk w;
   private final Supplier g;
   public String M;
   public boolean H;
   public double A;
   private String e;
   private ArrayList Z;
   private boolean l;
   private double h;
   private double Q;
   private boolean n;
   private double N;
   private int J;
   private boolean i;
   private static int o;

   public mc(String var1, mk var2, String var3, ArrayList var4) {
      this.O = var1;
      this.w = var2;
      this.e = var3;
      this.Z = var4;
      this.n = false;
      this.M = "Combo";
      this.g = () -> {
         return Boolean.valueOf(true);
      };
   }

   public mc(String var1, mk var2, String var3, ArrayList var4, Supplier var5) {
      this.O = var1;
      this.w = var2;
      this.e = var3;
      this.Z = var4;
      this.n = false;
      this.M = "Combo";
      this.g = var5;
   }

   public mc(String var1, mk var2, boolean var3) {
      this.O = var1;
      this.w = var2;
      this.l = var3;
      this.M = "Check";
      this.g = () -> {
         return Boolean.valueOf(true);
      };
   }

   public mc(String var1, mk var2, int var3, boolean var4) {
      this.O = var1;
      this.w = var2;
      this.R(this.J = var3);
      this.i = var4;
      this.M = "Color";
      this.g = () -> {
         return Boolean.valueOf(true);
      };
   }

   public mc(String var1, mk var2, boolean var3, Supplier var4) {
      this.O = var1;
      this.w = var2;
      this.l = var3;
      this.M = "Check";
      this.g = var4;
   }

   public mc(String var1, mk var2, double var3, double var5, double var7, double var9) {
      this.O = var1;
      this.w = var2;
      this.A = var3;
      this.h = var5;
      this.Q = var7;
      int var10000 = t();
      this.N = var9;
      this.M = "Slider";
      this.g = () -> {
         return Boolean.valueOf(true);
      };
      int var11 = var10000;
      if(d.y() == null) {
         ++var11;
         J(var11);
      }

   }

   public mc(String var1, mk var2, double var3, double var5, double var7, float var9, Supplier var10) {
      t();
      this.O = var1;
      this.w = var2;
      this.A = var3;
      this.h = var5;
      this.Q = var7;
      this.N = (double)var9;
      this.M = "Slider";
      this.g = var10;
      d.h(new d[5]);
   }

   public boolean B() {
      return ((Boolean)this.g.get()).booleanValue();
   }

   public String q() {
      return this.O;
   }

   public mk W() {
      return this.w;
   }

   public String M() {
      return this.e;
   }

   public void r(String var1) {
      this.e = var1;
   }

   public ArrayList L() {
      return this.Z;
   }

   public boolean Q() {
      return this.l;
   }

   public void O(boolean var1) {
      this.l = var1;
   }

   public double p() {
      return this.A;
   }

   public void n(double var1) {
      this.A = var1;
   }

   public int T() {
      return this.J;
   }

   public void R(int var1) {
      this.J = var1;
   }

   public double s() {
      return this.N;
   }

   public boolean W() {
      return this.i;
   }

   public double u() {
      return this.h;
   }

   public double H() {
      return this.Q;
   }

   public float e() {
      return (float)this.A;
   }

   public long A() {
      return (long)this.A;
   }

   public int W() {
      return (int)this.A;
   }

   public boolean C() {
      return this.M.equalsIgnoreCase("Combo");
   }

   public boolean V() {
      return this.M.equalsIgnoreCase("Check");
   }

   public boolean G() {
      return this.M.equalsIgnoreCase("Color");
   }

   public boolean v() {
      return this.M.equalsIgnoreCase("Slider");
   }

   public boolean f() {
      return this.n;
   }

   public void n(boolean var1) {
      this.n = var1;
   }

   public String D() {
      return this.e;
   }

   public static void J(int var0) {
      o = var0;
   }

   public static int t() {
      return o;
   }

   public static int h() {
      int var0 = t();
      return 43;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      J(22);
   }
}
