package net.yf;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.cr.l;
import net.cr.s;
import net.n0.ks;
import net.n0.y;
import net.yz.w;

public class p {
   public final Int2IntMap r = new Int2IntOpenHashMap();
   private static boolean S;

   public void x(ks var1) {
      boolean var2 = A();
      if(!var1.B() && !var1.j() && !var1.g() && !var1.v()) {
         int var3 = o(var1);
         int var4 = var1.U();
         this.b(var3, var4);
      }

   }

   public static int o(ks var0) {
      y var1 = var0.Z();
      int var2 = var1.I()?var0.n():0;
      return y.V.D(var1) << 16 | var2 & '\uffff';
   }

   public boolean D(int var1) {
      return this.r.get(var1) > 0;
   }

   public int Y(int var1, int var2) {
      int var3 = this.r.get(var1);
      if(var3 >= var2) {
         this.r.put(var1, var3 - var2);
         return var1;
      } else {
         return 0;
      }
   }

   private void b(int var1, int var2) {
      this.r.put(var1, this.r.get(var1) + var2);
   }

   public boolean d(s var1, @Nullable IntList var2) {
      return this.O(var1, var2, 1);
   }

   public boolean O(s var1, @Nullable IntList var2, int var3) {
      return (new p.m(var1)).v(var3, var2);
   }

   public int S(s var1, @Nullable IntList var2) {
      return this.Z(var1, Integer.MAX_VALUE, var2);
   }

   public int Z(s var1, int var2, @Nullable IntList var3) {
      return (new p.m(var1)).X(var2, var3);
   }

   public static ks W(int var0) {
      return ks.a;
   }

   public void L() {
      this.r.clear();
   }

   public static void d(boolean var0) {
      S = var0;
   }

   public static boolean A() {
      return S;
   }

   public static boolean M() {
      boolean var0 = A();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!M()) {
         d(true);
      }

   }

   class m {
      private final s F;
      private final List z = Lists.newArrayList();
      private final int s;
      private final int[] r;
      private final int T;
      private final BitSet j;
      private final IntList d = new IntArrayList();

      public m(s var2) {
         this.F = var2;
         this.z.addAll(var2.p());
         this.z.removeIf((var0) -> {
            return var0 == l.r;
         });
         this.s = this.z.size();
         this.r = this.O();
         this.T = this.r.length;
         this.j = new BitSet(this.s + this.T + this.s + this.s * this.T);

         for(int var3 = 0; var3 < this.z.size(); ++var3) {
            IntList var4 = ((l)this.z.get(var3)).p();

            for(int var5 = 0; var5 < this.T; ++var5) {
               if(var4.contains(this.r[var5])) {
                  this.j.set(this.f(true, var5, var3));
               }
            }
         }

      }

      public boolean v(int var1, @Nullable IntList var2) {
         boolean var3 = p.S;
         if(var1 <= 0) {
            return true;
         } else {
            int var4 = 0;
            if(this.F(var1)) {
               p.this.Y(this.r[this.d.getInt(0)], var1);
               int var5 = this.d.size() - 1;
               this.X(this.d.getInt(var5));
               int var6 = 0;
               if(var6 < var5) {
                  int var10001 = var6 & 1;
                  this.v(true, ((Integer)this.d.get(var6)).intValue(), ((Integer)this.d.get(var6 + 1)).intValue());
                  ++var6;
               }

               this.d.clear();
               this.j.clear(0, this.s + this.T);
               ++var4;
            }

            boolean var11 = var4 == this.s;
            boolean var13 = true;
            var2.clear();
            this.j.clear(0, this.s + this.T + this.s);
            int var7 = 0;
            w var8 = this.F.p();
            int var9 = 0;
            if(var9 < var8.size()) {
               if(var8.get(var9) == l.r) {
                  var2.add(0);
               }

               int var10 = 0;
               if(var10 < this.T) {
                  if(this.H(false, var7, var10)) {
                     this.v(true, var10, var7);
                     p.this.b(this.r[var10], var1);
                     var2.add(this.r[var10]);
                  }

                  ++var10;
               }

               ++var7;
               ++var9;
            }

            return var11;
         }
      }

      private int[] O() {
         IntAVLTreeSet var1 = new IntAVLTreeSet();

         for(l var3 : this.z) {
            var1.addAll(var3.p());
         }

         IntIterator var4 = var1.iterator();

         while(var4.hasNext()) {
            if(!p.this.D(var4.nextInt())) {
               var4.remove();
            }
         }

         return var1.toIntArray();
      }

      private boolean F(int var1) {
         int var2 = this.T;

         for(int var3 = 0; var3 < var2; ++var3) {
            if(p.this.r.get(this.r[var3]) >= var1) {
               this.X(false, var3);

               while(!this.d.isEmpty()) {
                  int var4 = this.d.size();
                  boolean var5 = (var4 & 1) == 1;
                  int var6 = this.d.getInt(var4 - 1);
                  if(!this.q(var6)) {
                     break;
                  }

                  int var7 = this.s;

                  for(int var8 = 0; var8 < var7; ++var8) {
                     if(!this.O(var5, var8) && this.S(var5, var6, var8) && this.H(var5, var6, var8)) {
                        this.X(var5, var8);
                        break;
                     }
                  }

                  int var9 = this.d.size();
                  if(var9 == var4) {
                     this.d.removeInt(var9 - 1);
                  }
               }

               if(!this.d.isEmpty()) {
                  return true;
               }
            }
         }

         return false;
      }

      private boolean q(int var1) {
         return this.j.get(this.G(var1));
      }

      private void X(int var1) {
         this.j.set(this.G(var1));
      }

      private int G(int var1) {
         return this.s + this.T + var1;
      }

      private boolean S(boolean var1, int var2, int var3) {
         return this.j.get(this.f(var1, var2, var3));
      }

      private boolean H(boolean var1, int var2, int var3) {
         return var1 != this.j.get(1 + this.f(var1, var2, var3));
      }

      private void v(boolean var1, int var2, int var3) {
         this.j.flip(1 + this.f(var1, var2, var3));
      }

      private int f(boolean var1, int var2, int var3) {
         int var4 = var2 * this.s + var3;
         return this.s + this.T + this.s + 2 * var4;
      }

      private void X(boolean var1, int var2) {
         this.j.set(this.O(var1, var2));
         this.d.add(var2);
      }

      private boolean O(boolean var1, int var2) {
         return this.j.get(this.O(var1, var2));
      }

      private int O(boolean var1, int var2) {
         return 0 + var2;
      }

      public int X(int var1, @Nullable IntList var2) {
         int var3 = 0;
         int var4 = Math.min(var1, this.n()) + 1;

         while(true) {
            int var5 = (var3 + var4) / 2;
            if(this.v(var5, (IntList)null)) {
               if(var4 - var3 <= 1) {
                  this.v(var5, var2);
                  return var5;
               }

               var3 = var5;
            } else {
               var4 = var5;
            }
         }
      }

      private int n() {
         int var1 = Integer.MAX_VALUE;

         for(l var3 : this.z) {
            int var4 = 0;

            int var5;
            for(IntListIterator var6 = var3.p().iterator(); var6.hasNext(); var4 = Math.max(var4, p.this.r.get(var5))) {
               var5 = ((Integer)var6.next()).intValue();
            }

            var1 = Math.min(var1, var4);
         }

         return var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
