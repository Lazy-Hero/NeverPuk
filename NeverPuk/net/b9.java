package net;

import net.uv;

public class b9 {
   private final int G;
   private final String x;
   private final String t;
   private final String k;
   public static final int o = 1;
   public static final int X = 2;
   public static final int l = 3;
   public static final int I = 4;
   public static final int T = 5;

   public b9(int var1, String var2, String var3, String var4) {
      this.G = var1;
      this.x = var2;
      this.t = var3;
      this.k = var4;
   }

   public int h() {
      return this.G;
   }

   public String B() {
      return this.x;
   }

   public String M() {
      return this.t;
   }

   public boolean l() {
      return this.G == 1;
   }

   public boolean T(String var1) {
      return this.l() && var1.equals(this.x);
   }

   public boolean a() {
      return this.G == 2;
   }

   public boolean Q() {
      return this.G == 3;
   }

   public boolean v() {
      return this.G == 4;
   }

   public boolean A() {
      return this.G == 5;
   }

   public boolean m(String var1) {
      return this.a() && var1.equals(this.x);
   }

   public boolean q(String var1, String var2) {
      return this.m(var1) && var2.equals(this.t);
   }

   public boolean S(String var1) {
      return this.Q() && var1.equals(this.x);
   }

   public boolean v(String var1) {
      return this.Q() && this.x.endsWith(var1);
   }

   public boolean M(String var1) {
      return this.v() && var1.equals(this.x);
   }

   public boolean V(String var1) {
      return this.A() && var1.equals(this.x);
   }

   public boolean z(String var1) {
      return this.A() && this.x.endsWith(var1);
   }

   public boolean W(String var1, boolean var2) {
      return this.z(var1) && this.S() == var2;
   }

   public boolean b(String var1, String var2) {
      return this.V(var1) || this.V(var2);
   }

   public boolean M(String var1, String var2, String var3) {
      int[] var4 = uv.l();
      return this.V(var1) || this.V(var2) || this.V(var3);
   }

   public boolean T(String var1, boolean var2) {
      return this.V(var1) && this.S() == var2;
   }

   public boolean a(String var1, String var2, boolean var3) {
      return this.b(var1, var2) && this.S() == var3;
   }

   public boolean M(String var1, String var2, String var3, boolean var4) {
      return this.M(var1, var2, var3) && this.S() == var4;
   }

   public int E() {
      return Integer.parseInt(this.t);
   }

   public float Q() {
      return Float.parseFloat(this.t);
   }

   public boolean S() {
      uv.l();
      String var2 = this.t.toLowerCase();
      if(!var2.equals("true") && !var2.equals("false")) {
         throw new RuntimeException("Invalid boolean: " + this.t + ", line: " + this.k);
      } else {
         return Boolean.valueOf(this.t).booleanValue();
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
