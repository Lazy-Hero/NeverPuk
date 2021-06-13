package net.y_;

import net.xn;
import net.n0.ks;
import net.nl.zq;
import net.y_.b;
import net.y_.og;

public class ob extends og {
   private final net.yn.s q;
   private boolean o;
   private boolean S;
   private int A;

   public ob(net.yn.s var1, double var2) {
      super(var1, var2, 16);
      this.q = var1;
   }

   public boolean f() {
      if(this.L <= 0) {
         if(!this.q.hl.N().b("mobGriefing")) {
            return false;
         }

         this.A = -1;
         this.o = this.q.D();
         this.S = this.q.Vw();
      }

      return super.f();
   }

   public boolean X() {
      return this.A >= 0 && super.X();
   }

   public void E() {
      b.E();
      super.E();
      this.q.E().u((double)this.t.t() + 0.5D, (double)(this.t.h() + 1), (double)this.t.y() + 0.5D, 10.0F, (float)this.q.w());
      if(this.J()) {
         net.yv.r var2 = this.q.hl;
         net.u.j var3 = this.t.h();
         net.yw.n var4 = var2.Z(var3);
         net.y9.l var5 = var4.Q();
         if(this.A == 0 && var5 instanceof net.y9.v && ((net.y9.v)var5).z(var4)) {
            var2.e(var3, true);
         }

         if(this.A == 1 && var4.n() == net.y1.l.q) {
            zq var6 = this.q.b();
            int var7 = 0;
            if(var7 < var6.e()) {
               ks var8 = var6.A(var7);
               boolean var9 = false;
               if(!var8.B()) {
                  if(var8.Z() == net.nb.j.Q) {
                     var2.k(var3, net.nb.f.uN.p(), 3);
                     var9 = true;
                  }

                  if(var8.Z() == net.nb.j.We) {
                     var2.k(var3, net.nb.f.T0.p(), 3);
                     var9 = true;
                  }

                  if(var8.Z() == net.nb.j.Wq) {
                     var2.k(var3, net.nb.f.a.p(), 3);
                     var9 = true;
                  }

                  if(var8.Z() == net.nb.j.WY) {
                     var2.k(var3, net.nb.f.Tf.p(), 3);
                     var9 = true;
                  }
               }

               ++var7;
            }
         }

         this.A = -1;
         this.L = 10;
      }

   }

   protected boolean b(net.yv.r var1, net.u.j var2) {
      net.y9.l var3 = var1.Z(var2).Q();
      if(var3 == net.nb.f.dJ) {
         var2 = var2.h();
         net.yw.n var4 = var1.Z(var2);
         var3 = var4.Q();
         if(var3 instanceof net.y9.v && ((net.y9.v)var3).z(var4) && this.S && (this.A == 0 || this.A < 0)) {
            this.A = 0;
            return true;
         }

         if(var4.n() == net.y1.l.q && this.o && (this.A == 1 || this.A < 0)) {
            this.A = 1;
            return true;
         }
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
