package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.w9;
import net.xn;
import net.zn;

public class sw extends mk {
   mc q;

   public sw() {
      super("ElytraFly", or.Movement);
      gn.Q.J.d(this.q = new mc("Speed", this, 2.0D, 0.5D, 20.0D, 0.1D));
   }

   @mr
   public void O(zn var1) {
      String[] var2 = mk.Y();
      if(p.sf.I()) {
         p.sf.K(0.0D, 0.0D, 0.0D);
         float var3 = this.q.e();
         if(p.T.w0.o()) {
            p.sf.K = (double)(-var3);
         }

         if(p.T.iD.o()) {
            p.sf.K = (double)var3;
         }

         if(p.T.ib.o() || p.T.w2.o()) {
            w9.a((double)var3);
         }

         if(p.T.P.o() || p.T.tT.o()) {
            w9.a((double)var3);
         }
      }

   }

   public void H() {
      p.sf.a6.n = false;
      p.sf.a6.A(0.05F);
      if(!p.sf.a6.V) {
         p.sf.a6.P = false;
      }

      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
