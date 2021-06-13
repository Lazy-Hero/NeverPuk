package net.cb;

import java.util.Iterator;
import net.xn;
import net.cb.k;
import net.cb.t;

public class p extends k {
   private final String T;

   public p(String var1) {
      this.T = var1;
   }

   public String o() {
      return this.T;
   }

   public String Y() {
      return this.T;
   }

   public p M() {
      p var2 = new p(this.T);
      k.B();
      var2.r(this.E().A());
      Iterator var3 = this.I().iterator();
      if(var3.hasNext()) {
         t var4 = (t)var3.next();
         var2.h(var4.c());
      }

      return var2;
   }

   public boolean equals(Object var1) {
      String[] var2 = k.B();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof p)) {
         return false;
      } else {
         p var3 = (p)var1;
         return this.T.equals(var3.T) && super.equals(var1);
      }
   }

   public String toString() {
      return "SelectorComponent{pattern=\'" + this.T + '\'' + ", siblings=" + this.b + ", style=" + this.E() + '}';
   }

   private static xn b(xn var0) {
      return var0;
   }
}
