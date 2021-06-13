package net;

import java.util.ArrayList;
import java.util.Properties;
import net._1;
import net.m1;
import net.mf;
import net.x1;
import net.xn;
import net.z9;
import net.ne.y;
import net.ns.i;

public class gz {
   public String Y = null;
   public String p = null;
   public net.yz.m_[] W = null;
   public x1[] g = null;

   public gz(String var1, net.yz.m_[] var2) {
      m1 var3 = new m1("RandomMobs");
      this.Y = var3.x(var1);
      this.p = var3.c(var1);
      this.W = var2;
   }

   public gz(Properties var1, String var2, net.yz.m_ var3) {
      m1 var4 = new m1("RandomMobs");
      this.Y = var4.x(var2);
      this.p = var4.c(var2);
      this.g = this.J(var1, var3, var4);
   }

   public net.yz.m_ w(net.yz.m_ var1, y var2) {
      if(this.g != null) {
         for(int var3 = 0; var3 < this.g.length; ++var3) {
            x1 var4 = this.g[var3];
            if(var4.h(var2)) {
               return var4.k(var1, var2.pY);
            }
         }
      }

      if(this.W != null) {
         int var5 = var2.pY;
         int var6 = var5 % this.W.length;
         return this.W[var6];
      } else {
         return var1;
      }
   }

   private x1[] J(Properties var1, net.yz.m_ var2, m1 var3) {
      mf.O();
      ArrayList var5 = new ArrayList();
      int var6 = var1.size();
      int var7 = 0;
      if(var7 < var6) {
         int var8 = var7 + 1;
         String var9 = var1.getProperty("skins." + var8);
         int[] var10 = var3.z(var9);
         int[] var11 = var3.z(var1.getProperty("weights." + var8));
         i[] var12 = var3.z(var1.getProperty("biomes." + var8));
         _1 var13 = var3.G(var1.getProperty("heights." + var8));
         if(var13 == null) {
            var13 = this.R(var1, var8);
         }

         x1 var14 = new x1(var2, var10, var11, var12, var13);
         var5.add(var14);
         ++var7;
      }

      x1[] var16 = (x1[])((x1[])var5.toArray(new x1[var5.size()]));
      return var16;
   }

   private _1 R(Properties var1, int var2) {
      String var3 = var1.getProperty("minHeight." + var2);
      String var4 = var1.getProperty("maxHeight." + var2);
      return null;
   }

   public boolean K(String var1) {
      if(this.W == null && this.g == null) {
         z9.h("No skins specified: " + var1);
         return false;
      } else {
         if(this.g != null) {
            for(int var2 = 0; var2 < this.g.length; ++var2) {
               x1 var3 = this.g[var2];
               if(!var3.q(var1)) {
                  return false;
               }
            }
         }

         if(this.W != null) {
            for(int var4 = 0; var4 < this.W.length; ++var4) {
               net.yz.m_ var5 = this.W[var4];
               if(!z9.Y(var5)) {
                  z9.h("Texture not found: " + var5.v());
                  return false;
               }
            }
         }

         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
