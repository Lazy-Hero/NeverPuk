package net;

import net.mf;
import net.xn;
import net.z9;
import net.nb.f;
import net.y9.l;
import net.y9.l4;
import net.y9.lg;
import net.y9.ll;
import net.y9.ln;
import net.y9.t;
import net.y9.y;
import net.ym.j;
import net.yw.n;
import net.yz.aq;

public class wq {
   private static j o = null;

   public static void W() {
      o = z9.G().x().a().Z(f.Tl.p());
   }

   public static j b() {
      return o;
   }

   public static n Y() {
      return f.Tl.p();
   }

   public static boolean S(net.yv.o8 var0, n var1, net.u.j var2) {
      l var3 = var1.Q();
      return f(var3, var1) && M(var0, var2);
   }

   private static boolean M(net.yv.o8 var0, net.u.j var1) {
      l var2 = f.Tl;
      return (var0.Z(var1.D()).Q() == var2 || var0.Z(var1.d()).Q() == var2 || var0.Z(var1.H()).Q() == var2 || var0.Z(var1.g()).Q() == var2) && var0.Z(var1.b()).j();
   }

   private static boolean f(l var0, n var1) {
      String var2 = mf.O();
      if(var1.O()) {
         return false;
      } else if(var1.j()) {
         return false;
      } else if(var0 instanceof l4) {
         return false;
      } else if(!(var0 instanceof t) || !(var0 instanceof y) && !(var0 instanceof net.y9.n) && !(var0 instanceof net.y9.z7) && !(var0 instanceof net.y9.zp) && !(var0 instanceof net.y9.zu)) {
         if(!(var0 instanceof net.y9.r3) && !(var0 instanceof net.y9.re) && !(var0 instanceof net.y9.zr) && !(var0 instanceof net.y9.g8) && !(var0 instanceof net.y9.gq) && !(var0 instanceof ln)) {
            if(var0 instanceof ll && var1.i(lg.n) == aq.UP) {
               return true;
            } else if(!(var0 instanceof net.y9.gb)) {
               return false;
            } else {
               Comparable var3 = var1.i(net.y9.gb.N);
               return var3 == net.y9.gb.UP_X || var3 == net.y9.gb.UP_Z;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
