package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.v;
import net.nl.zq;

public class zp extends zq {
   private net.ni.n k;

   public zp() {
      super("container.enderchest", false, 27);
   }

   public void o(net.ni.n var1) {
      this.k = var1;
   }

   public void E(net.nj.h var1) {
      v.Q();
      int var3 = 0;
      if(var3 < this.e()) {
         this.S(var3, ks.a);
         ++var3;
      }

      var3 = 0;
      if(var3 < var1.z()) {
         net.nj.f var4 = var1.i(var3);
         int var5 = var4.R("Slot") & 255;
         if(var5 < this.e()) {
            this.S(var5, new ks(var4));
         }

         ++var3;
      }

   }

   public net.nj.h f() {
      net.nj.h var1 = new net.nj.h();

      for(int var2 = 0; var2 < this.e(); ++var2) {
         ks var3 = this.A(var2);
         if(!var3.B()) {
            net.nj.f var4 = new net.nj.f();
            var4.D("Slot", (byte)var2);
            var3.Z(var4);
            var1.m(var4);
         }
      }

      return var1;
   }

   public boolean m(net.r.r var1) {
      return (this.k == null || this.k.W(var1)) && super.m(var1);
   }

   public void o(net.r.r var1) {
      if(this.k != null) {
         this.k.Y();
      }

      super.o(var1);
   }

   public void b(net.r.r var1) {
      if(this.k != null) {
         this.k.T();
      }

      super.b(var1);
      this.k = null;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
