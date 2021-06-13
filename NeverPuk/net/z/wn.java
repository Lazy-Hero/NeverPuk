package net.z;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.n0.ks;
import net.nl.z1;
import net.nl.zc;
import net.yz.m_;
import net.z.g;
import net.z.wd;
import org.lwjgl.input.Keyboard;

public class wn extends net.c2.n implements zc {
   private static final m_ mE = new m_("textures/gui/container/anvil.png");
   private final net.nl.r mh;
   private wd mV;
   private final net.r.i m8;

   public wn(net.r.i var1, net.yv.r var2) {
      super(new net.nl.r(var1, var2, net.nn.j.b().sf));
      this.m8 = var1;
      this.mh = (net.nl.r)this.f;
   }

   public void L() {
      super.L();
      Keyboard.enableRepeatEvents(true);
      int var1 = (q - this.s) / 2;
      int var2 = (V - this.W) / 2;
      this.mV = new wd(0, this.O, var1 + 62, var2 + 24, 103, 12);
      this.mV.b(-1);
      this.mV.U(-1);
      this.mV.S(false);
      this.mV.r(35);
      this.f.T(this);
      this.f.w(this);
   }

   public void x() {
      super.x();
      Keyboard.enableRepeatEvents(false);
      this.f.T(this);
   }

   protected void z(int var1, int var2) {
      g.C();
      net.y.d.i();
      net.y.d.E();
      this.O.v(net.c9.b.x("container.repair", new Object[0]), 60.0F, 6.0F, 4210752);
      if(this.mh.M > 0) {
         int var4 = 8453920;
         boolean var5 = true;
         String var6 = net.c9.b.x("container.repair.cost", new Object[]{Integer.valueOf(this.mh.M)});
         if(this.mh.M >= 40 && !this.A.sf.a6.V) {
            var6 = net.c9.b.x("container.repair.expensive", new Object[0]);
            var4 = 16736352;
         }

         if(!this.mh.f(2).T()) {
            var5 = false;
         }

         if(!this.mh.f(2).I(this.m8.v)) {
            var4 = 16736352;
         }

         int var7 = -16777216 | (var4 & 16579836) >> 2 | var4 & -16777216;
         int var8 = this.s - 8 - this.O.r(var6);
         boolean var10000 = true;
         if(this.O.p()) {
            u(var8 - 3, 65, this.s - 7, 77, -16777216);
            u(var8 - 2, 66, this.s - 8, 76, -12895429);
         }

         this.O.v(var6, (float)var8, 68.0F, var7);
         this.O.v(var6, (float)(var8 + 1), 67.0F, var7);
         this.O.v(var6, (float)(var8 + 1), 68.0F, var7);
         this.O.v(var6, (float)var8, 67.0F, var4);
      }

      net.y.d.K();
   }

   protected void Q(char var1, int var2) throws IOException {
      if(this.mV.l(var1, var2)) {
         this.F();
      } else {
         super.Q(var1, var2);
      }

   }

   private void F() {
      String var1 = this.mV.u();
      net.nl.o var2 = this.mh.f(0);
      if(var2.T() && !var2.y().v() && var1.equals(var2.y().j())) {
         var1 = "";
      }

      this.mh.Z(var1);
      this.A.sf.x3.L((net.n2.k)(new net.m.l("MC|ItemName", (new net.n2.h(Unpooled.buffer())).R(var1))));
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      this.mV.N(var1, var2, var3);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
      net.y.d.i();
      net.y.d.E();
      this.mV.Z();
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(mE);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
      this.g(var4 + 59, var5 + 20, 0, this.W + (this.mh.f(0).T()?0:16), 110, 16);
      if((this.mh.f(0).T() || this.mh.f(1).T()) && !this.mh.f(2).T()) {
         this.g(var4 + 99, var5 + 45, this.s, 0, 28, 21);
      }

   }

   public void R(net.nl.v var1, net.yz.w var2) {
      this.b(var1, 0, var1.f(0).y());
   }

   public void b(net.nl.v var1, int var2, ks var3) {
      this.mV.u(var3.B()?"":var3.j());
      this.mV.o(!var3.B());
      if(!var3.B()) {
         this.F();
      }

   }

   public void A(net.nl.v var1, int var2, int var3) {
   }

   public void t(net.nl.v var1, z1 var2) {
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
