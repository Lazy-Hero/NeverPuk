package net.yz;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yz.m_;

public class v extends net.yz.z {
   @Nullable
   protected net.ne.l m;
   private boolean w;

   public v(String var1, @Nullable net.ne.l var2) {
      super(var1);
      this.m = var2;
   }

   public v z() {
      this.w = true;
      return this;
   }

   public boolean c() {
      return this.w;
   }

   @Nullable
   public net.ne.l v() {
      return this.m;
   }

   public net.cb.t Z(net.ne.a var1) {
      int var2 = m_.J();
      ks var3 = this.m instanceof net.ne.a?((net.ne.a)this.m).S():ks.a;
      String var4 = "death.attack." + this.M;
      String var5 = var4 + ".item";
      return !var3.B() && var3.v() && net.yq.e.s(var5)?new net.cb.h(var5, new Object[]{var1.b(), this.m.b(), var3.b()}):new net.cb.h(var4, new Object[]{var1.b(), this.m.b()});
   }

   public boolean V() {
      return this.m != null && this.m instanceof net.ne.a && !(this.m instanceof net.r.r);
   }

   @Nullable
   public net.u.r X() {
      return new net.u.r(this.m.b, this.m.hS, this.m.hr);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
