package net.c1;

import net.xn;
import net.c1.y;
import net.n0.k3;
import net.n0.k_;
import net.n0.kg;
import net.n0.yd;
import net.n0.yi;
import net.nl.z2;
import net.y9.rm;

public enum d {
   ALL {
      public boolean F(net.n0.y var1) {
         y.j();
         d[] var3 = d.values();
         int var4 = var3.length;
         int var5 = 0;
         if(var5 < var4) {
            d var6 = var3[var5];
            if(var6 != d.ALL && var6.F(var1)) {
               return true;
            }

            ++var5;
         }

         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   ARMOR {
      public boolean F(net.n0.y var1) {
         return var1 instanceof net.n0.j;
      }
   },
   ARMOR_FEET {
      public boolean F(net.n0.y var1) {
         String var2 = y.j();
         return var1 instanceof net.n0.j && ((net.n0.j)var1).Q == z2.FEET;
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   ARMOR_LEGS {
      public boolean F(net.n0.y var1) {
         String var2 = y.j();
         return var1 instanceof net.n0.j && ((net.n0.j)var1).Q == z2.LEGS;
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   ARMOR_CHEST {
      public boolean F(net.n0.y var1) {
         String var2 = y.j();
         return var1 instanceof net.n0.j && ((net.n0.j)var1).Q == z2.CHEST;
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   ARMOR_HEAD {
      public boolean F(net.n0.y var1) {
         String var2 = y.j();
         return var1 instanceof net.n0.j && ((net.n0.j)var1).Q == z2.HEAD;
      }

      private static xn a(xn var0) {
         return var0;
      }
   },
   WEAPON {
      public boolean F(net.n0.y var1) {
         return var1 instanceof k3;
      }
   },
   DIGGER {
      public boolean F(net.n0.y var1) {
         return var1 instanceof k_;
      }
   },
   FISHING_ROD {
      public boolean F(net.n0.y var1) {
         return var1 instanceof yd;
      }
   },
   BREAKABLE {
      public boolean F(net.n0.y var1) {
         return var1.P();
      }
   },
   BOW {
      public boolean F(net.n0.y var1) {
         return var1 instanceof net.n0.e;
      }
   },
   WEARABLE {
      public boolean F(net.n0.y var1) {
         String var2 = y.j();
         if(var1 instanceof net.n0.q && ((net.n0.q)var1).o() instanceof rm) {
            boolean var4 = true;
         } else {
            boolean var10000 = false;
         }

         return var1 instanceof net.n0.j || var1 instanceof yi || var1 instanceof kg;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   private d() {
   }

   public abstract boolean F(net.n0.y var1);
}
