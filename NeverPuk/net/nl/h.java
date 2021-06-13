package net.nl;

import java.util.List;
import net.xn;
import net.n0.ks;
import net.nl.v;

public class h {
   public static ks n(List var0, int var1, int var2) {
      return var1 < var0.size() && !((ks)var0.get(var1)).B()?((ks)var0.get(var1)).w(var2):ks.a;
   }

   public static ks m(List var0, int var1) {
      return var1 < var0.size()?(ks)var0.set(var1, ks.a):ks.a;
   }

   public static net.nj.f l(net.nj.f var0, net.yz.w var1) {
      return C(var0, var1, true);
   }

   public static net.nj.f C(net.nj.f var0, net.yz.w var1, boolean var2) {
      v.Q();
      net.nj.h var4 = new net.nj.h();
      int var5 = 0;
      if(var5 < var1.size()) {
         ks var6 = (ks)var1.get(var5);
         if(!var6.B()) {
            net.nj.f var7 = new net.nj.f();
            var7.D("Slot", (byte)var5);
            var6.Z(var7);
            var4.m(var7);
         }

         ++var5;
      }

      if(!var4.N() || var2) {
         var0.K("Items", var4);
      }

      return var0;
   }

   public static void W(net.nj.f var0, net.yz.w var1) {
      net.nj.h var2 = var0.A("Items", 10);

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         net.nj.f var4 = var2.i(var3);
         int var5 = var4.R("Slot") & 255;
         if(var5 < var1.size()) {
            var1.set(var5, new ks(var4));
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
