package net.n5;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;
import net.xn;
import net.n5.l;
import net.n5.m;
import net.yz.aq;
import net.yz.ar;

public class a {
   private static final int L = (int)Math.pow(16.0D, 0.0D);
   private static final int s = (int)Math.pow(16.0D, 1.0D);
   private static final int d = (int)Math.pow(16.0D, 2.0D);
   private final BitSet D = new BitSet(4096);
   private static final int[] j = new int[1352];
   private int A = 4096;

   public void M(net.u.j var1) {
      this.D.set(z(var1), true);
      --this.A;
   }

   private static int z(net.u.j var0) {
      return v(var0.t() & 15, var0.h() & 15, var0.y() & 15);
   }

   private static int v(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public l z() {
      l var1 = new l();
      if(4096 - this.A < 256) {
         var1.T(true);
      } else if(this.A == 0) {
         var1.T(false);
      } else {
         for(int var5 : j) {
            if(!this.D.get(var5)) {
               var1.l(this.w(var5));
            }
         }
      }

      return var1;
   }

   public Set k(net.u.j var1) {
      return this.w(z(var1));
   }

   private Set w(int var1) {
      EnumSet var2 = EnumSet.noneOf(aq.class);
      ArrayDeque var3 = new ArrayDeque(384);
      var3.add(ar.m(var1));
      this.D.set(var1, true);

      while(!var3.isEmpty()) {
         int var4 = ((Integer)var3.poll()).intValue();
         this.I(var4, var2);

         for(aq var8 : aq.VALUES) {
            int var9 = this.a(var4, var8);
            if(!this.D.get(var9)) {
               this.D.set(var9, true);
               var3.add(ar.m(var9));
            }
         }
      }

      return var2;
   }

   private void I(int var1, Set var2) {
      int var3 = var1 >> 0 & 15;
      var2.add(aq.WEST);
      int var4 = var1 >> 8 & 15;
      var2.add(aq.DOWN);
      int var5 = var1 >> 4 & 15;
      var2.add(aq.NORTH);
   }

   private int a(int var1, aq var2) {
      int[] var3 = m.t();
      switch(null.j[var2.ordinal()]) {
      case 1:
         if((var1 >> 8 & 15) == 0) {
            return -1;
         }

         return var1 - d;
      case 2:
         if((var1 >> 8 & 15) == 15) {
            return -1;
         }

         return var1 + d;
      case 3:
         if((var1 >> 4 & 15) == 0) {
            return -1;
         }

         return var1 - s;
      case 4:
         if((var1 >> 4 & 15) == 15) {
            return -1;
         }

         return var1 + s;
      case 5:
         if((var1 >> 0 & 15) == 0) {
            return -1;
         }

         return var1 - L;
      case 6:
         if((var1 >> 0 & 15) == 15) {
            return -1;
         }

         return var1 + L;
      default:
         return -1;
      }
   }

   static {
      boolean var10000 = false;
      var10000 = true;
      boolean var3 = false;
      boolean var4 = false;
      int var5 = 0;

      while(true) {
         ++var5;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
