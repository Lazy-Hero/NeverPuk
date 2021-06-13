package net.y_;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.y_.b;

public class sd {
   net.ne.y X;
   List d = Lists.newArrayList();
   List F = Lists.newArrayList();

   public sd(net.ne.y var1) {
      this.X = var1;
   }

   public void h() {
      this.d.clear();
      this.F.clear();
   }

   public boolean v(net.ne.l var1) {
      boolean var2 = b.q();
      if(this.d.contains(var1)) {
         return true;
      } else if(this.F.contains(var1)) {
         return false;
      } else {
         this.X.hl.M.K("canSee");
         boolean var3 = this.X.b(var1);
         this.X.hl.M.N();
         if(var3) {
            this.d.add(var1);
         }

         this.F.add(var1);
         return var3;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
