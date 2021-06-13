package net.ct;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.ct.i;
import net.ct.t;
import net.ct.y;

public class j extends t {
   private final String Z;
   private final net.cb.t h;
   private List N;
   private final t a;
   private int b;

   public j(t var1, String var2, net.cb.t var3) {
      this.a = var1;
      this.Z = x(var2);
      this.h = var3;
   }

   public void G() {
      y.L(false);
      y.g();
      this.I();
      this.N = this.Z(this.h.c(), this.W() - 50);
      this.b = this.N.size() * this.e();
      this.N(M(0, this.W() / 2 - 100, this.v() / 2 + this.b / 2 + this.e(), x("gui.back")));
   }

   public void s(char var1, int var2) {
      if(var2 == 1) {
         y.f(this.a);
      }

   }

   public void J(i var1) {
      if(var1.B() == 0) {
         y.f(this.a);
      }

   }

   public void p(int var1, int var2, float var3) {
      t.j();
      this.p();
      this.m(this.Z, this.W() / 2, this.v() / 2 - this.b / 2 - this.e() * 2, 11184810);
      int var5 = this.v() / 2 - this.b / 2;
      if(this.N != null) {
         Iterator var6 = this.N.iterator();
         if(var6.hasNext()) {
            String var7 = (String)var6.next();
            this.m(var7, this.W() / 2, var5, 16777215);
            int var10000 = var5 + this.e();
            net.u.d.h(new net.u.d[5]);
         }
      }

      super.p(var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
