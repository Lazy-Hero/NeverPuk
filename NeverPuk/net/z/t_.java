package net.z;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.z.g;
import net.z.r;

public class t_ extends g {
   protected int E = 200;
   protected int H = 20;
   public int F;
   public int u;
   private final List g;
   public int U;
   private boolean D;
   public boolean T = true;
   private final boolean Y;
   private final int h;
   private final int P;
   private final int o;
   private final int A;
   private final r R;
   private final int O;

   public t_(r var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.R = var1;
      this.U = var2;
      this.F = var3;
      this.u = var4;
      this.E = var5;
      this.H = var6;
      this.g = Lists.newArrayList();
      this.D = false;
      this.Y = false;
      this.h = var7;
      this.P = -1;
      this.o = -1;
      this.A = -1;
      this.O = 0;
   }

   public void U(String var1) {
      this.g.add(net.c9.b.x(var1, new Object[0]));
   }

   public t_ B() {
      this.D = true;
      return this;
   }

   public void r(net.nn.j var1, int var2, int var3) {
      boolean var4 = g.C();
      if(this.T) {
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         this.A(var1, var2, var3);
         int var5 = this.u + this.H / 2 + this.O / 2;
         int var6 = var5 - this.g.size() * 10 / 2;
         int var7 = 0;
         if(var7 < this.g.size()) {
            if(this.D) {
               this.d(this.R, (String)this.g.get(var7), this.F + this.E / 2, var6 + var7 * 10, this.h);
            }

            this.n(this.R, (String)this.g.get(var7), this.F, var6 + var7 * 10, this.h);
            ++var7;
         }
      }

   }

   protected void A(net.nn.j var1, int var2, int var3) {
      if(this.Y) {
         int var4 = this.E + this.O * 2;
         int var5 = this.H + this.O * 2;
         int var6 = this.F - this.O;
         int var7 = this.u - this.O;
         u(var6, var7, var6 + var4, var7 + var5, this.P);
         this.Y(var6, var6 + var4, var7, this.o);
         this.Y(var6, var6 + var4, var7 + var5, this.A);
         this.z(var6, var7, var7 + var5, this.o);
         this.z(var6 + var4, var7, var7 + var5, this.A);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
