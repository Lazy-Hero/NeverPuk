package net;

import net.d4;
import net.d7;
import net.m6;
import net.mm;
import net.r3;
import net.x9;
import net.z9;

public class m0 {
   private final String E;
   private final String k;
   private mm l;
   private d7 G;

   public boolean p(r3 var1) {
      x9.y();
      this.l = var1.q(this.E);
      if(this.l == null) {
         z9.h("Model variable not found: " + this.E);
         return false;
      } else {
         d4 var3 = new d4(var1);
         this.G = var3.z(this.k);
         return true;
      }
   }

   public m0(String var1, String var2) {
      this.E = var1;
      this.k = var2;
   }

   public void V() {
      float var1 = this.G.L();
      this.l.u(var1);
   }

   private static m6 a(m6 var0) {
      return var0;
   }
}
