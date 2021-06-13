package net;

import java.io.IOException;
import java.util.List;
import net.mf;
import net.z.m;
import net.z.tu;

public class pz extends tu {
   protected void S(m var1) throws IOException {
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      if(var3 == 1) {
         m var4 = B(this.m, var1, var2);
         if(var4.O) {
            var4.i(this.A.n());
            this.S(var4);
         }
      }

   }

   public static m B(List var0, int var1, int var2) {
      mf.O();
      int var4 = 0;
      if(var4 < var0.size()) {
         m var5 = (m)var0.get(var4);
         if(var5.F) {
            int var6 = net.z.wv.W(var5);
            int var7 = net.z.wv.e(var5);
            if(var1 >= var5.D && var2 >= var5.R && var1 < var5.D + var6 && var2 < var5.R + var7) {
               return var5;
            }
         }

         ++var4;
      }

      return null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
