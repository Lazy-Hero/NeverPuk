package net.u;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import net.xn;
import net.ne.l;
import net.u.d;
import net.u.r;
import net.u.t;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class j extends d {
   private static final Logger J = LogManager.getLogger();
   public static final j V = new j(0, 0, 0);
   private static final int e = 1 + t.r(t.A(30000000));
   private static final int b = e;
   private static final int D = 64 - e - b;
   private static final int A = 0 + b;
   private static final int n = A + D;
   private static final long a = (1L << e) - 1L;
   private static final long C = (1L << D) - 1L;
   private static final long u = (1L << b) - 1L;
   private static d[] W;

   public j(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public j(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public j(l var1) {
      this(var1.b, var1.hS, var1.hr);
   }

   public j(r var1) {
      this(var1.p, var1.H, var1.a);
   }

   public j(d var1) {
      this(var1.t(), var1.h(), var1.y());
   }

   public j G(double var1, double var3, double var5) {
      d[] var7 = n();
      return Double.compare(var1, 0.0D) == 0 && var3 == 0.0D && var5 == 0.0D?this:new j((double)this.t() + var1, (double)this.h() + var3, (double)this.y() + var5);
   }

   public j F(int var1, int var2, int var3) {
      d[] var4 = n();
      return var1 == 0 && var2 == 0 && var3 == 0?this:new j(this.t() + var1, this.h() + var2, this.y() + var3);
   }

   public j z(d var1) {
      return this.F(var1.t(), var1.h(), var1.y());
   }

   public j m(d var1) {
      return this.F(-var1.t(), -var1.h(), -var1.y());
   }

   public j h() {
      return this.J(1);
   }

   public j J(int var1) {
      return this.a(aq.UP, var1);
   }

   public j b() {
      return this.p(1);
   }

   public j p(int var1) {
      return this.a(aq.DOWN, var1);
   }

   public j D() {
      return this.E(1);
   }

   public j E(int var1) {
      return this.a(aq.NORTH, var1);
   }

   public j d() {
      return this.H(1);
   }

   public j H(int var1) {
      return this.a(aq.SOUTH, var1);
   }

   public j H() {
      return this.O(1);
   }

   public j O(int var1) {
      return this.a(aq.WEST, var1);
   }

   public j g() {
      return this.i(1);
   }

   public j i(int var1) {
      return this.a(aq.EAST, var1);
   }

   public j C(aq var1) {
      return this.a(var1, 1);
   }

   public j a(aq var1, int var2) {
      return this;
   }

   public j N(net.yz.l var1) {
      switch(null.V[var1.ordinal()]) {
      case 1:
      default:
         return this;
      case 2:
         return new j(-this.y(), this.h(), this.t());
      case 3:
         return new j(-this.t(), this.h(), -this.y());
      case 4:
         return new j(this.y(), this.h(), -this.t());
      }
   }

   public j l(d var1) {
      return new j(this.h() * var1.y() - this.y() * var1.h(), this.y() * var1.t() - this.t() * var1.y(), this.t() * var1.h() - this.h() * var1.t());
   }

   public long F() {
      return ((long)this.t() & a) << n | ((long)this.h() & C) << A | ((long)this.y() & u) << 0;
   }

   public static j X(long var0) {
      int var2 = (int)(var0 << 64 - n - e >> 64 - e);
      int var3 = (int)(var0 << 64 - A - D >> 64 - D);
      int var4 = (int)(var0 << 64 - b >> 64 - b);
      return new j(var2, var3, var4);
   }

   public static Iterable e(j var0, j var1) {
      return e(Math.min(var0.t(), var1.t()), Math.min(var0.h(), var1.h()), Math.min(var0.y(), var1.y()), Math.max(var0.t(), var1.t()), Math.max(var0.h(), var1.h()), Math.max(var0.y(), var1.y()));
   }

   public static Iterable e(final int var0, final int var1, final int var2, final int var3, final int var4, final int var5) {
      return new Iterable() {
         public Iterator iterator() {
            return new AbstractIterator() {
               private boolean N = true;
               private int h;
               private int B;
               private int l;

               protected j j() {
                  d[] var1x = j.W;
                  if(this.N) {
                     this.N = false;
                     this.h = var0;
                     this.B = var1;
                     this.l = var2;
                     return new j(var0, var1, var2);
                  } else if(this.h == var3 && this.B == var4 && this.l == var5) {
                     return (j)this.endOfData();
                  } else {
                     if(this.h < var3) {
                        ++this.h;
                     }

                     if(this.B < var4) {
                        this.h = var0;
                        ++this.B;
                     }

                     if(this.l < var5) {
                        this.h = var0;
                        this.B = var1;
                        ++this.l;
                     }

                     return new j(this.h, this.B, this.l);
                  }
               }

               private static xn a(xn var0x) {
                  return var0x;
               }
            };
         }
      };
   }

   public j F() {
      return this;
   }

   public static Iterable X(j var0, j var1) {
      return R(Math.min(var0.t(), var1.t()), Math.min(var0.h(), var1.h()), Math.min(var0.y(), var1.y()), Math.max(var0.t(), var1.t()), Math.max(var0.h(), var1.h()), Math.max(var0.y(), var1.y()));
   }

   public static Iterable R(final int var0, final int var1, final int var2, final int var3, final int var4, final int var5) {
      return new Iterable() {
         public Iterator iterator() {
            return new AbstractIterator() {
               private j.v T;

               protected j.v i() {
                  d[] var1x = j.W;
                  if(this.T == null) {
                     this.T = new j.v(var0, var1, var2);
                     return this.T;
                  } else if(this.T.z == var3 && this.T.h == var4 && this.T.j == var5) {
                     return (j.v)this.endOfData();
                  } else {
                     if(this.T.z < var3) {
                        ++this.T.z;
                     }

                     if(this.T.h < var4) {
                        this.T.z = var0;
                        ++this.T.h;
                     }

                     if(this.T.j < var5) {
                        this.T.z = var0;
                        this.T.h = var1;
                        ++this.T.j;
                     }

                     return this.T;
                  }
               }

               private static xn a(xn var0x) {
                  return var0x;
               }
            };
         }
      };
   }

   static {
      d[] var10000 = new d[5];
      G(var10000);
   }

   public static void G(d[] var0) {
      W = var0;
   }

   public static d[] n() {
      return W;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static final class m extends j.v {
      private boolean B;
      private static final List P = Lists.newArrayList();

      private m(int var1, int var2, int var3) {
         super(var1, var2, var3);
      }

      public static j.m u() {
         return k(0, 0, 0);
      }

      public static j.m x(double var0, double var2, double var4) {
         return k(t.L(var0), t.L(var2), t.L(var4));
      }

      public static j.m D(d var0) {
         return k(var0.t(), var0.h(), var0.y());
      }

      public static j.m k(int var0, int var1, int var2) {
         j.W;
         List var4 = P;
         if(!P.isEmpty()) {
            j.m var5 = (j.m)P.remove(P.size() - 1);
            if(var5 != null && var5.B) {
               var5.B = false;
               var5.c(var0, var1, var2);
               return var5;
            }
         }

         return new j.m(var0, var1, var2);
      }

      public void T() {
         j.W;
         List var2 = P;
         if(P.size() < 100) {
            P.add(this);
         }

         this.B = true;
      }

      public j.m c(int var1, int var2, int var3) {
         if(this.B) {
            j.J.error("PooledMutableBlockPosition modified after it was released.", new Throwable());
            this.B = false;
         }

         return (j.m)super.V(var1, var2, var3);
      }

      public j.m O(l var1) {
         return (j.m)super.n(var1);
      }

      public j.m E(double var1, double var3, double var5) {
         return (j.m)super.A(var1, var3, var5);
      }

      public j.m G(d var1) {
         return (j.m)super.V(var1);
      }

      public j.m O(aq var1) {
         return (j.m)super.q(var1);
      }

      public j.m b(aq var1, int var2) {
         return (j.m)super.j(var1, var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class v extends j {
      protected int z;
      protected int h;
      protected int j;

      public v() {
         this(0, 0, 0);
      }

      public v(j var1) {
         this(var1.t(), var1.h(), var1.y());
      }

      public v(int var1, int var2, int var3) {
         super(0, 0, 0);
         this.z = var1;
         this.h = var2;
         this.j = var3;
      }

      public j G(double var1, double var3, double var5) {
         return super.G(var1, var3, var5).F();
      }

      public j F(int var1, int var2, int var3) {
         return super.F(var1, var2, var3).F();
      }

      public j a(aq var1, int var2) {
         return super.a(var1, var2).F();
      }

      public j N(net.yz.l var1) {
         return super.N(var1).F();
      }

      public int t() {
         return this.z;
      }

      public int h() {
         return this.h;
      }

      public int y() {
         return this.j;
      }

      public j.v V(int var1, int var2, int var3) {
         this.z = var1;
         this.h = var2;
         this.j = var3;
         return this;
      }

      public j.v n(l var1) {
         return this.A(var1.b, var1.hS, var1.hr);
      }

      public j.v A(double var1, double var3, double var5) {
         return this.V(t.L(var1), t.L(var3), t.L(var5));
      }

      public j.v V(d var1) {
         return this.V(var1.t(), var1.h(), var1.y());
      }

      public j.v q(aq var1) {
         return this.j(var1, 1);
      }

      public j.v j(aq var1, int var2) {
         return this.V(this.z + var1.v() * var2, this.h + var1.z() * var2, this.j + var1.P() * var2);
      }

      public void U(int var1) {
         this.h = var1;
      }

      public j F() {
         return new j(this);
      }
   }
}
