package net.y_;

import net.xn;
import net.y9.r9;
import net.y_.b;
import net.y_.d;

public class p extends d {
   private int G;
   private int V = -1;

   public p(net.ne.y var1) {
      super(var1);
   }

   public boolean f() {
      if(!super.f()) {
         return false;
      } else if(!this.s.hl.N().b("mobGriefing")) {
         return false;
      } else {
         r9 var10000 = this.U;
         return !r9.P((net.yv.o8)this.s.hl, (net.u.j)this.e);
      }
   }

   public void I() {
      super.I();
      this.G = 0;
   }

   public boolean X() {
      double var1 = this.s.x(this.e);
      if(this.G <= 240) {
         r9 var10000 = this.U;
         if(!r9.P((net.yv.o8)this.s.hl, (net.u.j)this.e) && var1 < 4.0D) {
            boolean var5 = true;
            return var5;
         }
      }

      boolean var3 = false;
      return var3;
   }

   public void C() {
      super.C();
      this.s.hl.i(this.s.G(), this.e, -1);
   }

   public void E() {
      b.E();
      super.E();
      if(this.s.Q().nextInt(20) == 0) {
         this.s.hl.s(1019, this.e, 0);
      }

      ++this.G;
      int var2 = (int)((float)this.G / 240.0F * 10.0F);
      if(var2 != this.V) {
         this.s.hl.i(this.s.G(), this.e, var2);
         this.V = var2;
      }

      if(this.G == 240 && this.s.hl.k() == net.yv.l.HARD) {
         this.s.hl.J(this.e);
         this.s.hl.s(1021, this.e, 0);
         this.s.hl.s(2001, this.e, net.y9.l.h(this.U));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
