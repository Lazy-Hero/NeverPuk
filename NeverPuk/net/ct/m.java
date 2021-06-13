package net.ct;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.ct.o;
import net.ct.t;

public class m {
   private net.y8.q O;

   public m(net.y8.q var1) {
      this.O = var1;
   }

   public m R(net.y8.q var1) {
      this.O = var1;
      return this;
   }

   public net.y8.q B() {
      return this.O;
   }

   public void k() {
      this.O.A();
   }

   public int I(int var1) {
      return this.O.u(var1);
   }

   public int G() {
      return this.O.X();
   }

   public boolean p() {
      return this.O.t();
   }

   public boolean S(int var1) {
      return this.O.w(var1);
   }

   public o T(int var1) {
      return new o(this.O.b(var1));
   }

   public m T(o var1) {
      return this.R(this.O.k(var1.w()));
   }

   public int d() {
      return this.O.U();
   }

   public List R() {
      ArrayList var2 = Lists.newArrayList();
      t.K();
      Iterator var3 = this.O.b().iterator();
      if(var3.hasNext()) {
         net.y8.h var4 = (net.y8.h)var3.next();
         var2.add(new o(var4));
      }

      return var2;
   }

   public boolean A() {
      return this.O.y();
   }

   public int i() {
      return this.O.H();
   }

   public int g(int var1) {
      return this.O.t(var1);
   }

   public int L() {
      return this.O.m();
   }

   public int T() {
      return this.O.u();
   }

   public boolean equals(Object var1) {
      return this.O.equals(var1);
   }

   public int hashCode() {
      return this.O.hashCode();
   }

   public String toString() {
      return this.O.toString();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
