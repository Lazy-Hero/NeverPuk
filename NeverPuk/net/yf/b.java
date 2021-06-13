package net.yf;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.c9.v;
import net.yf.d;
import net.yf.g;
import net.yf.p;

public class b implements v {
   public static final b.t G = new b.t();
   public static final b.t e = new b.t();
   private final Map z = Maps.newHashMap();

   public void s(net.c9.p var1) {
      p.M();
      Iterator var3 = this.z.values().iterator();
      if(var3.hasNext()) {
         d var4 = (d)var3.next();
         var4.k();
      }

   }

   public void A(b.t var1, d var2) {
      this.z.put(var1, var2);
   }

   public g U(b.t var1) {
      return (g)this.z.get(var1);
   }

   public static class t {
   }
}
