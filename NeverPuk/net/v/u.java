package net.v;

import com.google.common.collect.Maps;
import java.util.Map;
import net.xn;
import net.r.r;
import net.v.n;
import net.yz.aj;

public class u {
   protected final Map c = Maps.newConcurrentMap();

   public void n(r var1, n var2, int var3) {
      this.H(var1, var2, this.H(var2) + var3);
   }

   public void H(r var1, n var2, int var3) {
      n.h();
      aj var5 = (aj)this.c.get(var2);
      if(var5 == null) {
         var5 = new aj();
         this.c.put(var2, var5);
      }

      var5.p(var3);
   }

   public int H(n var1) {
      n.h();
      aj var3 = (aj)this.c.get(var1);
      return var3 == null?0:var3.j();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
