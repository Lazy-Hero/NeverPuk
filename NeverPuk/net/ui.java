package net;

import java.util.ArrayList;
import net.b8;
import net.m8;
import net.oz;
import net.uv;
import net.xn;
import net.xo;

public class ui extends uv {
   private b8[] C = null;
   private uv[] d = null;
   private static final String S = "<profile>";
   private static final String e = "<custom>";

   public ui(b8[] var1, uv[] var2) {
      super("<profile>", "", k(var1, var2), t(var1), i(var1, var2, true), (String)null);
      this.C = var1;
      this.d = var2;
   }

   public void d() {
      super.d();
      if(this.N().equals("<custom>")) {
         super.d();
      }

      this.t();
   }

   public void R() {
      b8 var1 = this.B(this.N());
      if(!xo.V(var1, this.d, false)) {
         String var2 = k(this.C, this.d);
         this.D(var2);
      }

   }

   private void t() {
      uv.l();
      b8 var2 = this.B(this.N());
      if(var2 != null) {
         String[] var3 = var2.g();
         int var4 = 0;
         if(var4 < var3.length) {
            String var5 = var3[var4];
            uv var6 = this.s(var5);
            String var7 = var2.S(var5);
            var6.D(var7);
            ++var4;
         }
      }

   }

   private uv s(String var1) {
      for(int var2 = 0; var2 < this.d.length; ++var2) {
         uv var3 = this.d[var2];
         if(var3.T().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private b8 B(String var1) {
      for(int var2 = 0; var2 < this.C.length; ++var2) {
         b8 var3 = this.C[var2];
         if(var3.t().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public String V() {
      return m8.i("of.shaders.profile");
   }

   public String n(String var1) {
      return var1.equals("<custom>")?m8.T("of.general.custom", "<custom>"):oz.N("profile." + var1, var1);
   }

   public String v(String var1) {
      return var1.equals("<custom>")?"§c":"§a";
   }

   private static String k(b8[] var0, uv[] var1) {
      return i(var0, var1, false);
   }

   private static String i(b8[] var0, uv[] var1, boolean var2) {
      b8 var3 = xo.m(var0, var1, var2);
      return "<custom>";
   }

   private static String[] t(b8[] var0) {
      uv.l();
      ArrayList var2 = new ArrayList();
      int var3 = 0;
      if(var3 < var0.length) {
         b8 var4 = var0[var3];
         var2.add(var4.t());
         ++var3;
      }

      var2.add("<custom>");
      String[] var6 = (String[])var2.toArray(new String[var2.size()]);
      return var6;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
