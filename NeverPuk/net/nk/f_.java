package net.nk;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.i;
import net.nk.n;
import net.nl.z2;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.ai;
import net.yz.m_;

public class f_ extends i implements net.ne.x {
   private static final UUID BR = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final net.s.k Bj = (new net.s.k(BR, "Drinking speed penalty", -0.25D, 0)).A(false);
   private static final net.k.v B2 = net.k.n.q(f_.class, net.k.y.f);
   private int Bd;

   public f_(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.95F);
   }

   public static void P(net.c0.d var0) {
      net.ne.y.J(var0, f_.class);
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(2, new net.y_.g(this, 1.0D, 60, 10.0F));
      this.p_.X(2, new ow(this, 1.0D));
      this.p_.X(3, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(3, new oa(this));
      this.pM.X(1, new oo(this, false, new Class[0]));
      this.pM.X(2, new o8(this, net.r.r.class, true));
   }

   protected void g() {
      super.g();
      this.A().r(B2, Boolean.valueOf(false));
   }

   protected net.yz.a T() {
      return net.nb.l.o4;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.C1;
   }

   protected net.yz.a r() {
      return net.nb.l.oQ;
   }

   public void Q(boolean var1) {
      this.A().d(B2, Boolean.valueOf(var1));
   }

   public boolean OC() {
      return ((Boolean)this.A().a(B2)).booleanValue();
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(26.0D);
      this.t(net.ne.d.G).t(0.25D);
   }

   public void d() {
      net.u.d[] var1 = n.o.y();
      if(!this.hl.x) {
         label19: {
            if(this.OC()) {
               if(this.Bd-- > 0) {
                  break label19;
               }

               this.Q(false);
               ks var2 = this.S();
               this.u(z2.MAINHAND, ks.a);
               if(var2.Z() == net.nb.j.I) {
                  List var3 = net.n_.y.y(var2);
                  Iterator var4 = var3.iterator();
                  if(var4.hasNext()) {
                     net.n_.i var5 = (net.n_.i)var4.next();
                     this.o(new net.n_.i(var5));
                  }
               }

               this.t(net.ne.d.G).n(Bj);
            }

            net.n_.b var6 = null;
            if(Float.compare(this.p.nextFloat(), 0.15F) < 0 && this.A(net.y1.l.p) && !this.J(net.nb.b.x)) {
               var6 = net.nb.w.t;
            } else if(Float.compare(this.p.nextFloat(), 0.15F) < 0 && (this.a() || this.N() != null && this.N().q()) && !this.J(net.nb.b.t)) {
               var6 = net.nb.w.r;
            } else if(Float.compare(this.p.nextFloat(), 0.05F) < 0 && Float.compare(this.h(), this.w()) < 0) {
               var6 = net.nb.w.Z;
            } else if(this.p.nextFloat() < 0.5F && this.M() != null && !this.J(net.nb.b.E) && this.M().F(this) > 121.0D) {
               var6 = net.nb.w.H;
            }

            this.u(z2.MAINHAND, net.n_.y.b(new ks(net.nb.j.I), var6));
            this.Bd = this.S().o();
            this.Q(true);
            this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.r, this.E(), 1.0F, 0.8F + this.p.nextFloat() * 0.4F);
            net.s.i var7 = this.t(net.ne.d.G);
            var7.n(Bj);
            var7.g(Bj);
         }

         if(this.p.nextFloat() < 7.5E-4F) {
            this.hl.k(this, (byte)15);
         }
      }

      super.d();
   }

   public void R(byte var1) {
      if(var1 == 15) {
         for(int var2 = 0; var2 < this.p.nextInt(35) + 10; ++var2) {
            this.hl.n(ai.SPELL_WITCH, this.b + this.p.nextGaussian() * 0.12999999523162842D, this.i().c + 0.5D + this.p.nextGaussian() * 0.12999999523162842D, this.hr + this.p.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      } else {
         super.R(var1);
      }

   }

   protected float m(net.yz.z var1, float var2) {
      var2 = super.m(var1, var2);
      if(var1.v() == this) {
         var2 = 0.0F;
      }

      if(var1.p()) {
         var2 = (float)((double)var2 * 0.15D);
      }

      return var2;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.l;
   }

   public void x(net.ne.a var1, float var2) {
      if(!this.OC()) {
         double var3 = var1.hS + (double)var1.A() - 1.100000023841858D;
         double var5 = var1.b + var1.hf - this.b;
         double var7 = var3 - this.hS;
         double var9 = var1.hr + var1.J - this.hr;
         float var11 = net.u.t.R(var5 * var5 + var9 * var9);
         net.n_.b var12 = net.nb.w.B;
         if(var11 >= 8.0F && !var1.J(net.nb.b.h)) {
            var12 = net.nb.w.E;
         } else if(var1.h() >= 8.0F && !var1.J(net.nb.b.j)) {
            var12 = net.nb.w.D;
         } else if(var11 <= 3.0F && !var1.J(net.nb.b.a) && this.p.nextFloat() < 0.25F) {
            var12 = net.nb.w.P;
         }

         net.n1.g var13 = new net.n1.g(this.hl, this, net.n_.y.b(new ks(net.nb.j.YD), var12));
         var13.V -= -20.0F;
         var13.w(var5, var7 + (double)(var11 * 0.2F), var9, 0.75F, 8.0F);
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.PP, this.E(), 1.0F, 0.8F + this.p.nextFloat() * 0.4F);
         this.hl.S(var13);
      }

   }

   public float A() {
      return 1.62F;
   }

   public void c(boolean var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}
