package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.n0.kd;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.a7;
import net.yz.ad;
import net.yz.am;

public class k5 extends y {
   public k5() {
      this.F(1);
   }

   public static boolean e(net.nj.f var0) {
      if(!kd.e(var0)) {
         return false;
      } else if(!var0.K("title", 8)) {
         return false;
      } else {
         String var1 = var0.J("title");
         return var1.length() <= 32 && var0.K("author", 8);
      }
   }

   public static int j(ks var0) {
      return var0.o().P("generation");
   }

   public String m(ks var1) {
      if(var1.D()) {
         net.nj.f var2 = var1.o();
         String var3 = var2.J("title");
         if(!a7.Y(var3)) {
            return var3;
         }
      }

      return super.m(var1);
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      if(var1.D()) {
         net.nj.f var5 = var1.o();
         String var6 = var5.J("author");
         if(!a7.Y(var6)) {
            var3.add(net.cb.z.GRAY + net.yq.e.x("book.byAuthor", new Object[]{var6}));
         }

         var3.add(net.cb.z.GRAY + net.yq.e.E("book.generation." + var5.P("generation")));
      }

   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      if(!var1.x) {
         this.a(var4, var2);
      }

      var2.Q(var4, var3);
      var2.S(net.v.q.H(this));
      return new am(ad.SUCCESS, var4);
   }

   private void a(ks var1, net.r.r var2) {
      int[] var3 = kw.b();
      if(var1.o() != null) {
         net.nj.f var4 = var1.o();
         if(!var4.i("resolved")) {
            var4.c("resolved", true);
            if(e(var4)) {
               net.nj.h var5 = var4.A("pages", 8);
               int var6 = 0;
               if(var6 < var5.z()) {
                  String var7 = var5.w(var6);
                  net.cb.t var8 = net.cb.t.h(var7);
                  var8 = net.cb.y.x(var2, var8, var2);
                  var5.S(var6, new net.nj.y(net.cb.t.m(var8)));
                  ++var6;
               }

               var4.K("pages", var5);
               if(var2 instanceof net.r.h && var2.S() == var1) {
                  net.nl.o var11 = var2.aG.m(var2.a8, var2.a8.r);
                  ((net.r.h)var2).t1.h((net.n2.k)(new net.no.r(0, var11.d, var1)));
               }
            }
         }
      }

   }

   public boolean F(ks var1) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
