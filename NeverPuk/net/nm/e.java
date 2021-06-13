package net.nm;

import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.n0.ks;
import net.n0.yn;
import net.ng.c;
import net.nm.w;
import net.yz.aq;

public class e extends net.ne.n {
   private static final net.k.v kA = net.k.n.q(e.class, y.k);
   private static final net.k.v k5 = net.k.n.q(e.class, y.d);
   private float kw = 1.0F;

   public e(net.yv.r var1) {
      super(var1);
   }

   public e(net.yv.r var1, net.u.j var2, aq var3) {
      super(var1, var2);
      this.b(var3);
   }

   protected void g() {
      this.A().r(kA, ks.a);
      this.A().r(k5, Integer.valueOf(0));
   }

   public float t() {
      return 0.0F;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(!var1.e() && !this.I().B()) {
         if(!this.hl.x) {
            this.e(var1.v(), false);
            this.I(net.nb.l.K9, 1.0F, 1.0F);
            this.K(ks.a);
         }

         return true;
      } else {
         return super.H(var1, var2);
      }
   }

   public int o() {
      return 12;
   }

   public int E() {
      return 12;
   }

   public boolean p(double var1) {
      double var3 = 16.0D;
      var3 = var3 * 64.0D * v();
      return var1 < var3 * var3;
   }

   public void C(@Nullable net.ne.l var1) {
      this.I(net.nb.l.Cn, 1.0F, 1.0F);
      this.e(var1, true);
   }

   public void a() {
      this.I(net.nb.l.KQ, 1.0F, 1.0F);
   }

   public void e(@Nullable net.ne.l var1, boolean var2) {
      boolean var3 = w.h.s();
      if(this.hl.N().b("doEntityDrops")) {
         ks var4 = this.I();
         if(var1 instanceof net.r.r) {
            net.r.r var5 = (net.r.r)var1;
            if(var5.a6.V) {
               this.v(var4);
               return;
            }
         }

         if(var2) {
            this.O(new ks(net.nb.j.SH), 0.0F);
         }

         if(!var4.B() && this.p.nextFloat() < this.kw) {
            var4 = var4.s();
            this.v(var4);
            this.O(var4, 0.0F);
         }
      }

   }

   private void v(ks var1) {
      if(!var1.B()) {
         if(var1.Z() == net.nb.j.WN) {
            net.cg.s var2 = ((yn)var1.Z()).t(var1, this.hl);
            var2.Q.remove("frame-" + this.G());
         }

         var1.C((e)null);
      }

   }

   public ks I() {
      return (ks)this.A().a(kA);
   }

   public void K(ks var1) {
      this.N(var1, true);
   }

   private void N(ks var1, boolean var2) {
      if(!var1.B()) {
         var1 = var1.s();
         var1.u(1);
         var1.C(this);
      }

      this.A().d(kA, var1);
      this.A().r(kA);
      if(!var1.B()) {
         this.I(net.nb.l.Kb, 1.0F, 1.0F);
      }

      if(this.uD != null) {
         this.hl.Z(this.uD, net.nb.f.ou);
      }

   }

   public void O(net.k.v var1) {
      if(var1.equals(kA)) {
         ks var2 = this.I();
         if(!var2.B() && var2.o() != this) {
            var2.C(this);
         }
      }

   }

   public int P() {
      return ((Integer)this.A().a(k5)).intValue();
   }

   public void Y(int var1) {
      this.u(var1, true);
   }

   private void u(int var1, boolean var2) {
      this.A().d(k5, Integer.valueOf(var1 % 8));
      if(this.uD != null) {
         this.hl.Z(this.uD, net.nb.f.ou);
      }

   }

   public static void I(net.c0.d var0) {
      var0.U(net.c0.q.ENTITY, new c(e.class, new String[]{"Item"}));
   }

   public void I(net.nj.f var1) {
      if(!this.I().B()) {
         var1.K("Item", this.I().Z(new net.nj.f()));
         var1.D("ItemRotation", (byte)this.P());
         var1.d("ItemDropChance", this.kw);
      }

      super.I(var1);
   }

   public void o(net.nj.f var1) {
      net.nj.f var2 = var1.o("Item");
      if(!var2.N()) {
         this.N(new ks(var2), false);
         this.u(var1.R("ItemRotation"), false);
         if(var1.K("ItemDropChance", 99)) {
            this.kw = var1.S("ItemDropChance");
         }
      }

      super.o(var1);
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(!this.hl.x) {
         if(this.I().B()) {
            if(!var3.B()) {
               this.K(var3);
               if(!var1.a6.V) {
                  var3.H(1);
               }
            }
         } else {
            this.I(net.nb.l.Pk, 1.0F, 1.0F);
            this.Y(this.P() + 1);
         }
      }

      return true;
   }

   public int x() {
      return this.I().B()?0:this.P() % 8 + 1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
