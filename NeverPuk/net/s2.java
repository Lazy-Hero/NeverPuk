package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.pi;
import net.si;
import net.uy;
import net.w9;
import net.xn;
import net.z_;
import net.zg;
import net.zn;
import net.ne.a;
import net.ne.j;
import net.z.tr;

public class s2 extends mk {
   public static mc P;
   public static mc N;
   public int a = -1;

   public s2() {
      super("TargetStrafe", or.Combat);
      gn.Q.J.d(N = new mc("Strafe Speed", this, 0.23D, 0.1D, 2.0D, 0.01D));
      gn.Q.J.d(P = new mc("Distance", this, 3.0D, 0.1D, 6.0D, 0.1D));
      gn.Q.J.d(new mc("Wellmore Exploit", this, true));
      gn.Q.J.d(new mc("AutoJump", this, true));
      gn.Q.J.d(new mc("AutoShift", this, false));
   }

   public void l() {
      if(si.d != null) {
         a var1 = si.d;
         float[] var2 = uy.s(var1);
         if((double)p.sf.d(var1) <= P.p()) {
            w9.y((double)N.e(), var2[0], (double)this.a, 0.0D);
         } else {
            w9.y((double)N.e(), var2[0], (double)this.a, 1.0D);
         }

      }
   }

   @mr
   public void l(zg var1) {
      j.D();
      this.t("" + P.e());
      if(si.d != null) {
         if(p.sf.t) {
            this.F();
         }

         if(p.T.w2.r()) {
            this.a = 1;
         }

         if(p.T.tT.r()) {
            this.a = -1;
         }

         if(Float.compare(p.sf.d(si.d), si.n.e()) <= 0 && si.d.h() > 0.0F && gn.Q.J.S("AutoJump").Q() && gn.Q.j.d(si.class).v() && gn.Q.j.d(s2.class).v()) {
            if(p.sf.k) {
               p.sf.Z();
               if(gn.Q.J.S("Wellmore Exploit").Q()) {
                  p.sf.K = 0.419973D;
               }
            }

            if(gn.Q.J.S("Wellmore Exploit").Q() && p.sf.K > 0.0D && !p.sf.k) {
               p.sf.K -= 0.00205D;
            }
         }

      }
   }

   @mr
   public void E(zn var1) {
      if(p.s5 instanceof tr) {
         this.g();
         pi.d(this.i(), "was Toggled Off", 2, z_.INFO);
      } else if(p.sf.x <= 1) {
         this.g();
         pi.d(this.i(), "was Toggled Off", 2, z_.INFO);
      } else {
         if(p.sf.d(si.d) <= si.n.e()) {
            if(si.d == null) {
               return;
            }

            if(p.sf.t) {
               this.F();
            }

            if(gn.Q.J.S("AutoShift").Q()) {
               if(si.d == null) {
                  return;
               }

               p.T.w0.V = this.v() && si.d != null && (double)p.sf.hI > (double)gn.Q.J.S("Crits Fall Distance").e() + 0.1D;
            }

            if(p.T.w2.o()) {
               this.a = 1;
            }

            if(p.T.tT.o()) {
               this.a = -1;
            }
         }

      }
   }

   private void F() {
      if(this.a == 1) {
         this.a = -1;
      } else {
         this.a = 1;
      }

   }

   @mr
   public void C(zg var1) {
      if(p.sf.d(si.d) <= si.n.e()) {
         if(si.d == null) {
            return;
         }

         if(gn.Q.j.d(si.class).v() && si.d != null) {
            if(p.sf.t) {
               this.F();
            }

            if(si.d.h() > 0.0F) {
               this.l();
            }
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
