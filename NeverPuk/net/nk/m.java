package net.nk;

import java.util.Collection;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.g;
import net.nk.i;
import net.nk.n;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.m_;

public class m extends i {
   private static final net.k.v gX = net.k.n.q(m.class, net.k.y.d);
   private static final net.k.v gT = net.k.n.q(m.class, net.k.y.f);
   private static final net.k.v gv = net.k.n.q(m.class, net.k.y.f);
   private int g4;
   private int gM;
   private int gU = 30;
   private int g9 = 3;
   private int gD;

   public m(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.7F);
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(2, new net.y_.x(this));
      this.p_.X(3, new net.y_.n(this, net.yn.g.class, 6.0F, 1.0D, 1.2D));
      this.p_.X(4, new net.y_.k(this, 1.0D, false));
      this.p_.X(5, new ow(this, 0.8D));
      this.p_.X(6, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(6, new oa(this));
      this.pM.X(1, new o8(this, net.r.r.class, true));
      this.pM.X(2, new oo(this, false, new Class[0]));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.25D);
   }

   public int q() {
      return this.M() == null?3:3 + (int)(this.h() - 1.0F);
   }

   public void v(float var1, float var2) {
      super.v(var1, var2);
      this.gM = (int)((float)this.gM + var1 * 1.5F);
      if(this.gM > this.gU - 5) {
         this.gM = this.gU - 5;
      }

   }

   protected void g() {
      super.g();
      this.G.r(gX, Integer.valueOf(-1));
      this.G.r(gT, Boolean.valueOf(false));
      this.G.r(gv, Boolean.valueOf(false));
   }

   public static void A(net.c0.d var0) {
      net.ne.y.J(var0, m.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      if(((Boolean)this.G.a(gT)).booleanValue()) {
         var1.c("powered", true);
      }

      var1.h("Fuse", (short)this.gU);
      var1.D("ExplosionRadius", (byte)this.g9);
      var1.c("ignited", this.nm());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.G.d(gT, Boolean.valueOf(var1.i("powered")));
      if(var1.K("Fuse", 99)) {
         this.gU = var1.E("Fuse");
      }

      if(var1.K("ExplosionRadius", 99)) {
         this.g9 = var1.R("ExplosionRadius");
      }

      if(var1.i("ignited")) {
         this.nN();
      }

   }

   public void A() {
      if(this.P()) {
         this.g4 = this.gM;
         if(this.nm()) {
            this.Z(1);
         }

         int var1 = this.l();
         if(this.gM == 0) {
            this.I(net.nb.l.wX, 1.0F, 0.5F);
         }

         this.gM += var1;
         if(this.gM < 0) {
            this.gM = 0;
         }

         if(this.gM >= this.gU) {
            this.gM = this.gU;
            this.nG();
         }
      }

      super.A();
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.DD;
   }

   protected net.yz.a r() {
      return net.nb.l.H1;
   }

   public void O(net.yz.z var1) {
      n.o.y();
      super.O(var1);
      if(this.hl.N().b("doMobLoot")) {
         if(var1.v() instanceof g) {
            int var3 = net.n0.y.h(net.nb.j.a);
            int var4 = net.n0.y.h(net.nb.j.Wc);
            int var5 = var3 + this.p.nextInt(var4 - var3 + 1);
            this.S(net.n0.y.k(var5), 1);
         }

         if(var1.v() instanceof m && var1.v() != this && ((m)var1.v()).nl() && ((m)var1.v()).nn()) {
            ((m)var1.v()).H();
            this.O(new ks(net.nb.j.Y9, 1, 4), 0.0F);
         }
      }

   }

   public boolean S(net.ne.l var1) {
      return true;
   }

   public boolean nl() {
      return ((Boolean)this.G.a(gT)).booleanValue();
   }

   public float e(float var1) {
      return ((float)this.g4 + (float)(this.gM - this.g4) * var1) / (float)(this.gU - 2);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pn;
   }

   public int l() {
      return ((Integer)this.G.a(gX)).intValue();
   }

   public void Z(int var1) {
      this.G.d(gX, Integer.valueOf(var1));
   }

   public void j(net.yi.e var1) {
      super.j(var1);
      this.G.d(gT, Boolean.valueOf(true));
   }

   protected boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(var3.Z() == net.nb.j.YU) {
         this.hl.L(var1, this.b, this.hS, this.hr, net.nb.l.C9, this.E(), 1.0F, this.p.nextFloat() * 0.4F + 0.8F);
         var1.N(var2);
         if(!this.hl.x) {
            this.nN();
            var3.S(1, var1);
            return true;
         }
      }

      return super.R(var1, var2);
   }

   private void nG() {
      if(!this.hl.x) {
         boolean var1 = this.hl.N().b("mobGriefing");
         float var2 = this.nl()?2.0F:1.0F;
         this.Xp = true;
         this.hl.B(this, this.b, this.hS, this.hr, (float)this.g9 * var2, var1);
         this.B();
         this.np();
      }

   }

   private void np() {
      Collection var1 = this.o();
      if(!var1.isEmpty()) {
         net.ne.w var2 = new net.ne.w(this.hl, this.b, this.hS, this.hr);
         var2.h(2.5F);
         var2.O(-0.5F);
         var2.N(10);
         var2.I(var2.c() / 2);
         var2.C(-var2.J() / (float)var2.c());

         for(net.n_.i var4 : var1) {
            var2.Y(new net.n_.i(var4));
         }

         this.hl.S(var2);
      }

   }

   public boolean nm() {
      return ((Boolean)this.G.a(gv)).booleanValue();
   }

   public void nN() {
      this.G.d(gv, Boolean.valueOf(true));
   }

   public boolean nn() {
      return this.gD < 1 && this.hl.N().b("doMobLoot");
   }

   public void H() {
      ++this.gD;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
