package net;

import net.d7;
import net.x9;
import net.xn;
import net.nn.j;
import net.y0.c;
import net.y0.d;
import net.y0.o;

public enum z6 implements d7 {
   LIMB_SWING("limb_swing"),
   LIMB_SWING_SPEED("limb_speed"),
   AGE("age"),
   HEAD_YAW("head_yaw"),
   HEAD_PITCH("head_pitch"),
   SCALE("scale");

   private final String L;
   private final d X;
   private static final z6[] F = values();

   private z6(String var3) {
      this.L = var3;
      this.X = j.b().N();
   }

   public String J() {
      return this.L;
   }

   public float L() {
      x9.y();
      c var2 = this.X.b;
      if(var2 == null) {
         return 0.0F;
      } else {
         if(var2 instanceof o) {
            o var3 = (o)var2;
            switch(null.p[this.ordinal()]) {
            case 1:
               return var3.t;
            case 2:
               return var3.s;
            case 3:
               return var3.x;
            case 4:
               return var3.U;
            case 5:
               return var3.J;
            case 6:
               return var3.q;
            }
         }

         return 0.0F;
      }
   }

   public static z6 T(String var0) {
      x9.y();
      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
