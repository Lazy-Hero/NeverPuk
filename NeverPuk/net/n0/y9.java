package net.n0;

import com.google.common.collect.Multimap;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.nl.z2;
import net.y9.rv;
import net.yz.ad;
import net.yz.aq;

public class y9 extends y {
   private final float G;
   protected y.d J;

   public y9(y.d var1) {
      this.J = var1;
      this.S = 1;
      this.d(var1.W());
      this.M(net.ys.r.y);
      this.G = var1.l() + 1.0F;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var1.n(var3.C(var5), var5, var10)) {
         return ad.FAIL;
      } else {
         net.yw.n var11 = var2.Z(var3);
         net.y9.l var12 = var11.Q();
         if(var5 != aq.DOWN && var2.Z(var3.h()).n() == net.y1.l.q) {
            if(var12 == net.nb.f.p || var12 == net.nb.f.A) {
               this.U(var10, var1, var2, var3, net.nb.f.dJ.p());
               return ad.SUCCESS;
            }

            if(var12 == net.nb.f.dl) {
               switch(null.D[((rv.m)var11.i(rv.l)).ordinal()]) {
               case 1:
                  this.U(var10, var1, var2, var3, net.nb.f.dJ.p());
                  return ad.SUCCESS;
               case 2:
                  this.U(var10, var1, var2, var3, net.nb.f.dl.p().s(rv.l, rv.m.DIRT));
                  return ad.SUCCESS;
               }
            }
         }

         return ad.PASS;
      }
   }

   public boolean S(ks var1, net.ne.a var2, net.ne.a var3) {
      var1.S(1, var3);
      return true;
   }

   protected void U(ks var1, net.r.r var2, net.yv.r var3, net.u.j var4, net.yw.n var5) {
      var3.M(var2, var4, net.nb.l.oL, net.yz.p.BLOCKS, 1.0F, 1.0F);
      if(!var3.x) {
         var3.k(var4, var5, 11);
         var1.S(1, var2);
      }

   }

   public boolean a() {
      return true;
   }

   public String g() {
      return this.J.toString();
   }

   public Multimap v(z2 var1) {
      kw.b();
      Multimap var3 = super.v(var1);
      if(var1 == z2.MAINHAND) {
         var3.put(net.ne.d.S.K(), new net.s.k(U, "Weapon modifier", 0.0D, 0));
         var3.put(net.ne.d.E.K(), new net.s.k(v, "Weapon modifier", (double)(this.G - 4.0F), 0));
      }

      return var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
