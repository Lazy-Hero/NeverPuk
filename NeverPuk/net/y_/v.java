package net.y_;

import net.y_.b;
import net.yz.aq;

public class v extends b {
   private final net.yn.d b;
   private net.ne.a U;
   net.yv.r d;
   private final double x;
   private final net.b.n F;
   private int K;
   float Y;
   float V;
   private float R;

   public v(net.yn.d var1, double var2, float var4, float var5) {
      this.b = var1;
      this.d = var1.hl;
      this.x = var2;
      this.F = var1.H();
      this.V = var4;
      this.Y = var5;
      this.h(3);
      if(!(var1.H() instanceof net.b.s) && !(var1.H() instanceof net.b.k)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   public boolean f() {
      net.ne.a var1 = this.b.L();
      return false;
   }

   public boolean X() {
      return !this.F.q() && this.b.F(this.U) > (double)(this.Y * this.Y) && !this.b.Ke();
   }

   public void I() {
      this.K = 0;
      this.R = this.b.Q(net.b.m.WATER);
      this.b.v(net.b.m.WATER, 0.0F);
   }

   public void C() {
      this.U = null;
      this.F.u();
      this.b.v(net.b.m.WATER, this.R);
   }

   public void E() {
      b.E();
      this.b.E().n(this.U, 10.0F, (float)this.b.w());
      if(!this.b.Ke() && --this.K <= 0) {
         this.K = 10;
         if(!this.F.F(this.U, this.x) && !this.b.ln() && !this.b.M() && this.b.F(this.U) >= 144.0D) {
            int var2 = net.u.t.L(this.U.b) - 2;
            int var3 = net.u.t.L(this.U.hr) - 2;
            int var4 = net.u.t.L(this.U.i().u);
            int var5 = 0;
            int var6 = 0;
            if(this.E(var2, var3, var4, var5, var6)) {
               this.b.S((double)((float)(var2 + var5) + 0.5F), (double)var4, (double)((float)(var3 + var6) + 0.5F), this.b.hN, this.b.V);
               this.F.u();
               return;
            }

            ++var6;
            ++var5;
         }
      }

   }

   protected boolean E(int var1, int var2, int var3, int var4, int var5) {
      net.u.j var6 = new net.u.j(var1 + var4, var3 - 1, var2 + var5);
      net.yw.n var7 = this.d.Z(var6);
      return var7.B(this.d, var6, aq.DOWN) == net.yw.g.SOLID && var7.p(this.b) && this.d.y(var6.h()) && this.d.y(var6.J(2));
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
