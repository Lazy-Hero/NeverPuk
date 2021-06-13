package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import net.bk;
import net.rx;
import net.uv;

public class ig {
   private static bk[][] d = (bk[][])null;

   public static int s(int var0, int var1) {
      if(d == null) {
         return var0;
      } else if(var0 < d.length) {
         bk[] var2 = d[var0];
         return var0;
      } else {
         return var0;
      }
   }

   public static void g(rx var0) {
      uv.l();
      l();
      String var2 = "/shaders/block.properties";
      InputStream var3 = var0.b(var2);
   }

   private static void e(List var0, bk var1) {
      int[] var2 = var1.U();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var2[var3];

         while(var4 >= var0.size()) {
            var0.add((Object)null);
         }

         List var5 = (List)var0.get(var4);
         ArrayList var6 = new ArrayList();
         var0.set(var4, var6);
         var6.add(var1);
      }

   }

   private static bk[][] J(List var0) {
      bk[][] var1 = new bk[var0.size()][];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         List var3 = (List)var0.get(var2);
         var1[var2] = (bk[])var3.toArray(new bk[var3.size()]);
      }

      return var1;
   }

   public static void l() {
      d = (bk[][])null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
