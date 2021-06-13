package net.yn;

import java.util.Calendar;
import javax.annotation.Nullable;
import net.xn;
import net.yn.v;
import net.yz.m_;

public class y extends v {
   private static final net.k.v eI = net.k.n.q(y.class, net.k.y.g);
   private net.u.j eg;

   public y(net.yv.r var1) {
      super(var1);
      this.S(0.5F, 0.9F);
      this.n(true);
   }

   protected void g() {
      super.g();
      this.G.r(eI, Byte.valueOf((byte)0));
   }

   protected float G() {
      return 0.1F;
   }

   protected float s() {
      return super.s() * 0.95F;
   }

   @Nullable
   public net.yz.a T() {
      return this.D() && this.p.nextInt(4) != 0?null:net.nb.l.o6;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.CX;
   }

   protected net.yz.a r() {
      return net.nb.l.MF;
   }

   public boolean b() {
      return false;
   }

   protected void I(net.ne.l var1) {
   }

   protected void z() {
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(6.0D);
   }

   public boolean D() {
      return (((Byte)this.G.a(eI)).byteValue() & 1) != 0;
   }

   public void n(boolean var1) {
      byte var2 = ((Byte)this.G.a(eI)).byteValue();
      this.G.d(eI, Byte.valueOf((byte)(var2 | 1)));
   }

   public void A() {
      super.A();
      if(this.D()) {
         this.hf = 0.0D;
         this.K = 0.0D;
         this.J = 0.0D;
         this.hS = (double)net.u.t.L(this.hS) + 1.0D - (double)this.m;
      } else {
         this.K *= 0.6000000238418579D;
      }

   }

   protected void T() {
      super.T();
      net.yn.z.B();
      net.u.j var2 = new net.u.j(this);
      net.u.j var3 = var2.h();
      if(this.D()) {
         if(this.hl.Z(var3).i()) {
            if(this.p.nextInt(200) == 0) {
               this.A3 = (float)this.p.nextInt(360);
            }

            if(this.hl.x(this, 4.0D) == null) {
               return;
            }

            this.n(false);
            this.hl.N((net.r.r)null, 1025, var2, 0);
         }

         this.n(false);
         this.hl.N((net.r.r)null, 1025, var2, 0);
      }

      if(this.eg != null && (!this.hl.y(this.eg) || this.eg.h() < 1)) {
         this.eg = null;
      }

      if(this.eg == null || this.p.nextInt(30) == 0 || Double.compare(this.eg.s((double)((int)this.b), (double)((int)this.hS), (double)((int)this.hr)), 4.0D) < 0) {
         this.eg = new net.u.j((int)this.b + this.p.nextInt(7) - this.p.nextInt(7), (int)this.hS + this.p.nextInt(6) - 2, (int)this.hr + this.p.nextInt(7) - this.p.nextInt(7));
      }

      double var4 = (double)this.eg.t() + 0.5D - this.b;
      double var6 = (double)this.eg.h() + 0.1D - this.hS;
      double var8 = (double)this.eg.y() + 0.5D - this.hr;
      this.hf += (Math.signum(var4) * 0.5D - this.hf) * 0.10000000149011612D;
      this.K += (Math.signum(var6) * 0.699999988079071D - this.K) * 0.10000000149011612D;
      this.J += (Math.signum(var8) * 0.5D - this.J) * 0.10000000149011612D;
      float var10 = (float)(net.u.t.V(this.J, this.hf) * 57.29577951308232D) - 90.0F;
      float var11 = net.u.t.k(var10 - this.hN);
      this.XK = 0.5F;
      this.hN += var11;
      if(this.p.nextInt(100) == 0 && this.hl.Z(var3).i()) {
         this.n(true);
      }

   }

   protected boolean k() {
      return false;
   }

   public void v(float var1, float var2) {
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
   }

   public boolean v() {
      return true;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         if(!this.hl.x && this.D()) {
            this.n(false);
         }

         return super.H(var1, var2);
      }
   }

   public static void o(net.c0.d var0) {
      net.ne.y.J(var0, y.class);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.G.d(eI, Byte.valueOf(var1.R("BatFlags")));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.D("BatFlags", ((Byte)this.G.a(eI)).byteValue());
   }

   public boolean l4() {
      net.u.j var1 = new net.u.j(this.b, this.i().u, this.hr);
      if(var1.h() >= this.hl.k()) {
         return false;
      } else {
         int var2 = this.hl.y(var1);
         byte var3 = 4;
         if(this.E(this.hl.l())) {
            var3 = 7;
         } else if(this.p.nextBoolean()) {
            return false;
         }

         return var2 <= this.p.nextInt(var3) && super.l4();
      }
   }

   private boolean E(Calendar var1) {
      return var1.get(2) + 1 == 10 && var1.get(5) >= 20 || var1.get(2) + 1 == 11 && var1.get(5) <= 3;
   }

   public float A() {
      return this.m / 2.0F;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.V;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
