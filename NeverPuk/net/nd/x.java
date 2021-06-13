package net.nd;

import javax.annotation.Nullable;
import net.xn;
import net.cb.t;
import net.nd.c;
import net.nd.h;

public class x implements c {
   private final x.d F;
   private final String k;
   private final String c;
   private c.d y = c.d.SHOW;
   private long u;
   private float l;
   private float j;
   private final boolean C;

   public x(x.d var1, t var2, @Nullable t var3, boolean var4) {
      this.F = var1;
      this.k = var2.c();
      this.c = null;
      this.C = var4;
   }

   public c.d n(h var1, long var2) {
      x.d.c();
      var1.Q().n().E(X);
      net.y.d.Z(1.0F, 1.0F, 1.0F);
      var1.g(0, 0, 0, 96, 160, 32);
      this.F.H(var1, 6, 6);
      if(this.c == null) {
         var1.Q().sO.v(this.k, 30.0F, 12.0F, -11534256);
      }

      var1.Q().sO.v(this.k, 30.0F, 7.0F, -11534256);
      var1.Q().sO.v(this.c, 30.0F, 18.0F, -16777216);
      if(this.C) {
         net.z.g.u(3, 28, 157, 29, -1);
         float var5 = (float)net.u.t.z((double)this.l, (double)this.j, (double)((float)(var2 - this.u) / 100.0F));
         if(Float.compare(this.j, this.l) >= 0) {
            int var6 = -16755456;
         }

         int var7 = -11206656;
         net.z.g.u(3, 28, (int)(3.0F + 154.0F * var5), 29, var7);
         this.l = var5;
         this.u = var2;
      }

      return this.y;
   }

   public void B() {
      this.y = c.d.HIDE;
   }

   public void D(float var1) {
      this.j = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum d {
      MOVEMENT_KEYS(0, 0),
      MOUSE(1, 0),
      TREE(2, 0),
      RECIPE_BOOK(0, 1),
      WOODEN_PLANKS(1, 1);

      private final int S;
      private final int d;
      private static boolean G;

      private d(int var3, int var4) {
         this.S = var3;
         this.d = var4;
      }

      public void H(net.z.g var1, int var2, int var3) {
         net.y.d.C();
         var1.g(var2, var3, 176 + this.S * 20, this.d * 20, 20, 20);
         net.y.d.C();
      }

      static {
         C(false);
      }

      public static void C(boolean var0) {
         G = var0;
      }

      public static boolean o() {
         return G;
      }

      public static boolean c() {
         boolean var0 = o();
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
