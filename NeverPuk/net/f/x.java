package net.f;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.f.l;
import net.nn.j;
import net.u.e;
import net.y.u;
import net.yv.r;
import net.yy.g;

public class x implements l.g {
   private final j X;
   private final Map O = Maps.newTreeMap(Ordering.natural().reverse());

   x(j var1) {
      this.X = var1;
   }

   public void L(long var1, net.u.j var3) {
      Map var4 = (Map)this.O.get(Long.valueOf(var1));
      HashMap var6 = Maps.newHashMap();
      this.O.put(Long.valueOf(var1), var6);
      Integer var5 = (Integer)var6.get(var3);
      var5 = Integer.valueOf(0);
      var6.put(var3, Integer.valueOf(var5.intValue() + 1));
   }

   public void X(float var1, long var2) {
      long var5 = this.X.s8.y();
      g var7 = this.X.sf;
      double var8 = var7.hL + (var7.b - var7.hL) * (double)var1;
      l.K();
      double var10 = var7.F + (var7.hS - var7.F) * (double)var1;
      double var12 = var7.A + (var7.hr - var7.A) * (double)var1;
      r var10001 = this.X.sf.hl;
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.y(2.0F);
      net.y.d.w();
      net.y.d.Y(false);
      boolean var34 = true;
      double var10000 = 0.0025D;
      HashSet var18 = Sets.newHashSet();
      HashMap var19 = Maps.newHashMap();
      Iterator var20 = this.O.entrySet().iterator();
      if(var20.hasNext()) {
         Entry var21 = (Entry)var20.next();
         Long var22 = (Long)var21.getKey();
         Map var23 = (Map)var21.getValue();
         long var24 = var5 - var22.longValue();
         if(var24 > 200L) {
            var20.remove();
         }

         Iterator var26 = var23.entrySet().iterator();
         if(var26.hasNext()) {
            Entry var27 = (Entry)var26.next();
            net.u.j var28 = (net.u.j)var27.getKey();
            Integer var29 = (Integer)var27.getValue();
            if(var18.add(var28)) {
               u.a((new e(net.u.j.V)).x(0.002D).d(0.0025D * (double)var24).w((double)var28.t(), (double)var28.h(), (double)var28.y()).w(-var8, -var10, -var12), 1.0F, 1.0F, 1.0F, 1.0F);
               var19.put(var28, var29);
            }
         }
      }

      Iterator var30 = var19.entrySet().iterator();
      if(var30.hasNext()) {
         Entry var31 = (Entry)var30.next();
         net.u.j var32 = (net.u.j)var31.getKey();
         Integer var33 = (Integer)var31.getValue();
         l.p(String.valueOf(var33), var32.t(), var32.h(), var32.y(), var1, -1);
      }

      net.y.d.Y(true);
      net.y.d.S();
      net.y.d.E();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
