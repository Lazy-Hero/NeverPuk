package net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import net.gn;
import net.iv;
import net.mc;
import net.mk;
import net.nn.j;

public class _2 {
   public File A;
   public File z;
   private static String q;

   public _2() {
      this.A = new File(j.b().sn, gn.K);
      if(!this.A.exists()) {
         this.A.mkdir();
      }

      this.z = new File(this.A, "config.txt");
      if(!this.z.exists()) {
         this.z.createNewFile();
      }

      this.s();
   }

   public void W() {
      w();
      ArrayList var2 = new ArrayList();
      Iterator var3 = gn.Q.j.X().iterator();
      if(var3.hasNext()) {
         mk var4 = (mk)var3.next();
         var2.add("Module:" + var4.i() + ":" + var4.v() + ":" + var4.o());
      }

      var3 = iv.n().iterator();
      if(var3.hasNext()) {
         mc var8 = (mc)var3.next();
         if(var8.V()) {
            var2.add("Setting:" + var8.q() + ":" + var8.W().i() + ":" + var8.Q());
         }

         if(var8.C()) {
            var2.add("Setting:" + var8.q() + ":" + var8.W().i() + ":" + var8.M());
         }

         if(var8.v()) {
            var2.add("Setting:" + var8.q() + ":" + var8.W().i() + ":" + var8.p());
         }

         if(var8.G()) {
            var2.add("Setting:" + var8.q() + ":" + var8.W().i() + ":" + var8.T());
         }
      }

      PrintWriter var7 = new PrintWriter(this.z);
      Iterator var9 = var2.iterator();
      if(var9.hasNext()) {
         String var5 = (String)var9.next();
         var7.println(var5);
      }

      var7.close();
   }

   public void s() {
      ArrayList var1 = new ArrayList();
      BufferedReader var2 = new BufferedReader(new FileReader(this.z));
      String var3 = var2.readLine();

      while(true) {
         var1.add(var3);
         var3 = var2.readLine();
      }
   }

   public static void o(String var0) {
      q = var0;
   }

   public static String w() {
      return q;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      o("RPPLwc");
   }
}
