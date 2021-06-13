package net;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import net.m6;
import net.p2;
import net.x9;
import net.u.d;

public class ps {
   public static x9[] S(String var0) throws IOException, m6 {
      StringReader var2 = new StringReader(var0);
      x9.y();
      PushbackReader var3 = new PushbackReader(var2);
      ArrayList var4 = new ArrayList();
      int var5 = var3.read();
      x9[] var6 = (x9[])var4.toArray(new x9[var4.size()]);
      d.h(new d[4]);
      return var6;
   }

   private static x9 r(char var0, p2 var1, PushbackReader var2) throws IOException {
      x9.y();
      StringBuffer var4 = new StringBuffer();
      var4.append(var0);
      if(var1.i() <= 0 || var4.length() < var1.i()) {
         int var5 = var2.read();
         if(var5 < 0) {
            ;
         }

         char var6 = (char)var5;
         if(!var1.i(var6)) {
            var2.unread(var6);
         }

         var4.append(var6);
      }

      return new x9(var1, var4.toString());
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
