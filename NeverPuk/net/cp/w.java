package net.cp;

import io.netty.buffer.Unpooled;
import net._x;
import net.ox;
import net.xn;
import net.cp.v;
import net.m.m;
import net.m.qz;
import net.m.s;
import net.n0.k3;
import net.n0.ks;
import net.n0.q;
import net.nn.j;
import net.r.r;
import net.v.c;
import net.v.u;
import net.y9.l;
import net.y9.lk;
import net.y9.rh;
import net.y9.zc;
import net.yv.o9;
import net.yw.n;
import net.yy.g;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;
import net.yz.k;
import net.yz.p;

public class w {
   private final j M;
   private final net.yp.v v;
   private net.u.j c = new net.u.j(-1, -1, -1);
   private ks T = ks.a;
   public float Z;
   private float Y;
   public int u;
   private boolean j;
   private o9 G = o9.SURVIVAL;
   private int m;

   public w(j var1, net.yp.v var2) {
      this.M = var1;
      this.v = var2;
   }

   public static void Q(j var0, w var1, net.u.j var2, aq var3) {
      if(!var0.s8.Q(var0.sf, var2, var3)) {
         var1.D(var2);
      }

   }

   public void s(r var1) {
      this.G.M(var1.a6);
   }

   public boolean l() {
      return this.G == o9.SPECTATOR;
   }

   public void J(o9 var1) {
      this.G = var1;
      this.G.M(this.M.sf.a6);
   }

   public void R(r var1) {
      var1.hN = -180.0F;
   }

   public boolean k() {
      return this.G.a();
   }

   public boolean D(net.u.j var1) {
      if(this.G.p()) {
         if(this.G == o9.SPECTATOR) {
            return false;
         }

         if(!this.M.sf.VK()) {
            ks var2 = this.M.sf.S();
            if(var2.B()) {
               return false;
            }

            if(!var2.q(this.M.s8.Z(var1).Q())) {
               return false;
            }
         }
      }

      if(this.G.U() && !this.M.sf.S().B() && this.M.sf.S().Z() instanceof k3) {
         return false;
      } else {
         v var7 = this.M.s8;
         n var3 = var7.Z(var1);
         l var4 = var3.Q();
         if((var4 instanceof zc || var4 instanceof rh) && !this.M.sf.Vm()) {
            return false;
         } else if(var3.n() == net.y1.l.q) {
            return false;
         } else {
            var7.s(2001, var1, l.m(var3));
            var4.X(var7, var1, var3, this.M.sf);
            boolean var5 = var7.k(var1, net.nb.f.ou.p(), 11);
            var4.N(var7, var1, var3);
            this.c = new net.u.j(this.c.t(), -1, this.c.y());
            if(!this.G.U()) {
               ks var6 = this.M.sf.S();
               if(!var6.B()) {
                  var6.h(var7, var3, var1, this.M.sf);
                  if(var6.B()) {
                     this.M.sf.e(k.MAIN_HAND, ks.a);
                  }
               }
            }

            return var5;
         }
      }
   }

   public boolean w(net.u.j var1, aq var2) {
      String[] var3 = v.s();
      if(this.G.p()) {
         if(this.G == o9.SPECTATOR) {
            return false;
         }

         if(!this.M.sf.VK()) {
            ks var4 = this.M.sf.S();
            if(var4.B()) {
               return false;
            }

            if(!var4.q(this.M.s8.Z(var1).Q())) {
               return false;
            }
         }
      }

      if(!this.M.s8.T().U(var1)) {
         return false;
      } else {
         if(this.G.U()) {
            this.M.K().O(this.M.s8, var1, this.M.s8.Z(var1), 1.0F);
            this.v.L((net.n2.k)(new m(m.n.START_DESTROY_BLOCK, var1, var2)));
            Q(this.M, this, var1, var2);
            this.u = 5;
         }

         if(!this.j || !this.r(var1)) {
            if(this.j) {
               this.v.L((net.n2.k)(new m(m.n.ABORT_DESTROY_BLOCK, this.c, var2)));
            }

            n var6 = this.M.s8.Z(var1);
            this.M.K().O(this.M.s8, var1, var6, 0.0F);
            this.v.L((net.n2.k)(new m(m.n.START_DESTROY_BLOCK, var1, var2)));
            boolean var5 = var6.n() != net.y1.l.q;
            this.j = true;
            this.c = var1;
            this.T = this.M.sf.S();
            this.Z = 0.0F;
            this.Y = 0.0F;
            this.M.s8.i(this.M.sf.G(), this.c, (int)(this.Z * 10.0F) - 1);
         }

         return true;
      }
   }

   public void I() {
      if(this.j) {
         this.M.K().O(this.M.s8, this.c, this.M.s8.Z(this.c), -1.0F);
         this.v.L((net.n2.k)(new m(m.n.ABORT_DESTROY_BLOCK, this.c, aq.DOWN)));
         this.j = false;
         this.Z = 0.0F;
         this.M.s8.i(this.M.sf.G(), this.c, -1);
         this.M.sf.H();
      }

   }

   public boolean c(net.u.j var1, aq var2) {
      this.F();
      if(this.u > 0) {
         --this.u;
         return true;
      } else if(this.G.U() && this.M.s8.T().U(var1)) {
         this.u = 5;
         this.M.K().O(this.M.s8, var1, this.M.s8.Z(var1), 1.0F);
         this.v.L((net.n2.k)(new m(m.n.START_DESTROY_BLOCK, var1, var2)));
         Q(this.M, this, var1, var2);
         return true;
      } else if(this.r(var1)) {
         n var3 = this.M.s8.Z(var1);
         l var4 = var3.Q();
         if(var3.n() == net.y1.l.q) {
            this.j = false;
            return false;
         } else {
            this.Z += var3.Y(this.M.sf, this.M.sf.hl, var1);
            if(this.Y % 4.0F == 0.0F) {
               lk var5 = var4.X();
               this.M.n().g((net.h.d)(new net.h.a(var5.b(), p.NEUTRAL, (var5.m() + 1.0F) / 8.0F, var5.X() * 0.5F, var1)));
            }

            ++this.Y;
            this.M.K().O(this.M.s8, var1, var3, net.u.t.T(this.Z, 0.0F, 1.0F));
            if(this.Z >= 1.0F) {
               this.j = false;
               this.v.L((net.n2.k)(new m(m.n.STOP_DESTROY_BLOCK, var1, var2)));
               this.D(var1);
               this.Z = 0.0F;
               this.Y = 0.0F;
               this.u = 5;
            }

            this.M.s8.i(this.M.sf.G(), this.c, (int)(this.Z * 10.0F) - 1);
            return true;
         }
      } else {
         return this.w(var1, var2);
      }
   }

   public float e() {
      return this.G.U()?5.0F:4.5F;
   }

   public void u() {
      this.F();
      if(this.v.q().t()) {
         this.v.q().c();
      } else {
         this.v.q().E();
      }

   }

   private boolean r(net.u.j var1) {
      ks var2 = this.M.sf.S();
      boolean var3 = this.T.B() && var2.B();
      if(!this.T.B() && !var2.B()) {
         if(var2.Z() != this.T.Z() || !ks.a(var2, this.T) || !var2.M() && var2.n() != this.T.n()) {
            boolean var4 = false;
         } else {
            boolean var10000 = true;
         }
      }

      return var1.equals(this.c);
   }

   public void F() {
      int var1 = this.M.sf.a8.r;
      if(var1 != this.m) {
         this.m = var1;
         this.v.L((net.n2.k)(new s(this.m)));
      }

   }

   public ad e(g var1, v var2, net.u.j var3, aq var4, net.u.r var5, k var6) {
      this.F();
      ks var7 = var1.o(var6);
      float var8 = (float)(var5.p - (double)var3.t());
      float var9 = (float)(var5.H - (double)var3.h());
      float var10 = (float)(var5.a - (double)var3.y());
      boolean var11 = false;
      if(!this.M.s8.T().U(var3)) {
         return ad.FAIL;
      } else {
         if(this.G != o9.SPECTATOR) {
            n var12 = var2.Z(var3);
            if((!var1.Q() || var1.S().B() && var1.L().B()) && var12.Q().N(var2, var3, var12, var1, var6, var4, var8, var9, var10)) {
               var11 = true;
            }

            if(var7.Z() instanceof q) {
               q var13 = (q)var7.Z();
               if(!var13.S(var2, var3, var4, var1, var7)) {
                  return ad.FAIL;
               }
            }
         }

         this.v.L((net.n2.k)(new net.m.r(var3, var4, var6, var8, var9, var10)));
         if(this.G == o9.SPECTATOR) {
            return ad.SUCCESS;
         } else if(var7.B()) {
            return ad.PASS;
         } else if(var1.H().E(var7.Z())) {
            return ad.PASS;
         } else {
            if(var7.Z() instanceof q && !var1.Vm()) {
               l var16 = ((q)var7.Z()).o();
               if(var16 instanceof zc || var16 instanceof rh) {
                  return ad.FAIL;
               }
            }

            if(this.G.U()) {
               int var17 = var7.n();
               int var18 = var7.U();
               ad var14 = var7.o(var1, var2, var3, var6, var4, var8, var9, var10);
               var7.d(var17);
               var7.u(var18);
               return var14;
            } else {
               return var7.o(var1, var2, var3, var6, var4, var8, var9, var10);
            }
         }
      }
   }

   public ad u(r var1, net.yv.r var2, k var3) {
      if(this.G == o9.SPECTATOR) {
         return ad.PASS;
      } else {
         this.F();
         this.v.L((net.n2.k)(new net.m.j(var3)));
         ks var4 = var1.o((k)var3);
         if(var1.H().E(var4.Z())) {
            return ad.PASS;
         } else {
            int var5 = var4.U();
            am var6 = var4.N(var2, var1, var3);
            ks var7 = (ks)var6.G();
            if(var7 != var4 || var7.U() != var5) {
               var1.e(var3, var7);
            }

            return var6.r();
         }
      }
   }

   public g S(net.yv.r var1, u var2, c var3) {
      return new g(this.M, var1, this.v, var2, var3);
   }

   public void B(r var1, net.ne.l var2) {
      ox var3 = new ox(var2);
      _x.m(var3);
      this.F();
      this.v.L((net.n2.k)(new net.m.p(var2)));
      if(this.G != o9.SPECTATOR) {
         var1.r(var2);
         var1.H();
      }

   }

   public ad a(r var1, net.ne.l var2, k var3) {
      this.F();
      this.v.L((net.n2.k)(new net.m.p(var2, var3)));
      return this.G == o9.SPECTATOR?ad.PASS:var1.e(var2, var3);
   }

   public ad o(r var1, net.ne.l var2, net.u.m var3, k var4) {
      this.F();
      net.u.r var5 = new net.u.r(var3.z.p - var2.b, var3.z.H - var2.hS, var3.z.a - var2.hr);
      this.v.L((net.n2.k)(new net.m.p(var2, var4, var5)));
      return this.G == o9.SPECTATOR?ad.PASS:var2.v(var1, var5, var4);
   }

   public ks K(int var1, int var2, int var3, net.nl.c var4, r var5) {
      short var6 = var5.aG.H(var5.a8);
      ks var7 = var5.aG.p(var2, var3, var4, var5);
      this.v.L((net.n2.k)(new qz(var1, var2, var3, var4, var7, var6)));
      return var7;
   }

   public void g(int var1, net.cr.s var2, boolean var3, r var4) {
      this.v.L((net.n2.k)(new net.m.q(var1, var2, var3)));
   }

   public void m(int var1, int var2) {
      this.v.L((net.n2.k)(new net.m.g(var1, var2)));
   }

   public void J(ks var1, int var2) {
      if(this.G.U()) {
         this.v.L((net.n2.k)(new net.m.o(var2, var1)));
      }

   }

   public void M(ks var1) {
      if(this.G.U() && !var1.B()) {
         this.v.L((net.n2.k)(new net.m.o(-1, var1)));
      }

   }

   public void f(r var1) {
      this.F();
      this.v.L((net.n2.k)(new m(m.n.RELEASE_USE_ITEM, net.u.j.V, aq.DOWN)));
      var1.h();
   }

   public boolean P() {
      return this.G.a();
   }

   public boolean v() {
      return !this.G.U();
   }

   public boolean f() {
      return this.G.U();
   }

   public boolean r() {
      return this.G.U();
   }

   public boolean j() {
      return this.M.sf.M() && this.M.sf.D() instanceof net.yn.j;
   }

   public boolean t() {
      return this.G == o9.SPECTATOR;
   }

   public o9 O() {
      return this.G;
   }

   public boolean W() {
      return this.j;
   }

   public void g(int var1) {
      this.v.L((net.n2.k)(new net.m.l("MC|PickItem", (new net.n2.h(Unpooled.buffer())).a(var1))));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
