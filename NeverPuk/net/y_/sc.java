package net.y_;

import net.xn;
import net.n0.ks;
import net.nl.zq;
import net.y_.b;
import net.y_.s4;

public class sc extends s4 {
   private int W;
   private final net.yn.s Y;

   public sc(net.yn.s var1) {
      super(var1, net.yn.s.class, 3.0F, 0.02F);
      this.Y = var1;
   }

   public void I() {
      super.I();
      if(this.Y.VY() && this.c instanceof net.yn.s && ((net.yn.s)this.c).Vw()) {
         this.W = 10;
      } else {
         this.W = 0;
      }

   }

   public void E() {
      b.E();
      super.E();
      if(this.W > 0) {
         --this.W;
         if(this.W == 0) {
            zq var2 = this.Y.b();
            int var3 = 0;
            if(var3 < var2.e()) {
               ks var4 = var2.A(var3);
               ks var5 = ks.a;
               if(!var4.B()) {
                  net.n0.y var6 = var4.Z();
                  if((var6 == net.nb.j.Y4 || var6 == net.nb.j.We || var6 == net.nb.j.Wq || var6 == net.nb.j.YN) && var4.U() > 3) {
                     int var7 = var4.U() / 2;
                     var4.H(var7);
                     var5 = new ks(var6, var7, var4.n());
                  }

                  if(var6 == net.nb.j.Sd && var4.U() > 5) {
                     int var14 = var4.U() / 2 / 3 * 3;
                     int var8 = var14 / 3;
                     var4.H(var14);
                     var5 = new ks(net.nb.j.Y4, var8, 0);
                  }

                  if(var4.B()) {
                     var2.S(var3, ks.a);
                  }
               }

               if(!var5.B()) {
                  double var13 = this.Y.hS - 0.30000001192092896D + (double)this.Y.A();
                  net.nm.i var15 = new net.nm.i(this.Y.hl, this.Y.b, var13, this.Y.hr, var5);
                  float var10000 = 0.3F;
                  float var10 = this.Y.A3;
                  float var11 = this.Y.V;
                  var15.hf = (double)(-net.u.t.A(var10 * 0.017453292F) * net.u.t.m(var11 * 0.017453292F) * 0.3F);
                  var15.J = (double)(net.u.t.m(var10 * 0.017453292F) * net.u.t.m(var11 * 0.017453292F) * 0.3F);
                  var15.K = (double)(-net.u.t.A(var11 * 0.017453292F) * 0.3F + 0.1F);
                  var15.b();
                  this.Y.hl.S(var15);
               }

               ++var3;
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
