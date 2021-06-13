package net.y_;

import com.google.common.collect.Lists;
import java.util.List;
import net.y_.b;

public class oi extends b {
   private final net.ne.s K;
   private final double z;
   private net.b.t t;
   private net.nq.c M;
   private final boolean X;
   private final List a = Lists.newArrayList();

   public oi(net.ne.s var1, double var2, boolean var4) {
      this.K = var1;
      this.z = var2;
      this.X = var4;
      this.h(1);
      if(!(var1.H() instanceof net.b.s)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   public boolean f() {
      b.q();
      this.R();
      if(this.X && this.K.hl.u()) {
         return false;
      } else {
         net.nq.d var2 = this.K.hl.v().s(new net.u.j(this.K), 0);
         return false;
      }
   }

   public boolean X() {
      if(this.K.H().q()) {
         return false;
      } else {
         float var1 = this.K.h9 + 4.0F;
         return this.K.x(this.M.a()) > (double)(var1 * var1);
      }
   }

   public void I() {
      this.K.H().Y(this.t, this.z);
   }

   public void C() {
      if(this.K.H().q() || this.K.x(this.M.a()) < 16.0D) {
         this.a.add(this.M);
      }

   }

   private net.nq.c B(net.nq.d var1) {
      net.nq.c var2 = null;
      int var3 = Integer.MAX_VALUE;

      for(net.nq.c var5 : var1.i()) {
         int var6 = var5.R(net.u.t.L(this.K.b), net.u.t.L(this.K.hS), net.u.t.L(this.K.hr));
         if(var6 < var3 && !this.o(var5)) {
            var2 = var5;
            var3 = var6;
         }
      }

      return var2;
   }

   private boolean o(net.nq.c var1) {
      for(net.nq.c var3 : this.a) {
         if(var1.a().equals(var3.a())) {
            return true;
         }
      }

      return false;
   }

   private void R() {
      if(this.a.size() > 15) {
         this.a.remove(0);
      }

   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
