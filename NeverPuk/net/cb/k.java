package net.cb;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.cb.f;
import net.cb.l;
import net.cb.t;

public abstract class k implements t {
   protected List b = Lists.newArrayList();
   private f n;
   private static String[] D;

   public t h(t var1) {
      var1.E().S(this.E());
      this.b.add(var1);
      return this;
   }

   public List I() {
      return this.b;
   }

   public t z(String var1) {
      return this.h(new l(var1));
   }

   public t r(f var1) {
      this.n = var1;

      for(t var3 : this.b) {
         var3.E().S(this.E());
      }

      return this;
   }

   public f E() {
      if(this.n == null) {
         this.n = new f();

         for(t var2 : this.b) {
            var2.E().S(this.n);
         }
      }

      return this.n;
   }

   public Iterator iterator() {
      return Iterators.concat(Iterators.forArray(new k[]{this}), e(this.b));
   }

   public final String l() {
      StringBuilder var1 = new StringBuilder();

      for(t var3 : this) {
         var1.append(var3.Y());
      }

      return var1.toString();
   }

   public final String c() {
      B();
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = this.iterator();
      if(var3.hasNext()) {
         t var4 = (t)var3.next();
         String var5 = var4.Y();
         if(!var5.isEmpty()) {
            var2.append(var4.E().V());
            var2.append(var5);
            var2.append(net.cb.z.RESET);
         }
      }

      return var2.toString();
   }

   public static Iterator e(Iterable var0) {
      Iterator var1 = Iterators.concat(Iterators.transform(var0.iterator(), new Function() {
         public Iterator k(@Nullable t var1) {
            return var1.iterator();
         }
      }));
      var1 = Iterators.transform(var1, new Function() {
         public t d(@Nullable t var1) {
            t var2 = var1.c();
            var2.r(var2.E().L());
            return var2;
         }
      });
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof k)) {
         return false;
      } else {
         k var2 = (k)var1;
         return this.b.equals(var2.b) && this.E().equals(var2.E());
      }
   }

   public int hashCode() {
      return 31 * this.n.hashCode() + this.b.hashCode();
   }

   public String toString() {
      return "BaseComponent{style=" + this.n + ", siblings=" + this.b + '}';
   }

   public static void p(String[] var0) {
      D = var0;
   }

   public static String[] B() {
      return D;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      p((String[])null);
   }
}
