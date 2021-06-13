package net.y0;

import com.google.common.collect.Maps;
import java.util.Map;
import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.ek;
import net.yz.m_;

public class d3 extends l {
   private static final Map d = Maps.newHashMap();

   public d3(d var1) {
      super(var1, new ek(), 0.75F);
   }

   protected m_ Y(net.yn.c var1) {
      c.q();
      String var3 = var1.s();
      m_ var4 = (m_)d.get(var3);
      if(var4 == null) {
         var4 = new m_(var3);
         net.nn.j.b().n().E(var4, new net.n9.m(var1.L()));
         d.put(var3, var4);
      }

      return var4;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
