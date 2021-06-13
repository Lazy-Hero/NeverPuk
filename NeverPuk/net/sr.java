package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.or;
import net.xn;
import net.y.d;

public class sr extends mk {
   public static mc a;

   public sr() {
      super("Client Font", or.Hud);
      ArrayList var2 = new ArrayList();
      d.t();
      var2.add("Comfortaa");
      var2.add("SF UI");
      var2.add("Verdana");
      var2.add("RobotoLight");
      var2.add("RobotoRegular");
      var2.add("Lato");
      gn.Q.J.d(new mc("FontList", this, "Comfortaa", var2));
      gn.Q.J.d(a = new mc("Minecraft Font", this, false));
      if(net.u.d.y() == null) {
         d.l(new net.u.d[2]);
      }

   }

   public void c() {
      this.g();
      super.c();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
