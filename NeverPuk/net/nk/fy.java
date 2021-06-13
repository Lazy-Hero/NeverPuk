package net.nk;

import java.util.UUID;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.nk.fu;
import net.nk.n;
import net.yz.m_;

public class fy extends fu {
   private static final net.k.v mB = net.k.n.q(fy.class, net.k.y.f);
   private static final net.k.v mS = net.k.n.q(fy.class, net.k.y.d);
   private int mO;
   private UUID mu;

   public fy(net.yv.r var1) {
      super(var1);
   }

   protected void g() {
      super.g();
      this.G.r(mB, Boolean.valueOf(false));
      this.G.r(mS, Integer.valueOf(0));
   }

   public void h(int var1) {
      this.G.d(mS, Integer.valueOf(var1));
   }

   public int k() {
      return Math.max(((Integer)this.G.a(mS)).intValue() % 6, 0);
   }

   public static void k(net.c0.d var0) {
      net.ne.y.J(var0, fy.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Profession", this.k());
      var1.r("ConversionTime", this.tU()?this.mO:-1);
      if(this.mu != null) {
         var1.h("ConversionPlayer", this.mu);
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.h(var1.P("Profession"));
      if(var1.K("ConversionTime", 99) && var1.P("ConversionTime") > -1) {
         this.q(var1.H("ConversionPlayer")?var1.R("ConversionPlayer"):null, var1.P("ConversionTime"));
      }

   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      this.h(this.hl.G.nextInt(6));
      return super.t(var1, var2);
   }

   public void A() {
      if(!this.hl.x && this.tU()) {
         int var1 = this.Y();
         this.mO -= var1;
         if(this.mO <= 0) {
            this.kI();
         }
      }

      super.A();
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(var3.Z() == net.nb.j.J && var3.n() == 0 && this.J(net.nb.b.a)) {
         if(!var1.a6.V) {
            var3.H(1);
         }

         if(!this.hl.x) {
            this.q(var1.O(), this.p.nextInt(2401) + 3600);
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean lB() {
      return !this.tU();
   }

   public boolean tU() {
      return ((Boolean)this.A().a(mB)).booleanValue();
   }

   protected void q(@Nullable UUID var1, int var2) {
      this.mu = var1;
      this.mO = var2;
      this.A().d(mB, Boolean.valueOf(true));
      this.V(net.nb.b.a);
      this.o(new net.n_.i(net.nb.b.L, var2, Math.min(this.hl.k().L() - 1, 0)));
      this.hl.k(this, (byte)16);
   }

   public void R(byte var1) {
      if(var1 == 16) {
         if(!this.c()) {
            this.hl.m(this.b + 0.5D, this.hS + 0.5D, this.hr + 0.5D, net.nb.l.oe, this.E(), 1.0F + this.p.nextFloat(), this.p.nextFloat() * 0.7F + 0.3F, false);
         }
      } else {
         super.R(var1);
      }

   }

   protected void kI() {
      n.o.y();
      net.yn.s var2 = new net.yn.s(this.hl);
      var2.e(this);
      var2.f(this.k());
      var2.C(this.hl.G(new net.u.j(var2)), (net.ne.g)null, false);
      var2.H();
      if(this.H9()) {
         var2.V(-24000);
      }

      this.hl.W((net.ne.l)this);
      var2.e(this.lJ());
      if(this.H()) {
         var2.K(this.X());
         var2.r(this.y());
      }

      this.hl.S(var2);
      if(this.mu != null) {
         net.r.r var3 = this.hl.W(this.mu);
         if(var3 instanceof net.r.h) {
            b2.U.N((net.r.h)var3, this, var2);
         }
      }

      var2.o(new net.n_.i(net.nb.b.f, 200, 0));
      this.hl.N((net.r.r)null, 1027, new net.u.j((int)this.b, (int)this.hS, (int)this.hr), 0);
   }

   protected int Y() {
      int var1 = 1;
      if(this.p.nextFloat() < 0.01F) {
         int var2 = 0;
         net.u.j var3 = new net.u.j();

         for(int var4 = (int)this.b - 4; var4 < (int)this.b + 4; ++var4) {
            for(int var5 = (int)this.hS - 4; var5 < (int)this.hS + 4; ++var5) {
               for(int var6 = (int)this.hr - 4; var6 < (int)this.hr + 4; ++var6) {
                  net.y9.l var7 = this.hl.Z(var3.V(var4, var5, var6)).Q();
                  if(var7 == net.nb.f.d8 || var7 == net.nb.f.uP) {
                     if(this.p.nextFloat() < 0.3F) {
                        ++var1;
                     }

                     ++var2;
                  }
               }
            }
         }
      }

      return var1;
   }

   protected float s() {
      return this.H9()?(this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 2.0F:(this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F;
   }

   public net.yz.a T() {
      return net.nb.l.oD;
   }

   public net.yz.a m(net.yz.z var1) {
      return net.nb.l.CQ;
   }

   public net.yz.a r() {
      return net.nb.l.p;
   }

   public net.yz.a M() {
      return net.nb.l.DK;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.b;
   }

   protected ks Q() {
      return ks.a;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
