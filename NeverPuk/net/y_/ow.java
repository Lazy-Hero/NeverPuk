package net.y_;

import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.of;
import net.y_.s;

public class ow extends of {
   protected final float a;

   public ow(net.ne.s var1, double var2) {
      this(var1, var2, 0.001F);
   }

   public ow(net.ne.s var1, double var2, float var4) {
      super(var1, var2);
      this.a = var4;
   }

   @Nullable
   protected net.u.r N() {
      boolean var1 = b.E();
      if(this.p.p()) {
         net.u.r var2 = s.Y(this.p, 15, 7);
         return var2 == null?super.N():var2;
      } else {
         return this.p.Q().nextFloat() >= this.a?s.Y(this.p, 10, 7):super.N();
      }
   }

   private static xn c(xn var0) {
      return var0;
   }
}
