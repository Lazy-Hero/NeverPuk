package net.cb;

import java.util.Iterator;
import net.xn;
import net.cb.k;
import net.cb.t;
import net.u.d;

public class l extends k {
   private final String Q;

   public l(String var1) {
      this.Q = var1;
   }

   public String N() {
      return this.Q;
   }

   public String Y() {
      return this.Q;
   }

   public l n() {
      l var2 = new l(this.Q);
      var2.r(this.E().A());
      k.B();
      Iterator var3 = this.I().iterator();
      if(var3.hasNext()) {
         t var4 = (t)var3.next();
         var2.h(var4.c());
      }

      if(d.y() == null) {
         k.p(new String[2]);
      }

      return var2;
   }

   public boolean equals(Object var1) {
      String[] var2 = k.B();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof l)) {
         return false;
      } else {
         l var3 = (l)var1;
         return this.Q.equals(var3.N()) && super.equals(var1);
      }
   }

   public String toString() {
      return "TextComponent{text=\'" + this.Q + '\'' + ", siblings=" + this.b + ", style=" + this.E() + '}';
   }

   private static xn b(xn var0) {
      return var0;
   }
}
