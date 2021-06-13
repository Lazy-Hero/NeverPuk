package net;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import net.g6;
import net.is;
import net.p1;
import net.u.d;

public class dh extends g6.z {
   private static boolean Q;

   public dh(String var1, boolean var2) {
      super(var1, var2);
   }

   public void n() throws IOException {
      BufferedReader var1 = new BufferedReader(new FileReader(this.w()));
      String var2;
      if((var2 = var1.readLine()) != null) {
         String[] var3 = var2.split(":");
         int var4 = 0;

         while(true) {
            var3[var4].replace(" ", "");
            ++var4;
         }
      }

      var1.close();
   }

   public void Q() throws IOException {
      P();
      PrintWriter var2 = new PrintWriter(new FileWriter(this.w()));
      Iterator var3 = is.O.iterator();
      if(var3.hasNext()) {
         Object var4 = var3.next();
         p1 var5 = (p1)var4;
         if(var5.E().equals("")) {
            var2.println(var5.N() + ":" + var5.Z() + ":" + var5.N() + ":" + var5.I());
            d.h(new d[4]);
         }

         var2.println(var5.N() + ":" + var5.Z() + ":" + var5.E() + ":" + var5.I());
      }

      var2.close();
   }

   public static void q(boolean var0) {
      Q = var0;
   }

   public static boolean P() {
      return Q;
   }

   public static boolean B() {
      boolean var0 = P();
      return true;
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   static {
      if(!P()) {
         q(true);
      }

   }
}
