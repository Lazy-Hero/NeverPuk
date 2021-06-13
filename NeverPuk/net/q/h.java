package net.q;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.nn.j;
import net.q.d;
import net.q.o;
import net.v.c;
import net.y.t;
import net.y.u1;
import net.yf.n;
import net.ys.r;
import net.z.te;

public class h extends te {
   private final r f;
   private float i;

   public h(int var1, r var2) {
      super(var1, 0, 0, 35, 27, false);
      this.f = var2;
      this.G(153, 2, 35, 0, d.y);
   }

   public void e(j var1) {
      c var2 = var1.sf.m();

      label38:
      for(o var4 : (List)n.Q.get(this.f)) {
         Iterator var5 = var4.T(var2.x()).iterator();

         while(true) {
            if(!var5.hasNext()) {
               continue label38;
            }

            s var6 = (s)var5.next();
            if(var2.s(var6)) {
               break;
            }
         }

         this.i = 15.0F;
         return;
      }

   }

   public void Z(j var1, int var2, int var3, float var4) {
      String[] var5 = o.r();
      if(this.F) {
         if(this.i > 0.0F) {
            float var6 = 1.0F + 0.1F * (float)Math.sin((double)(this.i / 15.0F * 3.1415927F));
            net.y.d.c();
            net.y.d.O((float)(this.D + 8), (float)(this.R + 12), 0.0F);
            net.y.d.W(1.0F, var6, 1.0F);
            net.y.d.O((float)(-(this.D + 8)), (float)(-(this.R + 12)), 0.0F);
         }

         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         var1.n().E(this.U);
         net.y.d.z();
         int var9 = this.r;
         int var7 = this.B;
         if(this.S) {
            var9 += this.c;
         }

         if(this.P) {
            var7 += this.A;
         }

         int var8 = this.D;
         if(this.S) {
            var8 -= 2;
         }

         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.g(var8, this.R, var9, var7, this.s, this.h);
         net.y.d.B();
         u1.A();
         net.y.d.i();
         this.p(var1.K());
         net.y.d.K();
         u1.m();
         if(this.i > 0.0F) {
            net.y.d.Y();
            this.i -= var4;
         }
      }

   }

   private void p(t var1) {
      ks var2 = this.f.X();
      if(this.f == r.y) {
         var1.M(var2, this.D + 3, this.R + 5);
         var1.M(r.R.X(), this.D + 14, this.R + 5);
      } else if(this.f == r.K) {
         var1.M(var2, this.D + 3, this.R + 5);
         var1.M(r.A.X(), this.D + 14, this.R + 5);
      } else {
         var1.M(var2, this.D + 9, this.R + 5);
      }

   }

   public r d() {
      return this.f;
   }

   public boolean O() {
      List var1 = (List)n.Q.get(this.f);
      this.F = false;

      for(o var3 : var1) {
         if(var3.b() && var3.v()) {
            this.F = true;
            break;
         }
      }

      return this.F;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
