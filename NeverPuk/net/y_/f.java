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

public class f extends b {
   private static final Logger W = LogManager.getLogger();
   private final net.ne.y x;
   private final Predicate i;
   private final o8.j L;
   private net.ne.a f;

   public f(net.ne.y var1) {
      this.x = var1;
      if(var1 instanceof net.ne.s) {
         W.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
      }

      this.i = new Predicate() {
         public boolean d(@Nullable net.ne.l var1) {
            boolean var2 = b.q();
            if(!(var1 instanceof net.r.r)) {
               return false;
            } else if(((net.r.r)var1).a6.T) {
               return false;
            } else {
               double var3 = f.this.e();
               if(var1.Q()) {
                  var3 *= 0.800000011920929D;
               }

               if(var1.e()) {
                  float var5 = ((net.r.r)var1).I();
                  if(var5 < 0.1F) {
                     var5 = 0.1F;
                  }

                  var3 *= (double)(0.7F * var5);
               }

               return Double.compare((double)var1.d((net.ne.l)f.this.x), var3) <= 0 && ou.V(f.this.x, (net.ne.a)var1, false, true);
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.L = new o8.j(var1);
   }

   public boolean f() {
      double var1 = this.e();
      List var3 = this.x.hl.L(net.r.r.class, this.x.i().f(var1, 4.0D, var1), this.i);
      Collections.sort(var3, this.L);
      if(var3.isEmpty()) {
         return false;
      } else {
         this.f = (net.ne.a)var3.get(0);
         return true;
      }
   }

   public boolean X() {
      b.q();
      net.ne.a var2 = this.x.M();
      if(var2 == null) {
         return false;
      } else if(!var2.P()) {
         return false;
      } else if(var2 instanceof net.r.r && ((net.r.r)var2).a6.T) {
         return false;
      } else {
         net.nc.m var3 = this.x.f();
         net.nc.m var4 = var2.f();
         if(var3 != null && var4 == var3) {
            return false;
         } else {
            double var5 = this.e();
            return Double.compare(this.x.F(var2), var5 * var5) > 0?false:!(var2 instanceof net.r.h) || !((net.r.h)var2).tA.x();
         }
      }
   }

   public void I() {
      this.x.C(this.f);
      super.I();
   }

   public void C() {
      this.x.C((net.ne.a)null);
      super.I();
   }

   protected double e() {
      net.s.i var1 = this.x.t(net.ne.d.L);
      return 16.0D;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
