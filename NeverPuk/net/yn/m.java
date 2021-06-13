package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.yn.f;
import net.yz.m_;

public class m extends f {
   public float De;
   public float Dn;
   public float Dh;
   public float DC;
   public float D1;
   public float DG;
   public float Dd;
   public float D0;
   private float DR;
   private float Dg;
   private float DW;
   private float Dt;
   private float DY;
   private float DN;

   public m(net.yv.r var1) {
      super(var1);
      this.S(0.8F, 0.8F);
      this.p.setSeed((long)(1 + this.G()));
      this.Dg = 1.0F / (this.p.nextFloat() + 1.0F) * 0.2F;
   }

   public static void m(net.c0.d var0) {
      net.ne.y.J(var0, m.class);
   }

   protected void D() {
      this.p_.X(0, new m.t(this));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(10.0D);
   }

   public float A() {
      return this.m * 0.5F;
   }

   protected net.yz.a T() {
      return net.nb.l.DG;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Ck;
   }

   protected net.yz.a r() {
      return net.nb.l.DY;
   }

   protected float G() {
      return 0.4F;
   }

   protected boolean k() {
      return false;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pJ;
   }

   public void d() {
      super.d();
      this.Dn = this.De;
      net.yn.z.C();
      this.DC = this.Dh;
      this.DG = this.D1;
      this.D0 = this.Dd;
      this.D1 += this.Dg;
      if(Double.compare((double)this.D1, 6.283185307179586D) > 0) {
         if(this.hl.x) {
            this.D1 = 6.2831855F;
         }

         this.D1 = (float)((double)this.D1 - 6.283185307179586D);
         if(this.p.nextInt(10) == 0) {
            this.Dg = 1.0F / (this.p.nextFloat() + 1.0F) * 0.2F;
         }

         this.hl.k(this, (byte)19);
      }

      if(this.hW) {
         if(this.D1 < 3.1415927F) {
            float var2 = this.D1 / 3.1415927F;
            this.Dd = net.u.t.A(var2 * var2 * 3.1415927F) * 3.1415927F * 0.25F;
            if((double)var2 > 0.75D) {
               this.DR = 1.0F;
               this.DW = 1.0F;
            }

            this.DW *= 0.8F;
         }

         this.Dd = 0.0F;
         this.DR *= 0.9F;
         this.DW *= 0.99F;
         if(!this.hl.x) {
            this.hf = (double)(this.Dt * this.DR);
            this.K = (double)(this.DY * this.DR);
            this.J = (double)(this.DN * this.DR);
         }

         float var3 = net.u.t.R(this.hf * this.hf + this.J * this.J);
         this.AK += (-((float)net.u.t.V(this.hf, this.J)) * 57.295776F - this.AK) * 0.1F;
         this.hN = this.AK;
         this.Dh = (float)((double)this.Dh + 3.141592653589793D * (double)this.DW * 1.5D);
         this.De += (-((float)net.u.t.V((double)var3, this.K)) * 57.295776F - this.De) * 0.1F;
      }

      this.Dd = net.u.t.J(net.u.t.A(this.D1)) * 3.1415927F * 0.25F;
      if(!this.hl.x) {
         this.hf = 0.0D;
         this.J = 0.0D;
         if(this.J(net.nb.b.A)) {
            this.K += 0.05D * (double)(this.b(net.nb.b.A).d() + 1) - this.K;
         }

         if(!this.j()) {
            this.K -= 0.08D;
         }

         this.K *= 0.9800000190734863D;
      }

      this.De = (float)((double)this.De + (double)(-90.0F - this.De) * 0.02D);
   }

   public void E(float var1, float var2, float var3) {
      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
   }

   public boolean l4() {
      return this.hS > 45.0D && this.hS < (double)this.hl.k() && super.l4();
   }

   public void R(byte var1) {
      if(var1 == 19) {
         this.D1 = 0.0F;
      } else {
         super.R(var1);
      }

   }

   public void p(float var1, float var2, float var3) {
      this.Dt = var1;
      this.DY = var2;
      this.DN = var3;
   }

   public boolean D() {
      return this.Dt != 0.0F || this.DY != 0.0F || this.DN != 0.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class t extends net.y_.b {
      private final m T;

      public t(m var1) {
         this.T = var1;
      }

      public boolean f() {
         return true;
      }

      public void E() {
         net.yn.z.B();
         int var2 = this.T.y();
         if(var2 > 100) {
            this.T.p(0.0F, 0.0F, 0.0F);
         }

         if(this.T.Q().nextInt(50) == 0 || !this.T.hW || !this.T.D()) {
            float var3 = this.T.Q().nextFloat() * 6.2831855F;
            float var4 = net.u.t.m(var3) * 0.2F;
            float var5 = -0.1F + this.T.Q().nextFloat() * 0.2F;
            float var6 = net.u.t.A(var3) * 0.2F;
            this.T.p(var4, var5, var6);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
