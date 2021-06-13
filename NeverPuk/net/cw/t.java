package net.cw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.u.d;
import net.yw.w;
import net.yz.aq;

public class t {
   private final Predicate[][][] k;
   private final int n;
   private final int I;
   private final int y;

   public t(Predicate[][][] var1) {
      this.k = var1;
      this.n = var1.length;
      if(this.n > 0) {
         this.I = var1[0].length;
         if(this.I > 0) {
            this.y = var1[0][0].length;
         } else {
            this.y = 0;
         }
      } else {
         this.I = 0;
         this.y = 0;
      }

   }

   public int s() {
      return this.n;
   }

   public int R() {
      return this.I;
   }

   public int u() {
      return this.y;
   }

   @Nullable
   private t.q b(net.u.j var1, aq var2, aq var3, LoadingCache var4) {
      for(int var5 = 0; var5 < this.y; ++var5) {
         for(int var6 = 0; var6 < this.I; ++var6) {
            for(int var7 = 0; var7 < this.n; ++var7) {
               if(!this.k[var7][var6][var5].apply(var4.getUnchecked(q(var1, var2, var3, var5, var6, var7)))) {
                  return null;
               }
            }
         }
      }

      return new t.q(var1, var2, var3, var4, this.y, this.I, this.n);
   }

   @Nullable
   public t.q X(net.yv.r var1, net.u.j var2) {
      t.q.x;
      LoadingCache var4 = q(var1, false);
      int var5 = Math.max(Math.max(this.y, this.I), this.n);
      Iterator var6 = net.u.j.e(var2, var2.F(var5 - 1, var5 - 1, var5 - 1)).iterator();
      if(var6.hasNext()) {
         net.u.j var7 = (net.u.j)var6.next();
         aq[] var8 = aq.values();
         int var9 = var8.length;
         int var10 = 0;
         if(var10 < var9) {
            aq var11 = var8[var10];
            aq[] var12 = aq.values();
            int var13 = var12.length;
            int var14 = 0;
            if(var14 < var13) {
               aq var15 = var12[var14];
               if(var15 != var11 && var15 != var11.f()) {
                  t.q var16 = this.b(var7, var11, var15, var4);
                  return var16;
               }

               ++var14;
            }

            ++var10;
         }
      }

      if(d.y() == null) {
         t.q.x = new String[3];
      }

      return null;
   }

   public static LoadingCache q(net.yv.r var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new t.m(var0, var1));
   }

   protected static net.u.j q(net.u.j var0, aq var1, aq var2, int var3, int var4, int var5) {
      if(var1 != var2 && var1 != var2.f()) {
         d var6 = new d(var1.v(), var1.z(), var1.P());
         d var7 = new d(var2.v(), var2.z(), var2.P());
         d var8 = var6.o(var7);
         return var0.F(var7.t() * -var4 + var8.t() * var3 + var6.t() * var5, var7.h() * -var4 + var8.h() * var3 + var6.h() * var5, var7.y() * -var4 + var8.y() * var3 + var6.y() * var5);
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static class m extends CacheLoader {
      private final net.yv.r F;
      private final boolean a;

      public m(net.yv.r var1, boolean var2) {
         this.F = var1;
         this.a = var2;
      }

      public w d(net.u.j var1) throws Exception {
         return new w(this.F, var1, this.a);
      }
   }

   public static class q {
      private final net.u.j Q;
      private final aq v;
      private final aq L;
      private final LoadingCache m;
      private final int W;
      private final int p;
      private final int t;
      private static String[] x;

      public q(net.u.j var1, aq var2, aq var3, LoadingCache var4, int var5, int var6, int var7) {
         this.Q = var1;
         this.v = var2;
         this.L = var3;
         this.m = var4;
         this.W = var5;
         this.p = var6;
         this.t = var7;
      }

      public net.u.j W() {
         return this.Q;
      }

      public aq q() {
         return this.v;
      }

      public aq P() {
         return this.L;
      }

      public int J() {
         return this.W;
      }

      public int I() {
         return this.p;
      }

      public w v(int var1, int var2, int var3) {
         return (w)this.m.getUnchecked(t.q(this.Q, this.q(), this.P(), var1, var2, var3));
      }

      public String toString() {
         return MoreObjects.toStringHelper(this).add("up", this.L).add("forwards", this.v).add("frontTopLeft", this.Q).toString();
      }

      public static void c(String[] var0) {
         x = var0;
      }

      public static String[] Z() {
         return x;
      }

      static {
         c((String[])null);
      }
   }
}
