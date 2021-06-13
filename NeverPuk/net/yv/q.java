package net.yv;

import javax.annotation.Nullable;
import net.xn;
import net.yv.j;
import net.yv.o8;
import net.yv.r;
import net.yv.w;
import net.yz.aq;

public class q implements o8 {
   protected int x;
   protected int i;
   protected net.l.q[][] D;
   protected boolean J;
   protected r E;

   public q(r var1, net.u.j var2, net.u.j var3, int var4) {
      r.C();
      super();
      this.E = var1;
      this.x = var2.t() - var4 >> 4;
      this.i = var2.y() - var4 >> 4;
      int var6 = var3.t() + var4 >> 4;
      int var7 = var3.y() + var4 >> 4;
      this.D = new net.l.q[var6 - this.x + 1][var7 - this.i + 1];
      this.J = true;
      int var8 = this.x;
      if(var8 <= var6) {
         int var9 = this.i;
         if(var9 <= var7) {
            this.D[var8 - this.x][var9 - this.i] = var1.q(var8, var9);
            ++var9;
         }

         ++var8;
      }

      var8 = var2.t() >> 4;
      if(var8 <= var3.t() >> 4) {
         int var15 = var2.y() >> 4;
         if(var15 <= var3.y() >> 4) {
            net.l.q var10 = this.D[var8 - this.x][var15 - this.i];
            if(!var10.a(var2.h(), var3.h())) {
               this.J = false;
            }

            ++var15;
         }

         ++var8;
      }

   }

   public boolean I() {
      return this.J;
   }

   @Nullable
   public net.ni.v L(net.u.j var1) {
      return this.S(var1, net.l.q.IMMEDIATE);
   }

   @Nullable
   public net.ni.v S(net.u.j var1, net.l.q var2) {
      int var3 = (var1.t() >> 4) - this.x;
      int var4 = (var1.y() >> 4) - this.i;
      return this.D[var3][var4].K(var1, var2);
   }

   public int z(net.u.j var1, int var2) {
      int var3 = this.F(w.SKY, var1);
      int var4 = this.F(w.BLOCK, var1);
      if(var4 < var2) {
         var4 = var2;
      }

      return var3 << 20 | var4 << 4;
   }

   public net.yw.n Z(net.u.j var1) {
      if(var1.h() >= 0 && var1.h() < 256) {
         int var2 = (var1.t() >> 4) - this.x;
         int var3 = (var1.y() >> 4) - this.i;
         if(var2 < this.D.length && var3 < this.D[var2].length) {
            net.l.q var4 = this.D[var2][var3];
            return var4.u(var1);
         }
      }

      return net.nb.f.ou.p();
   }

   public net.ns.i P(net.u.j var1) {
      int var2 = (var1.t() >> 4) - this.x;
      int var3 = (var1.y() >> 4) - this.i;
      return this.D[var2][var3].b(var1, this.E.V());
   }

   private int F(w var1, net.u.j var2) {
      if(var1 == w.SKY && !this.E.F.A()) {
         return 0;
      } else if(var2.h() >= 0 && var2.h() < 256) {
         if(this.Z(var2).A()) {
            int var9 = 0;

            for(aq var7 : aq.values()) {
               int var8 = this.N(var1, var2.C(var7));
               if(var8 > var9) {
                  var9 = var8;
               }
            }

            return var9;
         } else {
            int var3 = (var2.t() >> 4) - this.x;
            int var4 = (var2.y() >> 4) - this.i;
            return this.D[var3][var4].C(var1, var2);
         }
      } else {
         return var1.defaultLightValue;
      }
   }

   public boolean y(net.u.j var1) {
      return this.Z(var1).n() == net.y1.l.q;
   }

   public int N(w var1, net.u.j var2) {
      if(var2.h() >= 0 && var2.h() < 256) {
         int var3 = (var2.t() >> 4) - this.x;
         int var4 = (var2.y() >> 4) - this.i;
         return this.D[var3][var4].C(var1, var2);
      } else {
         return var1.defaultLightValue;
      }
   }

   public int N(net.u.j var1, aq var2) {
      return this.Z(var1).y(this, var1, var2);
   }

   public j t() {
      return this.E.t();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
