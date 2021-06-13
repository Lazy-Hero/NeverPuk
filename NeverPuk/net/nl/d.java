package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.zw;

public class d extends o {
   private final zw p;
   private final net.r.r n;
   private int Z;
   private final net.ne.m J;

   public d(net.r.r var1, net.ne.m var2, zw var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.n = var1;
      this.J = var2;
      this.p = var3;
   }

   public boolean s(ks var1) {
      return false;
   }

   public ks h(int var1) {
      if(this.T()) {
         this.Z += Math.min(var1, this.y().U());
      }

      return super.h(var1);
   }

   protected void O(ks var1, int var2) {
      this.Z += var2;
      this.q(var1);
   }

   protected void q(ks var1) {
      var1.P(this.n.hl, this.n, this.Z);
      this.Z = 0;
   }

   public ks H(net.r.r var1, ks var2) {
      this.q(var2);
      net.nq.x var3 = this.p.z();
      ks var4 = this.p.A(0);
      ks var5 = this.p.A(1);
      if(this.D(var3, var4, var5) || this.D(var3, var5, var4)) {
         this.J.P(var3);
         var1.S(net.v.q.T);
         this.p.S(0, var4);
         this.p.S(1, var5);
      }

      return var2;
   }

   private boolean D(net.nq.x var1, ks var2, ks var3) {
      v.N();
      ks var5 = var1.K();
      ks var6 = var1.z();
      if(var2.Z() == var5.Z() && var2.U() >= var5.U()) {
         if(!var6.B() && !var3.B() && var6.Z() == var3.Z() && var3.U() >= var6.U()) {
            var2.H(var5.U());
            var3.H(var6.U());
            return true;
         }

         if(var6.B() && var3.B()) {
            var2.H(var5.U());
            return true;
         }
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
