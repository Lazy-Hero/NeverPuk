package net.y;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net._c;
import net._n;
import net.b0;
import net.be;
import net.gc;
import net.i6;
import net.ic;
import net.oq;
import net.oz;
import net.u_;
import net.wo;
import net.x4;
import net.x7;
import net.xn;
import net.z9;
import net.n0.kb;
import net.n0.y4;
import net.ni.sg;
import net.y.a;
import net.y.d;
import net.y.i;
import net.y.j;
import net.y.k;
import net.y.l;
import net.y.m;
import net.y.p;
import net.y.r;
import net.y.u1;
import net.y.ui;
import net.y.uu;
import net.y.v;
import net.y.w;
import net.y.x;
import net.y9.lk;
import net.y9.rp;
import net.y9.rt;
import net.y9.z_;
import net.y9.zy;
import net.yv.oj;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class u implements oj, net.c9.v {
   private static final Logger KK = LogManager.getLogger();
   private static final m_ KD = new m_("textures/environment/moon_phases.png");
   private static final m_ U = new m_("textures/environment/sun.png");
   private static final m_ K5 = new m_("textures/environment/clouds.png");
   private static final m_ b = new m_("textures/environment/end_sky.png");
   private static final m_ Y = new m_("textures/misc/forcefield.png");
   public final net.nn.j K;
   private final net.n9.e Kv;
   private final net.y0.d L;
   private net.cp.v Kh;
   private Set KP = Sets.newLinkedHashSet();
   private List I = Lists.newArrayListWithCapacity(69696);
   private final Set J = Sets.newHashSet();
   private uu Kk;
   private int KU = -1;
   private int a = -1;
   private int m = -1;
   private final net.y8.q K2;
   private net.y8.g v;
   private net.y8.g Z;
   private net.y8.g KO;
   private int Kx;
   public final Map x = Maps.newHashMap();
   private final Map l = Maps.newHashMap();
   private final net.n9.v[] g = new net.n9.v[10];
   private net.y2.t F;
   private net.y2.w Kb;
   private double KF = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double c = Double.MIN_VALUE;
   private int t = Integer.MIN_VALUE;
   private int KX = Integer.MIN_VALUE;
   private int Kc = Integer.MIN_VALUE;
   private double z = Double.MIN_VALUE;
   private double KR = Double.MIN_VALUE;
   private double A = Double.MIN_VALUE;
   private double KM = Double.MIN_VALUE;
   private double p = Double.MIN_VALUE;
   private net.n5.c P;
   private a H;
   private int W = -1;
   private int V = 2;
   private int e;
   private int Kg;
   private int u;
   private boolean y;
   private net.cy.b R;
   private final Vector4f[] T = new Vector4f[8];
   private final v r = new v();
   private boolean f;
   net.n5.v D;
   private double E;
   private double Kj;
   private double q;
   public boolean KQ = true;
   private boolean K4;
   private final Set Ke = Sets.newHashSet();
   private final _n d;
   public net.ne.l k;
   public Set s = new LinkedHashSet();
   public Set w = new LinkedHashSet();
   private final Deque C = new ArrayDeque();
   private List Q = new ArrayList(1024);
   private List M = new ArrayList(1024);
   private final List j = new ArrayList(1024);
   private final List O = new ArrayList(1024);
   private final List X = new ArrayList(1024);
   private final List KH = new ArrayList(1024);
   private final List o = new ArrayList(1024);
   private final List Kt = new ArrayList(1024);
   private int N = 0;
   private int B = 0;
   private static final Set S = Collections.unmodifiableSet(new HashSet(Arrays.asList(aq.VALUES)));
   private int i;
   private net.l.h n = null;
   private Long2ObjectMap KA = null;
   private int KZ = 0;
   private final _c h;
   public boolean Km;
   public boolean KE;
   static Deque Kn = new ArrayDeque();

   public u(net.nn.j var1) {
      this.h = new _c(this.Kh, net.nb.f.ou.p(), new net.u.j(0, 0, 0));
      this.Km = false;
      this.KE = false;
      this.d = new _n(var1);
      this.K = var1;
      this.L = var1.N();
      this.Kv = var1.n();
      this.Kv.E(Y);
      d.t(3553, 10242, 10497);
      d.t(3553, 10243, 10497);
      d.z(0);
      this.D();
      this.f = ui.H();
      if(this.f) {
         this.H = new x();
         this.D = new net.n5.j();
      } else {
         this.H = new l();
         this.D = new net.n5.t();
      }

      this.K2 = new net.y8.q();
      this.K2.k(new net.y8.h(0, net.y8.h.FLOAT, net.y8.h.POSITION, 3));
      this.U();
      this.I();
      this.O();
   }

   public void s(net.c9.p var1) {
      this.D();
   }

   private void D() {
      net.n9.b var1 = this.K.p();

      for(int var2 = 0; var2 < this.g.length; ++var2) {
         this.g[var2] = var1.O("minecraft:blocks/destroy_stage_" + var2);
      }

   }

   public void v() {
      if(ui.H) {
         if(net.y2.o.K() == null) {
            net.y2.o.e();
         }

         m_ var1 = new m_("shaders/post/entity_outline.json");
         this.Kb = new net.y2.w(this.K.n(), this.K.C(), this.K.O(), var1);
         this.Kb.h(this.K.sB, this.K.st);
         this.F = this.Kb.y("final");
      } else {
         this.Kb = null;
         this.F = null;
      }

   }

   public void Z() {
      if(this.H()) {
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ZERO, d.k.ONE);
         this.F.G(this.K.sB, this.K.st, false);
         d.E();
      }

   }

   protected boolean H() {
      return !z9.Z() && !z9.Q() && !z9.SK()?this.F != null && this.Kb != null && this.K.sf != null:false;
   }

   private void O() {
      r var1 = r.f();
      p var2 = var1.k();
      if(this.KO != null) {
         this.KO.B();
      }

      if(this.m >= 0) {
         m.Q(this.m);
         this.m = -1;
      }

      if(this.f) {
         this.KO = new net.y8.g(this.K2);
         this.o(var2, -16.0F, true);
         var2.Z();
         var2.X();
         this.KO.V(var2.E());
      } else {
         this.m = m.X(1);
         d.b(this.m, 4864);
         this.o(var2, -16.0F, true);
         var1.p();
         d.q();
      }

   }

   private void I() {
      r var1 = r.f();
      p var2 = var1.k();
      if(this.Z != null) {
         this.Z.B();
      }

      if(this.a >= 0) {
         m.Q(this.a);
         this.a = -1;
      }

      if(this.f) {
         this.Z = new net.y8.g(this.K2);
         this.o(var2, 16.0F, false);
         var2.Z();
         var2.X();
         this.Z.V(var2.E());
      } else {
         this.a = m.X(1);
         d.b(this.a, 4864);
         this.o(var2, 16.0F, false);
         var1.p();
         d.q();
      }

   }

   private void o(p var1, float var2, boolean var3) {
      boolean var10000 = true;
      var10000 = true;
      var1.m(7, net.y8.x.y);
      short var6 = -384;
      int var7 = -384;

      while(true) {
         float var8 = (float)var6;
         float var9 = (float)(var6 + 64);
         var9 = (float)var6;
         var8 = (float)(var6 + 64);
         var1.H((double)var8, (double)var2, (double)var7).W();
         var1.H((double)var9, (double)var2, (double)var7).W();
         var1.H((double)var9, (double)var2, (double)(var7 + 64)).W();
         var1.H((double)var8, (double)var2, (double)(var7 + 64)).W();
         var7 += 64;
      }
   }

   private void U() {
      r var1 = r.f();
      p var2 = var1.k();
      if(this.v != null) {
         this.v.B();
      }

      if(this.KU >= 0) {
         m.Q(this.KU);
         this.KU = -1;
      }

      if(this.f) {
         this.v = new net.y8.g(this.K2);
         this.J(var2);
         var2.Z();
         var2.X();
         this.v.V(var2.E());
      } else {
         this.KU = m.X(1);
         d.c();
         d.b(this.KU, 4864);
         this.J(var2);
         var1.p();
         d.q();
         d.Y();
      }

   }

   private void J(p var1) {
      Random var2 = new Random(10842L);
      var1.m(7, net.y8.x.y);
      int var3 = 0;

      while(true) {
         double var4 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var2.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if(var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 = var4 * var12;
            var6 = var6 * var12;
            var8 = var8 * var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);
            int var38 = 0;

            while(true) {
               double var10000 = 0.0D;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               var10000 = 0.0D;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var51 = var47 * var28 + 0.0D * var30;
               double var53 = 0.0D * var28 - var47 * var30;
               double var55 = var53 * var22 - var49 * var24;
               double var57 = var49 * var22 + var53 * var24;
               var1.H(var14 + var55, var16 + var51, var18 + var57).W();
               ++var38;
            }
         }

         ++var3;
      }
   }

   public void i(@Nullable net.cp.v var1) {
      if(this.Kh != null) {
         this.Kh.y(this);
      }

      this.KF = Double.MIN_VALUE;
      this.G = Double.MIN_VALUE;
      this.c = Double.MIN_VALUE;
      this.t = Integer.MIN_VALUE;
      this.KX = Integer.MIN_VALUE;
      this.Kc = Integer.MIN_VALUE;
      this.L.v(var1);
      this.Kh = var1;
      if(z9.I()) {
         oq.q();
      }

      var1.n(this);
      this.n();
   }

   public void n() {
      if(this.Kh != null) {
         if(this.P == null) {
            this.P = new net.n5.c();
         }

         this.KQ = true;
         net.nb.f.Tu.F(z9.f());
         net.nb.f.G.F(z9.f());
         w.y();
         Kn.clear();
         if(z9.I()) {
            oq.q();
         }

         this.W = this.K.T.ij;
         this.N = this.W * 16;
         this.B = this.N * this.N;
         boolean var1 = this.f;
         this.f = ui.H();
         if(!this.f) {
            this.H = new l();
            this.D = new net.n5.t();
         } else if(this.f) {
            this.H = new x();
            this.D = new net.n5.j();
         }

         if(var1 != this.f) {
            this.U();
            this.I();
            this.O();
         }

         if(this.Kk != null) {
            this.Kk.c();
         }

         this.d();
         Set var2 = this.J;
         this.J.clear();
         this.Kk = new uu(this.Kh, this.K.T.ij, this, this.D);
         if(this.Kh != null) {
            net.ne.l var4 = this.K.A();
            this.Kk.F(var4.b, var4.hr);
         }

         this.V = 2;
      }

   }

   protected void d() {
      this.KP.clear();
      this.P.R();
   }

   public void g(int var1, int var2) {
      if(ui.H && this.Kb != null) {
         this.Kb.h(var1, var2);
      }

   }

   public void U(net.ne.l var1, net.cy.s var2, float var3) {
      int var4 = 0;
      if(i6.ur.r()) {
         var4 = i6.F(i6.ur, new Object[0]);
      }

      if(this.V <= 0) {
         double var5 = var1.h + (var1.b - var1.h) * (double)var3;
         double var7 = var1.h6 + (var1.hS - var1.h6) * (double)var3;
         double var9 = var1.l + (var1.hr - var1.l) * (double)var3;
         this.Kh.M.K("prepare");
         net.c5.g.E.I(this.Kh, this.K.n(), this.K.sO, this.K.A(), this.K.H, var3);
         this.L.x(this.Kh, this.K.sO, this.K.A(), this.K.B, this.K.T, var3);
         this.e = 0;
         this.Kg = 0;
         this.u = 0;
         this.i = 0;
         net.ne.l var11 = this.K.A();
         double var12 = var11.hL + (var11.b - var11.hL) * (double)var3;
         double var14 = var11.F + (var11.hS - var11.F) * (double)var3;
         double var16 = var11.A + (var11.hr - var11.A) * (double)var3;
         net.c5.g.T = var12;
         net.c5.g.w = var14;
         net.c5.g.i = var16;
         this.L.W(var12, var14, var16);
         this.K.s4.t();
         this.Kh.M.F("global");
         List var18 = this.Kh.y();
         this.e = var18.size();
         if(z9.d() && this.K.s4.a) {
            d.V();
         }

         boolean var19 = i6.Mq.r();
         boolean var20 = i6.uo.r();

         for(int var21 = 0; var21 < this.Kh.T.size(); ++var21) {
            net.ne.l var22 = (net.ne.l)this.Kh.T.get(var21);
            if(i6.I(var22, i6.Mq, new Object[]{Integer.valueOf(var4)})) {
               ++this.Kg;
               if(var22.e(var5, var7, var9)) {
                  this.L.U(var22, var3, false);
               }
            }
         }

         this.Kh.M.F("entities");
         boolean var38 = z9.Q();
         oz.z();
         boolean var39 = this.K.T.tR;
         this.K.T.tR = z9.l();
         ArrayList var23 = Lists.newArrayList();
         ArrayList var24 = Lists.newArrayList();
         net.u.j var25 = net.u.j.u();

         for(Object var27 : this.Q) {
            u.r var28 = (u.r)var27;
            net.l.q var29 = var28.b.Q(this.Kh);
            net.yz.g var30 = var29.z()[var28.b.u().h() / 16];
            if(!var30.isEmpty()) {
               for(net.ne.l var32 : var30) {
                  if(i6.I(var32, i6.Mq, new Object[]{Integer.valueOf(var4)})) {
                     if(!this.L.E(var32, var2, var5, var7, var9) && !var32.B((net.ne.l)this.K.sf)) {
                        boolean var63 = false;
                     } else {
                        boolean var10000 = true;
                     }

                     boolean var34 = this.K.A() instanceof net.ne.a && ((net.ne.a)this.K.A()).L();
                     if(var32 == this.K.A() && this.K.T.wR == 0) {
                        ;
                     }

                     if(var32.hS < 0.0D || var32.hS >= 256.0D || this.Kh.o(var25.O(var32))) {
                        ++this.Kg;
                        this.k = var32;
                        oz.n(var32);
                        this.L.U(var32, var3, false);
                        this.k = null;
                        if(this.C(var32, var11, var2)) {
                           var23.add(var32);
                        }

                        if(this.L.f(var32)) {
                           var24.add(var32);
                        }
                     }
                  }
               }
            }
         }

         var25.T();
         if(!var24.isEmpty()) {
            for(net.ne.l var44 : var24) {
               if(i6.I(var44, i6.Mq, new Object[]{Integer.valueOf(var4)})) {
                  oz.n(var44);
                  this.L.W(var44, var3);
               }
            }
         }

         if(this.H() && (!var23.isEmpty() || this.K4)) {
            this.Kh.M.F("entityOutlines");
            this.F.r();
            this.K4 = !var23.isEmpty();
            if(!var23.isEmpty()) {
               d.n(519);
               d.V();
               this.F.U(false);
               u1.m();
               this.L.q(true);

               for(int var41 = 0; var41 < var23.size(); ++var41) {
                  net.ne.l var45 = (net.ne.l)var23.get(var41);
                  if(i6.I(var45, i6.Mq, new Object[]{Integer.valueOf(var4)})) {
                     oz.n(var45);
                     this.L.U(var45, var3, false);
                  }
               }

               this.L.q(false);
               u1.B();
               d.Y(false);
               this.Kb.C(var3);
               d.K();
               d.Y(true);
               d.p();
               d.C();
               d.G();
               d.n(515);
               d.B();
               d.m();
            }

            this.K.O().U(false);
         }

         if(!this.H() && (!var23.isEmpty() || this.K4)) {
            this.Kh.M.F("entityOutlines");
            this.K4 = !var23.isEmpty();
            if(!var23.isEmpty()) {
               d.V();
               d.z();
               this.K.s4.x();
               u1.m();
               this.L.q(true);

               for(int var42 = 0; var42 < var23.size(); ++var42) {
                  net.ne.l var46 = (net.ne.l)var23.get(var42);
                  if(i6.I(var46, i6.Mq, new Object[]{Integer.valueOf(var4)})) {
                     oz.n(var46);
                     this.L.U(var46, var3, false);
                  }
               }

               this.L.q(false);
               u1.B();
               this.K.s4.t();
               d.B();
               d.p();
            }
         }

         this.K.T.tR = var39;
         net.z.r var43 = net.c5.g.E.T();
         oz.h();
         oz.U();
         this.Kh.M.F("blockentities");
         u1.B();
         if(i6.Cc.r()) {
            net.c5.g.E.H();
         }

         for(Object var50 : this.M) {
            u.r var53 = (u.r)var50;
            List var56 = var53.b.N().W();
            if(!var56.isEmpty()) {
               for(net.ni.v var61 : var56) {
                  Class var33 = var61.getClass();
                  if(var33 == sg.class && !z9.l) {
                     net.yy.g var62 = this.K.sf;
                     double var35 = var61.Q(var62.b, var62.hS, var62.hr);
                     if(var35 > 256.0D) {
                        var43.j = false;
                     }
                  }

                  oz.b(var61);
                  net.c5.g.E.b(var61, var3, -1);
                  ++this.i;
                  var43.j = true;
               }
            }
         }

         Set var48 = this.J;

         for(net.ni.v var54 : this.J) {
            if(i6.I(var54, i6.uo, new Object[]{Integer.valueOf(var4)})) {
               oz.b(var54);
               net.c5.g.E.b(var54, var3, -1);
            }
         }

         if(i6.Cc.r()) {
            net.c5.g.E.t(var4);
         }

         this.Km = true;
         this.M();

         for(i var52 : this.x.values()) {
            net.u.j var55 = var52.x();
            if(this.Kh.Z(var55).Q().W()) {
               net.ni.v var57 = this.Kh.L(var55);
               if(var57 instanceof net.ni.k) {
                  net.ni.k var59 = (net.ni.k)var57;
                  if(var59.d != null) {
                     var55 = var55.C(aq.WEST);
                     var57 = this.Kh.L(var55);
                  } else if(var59.j != null) {
                     var55 = var55.C(aq.NORTH);
                     var57 = this.Kh.L(var55);
                  }
               }

               net.yw.n var60 = this.Kh.Z(var55);
               if(var60.v()) {
                  oz.b(var57);
                  net.c5.g.E.b(var57, var3, var52.u());
               }
            }
         }

         this.C();
         this.Km = false;
         this.K.s4.x();
         this.K.sl.N();
      }
   }

   private boolean C(net.ne.l var1, net.ne.l var2, net.cy.s var3) {
      boolean var4 = var2 instanceof net.ne.a && ((net.ne.a)var2).L();
      return var1 == var2 && this.K.T.wR == 0?false:(var1.o()?true:(this.K.sf.VX() && this.K.T.K.o() && var1 instanceof net.r.r?var1.hz || var3.E(var1.i()) || var1.B((net.ne.l)this.K.sf):false));
   }

   public String t() {
      int var1 = this.Kk.M.length;
      int var2 = this.b();
      return String.format("C: %d/%d %sD: %d, L: %d, %s", new Object[]{Integer.valueOf(var2), Integer.valueOf(var1), this.K.sJ?"(s) ":"", Integer.valueOf(this.W), Integer.valueOf(this.Ke.size()), this.P == null?"null":this.P.M()});
   }

   protected int b() {
      int var1 = 0;

      for(u.r var3 : this.I) {
         net.n5.g var4 = var3.b.a;
         if(var4 != net.n5.g.u && !var4.i()) {
            ++var1;
         }
      }

      return var1;
   }

   public String v() {
      return "E: " + this.Kg + "/" + this.e + ", B: " + this.u + ", " + z9.I();
   }

   public void F(net.ne.l var1, double var2, net.cy.s var4, int var5, boolean var6) {
      if(this.K.T.ij != this.W) {
         this.n();
      }

      this.Kh.M.K("camera");
      double var7 = var1.b - this.KF;
      double var9 = var1.hS - this.G;
      double var11 = var1.hr - this.c;
      if(this.t != var1.Q || this.KX != var1.D || this.Kc != var1.f || var7 * var7 + var9 * var9 + var11 * var11 > 16.0D) {
         this.KF = var1.b;
         this.G = var1.hS;
         this.c = var1.hr;
         this.t = var1.Q;
         this.KX = var1.D;
         this.Kc = var1.f;
         this.Kk.F(var1.b, var1.hr);
      }

      if(z9.I()) {
         oq.w(this);
      }

      this.Kh.M.F("renderlistcamera");
      double var13 = var1.hL + (var1.b - var1.hL) * var2;
      double var15 = var1.F + (var1.hS - var1.F) * var2;
      double var17 = var1.A + (var1.hr - var1.A) * var2;
      this.H.c(var13, var15, var17);
      this.Kh.M.F("cull");
      if(this.R != null) {
         net.cy.n var19 = new net.cy.n(this.R);
         var19.o(this.r.h, this.r.W, this.r.D);
         var4 = var19;
      }

      this.K.sl.F("culling");
      net.u.j var37 = new net.u.j(var13, var15 + (double)var1.A(), var17);
      net.n5.m var20 = this.Kk.J(var37);
      new net.u.j(net.u.t.L(var13 / 16.0D) * 16, net.u.t.L(var15 / 16.0D) * 16, net.u.t.L(var17 / 16.0D) * 16);
      this.KQ = this.KQ || !this.KP.isEmpty() || var1.b != this.z || var1.hS != this.KR || var1.hr != this.A || (double)var1.V != this.KM || (double)var1.hN != this.p;
      this.z = var1.b;
      this.KR = var1.hS;
      this.A = var1.hr;
      this.KM = (double)var1.V;
      this.p = (double)var1.hN;
      boolean var21 = this.R != null;
      this.K.sl.F("update");
      u_.M.G();
      int var22 = this.p();
      if(var22 != this.KZ) {
         this.KZ = var22;
         this.KQ = true;
      }

      if(oz.Hr) {
         this.I = this.KH;
         this.Q = this.o;
         this.M = this.Kt;
         if(this.KQ) {
            this.I.clear();
            this.Q.clear();
            this.M.clear();
            gc var23 = new gc();
            Iterator var24 = b0.c(this.Kh, var2, var1, this.W, this.Kk);

            while(var24.hasNext()) {
               net.n5.m var25 = (net.n5.m)var24.next();
               var23.O(var25);
               if(!var25.a.i() || var25.J()) {
                  this.I.add(var23.C());
               }

               net.u.j var26 = var25.u();
               if(ic.B(this.Kh.d(var26))) {
                  this.Q.add(var23.C());
               }

               if(var25.N().W().size() > 0) {
                  this.M.add(var23.C());
               }
            }
         }
      } else {
         this.I = this.j;
         this.Q = this.O;
         this.M = this.X;
      }

      if(this.KQ && !oz.Hr) {
         this.KQ = false;

         for(u.r var41 : this.I) {
            this.C(var41);
         }

         this.I.clear();
         this.Q.clear();
         this.M.clear();
         this.C.clear();
         Deque var39 = this.C;
         net.ne.l.y(net.u.t.F((double)this.K.T.ij / 8.0D, 1.0D, 2.5D));
         boolean var42 = this.K.sJ;
         boolean var44 = false;
         u.r var48 = new u.r(var20, (aq)null, 0);
         Set var27 = S;
         if(var27.size() == 1) {
            Vector3f var28 = this.n(var1, var2);
            aq var29 = aq.f(var28.x, var28.y, var28.z).f();
            var27.remove(var29);
         }

         if(var27.isEmpty()) {
            var44 = true;
         }

         this.I.add(var48);
         this.K.sl.K("iteration");
         aq[] var46 = aq.VALUES;
         int var49 = var46.length;

         while(!var39.isEmpty()) {
            u.r var51 = (u.r)var39.poll();
            net.n5.m var53 = var51.b;
            aq var55 = var51.E;
            boolean var30 = false;
            net.n5.g var31 = var53.a;
            if(!var31.i() || var53.J()) {
               this.I.add(var51);
               var30 = true;
            }

            if(ic.B(var53.Q(this.Kh))) {
               this.Q.add(var51);
               var30 = true;
            }

            if(var31.W().size() > 0) {
               this.M.add(var51);
               var30 = true;
            }

            for(int var32 = 0; var32 < var49; ++var32) {
               aq var33 = var46[var32];
               if(!var51.k(var33.f()) && var31.u(var55.f(), var33)) {
                  net.n5.m var34 = this.s(var37, var53, var33);
                  if(var34.I(var5) && ((net.cy.s)var4).E(var34.J)) {
                     int var35 = var51.P | 1 << var33.ordinal();
                     u.r var36 = this.H(var34, var33, var35);
                     var39.add(var36);
                  }
               }
            }

            this.C(var51);
         }

         this.K.sl.N();
      }

      this.K.sl.F("captureFrustum");
      if(this.y) {
         this.S(var13, var15, var17);
         this.y = false;
      }

      u_.M.C();
      if(oz.Hr) {
         oz.W();
      } else {
         this.K.sl.F("rebuildNear");
         Set var40 = this.KP;
         this.KP = Sets.newLinkedHashSet();
         u_.C.G();

         for(u.r var47 : this.I) {
            net.n5.m var50 = var47.b;
            if(var50.J() || var40.contains(var50)) {
               this.KQ = true;
               net.u.j var52 = var50.u();
               boolean var54 = var37.s((double)(var52.t() + 8), (double)(var52.h() + 8), (double)(var52.y() + 8)) < 768.0D;
               this.KP.add(var50);
            }
         }

         u_.C.C();
         this.KP.addAll(var40);
         this.K.sl.N();
      }

   }

   private Set x(net.u.j var1) {
      net.n5.a var2 = new net.n5.a();
      net.u.j var3 = new net.u.j(var1.t() >> 4 << 4, var1.h() >> 4 << 4, var1.y() >> 4 << 4);
      net.l.q var4 = this.Kh.d(var3);

      for(net.u.j var6 : net.u.j.X(var3, var3.F(15, 15, 15))) {
         if(var4.u(var6).j()) {
            var2.M(var6);
         }
      }

      return var2.k(var1);
   }

   @Nullable
   private net.n5.m s(net.u.j var1, net.n5.m var2, aq var3) {
      net.u.j var4 = var2.v(var3);
      if(var4.h() >= 0 && var4.h() < 256) {
         int var5 = var1.t() - var4.t();
         int var6 = var1.y() - var4.y();
         if(z9.d()) {
            if(Math.abs(var5) > this.N || Math.abs(var6) > this.N) {
               return null;
            }
         } else {
            int var7 = var5 * var5 + var6 * var6;
            if(var7 > this.B) {
               return null;
            }
         }

         return var2.T(this.Kk, var3);
      } else {
         return null;
      }
   }

   private void S(double var1, double var3, double var5) {
      this.R = new net.cy.p();
      ((net.cy.p)this.R).S();
      j var7 = new j(this.R.X);
      var7.transpose();
      j var8 = new j(this.R.u);
      var8.transpose();
      j var9 = new j();
      j.mul(var8, var7, var9);
      var9.invert();
      this.r.h = var1;
      this.r.W = var3;
      this.r.D = var5;
      this.T[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.T[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.T[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.T[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.T[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.T[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.T[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.T[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);
      int var10 = 0;

      while(true) {
         j.transform(var9, this.T[var10], this.T[var10]);
         this.T[var10].x /= this.T[var10].w;
         this.T[var10].y /= this.T[var10].w;
         this.T[var10].z /= this.T[var10].w;
         this.T[var10].w = 1.0F;
         ++var10;
      }
   }

   protected Vector3f n(net.ne.l var1, double var2) {
      float var4 = (float)((double)var1.d + (double)(var1.V - var1.d) * var2);
      float var5 = (float)((double)var1.hq + (double)(var1.hN - var1.hq) * var2);
      if(net.nn.j.b().T.wR == 2) {
         var4 += 180.0F;
      }

      float var6 = net.u.t.m(-var5 * 0.017453292F - 3.1415927F);
      float var7 = net.u.t.A(-var5 * 0.017453292F - 3.1415927F);
      float var8 = -net.u.t.m(-var4 * 0.017453292F);
      float var9 = net.u.t.A(-var4 * 0.017453292F);
      return new Vector3f(var7 * var8, var9, var6 * var8);
   }

   public int Z(ac var1, double var2, int var4, net.ne.l var5) {
      u1.m();
      if(var1 == ac.TRANSLUCENT) {
         this.K.sl.K("translucent_sort");
         double var6 = var5.b - this.E;
         double var8 = var5.hS - this.Kj;
         double var10 = var5.hr - this.q;
         if(var6 * var6 + var8 * var8 + var10 * var10 > 1.0D) {
            this.E = var5.b;
            this.Kj = var5.hS;
            this.q = var5.hr;
            int var12 = 0;
            this.s.clear();

            for(u.r var14 : this.I) {
               if(var14.b.a.Z(var1)) {
                  ++var12;
                  this.s.add(var14.b);
               }
            }
         }

         this.K.sl.N();
      }

      this.K.sl.K("filterempty");
      int var15 = 0;
      boolean var7 = var1 == ac.TRANSLUCENT;
      int var16 = this.I.size() - 1;
      byte var9 = -1;
      byte var17 = -1;

      for(int var11 = var16; var11 != var9; var11 += var17) {
         net.n5.m var18 = ((u.r)this.I.get(var11)).b;
         if(!var18.N().I(var1)) {
            ++var15;
            this.H.B(var18, var1);
         }
      }

      this.K.sl.N();
      return var15;
   }

   private void m(ac var1) {
      this.K.s4.t();
      if(ui.H()) {
         d.d('聴');
         ui.X(ui.V);
         d.d('聸');
         ui.X(ui.w);
         d.d('聸');
         ui.X(ui.V);
         d.d('聶');
      }

      if(z9.Q()) {
         be.l(var1);
      }

      this.H.q(var1);
      if(z9.Q()) {
         be.O(var1);
      }

      if(ui.H()) {
         for(net.y8.h var3 : net.y8.x.M.b()) {
            net.y8.h var4 = var3.P();
            int var5 = var3.G();
            switch(null.c[var4.ordinal()]) {
            case 1:
               d.x('聴');
               break;
            case 2:
               ui.X(ui.V + var5);
               d.x('聸');
               ui.X(ui.V);
               break;
            case 3:
               d.x('聶');
               d.b();
            }
         }
      }

      this.K.s4.x();
   }

   private void Z(Iterator var1) {
      while(var1.hasNext()) {
         i var2 = (i)var1.next();
         int var3 = var2.h();
         if(this.Kx - var3 > 400) {
            var1.remove();
         }
      }

   }

   public void R() {
      if(z9.Q() && Keyboard.isKeyDown(61) && Keyboard.isKeyDown(19)) {
         oz.t();
         oz.nk();
         i6.CG.U(this.K, Boolean.TRUE);
      }

      ++this.Kx;
      if(this.Kx % 20 == 0) {
         this.Z(this.x.values().iterator());
      }

      if(!this.Ke.isEmpty() && !this.P.a() && this.KP.isEmpty()) {
         Iterator var1 = this.Ke.iterator();

         while(var1.hasNext()) {
            net.u.j var2 = (net.u.j)var1.next();
            var1.remove();
            int var3 = var2.t();
            int var4 = var2.h();
            int var5 = var2.y();
            this.C(var3 - 1, var4 - 1, var5 - 1, var3 + 1, var4 + 1, var5 + 1, false);
         }
      }

   }

   private void j() {
      if(z9.SF()) {
         d.V();
         d.d();
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         u1.m();
         d.Y(false);
         this.Kv.E(b);
         r var1 = r.f();
         p var2 = var1.k();
         int var3 = 0;

         while(true) {
            d.c();
            var2.m(7, net.y8.x.r);
            int var4 = 40;
            int var5 = 40;
            int var6 = 40;
            if(z9.v()) {
               net.u.r var7 = new net.u.r((double)var4 / 255.0D, (double)var5 / 255.0D, (double)var6 / 255.0D);
               var7 = x7.X(var7, this.Kh, this.K.A(), 0.0F);
               var4 = (int)(var7.p * 255.0D);
               var5 = (int)(var7.H * 255.0D);
               var6 = (int)(var7.a * 255.0D);
            }

            var2.H(-100.0D, -100.0D, -100.0D).Y(0.0D, 0.0D).V(var4, var5, var6, 255).W();
            var2.H(-100.0D, -100.0D, 100.0D).Y(0.0D, 16.0D).V(var4, var5, var6, 255).W();
            var2.H(100.0D, -100.0D, 100.0D).Y(16.0D, 16.0D).V(var4, var5, var6, 255).W();
            var2.H(100.0D, -100.0D, -100.0D).Y(16.0D, 0.0D).V(var4, var5, var6, 255).W();
            var1.p();
            d.Y();
            ++var3;
         }
      }

   }

   public void z(float var1, int var2) {
      if(i6.BQ.r()) {
         net.yv.c var20 = this.K.s8.F;
         Object var22 = i6.b(var20, i6.BQ, new Object[0]);
         i6.F(var22, i6.MV, new Object[]{Float.valueOf(var1), this.Kh, this.K});
      } else {
         if(this.K.s8.F.L() == net.yv.h.THE_END) {
            this.j();
         } else if(this.K.s8.F.Z()) {
            d.w();
            boolean var3 = z9.Q();
            oz.n5();
            net.u.r var4 = this.Kh.h(this.K.A(), var1);
            var4 = x7.v(var4, this.K.s8, this.K.A().b, this.K.A().hS + 1.0D, this.K.A().hr);
            oz.K(var4);
            float var5 = (float)var4.p;
            float var6 = (float)var4.H;
            float var7 = (float)var4.a;
            if(var2 != 2) {
               float var8 = (var5 * 30.0F + var6 * 59.0F + var7 * 11.0F) / 100.0F;
               float var9 = (var5 * 30.0F + var6 * 70.0F) / 100.0F;
               float var10 = (var5 * 30.0F + var7 * 70.0F) / 100.0F;
               var5 = var8;
               var6 = var9;
               var7 = var10;
            }

            d.Z(var5, var6, var7);
            r var23 = r.f();
            p var24 = var23.k();
            d.Y(false);
            d.p();
            oz.F();
            d.Z(var5, var6, var7);
            oz.nJ();
            if(z9.SF()) {
               if(this.f) {
                  this.Z.F();
                  d.d('聴');
                  d.X(3, 5126, 12, 0);
                  this.Z.q(7);
                  this.Z.u();
                  d.x('聴');
               } else {
                  d.I(this.a);
               }
            }

            d.V();
            oz.nt();
            d.d();
            d.C();
            d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
            u1.m();
            float[] var25 = this.Kh.F.F(this.Kh.H(var1), var1);
            if(z9.SV()) {
               d.w();
               oz.n5();
               d.Q(7425);
               d.c();
               d.P(90.0F, 1.0F, 0.0F, 0.0F);
               d.P(net.u.t.A(this.Kh.C(var1)) < 0.0F?180.0F:0.0F, 0.0F, 0.0F, 1.0F);
               d.P(90.0F, 0.0F, 0.0F, 1.0F);
               float var26 = var25[0];
               float var28 = var25[1];
               float var30 = var25[2];
               if(var2 != 2) {
                  float var32 = (var26 * 30.0F + var28 * 59.0F + var30 * 11.0F) / 100.0F;
                  float var34 = (var26 * 30.0F + var28 * 70.0F) / 100.0F;
                  float var37 = (var26 * 30.0F + var30 * 70.0F) / 100.0F;
                  var26 = var32;
                  var28 = var34;
                  var30 = var37;
               }

               var24.m(6, net.y8.x.F);
               var24.H(0.0D, 100.0D, 0.0D).m(var26, var28, var30, var25[3]).W();
               boolean var33 = true;
               int var35 = 0;

               while(true) {
                  float var38 = (float)var35 * 6.2831855F / 16.0F;
                  float var40 = net.u.t.A(var38);
                  float var42 = net.u.t.m(var38);
                  var24.H((double)(var40 * 120.0F), (double)(var42 * 120.0F), (double)(-var42 * 40.0F * var25[3])).m(var25[0], var25[1], var25[2], 0.0F).W();
                  ++var35;
               }
            }

            d.S();
            oz.ny();
            d.e(d.l.SRC_ALPHA, d.k.ONE, d.l.ONE, d.k.ZERO);
            d.c();
            float var11 = 1.0F - this.Kh.u(var1);
            d.T(1.0F, 1.0F, 1.0F, var11);
            d.P(-90.0F, 0.0F, 1.0F, 0.0F);
            wo.Y(this.Kh, this.Kv, var1);
            oz.B();
            d.P(this.Kh.H(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
            oz.nb();
            float var12 = 30.0F;
            if(z9.N()) {
               this.Kv.E(U);
               var24.m(7, net.y8.x.H);
               var24.H((double)(-var12), 100.0D, (double)(-var12)).Y(0.0D, 0.0D).W();
               var24.H((double)var12, 100.0D, (double)(-var12)).Y(1.0D, 0.0D).W();
               var24.H((double)var12, 100.0D, (double)var12).Y(1.0D, 1.0D).W();
               var24.H((double)(-var12), 100.0D, (double)var12).Y(0.0D, 1.0D).W();
               var23.p();
            }

            var12 = 20.0F;
            if(z9.Sv()) {
               this.Kv.E(KD);
               int var13 = this.Kh.s();
               int var14 = var13 % 4;
               int var15 = var13 / 4 % 2;
               float var16 = (float)(var14 + 0) / 4.0F;
               float var17 = (float)(var15 + 0) / 2.0F;
               float var18 = (float)(var14 + 1) / 4.0F;
               float var19 = (float)(var15 + 1) / 2.0F;
               var24.m(7, net.y8.x.H);
               var24.H((double)(-var12), -100.0D, (double)var12).Y((double)var18, (double)var19).W();
               var24.H((double)var12, -100.0D, (double)var12).Y((double)var16, (double)var19).W();
               var24.H((double)var12, -100.0D, (double)(-var12)).Y((double)var16, (double)var17).W();
               var24.H((double)(-var12), -100.0D, (double)(-var12)).Y((double)var18, (double)var17).W();
               var23.p();
            }

            d.w();
            oz.n5();
            float var29 = this.Kh.P(var1) * var11;
            if(var29 > 0.0F && z9.SR() && !wo.D(this.Kh)) {
               d.T(var29, var29, var29, var29);
               if(this.f) {
                  this.v.F();
                  d.d('聴');
                  d.X(3, 5126, 12, 0);
                  this.v.q(7);
                  this.v.u();
                  d.x('聴');
               } else {
                  d.I(this.KU);
               }
            }

            d.T(1.0F, 1.0F, 1.0F, 1.0F);
            d.E();
            d.m();
            d.p();
            oz.F();
            d.Y();
            d.w();
            oz.n5();
            d.Z(0.0F, 0.0F, 0.0F);
            double var31 = this.K.sf.E(var1).H - this.Kh.I();
            if(var31 < 0.0D) {
               d.c();
               d.O(0.0F, 12.0F, 0.0F);
               if(this.f) {
                  this.KO.F();
                  d.d('聴');
                  d.X(3, 5126, 12, 0);
                  this.KO.q(7);
                  this.KO.u();
                  d.x('聴');
               } else {
                  d.I(this.m);
               }

               d.Y();
               float var36 = 1.0F;
               float var39 = -((float)(var31 + 65.0D));
               float var41 = -1.0F;
               var24.m(7, net.y8.x.F);
               var24.H(-1.0D, (double)var39, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, (double)var39, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, (double)var39, -1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, (double)var39, -1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, (double)var39, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, (double)var39, -1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, (double)var39, -1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, (double)var39, 1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var24.H(-1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, 1.0D).V(0, 0, 0, 255).W();
               var24.H(1.0D, -1.0D, -1.0D).V(0, 0, 0, 255).W();
               var23.p();
            }

            if(this.Kh.F.s()) {
               d.Z(var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F);
            } else {
               d.Z(var5, var6, var7);
            }

            if(this.K.T.ij <= 4) {
               d.Z(this.K.s4.d, this.K.s4.i, this.K.s4.m1);
            }

            d.c();
            d.O(0.0F, -((float)(var31 - 16.0D)), 0.0F);
            if(z9.SF()) {
               d.I(this.m);
            }

            d.Y();
            d.S();
            oz.ny();
            d.Y(true);
         }

      }
   }

   public void U(float var1, int var2, double var3, double var5, double var7) {
      if(!z9.S0()) {
         if(i6.Bi.r()) {
            net.yv.c var33 = this.K.s8.F;
            Object var34 = i6.b(var33, i6.Bi, new Object[0]);
            i6.F(var34, i6.MV, new Object[]{Float.valueOf(var1), this.Kh, this.K});
            return;
         }

         if(this.K.s8.F.Z()) {
            if(z9.Q()) {
               oz.n2();
            }

            if(z9.Sz()) {
               this.Z(var1, var2, var3, var5, var7);
            } else {
               float var9 = var1;
               var1 = 0.0F;
               d.j();
               boolean var10 = true;
               boolean var10000 = true;
               r var12 = r.f();
               p var13 = var12.k();
               this.Kv.E(K5);
               d.C();
               d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
               net.u.r var14 = this.Kh.v(var1);
               float var15 = (float)var14.p;
               float var16 = (float)var14.H;
               float var17 = (float)var14.a;
               this.d.P(false, this.Kx, var9, var14);
               if(this.d.y()) {
                  this.d.v();
                  if(var2 != 2) {
                     float var18 = (var15 * 30.0F + var16 * 59.0F + var17 * 11.0F) / 100.0F;
                     float var19 = (var15 * 30.0F + var16 * 70.0F) / 100.0F;
                     float var20 = (var15 * 30.0F + var17 * 70.0F) / 100.0F;
                     var15 = var18;
                     var16 = var19;
                     var17 = var20;
                  }

                  float var35 = 4.8828125E-4F;
                  double var36 = (double)((float)this.Kx + var1);
                  double var21 = var3 + var36 * 0.029999999329447746D;
                  int var23 = net.u.t.L(var21 / 2048.0D);
                  int var24 = net.u.t.L(var7 / 2048.0D);
                  var21 = var21 - (double)(var23 * 2048);
                  double var25 = var7 - (double)(var24 * 2048);
                  float var27 = this.Kh.F.e() - (float)var5 + 0.33F;
                  var27 = var27 + this.K.T.wH * 128.0F;
                  float var28 = (float)(var21 * 4.8828125E-4D);
                  float var29 = (float)(var25 * 4.8828125E-4D);
                  var13.m(7, net.y8.x.r);
                  short var30 = -256;
                  int var31 = -256;

                  while(true) {
                     var13.H((double)(var30 + 0), (double)var27, (double)(var31 + 32)).Y((double)((float)(var30 + 0) * 4.8828125E-4F + var28), (double)((float)(var31 + 32) * 4.8828125E-4F + var29)).m(var15, var16, var17, 0.8F).W();
                     var13.H((double)(var30 + 32), (double)var27, (double)(var31 + 32)).Y((double)((float)(var30 + 32) * 4.8828125E-4F + var28), (double)((float)(var31 + 32) * 4.8828125E-4F + var29)).m(var15, var16, var17, 0.8F).W();
                     var13.H((double)(var30 + 32), (double)var27, (double)(var31 + 0)).Y((double)((float)(var30 + 32) * 4.8828125E-4F + var28), (double)((float)(var31 + 0) * 4.8828125E-4F + var29)).m(var15, var16, var17, 0.8F).W();
                     var13.H((double)(var30 + 0), (double)var27, (double)(var31 + 0)).Y((double)((float)(var30 + 0) * 4.8828125E-4F + var28), (double)((float)(var31 + 0) * 4.8828125E-4F + var29)).m(var15, var16, var17, 0.8F).W();
                     var31 += 32;
                  }
               }

               this.d.M();
               d.T(1.0F, 1.0F, 1.0F, 1.0F);
               d.E();
               d.a();
            }

            if(z9.Q()) {
               oz.L();
            }
         }
      }

   }

   public boolean K(double var1, double var3, double var5, float var7) {
      return false;
   }

   private void Z(float var1, int var2, double var3, double var5, double var7) {
      float var9 = 0.0F;
      d.j();
      r var10 = r.f();
      var10.k();
      float var10000 = 12.0F;
      var10000 = 4.0F;
      double var14 = (double)((float)this.Kx + var9);
      double var16 = (var3 + var14 * 0.029999999329447746D) / 12.0D;
      double var18 = var7 / 12.0D + 0.33000001311302185D;
      float var20 = this.Kh.F.e() - (float)var5 + 0.33F;
      var10000 = var20 + this.K.T.wH * 128.0F;
      int var21 = net.u.t.L(var16 / 2048.0D);
      int var22 = net.u.t.L(var18 / 2048.0D);
      var16 = var16 - (double)(var21 * 2048);
      var18 = var18 - (double)(var22 * 2048);
      this.Kv.E(K5);
      d.C();
      d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
      net.u.r var23 = this.Kh.v(var9);
      float var24 = (float)var23.p;
      float var25 = (float)var23.H;
      float var26 = (float)var23.a;
      this.d.P(true, this.Kx, var1, var23);
      if(var2 != 2) {
         float var27 = (var24 * 30.0F + var25 * 59.0F + var26 * 11.0F) / 100.0F;
         float var28 = (var24 * 30.0F + var25 * 70.0F) / 100.0F;
         float var29 = (var24 * 30.0F + var26 * 70.0F) / 100.0F;
         var24 = var27;
         var25 = var28;
         var26 = var29;
      }

      float var53 = var24 * 0.9F;
      float var54 = var25 * 0.9F;
      float var55 = var26 * 0.9F;
      var10000 = var24 * 0.7F;
      var10000 = var25 * 0.7F;
      var10000 = var26 * 0.7F;
      var10000 = var24 * 0.8F;
      var10000 = var25 * 0.8F;
      var10000 = var26 * 0.8F;
      var10000 = 0.00390625F;
      var10000 = (float)net.u.t.L(var16) * 0.00390625F;
      var10000 = (float)net.u.t.L(var18) * 0.00390625F;
      var10000 = (float)(var16 - (double)net.u.t.L(var16));
      var10000 = (float)(var18 - (double)net.u.t.L(var18));
      boolean var69 = true;
      var69 = true;
      float var71 = 9.765625E-4F;
      d.W(12.0F, 1.0F, 12.0F);
      int var44 = 0;

      while(true) {
         d.q(false, false, false, false);
         this.d.M();
         ++var44;
      }
   }

   public void E(long var1) {
      var1 = (long)((double)var1 + 1.0E8D);
      this.KQ |= this.P.k(var1);
      if(this.w.size() > 0) {
         Iterator var3 = this.w.iterator();

         while(var3.hasNext()) {
            net.n5.m var4 = (net.n5.m)var3.next();
            if(!this.P.M(var4)) {
               break;
            }

            var4.Z();
            var3.remove();
            this.KP.remove(var4);
            this.s.remove(var4);
         }
      }

      if(this.s.size() > 0) {
         Iterator var10 = this.s.iterator();
         if(var10.hasNext()) {
            net.n5.m var12 = (net.n5.m)var10.next();
            if(this.P.E(var12)) {
               var10.remove();
            }
         }
      }

      boolean var11 = false;
      int var13 = z9.s();
      int var10000 = var13 * 2;
      if(!this.KP.isEmpty()) {
         Iterator var6 = this.KP.iterator();
         if(var6.hasNext()) {
            net.n5.m var7 = (net.n5.m)var6.next();
            if(var7.z()) {
               boolean var8 = this.P.l(var7);
            } else {
               boolean var14 = this.P.M(var7);
            }
         }
      }

   }

   public void T(net.ne.l var1, float var2) {
      r var3 = r.f();
      p var4 = var3.k();
      net.nz.p var5 = this.Kh.T();
      double var6 = (double)(this.K.T.ij * 16);
      if(var1.b >= var5.M() - var6 || var1.b <= var5.S() + var6 || var1.hr >= var5.Z() - var6 || var1.hr <= var5.U() + var6) {
         double var8 = 1.0D - var5.H(var1) / var6;
         var8 = Math.pow(var8, 4.0D);
         double var10 = var1.hL + (var1.b - var1.hL) * (double)var2;
         double var12 = var1.F + (var1.hS - var1.F) * (double)var2;
         double var14 = var1.A + (var1.hr - var1.A) * (double)var2;
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE, d.l.ONE, d.k.ZERO);
         this.Kv.E(Y);
         d.Y(false);
         d.c();
         int var16 = var5.t().S();
         float var17 = (float)(var16 >> 16 & 255) / 255.0F;
         float var18 = (float)(var16 >> 8 & 255) / 255.0F;
         float var19 = (float)(var16 & 255) / 255.0F;
         d.T(var17, var18, var19, (float)var8);
         d.x(-3.0F, -3.0F);
         d.y();
         d.d(516, 0.1F);
         d.m();
         d.j();
         float var20 = (float)(net.nn.j.E() % 3000L) / 3000.0F;
         float var10000 = 0.0F;
         var10000 = 0.0F;
         var10000 = 128.0F;
         var4.m(7, net.y8.x.H);
         var4.S(-var10, -var12, -var14);
         double var24 = Math.max((double)net.u.t.L(var14 - var6), var5.U());
         double var26 = Math.min((double)net.u.t.o(var14 + var6), var5.Z());
         if(var10 > var5.M() - var6) {
            float var28 = 0.0F;

            for(double var29 = var24; var29 < var26; var28 += 0.5F) {
               double var31 = Math.min(1.0D, var26 - var29);
               float var33 = (float)var31 * 0.5F;
               var4.H(var5.M(), 256.0D, var29).Y((double)(var20 + var28), (double)(var20 + 0.0F)).W();
               var4.H(var5.M(), 256.0D, var29 + var31).Y((double)(var20 + var33 + var28), (double)(var20 + 0.0F)).W();
               var4.H(var5.M(), 0.0D, var29 + var31).Y((double)(var20 + var33 + var28), (double)(var20 + 128.0F)).W();
               var4.H(var5.M(), 0.0D, var29).Y((double)(var20 + var28), (double)(var20 + 128.0F)).W();
               ++var29;
            }
         }

         if(var10 < var5.S() + var6) {
            float var37 = 0.0F;

            for(double var40 = var24; var40 < var26; var37 += 0.5F) {
               double var43 = Math.min(1.0D, var26 - var40);
               float var46 = (float)var43 * 0.5F;
               var4.H(var5.S(), 256.0D, var40).Y((double)(var20 + var37), (double)(var20 + 0.0F)).W();
               var4.H(var5.S(), 256.0D, var40 + var43).Y((double)(var20 + var46 + var37), (double)(var20 + 0.0F)).W();
               var4.H(var5.S(), 0.0D, var40 + var43).Y((double)(var20 + var46 + var37), (double)(var20 + 128.0F)).W();
               var4.H(var5.S(), 0.0D, var40).Y((double)(var20 + var37), (double)(var20 + 128.0F)).W();
               ++var40;
            }
         }

         var24 = Math.max((double)net.u.t.L(var10 - var6), var5.S());
         var26 = Math.min((double)net.u.t.o(var10 + var6), var5.M());
         if(var14 > var5.Z() - var6) {
            float var38 = 0.0F;

            for(double var41 = var24; var41 < var26; var38 += 0.5F) {
               double var44 = Math.min(1.0D, var26 - var41);
               float var47 = (float)var44 * 0.5F;
               var4.H(var41, 256.0D, var5.Z()).Y((double)(var20 + var38), (double)(var20 + 0.0F)).W();
               var4.H(var41 + var44, 256.0D, var5.Z()).Y((double)(var20 + var47 + var38), (double)(var20 + 0.0F)).W();
               var4.H(var41 + var44, 0.0D, var5.Z()).Y((double)(var20 + var47 + var38), (double)(var20 + 128.0F)).W();
               var4.H(var41, 0.0D, var5.Z()).Y((double)(var20 + var38), (double)(var20 + 128.0F)).W();
               ++var41;
            }
         }

         if(var14 < var5.U() + var6) {
            float var39 = 0.0F;

            for(double var42 = var24; var42 < var26; var39 += 0.5F) {
               double var45 = Math.min(1.0D, var26 - var42);
               float var48 = (float)var45 * 0.5F;
               var4.H(var42, 256.0D, var5.U()).Y((double)(var20 + var39), (double)(var20 + 0.0F)).W();
               var4.H(var42 + var45, 256.0D, var5.U()).Y((double)(var20 + var48 + var39), (double)(var20 + 0.0F)).W();
               var4.H(var42 + var45, 0.0D, var5.U()).Y((double)(var20 + var48 + var39), (double)(var20 + 128.0F)).W();
               var4.H(var42, 0.0D, var5.U()).Y((double)(var20 + var39), (double)(var20 + 128.0F)).W();
               ++var42;
            }
         }

         var3.p();
         var4.S(0.0D, 0.0D, 0.0D);
         d.a();
         d.d();
         d.x(0.0F, 0.0F);
         d.x();
         d.m();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         d.E();
         d.Y();
         d.Y(true);
      }

   }

   private void M() {
      d.e(d.l.DST_COLOR, d.k.SRC_COLOR, d.l.ONE, d.k.ZERO);
      d.C();
      d.T(1.0F, 1.0F, 1.0F, 0.5F);
      d.x(-3.0F, -3.0F);
      d.y();
      d.d(516, 0.1F);
      d.m();
      d.c();
      if(z9.Q()) {
         be.W();
      }

   }

   private void C() {
      d.d();
      d.x(0.0F, 0.0F);
      d.x();
      d.m();
      d.Y(true);
      d.Y();
      if(z9.Q()) {
         be.q();
      }

   }

   public void z(r var1, p var2, net.ne.l var3, float var4) {
      double var5 = var3.hL + (var3.b - var3.hL) * (double)var4;
      double var7 = var3.F + (var3.hS - var3.F) * (double)var4;
      double var9 = var3.A + (var3.hr - var3.A) * (double)var4;
      if(!this.x.isEmpty()) {
         this.Kv.E(net.n9.b.N);
         this.M();
         var2.m(7, net.y8.x.M);
         var2.S(-var5, -var7, -var9);
         var2.l();
         Iterator var11 = this.x.values().iterator();

         while(var11.hasNext()) {
            i var12 = (i)var11.next();
            net.u.j var13 = var12.x();
            double var14 = (double)var13.t() - var5;
            double var16 = (double)var13.h() - var7;
            double var18 = (double)var13.y() - var9;
            net.y9.l var20 = this.Kh.Z(var13).Q();
            if(i6.H.r()) {
               boolean var22 = var20 instanceof z_ || var20 instanceof zy || var20 instanceof rt || var20 instanceof rp;
               net.ni.v var23 = this.Kh.L(var13);
               var22 = i6.I(var23, i6.H, new Object[0]);
               boolean var26 = true;
            } else {
               boolean var21 = !(var20 instanceof z_) && !(var20 instanceof zy) && !(var20 instanceof rt) && !(var20 instanceof rp);
            }

            if(var14 * var14 + var16 * var16 + var18 * var18 > 1024.0D) {
               var11.remove();
            } else {
               net.yw.n var28 = this.Kh.Z(var13);
               if(var28.n() != net.y1.l.q) {
                  int var29 = var12.u();
                  net.n9.v var24 = this.g[var29];
                  k var25 = this.K.x();
                  var25.f(var28, var13, var24, this.Kh);
               }
            }
         }

         var1.p();
         var2.S(0.0D, 0.0D, 0.0D);
         this.C();
      }

   }

   public void J(net.r.r var1, net.u.m var2, int var3, float var4) {
      if(var2.v == net.u.m.BLOCK) {
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         d.y(2.0F);
         d.w();
         if(z9.Q()) {
            oz.n5();
         }

         d.Y(false);
         net.u.j var5 = var2.j();
         net.yw.n var6 = this.Kh.Z(var5);
         if(var6.n() != net.y1.l.q && this.Kh.T().U(var5)) {
            double var7 = var1.hL + (var1.b - var1.hL) * (double)var4;
            double var9 = var1.F + (var1.hS - var1.F) * (double)var4;
            double var11 = var1.A + (var1.hr - var1.A) * (double)var4;
            a(var6.u(this.Kh, var5).x(0.0020000000949949026D).w(-var7, -var9, -var11), 0.0F, 0.0F, 0.0F, 0.4F);
         }

         d.Y(true);
         d.S();
         if(z9.Q()) {
            oz.ny();
         }

         d.E();
      }

   }

   public static void a(net.u.e var0, float var1, float var2, float var3, float var4) {
      A(var0.n, var0.u, var0.N, var0.d, var0.c, var0.r, var1, var2, var3, var4);
   }

   public static void A(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      r var16 = r.f();
      p var17 = var16.k();
      var17.m(3, net.y8.x.F);
      J(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.p();
   }

   public static void R(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      GL11.glPushMatrix();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      r var16 = r.f();
      p var17 = var16.k();
      var17.m(3, net.y8.x.F);
      J(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.p();
      GL11.glLineWidth(4.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void J(p var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, 0.0F).W();
      var0.H(var1, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, 0.0F).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var5).m(var13, var14, var15, 0.0F).W();
      var0.H(var7, var3, var5).m(var13, var14, var15, var16).W();
   }

   public static void Y(net.u.e var0, float var1, float var2, float var3, float var4) {
      r(var0.n, var0.u, var0.N, var0.d, var0.c, var0.r, var1, var2, var3, var4);
   }

   public static void r(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      r var16 = r.f();
      p var17 = var16.k();
      var17.m(5, net.y8.x.F);
      o(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.p();
   }

   public static void o(p var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var3, var11).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var1, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var5).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
      var0.H(var7, var9, var11).m(var13, var14, var15, var16).W();
   }

   private void C(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.Kk.B(var1, var2, var3, var4, var5, var6, var7);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3, net.yw.n var4, int var5) {
      int var6 = var2.t();
      int var7 = var2.h();
      int var8 = var2.y();
      this.C(var6 - 1, var7 - 1, var8 - 1, var6 + 1, var7 + 1, var8 + 1, (var5 & 8) != 0);
   }

   public void s(net.u.j var1) {
      this.Ke.add(var1.F());
   }

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.C(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1, false);
   }

   public void J(@Nullable net.yz.a var1, net.u.j var2) {
      net.h.d var3 = (net.h.d)this.l.get(var2);
      this.K.n().E(var3);
      this.l.remove(var2);
      kb var4 = kb.Y(var1);
      this.K.y.v(var4.I());
      net.h.a var5 = net.h.a.J(var1, (float)var2.t(), (float)var2.h(), (float)var2.y());
      this.l.put(var2, var5);
      this.K.n().g((net.h.d)var5);
      this.I(this.Kh, var2, true);
   }

   private void I(net.yv.r var1, net.u.j var2, boolean var3) {
      for(net.ne.a var5 : var1.p(net.ne.a.class, (new net.u.e(var2)).x(3.0D))) {
         var5.U(var2, var3);
      }

   }

   public void f(@Nullable net.r.r var1, net.yz.a var2, net.yz.p var3, double var4, double var6, double var8, float var10, float var11) {
   }

   public void t(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      this.R(var1, var2, false, var3, var5, var7, var9, var11, var13, var15);
   }

   public void R(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
      this.x(var1, var2, var3, var4, var6, var8, var10, var12, var14, var16);
   }

   private void L(ai var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      this.t(var1.b(), var1.x(), var2, var4, var6, var8, var10, var12, var14);
   }

   @Nullable
   private net.yh.x O(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      return this.x(var1, var2, false, var3, var5, var7, var9, var11, var13, var15);
   }

   @Nullable
   private net.yh.x x(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
      net.ne.l var17 = this.K.A();
      if(this.K != null && this.K.sv != null) {
         int var18 = this.L(var3);
         double var19 = var17.b - var4;
         double var21 = var17.hS - var6;
         double var23 = var17.hr - var8;
         if(var1 == ai.EXPLOSION_HUGE.b() && !z9.e()) {
            return null;
         } else if(var1 == ai.EXPLOSION_LARGE.b() && !z9.e()) {
            return null;
         } else if(var1 == ai.EXPLOSION_NORMAL.b() && !z9.e()) {
            return null;
         } else if(var1 == ai.SUSPENDED.b() && !z9.J()) {
            return null;
         } else if(var1 == ai.SUSPENDED_DEPTH.b() && !z9.y()) {
            return null;
         } else if(var1 == ai.SMOKE_NORMAL.b() && !z9.SI()) {
            return null;
         } else if(var1 == ai.SMOKE_LARGE.b() && !z9.SI()) {
            return null;
         } else if(var1 == ai.SPELL_MOB.b() && !z9.Sg()) {
            return null;
         } else if(var1 == ai.SPELL_MOB_AMBIENT.b() && !z9.Sg()) {
            return null;
         } else if(var1 == ai.SPELL.b() && !z9.Sg()) {
            return null;
         } else if(var1 == ai.SPELL_INSTANT.b() && !z9.Sg()) {
            return null;
         } else if(var1 == ai.SPELL_WITCH.b() && !z9.Sg()) {
            return null;
         } else if(var1 == ai.PORTAL.b() && !z9.S4()) {
            return null;
         } else if(var1 == ai.FLAME.b() && !z9.g()) {
            return null;
         } else if(var1 == ai.REDSTONE.b() && !z9.z()) {
            return null;
         } else if(var1 == ai.DRIP_WATER.b() && !z9.Sh()) {
            return null;
         } else if(var1 == ai.DRIP_LAVA.b() && !z9.Sh()) {
            return null;
         } else if(var1 == ai.FIREWORKS_SPARK.b() && !z9.W()) {
            return null;
         } else {
            double var25 = 1024.0D;
            if(var1 == ai.CRIT.b()) {
               var25 = 38416.0D;
            }

            if(var19 * var19 + var21 * var21 + var23 * var23 > var25) {
               return null;
            } else if(var18 > 1) {
               return null;
            } else {
               net.yh.x var27 = this.K.sv.r(var1, var4, var6, var8, var10, var12, var14, var16);
               if(var1 == ai.WATER_BUBBLE.b()) {
                  x7.J(var27, this.Kh, var4, var6, var8, this.h);
               }

               if(var1 == ai.WATER_SPLASH.b()) {
                  x7.J(var27, this.Kh, var4, var6, var8, this.h);
               }

               if(var1 == ai.WATER_DROP.b()) {
                  x7.J(var27, this.Kh, var4, var6, var8, this.h);
               }

               if(var1 == ai.TOWN_AURA.b()) {
                  x7.Z(var27);
               }

               if(var1 == ai.PORTAL.b()) {
                  x7.y(var27);
               }

               if(var1 == ai.REDSTONE.b()) {
                  x7.Z(var27, this.Kh, var4, var6, var8);
               }

               return var27;
            }
         }
      } else {
         return null;
      }
   }

   private int L(boolean var1) {
      int var2 = this.K.T.wQ;
      if(var2 == 2 && this.Kh.G.nextInt(10) == 0) {
         var2 = 1;
      }

      if(var2 == 1 && this.Kh.G.nextInt(3) == 0) {
         var2 = 2;
      }

      return var2;
   }

   public void u(net.ne.l var1) {
      x4.w(var1, this.Kh);
      if(z9.I()) {
         oq.C(var1, this);
      }

   }

   public void L(net.ne.l var1) {
      if(z9.I()) {
         oq.W(var1, this);
      }

   }

   public void L() {
   }

   public void Y(int var1, net.u.j var2, int var3) {
      switch(var1) {
      case 1023:
      case 1028:
      case 1038:
         net.ne.l var4 = this.K.A();
         double var5 = (double)var2.t() - var4.b;
         double var7 = (double)var2.h() - var4.hS;
         double var9 = (double)var2.y() - var4.hr;
         double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
         double var13 = var4.b;
         double var15 = var4.hS;
         double var17 = var4.hr;
         if(var11 > 0.0D) {
            var13 += var5 / var11 * 2.0D;
            var15 += var7 / var11 * 2.0D;
            var17 += var9 / var11 * 2.0D;
         }

         if(var1 == 1023) {
            this.Kh.m(var13, var15, var17, net.nb.l.wQ, net.yz.p.HOSTILE, 1.0F, 1.0F, false);
         } else if(var1 == 1038) {
            this.Kh.m(var13, var15, var17, net.nb.l.Dc, net.yz.p.HOSTILE, 1.0F, 1.0F, false);
         } else {
            this.Kh.m(var13, var15, var17, net.nb.l.KH, net.yz.p.HOSTILE, 5.0F, 1.0F, false);
         }
      default:
      }
   }

   public void a(net.r.r var1, int var2, net.u.j var3, int var4) {
      p.S();
      Random var6 = this.Kh.G;
      switch(var2) {
      case 1000:
         this.Kh.z(var3, net.nb.l.wj, net.yz.p.BLOCKS, 1.0F, 1.0F, false);
      case 1001:
         this.Kh.z(var3, net.nb.l.L, net.yz.p.BLOCKS, 1.0F, 1.2F, false);
      case 1002:
         this.Kh.z(var3, net.nb.l.t, net.yz.p.BLOCKS, 1.0F, 1.2F, false);
      case 1003:
         this.Kh.z(var3, net.nb.l.KE, net.yz.p.NEUTRAL, 1.0F, 1.2F, false);
      case 1004:
         this.Kh.z(var3, net.nb.l.M6, net.yz.p.NEUTRAL, 1.0F, 1.2F, false);
      case 1005:
         this.Kh.z(var3, net.nb.l.HQ, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1006:
         this.Kh.z(var3, net.nb.l.MY, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1007:
         this.Kh.z(var3, net.nb.l.HV, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1008:
         this.Kh.z(var3, net.nb.l.PH, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1009:
         this.Kh.z(var3, net.nb.l.oS, net.yz.p.BLOCKS, 0.5F, 2.6F + (var6.nextFloat() - var6.nextFloat()) * 0.8F, false);
      case 1010:
         if(net.n0.y.k(var4) instanceof kb) {
            this.Kh.O(var3, ((kb)net.n0.y.k(var4)).B());
         }

         this.Kh.O(var3, (net.yz.a)null);
      case 1011:
         this.Kh.z(var3, net.nb.l.Pf, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1012:
         this.Kh.z(var3, net.nb.l.KF, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1013:
         this.Kh.z(var3, net.nb.l.C0, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1014:
         this.Kh.z(var3, net.nb.l.CS, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1015:
         this.Kh.z(var3, net.nb.l.Di, net.yz.p.HOSTILE, 10.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1016:
         this.Kh.z(var3, net.nb.l.Pb, net.yz.p.HOSTILE, 10.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1017:
         this.Kh.z(var3, net.nb.l.Mt, net.yz.p.HOSTILE, 10.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1018:
         this.Kh.z(var3, net.nb.l.K4, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1019:
         this.Kh.z(var3, net.nb.l.w5, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1020:
         this.Kh.z(var3, net.nb.l.wh, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1021:
         this.Kh.z(var3, net.nb.l.oB, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1022:
         this.Kh.z(var3, net.nb.l.Cw, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1024:
         this.Kh.z(var3, net.nb.l.C4, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1025:
         this.Kh.z(var3, net.nb.l.Hv, net.yz.p.NEUTRAL, 0.05F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1026:
         this.Kh.z(var3, net.nb.l.Db, net.yz.p.HOSTILE, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1027:
         this.Kh.z(var3, net.nb.l.m, net.yz.p.NEUTRAL, 2.0F, (var6.nextFloat() - var6.nextFloat()) * 0.2F + 1.0F, false);
      case 1029:
         this.Kh.z(var3, net.nb.l.MH, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1030:
         this.Kh.z(var3, net.nb.l.PA, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1031:
         this.Kh.z(var3, net.nb.l.K5, net.yz.p.BLOCKS, 0.3F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1032:
         this.K.n().g((net.h.d)net.h.a.v(net.nb.l.A, var6.nextFloat() * 0.4F + 0.8F));
      case 1033:
         this.Kh.z(var3, net.nb.l.wy, net.yz.p.BLOCKS, 1.0F, 1.0F, false);
      case 1034:
         this.Kh.z(var3, net.nb.l.H5, net.yz.p.BLOCKS, 1.0F, 1.0F, false);
      case 1035:
         this.Kh.z(var3, net.nb.l.Dr, net.yz.p.BLOCKS, 1.0F, 1.0F, false);
      case 1036:
         this.Kh.z(var3, net.nb.l.wV, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 1037:
         this.Kh.z(var3, net.nb.l.Mk, net.yz.p.BLOCKS, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 2000:
         int var7 = var4 % 3 - 1;
         int var8 = var4 / 3 % 3 - 1;
         double var9 = (double)var3.t() + (double)var7 * 0.6D + 0.5D;
         double var11 = (double)var3.h() + 0.5D;
         double var13 = (double)var3.y() + (double)var8 * 0.6D + 0.5D;
         int var42 = 0;
         double var45 = var6.nextDouble() * 0.2D + 0.01D;
         double var46 = var9 + (double)var7 * 0.01D + (var6.nextDouble() - 0.5D) * (double)var8 * 0.5D;
         double var47 = var11 + (var6.nextDouble() - 0.5D) * 0.5D;
         double var50 = var13 + (double)var8 * 0.01D + (var6.nextDouble() - 0.5D) * (double)var7 * 0.5D;
         double var51 = (double)var7 * var45 + var6.nextGaussian() * 0.01D;
         double var54 = -0.03D + var6.nextGaussian() * 0.01D;
         double var55 = (double)var8 * var45 + var6.nextGaussian() * 0.01D;
         this.L(ai.SMOKE_NORMAL, var46, var47, var50, var51, var54, var55, new int[0]);
         ++var42;
         return;
      case 2001:
         net.y9.l var15 = net.y9.l.I(var4 & 4095);
         if(var15.p().n() != net.y1.l.q) {
            lk var16 = var15.X();
            if(i6.UN.r()) {
               var16 = (lk)i6.b(var15, i6.UN, new Object[]{net.y9.l.P(var4), this.Kh, var3, null});
            }

            this.Kh.z(var3, var16.d(), net.yz.p.BLOCKS, (var16.m() + 1.0F) / 2.0F, var16.X() * 0.8F, false);
         }

         this.K.sv.j(var3, var15.D(var4 >> 12 & 255));
      case 2002:
      case 2007:
         double var44 = (double)var3.t();
         double var18 = (double)var3.h();
         double var20 = (double)var3.y();
         int var22 = 0;
         this.L(ai.ITEM_CRACK, var44, var18, var20, var6.nextGaussian() * 0.15D, var6.nextDouble() * 0.2D, var6.nextGaussian() * 0.15D, new int[]{net.n0.y.h(net.nb.j.YD)});
         ++var22;
         float var49 = (float)(var4 >> 16 & 255) / 255.0F;
         float var23 = (float)(var4 >> 8 & 255) / 255.0F;
         float var24 = (float)(var4 >> 0 & 255) / 255.0F;
         ai var25 = var2 == 2007?ai.SPELL_INSTANT:ai.SPELL;
         int var26 = 0;
         double var27 = var6.nextDouble() * 4.0D;
         double var29 = var6.nextDouble() * 3.141592653589793D * 2.0D;
         double var31 = Math.cos(var29) * var27;
         double var64 = 0.01D + var6.nextDouble() * 0.5D;
         double var66 = Math.sin(var29) * var27;
         net.yh.x var68 = this.O(var25.b(), var25.x(), var44 + var31 * 0.1D, var18 + 0.3D, var20 + var66 * 0.1D, var31, var64, var66, new int[0]);
         float var38 = 0.75F + var6.nextFloat() * 0.25F;
         var68.W(var49 * var38, var23 * var38, var24 * var38);
         var68.N((float)var27);
         ++var26;
         this.Kh.z(var3, net.nb.l.KA, net.yz.p.NEUTRAL, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 2003:
         double var53 = (double)var3.t() + 0.5D;
         double var28 = (double)var3.h();
         double var30 = (double)var3.y() + 0.5D;
         int var59 = 0;
         this.L(ai.ITEM_CRACK, var53, var28, var30, var6.nextGaussian() * 0.15D, var6.nextDouble() * 0.2D, var6.nextGaussian() * 0.15D, new int[]{net.n0.y.h(net.nb.j.SV)});
         ++var59;
         double var61 = 0.0D;
         double var69;
         int var10000 = (var69 = var61 - 6.283185307179586D) == 0.0D?0:(var69 < 0.0D?-1:1);
         this.L(ai.PORTAL, var53 + Math.cos(var61) * 5.0D, var28 - 0.4D, var30 + Math.sin(var61) * 5.0D, Math.cos(var61) * -5.0D, 0.0D, Math.sin(var61) * -5.0D, new int[0]);
         this.L(ai.PORTAL, var53 + Math.cos(var61) * 5.0D, var28 - 0.4D, var30 + Math.sin(var61) * 5.0D, Math.cos(var61) * -7.0D, 0.0D, Math.sin(var61) * -7.0D, new int[0]);
         var61 = var61 + 0.15707963267948966D;
         return;
      case 2004:
         int var57 = 0;
         double var63 = (double)var3.t() + 0.5D + ((double)this.Kh.G.nextFloat() - 0.5D) * 2.0D;
         double var65 = (double)var3.h() + 0.5D + ((double)this.Kh.G.nextFloat() - 0.5D) * 2.0D;
         double var67 = (double)var3.y() + 0.5D + ((double)this.Kh.G.nextFloat() - 0.5D) * 2.0D;
         this.Kh.n(ai.SMOKE_NORMAL, var63, var65, var67, 0.0D, 0.0D, 0.0D, new int[0]);
         this.Kh.n(ai.FLAME, var63, var65, var67, 0.0D, 0.0D, 0.0D, new int[0]);
         ++var57;
         return;
      case 2005:
         y4.d(this.Kh, var3, var4);
      case 2006:
         int var32 = 0;
         float var33 = var6.nextFloat() * 4.0F;
         float var34 = var6.nextFloat() * 6.2831855F;
         double var35 = (double)(net.u.t.m(var34) * var33);
         double var37 = 0.01D + var6.nextDouble() * 0.5D;
         double var39 = (double)(net.u.t.A(var34) * var33);
         net.yh.x var41 = this.O(ai.DRAGON_BREATH.b(), false, (double)var3.t() + var35 * 0.1D, (double)var3.h() + 0.3D, (double)var3.y() + var39 * 0.1D, var35, var37, var39, new int[0]);
         var41.N(var33);
         ++var32;
         this.Kh.z(var3, net.nb.l.DH, net.yz.p.HOSTILE, 1.0F, this.Kh.G.nextFloat() * 0.1F + 0.9F, false);
      case 3000:
         this.Kh.T(ai.EXPLOSION_HUGE, true, (double)var3.t() + 0.5D, (double)var3.h() + 0.5D, (double)var3.y() + 0.5D, 0.0D, 0.0D, 0.0D, new int[0]);
         this.Kh.z(var3, net.nb.l.MT, net.yz.p.BLOCKS, 10.0F, (1.0F + (this.Kh.G.nextFloat() - this.Kh.G.nextFloat()) * 0.2F) * 0.7F, false);
      case 3001:
         this.Kh.z(var3, net.nb.l.oA, net.yz.p.HOSTILE, 64.0F, 0.8F + this.Kh.G.nextFloat() * 0.3F, false);
      default:
      }
   }

   public void c(int var1, net.u.j var2, int var3) {
      if(var3 < 10) {
         i var4 = (i)this.x.get(Integer.valueOf(var1));
         if(var4.x().t() != var2.t() || var4.x().h() != var2.h() || var4.x().y() != var2.y()) {
            var4 = new i(var1, var2);
            this.x.put(Integer.valueOf(var1), var4);
         }

         var4.S(var3);
         var4.z(this.Kx);
      } else {
         this.x.remove(Integer.valueOf(var1));
      }

   }

   public boolean O() {
      return this.KP.isEmpty() && this.P.J();
   }

   public void W() {
      this.KQ = true;
   }

   public void J() {
      this.d.Y();
   }

   public int s() {
      return this.Kk.M.length;
   }

   public int Z() {
      return this.I.size();
   }

   public int d() {
      return this.Kg;
   }

   public int U() {
      return this.i;
   }

   public int p() {
      if(this.Kh == null) {
         return 0;
      } else {
         net.cp.o var1 = this.Kh.m();
         return 0;
      }
   }

   public int J() {
      return this.KP.size();
   }

   public net.n5.m Q(net.u.j var1) {
      return this.Kk.J(var1);
   }

   public net.cp.v r() {
      return this.Kh;
   }

   public void N(Collection var1, Collection var2) {
      Set var3 = this.J;
      this.J.removeAll(var1);
      this.J.addAll(var2);
   }

   private u.r H(net.n5.m var1, aq var2, int var3) {
      u.r var4;
      if(Kn.isEmpty()) {
         var4 = new u.r(var1, var2, var3);
      } else {
         var4 = (u.r)Kn.pollLast();
         var4.B(var1, var2, var3);
      }

      var4.I = true;
      return var4;
   }

   private void C(u.r var1) {
      if(var1.I) {
         Kn.add(var1);
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   public static class r {
      net.n5.m b;
      aq E;
      int P;
      boolean I = false;

      public r(net.n5.m var1, aq var2, int var3) {
         this.b = var1;
         this.E = var2;
         this.P = var3;
      }

      public void W(byte var1, aq var2) {
         this.P = this.P | var1 | 1 << var2.ordinal();
      }

      public boolean k(aq var1) {
         String var2 = p.S();
         return (this.P & 1 << var1.ordinal()) > 0;
      }

      private void B(net.n5.m var1, aq var2, int var3) {
         this.b = var1;
         this.E = var2;
         this.P = var3;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
