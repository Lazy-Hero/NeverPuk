package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import org.lwjgl.input.Keyboard;

public class ss extends mk {
   public static mc q;

   public ss() {
      super("NoSlowDown", or.Movement);
      ArrayList var1 = new ArrayList();
      var1.add("Matrix");
      var1.add("Default");
      gn.Q.J.d(new mc("NoSlowDown Mode", this, "Default", var1));
      gn.Q.J.d(q = new mc("Percentage", this, 100.0D, 0.0D, 100.0D, 1.0D));
   }

   @mr
   public void D(zn var1) {
      mk.Y();
      String var3 = gn.Q.J.S("NoSlowDown Mode").M();
      this.t(q.p() + "% " + var3);
      if(var3.equalsIgnoreCase("Matrix") && !Keyboard.isKeyDown(p.T.w0.m())) {
         p.T.w0.V = p.sf.HY() && p.sf.FD() && (double)p.sf.hI > 0.1D;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
