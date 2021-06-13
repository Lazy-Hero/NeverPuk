package net;

import java.util.ArrayList;
import net.m8;
import net.o2;
import net.oz;
import net.uv;
import net.xn;
import net.z.h;

class b3 extends h {
   private ArrayList i;
   private int m;
   private long j = 0L;
   final o2 T;

   public b3(o2 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.Z(), var2, var3, var4, var5, var6);
      this.T = var1;
      this.f();
      this.g = 0.0F;
      int var7 = this.m * var6;
      int var8 = (var5 - var4) / 2;
      if(var7 > var8) {
         this.O(var7 - var8);
      }

   }

   public int C() {
      return this.x - 20;
   }

   public void f() {
      this.i = oz.S();
      this.m = 0;
      int var1 = 0;

      for(int var2 = this.i.size(); var1 < var2; ++var1) {
         if(this.i.get(var1).equals(oz.h)) {
            this.m = var1;
            break;
         }
      }

   }

   protected int V() {
      return this.i.size();
   }

   protected void E(int var1, boolean var2, int var3, int var4) {
      if(var1 != this.m || this.d != this.j) {
         this.m = var1;
         this.j = this.d;
         oz.p((String)this.i.get(var1));
         oz.t();
         this.T.j();
      }

   }

   protected boolean z(int var1) {
      return var1 == this.m;
   }

   protected int I() {
      return this.x - 6;
   }

   protected int X() {
      return this.V() * 18;
   }

   protected void x() {
   }

   protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      uv.l();
      String var9 = (String)this.i.get(var1);
      if(var9.equals(oz.e0)) {
         var9 = m8.i("of.options.shaders.packNone");
      }

      if(var9.equals(oz.E0)) {
         var9 = m8.i("of.options.shaders.packDefault");
      }

      this.T.b(var9, this.x / 2, var3 + 1, 16777215);
   }

   public int t() {
      return this.m;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
