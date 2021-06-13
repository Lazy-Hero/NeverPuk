package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.or;
import net.xn;
import net.u.d;
import net.yn.w;

public class vi extends mk {
   public vi() {
      super("Clip", or.Player);
      ArrayList var1 = new ArrayList();
      var1.add("VClip");
      var1.add("-VClip");
      var1.add("HClip");
      gn.Q.J.d(new mc("Clip Mode", this, "VClip", var1));
      gn.Q.J.d(new mc("Clip Power", this, 15.0D, 1.0D, 100.0D, 1.0D));
   }

   public void c() {
      double var2 = p.sf.b;
      double var4 = p.sf.hS;
      w.I();
      double var6 = p.sf.hr;
      double var8 = (double)p.sf.hN * 0.017453292D;
      String var10 = gn.Q.J.S("Clip Mode").M();
      if(p.sf != null || p.s8 != null) {
         float var11 = gn.Q.J.S("Clip Power").e();
         if(var10.equalsIgnoreCase("VClip")) {
            p.sf.t(var2, var4 + (double)var11, var6);
         }

         if(var10.equalsIgnoreCase("-VClip")) {
            p.sf.t(var2, var4 - (double)var11, var6);
         }

         if(var10.equalsIgnoreCase("HClip")) {
            p.sf.t(var2 - Math.sin(var8) * (double)var11, var4, var6 + Math.cos(var8) * (double)var11);
         }

         super.c();
         if(d.y() == null) {
            w.z(new int[3]);
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
