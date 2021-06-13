package net.i;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.i.o;
import net.u.d;
import net.y9.l;
import net.ym.a;
import net.yw.n;
import net.yz.m_;

public class j extends o {
   private final net.yr.h J;
   private final String h;
   private final List o;

   private j(@Nullable net.yr.h var1, @Nullable String var2, List var3) {
      this.J = var1;
      this.h = var2;
      this.o = var3;
   }

   protected a g(n var1) {
      o.M();
      LinkedHashMap var3 = Maps.newLinkedHashMap(var1.A());
      if(this.J == null) {
         String var4 = ((m_)l.m.t(var1.Q())).toString();
         d.h(new d[5]);
      }

      String var7 = this.X(this.J, var3);
      if(this.h != null) {
         var7 = var7 + this.h;
      }

      Iterator var5 = this.o.iterator();
      if(var5.hasNext()) {
         net.yr.h var6 = (net.yr.h)var5.next();
         var3.remove(var6);
      }

      return new a(var7, this.o(var3));
   }

   private String X(net.yr.h var1, Map var2) {
      return var1.p((Comparable)var2.remove(this.J));
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class i {
      private net.yr.h y;
      private String z;
      private final List d = Lists.newArrayList();

      public j.i r(net.yr.h var1) {
         this.y = var1;
         return this;
      }

      public j.i O(String var1) {
         this.z = var1;
         return this;
      }

      public j.i X(net.yr.h... var1) {
         Collections.addAll(this.d, var1);
         return this;
      }

      public j H() {
         return new j(this.y, this.z, this.d);
      }
   }
}
