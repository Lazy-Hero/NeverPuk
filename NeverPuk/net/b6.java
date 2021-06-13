package net;

import net.m3;
import net.mf;
import net.xn;

public class b6 {
   private final m3 e;
   private final Class p;
   private int J;
   private mf[] d;

   public b6(m3 var1, Class var2, int var3) {
      this.e = var1;
      this.p = var2;
      if(var1.l()) {
         this.d = new mf[var3];

         for(int var4 = 0; var4 < this.d.length; ++var4) {
            this.d[var4] = new mf(var1, var2, var4);
         }
      }

   }

   public m3 s() {
      return this.e;
   }

   public Class R() {
      return this.p;
   }

   public int X() {
      return this.J;
   }

   public mf M(int var1) {
      String var2 = mf.O();
      return var1 >= 0 && var1 < this.d.length?this.d[var1]:null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
