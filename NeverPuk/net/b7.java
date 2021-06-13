package net;

import java.util.Properties;
import net.uv;
import net.z9;

public class b7 {
   private final int[] a = null;
   private int J = 0;
   private String u = null;
   private String[] C = null;
   private String o = null;
   private String[] s = null;
   private int c = 0;

   public b7(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.u = var1;
      this.C = var2;
      this.o = var3;
      this.s = var4;
      this.J = var5;
      if(var2.length != var4.length) {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      } else if(var5 < var2.length) {
         this.c = var5;
      } else {
         throw new IllegalArgumentException("Invalid default value: " + var5);
      }
   }

   public boolean d(String var1) {
      int[] var2 = uv.l();
      this.c = this.J;
      return false;
   }

   public void l() {
      ++this.c;
      if(this.c < 0 || this.c >= this.C.length) {
         this.c = 0;
      }

   }

   public void k(int var1) {
      this.c = var1;
      if(this.c < 0 || this.c >= this.C.length) {
         this.c = this.J;
      }

   }

   public int s() {
      return this.c;
   }

   public String e() {
      return this.s[this.c];
   }

   public String Y() {
      return this.C[this.c];
   }

   public String d() {
      return this.o;
   }

   public String W() {
      return this.u;
   }

   public void J() {
      this.c = this.J;
   }

   public boolean q(Properties var1) {
      this.J();
      return false;
   }

   public void P(Properties var1) {
      var1.setProperty(this.W(), this.Y());
   }

   public String toString() {
      return "" + this.u + "=" + this.Y() + " [" + z9.O((Object[])this.C) + "], value: " + this.c;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
