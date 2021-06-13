package net.y;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net._x;
import net.be;
import net.gn;
import net.i6;
import net.ii;
import net.os;
import net.oz;
import net.pi;
import net.s4;
import net.si;
import net.u_;
import net.ue;
import net.v2;
import net.v3;
import net.v5;
import net.vj;
import net.vz;
import net.wl;
import net.x4;
import net.x7;
import net.xn;
import net.z9;
import net.n0.ks;
import net.nl.z1;
import net.y.d;
import net.y.h;
import net.y.m;
import net.y.p;
import net.y.r;
import net.y.u;
import net.y.u1;
import net.y.ub;
import net.y.ui;
import net.y9.rn;
import net.yh.c7;
import net.yv.o9;
import net.yz.ac;
import net.yz.ai;
import net.yz.al;
import net.yz.aq;
import net.yz.av;
import net.yz.m_;
import net.z.t4;
import net.z.tt;
import net.z.tu;
import net.z.wo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

public class n implements net.c9.v {
   private static final Logger U = LogManager.getLogger();
   private static final m_ b = new m_("textures/environment/rain.png");
   private static final m_ w = new m_("textures/environment/snow.png");
   public static boolean mZ;
   private double F;
   public static int mS;
   private final net.nn.j o;
   private final net.c9.p X;
   private final Random j = new Random();
   private float q;
   public ub z;
   private final wo mX;
   private int n;
   private net.ne.l m2;
   private al mF = new al();
   private al H = new al();
   private final float mC = 4.0F;
   private float r = 4.0F;
   private float mY;
   private float mK;
   private float D;
   private float S;
   private float Q;
   private float v;
   private float M;
   private float t;
   private float mx;
   private boolean p;
   private final boolean Y = true;
   private final boolean my = true;
   private long e;
   private long N = net.nn.j.E();
   private long x;
   private final net.n9.x u;
   private final int[] O;
   private final m_ I;
   private boolean K;
   private float ml;
   private float E;
   private int s;
   private final float[] J = new float[1024];
   private final float[] V = new float[1024];
   private final FloatBuffer R = m.R(16);
   public float d;
   public float i;
   public float m1;
   private float f;
   private float P;
   private int mn;
   private boolean A;
   private final double l = 1.0D;
   private double k;
   private double mp;
   private ks g;
   private int C;
   private float B;
   private float mA;
   public net.y2.w mr;
   private static final m_[] me = new m_[]{new m_("shaders/post/notch.json"), new m_("shaders/post/fxaa.json"), new m_("shaders/post/art.json"), new m_("shaders/post/bumpy.json"), new m_("shaders/post/blobs2.json"), new m_("shaders/post/pencil.json"), new m_("shaders/post/color_convolve.json"), new m_("shaders/post/deconverge.json"), new m_("shaders/post/flip.json"), new m_("shaders/post/invert.json"), new m_("shaders/post/ntsc.json"), new m_("shaders/post/outline.json"), new m_("shaders/post/phosphor.json"), new m_("shaders/post/scan_pincushion.json"), new m_("shaders/post/sobel.json"), new m_("shaders/post/bits.json"), new m_("shaders/post/desaturate.json"), new m_("shaders/post/green.json"), new m_("shaders/post/blur.json"), new m_("shaders/post/wobble.json"), new m_("shaders/post/blobs.json"), new m_("shaders/post/antialias.json"), new m_("shaders/post/creeper.json"), new m_("shaders/post/spider.json")};
   public static final int h = me.length;
   private int m0;
   private boolean T;
   public int Z;
   private boolean ms = false;
   private net.yv.r W = null;
   public boolean a = false;
   private float mh = 128.0F;
   private long mP = 0L;
   private int L = 0;
   private int m = 0;
   private int y = 0;
   private float G = 0.0F;
   private float mc = 0.0F;
   private long c = 0L;
   private final net.y2.w[] mv = new net.y2.w[10];
   private boolean mJ = false;

   public n(net.nn.j var1, net.c9.p var2) {
      this.m0 = h;
      this.o = var1;
      this.X = var2;
      this.z = var1.h();
      this.mX = new wo(var1.n());
      this.u = new net.n9.x(16, 16);
      this.I = var1.n().u("lightMap", this.u);
      this.O = this.u.X();
      this.mr = null;
      byte var3 = 0;
      int var4 = 0;

      while(true) {
         float var5 = (float)(var4 - 16);
         float var6 = (float)(var3 - 16);
         float var7 = net.u.t.g(var5 * var5 + var6 * var6);
         this.J[var3 << 5 | var4] = -var6 / var7;
         this.V[var3 << 5 | var4] = var5 / var7;
         ++var4;
      }
   }

   public boolean w() {
      return ui.H && this.mr != null;
   }

   public void q() {
      if(this.mr != null) {
         this.mr.i();
      }

      this.mr = null;
      this.m0 = h;
   }

   public void p() {
      this.T = !this.T;
   }

   public void v(@Nullable net.ne.l var1) {
      if(ui.H) {
         if(this.mr != null) {
            this.mr.i();
         }

         this.mr = null;
         if(var1 instanceof net.nk.m) {
            this.E(new m_("shaders/post/creeper.json"));
         } else if(var1 instanceof net.nk.a) {
            this.E(new m_("shaders/post/spider.json"));
         } else if(var1 instanceof net.nk.u) {
            this.E(new m_("shaders/post/invert.json"));
         } else if(i6.CF.r()) {
            i6.H(i6.CF, new Object[]{var1, this});
         }
      }

   }

   public void E(m_ var1) {
      if(ui.R()) {
         this.mr = new net.y2.w(this.o.n(), this.X, this.o.O(), var1);
         this.mr.h(this.o.sB, this.o.st);
         this.T = true;
      }

   }

   public void s(net.c9.p var1) {
      if(this.mr != null) {
         this.mr.i();
      }

      this.mr = null;
      if(this.m0 == h) {
         this.v(this.o.A());
      } else {
         this.E(me[this.m0]);
      }

   }

   public void B() {
      this.S();
      this.I();
      this.f = this.P;
      this.r = 4.0F;
      if(this.o.T.w4) {
         float var1 = this.o.T.tM * 0.6F + 0.2F;
         float var2 = var1 * var1 * var1 * 8.0F;
         this.D = this.mF.p(this.mY, 0.05F * var2);
         this.S = this.H.p(this.mK, 0.05F * var2);
         this.Q = 0.0F;
         this.mY = 0.0F;
         this.mK = 0.0F;
      } else {
         this.D = 0.0F;
         this.S = 0.0F;
         this.mF.A();
         this.H.A();
      }

      if(this.o.A() == null) {
         this.o.w((net.ne.l)this.o.sf);
      }

      net.ne.l var11 = this.o.A();
      double var12 = var11.b;
      double var4 = var11.hS + (double)var11.A();
      double var6 = var11.hr;
      float var8 = this.o.s8.u(new net.u.j(var12, var4, var6));
      float var9 = (float)this.o.T.ij / 16.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      float var10 = var8 * (1.0F - var9) + var9;
      this.P += (var10 - this.P) * 0.1F;
      ++this.n;
      this.z.m();
      this.a();
      this.mx = this.t;
      if(this.o.y.T().W()) {
         this.t += 0.05F;
         if(this.t > 1.0F) {
            this.t = 1.0F;
         }
      } else if(this.t > 0.0F) {
         this.t -= 0.0125F;
      }

      if(this.C > 0) {
         --this.C;
         if(this.C == 0) {
            this.g = null;
         }
      }

   }

   public net.y2.w U() {
      return this.mr;
   }

   public void R(int var1, int var2) {
      if(ui.H) {
         if(this.mr != null) {
            this.mr.h(var1, var2);
         }

         this.o.o.g(var1, var2);
      }

   }

   public void K(float var1) {
      net.ne.l var2 = this.o.A();
      if(this.o.s8 != null) {
         this.o.sl.K("pick");
         this.o.B = null;
         double var3 = (double)this.o.sE.e();
         this.o.H = var2.U(var3, var1);
         net.u.r var5 = var2.E(var1);
         boolean var6 = false;
         boolean var10000 = true;
         double var8 = var3;
         if(this.o.sE.r()) {
            var8 = 6.0D;
            var3 = var8;
         } else if(var3 > 3.0D) {
            var6 = true;
         }

         if(this.o.H != null) {
            var8 = this.o.H.z.w(var5);
         }

         net.u.r var10 = var2.r(1.0F);
         net.u.r var11 = var5.s(var10.p * var3, var10.H * var3, var10.a * var3);
         this.m2 = null;
         net.u.r var12 = null;
         float var27 = 1.0F;
         List var14 = this.o.s8.S(var2, var2.i().T(var10.p * var3, var10.H * var3, var10.a * var3).f(1.0D, 1.0D, 1.0D), Predicates.and(net.yz.q.n, new Predicate() {
            public boolean c(@Nullable net.ne.l var1) {
               String var2 = p.S();
               return var1 != null && var1.w();
            }

            private static xn a(xn var0) {
               return var0;
            }
         }));
         double var15 = var8;
         if(gn.Q.j.d(v2.class).v()) {
            return;
         }

         for(net.ne.l var18 : var14) {
            if(var18 instanceof net.nm.z && gn.Q.j.d(v5.class).v() && v5.q.Q()) {
               return;
            }

            if(!gn.Q.j.d(si.class).v() || si.d == null || !si.o.Q()) {
               net.u.e var19 = var18.i().x((double)var18.t());
               net.u.m var20 = var19.G(var5, var11);
               if(var19.R(var5)) {
                  if(var15 >= 0.0D) {
                     this.m2 = var18;
                     var12 = var5;
                     var15 = 0.0D;
                  }
               } else {
                  double var21 = var5.w(var20.z);
                  if(var21 < var15 || var15 == 0.0D) {
                     boolean var23 = false;
                     if(i6.BH.r()) {
                        var23 = i6.I(var18, i6.BH, new Object[0]);
                     }

                     if(var18.o() == var2.o()) {
                        if(var15 == 0.0D) {
                           this.m2 = var18;
                           var12 = var20.z;
                        }
                     } else {
                        this.m2 = var18;
                        var12 = var20.z;
                        var15 = var21;
                     }
                  }
               }
            }
         }

         double var25 = 0.0D;
         if(this.m2 != null) {
            if(gn.Q.z.o(this.m2.Q())) {
               var25 = 3.0D;
            } else {
               var25 = gn.Q.j.d(s4.class).v()?(double)s4.Z.e():3.0D;
            }
         }

         if(this.m2 != null && var5.w(var12) > var25) {
            this.m2 = null;
            this.o.H = new net.u.m(net.u.m.MISS, var12, (aq)null, new net.u.j(var12));
         }

         if(this.m2 != null && (var15 < var8 || this.o.H == null)) {
            this.o.H = new net.u.m(this.m2, var12);
            if(this.m2 instanceof net.ne.a || this.m2 instanceof net.nm.e) {
               this.o.B = this.m2;
            }
         }

         this.o.sl.N();
      }

   }

   private void S() {
      float var1 = 1.0F;
      if(this.o.A() instanceof net.yy.f) {
         net.yy.f var2 = (net.yy.f)this.o.A();
         var1 = var2.T();
      }

      this.M = this.v;
      this.v += (var1 - this.v) * 0.5F;
      if(this.v > 1.5F) {
         this.v = 1.5F;
      }

      if(this.v < 0.1F) {
         this.v = 0.1F;
      }

   }

   private float C(float var1, boolean var2) {
      if(this.A) {
         return 90.0F;
      } else {
         net.ne.l var3 = this.o.A();
         float var4 = 70.0F;
         var4 = this.o.T.is;
         if(z9.SU()) {
            var4 *= this.M + (this.v - this.M) * var1;
         }

         boolean var5 = false;
         if(this.o.s5 == null) {
            net.nr.d var6 = this.o.T;
            var5 = net.nr.d.C(this.o.T.i1);
         }

         if(!z9.l) {
            z9.l = true;
            this.o.T.w4 = true;
            this.o.o.KQ = true;
         }

         if(z9.l) {
            var4 /= 4.0F;
         }

         if(var3 instanceof net.ne.a && ((net.ne.a)var3).h() <= 0.0F) {
            float var9 = (float)((net.ne.a)var3).AA + var1;
            var4 /= (1.0F - 500.0F / (var9 + 500.0F)) * 2.0F + 1.0F;
         }

         net.yw.n var10 = h.r(this.o.s8, var3, var1);
         if(var10.n() == net.y1.l.p) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return i6.CC.r()?i6.k(i6.CC, new Object[]{this, var3, var10, Float.valueOf(var1), Float.valueOf(var4)}):var4;
      }
   }

   private void F(float var1) {
      if(!gn.Q.j.d(v3.class).v() || !v3.s.Q()) {
         if(this.o.A() instanceof net.ne.a) {
            net.ne.a var2 = (net.ne.a)this.o.A();
            float var3 = (float)var2.Xl - var1;
            if(var2.h() <= 0.0F) {
               float var4 = (float)var2.AA + var1;
               d.P(380.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            if(var3 < 0.0F) {
               return;
            }

            var3 = var3 / (float)var2.Ax;
            var3 = net.u.t.A(var3 * var3 * var3 * var3 * 3.1415927F);
            float var7 = var2.A1;
            d.P(-var7, 0.0F, 1.0F, 0.0F);
            d.P(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
            d.P(var7, 0.0F, 1.0F, 0.0F);
         }

      }
   }

   private void e(float var1) {
      if(this.o.A() instanceof net.r.r) {
         net.r.r var2 = (net.r.r)this.o.A();
         float var3 = var2.i - var2.hu;
         float var4 = -(var2.i + var3 * var1);
         float var5 = var2.aj + (var2.af - var2.aj) * var1;
         float var6 = var2.Aw + (var2.Ab - var2.Aw) * var1;
         d.O(net.u.t.A(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(net.u.t.m(var4 * 3.1415927F) * var5), 0.0F);
         d.P(net.u.t.A(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         d.P(Math.abs(net.u.t.m(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         d.P(var6, 1.0F, 0.0F, 0.0F);
      }

   }

   public void o(float var1) {
      net.ne.l var2 = this.o.A();
      float var3 = var2.A();
      double var4 = var2.h + (var2.b - var2.h) * (double)var1;
      double var6 = var2.h6 + (var2.hS - var2.h6) * (double)var1 + (double)var3;
      double var8 = var2.l + (var2.hr - var2.l) * (double)var1;
      if(var2 instanceof net.ne.a && ((net.ne.a)var2).L()) {
         var3 = (float)((double)var3 + 1.0D);
         d.O(0.0F, 0.3F, 0.0F);
         if(!this.o.T.V) {
            net.u.j var30 = new net.u.j(var2);
            net.yw.n var11 = this.o.s8.Z(var30);
            net.y9.l var36 = var11.Q();
            if(i6.Mi.r()) {
               i6.Q(i6.Mi, new Object[]{this.o.s8, var30, var11, var2});
            } else if(var36 == net.nb.f.uP) {
               int var39 = ((aq)var11.i(rn.N)).u();
               d.P((float)(var39 * 90), 0.0F, 1.0F, 0.0F);
            }

            d.P(var2.hq + (var2.hN - var2.hq) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            d.P(var2.d + (var2.V - var2.d) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if(this.o.T.wR > 0) {
         this.F += 1.0D * net.nn.j.Y / 200.0D;
         if(this.F >= (double)this.r) {
            this.F = (double)this.r;
         }

         double var10 = gn.Q.j.d(vj.class).v()?(double)vj.f.W():this.F + (this.F - this.F) * (double)var1;
         if(!this.o.T.V) {
            float var12 = var2.hN;
            float var13 = var2.V;
            if(this.o.T.wR == 2) {
               var13 += 180.0F;
            }

            double var14 = (double)(-net.u.t.A(var12 * 0.017453292F) * net.u.t.m(var13 * 0.017453292F)) * var10;
            double var16 = (double)(net.u.t.m(var12 * 0.017453292F) * net.u.t.m(var13 * 0.017453292F)) * var10;
            double var18 = (double)(-net.u.t.A(var13 * 0.017453292F)) * var10;
            int var20 = 0;

            while(true) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 = var21 * 0.1F;
               var22 = var22 * 0.1F;
               var23 = var23 * 0.1F;
               if(!gn.Q.j.d(vj.class).v()) {
                  net.u.m var24 = this.o.s8.d(new net.u.r(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), new net.u.r(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
                  double var25 = var24.z.w(new net.u.r(var4, var6, var8));
                  if(var25 < var10) {
                     var10 = var25;
                  }
               }

               ++var20;
            }
         }

         d.O(0.0F, 0.0F, (float)(-var10));
      } else {
         d.O(0.0F, 0.0F, 0.05F);
      }

      if(i6.MR.Z()) {
         if(!this.o.T.V) {
            float var31 = var2.hq + (var2.hN - var2.hq) * var1 + 180.0F;
            float var34 = var2.d + (var2.V - var2.d) * var1;
            float var37 = 0.0F;
            if(var2 instanceof net.yn.w) {
               net.yn.w var40 = (net.yn.w)var2;
               var31 = var40.AH + (var40.A3 - var40.AH) * var1 + 180.0F;
            }

            net.yw.n var41 = h.r(this.o.s8, var2, var1);
            Object var42 = i6.K(i6.MR, new Object[]{this, var2, var41, Float.valueOf(var1), Float.valueOf(var31), Float.valueOf(var34), Float.valueOf(var37)});
            i6.b(var42);
            var37 = i6.H(var42, i6.ut, new Object[0]);
            var34 = i6.H(var42, i6.u1, new Object[0]);
            var31 = i6.H(var42, i6.B0, new Object[0]);
            d.P(var37, 0.0F, 0.0F, 1.0F);
            d.P(var34, 1.0F, 0.0F, 0.0F);
            d.P(var31, 0.0F, 1.0F, 0.0F);
         }
      } else if(!this.o.T.V) {
         d.P(var2.d + (var2.V - var2.d) * var1, 1.0F, 0.0F, 0.0F);
         if(var2 instanceof net.yn.w) {
            net.yn.w var33 = (net.yn.w)var2;
            d.P(var33.AH + (var33.A3 - var33.AH) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
         } else {
            d.P(var2.hq + (var2.hN - var2.hq) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
         }
      }

      d.O(0.0F, -var3, 0.0F);
      var4 = var2.h + (var2.b - var2.h) * (double)var1;
      var6 = var2.h6 + (var2.hS - var2.h6) * (double)var1 + (double)var3;
      var8 = var2.l + (var2.hr - var2.l) * (double)var1;
      this.p = this.o.o.K(var4, var6, var8, var1);
   }

   public void R(float var1, int var2) {
      this.q = (float)(this.o.T.ij * 16);
      if(z9.S()) {
         this.q *= 0.95F;
      }

      if(z9.h()) {
         this.q *= 0.83F;
      }

      d.G(5889);
      d.s();
      float var10000 = 0.07F;
      if(this.o.T.iW) {
         d.O((float)(-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
      }

      this.mh = this.q * 2.0F;
      if(this.mh < 173.0F) {
         this.mh = 173.0F;
      }

      this.getClass();
      double var9;
      int var8 = (var9 = 1.0D - 1.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
      Project.gluPerspective(this.C(var1, true), (float)this.o.sB / (float)this.o.st, 0.05F, this.mh);
      d.G(5888);
      d.s();
      if(this.o.T.iW) {
         d.O((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.F(var1);
      if(this.o.T.Y) {
         this.e(var1);
      }

      float var4 = this.o.sf.xZ + (this.o.sf.xP - this.o.sf.xZ) * var1;
      if(var4 > 0.0F) {
         byte var5 = 20;
         if(this.o.sf.J(net.nb.b.f)) {
            var5 = 7;
         }

         float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
         var6 = var6 * var6;
         d.P(((float)this.n + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
         d.W(1.0F / var6, 1.0F, 1.0F);
         d.P(-((float)this.n + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
      }

      this.o(var1);
      if(this.A) {
         switch(this.mn) {
         case 0:
            d.P(90.0F, 0.0F, 1.0F, 0.0F);
            break;
         case 1:
            d.P(180.0F, 0.0F, 1.0F, 0.0F);
            break;
         case 2:
            d.P(-90.0F, 0.0F, 1.0F, 0.0F);
            break;
         case 3:
            d.P(90.0F, 1.0F, 0.0F, 0.0F);
            break;
         case 4:
            d.P(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void Q(float var1, int var2) {
      this.e(var1, var2, true, true, false);
   }

   public void e(float var1, int var2, boolean var3, boolean var4, boolean var5) {
      if(!this.A) {
         d.G(5889);
         d.s();
         float var10000 = 0.07F;
         if(this.o.T.iW) {
            d.O((float)(-(var2 * 2 - 1)) * 0.07F, 0.0F, 0.0F);
         }

         if(z9.Q()) {
            oz.nl();
         }

         Project.gluPerspective(this.C(var1, false), (float)this.o.sB / (float)this.o.st, 0.05F, this.q * 2.0F);
         d.G(5888);
         d.s();
         if(this.o.T.iW) {
            d.O((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         boolean var7 = false;
         d.c();
         this.F(var1);
         if(this.o.T.Y) {
            this.e(var1);
         }

         var7 = this.o.A() instanceof net.ne.a && ((net.ne.a)this.o.A()).L();
         boolean var8 = !wl.J(this.o.o, var1, var2);
         if(this.o.T.wR == 0 && !this.o.T.h && !this.o.sE.l()) {
            this.t();
            if(z9.Q()) {
               be.P(this.z, var1, var5);
            } else {
               this.z.Z(var1);
            }

            this.x();
         }

         d.Y();
      }
   }

   public void x() {
      d.t(ui.w);
      d.w();
      d.t(ui.V);
      if(z9.Q()) {
         oz.n();
      }

   }

   public void t() {
      d.t(ui.w);
      d.G(5890);
      d.s();
      float var10000 = 0.00390625F;
      d.W(0.00390625F, 0.00390625F, 0.00390625F);
      d.O(8.0F, 8.0F, 8.0F);
      d.G(5888);
      this.o.n().E(this.I);
      d.t(3553, 10241, 9729);
      d.t(3553, 10240, 9729);
      d.t(3553, 10242, 10496);
      d.t(3553, 10243, 10496);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.S();
      d.t(ui.V);
      if(z9.Q()) {
         oz.V();
      }

   }

   private void I() {
      this.E = (float)((double)this.E + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.E = (float)((double)this.E * 0.9D);
      this.ml += this.E - this.ml;
      this.K = true;
   }

   private void y(float var1) {
      if(this.K) {
         this.o.sl.K("lightTex");
         net.cp.v var2 = this.o.s8;
         if(!z9.v() || !x7.t(var2, this.ml, this.O, this.o.sf.J(net.nb.b.G))) {
            float var3 = var2.F(1.0F);
            float var4 = var3 * 0.95F + 0.05F;
            int var5 = 0;

            while(true) {
               float var6 = var2.F.U()[var5 / 16] * var4;
               float var7 = var2.F.U()[var5 % 16] * (this.ml * 0.1F + 1.5F);
               if(var2.i() > 0) {
                  var6 = var2.F.U()[var5 / 16];
               }

               float var8 = var6 * (var3 * 0.65F + 0.35F);
               float var9 = var6 * (var3 * 0.65F + 0.35F);
               float var10 = var7 * ((var7 * 0.6F + 0.4F) * 0.6F + 0.4F);
               float var11 = var7 * (var7 * var7 * 0.6F + 0.4F);
               float var12 = var8 + var7;
               float var13 = var9 + var10;
               float var14 = var6 + var11;
               var12 = var12 * 0.96F + 0.03F;
               var13 = var13 * 0.96F + 0.03F;
               var14 = var14 * 0.96F + 0.03F;
               if(this.t > 0.0F) {
                  float var15 = this.mx + (this.t - this.mx) * var1;
                  var12 = var12 * (1.0F - var15) + var12 * 0.7F * var15;
                  var13 = var13 * (1.0F - var15) + var13 * 0.6F * var15;
                  var14 = var14 * (1.0F - var15) + var14 * 0.6F * var15;
               }

               if(var2.F.L().M() == 1) {
                  var12 = 0.22F + var7 * 0.75F;
                  var13 = 0.28F + var10 * 0.75F;
                  var14 = 0.25F + var11 * 0.75F;
               }

               if(i6.r.r()) {
                  float[] var35 = new float[]{var12, var13, var14};
                  i6.b(var2.F, i6.r, new Object[]{Float.valueOf(var1), Float.valueOf(var3), Float.valueOf(var6), Float.valueOf(var7), var35});
                  var12 = var35[0];
                  var13 = var35[1];
                  var14 = var35[2];
               }

               var12 = net.u.t.T(var12, 0.0F, 1.0F);
               var13 = net.u.t.T(var13, 0.0F, 1.0F);
               var14 = net.u.t.T(var14, 0.0F, 1.0F);
               if(this.o.sf.J(net.nb.b.G)) {
                  float var36 = this.r(this.o.sf, var1);
                  float var16 = 1.0F / var12;
                  if(var16 > 1.0F / var13) {
                     var16 = 1.0F / var13;
                  }

                  if(var16 > 1.0F / var14) {
                     var16 = 1.0F / var14;
                  }

                  var12 = var12 * (1.0F - var36) + var12 * var16 * var36;
                  var13 = var13 * (1.0F - var36) + var13 * var16 * var36;
                  var14 = var14 * (1.0F - var36) + var14 * var16 * var36;
               }

               if(var12 > 1.0F) {
                  var12 = 1.0F;
               }

               if(var13 > 1.0F) {
                  var13 = 1.0F;
               }

               if(var14 > 1.0F) {
                  var14 = 1.0F;
               }

               float var37 = this.o.T.i2;
               float var38 = 1.0F - var12;
               float var17 = 1.0F - var13;
               float var18 = 1.0F - var14;
               var38 = 1.0F - var38 * var38 * var38 * var38;
               var17 = 1.0F - var17 * var17 * var17 * var17;
               var18 = 1.0F - var18 * var18 * var18 * var18;
               var12 = var12 * (1.0F - var37) + var38 * var37;
               var13 = var13 * (1.0F - var37) + var17 * var37;
               var14 = var14 * (1.0F - var37) + var18 * var37;
               var12 = var12 * 0.96F + 0.03F;
               var13 = var13 * 0.96F + 0.03F;
               var14 = var14 * 0.96F + 0.03F;
               if(var12 > 1.0F) {
                  var12 = 1.0F;
               }

               if(var13 > 1.0F) {
                  var13 = 1.0F;
               }

               if(var14 > 1.0F) {
                  var14 = 1.0F;
               }

               if(var12 < 0.0F) {
                  var12 = 0.0F;
               }

               if(var13 < 0.0F) {
                  var13 = 0.0F;
               }

               if(var14 < 0.0F) {
                  var14 = 0.0F;
               }

               boolean var10000 = true;
               int var20 = (int)(var12 * 255.0F);
               int var21 = (int)(var13 * 255.0F);
               int var22 = (int)(var14 * 255.0F);
               this.O[var5] = -16777216 | var20 << 16 | var21 << 8 | var22;
               ++var5;
            }
         }

         this.u.g();
         this.K = false;
         this.o.sl.N();
      }
   }

   public float r(net.ne.a var1, float var2) {
      int var3 = var1.b(net.nb.b.G).S();
      return var3 > 200?1.0F:0.7F + net.u.t.A(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
   }

   public void p(float var1, long var2) {
      this.G();
      boolean var4 = Display.isActive();
      if(this.o.T.iu && (!this.o.T.iI || !Mouse.isButtonDown(1))) {
         if(net.nn.j.E() - this.N > 500L) {
            this.o.z();
         }
      } else {
         this.N = net.nn.j.E();
      }

      this.o.sl.K("mouse");
      if(net.nn.j.I && this.o.sr && !Mouse.isInsideWindow()) {
         Mouse.setGrabbed(false);
         Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2 - 20);
         Mouse.setGrabbed(true);
      }

      if(this.o.sr) {
         this.o.k.L();
         this.o.K().m(this.o.k);
         float var5 = this.o.T.tM * 0.6F + 0.2F;
         float var6 = var5 * var5 * var5 * 8.0F;
         float var7 = (float)this.o.k.c * var6;
         float var8 = (float)this.o.k.Q * var6;
         byte var9 = 1;
         if(this.o.T.iX) {
            var9 = -1;
         }

         if(this.o.T.w4) {
            this.mY += var7;
            this.mK += var8;
            float var10 = var1 - this.Q;
            this.Q = var1;
            var7 = this.D * var10;
            var8 = this.S * var10;
            this.o.sf.e(var7, var8 * (float)var9);
         } else {
            this.mY = 0.0F;
            this.mK = 0.0F;
            this.o.sf.e(var7, var8 * (float)var9);
         }
      }

      this.o.sl.N();
      if(!this.o.V) {
         mZ = this.o.T.iW;
         net.z.t var16 = new net.z.t(this.o);
         int var18 = var16.u();
         int var20 = var16.v();
         int var22 = Mouse.getX() * var18 / this.o.sB;
         int var23 = var20 - Mouse.getY() * var20 / this.o.st - 1;
         int var24 = this.o.T.B;
         if(this.o.s8 == null) {
            d.j(0, 0, this.o.sB, this.o.st);
            d.G(5889);
            d.s();
            d.G(5888);
            d.s();
            this.u();
            this.x = System.nanoTime();
            net.c5.g.E.c = this.o.n();
            net.c5.g.E.Q = this.o.sO;
         } else {
            this.o.sl.K("level");
            int var11 = Math.min(net.nn.j.w(), var24);
            var11 = Math.max(var11, 60);
            long var12 = System.nanoTime() - var2;
            long var14 = Math.max((long)(1000000000 / var11 / 4) - var12, 0L);
            this.U(var1, System.nanoTime() + var14);
            if(this.o.T() && this.e < net.nn.j.E() - 1000L) {
               this.e = net.nn.j.E();
               if(!this.o.V().g()) {
                  this.J();
               }
            }

            if(ui.H) {
               this.o.o.Z();
               if(this.mr != null && this.T) {
                  d.G(5890);
                  d.c();
                  d.s();
                  this.mr.C(var1);
                  d.Y();
               }

               this.o.O().U(true);
            }

            this.x = System.nanoTime();
            this.o.sl.F("gui");
            if(!this.o.T.h || this.o.s5 != null) {
               d.d(516, 0.1F);
               this.u();
               this.M(var18, var20, var1);
               this.o.y.j(var1);
               if(this.o.T.l && !this.o.T.wt) {
                  z9.P();
               }

               if(this.o.T.wt) {
                  u_.L(var16);
               }
            }

            this.o.sl.N();
         }

         if(this.o.s5 != null) {
            d.y(256);
            if(i6.Mr.r()) {
               i6.Q(i6.Mr, new Object[]{this.o.s5, Integer.valueOf(var22), Integer.valueOf(var23), Float.valueOf(this.o.P())});
            } else {
               this.o.s5.v(var22, var23, this.o.P());
            }
         }
      }

      net.z.t var17 = new net.z.t(this.o);
      pi.z(var17);
      this.h();
      this.Y();
      u_.Q();
      if(this.o.T.ih) {
         this.o.T.iU = true;
      }

   }

   private void J() {
      if(this.o.o.b() > 10 && this.o.o.O() && !this.o.V().g()) {
         BufferedImage var1 = av.R(this.o.sB, this.o.st, this.o.O());
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int var4 = 0;
         int var5 = 0;
         if(var2 > var3) {
            var4 = (var2 - var3) / 2;
            var2 = var3;
         } else {
            var5 = (var3 - var2) / 2;
         }

         BufferedImage var6 = new BufferedImage(64, 64, 1);
         Graphics2D var7 = var6.createGraphics();
         var7.drawImage(var1, 0, 0, 64, 64, var4, var5, var4 + var2, var5 + var2, (ImageObserver)null);
         var7.dispose();
         ImageIO.write(var6, "png", this.o.V().u());
      }

   }

   public void Y(float var1) {
      this.u();
   }

   private boolean n() {
      this.getClass();
      net.ne.l var1 = this.o.A();
      boolean var2 = var1 instanceof net.r.r && !this.o.T.h;
      if(!((net.r.r)var1).a6.s) {
         ks var3 = ((net.r.r)var1).S();
         if(this.o.H != null && this.o.H.v == net.u.m.BLOCK) {
            net.u.j var4 = this.o.H.j();
            net.yw.n var5 = this.o.s8.Z(var4);
            net.y9.l var6 = var5.Q();
            if(this.o.sE.O() == o9.SPECTATOR) {
               var2 = wl.A(var5) && this.o.s8.L(var4) instanceof z1;
            } else {
               var2 = !var3.B() && (var3.q(var6) || var3.Z(var6));
            }
         }
      }

      return var2;
   }

   public void U(float var1, long var2) {
      this.y(var1);
      if(this.o.A() == null) {
         this.o.w((net.ne.l)this.o.sf);
      }

      this.K(var1);
      if(z9.Q()) {
         oz.p(this.o, var1, var2);
      }

      d.B();
      d.m();
      d.d(516, 0.1F);
      this.o.sl.K("center");
      if(this.o.T.iW) {
         mS = 0;
         d.q(false, true, true, false);
         this.V(0, var1, var2);
         mS = 1;
         d.q(true, false, false, false);
         this.V(1, var1, var2);
         d.q(true, true, true, false);
      } else {
         this.V(2, var1, var2);
      }

      this.o.sl.N();
   }

   private void V(int var1, float var2, long var3) {
      p.S();
      boolean var6 = z9.Q();
      if(var6) {
         oz.Y(var1, var2, var3);
      }

      u var7 = this.o.o;
      c7 var8 = this.o.sv;
      boolean var9 = this.n();
      d.a();
      this.o.sl.F("clear");
      if(var6) {
         oz.g(0, 0, this.o.sB, this.o.st);
      }

      d.j(0, 0, this.o.sB, this.o.st);
      this.m(var2);
      d.y(16640);
      if(var6) {
         oz.f();
      }

      this.o.sl.F("camera");
      this.R(var2, var1);
      if(var6) {
         oz.k(var2);
      }

      h.k(this.o.sf, this.o.T.wR == 2);
      this.o.sl.F("frustum");
      net.cy.b var10 = net.cy.p.K();
      this.o.sl.F("culling");
      net.cy.n var11 = new net.cy.n(var10);
      net.ne.l var12 = this.o.A();
      double var13 = var12.hL + (var12.b - var12.hL) * (double)var2;
      double var15 = var12.F + (var12.hS - var12.F) * (double)var2;
      double var17 = var12.A + (var12.hr - var12.A) * (double)var2;
      be.V(var11, var13, var15, var17);
      var11.o(var13, var15, var17);
      if((z9.SF() || z9.SV() || z9.SR()) && !oz.Hr) {
         this.k(-1, var2);
         this.o.sl.F("sky");
         d.G(5889);
         d.s();
         Project.gluPerspective(this.C(var2, true), (float)this.o.sB / (float)this.o.st, 0.05F, this.mh);
         d.G(5888);
         if(var6) {
            oz.c();
         }

         var7.z(var2, var1);
         if(var6) {
            oz.T();
         }

         d.G(5889);
         d.s();
         Project.gluPerspective(this.C(var2, true), (float)this.o.sB / (float)this.o.st, 0.05F, this.mh);
         d.G(5888);
      }

      d.E();
      this.k(0, var2);
      d.Q(7425);
      if(Double.compare(var12.hS + (double)var12.A(), 128.0D + (double)(this.o.T.wH * 128.0F)) < 0) {
         this.k(var7, var2, var1, var13, var15, var17);
      }

      this.o.sl.F("prepareterrain");
      this.k(0, var2);
      this.o.n().E(net.n9.b.N);
      u1.m();
      this.o.sl.F("terrain_setup");
      this.e(var12, var2, var11, this.o.sf.VX());
      if(var6) {
         be.E(var7, var12, (double)var2, var11, this.Z++, this.o.sf.VX() && gn.Q.j.d(vz.class).v());
      }

      var7.F(var12, (double)var2, var11, this.Z++, this.o.sf.VX() && gn.Q.j.d(vz.class).v());
      if(var1 == 0 || var1 == 2) {
         this.o.sl.F("updatechunks");
         u_.I.G();
         this.o.o.E(var3);
         u_.I.C();
      }

      this.o.sl.F("terrain");
      u_.W.G();
      if(this.o.T.u && var1 > 0) {
         this.o.sl.F("finish");
         GL11.glFinish();
         this.o.sl.F("terrain");
      }

      d.G(5888);
      d.c();
      d.d();
      if(var6) {
         be.p();
      }

      var7.Z(ac.SOLID, (double)var2, var1, var12);
      d.m();
      if(var6) {
         be.n();
      }

      var7.Z(ac.CUTOUT_MIPPED, (double)var2, var1, var12);
      this.o.n().m(net.n9.b.N).s(false, false);
      if(var6) {
         be.U();
      }

      var7.Z(ac.CUTOUT, (double)var2, var1, var12);
      this.o.n().m(net.n9.b.N).f();
      if(var6) {
         be.b();
      }

      u_.W.C();
      d.Q(7424);
      d.d(516, 0.1F);
      if(!this.A) {
         d.G(5888);
         d.Y();
         d.c();
         u1.B();
         this.o.sl.F("entities");
         if(i6.Ct.r()) {
            i6.Q(i6.Ct, new Object[]{Integer.valueOf(0)});
         }

         var7.U(var12, var11, var2);
         if(i6.Ct.r()) {
            i6.Q(i6.Ct, new Object[]{Integer.valueOf(-1)});
         }

         u1.m();
         this.x();
      }

      d.G(5888);
      d.Y();
      if(var9 && this.o.H != null && !var12.A(net.y1.l.p)) {
         net.r.r var19 = (net.r.r)var12;
         d.d();
         this.o.sl.F("outline");
         if(!i6.M2.r() || !i6.G(i6.M2, new Object[]{var7, var19, this.o.H, Integer.valueOf(0), Float.valueOf(var2)})) {
            var7.J(var19, this.o.H, 0, var2);
         }

         d.m();
      }

      if(this.o.sM.D()) {
         boolean var20 = d.y();
         d.V();
         this.o.sM.d(var2, var3);
         d.D(var20);
      }

      if(!var7.x.isEmpty()) {
         this.o.sl.F("destroyProgress");
         d.C();
         d.e(d.l.SRC_ALPHA, d.k.ONE, d.l.ONE, d.k.ZERO);
         this.o.n().m(net.n9.b.N).s(false, false);
         var7.z(r.f(), r.f().k(), var12, var2);
         this.o.n().m(net.n9.b.N).f();
         d.E();
      }

      d.G(770, 771, 1, 0);
      d.E();
      if(!this.A) {
         this.t();
         this.o.sl.F("litParticles");
         if(var6) {
            oz.D();
         }

         var8.c(var12, var2);
         u1.m();
         this.k(0, var2);
         this.o.sl.F("particles");
         if(var6) {
            oz.X();
         }

         var8.W(var12, var2);
         if(var6) {
            oz.A();
         }

         this.x();
      }

      d.Y(false);
      d.a();
      this.o.sl.F("weather");
      if(var6) {
         oz.i();
      }

      this.D(var2);
      if(var6) {
         oz.d();
      }

      d.Y(true);
      var7.T(var12, var2);
      if(var6) {
         be.v(this, var2, var1);
         oz.nr();
      }

      d.E();
      d.a();
      d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
      d.d(516, 0.1F);
      this.k(0, var2);
      d.C();
      d.Y(false);
      this.o.n().E(net.n9.b.N);
      d.Q(7425);
      this.o.sl.F("translucent");
      if(var6) {
         oz.G();
      }

      var7.Z(ac.TRANSLUCENT, (double)var2, var1, var12);
      if(var6) {
         oz.R();
      }

      if(i6.Ct.r() && !this.A) {
         u1.B();
         this.o.sl.F("entities");
         i6.Q(i6.Ct, new Object[]{Integer.valueOf(1)});
         this.o.o.U(var12, var11, var2);
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         i6.Q(i6.Ct, new Object[]{Integer.valueOf(-1)});
         u1.m();
      }

      d.Q(7424);
      d.Y(true);
      d.a();
      d.E();
      d.V();
      if(Double.compare(var12.hS + (double)var12.A(), 128.0D + (double)(this.o.T.wH * 128.0F)) >= 0) {
         this.o.sl.F("aboveClouds");
         this.k(var7, var2, var1, var13, var15, var17);
      }

      if(i6.V.r()) {
         this.o.sl.F("forge_render_last");
         i6.Q(i6.V, new Object[]{var7, Float.valueOf(var2)});
      }

      ue var21 = new ue(var2);
      _x.m(var21);
      this.o.sl.F("hand");
      this.getClass();
      if(!oz.Hr) {
         if(var6) {
            be.Z(this, var2, var1);
            oz.q();
         }

         d.y(256);
         if(var6) {
            be.V(this, var2, var1);
         }

         this.Q(var2, var1);
      }

      if(var6) {
         oz.C();
      }

   }

   private void k(u var1, float var2, int var3, double var4, double var6, double var8) {
      if(this.o.T.ij >= 4 && !z9.S0() && oz.H(this.o.T)) {
         this.o.sl.F("clouds");
         d.G(5889);
         d.s();
         Project.gluPerspective(this.C(var2, true), (float)this.o.sB / (float)this.o.st, 0.05F, this.mh * 4.0F);
         d.G(5888);
         d.c();
         this.k(0, var2);
         var1.U(var2, var3, var4, var6, var8);
         d.V();
         d.Y();
         d.G(5889);
         d.s();
         Project.gluPerspective(this.C(var2, true), (float)this.o.sB / (float)this.o.st, 0.05F, this.mh);
         d.G(5888);
      }

   }

   private void a() {
      float var1 = this.o.s8.u(1.0F);
      if(!z9.T()) {
         var1 /= 2.0F;
      }

      if(var1 != 0.0F && z9.P()) {
         this.j.setSeed((long)this.n * 312987231L);
         net.ne.l var2 = this.o.A();
         net.cp.v var3 = this.o.s8;
         net.u.j var4 = new net.u.j(var2);
         boolean var10000 = true;
         double var6 = 0.0D;
         double var8 = 0.0D;
         double var10 = 0.0D;
         int var12 = 0;
         int var13 = (int)(100.0F * var1 * var1);
         if(this.o.T.wQ == 1) {
            var13 >>= 1;
         } else if(this.o.T.wQ == 2) {
            var13 = 0;
         }

         for(int var14 = 0; var14 < var13; ++var14) {
            net.u.j var15 = var3.d(var4.F(this.j.nextInt(10) - this.j.nextInt(10), 0, this.j.nextInt(10) - this.j.nextInt(10)));
            net.ns.i var16 = var3.P(var15);
            net.u.j var17 = var15.b();
            net.yw.n var18 = var3.Z(var17);
            if(var15.h() <= var4.h() + 10 && var15.h() >= var4.h() - 10 && var16.D() && var16.D(var15) >= 0.15F) {
               double var19 = this.j.nextDouble();
               double var21 = this.j.nextDouble();
               net.u.e var23 = var18.q(var3, var17);
               if(var18.n() != net.y1.l.U && var18.Q() != net.nb.f.U) {
                  if(var18.n() != net.y1.l.q) {
                     ++var12;
                     if(this.j.nextInt(var12) == 0) {
                        var6 = (double)var17.t() + var19;
                        var8 = (double)((float)var17.h() + 0.1F) + var23.c - 1.0D;
                        var10 = (double)var17.y() + var21;
                     }

                     this.o.s8.n(ai.WATER_DROP, (double)var17.t() + var19, (double)((float)var17.h() + 0.1F) + var23.c, (double)var17.y() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
                  }
               } else {
                  this.o.s8.n(ai.SMOKE_NORMAL, (double)var15.t() + var19, (double)((float)var15.h() + 0.1F) - var23.u, (double)var15.y() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
               }
            }
         }

         if(this.j.nextInt(3) < this.s++) {
            this.s = 0;
            if(var8 > (double)(var4.h() + 1) && var3.d(var4).h() > net.u.t.M((float)var4.h())) {
               this.o.s8.m(var6, var8, var10, net.nb.l.wu, net.yz.p.WEATHER, 0.1F, 0.5F, false);
            } else {
               this.o.s8.m(var6, var8, var10, net.nb.l.Kg, net.yz.p.WEATHER, 0.2F, 1.0F, false);
            }
         }
      }

   }

   protected void D(float var1) {
      if(i6.Bw.r()) {
         net.yv.c var49 = this.o.s8.F;
         Object var50 = i6.b(var49, i6.Bw, new Object[0]);
         i6.F(var50, i6.MV, new Object[]{Float.valueOf(var1), this.o.s8, this.o});
      } else {
         float var2 = this.o.s8.u(var1);
         if(var2 > 0.0F) {
            if(z9.c()) {
               return;
            }

            this.t();
            net.ne.l var3 = this.o.A();
            net.cp.v var4 = this.o.s8;
            int var5 = net.u.t.L(var3.b);
            int var6 = net.u.t.L(var3.hS);
            int var7 = net.u.t.L(var3.hr);
            r var8 = r.f();
            p var9 = var8.k();
            d.j();
            d.b(0.0F, 1.0F, 0.0F);
            d.C();
            d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
            d.d(516, 0.1F);
            double var10 = var3.hL + (var3.b - var3.hL) * (double)var1;
            double var12 = var3.F + (var3.hS - var3.F) * (double)var1;
            double var14 = var3.A + (var3.hr - var3.A) * (double)var1;
            int var16 = net.u.t.L(var12);
            byte var17 = 5;
            if(z9.T()) {
               var17 = 10;
            }

            boolean var18 = true;
            float var19 = (float)this.n + var1;
            var9.S(-var10, -var12, -var14);
            d.T(1.0F, 1.0F, 1.0F, 1.0F);
            net.u.j var20 = new net.u.j();

            for(int var21 = var7 - var17; var21 <= var7 + var17; ++var21) {
               for(int var22 = var5 - var17; var22 <= var5 + var17; ++var22) {
                  int var23 = (var21 - var7 + 16) * 32 + var22 - var5 + 16;
                  double var24 = (double)this.J[var23] * 0.5D;
                  double var26 = (double)this.V[var23] * 0.5D;
                  var20.V(var22, 0, var21);
                  net.ns.i var28 = var4.P(var20);
                  if(var28.D() || var28.r()) {
                     int var29 = var4.d((net.u.j)var20).h();
                     int var30 = var6 - var17;
                     int var31 = var6 + var17;
                     if(var30 < var29) {
                        var30 = var29;
                     }

                     if(var31 < var29) {
                        var31 = var29;
                     }

                     int var32 = var29;
                     if(var29 < var16) {
                        var32 = var16;
                     }

                     if(var30 != var31) {
                        this.j.setSeed((long)(var22 * var22 * 3121 + var22 * 45238971 ^ var21 * var21 * 418711 + var21 * 13761));
                        var20.V(var22, var30, var21);
                        float var33 = var28.D(var20);
                        if(var4.V().H(var33, var29) >= 0.15F) {
                           var8.p();
                           var18 = false;
                           this.o.n().E(b);
                           var9.m(7, net.y8.x.W);
                           double var34 = -((double)(this.n + var22 * var22 * 3121 + var22 * 45238971 + var21 * var21 * 418711 + var21 * 13761 & 31) + (double)var1) / 32.0D * (3.0D + this.j.nextDouble());
                           double var36 = (double)((float)var22 + 0.5F) - var3.b;
                           double var38 = (double)((float)var21 + 0.5F) - var3.hr;
                           float var40 = net.u.t.R(var36 * var36 + var38 * var38) / (float)var17;
                           float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var2;
                           var20.V(var22, var32, var21);
                           int var42 = var4.z(var20, 0);
                           int var43 = var42 >> 16 & '\uffff';
                           int var44 = var42 & '\uffff';
                           var9.H((double)var22 - var24 + 0.5D, (double)var31, (double)var21 - var26 + 0.5D).Y(0.0D, (double)var30 * 0.25D + var34).m(1.0F, 1.0F, 1.0F, var41).C(var43, var44).W();
                           var9.H((double)var22 + var24 + 0.5D, (double)var31, (double)var21 + var26 + 0.5D).Y(1.0D, (double)var30 * 0.25D + var34).m(1.0F, 1.0F, 1.0F, var41).C(var43, var44).W();
                           var9.H((double)var22 + var24 + 0.5D, (double)var30, (double)var21 + var26 + 0.5D).Y(1.0D, (double)var31 * 0.25D + var34).m(1.0F, 1.0F, 1.0F, var41).C(var43, var44).W();
                           var9.H((double)var22 - var24 + 0.5D, (double)var30, (double)var21 - var26 + 0.5D).Y(0.0D, (double)var31 * 0.25D + var34).m(1.0F, 1.0F, 1.0F, var41).C(var43, var44).W();
                        } else {
                           var8.p();
                           var18 = true;
                           this.o.n().E(w);
                           var9.m(7, net.y8.x.W);
                           double var53 = (double)(-((float)(this.n & 511) + var1) / 512.0F);
                           double var54 = this.j.nextDouble() + (double)var19 * 0.01D * (double)((float)this.j.nextGaussian());
                           double var55 = this.j.nextDouble() + (double)(var19 * (float)this.j.nextGaussian()) * 0.001D;
                           double var56 = (double)((float)var22 + 0.5F) - var3.b;
                           double var57 = (double)((float)var21 + 0.5F) - var3.hr;
                           float var58 = net.u.t.R(var56 * var56 + var57 * var57) / (float)var17;
                           float var45 = ((1.0F - var58 * var58) * 0.3F + 0.5F) * var2;
                           var20.V(var22, var32, var21);
                           int var46 = (var4.z(var20, 0) * 3 + 15728880) / 4;
                           int var47 = var46 >> 16 & '\uffff';
                           int var48 = var46 & '\uffff';
                           var9.H((double)var22 - var24 + 0.5D, (double)var31, (double)var21 - var26 + 0.5D).Y(0.0D + var54, (double)var30 * 0.25D + var53 + var55).m(1.0F, 1.0F, 1.0F, var45).C(var47, var48).W();
                           var9.H((double)var22 + var24 + 0.5D, (double)var31, (double)var21 + var26 + 0.5D).Y(1.0D + var54, (double)var30 * 0.25D + var53 + var55).m(1.0F, 1.0F, 1.0F, var45).C(var47, var48).W();
                           var9.H((double)var22 + var24 + 0.5D, (double)var30, (double)var21 + var26 + 0.5D).Y(1.0D + var54, (double)var31 * 0.25D + var53 + var55).m(1.0F, 1.0F, 1.0F, var45).C(var47, var48).W();
                           var9.H((double)var22 - var24 + 0.5D, (double)var30, (double)var21 - var26 + 0.5D).Y(0.0D + var54, (double)var31 * 0.25D + var53 + var55).m(1.0F, 1.0F, 1.0F, var45).C(var47, var48).W();
                        }
                     }
                  }
               }
            }

            var8.p();
            var9.S(0.0D, 0.0D, 0.0D);
            d.a();
            d.E();
            d.d(516, 0.1F);
            this.x();
         }

      }
   }

   public void u() {
      net.z.t var1 = new net.z.t(this.o);
      d.y(256);
      d.G(5889);
      d.s();
      d.g(0.0D, var1.q(), var1.c(), 0.0D, 1000.0D, 3000.0D);
      d.G(5888);
      d.s();
      d.O(0.0F, 0.0F, -2000.0F);
   }

   private void m(float var1) {
      net.cp.v var2 = this.o.s8;
      net.ne.l var3 = this.o.A();
      float var4 = 0.25F + 0.75F * (float)this.o.T.ij / 32.0F;
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      net.u.r var5 = var2.h(this.o.A(), var1);
      var5 = x7.X(var5, var2, this.o.A(), var1);
      float var6 = (float)var5.p;
      float var7 = (float)var5.H;
      float var8 = (float)var5.a;
      net.u.r var9 = var2.o(var1);
      var9 = x7.W(var9, var2, this.o.A(), var1);
      this.d = (float)var9.p;
      this.i = (float)var9.H;
      this.m1 = (float)var9.a;
      if(this.o.T.ij >= 4) {
         double var10 = net.u.t.A(var2.C(var1)) > 0.0F?-1.0D:1.0D;
         net.u.r var12 = new net.u.r(var10, 0.0D, 0.0D);
         float var13 = (float)var3.r(var1).d(var12);
         if(var13 < 0.0F) {
            var13 = 0.0F;
         }

         if(var13 > 0.0F) {
            float[] var14 = var2.F.F(var2.H(var1), var1);
            var13 = var13 * var14[3];
            this.d = this.d * (1.0F - var13) + var14[0] * var13;
            this.i = this.i * (1.0F - var13) + var14[1] * var13;
            this.m1 = this.m1 * (1.0F - var13) + var14[2] * var13;
         }
      }

      this.d += (var6 - this.d) * var4;
      this.i += (var7 - this.i) * var4;
      this.m1 += (var8 - this.m1) * var4;
      float var22 = var2.u(var1);
      if(var22 > 0.0F) {
         float var11 = 1.0F - var22 * 0.5F;
         float var24 = 1.0F - var22 * 0.4F;
         this.d *= var11;
         this.i *= var11;
         this.m1 *= var24;
      }

      float var23 = var2.w(var1);
      if(var23 > 0.0F) {
         float var25 = 1.0F - var23 * 0.5F;
         this.d *= var25;
         this.i *= var25;
         this.m1 *= var25;
      }

      net.yw.n var26 = h.r(this.o.s8, var3, var1);
      if(this.p) {
         net.u.r var28 = var2.v(var1);
         this.d = (float)var28.p;
         this.i = (float)var28.H;
         this.m1 = (float)var28.a;
      } else if(i6.ue.r()) {
         net.u.r var29 = h.D(var3, (double)var1);
         net.u.j var33 = new net.u.j(var29);
         net.yw.n var15 = this.o.s8.Z(var33);
         net.u.r var16 = (net.u.r)i6.b(var15.Q(), i6.ue, new Object[]{this.o.s8, var33, var15, var3, new net.u.r((double)this.d, (double)this.i, (double)this.m1), Float.valueOf(var1)});
         this.d = (float)var16.p;
         this.i = (float)var16.H;
         this.m1 = (float)var16.a;
      } else if(var26.n() == net.y1.l.p) {
         float var30 = 0.0F;
         if(var3 instanceof net.ne.a) {
            var30 = (float)net.c1.y.V((net.ne.a)var3) * 0.2F;
            if(((net.ne.a)var3).J(net.nb.b.x)) {
               var30 = var30 * 0.3F + 0.6F;
            }
         }

         this.d = 0.02F + var30;
         this.i = 0.02F + var30;
         this.m1 = 0.2F + var30;
         net.u.r var34 = x7.I(this.o.s8, this.o.A().b, this.o.A().hS + 1.0D, this.o.A().hr);
         this.d = (float)var34.p;
         this.i = (float)var34.H;
         this.m1 = (float)var34.a;
      } else if(var26.n() == net.y1.l.U) {
         this.d = 0.6F;
         this.i = 0.1F;
         this.m1 = 0.0F;
         net.u.r var31 = x7.u(this.o.s8, this.o.A().b, this.o.A().hS + 1.0D, this.o.A().hr);
         this.d = (float)var31.p;
         this.i = (float)var31.H;
         this.m1 = (float)var31.a;
      }

      float var32 = this.f + (this.P - this.f) * var1;
      this.d *= var32;
      this.i *= var32;
      this.m1 *= var32;
      double var35 = (var3.F + (var3.hS - var3.F) * (double)var1) * var2.F.i();
      if(var3 instanceof net.ne.a && ((net.ne.a)var3).J(net.nb.b.T)) {
         int var37 = ((net.n_.i)Objects.requireNonNull(((net.ne.a)var3).b(net.nb.b.T))).S();
         if(var37 < 20) {
            var35 *= (double)(1.0F - (float)var37 / 20.0F);
         } else {
            var35 = 0.0D;
         }
      }

      if(var35 < 1.0D) {
         if(var35 < 0.0D) {
            var35 = 0.0D;
         }

         var35 = var35 * var35;
         this.d = (float)((double)this.d * var35);
         this.i = (float)((double)this.i * var35);
         this.m1 = (float)((double)this.m1 * var35);
      }

      if(this.t > 0.0F) {
         float var38 = this.mx + (this.t - this.mx) * var1;
         this.d = this.d * (1.0F - var38) + this.d * 0.7F * var38;
         this.i = this.i * (1.0F - var38) + this.i * 0.6F * var38;
         this.m1 = this.m1 * (1.0F - var38) + this.m1 * 0.6F * var38;
      }

      if(var3 instanceof net.ne.a && ((net.ne.a)var3).J(net.nb.b.G)) {
         float var39 = this.r((net.ne.a)var3, var1);
         float var17 = 1.0F / this.d;
         if(var17 > 1.0F / this.i) {
            var17 = 1.0F / this.i;
         }

         if(var17 > 1.0F / this.m1) {
            var17 = 1.0F / this.m1;
         }

         this.d = this.d * (1.0F - var39) + this.d * var17 * var39;
         this.i = this.i * (1.0F - var39) + this.i * var17 * var39;
         this.m1 = this.m1 * (1.0F - var39) + this.m1 * var17 * var39;
      }

      if(this.o.T.iW) {
         float var40 = (this.d * 30.0F + this.i * 59.0F + this.m1 * 11.0F) / 100.0F;
         float var42 = (this.d * 30.0F + this.i * 70.0F) / 100.0F;
         float var18 = (this.d * 30.0F + this.m1 * 70.0F) / 100.0F;
         this.d = var40;
         this.i = var42;
         this.m1 = var18;
      }

      ii var41 = new ii(this, var3, var26, (double)var1, this.d, this.i, this.m1);
      _x.m(var41);
      this.d = var41.j();
      this.i = var41.S();
      this.m1 = var41.d();
      d.O(this.d, this.i, this.m1, 0.0F);
      if(i6.Ue.Z()) {
         Object var43 = i6.K(i6.Ue, new Object[]{this, var3, var26, Float.valueOf(var1), Float.valueOf(this.d), Float.valueOf(this.i), Float.valueOf(this.m1)});
         i6.b(var43);
         this.d = i6.H(var43, i6.ug, new Object[0]);
         this.i = i6.H(var43, i6.U8, new Object[0]);
         this.m1 = i6.H(var43, i6.CY, new Object[0]);
      }

      oz.k(this.d, this.i, this.m1, 0.0F);
   }

   private void k(int var1, float var2) {
      this.a = false;
      net.ne.l var3 = this.o.A();
      this.I(false);
      d.b(0.0F, -1.0F, 0.0F);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.yw.n var4 = h.r(this.o.s8, var3, var2);
      float var5 = -1.0F;
      if(i6.e.r()) {
         var5 = i6.k(i6.e, new Object[]{this, var3, var4, Float.valueOf(var2), Float.valueOf(0.1F)});
      }

      float var9;
      int var10000 = (var9 = var5 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      if(var3 instanceof net.ne.a && ((net.ne.a)var3).J(net.nb.b.T)) {
         float var8 = 5.0F;
         int var7 = ((net.ne.a)var3).b(net.nb.b.T).S();
         if(var7 < 20) {
            var8 = 5.0F + (this.q - 5.0F) * (1.0F - (float)var7 / 20.0F);
         }

         if(z9.Q()) {
            oz.o(d.j.LINEAR);
         } else {
            d.G(d.j.LINEAR);
         }

         if(var1 == -1) {
            d.m(0.0F);
            d.G(var8 * 0.8F);
         } else {
            d.m(var8 * 0.25F);
            d.G(var8);
         }

         if(GLContext.getCapabilities().GL_NV_fog_distance && z9.S()) {
            d.i('蕚', '蕛');
         }
      } else if(this.p) {
         if(z9.Q()) {
            oz.o(d.j.EXP);
         } else {
            d.G(d.j.EXP);
         }

         d.x(0.1F);
      } else if(var4.n() == net.y1.l.p) {
         if(!gn.Q.j.d(v3.class).v() || !v3.U.Q()) {
            if(z9.Q()) {
               oz.o(d.j.EXP);
            } else {
               d.G(d.j.EXP);
            }
         }

         if(var3 instanceof net.ne.a) {
            if(((net.ne.a)var3).J(net.nb.b.x)) {
               d.x(0.01F);
            } else {
               d.x(0.1F - (float)net.c1.y.V((net.ne.a)var3) * 0.03F);
            }
         } else {
            d.x(0.1F);
         }

         if(z9.i()) {
            d.x(0.02F);
         }
      } else if(var4.n() == net.y1.l.U) {
         if(!gn.Q.j.d(v3.class).v() || !v3.U.Q()) {
            if(z9.Q()) {
               oz.o(d.j.EXP);
            } else {
               d.G(d.j.EXP);
            }
         }

         d.x(2.0F);
      } else {
         float var6 = this.q;
         this.a = true;
         if(z9.Q()) {
            oz.o(d.j.LINEAR);
         } else {
            d.G(d.j.LINEAR);
         }

         if(var1 == -1) {
            d.m(0.0F);
            d.G(var6);
         } else {
            d.m(var6 * z9.P());
            d.G(var6);
         }

         if(GLContext.getCapabilities().GL_NV_fog_distance) {
            if(z9.S()) {
               d.i('蕚', '蕛');
            }

            if(z9.h()) {
               d.i('蕚', '蕜');
            }
         }

         if(this.o.s8.F.J((int)var3.b, (int)var3.hr) || this.o.y.T().V()) {
            d.m(var6 * 0.05F);
            d.G(var6);
         }

         if(i6.Co.r()) {
            i6.Q(i6.Co, new Object[]{this, var3, var4, Float.valueOf(var2), Integer.valueOf(var1), Float.valueOf(var6)});
         }
      }

      d.G();
      d.p();
      d.G(1028, 4608);
   }

   public void I(boolean var1) {
      d.M(2918, this.t(0.0F, 0.0F, 0.0F, 1.0F));
   }

   private FloatBuffer t(float var1, float var2, float var3, float var4) {
      if(z9.Q()) {
         oz.P(var1, var2, var3);
      }

      this.R.clear();
      this.R.put(var1).put(var2).put(var3).put(var4);
      this.R.flip();
      return this.R;
   }

   public void w() {
      this.g = null;
      this.mX.P();
   }

   public wo v() {
      return this.mX;
   }

   private void Y() {
      this.y = 0;
      if(z9.SN() && z9.H()) {
         if(this.o.w()) {
            net.yl.j var1 = this.o.V();
            boolean var2 = this.o.F();
            if(!(this.o.s5 instanceof t4)) {
               if(this.m > 0) {
                  u_.R.G();
                  z9.k((long)this.m);
                  u_.R.C();
                  this.y = this.m;
               }

               long var3 = System.nanoTime() / 1000000L;
               if(this.mP != 0L && this.L != 0) {
                  long var5 = var3 - this.mP;
                  if(var5 < 0L) {
                     this.mP = var3;
                     var5 = 0L;
                  }

                  if(var5 >= 50L) {
                     this.mP = var3;
                     int var7 = var1.s();
                     int var8 = var7 - this.L;
                     this.L = var7;
                     var8 = 0;
                     if(this.m < 100) {
                        this.m += 2;
                     }

                     this.L = var7;
                  }
               } else {
                  this.mP = var3;
                  this.L = var1.s();
                  this.mc = 1.0F;
                  this.G = 50.0F;
               }
            } else {
               if(this.o.s5 instanceof t4) {
                  z9.k(20L);
               }

               this.mP = 0L;
               this.L = 0;
            }
         }
      } else {
         this.mP = 0L;
         this.L = 0;
      }

   }

   private void G() {
      if(!this.ms) {
         os.c();
         if(z9.H() == 64 && z9.o() == 32) {
            z9.X(true);
         }

         this.ms = true;
      }

      z9.T();
      net.cp.v var1 = this.o.s8;
      if(z9.K() != null) {
         String var2 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
         String var3 = var2 + " " + z9.K();
         new net.cb.l(net.c9.b.x("of.message.newVersion", new Object[]{var3}));
         z9.J((String)null);
      }

      if(z9.S2()) {
         z9.X(false);
         net.cb.l var5 = new net.cb.l(net.c9.b.x("of.message.java64Bit", new Object[0]));
         this.o.y.I().G(var5);
      }

      if(this.o.s5 instanceof tt) {
         this.u((tt)this.o.s5);
      }

      if(this.W != var1) {
         x4.v(this.W, var1);
         z9.w();
         this.mP = 0L;
         this.L = 0;
         this.W = var1;
      }

      if(!this.U(oz.K)) {
         oz.K = 0;
      }

   }

   private void h() {
      if(this.o.s8 != null) {
         long var1 = System.currentTimeMillis();
         if(var1 > this.c + 10000L) {
            this.c = var1;
            int var3 = d.z();
            String var4 = GLU.gluErrorString(var3);
            net.cb.l var5 = new net.cb.l(net.c9.b.x("of.message.openglError", new Object[]{Integer.valueOf(var3), var4}));
            this.o.y.I().G(var5);
         }
      }

   }

   private void u(tt var1) {
      String var2 = null;
      Calendar var3 = Calendar.getInstance();
      var3.setTime(new Date());
      int var4 = var3.get(5);
      int var5 = var3.get(2) + 1;
      if(var4 == 8 && var5 == 4) {
         var2 = "Happy birthday, OptiFine!";
      }

      if(var4 == 14 && var5 == 8) {
         var2 = "Happy birthday, sp614x!";
      }

   }

   public boolean U(int var1) {
      if(!ui.R()) {
         return false;
      } else if(this.mr != null && this.mr != this.mv[2] && this.mr != this.mv[4]) {
         return true;
      } else if(var1 != 2 && var1 != 4) {
         if(this.mr == null) {
            return true;
         } else {
            this.mr.i();
            this.mr = null;
            return true;
         }
      } else if(this.mr != null && this.mr == this.mv[var1]) {
         return true;
      } else if(this.o.s8 == null) {
         return true;
      } else {
         this.E(new m_("shaders/post/fxaa_of_" + var1 + "x.json"));
         this.mv[var1] = this.mr;
         return this.T;
      }
   }

   private void e(net.ne.l var1, float var2, net.cy.s var3, boolean var4) {
      int var5 = 201435902;
      if(this.mJ) {
         this.mJ = false;
         this.U(var1, (double)var2, var3, var4);
         this.o.y.I().i(var5);
      }

      if(Keyboard.isKeyDown(61) && Keyboard.isKeyDown(38)) {
         if(this.o.T.ii.m() == 38) {
            if(this.o.s5 instanceof net.yx.e) {
               this.o.s((tu)null);
            }

            while(Keyboard.next()) {
               ;
            }
         }

         if(this.o.s5 != null) {
            return;
         }

         this.mJ = true;
         net.cb.l var6 = new net.cb.l(net.c9.b.x("of.message.loadingVisibleChunks", new Object[0]));
         this.o.y.I().O(var6, var5);
         i6.CG.U(this.o, Boolean.TRUE);
      }

   }

   private void U(net.ne.l var1, double var2, net.cy.s var4, boolean var5) {
      u var6 = z9.F();
      var6.p();
      System.currentTimeMillis();
      z9.v("Loading visible chunks");
      long var10000 = System.currentTimeMillis() + 5000L;
      int var12 = 0;
      int var14 = 0;

      while(true) {
         var6.KQ = true;
         var6.F(var1, var2, var4, this.Z++, var5);
         if(!var6.O()) {
            boolean var16 = true;
         }

         var12 = var12 + var6.J();
         var6.E(System.nanoTime() + 1000000000L);
         var12 = var12 - var6.J();
         ++var14;
      }
   }

   public static void H(net.z.r var0, String var1, float var2, float var3, float var4, int var5, float var6, float var7, boolean var8, boolean var9) {
      d.c();
      d.O(var2, var3, var4);
      d.b(0.0F, 1.0F, 0.0F);
      d.P(-var6, 0.0F, 1.0F, 0.0F);
      d.P((float)-1 * var7, 1.0F, 0.0F, 0.0F);
      d.W(-0.025F, -0.025F, 0.025F);
      d.i();
      d.Y(false);
      d.z();
      d.C();
      d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
      int var10 = var0.r(var1) / 2;
      d.w();
      r var11 = r.f();
      p var12 = var11.k();
      var12.m(7, net.y8.x.F);
      var12.H((double)(-var10 - 1), (double)(-1 + var5), 0.0D).m(0.0F, 0.0F, 0.0F, 0.25F).W();
      var12.H((double)(-var10 - 1), (double)(8 + var5), 0.0D).m(0.0F, 0.0F, 0.0F, 0.25F).W();
      var12.H((double)(var10 + 1), (double)(8 + var5), 0.0D).m(0.0F, 0.0F, 0.0F, 0.25F).W();
      var12.H((double)(var10 + 1), (double)(-1 + var5), 0.0D).m(0.0F, 0.0F, 0.0F, 0.25F).W();
      var11.p();
      d.S();
      var0.v(var1, (float)(-var0.r(var1) / 2), (float)var5, 553648127);
      d.B();
      d.Y(true);
      var0.v(var1, (float)(-var0.r(var1) / 2), (float)var5, 553648127);
      d.K();
      d.E();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.Y();
   }

   public void A(ks var1) {
      if(!gn.Q.j.d(v3.class).v() && v3.L.Q()) {
         this.g = var1;
         this.C = 40;
         this.B = this.j.nextFloat() * 2.0F - 1.0F;
         this.mA = this.j.nextFloat() * 2.0F - 1.0F;
      }

   }

   private void M(int var1, int var2, float var3) {
      if(this.g != null && this.C > 0) {
         int var4 = 40 - this.C;
         float var5 = ((float)var4 + var3) / 40.0F;
         float var6 = var5 * var5;
         float var7 = var5 * var6;
         float var8 = 10.25F * var7 * var6 + -24.95F * var6 * var6 + 25.5F * var7 + -13.8F * var6 + 4.0F * var5;
         float var9 = var8 * 3.1415927F;
         float var10 = this.B * (float)(var1 / 4);
         float var11 = this.mA * (float)(var2 / 4);
         d.m();
         d.c();
         d.r();
         d.B();
         d.j();
         u1.B();
         d.O((float)(var1 / 2) + var10 * net.u.t.J(net.u.t.A(var9 * 2.0F)), (float)(var2 / 2) + var11 * net.u.t.J(net.u.t.A(var9 * 2.0F)), -50.0F);
         float var12 = 50.0F + 175.0F * net.u.t.A(var9);
         d.W(var12, -var12, var12);
         d.P(900.0F * net.u.t.J(net.u.t.A(var9)), 0.0F, 1.0F, 0.0F);
         d.P(6.0F * net.u.t.m(var5 * 8.0F), 1.0F, 0.0F, 0.0F);
         d.P(6.0F * net.u.t.m(var5 * 8.0F), 0.0F, 0.0F, 1.0F);
         this.o.K().w(this.g, net.ym.s.FIXED);
         d.t();
         d.Y();
         u1.m();
         d.a();
         d.z();
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
