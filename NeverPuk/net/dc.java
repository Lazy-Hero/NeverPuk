package net;

import net.d2;
import net.mf;
import net.xn;
import net.z9;
import net.y6.t;
import net.yy.f;

public class dc {
   private d2[] S = new d2[0];
   private boolean O = false;

   public void y(t var1, f var2, float var3, float var4) {
      String var5 = mf.O();
      if(this.O) {
         int var6 = 0;
         if(var6 < this.S.length) {
            d2 var7 = this.S[var6];
            var7.P(var1, var2, var3, var4);
            ++var6;
         }
      }

   }

   public boolean s() {
      return this.O;
   }

   public void K(boolean var1) {
      this.O = var1;
   }

   public d2[] Z() {
      return this.S;
   }

   public void r(d2 var1) {
      this.S = (d2[])((d2[])z9.F((Object[])this.S, (Object)var1));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
