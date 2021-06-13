package net.yw;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net._4;
import net.dj;
import net.i6;
import net.xn;
import net.u.d;
import net.u.j;
import net.u.m;
import net.u.u;
import net.y1.v;
import net.yr.h;
import net.yv.o8;
import net.yv.r;
import net.yw.g;
import net.yw.l;
import net.yw.n;
import net.yz.a5;
import net.yz.aq;
import net.yz.ax;
import net.yz.ay;

public class q {
   private static final Pattern l = Pattern.compile("^[a-z0-9_]+$");
   private static final Function g = new Function() {
      @Nullable
      public String a(@Nullable h var1) {
         String var2 = q.j;
         return var1 == null?"<NULL>":var1.l();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final net.y9.l r;
   private final ImmutableSortedMap m;
   private final ImmutableList B;
   private static String j;

   public q(net.y9.l var1, h... var2) {
      this(var1, var2, (ImmutableMap)null);
   }

   protected q.a K(net.y9.l var1, ImmutableMap var2, @Nullable ImmutableMap var3) {
      return new q.a(var1, var2);
   }

   protected q(net.y9.l var1, h[] var2, ImmutableMap var3) {
      Q();
      super();
      this.r = var1;
      HashMap var5 = Maps.newHashMap();
      int var7 = var2.length;
      int var8 = 0;
      if(var8 < var7) {
         h var9 = var2[var8];
         E(var1, var9);
         var5.put(var9.l(), var9);
         ++var8;
         d.h(new d[4]);
      }

      this.m = ImmutableSortedMap.copyOf(var5);
      LinkedHashMap var6 = Maps.newLinkedHashMap();
      ArrayList var12 = Lists.newArrayList();
      Iterator var14 = u.T(this.k()).iterator();
      if(var14.hasNext()) {
         List var16 = (List)var14.next();
         Map var10 = ay.r(this.m.values(), var16);
         q.a var11 = this.K(var1, ImmutableMap.copyOf(var10), var3);
         var6.put(var10, var11);
         var12.add(var11);
      }

      var14 = var12.iterator();
      if(var14.hasNext()) {
         q.a var17 = (q.a)var14.next();
         var17.C(var6);
      }

      this.B = ImmutableList.copyOf(var12);
   }

   public static String E(net.y9.l var0, h var1) {
      String var2 = var1.l();
      if(!l.matcher(var2).matches()) {
         throw new IllegalArgumentException("Block: " + var0.getClass() + " has invalidly named property: " + var2);
      } else {
         for(Comparable var4 : var1.Z()) {
            String var5 = var1.p(var4);
            if(!l.matcher(var5).matches()) {
               throw new IllegalArgumentException("Block: " + var0.getClass() + " has property: " + var2 + " with invalidly named value: " + var5);
            }
         }

         return var2;
      }
   }

   public ImmutableList v() {
      return this.B;
   }

   private List k() {
      ArrayList var1 = Lists.newArrayList();
      ImmutableCollection var2 = this.m.values();
      UnmodifiableIterator var3 = var2.iterator();

      while(var3.hasNext()) {
         h var4 = (h)var3.next();
         var1.add(var4.Z());
      }

      return var1;
   }

   public n T() {
      return (n)this.B.get(0);
   }

   public net.y9.l b() {
      return this.r;
   }

   public Collection R() {
      return this.m.values();
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("block", net.y9.l.m.t(this.r)).add("properties", Iterables.transform(this.m.values(), g)).toString();
   }

   @Nullable
   public h D(String var1) {
      return (h)this.m.get(var1);
   }

   static {
      c("mVdOFb");
   }

   public static void c(String var0) {
      j = var0;
   }

   public static String Q() {
      return j;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static class a extends l {
      private final net.y9.l w;
      private final ImmutableMap f;
      private ImmutableTable e;

      private a(net.y9.l var1, ImmutableMap var2) {
         this.w = var1;
         this.f = var2;
      }

      protected a(net.y9.l var1, ImmutableMap var2, ImmutableTable var3) {
         this.w = var1;
         this.f = var2;
         this.e = var3;
      }

      public Collection c() {
         return Collections.unmodifiableCollection(this.f.keySet());
      }

      public Comparable i(h var1) {
         Comparable var2 = (Comparable)this.f.get(var1);
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.w.j());
      }

      public n s(h var1, Comparable var2) {
         q.j;
         Comparable var4 = (Comparable)this.f.get(var1);
         if(var4 == null) {
            throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.w.j());
         } else if(var4 == var2) {
            return this;
         } else {
            n var5 = (n)this.e.get(var1, var2);
            if(var5 == null) {
               throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on block " + net.y9.l.m.t(this.w) + ", it is not an allowed value");
            } else {
               return var5;
            }
         }
      }

      public ImmutableMap A() {
         return this.f;
      }

      public net.y9.l Q() {
         return this.w;
      }

      public boolean equals(Object var1) {
         return this == var1;
      }

      public int hashCode() {
         return this.f.hashCode();
      }

      public void C(Map var1) {
         if(this.e != null) {
            throw new IllegalStateException();
         } else {
            HashBasedTable var2 = HashBasedTable.create();
            UnmodifiableIterator var3 = this.f.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               h var5 = (h)var4.getKey();

               for(Comparable var7 : var5.Z()) {
                  if(var7 != var4.getValue()) {
                     var2.put(var5, var7, var1.get(this.O(var5, var7)));
                  }
               }
            }

            this.e = ImmutableTable.copyOf(var2);
         }
      }

      private Map O(h var1, Comparable var2) {
         HashMap var3 = Maps.newHashMap(this.f);
         var3.put(var1, var2);
         return var3;
      }

      public net.y1.l n() {
         return this.w.H(this);
      }

      public boolean E() {
         return this.w.c(this);
      }

      public boolean p(net.ne.l var1) {
         return this.w.H(this, var1);
      }

      public int K() {
         return this.w.a((n)this);
      }

      public int f() {
         return this.w.S(this);
      }

      public boolean f() {
         return this.w.m((n)this);
      }

      public boolean A() {
         return this.w.K(this);
      }

      public net.y1.h c(o8 var1, j var2) {
         return this.w.t(this, var1, var2);
      }

      public n b(net.yz.l var1) {
         return this.w.G(this, var1);
      }

      public n f(ax var1) {
         return this.w.P(this, var1);
      }

      public boolean O() {
         return this.w.k(this);
      }

      public boolean v() {
         return this.w.j(this);
      }

      public a5 C() {
         return this.w.o((n)this);
      }

      public int T(o8 var1, j var2) {
         return this.w.w((n)this, (o8)var1, (j)var2);
      }

      public float p() {
         return this.w.M(this);
      }

      public boolean w() {
         return this.w.y(this);
      }

      public boolean i() {
         return this.w.i((n)this);
      }

      public boolean o() {
         return this.w.s(this);
      }

      public int M(o8 var1, j var2, aq var3) {
         return this.w.L(this, var1, var2, var3);
      }

      public boolean x() {
         return this.w.t(this);
      }

      public int f(r var1, j var2) {
         return this.w.c(this, var1, var2);
      }

      public float s(r var1, j var2) {
         return this.w.j(this, var1, var2);
      }

      public float Y(net.r.r var1, r var2, j var3) {
         return this.w.C(this, var1, var2, var3);
      }

      public int y(o8 var1, j var2, aq var3) {
         return this.w.n(this, var1, var2, var3);
      }

      public v b() {
         return this.w.T((n)this);
      }

      public n J(o8 var1, j var2) {
         return this.w.v(this, var1, var2);
      }

      public net.u.e u(r var1, j var2) {
         return this.w.d(this, var1, var2);
      }

      public boolean F(o8 var1, j var2, aq var3) {
         return this.w.v(this, var1, var2, var3);
      }

      public boolean j() {
         return this.w.V(this);
      }

      @Nullable
      public net.u.e D(o8 var1, j var2) {
         return this.w.B(this, var1, var2);
      }

      public void T(r var1, j var2, net.u.e var3, List var4, @Nullable net.ne.l var5, boolean var6) {
         this.w.S(this, var1, var2, var3, var4, var5, var6);
      }

      public net.u.e q(o8 var1, j var2) {
         net.y9.l var3 = this.w.V();
         if(var3 != net.y9.l.NONE && !(this.w instanceof net.y9.n)) {
            net.u.e var4 = this.w.k(this, var1, var2);
            var4 = dj.W(var4, var3, var2);
            return var4;
         } else {
            return this.w.k(this, var1, var2);
         }
      }

      public m z(r var1, j var2, net.u.r var3, net.u.r var4) {
         return this.w.o((n)this, (r)var1, (j)var2, (net.u.r)var3, (net.u.r)var4);
      }

      public boolean z() {
         return this.w.L(this);
      }

      public net.u.r F(o8 var1, j var2) {
         return this.w.a(this, var1, var2);
      }

      public boolean G(r var1, j var2, int var3, int var4) {
         return this.w.T(this, var1, var2, var3, var4);
      }

      public void q(r var1, j var2, net.y9.l var3, j var4) {
         this.w.Z(this, var1, var2, var3, var4);
      }

      public boolean b() {
         return this.w.e(this);
      }

      public ImmutableTable R() {
         return this.e;
      }

      public int f(o8 var1, j var2) {
         return i6.B(this.w, i6.MT, new Object[]{this, var1, var2});
      }

      public int b(o8 var1, j var2) {
         return i6.B(this.w, i6.Mx, new Object[]{this, var1, var2});
      }

      public boolean I(o8 var1, j var2, aq var3) {
         return i6.I(this.w, i6.By, new Object[]{this, var1, var2, var3});
      }

      public boolean j(o8 var1, j var2, aq var3) {
         return i6.I(this.w, i6.CX, new Object[]{this, var1, var2, var3});
      }

      public g B(o8 var1, j var2, aq var3) {
         return this.w.U(var1, this, var2, var3);
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }
   }

   public static class x {
      private final net.y9.l c;
      private final List G = Lists.newArrayList();
      private final List V = Lists.newArrayList();

      public x(net.y9.l var1) {
         this.c = var1;
      }

      public q.x S(h... var1) {
         for(h var5 : var1) {
            this.G.add(var5);
         }

         return this;
      }

      public q.x b(_4... var1) {
         q.j;
         int var4 = var1.length;
         int var5 = 0;
         if(var5 < var4) {
            _4 var6 = var1[var5];
            this.V.add(var6);
            ++var5;
         }

         return this;
      }

      public q X() {
         h[] var2 = new h[this.G.size()];
         q.j;
         var2 = (h[])this.G.toArray(var2);
         if(this.V.size() == 0) {
            return new q(this.c, var2);
         } else {
            _4[] var3 = new _4[this.V.size()];
            var3 = (_4[])this.V.toArray(var3);
            q var10000 = (q)i6.K(i6.ua, new Object[]{this.c, var2, var3});
            if(d.y() == null) {
               q.j = "eQNhwb";
            }

            return var10000;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
