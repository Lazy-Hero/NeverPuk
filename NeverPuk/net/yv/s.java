package net.yv;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.no.sl;
import net.yv.d;
import net.yv.oj;
import net.yv.r;

public class s implements oj {
   private final net.nx.f p;
   private final d s;

   public s(net.nx.f var1, d var2) {
      this.p = var1;
      this.s = var2;
   }

   public void t(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
   }

   public void R(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
   }

   public void u(net.ne.l var1) {
      this.s.K().F(var1);
      if(var1 instanceof net.r.h) {
         this.s.F.Q((net.r.h)var1);
      }

   }

   public void L(net.ne.l var1) {
      this.s.K().Q(var1);
      this.s.J().P(var1);
      if(var1 instanceof net.r.h) {
         this.s.F.d((net.r.h)var1);
      }

   }

   public void f(@Nullable net.r.r var1, net.yz.a var2, net.yz.p var3, double var4, double var6, double var8, float var10, float var11) {
      this.p.c().c(var1, var4, var6, var8, var10 > 1.0F?(double)(16.0F * var10):16.0D, this.s.F.L().M(), new sl(var2, var3, var4, var6, var8, var10, var11));
   }

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void b(r var1, net.u.j var2, net.yw.n var3, net.yw.n var4, int var5) {
      this.s.m().A(var2);
   }

   public void s(net.u.j var1) {
   }

   public void J(net.yz.a var1, net.u.j var2) {
   }

   public void a(net.r.r var1, int var2, net.u.j var3, int var4) {
      this.p.c().c(var1, (double)var3.t(), (double)var3.h(), (double)var3.y(), 64.0D, this.s.F.L().M(), new net.no.a(var2, var3, var4, false));
   }

   public void Y(int var1, net.u.j var2, int var3) {
      this.p.c().U(new net.no.a(var1, var2, var3, true));
   }

   public void c(int var1, net.u.j var2, int var3) {
      r.C();
      Iterator var5 = this.p.c().D().iterator();
      if(var5.hasNext()) {
         net.r.h var6 = (net.r.h)var5.next();
         if(var6 != null && var6.hl == this.s && var6.G() != var1) {
            double var7 = (double)var2.t() - var6.b;
            double var9 = (double)var2.h() - var6.hS;
            double var11 = (double)var2.y() - var6.hr;
            if(var7 * var7 + var9 * var9 + var11 * var11 < 1024.0D) {
               var6.t1.h((net.n2.k)(new net.no.l(var1, var2, var3)));
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
