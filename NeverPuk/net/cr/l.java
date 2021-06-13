package net.cr;

import com.google.common.base.Predicate;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;
import net.xn;
import net.cr.j;
import net.n0.ks;
import net.yf.p;

public class l implements Predicate {
   public static final l r = new l(new ks[0], null) {
      public boolean j(@Nullable ks var1) {
         return var1.B();
      }
   };
   private final ks[] U;
   private IntList f;

   private l(ks... var1) {
      this.U = var1;
   }

   public ks[] x() {
      return this.U;
   }

   public boolean j(@Nullable ks var1) {
      return false;
   }

   public IntList p() {
      int[] var1 = j.Y();
      if(this.f == null) {
         this.f = new IntArrayList(this.U.length);
         ks[] var2 = this.U;
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            ks var5 = var2[var4];
            this.f.add(p.o(var5));
            ++var4;
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public static l S(net.n0.y var0) {
      return b(new ks[]{new ks(var0, 1, 32767)});
   }

   public static l t(net.n0.y... var0) {
      ks[] var1 = new ks[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = new ks(var0[var2]);
      }

      return b(var1);
   }

   public static l b(ks... var0) {
      if(var0.length > 0) {
         for(ks var4 : var0) {
            if(!var4.B()) {
               return new l(var0);
            }
         }
      }

      return r;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
