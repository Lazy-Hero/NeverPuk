package net.n0;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kt;
import net.n0.kw;
import net.n0.y;

public class yp extends y {
   public boolean F(ks var1) {
      return true;
   }

   public boolean x(ks var1) {
      return false;
   }

   public kt B(ks var1) {
      return p(var1).N()?super.B(var1):kt.UNCOMMON;
   }

   public static net.nj.h p(ks var0) {
      net.nj.f var1 = var0.o();
      return var1.A("StoredEnchantments", 10);
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      super.h(var1, var2, var3, var4);
      net.nj.h var5 = p(var1);

      for(int var6 = 0; var6 < var5.z(); ++var6) {
         net.nj.f var7 = var5.i(var6);
         short var8 = var7.E("id");
         net.c1.c var9 = net.c1.c.R(var8);
         var3.add(var9.q(var7.E("lvl")));
      }

   }

   public static void n(ks var0, net.c1.x var1) {
      net.nj.h var2 = p(var0);
      boolean var3 = true;

      for(int var4 = 0; var4 < var2.z(); ++var4) {
         net.nj.f var5 = var2.i(var4);
         if(net.c1.c.R(var5.E("id")) == var1.r) {
            if(var5.E("lvl") < var1.o) {
               var5.h("lvl", (short)var1.o);
            }

            var3 = false;
            break;
         }
      }

      net.nj.f var7 = new net.nj.f();
      var7.h("id", (short)net.c1.c.g(var1.r));
      var7.h("lvl", (short)var1.o);
      var2.m(var7);
      if(!var0.D()) {
         var0.t(new net.nj.f());
      }

      var0.o().K("StoredEnchantments", var2);
   }

   public static ks j(net.c1.x var0) {
      ks var1 = new ks(net.nb.j.r);
      n(var1, var0);
      return var1;
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      int[] var3 = kw.b();
      if(var1 == net.ys.r.B) {
         Iterator var4 = net.c1.c.i.iterator();
         if(var4.hasNext()) {
            net.c1.c var5 = (net.c1.c)var4.next();
            if(var5.a != null) {
               int var6 = var5.m();
               if(var6 <= var5.h()) {
                  var2.add(j(new net.c1.x(var5, var6)));
                  ++var6;
               }
            }
         }
      }

      if(var1.H().length != 0) {
         Iterator var7 = net.c1.c.i.iterator();
         if(var7.hasNext()) {
            net.c1.c var8 = (net.c1.c)var7.next();
            if(var1.X(var8.a)) {
               var2.add(j(new net.c1.x(var8, var8.h())));
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
