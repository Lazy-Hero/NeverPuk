package net.s;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.s.b;
import net.s.i;
import net.s.k;
import net.s.m;

public class x implements i {
   private final m M;
   private final b t;
   private final Map F = Maps.newHashMap();
   private final Map r = Maps.newHashMap();
   private final Map U = Maps.newHashMap();
   private double C;
   private boolean Y = true;
   private double c;

   public x(m var1, b var2) {
      this.M = var1;
      this.t = var2;
      this.C = var2.o();
      int var3 = 0;

      while(true) {
         this.F.put(Integer.valueOf(var3), Sets.newHashSet());
         ++var3;
      }
   }

   public b M() {
      return this.t;
   }

   public double J() {
      return this.C;
   }

   public void t(double var1) {
      if(var1 != this.J()) {
         this.C = var1;
         this.x();
      }

   }

   public Collection v(int var1) {
      return (Collection)this.F.get(Integer.valueOf(var1));
   }

   public Collection s() {
      HashSet var1 = Sets.newHashSet();
      int var2 = 0;

      while(true) {
         var1.addAll(this.v(var2));
         ++var2;
      }
   }

   @Nullable
   public k S(UUID var1) {
      return (k)this.U.get(var1);
   }

   public boolean U(k var1) {
      return this.U.get(var1.s()) != null;
   }

   public void g(k var1) {
      if(this.S(var1.s()) != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         Set var2 = (Set)this.r.get(var1.b());
         HashSet var3 = Sets.newHashSet();
         this.r.put(var1.b(), var3);
         ((Set)this.F.get(Integer.valueOf(var1.X()))).add(var1);
         var3.add(var1);
         this.U.put(var1.s(), var1);
         this.x();
      }
   }

   protected void x() {
      this.Y = true;
      this.M.W(this);
   }

   public void n(k var1) {
      int var2 = 0;

      while(true) {
         Set var3 = (Set)this.F.get(Integer.valueOf(var2));
         var3.remove(var1);
         ++var2;
      }
   }

   public void o(UUID var1) {
      k var2 = this.S(var1);
      this.n(var2);
   }

   public void n() {
      Collection var1 = this.s();

      for(k var3 : Lists.newArrayList(var1)) {
         this.n(var3);
      }

   }

   public double K() {
      if(this.Y) {
         this.c = this.n();
         this.Y = false;
      }

      return this.c;
   }

   private double n() {
      k.z();
      double var2 = this.J();
      Iterator var4 = this.h(0).iterator();
      if(var4.hasNext()) {
         k var5 = (k)var4.next();
         var2 += var5.e();
      }

      double var8 = var2;
      Iterator var6 = this.h(1).iterator();
      if(var6.hasNext()) {
         k var7 = (k)var6.next();
         var8 = var2 + var2 * var7.e();
      }

      var6 = this.h(2).iterator();
      if(var6.hasNext()) {
         k var10 = (k)var6.next();
         var8 *= 1.0D + var10.e();
      }

      return this.t.H(var8);
   }

   private Collection h(int var1) {
      HashSet var2 = Sets.newHashSet(this.v(var1));
      b var3 = this.t.B();

      while(true) {
         i var4 = this.M.Q(var3);
         var2.addAll(var4.v(var1));
         var3 = var3.B();
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
