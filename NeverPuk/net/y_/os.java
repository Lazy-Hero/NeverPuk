package net.y_;

import net.y_.b;

public class os extends b {
   private final net.ne.s w;
   private net.nq.c P;

   public os(net.ne.s var1) {
      this.w = var1;
      if(!(var1.H() instanceof net.b.s)) {
         throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
      }
   }

   public boolean f() {
      boolean var1 = b.q();
      if(this.w.hl.u()) {
         return false;
      } else {
         net.u.j var2 = new net.u.j(this.w);
         net.nq.d var3 = this.w.hl.v().s(var2, 16);
         return false;
      }
   }

   public boolean X() {
      return this.w.hl.u()?false:!this.P.p() && this.P.w(new net.u.j(this.w));
   }

   public void I() {
      ((net.b.s)this.w.H()).D(false);
      ((net.b.s)this.w.H()).B(false);
   }

   public void C() {
      ((net.b.s)this.w.H()).D(true);
      ((net.b.s)this.w.H()).B(true);
      this.P = null;
   }

   public void E() {
      this.P.D();
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
