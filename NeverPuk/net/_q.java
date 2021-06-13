package net;

import net.by;
import net.mf;
import net.xn;
import net.z9;
import net.nx.f;
import net.yk.t;
import net.yv.d;

public class _q extends d {
   private final f UF;

   public _q(f var1, net.cg.d var2, net.cg.z var3, int var4, t var5) {
      super(var1, var2, var3, var4, var5);
      this.UF = var1;
   }

   public void k() {
      super.k();
      if(!z9.U()) {
         this.y();
      }

      if(z9.g) {
         z9.g = false;
         by.p(z9.d(), this);
      }

   }

   protected void n() {
      if(!z9.Sp()) {
         this.a();
      }

      super.n();
   }

   private void a() {
      String var1 = mf.O();
      if(this.y.l() || this.y.r()) {
         this.y.P(0);
         this.y.d(false);
         this.A(0.0F);
         this.y.H(0);
         this.y.p(false);
         this.d(0.0F);
         this.UF.c().U(new net.no.i1(2, 0.0F));
         this.UF.c().U(new net.no.i1(7, 0.0F));
         this.UF.c().U(new net.no.i1(8, 0.0F));
      }

   }

   private void y() {
      String var1 = mf.O();
      if(this.y.h().x() == 1) {
         long var2 = this.j();
         long var4 = var2 % 24000L;
         if(z9.p()) {
            if(Long.compare(var4, 1000L) <= 0) {
               this.N(var2 - var4 + 1001L);
            }

            if(Long.compare(var4, 11000L) >= 0) {
               this.N(var2 - var4 + 24001L);
            }
         }

         if(z9.Y()) {
            if(var4 <= 14000L) {
               this.N(var2 - var4 + 14001L);
            }

            if(var4 >= 22000L) {
               this.N(var2 - var4 + 24000L + 14001L);
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
