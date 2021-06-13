package net.y_;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.xn;
import net.y9.zu;
import net.y_.b;

public class q extends b {
   private static final Predicate X = net.cw.j.T(net.nb.f.TU).f(zu.p, Predicates.equalTo(zu.i.GRASS));
   private final net.ne.y L;
   private final net.yv.r v;
   int F;

   public q(net.ne.y var1) {
      this.L = var1;
      this.v = var1.hl;
      this.h(7);
   }

   public boolean f() {
      if(this.L.Q().nextInt(this.L.H9()?50:1000) != 0) {
         return false;
      } else {
         net.u.j var1 = new net.u.j(this.L.b, this.L.hS, this.L.hr);
         return X.apply(this.v.Z(var1))?true:this.v.Z(var1.b()).Q() == net.nb.f.p;
      }
   }

   public void I() {
      this.F = 40;
      this.v.k(this.L, (byte)10);
      this.L.H().u();
   }

   public void C() {
      this.F = 0;
   }

   public boolean X() {
      return this.F > 0;
   }

   public int i() {
      return this.F;
   }

   public void E() {
      b.E();
      this.F = Math.max(0, this.F - 1);
      if(this.F == 4) {
         net.u.j var2 = new net.u.j(this.L.b, this.L.hS, this.L.hr);
         if(X.apply(this.v.Z(var2))) {
            if(this.v.N().b("mobGriefing")) {
               this.v.e(var2, false);
            }

            this.L.l();
         }

         net.u.j var3 = var2.b();
         if(this.v.Z(var3).Q() == net.nb.f.p) {
            if(this.v.N().b("mobGriefing")) {
               this.v.s(2001, var3, net.y9.l.h(net.nb.f.p));
               this.v.k(var3, net.nb.f.dl.p(), 2);
            }

            this.L.l();
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
