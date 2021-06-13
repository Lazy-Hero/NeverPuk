package net.n1;

import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n1.o;
import net.yv.d;
import net.yv.r;
import net.yz.ai;

public class j extends net.ne.l {
   private int M_;
   private boolean Mg;
   private int M0;
   private boolean MI;
   private net.ne.a Mc;
   private UUID MF;

   public j(r var1) {
      super(var1);
      this.M0 = 22;
      this.S(0.5F, 0.8F);
   }

   public j(r var1, double var2, double var4, double var6, float var8, int var9, net.ne.a var10) {
      this(var1);
      this.M_ = var9;
      this.z(var10);
      this.hN = var8 * 57.295776F;
      this.t(var2, var4, var6);
   }

   protected void g() {
   }

   public void z(@Nullable net.ne.a var1) {
      this.Mc = var1;
      this.MF = null;
   }

   @Nullable
   public net.ne.a t() {
      if(this.Mc == null && this.MF != null && this.hl instanceof d) {
         net.ne.l var1 = ((d)this.hl).O(this.MF);
         if(var1 instanceof net.ne.a) {
            this.Mc = (net.ne.a)var1;
         }
      }

      return this.Mc;
   }

   protected void o(net.nj.f var1) {
      this.M_ = var1.P("Warmup");
      this.MF = var1.R("OwnerUUID");
   }

   protected void I(net.nj.f var1) {
      var1.r("Warmup", this.M_);
      if(this.MF != null) {
         var1.h("OwnerUUID", this.MF);
      }

   }

   public void A() {
      o.s.H();
      super.A();
      if(this.hl.x) {
         if(!this.MI) {
            return;
         }

         --this.M0;
         if(this.M0 != 14) {
            return;
         }

         int var2 = 0;
         double var3 = this.b + (this.p.nextDouble() * 2.0D - 1.0D) * (double)this.h9 * 0.5D;
         double var5 = this.hS + 0.05D + this.p.nextDouble() * 1.0D;
         double var7 = this.hr + (this.p.nextDouble() * 2.0D - 1.0D) * (double)this.h9 * 0.5D;
         double var9 = (this.p.nextDouble() * 2.0D - 1.0D) * 0.3D;
         double var11 = 0.3D + this.p.nextDouble() * 0.3D;
         double var13 = (this.p.nextDouble() * 2.0D - 1.0D) * 0.3D;
         this.hl.n(ai.CRIT, var3, var5 + 1.0D, var7, var9, var11, var13, new int[0]);
         ++var2;
      }

      if(--this.M_ < 0) {
         if(this.M_ == -8) {
            Iterator var16 = this.hl.p(net.ne.a.class, this.i().f(0.2D, 0.0D, 0.2D)).iterator();
            if(var16.hasNext()) {
               net.ne.a var17 = (net.ne.a)var16.next();
               this.V(var17);
            }
         }

         if(!this.Mg) {
            this.hl.k(this, (byte)4);
            this.Mg = true;
         }

         if(--this.M0 < 0) {
            this.B();
         }
      }

   }

   private void V(net.ne.a var1) {
      net.ne.a var2 = this.t();
      if(var1.P() && !var1.s() && var1 != var2) {
         var1.H(net.yz.z.B, 6.0F);
      }

   }

   public void R(byte var1) {
      super.R(var1);
      if(var1 == 4) {
         this.MI = true;
         if(!this.c()) {
            this.hl.m(this.b, this.hS, this.hr, net.nb.l.Ha, this.E(), 1.0F, this.p.nextFloat() * 0.2F + 0.85F, false);
         }
      }

   }

   public float Q(float var1) {
      if(!this.MI) {
         return 0.0F;
      } else {
         int var2 = this.M0 - 2;
         return 1.0F;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
