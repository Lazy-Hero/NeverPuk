package net.nl;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nl.h;
import net.nl.v;
import net.nl.z1;

public class s implements z1 {
   private final net.yz.w u = net.yz.w.C(1, ks.a);
   private net.cr.s U;

   public int e() {
      return 1;
   }

   public boolean N() {
      v.N();
      Iterator var2 = this.u.iterator();
      if(var2.hasNext()) {
         ks var3 = (ks)var2.next();
         if(!var3.B()) {
            return false;
         }
      }

      return true;
   }

   public ks A(int var1) {
      return (ks)this.u.get(0);
   }

   public String Q() {
      return "Result";
   }

   public boolean H() {
      return false;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public ks W(int var1, int var2) {
      return h.m(this.u, 0);
   }

   public ks S(int var1) {
      return h.m(this.u, 0);
   }

   public void S(int var1, ks var2) {
      this.u.set(0, var2);
   }

   public int m() {
      return 64;
   }

   public void W() {
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
      this.u.clear();
   }

   public void p(@Nullable net.cr.s var1) {
      this.U = var1;
   }

   @Nullable
   public net.cr.s W() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
