package net.cb;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.cb.f;
import net.cb.k;
import net.cb.l;
import net.cb.o;
import net.cb.t;
import net.u.d;
import net.yq.e;

public class h extends k {
   private final String S;
   private final Object[] I;
   private final Object q = new Object();
   private long C = -1L;
   @VisibleForTesting
   List W = Lists.newArrayList();
   public static final Pattern u = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public h(String var1, Object... var2) {
      this.S = var1;
      this.I = var2;

      for(Object var6 : var2) {
         if(var6 instanceof t) {
            ((t)var6).E().S(this.E());
         }
      }

   }

   @VisibleForTesting
   synchronized void R() {
      Object var1 = this.q;
      long var2 = e.C();
      if(var2 != this.C) {
         this.C = var2;
         this.W.clear();
         this.d(e.E(this.S));
      }
   }

   protected void d(String var1) {
      k.B();
      boolean var10001 = false;
      Matcher var4 = u.matcher(var1);
      int var5 = 0;
      int var6 = 0;
      if(var4.find(var6)) {
         int var8 = var4.start();
         int var7 = var4.end();
         if(var8 > var6) {
            l var9 = new l(String.format(var1.substring(var6, var8), new Object[0]));
            var9.E().S(this.E());
            this.W.add(var9);
         }

         String var15 = var4.group(2);
         String var10 = var1.substring(var8, var7);
         if("%".equals(var15) && "%%".equals(var10)) {
            l var11 = new l("%");
            var11.E().S(this.E());
            this.W.add(var11);
            d.h(new d[3]);
         }

         if(!"s".equals(var15)) {
            throw new o(this, "Unsupported format: \'" + var10 + "\'");
         }

         String var16 = var4.group(1);
         int var12 = var16 != null?Integer.parseInt(var16) - 1:var5++;
         if(var12 < this.I.length) {
            this.W.add(this.g(var12));
         }

         var6 = var7;
      }

      if(var6 < var1.length()) {
         l var14 = new l(String.format(var1.substring(var6), new Object[0]));
         var14.E().S(this.E());
         this.W.add(var14);
      }

   }

   private t g(int var1) {
      if(var1 >= this.I.length) {
         throw new o(this, var1);
      } else {
         Object var2 = this.I[var1];
         Object var3;
         if(var2 instanceof t) {
            var3 = (t)var2;
         } else {
            var3 = new l("null");
            ((t)var3).E().S(this.E());
         }

         return (t)var3;
      }
   }

   public t r(f var1) {
      super.r(var1);

      for(Object var5 : this.I) {
         if(var5 instanceof t) {
            ((t)var5).E().S(this.E());
         }
      }

      if(this.C > -1L) {
         for(t var7 : this.W) {
            var7.E().S(var1);
         }
      }

      return this;
   }

   public Iterator iterator() {
      this.R();
      return Iterators.concat(e(this.W), e(this.b));
   }

   public String Y() {
      this.R();
      StringBuilder var1 = new StringBuilder();

      for(t var3 : this.W) {
         var1.append(var3.Y());
      }

      return var1.toString();
   }

   public h V() {
      Object[] var1 = new Object[this.I.length];

      for(int var2 = 0; var2 < this.I.length; ++var2) {
         if(this.I[var2] instanceof t) {
            var1[var2] = ((t)this.I[var2]).c();
         } else {
            var1[var2] = this.I[var2];
         }
      }

      h var5 = new h(this.S, var1);
      var5.r(this.E().A());

      for(t var4 : this.I()) {
         var5.h(var4.c());
      }

      return var5;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof h)) {
         return false;
      } else {
         h var2 = (h)var1;
         return Arrays.equals(this.I, var2.I) && this.S.equals(var2.S) && super.equals(var1);
      }
   }

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.S.hashCode();
      var1 = 31 * var1 + Arrays.hashCode(this.I);
      return var1;
   }

   public String toString() {
      return "TranslatableComponent{key=\'" + this.S + '\'' + ", args=" + Arrays.toString(this.I) + ", siblings=" + this.b + ", style=" + this.E() + '}';
   }

   public String X() {
      return this.S;
   }

   public Object[] S() {
      return this.I;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
