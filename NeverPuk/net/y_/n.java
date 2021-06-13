package net.y_;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.s;

public class n extends b {
   private final Predicate I;
   protected net.ne.s M;
   private final double d;
   private final double G;
   protected net.ne.l T;
   private final float R;
   private net.b.t L;
   private final net.b.n q;
   private final Class p;
   private final Predicate f;

   public n(net.ne.s var1, Class var2, float var3, double var4, double var6) {
      this(var1, var2, Predicates.alwaysTrue(), var3, var4, var6);
   }

   public n(net.ne.s var1, Class var2, Predicate var3, float var4, double var5, double var7) {
      this.I = new Predicate() {
         public boolean g(@Nullable net.ne.l var1) {
            boolean var2 = b.q();
            return var1.P() && n.this.M.z().v(var1) && !n.this.M.M(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.M = var1;
      this.p = var2;
      this.f = var3;
      this.R = var4;
      this.d = var5;
      this.G = var7;
      this.q = var1.H();
      this.h(1);
   }

   public boolean f() {
      b.E();
      List var2 = this.M.hl.L(this.p, this.M.i().f((double)this.R, 3.0D, (double)this.R), Predicates.and(new Predicate[]{net.yz.q.q, this.I, this.f}));
      if(var2.isEmpty()) {
         return false;
      } else {
         this.T = (net.ne.l)var2.get(0);
         net.u.r var3 = s.e(this.M, 16, 7, new net.u.r(this.T.b, this.T.hS, this.T.hr));
         return false;
      }
   }

   public boolean X() {
      return !this.q.q();
   }

   public void I() {
      this.q.Y(this.L, this.d);
   }

   public void C() {
      this.T = null;
   }

   public void E() {
      boolean var1 = b.q();
      if(this.M.F(this.T) < 49.0D) {
         this.M.H().f(this.G);
      }

      this.M.H().f(this.d);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
