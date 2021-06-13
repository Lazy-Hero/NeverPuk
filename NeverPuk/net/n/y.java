package net.n;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.b2;
import net.dq;
import net.xn;
import net.cb.t;
import net.cg.o;
import net.n.b;
import net.n.f;
import net.n.g;
import net.n.h;
import net.n.j;
import net.n.m;
import net.n.n;
import net.n.s;
import net.n.v;
import net.n.w;
import net.n.x;
import net.ne.l;
import net.no.c;
import net.no.i0;
import net.no.i1;
import net.no.ik;
import net.no.s3;
import net.no.s5;
import net.no.s9;
import net.no.sc;
import net.no.sd;
import net.no.sk;
import net.no.sr;
import net.no.sw;
import net.no.sx;
import net.nz.p;
import net.v.q;
import net.yv.d;
import net.yv.o9;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class y {
   public static final File H = new File("banned-players.json");
   public static final File Z = new File("banned-ips.json");
   public static final File f = new File("ops.json");
   public static final File P = new File("whitelist.json");
   private static final Logger h = LogManager.getLogger();
   private static final SimpleDateFormat u = new SimpleDateFormat("yyyy-MM-dd \'at\' HH:mm:ss z");
   private final net.nx.f z;
   private final List T = Lists.newArrayList();
   private final Map K = Maps.newHashMap();
   private final net.n.z s;
   private final j J;
   private final v F;
   private final b E;
   private final Map b;
   private final Map Y;
   private o d;
   private boolean v;
   protected int M;
   private int B;
   private o9 n;
   private boolean j;
   private int l;
   private static int[] O;

   public y(net.nx.f var1) {
      this.s = new net.n.z(H);
      this.J = new j(Z);
      this.F = new v(f);
      this.E = new b(P);
      this.b = Maps.newHashMap();
      this.Y = Maps.newHashMap();
      this.z = var1;
      this.s.A(false);
      this.J.A(false);
      this.M = 8;
   }

   public void Y(net.n2.a var1, net.r.h var2) {
      c();
      GameProfile var4 = var2.e();
      s var5 = this.z.x();
      GameProfile var6 = var5.U(var4.getId());
      String var7 = var6 == null?var4.getName():var6.getName();
      var5.U(var4);
      net.nj.f var8 = this.p(var2);
      var2.B((net.yv.r)this.z.n(var2.y));
      var2.tA.A((d)var2.hl);
      String var9 = "local";
      if(var1.s() != null) {
         var9 = var1.s().toString();
      }

      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", var2.Q(), var9, Integer.valueOf(var2.G()), Double.valueOf(var2.b), Double.valueOf(var2.hS), Double.valueOf(var2.hr));
      d var10 = this.z.n(var2.y);
      net.cg.z var11 = var10.B();
      this.G(var2, (net.r.h)null, var10);
      net.n2.r var12 = new net.n2.r(this.z, var1, var2);
      var12.h((net.n2.k)(new s5(var2.G(), var2.tA.V(), var11.b(), var10.F.L().M(), var10.k(), this.G(), var11.h(), var10.N().b("reducedDebugInfo"))));
      var12.h((net.n2.k)(new sw("MC|Brand", (new net.n2.h(Unpooled.buffer())).R(this.S().h()))));
      var12.h((net.n2.k)(new net.no.y(var11.k(), var11.s())));
      var12.h((net.n2.k)(new c(var2.a6)));
      var12.h((net.n2.k)(new sr(var2.a8.r)));
      this.g(var2);
      var2.b().P();
      var2.y().x(var2);
      this.z((net.nc.n)var10.J(), var2);
      this.z.V();
      if(var2.Q().equalsIgnoreCase(var7)) {
         new net.cb.h("multiplayer.player.joined", new Object[]{var2.b()});
         net.u.d.h(new net.u.d[4]);
      }

      net.cb.h var13 = new net.cb.h("multiplayer.player.joined.renamed", new Object[]{var2.b(), var7});
      var13.E().i(net.cb.z.YELLOW);
      this.b((t)var13);
      this.K(var2);
      var12.k(var2.b, var2.hS, var2.hr, var2.hN, var2.V);
      this.A(var2, var10);
      if(!this.z.O().isEmpty()) {
         var2.F(this.z.O(), this.z.r());
      }

      Iterator var14 = var2.o().iterator();
      if(var14.hasNext()) {
         net.n_.i var15 = (net.n_.i)var14.next();
         var12.h((net.n2.k)(new net.no.v(var2.G(), var15)));
      }

      if(var8 != null && var8.K("RootVehicle", 10)) {
         net.nj.f var19 = var8.o("RootVehicle");
         l var20 = net.ny.k.Y(var19.o("Entity"), var10, true);
         UUID var16 = var19.R("Attach");
         if(var20.O().equals(var16)) {
            var2.E(var20, true);
         }

         Iterator var17 = var20.m().iterator();
         if(var17.hasNext()) {
            l var18 = (l)var17.next();
            if(var18.O().equals(var16)) {
               var2.E(var18, true);
            }
         }

         if(!var2.M()) {
            h.warn("Couldn\'t reattach entity to player");
            var10.g(var20);
            var17 = var20.m().iterator();
            if(var17.hasNext()) {
               l var22 = (l)var17.next();
               var10.g(var22);
            }
         }
      }

      var2.vE();
   }

   protected void z(net.nc.n var1, net.r.h var2) {
      HashSet var3 = Sets.newHashSet();

      for(net.nc.y var5 : var1.S()) {
         var2.t1.h((net.n2.k)(new ik(var5, 0)));
      }

      int var8 = 0;

      while(true) {
         net.nc.l var9 = var1.S(var8);
         if(!var3.contains(var9)) {
            for(net.n2.k var7 : var1.Z(var9)) {
               var2.t1.h(var7);
            }

            var3.add(var9);
         }

         ++var8;
      }
   }

   public void K(d[] var1) {
      this.d = var1[0].q().Y();
      var1[0].T().H(new net.nz.v() {
         public void q(p var1, double var2) {
            y.this.U(new sx(var1, sx.s.SET_SIZE));
         }

         public void A(p var1, double var2, double var4, long var6) {
            y.this.U(new sx(var1, sx.s.LERP_SIZE));
         }

         public void D(p var1, double var2, double var4) {
            y.this.U(new sx(var1, sx.s.SET_CENTER));
         }

         public void E(p var1, int var2) {
            y.this.U(new sx(var1, sx.s.SET_WARNING_TIME));
         }

         public void f(p var1, int var2) {
            y.this.U(new sx(var1, sx.s.SET_WARNING_BLOCKS));
         }

         public void L(p var1, double var2) {
         }

         public void t(p var1, double var2) {
         }
      });
   }

   public void U(net.r.h var1, @Nullable d var2) {
      d var3 = var1.j();
      var2.m().N(var1);
      var3.m().Z(var1);
      var3.E().N((int)var1.b >> 4, (int)var1.hr >> 4);
      b2.v.l(var1, var2.F.L(), var3.F.L());
      if(var2.F.L() == net.yv.h.NETHER && var1.hl.F.L() == net.yv.h.OVERWORLD && var1.c() != null) {
         b2.R.k(var1, var1.c());
      }

   }

   public int E() {
      return m.u(this.W());
   }

   @Nullable
   public net.nj.f p(net.r.h var1) {
      net.nj.f var2 = this.z.w1[0].B().s();
      net.nj.f var3;
      if(var1.Q().equals(this.z.Z())) {
         var3 = var2;
         var1.B((net.nj.f)var2);
         h.debug("loading single player");
      } else {
         var3 = this.d.S(var1);
      }

      return var3;
   }

   protected void I(net.r.h var1) {
      this.d.b(var1);
      net.v.p var2 = (net.v.p)this.b.get(var1.O());
      var2.Z();
      dq var3 = (dq)this.Y.get(var1.O());
      var3.L();
   }

   public void K(net.r.h var1) {
      this.T.add(var1);
      this.K.put(var1.O(), var1);
      this.U(new s3(s3.n.ADD_PLAYER, new net.r.h[]{var1}));
      d var2 = this.z.n(var1.y);

      for(int var3 = 0; var3 < this.T.size(); ++var3) {
         var1.t1.h((net.n2.k)(new s3(s3.n.ADD_PLAYER, new net.r.h[]{(net.r.h)this.T.get(var3)})));
      }

      var2.S(var1);
      this.U(var1, (d)null);
   }

   public void H(net.r.h var1) {
      var1.j().m().H(var1);
   }

   public void o(net.r.h var1) {
      d var2 = var1.j();
      var1.S(q.M);
      this.I(var1);
      if(var1.M()) {
         l var3 = var1.o();
         if(var3.P(net.r.h.class).size() == 1) {
            h.debug("Removing player mount");
            var1.O();
            var2.g(var3);

            for(l var5 : var3.m()) {
               var2.g(var5);
            }

            var2.q(var1.Q, var1.f).k();
         }
      }

      var2.W(var1);
      var2.m().N(var1);
      var1.S().c();
      this.T.remove(var1);
      UUID var6 = var1.O();
      net.r.h var7 = (net.r.h)this.K.get(var6);
      if(var7 == var1) {
         this.K.remove(var6);
         this.b.remove(var6);
         this.Y.remove(var6);
      }

      this.U(new s3(s3.n.REMOVE_PLAYER, new net.r.h[]{var1}));
   }

   public String a(SocketAddress var1, GameProfile var2) {
      if(this.s.D(var2)) {
         n var5 = (n)this.s.g(var2);
         String var6 = "You are banned from this server!\nReason: " + var5.r();
         if(var5.i() != null) {
            var6 = var6 + "\nYour ban will be removed on " + u.format(var5.i());
         }

         return var6;
      } else if(!this.p(var2)) {
         return "You are not white-listed on this server!";
      } else if(this.J.S(var1)) {
         f var3 = this.J.V(var1);
         String var4 = "Your IP address is banned from this server!\nReason: " + var3.r();
         if(var3.i() != null) {
            var4 = var4 + "\nYour ban will be removed on " + u.format(var3.i());
         }

         return var4;
      } else {
         return this.T.size() >= this.M && !this.v(var2)?"The server is full!":null;
      }
   }

   public net.r.h K(GameProfile var1) {
      UUID var2 = net.r.r.D(var1);
      ArrayList var3 = Lists.newArrayList();

      for(int var4 = 0; var4 < this.T.size(); ++var4) {
         net.r.h var5 = (net.r.h)this.T.get(var4);
         if(var5.O().equals(var2)) {
            var3.add(var5);
         }
      }

      net.r.h var7 = (net.r.h)this.K.get(var1.getId());
      if(!var3.contains(var7)) {
         var3.add(var7);
      }

      for(net.r.h var6 : var3) {
         var6.t1.r(new net.cb.h("multiplayer.disconnect.duplicate_login", new Object[0]));
      }

      Object var9;
      if(this.z.z()) {
         var9 = new h(this.z.n(0));
      } else {
         var9 = new w(this.z.n(0));
      }

      return new net.r.h(this.z, this.z.n(0), var1, (w)var9);
   }

   public net.r.h M(net.r.h var1, int var2, boolean var3) {
      var1.j().K().E(var1);
      var1.j().K().Q(var1);
      var1.j().m().N(var1);
      this.T.remove(var1);
      this.z.n(var1.y).g(var1);
      net.u.j var4 = var1.g();
      boolean var5 = var1.VJ();
      var1.y = var2;
      Object var6;
      if(this.z.z()) {
         var6 = new h(this.z.n(var1.y));
      } else {
         var6 = new w(this.z.n(var1.y));
      }

      net.r.h var7 = new net.r.h(this.z, this.z.n(var1.y), var1.e(), (w)var6);
      var7.t1 = var1.t1;
      var7.E(var1, var3);
      var7.K(var1.G());
      var7.S(var1);
      var7.u(var1.a());

      for(String var9 : var1.C()) {
         var7.r((String)var9);
      }

      d var10 = this.z.n(var1.y);
      this.G(var7, var1, var10);
      net.u.j var11 = net.r.r.P(this.z.n(var1.y), var4, var5);
      var7.S((double)((float)var11.t() + 0.5F), (double)((float)var11.h() + 0.1F), (double)((float)var11.y() + 0.5F), 0.0F, 0.0F);
      var7.a(var4, var5);
      var10.E().N((int)var7.b >> 4, (int)var7.hr >> 4);

      while(!var10.h(var7, var7.i()).isEmpty() && var7.hS < 256.0D) {
         var7.t(var7.b, var7.hS + 1.0D, var7.hr);
      }

      var7.t1.h((net.n2.k)(new net.no.p(var7.y, var7.hl.k(), var7.hl.B().h(), var7.tA.V())));
      var11 = var10.y();
      var7.t1.k(var7.b, var7.hS, var7.hr, var7.hN, var7.V);
      var7.t1.h((net.n2.k)(new sd(var11)));
      var7.t1.h((net.n2.k)(new s9(var7.aP, var7.ac, var7.aX)));
      this.A(var7, var10);
      this.g(var7);
      var10.m().Z(var7);
      var10.S(var7);
      this.T.add(var7);
      this.K.put(var7.O(), var7);
      var7.vE();
      var7.u(var7.h());
      return var7;
   }

   public void g(net.r.h var1) {
      GameProfile var2 = var1.e();
      int var3 = this.Q(var2)?this.F.L(var2):0;
      var3 = this.z.n() && this.z.w1[0].B().u()?4:var3;
      var3 = this.j?4:var3;
      this.Q(var1, var3);
   }

   public void L(net.r.h var1, int var2) {
      int var3 = var1.y;
      d var4 = this.z.n(var1.y);
      var1.y = var2;
      d var5 = this.z.n(var1.y);
      var1.t1.h((net.n2.k)(new net.no.p(var1.y, var1.hl.k(), var1.hl.B().h(), var1.tA.V())));
      this.g(var1);
      var4.g(var1);
      var1.Z = false;
      this.X(var1, var3, var4, var5);
      this.U(var1, var4);
      var1.t1.k(var1.b, var1.hS, var1.hr, var1.hN, var1.V);
      var1.tA.A(var5);
      var1.t1.h((net.n2.k)(new c(var1.a6)));
      this.A(var1, var5);
      this.L(var1);

      for(net.n_.i var7 : var1.o()) {
         var1.t1.h((net.n2.k)(new net.no.v(var1.G(), var7)));
      }

   }

   public void X(l var1, int var2, d var3, d var4) {
      double var5 = var1.b;
      double var7 = var1.hr;
      double var10000 = 8.0D;
      float var11 = var1.hN;
      var3.M.K("moving");
      if(var1.y == -1) {
         var5 = net.u.t.F(var5 / 8.0D, var4.T().S() + 16.0D, var4.T().M() - 16.0D);
         var7 = net.u.t.F(var7 / 8.0D, var4.T().U() + 16.0D, var4.T().Z() - 16.0D);
         var1.S(var5, var1.hS, var7, var1.hN, var1.V);
         if(var1.P()) {
            var3.s(var1, false);
         }
      } else if(var1.y == 0) {
         var5 = net.u.t.F(var5 * 8.0D, var4.T().S() + 16.0D, var4.T().M() - 16.0D);
         var7 = net.u.t.F(var7 * 8.0D, var4.T().U() + 16.0D, var4.T().Z() - 16.0D);
         var1.S(var5, var1.hS, var7, var1.hN, var1.V);
         if(var1.P()) {
            var3.s(var1, false);
         }
      } else {
         net.u.j var12;
         if(var2 == 1) {
            var12 = var4.y();
         } else {
            var12 = var4.q();
         }

         var5 = (double)var12.t();
         var1.hS = (double)var12.h();
         var7 = (double)var12.y();
         var1.S(var5, var1.hS, var7, 90.0F, 0.0F);
         if(var1.P()) {
            var3.s(var1, false);
         }
      }

      var3.M.N();
      if(var2 != 1) {
         var3.M.K("placing");
         var5 = (double)net.u.t.g((int)var5, -29999872, 29999872);
         var7 = (double)net.u.t.g((int)var7, -29999872, 29999872);
         if(var1.P()) {
            var1.S(var5, var1.hS, var7, var1.hN, var1.V);
            var4.A().R(var1, var11);
            var4.S(var1);
            var4.s(var1, false);
         }

         var3.M.N();
      }

      var1.B((net.yv.r)var4);
   }

   public void H() {
      if(++this.l > 600) {
         this.U(new s3(s3.n.UPDATE_LATENCY, this.T));
         this.l = 0;
      }

   }

   public void U(net.n2.k var1) {
      for(int var2 = 0; var2 < this.T.size(); ++var2) {
         ((net.r.h)this.T.get(var2)).t1.h(var1);
      }

   }

   public void J(net.n2.k var1, int var2) {
      for(int var3 = 0; var3 < this.T.size(); ++var3) {
         net.r.h var4 = (net.r.h)this.T.get(var3);
         if(var4.y == var2) {
            var4.t1.h(var1);
         }
      }

   }

   public void X(net.r.r var1, t var2) {
      net.nc.m var3 = var1.f();

      for(String var5 : var3.Q()) {
         net.r.h var6 = this.F(var5);
         if(var6 != var1) {
            var6.r(var2);
         }
      }

   }

   public void x(net.r.r var1, t var2) {
      net.nc.m var3 = var1.f();
      this.b(var2);
   }

   public String L(boolean var1) {
      String var2 = "";
      ArrayList var3 = Lists.newArrayList(this.T);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         var2 = var2 + ", ";
         var2 = var2 + ((net.r.h)var3.get(var4)).Q();
         var2 = var2 + " (" + ((net.r.h)var3.get(var4)).r() + ")";
      }

      return var2;
   }

   public String[] H() {
      String[] var1 = new String[this.T.size()];

      for(int var2 = 0; var2 < this.T.size(); ++var2) {
         var1[var2] = ((net.r.h)this.T.get(var2)).Q();
      }

      return var1;
   }

   public GameProfile[] x() {
      GameProfile[] var1 = new GameProfile[this.T.size()];

      for(int var2 = 0; var2 < this.T.size(); ++var2) {
         var1[var2] = ((net.r.h)this.T.get(var2)).e();
      }

      return var1;
   }

   public net.n.z D() {
      return this.s;
   }

   public j Y() {
      return this.J;
   }

   public void v(GameProfile var1) {
      int var2 = this.z.m();
      this.F.a(new g(var1, this.z.m(), this.F.G(var1)));
      this.Q(this.l(var1.getId()), var2);
   }

   public void n(GameProfile var1) {
      this.F.U(var1);
      this.Q(this.l(var1.getId()), 0);
   }

   private void Q(net.r.h var1, int var2) {
      if(var1.t1 != null) {
         byte var3 = 24;
         var1.t1.h((net.n2.k)(new sc(var1, var3)));
      }

   }

   public boolean p(GameProfile var1) {
      return !this.v || this.F.d(var1) || this.E.d(var1);
   }

   public boolean Q(GameProfile var1) {
      return this.F.d(var1) || this.z.n() && this.z.w1[0].B().u() && this.z.Z().equalsIgnoreCase(var1.getName()) || this.j;
   }

   @Nullable
   public net.r.h F(String var1) {
      for(net.r.h var3 : this.T) {
         if(var3.Q().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void c(@Nullable net.r.r var1, double var2, double var4, double var6, double var8, int var10, net.n2.k var11) {
      for(int var12 = 0; var12 < this.T.size(); ++var12) {
         net.r.h var13 = (net.r.h)this.T.get(var12);
         if(var13 != var1 && var13.y == var10) {
            double var14 = var2 - var13.b;
            double var16 = var4 - var13.hS;
            double var18 = var6 - var13.hr;
            if(var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.t1.h(var11);
            }
         }
      }

   }

   public void o() {
      for(int var1 = 0; var1 < this.T.size(); ++var1) {
         this.I((net.r.h)this.T.get(var1));
      }

   }

   public void m(GameProfile var1) {
      this.E.a(new x(var1));
   }

   public void C(GameProfile var1) {
      this.E.U(var1);
   }

   public b F() {
      return this.E;
   }

   public String[] P() {
      return this.E.g();
   }

   public v z() {
      return this.F;
   }

   public String[] F() {
      return this.F.g();
   }

   public void h() {
   }

   public void A(net.r.h var1, d var2) {
      p var3 = this.z.w1[0].T();
      var1.t1.h((net.n2.k)(new sx(var3, sx.s.INITIALIZE)));
      var1.t1.h((net.n2.k)(new sk(var2.y(), var2.j(), var2.N().b("doDaylightCycle"))));
      net.u.j var4 = var2.y();
      var1.t1.h((net.n2.k)(new sd(var4)));
      if(var2.b()) {
         var1.t1.h((net.n2.k)(new i1(1, 0.0F)));
         var1.t1.h((net.n2.k)(new i1(7, var2.u(1.0F))));
         var1.t1.h((net.n2.k)(new i1(8, var2.w(1.0F))));
      }

   }

   public void L(net.r.h var1) {
      var1.J(var1.aW);
      var1.vl();
      var1.t1.h((net.n2.k)(new sr(var1.a8.r)));
   }

   public int S() {
      return this.T.size();
   }

   public int G() {
      return this.M;
   }

   public String[] l() {
      return this.z.w1[0].q().Y().n();
   }

   public void G(boolean var1) {
      this.v = var1;
   }

   public List J(String var1) {
      ArrayList var2 = Lists.newArrayList();

      for(net.r.h var4 : this.T) {
         if(var4.w().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public int W() {
      return this.B;
   }

   public net.nx.f S() {
      return this.z;
   }

   public net.nj.f w() {
      return null;
   }

   public void Z(o9 var1) {
      this.n = var1;
   }

   private void G(net.r.h var1, net.r.h var2, net.yv.r var3) {
      var1.tA.T(var2.tA.V());
      var1.tA.s(var3.B().h());
   }

   public void S(boolean var1) {
      this.j = var1;
   }

   public void b() {
      for(int var1 = 0; var1 < this.T.size(); ++var1) {
         ((net.r.h)this.T.get(var1)).t1.r(new net.cb.h("multiplayer.disconnect.server_shutdown", new Object[0]));
      }

   }

   public void i(t var1, boolean var2) {
      this.z.r(var1);
      net.cb.c var3 = net.cb.c.SYSTEM;
      this.U(new i0(var1, var3));
   }

   public void b(t var1) {
      this.i(var1, true);
   }

   public net.v.p r(net.r.r var1) {
      UUID var2 = var1.O();
      net.v.p var3 = null;
      File var4 = new File(this.z.n(0).q().G(), "stats");
      File var5 = new File(var4, var2 + ".json");
      if(!var5.exists()) {
         File var6 = new File(var4, var1.Q() + ".json");
         if(var6.exists() && var6.isFile()) {
            var6.renameTo(var5);
         }
      }

      var3 = new net.v.p(this.z, var5);
      var3.l();
      this.b.put(var2, var3);
      return var3;
   }

   public dq a(net.r.h var1) {
      UUID var2 = var1.O();
      dq var3 = (dq)this.Y.get(var2);
      File var4 = new File(this.z.n(0).q().G(), "advancements");
      File var5 = new File(var4, var2 + ".json");
      var3 = new dq(this.z, var5, var1);
      this.Y.put(var2, var3);
      var3.m(var1);
      return var3;
   }

   public void Z(int var1) {
      this.B = var1;
      if(this.z.w1 != null) {
         for(d var5 : this.z.w1) {
            var5.m().t(var1);
            var5.K().L(var1);
         }
      }

   }

   public List D() {
      return this.T;
   }

   public net.r.h l(UUID var1) {
      return (net.r.h)this.K.get(var1);
   }

   public boolean v(GameProfile var1) {
      return false;
   }

   public void y() {
      for(dq var2 : this.Y.values()) {
         var2.U();
      }

   }

   static {
      P(new int[3]);
   }

   public static void P(int[] var0) {
      O = var0;
   }

   public static int[] c() {
      return O;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
