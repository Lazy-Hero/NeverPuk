package net.y8;

import net.i6;
import net.ub;
import net.xn;
import net.z9;
import net.y8.h;
import net.y8.q;

public class x {
   public static q M = new q();
   public static q d = new q();
   private static final q C = M;
   private static final q g = d;
   public static final q D = new q();
   public static final q W = new q();
   public static final q y = new q();
   public static final q F = new q();
   public static final q H = new q();
   public static final q z = new q();
   public static final q r = new q();
   public static final q T = new q();
   public static final q E = new q();
   public static final q P = new q();
   public static final h J = new h(0, h.e.FLOAT, h.q.POSITION, 3);
   public static final h q = new h(0, h.e.UBYTE, h.q.COLOR, 4);
   public static final h X = new h(0, h.e.FLOAT, h.q.UV, 2);
   public static final h f = new h(1, h.e.SHORT, h.q.UV, 2);
   public static final h G = new h(0, h.e.BYTE, h.q.NORMAL, 3);
   public static final h S = new h(0, h.e.BYTE, h.q.PADDING, 1);

   public static void h() {
      boolean var0 = h.W();
      if(z9.Q()) {
         M = ub.o();
         d = ub.z();
      }

      M = C;
      d = g;
      if(i6.D.I()) {
         q var1 = d;
         q var2 = (q)i6.n(i6.D);
         var2.A();
         int var3 = 0;
         if(var3 < var1.X()) {
            var2.k(var1.b(var3));
            ++var3;
         }
      }

   }

   static {
      M.k(J);
      M.k(q);
      M.k(X);
      M.k(f);
      d.k(J);
      d.k(q);
      d.k(X);
      d.k(G);
      d.k(S);
      D.k(J);
      D.k(X);
      D.k(G);
      D.k(S);
      W.k(J);
      W.k(X);
      W.k(q);
      W.k(f);
      y.k(J);
      F.k(J);
      F.k(q);
      H.k(J);
      H.k(X);
      z.k(J);
      z.k(G);
      z.k(S);
      r.k(J);
      r.k(X);
      r.k(q);
      T.k(J);
      T.k(X);
      T.k(G);
      T.k(S);
      E.k(J);
      E.k(X);
      E.k(f);
      E.k(q);
      P.k(J);
      P.k(X);
      P.k(q);
      P.k(G);
      P.k(S);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
