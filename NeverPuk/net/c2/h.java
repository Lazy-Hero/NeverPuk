package net.c2;

import java.io.IOException;
import net.c2.j;
import net.ne.a;
import net.nl.c;
import net.nl.o;
import net.q.p;
import net.r.r;
import net.y.u1;
import net.y.ui;

public class h extends net.y.s implements p {
   private float VU;
   private float Vb;
   private net.z.x Vq;
   private final net.q.d V0 = new net.q.d();
   private boolean Vj;
   private boolean Vi;

   public h(r var1) {
      super(var1.aW);
      this.E = true;
   }

   public void K() {
      if(this.A.sE.f()) {
         this.A.s(new j(this.A.sf));
      }

      this.V0.X();
   }

   public void L() {
      j.u.C();
      this.m.clear();
      if(this.A.sE.f()) {
         this.A.s(new j(this.A.sf));
      }

      super.L();
      this.Vj = q < 379;
      this.V0.M(q, V, this.A, this.Vj, ((net.nl.j)this.f).T);
      this.Y = this.V0.f(this.Vj, q, this.s);
      this.Vq = new net.z.x(10, this.Y + 104, V / 2 - 22, 20, 18, 178, 0, 19, K);
      this.m.add(this.Vq);
   }

   protected void z(int var1, int var2) {
      this.O.v(net.c9.b.x("container.crafting", new Object[0]), 97.0F, 8.0F, 4210752);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.lY = !this.V0.W();
      if(this.V0.W() && this.Vj) {
         this.j(var3, var1, var2);
         this.V0.N(var1, var2, var3);
      } else {
         this.V0.N(var1, var2, var3);
         super.v(var1, var2, var3);
         this.V0.q(this.Y, this.F, false, var3);
      }

      this.X(var1, var2);
      this.V0.G(this.Y, this.F, var1, var2);
      this.VU = (float)var1;
      this.Vb = (float)var2;
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(K);
      int var4 = this.Y;
      int var5 = this.F;
      this.g(var4, var5, 0, 0, this.s, this.W);
      i((float)(var4 + 51), (float)(var5 + 75), 30, (float)(var4 + 51) - this.VU, (float)(var5 + 75 - 50) - this.Vb, this.A.sf);
   }

   public static void i(float var0, float var1, int var2, float var3, float var4, a var5) {
      net.y.d.G();
      net.y.d.c();
      net.y.d.O(var0, var1, 50.0F);
      net.y.d.W((float)(-var2), (float)var2, (float)var2);
      net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
      float var7 = var5.AK;
      float var8 = var5.hN;
      float var9 = var5.V;
      float var10 = var5.AH;
      float var11 = var5.A3;
      net.y.d.P(135.0F, 0.0F, 1.0F, 0.0F);
      int var10000 = j.u.C();
      u1.B();
      net.y.d.P(-135.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(-((float)Math.atan((double)(var4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var5.AK = (float)Math.atan((double)(var3 / 40.0F)) * 20.0F;
      var5.hN = (float)Math.atan((double)(var3 / 40.0F)) * 40.0F;
      var5.V = -((float)Math.atan((double)(var4 / 40.0F))) * 20.0F;
      var5.A3 = var5.hN;
      var5.AH = var5.hN;
      net.y.d.O(0.0F, 0.0F, 0.0F);
      net.y0.d var12 = net.nn.j.b().N();
      var12.f(180.0F);
      var12.w(false);
      var12.D(var5, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
      var12.w(true);
      var5.AK = var7;
      var5.hN = var8;
      var5.V = var9;
      var5.AH = var10;
      var5.A3 = var11;
      net.y.d.Y();
      u1.m();
      int var6 = var10000;
      net.y.d.g();
      net.y.d.t(ui.w);
      net.y.d.w();
      net.y.d.t(ui.V);
      if(net.u.d.y() == null) {
         ++var6;
         j.u.r(var6);
      }

   }

   protected boolean f(int var1, int var2, int var3, int var4, int var5, int var6) {
      return (!this.Vj || !this.V0.W()) && super.f(var1, var2, var3, var4, var5, var6);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      if(!this.V0.t(var1, var2, var3) && (!this.Vj || !this.V0.W())) {
         super.C(var1, var2, var3);
      }

   }

   protected void E(int var1, int var2, int var3) {
      if(this.Vi) {
         this.Vi = false;
      } else {
         super.E(var1, var2, var3);
      }

   }

   protected boolean Y(int var1, int var2, int var3, int var4) {
      if(var1 >= var3 && var2 >= var4 && var1 < var3 + this.s && var2 < var4 + this.W) {
         boolean var6 = false;
      } else {
         boolean var10000 = true;
      }

      return this.V0.l(var1, var2, this.Y, this.F, this.s, this.W);
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.g == 10) {
         this.V0.e(this.Vj, ((net.nl.j)this.f).T);
         this.V0.W();
         this.Y = this.V0.f(this.Vj, q, this.s);
         this.Vq.M(this.Y + 104, V / 2 - 22);
         this.Vi = true;
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(!this.V0.o(var1, var2)) {
         super.Q(var1, var2);
      }

   }

   public void Z(o var1, int var2, int var3, c var4) {
      super.Z(var1, var2, var3, var4);
      this.V0.v(var1);
   }

   public void D() {
      this.V0.w();
   }

   public void x() {
      this.V0.B();
      super.x();
   }

   public net.q.d w() {
      return this.V0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
