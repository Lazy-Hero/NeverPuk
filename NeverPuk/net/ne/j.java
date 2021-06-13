package net.ne;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.yv;
import net.ne.d;
import net.ne.s;
import net.ne.v;
import net.yz.ai;

public abstract class j extends s {
   private static final net.k.v qn = net.k.n.q(j.class, net.k.y.f);
   protected int qY;
   protected int qx;
   protected int qm;
   private float qT = -1.0F;
   private float qW;
   private static String qM;

   public j(net.yv.r var1) {
      super(var1);
   }

   @Nullable
   public abstract j r(j var1);

   public boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(var3.Z() == net.nb.j.N) {
         if(!this.hl.x) {
            Class var4 = (Class)v.S.B(yv.F(var3));
            if(this.getClass() == var4) {
               j var5 = this.r(this);
               var5.V(-24000);
               var5.S(this.b, this.hS, this.hr, 0.0F, 0.0F);
               this.hl.S(var5);
               if(var3.v()) {
                  var5.K(var3.j());
               }

               if(!var1.a6.V) {
                  var3.H(1);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean g(ks var1, Class var2) {
      if(var1.Z() != net.nb.j.N) {
         return false;
      } else {
         Class var3 = (Class)v.S.B(yv.F(var1));
         return var2 == var3;
      }
   }

   protected void g() {
      super.g();
      this.G.r(qn, Boolean.valueOf(false));
   }

   public int z() {
      return this.hl.x?(((Boolean)this.G.a(qn)).booleanValue()?-1:1):this.qY;
   }

   public void H(int var1, boolean var2) {
      int var3 = this.z();
      int var4 = var3;
      var3 = var3 + var1 * 20;
      var3 = 0;
      this.i_();
      int var5 = var3 - var4;
      this.V(var3);
      this.qx += var5;
      if(this.qm == 0) {
         this.qm = 40;
      }

      if(this.z() == 0) {
         this.V(this.qx);
      }

   }

   public void Q(int var1) {
      this.H(var1, false);
   }

   public void V(int var1) {
      this.G.d(qn, Boolean.valueOf(true));
      this.qY = var1;
      this.B(this.H9());
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Age", this.z());
      var1.r("ForcedAge", this.qx);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.V(var1.P("Age"));
      this.qx = var1.P("ForcedAge");
   }

   public void O(net.k.v var1) {
      if(qn.equals(var1)) {
         this.B(this.H9());
      }

      super.O(var1);
   }

   public void d() {
      d.p();
      super.d();
      if(this.hl.x) {
         if(this.qm <= 0) {
            return;
         }

         if(this.qm % 4 == 0) {
            this.hl.n(ai.VILLAGER_HAPPY, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, 0.0D, 0.0D, 0.0D, new int[0]);
         }

         --this.qm;
      }

      int var2 = this.z();
      if(var2 < 0) {
         ++var2;
         this.V(var2);
         this.i_();
      }

      if(var2 > 0) {
         --var2;
         this.V(var2);
      }

   }

   protected void i_() {
   }

   public boolean H9() {
      return this.z() < 0;
   }

   public void B(boolean var1) {
      this.L(0.5F);
   }

   protected final void S(float var1, float var2) {
      boolean var3 = this.qT > 0.0F;
      this.qT = var1;
      this.qW = var2;
      this.L(1.0F);
   }

   protected final void L(float var1) {
      super.S(this.qT * var1, this.qW * var1);
   }

   static {
      D((String)null);
   }

   public static void D(String var0) {
      qM = var0;
   }

   public static String D() {
      return qM;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
