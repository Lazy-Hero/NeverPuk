package net;

import java.awt.Color;
import java.util.Iterator;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.ue;
import net.xh;
import net.xn;
import net.nb.j;
import net.ne.l;
import net.r.r;

public class va extends mk {
   public static mc u;
   public static mc U;
   public static mc a;

   public va() {
      super("Tracers", or.Visuals);
      gn.Q.J.d(U = new mc("Tracer Color", this, (new Color(16777215)).getRGB(), true));
      gn.Q.J.d(u = new mc("ClientColors", this, false));
      gn.Q.J.d(a = new mc("Friend Highlight", this, true));
   }

   @mr
   public void I(ue var1) {
      int var2 = j.V();
      Color var3 = u.Q()?gn.M():Color.white;
      Iterator var4 = p.s8.J.iterator();
      if(var4.hasNext()) {
         l var5 = (l)var4.next();
         if(var5 != p.sf && var5 != null) {
            if(!(var5 instanceof r)) {
               ;
            }

            xh.g(var5, var1.z(), var3);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
