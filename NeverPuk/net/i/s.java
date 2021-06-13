package net.i;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.xn;
import net.i.b;
import net.i.h;
import net.i.o;
import net.y9.l;
import net.ym.a;
import net.yz.m_;

public class s {
   private final Map A = Maps.newIdentityHashMap();
   private final Set S = Sets.newIdentityHashSet();

   public void P(l var1, b var2) {
      this.A.put(var1, var2);
   }

   public void m(l... var1) {
      Collections.addAll(this.S, var1);
   }

   public Map u() {
      IdentityHashMap var1 = Maps.newIdentityHashMap();

      for(l var3 : l.m) {
         var1.putAll(this.I(var3));
      }

      return var1;
   }

   public Set M(l var1) {
      int var2 = o.M();
      if(this.S.contains(var1)) {
         return Collections.emptySet();
      } else {
         b var3 = (b)this.A.get(var1);
         if(var3 == null) {
            return Collections.singleton(l.m.t(var1));
         } else {
            HashSet var4 = Sets.newHashSet();
            Iterator var5 = var3.p(var1).values().iterator();
            if(var5.hasNext()) {
               a var6 = (a)var5.next();
               var4.add(new m_(var6.A(), var6.v()));
            }

            return var4;
         }
      }
   }

   public Map I(l var1) {
      return this.S.contains(var1)?Collections.emptyMap():((b)MoreObjects.firstNonNull(this.A.get(var1), new h())).p(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
