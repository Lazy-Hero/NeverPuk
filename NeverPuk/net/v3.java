package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.n_.f;
import net.nb.j;
import net.u.d;

public class v3 extends mk {
   public static mc Z;
   public static mc s;
   public static mc O;
   public static mc J;
   public static mc L;
   public static mc k;
   public static mc U;
   public static mc W;
   public static mc Y;
   public static mc d;
   public static mc I;

   public v3() {
      super("NoRender", or.Visuals);
      j.V();
      gn.Q.J.d(Z = new mc("Rain", this, true));
      gn.Q.J.d(s = new mc("HurtCamera", this, true));
      gn.Q.J.d(O = new mc("Pumpkin", this, true));
      gn.Q.J.d(J = new mc("Armor", this, false));
      gn.Q.J.d(L = new mc("Totem", this, true));
      gn.Q.J.d(k = new mc("Blindness", this, true));
      gn.Q.J.d(U = new mc("Liquid Overlay", this, true));
      gn.Q.J.d(W = new mc("Camera Smooth", this, true));
      gn.Q.J.d(Y = new mc("Fire", this, true));
      gn.Q.J.d(d = new mc("Walk", this, false));
      gn.Q.J.d(I = new mc("Arrow", this, true));
      d.h(new d[2]);
   }

   @mr
   public void v(zn var1) {
      int var2 = j.V();
      if(W.Q() && this.v()) {
         p.T.w4 = false;
         if(Z.Q() && p.s8.b()) {
            p.s8.A(0.0F);
            p.s8.d(0.0F);
         }

         if(k.Q() && p.sf.J(f.Q(15))) {
            p.sf.t(f.Q(15));
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
