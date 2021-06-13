package net.n0;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.x;

public class n extends x {
   public ks m() {
      return net.n_.y.b(super.m(), net.nb.w.D);
   }

   public net.n1.o B(net.yv.r var1, ks var2, net.ne.a var3) {
      net.n1.b var4 = new net.n1.b(var1, var3);
      var4.b(var2);
      return var4;
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      int[] var3 = kw.b();
      if(this.a(var1)) {
         Iterator var4 = net.n_.b.b.iterator();
         if(var4.hasNext()) {
            net.n_.b var5 = (net.n_.b)var4.next();
            if(!var5.s().isEmpty()) {
               var2.add(net.n_.y.b(new ks(this), var5));
            }
         }
      }

   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      net.n_.y.j(var1, var3, 0.125F);
   }

   public String m(ks var1) {
      return net.yq.e.E(net.n_.y.h(var1).o("tipped_arrow.effect."));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
