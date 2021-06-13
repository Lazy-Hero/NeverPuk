package net.n;

import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.l.q;
import net.n.e;
import net.n.y;
import net.u.p;
import net.u.t;
import net.yv.c;
import net.yv.d;

public class m {
   private static final Predicate C = new Predicate() {
      public boolean y(@Nullable net.r.h var1) {
         int[] var2 = y.c();
         return var1 != null && !var1.VX();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final Predicate n = new Predicate() {
      public boolean p(@Nullable net.r.h var1) {
         int[] var2 = y.c();
         return var1 != null && (!var1.VX() || var1.j().N().b("spectatorsGenerateChunks"));
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final d e;
   private final List b = Lists.newArrayList();
   private final Long2ObjectMap M = new Long2ObjectOpenHashMap(4096);
   private final Set N = Sets.newHashSet();
   private final List X = Lists.newLinkedList();
   private final List i = Lists.newLinkedList();
   private final List L = Lists.newArrayList();
   private int j;
   private long R;
   private boolean H = true;
   private boolean K = true;

   public m(d var1) {
      this.e = var1;
      this.t(var1.v().c().W());
   }

   public d j() {
      return this.e;
   }

   public Iterator S() {
      final Iterator var1 = this.L.iterator();
      return new AbstractIterator() {
         protected q U() {
            int[] var1x = y.c();
            if(var1.hasNext()) {
               e var2 = (e)var1.next();
               q var3 = var2.L();
               if(var3 == null) {
                  ;
               }

               if(!var3.h() && var3.M()) {
                  return var3;
               } else if(!var3.p()) {
                  return var3;
               } else {
                  if(!var2.h(128.0D, m.C)) {
                     ;
                  }

                  return var3;
               }
            } else {
               return (q)this.endOfData();
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
   }

   public void x() {
      y.c();
      long var2 = this.e.y();
      if(Long.compare(var2 - this.R, 8000L) > 0) {
         this.R = var2;
         int var4 = 0;
         if(var4 < this.L.size()) {
            e var5 = (e)this.L.get(var4);
            var5.Y();
            var5.R();
            ++var4;
         }
      }

      if(!this.N.isEmpty()) {
         Iterator var11 = this.N.iterator();
         if(var11.hasNext()) {
            e var16 = (e)var11.next();
            var16.Y();
         }

         this.N.clear();
      }

      if(this.H && Long.compare(var2 % 4L, 0L) == 0) {
         this.H = false;
         Collections.sort(this.i, new Comparator() {
            public int E(e var1, e var2) {
               return ComparisonChain.start().compare(var1.c(), var2.c()).result();
            }
         });
      }

      if(this.K && Long.compare(var2 % 4L, 2L) == 0) {
         this.K = false;
         Collections.sort(this.X, new Comparator() {
            public int L(e var1, e var2) {
               return ComparisonChain.start().compare(var1.c(), var2.c()).result();
            }
         });
      }

      if(!this.i.isEmpty()) {
         long var12 = System.nanoTime() + 50000000L;
         int var6 = 49;
         Iterator var7 = this.i.iterator();
         if(var7.hasNext()) {
            e var8 = (e)var7.next();
            if(var8.L() == null) {
               boolean var9 = var8.m(n);
               if(var8.L(var9)) {
                  var7.remove();
                  if(var8.L()) {
                     this.X.remove(var8);
                  }

                  --var6;
                  if(var6 >= 0 && System.nanoTime() > var12) {
                     ;
                  }
               }
            }
         }
      }

      if(!this.X.isEmpty()) {
         int var13 = 81;
         Iterator var17 = this.X.iterator();
         if(var17.hasNext()) {
            e var19 = (e)var17.next();
            if(var19.L()) {
               var17.remove();
               --var13;
               if(var13 < 0) {
                  ;
               }
            }
         }
      }

      if(this.b.isEmpty()) {
         c var15 = this.e.F;
         if(!var15.X()) {
            this.e.E().f();
         }
      }

   }

   public boolean K(int var1, int var2) {
      long var3 = w(var1, var2);
      return this.M.get(var3) != null;
   }

   @Nullable
   public e h(int var1, int var2) {
      return (e)this.M.get(w(var1, var2));
   }

   private e d(int var1, int var2) {
      long var3 = w(var1, var2);
      e var5 = (e)this.M.get(var3);
      var5 = new e(this, var1, var2);
      this.M.put(var3, var5);
      this.L.add(var5);
      if(var5.L() == null) {
         this.i.add(var5);
      }

      if(!var5.L()) {
         this.X.add(var5);
      }

      return var5;
   }

   public void A(net.u.j var1) {
      int var2 = var1.t() >> 4;
      int var3 = var1.y() >> 4;
      e var4 = this.h(var2, var3);
      var4.C(var1.t() & 15, var1.h(), var1.y() & 15);
   }

   public void Z(net.r.h var1) {
      int var2 = (int)var1.b >> 4;
      int var3 = (int)var1.hr >> 4;
      var1.tu = var1.b;
      var1.tg = var1.hr;

      for(int var4 = var2 - this.j; var4 <= var2 + this.j; ++var4) {
         for(int var5 = var3 - this.j; var5 <= var3 + this.j; ++var5) {
            this.d(var4, var5).L(var1);
         }
      }

      this.b.add(var1);
      this.a();
   }

   public void N(net.r.h var1) {
      int var2 = (int)var1.tu >> 4;
      int var3 = (int)var1.tg >> 4;

      for(int var4 = var2 - this.j; var4 <= var2 + this.j; ++var4) {
         for(int var5 = var3 - this.j; var5 <= var3 + this.j; ++var5) {
            e var6 = this.h(var4, var5);
            var6.l(var1);
         }
      }

      this.b.remove(var1);
      this.a();
   }

   private boolean G(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 - var3;
      int var7 = var2 - var4;
      return var6 >= -var5 && var6 <= var5?var7 >= -var5 && var7 <= var5:false;
   }

   public void H(net.r.h var1) {
      int var2 = (int)var1.b >> 4;
      int var3 = (int)var1.hr >> 4;
      double var4 = var1.tu - var1.b;
      double var6 = var1.tg - var1.hr;
      double var8 = var4 * var4 + var6 * var6;
      if(var8 >= 64.0D) {
         int var10 = (int)var1.tu >> 4;
         int var11 = (int)var1.tg >> 4;
         int var12 = this.j;
         int var13 = var2 - var10;
         int var14 = var3 - var11;

         for(int var15 = var2 - var12; var15 <= var2 + var12; ++var15) {
            for(int var16 = var3 - var12; var16 <= var3 + var12; ++var16) {
               if(!this.G(var15, var16, var10, var11, var12)) {
                  this.d(var15, var16).L(var1);
               }

               if(!this.G(var15 - var13, var16 - var14, var2, var3, var12)) {
                  e var17 = this.h(var15 - var13, var16 - var14);
                  var17.l(var1);
               }
            }
         }

         var1.tu = var1.b;
         var1.tg = var1.hr;
         this.a();
      }

   }

   public boolean G(net.r.h var1, int var2, int var3) {
      e var4 = this.h(var2, var3);
      return var4.J(var1) && var4.Q();
   }

   public void t(int var1) {
      var1 = t.g(var1, 3, 32);
      if(var1 != this.j) {
         int var2 = var1 - this.j;

         for(net.r.h var4 : Lists.newArrayList(this.b)) {
            int var5 = (int)var4.b >> 4;
            int var6 = (int)var4.hr >> 4;

            for(int var7 = var5 - var1; var7 <= var5 + var1; ++var7) {
               for(int var8 = var6 - var1; var8 <= var6 + var1; ++var8) {
                  e var9 = this.d(var7, var8);
                  if(!var9.J(var4)) {
                     var9.L(var4);
                  }
               }
            }
         }

         this.j = var1;
         this.a();
      }

   }

   private void a() {
      this.H = true;
      this.K = true;
   }

   public static int u(int var0) {
      return var0 * 16 - 16;
   }

   private static long w(int var0, int var1) {
      return (long)var0 + 2147483647L | (long)var1 + 2147483647L << 32;
   }

   public void W(e var1) {
      this.N.add(var1);
   }

   public void M(e var1) {
      p var2 = var1.Q();
      long var3 = w(var2.i, var2.y);
      var1.R();
      this.M.remove(var3);
      this.L.remove(var1);
      this.N.remove(var1);
      this.X.remove(var1);
      this.i.remove(var1);
      q var5 = var1.L();
      this.j().E().I(var5);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
