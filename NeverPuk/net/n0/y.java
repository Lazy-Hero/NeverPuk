package net.n0;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.a;
import net.n0.b;
import net.n0.c;
import net.n0.d;
import net.n0.e;
import net.n0.f;
import net.n0.g;
import net.n0.h;
import net.n0.i;
import net.n0.j;
import net.n0.k;
import net.n0.k0;
import net.n0.k1;
import net.n0.k2;
import net.n0.k3;
import net.n0.k4;
import net.n0.k5;
import net.n0.k7;
import net.n0.kb;
import net.n0.kc;
import net.n0.kd;
import net.n0.kg;
import net.n0.kh;
import net.n0.ki;
import net.n0.kj;
import net.n0.kl;
import net.n0.ko;
import net.n0.kp;
import net.n0.kq;
import net.n0.ks;
import net.n0.kt;
import net.n0.kw;
import net.n0.ky;
import net.n0.l;
import net.n0.m;
import net.n0.n;
import net.n0.o;
import net.n0.p;
import net.n0.q;
import net.n0.r;
import net.n0.s;
import net.n0.t;
import net.n0.u;
import net.n0.v;
import net.n0.w;
import net.n0.x;
import net.n0.y0;
import net.n0.y1;
import net.n0.y2;
import net.n0.y3;
import net.n0.y4;
import net.n0.y5;
import net.n0.y7;
import net.n0.y8;
import net.n0.y9;
import net.n0.y_;
import net.n0.ya;
import net.n0.yb;
import net.n0.yc;
import net.n0.yd;
import net.n0.ye;
import net.n0.yf;
import net.n0.yg;
import net.n0.yh;
import net.n0.yi;
import net.n0.yj;
import net.n0.yk;
import net.n0.yl;
import net.n0.ym;
import net.n0.yn;
import net.n0.yo;
import net.n0.yp;
import net.n0.yq;
import net.n0.yr;
import net.n0.ys;
import net.n0.yt;
import net.n0.yu;
import net.n0.yv;
import net.n0.yw;
import net.n0.yx;
import net.n0.yy;
import net.n0.yz;
import net.nl.z2;
import net.y9.gc;
import net.y9.gi;
import net.y9.gy;
import net.y9.lc;
import net.y9.lh;
import net.y9.li;
import net.y9.ln;
import net.y9.lo;
import net.y9.ri;
import net.y9.rv;
import net.yz.aa;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;
import net.yz.m_;

public class y {
   public static final net.c.d V = new net.c.d();
   private static final Map f = Maps.newHashMap();
   private static final ky C = new ky() {
      public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
         return var1.j()?1.0F:0.0F;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final ky g = new ky() {
      public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
         return net.u.t.T((float)var1.z() / (float)var1.Z(), 0.0F, 1.0F);
      }
   };
   private static final ky O = new ky() {
      public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
         int[] var4 = kw.b();
         return var3 != null && var3.a() != aa.RIGHT?1.0F:0.0F;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final ky c = new ky() {
      public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
         int[] var4 = kw.b();
         return var3 instanceof net.r.r?((net.r.r)var3).H().e(var1.Z(), 0.0F):0.0F;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final net.c.r w = new net.c.w();
   protected static final UUID U = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID v = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   private net.ys.r i;
   protected static Random u = new Random();
   protected int S = 64;
   private int Z;
   protected boolean L;
   protected boolean T;
   private y h;
   private String K;
   private static boolean b;

   public static int h(y var0) {
      return 0;
   }

   public static y k(int var0) {
      return (y)V.T(var0);
   }

   public static y q(net.y9.l var0) {
      y var1 = (y)f.get(var0);
      return net.nb.j.SL;
   }

   @Nullable
   public static y H(String var0) {
      kw.b();
      y var2 = (y)V.B(new m_(var0));
      return var2 == null?k(Integer.parseInt(var0)):var2;
   }

   public final void V(m_ var1, ky var2) {
      this.w.H(var1, var2);
   }

   @Nullable
   public ky x(m_ var1) {
      return (ky)this.w.B(var1);
   }

   public boolean v() {
      return !this.w.i().isEmpty();
   }

   public boolean v(net.nj.f var1) {
      return false;
   }

   public y() {
      this.V(new m_("lefthanded"), O);
      this.V(new m_("cooldown"), c);
   }

   public y F(int var1) {
      this.S = var1;
      return this;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      return ad.PASS;
   }

   public float V(ks var1, net.yw.n var2) {
      return 1.0F;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      return new am(ad.PASS, var2.o((net.yz.k)var3));
   }

   public ks V(ks var1, net.yv.r var2, net.ne.a var3) {
      return var1;
   }

   public int E() {
      return this.S;
   }

   public int o(int var1) {
      return 0;
   }

   public boolean I() {
      return this.T;
   }

   protected y z(boolean var1) {
      this.T = var1;
      return this;
   }

   public int F() {
      return this.Z;
   }

   protected y d(int var1) {
      int[] var2 = kw.b();
      this.Z = var1;
      this.V(new m_("damaged"), C);
      this.V(new m_("damage"), g);
      return this;
   }

   public boolean P() {
      return this.Z > 0 && (!this.T || this.S == 1);
   }

   public boolean S(ks var1, net.ne.a var2, net.ne.a var3) {
      return false;
   }

   public boolean Y(ks var1, net.yv.r var2, net.yw.n var3, net.u.j var4, net.ne.a var5) {
      return false;
   }

   public boolean W(net.yw.n var1) {
      return false;
   }

   public boolean X(ks var1, net.r.r var2, net.ne.a var3, net.yz.k var4) {
      return false;
   }

   public y G() {
      this.L = true;
      return this;
   }

   public boolean a() {
      return this.L;
   }

   public boolean O() {
      return false;
   }

   public y e(String var1) {
      this.K = var1;
      return this;
   }

   public String B(ks var1) {
      return net.yq.e.E(this.f(var1));
   }

   public String z() {
      return "item." + this.K;
   }

   public String f(ks var1) {
      return "item." + this.K;
   }

   public y d(y var1) {
      this.h = var1;
      return this;
   }

   public boolean x() {
      return true;
   }

   @Nullable
   public y y() {
      return this.h;
   }

   public boolean U() {
      return this.h != null;
   }

   public void j(ks var1, net.yv.r var2, net.ne.l var3, int var4, boolean var5) {
   }

   public void g(ks var1, net.yv.r var2, net.r.r var3) {
   }

   public boolean j() {
      return false;
   }

   public k7 g(ks var1) {
      return k7.NONE;
   }

   public int K(ks var1) {
      return 0;
   }

   public void k(ks var1, net.yv.r var2, net.ne.a var3, int var4) {
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
   }

   public String m(ks var1) {
      return net.yq.e.E(this.B(var1) + ".name").trim();
   }

   public boolean F(ks var1) {
      return var1.g();
   }

   public kt B(ks var1) {
      return var1.g()?kt.RARE:kt.COMMON;
   }

   public boolean x(ks var1) {
      return this.E() == 1 && this.P();
   }

   protected net.u.m X(net.yv.r var1, net.r.r var2, boolean var3) {
      float var5 = var2.V;
      float var6 = var2.hN;
      double var7 = var2.b;
      double var9 = var2.hS + (double)var2.A();
      double var11 = var2.hr;
      net.u.r var13 = new net.u.r(var7, var9, var11);
      kw.b();
      float var14 = net.u.t.m(-var6 * 0.017453292F - 3.1415927F);
      float var15 = net.u.t.A(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -net.u.t.m(-var5 * 0.017453292F);
      float var17 = net.u.t.A(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var19 = var14 * var16;
      double var10000 = 5.0D;
      net.u.r var22 = var13.s((double)var18 * 5.0D, (double)var17 * 5.0D, (double)var19 * 5.0D);
      return var1.s(var13, var22, var3, !var3, false);
   }

   public int z() {
      return 0;
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         var2.add(new ks(this));
      }

   }

   protected boolean a(net.ys.r var1) {
      net.ys.r var2 = this.V();
      return var1 == net.ys.r.B || var1 == var2;
   }

   @Nullable
   public net.ys.r V() {
      return this.i;
   }

   public y M(net.ys.r var1) {
      this.i = var1;
      return this;
   }

   public boolean W() {
      return false;
   }

   public boolean l(ks var1, ks var2) {
      return false;
   }

   public Multimap v(z2 var1) {
      return HashMultimap.create();
   }

   public static void r() {
      M((net.y9.l)net.nb.f.ou, (y)(new k(net.nb.f.ou)));
      M(net.nb.f.oy, (new h(net.nb.f.oy, net.nb.f.oy, new h.u() {
         public String J(ks var1) {
            return lc.d.m(var1.n()).g();
         }
      })).e("stone"));
      M((net.y9.l)net.nb.f.p, (y)(new b(net.nb.f.p, false)));
      M(net.nb.f.dl, (new h(net.nb.f.dl, net.nb.f.dl, new h.u() {
         public String J(ks var1) {
            return rv.m.r(var1.n()).L();
         }
      })).e("dirt"));
      y(net.nb.f.TD);
      M(net.nb.f.oN, (new h(net.nb.f.oN, net.nb.f.oN, new h.u() {
         public String J(ks var1) {
            return gc.i.r(var1.n()).m();
         }
      })).e("wood"));
      M(net.nb.f.X, (new h(net.nb.f.X, net.nb.f.X, new h.u() {
         public String J(ks var1) {
            return gc.i.r(var1.n()).m();
         }
      })).e("sapling"));
      y(net.nb.f.T8);
      M((net.y9.l)net.nb.f.TF, (y)(new h(net.nb.f.TF, net.nb.f.TF, new h.u() {
         public String J(ks var1) {
            return ri.g.D(var1.n()).l();
         }
      })).e("sand"));
      y(net.nb.f.D);
      y(net.nb.f.z);
      y(net.nb.f.u7);
      y(net.nb.f.oK);
      M(net.nb.f.u6, (new h(net.nb.f.u6, net.nb.f.u6, new h.u() {
         public String J(ks var1) {
            return gc.i.r(var1.n()).m();
         }
      })).e("log"));
      M(net.nb.f.ub, (new h(net.nb.f.ub, net.nb.f.ub, new h.u() {
         public String J(ks var1) {
            return gc.i.r(var1.n() + 4).m();
         }
      })).e("log"));
      M((net.y9.l)net.nb.f.Tu, (y)(new d(net.nb.f.Tu)).e("leaves"));
      M((net.y9.l)net.nb.f.G, (y)(new d(net.nb.f.G)).e("leaves"));
      M(net.nb.f.um, (new h(net.nb.f.um, net.nb.f.um, new h.u() {
         public String J(ks var1) {
            return (var1.n() & 1) == 1?"wet":"dry";
         }

         private static xn a(xn var0) {
            return var0;
         }
      })).e("sponge"));
      y(net.nb.f.Tm);
      y(net.nb.f.dT);
      y(net.nb.f.Ti);
      y(net.nb.f.v);
      M(net.nb.f.ul, (new h(net.nb.f.ul, net.nb.f.ul, new h.u() {
         public String J(ks var1) {
            return lo.h.D(var1.n()).l();
         }
      })).e("sandStone"));
      y(net.nb.f.ug);
      y(net.nb.f.uR);
      y(net.nb.f.dw);
      M((net.y9.l)net.nb.f.oG, (y)(new l(net.nb.f.oG)));
      y(net.nb.f.o);
      M((net.y9.l)net.nb.f.TU, (y)(new b(net.nb.f.TU, true)).S(new String[]{"shrub", "grass", "fern"}));
      y(net.nb.f.dY);
      M((net.y9.l)net.nb.f.TP, (y)(new l(net.nb.f.TP)));
      M(net.nb.f.ur, (new net.n0.z(net.nb.f.ur)).e("cloth"));
      M((net.y9.l)net.nb.f.dO, (y)(new h(net.nb.f.dO, net.nb.f.dO, new h.u() {
         public String J(ks var1) {
            return net.y9.n.D(net.y9.n.YELLOW, var1.n()).c();
         }
      })).e("flower"));
      M((net.y9.l)net.nb.f.d2, (y)(new h(net.nb.f.d2, net.nb.f.d2, new h.u() {
         public String J(ks var1) {
            return net.y9.n.D(net.y9.n.RED, var1.n()).c();
         }
      })).e("rose"));
      y(net.nb.f.df);
      y(net.nb.f.T);
      y(net.nb.f.uW);
      y(net.nb.f.TE);
      M((net.y9.l)net.nb.f.Tt, (y)(new p(net.nb.f.Tt, net.nb.f.Tt, net.nb.f.dn)).e("stoneSlab"));
      y(net.nb.f.E);
      y(net.nb.f.T7);
      y(net.nb.f.W);
      y(net.nb.f.T9);
      y(net.nb.f.c);
      y(net.nb.f.uZ);
      y(net.nb.f.dg);
      y(net.nb.f.TW);
      y(net.nb.f.Tn);
      y(net.nb.f.uA);
      y(net.nb.f.us);
      y(net.nb.f.uQ);
      M((net.y9.l)net.nb.f.dM, (y)(new p(net.nb.f.dM, net.nb.f.dM, net.nb.f.T6)).e("purpurSlab"));
      y(net.nb.f.uw);
      y(net.nb.f.TQ);
      y(net.nb.f.uG);
      y(net.nb.f.TT);
      y(net.nb.f.ud);
      y(net.nb.f.uj);
      y(net.nb.f.dJ);
      y(net.nb.f.uY);
      y(net.nb.f.K);
      y(net.nb.f.uU);
      y(net.nb.f.uI);
      y(net.nb.f.T_);
      y(net.nb.f.Td);
      y(net.nb.f.dp);
      y(net.nb.f.uT);
      y(net.nb.f.ut);
      y(net.nb.f.uE);
      M((net.y9.l)net.nb.f.Tl, (y)(new m(net.nb.f.Tl)));
      y(net.nb.f.oD);
      y(net.nb.f.V);
      y(net.nb.f.dW);
      y(net.nb.f.uz);
      y(net.nb.f.ue);
      y(net.nb.f.I);
      y(net.nb.f.u4);
      y(net.nb.f.d1);
      y(net.nb.f.e);
      y(net.nb.f.TX);
      y(net.nb.f.op);
      y(net.nb.f.TS);
      y(net.nb.f.R);
      y(net.nb.f.u9);
      y(net.nb.f.Tr);
      y(net.nb.f.N);
      y(net.nb.f.or);
      M(net.nb.f.uX, (new h(net.nb.f.uX, net.nb.f.uX, new h.u() {
         public String J(ks var1) {
            return lh.m.h(var1.n()).E();
         }
      })).e("monsterStoneEgg"));
      M(net.nb.f.TM, (new h(net.nb.f.TM, net.nb.f.TM, new h.u() {
         public String J(ks var1) {
            return li.t.f(var1.n()).K();
         }
      })).e("stonebricksmooth"));
      y(net.nb.f.d);
      y(net.nb.f.Q);
      y(net.nb.f.d8);
      y(net.nb.f.L);
      y(net.nb.f.dm);
      M((net.y9.l)net.nb.f.To, (y)(new b(net.nb.f.To, false)));
      y(net.nb.f.P);
      y(net.nb.f.u);
      y(net.nb.f.u_);
      y(net.nb.f.C);
      y(net.nb.f.q);
      y(net.nb.f.T2);
      y(net.nb.f.u8);
      y(net.nb.f.TV);
      y(net.nb.f.u2);
      M((net.y9.l)net.nb.f.dD, (y)(new u(net.nb.f.dD)));
      y(net.nb.f.Tb);
      y(net.nb.f.Tx);
      y(net.nb.f.uk);
      y(net.nb.f.TZ);
      y(net.nb.f.dE);
      y(net.nb.f.Tz);
      y(net.nb.f.dV);
      y(net.nb.f.Ts);
      y(net.nb.f.uv);
      M((net.y9.l)net.nb.f.S, (y)(new p(net.nb.f.S, net.nb.f.S, net.nb.f.d6)).e("woodSlab"));
      y(net.nb.f.TA);
      y(net.nb.f.m);
      y(net.nb.f.uy);
      y(net.nb.f.d5);
      y(net.nb.f.du);
      y(net.nb.f.TK);
      y(net.nb.f.x);
      y(net.nb.f.u5);
      y(net.nb.f.i);
      y(net.nb.f.uB);
      M(net.nb.f.od, (new h(net.nb.f.od, net.nb.f.od, new h.u() {
         public String J(ks var1) {
            return ln.n.L(var1.n()).G();
         }
      })).e("cobbleWall"));
      y(net.nb.f.uo);
      M(net.nb.f.uc, (new s(net.nb.f.uc)).e("anvil"));
      y(net.nb.f.dI);
      y(net.nb.f.uS);
      y(net.nb.f.dX);
      y(net.nb.f.u3);
      y(net.nb.f.dL);
      y(net.nb.f.s);
      y(net.nb.f.uq);
      M(net.nb.f.dd, (new h(net.nb.f.dd, net.nb.f.dd, new String[]{"default", "chiseled", "lines"})).e("quartzBlock"));
      y(net.nb.f.y);
      y(net.nb.f.j);
      y(net.nb.f.Ta);
      M(net.nb.f.Ty, (new net.n0.z(net.nb.f.Ty)).e("clayHardenedStained"));
      y(net.nb.f.dr);
      y(net.nb.f.up);
      y(net.nb.f.ow);
      M(net.nb.f.uK, (new net.n0.z(net.nb.f.uK)).e("woolCarpet"));
      y(net.nb.f.oY);
      y(net.nb.f.TR);
      y(net.nb.f.d4);
      y(net.nb.f.dN);
      y(net.nb.f.dG);
      y(net.nb.f.di);
      y(net.nb.f.A);
      kw.b();
      M((net.y9.l)net.nb.f.Tg, (y)(new h(net.nb.f.Tg, net.nb.f.Tg, new h.u() {
         public String J(ks var1) {
            return net.y9.y.l(var1.n()).P();
         }
      })).e("doublePlant"));
      M((net.y9.l)net.nb.f.T5, (y)(new net.n0.z(net.nb.f.T5)).e("stainedGlass"));
      M((net.y9.l)net.nb.f.J, (y)(new net.n0.z(net.nb.f.J)).e("stainedGlassPane"));
      M(net.nb.f.oT, (new h(net.nb.f.oT, net.nb.f.oT, new h.u() {
         public String J(ks var1) {
            return gi.x.D(var1.n()).h();
         }
      })).e("prismarine"));
      y(net.nb.f.uO);
      M(net.nb.f.Tj, (new h(net.nb.f.Tj, net.nb.f.Tj, new h.u() {
         public String J(ks var1) {
            return gy.w.I(var1.n()).N();
         }
      })).e("redSandStone"));
      y(net.nb.f.uD);
      M((net.y9.l)net.nb.f.T4, (y)(new p(net.nb.f.T4, net.nb.f.T4, net.nb.f.d_)).e("stoneSlab2"));
      y(net.nb.f.M);
      y(net.nb.f.Tc);
      y(net.nb.f.U);
      y(net.nb.f.TH);
      y(net.nb.f.Tq);
      y(net.nb.f.TI);
      y(net.nb.f.f);
      y(net.nb.f.ui);
      M((net.y9.l)net.nb.f.Tv, (y)(new t(net.nb.f.Tv)));
      M((net.y9.l)net.nb.f.uH, (y)(new t(net.nb.f.uH)));
      M((net.y9.l)net.nb.f.TC, (y)(new t(net.nb.f.TC)));
      M((net.y9.l)net.nb.f.d3, (y)(new t(net.nb.f.d3)));
      M((net.y9.l)net.nb.f.dq, (y)(new t(net.nb.f.dq)));
      M((net.y9.l)net.nb.f.Tp, (y)(new t(net.nb.f.Tp)));
      M((net.y9.l)net.nb.f.Z, (y)(new t(net.nb.f.Z)));
      M((net.y9.l)net.nb.f.dx, (y)(new t(net.nb.f.dx)));
      M((net.y9.l)net.nb.f.dC, (y)(new t(net.nb.f.dC)));
      M((net.y9.l)net.nb.f.Tw, (y)(new t(net.nb.f.Tw)));
      M((net.y9.l)net.nb.f.u0, (y)(new t(net.nb.f.u0)));
      M((net.y9.l)net.nb.f.h, (y)(new t(net.nb.f.h)));
      M((net.y9.l)net.nb.f.t, (y)(new t(net.nb.f.t)));
      M((net.y9.l)net.nb.f.dk, (y)(new t(net.nb.f.dk)));
      M((net.y9.l)net.nb.f.dt, (y)(new t(net.nb.f.dt)));
      M((net.y9.l)net.nb.f.Te, (y)(new t(net.nb.f.Te)));
      y(net.nb.f.Th);
      y(net.nb.f.oU);
      y(net.nb.f.Y);
      y(net.nb.f.n);
      y(net.nb.f.T3);
      y(net.nb.f.ux);
      y(net.nb.f.ua);
      y(net.nb.f.uC);
      y(net.nb.f.un);
      y(net.nb.f.dS);
      y(net.nb.f.dR);
      y(net.nb.f.oA);
      y(net.nb.f.O);
      y(net.nb.f.d9);
      y(net.nb.f.TN);
      y(net.nb.f.de);
      M(net.nb.f.w, (new net.n0.z(net.nb.f.w)).e("concrete"));
      M(net.nb.f.db, (new net.n0.z(net.nb.f.db)).e("concrete_powder"));
      y(net.nb.f.TJ);
      y(256, "iron_shovel", (new kh(y.d.IRON)).e("shovelIron"));
      y(257, "iron_pickaxe", (new kc(y.d.IRON)).e("pickaxeIron"));
      y(258, "iron_axe", (new k1(y.d.IRON)).e("hatchetIron"));
      y(259, "flint_and_steel", (new y5()).e("flintAndSteel"));
      y(260, "apple", (new yt(4, 0.3F, false)).e("apple"));
      y(261, "bow", (new e()).e("bow"));
      y(262, "arrow", (new x()).e("arrow"));
      y(263, "coal", (new y0()).e("coal"));
      y(264, "diamond", (new y()).e("diamond").M(net.ys.r.I));
      y(265, "iron_ingot", (new y()).e("ingotIron").M(net.ys.r.I));
      y(266, "gold_ingot", (new y()).e("ingotGold").M(net.ys.r.I));
      y(267, "iron_sword", (new k3(y.d.IRON)).e("swordIron"));
      y(268, "wooden_sword", (new k3(y.d.WOOD)).e("swordWood"));
      y(269, "wooden_shovel", (new kh(y.d.WOOD)).e("shovelWood"));
      y(270, "wooden_pickaxe", (new kc(y.d.WOOD)).e("pickaxeWood"));
      y(271, "wooden_axe", (new k1(y.d.WOOD)).e("hatchetWood"));
      y(272, "stone_sword", (new k3(y.d.STONE)).e("swordStone"));
      y(273, "stone_shovel", (new kh(y.d.STONE)).e("shovelStone"));
      y(274, "stone_pickaxe", (new kc(y.d.STONE)).e("pickaxeStone"));
      y(275, "stone_axe", (new k1(y.d.STONE)).e("hatchetStone"));
      y(276, "diamond_sword", (new k3(y.d.DIAMOND)).e("swordDiamond"));
      y(277, "diamond_shovel", (new kh(y.d.DIAMOND)).e("shovelDiamond"));
      y(278, "diamond_pickaxe", (new kc(y.d.DIAMOND)).e("pickaxeDiamond"));
      y(279, "diamond_axe", (new k1(y.d.DIAMOND)).e("hatchetDiamond"));
      y(280, "stick", (new y()).G().e("stick").M(net.ys.r.I));
      y(281, "bowl", (new y()).e("bowl").M(net.ys.r.I));
      y(282, "mushroom_stew", (new yz(6)).e("mushroomStew"));
      y(283, "golden_sword", (new k3(y.d.GOLD)).e("swordGold"));
      y(284, "golden_shovel", (new kh(y.d.GOLD)).e("shovelGold"));
      y(285, "golden_pickaxe", (new kc(y.d.GOLD)).e("pickaxeGold"));
      y(286, "golden_axe", (new k1(y.d.GOLD)).e("hatchetGold"));
      y(287, "string", (new v(net.nb.f.u1)).e("string").M(net.ys.r.I));
      y(288, "feather", (new y()).e("feather").M(net.ys.r.I));
      y(289, "gunpowder", (new y()).e("sulphur").M(net.ys.r.I));
      y(290, "wooden_hoe", (new y9(y.d.WOOD)).e("hoeWood"));
      y(291, "stone_hoe", (new y9(y.d.STONE)).e("hoeStone"));
      y(292, "iron_hoe", (new y9(y.d.IRON)).e("hoeIron"));
      y(293, "diamond_hoe", (new y9(y.d.DIAMOND)).e("hoeDiamond"));
      y(294, "golden_hoe", (new y9(y.d.GOLD)).e("hoeGold"));
      y(295, "wheat_seeds", (new ko(net.nb.f.uN, net.nb.f.dJ)).e("seeds"));
      y(296, "wheat", (new y()).e("wheat").M(net.ys.r.I));
      y(297, "bread", (new yt(5, 0.6F, false)).e("bread"));
      y(298, "leather_helmet", (new j(j.n.LEATHER, 0, z2.HEAD)).e("helmetCloth"));
      y(299, "leather_chestplate", (new j(j.n.LEATHER, 0, z2.CHEST)).e("chestplateCloth"));
      y(300, "leather_leggings", (new j(j.n.LEATHER, 0, z2.LEGS)).e("leggingsCloth"));
      y(301, "leather_boots", (new j(j.n.LEATHER, 0, z2.FEET)).e("bootsCloth"));
      y(302, "chainmail_helmet", (new j(j.n.CHAIN, 1, z2.HEAD)).e("helmetChain"));
      y(303, "chainmail_chestplate", (new j(j.n.CHAIN, 1, z2.CHEST)).e("chestplateChain"));
      y(304, "chainmail_leggings", (new j(j.n.CHAIN, 1, z2.LEGS)).e("leggingsChain"));
      y(305, "chainmail_boots", (new j(j.n.CHAIN, 1, z2.FEET)).e("bootsChain"));
      y(306, "iron_helmet", (new j(j.n.IRON, 2, z2.HEAD)).e("helmetIron"));
      y(307, "iron_chestplate", (new j(j.n.IRON, 2, z2.CHEST)).e("chestplateIron"));
      y(308, "iron_leggings", (new j(j.n.IRON, 2, z2.LEGS)).e("leggingsIron"));
      y(309, "iron_boots", (new j(j.n.IRON, 2, z2.FEET)).e("bootsIron"));
      y(310, "diamond_helmet", (new j(j.n.DIAMOND, 3, z2.HEAD)).e("helmetDiamond"));
      y(311, "diamond_chestplate", (new j(j.n.DIAMOND, 3, z2.CHEST)).e("chestplateDiamond"));
      y(312, "diamond_leggings", (new j(j.n.DIAMOND, 3, z2.LEGS)).e("leggingsDiamond"));
      y(313, "diamond_boots", (new j(j.n.DIAMOND, 3, z2.FEET)).e("bootsDiamond"));
      y(314, "golden_helmet", (new j(j.n.GOLD, 4, z2.HEAD)).e("helmetGold"));
      y(315, "golden_chestplate", (new j(j.n.GOLD, 4, z2.CHEST)).e("chestplateGold"));
      y(316, "golden_leggings", (new j(j.n.GOLD, 4, z2.LEGS)).e("leggingsGold"));
      y(317, "golden_boots", (new j(j.n.GOLD, 4, z2.FEET)).e("bootsGold"));
      y(318, "flint", (new y()).e("flint").M(net.ys.r.I));
      y(319, "porkchop", (new yt(3, 0.3F, true)).e("porkchopRaw"));
      y(320, "cooked_porkchop", (new yt(8, 0.8F, true)).e("porkchopCooked"));
      y(321, "painting", (new yx(net.nm.l.class)).e("painting"));
      y(322, "golden_apple", (new ys(4, 1.2F, false)).r().e("appleGold"));
      y(323, "sign", (new ki()).e("sign"));
      y(324, "wooden_door", (new yo(net.nb.f.dc)).e("doorOak"));
      y var1 = (new i(net.nb.f.ou)).e("bucket").F(16);
      y(325, "bucket", var1);
      y(326, "water_bucket", (new i(net.nb.f.dy)).e("bucketWater").d(var1));
      y(327, "lava_bucket", (new i(net.nb.f.dj)).e("bucketLava").d(var1));
      y(328, "minecart", (new ye(net.nm.w.RIDEABLE)).e("minecart"));
      y(329, "saddle", (new k2()).e("saddle"));
      y(330, "iron_door", (new yo(net.nb.f.o2)).e("doorIron"));
      y(331, "redstone", (new k0()).e("redstone"));
      y(332, "snowball", (new kj()).e("snowball"));
      y(333, "boat", new g(net.nm.b.OAK));
      y(334, "leather", (new y()).e("leather").M(net.ys.r.I));
      y(335, "milk_bucket", (new a()).e("milk").d(var1));
      y(336, "brick", (new y()).e("brick").M(net.ys.r.I));
      y(337, "clay_ball", (new y()).e("clay").M(net.ys.r.I));
      y(338, "reeds", (new v(net.nb.f.dF)).e("reeds").M(net.ys.r.I));
      y(339, "paper", (new y()).e("paper").M(net.ys.r.K));
      y(340, "book", (new f()).e("book").M(net.ys.r.K));
      y(341, "slime_ball", (new y()).e("slimeball").M(net.ys.r.K));
      y(342, "chest_minecart", (new ye(net.nm.w.CHEST)).e("minecartChest"));
      y(343, "furnace_minecart", (new ye(net.nm.w.FURNACE)).e("minecartFurnace"));
      y(344, "egg", (new yq()).e("egg"));
      y(345, "compass", (new y2()).e("compass").M(net.ys.r.y));
      y(346, "fishing_rod", (new yd()).e("fishingRod"));
      y(347, "clock", (new yb()).e("clock").M(net.ys.r.y));
      y(348, "glowstone_dust", (new y()).e("yellowDust").M(net.ys.r.I));
      y(349, "fish", (new yw(false)).e("fish").z(true));
      y(350, "cooked_fish", (new yw(true)).e("fish").z(true));
      y(351, "dye", (new y4()).e("dyePowder"));
      y(352, "bone", (new y()).e("bone").G().M(net.ys.r.K));
      y(353, "sugar", (new y()).e("sugar").M(net.ys.r.I));
      y(354, "cake", (new v(net.nb.f.ds)).F(1).e("cake").M(net.ys.r.A));
      y(355, "bed", (new o()).F(1).e("bed"));
      y(356, "repeater", (new v(net.nb.f.dQ)).e("diode").M(net.ys.r.i));
      y(357, "cookie", (new yt(2, 0.1F, false)).e("cookie"));
      y(358, "filled_map", (new yn()).e("map"));
      y(359, "shears", (new k4()).e("shears"));
      y(360, "melon", (new yt(2, 0.3F, false)).e("melon"));
      y(361, "pumpkin_seeds", (new ko(net.nb.f.H, net.nb.f.dJ)).e("seeds_pumpkin"));
      y(362, "melon_seeds", (new ko(net.nb.f.TB, net.nb.f.dJ)).e("seeds_melon"));
      y(363, "beef", (new yt(3, 0.3F, true)).e("beefRaw"));
      y(364, "cooked_beef", (new yt(8, 0.8F, true)).e("beefCooked"));
      y(365, "chicken", (new yt(2, 0.3F, true)).b(new net.n_.i(net.nb.b.p, 600, 0), 0.3F).e("chickenRaw"));
      y(366, "cooked_chicken", (new yt(6, 0.6F, true)).e("chickenCooked"));
      y(367, "rotten_flesh", (new yt(4, 0.1F, true)).b(new net.n_.i(net.nb.b.p, 600, 0), 0.8F).e("rottenFlesh"));
      y(368, "ender_pearl", (new y3()).e("enderPearl"));
      y(369, "blaze_rod", (new y()).e("blazeRod").M(net.ys.r.I).G());
      y(370, "ghast_tear", (new y()).e("ghastTear").M(net.ys.r.k));
      y(371, "gold_nugget", (new y()).e("goldNugget").M(net.ys.r.I));
      y(372, "nether_wart", (new ko(net.nb.f.dP, net.nb.f.u9)).e("netherStalkSeeds"));
      y(373, "potion", (new yk()).e("potion"));
      y var2 = (new ym()).e("glassBottle");
      y(374, "glass_bottle", var2);
      y(375, "spider_eye", (new yt(2, 0.8F, false)).b(new net.n_.i(net.nb.b.j, 100, 0), 1.0F).e("spiderEye"));
      y(376, "fermented_spider_eye", (new y()).e("fermentedSpiderEye").M(net.ys.r.k));
      y(377, "blaze_powder", (new y()).e("blazePowder").M(net.ys.r.k));
      y(378, "magma_cream", (new y()).e("magmaCream").M(net.ys.r.k));
      y(379, "brewing_stand", (new v(net.nb.f.uF)).e("brewingStand").M(net.ys.r.k));
      y(380, "cauldron", (new v(net.nb.f.dh)).e("cauldron").M(net.ys.r.k));
      y(381, "ender_eye", (new yj()).e("eyeOfEnder"));
      y(382, "speckled_melon", (new y()).e("speckledMelon").M(net.ys.r.k));
      y(383, "spawn_egg", (new yv()).e("monsterPlacer"));
      y(384, "experience_bottle", (new y_()).e("expBottle"));
      y(385, "fire_charge", (new y1()).e("fireball"));
      y(386, "writable_book", (new kd()).e("writingBook").M(net.ys.r.K));
      y(387, "written_book", (new k5()).e("writtenBook").F(16));
      y(388, "emerald", (new y()).e("emerald").M(net.ys.r.I));
      y(389, "item_frame", (new yx(net.nm.e.class)).e("frame"));
      y(390, "flower_pot", (new v(net.nb.f.uh)).e("flowerPot").M(net.ys.r.X));
      y(391, "carrot", (new y7(3, 0.6F, net.nb.f.a, net.nb.f.dJ)).e("carrots"));
      y(392, "potato", (new y7(1, 0.3F, net.nb.f.T0, net.nb.f.dJ)).e("potato"));
      y(393, "baked_potato", (new yt(5, 0.6F, false)).e("potatoBaked"));
      y(394, "poisonous_potato", (new yt(2, 0.3F, false)).b(new net.n_.i(net.nb.b.j, 100, 0), 0.6F).e("potatoPoisonous"));
      y(395, "map", (new yr()).e("emptyMap"));
      y(396, "golden_carrot", (new yt(6, 1.2F, false)).e("carrotGolden").M(net.ys.r.k));
      y(397, "skull", (new kg()).e("skull"));
      y(398, "carrot_on_a_stick", (new yl()).e("carrotOnAStick"));
      y(399, "nether_star", (new kp()).e("netherStar").M(net.ys.r.I));
      y(400, "pumpkin_pie", (new yt(8, 0.3F, false)).e("pumpkinPie").M(net.ys.r.A));
      y(401, "fireworks", (new yc()).e("fireworks"));
      y(402, "firework_charge", (new yh()).e("fireworksCharge").M(net.ys.r.K));
      y(403, "enchanted_book", (new yp()).F(1).e("enchantedBook"));
      y(404, "comparator", (new v(net.nb.f.dA)).e("comparator").M(net.ys.r.i));
      y(405, "netherbrick", (new y()).e("netherbrick").M(net.ys.r.I));
      y(406, "quartz", (new y()).e("netherquartz").M(net.ys.r.I));
      y(407, "tnt_minecart", (new ye(net.nm.w.TNT)).e("minecartTnt"));
      y(408, "hopper_minecart", (new ye(net.nm.w.HOPPER)).e("minecartHopper"));
      y(409, "prismarine_shard", (new y()).e("prismarineShard").M(net.ys.r.I));
      y(410, "prismarine_crystals", (new y()).e("prismarineCrystals").M(net.ys.r.I));
      y(411, "rabbit", (new yt(3, 0.3F, true)).e("rabbitRaw"));
      y(412, "cooked_rabbit", (new yt(5, 0.6F, true)).e("rabbitCooked"));
      y(413, "rabbit_stew", (new yz(10)).e("rabbitStew"));
      y(414, "rabbit_foot", (new y()).e("rabbitFoot").M(net.ys.r.k));
      y(415, "rabbit_hide", (new y()).e("rabbitHide").M(net.ys.r.I));
      y(416, "armor_stand", (new r()).e("armorStand").F(16));
      y(417, "iron_horse_armor", (new y()).e("horsearmormetal").F(1).M(net.ys.r.K));
      y(418, "golden_horse_armor", (new y()).e("horsearmorgold").F(1).M(net.ys.r.K));
      y(419, "diamond_horse_armor", (new y()).e("horsearmordiamond").F(1).M(net.ys.r.K));
      y(420, "lead", (new y8()).e("leash"));
      y(421, "name_tag", (new yu()).e("nameTag"));
      y(422, "command_block_minecart", (new ye(net.nm.w.COMMAND_BLOCK)).e("minecartCommandBlock").M((net.ys.r)null));
      y(423, "mutton", (new yt(2, 0.3F, true)).e("muttonRaw"));
      y(424, "cooked_mutton", (new yt(6, 0.8F, true)).e("muttonCooked"));
      y(425, "banner", (new c()).e("banner"));
      y(426, "end_crystal", new yg());
      y(427, "spruce_door", (new yo(net.nb.f.d0)).e("doorSpruce"));
      y(428, "birch_door", (new yo(net.nb.f.T1)).e("doorBirch"));
      y(429, "jungle_door", (new yo(net.nb.f.b)).e("doorJungle"));
      y(430, "acacia_door", (new yo(net.nb.f.dH)).e("doorAcacia"));
      y(431, "dark_oak_door", (new yo(net.nb.f.uV)).e("doorDarkOak"));
      y(432, "chorus_fruit", (new yy(4, 0.3F)).r().e("chorusFruit").M(net.ys.r.I));
      y(433, "chorus_fruit_popped", (new y()).e("chorusFruitPopped").M(net.ys.r.I));
      y(434, "beetroot", (new yt(1, 0.6F, false)).e("beetroot"));
      y(435, "beetroot_seeds", (new ko(net.nb.f.Tf, net.nb.f.dJ)).e("beetroot_seeds"));
      y(436, "beetroot_soup", (new yz(6)).e("beetroot_soup"));
      y(437, "dragon_breath", (new y()).M(net.ys.r.k).e("dragon_breath").d(var2));
      y(438, "splash_potion", (new kl()).e("splash_potion"));
      y(439, "spectral_arrow", (new w()).e("spectral_arrow"));
      y(440, "tipped_arrow", (new n()).e("tipped_arrow"));
      y(441, "lingering_potion", (new yf()).e("lingering_potion"));
      y(442, "shield", (new kq()).e("shield"));
      y(443, "elytra", (new yi()).e("elytra"));
      y(444, "spruce_boat", new g(net.nm.b.SPRUCE));
      y(445, "birch_boat", new g(net.nm.b.BIRCH));
      y(446, "jungle_boat", new g(net.nm.b.JUNGLE));
      y(447, "acacia_boat", new g(net.nm.b.ACACIA));
      y(448, "dark_oak_boat", new g(net.nm.b.DARK_OAK));
      y(449, "totem_of_undying", (new y()).e("totem").F(1).M(net.ys.r.R));
      y(450, "shulker_shell", (new y()).e("shulkerShell").M(net.ys.r.I));
      y(452, "iron_nugget", (new y()).e("ironNugget").M(net.ys.r.I));
      y(453, "knowledge_book", (new ya()).e("knowledgeBook"));
      y(2256, "record_13", (new kb("13", net.nb.l.H4)).e("record"));
      y(2257, "record_cat", (new kb("cat", net.nb.l.MK)).e("record"));
      y(2258, "record_blocks", (new kb("blocks", net.nb.l.DJ)).e("record"));
      y(2259, "record_chirp", (new kb("chirp", net.nb.l.HF)).e("record"));
      y(2260, "record_far", (new kb("far", net.nb.l.j)).e("record"));
      y(2261, "record_mall", (new kb("mall", net.nb.l.Kp)).e("record"));
      y(2262, "record_mellohi", (new kb("mellohi", net.nb.l.Kc)).e("record"));
      y(2263, "record_stal", (new kb("stal", net.nb.l.Pz)).e("record"));
      y(2264, "record_strad", (new kb("strad", net.nb.l.Da)).e("record"));
      y(2265, "record_ward", (new kb("ward", net.nb.l.PD)).e("record"));
      y(2266, "record_11", (new kb("11", net.nb.l.s)).e("record"));
      y(2267, "record_wait", (new kb("wait", net.nb.l.PL)).e("record"));
      net.u.d.h(new net.u.d[3]);
   }

   private static void y(net.y9.l var0) {
      M((net.y9.l)var0, (y)(new q(var0)));
   }

   protected static void M(net.y9.l var0, y var1) {
      e(net.y9.l.h(var0), (m_)net.y9.l.m.t(var0), var1);
      f.put(var0, var1);
   }

   private static void y(int var0, String var1, y var2) {
      e(var0, new m_(var1), var2);
   }

   private static void e(int var0, m_ var1, y var2) {
      V.D(var0, var1, var2);
   }

   public ks m() {
      return new ks(this);
   }

   static {
      I(false);
   }

   public static void I(boolean var0) {
      b = var0;
   }

   public static boolean R() {
      return b;
   }

   public static boolean c() {
      boolean var0 = R();
      return true;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   public static enum d {
      WOOD(0, 59, 2.0F, 0.0F, 15),
      STONE(1, 131, 4.0F, 1.0F, 5),
      IRON(2, 250, 6.0F, 2.0F, 14),
      DIAMOND(3, 1561, 8.0F, 3.0F, 10),
      GOLD(0, 32, 12.0F, 0.0F, 22);

      private final int Q;
      private final int d;
      private final float W;
      private final float a;
      private final int t;

      private d(int var3, int var4, float var5, float var6, int var7) {
         this.Q = var3;
         this.d = var4;
         this.W = var5;
         this.a = var6;
         this.t = var7;
      }

      public int W() {
         return this.d;
      }

      public float E() {
         return this.W;
      }

      public float l() {
         return this.a;
      }

      public int a() {
         return this.Q;
      }

      public int D() {
         return this.t;
      }

      public y d() {
         int[] var1 = kw.b();
         return this == WOOD?y.q(net.nb.f.oN):(this == STONE?y.q(net.nb.f.TD):(this == GOLD?net.nb.j.F:(this == IRON?net.nb.j.S1:(this == DIAMOND?net.nb.j.B:null))));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
