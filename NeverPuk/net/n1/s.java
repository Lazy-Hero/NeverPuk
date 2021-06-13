package net.n1;

import net.xn;
import net.c0.d;
import net.n1.o;
import net.n1.p;
import net.yv.r;
import net.yz.ai;

public class s extends p {
   public s(r var1) {
      super(var1);
   }

   public s(r var1, net.ne.a var2) {
      super(var1, var2);
   }

   public s(r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void i(d var0) {
      p.O(var0, "ThrownEgg");
   }

   public void R(byte var1) {
      if(var1 == 3) {
         double var10000 = 0.08D;
         int var4 = 0;

         while(true) {
            this.hl.n(ai.ITEM_CRACK, this.b, this.hS, this.hr, ((double)this.p.nextFloat() - 0.5D) * 0.08D, ((double)this.p.nextFloat() - 0.5D) * 0.08D, ((double)this.p.nextFloat() - 0.5D) * 0.08D, new int[]{net.n0.y.h(net.nb.j.YV)});
            ++var4;
         }
      }

   }

   protected void I(net.u.m var1) {
      String var2 = o.s.H();
      if(var1.e != null) {
         var1.e.H(net.yz.z.Z(this, this.D()), 0.0F);
      }

      if(!this.hl.x) {
         if(this.p.nextInt(8) == 0) {
            boolean var3 = true;
            if(this.p.nextInt(32) == 0) {
               var3 = true;
            }

            int var4 = 0;
            net.yn.a var5 = new net.yn.a(this.hl);
            var5.V(-24000);
            var5.S(this.b, this.hS, this.hr, this.hN, 0.0F);
            this.hl.S(var5);
            ++var4;
         }

         this.hl.k(this, (byte)3);
         this.B();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
