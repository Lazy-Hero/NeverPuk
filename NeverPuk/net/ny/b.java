package net.ny;

import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Map;
import net.xn;
import net.ny.f;
import net.ny.i;

public class b {
   private static final Map g = Maps.newHashMap();

   public static synchronized i Z(File var0, int var1, int var2) {
      File var3 = new File(var0, "region");
      File var4 = new File(var3, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      i var5 = (i)g.get(var4);
      return var5;
   }

   public static synchronized i b(File var0, int var1, int var2) {
      File var4 = new File(var0, "region");
      f.h();
      File var5 = new File(var4, "r." + (var1 >> 5) + "." + (var2 >> 5) + ".mca");
      i var6 = (i)g.get(var5);
      if(var6 != null) {
         return var6;
      } else if(var4.exists() && var5.exists()) {
         if(g.size() >= 256) {
            h();
         }

         i var7 = new i(var5);
         g.put(var5, var7);
         return var7;
      } else {
         return null;
      }
   }

   public static synchronized void h() {
      for(i var1 : g.values()) {
         var1.K();
      }

      g.clear();
   }

   public static DataInputStream x(File var0, int var1, int var2) {
      i var3 = Z(var0, var1, var2);
      return var3.z(var1 & 31, var2 & 31);
   }

   public static DataOutputStream q(File var0, int var1, int var2) {
      i var3 = Z(var0, var1, var2);
      return var3.y(var1 & 31, var2 & 31);
   }

   public static boolean q(File var0, int var1, int var2) {
      i var3 = b(var0, var1, var2);
      return var3.f(var1 & 31, var2 & 31);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
