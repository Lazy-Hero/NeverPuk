package net;

import net.cp.w;
import net.ne.l;
import net.r.r;
import net.u.j;
import net.u.m;
import net.yy.g;
import net.yz.ad;
import net.yz.aq;
import net.yz.k;

public class bb extends w {
   private boolean U = false;
   private j R = null;
   private l h = null;

   public bb(net.nn.j var1, net.yp.v var2) {
      super(var1, var2);
   }

   public boolean w(j var1, aq var2) {
      this.U = true;
      this.R = var1;
      boolean var3 = super.w(var1, var2);
      this.U = false;
      return var3;
   }

   public boolean c(j var1, aq var2) {
      this.U = true;
      this.R = var1;
      boolean var3 = super.c(var1, var2);
      this.U = false;
      return var3;
   }

   public ad u(r var1, net.yv.r var2, k var3) {
      this.U = true;
      ad var4 = super.u(var1, var2, var3);
      this.U = false;
      return var4;
   }

   public ad e(g var1, net.cp.v var2, j var3, aq var4, net.u.r var5, k var6) {
      this.U = true;
      this.R = var3;
      ad var7 = super.e(var1, var2, var3, var4, var5, var6);
      this.U = false;
      return var7;
   }

   public ad a(r var1, l var2, k var3) {
      this.h = var2;
      return super.a(var1, var2, var3);
   }

   public ad o(r var1, l var2, m var3, k var4) {
      this.h = var2;
      return super.o(var1, var2, var3, var4);
   }

   public boolean Z() {
      return this.U;
   }

   public j T() {
      return this.R;
   }

   public l T() {
      return this.h;
   }
}
