package net.r;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.b2;
import net.dq;
import net.xn;
import net.c0.q;
import net.cb.c;
import net.n.g;
import net.n.w;
import net.n0.ks;
import net.n0.y6;
import net.n2.k;
import net.nc.m;
import net.nc.o;
import net.nc.u;
import net.ne.a;
import net.ne.l;
import net.ne.v;
import net.ni.sg;
import net.nl.b;
import net.nl.z1;
import net.nl.zc;
import net.nl.zw;
import net.no.i0;
import net.no.i1;
import net.no.i5;
import net.no.ic;
import net.no.il;
import net.no.iu;
import net.no.s9;
import net.no.sb;
import net.no.sc;
import net.no.se;
import net.no.sf;
import net.no.sl;
import net.no.sm;
import net.no.su;
import net.no.sw;
import net.no.sy;
import net.nx.f;
import net.r.n;
import net.r.r;
import net.u.t;
import net.v.p;
import net.v.y;
import net.y9.ln;
import net.y9.r3;
import net.y9.re;
import net.yv.d;
import net.yv.o9;
import net.yv.x;
import net.yz.aa;
import net.yz.af;
import net.yz.ag;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h extends r implements zc {
   private static final Logger t8 = LogManager.getLogger();
   private String tI = "en_US";
   public net.n2.r t1;
   public final f t9;
   public final w tA;
   public double tu;
   public double tg;
   private final List tG = Lists.newLinkedList();
   private final dq tr;
   private final p tL;
   private float tc = Float.MIN_VALUE;
   private int tC = Integer.MIN_VALUE;
   private int tj = Integer.MIN_VALUE;
   private int tf = Integer.MIN_VALUE;
   private int tW = Integer.MIN_VALUE;
   private int tl = Integer.MIN_VALUE;
   private float tS = -1.0E8F;
   private int tt = -99999999;
   private boolean tP = true;
   private int tp = -99999999;
   private int t5 = 60;
   private r.b tk;
   private boolean tv = true;
   private long tU = System.currentTimeMillis();
   private l tH;
   private boolean t4;
   private boolean tR;
   private final y tx = new y();
   private net.u.r tn;
   private int tV;
   private boolean tX;
   private net.u.r td;
   private int ti;
   public boolean tK;
   public int t7;
   public boolean tB;

   public h(f var1, d var2, GameProfile var3, w var4) {
      super(var2, var3);
      var4.q = this;
      this.tA = var4;
      net.u.j var5 = var2.y();
      if(var2.F.A() && var2.B().h() != o9.ADVENTURE) {
         int var6 = Math.max(0, var1.t(var2));
         int var7 = t.L(var2.T().M((double)var5.t(), (double)var5.y()));
         if(var7 < var6) {
            var6 = var7;
         }

         if(var7 <= 1) {
            var6 = 1;
         }

         var5 = var2.D(var5.F(this.p.nextInt(var6 * 2 + 1) - var6, 0, this.p.nextInt(var6 * 2 + 1) - var6));
      }

      this.t9 = var1;
      this.tL = var1.c().r(this);
      this.tr = var1.c().a(this);
      this.ha = 1.0F;
      this.L(var5, 0.0F, 0.0F);

      while(!var2.h(this, this.i()).isEmpty() && this.hS < 255.0D) {
         this.t(this.b, this.hS + 1.0D, this.hr);
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("playerGameType", 99)) {
         if(this.E().u()) {
            this.tA.T(this.E().R());
         } else {
            this.tA.T(o9.M(var1.P("playerGameType")));
         }
      }

      if(var1.K("enteredNetherPosition", 10)) {
         net.nj.f var2 = var1.o("enteredNetherPosition");
         this.td = new net.u.r(var2.g("x"), var2.g("y"), var2.g("z"));
      }

      this.tR = var1.i("seenCredits");
      if(var1.K("recipeBook", 10)) {
         this.tx.h(var1.o("recipeBook"));
      }

   }

   public static void B(net.c0.d var0) {
      var0.U(q.PLAYER, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            String var4 = n.o();
            if(var2.K("RootVehicle", 10)) {
               net.nj.f var5 = var2.o("RootVehicle");
               if(var5.K("Entity", 10)) {
                  var5.K("Entity", var1.w(q.ENTITY, var5.o("Entity"), var3));
               }
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("playerGameType", this.tA.V().x());
      var1.c("seenCredits", this.tR);
      if(this.td != null) {
         net.nj.f var2 = new net.nj.f();
         var2.a("x", this.td.p);
         var2.a("y", this.td.H);
         var2.a("z", this.td.a);
         var1.K("enteredNetherPosition", var2);
      }

      l var6 = this.o();
      l var3 = this.D();
      if(var6 != this && var6.P(h.class).size() == 1) {
         net.nj.f var4 = new net.nj.f();
         net.nj.f var5 = new net.nj.f();
         var6.d(var5);
         var4.h("Attach", var3.O());
         var4.K("Entity", var5);
         var1.K("RootVehicle", var4);
      }

      var1.K("recipeBook", this.tx.Y());
   }

   public void N(int var1) {
      super.N(var1);
      this.tp = -1;
   }

   public void E(ks var1, int var2) {
      super.E(var1, var2);
      this.tp = -1;
   }

   public void vE() {
      this.aG.w(this);
   }

   public void w() {
      super.w();
      this.t1.h((k)(new sf(this.a(), sf.q.ENTER_COMBAT)));
   }

   public void S() {
      super.S();
      this.t1.h((k)(new sf(this.a(), sf.q.END_COMBAT)));
   }

   protected void f(net.yw.n var1) {
      b2.F.d(this, var1);
   }

   protected ag J() {
      return new af(this);
   }

   public void A() {
      this.tA.A();
      --this.t5;
      if(this.I > 0) {
         --this.I;
      }

      this.aG.u();
      if(!this.hl.x && !this.aG.N(this)) {
         this.x();
         this.aG = this.aW;
      }

      while(!this.tG.isEmpty()) {
         int var1 = Math.min(this.tG.size(), Integer.MAX_VALUE);
         int[] var2 = new int[var1];
         Iterator var3 = this.tG.iterator();
         int var4 = 0;

         while(var3.hasNext() && var4 < var1) {
            var2[var4++] = ((Integer)var3.next()).intValue();
            var3.remove();
         }

         this.t1.h((k)(new net.no.n(var2)));
      }

      l var5 = this.y();
      if(var5 != this) {
         if(var5.P()) {
            this.D(var5.b, var5.hS, var5.hr, var5.hN, var5.V);
            this.t9.c().H(this);
            if(this.Q()) {
               this.Y((l)this);
            }
         } else {
            this.Y((l)this);
         }
      }

      b2.x.F(this);
      if(this.tn != null) {
         b2.g.s(this, this.tn, this.x - this.tV);
      }

      this.tr.N(this);
   }

   public void j() {
      String var1 = n.o();
      super.A();
      int var2 = 0;
      if(var2 < this.a8.e()) {
         ks var3 = this.a8.A(var2);
         if(!var3.B() && var3.Z().j()) {
            k var4 = ((y6)var3.Z()).U(var3, this.hl, this);
            this.t1.h(var4);
         }

         ++var2;
         net.u.d.h(new net.u.d[1]);
      }

      if(this.h() != this.tS || this.tt != this.ae.Z() || Float.compare(this.ae.M(), 0.0F) == 0 != this.tP) {
         this.t1.h((k)(new net.no.h(this.h(), this.ae.Z(), this.ae.M())));
         this.tS = this.h();
         this.tt = this.ae.Z();
         this.tP = Float.compare(this.ae.M(), 0.0F) == 0;
      }

      if(Float.compare(this.h() + this.y(), this.tc) != 0) {
         this.tc = this.h() + this.y();
         this.J(u.B, t.Y(this.tc));
      }

      if(this.ae.Z() != this.tC) {
         this.tC = this.ae.Z();
         this.J(u.g, t.Y((float)this.tC));
      }

      if(this.b() != this.tj) {
         this.tj = this.b();
         this.J(u.P, t.Y((float)this.tj));
      }

      if(this.U() != this.tf) {
         this.tf = this.U();
         this.J(u.E, t.Y((float)this.tf));
      }

      if(this.ac != this.tl) {
         this.tl = this.ac;
         this.J(u.m, t.Y((float)this.tl));
      }

      if(this.aX != this.tW) {
         this.tW = this.aX;
         this.J(u.p, t.Y((float)this.tW));
      }

      if(this.ac != this.tp) {
         this.tp = this.ac;
         this.t1.h((k)(new s9(this.aP, this.ac, this.aX)));
      }

      if(this.x % 20 == 0) {
         b2.u.o(this);
      }

   }

   private void J(u var1, int var2) {
      for(net.nc.l var4 : this.Y().N(var1)) {
         o var5 = this.Y().p(this.Q(), var4);
         var5.A(var2);
      }

   }

   public void O(net.yz.z var1) {
      boolean var2 = this.hl.N().b("showDeathMessages");
      this.t1.h((k)(new sf(this.a(), sf.q.ENTITY_DIED, var2)));
      m var3 = this.f();
      if(var3.e() != m.f.ALWAYS) {
         if(var3.e() == m.f.HIDE_FOR_OTHER_TEAMS) {
            this.t9.c().X(this, this.a().A());
         } else if(var3.e() == m.f.HIDE_FOR_OWN_TEAM) {
            this.t9.c().x(this, this.a().A());
         }
      } else {
         this.t9.c().b(this.a().A());
      }

      this.b();
      if(!this.hl.N().b("keepInventory") && !this.VX()) {
         this.v();
         this.a8.v();
      }

      for(net.nc.l var4 : this.hl.J().N(u.A)) {
         o var5 = this.Y().p(this.Q(), var4);
         var5.G();
      }

      a var7 = this.O();
      v.m var8 = (v.m)v.V.get(v.K(var7));
      this.S(var8.o);
      var7.D(this, this.Xx, var1);
      this.S(net.v.q.n);
      this.X(net.v.q.t);
      this.e();
      this.I(0, false);
      this.a().Q();
   }

   public void D(l var1, int var2, net.yz.z var3) {
      if(var1 != this) {
         super.D(var1, var2, var3);
         this.p(var2);
         Collection var4 = this.Y().N(u.h);
         if(var1 instanceof r) {
            this.S(net.v.q.Y);
            var4.addAll(this.Y().N(u.k));
         } else {
            this.S(net.v.q.V);
         }

         var4.addAll(this.q(var1));

         for(net.nc.l var6 : var4) {
            this.Y().p(this.Q(), var6).G();
         }

         b2.Q.z(this, var1, var3);
      }

   }

   private Collection q(l var1) {
      String var2 = var1 instanceof r?var1.Q():var1.r();
      net.nc.y var3 = this.Y().A(this.Q());
      int var4 = var3.b().c();
      if(var4 < u.G.length) {
         for(net.nc.l var6 : this.Y().N(u.G[var4])) {
            o var7 = this.Y().p(var2, var6);
            var7.G();
         }
      }

      net.nc.y var8 = this.Y().A(var2);
      int var9 = var8.b().c();
      return (Collection)(var9 < u.r.length?this.Y().N(u.r[var9]):Lists.newArrayList());
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         boolean var3 = this.t9.a() && this._k() && "fall".equals(var1.M);
         if(this.t5 > 0 && var1 != net.yz.z.s) {
            return false;
         } else {
            if(var1 instanceof net.yz.v) {
               l var4 = var1.v();
               if(var4 instanceof r && !this.A((r)var4)) {
                  return false;
               }

               if(var4 instanceof net.n1.o) {
                  net.n1.o var5 = (net.n1.o)var4;
                  if(var5.kx instanceof r && !this.A((r)var5.kx)) {
                     return false;
                  }
               }
            }

            return super.H(var1, var2);
         }
      }
   }

   public boolean A(r var1) {
      return this._k() && super.A(var1);
   }

   private boolean _k() {
      return this.t9.C();
   }

   @Nullable
   public l V(int var1) {
      this.t4 = true;
      if(this.y == 0 && var1 == -1) {
         this.td = new net.u.r(this.b, this.hS, this.hr);
      } else if(this.y != -1) {
         this.td = null;
      }

      if(this.y == 1 && var1 == 1) {
         this.hl.W((l)this);
         if(!this.tB) {
            this.tB = true;
            this.t1.h((k)(new i1(4, this.tR?0.0F:1.0F)));
            this.tR = true;
         }

         return this;
      } else {
         if(this.y == 0 && var1 == 1) {
            var1 = 1;
         }

         this.t9.c().L(this, var1);
         this.t1.h((k)(new net.no.a(1032, net.u.j.V, 0, false)));
         this.tp = -1;
         this.tS = -1.0F;
         this.tt = -1;
         return this;
      }
   }

   public boolean b(h var1) {
      return var1.VX()?this.y() == this:!this.VX() && super.b(var1);
   }

   private void R(net.ni.v var1) {
      net.no.k var2 = var1.q();
      this.t1.h((k)var2);
   }

   public void U(l var1, int var2) {
      super.U(var1, var2);
      this.aG.u();
   }

   public r.n M(net.u.j var1) {
      r.n var2 = super.M(var1);
      if(var2 == r.n.OK) {
         this.S(net.v.q.w);
         su var3 = new su(this, var1);
         this.j().K().z(this, var3);
         this.t1.k(this.b, this.hS, this.hr, this.hN, this.V);
         this.t1.h((k)var3);
         b2.e.o(this);
      }

      return var2;
   }

   public void H(boolean var1, boolean var2, boolean var3) {
      if(this.L()) {
         this.j().K().X(this, new sb(this, 2));
      }

      super.H(var1, var2, var3);
      if(this.t1 != null) {
         this.t1.k(this.b, this.hS, this.hr, this.hN, this.V);
      }

   }

   public boolean E(l var1, boolean var2) {
      l var3 = this.D();
      if(!super.E(var1, var2)) {
         return false;
      } else {
         l var4 = this.D();
         if(var4 != var3 && this.t1 != null) {
            this.t1.k(this.b, this.hS, this.hr, this.hN, this.V);
         }

         return true;
      }
   }

   public void O() {
      l var1 = this.D();
      super.O();
      l var2 = this.D();
      if(var2 != var1 && this.t1 != null) {
         this.t1.k(this.b, this.hS, this.hr, this.hN, this.V);
      }

   }

   public boolean w(net.yz.z var1) {
      return super.w(var1) || this.__();
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
   }

   protected void a(net.u.j var1) {
      if(!this.VX()) {
         super.a(var1);
      }

   }

   public void D(double var1, boolean var3) {
      int var4 = t.L(this.b);
      int var5 = t.L(this.hS - 0.20000000298023224D);
      int var6 = t.L(this.hr);
      net.u.j var7 = new net.u.j(var4, var5, var6);
      net.yw.n var8 = this.hl.Z(var7);
      if(var8.n() == net.y1.l.q) {
         net.u.j var9 = var7.b();
         net.yw.n var10 = this.hl.Z(var9);
         net.y9.l var11 = var10.Q();
         if(var11 instanceof r3 || var11 instanceof ln || var11 instanceof re) {
            var7 = var9;
            var8 = var10;
         }
      }

      super.s(var1, var3, var8, var7);
   }

   public void u(sg var1) {
      var1.M(this);
      this.t1.h((k)(new il(var1.C())));
   }

   private void vJ() {
      this.ti = this.ti % 100 + 1;
   }

   public void x(net.yv.z var1) {
      if(var1 instanceof net.y7.i && ((net.y7.i)var1).j() != null && this.VX()) {
         this.g((new net.cb.h("container.spectatorCantOpen", new Object[0])).r((new net.cb.f()).i(net.cb.z.RED)), true);
      } else {
         this.vJ();
         this.t1.h((k)(new sy(this.ti, var1.H(), var1.b())));
         this.aG = var1.A(this.a8, this);
         this.aG.S = this.ti;
         this.aG.w(this);
      }

   }

   public void n(z1 var1) {
      if(var1 instanceof net.y7.i && ((net.y7.i)var1).j() != null && this.VX()) {
         this.g((new net.cb.h("container.spectatorCantOpen", new Object[0])).r((new net.cb.f()).i(net.cb.z.RED)), true);
      } else {
         if(this.aG != this.aW) {
            this.x();
         }

         if(var1 instanceof x) {
            x var2 = (x)var1;
            if(var2.U() && !this.D(var2.z()) && !this.VX()) {
               this.t1.h((k)(new i0(new net.cb.h("container.isLocked", new Object[]{var1.b()}), c.GAME_INFO)));
               this.t1.h((k)(new sl(net.nb.l.MO, net.yz.p.BLOCKS, this.b, this.hS, this.hr, 1.0F, 1.0F)));
               return;
            }
         }

         this.vJ();
         if(var1 instanceof net.yv.z) {
            this.t1.h((k)(new sy(this.ti, ((net.yv.z)var1).H(), var1.b(), var1.e())));
            this.aG = ((net.yv.z)var1).A(this.a8, this);
         } else {
            this.t1.h((k)(new sy(this.ti, "minecraft:container", var1.b(), var1.e())));
            this.aG = new net.nl.a(this.a8, var1, this);
         }

         this.aG.S = this.ti;
         this.aG.w(this);
      }

   }

   public void g(net.ne.m var1) {
      this.vJ();
      this.aG = new net.nl.q(this.a8, var1, this.hl);
      this.aG.S = this.ti;
      this.aG.w(this);
      zw var2 = ((net.nl.q)this.aG).v();
      net.cb.t var3 = var1.b();
      this.t1.h((k)(new sy(this.ti, "minecraft:villager", var3, var2.e())));
      net.nq.z var4 = var1.L((r)this);
      net.n2.h var5 = new net.n2.h(Unpooled.buffer());
      var5.writeInt(this.ti);
      var4.M(var5);
      this.t1.h((k)(new sw("MC|TrList", var5)));
   }

   public void F(net.yn.j var1, z1 var2) {
      if(this.aG != this.aW) {
         this.x();
      }

      this.vJ();
      this.t1.h((k)(new sy(this.ti, "EntityHorse", var2.b(), var2.e(), var1.G())));
      this.aG = new b(this.a8, var2, var1, this);
      this.aG.S = this.ti;
      this.aG.w(this);
   }

   public void Q(ks var1, net.yz.k var2) {
      net.n0.y var3 = var1.Z();
      if(var3 == net.nb.j.e) {
         net.n2.h var4 = new net.n2.h(Unpooled.buffer());
         var4.A(var2);
         this.t1.h((k)(new sw("MC|BOpen", var4)));
      }

   }

   public void v(net.ni.q var1) {
      var1.y(true);
      this.R(var1);
   }

   public void b(net.nl.v var1, int var2, ks var3) {
      if(!(var1.f(var2) instanceof net.nl.t)) {
         if(var1 == this.aW) {
            b2.d.c(this, this.a8);
         }

         if(!this.tK) {
            this.t1.h((k)(new net.no.r(var1.S, var2, var3)));
         }
      }

   }

   public void J(net.nl.v var1) {
      this.R(var1, var1.j());
   }

   public void R(net.nl.v var1, net.yz.w var2) {
      this.t1.h((k)(new i5(var1.S, var2)));
      this.t1.h((k)(new net.no.r(-1, -1, this.a8.j())));
   }

   public void A(net.nl.v var1, int var2, int var3) {
      this.t1.h((k)(new net.no.i(var1.S, var2, var3)));
   }

   public void t(net.nl.v var1, z1 var2) {
      for(int var3 = 0; var3 < var2.r(); ++var3) {
         this.t1.h((k)(new net.no.i(var1.S, var3, var2.e(var3))));
      }

   }

   public void x() {
      this.t1.h((k)(new ic(this.aG.S)));
      this.vQ();
   }

   public void vg() {
      if(!this.tK) {
         this.t1.h((k)(new net.no.r(-1, -1, this.a8.j())));
      }

   }

   public void vQ() {
      this.aG.K(this);
      this.aG = this.aW;
   }

   public void B(float var1, float var2, boolean var3, boolean var4) {
      if(this.M()) {
         if(var1 >= -1.0F && var1 <= 1.0F) {
            this.XG = var1;
         }

         if(var2 >= -1.0F && var2 <= 1.0F) {
            this.XK = var2;
         }

         this.XL = var3;
         this.K(var4);
      }

   }

   public void m(net.v.n var1, int var2) {
      this.tL.n(this, var1, var2);

      for(net.nc.l var4 : this.Y().N(var1.j())) {
         this.Y().p(this.Q(), var4).R(var2);
      }

   }

   public void X(net.v.n var1) {
      this.tL.H(this, var1, 0);

      for(net.nc.l var3 : this.Y().N(var1.j())) {
         this.Y().p(this.Q(), var3).A(0);
      }

   }

   public void y(List var1) {
      this.tx.A(var1, this);
   }

   public void x(m_[] var1) {
      ArrayList var2 = Lists.newArrayList();

      for(m_ var6 : var1) {
         var2.add(net.cr.n.o(var6));
      }

      this.y((List)var2);
   }

   public void Y(List var1) {
      this.tx.S(var1, this);
   }

   public void vR() {
      this.tX = true;
      this.Y();
      if(this.as) {
         this.H(true, false, false);
      }

   }

   public boolean _r() {
      return this.tX;
   }

   public void vl() {
      this.tS = -1.0E8F;
   }

   public void g(net.cb.t var1, boolean var2) {
      this.t1.h((k)(new i0(var1, c.GAME_INFO)));
   }

   public void n() {
      if(!this.AI.B() && this.F()) {
         this.t1.h((k)(new sc(this, (byte)9)));
         super.n();
      }

   }

   public void E(h var1, boolean var2) {
      this.a8.e(var1.a8);
      this.u(var1.h());
      this.ae = var1.ae;
      this.aX = var1.aX;
      this.ac = var1.ac;
      this.aP = var1.aP;
      this.Q(var1.N());
      this.R = var1.R;
      this.hZ = var1.hZ;
      this.s = var1.s;
      this.a_ = var1.a_;
      this.aE = var1.aE;
      this.A().d(ab, var1.A().a(ab));
      this.tp = -1;
      this.tS = -1.0F;
      this.tt = -1;
      this.tx.N(var1.tx);
      this.tG.addAll(var1.tG);
      this.tR = var1.tR;
      this.td = var1.td;
      this.y((net.nj.f)var1.O());
      this.d(var1.m());
   }

   protected void B(net.n_.i var1) {
      super.B(var1);
      this.t1.h((k)(new net.no.v(this.G(), var1)));
      if(var1.i() == net.nb.b.A) {
         this.tV = this.x;
         this.tn = new net.u.r(this.b, this.hS, this.hr);
      }

      b2.s.u(this);
   }

   protected void b(net.n_.i var1, boolean var2) {
      super.b(var1, var2);
      this.t1.h((k)(new net.no.v(this.G(), var1)));
      b2.s.u(this);
   }

   protected void D(net.n_.i var1) {
      super.D((net.n_.i)var1);
      this.t1.h((k)(new se(this.G(), var1.i())));
      if(var1.i() == net.nb.b.A) {
         this.tn = null;
      }

      b2.s.u(this);
   }

   public void a(double var1, double var3, double var5) {
      this.t1.k(var1, var3, var5, this.hN, this.V);
   }

   public void p(l var1) {
      this.j().K().X(this, new sb(var1, 4));
   }

   public void y(l var1) {
      this.j().K().X(this, new sb(var1, 5));
   }

   public void m() {
      if(this.t1 != null) {
         this.t1.h((k)(new net.no.c(this.a6)));
         this.t();
      }

   }

   public d j() {
      return (d)this.hl;
   }

   public void s(o9 var1) {
      this.tA.T(var1);
      this.t1.h((k)(new i1(3, (float)var1.x())));
      if(var1 == o9.SPECTATOR) {
         this.b();
         this.O();
      } else {
         this.Y((l)this);
      }

      this.m();
      this.J();
   }

   public boolean VX() {
      return this.tA.V() == o9.SPECTATOR;
   }

   public boolean V8() {
      return this.tA.V() == o9.CREATIVE;
   }

   public void r(net.cb.t var1) {
      this.t1.h((k)(new i0(var1)));
   }

   public boolean n(int var1, String var2) {
      if("seed".equals(var2) && !this.t9.a()) {
         return true;
      } else if(!"tell".equals(var2) && !"help".equals(var2) && !"me".equals(var2) && !"trigger".equals(var2)) {
         if(this.t9.c().Q(this.e())) {
            g var3 = (g)this.t9.c().z().g(this.e());
            return var3.x() >= var1;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public String w() {
      String var1 = this.t1.c.s().toString();
      var1 = var1.substring(var1.indexOf("/") + 1);
      var1 = var1.substring(0, var1.indexOf(":"));
      return var1;
   }

   public void k(net.m.h var1) {
      this.tI = var1.j();
      this.tk = var1.Q();
      this.tv = var1.P();
      this.A().d(ab, Byte.valueOf((byte)var1.z()));
      this.A().d(aN, Byte.valueOf((byte)(var1.k() == aa.LEFT?0:1)));
   }

   public r.b y() {
      return this.tk;
   }

   public void F(String var1, String var2) {
      this.t1.h((k)(new iu(var1, var2)));
   }

   public net.u.j z() {
      return new net.u.j(this.b, this.hS + 0.5D, this.hr);
   }

   public void vi() {
      this.tU = f.X();
   }

   public p b() {
      return this.tL;
   }

   public y y() {
      return this.tx;
   }

   public void O(l var1) {
      if(var1 instanceof r) {
         this.t1.h((k)(new net.no.n(new int[]{var1.G()})));
      } else {
         this.tG.add(Integer.valueOf(var1.G()));
      }

   }

   public void Z(l var1) {
      this.tG.remove(Integer.valueOf(var1.G()));
   }

   protected void t() {
      if(this.VX()) {
         this.o();
         this.i(true);
      } else {
         super.t();
      }

      this.j().K().e(this);
   }

   public l y() {
      return (l)(this.tH == null?this:this.tH);
   }

   public void Y(l var1) {
      l var2 = this.y();
      this.tH = this;
      if(var2 != this.tH) {
         this.t1.h((k)(new sm(this.tH)));
         this.a(this.tH.b, this.tH.hS, this.tH.hr);
      }

   }

   protected void U() {
      if(this.hH > 0 && !this.t4) {
         --this.hH;
      }

   }

   public void r(l var1) {
      if(this.tA.V() == o9.SPECTATOR) {
         this.Y(var1);
      } else {
         super.r(var1);
      }

   }

   public long k() {
      return this.tU;
   }

   @Nullable
   public net.cb.t H() {
      return null;
   }

   public void N(net.yz.k var1) {
      super.N(var1);
      this.H();
   }

   public boolean __() {
      return this.t4;
   }

   public void vo() {
      this.t4 = false;
   }

   public void v_() {
      this.I(7, true);
   }

   public void vv() {
      this.I(7, true);
      this.I(7, false);
   }

   public dq S() {
      return this.tr;
   }

   @Nullable
   public net.u.r c() {
      return this.td;
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
