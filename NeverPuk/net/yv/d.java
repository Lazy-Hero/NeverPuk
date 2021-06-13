package net.yv;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.wg;
import net.xj;
import net.xn;
import net.ne.bk;
import net.no.i1;
import net.no.i6;
import net.no.s0;
import net.no.s6;
import net.no.sc;
import net.no.so;
import net.ns.i9;
import net.w.f_;
import net.yv.g;
import net.yv.h;
import net.yv.j;
import net.yv.l;
import net.yv.m;
import net.yv.n;
import net.yv.o;
import net.yv.o4;
import net.yv.o9;
import net.yv.ov;
import net.yv.r;
import net.yv.t;
import net.yv.u;
import net.yz.ai;
import net.yz.ao;
import net.yz.aw;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d extends r implements aw {
   private static final Logger p = LogManager.getLogger();
   private final net.nx.f Dy;
   private final bk t;
   private final net.n.m I;
   private final Set D0 = Sets.newHashSet();
   private final TreeSet DG = new TreeSet();
   private final Map j = Maps.newHashMap();
   public boolean Y;
   private boolean X;
   private int w;
   private final n DD;
   private final o4 Z = new o4();
   protected final net.nq.b Ds = new net.nq.b(this);
   private final d.o[] Dg = new d.o[]{new d.o(), new d.o()};
   private int e;
   private final List DR = Lists.newArrayList();

   public d(net.nx.f var1, net.cg.d var2, net.cg.z var3, int var4, net.yk.t var5) {
      super(var2, var3, h.M(var4).H(), var5, false);
      this.Dy = var1;
      this.t = new bk(this);
      this.I = new net.n.m(this);
      this.F.z(this);
      this.m = this.X();
      this.DD = new n(this);
      this.u();
      this.Q();
      this.T().p(var1.t());
   }

   public r H() {
      this.i = new net.cg.y(this.v);
      String var1 = net.nq.w.j(this.F);
      net.nq.w var2 = (net.nq.w)this.i.a(net.nq.w.class, var1);
      this.P = new net.nq.w(this);
      this.i.z(var1, this.P);
      this.H = new net.nc.n(this.Dy);
      net.nc.f var3 = (net.nc.f)this.i.a(net.nc.f.class, "scoreboard");
      var3 = new net.nc.f();
      this.i.z("scoreboard", var3);
      var3.u(this.H);
      ((net.nc.n)this.H).r(new net.cg.x(var3));
      this.b = new net.y7.t(new File(new File(this.v.G(), "data"), "loot_tables"));
      this.O = new wg(new File(new File(this.v.G(), "data"), "advancements"));
      this.B = new xj(new File(new File(this.v.G(), "data"), "functions"), this.Dy);
      this.T().w(this.y.H(), this.y.s());
      this.T().t(this.y.B());
      this.T().B(this.y.t());
      this.T().H(this.y.i());
      this.T().D(this.y.w());
      if(this.y.t() > 0L) {
         this.T().n(this.y.x(), this.y.G(), this.y.t());
      } else {
         this.T().h(this.y.x());
      }

      return this;
   }

   public void k() {
      super.k();
      if(this.B().b() && this.k() != l.HARD) {
         this.B().b(l.HARD);
      }

      this.F.p().M();
      if(this.l()) {
         if(this.N().b("doDaylightCycle")) {
            long var1 = this.y.A() + 24000L;
            this.y.l(var1 - var1 % 24000L);
         }

         this.i();
      }

      this.M.K("mobSpawner");
      if(this.N().b("doMobSpawning") && this.y.h() != j.J) {
         this.Z.X(this, this.R, this.K, this.y.m() % 400L == 0L);
      }

      this.M.F("chunkSource");
      this.m.Y();
      int var3 = this.E(1.0F);
      if(var3 != this.y()) {
         this.U(var3);
      }

      this.y.q(this.y.m() + 1L);
      if(this.N().b("doDaylightCycle")) {
         this.y.l(this.y.A() + 1L);
      }

      this.M.F("tickPending");
      this.b(false);
      this.M.F("tickBlocks");
      this.s();
      this.M.F("chunkMap");
      this.I.x();
      this.M.F("village");
      this.P.N();
      this.Ds.w();
      this.M.F("portalForcer");
      this.DD.z(this.y());
      this.M.N();
      this.e();
   }

   @Nullable
   public net.ns.i L(net.ne.q var1, net.u.j var2) {
      List var3 = this.E().W(var1, var2);
      return !var3.isEmpty()?(net.ns.i)net.yz.b.g(this.G, var3):null;
   }

   public boolean d(net.ne.q var1, net.ns.i var2, net.u.j var3) {
      List var4 = this.E().W(var1, var3);
      return !var4.isEmpty() && var4.contains(var2);
   }

   public void U() {
      this.X = false;
      if(!this.A.isEmpty()) {
         int var1 = 0;
         int var2 = 0;

         for(net.r.r var4 : this.A) {
            if(var4.VX()) {
               ++var1;
            } else if(var4.L()) {
               ++var2;
            }
         }

         this.X = var2 >= this.A.size() - var1;
      }

   }

   protected void i() {
      this.X = false;

      for(net.r.r var2 : (List)this.A.stream().filter(net.r.r::L).collect(Collectors.toList())) {
         var2.H(false, false, true);
      }

      if(this.N().b("doWeatherCycle")) {
         this.C();
      }

   }

   private void C() {
      this.y.P(0);
      this.y.d(false);
      this.y.H(0);
      this.y.p(false);
   }

   public boolean l() {
      if(this.X && !this.x) {
         for(net.r.r var2 : this.A) {
            if(!var2.VX() && !var2.Vh()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void A() {
      if(this.y.o() <= 0) {
         this.y.C(this.k() + 1);
      }

      int var1 = this.y.h();
      int var2 = this.y.Q();
      int var3 = 0;

      while(this.i(new net.u.j(var1, 0, var2)).n() == net.y1.l.q) {
         var1 += this.G.nextInt(8) - this.G.nextInt(8);
         var2 += this.G.nextInt(8) - this.G.nextInt(8);
         ++var3;
         if(var3 == 10000) {
            break;
         }
      }

      this.y.r(var1);
      this.y.l(var2);
   }

   protected boolean T(int var1, int var2, boolean var3) {
      return this.E().W(var1, var2);
   }

   protected void q() {
      this.M.K("playerCheckLight");
      if(!this.A.isEmpty()) {
         int var1 = this.G.nextInt(this.A.size());
         net.r.r var2 = (net.r.r)this.A.get(var1);
         int var3 = net.u.t.L(var2.b) + this.G.nextInt(11) - 5;
         int var4 = net.u.t.L(var2.hS) + this.G.nextInt(11) - 5;
         int var5 = net.u.t.L(var2.hr) + this.G.nextInt(11) - 5;
         this.m(new net.u.j(var3, var4, var5));
      }

      this.M.N();
   }

   protected void s() {
      r.C();
      this.q();
      if(this.y.h() == j.J) {
         Iterator var2 = this.I.S();
         if(var2.hasNext()) {
            ((net.l.q)var2.next()).A(false);
         }
      }

      int var20 = this.N().C("randomTickSpeed");
      boolean var3 = this.b();
      boolean var4 = this.V();
      this.M.K("pollingChunks");
      Iterator var5 = this.I.S();
      if(var5.hasNext()) {
         this.M.K("getChunk");
         net.l.q var6 = (net.l.q)var5.next();
         int var7 = var6.Q * 16;
         int var8 = var6.U * 16;
         this.M.F("checkNextLight");
         var6.z();
         this.M.F("tickChunk");
         var6.A(false);
         this.M.F("thunder");
         if(var3 && var4 && this.G.nextInt(100000) == 0) {
            this.D = this.D * 3 + 1013904223;
            int var9 = this.D >> 2;
            net.u.j var10 = this.q(new net.u.j(var7 + (var9 & 15), 0, var8 + (var9 >> 8 & 15)));
            if(this.F(var10)) {
               g var11 = this.G(var10);
               if(this.N().b("doMobSpawning") && Double.compare(this.G.nextDouble(), (double)var11.V() * 0.01D) < 0) {
                  net.yn.e var12 = new net.yn.e(this);
                  var12.X(true);
                  var12.V(0);
                  var12.t((double)var10.t(), (double)var10.h(), (double)var10.y());
                  this.S(var12);
                  this.i(new net.yi.e(this, (double)var10.t(), (double)var10.h(), (double)var10.y(), true));
               }

               this.i(new net.yi.e(this, (double)var10.t(), (double)var10.h(), (double)var10.y(), false));
            }
         }

         this.M.F("iceandsnow");
         if(this.G.nextInt(16) == 0) {
            this.D = this.D * 3 + 1013904223;
            int var21 = this.D >> 2;
            net.u.j var23 = this.d((net.u.j)(new net.u.j(var7 + (var21 & 15), 0, var8 + (var21 >> 8 & 15))));
            net.u.j var25 = var23.b();
            if(this.a(var25)) {
               this.U(var25, net.nb.f.oD.p());
            }

            if(var3 && this.b(var23, true)) {
               this.U(var23, net.nb.f.Tl.p());
            }

            if(var3 && this.P(var25).D()) {
               this.Z(var25).Q().R(this, var25);
            }
         }

         this.M.F("tickBlocks");
         if(var20 > 0) {
            net.ny.f[] var22 = var6.R();
            int var24 = var22.length;
            int var26 = 0;
            if(var26 < var24) {
               net.ny.f var28 = var22[var26];
               if(var28 != net.l.q.E && var28.V()) {
                  int var13 = 0;
                  if(var13 < var20) {
                     this.D = this.D * 3 + 1013904223;
                     int var14 = this.D >> 2;
                     int var15 = var14 & 15;
                     int var16 = var14 >> 8 & 15;
                     int var17 = var14 >> 16 & 15;
                     net.yw.n var18 = var28.j(var15, var17, var16);
                     net.y9.l var19 = var18.Q();
                     this.M.K("randomTick");
                     if(var19.j()) {
                        var19.i(this, new net.u.j(var15 + var7, var17 + var28.A(), var16 + var8), var18, this.G);
                     }

                     this.M.N();
                     ++var13;
                  }
               }

               ++var26;
            }
         }

         this.M.N();
      }

      this.M.N();
   }

   protected net.u.j q(net.u.j var1) {
      net.u.j var2 = this.d((net.u.j)var1);
      net.u.e var3 = (new net.u.e(var2, new net.u.j(var2.t(), this.Z(), var2.y()))).x(3.0D);
      List var4 = this.L(net.ne.a.class, var3, new com.google.common.base.Predicate() {
         public boolean s(@Nullable net.ne.a var1) {
            net.u.d[] var2 = r.C();
            return var1 != null && var1.P() && d.this.V(var1.z());
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      if(!var4.isEmpty()) {
         return ((net.ne.a)var4.get(this.G.nextInt(var4.size()))).z();
      } else {
         if(var2.h() == -1) {
            var2 = var2.J(2);
         }

         return var2;
      }
   }

   public boolean M(net.u.j var1, net.y9.l var2) {
      o var3 = new o(var1, var2);
      return this.DR.contains(var3);
   }

   public boolean o(net.u.j var1, net.y9.l var2) {
      o var3 = new o(var1, var2);
      return this.D0.contains(var3);
   }

   public void c(net.u.j var1, net.y9.l var2, int var3) {
      this.V(var1, var2, var3, 0);
   }

   public void V(net.u.j var1, net.y9.l var2, int var3, int var4) {
      net.y1.l var5 = var2.p().n();
      if(this.f && var5 != net.y1.l.q) {
         if(var2.c()) {
            if(this.C(var1.F(-8, -8, -8), var1.F(8, 8, 8))) {
               net.yw.n var7 = this.Z(var1);
               if(var7.n() != net.y1.l.q && var7.Q() == var2) {
                  var7.Q().P(this, var1, var7, this.G);
               }
            }

            return;
         }

         var3 = 1;
      }

      o var6 = new o(var1, var2);
      if(this.o(var1)) {
         if(var5 != net.y1.l.q) {
            var6.D((long)var3 + this.y.m());
            var6.E(var4);
         }

         if(!this.D0.contains(var6)) {
            this.D0.add(var6);
            this.DG.add(var6);
         }
      }

   }

   public void c(net.u.j var1, net.y9.l var2, int var3, int var4) {
      o var5 = new o(var1, var2);
      var5.E(var4);
      net.y1.l var6 = var2.p().n();
      if(var6 != net.y1.l.q) {
         var5.D((long)var3 + this.y.m());
      }

      if(!this.D0.contains(var5)) {
         this.D0.add(var5);
         this.DG.add(var5);
      }

   }

   public void r() {
      if(this.A.isEmpty()) {
         if(this.w++ >= 300) {
            return;
         }
      } else {
         this.w();
      }

      this.F.G();
      super.r();
   }

   protected void X() {
      super.X();
      this.M.F("players");

      for(int var1 = 0; var1 < this.A.size(); ++var1) {
         net.ne.l var2 = (net.ne.l)this.A.get(var1);
         net.ne.l var3 = var2.D();
         if(var3.Z || !var3.m(var2)) {
            var2.O();
            this.M.K("tick");
            if(!var2.Z) {
               this.E(var2);
            }

            this.M.N();
            this.M.K("remove");
            if(var2.Z) {
               int var4 = var2.Q;
               int var5 = var2.f;
               if(var2.U && this.T(var4, var5, true)) {
                  this.q(var4, var5).f(var2);
               }

               this.J.remove(var2);
               this.d(var2);
            }

            this.M.N();
         }
      }

   }

   public void w() {
      this.w = 0;
   }

   public boolean b(boolean var1) {
      if(this.y.h() == j.J) {
         return false;
      } else {
         int var2 = this.DG.size();
         if(var2 != this.D0.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
         } else {
            if(var2 > 65536) {
               var2 = 65536;
            }

            this.M.K("cleaning");

            for(int var3 = 0; var3 < var2; ++var3) {
               o var4 = (o)this.DG.first();
               if(var4.p > this.y.m()) {
                  break;
               }

               this.DG.remove(var4);
               this.D0.remove(var4);
               this.DR.add(var4);
            }

            this.M.N();
            this.M.K("ticking");
            Iterator var10 = this.DR.iterator();

            while(var10.hasNext()) {
               o var11 = (o)var10.next();
               var10.remove();
               boolean var10000 = false;
               if(this.C(var11.z.F(0, 0, 0), var11.z.F(0, 0, 0))) {
                  net.yw.n var6 = this.Z(var11.z);
                  if(var6.n() != net.y1.l.q && net.y9.l.f(var6.Q(), var11.l())) {
                     var6.Q().P(this, var11.z, var6, this.G);
                  }
               } else {
                  this.c(var11.z, var11.l(), 0);
               }
            }

            this.M.N();
            this.DR.clear();
            return !this.DG.isEmpty();
         }
      }
   }

   @Nullable
   public List D(net.l.q var1, boolean var2) {
      net.u.p var3 = var1.r();
      int var4 = (var3.i << 4) - 2;
      int var5 = var4 + 16 + 2;
      int var6 = (var3.y << 4) - 2;
      int var7 = var6 + 16 + 2;
      return this.d(new net.y4.v(var4, 0, var6, var5, 256, var7), var2);
   }

   @Nullable
   public List d(net.y4.v var1, boolean var2) {
      ArrayList var3 = null;
      int var4 = 0;

      while(true) {
         Iterator var5 = this.DG.iterator();

         while(var5.hasNext()) {
            o var6 = (o)var5.next();
            net.u.j var7 = var6.z;
            if(var7.t() >= var1.i && var7.t() < var1.e && var7.y() >= var1.p && var7.y() < var1.J) {
               this.D0.remove(var6);
               var5.remove();
               var3 = Lists.newArrayList();
               var3.add(var6);
            }
         }

         ++var4;
      }
   }

   public void s(net.ne.l var1, boolean var2) {
      if(!this.N() && (var1 instanceof net.yn.w || var1 instanceof net.yn.f)) {
         var1.B();
      }

      if(!this.p() && var1 instanceof net.ne.c) {
         var1.B();
      }

      super.s(var1, var2);
   }

   private boolean p() {
      return this.Dy.p();
   }

   private boolean N() {
      return this.Dy.B();
   }

   protected net.l.h X() {
      net.ny.j var1 = this.v.d(this.F);
      return new net.cn.l(this, var1, this.F.z());
   }

   public boolean J(net.r.r var1, net.u.j var2) {
      return !this.Dy.M(this, var2, var1) && this.T().U(var2);
   }

   public void h(t var1) {
      if(!this.y.Q()) {
         this.f(var1);
         if(this.y.h() == j.J) {
            this.o();
         }

         super.h(var1);
         this.y.H(true);
      }

   }

   private void o() {
      this.y.h(false);
      this.y.n(true);
      this.y.d(false);
      this.y.p(false);
      this.y.d(1000000000);
      this.y.l(6000L);
      this.y.D(o9.SPECTATOR);
      this.y.O(false);
      this.y.b(l.PEACEFUL);
      this.y.k(true);
      this.N().T("doDaylightCycle", "false");
   }

   private void f(t var1) {
      if(!this.F.X()) {
         this.y.n(net.u.j.V.J(this.F.v()));
      } else if(this.y.h() == j.J) {
         this.y.n(net.u.j.V.h());
      } else {
         this.N = true;
         i9 var2 = this.F.p();
         List var3 = var2.n();
         Random var4 = new Random(this.a());
         net.u.j var5 = var2.R(0, 0, 256, var3, var4);
         int var6 = 8;
         int var7 = this.F.v();
         int var8 = 8;
         var6 = var5.t();
         var8 = var5.y();
         int var9 = 0;

         while(!this.F.i(var6, var8)) {
            var6 += var4.nextInt(64) - var4.nextInt(64);
            var8 += var4.nextInt(64) - var4.nextInt(64);
            ++var9;
            if(var9 == 1000) {
               break;
            }
         }

         this.y.n(new net.u.j(var6, var7, var8));
         this.N = false;
         if(var1.I()) {
            this.K();
         }
      }

   }

   protected void K() {
      f_ var1 = new f_();
      int var2 = 0;

      while(true) {
         int var3 = this.y.h() + this.G.nextInt(6) - this.G.nextInt(6);
         int var4 = this.y.Q() + this.G.nextInt(6) - this.G.nextInt(6);
         net.u.j var5 = this.D(new net.u.j(var3, 0, var4)).h();
         if(var1.K(this, this.G, var5)) {
            return;
         }

         ++var2;
      }
   }

   @Nullable
   public net.u.j q() {
      return this.F.u();
   }

   public void K(boolean var1, @Nullable ao var2) throws ov {
      net.cn.l var3 = this.E();
      if(var3.s()) {
         var2.H("Saving level");
         this.m();
         var2.y("Saving chunks");
         var3.C(var1);

         for(net.l.q var5 : Lists.newArrayList(var3.V())) {
            if(!this.I.K(var5.Q, var5.U)) {
               var3.I(var5);
            }
         }
      }

   }

   public void h() {
      net.cn.l var1 = this.E();
      if(var1.s()) {
         var1.o();
      }

   }

   protected void m() throws ov {
      this.I();

      for(d var4 : this.Dy.w1) {
         if(var4 instanceof m) {
            ((m)var4).S();
         }
      }

      this.y.C(this.T().b());
      this.y.e(this.T().s());
      this.y.Y(this.T().A());
      this.y.f(this.T().C());
      this.y.N(this.T().t());
      this.y.I(this.T().l());
      this.y.E(this.T().N());
      this.y.y(this.T().E());
      this.y.n(this.T().P());
      this.v.Z(this.y, this.Dy.c().w());
      this.i.x();
   }

   public boolean S(net.ne.l var1) {
      return this.e(var1) && super.S(var1);
   }

   public void r(Collection var1) {
      for(net.ne.l var3 : Lists.newArrayList(var1)) {
         if(this.e(var3)) {
            this.J.add(var3);
            this.z(var3);
         }
      }

   }

   private boolean e(net.ne.l var1) {
      if(var1.Z) {
         p.warn("Tried to add entity {} but it was marked as removed already", net.ne.v.K(var1));
         return false;
      } else {
         UUID var2 = var1.O();
         if(this.j.containsKey(var2)) {
            net.ne.l var3 = (net.ne.l)this.j.get(var2);
            if(this.q.contains(var3)) {
               this.q.remove(var3);
            } else {
               if(!(var1 instanceof net.r.r)) {
                  p.warn("Keeping entity {} that already exists with UUID {}", net.ne.v.K(var3), var2.toString());
                  return false;
               }

               p.warn("Force-added player with duplicate UUID {}", var2.toString());
            }

            this.g(var3);
         }

         return true;
      }
   }

   protected void z(net.ne.l var1) {
      super.z(var1);
      this.Q.t(var1.G(), var1);
      this.j.put(var1.O(), var1);
      net.ne.l[] var2 = var1.T();

      for(net.ne.l var6 : var2) {
         this.Q.t(var6.G(), var6);
      }

   }

   protected void d(net.ne.l var1) {
      super.d(var1);
      this.Q.J(var1.G());
      this.j.remove(var1.O());
      net.ne.l[] var2 = var1.T();

      for(net.ne.l var6 : var2) {
         this.Q.J(var6.G());
      }

   }

   public boolean i(net.ne.l var1) {
      if(super.i(var1)) {
         this.Dy.c().c((net.r.r)null, var1.b, var1.hS, var1.hr, 512.0D, this.F.L().M(), new s0(var1));
         return true;
      } else {
         return false;
      }
   }

   public void k(net.ne.l var1, byte var2) {
      this.K().X(var1, new sc(var1, var2));
   }

   public net.cn.l E() {
      return (net.cn.l)super.G();
   }

   public u c(@Nullable net.ne.l var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      u var11 = new u(this, var1, var2, var4, var6, var8, var9, var10);
      var11.o();
      var11.p(false);
      var11.u();

      for(net.r.r var13 : this.A) {
         if(var13.o(var2, var4, var6) < 4096.0D) {
            ((net.r.h)var13).t1.h((net.n2.k)(new so(var2, var4, var6, var8, var11.e(), (net.u.r)var11.g().get(var13))));
         }
      }

      return var11;
   }

   public void x(net.u.j var1, net.y9.l var2, int var3, int var4) {
      net.y9.g var5 = new net.y9.g(var1, var2, var3, var4);

      for(net.y9.g var7 : this.Dg[this.e]) {
         if(var7.equals(var5)) {
            return;
         }
      }

      this.Dg[this.e].add(var5);
   }

   private void e() {
      while(!this.Dg[this.e].isEmpty()) {
         int var1 = this.e;
         this.e ^= 1;

         for(net.y9.g var3 : this.Dg[var1]) {
            if(this.H(var3)) {
               this.Dy.c().c((net.r.r)null, (double)var3.U().t(), (double)var3.U().h(), (double)var3.U().y(), 64.0D, this.F.L().M(), new i6(var3.U(), var3.S(), var3.p(), var3.v()));
            }
         }

         this.Dg[var1].clear();
      }

   }

   private boolean H(net.y9.g var1) {
      net.yw.n var2 = this.Z(var1.U());
      return var2.Q() == var1.S() && var2.G(this, var1.U(), var1.p(), var1.v());
   }

   public void E() {
      this.v.K();
   }

   protected void n() {
      boolean var1 = this.b();
      super.n();
      if(this.u != this.n) {
         this.Dy.c().J(new i1(7, this.n), this.F.L().M());
      }

      if(this.k != this.l) {
         this.Dy.c().J(new i1(8, this.l), this.F.L().M());
      }

      if(var1 != this.b()) {
         this.Dy.c().U(new i1(2, 0.0F));
         this.Dy.c().U(new i1(7, this.n));
         this.Dy.c().U(new i1(8, this.l));
      }

   }

   @Nullable
   public net.nx.f v() {
      return this.Dy;
   }

   public bk K() {
      return this.t;
   }

   public net.n.m m() {
      return this.I;
   }

   public n A() {
      return this.DD;
   }

   public net.yj.e A() {
      return this.v.N();
   }

   public void q(ai var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15, int... var17) {
      this.m(var1, false, var2, var4, var6, var8, var9, var11, var13, var15, var17);
   }

   public void m(ai var1, boolean var2, double var3, double var5, double var7, int var9, double var10, double var12, double var14, double var16, int... var18) {
      s6 var19 = new s6(var1, var2, (float)var3, (float)var5, (float)var7, (float)var10, (float)var12, (float)var14, (float)var16, var9, var18);

      for(int var20 = 0; var20 < this.A.size(); ++var20) {
         net.r.h var21 = (net.r.h)this.A.get(var20);
         this.N(var21, var2, var3, var5, var7, var19);
      }

   }

   public void u(net.r.h var1, ai var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17, int... var19) {
      s6 var20 = new s6(var2, var3, (float)var4, (float)var6, (float)var8, (float)var11, (float)var13, (float)var15, (float)var17, var10, var19);
      this.N(var1, var3, var4, var6, var8, var20);
   }

   private void N(net.r.h var1, boolean var2, double var3, double var5, double var7, net.n2.k var9) {
      net.u.j var10 = var1.z();
      double var11 = var10.s(var3, var5, var7);
      if(var11 <= 1024.0D || var11 <= 262144.0D) {
         var1.t1.h(var9);
      }

   }

   @Nullable
   public net.ne.l O(UUID var1) {
      return (net.ne.l)this.j.get(var1);
   }

   public ListenableFuture d(Runnable var1) {
      return this.Dy.d(var1);
   }

   public boolean R() {
      return this.Dy.R();
   }

   @Nullable
   public net.u.j p(String var1, net.u.j var2, boolean var3) {
      return this.E().p(this, var1, var2, var3);
   }

   public wg C() {
      return this.O;
   }

   public xj S() {
      return this.B;
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }

   static class o extends ArrayList {
      private o() {
      }
   }
}
