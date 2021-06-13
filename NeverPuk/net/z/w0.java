package net.z;

import net.xn;
import net.yz.ao;
import net.z.g;
import net.z.tu;

public class w0 extends tu implements ao {
   private String s = "";
   private String w = "";
   private int Q;
   private boolean a;

   public void H(String var1) {
      this.h(var1);
   }

   public void h(String var1) {
      this.s = var1;
      this.y("Working...");
   }

   public void y(String var1) {
      this.w = var1;
      this.H(0);
   }

   public void H(int var1) {
      this.Q = var1;
   }

   public void g() {
      this.a = true;
   }

   public void v(int var1, int var2, float var3) {
      boolean var4 = g.B();
      if(this.a) {
         if(this.A.I()) {
            return;
         }

         this.A.s((tu)null);
      }

      this.C();
      this.d(this.O, this.s, q / 2, 70, 16777215);
      this.d(this.O, this.w + " " + this.Q + "%", q / 2, 90, 16777215);
      super.v(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
