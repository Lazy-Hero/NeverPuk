package net.z;

import net.xn;

public class t {
   public static double j;
   public static double U;
   public static int f;
   public static int S;
   public static int O;

   public t(net.nn.j var1) {
      f = var1.sB;
      S = var1.st;
      O = 1;
      boolean var2 = var1.c();
      int var3 = var1.T.iL;

      for(var3 = 1000; O < var3 && f / (O + 1) >= 320 && S / (O + 1) >= 240; ++O) {
         ;
      }

      if(O % 2 != 0 && O != 1) {
         --O;
      }

      j = (double)f / (double)O;
      U = (double)S / (double)O;
      f = net.u.t.o(j);
      S = net.u.t.o(U);
   }

   public int u() {
      return f;
   }

   public int v() {
      return S;
   }

   public double q() {
      return j;
   }

   public double c() {
      return U;
   }

   public static int K() {
      return O;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
