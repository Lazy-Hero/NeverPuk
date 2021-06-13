package net.c2;

import java.io.IOException;
import net.c2.j;
import net.c2.n;
import net.nl.c;
import net.nl.o;
import net.q.p;
import net.yv.r;
import net.yz.m_;

public class u extends n implements p {
   private static final m_ iN = new m_("textures/gui/container/crafting_table.png");
   private net.z.x ip;
   private final net.q.d iW;
   private boolean iD;

   public u(net.r.i var1, r var2) {
      this(var1, var2, net.u.j.V);
   }

   public u(net.r.i var1, r var2, net.u.j var3) {
      super(new net.nl.m(var1, var2, var3));
      this.iW = new net.q.d();
   }

   public void L() {
      j.u.g();
      super.L();
      this.iD = q < 379;
      this.iW.M(q, V, this.A, this.iD, ((net.nl.m)this.f).Q);
      this.Y = this.iW.f(this.iD, q, this.s);
      this.ip = new net.z.x(10, this.Y + 5, V / 2 - 49, 20, 18, 0, 168, 19, iN);
      this.m.add(this.ip);
   }

   public void K() {
      super.K();
      this.iW.X();
   }

   public void v(int var1, int var2, float var3) {
      j.u.C();
      this.C();
      if(this.iW.W() && this.iD) {
         this.j(var3, var1, var2);
         this.iW.N(var1, var2, var3);
      }

      this.iW.N(var1, var2, var3);
      super.v(var1, var2, var3);
      this.iW.q(this.Y, this.F, true, var3);
      this.X(var1, var2);
      this.iW.G(this.Y, this.F, var1, var2);
   }

   protected void z(int var1, int var2) {
      this.O.v(net.c9.b.x("container.crafting", new Object[0]), 28.0F, 6.0F, 4210752);
      this.O.v(net.c9.b.x("container.inventory", new Object[0]), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(iN);
      int var4 = this.Y;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
   }

   protected boolean f(int var1, int var2, int var3, int var4, int var5, int var6) {
      return (!this.iD || !this.iW.W()) && super.f(var1, var2, var3, var4, var5, var6);
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      if(!this.iW.t(var1, var2, var3) && (!this.iD || !this.iW.W())) {
         super.C(var1, var2, var3);
      }

   }

   protected boolean Y(int var1, int var2, int var3, int var4) {
      if(var1 >= var3 && var2 >= var4 && var1 < var3 + this.s && var2 < var4 + this.W) {
         boolean var6 = false;
      } else {
         boolean var10000 = true;
      }

      return this.iW.l(var1, var2, this.Y, this.F, this.s, this.W);
   }

   protected void t(net.z.m var1) throws IOException {
      if(var1.g == 10) {
         this.iW.e(this.iD, ((net.nl.m)this.f).Q);
         this.iW.W();
         this.Y = this.iW.f(this.iD, q, this.s);
         this.ip.M(this.Y + 5, V / 2 - 49);
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(!this.iW.o(var1, var2)) {
         super.Q(var1, var2);
      }

   }

   public void Z(o var1, int var2, int var3, c var4) {
      super.Z(var1, var2, var3, var4);
      this.iW.v(var1);
   }

   public void D() {
      this.iW.w();
   }

   public void x() {
      this.iW.B();
      super.x();
   }

   public net.q.d w() {
      return this.iW;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
