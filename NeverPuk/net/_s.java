package net;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net._t;
import net.mf;
import net.xn;
import net.z9;
import net.ne.a;
import net.y.d;
import net.y0.ct;
import net.yy.f;

public class _s implements net.ye.wr {
   private ct f = null;

   public _s(ct var1) {
      this.f = var1;
   }

   public void t(a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.Z(var1, var8, var4);
   }

   protected void Z(a var1, float var2, float var3) {
      if(z9.S9() && var1 instanceof f) {
         f var4 = (f)var1;
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         d.g();
         d.a();
         net.y6.f var5 = this.f.w();
         _t.e(var5, var4, var2, var3);
         d.j();
      }

   }

   public boolean y() {
      return false;
   }

   public static void K(Map var0) {
      mf.O();
      Set var2 = var0.keySet();
      boolean var3 = false;
      Iterator var4 = var2.iterator();
      if(var4.hasNext()) {
         Object var5 = var4.next();
         Object var6 = var0.get(var5);
         if(var6 instanceof ct) {
            ct var7 = (ct)var6;
            var7.k(new _s(var7));
            var3 = true;
         }
      }

      z9.h("PlayerItemsLayer not registered");
   }

   private static xn a(xn var0) {
      return var0;
   }
}
