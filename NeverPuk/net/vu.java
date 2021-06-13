package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.w9;
import net.xn;
import net.zl;
import net.yn.w;

public class vu extends mk {
   public vu() {
      super("NoWeb", or.Player);
      ArrayList var1 = new ArrayList();
      var1.add("Matrix");
      gn.Q.J.d(new mc("NoWeb Mode", this, "Matrix", var1));
   }

   @mr
   public void C(zl var1) {
      w.I();
      String var3 = gn.Q.J.S("NoWeb Mode").M();
      this.t(var3);
      if(this.v() && var3.equalsIgnoreCase("Matrix")) {
         if(p.sf.k && p.sf.L) {
            p.sf.L = true;
         }

         if(p.T.iD.o()) {
            return;
         }

         p.sf.L = false;
         if(p.sf.L && !p.T.w0.o()) {
            w9.L(var1, 0.483D);
         }
      }

   }

   public void H() {
      p.s9.E = 1.0F;
      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
