package net.cb;

import net.xn;
import net.cb.k;
import net.cb.t;
import net.nc.b;
import net.yz.a7;

public class g extends k {
   private final String f;
   private final String N;
   private String i = "";

   public g(String var1, String var2) {
      this.f = var1;
      this.N = var2;
   }

   public String P() {
      return this.f;
   }

   public String S() {
      return this.N;
   }

   public void s(String var1) {
      this.i = var1;
   }

   public String Y() {
      return this.i;
   }

   public void P(net.nv.f var1) {
      k.B();
      net.nx.f var3 = var1.E();
      if(var3 != null && var3.Z() && a7.Y(this.i)) {
         b var4 = var3.n(0).J();
         net.nc.l var5 = var4.e(this.N);
         if(var4.M(this.f, var5)) {
            net.nc.o var6 = var4.p(this.f, var5);
            this.s(String.format("%d", new Object[]{Integer.valueOf(var6.W())}));
         }

         this.i = "";
      }

   }

   public g x() {
      g var1 = new g(this.f, this.N);
      var1.s(this.i);
      var1.r(this.E().A());

      for(t var3 : this.I()) {
         var1.h(var3.c());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof g)) {
         return false;
      } else {
         g var2 = (g)var1;
         return this.f.equals(var2.f) && this.N.equals(var2.N) && super.equals(var1);
      }
   }

   public String toString() {
      return "ScoreComponent{name=\'" + this.f + '\'' + "objective=\'" + this.N + '\'' + ", siblings=" + this.b + ", style=" + this.E() + '}';
   }

   private static xn b(xn var0) {
      return var0;
   }
}
