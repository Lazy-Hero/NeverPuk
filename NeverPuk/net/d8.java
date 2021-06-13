package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Iterator;
import net.dh;
import net.g6;
import net.gn;
import net.xa;
import org.lwjgl.input.Keyboard;

public class d8 extends g6.z {
   public d8(String var1, boolean var2) {
      super(var1, var2);
   }

   public void n() {
      boolean var1 = dh.B();
      FileInputStream var2 = new FileInputStream(this.w().getAbsolutePath());
      DataInputStream var3 = new DataInputStream(var2);
      BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
      String var5;
      if((var5 = var4.readLine()) != null) {
         String var6 = var5.trim();
         String var7 = var6.split(":")[0];
         String var8 = var6.split(":")[1];
         gn.Q.W.v(new xa(Keyboard.getKeyIndex(var7), var8));
      }

      var4.close();
   }

   public void Q() {
      boolean var1 = dh.P();
      BufferedWriter var2 = new BufferedWriter(new FileWriter(this.w()));
      Iterator var3 = gn.Q.W.Q().iterator();
      if(var3.hasNext()) {
         xa var4 = (xa)var3.next();
         var2.write(Keyboard.getKeyName(var4.Q()) + ":" + var4.S());
         var2.write("\r\n");
      }

      var2.close();
   }

   private static Exception b(Exception var0) {
      return var0;
   }
}
