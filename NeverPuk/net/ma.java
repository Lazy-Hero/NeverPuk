package net;

import net.x9;
import net.xn;
import net.z9;
import net.u.d;
import net.y6.jb;

public enum ma {
   POS_X("tx"),
   POS_Y("ty"),
   POS_Z("tz"),
   ANGLE_X("rx"),
   ANGLE_Y("ry"),
   ANGLE_Z("rz"),
   OFFSET_X("ox"),
   OFFSET_Y("oy"),
   OFFSET_Z("oz"),
   SCALE_X("sx"),
   SCALE_Y("sy"),
   SCALE_Z("sz");

   private final String p;
   public static ma[] VALUES = values();

   private ma(String var3) {
      this.p = var3;
   }

   public String C() {
      return this.p;
   }

   public float H(jb var1) {
      d[] var2 = x9.y();
      switch(null.s[this.ordinal()]) {
      case 1:
         return var1.l;
      case 2:
         return var1.I;
      case 3:
         return var1.h;
      case 4:
         return var1.b;
      case 5:
         return var1.N;
      case 6:
         return var1.c;
      case 7:
         return var1.D;
      case 8:
         return var1.F;
      case 9:
         return var1.X;
      case 10:
         return var1.k;
      case 11:
         return var1.u;
      case 12:
         return var1.G;
      default:
         z9.h("GetFloat not supported for: " + this);
         return 0.0F;
      }
   }

   public void l(jb var1, float var2) {
      d[] var3 = x9.y();
      switch(null.s[this.ordinal()]) {
      case 1:
         var1.l = var2;
         return;
      case 2:
         var1.I = var2;
         return;
      case 3:
         var1.h = var2;
         return;
      case 4:
         var1.b = var2;
         return;
      case 5:
         var1.N = var2;
         return;
      case 6:
         var1.c = var2;
         return;
      case 7:
         var1.D = var2;
         return;
      case 8:
         var1.F = var2;
         return;
      case 9:
         var1.X = var2;
         return;
      case 10:
         var1.k = var2;
         return;
      case 11:
         var1.u = var2;
         return;
      case 12:
         var1.G = var2;
         return;
      default:
         z9.h("SetFloat not supported for: " + this);
      }
   }

   public static ma Z(String var0) {
      x9.y();
      int var2 = 0;
      if(var2 < VALUES.length) {
         ma var3 = VALUES[var2];
         if(var3.C().equals(var0)) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
