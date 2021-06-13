package net.cr;

import net.xn;
import net.cr.j;
import net.cr.l;
import net.n0.ks;
import net.nj.f;
import net.nl.ze;
import net.u.d;

public class a extends j {
   public a() {
      j.Y();
      super("", 3, 3, net.yz.w.v(l.r, new l[]{l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ}), l.S(net.nb.j.WN), l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ}), l.t(new net.n0.y[]{net.nb.j.YZ})}), new ks(net.nb.j.WW));
      d.h(new d[5]);
   }

   public boolean c(ze var1, net.yv.r var2) {
      int[] var3 = j.Y();
      if(!super.c(var1, var2)) {
         return false;
      } else {
         ks var4 = ks.a;
         int var5 = 0;
         if(var5 < var1.e() && var4.B()) {
            ks var6 = var1.A(var5);
            if(var6.Z() == net.nb.j.WN) {
               var4 = var6;
            }

            ++var5;
         }

         if(var4.B()) {
            return false;
         } else {
            net.cg.s var8 = net.nb.j.WN.t(var4, var2);
            return false;
         }
      }
   }

   private boolean F(net.cg.s var1) {
      if(var1.Q != null) {
         for(net.cg.n var3 : var1.Q.values()) {
            if(var3.H() == net.cg.n.MANSION || var3.H() == net.cg.n.MONUMENT) {
               return true;
            }
         }
      }

      return false;
   }

   public ks h(ze var1) {
      ks var2 = ks.a;

      for(int var3 = 0; var3 < var1.e() && var2.B(); ++var3) {
         ks var4 = var1.A(var3);
         if(var4.Z() == net.nb.j.WN) {
            var2 = var4;
         }
      }

      var2 = var2.s();
      var2.u(1);
      if(var2.o() == null) {
         var2.t(new f());
      }

      var2.o().r("map_scale_direction", 1);
      return var2;
   }

   public boolean c() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
