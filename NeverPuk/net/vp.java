package net;

import net.gn;
import net.mk;
import net.mr;
import net.or;
import net.pi;
import net.s2;
import net.s9;
import net.sc;
import net.si;
import net.sm;
import net.sn;
import net.vu;
import net.xn;
import net.z_;
import net.zf;
import net.z.m;

public class vp extends mk {
   public boolean u;

   public vp() {
      super("LagBack", or.World);
   }

   @mr
   public void Z(zf var1) {
      int[] var2 = m.a();
      if(this.v()) {
         if(var1.w() instanceof net.no.s1) {
            if(gn.Q.j.d(sc.class).v()) {
               this.z("Speed");
               gn.Q.j.d(sc.class).g();
            }

            if(gn.Q.j.d(sm.class).v()) {
               this.z("Fly");
               gn.Q.j.d(sm.class).g();
            }

            if(gn.Q.j.d(s2.class).v() && si.d != null) {
               this.z("TargetStrafe");
               gn.Q.j.d(s2.class).g();
            }

            if(gn.Q.j.d(vu.class).v() && p.sf.L) {
               this.z("NoWeb");
               gn.Q.j.d(vu.class).g();
            }

            if(gn.Q.j.d(sn.class).v() && p.sf.Fy()) {
               this.z("Jesus");
               gn.Q.j.d(sn.class).g();
            }

            if(gn.Q.j.d(s9.class).v()) {
               this.z("Timer");
               gn.Q.j.d(s9.class).g();
            }
         }

      }
   }

   public void z(String var1) {
      pi.d("Module", "Disabling " + var1 + " due to lag back", 2, z_.WARNING);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
