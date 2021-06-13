package net.n1;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.c0.d;
import net.n1.m;
import net.n1.o;
import net.n_.i;
import net.yv.r;
import net.yz.ai;

public class f extends m {
   public f(r var1) {
      super(var1);
      this.S(1.0F, 1.0F);
   }

   public f(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.S(1.0F, 1.0F);
   }

   public f(r var1, net.ne.a var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.S(1.0F, 1.0F);
   }

   public static void Q(d var0) {
      m.p(var0, "DragonFireball");
   }

   protected void t(net.u.m var1) {
      String var2 = o.s.H();
      if((var1.e == null || !var1.e.Z(this.U0)) && !this.hl.x) {
         List var3 = this.hl.p(net.ne.a.class, this.i().f(4.0D, 2.0D, 4.0D));
         net.ne.w var4 = new net.ne.w(this.hl, this.b, this.hS, this.hr);
         var4.L(this.U0);
         var4.Q(ai.DRAGON_BREATH);
         var4.h(3.0F);
         var4.I(600);
         var4.C((7.0F - var4.J()) / (float)var4.c());
         var4.Y(new i(net.nb.b.W, 1, 1));
         if(!var3.isEmpty()) {
            Iterator var5 = var3.iterator();
            if(var5.hasNext()) {
               net.ne.a var6 = (net.ne.a)var5.next();
               double var7 = this.F(var6);
               if(Double.compare(var7, 16.0D) < 0) {
                  var4.t(var6.b, var6.hS, var6.hr);
               }
            }
         }

         this.hl.s(2006, new net.u.j(this.b, this.hS, this.hr), 0);
         this.hl.S(var4);
         this.B();
      }

   }

   public boolean w() {
      return false;
   }

   public boolean H(net.yz.z var1, float var2) {
      return false;
   }

   protected ai q() {
      return ai.DRAGON_BREATH;
   }

   protected boolean E() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
