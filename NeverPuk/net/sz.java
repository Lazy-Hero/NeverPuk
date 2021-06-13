package net;

import java.util.ArrayList;
import net.ga;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.o0;
import net.or;
import net.xn;
import net.zg;
import net.yn.w;

public class sz extends mk {
   public float W = 0.0F;

   public sz() {
      super("AntiAim", or.Player);
      ArrayList var1 = new ArrayList();
      var1.add("Spin");
      var1.add("OneTap");
      gn.Q.J.d(new mc("AntiAim Mode", this, "Spin", var1));
      gn.Q.J.d(new mc("Spin Speed", this, 1.0D, 0.0D, 10.0D, 1.0D));
      gn.Q.J.d(new mc("Custom Pitch", this, true));
      gn.Q.J.d(new mc("Custom Pitch Value", this, 90.0D, -90.0D, 90.0D, 5.0D));
   }

   @mr
   public void p(zg var1) {
      String var3 = gn.Q.J.S("AntiAim Mode").M();
      w.I();
      float var4 = gn.Q.J.S("Spin Speed").e() * 10.0F;
      if(var3.equalsIgnoreCase("Spin")) {
         float var5 = (float)Math.floor((double)this.L(var4)) + (float)o0.x(1, -3);
         var1.R(ga.x(var5));
      }

      if(var3.equalsIgnoreCase("OneTap")) {
         float var6 = p.sf.hN + 180.0F + (float)(p.sf.x % 8 < 4?o0.x(23, 33):-o0.x(23, 33));
         var1.R(ga.x(var6));
      }

      if(gn.Q.J.S("Custom Pitch").Q()) {
         float var7 = gn.Q.J.S("Custom Pitch Value").e();
         var1.v(var7);
      }

   }

   public float L(float var1) {
      this.W += var1;
      return this.W;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
