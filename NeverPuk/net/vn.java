package net;

import java.awt.Color;
import net.gn;
import net.mc;
import net.mk;
import net.or;

public class vn extends mk {
   public static mc d;
   public static mc r;
   public static mc F;

   public vn() {
      super("Chams", or.Visuals);
      gn.Q.J.d(d = new mc("Chams Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(r = new mc("Chams Alpha", this, 0.20000000298023224D, 0.2D, 1.0D, 0.10000000149011612D));
      gn.Q.J.d(F = new mc("Client Colored", this, false));
   }
}
