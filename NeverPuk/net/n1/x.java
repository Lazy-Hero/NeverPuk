package net.n1;

import net.xn;
import net.c0.d;
import net.n1.o;
import net.n1.p;
import net.yv.r;
import net.yz.ai;

public class x extends p {
   public x(r var1) {
      super(var1);
   }

   public x(r var1, net.ne.a var2) {
      super(var1, var2);
   }

   public x(r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void b(d var0) {
      p.O(var0, "Snowball");
   }

   public void R(byte var1) {
      String var2 = o.s.H();
      if(var1 == 3) {
         int var3 = 0;
         this.hl.n(ai.SNOWBALL, this.b, this.hS, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
         ++var3;
      }

   }

   protected void I(net.u.m var1) {
      String var2 = o.s.H();
      if(var1.e != null) {
         byte var3 = 0;
         if(var1.e instanceof net.nk.x) {
            var3 = 3;
         }

         var1.e.H(net.yz.z.Z(this, this.D()), (float)var3);
      }

      if(!this.hl.x) {
         this.hl.k(this, (byte)3);
         this.B();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
