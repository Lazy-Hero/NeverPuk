package net.y;

import java.nio.ByteBuffer;
import java.util.List;
import net.i6;
import net.wk;
import net.xn;
import net.z9;
import net.y.d;
import net.y.p;
import net.y.ui;

public class f {
   public void s(p var1) {
      String var2 = p.S();
      if(var1.b() > 0) {
         net.y8.q var3 = var1.T();
         int var4 = var3.H();
         ByteBuffer var5 = var1.E();
         List var6 = var3.b();
         boolean var7 = i6.L.r();
         boolean var8 = i6.CH.r();
         int var9 = 0;
         if(var9 < var6.size()) {
            net.y8.h var10 = (net.y8.h)var6.get(var9);
            net.y8.h var11 = var10.P();
            if(var7) {
               i6.F(var11, i6.L, new Object[]{var3, Integer.valueOf(var9), Integer.valueOf(var4), var5});
            }

            int var12 = var10.t().O();
            int var13 = var10.G();
            var5.position(var3.t(var9));
            switch(null.G[var11.ordinal()]) {
            case 1:
               d.H(var10.R(), var12, var4, var5);
               d.d('聴');
            case 2:
               ui.X(ui.V + var13);
               d.N(var10.R(), var12, var4, var5);
               d.d('聸');
               ui.X(ui.V);
            case 3:
               d.l(var10.R(), var12, var4, var5);
               d.d('聶');
            case 4:
               d.y(var12, var4, var5);
               d.d('聵');
            default:
               ++var9;
            }
         }

         if(var1.b()) {
            var1.m();
         }

         if(z9.Q()) {
            wk.h(var1.I(), 0, var1.b(), var1);
         }

         d.H(var1.I(), 0, var1.b());
         var9 = 0;
         int var17 = var6.size();
         if(var9 < var17) {
            net.y8.h var18 = (net.y8.h)var6.get(var9);
            net.y8.h var19 = var18.P();
            if(var8) {
               i6.F(var19, i6.CH, new Object[]{var3, Integer.valueOf(var9), Integer.valueOf(var4), var5});
            }

            int var20 = var18.G();
            switch(null.G[var19.ordinal()]) {
            case 1:
               d.x('聴');
            case 2:
               ui.X(ui.V + var20);
               d.x('聸');
               ui.X(ui.V);
            case 3:
               d.x('聶');
               d.b();
            case 4:
               d.x('聵');
            default:
               ++var9;
            }
         }
      }

      var1.X();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
