package net.n;

import net.xn;
import net.cb.t;
import net.n.w;
import net.n.y;
import net.n0.ks;
import net.no.i1;
import net.u.d;
import net.yz.ad;
import net.yz.aq;

public class h extends w {
   private boolean i;
   private boolean U;
   private int o;
   private int n;

   public h(net.yv.r var1) {
      super(var1);
   }

   public void A() {
      super.A();
      y.c();
      ++this.n;
      long var2 = this.B.y();
      long var4 = var2 / 24000L + 1L;
      if(!this.i && this.n > 20) {
         this.i = true;
         this.q.t1.h((net.n2.k)(new i1(5, 0.0F)));
      }

      this.U = Long.compare(var2, 120500L) > 0;
      if(this.U) {
         ++this.o;
      }

      label140: {
         if(Long.compare(var2 % 24000L, 500L) == 0) {
            if(var4 > 6L) {
               break label140;
            }

            this.q.r((t)(new net.cb.h("demo.day." + var4, new Object[0])));
         }

         if(var4 == 1L) {
            if(Long.compare(var2, 100L) == 0) {
               this.q.t1.h((net.n2.k)(new i1(5, 101.0F)));
            }

            if(var2 == 175L) {
               this.q.t1.h((net.n2.k)(new i1(5, 102.0F)));
            }

            if(var2 != 250L) {
               break label140;
            }

            this.q.t1.h((net.n2.k)(new i1(5, 103.0F)));
         }

         if(var4 == 5L && var2 % 24000L == 22000L) {
            this.q.r((t)(new net.cb.h("demo.day.warning", new Object[0])));
         }
      }

      if(d.y() == null) {
         y.P(new int[4]);
      }

   }

   private void j() {
      if(this.o > 100) {
         this.q.r((t)(new net.cb.h("demo.reminder", new Object[0])));
         this.o = 0;
      }

   }

   public void M(net.u.j var1, aq var2) {
      if(this.U) {
         this.j();
      } else {
         super.M(var1, var2);
      }

   }

   public void g(net.u.j var1) {
      if(!this.U) {
         super.g(var1);
      }

   }

   public boolean W(net.u.j var1) {
      return !this.U && super.W(var1);
   }

   public ad Y(net.r.r var1, net.yv.r var2, ks var3, net.yz.k var4) {
      if(this.U) {
         this.j();
         return ad.PASS;
      } else {
         return super.Y(var1, var2, var3, var4);
      }
   }

   public ad f(net.r.r var1, net.yv.r var2, ks var3, net.yz.k var4, net.u.j var5, aq var6, float var7, float var8, float var9) {
      if(this.U) {
         this.j();
         return ad.PASS;
      } else {
         return super.f(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
