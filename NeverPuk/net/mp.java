package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.n0.ks;
import net.n0.ys;
import net.ne.j;

public class mp extends mk {
   mc k;
   public boolean f;

   public mp() {
      super("AutoGApple", or.Combat);
      gn.Q.J.d(this.k = new mc("Health Amount", this, 15.0D, 1.0D, 20.0D, 1.0D));
   }

   public static boolean g(ks var0) {
      return var0.B();
   }

   @mr
   public void L(zn var1) {
      j.D();
      this.t("" + this.k.W());
      if(this.t(p.sf.L()) && Float.compare(p.sf.h(), (float)this.k.W()) <= 0) {
         this.f = true;
         p.T.iF.V = true;
      }

      if(this.f) {
         p.T.iF.V = false;
         this.f = false;
      }

   }

   private boolean t(ks var1) {
      return !g(var1) && var1.Z() instanceof ys;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
