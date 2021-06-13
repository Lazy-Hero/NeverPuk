package net;

import java.util.ArrayList;
import net._6;
import net._g;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.n2.k;
import net.u.d;

public class st extends mk {
   public static _6 R = new _6();
   public static _6 O = new _6();
   private final mc f;
   public mc w;
   boolean H;

   public st() {
      super("Step", or.Movement);
      ArrayList var1 = new ArrayList();
      var1.add("Motion");
      gn.Q.J.d(new mc("Step Mode", this, "Motion", var1));
      gn.Q.J.d(this.w = new mc("Height", this, 1.5D, 1.0D, 10.0D, 0.1D));
      gn.Q.J.d(this.f = new mc("Step Delay", this, 0.1D, 0.0D, 1.0D, 0.1D));
   }

   @mr
   public void a(_g var1) {
      mk.Y();
      String var3 = gn.Q.J.S("Step Mode").M();
      this.t(var3);
      float var4 = this.f.e() * 1000.0F;
      double var5 = this.w.p();
      float var10000 = 0.37F;
      if(this.H) {
         this.H = false;
         p.s9.E = 1.0F;
      }

      if(!p.sf.Fy()) {
         label95: {
            if(var1.x()) {
               if(!p.sf.u || p.T.iD.r() || !O.Z((double)var4)) {
                  break label95;
               }

               var1.t(var5);
               var1.N(true);
            }

            double var8 = p.sf.i().u - p.sf.hS;
            boolean var10 = Double.compare(var8, 0.625D) >= 0;
            if(var3.equalsIgnoreCase("Motion")) {
               ;
            }
         }
      }

      if(d.y() == null) {
         mk.F(new String[3]);
      }

   }

   void U() {
      double var1 = p.sf.b;
      double var3 = p.sf.hr;
      double var5 = p.sf.hS;
      double var7 = 0.42D;
      p.sf.x3.L((k)(new net.m.qo(var1, var5 + var7, var3, false)));
   }

   public void H() {
      p.sf.ha = 0.625F;
      p.s9.E = 1.0F;
      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
