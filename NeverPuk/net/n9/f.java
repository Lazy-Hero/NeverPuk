package net.n9;

import net._8;
import net.gh;
import net.xn;
import net.n9.e;
import net.n9.t;
import net.n9.y;
import net.y.d;

public abstract class f implements t {
   protected int n = -1;
   protected boolean K;
   protected boolean b;
   protected boolean y;
   protected boolean I;
   public _8 J;

   public void c(boolean var1, boolean var2) {
      e.d();
      this.K = var1;
      this.b = var2;
      if(var1) {
         boolean var4 = var2?true:true;
         boolean var5 = true;
      }

      int var6 = var2?9986:9728;
      short var7 = 9728;
      d.z(this.L());
      d.t(3553, 10241, var6);
      d.t(3553, 10240, var7);
   }

   public void s(boolean var1, boolean var2) {
      this.y = this.K;
      this.I = this.b;
      this.c(var1, var2);
   }

   public void f() {
      this.c(this.y, this.I);
   }

   public int L() {
      if(this.n == -1) {
         this.n = y.v();
      }

      return this.n;
   }

   public void P() {
      gh.y(this, this.n);
      if(this.n != -1) {
         y.R(this.n);
         this.n = -1;
      }

   }

   public _8 t() {
      return gh.i(this);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
