package net.u;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import net.xn;
import net.u.d;
import net.u.j;

public class u {
   public static Iterable S(Class var0, Iterable var1) {
      return new u.y(var0, (Iterable[])Y(Iterable.class, var1));
   }

   public static Iterable T(Iterable var0) {
      return a(S(Object.class, var0));
   }

   private static Iterable a(Iterable var0) {
      return Iterables.transform(var0, new u.s());
   }

   private static Object[] Y(Class var0, Iterable var1) {
      j.n();
      ArrayList var3 = Lists.newArrayList();
      Iterator var4 = var1.iterator();
      if(var4.hasNext()) {
         Object var5 = var4.next();
         var3.add(var5);
      }

      return var3.toArray(z(var0, var3.size()));
   }

   private static Object[] z(Class var0, int var1) {
      return (Object[])((Object[])Array.newInstance(var0, var1));
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class s implements Function {
      private s() {
      }

      public List o(@Nullable Object[] var1) {
         return Arrays.asList((Object[])var1);
      }
   }

   static class y implements Iterable {
      private final Class Y;
      private final Iterable[] T;

      private y(Class var1, Iterable[] var2) {
         this.Y = var1;
         this.T = var2;
      }

      public Iterator iterator() {
         d[] var1 = j.n();
         return (Iterator)(this.T.length <= 0?Collections.singletonList(u.z(this.Y, 0)).iterator():new u.y.q(this.Y, this.T));
      }

      private static xn a(xn var0) {
         return var0;
      }

      static class q extends UnmodifiableIterator {
         private int B;
         private final Iterable[] R;
         private final Iterator[] n;
         private final Object[] F;

         private q(Class var1, Iterable[] var2) {
            this.B = -2;
            this.R = var2;
            this.n = (Iterator[])u.z(Iterator.class, this.R.length);

            for(int var3 = 0; var3 < this.R.length; ++var3) {
               this.n[var3] = var2[var3].iterator();
            }

            this.F = u.z(var1, this.n.length);
         }

         private void w() {
            this.B = -1;
            Arrays.fill(this.n, (Object)null);
            Arrays.fill(this.F, (Object)null);
         }

         public boolean hasNext() {
            d[] var1 = j.n();
            if(this.B == -2) {
               this.B = 0;
               Iterator[] var7 = this.n;
               int var3 = var7.length;
               int var4 = 0;
               if(var4 < var3) {
                  Iterator var5 = var7[var4];
                  if(!var5.hasNext()) {
                     this.w();
                  }

                  ++var4;
               }

               return true;
            } else {
               if(this.B >= this.n.length) {
                  this.B = this.n.length - 1;
                  if(this.B >= 0) {
                     Iterator var2 = this.n[this.B];
                     if(var2.hasNext()) {
                        ;
                     }

                     if(this.B == 0) {
                        this.w();
                     }

                     var2 = this.R[this.B].iterator();
                     this.n[this.B] = var2;
                     if(!var2.hasNext()) {
                        this.w();
                     }

                     --this.B;
                  }
               }

               return this.B >= 0;
            }
         }

         public Object[] u() {
            if(!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               while(this.B < this.n.length) {
                  this.F[this.B] = this.n[this.B].next();
                  ++this.B;
               }

               return (Object[])this.F.clone();
            }
         }

         private static NoSuchElementException a(NoSuchElementException var0) {
            return var0;
         }
      }
   }
}
