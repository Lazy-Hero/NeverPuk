package net.yd;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.u.j;
import net.u.t;
import net.yd.y;
import net.yv.d;

public enum x {
   START {
      public void M(d var1, y var2, List var3, int var4, j var5) {
         t.J();
         j var7 = new j(0, 128, 0);
         Iterator var8 = var3.iterator();
         if(var8.hasNext()) {
            net.nm.j var9 = (net.nm.j)var8.next();
            var9.x(var7);
         }

         var2.z(PREPARING_TO_SUMMON_PILLARS);
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   PREPARING_TO_SUMMON_PILLARS {
      public void M(d var1, y var2, List var3, int var4, j var5) {
         int[] var6 = t.J();
         if(var4 < 100) {
            if(var4 != 0 && var4 != 50 && var4 != 51 && var4 != 52 && var4 < 95) {
               return;
            }

            var1.s(3001, new j(0, 128, 0), 0);
         }

         var2.z(SUMMONING_PILLARS);
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   SUMMONING_PILLARS {
      public void M(d var1, y var2, List var3, int var4, j var5) {
         t.J();
         boolean var10001 = true;
         boolean var8 = var4 % 40 == 0;
         boolean var9 = var4 % 40 == 39;
         if(net.u.d.y() == null) {
            t.E(new int[1]);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   SUMMONING_DRAGON {
      public void M(d var1, y var2, List var3, int var4, j var5) {
         int[] var6 = t.J();
         if(var4 >= 100) {
            var2.z(END);
            var2.I();
            Iterator var7 = var3.iterator();
            if(var7.hasNext()) {
               net.nm.j var8 = (net.nm.j)var7.next();
               var8.x((j)null);
               var1.B(var8, var8.b, var8.hS, var8.hr, 6.0F, false);
               var8.B();
            }
         }

         if(var4 >= 80) {
            var1.s(3001, new j(0, 128, 0), 0);
         }

         if(var4 == 0) {
            Iterator var9 = var3.iterator();
            if(var9.hasNext()) {
               net.nm.j var10 = (net.nm.j)var9.next();
               var10.x(new j(0, 128, 0));
            }
         }

         if(var4 < 5) {
            var1.s(3001, new j(0, 128, 0), 0);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   END {
      public void M(d var1, y var2, List var3, int var4, j var5) {
      }
   };

   private x() {
   }

   public abstract void M(d var1, y var2, List var3, int var4, j var5);
}
