package net.z;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.n0.ks;
import net.z.g;
import net.z.m;
import net.z.tu;
import net.z.tw;

public class ww extends tu {
   private final net.ct.t J;

   public ww(net.ct.t var1) {
      this.J = var1;
      this.m = Collections.synchronizedList(Lists.newArrayList());
   }

   public net.ct.t R() {
      return this.J;
   }

   public void L() {
      this.J.G();
      super.L();
   }

   public void t(String var1, int var2, int var3, int var4) {
      super.d(this.O, var1, var2, var3, var4);
   }

   public void K(String var1, int var2, int var3, int var4, boolean var5) {
      boolean var6 = g.C();
      if(var5) {
         super.n(this.O, var1, var2, var3, var4);
      }

      this.O.v(var1, (float)var2, (float)var3, var4);
   }

   public void g(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.J.J(var1, var2, var3, var4, var5, var6);
      super.g(var1, var2, var3, var4, var5, var6);
   }

   public void E(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.T(var1, var2, (double)var3, (double)var4, var5, var6);
   }

   public void C() {
      super.C();
   }

   public boolean b() {
      return super.b();
   }

   public void j(int var1) {
      super.j(var1);
   }

   public void v(int var1, int var2, float var3) {
      this.J.p(var1, var2, var3);
   }

   public void C(ks var1, int var2, int var3) {
      super.C(var1, var2, var3);
   }

   public void B(String var1, int var2, int var3) {
      super.B(var1, var2, var3);
   }

   public void U(List var1, int var2, int var3) {
      super.U(var1, var2, var3);
   }

   public void K() {
      this.J.y();
      super.K();
   }

   public int c() {
      return this.O.R;
   }

   public int B(String var1) {
      return this.O.r(var1);
   }

   public void u(String var1, int var2, int var3, int var4) {
      this.O.U(var1, (float)var2, (float)var3, var4);
   }

   public List U(String var1, int var2) {
      return this.O.m(var1, var2);
   }

   public final void t(m var1) throws IOException {
      this.J.J(((tw)var1).J());
   }

   public void M() {
      this.m.clear();
   }

   public void G(net.ct.i var1) {
      this.m.add(var1.j());
   }

   public List q() {
      g.B();
      ArrayList var2 = Lists.newArrayListWithExpectedSize(this.m.size());
      Iterator var3 = this.m.iterator();
      if(var3.hasNext()) {
         m var4 = (m)var3.next();
         var2.add(((tw)var4).J());
      }

      return var2;
   }

   public void f(net.ct.i var1) {
      this.m.remove(var1.j());
   }

   public void C(int var1, int var2, int var3) throws IOException {
      this.J.O(var1, var2, var3);
      super.C(var1, var2, var3);
   }

   public void m() throws IOException {
      this.J.Z();
      super.m();
   }

   public void I() throws IOException {
      this.J.O();
      super.I();
   }

   public void E(int var1, int var2, int var3) {
      this.J.S(var1, var2, var3);
   }

   public void f(int var1, int var2, int var3, long var4) {
      this.J.q(var1, var2, var3, var4);
   }

   public void Q(char var1, int var2) throws IOException {
      this.J.s(var1, var2);
   }

   public void y(boolean var1, int var2) {
      this.J.U(var1, var2);
   }

   public void x() {
      this.J.r();
      super.x();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
