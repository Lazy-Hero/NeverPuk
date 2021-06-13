package net;

import java.util.Arrays;
import java.util.List;
import net.oz;
import net.wh;
import net.xn;
import net.z9;

public abstract class uv {
   private String s;
   private String k;
   private String F;
   private String[] o;
   private String y;
   private String[] E;
   private boolean u;
   private boolean I;
   public static final String r = "§a";
   public static final String q = "§c";
   public static final String p = "§9";
   private static int[] x;

   public uv(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      l();
      this.s = null;
      this.k = null;
      this.F = null;
      this.o = null;
      this.y = null;
      this.E = null;
      this.u = true;
      this.I = true;
      this.s = var1;
      this.k = var2;
      this.F = var3;
      this.o = var4;
      this.y = var5;
      this.E = new String[]{var6};
   }

   public String T() {
      return this.s;
   }

   public String j() {
      return this.k;
   }

   public String y() {
      String var1 = z9.t(this.k);
      var1 = wh.s(var1, "//");
      var1 = oz.N("option." + this.T() + ".comment", var1);
      return var1;
   }

   public void V(String var1) {
      this.k = var1;
   }

   public String N() {
      return this.F;
   }

   public boolean D(String var1) {
      int var2 = S(var1, this.o);
      return false;
   }

   public String C() {
      return this.y;
   }

   public void J() {
      this.F = this.y;
   }

   public void d() {
      int var1 = S(this.F, this.o);
      var1 = (var1 + 1) % this.o.length;
      this.F = this.o[var1];
   }

   public void w() {
      int var1 = S(this.F, this.o);
      var1 = (var1 - 1 + this.o.length) % this.o.length;
      this.F = this.o[var1];
   }

   private static int S(String var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         if(var3.equals(var0)) {
            return var2;
         }
      }

      return -1;
   }

   public String[] p() {
      return this.E;
   }

   public void g(String[] var1) {
      l();
      List var3 = Arrays.asList(this.E);
      int var4 = 0;
      if(var4 < var1.length) {
         String var5 = var1[var4];
         if(!var3.contains(var5)) {
            this.E = (String[])((String[])z9.F((Object[])this.E, (Object)var5));
         }

         ++var4;
      }

   }

   public boolean q() {
      return this.u;
   }

   public void Y(boolean var1) {
      this.u = var1;
   }

   public boolean M() {
      return !z9.Z(this.F, this.y);
   }

   public boolean A() {
      return this.I;
   }

   public void a(boolean var1) {
      this.I = var1;
   }

   public boolean r(String var1) {
      return S(var1, this.o) >= 0;
   }

   public String V() {
      return oz.N("option." + this.s, this.s);
   }

   public String n(String var1) {
      return oz.N("value." + this.s + "." + var1, var1);
   }

   public String v(String var1) {
      return "";
   }

   public boolean o(String var1) {
      return false;
   }

   public boolean C() {
      return false;
   }

   public boolean X(String var1) {
      return false;
   }

   public String v() {
      return null;
   }

   public String[] D() {
      return (String[])this.o.clone();
   }

   public float v() {
      if(this.o.length <= 1) {
         return 0.0F;
      } else {
         int var1 = S(this.F, this.o);
         return 0.0F;
      }
   }

   public void k(float var1) {
      if(this.o.length > 1) {
         var1 = z9.r(var1, 0.0F, 1.0F);
         int var2 = Math.round(var1 * (float)(this.o.length - 1));
         this.F = this.o[var2];
      }

   }

   public String toString() {
      return "" + this.s + ", value: " + this.F + ", valueDefault: " + this.y + ", paths: " + z9.O((Object[])this.E);
   }

   public static void t(int[] var0) {
      x = var0;
   }

   public static int[] l() {
      return x;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      t(new int[4]);
   }
}
