package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;
import net.y9.r7;
import net.y9.ro;
import net.yz.ad;
import net.yz.aq;

public class c extends q {
   public c() {
      super(net.nb.f.uf);
      this.S = 16;
      this.M(net.ys.r.X);
      this.z(true);
      this.d(0);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      boolean var11 = var10.Q().X(var2, var3);
      if(var5 != aq.DOWN && (var10.n().B() || var11) && (!var11 || var5 == aq.UP)) {
         var3 = var3.C(var5);
         ks var12 = var1.o((net.yz.k)var4);
         if(var1.n(var3, var5, var12) && net.nb.f.uf.J(var2, var3)) {
            if(var2.x) {
               return ad.SUCCESS;
            } else {
               var3 = var11?var3.b():var3;
               if(var5 == aq.UP) {
                  int var13 = net.u.t.L((double)((var1.hN + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
                  var2.k(var3, net.nb.f.uf.p().s(r7.n, Integer.valueOf(var13)), 3);
               }

               var2.k(var3, net.nb.f.TO.p().s(ro.k, var5), 3);
               net.ni.v var16 = var2.L(var3);
               if(var16 instanceof net.ni.g) {
                  ((net.ni.g)var16).p(var12, false);
               }

               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var12);
               }

               var12.H(1);
               return ad.SUCCESS;
            }
         } else {
            return ad.FAIL;
         }
      } else {
         return ad.FAIL;
      }
   }

   public String m(ks var1) {
      String var2 = "item.banner.";
      kw var3 = Q(var1);
      var2 = var2 + var3.h() + ".name";
      return net.yq.e.E(var2);
   }

   public static void R(ks var0, List var1) {
      net.nj.f var2 = var0.j("BlockEntityTag");
      if(var2.G("Patterns")) {
         net.nj.h var3 = var2.A("Patterns", 10);

         for(int var4 = 0; var4 < var3.z(); ++var4) {
            net.nj.f var5 = var3.i(var4);
            kw var6 = kw.q(var5.P("Color"));
            net.ni.s var7 = net.ni.s.z(var5.J("Pattern"));
            var1.add(net.yq.e.E("item.banner." + var7.u() + "." + var6.h()));
         }
      }

   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      R(var1, var3);
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         for(kw var6 : kw.values()) {
            var2.add(G(var6, (net.nj.h)null));
         }
      }

   }

   public static ks G(kw var0, @Nullable net.nj.h var1) {
      ks var2 = new ks(net.nb.j.Yi, 1, var0.G());
      if(!var1.N()) {
         var2.c("BlockEntityTag").K("Patterns", var1.j());
      }

      return var2;
   }

   public net.ys.r V() {
      return net.ys.r.X;
   }

   public static kw Q(ks var0) {
      return kw.q(var0.n() & 15);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
