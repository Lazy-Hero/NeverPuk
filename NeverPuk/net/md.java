package net;

import java.util.ArrayList;
import net._6;
import net._g;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.ox;
import net.si;
import net.xn;
import net.zf;
import net.zn;
import net.m.b;
import net.n2.k;
import net.ne.j;

public class md extends mk {
   private final mc J;
   int K;
   int x;
   _6 V = new _6();
   _6 b = new _6();
   int w = 0;
   double[] T = new double[]{0.4100000000000002D, 0.01099999999999924D};

   public md() {
      super("Criticals", or.Combat);
      ArrayList var1 = new ArrayList();
      var1.add("NCP");
      var1.add("Packet");
      gn.Q.J.d(new mc("Criticals Mode", this, "Packet", var1));
      gn.Q.J.d(this.J = new mc("Mini-Jump", this, false));
   }

   @mr
   public void D(ox var1) {
      j.D();
      String var3 = gn.Q.J.S("Criticals Mode").M();
      if(si.d != null && gn.Q.j.d(si.class).v()) {
         double var4 = p.sf.b;
         double var6 = p.sf.hS;
         double var8 = p.sf.hr;
         if(var3.equalsIgnoreCase("Packet")) {
            if(this.J.Q()) {
               p.sf.t(var4, var6 + 0.04D, var8);
            }

            p.sf.x3.L((k)(new net.m.qo(var4, var6 + 0.11D, var8, false)));
            p.sf.x3.L((k)(new net.m.qo(var4, var6 + 0.1100013579D, var8, false)));
            p.sf.x3.L((k)(new net.m.qo(var4, var6 + 1.3579E-6D, var8, false)));
            p.sf.p(var1.x());
         }

         if(var3.equalsIgnoreCase("NCP") && this.b.Z(800.0D) && p.sf.k) {
            if(this.J.Q()) {
               p.sf.t(var4, var6 + 0.04D, var8);
            }

            double[] var10 = this.T;
            int var11 = var10.length;
            int var12 = 0;
            if(var12 < var11) {
               double var13 = var10[var12];
               p.sf.x3.L((k)(new net.m.qo(p.sf.b, p.sf.hS + var13, p.sf.hr, false)));
               ++var12;
            }

            p.sf.p(var1.x());
            this.b.B();
         }
      }

   }

   @mr
   public void z(zf var1) {
      k var2 = var1.w();
      if(var2 instanceof net.no.s1) {
         this.K = 0;
      }

      if(var2 instanceof b) {
         b var3 = (b)var2;
         boolean var4 = var3.m();
         short var5 = var3.F();
         ++this.x;
      }

   }

   @mr
   public void E(_g var1) {
      if(!var1.x()) {
         this.V.B();
         if(!p.sf.t) {
            this.K = 0;
         }
      }

   }

   @mr
   public void y(zn var1) {
      String var2 = gn.Q.J.S("Criticals Mode").M();
      this.t(var2);
      ++this.w;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
