package net;

import net._v;
import net.gn;
import net.in;
import net.pm;
import net.pw;
import net.xn;
import net.z0;
import net.u.d;
import net.z.t8;
import net.z.t9;
import net.z.tt;

public class g1 implements in {
   private static final String S = "824587285575630878";
   private static final pm k = new pm();
   private static final z0 j = z0.X;

   public static void a() {
      _v.L();
      pw var1 = new pw();
      j.I("824587285575630878", var1, true, (String)null);
      k.H = System.currentTimeMillis() / 1000L;
      k.q = "vk.com/neverhook";
      k.z = "ava";
      k.I = "Build: " + gn.w;
      String var2 = "";
      if(E.s5 instanceof tt) {
         var2 = "In Main Menu";
         d.h(new d[4]);
      }

      if(E.s5 instanceof t9) {
         var2 = "In Multiplayer Menu";
      }

      if(E.T()) {
         var2 = "In SinglePlayer";
      }

      if(E.m() != null) {
         var2 = "Playing " + E.m().C;
      }

      if(E.s5 instanceof t8) {
         var2 = "In Options Gui";
      }

      k.t = var2;
      j.d(k);
   }

   public static void E() {
      j.U();
      j.l();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
