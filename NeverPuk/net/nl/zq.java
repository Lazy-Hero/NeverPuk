package net.nl;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.n0.ks;
import net.nl.h;
import net.nl.v;
import net.nl.w;
import net.nl.z1;

public class zq implements z1 {
   private String j;
   private final int n;
   private final net.yz.w J;
   private List z;
   private boolean w;

   public zq(String var1, boolean var2, int var3) {
      this.j = var1;
      this.w = var2;
      this.n = var3;
      this.J = net.yz.w.C(var3, ks.a);
   }

   public zq(net.cb.t var1, int var2) {
      this(var1.l(), true, var2);
   }

   public void Z(w var1) {
      if(this.z == null) {
         this.z = Lists.newArrayList();
      }

      this.z.add(var1);
   }

   public void j(w var1) {
      this.z.remove(var1);
   }

   public ks A(int var1) {
      return var1 < this.J.size()?(ks)this.J.get(var1):ks.a;
   }

   public ks W(int var1, int var2) {
      ks var3 = h.n(this.J, var1, var2);
      if(!var3.B()) {
         this.W();
      }

      return var3;
   }

   public ks M(ks var1) {
      v.Q();
      ks var3 = var1.s();
      int var4 = 0;
      if(var4 < this.n) {
         ks var5 = this.A(var4);
         if(var5.B()) {
            this.S(var4, var3);
            this.W();
            return ks.a;
         }

         if(ks.K(var5, var3)) {
            int var6 = Math.min(this.m(), var5.j());
            int var7 = Math.min(var3.U(), var6 - var5.U());
            var5.A(var7);
            var3.H(var7);
            if(var3.B()) {
               this.W();
               return ks.a;
            }
         }

         ++var4;
      }

      if(var3.U() != var1.U()) {
         this.W();
      }

      return var3;
   }

   public ks S(int var1) {
      ks var2 = (ks)this.J.get(var1);
      if(var2.B()) {
         return ks.a;
      } else {
         this.J.set(var1, ks.a);
         return var2;
      }
   }

   public void S(int var1, ks var2) {
      this.J.set(var1, var2);
      if(!var2.B() && var2.U() > this.m()) {
         var2.u(this.m());
      }

      this.W();
   }

   public int e() {
      return this.n;
   }

   public boolean N() {
      for(ks var2 : this.J) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public String Q() {
      return this.j;
   }

   public boolean H() {
      return this.w;
   }

   public void M(String var1) {
      this.w = true;
      this.j = var1;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public int m() {
      return 64;
   }

   public void W() {
      if(this.z != null) {
         for(int var1 = 0; var1 < this.z.size(); ++var1) {
            ((w)this.z.get(var1)).b(this);
         }
      }

   }

   public boolean m(net.r.r var1) {
      return true;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      return true;
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
      this.J.clear();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
