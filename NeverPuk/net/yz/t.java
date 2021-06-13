package net.yz;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.yz.a0;

public class t implements a0 {
   private static final Object i = null;
   private Object[] G;
   private int[] N;
   private Object[] h;
   private int B;
   private int q;

   public t(int var1) {
      var1 = (int)((float)var1 / 0.8F);
      this.G = (Object[])(new Object[var1]);
      this.N = new int[var1];
      this.h = (Object[])(new Object[var1]);
   }

   public int w(@Nullable Object var1) {
      return this.I(this.F(var1, this.K(var1)));
   }

   @Nullable
   public Object d(int var1) {
      return var1 < this.h.length?this.h[var1]:null;
   }

   private int I(int var1) {
      return var1 == -1?-1:this.N[var1];
   }

   public int J(Object var1) {
      int var2 = this.h();
      this.E(var1, var2);
      return var2;
   }

   private int h() {
      while(this.B < this.h.length && this.h[this.B] != null) {
         ++this.B;
      }

      return this.B;
   }

   private void V(int var1) {
      Object[] var2 = this.G;
      int[] var3 = this.N;
      this.G = (Object[])(new Object[var1]);
      this.N = new int[var1];
      this.h = (Object[])(new Object[var1]);
      this.B = 0;
      this.q = 0;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if(var2[var4] != null) {
            this.E(var2[var4], var3[var4]);
         }
      }

   }

   public void E(Object var1, int var2) {
      int var3 = Math.max(var2, this.q + 1);
      if((float)var3 >= (float)this.G.length * 0.8F) {
         int var4;
         for(var4 = this.G.length << 1; var4 < var2; var4 <<= 1) {
            ;
         }

         this.V(var4);
      }

      int var5 = this.C(this.K(var1));
      this.G[var5] = var1;
      this.N[var5] = var2;
      this.h[var2] = var1;
      ++this.q;
      if(var2 == this.B) {
         ++this.B;
      }

   }

   private int K(@Nullable Object var1) {
      return (net.u.t.J(System.identityHashCode(var1)) & Integer.MAX_VALUE) % this.G.length;
   }

   private int F(@Nullable Object var1, int var2) {
      for(int var3 = var2; var3 < this.G.length; ++var3) {
         if(this.G[var3] == var1) {
            return var3;
         }

         if(this.G[var3] == i) {
            return -1;
         }
      }

      for(int var4 = 0; var4 < var2; ++var4) {
         if(this.G[var4] == var1) {
            return var4;
         }

         if(this.G[var4] == i) {
            return -1;
         }
      }

      return -1;
   }

   private int C(int var1) {
      for(int var2 = var1; var2 < this.G.length; ++var2) {
         if(this.G[var2] == i) {
            return var2;
         }
      }

      for(int var3 = 0; var3 < var1; ++var3) {
         if(this.G[var3] == i) {
            return var3;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }

   public Iterator iterator() {
      return Iterators.filter(Iterators.forArray(this.h), Predicates.notNull());
   }

   public void h() {
      Arrays.fill(this.G, (Object)null);
      Arrays.fill(this.h, (Object)null);
      this.B = 0;
      this.q = 0;
   }

   public int i() {
      return this.q;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
