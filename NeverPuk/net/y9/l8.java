package net.y9;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yz.ai;
import net.yz.aq;

public class l8 extends l {
   public static final net.yr.o u = net.yr.o.k("wet");

   protected l8() {
      super(net.y1.l.R);
      this.r(this.b.T().s(u, Boolean.valueOf(false)));
      this.f(net.ys.r.M);
   }

   public String U() {
      return net.yq.e.E(this.j() + ".dry.name");
   }

   public int z(net.yw.n var1) {
      return ((Boolean)var1.i(u)).booleanValue()?1:0;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.M(var1, var2, var3);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.M(var2, var3, var1);
      super.Z(var1, var2, var3, var4, var5);
   }

   protected void M(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!((Boolean)var3.i(u)).booleanValue() && this.E(var1, var2)) {
         var1.k(var2, var3.s(u, Boolean.valueOf(true)), 2);
         var1.s(2001, var2, l.h(net.nb.f.uM));
      }

   }

   private boolean E(net.yv.r var1, net.u.j var2) {
      LinkedList var4 = Lists.newLinkedList();
      g3.v.w();
      ArrayList var5 = Lists.newArrayList();
      var4.add(new net.yz.y(var2, Integer.valueOf(0)));
      int var6 = 0;
      if(!var4.isEmpty()) {
         net.yz.y var7 = (net.yz.y)var4.poll();
         net.u.j var8 = (net.u.j)var7.e();
         int var9 = ((Integer)var7.I()).intValue();
         aq[] var10 = aq.values();
         int var11 = var10.length;
         int var12 = 0;
         if(var12 < var11) {
            aq var13 = var10[var12];
            net.u.j var14 = var8.C(var13);
            if(var1.Z(var14).n() == net.y1.l.p) {
               var1.k(var14, net.nb.f.ou.p(), 2);
               var5.add(var14);
               ++var6;
               if(var9 < 6) {
                  var4.add(new net.yz.y(var14, Integer.valueOf(var9 + 1)));
               }
            }

            ++var12;
         }
      }

      Iterator var16 = var5.iterator();
      if(var16.hasNext()) {
         net.u.j var17 = (net.u.j)var16.next();
         var1.b(var17, net.nb.f.ou, false);
      }

      return false;
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, 0));
      var2.add(new ks(this, 1, 1));
   }

   public net.yw.n D(int var1) {
      return this.p().s(u, Boolean.valueOf((var1 & 1) == 1));
   }

   public int d(net.yw.n var1) {
      return ((Boolean)var1.i(u)).booleanValue()?1:0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{u});
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(((Boolean)var1.i(u)).booleanValue()) {
         aq var5 = aq.k(var4);
         if(var5 != aq.UP && !var2.Z(var3.C(var5)).z()) {
            double var6 = (double)var3.t();
            double var8 = (double)var3.h();
            double var10 = (double)var3.y();
            if(var5 == aq.DOWN) {
               var8 = var8 - 0.05D;
               var6 += var4.nextDouble();
               var10 += var4.nextDouble();
            } else {
               var8 = var8 + var4.nextDouble() * 0.8D;
               if(var5.r() == aq.l.X) {
                  var10 += var4.nextDouble();
                  if(var5 == aq.EAST) {
                     ++var6;
                  } else {
                     var6 += 0.05D;
                  }
               } else {
                  var6 += var4.nextDouble();
                  if(var5 == aq.SOUTH) {
                     ++var10;
                  } else {
                     var10 += 0.05D;
                  }
               }
            }

            var2.n(ai.DRIP_WATER, var6, var8, var10, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
