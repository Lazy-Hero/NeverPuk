package net;

import net.gn;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zc;
import net.z.m;

public class vk extends mk {
   public vk() {
      super("ChatAppend", or.World);
   }

   @mr
   public void W(zc var1) {
      int[] var2 = m.a();
      if(!var1.p().startsWith("/")) {
         var1.k = var1.k + " | " + gn.K;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
