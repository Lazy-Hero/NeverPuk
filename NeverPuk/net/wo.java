package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.mf;
import net.os;
import net.ou;
import net.wf;
import net.z9;
import net.n9.e;
import net.n9.t;
import net.yv.r;

public class wo {
   private static wf[][] z = (wf[][])null;

   public static void b() {
      z = (wf[][])null;
   }

   public static void t() {
      b();
      if(z9.SE()) {
         z = d();
      }

   }

   private static wf[][] d() {
      wf[][] var1 = new wf[10][0];
      String var2 = "mcpatcher/sky/world";
      mf.O();
      boolean var3 = true;
      int var4 = 0;
      if(var4 < var1.length) {
         String var5 = var2 + var4 + "/sky";
         ArrayList var6 = new ArrayList();
         int var7 = 1;
         String var8 = var5 + var7 + ".properties";
         net.yz.m_ var9 = new net.yz.m_(var8);
         InputStream var10 = z9.I(var9);
         Properties var11 = new Properties();
         var11.load(var10);
         var10.close();
         z9.v("CustomSky properties: " + var8);
         String var12 = var5 + var7 + ".png";
         wf var13 = new wf(var11, var12);
         if(var13.m(var8)) {
            net.yz.m_ var14 = new net.yz.m_(var13.Y);
            t var15 = os.x(var14);
            z9.c("CustomSky: Texture not found: " + var14);
            var13.d = var15.L();
            var6.add(var13);
            var10.close();
         }

         ++var7;
         if(var6.size() > 0) {
            wf[] var18 = (wf[])((wf[])var6.toArray(new wf[var6.size()]));
            var1[var4] = var18;
         }

         ++var4;
      }

      return (wf[][])null;
   }

   public static void Y(r var0, e var1, float var2) {
      if(z != null) {
         int var3 = var0.F.L().M();
         if(var3 < z.length) {
            wf[] var4 = z[var3];
            long var5 = var0.j();
            int var7 = (int)(var5 % 24000L);
            float var8 = var0.H(var2);
            float var9 = var0.u(var2);
            float var10 = var0.w(var2);
            if(var9 > 0.0F) {
               var10 /= var9;
            }

            for(int var11 = 0; var11 < var4.length; ++var11) {
               wf var12 = var4[var11];
               if(var12.H(var0, var7)) {
                  var12.n(var7, var8, var9, var10);
               }
            }

            float var13 = 1.0F - var9;
            ou.d(var13);
         }
      }

   }

   public static boolean D(r var0) {
      if(z == null) {
         return false;
      } else if(z9.d().ij < 8) {
         return false;
      } else {
         int var1 = var0.F.L().M();
         if(var1 < z.length) {
            wf[] var2 = z[var1];
            return false;
         } else {
            return false;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
