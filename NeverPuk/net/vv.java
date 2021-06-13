package net;

import net._6;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.o0;
import net.or;
import net.xn;
import net.z2;
import net.c2.m;
import net.n0.j;
import net.n0.k3;
import net.n0.k_;
import net.n0.ks;
import net.n0.q;
import net.n0.x;
import net.n0.y2;
import net.n0.y3;
import net.n0.yk;
import net.n0.yt;
import net.nl.a;
import net.nl.c;
import net.yn.w;

public class vv extends mk {
   private final mc P;
   private final mc U;
   private final mc A;
   _6 z = new _6();
   _6 R = new _6();

   public vv() {
      super("ChestStealer", or.Player);
      gn.Q.J.d(this.P = new mc("Stealer Speed", this, 10.0D, 0.0D, 100.0D, 1.0D));
      gn.Q.J.d(this.U = new mc("Drop Items", this, false));
      gn.Q.J.d(this.A = new mc("No Move Swap", this, false));
   }

   @mr
   public void H(z2 var1) {
      int[] var2 = w.I();
      if(var1.c()) {
         this.t("" + gn.Q.J.S("Stealer Speed").W());
         float var3 = this.P.e() * 10.0F;
         if(p.s5 instanceof m) {
            label83: {
               if(this.A.Q() && p.sf.FD()) {
                  return;
               }

               m var4 = (m)p.s5;
               int var5 = 0;
               if(var5 < var4.B().e()) {
                  ks var6 = var4.B().A(var5);
                  a var7 = (a)p.sf.aG;
                  if(this.j(var6) && this.R.Z((double)var3)) {
                     if(!this.U.Q()) {
                        p.sE.K(var7.S, var5, 0, c.QUICK_MOVE, p.sf);
                     }

                     p.sE.K(var7.S, var5, 1, c.THROW, p.sf);
                     this.R.B();
                  }

                  ++var5;
               }

               if(this.q(var4)) {
                  if(!this.z.Z((double)o0.x(75, 150))) {
                     break label83;
                  }

                  p.sf.x();
               }

               this.z.B();
            }
         }
      }

      if(p.s5 == null) {
         this.z.B();
      }

   }

   public boolean j(ks var1) {
      return var1.Z() instanceof j || var1.Z() instanceof y3 || var1.Z() instanceof k3 || var1.Z() instanceof k_ || var1.Z() instanceof yt || var1.Z() instanceof yk || var1.Z() instanceof q || var1.Z() instanceof x || var1.Z() instanceof y2;
   }

   private boolean q(m var1) {
      for(int var2 = 0; var2 < var1.B().e(); ++var2) {
         ks var3 = var1.B().A(var2);
         if(this.j(var3)) {
            return false;
         }
      }

      return true;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
