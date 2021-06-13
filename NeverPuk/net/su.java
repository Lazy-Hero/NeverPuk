package net;

import java.awt.Color;
import java.util.ArrayList;
import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.sf;
import net.xn;
import net.zn;
import net.y.d;

public class su extends mk {
   public static mc K;
   public static mc x;
   public static mc o;
   public static mc N;
   public static mc H;
   public static mc f;
   public static mc i;
   public static mc G;
   public static mc W;
   public static mc R;

   public su() {
      super("ArrayList", or.Hud);
      ArrayList var2 = new ArrayList();
      var2.add("Custom");
      var2.add("Rainbow");
      var2.add("Pulse");
      var2.add("Astolfo");
      d.t();
      var2.add("None");
      var2.add("Category");
      gn.Q.J.d(new mc("ArrayList Color", this, "Astolfo", var2));
      gn.Q.J.d(K = new mc("Background", this, true));
      gn.Q.J.d(x = new mc("Border", this, true));
      gn.Q.J.d(o = new mc("RectRight", this, true));
      gn.Q.J.d(new mc("BackgroundAplha", this, 1.0D, 1.0D, 255.0D, 1.0D));
      gn.Q.J.d(new mc("BackgroundBright", this, 255.0D, 1.0D, 255.0D, 1.0D));
      gn.Q.J.d(N = new mc("One Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(H = new mc("Two Color", this, (new Color(16711680)).getRGB(), true));
      gn.Q.J.d(f = new mc("Color Time", this, 10.0D, 1.0D, 100.0D, 1.0D));
      gn.Q.J.d(i = new mc("ArrayList X", this, 0.0D, 0.0D, 500.0D, 0.10000000149011612D));
      gn.Q.J.d(G = new mc("ArrayList Y", this, 0.0D, 0.0D, 500.0D, 0.10000000149011612D));
      gn.Q.J.d(W = new mc("Font Height", this, 10.0D, 7.0D, 20.0D, 1.0D));
      net.u.d.h(new net.u.d[1]);
   }

   @mr
   public void K(zn var1) {
      String var2 = gn.Q.J.S("ArrayList Color").M();
      this.t(var2);
   }

   @mr
   public void r(db var1) {
      sf.F(var1.x());
   }

   private static xn b(xn var0) {
      return var0;
   }
}
