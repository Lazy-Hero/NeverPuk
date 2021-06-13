package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.w9;
import net.xn;
import net.zg;

public class sn extends mk {
   public mc G;
   public mc F;

   public sn() {
      super("Jesus", or.Movement);
      ArrayList var1 = new ArrayList();
      var1.add("MiniJump");
      var1.add("Matrix Boost");
      gn.Q.J.d(new mc("Jesus Mode", this, "MiniJump", var1));
      gn.Q.J.d(this.G = new mc("Boost", this, 1.0D, 0.1D, 1.5D, 0.1D));
      gn.Q.J.d(this.F = new mc("Motion Up", this, 0.32D, 0.3D, 0.5D, 0.1D));
   }

   @mr
   public void E(zg var1) {
      mk.Y();
      String var3 = gn.Q.J.S("Jesus Mode").M();
      this.t(var3);
      if(var3.equalsIgnoreCase("MiniJump")) {
         if(!p.sf.p() || p.sf.K >= 0.0D) {
            return;
         }

         p.sf.Z();
         w9.a(0.3D);
      }

      if(var3.equalsIgnoreCase("Matrix Boost") && p.sf.Fy() && p.sf.K < 0.0D) {
         p.sf.K = (double)this.F.e();
         w9.a((double)this.G.e());
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
