package net;

import java.util.ArrayList;
import java.util.List;
import net.m8;
import net.mf;
import net.w_;
import net.xn;
import net.nr.d;
import net.z.m;
import net.z.tu;

public class uj {
   private tu z = null;
   private int J = 0;
   private int f = 0;
   private long i = 0L;

   public uj(tu var1) {
      this.z = var1;
   }

   public void b(int var1, int var2, List var3) {
      String var4 = mf.O();
      if(Math.abs(var1 - this.J) <= 5 && Math.abs(var2 - this.f) <= 5) {
         short var5 = 700;
         if(Long.compare(System.currentTimeMillis(), this.i + (long)var5) >= 0) {
            int var6 = tu.q / 2 - 150;
            int var7 = tu.V / 6 - 7;
            if(var2 <= var7 + 98) {
               var7 += 105;
            }

            int var10000 = var6 + 150 + 150;
            var10000 = var7 + 84 + 10;
            m var10 = this.w(var1, var2, var3);
            if(var10 instanceof w_) {
               w_ var11 = (w_)var10;
               d.l var12 = var11.v();
               String[] var13 = e(var12);
               return;
            }
         }
      }

      this.J = var1;
      this.f = var2;
      this.i = System.currentTimeMillis();
   }

   private m w(int var1, int var2, List var3) {
      byte var4 = 0;
      if(var4 >= var3.size()) {
         return null;
      } else {
         m var5 = (m)var3.get(var4);
         int var6 = net.z.wv.W(var5);
         int var7 = net.z.wv.e(var5);
         if(var1 >= var5.D && var2 >= var5.R && var1 < var5.D + var6 && var2 < var5.R + var7) {
            boolean var9 = true;
         } else {
            boolean var10000 = false;
         }

         return var5;
      }
   }

   private static String[] e(d.l var0) {
      return n(var0.H());
   }

   private static String[] n(String var0) {
      ArrayList var1 = new ArrayList();
      byte var2 = 0;
      String var3 = var0 + ".tooltip." + (var2 + 1);
      String var4 = m8.T(var3, (String)null);
      if(var1.size() <= 0) {
         return null;
      } else {
         String[] var5 = (String[])var1.toArray(new String[var1.size()]);
         return var5;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
