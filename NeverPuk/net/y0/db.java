package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.ez;
import net.yz.m_;

public class db extends l {
   private static final m_ R = new m_("textures/entity/rabbit/brown.png");
   private static final m_ Z = new m_("textures/entity/rabbit/white.png");
   private static final m_ w = new m_("textures/entity/rabbit/black.png");
   private static final m_ z = new m_("textures/entity/rabbit/gold.png");
   private static final m_ b = new m_("textures/entity/rabbit/salt.png");
   private static final m_ n = new m_("textures/entity/rabbit/white_splotched.png");
   private static final m_ u = new m_("textures/entity/rabbit/toast.png");
   private static final m_ T = new m_("textures/entity/rabbit/caerbannog.png");

   public db(d var1) {
      super(var1, new ez(), 0.3F);
   }

   protected m_ y(net.yn.z var1) {
      c.C();
      String var3 = net.cb.z.q(var1.Q());
      if(var3 != null && "Toast".equals(var3)) {
         return u;
      } else {
         switch(var1.n()) {
         case 0:
         default:
            return R;
         case 1:
            return Z;
         case 2:
            return w;
         case 3:
            return n;
         case 4:
            return z;
         case 5:
            return b;
         case 99:
            return T;
         }
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
