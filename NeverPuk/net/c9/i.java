package net.c9;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.c9.b;
import net.c9.m;
import net.c9.p;
import net.c9.pz;
import net.c9.v;
import net.c9.x;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i implements v {
   private static final Logger K = LogManager.getLogger();
   private final net.y3.c D;
   private String L;
   protected static final m v = new m();
   private final Map H = Maps.newHashMap();

   public i(net.y3.c var1, String var2) {
      this.D = var1;
      this.L = var2;
      b.g(v);
   }

   public void M(List var1) {
      this.H.clear();
      b.K();
      Iterator var3 = var1.iterator();
      if(var3.hasNext()) {
         x var4 = (x)var3.next();
         net.y3.e var5 = (net.y3.e)var4.K(this.D, "language");
         if(var5 != null) {
            Iterator var6 = var5.k().iterator();
            if(var6.hasNext()) {
               pz var7 = (pz)var6.next();
               if(!this.H.containsKey(var7.n())) {
                  this.H.put(var7.n(), var7);
               }
            }
         }
      }

   }

   public void s(p var1) {
      ArrayList var2 = Lists.newArrayList(new String[]{"en_us"});
      if(!"en_us".equals(this.L)) {
         var2.add(this.L);
      }

      v.z(var1, var2);
      net.yq.x.S(v.f);
   }

   public boolean h() {
      return v.i();
   }

   public boolean v() {
      return this.D() != null && this.D().V();
   }

   public void X(pz var1) {
      this.L = var1.n();
   }

   public pz D() {
      String var1 = this.H.containsKey(this.L)?this.L:"en_us";
      return (pz)this.H.get(var1);
   }

   public SortedSet i() {
      return Sets.newTreeSet(this.H.values());
   }

   public pz U(String var1) {
      return (pz)this.H.get(var1);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
