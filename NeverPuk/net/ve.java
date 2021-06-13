package net;

import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.z3;
import net.nb.j;
import net.y.d;
import net.yz.aa;

public class ve extends mk {
   public static mc V;
   public static mc K;
   public static mc u;
   public static mc P;
   public static mc i;
   public static mc J;

   public ve() {
      super("ViewModel", or.Visuals);
      V = new mc("RightX", this, 0.0D, -2.0D, 2.0D, 0.10000000149011612D);
      K = new mc("RightY", this, 0.20000000298023224D, -2.0D, 2.0D, 0.10000000149011612D);
      u = new mc("RightZ", this, 0.20000000298023224D, -2.0D, 2.0D, 0.10000000149011612D);
      P = new mc("LeftX", this, 0.0D, -2.0D, 2.0D, 0.10000000149011612D);
      i = new mc("LeftY", this, 0.20000000298023224D, -2.0D, 2.0D, 0.10000000149011612D);
      J = new mc("LeftZ", this, 0.20000000298023224D, -2.0D, 2.0D, 0.10000000149011612D);
      this.W(new mc[]{V, K, u, P, i, J});
   }

   @mr
   public void X(z3 var1) {
      int var2 = j.M();
      if(var1.W() == aa.RIGHT) {
         d.J(V.p(), K.p(), u.p());
      }

      if(var1.W() == aa.LEFT) {
         d.J(-P.p(), i.p(), J.p());
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
