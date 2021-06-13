package net.yn;

import net.xn;
import net.n0.ks;
import net.yn.j;

public abstract class q extends j {
   private static final net.k.v IB = net.k.n.q(q.class, net.k.y.f);

   public q(net.yv.r var1) {
      super(var1);
      this.N9 = false;
   }

   protected void g() {
      super.g();
      this.G.r(IB, Boolean.valueOf(false));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t((double)this.O());
      this.t(net.ne.d.G).t(0.17499999701976776D);
      this.t(NA).t(0.5D);
   }

   public boolean TJ() {
      return ((Boolean)this.G.a(IB)).booleanValue();
   }

   public void n(boolean var1) {
      this.G.d(IB, Boolean.valueOf(var1));
   }

   protected int R() {
      return this.TJ()?17:super.R();
   }

   public double e() {
      return super.e() - 0.25D;
   }

   protected net.yz.a U() {
      super.U();
      return net.nb.l.Mi;
   }

   public void O(net.yz.z var1) {
      super.O(var1);
      if(this.TJ()) {
         if(!this.hl.x) {
            this.S(net.n0.y.q(net.nb.f.uG), 1);
         }

         this.n(false);
      }

   }

   public static void X(net.c0.d var0, Class var1) {
      j.t(var0, var1);
      var0.U(net.c0.q.ENTITY, new net.ng.u(var1, new String[]{"Items"}));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("ChestedHorse", this.TJ());
      if(this.TJ()) {
         net.nj.h var2 = new net.nj.h();

         for(int var3 = 2; var3 < this.Nq.e(); ++var3) {
            ks var4 = this.Nq.A(var3);
            if(!var4.B()) {
               net.nj.f var5 = new net.nj.f();
               var5.D("Slot", (byte)var3);
               var4.Z(var5);
               var2.m(var5);
            }
         }

         var1.K("Items", var2);
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.n(var1.i("ChestedHorse"));
      if(this.TJ()) {
         net.nj.h var2 = var1.A("Items", 10);
         this.I_();

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            net.nj.f var4 = var2.i(var3);
            int var5 = var4.R("Slot") & 255;
            if(var5 >= 2 && var5 < this.Nq.e()) {
               this.Nq.S(var5, new ks(var4));
            }
         }
      }

      this.IK();
   }

   public boolean K(int var1, ks var2) {
      if(var1 == 499) {
         if(this.TJ() && var2.B()) {
            this.n(false);
            this.I_();
            return true;
         }

         if(!this.TJ() && var2.Z() == net.n0.y.q(net.nb.f.uG)) {
            this.n(true);
            this.I_();
            return true;
         }
      }

      return super.K(var1, var2);
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      if(var4.Z() == net.nb.j.N) {
         return super.R(var1, var2);
      } else {
         if(!this.H9()) {
            if(this.Up() && var1.Q()) {
               this.t(var1);
               return true;
            }

            if(this.t()) {
               return super.R(var1, var2);
            }
         }

         if(!var4.B()) {
            boolean var5 = this.N(var1, var4);
            if(!var5 && !this.Up()) {
               if(var4.f(var1, this, var2)) {
                  return true;
               }

               this.Is();
               return true;
            }

            if(!var5 && !this.TJ() && var4.Z() == net.n0.y.q(net.nb.f.uG)) {
               this.n(true);
               this.RQ();
               var5 = true;
               this.I_();
            }

            if(!var5 && !this.H9() && !this.Us() && var4.Z() == net.nb.j.h) {
               this.t(var1);
               return true;
            }

            if(var5) {
               if(!var1.a6.V) {
                  var4.H(1);
               }

               return true;
            }
         }

         if(this.H9()) {
            return super.R(var1, var2);
         } else if(var4.f(var1, this, var2)) {
            return true;
         } else {
            this.n(var1);
            return true;
         }
      }
   }

   protected void RQ() {
      this.I(net.nb.l.PU, 1.0F, (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
   }

   public int k() {
      return 5;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
