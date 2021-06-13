package net.nl;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.s;
import net.nl.v;
import net.nl.z1;
import net.nl.ze;

public class t extends o {
   private final ze j;
   private final net.r.r E;
   private int A;

   public t(net.r.r var1, ze var2, z1 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.E = var1;
      this.j = var2;
   }

   public boolean s(ks var1) {
      return false;
   }

   public ks h(int var1) {
      if(this.T()) {
         this.A += Math.min(var1, this.y().U());
      }

      return super.h(var1);
   }

   protected void O(ks var1, int var2) {
      this.A += var2;
      this.q(var1);
   }

   protected void p(int var1) {
      this.A += var1;
   }

   protected void q(ks var1) {
      if(this.A > 0) {
         var1.P(this.E.hl, this.E, this.A);
      }

      this.A = 0;
      s var2 = (s)this.M;
      net.cr.s var3 = var2.W();
      if(!var3.c()) {
         this.E.y((List)Lists.newArrayList(new net.cr.s[]{var3}));
         var2.p((net.cr.s)null);
      }

   }

   public ks H(net.r.r var1, ks var2) {
      v.N();
      this.q(var2);
      net.yz.w var4 = net.cr.n.S(this.j, var1.hl);
      int var5 = 0;
      if(var5 < var4.size()) {
         ks var6 = this.j.A(var5);
         ks var7 = (ks)var4.get(var5);
         if(!var6.B()) {
            this.j.W(var5, 1);
            var6 = this.j.A(var5);
         }

         if(!var7.B()) {
            if(var6.B()) {
               this.j.S(var5, var7);
            }

            if(ks.K(var6, var7) && ks.a(var6, var7)) {
               var7.A(var6.U());
               this.j.S(var5, var7);
            }

            if(!this.E.a8.D(var7)) {
               this.E.Y(var7, false);
            }
         }

         ++var5;
      }

      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
