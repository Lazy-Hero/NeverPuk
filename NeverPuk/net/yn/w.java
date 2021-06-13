package net.yn;

import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yn.wy;
import net.yz.ai;

public abstract class w extends net.ne.j implements wy {
   protected net.y9.l Mt = net.nb.f.p;
   private int Mm;
   private UUID MM;
   private static int[] M1;

   public w(net.yv.r var1) {
      super(var1);
   }

   protected void T() {
      if(this.z() != 0) {
         this.Mm = 0;
      }

      super.T();
   }

   public void d() {
      net.yn.z.C();
      super.d();
      if(this.z() != 0) {
         this.Mm = 0;
      }

      if(this.Mm > 0) {
         --this.Mm;
         if(this.Mm % 10 == 0) {
            double var2 = this.p.nextGaussian() * 0.02D;
            double var4 = this.p.nextGaussian() * 0.02D;
            double var6 = this.p.nextGaussian() * 0.02D;
            this.hl.n(ai.HEART, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var2, var4, var6, new int[0]);
         }
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         this.Mm = 0;
         return super.H(var1, var2);
      }
   }

   public float O(net.u.j var1) {
      return this.hl.Z(var1.b()).Q() == this.Mt?10.0F:this.hl.u(var1) - 0.5F;
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("InLove", this.Mm);
      if(this.MM != null) {
         var1.h("LoveCause", this.MM);
      }

   }

   public double O() {
      return 0.14D;
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.Mm = var1.P("InLove");
      this.MM = var1.H("LoveCause")?var1.R("LoveCause"):null;
   }

   public boolean l4() {
      int var1 = net.u.t.L(this.b);
      int var2 = net.u.t.L(this.i().u);
      int var3 = net.u.t.L(this.hr);
      net.u.j var4 = new net.u.j(var1, var2, var3);
      return this.hl.Z(var4.b()).Q() == this.Mt && this.hl.s(var4) > 8 && super.l4();
   }

   public int g() {
      return 120;
   }

   protected boolean lB() {
      return false;
   }

   protected int Q(net.r.r var1) {
      return 1 + this.hl.G.nextInt(3);
   }

   public boolean V(ks var1) {
      return var1.Z() == net.nb.j.Sd;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(!var3.B()) {
         if(this.V(var3) && this.z() == 0 && this.Mm <= 0) {
            this.a(var1, var3);
            this.Q(var1);
            return true;
         }

         if(this.H9() && this.V(var3)) {
            this.a(var1, var3);
            this.H((int)((float)(-this.z() / 20) * 0.1F), true);
            return true;
         }
      }

      return super.R(var1, var2);
   }

   protected void a(net.r.r var1, ks var2) {
      if(!var1.a6.V) {
         var2.H(1);
      }

   }

   public void Q(@Nullable net.r.r var1) {
      this.Mm = 600;
      this.MM = var1.O();
      this.hl.k(this, (byte)18);
   }

   @Nullable
   public net.r.h Y() {
      if(this.MM == null) {
         return null;
      } else {
         net.r.r var1 = this.hl.W(this.MM);
         return var1 instanceof net.r.h?(net.r.h)var1:null;
      }
   }

   public boolean BZ() {
      return this.Mm > 0;
   }

   public void p1() {
      this.Mm = 0;
   }

   public boolean b(w var1) {
      return var1 == this?false:(var1.getClass() != this.getClass()?false:this.BZ() && var1.BZ());
   }

   public void R(byte var1) {
      if(var1 == 18) {
         int var2 = 0;

         while(true) {
            double var3 = this.p.nextGaussian() * 0.02D;
            double var5 = this.p.nextGaussian() * 0.02D;
            double var7 = this.p.nextGaussian() * 0.02D;
            this.hl.n(ai.HEART, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var3, var5, var7, new int[0]);
            ++var2;
         }
      }

      super.R(var1);
   }

   public static void z(int[] var0) {
      M1 = var0;
   }

   public static int[] I() {
      return M1;
   }

   private static xn f(xn var0) {
      return var0;
   }

   static {
      z((int[])null);
   }
}
