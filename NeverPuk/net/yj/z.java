package net.yj;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.u.j;
import net.yj.f;
import net.yj.w;
import net.yj.y;
import net.yv.r;

public class z implements w {
   private final float c;
   private final Random z;

   public z(j var1, y var2) {
      this.c = var2.j();
      this.z = var2.b(var1);
   }

   @Nullable
   public f.k R(r var1, j var2, f.k var3) {
      int var4 = f.b();
      return Float.compare(this.c, 1.0F) < 0 && this.z.nextFloat() > this.c?null:var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
