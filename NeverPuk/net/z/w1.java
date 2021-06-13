package net.z;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.z.g;
import net.z.t;

public class w1 extends g implements net.h.u {
   private final net.nn.j D;
   private final List r = Lists.newArrayList();
   private boolean y;

   public w1(net.nn.j var1) {
      this.D = var1;
   }

   public void W(t var1) {
      boolean var2 = g.B();
      if(!this.y && this.D.T.t2) {
         this.D.n().P(this);
         this.y = true;
      }

      if(this.y && !this.D.T.t2) {
         this.D.n().N(this);
         this.y = false;
      }

      if(this.y && !this.r.isEmpty()) {
         net.y.d.c();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         net.u.r var3 = new net.u.r(this.D.sf.b, this.D.sf.hS + (double)this.D.sf.A(), this.D.sf.hr);
         net.u.r var4 = (new net.u.r(0.0D, 0.0D, -1.0D)).f(-this.D.sf.V * 0.017453292F).T(-this.D.sf.hN * 0.017453292F);
         net.u.r var5 = (new net.u.r(0.0D, 1.0D, 0.0D)).f(-this.D.sf.V * 0.017453292F).T(-this.D.sf.hN * 0.017453292F);
         net.u.r var6 = var4.M(var5);
         int var7 = 0;
         int var8 = 0;
         Iterator var9 = this.r.iterator();
         if(var9.hasNext()) {
            w1.g var10 = (w1.g)var9.next();
            if(Long.compare(var10.L() + 3000L, net.nn.j.E()) <= 0) {
               var9.remove();
            }

            var8 = Math.max(var8, this.D.sO.r(var10.f()));
         }

         var8 = var8 + this.D.sO.r("<") + this.D.sO.r(" ") + this.D.sO.r(">") + this.D.sO.r(" ");
         Iterator var29 = this.r.iterator();
         if(var29.hasNext()) {
            w1.g var11 = (w1.g)var29.next();
            boolean var10000 = true;
            String var13 = var11.f();
            net.u.r var14 = var11.c().q(var3).I();
            double var15 = -var6.d(var14);
            double var17 = -var4.d(var14);
            boolean var19 = Double.compare(var17, 0.5D) > 0;
            int var20 = var8 / 2;
            int var21 = this.D.sO.R;
            int var22 = var21 / 2;
            float var30 = 1.0F;
            int var24 = this.D.sO.r(var13);
            int var25 = net.u.t.L(net.u.t.z(255.0D, 75.0D, (double)((float)(net.nn.j.E() - var11.L()) / 3000.0F)));
            int var26 = var25 << 16 | var25 << 8 | var25;
            net.y.d.c();
            net.y.d.O((float)var1.u() - (float)var20 * 1.0F - 2.0F, (float)(var1.v() - 30) - (float)(var7 * (var21 + 1)) * 1.0F, 0.0F);
            net.y.d.W(1.0F, 1.0F, 1.0F);
            u(-var20 - 1, -var22 - 1, var20 + 1, var22 + 1, -872415232);
            net.y.d.C();
            if(Double.compare(var15, 0.0D) > 0) {
               this.D.sO.v(">", (float)(var20 - this.D.sO.r(">")), (float)(-var22), var26 + -16777216);
            }

            if(var15 < 0.0D) {
               this.D.sO.v("<", (float)(-var20), (float)(-var22), var26 + -16777216);
            }

            this.D.sO.v(var13, (float)(-var24 / 2), (float)(-var22), var26 + -16777216);
            net.y.d.Y();
            ++var7;
         }

         net.y.d.E();
         net.y.d.Y();
      }

   }

   public void x(net.h.d var1, net.h.n var2) {
      if(var2.d() != null) {
         String var3 = var2.d().c();
         if(!this.r.isEmpty()) {
            for(w1.g var5 : this.r) {
               if(var5.f().equals(var3)) {
                  var5.G(new net.u.r((double)var1.g(), (double)var1.K(), (double)var1.e()));
                  return;
               }
            }
         }

         this.r.add(new w1.g(var3, new net.u.r((double)var1.g(), (double)var1.K(), (double)var1.e())));
      }

   }

   private static xn b(xn var0) {
      return var0;
   }

   public class g {
      private final String E;
      private long v;
      private net.u.r q;

      public g(String var2, net.u.r var3) {
         this.E = var2;
         this.q = var3;
         this.v = net.nn.j.E();
      }

      public String f() {
         return this.E;
      }

      public long L() {
         return this.v;
      }

      public net.u.r c() {
         return this.q;
      }

      public void G(net.u.r var1) {
         this.q = var1;
         this.v = net.nn.j.E();
      }
   }
}
