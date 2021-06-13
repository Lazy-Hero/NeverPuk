package net.n4;

import net.xn;
import net.n0.ks;
import net.n4.h;
import net.n4.i;
import net.n4.y;
import net.ne.bl;
import net.ne.l;
import net.u.d;
import net.y9.zz;
import net.yv.r;
import net.yz.aq;

public abstract class v extends y {
   public ks B(i var1, ks var2) {
      y.e();
      r var4 = var1.v();
      h var5 = zz.S(var1);
      aq var6 = (aq)var1.K().i(zz.H);
      bl var7 = this.A(var4, var5, var2);
      var7.w((double)var6.v(), (double)((float)var6.z() + 0.1F), (double)var6.P(), this.o(), this.M());
      var4.S((l)var7);
      var2.H(1);
      if(d.y() == null) {
         y.Q(new int[5]);
      }

      return var2;
   }

   protected void Q(i var1) {
      var1.v().s(1002, var1.X(), 0);
   }

   protected abstract bl A(r var1, h var2, ks var3);

   protected float M() {
      return 6.0F;
   }

   protected float o() {
      return 1.1F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
