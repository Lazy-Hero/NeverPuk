package net.ym;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.ym.j;
import net.ym.l;
import net.ym.n;
import net.ym.s;
import net.ym.t;
import net.ym.y;
import net.yz.aq;

public class b implements j {
   protected final List d;
   protected final Map z;
   protected final boolean M;
   protected final boolean f;
   protected final net.n9.v u;
   protected final s q;
   protected final l Q;

   public b(List var1, Map var2, boolean var3, boolean var4, net.n9.v var5, s var6, l var7) {
      this.d = var1;
      this.z = var2;
      this.M = var3;
      this.f = var4;
      this.u = var5;
      this.q = var6;
      this.Q = var7;
   }

   public List h(@Nullable net.yw.n var1, @Nullable aq var2, long var3) {
      int var5 = t.V();
      return var2 == null?this.d:(List)this.z.get(var2);
   }

   public boolean a() {
      return this.M;
   }

   public boolean M() {
      return this.f;
   }

   public boolean t() {
      return false;
   }

   public net.n9.v o() {
      return this.u;
   }

   public s D() {
      return this.q;
   }

   public l q() {
      return this.Q;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class o {
      private final List A;
      private final Map q;
      private final l R;
      private final boolean s;
      private net.n9.v b;
      private final boolean E;
      private final s B;

      public o(y var1, l var2) {
         this(var1.X(), var1.U(), var1.H(), var2);
      }

      public o(net.yw.n var1, j var2, net.n9.v var3, net.u.j var4) {
         this(var2.a(), var2.M(), var2.D(), var2.q());
         t.V();
         this.b = var2.o();
         long var6 = net.u.t.a((net.u.d)var4);
         aq[] var8 = aq.values();
         int var9 = var8.length;
         int var10 = 0;
         if(var10 < var9) {
            aq var11 = var8[var10];
            this.e(var1, var2, var3, var11, var6);
            ++var10;
         }

         this.H(var1, var2, var3, var6);
      }

      private o(boolean var1, boolean var2, s var3, l var4) {
         t.V();
         this.A = Lists.newArrayList();
         this.q = Maps.newEnumMap(aq.class);
         aq[] var6 = aq.values();
         int var7 = var6.length;
         int var8 = 0;
         if(var8 < var7) {
            aq var9 = var6[var8];
            this.q.put(var9, Lists.newArrayList());
            ++var8;
         }

         this.R = var4;
         this.s = var1;
         this.E = var2;
         this.B = var3;
      }

      private void e(net.yw.n var1, j var2, net.n9.v var3, aq var4, long var5) {
         for(t var8 : var2.h(var1, var4, var5)) {
            this.T(var4, new n(var8, var3));
         }

      }

      private void H(net.yw.n var1, j var2, net.n9.v var3, long var4) {
         for(t var7 : var2.h(var1, (aq)null, var4)) {
            this.e(new n(var7, var3));
         }

      }

      public b.o T(aq var1, t var2) {
         ((List)this.q.get(var1)).add(var2);
         return this;
      }

      public b.o e(t var1) {
         this.A.add(var1);
         return this;
      }

      public b.o X(net.n9.v var1) {
         this.b = var1;
         return this;
      }

      public j F() {
         if(this.b == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new b(this.A, this.q, this.s, this.E, this.b, this.B, this.R);
         }
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }
}
