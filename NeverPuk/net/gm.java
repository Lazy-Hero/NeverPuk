package net;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.ToDoubleFunction;
import net.gn;
import net.in;
import net.mo;
import net.o9;
import net.pi;
import net.si;
import net.uy;
import net.xn;
import net.z_;
import net.ne.a;
import net.ne.l;
import net.nk.i;
import net.r.r;
import net.yn.s;
import net.yn.w;
import net.yy.g;
import net.z.tr;

public class gm implements in {
   public static boolean d(a var0) {
      uy.b();
      String var2 = gn.Q.J.S("AntiBot Mode").M();
      Iterator var3 = gn.Q.z.G().iterator();
      if(var3.hasNext()) {
         o9 var4 = (o9)var3.next();
         if(!var0.Q().equals(var4.M())) {
            ;
         }

         return false;
      } else if(gn.Q.j.d(mo.class).v() && !mo.K.contains(var0) && var2.equalsIgnoreCase("Need Hit")) {
         return false;
      } else {
         if(var0 instanceof r || var0 instanceof w || var0 instanceof i || var0 instanceof s) {
            if(var0 instanceof r && !si.s.Q()) {
               return false;
            }

            if(var0 instanceof w && !si.H.Q()) {
               return false;
            }

            if(var0 instanceof i && !si.H.Q()) {
               return false;
            }

            if(var0 instanceof s && !si.H.Q()) {
               return false;
            }
         }

         return var0.e() && !si.N.Q()?false:(var0 instanceof net.nm.z?false:(!W(var0, si.F.e())?false:(!a(var0, (double)si.n.e())?false:(!var0.b((l)E.sf)?si.k.Q():var0 != E.sf))));
      }
   }

   public static boolean W(l var0, float var1) {
      double var2 = var0.b - E.sf.b;
      double var4 = var0.hr - E.sf.hr;
      float var6 = (float)(Math.toDegrees(Math.atan2(var4, var2)) - 90.0D);
      double var7 = c((double)var6, (double)E.sf.hN);
      return var7 <= (double)var1;
   }

   public static double c(double var0, double var2) {
      float var4 = (float)(Math.abs(var0 - var2) % 360.0D);
      if(var4 > 180.0F) {
         var4 = 360.0F - var4;
      }

      return (double)var4;
   }

   private static boolean a(a var0, double var1) {
      return (double)E.sf.d(var0) <= var1;
   }

   public static void z() {
      si var0 = (si)gn.Q.j.d(si.class);
      if(E.s5 instanceof tr && si.d.Z) {
         var0.g();
         pi.d(var0.i(), "Killaura was toggled off!", 2, z_.SUCCESS);
      } else {
         if(E.sf.x <= 1) {
            var0.g();
            pi.d(var0.i(), "Killaura was toggled off!", 2, z_.SUCCESS);
         }

      }
   }

   public static a V() {
      ArrayList var0 = new ArrayList();

      for(l var2 : E.s8.J) {
         if(var2 instanceof a) {
            a var3 = (a)var2;
            if(E.sf.d(var3) < si.n.e() && d(var3)) {
               var0.add(var3);
            }
         }
      }

      String var4 = gn.Q.J.S("TargetSort Mode").M();
      if(var4.equalsIgnoreCase("Health")) {
         var0.sort((var0, var1) -> {
            return (int)(var0.h() - var1.h());
         });
      } else if(var4.equalsIgnoreCase("Distance")) {
         g var10001 = E.sf;
         E.sf.getClass();
         var0.sort(Comparator.comparingDouble(var10001::d));
      }

      if(var0.isEmpty()) {
         return null;
      } else {
         return (a)var0.get(0);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
