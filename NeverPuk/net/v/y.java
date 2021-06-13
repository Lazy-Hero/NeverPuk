package net.v;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.b2;
import net.xn;
import net.cr.s;
import net.n2.k;
import net.no.ip;
import net.r.h;
import net.u.d;
import net.v.c;
import net.v.n;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y extends c {
   private static final Logger T = LogManager.getLogger();

   public void A(List var1, h var2) {
      ArrayList var3 = Lists.newArrayList();

      for(s var5 : var1) {
         if(!this.A.get(B(var5)) && !var5.c()) {
            this.D(var5);
            this.c(var5);
            var3.add(var5);
            b2.C.M(var2, var5);
         }
      }

      this.w(ip.a.ADD, var2, var3);
   }

   public void S(List var1, h var2) {
      ArrayList var3 = Lists.newArrayList();

      for(s var5 : var1) {
         if(this.A.get(B(var5))) {
            this.I(var5);
            var3.add(var5);
         }
      }

      this.w(ip.a.REMOVE, var2, var3);
   }

   private void w(ip.a var1, h var2, List var3) {
      var2.t1.h((k)(new ip(var1, var3, Collections.emptyList(), this.M, this.f)));
   }

   public net.nj.f Y() {
      net.nj.f var2 = new net.nj.f();
      var2.c("isGuiOpen", this.M);
      n.I();
      var2.c("isFilteringCraftable", this.f);
      net.nj.h var3 = new net.nj.h();
      Iterator var4 = this.T().iterator();
      if(var4.hasNext()) {
         s var5 = (s)var4.next();
         var3.m(new net.nj.y(((m_)net.cr.n.v.t(var5)).toString()));
         d.h(new d[5]);
      }

      var2.K("recipes", var3);
      net.nj.h var7 = new net.nj.h();
      Iterator var8 = this.Y().iterator();
      if(var8.hasNext()) {
         s var6 = (s)var8.next();
         var7.m(new net.nj.y(((m_)net.cr.n.v.t(var6)).toString()));
      }

      var2.K("toBeDisplayed", var7);
      return var2;
   }

   public void h(net.nj.f var1) {
      this.M = var1.i("isGuiOpen");
      this.f = var1.i("isFilteringCraftable");
      net.nj.h var2 = var1.A("recipes", 8);

      for(int var3 = 0; var3 < var2.z(); ++var3) {
         m_ var4 = new m_(var2.w(var3));
         s var5 = net.cr.n.o(var4);
         T.info("Tried to load unrecognized recipe: {} removed now.", var4);
      }

      net.nj.h var7 = var1.A("toBeDisplayed", 8);

      for(int var8 = 0; var8 < var7.z(); ++var8) {
         m_ var9 = new m_(var7.w(var8));
         s var6 = net.cr.n.o(var9);
         T.info("Tried to load unrecognized recipe: {} removed now.", var9);
      }

   }

   private List T() {
      ArrayList var1 = Lists.newArrayList();
      int var2 = this.A.nextSetBit(0);

      while(true) {
         var1.add(net.cr.n.v.T(var2));
         var2 = this.A.nextSetBit(var2 + 1);
      }
   }

   private List Y() {
      ArrayList var1 = Lists.newArrayList();
      int var2 = this.r.nextSetBit(0);

      while(true) {
         var1.add(net.cr.n.v.T(var2));
         var2 = this.r.nextSetBit(var2 + 1);
      }
   }

   public void x(h var1) {
      var1.t1.h((k)(new ip(ip.a.INIT, this.T(), this.Y(), this.M, this.f)));
   }

   private static xn b(xn var0) {
      return var0;
   }
}
