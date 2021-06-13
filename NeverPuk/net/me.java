package net;

import net.d7;
import net.og;
import net.x9;
import net.xn;
import net.z9;
import net.nn.j;
import net.u.d;
import net.u.t;

public enum me {
   PLUS("+", 2, 0),
   MINUS("-", 2, 0),
   MUL("*", 2, 1),
   DIV("/", 2, 1),
   MOD("%", 2, 1),
   NEG("neg", 1),
   PI("pi", 0),
   SIN("sin", 1),
   COS("cos", 1),
   TAN("tan", 1),
   ATAN("atan", 1),
   ATAN2("atan2", 2),
   TORAD("torad", 1),
   TODEG("todeg", 1),
   MIN("min", 2),
   MAX("max", 2),
   CLAMP("clamp", 3),
   ABS("abs", 1),
   FLOOR("floor", 1),
   CEIL("ceil", 1),
   FRAC("frac", 1),
   ROUND("round", 1),
   SQRT("sqrt", 1),
   FMOD("fmod", 2),
   TIME("time", 0);

   private final String s;
   private final int h;
   private int l;
   public static me[] VALUES = values();

   private me(String var3, int var4) {
      this.s = var3;
      this.h = var4;
   }

   private me(String var3, int var4, int var5) {
      this.s = var3;
      this.h = var4;
      this.l = var5;
   }

   public String N() {
      return this.s;
   }

   public int Z() {
      return this.h;
   }

   public int w() {
      return this.l;
   }

   public float W(d7[] var1) {
      d[] var2 = x9.y();
      if(var1.length != this.h) {
         z9.h("Invalid number of arguments, function: " + this + ", arguments: " + var1.length + ", should be: " + this.h);
         return 0.0F;
      } else {
         switch(null.G[this.ordinal()]) {
         case 1:
            return var1[0].L() + var1[1].L();
         case 2:
            return var1[0].L() - var1[1].L();
         case 3:
            return var1[0].L() * var1[1].L();
         case 4:
            return var1[0].L() / var1[1].L();
         case 5:
            float var3 = var1[0].L();
            float var4 = var1[1].L();
            return var3 - var4 * (float)((int)(var3 / var4));
         case 6:
            return -var1[0].L();
         case 7:
            return 3.1415927F;
         case 8:
            return t.A(var1[0].L());
         case 9:
            return t.m(var1[0].L());
         case 10:
            return (float)Math.tan((double)var1[0].L());
         case 11:
            return (float)Math.atan((double)var1[0].L());
         case 12:
            return (float)t.V((double)var1[0].L(), (double)var1[1].L());
         case 13:
            return og.r(var1[0].L());
         case 14:
            return og.t(var1[0].L());
         case 15:
            return Math.min(var1[0].L(), var1[1].L());
         case 16:
            return Math.max(var1[0].L(), var1[1].L());
         case 17:
            return t.T(var1[0].L(), var1[1].L(), var1[2].L());
         case 18:
            return t.J(var1[0].L());
         case 19:
            return (float)t.M(var1[0].L());
         case 20:
            return (float)t.Y(var1[0].L());
         case 21:
            return (float)t.F((double)var1[0].L());
         case 22:
            return (float)Math.round(var1[0].L());
         case 23:
            return t.g(var1[0].L());
         case 24:
            float var5 = var1[0].L();
            float var6 = var1[1].L();
            return var5 - var6 * (float)t.M(var5 / var6);
         case 25:
            j var7 = j.b();
            net.cp.v var8 = var7.s8;
            if(var8 == null) {
               return 0.0F;
            }

            return (float)(var8.y() % 24000L) + var7.H();
         default:
            z9.h("Unknown function type: " + this);
            return 0.0F;
         }
      }
   }

   public static me Y(String var0) {
      x9.y();
      int var2 = 0;
      if(var2 < VALUES.length) {
         me var3 = VALUES[var2];
         if(var3.N().equals(var0)) {
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
