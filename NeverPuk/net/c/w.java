package net.c;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.c.r;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w implements r {
   private static final Logger Y;
   protected final Map y = this.b();
   private Object[] g;
   private static net.u.d[] G;

   protected Map b() {
      return Maps.newHashMap();
   }

   @Nullable
   public Object B(@Nullable Object var1) {
      return this.y.get(var1);
   }

   public void H(Object var1, Object var2) {
      Validate.notNull(var1);
      Validate.notNull(var2);
      this.g = null;
      if(this.y.containsKey(var1)) {
         Y.debug("Adding duplicate key \'{}\' to registry", var1);
      }

      this.y.put(var1, var2);
   }

   public Set i() {
      return Collections.unmodifiableSet(this.y.keySet());
   }

   @Nullable
   public Object Y(Random var1) {
      net.u.d[] var2 = N();
      if(this.g == null) {
         Collection var3 = this.y.values();
         if(var3.isEmpty()) {
            return null;
         }

         this.g = var3.toArray(new Object[var3.size()]);
      }

      Object var10000 = this.g[var1.nextInt(this.g.length)];
      if(net.u.d.y() == null) {
         q(new net.u.d[5]);
      }

      return var10000;
   }

   public boolean l(Object var1) {
      return this.y.containsKey(var1);
   }

   public Iterator iterator() {
      return this.y.values().iterator();
   }

   static {
      if(N() != null) {
         q(new net.u.d[2]);
      }

      Y = LogManager.getLogger();
   }

   public static void q(net.u.d[] var0) {
      G = var0;
   }

   public static net.u.d[] N() {
      return G;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
