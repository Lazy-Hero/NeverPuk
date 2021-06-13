package net.yi;

import java.util.List;
import net.xn;
import net.n0.ks;
import net.nb.f;
import net.u.d;
import net.u.j;
import net.yv.l;
import net.yv.r;
import net.yz.p;

public class e extends net.yi.z {
   private int bd;
   public long bw;
   private int bW;
   private final boolean bh;

   public e(r var1, double var2, double var4, double var6, boolean var8) {
      super(var1);
      this.S(var2, var4, var6, 0.0F, 0.0F);
      this.bd = 2;
      this.bw = this.p.nextLong();
      this.bW = this.p.nextInt(3) + 1;
      this.bh = var8;
      j var9 = new j(this);
      if(!var1.x && var1.N().b("doFireTick") && (var1.k() == l.NORMAL || var1.k() == l.HARD) && var1.a(var9, 10)) {
         if(var1.Z(var9).n() == net.y1.l.q && f.g.J(var1, var9)) {
            var1.U(var9, f.g.p());
         }

         int var10 = 0;

         while(true) {
            j var11 = var9.F(this.p.nextInt(3) - 1, this.p.nextInt(3) - 1, this.p.nextInt(3) - 1);
            if(var1.Z(var11).n() == net.y1.l.q && f.g.J(var1, var11)) {
               var1.U(var11, f.g.p());
            }

            ++var10;
         }
      }

   }

   public p E() {
      return p.WEATHER;
   }

   public void A() {
      ks.V();
      super.A();
      if(this.bd == 2) {
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.wq, p.WEATHER, 10000.0F, 0.8F + this.p.nextFloat() * 0.2F);
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.Pt, p.WEATHER, 2.0F, 0.5F + this.p.nextFloat() * 0.2F);
      }

      --this.bd;
      if(this.bd < 0) {
         if(this.bW == 0) {
            this.B();
            d.h(new d[4]);
         }

         if(this.bd < -this.p.nextInt(10)) {
            --this.bW;
            this.bd = 1;
            if(!this.bh && !this.hl.x) {
               this.bw = this.p.nextLong();
               j var2 = new j(this);
               if(this.hl.N().b("doFireTick") && this.hl.a(var2, 10) && this.hl.Z(var2).n() == net.y1.l.q && f.g.J(this.hl, var2)) {
                  this.hl.U(var2, f.g.p());
               }
            }
         }
      }

      if(this.bd >= 0) {
         if(this.hl.x) {
            this.hl.y(2);
         }

         if(!this.bh) {
            double var7 = 3.0D;
            List var4 = this.hl.u(this, new net.u.e(this.b - 3.0D, this.hS - 3.0D, this.hr - 3.0D, this.b + 3.0D, this.hS + 6.0D + 3.0D, this.hr + 3.0D));
            int var5 = 0;
            if(var5 < var4.size()) {
               net.ne.l var6 = (net.ne.l)var4.get(var5);
               var6.j(this);
               ++var5;
            }
         }
      }

   }

   protected void g() {
   }

   protected void o(net.nj.f var1) {
   }

   protected void I(net.nj.f var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}
