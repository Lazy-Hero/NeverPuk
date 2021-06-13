package net;

import java.util.ArrayList;
import java.util.Iterator;
import net.mc;
import net.mk;
import net.xn;

public class iv {
   private static ArrayList D;

   public iv() {
      D = new ArrayList();
   }

   public static ArrayList n() {
      return D;
   }

   public void R(mc var1) {
      D.add(var1);
   }

   public ArrayList D(mk var1) {
      ArrayList var2 = new ArrayList();

      for(mc var4 : n()) {
         if(var4.W().equals(var1)) {
            var2.add(var4);
         }
      }

      if(var2.isEmpty()) {
         return null;
      } else {
         return var2;
      }
   }

   public mc S(String var1) {
      mc.h();
      Iterator var3 = n().iterator();
      if(var3.hasNext()) {
         mc var4 = (mc)var3.next();
         if(var4.q().equalsIgnoreCase(var1)) {
            return var4;
         }
      }

      System.err.println("[] Error Setting NOT found: \'" + var1 + "\'!");
      return null;
   }

   public void d(mc var1) {
      D.add(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
