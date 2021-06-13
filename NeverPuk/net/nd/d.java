package net.nd;

import java.util.Iterator;
import java.util.List;
import net.g4;
import net.xc;
import net.xn;
import net.za;
import net.c9.b;
import net.h.a;
import net.nb.l;
import net.nd.c;
import net.nd.h;
import net.nd.x;
import net.u.t;
import net.y.u1;

public class d implements c {
   private final xc K;
   private boolean c = false;

   public d(xc var1) {
      this.K = var1;
   }

   public c.d n(h var1, long var2) {
      x.d.c();
      var1.Q().n().E(X);
      net.y.d.Z(1.0F, 1.0F, 1.0F);
      g4 var5 = this.K.y();
      var1.g(0, 0, 0, 0, 160, 32);
      List var6 = var1.Q().sO.m(var5.s().c(), 125);
      int var7 = var5.m() == za.CHALLENGE?16746751:16776960;
      if(var6.size() == 1) {
         var1.Q().sO.v(b.x("advancements.toast." + var5.m().O(), new Object[0]), 30.0F, 7.0F, var7 | -16777216);
         var1.Q().sO.v(var5.s().c(), 30.0F, 18.0F, -1);
      }

      boolean var10000 = true;
      float var15 = 300.0F;
      if(Long.compare(var2, 1500L) < 0) {
         int var10 = t.M(t.T((float)(1500L - var2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
         var1.Q().sO.v(b.x("advancements.toast." + var5.m().O(), new Object[0]), 30.0F, 11.0F, var7 | var10);
      }

      int var14 = t.M(t.T((float)(var2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
      int var11 = 16 - var6.size() * var1.Q().sO.R / 2;
      Iterator var12 = var6.iterator();
      if(var12.hasNext()) {
         String var13 = (String)var12.next();
         var1.Q().sO.v(var13, 30.0F, (float)var11, 16777215 | var14);
         int var16 = var11 + var1.Q().sO.R;
      }

      if(!this.c && Long.compare(var2, 0L) > 0) {
         this.c = true;
         if(var5.m() == za.CHALLENGE) {
            var1.Q().n().g((net.h.d)a.a(l.DX, 1.0F, 1.0F));
         }
      }

      u1.A();
      var1.Q().K().g((net.ne.a)null, var5.C(), 8, 8);
      return var2 >= 5000L?c.d.HIDE:c.d.SHOW;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
