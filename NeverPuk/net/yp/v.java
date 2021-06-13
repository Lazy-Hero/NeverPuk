package net.yp;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net._x;
import net.gn;
import net.sq;
import net.w9;
import net.xc;
import net.xn;
import net.zs;
import net.cp.h;
import net.cp.w;
import net.m.l;
import net.m.qo;
import net.m.qs;
import net.n0.ks;
import net.n0.yn;
import net.n1.c;
import net.n1.g;
import net.n1.s;
import net.n1.u;
import net.n1.x;
import net.n1.y;
import net.n2.a;
import net.n2.n;
import net.ne.bk;
import net.ni.sl;
import net.nl.zq;
import net.nl.zv;
import net.nm.e;
import net.nm.i;
import net.nm.k;
import net.no.i0;
import net.no.i1;
import net.no.i2;
import net.no.i5;
import net.no.i6;
import net.no.i7;
import net.no.i9;
import net.no.ic;
import net.no.id;
import net.no.ik;
import net.no.il;
import net.no.in;
import net.no.ip;
import net.no.iu;
import net.no.m;
import net.no.s0;
import net.no.s1;
import net.no.s2;
import net.no.s3;
import net.no.s4;
import net.no.s5;
import net.no.s6;
import net.no.s7;
import net.no.s8;
import net.no.s9;
import net.no.s_;
import net.no.sa;
import net.no.sb;
import net.no.sc;
import net.no.sd;
import net.no.se;
import net.no.sf;
import net.no.sg;
import net.no.sh;
import net.no.si;
import net.no.sj;
import net.no.sk;
import net.no.sm;
import net.no.sn;
import net.no.so;
import net.no.sp;
import net.no.sr;
import net.no.ss;
import net.no.st;
import net.no.su;
import net.no.sv;
import net.no.sw;
import net.no.sx;
import net.no.sy;
import net.no.sz;
import net.r.r;
import net.u.d;
import net.x.t;
import net.yp.b;
import net.yv.o9;
import net.yz.a2;
import net.yz.a7;
import net.yz.ai;
import net.yz.aq;
import net.yz.m_;
import net.z.t4;
import net.z.t9;
import net.z.tf;
import net.z.tn;
import net.z.tp;
import net.z.tr;
import net.z.tt;
import net.z.tu;
import net.z.tx;
import net.z.w7;
import net.z.wo;
import net.z.ww;
import net.z.wz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v implements t {
   private static final Logger q = LogManager.getLogger();
   private final a L;
   private final GameProfile a;
   private final tu U;
   private net.nn.j R;
   public net.cp.v z;
   private boolean Q;
   private final Map N = Maps.newHashMap();
   public int T = 20;
   private boolean x;
   private final h G;
   private final Random y = new Random();
   private static String l;

   public v(net.nn.j var1, tu var2, a var3, GameProfile var4) {
      this.R = var1;
      this.U = var2;
      this.L = var3;
      this.a = var4;
      this.G = new h(var1);
   }

   public void V() {
      this.z = null;
   }

   public void J(s5 var1) {
      n.d(var1, this, this.R);
      this.R.sE = new w(this.R, this);
      this.z = new net.cp.v(this, new net.yv.t(0L, var1.X(), false, var1.s(), var1.L()), var1.g(), var1.j(), this.R.sl);
      this.R.T.iA = var1.j();
      this.R.J(this.z);
      this.R.sf.y = var1.g();
      this.R.s(new t4());
      this.R.sf.K(var1.k());
      this.T = var1.f();
      this.R.sf.Q(var1.j());
      this.R.sE.J(var1.X());
      this.R.T.k();
      this.L.F(new l("MC|Brand", (new net.n2.h(Unpooled.buffer())).R(net.nn.p.S())));
   }

   public void u(in var1) {
      n.d(var1, this, this.R);
      double var3 = var1.E();
      C();
      double var5 = var1.m();
      double var7 = var1.b();
      Object var9 = null;
      if(var1.U() == 10) {
         var9 = net.nm.w.j(this.z, var3, var5, var7, net.nm.w.O(var1.P()));
      } else if(var1.U() == 90) {
         net.ne.l var10 = this.z.S(var1.P());
         if(var10 instanceof r) {
            var9 = new net.n1.q(this.z, (r)var10, var3, var5, var7);
         }

         var1.A(0);
      } else if(var1.U() == 60) {
         var9 = new net.n1.b(this.z, var3, var5, var7);
      } else if(var1.U() == 91) {
         var9 = new net.n1.l(this.z, var3, var5, var7);
      } else if(var1.U() == 61) {
         var9 = new x(this.z, var3, var5, var7);
      } else if(var1.U() == 68) {
         var9 = new c(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
      } else if(var1.U() == 71) {
         var9 = new e(this.z, new net.u.j(var3, var5, var7), aq.Q(var1.P()));
         var1.A(0);
      } else if(var1.U() == 77) {
         var9 = new net.ne.o(this.z, new net.u.j(net.u.t.L(var3), net.u.t.L(var5), net.u.t.L(var7)));
         var1.A(0);
      } else if(var1.U() == 65) {
         var9 = new net.nm.f(this.z, var3, var5, var7);
      } else if(var1.U() == 72) {
         var9 = new net.nm.a(this.z, var3, var5, var7);
      } else if(var1.U() == 76) {
         var9 = new net.nm.n(this.z, var3, var5, var7, ks.a);
      } else if(var1.U() == 63) {
         var9 = new y(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         var1.A(0);
      } else if(var1.U() == 93) {
         var9 = new net.n1.f(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         var1.A(0);
      } else if(var1.U() == 64) {
         var9 = new u(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         var1.A(0);
      } else if(var1.U() == 66) {
         var9 = new net.n1.w(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         var1.A(0);
      } else if(var1.U() == 67) {
         var9 = new net.n1.a(this.z, var3, var5, var7, (double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         var1.A(0);
      } else if(var1.U() == 62) {
         var9 = new s(this.z, var3, var5, var7);
      } else if(var1.U() == 79) {
         var9 = new net.n1.j(this.z, var3, var5, var7, 0.0F, 0, (net.ne.a)null);
      } else if(var1.U() == 73) {
         var9 = new g(this.z, var3, var5, var7, ks.a);
         var1.A(0);
      } else if(var1.U() == 75) {
         var9 = new net.nm.h(this.z, var3, var5, var7);
         var1.A(0);
      } else if(var1.U() == 1) {
         var9 = new net.nm.b(this.z, var3, var5, var7);
      } else if(var1.U() == 50) {
         var9 = new k(this.z, var3, var5, var7, (net.ne.a)null);
      } else if(var1.U() == 78) {
         var9 = new net.nm.z(this.z, var3, var5, var7);
      } else if(var1.U() == 51) {
         var9 = new net.nm.j(this.z, var3, var5, var7);
      } else if(var1.U() == 2) {
         var9 = new i(this.z, var3, var5, var7);
      } else if(var1.U() == 70) {
         var9 = new net.nm.v(this.z, var3, var5, var7, net.y9.l.P(var1.P() & '\uffff'));
         var1.A(0);
      } else if(var1.U() == 3) {
         var9 = new net.ne.w(this.z, var3, var5, var7);
      }

      if(var9 != null) {
         bk.D((net.ne.l)var9, var3, var5, var7);
         ((net.ne.l)var9).V = (float)(var1.c() * 360) / 256.0F;
         ((net.ne.l)var9).hN = (float)(var1.g() * 360) / 256.0F;
         net.ne.l[] var16 = ((net.ne.l)var9).T();
         int var11 = var1.n() - ((net.ne.l)var9).G();
         int var13 = var16.length;
         int var14 = 0;
         if(var14 < var13) {
            net.ne.l var15 = var16[var14];
            var15.K(var15.G() + var11);
            ++var14;
         }

         ((net.ne.l)var9).K(var1.n());
         ((net.ne.l)var9).k(var1.o());
         this.z.J(var1.n(), (net.ne.l)var9);
         if(var1.P() > 0) {
            if(var1.U() == 60 || var1.U() == 91) {
               net.ne.l var17 = this.z.S(var1.P() - 1);
               if(var17 instanceof net.ne.a && var9 instanceof net.n1.o) {
                  ((net.n1.o)var9).kx = var17;
               }
            }

            ((net.ne.l)var9).K((double)var1.o() / 8000.0D, (double)var1.p() / 8000.0D, (double)var1.D() / 8000.0D);
         }
      }

      if(d.y() == null) {
         l("D5SiF");
      }

   }

   public void x(m var1) {
      n.d(var1, this, this.R);
      double var2 = var1.W();
      double var4 = var1.e();
      double var6 = var1.a();
      net.nm.s var8 = new net.nm.s(this.z, var2, var4, var6, var1.N());
      bk.D(var8, var2, var4, var6);
      var8.hN = 0.0F;
      var8.V = 0.0F;
      var8.K(var1.R());
      this.z.J(var1.R(), var8);
   }

   public void d(s0 var1) {
      n.d(var1, this, this.R);
      double var2 = var1.j();
      double var4 = var1.G();
      double var6 = var1.N();
      net.yi.e var8 = null;
      if(var1.c() == 1) {
         var8 = new net.yi.e(this.z, var2, var4, var6, false);
      }

      bk.D(var8, var2, var4, var6);
      var8.hN = 0.0F;
      var8.V = 0.0F;
      var8.K(var1.X());
      this.z.i(var8);
   }

   public void Q(sg var1) {
      n.d(var1, this, this.R);
      net.nm.l var2 = new net.nm.l(this.z, var1.f(), var1.x(), var1.f());
      var2.k(var1.S());
      this.z.J(var1.Y(), var2);
   }

   public void d(sp var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.F());
      String var3 = gn.Q.J.S("Velocity Mode").M();
      if(var3.equalsIgnoreCase("Matrix") && gn.Q.j.d(sq.class).v()) {
         if(var1.F() == net.nn.j.b().sf.G()) {
            var2.K(0.0D, (double)var1.t() / 8000.0D, (double)var1.o() / 8000.0D / 2.2D);
            w9.U();
         }
      } else {
         zs var4 = new zs(var2, (double)var1.K() / 8000.0D, (double)var1.t() / 8000.0D, (double)var1.o() / 8000.0D);
         _x.m(var4);
         if(!var4.t()) {
            var2.K(var4.X(), var4.w(), var4.H());
         }
      }

   }

   public void b(s_ var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.m());
      if(var1.L() != null) {
         var2.A().l(var1.L());
      }

   }

   public void V(net.no.e var1) {
      n.d(var1, this, this.R);
      double var2 = var1.R();
      double var4 = var1.a();
      double var6 = var1.V();
      float var8 = (float)(var1.X() * 360) / 256.0F;
      float var9 = (float)(var1.j() * 360) / 256.0F;
      net.yy.z var10 = new net.yy.z(this.R.s8, this.f(var1.M()).J());
      var10.h = var2;
      var10.hL = var2;
      var10.h6 = var4;
      var10.F = var4;
      var10.l = var6;
      var10.A = var6;
      bk.D(var10, var2, var4, var6);
      var10.D(var2, var4, var6, var8, var9);
      this.z.J(var1.c(), var10);
      List var11 = var1.R();
      var10.A().l(var11);
   }

   public void W(net.no.q var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.F());
      double var3 = var1.B();
      double var5 = var1.S();
      double var7 = var1.I();
      bk.D(var2, var3, var5, var7);
      if(!var2.V()) {
         float var9 = (float)(var1.O() * 360) / 256.0F;
         float var10 = (float)(var1.f() * 360) / 256.0F;
         if(Math.abs(var2.b - var3) < 0.03125D && Math.abs(var2.hS - var5) < 0.015625D && Math.abs(var2.hr - var7) < 0.03125D) {
            var2.j(var2.b, var2.hS, var2.hr, var9, var10, 0, true);
         } else {
            var2.j(var3, var5, var7, var9, var10, 3, true);
         }

         var2.k = var1.I();
      }

   }

   public void W(sr var1) {
      n.d(var1, this, this.R);
      if(net.r.i.m(var1.q())) {
         this.R.sf.a8.r = var1.q();
      }

   }

   public void H(s8 var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = var1.X(this.z);
      var2.E += (long)var1.w();
      var2.j += (long)var1.z();
      var2.h2 += (long)var1.G();
      double var3 = (double)var2.E / 4096.0D;
      double var5 = (double)var2.j / 4096.0D;
      double var7 = (double)var2.h2 / 4096.0D;
      if(!var2.V()) {
         float var9 = var1.k()?(float)(var1.F() * 360) / 256.0F:var2.hN;
         float var10 = var1.k()?(float)(var1.G() * 360) / 256.0F:var2.V;
         var2.j(var3, var5, var7, var9, var10, 3, false);
         var2.k = var1.l();
      }

   }

   public void w(sv var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = var1.p(this.z);
      float var3 = (float)(var1.a() * 360) / 256.0F;
      var2.A(var3);
   }

   public void j(net.no.n var1) {
      n.d(var1, this, this.R);

      for(int var2 = 0; var2 < var1.D().length; ++var2) {
         this.z.a(var1.D()[var2]);
      }

   }

   public void p(s1 var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      double var3 = var1.E();
      double var5 = var1.i();
      double var7 = var1.J();
      float var9 = var1.U();
      float var10 = var1.D();
      if(var1.P().contains(s1.c.X)) {
         var3 += var2.b;
      } else {
         var2.hf = 0.0D;
      }

      if(var1.P().contains(s1.c.Y)) {
         var5 += var2.hS;
      } else {
         var2.K = 0.0D;
      }

      if(var1.P().contains(s1.c.Z)) {
         var7 += var2.hr;
      } else {
         var2.J = 0.0D;
      }

      if(var1.P().contains(s1.c.X_ROT)) {
         var10 += var2.V;
      }

      if(var1.P().contains(s1.c.Y_ROT)) {
         var9 += var2.hN;
      }

      var2.D(var3, var5, var7, var9, var10);
      this.L.F(new net.m.w(var1.v()));
      this.L.F(new qo.l(var2.b, var2.i().u, var2.hr, var2.hN, var2.V, false));
      if(!this.Q) {
         this.R.sf.h = this.R.sf.b;
         this.R.sf.h6 = this.R.sf.hS;
         this.R.sf.l = this.R.sf.hr;
         this.Q = true;
         this.R.s((tu)null);
      }

   }

   public void R(ss var1) {
      n.d(var1, this, this.R);

      for(ss.c var5 : var1.y()) {
         this.z.z(var5.C(), var5.l());
      }

   }

   public void e(net.no.f var1) {
      n.d(var1, this, this.R);
      if(var1.J()) {
         this.z.B(var1.m(), var1.d(), true);
      }

      this.z.H(var1.m() << 4, 0, var1.d() << 4, (var1.m() << 4) + 15, 256, (var1.d() << 4) + 15);
      net.l.q var2 = this.z.q(var1.m(), var1.d());
      var2.c(var1.K(), var1.g(), var1.J());
      this.z.Y(var1.m() << 4, 0, var1.d() << 4, (var1.m() << 4) + 15, 256, (var1.d() << 4) + 15);
      if(!var1.J() || !(this.z.F instanceof net.yv.a)) {
         var2.I();
      }

      for(net.nj.f var4 : var1.N()) {
         net.u.j var5 = new net.u.j(var4.P("x"), var4.P("y"), var4.P("z"));
         net.ni.v var6 = this.z.L(var5);
         var6.G(var4);
      }

   }

   public void P(s7 var1) {
      n.d(var1, this, this.R);
      this.z.B(var1.x(), var1.y(), false);
   }

   public void Y(net.no.sq var1) {
      n.d(var1, this, this.R);
      this.z.z(var1.r(), var1.R());
   }

   public void q(i2 var1) {
      this.L.R(var1.s());
   }

   public void d(net.cb.t var1) {
      this.R.J((net.cp.v)null);
      if(this.U != null) {
         if(this.U instanceof ww) {
            this.R.s((new net.ct.j(((ww)this.U).R(), "disconnect.lost", var1)).o());
         } else {
            this.R.s(new tx(this.U, "disconnect.lost", var1));
         }
      } else {
         this.R.s(new tx(new t9(new tt()), "disconnect.lost", var1));
      }

   }

   public void L(net.n2.k var1) {
      this.L.F(var1);
   }

   public void t(net.no.t var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.y());
      net.ne.a var3 = (net.ne.a)this.z.S(var1.t());
      net.yy.g var4 = this.R.sf;
      if(var2 instanceof net.nm.s) {
         this.z.m(var2.b, var2.hS, var2.hr, net.nb.l.PC, net.yz.p.PLAYERS, 0.1F, (this.y.nextFloat() - this.y.nextFloat()) * 0.35F + 0.9F, false);
      } else {
         this.z.m(var2.b, var2.hS, var2.hr, net.nb.l.oM, net.yz.p.PLAYERS, 0.2F, (this.y.nextFloat() - this.y.nextFloat()) * 1.4F + 2.0F, false);
      }

      if(var2 instanceof i) {
         ((i)var2).S().u(var1.q());
      }

      this.R.sv.N(new net.yh.h(this.z, var2, var4, 0.5F));
      this.z.a(var1.y());
   }

   public void r(i0 var1) {
      n.d(var1, this, this.R);
      this.R.y.l(var1.Z(), var1.O());
   }

   public void D(sb var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.o());
      if(var1.k() == 0) {
         net.ne.a var3 = (net.ne.a)var2;
         var3.N(net.yz.k.MAIN_HAND);
      } else if(var1.k() == 3) {
         net.ne.a var4 = (net.ne.a)var2;
         var4.N(net.yz.k.OFF_HAND);
      } else if(var1.k() == 1) {
         var2.I();
      } else if(var1.k() == 2) {
         r var5 = (r)var2;
         var5.H(false, false, false);
      } else if(var1.k() == 4) {
         this.R.sv.Z(var2, ai.CRIT);
      } else if(var1.k() == 5) {
         this.R.sv.Z(var2, ai.CRIT_MAGIC);
      }

   }

   public void D(su var1) {
      n.d(var1, this, this.R);
      var1.e(this.z).M(var1.S());
   }

   public void B(net.no.b var1) {
      n.d(var1, this, this.R);
      double var2 = var1.l();
      double var4 = var1.c();
      double var6 = var1.Y();
      float var8 = (float)(var1.u() * 360) / 256.0F;
      float var9 = (float)(var1.c() * 360) / 256.0F;
      net.ne.a var10 = (net.ne.a)net.ne.v.t(var1.g(), this.R.s8);
      bk.D(var10, var2, var4, var6);
      var10.AK = (float)(var1.S() * 360) / 256.0F;
      var10.A3 = (float)(var1.S() * 360) / 256.0F;
      net.ne.l[] var11 = var10.T();
      int var12 = var1.d() - var10.G();

      for(net.ne.l var16 : var11) {
         var16.K(var16.G() + var12);
      }

      var10.K(var1.d());
      var10.k(var1.p());
      var10.D(var2, var4, var6, var8, var9);
      var10.hf = (double)((float)var1.u() / 8000.0F);
      var10.K = (double)((float)var1.O() / 8000.0F);
      var10.J = (double)((float)var1.K() / 8000.0F);
      this.z.J(var1.d(), var10);
      List var17 = var1.e();
      var10.A().l(var17);
   }

   public void M(sk var1) {
      n.d(var1, this, this.R);
      this.R.s8.c(var1.O());
      this.R.s8.N(var1.g());
   }

   public void n(sd var1) {
      n.d(var1, this, this.R);
      this.R.sf.a(var1.q(), true);
      this.R.s8.B().n(var1.q());
   }

   public void M(net.no.d var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.s());
      q.warn("Received passengers for unknown entity");
   }

   public void Q(net.no.z var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.a());
      net.ne.l var3 = this.z.S(var1.h());
      if(var2 instanceof net.ne.y) {
         ((net.ne.y)var2).Y(var3, false);
      }

   }

   public void U(sc var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = var1.W(this.z);
      if(var1.X() == 21) {
         this.R.n().g((net.h.d)(new net.h.q((net.nk.z)var2)));
      } else if(var1.X() == 35) {
         boolean var10000 = true;
         this.R.sv.M(var2, ai.TOTEM, 30);
         this.z.m(var2.b, var2.hS, var2.hr, net.nb.l.P4, var2.E(), 1.0F, 1.0F, false);
         if(var2 == this.R.sf) {
            this.R.s4.A(new ks(net.nb.j.YJ));
         }
      } else {
         var2.R(var1.X());
      }

   }

   public void a(net.no.h var1) {
      n.d(var1, this, this.R);
      this.R.sf.K(var1.d());
      this.R.sf.e().x(var1.X());
      this.R.sf.e().L(var1.V());
   }

   public void E(s9 var1) {
      n.d(var1, this, this.R);
      this.R.sf.U(var1.p(), var1.f(), var1.o());
   }

   public void h(net.no.p var1) {
      n.d(var1, this, this.R);
      if(var1.W() != this.R.sf.y) {
         this.Q = false;
         net.nc.b var2 = this.z.J();
         this.z = new net.cp.v(this, new net.yv.t(0L, var1.Y(), false, this.R.s8.B().b(), var1.c()), var1.W(), var1.j(), this.R.sl);
         this.z.R(var2);
         this.R.J(this.z);
         this.R.sf.y = var1.W();
         this.R.s(new t4());
      }

      this.R.s(var1.W());
      this.R.sE.J(var1.Y());
   }

   public void y(so var1) {
      n.d(var1, this, this.R);
      net.yv.u var2 = new net.yv.u(this.R.s8, (net.ne.l)null, var1.S(), var1.z(), var1.Y(), var1.R(), var1.A());
      var2.p(true);
      this.R.sf.hf += (double)var1.f();
      this.R.sf.K += (double)var1.A();
      this.R.sf.J += (double)var1.v();
   }

   public void H(sy var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      if("minecraft:container".equals(var1.Q())) {
         var2.n(new zq(var1.j(), var1.T()));
         var2.aG.S = var1.r();
      } else if("minecraft:villager".equals(var1.Q())) {
         var2.g(new net.ne.r(var2, var1.j()));
         var2.aG.S = var1.r();
      } else if("EntityHorse".equals(var1.Q())) {
         net.ne.l var3 = this.z.S(var1.d());
         if(var3 instanceof net.yn.j) {
            var2.F((net.yn.j)var3, new zv(var1.j(), var1.T()));
            var2.aG.S = var1.r();
         }
      } else if(!var1.U()) {
         var2.x(new net.t.b(var1.Q(), var1.j()));
         var2.aG.S = var1.r();
      } else {
         net.t.f var4 = new net.t.f(var1.Q(), var1.j(), var1.T());
         var2.n(var4);
         var2.aG.S = var1.r();
      }

   }

   public void S(net.no.r var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      ks var3 = var1.h();
      int var4 = var1.o();
      this.R.K().H(var3);
      if(var1.z() == -1) {
         var2.a8.F(var3);
      } else if(var1.z() == -2) {
         var2.a8.S(var4, var3);
      } else {
         boolean var5 = false;
         if(this.R.s5 instanceof net.c2.j) {
            net.c2.j var6 = (net.c2.j)this.R.s5;
            var5 = var6.E() != net.ys.r.D.t();
         }

         if(var1.z() == 0 && var1.o() >= 36 && var4 < 45) {
            if(!var3.B()) {
               ks var8 = var2.aW.f(var4).y();
               if(var8.B() || var8.U() < var3.U()) {
                  var3.S(5);
               }
            }

            var2.aW.e(var4, var3);
         } else if(var1.z() == var2.aG.S) {
            if(var1.z() == 0) {
               ;
            }

            var2.aG.e(var4, var3);
         }
      }

   }

   public void q(sz var1) {
      n.d(var1, this, this.R);
      net.nl.v var2 = null;
      net.yy.g var3 = this.R.sf;
      if(var1.Q() == 0) {
         var2 = var3.aW;
      } else if(var1.Q() == var3.aG.S) {
         var2 = var3.aG;
      }

      if(!var1.y()) {
         this.L((net.n2.k)(new net.m.b(var1.Q(), var1.m(), true)));
      }

   }

   public void B(i5 var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      if(var1.u() == 0) {
         var2.aW.U(var1.b());
      } else if(var1.u() == var2.aG.S) {
         var2.aG.U(var1.b());
      }

   }

   public void P(il var1) {
      n.d(var1, this, this.R);
      Object var2 = this.z.L(var1.N());
      if(!(var2 instanceof net.ni.sg)) {
         var2 = new net.ni.sg();
         ((net.ni.v)var2).k(this.z);
         ((net.ni.v)var2).h(var1.N());
      }

      this.R.sf.u((net.ni.sg)var2);
   }

   public void C(net.no.k var1) {
      n.d(var1, this, this.R);
      if(this.R.s8.o(var1.n())) {
         net.ni.v var2 = this.R.s8.L(var1.n());
         int var3 = var1.k();
         boolean var4 = var3 == 2 && var2 instanceof net.ni.q;
         if(var3 == 1 && var2 instanceof net.ni.u || var3 == 3 && var2 instanceof net.ni.h || var3 == 4 && var2 instanceof net.ni.s0 || var3 == 5 && var2 instanceof net.ni.m || var3 == 6 && var2 instanceof net.ni.g || var3 == 7 && var2 instanceof sl || var3 == 8 && var2 instanceof net.ni.z || var3 == 9 && var2 instanceof net.ni.sg || var3 == 10 && var2 instanceof net.ni.e || var3 == 11 && var2 instanceof net.ni.y) {
            var2.G(var1.L());
         }

         if(this.R.s5 instanceof tn) {
            ((tn)this.R.s5).H();
         }
      }

   }

   public void E(net.no.i var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      if(var2.aG != null && var2.aG.S == var1.M()) {
         var2.aG.k(var1.e(), var1.n());
      }

   }

   public void d(id var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.s());
      var2.u(var1.x(), var1.a());
   }

   public void u(ic var1) {
      n.d(var1, this, this.R);
      this.R.sf.ZW();
   }

   public void G(i6 var1) {
      n.d(var1, this, this.R);
      this.R.s8.x(var1.U(), var1.J(), var1.b(), var1.T());
   }

   public void x(net.no.l var1) {
      n.d(var1, this, this.R);
      this.R.s8.i(var1.x(), var1.I(), var1.F());
   }

   public void b(i1 var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      int var3 = var1.a();
      float var4 = var1.E();
      int var5 = net.u.t.M(var4 + 0.5F);
      if(var3 < i1.r.length && i1.r[var3] != null) {
         var2.g(new net.cb.h(i1.r[var3], new Object[0]), false);
      }

      if(var3 == 1) {
         this.z.B().d(true);
         this.z.A(0.0F);
      } else if(var3 == 2) {
         this.z.B().d(false);
         this.z.A(1.0F);
      } else if(var3 == 3) {
         this.R.sE.J(o9.M(var5));
      } else if(var3 == 4) {
         this.R.sf.x3.L((net.n2.k)(new net.m.a(net.m.a.PERFORM_RESPAWN)));
         this.R.s(new t4());
      } else if(var3 == 5) {
         net.nr.d var6 = this.R.T;
         if(var4 == 0.0F) {
            this.R.s(new tp());
         } else if(var4 == 101.0F) {
            this.R.y.I().G(new net.cb.h("demo.help.movement", new Object[]{net.nr.d.y(var6.ib.m()), net.nr.d.y(var6.w2.m()), net.nr.d.y(var6.P.m()), net.nr.d.y(var6.tT.m())}));
         } else if(var4 == 102.0F) {
            this.R.y.I().G(new net.cb.h("demo.help.jump", new Object[]{net.nr.d.y(var6.iD.m())}));
         } else if(var4 == 103.0F) {
            this.R.y.I().G(new net.cb.h("demo.help.inventory", new Object[]{net.nr.d.y(var6.iH.m())}));
         }
      } else if(var3 == 6) {
         this.z.L(var2, var2.b, var2.hS + (double)var2.A(), var2.hr, net.nb.l.CT, net.yz.p.PLAYERS, 0.18F, 0.45F);
      } else if(var3 == 7) {
         this.z.A(var4);
      } else if(var3 == 8) {
         this.z.d(var4);
      } else if(var3 == 10) {
         this.z.n(ai.MOB_APPEARANCE, var2.b, var2.hS, var2.hr, 0.0D, 0.0D, 0.0D, new int[0]);
         this.z.L(var2, var2.b, var2.hS, var2.hr, net.nb.l.KI, net.yz.p.HOSTILE, 1.0F, 1.0F);
      }

   }

   public void G(net.no.u var1) {
      n.d(var1, this, this.R);
      wo var2 = this.R.s4.v();
      net.cg.s var3 = yn.R(var1.S(), this.R.s8);
      String var4 = "map_" + var1.S();
      var3 = new net.cg.s(var4);
      if(var2.A(var4) != null) {
         net.cg.s var5 = var2.r(var2.A(var4));
         var3 = var5;
      }

      this.R.s8.Z(var4, var3);
      var1.X(var3);
      var2.e(var3);
   }

   public void e(net.no.a var1) {
      n.d(var1, this, this.R);
      if(var1.M()) {
         this.R.s8.A(var1.W(), var1.J(), var1.J());
      } else {
         this.R.s8.s(var1.W(), var1.J(), var1.J());
      }

   }

   public void G(net.no.x var1) {
      n.d(var1, this, this.R);
      this.G.Q(var1);
   }

   public void a(s2 var1) {
      n.d(var1, this, this.R);
      m_ var2 = var1.R();
      this.G.Z((xc)null, false);
   }

   public void E(si var1) {
      n.d(var1, this, this.R);

      for(Entry var3 : var1.D().entrySet()) {
         net.v.n var4 = (net.v.n)var3.getKey();
         int var5 = ((Integer)var3.getValue()).intValue();
         this.R.sf.q().H(this.R.sf, var4, var5);
      }

      this.x = true;
      if(this.R.s5 instanceof net.z.n) {
         ((net.z.n)this.R.s5).T();
      }

   }

   public void F(ip var1) {
      net.v.c var2;
      n.d(var1, this, this.R);
      var2 = this.R.sf.m();
      var2.v(var1.x());
      var2.U(var1.N());
      ip.a var3 = var1.I();
      label0:
      switch(null.N[var3.ordinal()]) {
      case 1:
         Iterator var4 = var1.W().iterator();

         while(true) {
            if(!var4.hasNext()) {
               break label0;
            }

            net.cr.s var5 = (net.cr.s)var4.next();
            var2.I(var5);
         }
      case 2:
         var1.W().forEach(var2::D);
         var1.V().forEach(var2::c);
         break;
      case 3:
         var1.W().forEach((var2x) -> {
            var2.D(var2x);
            var2.c(var2x);
            net.nd.g.m(this.R.J(), var2x);
         });
      }

      net.yf.n.z.forEach((var1) -> {
         var1.W(var2);
      });
      if(this.R.s5 instanceof net.q.p) {
         ((net.q.p)this.R.s5).D();
      }

   }

   public void H(net.no.v var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.P());
      if(var2 instanceof net.ne.a) {
         net.n_.f var3 = net.n_.f.Q(var1.m());
         net.n_.i var4 = new net.n_.i(var3, var1.R(), var1.J(), var1.L(), var1.R());
         var4.j(var1.w());
         ((net.ne.a)var2).o(var4);
      }

   }

   public void C(sf var1) {
      n.d(var1, this, this.R);
      if(var1.N == sf.q.ENTITY_DIED) {
         net.ne.l var2 = this.z.S(var1.w);
         if(var2 == this.R.sf) {
            this.R.s(new tr(var1.K));
         }
      }

   }

   public void O(net.no.y var1) {
      n.d(var1, this, this.R);
      this.R.s8.B().b(var1.k());
      this.R.s8.B().k(var1.P());
   }

   public void F(sm var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = var1.l(this.z);
      this.R.w(var2);
   }

   public void U(sx var1) {
      n.d(var1, this, this.R);
      var1.d(this.z.T());
   }

   public void t(sa var1) {
      n.d(var1, this, this.R);
      sa.t var2 = var1.N();
      String var3 = null;
      String var4 = null;
      String var5 = var1.n() != null?var1.n().c():"";
      switch(null.J[var2.ordinal()]) {
      case 1:
         var3 = var5;
         break;
      case 2:
         var4 = var5;
         break;
      case 3:
         this.R.y.u(var5, false);
         return;
      case 4:
         this.R.y.R("", "", -1, -1, -1);
         this.R.y.n();
         return;
      }

      this.R.y.R(var3, var4, var1.T(), var1.g(), var1.s());
   }

   public void q(net.no.w var1) {
      this.R.y.A().j(var1.P().c().isEmpty()?null:var1.P());
      this.R.y.A().Q(var1.w().c().isEmpty()?null:var1.w());
   }

   public void f(se var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = var1.l(this.z);
      if(var2 instanceof net.ne.a) {
         ((net.ne.a)var2).t(var1.j());
      }

   }

   public void Y(s3 var1) {
      n.d(var1, this, this.R);

      for(s3.w var3 : var1.m()) {
         if(var1.G() == s3.n.REMOVE_PLAYER) {
            this.N.remove(var3.o().getId());
         } else {
            b var4 = (b)this.N.get(var3.o().getId());
            if(var1.G() == s3.n.ADD_PLAYER) {
               var4 = new b(var3);
               this.N.put(var4.J().getId(), var4);
            }

            switch(null.E[var1.G().ordinal()]) {
            case 1:
               var4.w(var3.n());
               var4.P(var3.Y());
               break;
            case 2:
               var4.w(var3.n());
               break;
            case 3:
               var4.P(var3.Y());
               break;
            case 4:
               var4.M(var3.b());
            }
         }
      }

   }

   public void O(net.no.j var1) {
      this.L((net.n2.k)(new qs(var1.s())));
   }

   public void s(net.no.c var1) {
      n.d(var1, this, this.R);
      net.yy.g var2 = this.R.sf;
      var2.a6.n = var1.w();
      var2.a6.V = var1.k();
      var2.a6.T = var1.P();
      var2.a6.P = var1.R();
      var2.a6.A(var1.F());
      var2.a6.f(var1.m());
   }

   public void t(net.no.g var1) {
      n.d(var1, this, this.R);
      String[] var2 = var1.j();
      Arrays.sort(var2);
      if(this.R.s5 instanceof a2) {
         ((a2)this.R.s5).r(var2);
      }

   }

   public void y(net.no.sl var1) {
      n.d(var1, this, this.R);
      this.R.s8.L(this.R.sf, var1.j(), var1.I(), var1.w(), var1.U(), var1.x(), var1.P(), var1.d());
   }

   public void q(net.no.o var1) {
      n.d(var1, this, this.R);
      this.R.n().g((net.h.d)(new net.h.a(new m_(var1.u()), var1.t(), var1.D(), var1.j(), false, 0, net.h.d.LINEAR, (float)var1.k(), (float)var1.e(), (float)var1.w())));
   }

   public void o(iu var1) {
      final String var2 = var1.C();
      final String var3 = var1.G();
      if(this.E(var2)) {
         if(var2.startsWith("level://")) {
            String var4 = URLDecoder.decode(var2.substring("level://".length()), StandardCharsets.UTF_8.toString());
            File var5 = new File(this.R.sn, "saves");
            File var6 = new File(var5, var4);
            if(var6.isFile()) {
               this.L.F(new net.m.k(net.m.k.ACCEPTED));
               Futures.addCallback(this.R.g().T(var6), this.w());
               return;
            }

            this.L.F(new net.m.k(net.m.k.FAILED_DOWNLOAD));
         } else {
            net.cp.d var7 = this.R.m();
            if(var7.z() == net.cp.d.ENABLED) {
               this.L.F(new net.m.k(net.m.k.ACCEPTED));
               Futures.addCallback(this.R.g().Q(var2, var3), this.w());
            } else if(var7.z() != net.cp.d.PROMPT) {
               this.L.F(new net.m.k(net.m.k.DECLINED));
            } else {
               this.R.d(new Runnable() {
                  public void run() {
                     v.this.R.s(new wz(new net.z.f() {
                        public void y(boolean var1, int var2x) {
                           v.l;
                           v.this.R = net.nn.j.b();
                           net.cp.d var4 = v.this.R.m();
                           if(var4 != null) {
                              var4.F(net.cp.d.ENABLED);
                           }

                           v.this.L.F(new net.m.k(net.m.k.ACCEPTED));
                           Futures.addCallback(v.this.R.g().Q(var2, var3), v.this.w());
                           if(var4 != null) {
                              var4.F(net.cp.d.DISABLED);
                           }

                           v.this.L.F(new net.m.k(net.m.k.DECLINED));
                           net.cp.t.N(var4);
                           v.this.R.s((tu)null);
                        }

                        private static xn a(xn var0) {
                           return var0;
                        }
                     }, net.c9.b.x("multiplayer.texturePrompt.line1", new Object[0]), net.c9.b.x("multiplayer.texturePrompt.line2", new Object[0]), 0));
                  }
               });
            }
         }
      }

   }

   private boolean E(String var1) {
      URI var2 = new URI(var1);
      String var3 = var2.getScheme();
      boolean var4 = "level".equals(var3);
      if(!"http".equals(var3) && !"https".equals(var3)) {
         throw new URISyntaxException(var1, "Wrong protocol");
      } else if(!var1.contains("..") && var1.endsWith("/resources.zip")) {
         return true;
      } else {
         throw new URISyntaxException(var1, "Invalid levelstorage resourcepack path");
      }
   }

   private FutureCallback w() {
      return new FutureCallback() {
         public void onSuccess(@Nullable Object var1) {
            v.this.L.F(new net.m.k(net.m.k.SUCCESSFULLY_LOADED));
         }

         public void onFailure(Throwable var1) {
            v.this.L.F(new net.m.k(net.m.k.FAILED_DOWNLOAD));
         }
      };
   }

   public void H(sj var1) {
      n.d(var1, this, this.R);
      this.R.y.T().p(var1);
   }

   public void o(sn var1) {
      n.d(var1, this, this.R);
      if(var1.r() == 0) {
         this.R.sf.H().H(var1.K());
      } else {
         this.R.sf.H().V(var1.K(), var1.r());
      }

   }

   public void Z(sh var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.R.sf.o();
      if(var2 != this.R.sf && var2.V()) {
         var2.D(var1.W(), var1.L(), var1.S(), var1.J(), var1.P());
         this.L.F(new net.m.t(var2));
      }

   }

   public void K(sw var1) {
      n.d(var1, this, this.R);
      if("MC|TrList".equals(var1.q())) {
         net.n2.h var2 = var1.G();
         int var3 = var2.readInt();
         tu var4 = this.R.s5;
         if(var4 instanceof w7 && var3 == this.R.sf.aG.S) {
            net.ne.m var5 = ((w7)var4).S();
            net.nq.z var6 = net.nq.z.V(var2);
            var5.A(var6);
         }

         var2.release();
      } else if("MC|Brand".equals(var1.q())) {
         this.R.sf.m(var1.G().Z(32767));
      } else if("MC|BOpen".equals(var1.q())) {
         net.yz.k var8 = (net.yz.k)var1.G().S(net.yz.k.class);
         ks var12 = var8 == net.yz.k.OFF_HAND?this.R.sf.L():this.R.sf.S();
         if(var12.Z() == net.nb.j.e) {
            this.R.s(new tf(this.R.sf, var12, false));
         }
      } else if("MC|DebugPath".equals(var1.q())) {
         net.n2.h var9 = var1.G();
         int var13 = var9.readInt();
         float var16 = var9.readFloat();
         net.b.t var18 = net.b.t.L(var9);
         ((net.f.y)this.R.sM.h).c(var13, var18, var16);
      } else if("MC|DebugNeighborsUpdate".equals(var1.q())) {
         net.n2.h var10 = var1.G();
         long var14 = var10.M();
         net.u.j var19 = var10.S();
         ((net.f.x)this.R.sM.F).L(var14, var19);
      } else if("MC|StopSound".equals(var1.q())) {
         net.n2.h var11 = var1.G();
         String var15 = var11.Z(32767);
         String var17 = var11.Z(256);
         this.R.n().x(var17, net.yz.p.j(var15));
      }

   }

   public void m(i7 var1) {
      n.d(var1, this, this.R);
      net.nc.b var2 = this.z.J();
      if(var1.f() == 0) {
         net.nc.l var3 = var2.I(var1.c(), net.nc.u.l);
         var3.J(var1.t());
         var3.I(var1.Q());
      } else {
         net.nc.l var4 = var2.e(var1.c());
         if(var1.f() == 1) {
            var2.V(var4);
         } else if(var1.f() == 2) {
            var4.J(var1.t());
            var4.I(var1.Q());
         }
      }

   }

   public void N(st var1) {
      n.d(var1, this, this.R);
      net.nc.b var2 = this.z.J();
      net.nc.l var3 = var2.e(var1.K());
      if(var1.G() == st.r.CHANGE) {
         net.nc.o var4 = var2.p(var1.g(), var3);
         var4.A(var1.H());
      } else if(var1.G() == st.r.REMOVE) {
         if(a7.Y(var1.K())) {
            var2.k(var1.g(), (net.nc.l)null);
         } else {
            var2.k(var1.g(), var3);
         }
      }

   }

   public void r(s4 var1) {
      n.d(var1, this, this.R);
      net.nc.b var2 = this.z.J();
      if(var1.v().isEmpty()) {
         var2.W(var1.E(), (net.nc.l)null);
      } else {
         net.nc.l var3 = var2.e(var1.v());
         var2.W(var1.E(), var3);
      }

   }

   public void y(ik var1) {
      n.d(var1, this, this.R);
      net.nc.b var2 = this.z.J();
      net.nc.y var3;
      if(var1.u() == 0) {
         var3 = var2.S(var1.Z());
      } else {
         var3 = var2.R(var1.Z());
      }

      if(var1.u() == 0 || var1.u() == 2) {
         var3.q(var1.W());
         var3.J(var1.u());
         var3.u(var1.h());
         var3.s(net.cb.z.W(var1.d()));
         var3.l(var1.Y());
         net.nc.m var4 = net.nc.m.M(var1.y());
         var3.W(var4);
         net.nc.m var5 = net.nc.m.y(var1.A());
         var3.P(var5);
      }

      if(var1.u() == 0 || var1.u() == 3) {
         for(String var8 : var1.L()) {
            var2.A(var8, var1.Z());
         }
      }

      if(var1.u() == 4) {
         for(String var9 : var1.L()) {
            var2.A(var9, var3);
         }
      }

      if(var1.u() == 1) {
         var2.K(var3);
      }

   }

   public void f(s6 var1) {
      n.d(var1, this, this.R);
      if(var1.m() == 0) {
         double var2 = (double)(var1.o() * var1.W());
         double var4 = (double)(var1.o() * var1.y());
         double var6 = (double)(var1.o() * var1.G());
         this.z.T(var1.o(), var1.Y(), var1.g(), var1.n(), var1.F(), var2, var4, var6, var1.D());
      } else {
         for(int var16 = 0; var16 < var1.m(); ++var16) {
            double var3 = this.y.nextGaussian() * (double)var1.W();
            double var5 = this.y.nextGaussian() * (double)var1.y();
            double var7 = this.y.nextGaussian() * (double)var1.G();
            double var9 = this.y.nextGaussian() * (double)var1.o();
            double var11 = this.y.nextGaussian() * (double)var1.o();
            double var13 = this.y.nextGaussian() * (double)var1.o();
            this.z.T(var1.o(), var1.Y(), var1.g() + var3, var1.n() + var5, var1.F() + var7, var9, var11, var13, var1.D());
         }
      }

   }

   public void g(net.no.s var1) {
      n.d(var1, this, this.R);
      net.ne.l var2 = this.z.S(var1.v());
      if(!(var2 instanceof net.ne.a)) {
         throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var2 + ")");
      } else {
         net.s.m var3 = ((net.ne.a)var2).T();

         for(net.no.s var5 : var1.v()) {
            net.s.i var6 = var3.a(var5.e());
            var6 = var3.i(new net.s.r((net.s.b)null, var5.e(), 0.0D, 2.2250738585072014E-308D, Double.MAX_VALUE));
            var6.t(var5.X());
            var6.n();

            for(net.s.k var8 : var5.O()) {
               var6.g(var8);
            }
         }

      }
   }

   public void f(i9 var1) {
      n.d(var1, this, this.R);
      net.nl.v var2 = this.R.sf.aG;
      if(var2.S == var1.t() && var2.D((r)this.R.sf) && this.R.s5 instanceof net.q.p) {
         net.q.d var3 = ((net.q.p)this.R.s5).w();
         var3.g(var1.L(), var2.e);
      }

   }

   public a q() {
      return this.L;
   }

   public Collection B() {
      return this.N.values();
   }

   public b f(UUID var1) {
      return (b)this.N.get(var1);
   }

   @Nullable
   public b L(String var1) {
      for(b var3 : this.N.values()) {
         if(var3.J().getName().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public GameProfile R() {
      return this.a;
   }

   public h T() {
      return this.G;
   }

   // $FF: synthetic method
   private void lambda$handleChangeGameState$0() {
      this.R.sf.x3.L((net.n2.k)(new net.m.a(net.m.a.PERFORM_RESPAWN)));
   }

   static {
      l("jKueic");
   }

   public static void l(String var0) {
      l = var0;
   }

   public static String C() {
      return l;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
