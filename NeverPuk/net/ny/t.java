package net.ny;

import java.io.File;
import javax.annotation.Nullable;
import net.xn;
import net.cg.l;
import net.cg.w;
import net.ny.b;
import net.ny.f;
import net.ny.j;
import net.ny.k;
import net.yv.c;

public class t extends l {
   public t(File var1, String var2, boolean var3, net.c0.d var4) {
      super(var1, var2, var3, var4);
   }

   public j d(c var1) {
      f.h();
      File var3 = this.G();
      if(var1 instanceof net.yv.b) {
         File var5 = new File(var3, "DIM-1");
         var5.mkdirs();
         return new k(var5, this.a);
      } else if(var1 instanceof net.yv.k) {
         File var4 = new File(var3, "DIM1");
         var4.mkdirs();
         return new k(var4, this.a);
      } else {
         return new k(var3, this.a);
      }
   }

   public void Z(net.cg.z var1, @Nullable net.nj.f var2) {
      var1.z(19133);
      super.Z(var1, var2);
   }

   public void K() {
      w.f().s();
      b.h();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
