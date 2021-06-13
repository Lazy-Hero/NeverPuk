package net;

import java.io.InputStream;
import java.util.ArrayList;
import net.g2;
import net.mf;
import net.os;
import net.z9;
import net.n9.b;
import net.u.j;
import net.ym.t;

public class w8 {
   private static g2[] z = new g2[0];

   public static void e() {
      mf.O();
      z = new g2[0];
      if(z9.O()) {
         String var1 = "optifine/natural.properties";
         net.yz.m_ var2 = new net.yz.m_(var1);
         if(!z9.Y(var2)) {
            z9.v("NaturalTextures: configuration \"" + var1 + "\" not found");
            return;
         }

         boolean var3 = z9.I(var2);
         InputStream var4 = z9.I(var2);
         ArrayList var5 = new ArrayList(256);
         String var6 = z9.L(var4);
         var4.close();
         String[] var7 = z9.Y(var6, "\n\r");
         z9.v("Natural Textures: Parsing default configuration \"" + var1 + "\"");
         z9.v("Natural Textures: Valid only for textures from default resource pack");
         z9.v("Natural Textures: Parsing configuration \"" + var1 + "\"");
         b var8 = os.C();
         int var9 = 0;
         if(var9 < var7.length) {
            String var10 = var7[var9].trim();
            if(!var10.startsWith("#")) {
               String[] var11 = z9.Y(var10, "=");
               if(var11.length != 2) {
                  z9.h("Natural Textures: Invalid \"" + var1 + "\" line: " + var10);
               }

               String var12 = var11[0].trim();
               String var13 = var11[1].trim();
               net.n9.v var14 = var8.S("minecraft:blocks/" + var12);
               if(var14 == null) {
                  z9.h("Natural Textures: Texture not found: \"" + var1 + "\" line: " + var10);
               }

               int var15 = var14.Q();
               if(var15 < 0) {
                  z9.h("Natural Textures: Invalid \"" + var1 + "\" line: " + var10);
               }

               if(var3 && !z9.I(new net.yz.m_("textures/blocks/" + var12 + ".png"))) {
                  return;
               }

               g2 var16 = new g2(var13);
               if(var16.f()) {
                  if(var5.size() <= var15) {
                     var5.add((Object)null);
                  }

                  var5.set(var15, var16);
                  z9.v("NaturalTextures: " + var12 + " = " + var13);
               }
            }

            ++var9;
         }

         z = (g2[])((g2[])var5.toArray(new g2[var5.size()]));
      }

   }

   public static t J(j var0, t var1) {
      net.n9.v var2 = var1.t();
      return var1;
   }

   public static g2 V(net.n9.v var0) {
      if(!(var0 instanceof net.n9.v)) {
         return null;
      } else {
         int var1 = var0.Q();
         if(var1 < z.length) {
            g2 var2 = z[var1];
            return var2;
         } else {
            return null;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
