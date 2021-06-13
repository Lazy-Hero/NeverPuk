package net.h;

import net.xn;
import net.h.h;
import net.h.l;
import net.yz.m_;

public class z implements h {
   private final m_ D;
   private final float i;
   private final float U;
   private final int k;
   private final net.h.z c;
   private final boolean d;

   public z(String var1, float var2, float var3, int var4, net.h.z var5, boolean var6) {
      this.D = new m_(var1);
      this.i = var2;
      this.U = var3;
      this.k = var4;
      this.c = var5;
      this.d = var6;
   }

   public m_ m() {
      return this.D;
   }

   public m_ I() {
      return new m_(this.D.A(), "sounds/" + this.D.v() + ".ogg");
   }

   public float G() {
      return this.i;
   }

   public float J() {
      return this.U;
   }

   public int p() {
      return this.k;
   }

   public net.h.z w() {
      return this;
   }

   public net.h.z E() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public static enum s {
      FILE("file"),
      SOUND_EVENT("event");

      private final String t;

      private s(String var3) {
         this.t = var3;
      }

      public static net.h.z k(String var0) {
         l.l();
         net.h.z[] var2 = values();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            net.h.z var5 = var2[var4];
            if(var5.t.equals(var0)) {
               return var5;
            }

            ++var4;
         }

         return null;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
