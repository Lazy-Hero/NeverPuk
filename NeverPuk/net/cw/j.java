package net.cw;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.cw.t;
import net.y9.l;
import net.yr.h;
import net.yw.n;
import net.yw.q;

public class j implements Predicate {
   public static final Predicate v = new Predicate() {
      public boolean q(@Nullable n var1) {
         return true;
      }
   };
   private final q U;
   private final Map Q = Maps.newHashMap();

   private j(q var1) {
      this.U = var1;
   }

   public static j T(l var0) {
      return new j(var0.j());
   }

   public boolean i(@Nullable n var1) {
      String[] var2 = t.q.Z();
      if(var1 != null && var1.Q().equals(this.U.b())) {
         if(this.Q.isEmpty()) {
            return true;
         } else {
            Iterator var3 = this.Q.entrySet().iterator();
            if(var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if(!this.Q(var1, (h)var4.getKey(), (Predicate)var4.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   protected boolean Q(n var1, h var2, Predicate var3) {
      return var3.apply(var1.i(var2));
   }

   public j f(h var1, Predicate var2) {
      if(!this.U.R().contains(var1)) {
         throw new IllegalArgumentException(this.U + " cannot support property " + var1);
      } else {
         this.Q.put(var1, var2);
         return this;
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
