package net.ni;

import net.xn;
import net.ni.v;
import net.ni.w;

public class d extends v {
   public byte B;
   public boolean C;

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.D("note", this.B);
      var1.c("powered", this.C);
      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.B = var1.R("note");
      this.B = (byte)net.u.t.g(this.B, 0, 24);
      this.C = var1.i("powered");
   }

   public void w() {
      this.B = (byte)((this.B + 1) % 25);
      this.W();
   }

   public void S(net.yv.r var1, net.u.j var2) {
      int[] var3 = w.C();
      if(var1.Z(var2.h()).n() == net.y1.l.q) {
         net.yw.n var4 = var1.Z(var2.b());
         net.y1.l var5 = var4.n();
         byte var6 = 0;
         if(var5 == net.y1.l.z) {
            var6 = 1;
         }

         if(var5 == net.y1.l.Z) {
            var6 = 2;
         }

         if(var5 == net.y1.l.y) {
            var6 = 3;
         }

         if(var5 == net.y1.l.S) {
            var6 = 4;
         }

         net.y9.l var7 = var4.Q();
         if(var7 == net.nb.f.uz) {
            var6 = 5;
         }

         if(var7 == net.nb.f.uW) {
            var6 = 6;
         }

         if(var7 == net.nb.f.ur) {
            var6 = 7;
         }

         if(var7 == net.nb.f.d4) {
            var6 = 8;
         }

         if(var7 == net.nb.f.TI) {
            var6 = 9;
         }

         var1.x(var2, net.nb.f.ug, var6, this.B);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
