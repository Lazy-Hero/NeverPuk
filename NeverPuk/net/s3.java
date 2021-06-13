package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.w9;
import net.xn;
import net.zn;
import net.nb.b;

public class s3 extends mk {
   public mc i;
   public mc X;

   public s3() {
      super("WaterSpeed", or.Movement);
      gn.Q.J.d(this.i = new mc("Water Speed", this, 1.0D, 0.1D, 2.0D, 0.01D));
      gn.Q.J.d(this.X = new mc("Speed Potion Check", this, false));
   }

   @mr
   public void c(zn var1) {
      String[] var2 = mk.Y();
      if(p.sf.J(b.E) || !this.X.Q()) {
         if(p.sf.Fy() && p.sf.FD()) {
            w9.a((double)this.i.e());
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
