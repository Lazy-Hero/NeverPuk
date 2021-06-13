package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.h;
import net.nl.v;
import net.nl.z1;

public class zw implements z1 {
   private final net.ne.m L;
   private final net.yz.w w = net.yz.w.C(3, ks.a);
   private final net.r.r R;
   private net.nq.x l;
   private int z;

   public zw(net.r.r var1, net.ne.m var2) {
      this.R = var1;
      this.L = var2;
   }

   public int e() {
      return this.w.size();
   }

   public boolean N() {
      for(ks var2 : this.w) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      return (ks)this.w.get(var1);
   }

   public ks W(int var1, int var2) {
      ks var3 = (ks)this.w.get(var1);
      if(var1 == 2 && !var3.B()) {
         return h.n(this.w, var1, var3.U());
      } else {
         ks var4 = h.n(this.w, var1, var2);
         if(!var4.B() && this.g(var1)) {
            this.j();
         }

         return var4;
      }
   }

   private boolean g(int var1) {
      return var1 == 1;
   }

   public ks S(int var1) {
      return h.m(this.w, var1);
   }

   public void S(int var1, ks var2) {
      this.w.set(var1, var2);
      if(!var2.B() && var2.U() > this.m()) {
         var2.u(this.m());
      }

      if(this.g(var1)) {
         this.j();
      }

   }

   public String Q() {
      return "mob.villager";
   }

   public boolean H() {
      return false;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public int m() {
      return 64;
   }

   public boolean m(net.r.r var1) {
      return this.L.p() == var1;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      return true;
   }

   public void W() {
      this.j();
   }

   public void j() {
      v.N();
      this.l = null;
      ks var2 = (ks)this.w.get(0);
      ks var3 = (ks)this.w.get(1);
      if(var2.B()) {
         var2 = var3;
         var3 = ks.a;
      }

      if(var2.B()) {
         this.S(2, ks.a);
      }

      net.nq.z var4 = this.L.L(this.R);
      if(var4 != null) {
         net.nq.x var5 = var4.v(var2, var3, this.z);
         if(var5 != null && !var5.y()) {
            this.l = var5;
            this.S(2, var5.f().s());
         }

         if(!var3.B()) {
            var5 = var4.v(var3, var2, this.z);
            if(!var5.y()) {
               this.l = var5;
               this.S(2, var5.f().s());
            }

            this.S(2, ks.a);
         }

         this.S(2, ks.a);
      }

      this.L.L(this.A(2));
   }

   public net.nq.x z() {
      return this.l;
   }

   public void L(int var1) {
      this.z = var1;
      this.j();
   }

   public int e(int var1) {
      return 0;
   }

   public void Z(int var1, int var2) {
   }

   public int r() {
      return 0;
   }

   public void T() {
      this.w.clear();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
