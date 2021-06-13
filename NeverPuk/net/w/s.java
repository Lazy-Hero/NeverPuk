package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class s extends f {
   private static final Logger a = LogManager.getLogger();
   private static final m_[] c = new m_[]{net.ne.v.P(net.nk.g.class), net.ne.v.P(net.nk.fu.class), net.ne.v.P(net.nk.fu.class), net.ne.v.P(net.nk.a.class)};

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      boolean var10001 = true;
      int var6 = var2.nextInt(2) + 2;
      int var7 = -var6 - 1;
      int var8 = var6 + 1;
      boolean var10000 = true;
      var10000 = true;
      int var11 = var2.nextInt(2) + 2;
      int var12 = -var11 - 1;
      int var13 = var11 + 1;
      boolean var14 = false;
      if(var7 <= var8) {
         int var16 = -1;
         if(var12 <= var13) {
            net.u.j var18 = var3.F(var7, var16, var12);
            net.y1.l var19 = var1.Z(var18).n();
            boolean var20 = var19.B();
            if(!var20) {
               return false;
            }

            if(var7 == var7 || var7 == var8 || var12 == var12 || var12 == var13) {
               ;
            }

            int var17 = var12 + 1;
         }

         ++var16;
         int var15 = var7 + 1;
      }

      return false;
   }

   private m_ F(Random var1) {
      return c[var1.nextInt(c.length)];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
