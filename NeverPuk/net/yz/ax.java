package net.yz;

import net.xn;
import net.yz.aq;
import net.yz.l;
import net.yz.m_;

public enum ax {
   NONE,
   LEFT_RIGHT,
   FRONT_BACK;

   private final String M;
   private static final String[] C;

   private ax(String var3) {
      this.M = var3;
   }

   public int l(int var1, int var2) {
      int var3 = var2 / 2;
      int var4 = var1 > var3?var1 - var2:var1;
      switch(null.A[this.ordinal()]) {
      case 1:
         return (var2 - var4) % var2;
      case 2:
         return (var3 - var4 + var2) % var2;
      default:
         return var1;
      }
   }

   public l S(aq var1) {
      aq.l var2 = var1.r();
      return this == LEFT_RIGHT && var2 == aq.l.Z || this == FRONT_BACK && var2 == aq.l.X?l.CLOCKWISE_180:l.NONE;
   }

   public aq Q(aq var1) {
      int var2 = m_.g();
      switch(null.A[this.ordinal()]) {
      case 1:
         if(var1 == aq.WEST) {
            return aq.EAST;
         } else {
            if(var1 == aq.EAST) {
               return aq.WEST;
            }

            return var1;
         }
      case 2:
         if(var1 == aq.NORTH) {
            return aq.SOUTH;
         } else {
            if(var1 == aq.SOUTH) {
               return aq.NORTH;
            }

            return var1;
         }
      default:
         return var1;
      }
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
