package net;

import java.awt.Color;
import net.gj;
import net.mc;
import net.xn;
import net.nn.j;
import net.u.d;
import net.u.r;
import net.z.t;

public abstract class gq {
   public static t p = new t(j.b());
   protected static j D = j.b();
   protected static Color G = new Color(26, 26, 26);
   private final gj V;
   public double e;
   public double C;
   public double v;
   public double N;
   public mc d;
   private boolean I;

   public gq(gj var1, int var2, int var3, int var4, int var5) {
      this.V = var1;
      this.v = (double)var2;
      this.N = (double)var3;
      this.e = (double)var4;
      this.C = (double)var5;
   }

   public gj U() {
      return this.V;
   }

   public void j(int var1, int var2) {
   }

   public void a(int var1, int var2, int var3) {
   }

   public void T(int var1, int var2, int var3) {
   }

   public void m(int var1, int var2) {
   }

   public boolean R(int var1, int var2) {
      int var4 = (int)((double)this.V.H() + this.v);
      r.T();
      int var5 = (int)((double)this.V.i() + this.N);
      boolean var10000 = var1 > var4 && (double)var1 < (double)var4 + this.e && var2 > var5 && (double)var2 < (double)var5 + this.C;
      d.h(new d[1]);
      return var10000;
   }

   public boolean c() {
      return true;
   }

   public double k() {
      return 0.0D;
   }

   public int Z() {
      return (int)this.v;
   }

   public void F(double var1) {
      this.v = var1;
   }

   public int V() {
      return (int)this.e;
   }

   public int x() {
      return (int)this.N;
   }

   public void j(int var1) {
      this.N = (double)var1;
   }

   public int H() {
      return (int)this.C;
   }

   public void l(int var1) {
      this.C = (double)var1;
   }

   public boolean r() {
      return this.I;
   }

   public boolean j(boolean var1) {
      this.I = var1;
      return this.I;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
