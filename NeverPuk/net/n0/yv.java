package net.n0;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.g5;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;
import net.yz.m_;

public class yv extends y {
   public yv() {
      this.M(net.ys.r.K);
   }

   public String m(ks var1) {
      String var2 = ("" + net.yq.e.E(this.z() + ".name")).trim();
      String var3 = net.ne.v.L(F(var1));
      var2 = var2 + " " + net.yq.e.E("entity." + var3 + ".name");
      return var2;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      ks var9 = var1.o((net.yz.k)var4);
      if(var2.x) {
         return ad.SUCCESS;
      } else if(!var1.n(var3.C(var5), var5, var9)) {
         return ad.FAIL;
      } else {
         net.yw.n var10 = var2.Z(var3);
         net.y9.l var11 = var10.Q();
         if(var11 == net.nb.f.uw) {
            net.ni.v var12 = var2.L(var3);
            if(var12 instanceof net.ni.u) {
               net.ni.r var17 = ((net.ni.u)var12).H();
               var17.S(F(var9));
               var12.W();
               var2.V(var3, var10, var10, 3);
               if(!var1.a6.V) {
                  var9.H(1);
               }

               return ad.SUCCESS;
            }
         }

         net.u.j var16 = var3.C(var5);
         double var13 = this.B(var2, var16);
         net.ne.l var15 = E(var2, F(var9), (double)var16.t() + 0.5D, (double)var16.h() + var13, (double)var16.y() + 0.5D);
         if(var15 instanceof net.ne.a && var9.v()) {
            var15.K(var9.j());
         }

         v(var2, var1, var9, var15);
         if(!var1.a6.V) {
            var9.H(1);
         }

         return ad.SUCCESS;
      }
   }

   protected double B(net.yv.r var1, net.u.j var2) {
      net.u.e var3 = (new net.u.e(var2)).T(0.0D, -1.0D, 0.0D);
      List var4 = var1.h((net.ne.l)null, var3);
      if(var4.isEmpty()) {
         return 0.0D;
      } else {
         double var5 = var3.u;

         for(net.u.e var8 : var4) {
            var5 = Math.max(var8.c, var5);
         }

         return var5 - (double)var2.h();
      }
   }

   public static void v(net.yv.r var0, @Nullable net.r.r var1, ks var2, @Nullable net.ne.l var3) {
      net.nx.f var4 = var0.v();
      net.nj.f var5 = var2.o();
      if(var5.K("EntityTag", 10)) {
         if(!var0.x && var3.O() && !var4.c().Q(var1.e())) {
            return;
         }

         net.nj.f var6 = var3.G(new net.nj.f());
         UUID var7 = var3.O();
         var6.I(var5.o("EntityTag"));
         var3.k(var7);
         var3.B(var6);
      }

   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      if(var1.x) {
         return new am(ad.PASS, var5);
      } else {
         net.u.m var6 = this.X(var1, var2, true);
         if(var6 != null && var6.v == net.u.m.BLOCK) {
            net.u.j var7 = var6.j();
            if(!(var1.Z(var7).Q() instanceof g5)) {
               return new am(ad.PASS, var5);
            } else if(var1.J(var2, var7) && var2.n(var7, var6.d, var5)) {
               net.ne.l var8 = E(var1, F(var5), (double)var7.t() + 0.5D, (double)var7.h() + 0.5D, (double)var7.y() + 0.5D);
               if(var8 == null) {
                  return new am(ad.PASS, var5);
               } else {
                  if(var8 instanceof net.ne.a && var5.v()) {
                     var8.K(var5.j());
                  }

                  v(var1, var2, var5, var8);
                  if(!var2.a6.V) {
                     var5.H(1);
                  }

                  var2.S(net.v.q.H(this));
                  return new am(ad.SUCCESS, var5);
               }
            } else {
               return new am(ad.FAIL, var5);
            }
         } else {
            return new am(ad.PASS, var5);
         }
      }
   }

   @Nullable
   public static net.ne.l E(net.yv.r var0, @Nullable m_ var1, double var2, double var4, double var6) {
      if(net.ne.v.V.containsKey(var1)) {
         net.ne.l var8 = null;
         int var9 = 0;

         while(true) {
            var8 = net.ne.v.K(var1, var0);
            if(var8 instanceof net.ne.y) {
               net.ne.y var10 = (net.ne.y)var8;
               var8.S(var2, var4, var6, net.u.t.k(var0.G.nextFloat() * 360.0F), 0.0F);
               var10.A3 = var10.hN;
               var10.AK = var10.hN;
               var10.t(var0.G(new net.u.j(var10)), (net.ne.g)null);
               var0.S(var8);
               var10.m();
            }

            ++var9;
         }
      }

      return null;
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         for(net.ne.v var4 : net.ne.v.V.values()) {
            ks var5 = new ks(this, 1);
            u(var5, var4.g);
            var2.add(var5);
         }
      }

   }

   public static void u(ks var0, m_ var1) {
      net.nj.f var2 = var0.D()?var0.o():new net.nj.f();
      net.nj.f var3 = new net.nj.f();
      var3.b("id", var1.toString());
      var2.K("EntityTag", var3);
      var0.t(var2);
   }

   @Nullable
   public static m_ F(ks var0) {
      net.nj.f var1 = var0.o();
      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
