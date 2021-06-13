package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.w9;
import net.xn;
import net.zf;
import net.zg;
import net.no.h;

public class sc extends mk {
   public static int I;
   private final mc n;
   public double s;

   public sc() {
      super("Speed", or.Movement);
      ArrayList var1 = new ArrayList();
      var1.add("Sunrise");
      var1.add("Wellmore");
      gn.Q.J.d(new mc("Speed Mode", this, "Wellmore", var1));
      gn.Q.J.d(this.n = new mc("Strafing", this, false));
   }

   @mr
   public void K(zf var1) {
      if(var1.w() instanceof h) {
         String var2 = gn.Q.J.S("Speed Mode").M();
         if(var2.equalsIgnoreCase("Sunrise")) {
            var1.H(true);
         }
      }

   }

   @mr
   public void d(zg var1) {
      String[] var2 = mk.Y();
      if(this.v()) {
         String var3 = gn.Q.J.S("Speed Mode").M();
         this.t(var3);
         if(var3.equalsIgnoreCase("Sunrise")) {
            if(p.sf.k) {
               p.sf.Z();
            }

            if(this.n.Q()) {
               w9.U();
            }

            if(Double.compare((double)p.sf.hI, 0.2D) > 0 && p.sf.x % 60 > 39) {
               p.s9.E = p.sf.x % 2 == 0?5000.0F:1.0F;
            }

            if(p.sf.hI <= 1.0F && (double)p.sf.hI >= 0.1D) {
               return;
            }

            p.s9.E = 1.0F;
         }

         if(var3.equalsIgnoreCase("Wellmore")) {
            if(this.n.Q()) {
               w9.U();
            }

            if(p.sf.k) {
               p.sf.Z();
               p.sf.av = 2.0F;
               p.sf.AN = 2.0F;
            }

            p.sf.K = -20.0D;
            p.s9.E = 2.0F;
         }
      }

   }

   public void H() {
      p.s9.E = 1.0F;
      p.sf.av = 0.02F;
      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
