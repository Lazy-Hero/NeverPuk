package net.yv;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.yv.r;
import net.yz.ai;

public class u {
   private final boolean Q;
   private final boolean j;
   private final Random h;
   private final r B;
   private final double M;
   private final double T;
   private final double f;
   private final net.ne.l e;
   private final float w;
   private final List L;
   private final Map p;

   public u(r var1, net.ne.l var2, double var3, double var5, double var7, float var9, List var10) {
      this(var1, var2, var3, var5, var7, var9, false, true, var10);
   }

   public u(r var1, net.ne.l var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11, List var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.L.addAll(var12);
   }

   public u(r var1, net.ne.l var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11) {
      this.h = new Random();
      this.L = Lists.newArrayList();
      this.p = Maps.newHashMap();
      this.B = var1;
      this.e = var2;
      this.w = var9;
      this.M = var3;
      this.T = var5;
      this.f = var7;
      this.Q = var10;
      this.j = var11;
   }

   public void o() {
      r.C();
      HashSet var2 = Sets.newHashSet();
      boolean var10000 = true;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      double var7 = (double)((float)var4 / 15.0F * 2.0F - 1.0F);
      double var9 = (double)((float)var5 / 15.0F * 2.0F - 1.0F);
      double var11 = (double)((float)var6 / 15.0F * 2.0F - 1.0F);
      double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
      var7 = var7 / var13;
      var9 = var9 / var13;
      var11 = var11 / var13;
      float var15 = this.w * (0.7F + this.B.G.nextFloat() * 0.6F);
      double var16 = this.M;
      double var18 = this.T;
      double var20 = this.f;
      float var53 = 0.3F;
      if(var15 > 0.0F) {
         net.u.j var23 = new net.u.j(var16, var18, var20);
         net.yw.n var24 = this.B.Z(var23);
         if(var24.n() != net.y1.l.q) {
            float var25 = this.e != null?this.e.x(this, this.B, var23, var24):var24.Q().b((net.ne.l)null);
            var15 -= (var25 + 0.3F) * 0.3F;
         }

         if(var15 > 0.0F && (this.e == null || this.e.Z(this, this.B, var23, var24, var15))) {
            var2.add(var23);
         }

         double var54 = var16 + var7 * 0.30000001192092896D;
         var54 = var18 + var9 * 0.30000001192092896D;
         var54 = var20 + var11 * 0.30000001192092896D;
         var15 = var15 - 0.22500001F;
      }

      ++var6;
      ++var5;
      ++var4;
      this.L.addAll(var2);
      float var33 = this.w * 2.0F;
      var5 = net.u.t.L(this.M - (double)var33 - 1.0D);
      var6 = net.u.t.L(this.M + (double)var33 + 1.0D);
      int var39 = net.u.t.L(this.T - (double)var33 - 1.0D);
      int var8 = net.u.t.L(this.T + (double)var33 + 1.0D);
      int var41 = net.u.t.L(this.f - (double)var33 - 1.0D);
      int var10 = net.u.t.L(this.f + (double)var33 + 1.0D);
      List var43 = this.B.u(this.e, new net.u.e((double)var5, (double)var39, (double)var41, (double)var6, (double)var8, (double)var10));
      net.u.r var12 = new net.u.r(this.M, this.T, this.f);
      int var44 = 0;
      if(var44 < var43.size()) {
         net.ne.l var14 = (net.ne.l)var43.get(var44);
         if(!var14.T()) {
            double var47 = var14.R(this.M, this.T, this.f) / (double)var33;
            if(var47 <= 1.0D) {
               double var17 = var14.b - this.M;
               double var19 = var14.hS + (double)var14.A() - this.T;
               double var21 = var14.hr - this.f;
               double var51 = (double)net.u.t.R(var17 * var17 + var19 * var19 + var21 * var21);
               if(var51 != 0.0D) {
                  var17 = var17 / var51;
                  var19 = var19 / var51;
                  var21 = var21 / var51;
                  double var52 = (double)this.B.x(var12, var14.i());
                  double var27 = (1.0D - var47) * var52;
                  var14.H(net.yz.z.A(this), (float)((int)((var27 * var27 + var27) / 2.0D * 7.0D * (double)var33 + 1.0D)));
                  double var29 = var27;
                  if(var14 instanceof net.ne.a) {
                     var29 = net.c1.u.Y((net.ne.a)var14, var27);
                  }

                  var14.hf += var17 * var29;
                  var14.K += var19 * var29;
                  var14.J += var21 * var29;
                  if(var14 instanceof net.r.r) {
                     net.r.r var31 = (net.r.r)var14;
                     if(!var31.VX() && (!var31.V8() || !var31.a6.n)) {
                        this.p.put(var31, new net.u.r(var17 * var27, var19 * var27, var21 * var27));
                     }
                  }
               }
            }
         }

         ++var44;
      }

      if(net.u.d.y() == null) {
         r.F(new net.u.d[4]);
      }

   }

   public void p(boolean var1) {
      this.B.L((net.r.r)null, this.M, this.T, this.f, net.nb.l.Ms, net.yz.p.BLOCKS, 4.0F, (1.0F + (this.B.G.nextFloat() - this.B.G.nextFloat()) * 0.2F) * 0.7F);
      if(this.w >= 2.0F && this.j) {
         this.B.n(ai.EXPLOSION_HUGE, this.M, this.T, this.f, 1.0D, 0.0D, 0.0D, new int[0]);
      } else {
         this.B.n(ai.EXPLOSION_LARGE, this.M, this.T, this.f, 1.0D, 0.0D, 0.0D, new int[0]);
      }

      if(this.j) {
         for(net.u.j var3 : this.L) {
            net.yw.n var4 = this.B.Z(var3);
            net.y9.l var5 = var4.Q();
            double var6 = (double)((float)var3.t() + this.B.G.nextFloat());
            double var8 = (double)((float)var3.h() + this.B.G.nextFloat());
            double var10 = (double)((float)var3.y() + this.B.G.nextFloat());
            double var12 = var6 - this.M;
            double var14 = var8 - this.T;
            double var16 = var10 - this.f;
            double var18 = (double)net.u.t.R(var12 * var12 + var14 * var14 + var16 * var16);
            var12 = var12 / var18;
            var14 = var14 / var18;
            var16 = var16 / var18;
            double var20 = 0.5D / (var18 / (double)this.w + 0.1D);
            var20 = var20 * (double)(this.B.G.nextFloat() * this.B.G.nextFloat() + 0.3F);
            var12 = var12 * var20;
            var14 = var14 * var20;
            var16 = var16 * var20;
            this.B.n(ai.EXPLOSION_NORMAL, (var6 + this.M) / 2.0D, (var8 + this.T) / 2.0D, (var10 + this.f) / 2.0D, var12, var14, var16, new int[0]);
            this.B.n(ai.SMOKE_NORMAL, var6, var8, var10, var12, var14, var16, new int[0]);
            if(var4.n() != net.y1.l.q) {
               if(var5.q(this)) {
                  var5.P(this.B, var3, this.B.Z(var3), 1.0F / this.w, 0);
               }

               this.B.k(var3, net.nb.f.ou.p(), 3);
               var5.S(this.B, var3, this);
            }
         }
      }

      if(this.Q) {
         for(net.u.j var23 : this.L) {
            if(this.B.Z(var23).n() == net.y1.l.q && this.B.Z(var23.b()).E() && this.h.nextInt(3) == 0) {
               this.B.U(var23, net.nb.f.g.p());
            }
         }
      }

   }

   public Map g() {
      return this.p;
   }

   @Nullable
   public net.ne.a s() {
      return this.e == null?null:(this.e instanceof net.nm.k?((net.nm.k)this.e).J():(this.e instanceof net.ne.a?(net.ne.a)this.e:null));
   }

   public void u() {
      this.L.clear();
   }

   public List e() {
      return this.L;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
