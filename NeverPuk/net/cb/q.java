package net.cb;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;
import net.xn;
import net.cb.k;
import net.cb.t;

public class q extends k {
   public static Function l = (var0) -> {
      return () -> {
         return var0;
      };
   };
   private final String u;
   private Supplier j;

   public q(String var1) {
      this.u = var1;
   }

   public String Y() {
      if(this.j == null) {
         this.j = (Supplier)l.apply(this.u);
      }

      return (String)this.j.get();
   }

   public q g() {
      k.B();
      q var2 = new q(this.u);
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
      } else if(!(var1 instanceof q)) {
         return false;
      } else {
         q var3 = (q)var1;
         return this.u.equals(var3.u) && super.equals(var1);
      }
   }

   public String toString() {
      return "KeybindComponent{keybind=\'" + this.u + '\'' + ", siblings=" + this.b + ", style=" + this.E() + '}';
   }

   public String W() {
      return this.u;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
