package net;

import java.util.ArrayList;
import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.nb.j;

public class v8 extends mk {
   public static float N = 0.0F;

   public v8() {
      super("EnchantEffect", or.Visuals);
      ArrayList var1 = new ArrayList();
      var1.add("Rgb");
      var1.add("Custom");
      gn.Q.J.d(new mc("Enchant color", this, "Rgb", var1));
   }

   @mr
   public void C(db var1) {
      j.M();
      N += 0.2F;
      if(N > 255.0F) {
         N = 0.0F;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
