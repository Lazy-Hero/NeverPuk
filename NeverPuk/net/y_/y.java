package net.y_;

import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.o8;
import net.y_.ou;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y extends b {
   private static final Logger U = LogManager.getLogger();
   private final net.ne.y w;
   private final Predicate W;
   private final o8.j H;
   private net.ne.a z;
   private final Class E;

   public y(net.ne.y var1, Class var2) {
      this.w = var1;
      this.E = var2;
      if(var1 instanceof net.ne.s) {
         U.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
      }

      this.W = new Predicate() {
         public boolean c(@Nullable net.ne.a var1) {
            b.E();
            double var3 = y.this.L();
            if(var1.Q()) {
               var3 *= 0.800000011920929D;
            }

            return var1.e()?false:Double.compare((double)var1.d(y.this.w), var3) <= 0 && ou.V(y.this.w, var1, false, true);
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.H = new o8.j(var1);
   }

   public boolean f() {
      double var2 = this.L();
      b.q();
      List var4 = this.w.hl.L(this.E, this.w.i().f(var2, 4.0D, var2), this.W);
      Collections.sort(var4, this.H);
      if(var4.isEmpty()) {
         return false;
      } else {
         this.z = (net.ne.a)var4.get(0);
         return true;
      }
   }

   public boolean X() {
      b.E();
      net.ne.a var2 = this.w.M();
      if(var2 == null) {
         return false;
      } else if(!var2.P()) {
         return false;
      } else {
         double var3 = this.L();
         return Double.compare(this.w.F(var2), var3 * var3) > 0?false:!(var2 instanceof net.r.h) || !((net.r.h)var2).tA.x();
      }
   }

   public void I() {
      this.w.C(this.z);
      super.I();
   }

   public void C() {
      this.w.C((net.ne.a)null);
      super.I();
   }

   protected double L() {
      net.s.i var1 = this.w.t(net.ne.d.L);
      return 16.0D;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
