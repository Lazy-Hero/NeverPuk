package net;

import java.util.Iterator;
import net.gn;
import net.mc;
import net.mk;
import net.mo;
import net.mr;
import net.o9;
import net.or;
import net.xn;
import net.zn;
import net.ne.a;
import net.ne.j;
import net.ne.l;
import net.nk.i;
import net.r.r;
import net.u.d;
import net.yn.s;
import net.yn.w;
import net.yz.k;

public class s7 extends mk {
   public static mc A;
   public static mc o;
   public static mc x;

   public s7() {
      super("TriggerBot", or.Combat);
      gn.Q.J.d(o = new mc("Players", this, true));
      gn.Q.J.d(x = new mc("Mobs", this, false));
      gn.Q.J.d(A = new mc("Range", this, 4.0D, 1.0D, 6.0D, 0.1D));
   }

   public static boolean q(a var0) {
      j.D();
      String var2 = gn.Q.J.S("AntiBot Mode").M();
      Iterator var3 = gn.Q.z.G().iterator();
      if(var3.hasNext()) {
         o9 var4 = (o9)var3.next();
         if(!var0.Q().equals(var4.M())) {
            d.h(new d[4]);
         }

         return false;
      } else if(gn.Q.j.d(mo.class).v() && !mo.K.contains(var0) && var2.equalsIgnoreCase("Need Hit")) {
         return false;
      } else {
         if(var0 instanceof r || var0 instanceof w || var0 instanceof i || var0 instanceof s) {
            if(var0 instanceof r && !o.Q()) {
               return false;
            }

            if(var0 instanceof w && !x.Q()) {
               return false;
            }

            if(var0 instanceof i && !x.Q()) {
               return false;
            }

            if(var0 instanceof s && !x.Q()) {
               return false;
            }
         }

         return var0 != p.sf;
      }
   }

   @mr
   public void R(zn var1) {
      l var2 = p.H.e;
      if(p.sf.d(var2) <= A.e() && !(var2 instanceof net.nm.j) && !var2.Z && ((a)var2).h() > 0.0F) {
         if(q((a)var2) && p.sf.B(0.0F) == 1.0F) {
            p.sE.B(p.sf, var2);
            p.sf.N(k.MAIN_HAND);
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
