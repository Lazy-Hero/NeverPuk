package net.yz;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yz.m_;
import net.yz.v;

public class j extends v {
   private final net.ne.l U;

   public j(String var1, net.ne.l var2, @Nullable net.ne.l var3) {
      super(var1, var2);
      this.U = var3;
   }

   @Nullable
   public net.ne.l g() {
      return this.m;
   }

   @Nullable
   public net.ne.l v() {
      return this.U;
   }

   public net.cb.t Z(net.ne.a var1) {
      int var2 = m_.g();
      net.cb.t var3 = this.U == null?this.m.b():this.U.b();
      ks var4 = this.U instanceof net.ne.a?((net.ne.a)this.U).S():ks.a;
      String var5 = "death.attack." + this.M;
      String var6 = var5 + ".item";
      return !var4.B() && var4.v() && net.yq.e.s(var6)?new net.cb.h(var6, new Object[]{var1.b(), var3, var4.b()}):new net.cb.h(var5, new Object[]{var1.b(), var3});
   }

   private static xn c(xn var0) {
      return var0;
   }
}
