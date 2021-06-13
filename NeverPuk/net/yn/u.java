package net.yn;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.f2;
import net.nl.z2;
import net.y_.o6;
import net.y_.oa;
import net.y_.ok;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yz.m_;

public class u extends w {
   private static final net.k.v ev = net.k.n.q(u.class, net.k.y.f);
   private static final net.k.v en = net.k.n.q(u.class, net.k.y.d);
   private static final Set eL = Sets.newHashSet(new net.n0.y[]{net.nb.j.Wq, net.nb.j.We, net.nb.j.YN});
   private boolean ec;
   private int e5;
   private int eW;

   public u(net.yv.r var1) {
      super(var1);
      this.S(0.9F, 0.9F);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new oy(this, 1.25D));
      this.p_.X(3, new ot(this, 1.0D));
      this.p_.X(4, new o6(this, 1.2D, net.nb.j.WB, false));
      this.p_.X(4, new o6(this, 1.2D, false, eL));
      this.p_.X(5, new net.y_.h(this, 1.1D));
      this.p_.X(6, new ow(this, 1.0D));
      this.p_.X(7, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(8, new oa(this));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(10.0D);
      this.t(net.ne.d.G).t(0.25D);
   }

   @Nullable
   public net.ne.l C() {
      return this.H().isEmpty()?null:(net.ne.l)this.H().get(0);
   }

   public boolean lC() {
      net.ne.l var1 = this.C();
      if(!(var1 instanceof net.r.r)) {
         return false;
      } else {
         net.r.r var2 = (net.r.r)var1;
         return var2.S().Z() == net.nb.j.WB || var2.L().Z() == net.nb.j.WB;
      }
   }

   public void O(net.k.v var1) {
      if(en.equals(var1) && this.hl.x) {
         this.ec = true;
         this.e5 = 0;
         this.eW = ((Integer)this.G.a(en)).intValue();
      }

      super.O(var1);
   }

   protected void g() {
      super.g();
      this.G.r(ev, Boolean.valueOf(false));
      this.G.r(en, Integer.valueOf(0));
   }

   public static void h(net.c0.d var0) {
      net.ne.y.J(var0, u.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("Saddle", this.sv());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.P(var1.i("Saddle"));
   }

   protected net.yz.a T() {
      return net.nb.l.M4;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.H0;
   }

   protected net.yz.a r() {
      return net.nb.l.Cf;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.HT, 0.15F, 1.0F);
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      if(!super.R(var1, var2)) {
         ks var3 = var1.o((net.yz.k)var2);
         if(var3.Z() == net.nb.j.YR) {
            var3.f(var1, this, var2);
            return true;
         } else if(this.sv() && !this.t()) {
            if(!this.hl.x) {
               var1.W(this);
            }

            return true;
         } else if(var3.Z() == net.nb.j.h) {
            var3.f(var1, this, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public void O(net.yz.z var1) {
      super.O(var1);
      if(!this.hl.x && this.sv()) {
         this.S(net.nb.j.h, 1);
      }

   }

   @Nullable
   protected m_ N() {
      return net.y7.p.J;
   }

   public boolean sv() {
      return ((Boolean)this.G.a(ev)).booleanValue();
   }

   public void P(boolean var1) {
      this.G.d(ev, Boolean.valueOf(true));
   }

   public void j(net.yi.e var1) {
      if(!this.hl.x && !this.Z) {
         f2 var2 = new f2(this.hl);
         var2.u(z2.MAINHAND, new ks(net.nb.j.SP));
         var2.S(this.b, this.hS, this.hr, this.hN, this.V);
         var2.e(this.lJ());
         if(this.H()) {
            var2.K(this.X());
            var2.r(this.y());
         }

         this.hl.S(var2);
         this.B();
      }

   }

   public void E(float var1, float var2, float var3) {
      int var4 = net.yn.z.B();
      net.ne.l var5 = this.H().isEmpty()?null:(net.ne.l)this.H().get(0);
      if(this.t() && this.lC()) {
         this.hN = var5.hN;
         this.hq = this.hN;
         this.V = var5.V * 0.5F;
         this.r(this.hN, this.V);
         this.AK = this.hN;
         this.A3 = this.hN;
         this.ha = 1.0F;
         this.AN = this.q() * 0.1F;
         if(this.ec && this.e5++ > this.eW) {
            this.ec = false;
         }

         if(this.V()) {
            float var6 = (float)this.t(net.ne.d.G).K() * 0.225F;
            if(this.ec) {
               var6 += var6 * 1.15F * net.u.t.A((float)this.e5 / (float)this.eW * 3.1415927F);
            }

            this.P(var6);
            super.E(0.0F, 0.0F, 1.0F);
         }

         this.hf = 0.0D;
         this.K = 0.0D;
         this.J = 0.0D;
         this.AS = this.Aq;
         double var11 = this.b - this.h;
         double var8 = this.hr - this.l;
         float var10 = net.u.t.R(var11 * var11 + var8 * var8) * 4.0F;
         if(var10 > 1.0F) {
            var10 = 1.0F;
         }

         this.Aq += (var10 - this.Aq) * 0.4F;
         this.A5 += this.Aq;
      }

      this.ha = 0.5F;
      this.AN = 0.02F;
      super.E(var1, var2, var3);
   }

   public boolean D() {
      if(this.ec) {
         return false;
      } else {
         this.ec = true;
         this.e5 = 0;
         this.eW = this.Q().nextInt(841) + 140;
         this.A().d(en, Integer.valueOf(this.eW));
         return true;
      }
   }

   public u Y(net.ne.j var1) {
      return new u(this.hl);
   }

   public boolean V(ks var1) {
      return eL.contains(var1.Z());
   }

   private static xn d(xn var0) {
      return var0;
   }
}
