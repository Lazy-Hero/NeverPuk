package net.t;

import com.google.common.collect.Maps;
import java.util.Map;
import net.cb.t;
import net.nl.v;
import net.nl.zq;
import net.r.i;
import net.r.r;
import net.t.b;
import net.u.d;
import net.yv.x;

public class f extends zq implements x {
   private final String B;
   private final Map f;

   public f(String var1, t var2, int var3) {
      b.O();
      super(var2, var3);
      this.f = Maps.newHashMap();
      this.B = var1;
      d.h(new d[1]);
   }

   public int e(int var1) {
      int var2 = b.O();
      return this.f.containsKey(Integer.valueOf(var1))?((Integer)this.f.get(Integer.valueOf(var1))).intValue():0;
   }

   public void Z(int var1, int var2) {
      this.f.put(Integer.valueOf(var1), Integer.valueOf(var2));
   }

   public int r() {
      return this.f.size();
   }

   public boolean U() {
      return false;
   }

   public void P(net.yv.f var1) {
   }

   public net.yv.f z() {
      return net.yv.f.Q;
   }

   public String H() {
      return this.B;
   }

   public v A(i var1, r var2) {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
