package net.yw;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.yr.h;
import net.yw.n;
import net.yw.q;
import net.yz.m_;

public abstract class l implements n {
   private static final Joiner Q = Joiner.on(',');
   private static final Function B = new Function() {
      @Nullable
      public String C(@Nullable Entry var1) {
         String var2 = q.Q();
         if(var1 == null) {
            return "<NULL>";
         } else {
            h var3 = (h)var1.getKey();
            return var3.l() + "=" + this.u(var3, (Comparable)var1.getValue());
         }
      }

      private String u(h var1, Comparable var2) {
         return var1.p(var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private int U = -1;
   private int I = -1;
   private int l = -1;
   private m_ V = null;

   public int z() {
      if(this.U < 0) {
         this.U = net.y9.l.h(this.Q());
      }

      return this.U;
   }

   public int l() {
      if(this.I < 0) {
         this.I = net.y9.l.m((n)this);
      }

      return this.I;
   }

   public int Q() {
      if(this.l < 0) {
         this.l = this.Q().d((n)this);
      }

      return this.l;
   }

   public m_ z() {
      if(this.V == null) {
         this.V = (m_)net.y9.l.m.t(this.Q());
      }

      return this.V;
   }

   public ImmutableTable R() {
      return null;
   }

   public n C(h var1) {
      return this.s(var1, (Comparable)w(var1.Z(), this.i(var1)));
   }

   protected static Object w(Collection var0, Object var1) {
      q.Q();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         if(var3.next().equals(var1)) {
            if(var3.hasNext()) {
               return var3.next();
            }

            return var0.iterator().next();
         }
      }

      return var3.next();
   }

   public String toString() {
      q.Q();
      StringBuilder var2 = new StringBuilder();
      var2.append(net.y9.l.m.t(this.Q()));
      if(!this.A().isEmpty()) {
         var2.append("[");
         Q.appendTo(var2, Iterables.transform(this.A().entrySet(), B));
         var2.append("]");
      }

      return var2.toString();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
