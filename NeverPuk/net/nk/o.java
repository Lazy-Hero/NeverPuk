package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.a;
import net.nk.n;
import net.yz.m_;

public class o extends a {
   public o(net.yv.r var1) {
      super(var1);
      this.S(0.7F, 0.5F);
   }

   public static void f(net.c0.d var0) {
      net.ne.y.J(var0, o.class);
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(12.0D);
   }

   public boolean S(net.ne.l var1) {
      net.u.d[] var2 = n.o.y();
      if(super.S(var1)) {
         if(var1 instanceof net.ne.a) {
            boolean var3 = false;
            if(this.hl.k() == net.yv.l.NORMAL) {
               var3 = true;
            }

            if(this.hl.k() == net.yv.l.HARD) {
               var3 = true;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      return var2;
   }

   public float A() {
      return 0.45F;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.p0;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
