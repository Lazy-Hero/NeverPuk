package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zh;
import net.zi;
import net.zr;
import net.u.d;
import net.z.m;

public class vz extends mk {
   public mc W;
   private float P;
   private float Q;
   private float k;
   private double i;
   private double a;
   private double h;

   public vz() {
      super("FreeCam", or.World);
      gn.Q.J.d(this.W = new mc("Speed", this, 0.1D, 0.01D, 10.0D, 0.1D));
   }

   public void H() {
      p.sf.a6.n = false;
      p.sf.a6.A(this.k);
      p.sf.V = this.Q;
      p.sf.hN = this.P;
      p.sf.r = false;
      m.a();
      p.o.n();
      p.sf.r = false;
      p.sf.D(this.i, this.a, this.h, p.sf.hN, p.sf.V);
      p.s8.a(-69);
      Object var10001 = null;
      p.sf.J = 0.0D;
      p.sf.hf = 0.0D;
      super.H();
      d.h(new d[5]);
   }

   public void c() {
      this.i = p.sf.b;
      m.a();
      this.a = p.sf.hS;
      this.h = p.sf.hr;
      p.sf.r = true;
      net.yy.z var2 = new net.yy.z(p.s8, p.sf.e());
      var2.e(p.sf);
      var2.hS -= 0.0D;
      var2.A3 = p.sf.A3;
      p.s8.J(-69, var2);
      super.c();
      if(d.y() == null) {
         m.T(new int[1]);
      }

   }

   @mr
   public void c(zi var1) {
      var1.H(true);
   }

   @mr
   public void R(zr var1) {
      var1.H(true);
   }

   @mr
   public void P(zh var1) {
      p.sf.r = true;
      p.sf.k = false;
      p.sf.a6.A((float)this.W.p());
      p.sf.a6.n = true;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
