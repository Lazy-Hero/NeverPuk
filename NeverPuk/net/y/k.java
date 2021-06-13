package net.y;

import net.y.c;
import net.y.e;
import net.y.o;
import net.y.p;
import net.y.r;
import net.y.w;
import net.yv.o8;
import net.yz.a5;

public class k implements net.c9.v {
   private final o A;
   private final w b;
   private final c p = new c();
   private final e g;

   public k(o var1, net.yo.j var2) {
      this.A = var1;
      this.b = new w(var2);
      this.g = new e(var2);
   }

   public o a() {
      return this.A;
   }

   public void f(net.yw.n var1, net.u.j var2, net.n9.v var3, o8 var4) {
      String var5 = p.S();
      if(var1.C() == a5.MODEL) {
         var1 = var1.J(var4, var2);
         net.ym.j var6 = this.A.Z(var1);
         net.ym.j var7 = (new net.ym.b(var1, var6, var3, var2)).F();
         this.b.x(var4, var7, var1, var2, r.f().k(), true);
      }

   }

   public boolean K(net.yw.n var1, net.u.j var2, o8 var3, p var4) {
      String var5 = p.S();
      a5 var6 = var1.C();
      if(var6 == a5.INVISIBLE) {
         return false;
      } else {
         if(var3.t() != net.yv.j.J) {
            var1 = var1.J(var3, var2);
         }

         switch(null.u[var6.ordinal()]) {
         case 1:
            return this.b.x(var3, this.Z(var1), var1, var2, var4, true);
         case 2:
            return false;
         case 3:
            return this.g.q(var3, var1, var2, var4);
         default:
            return false;
         }
      }
   }

   public w j() {
      return this.b;
   }

   public net.ym.j Z(net.yw.n var1) {
      return this.A.Z(var1);
   }

   public void M(net.yw.n var1, float var2) {
      p.S();
      a5 var4 = var1.C();
      if(var4 != a5.INVISIBLE) {
         switch(null.u[var4.ordinal()]) {
         case 1:
            net.ym.j var5 = this.Z(var1);
            this.b.d(var5, var1, var2, true);
         case 2:
            this.p.h(var1.Q(), var2);
         case 3:
         }
      }

   }

   public void s(net.c9.p var1) {
      this.g.s();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
