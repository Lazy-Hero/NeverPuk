package net;

import java.util.ArrayList;
import java.util.Objects;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.n_.f;
import net.n_.i;
import net.nb.j;

public class vc extends mk {
   public vc() {
      super("FullBright", or.Visuals);
      ArrayList var1 = new ArrayList();
      var1.add("Gamma");
      var1.add("Potion");
      gn.Q.J.d(new mc("FullBright Mode", this, "Gamma", var1));
   }

   @mr
   public void o(zn var1) {
      int var2 = j.M();
      if(this.v()) {
         String var3 = gn.Q.J.S("FullBright Mode").M();
         if(var3.equalsIgnoreCase("Gamma")) {
            p.sf.V((f)Objects.requireNonNull(f.Q(16)));
            p.T.i2 = 1000.0F;
         }

         if(var3.equalsIgnoreCase("Potion")) {
            p.sf.o(new i((f)Objects.requireNonNull(f.Q(16)), 817, 1));
         }
      }

   }

   public void H() {
      super.H();
      p.T.i2 = 0.1F;
      p.sf.V((f)Objects.requireNonNull(f.Q(16)));
   }

   private static xn b(xn var0) {
      return var0;
   }
}
