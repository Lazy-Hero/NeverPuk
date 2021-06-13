package net.yz;

import net.xn;
import net.yz.m;
import net.yz.m_;

public class n extends m {
   private final net.nr.d f;

   public n(net.nr.d var1) {
      this.f = var1;
   }

   public void B() {
      P = 0.0F;
      m_.g();
      n = 0.0F;
      if(this.f.ib.o()) {
         ++n;
         this.g = true;
      }

      this.g = false;
      if(this.f.P.o()) {
         --n;
         this.s = true;
      }

      this.s = false;
      if(this.f.w2.o()) {
         ++P;
         this.c = true;
      }

      this.c = false;
      if(this.f.tT.o()) {
         --P;
         this.O = true;
      }

      this.O = false;
      this.d = this.f.iD.o();
      this.l = this.f.w0.o();
      if(this.l) {
         P = (float)((double)P * 0.3D);
         n = (float)((double)n * 0.3D);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
