package net.yw;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.ni.v;
import net.u.j;
import net.yv.r;
import net.yw.n;
import net.yw.q;

public class w {
   private final r S;
   private final j D;
   private final boolean K;
   private n X;
   private v y;
   private boolean B;

   public w(r var1, j var2, boolean var3) {
      this.S = var1;
      this.D = var2;
      this.K = var3;
   }

   public n J() {
      String var1 = q.Q();
      if(this.X == null && (this.K || this.S.o(this.D))) {
         this.X = this.S.Z(this.D);
      }

      return this.X;
   }

   @Nullable
   public v K() {
      if(this.y == null && !this.B) {
         this.y = this.S.L(this.D);
         this.B = true;
      }

      return this.y;
   }

   public j X() {
      return this.D;
   }

   public static Predicate U(final Predicate var0) {
      return new Predicate() {
         public boolean h(@Nullable w var1) {
            String var2 = q.Q();
            return var0.apply(var1.J());
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      };
   }

   private static xn a(xn var0) {
      return var0;
   }
}
