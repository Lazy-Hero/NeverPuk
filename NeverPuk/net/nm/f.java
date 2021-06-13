package net.nm;

import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.nk.y;
import net.nm.w;
import net.yz.ai;

public class f extends net.n1.p {
   private net.ne.a hk;

   public f(net.yv.r var1) {
      super(var1);
   }

   public f(net.yv.r var1, net.ne.a var2) {
      super(var1, var2);
      this.hk = var2;
   }

   public f(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void z(net.c0.d var0) {
      net.n1.p.O(var0, "ThrownEnderpearl");
   }

   protected void I(net.u.m var1) {
      w.h.s();
      net.ne.a var3 = this.D();
      if(var1.e != null) {
         if(var1.e == this.hk) {
            return;
         }

         var1.e.H(net.yz.z.Z(this, var3), 0.0F);
      }

      if(var1.v == net.u.m.BLOCK) {
         net.u.j var4 = var1.j();
         net.ni.v var5 = this.hl.L(var4);
         if(var5 instanceof net.ni.z) {
            net.ni.z var6 = (net.ni.z)var5;
            if(var3 instanceof net.r.h) {
               b2.F.d((net.r.h)var3, this.hl.Z(var4));
            }

            var6.W(var3);
            this.B();
            return;
         }
      }

      int var7 = 0;
      this.hl.n(ai.PORTAL, this.b, this.hS + this.p.nextDouble() * 2.0D, this.hr, this.p.nextGaussian(), 0.0D, this.p.nextGaussian(), new int[0]);
      ++var7;
      if(!this.hl.x) {
         if(var3 instanceof net.r.h) {
            net.r.h var9 = (net.r.h)var3;
            if(var9.t1.V().t() && var9.hl == this.hl && !var9.L()) {
               if(this.p.nextFloat() < 0.05F && this.hl.N().b("doMobSpawning")) {
                  y var10 = new y(this.hl);
                  var10.n(true);
                  var10.S(var3.b, var3.hS, var3.hr, var3.hN, var3.V);
                  this.hl.S(var10);
               }

               if(var3.M()) {
                  var3.O();
               }

               var3.a(this.b, this.hS, this.hr);
               var3.hI = 0.0F;
               var3.H(net.yz.z.H, 5.0F);
            }
         } else if(var3 != null) {
            var3.a(this.b, this.hS, this.hr);
            var3.hI = 0.0F;
         }

         this.B();
      }

   }

   public void A() {
      net.ne.a var1 = this.D();
      if(var1 instanceof net.r.r && !var1.P()) {
         this.B();
      } else {
         super.A();
      }

   }

   @Nullable
   public net.ne.l V(int var1) {
      if(this.hk.y != var1) {
         this.hk = null;
      }

      return super.V(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
