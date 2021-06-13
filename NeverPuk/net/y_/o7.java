package net.y_;

import javax.annotation.Nullable;
import net.xn;
import net.y9.gh;
import net.y_.b;
import net.y_.ow;
import net.y_.s;
import net.yz.aq;

public class o7 extends ow {
   public o7(net.ne.s var1, double var2) {
      super(var1, var2);
   }

   @Nullable
   protected net.u.r N() {
      net.u.r var1 = null;
      if(this.p.p() || this.p.q()) {
         var1 = s.Y(this.p, 15, 15);
      }

      if(this.p.Q().nextFloat() >= this.a) {
         var1 = this.O();
      }

      return super.N();
   }

   @Nullable
   private net.u.r O() {
      b.q();
      net.u.j var2 = new net.u.j(this.p);
      net.u.j var3 = new net.u.j();
      net.u.j var4 = new net.u.j();

      for(net.u.j var7 : net.u.j.R(net.u.t.L(this.p.b - 3.0D), net.u.t.L(this.p.hS - 6.0D), net.u.t.L(this.p.hr - 3.0D), net.u.t.L(this.p.b + 3.0D), net.u.t.L(this.p.hS + 6.0D), net.u.t.L(this.p.hr + 3.0D))) {
         if(!var2.equals(var7)) {
            net.y9.l var8 = this.p.hl.Z(var4.V(var7).q(aq.DOWN)).Q();
            boolean var9 = var8 instanceof gh || var8 == net.nb.f.u6 || var8 == net.nb.f.ub;
            if(this.p.hl.y(var7) && this.p.hl.y((net.u.j)var3.V(var7).q(aq.UP))) {
               ;
            }

            return new net.u.r((double)var7.t(), (double)var7.h(), (double)var7.y());
         }
      }

      return null;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
