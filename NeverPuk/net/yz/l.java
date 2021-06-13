package net.yz;

import net.xn;
import net.yz.aq;
import net.yz.m_;

public enum l {
   NONE,
   CLOCKWISE_90,
   CLOCKWISE_180,
   COUNTERCLOCKWISE_90;

   private final String j;
   private static final String[] S;

   private l(String var3) {
      this.j = var3;
   }

   public l B(l var1) {
      int var2 = m_.g();
      switch(null.T[var1.ordinal()]) {
      case 3:
         switch(null.T[this.ordinal()]) {
         case 1:
            return CLOCKWISE_180;
         case 2:
            return COUNTERCLOCKWISE_90;
         case 3:
            return NONE;
         case 4:
            return CLOCKWISE_90;
         }
      case 4:
         switch(null.T[this.ordinal()]) {
         case 1:
            return COUNTERCLOCKWISE_90;
         case 2:
            return NONE;
         case 3:
            return CLOCKWISE_90;
         case 4:
            return CLOCKWISE_180;
         }
      case 2:
         switch(null.T[this.ordinal()]) {
         case 1:
            return CLOCKWISE_90;
         case 2:
            return CLOCKWISE_180;
         case 3:
            return COUNTERCLOCKWISE_90;
         case 4:
            return NONE;
         }
      default:
         return this;
      }
   }

   public aq d(aq var1) {
      if(var1.r() == aq.l.Y) {
         return var1;
      } else {
         switch(null.T[this.ordinal()]) {
         case 2:
            return var1.R();
         case 3:
            return var1.f();
         case 4:
            return var1.i();
         default:
            return var1;
         }
      }
   }

   public int K(int var1, int var2) {
      switch(null.T[this.ordinal()]) {
      case 2:
         return (var1 + var2 / 4) % var2;
      case 3:
         return (var1 + var2 / 2) % var2;
      case 4:
         return (var1 + var2 * 3 / 4) % var2;
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
