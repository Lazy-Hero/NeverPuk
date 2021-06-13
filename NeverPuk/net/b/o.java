package net.b;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.m;
import net.b.n;
import net.b.r;
import net.ne.y;
import net.u.j;
import net.yv.o8;
import net.yz.aq;

public class o extends r {
   public c H() {
      return this.v(net.u.t.L(this.e.i().n), net.u.t.L(this.e.i().u + 0.5D), net.u.t.L(this.e.i().N));
   }

   public c E(double var1, double var3, double var5) {
      return this.v(net.u.t.L(var1 - (double)(this.e.h9 / 2.0F)), net.u.t.L(var3 + 0.5D), net.u.t.L(var5 - (double)(this.e.h9 / 2.0F)));
   }

   public int z(c[] var1, c var2, c var3, float var4) {
      int var5 = 0;

      for(aq var9 : aq.values()) {
         c var10 = this.j(var2.H + var9.v(), var2.E + var9.z(), var2.i + var9.P());
         if(!var10.e && var10.a(var3) < var4) {
            var1[var5++] = var10;
         }
      }

      return var5;
   }

   public m V(o8 var1, int var2, int var3, int var4, y var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      return m.WATER;
   }

   public m H(o8 var1, int var2, int var3, int var4) {
      return m.WATER;
   }

   @Nullable
   private c j(int var1, int var2, int var3) {
      m var4 = this.a(var1, var2, var3);
      return var4 == m.WATER?this.v(var1, var2, var3):null;
   }

   private m a(int var1, int var2, int var3) {
      j.v var5 = new j.v();
      n.q();
      if(var1 < var1 + this.c) {
         if(var2 < var2 + this.H) {
            if(var3 < var3 + this.l) {
               net.yw.n var9 = this.m.Z(var5.V(var1, var2, var3));
               if(var9.n() != net.y1.l.p) {
                  return m.BLOCKED;
               }

               int var8 = var3 + 1;
            }

            int var7 = var2 + 1;
         }

         int var6 = var1 + 1;
      }

      return m.WATER;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
