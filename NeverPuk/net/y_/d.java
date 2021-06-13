package net.y_;

import net.y9.r9;
import net.y_.b;

public abstract class d extends b {
   protected net.ne.y s;
   protected net.u.j e = net.u.j.V;
   protected r9 U;
   boolean M;
   float c;
   float J;

   public d(net.ne.y var1) {
      this.s = var1;
      if(!(var1.H() instanceof net.b.s)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.s.t) {
         return false;
      } else {
         net.b.s var2 = (net.b.s)this.s.H();
         net.b.t var3 = var2.N();
         if(var3 != null && !var3.P() && var2.y()) {
            int var4 = 0;
            if(var4 < Math.min(var3.P() + 2, var3.R())) {
               net.b.c var5 = var3.y(var4);
               this.e = new net.u.j(var5.H, var5.E + 1, var5.i);
               if(Double.compare(this.s.o((double)this.e.t(), this.s.hS, (double)this.e.y()), 2.25D) <= 0) {
                  this.U = this.i(this.e);
                  if(this.U != null) {
                     return true;
                  }
               }

               ++var4;
            }

            this.e = (new net.u.j(this.s)).h();
            this.U = this.i(this.e);
            return this.U != null;
         } else {
            return false;
         }
      }
   }

   public boolean X() {
      return !this.M;
   }

   public void I() {
      this.M = false;
      this.c = (float)((double)((float)this.e.t() + 0.5F) - this.s.b);
      this.J = (float)((double)((float)this.e.y() + 0.5F) - this.s.hr);
   }

   public void E() {
      float var1 = (float)((double)((float)this.e.t() + 0.5F) - this.s.b);
      float var2 = (float)((double)((float)this.e.y() + 0.5F) - this.s.hr);
      float var3 = this.c * var1 + this.J * var2;
      if(var3 < 0.0F) {
         this.M = true;
      }

   }

   private r9 i(net.u.j var1) {
      net.yw.n var2 = this.s.hl.Z(var1);
      net.y9.l var3 = var2.Q();
      return var3 instanceof r9 && var2.n() == net.y1.l.S?(r9)var3:null;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
