package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;
import net.n0.ks;
import net.u.j;
import net.y9.l;
import net.yn.w;

public class sx extends mk {
   public sx() {
      super("AutoTool", or.Player);
   }

   @mr
   public void u(zg var1) {
      int[] var2 = w.I();
      if(p.T.Q.V) {
         if(p.H != null) {
            j var3 = p.H.j();
            l var4 = p.s8.Z(var3).Q();
            float var5 = 1.0F;
            boolean var6 = true;
            byte var7 = 0;
            ks var8 = (ks)p.sf.a8.X.get(var7);
            ks var9 = p.sf.a8.r();
            if(Float.compare(var8.y(var4.p()), var5) > 0 && Float.compare(var9.y(var4.p()), var5) <= 0) {
               var8.y(var4.p());
            }

            ++var7;
         }
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
