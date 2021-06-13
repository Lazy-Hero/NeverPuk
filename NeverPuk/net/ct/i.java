package net.ct;

import net.yz.m_;
import net.z.tw;

public class i {
   protected static final m_ C = new m_("textures/gui/widgets.png");
   private final tw G;

   public i(int var1, int var2, int var3, String var4) {
      this.G = new tw(this, var1, var2, var3, var4);
   }

   public i(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.G = new tw(this, var1, var2, var3, var6, var4, var5);
   }

   public net.z.m j() {
      return this.G;
   }

   public int B() {
      return this.G.X();
   }

   public boolean f() {
      return this.G.W();
   }

   public void s(boolean var1) {
      this.G.d(var1);
   }

   public void m(String var1) {
      this.G.V(var1);
   }

   public int F() {
      return this.G.h();
   }

   public int t() {
      return this.G.k();
   }

   public int Z() {
      return this.G.b();
   }

   public void Q(int var1, int var2, float var3) {
      this.G.Z(net.nn.j.b(), var1, var2, var3);
   }

   public void T(int var1, int var2) {
   }

   public void H(int var1, int var2) {
   }

   public void p(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.G.g(var1, var2, var3, var4, var5, var6);
   }

   public void n(int var1, int var2) {
   }

   public int h(boolean var1) {
      return this.G.C(var1);
   }
}
