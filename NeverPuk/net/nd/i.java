package net.nd;

import javax.annotation.Nullable;
import net.xn;
import net.cb.t;
import net.nd.c;
import net.nd.h;
import net.nd.x;

public class i implements c {
   private final i.r Z;
   private String o;
   private String m;
   private long A;
   private boolean f;

   public i(i.r var1, t var2, @Nullable t var3) {
      this.Z = var1;
      this.o = var2.l();
      this.m = null;
   }

   public c.d n(h var1, long var2) {
      boolean var4 = x.d.c();
      if(this.f) {
         this.A = var2;
         this.f = false;
      }

      var1.Q().n().E(X);
      net.y.d.Z(1.0F, 1.0F, 1.0F);
      var1.g(0, 0, 0, 64, 160, 32);
      if(this.m == null) {
         var1.Q().sO.v(this.o, 18.0F, 12.0F, -256);
      }

      var1.Q().sO.v(this.o, 18.0F, 7.0F, -256);
      var1.Q().sO.v(this.m, 18.0F, 18.0F, -1);
      c.d var10000 = var2 - this.A < 5000L?c.d.SHOW:c.d.HIDE;
      if(net.u.d.y() == null) {
         x.d.C(false);
      }

      return var10000;
   }

   public void L(t var1, @Nullable t var2) {
      this.o = var1.l();
      this.m = null;
      this.f = true;
   }

   public i.r z() {
      return this.Z;
   }

   public static void u(h var0, i.r var1, t var2, @Nullable t var3) {
      i var4 = (i)var0.m(i.class, var1);
      var0.a(new i(var1, var2, var3));
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum r {
      TUTORIAL_HINT,
      NARRATOR_TOGGLE;
   }
}
