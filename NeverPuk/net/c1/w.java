package net.c1;

import java.util.Iterator;
import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.nl.z2;
import net.y9.g5;
import net.yz.aq;

public class w extends c {
   public w(c.u var1, z2... var2) {
      super(var1, d.ARMOR_FEET, var2);
      this.Q("frostWalker");
   }

   public int O(int var1) {
      return var1 * 10;
   }

   public int x(int var1) {
      return this.O(var1) + 15;
   }

   public boolean S() {
      return true;
   }

   public int h() {
      return 2;
   }

   public static void H(net.ne.a var0, net.yv.r var1, net.u.j var2, int var3) {
      String var4 = y.j();
      if(var0.k) {
         float var5 = (float)Math.min(16, 2 + var3);
         net.u.j var6 = new net.u.j(0, 0, 0);
         Iterator var7 = net.u.j.X(var2.G((double)(-var5), -1.0D, (double)(-var5)), var2.G((double)var5, -1.0D, (double)var5)).iterator();
         if(var7.hasNext()) {
            net.u.j var8 = (net.u.j)var7.next();
            if(var8.S(var0.b, var0.hS, var0.hr) <= (double)(var5 * var5)) {
               var6.V(var8.t(), var8.h() + 1, var8.y());
               net.yw.n var9 = var1.Z(var6);
               if(var9.n() == net.y1.l.q) {
                  net.yw.n var10 = var1.Z(var8);
                  if(var10.n() == net.y1.l.p && ((Integer)var10.i(g5.J)).intValue() == 0 && var1.j(net.nb.f.uu, var8, false, aq.DOWN, (net.ne.l)null)) {
                     var1.U(var8, net.nb.f.uu.p());
                     var1.c(var8.F(), net.nb.f.uu, net.u.t.A(var0.Q(), 60, 120));
                  }
               }
            }
         }
      }

   }

   public boolean k(c var1) {
      return super.k(var1) && var1 != net.nb.u.Q;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
