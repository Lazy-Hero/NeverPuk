package net.y;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.y.p;
import net.yz.m_;

public class uw {
   public static final uw.m V = new uw.m("B", new m_("textures/entity/banner_base.png"), "textures/entity/banner/");
   public static final uw.m h = new uw.m("S", new m_("textures/entity/shield_base.png"), "textures/entity/shield/");
   public static final m_ N = new m_("textures/entity/shield_base_nopattern.png");
   public static final m_ M = new m_("textures/entity/banner/base.png");

   public static class m {
      private final Map S = Maps.newLinkedHashMap();
      private final m_ G;
      private final String L;
      private final String m;

      public m(String var1, m_ var2, String var3) {
         this.m = var1;
         this.G = var2;
         this.L = var3;
      }

      @Nullable
      public m_ m(String var1, List var2, List var3) {
         String var4 = p.S();
         if(var1.isEmpty()) {
            return null;
         } else {
            var1 = this.m + var1;
            uw.y var5 = (uw.y)this.S.get(var1);
            if(var5 == null) {
               if(this.S.size() >= 256 && !this.c()) {
                  return uw.M;
               }

               ArrayList var6 = Lists.newArrayList();
               Iterator var7 = var2.iterator();
               if(var7.hasNext()) {
                  net.ni.s var8 = (net.ni.s)var7.next();
                  var6.add(this.L + var8.u() + ".png");
               }

               var5 = new uw.y();
               var5.W = new m_(var1);
               net.nn.j.b().n().E(var5.W, new net.n9.r(this.G, var6, var3));
               this.S.put(var1, var5);
            }

            var5.S = System.currentTimeMillis();
            return var5.W;
         }
      }

      private boolean c() {
         long var1 = System.currentTimeMillis();
         Iterator var3 = this.S.keySet().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            uw.y var5 = (uw.y)this.S.get(var4);
            if(var1 - var5.S > 5000L) {
               net.nn.j.b().n().q(var5.W);
               var3.remove();
               return true;
            }
         }

         return this.S.size() < 256;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class y {
      public long S;
      public m_ W;

      private y() {
      }
   }
}
