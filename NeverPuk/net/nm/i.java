package net.nm;

import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.n0.ks;
import net.ng.c;
import net.nm.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i extends net.ne.l {
   private static final Logger Ka = LogManager.getLogger();
   private static final net.k.v Kf = net.k.n.q(i.class, y.k);
   private int K1;
   private int Kv;
   private int Kq;
   private String K9;
   private String KN;
   public float Ke;

   public i(net.yv.r var1, double var2, double var4, double var6) {
      super(var1);
      this.Kq = 5;
      this.Ke = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.S(0.25F, 0.25F);
      this.t(var2, var4, var6);
      this.hN = (float)(Math.random() * 360.0D);
      this.hf = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.K = 0.20000000298023224D;
      this.J = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   public i(net.yv.r var1, double var2, double var4, double var6, ks var8) {
      this(var1, var2, var4, var6);
      this.l(var8);
   }

   protected boolean k() {
      return false;
   }

   public i(net.yv.r var1) {
      super(var1);
      this.Kq = 5;
      this.Ke = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.S(0.25F, 0.25F);
      this.l(ks.a);
   }

   protected void g() {
      this.A().r(Kf, ks.a);
   }

   public void A() {
      boolean var1 = w.h.u();
      if(this.S().B()) {
         this.B();
      }

      super.A();
      if(this.Kv > 0 && this.Kv != 32767) {
         --this.Kv;
      }

      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      double var2 = this.hf;
      double var4 = this.K;
      double var6 = this.J;
      if(!this.j()) {
         this.K -= 0.03999999910593033D;
      }

      if(this.hl.x) {
         this.r = false;
      }

      this.r = this.c(this.b, (this.i().u + this.i().c) / 2.0D, this.hr);
      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      if((int)this.h == (int)this.b && (int)this.h6 == (int)this.hS && (int)this.l == (int)this.hr) {
         boolean var18 = false;
      } else {
         boolean var10000 = true;
      }

      if(this.hl.Z(new net.u.j(this)).n() == net.y1.l.U) {
         this.K = 0.20000000298023224D;
         this.hf = (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
         this.J = (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
         this.I(net.nb.l.D0, 0.4F, 2.0F + this.p.nextFloat() * 0.4F);
      }

      if(!this.hl.x) {
         this.T();
      }

      float var9 = 0.98F;
      if(this.k) {
         var9 = this.hl.Z(new net.u.j(net.u.t.L(this.b), net.u.t.L(this.i().u) - 1, net.u.t.L(this.hr))).Q().P * 0.98F;
      }

      this.hf *= (double)var9;
      this.K *= 0.9800000190734863D;
      this.J *= (double)var9;
      if(this.k) {
         this.K *= -0.5D;
      }

      if(this.K1 != -32768) {
         ++this.K1;
      }

      this.r();
      if(!this.hl.x) {
         double var10 = this.hf - var2;
         double var12 = this.K - var4;
         double var14 = this.J - var6;
         double var16 = var10 * var10 + var12 * var12 + var14 * var14;
         if(Double.compare(var16, 0.01D) > 0) {
            this.w = true;
         }
      }

      if(!this.hl.x && this.K1 >= 6000) {
         this.B();
      }

   }

   private void T() {
      for(i var2 : this.hl.p(i.class, this.i().f(0.5D, 0.0D, 0.5D))) {
         this.G(var2);
      }

   }

   private boolean G(i var1) {
      if(var1 == this) {
         return false;
      } else if(var1.P() && this.P()) {
         ks var2 = this.S();
         ks var3 = var1.S();
         if(this.Kv != 32767 && var1.Kv != 32767) {
            if(this.K1 != -32768 && var1.K1 != -32768) {
               if(var3.Z() != var2.Z()) {
                  return false;
               } else if(var3.D() ^ var2.D()) {
                  return false;
               } else if(var3.D() && !var3.o().equals(var2.o())) {
                  return false;
               } else if(var3.Z() == null) {
                  return false;
               } else if(var3.Z().I() && var3.n() != var2.n()) {
                  return false;
               } else if(var3.U() < var2.U()) {
                  return var1.G(this);
               } else if(var3.U() + var2.U() > var3.j()) {
                  return false;
               } else {
                  var3.A(var2.U());
                  var1.Kv = Math.max(var1.Kv, this.Kv);
                  var1.K1 = Math.min(var1.K1, this.K1);
                  var1.l(var3);
                  this.B();
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void d() {
      this.K1 = 4800;
   }

   public boolean r() {
      if(this.hl.q(this.i(), net.y1.l.p, this)) {
         if(!this.hW && !this.Y) {
            this.c();
         }

         this.hW = true;
      } else {
         this.hW = false;
      }

      return this.hW;
   }

   protected void l(int var1) {
      this.H(net.yz.z.p, (float)var1);
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(!this.S().B() && this.S().Z() == net.nb.j.WG && var1.e()) {
         return false;
      } else {
         this.E();
         this.Kq = (int)((float)this.Kq - var2);
         if(this.Kq <= 0) {
            this.B();
         }

         return false;
      }
   }

   public static void K(net.c0.d var0) {
      var0.U(net.c0.q.ENTITY, new c(i.class, new String[]{"Item"}));
   }

   public void I(net.nj.f var1) {
      var1.h("Health", (short)this.Kq);
      var1.h("Age", (short)this.K1);
      var1.h("PickupDelay", (short)this.Kv);
      if(this.f() != null) {
         var1.b("Thrower", this.K9);
      }

      if(this.c() != null) {
         var1.b("Owner", this.KN);
      }

      if(!this.S().B()) {
         var1.K("Item", this.S().Z(new net.nj.f()));
      }

   }

   public void o(net.nj.f var1) {
      this.Kq = var1.E("Health");
      this.K1 = var1.E("Age");
      if(var1.G("PickupDelay")) {
         this.Kv = var1.E("PickupDelay");
      }

      if(var1.G("Owner")) {
         this.KN = var1.J("Owner");
      }

      if(var1.G("Thrower")) {
         this.K9 = var1.J("Thrower");
      }

      net.nj.f var2 = var1.o("Item");
      this.l(new ks(var2));
      if(this.S().B()) {
         this.B();
      }

   }

   public void H(net.r.r var1) {
      if(!this.hl.x) {
         ks var2 = this.S();
         net.n0.y var3 = var2.Z();
         int var4 = var2.U();
         if(this.Kv == 0 && (this.KN == null || 6000 - this.K1 <= 200 || this.KN.equals(var1.Q())) && var1.a8.D(var2)) {
            var1.U(this, var4);
            if(var2.B()) {
               this.B();
               var2.u(var4);
            }

            var1.m(net.v.q.y(var3), var4);
         }
      }

   }

   public String Q() {
      return this.H()?this.X():net.yq.e.E("item." + this.S().e());
   }

   public boolean C() {
      return false;
   }

   @Nullable
   public net.ne.l V(int var1) {
      net.ne.l var2 = super.V(var1);
      if(!this.hl.x && var2 instanceof i) {
         ((i)var2).T();
      }

      return var2;
   }

   public ks S() {
      return (ks)this.A().a(Kf);
   }

   public void l(ks var1) {
      this.A().d(Kf, var1);
      this.A().r(Kf);
   }

   public String c() {
      return this.KN;
   }

   public void l(String var1) {
      this.KN = var1;
   }

   public String f() {
      return this.K9;
   }

   public void z(String var1) {
      this.K9 = var1;
   }

   public int O() {
      return this.K1;
   }

   public void b() {
      this.Kv = 10;
   }

   public void F() {
      this.Kv = 0;
   }

   public void l() {
      this.Kv = 32767;
   }

   public void F(int var1) {
      this.Kv = var1;
   }

   public boolean N() {
      return this.Kv > 0;
   }

   public void S() {
      this.K1 = -6000;
   }

   public void W() {
      this.l();
      this.K1 = 5999;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
