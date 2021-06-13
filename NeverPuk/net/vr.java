package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zf;
import net.zn;
import net.nb.j;

public class vr extends mk {
   private final mc F;
   private long n = 0L;

   public vr() {
      super("Ambience", or.Visuals);
      ArrayList var1 = new ArrayList();
      var1.add("Day");
      var1.add("Night");
      var1.add("Morning");
      var1.add("Sunset");
      var1.add("Spin");
      gn.Q.J.d(new mc("Ambience Mode", this, "Night", var1));
      gn.Q.J.d(this.F = new mc("TimeSpin Speed", this, 20.0D, 0.1D, 1000.0D, 1.0D));
   }

   @mr
   public void G(zf var1) {
      if(var1.w() instanceof net.no.sk) {
         var1.H(true);
      }

   }

   @mr
   public void t(zn var1) {
      j.M();
      String var3 = gn.Q.J.S("Ambience Mode").M();
      if(var3.equalsIgnoreCase("Spin")) {
         p.s8.N(this.n);
         this.n += this.F.A();
      }

      if(var3.equalsIgnoreCase("Day")) {
         p.s8.N(5000L);
      }

      if(var3.equalsIgnoreCase("Night")) {
         p.s8.N(17000L);
      }

      if(var3.equalsIgnoreCase("Morning")) {
         p.s8.N(0L);
      }

      if(var3.equalsIgnoreCase("Sunset")) {
         p.s8.N(13000L);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
