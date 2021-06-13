package net.n9;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.xn;
import net.n9.e;
import net.n9.v;
import net.y.g;

public class l {
   private final int u;
   private final Set k = Sets.newHashSetWithExpectedSize(256);
   private final List J = Lists.newArrayListWithCapacity(256);
   private int R;
   private int a;
   private final int o;
   private final int S;
   private final int q;

   public l(int var1, int var2, int var3, int var4) {
      this.u = var4;
      this.o = var1;
      this.S = var2;
      this.q = var3;
   }

   public int j() {
      return this.R;
   }

   public int H() {
      return this.a;
   }

   public void a(v var1) {
      l.s var2 = new l.s(var1, this.u);
      if(this.q > 0) {
         var2.o(this.q);
      }

      this.k.add(var2);
   }

   public void J() {
      l.s[] var1 = (l.s[])this.k.toArray(new l.s[this.k.size()]);
      Arrays.sort(var1);

      for(l.s var5 : var1) {
         if(!this.w(var5)) {
            String var6 = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", new Object[]{var5.Q().V(), Integer.valueOf(var5.Q().d()), Integer.valueOf(var5.Q().z()), Integer.valueOf(this.R), Integer.valueOf(this.a), Integer.valueOf(this.o), Integer.valueOf(this.S)});
            throw new g(var5, var6);
         }
      }

      this.R = net.u.t.A(this.R);
      this.a = net.u.t.A(this.a);
   }

   public List p() {
      ArrayList var1 = Lists.newArrayList();

      for(l.n var3 : this.J) {
         var3.M(var1);
      }

      ArrayList var7 = Lists.newArrayList();

      for(l.n var4 : var1) {
         l.s var5 = var4.s();
         v var6 = var5.Q();
         var6.R(this.R, this.a, var4.C(), var4.V(), var5.Y());
         var7.add(var6);
      }

      return var7;
   }

   private static int i(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) == 0?0:1) << var1;
   }

   private boolean w(l.s var1) {
      v var2 = var1.Q();
      boolean var3 = var2.d() != var2.z();

      for(int var4 = 0; var4 < this.J.size(); ++var4) {
         if(((l.n)this.J.get(var4)).r(var1)) {
            return true;
         }

         var1.x();
         if(((l.n)this.J.get(var4)).r(var1)) {
            return true;
         }

         var1.x();
      }

      return this.g(var1);
   }

   private boolean g(l.s var1) {
      int var3 = Math.min(var1.D(), var1.K());
      Math.max(var1.D(), var1.K());
      e.d();
      net.u.t.A(this.R);
      net.u.t.A(this.a);
      int var7 = net.u.t.A(this.R + var3);
      int var8 = net.u.t.A(this.a + var3);
      boolean var9 = var7 <= this.o;
      boolean var10 = var8 <= this.S;
      return false;
   }

   private static g a(g var0) {
      return var0;
   }

   public static class n {
      private final int e;
      private final int F;
      private final int G;
      private final int C;
      private List K;
      private l.s k;

      public n(int var1, int var2, int var3, int var4) {
         this.e = var1;
         this.F = var2;
         this.G = var3;
         this.C = var4;
      }

      public l.s s() {
         return this.k;
      }

      public int C() {
         return this.e;
      }

      public int V() {
         return this.F;
      }

      public boolean r(l.s var1) {
         String[] var2 = e.d();
         if(this.k != null) {
            return false;
         } else {
            int var3 = var1.D();
            int var4 = var1.K();
            if(var3 <= this.G && var4 <= this.C) {
               if(var3 == this.G && var4 == this.C) {
                  this.k = var1;
                  return true;
               } else {
                  if(this.K == null) {
                     this.K = Lists.newArrayListWithCapacity(1);
                     this.K.add(new l.n(this.e, this.F, var3, var4));
                     int var5 = this.G - var3;
                     int var6 = this.C - var4;
                     if(var6 > 0 && var5 > 0) {
                        int var7 = Math.max(this.C, var5);
                        int var8 = Math.max(this.G, var6);
                        if(var7 >= var8) {
                           this.K.add(new l.n(this.e, this.F + var4, var3, var6));
                           this.K.add(new l.n(this.e + var3, this.F, var5, this.C));
                        }

                        this.K.add(new l.n(this.e + var3, this.F, var5, var4));
                        this.K.add(new l.n(this.e, this.F + var4, this.G, var6));
                     }

                     if(var5 == 0) {
                        this.K.add(new l.n(this.e, this.F + var4, var3, var6));
                     }

                     if(var6 == 0) {
                        this.K.add(new l.n(this.e + var3, this.F, var5, var4));
                     }
                  }

                  Iterator var9 = this.K.iterator();
                  if(var9.hasNext()) {
                     l.n var10 = (l.n)var9.next();
                     if(var10.r(var1)) {
                        return true;
                     }
                  }

                  return false;
               }
            } else {
               return false;
            }
         }
      }

      public void M(List var1) {
         if(this.k != null) {
            var1.add(this);
         } else if(this.K != null) {
            for(l.n var3 : this.K) {
               var3.M(var1);
            }
         }

      }

      public String toString() {
         return "Slot{originX=" + this.e + ", originY=" + this.F + ", width=" + this.G + ", height=" + this.C + ", texture=" + this.k + ", subSlots=" + this.K + '}';
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class s implements Comparable {
      private final v P;
      private final int x;
      private final int k;
      private final int R;
      private boolean U;
      private float g = 1.0F;

      public s(v var1, int var2) {
         this.P = var1;
         this.x = var1.d();
         this.k = var1.z();
         this.R = var2;
         this.U = l.i(this.k, var2) > l.i(this.x, var2);
      }

      public v Q() {
         return this.P;
      }

      public int D() {
         int var1 = this.U?this.k:this.x;
         return l.i((int)((float)var1 * this.g), this.R);
      }

      public int K() {
         int var1 = this.U?this.x:this.k;
         return l.i((int)((float)var1 * this.g), this.R);
      }

      public void x() {
         this.U = !this.U;
      }

      public boolean Y() {
         return this.U;
      }

      public void o(int var1) {
         if(this.x > var1 && this.k > var1) {
            this.g = (float)var1 / (float)Math.min(this.x, this.k);
         }

      }

      public String toString() {
         return "Holder{width=" + this.x + ", height=" + this.k + ", name=" + this.P.V() + '}';
      }

      public int n(l.s var1) {
         String[] var2 = e.d();
         if(this.K() == var1.K()) {
            if(this.D() == var1.D()) {
               if(this.P.V() == null) {
                  return var1.P.V() == null?0:-1;
               }

               return this.P.V().compareTo(var1.P.V());
            }

            boolean var3 = this.D() < var1.D()?true:true;
         }

         int var4 = this.K() < var1.K()?1:-1;
         return var4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
