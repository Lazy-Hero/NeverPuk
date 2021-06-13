package net.nc;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.xn;
import net.n2.k;
import net.nc.b;
import net.nc.l;
import net.nc.m;
import net.nc.o;
import net.nc.y;
import net.no.i7;
import net.no.ik;
import net.no.s4;
import net.no.st;

public class n extends b {
   private final net.nx.f z;
   private final Set l = Sets.newHashSet();
   private Runnable[] F = new Runnable[0];

   public n(net.nx.f var1) {
      this.z = var1;
   }

   public void N(o var1) {
      super.N(var1);
      if(this.l.contains(var1.M())) {
         this.z.c().U(new st(var1));
      }

      this.x();
   }

   public void T(String var1) {
      super.T(var1);
      this.z.c().U(new st(var1));
      this.x();
   }

   public void F(String var1, l var2) {
      super.F(var1, var2);
      this.z.c().U(new st(var1, var2));
      this.x();
   }

   public void W(int var1, l var2) {
      l var3 = this.S(var1);
      super.W(var1, var2);
      if(var3 != var2) {
         if(this.i(var3) > 0) {
            this.z.c().U(new s4(var1, var2));
         } else {
            this.o(var3);
         }
      }

      if(this.l.contains(var2)) {
         this.z.c().U(new s4(var1, var2));
      } else {
         this.W(var2);
      }

      this.x();
   }

   public boolean A(String var1, String var2) {
      if(super.A(var1, var2)) {
         y var3 = this.R(var2);
         this.z.c().U(new ik(var3, Arrays.asList(new String[]{var1}), 3));
         this.x();
         return true;
      } else {
         return false;
      }
   }

   public void A(String var1, y var2) {
      super.A(var1, var2);
      this.z.c().U(new ik(var2, Arrays.asList(new String[]{var1}), 4));
      this.x();
   }

   public void F(l var1) {
      super.F(var1);
      this.x();
   }

   public void t(l var1) {
      super.t(var1);
      if(this.l.contains(var1)) {
         this.z.c().U(new i7(var1, 2));
      }

      this.x();
   }

   public void g(l var1) {
      super.g(var1);
      if(this.l.contains(var1)) {
         this.o(var1);
      }

      this.x();
   }

   public void M(y var1) {
      super.M(var1);
      this.z.c().U(new ik(var1, 0));
      this.x();
   }

   public void s(y var1) {
      super.s(var1);
      this.z.c().U(new ik(var1, 2));
      this.x();
   }

   public void b(y var1) {
      super.b(var1);
      this.z.c().U(new ik(var1, 1));
      this.x();
   }

   public void r(Runnable var1) {
      this.F = (Runnable[])Arrays.copyOf(this.F, this.F.length + 1);
      this.F[this.F.length - 1] = var1;
   }

   protected void x() {
      for(Runnable var4 : this.F) {
         var4.run();
      }

   }

   public List Z(l var1) {
      ArrayList var3 = Lists.newArrayList();
      m.I();
      var3.add(new i7(var1, 0));
      int var4 = 0;
      if(this.S(var4) == var1) {
         var3.add(new s4(var4, var1));
      }

      ++var4;
      Iterator var7 = this.d(var1).iterator();
      if(var7.hasNext()) {
         o var5 = (o)var7.next();
         var3.add(new st(var5));
      }

      return var3;
   }

   public void W(l var1) {
      List var2 = this.Z(var1);

      for(net.r.h var4 : this.z.c().D()) {
         for(k var6 : var2) {
            var4.t1.h(var6);
         }
      }

      this.l.add(var1);
   }

   public List j(l var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(new i7(var1, 1));
      int var3 = 0;

      while(true) {
         if(this.S(var3) == var1) {
            var2.add(new s4(var3, var1));
         }

         ++var3;
      }
   }

   public void o(l var1) {
      List var2 = this.j(var1);

      for(net.r.h var4 : this.z.c().D()) {
         for(k var6 : var2) {
            var4.t1.h(var6);
         }
      }

      this.l.remove(var1);
   }

   public int i(l param1) {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
