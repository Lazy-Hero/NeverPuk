package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import net.dh;
import net.g6;
import net.gn;
import net.o9;

public class ds extends g6.z {
   public ds(String var1, boolean var2) {
      super(var1, var2);
   }

   public void n() throws IOException {
      boolean var1 = dh.B();
      BufferedReader var2 = new BufferedReader(new FileReader(this.w()));
      String var3;
      if((var3 = var2.readLine()) != null) {
         String var4 = var3.trim();
         String var5 = var4.split(":")[0];
         gn.Q.z.M(var5);
      }

      var2.close();
   }

   public void Q() throws IOException {
      boolean var1 = dh.B();
      BufferedWriter var2 = new BufferedWriter(new FileWriter(this.w()));
      Iterator var3 = gn.Q.z.G().iterator();
      if(var3.hasNext()) {
         o9 var4 = (o9)var3.next();
         var2.write(var4.M().replace(" ", ""));
         var2.write("\r\n");
      }

      var2.close();
   }

   private static Exception b(Exception var0) {
      return var0;
   }
}
