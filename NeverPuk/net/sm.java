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

public class sm extends mk {
   private final mc z;

   public sm() {
      super("Fly", or.Movement);
      ArrayList var1 = new ArrayList();
      var1.add("Vanilla");
      var1.add("Wellmore");
      gn.Q.J.d(new mc("Fly Mode", this, "Vanilla", var1));
      gn.Q.J.d(this.z = new mc("Fly Speed", this, 5.0D, 0.1D, 15.0D, 0.1D));
   }

   public void H() {
      super.H();
      p.sf.av = 0.02F;
      p.s9.E = 1.0F;
      p.sf.a6.n = false;
      String var1 = gn.Q.J.S("Fly Mode").M();
      if(var1.equalsIgnoreCase("Wellmore")) {
         p.sf.J = 0.0D;
         p.sf.hf = 0.0D;
      }

   }

   @mr
   public void I(zg var1) {
      mk.Y();
      String var3 = gn.Q.J.S("Fly Mode").M();
      this.t(var3);
      if(var3.equalsIgnoreCase("Vanilla")) {
         p.sf.a6.n = true;
         w9.a((double)this.z.e());
         if(p.T.w0.o()) {
            p.sf.K -= 0.1D;
         }

         if(!p.T.iD.o()) {
            return;
         }

         p.sf.K += 0.1D;
      }

      if(var3.equalsIgnoreCase("Wellmore")) {
         if(p.sf.k) {
            p.sf.Z();
         }

         p.sf.hf = 0.0D;
         p.sf.J = 0.0D;
         p.sf.K = -0.01D;
         w9.a((double)this.z.e());
         p.sf.av = 0.3F;
         if(p.T.w0.o()) {
            p.sf.K -= 0.6D;
         }

         if(p.T.iD.o()) {
            p.sf.K += 0.6D;
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
