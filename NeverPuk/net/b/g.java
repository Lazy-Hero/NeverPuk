package net.b;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.n;
import net.b.t;
import net.ne.y;
import net.u.e;
import net.u.j;
import net.yv.oj;
import net.yz.a;
import net.yz.p;

public class g implements oj {
   private final List I = Lists.newArrayList();

   public void b(net.yv.r var1, j var2, net.yw.n var3, net.yw.n var4, int var5) {
      String var6 = n.q();
      if(this.b(var1, var2, var3, var4)) {
         int var7 = 0;
         int var8 = this.I.size();
         if(var7 < var8) {
            n var9 = (n)this.I.get(var7);
            if(!var9.L()) {
               t var10 = var9.N();
               if(!var10.P() && var10.R() != 0) {
                  c var11 = var9.a.c();
                  double var12 = var2.s(((double)var11.H + var9.U.b) / 2.0D, ((double)var11.E + var9.U.hS) / 2.0D, ((double)var11.i + var9.U.hr) / 2.0D);
                  int var14 = (var10.R() - var10.P()) * (var10.R() - var10.P());
                  if(var12 < (double)var14) {
                     var9.v();
                  }
               }
            }

            ++var7;
         }
      }

   }

   protected boolean b(net.yv.r var1, j var2, net.yw.n var3, net.yw.n var4) {
      e var5 = var3.D(var1, var2);
      e var6 = var4.D(var1, var2);
      return var5 != var6 && !var5.equals(var6);
   }

   public void s(j var1) {
   }

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void f(@Nullable net.r.r var1, a var2, p var3, double var4, double var6, double var8, float var10, float var11) {
   }

   public void t(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
   }

   public void R(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
   }

   public void u(net.ne.l var1) {
      if(var1 instanceof y) {
         this.I.add(((y)var1).H());
      }

   }

   public void L(net.ne.l var1) {
      if(var1 instanceof y) {
         this.I.remove(((y)var1).H());
      }

   }

   public void J(a var1, j var2) {
   }

   public void Y(int var1, j var2, int var3) {
   }

   public void a(net.r.r var1, int var2, j var3, int var4) {
   }

   public void c(int var1, j var2, int var3) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}
