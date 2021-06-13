package net.nm;

import java.util.List;
import net.xn;
import net.n0.y;
import net.ni.sp;
import net.nl.z1;
import net.nm.i;
import net.nm.u;
import net.nm.w;

public class r extends u implements sp {
   private boolean l9 = true;
   private int lR = -1;
   private final net.u.j lS = net.u.j.V;

   public r(net.yv.r var1) {
      super(var1);
   }

   public r(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public w.h R() {
      return w.h.HOPPER;
   }

   public net.yw.n M() {
      return net.nb.f.uq.p();
   }

   public int D() {
      return 1;
   }

   public int e() {
      return 5;
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      if(!this.hl.x) {
         var1.n(this);
      }

      return true;
   }

   public void K(int var1, int var2, int var3, boolean var4) {
      boolean var5 = true;
      if(var5 != this.K()) {
         this.x(var5);
      }

   }

   public boolean K() {
      return this.l9;
   }

   public void x(boolean var1) {
      this.l9 = var1;
   }

   public net.yv.r B() {
      return this.hl;
   }

   public double z() {
      return this.b;
   }

   public double h() {
      return this.hS + 0.5D;
   }

   public double j() {
      return this.hr;
   }

   public void A() {
      w.h.s();
      super.A();
      if(!this.hl.x && this.P() && this.K()) {
         net.u.j var2 = new net.u.j(this);
         if(var2.equals(this.lS)) {
            --this.lR;
         }

         this.A(0);
         if(!this.Z()) {
            this.A(0);
            if(this.R()) {
               this.A(4);
               this.W();
            }
         }
      }

   }

   public boolean R() {
      if(net.ni.i.A(this)) {
         return true;
      } else {
         List var1 = this.hl.L(i.class, this.i().f(0.25D, 0.0D, 0.25D), net.yz.q.Y);
         if(!var1.isEmpty()) {
            net.ni.i.t((z1)null, this, (i)var1.get(0));
         }

         return false;
      }
   }

   public void n(net.yz.z var1) {
      super.n(var1);
      if(this.hl.N().b("doEntityDrops")) {
         this.v(y.q(net.nb.f.uq), 1, 0.0F);
      }

   }

   public static void Y(net.c0.d var0) {
      u.V(var0, r.class);
   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      var1.r("TransferCooldown", this.lR);
      var1.c("Enabled", this.l9);
   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      this.lR = var1.P("TransferCooldown");
      this.l9 = !var1.G("Enabled") || var1.i("Enabled");
   }

   public void A(int var1) {
      this.lR = var1;
   }

   public boolean Z() {
      return this.lR > 0;
   }

   public String H() {
      return "minecraft:hopper";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      return new net.nl.k(var1, this, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
