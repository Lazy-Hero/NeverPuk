package net.ym;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.ym.j;
import net.ym.l;
import net.ym.s;
import net.ym.t;
import net.yz.aq;

public class r implements j {
   private final Map Z;
   protected final boolean N;
   protected final boolean V;
   protected final net.n9.v S;
   protected final s p;
   protected final l Y;

   public r(Map var1) {
      this.Z = var1;
      j var2 = (j)var1.values().iterator().next();
      this.N = var2.a();
      this.V = var2.M();
      this.S = var2.o();
      this.p = var2.D();
      this.Y = var2.q();
   }

   public List h(@Nullable net.yw.n var1, @Nullable aq var2, long var3) {
      t.v();
      ArrayList var6 = Lists.newArrayList();
      Iterator var7 = this.Z.entrySet().iterator();
      if(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         if(((Predicate)var8.getKey()).apply(var1)) {
            var6.addAll(((j)var8.getValue()).h(var1, var2, var3++));
         }
      }

      return var6;
   }

   public boolean a() {
      return this.N;
   }

   public boolean M() {
      return this.V;
   }

   public boolean t() {
      return false;
   }

   public net.n9.v o() {
      return this.S;
   }

   public s D() {
      return this.p;
   }

   public l q() {
      return this.Y;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class m {
      private final Map S = Maps.newLinkedHashMap();

      public void J(Predicate var1, j var2) {
         this.S.put(var1, var2);
      }

      public j i() {
         return new r(this.S);
      }
   }
}
