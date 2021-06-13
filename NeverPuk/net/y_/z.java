package net.y_;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.y_.b;

public class z extends b {
   private final net.yn.s Q;
   private net.nk.b M;
   private int b;
   private boolean C;

   public z(net.yn.s var1) {
      this.Q = var1;
      this.h(3);
   }

   public boolean f() {
      boolean var1 = b.E();
      if(this.Q.z() >= 0) {
         return false;
      } else if(!this.Q.hl.u()) {
         return false;
      } else {
         List var2 = this.Q.hl.p(net.nk.b.class, this.Q.i().f(6.0D, 2.0D, 6.0D));
         if(var2.isEmpty()) {
            return false;
         } else {
            Iterator var3 = var2.iterator();
            if(var3.hasNext()) {
               net.nk.b var4 = (net.nk.b)var3.next();
               if(var4.t() > 0) {
                  this.M = var4;
               }
            }

            return this.M != null;
         }
      }
   }

   public boolean X() {
      return this.M.t() > 0;
   }

   public void I() {
      this.b = this.Q.Q().nextInt(320);
      this.C = false;
      this.M.H().u();
   }

   public void C() {
      this.M = null;
      this.Q.H().u();
   }

   public void E() {
      this.Q.E().n(this.M, 30.0F, 30.0F);
      if(this.M.t() == this.b) {
         this.Q.H().F(this.M, 0.5D);
         this.C = true;
      }

      if(this.C && this.Q.F(this.M) < 4.0D) {
         this.M.x(false);
         this.Q.H().u();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
