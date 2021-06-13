package net.ne;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net._g;
import net._x;
import net.b2;
import net.gn;
import net.mx;
import net.s_;
import net.vx;
import net.xn;
import net.zi;
import net.zj;
import net.zw;
import net.n0.ks;
import net.ne.a;
import net.ne.d;
import net.ne.f;
import net.ne.v;
import net.nl.z2;
import net.y9.g5;
import net.y9.lk;
import net.y9.ln;
import net.y9.r3;
import net.y9.re;
import net.yz.a5;
import net.yz.ad;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class l implements net.nv.f {
   private static final Logger C = LogManager.getLogger();
   private static final List hp = Collections.emptyList();
   private static final net.u.e hg = new net.u.e(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
   private static double hB = 1.0D;
   private static int P;
   private int S;
   public boolean a;
   private final List hM;
   protected int hT;
   public l X;
   public boolean hK;
   public net.yv.r hl;
   public double h;
   public double h6;
   public double l;
   public double b;
   public double hS;
   public double hr;
   public double hf;
   public double K;
   public double J;
   public float hN;
   public float V;
   public float hq;
   public float d;
   public net.u.e H;
   public boolean k;
   public boolean t;
   public boolean u;
   public boolean W;
   public boolean hV;
   public boolean L;
   private boolean q;
   public boolean Z;
   public float h9;
   public float m;
   public float hu;
   public float i;
   public float hU;
   public float hI;
   private int o;
   private float ho;
   public double hL;
   public double F;
   public double A;
   public float ha;
   public boolean r;
   public float M;
   protected Random p;
   public int x;
   private int c;
   protected boolean hW;
   public int I;
   protected boolean Y;
   protected boolean hw;
   protected net.k.n G;
   protected static final net.k.v hy = net.k.n.q(l.class, net.k.y.g);
   private static final net.k.v v = net.k.n.q(l.class, net.k.y.d);
   private static final net.k.v hs = net.k.n.q(l.class, net.k.y.J);
   private static final net.k.v hC = net.k.n.q(l.class, net.k.y.f);
   private static final net.k.v hF = net.k.n.q(l.class, net.k.y.f);
   private static final net.k.v N = net.k.n.q(l.class, net.k.y.f);
   public boolean U;
   public int Q;
   public int D;
   public int f;
   public long E;
   public long j;
   public long h2;
   public boolean hz;
   public boolean w;
   public int hH;
   protected boolean n;
   protected int h_;
   public int y;
   protected net.u.j R;
   protected net.u.r hZ;
   protected aq s;
   private boolean O;
   protected UUID z;
   protected String B;
   private final net.nv.l T;
   protected boolean hP;
   private final Set e;
   private boolean g;
   private final double[] hA;
   private long hY;
   private static boolean h4;

   public l(net.yv.r var1) {
      this.S = P++;
      this.hM = Lists.newArrayList();
      this.H = hg;
      this.h9 = 0.6F;
      this.m = 1.8F;
      this.o = 1;
      this.ho = 1.0F;
      this.p = new Random();
      this.c = -this.I();
      this.Y = true;
      this.z = net.u.t.g(this.p);
      this.B = this.z.toString();
      this.T = new net.nv.l();
      this.e = Sets.newHashSet();
      this.hA = new double[]{0.0D, 0.0D, 0.0D};
      this.hl = var1;
      this.t(0.0D, 0.0D, 0.0D);
      this.y = var1.F.L().M();
      this.G = new net.k.n(this);
      this.G.r(hy, Byte.valueOf((byte)0));
      this.G.r(v, Integer.valueOf(300));
      this.G.r(hC, Boolean.valueOf(false));
      this.G.r(hs, "");
      this.G.r(hF, Boolean.valueOf(false));
      this.G.r(N, Boolean.valueOf(false));
      this.g();
   }

   public int G() {
      return this.S;
   }

   public void K(int var1) {
      this.S = var1;
   }

   public Set C() {
      return this.e;
   }

   public boolean r(String var1) {
      if(this.e.size() >= 1024) {
         return false;
      } else {
         this.e.add(var1);
         return true;
      }
   }

   public boolean t(String var1) {
      return this.e.remove(var1);
   }

   public void L() {
      this.B();
   }

   protected abstract void g();

   public net.k.n A() {
      return this.G;
   }

   public boolean equals(Object var1) {
      return var1 instanceof l?((l)var1).S == this.S:false;
   }

   public int hashCode() {
      return this.S;
   }

   protected void G() {
      if(this.hl != null) {
         while(true) {
            if(this.hS > 0.0D && this.hS < 256.0D) {
               this.t(this.b, this.hS, this.hr);
               if(!this.hl.h(this, this.i()).isEmpty()) {
                  ++this.hS;
                  continue;
               }
            }

            this.hf = 0.0D;
            this.K = 0.0D;
            this.J = 0.0D;
            this.V = 0.0F;
            break;
         }
      }

   }

   public void B() {
      this.Z = true;
   }

   public void C(boolean var1) {
   }

   protected void S(float var1, float var2) {
      if(var1 != this.h9 || var2 != this.m) {
         float var3 = this.h9;
         this.h9 = var1;
         this.m = var2;
         if(this.h9 < var3) {
            double var6 = (double)var1 / 2.0D;
            this.g(new net.u.e(this.b - var6, this.hS, this.hr - var6, this.b + var6, this.hS + (double)this.m, this.hr + var6));
            return;
         }

         net.u.e var4 = this.i();
         this.g(new net.u.e(var4.n, var4.u, var4.N, var4.n + (double)this.h9, var4.u + (double)this.m, var4.N + (double)this.h9));
         if(this.h9 > var3 && !this.Y && !this.hl.x) {
            this.N(f.SELF, (double)(var3 - this.h9), 0.0D, (double)(var3 - this.h9));
         }
      }

   }

   protected void r(float var1, float var2) {
      this.hN = var1 % 360.0F;
      this.V = var2 % 360.0F;
   }

   public void t(double var1, double var3, double var5) {
      this.b = var1;
      this.hS = var3;
      this.hr = var5;
      float var7;
      float var8;
      if(this instanceof net.r.r) {
         var7 = (this.h9 + mx.z(this)) / 2.0F;
         var8 = this.m + mx.z(this) / 2.0F;
      } else {
         var7 = this.h9 / 2.0F;
         var8 = this.m;
      }

      this.g(new net.u.e(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   public void e(float var1, float var2) {
      float var3 = this.V;
      float var4 = this.hN;
      this.hN = (float)((double)this.hN + (double)var1 * 0.15D);
      this.V = (float)((double)this.V - (double)var2 * 0.15D);
      this.V = net.u.t.T(this.V, -90.0F, 90.0F);
      this.d += this.V - var3;
      this.hq += this.hN - var4;
      if(this.X != null) {
         this.X.k(this);
      }

   }

   public void A() {
      if(!this.hl.x) {
         this.I(6, this.o());
      }

      this.i();
   }

   public void i() {
      this.hl.M.K("entityBaseTick");
      if(this.M() && this.D().Z) {
         this.O();
      }

      if(this.hT > 0) {
         --this.hT;
      }

      this.hu = this.i;
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      this.d = this.V;
      this.hq = this.hN;
      if(!this.hl.x && this.hl instanceof net.yv.d) {
         this.hl.M.K("portal");
         if(this.n) {
            net.nx.f var1 = this.hl.v();
            if(var1.d()) {
               if(!this.M()) {
                  int var2 = this.B();
                  if(this.h_++ >= var2) {
                     this.h_ = var2;
                     this.hH = this.S();
                     byte var3;
                     if(this.hl.F.L().M() == -1) {
                        var3 = 0;
                     } else {
                        var3 = -1;
                     }

                     this.V(var3);
                  }
               }

               this.n = false;
            }
         } else {
            if(this.h_ > 0) {
               this.h_ -= 4;
            }

            if(this.h_ < 0) {
               this.h_ = 0;
            }
         }

         this.U();
         this.hl.M.N();
      }

      this.M();
      this.r();
      if(this.hl.x) {
         this.e();
      } else if(this.c > 0) {
         if(this.hw) {
            this.c -= 4;
            if(this.c < 0) {
               this.e();
            }
         } else {
            if(this.c % 20 == 0) {
               this.H(net.yz.z.y, 1.0F);
            }

            --this.c;
         }
      }

      if(this.h()) {
         this.N();
         this.hI *= 0.5F;
      }

      if(this.hS < -64.0D) {
         this.R();
      }

      if(!this.hl.x) {
         this.I(0, this.c > 0);
      }

      this.Y = false;
      this.hl.M.N();
   }

   protected void U() {
      if(this.hH > 0) {
         --this.hH;
      }

   }

   public int B() {
      return 1;
   }

   protected void N() {
      if(!this.hw) {
         this.H(net.yz.z.a, 4.0F);
         this.n(15);
      }

   }

   public void n(int var1) {
      int var2 = var1 * 20;
      if(this instanceof a) {
         var2 = net.c1.u.u((a)this, var2);
      }

      if(this.c < var2) {
         this.c = var2;
      }

   }

   public void e() {
      this.c = 0;
   }

   protected void R() {
      this.B();
   }

   public boolean h(double var1, double var3, double var5) {
      net.u.e var7 = this.i().w(var1, var3, var5);
      return this.V(var7);
   }

   private boolean V(net.u.e var1) {
      return this.hl.h(this, var1).isEmpty() && !this.hl.p(var1);
   }

   public void N(f var1, double var2, double var4, double var6) {
      zi var9 = new zi();
      d.O();
      _x.m(var9);
      if(var9.t() || this.r) {
         this.g(this.i().w(var2, var4, var6));
         this.k();
      }

      if(var1 == f.PISTON) {
         long var10 = this.hl.y();
         if(Long.compare(var10, this.hY) != 0) {
            Arrays.fill(this.hA, 0.0D);
            this.hY = var10;
         }

         if(Double.compare(var2, 0.0D) != 0) {
            int var12 = aq.l.X.ordinal();
            double var13 = net.u.t.F(var2 + this.hA[var12], -0.51D, 0.51D);
            var2 = var13 - this.hA[var12];
            this.hA[var12] = var13;
            if(Math.abs(var2) <= 9.999999747378752E-6D) {
               return;
            }
         }

         if(var4 != 0.0D) {
            int var65 = aq.l.Y.ordinal();
            double var68 = net.u.t.F(var4 + this.hA[var65], -0.51D, 0.51D);
            var4 = var68 - this.hA[var65];
            this.hA[var65] = var68;
            if(Math.abs(var4) <= 9.999999747378752E-6D) {
               return;
            }
         }

         if(var6 == 0.0D) {
            return;
         }

         int var66 = aq.l.Z.ordinal();
         double var69 = net.u.t.F(var6 + this.hA[var66], -0.51D, 0.51D);
         var6 = var69 - this.hA[var66];
         this.hA[var66] = var69;
         if(Math.abs(var6) <= 9.999999747378752E-6D) {
            return;
         }
      }

      this.hl.M.K("move");
      double var64 = this.b;
      double var67 = this.hS;
      double var14 = this.hr;
      if(this.L) {
         this.L = false;
         var2 *= 0.25D;
         var4 *= 0.05000000074505806D;
         var6 *= 0.25D;
         this.hf = 0.0D;
         this.K = 0.0D;
         this.J = 0.0D;
      }

      double var16 = var2;
      double var18 = var4;
      double var20 = var6;
      zw var22 = new zw();
      _x.m(var22);
      if((var1 == f.SELF || var1 == f.PLAYER) && this.k && this.Q() && this instanceof net.r.r || var22.t() && this instanceof net.r.r || gn.Q.j.d(vx.class).v() && net.nn.j.b().sf.k) {
         double var23 = 0.05D;
         if(var2 != 0.0D && this.hl.h(this, this.i().w(var2, (double)(-this.ha), 0.0D)).isEmpty()) {
            if(Double.compare(var2, 0.05D) < 0 && Double.compare(var2, -0.05D) >= 0) {
               var2 = 0.0D;
            }

            if(var2 > 0.0D) {
               var2 -= 0.05D;
            }

            var2 += 0.05D;
            var16 = var2;
         }

         if(var6 != 0.0D && this.hl.h(this, this.i().w(0.0D, (double)(-this.ha), var6)).isEmpty()) {
            if(Double.compare(var6, 0.05D) < 0 && Double.compare(var6, -0.05D) >= 0) {
               var6 = 0.0D;
            }

            if(var6 > 0.0D) {
               var6 -= 0.05D;
            }

            var6 += 0.05D;
            var20 = var6;
         }

         if(var2 != 0.0D && Double.compare(var6, 0.0D) != 0 && this.hl.h(this, this.i().w(var2, (double)(-this.ha), var6)).isEmpty()) {
            if(Double.compare(var2, 0.05D) < 0 && Double.compare(var2, -0.05D) >= 0) {
               var2 = 0.0D;
            }

            if(var2 > 0.0D) {
               var2 -= 0.05D;
            }

            var2 += 0.05D;
            var16 = var2;
            if(Double.compare(var6, 0.05D) < 0 && Double.compare(var6, -0.05D) >= 0) {
               var6 = 0.0D;
            }

            if(var6 > 0.0D) {
               var6 -= 0.05D;
            }

            var6 += 0.05D;
            var20 = var6;
         }
      }

      List var70 = this.hl.h(this, this.i().T(var2, var4, var6));
      net.u.e var24 = this.i();
      if(Double.compare(var4, 0.0D) != 0) {
         int var25 = 0;
         int var26 = var70.size();
         if(var25 < var26) {
            var4 = ((net.u.e)var70.get(var25)).j(this.i(), var4);
            ++var25;
         }

         this.g(this.i().w(0.0D, var4, 0.0D));
      }

      if(Double.compare(var2, 0.0D) != 0) {
         int var72 = 0;
         int var76 = var70.size();
         if(var72 < var76) {
            var2 = ((net.u.e)var70.get(var72)).s(this.i(), var2);
            ++var72;
         }

         if(Double.compare(var2, 0.0D) != 0) {
            this.g(this.i().w(var2, 0.0D, 0.0D));
         }
      }

      if(Double.compare(var6, 0.0D) != 0) {
         int var74 = 0;
         int var77 = var70.size();
         if(var74 < var77) {
            var6 = ((net.u.e)var70.get(var74)).N(this.i(), var6);
            ++var74;
         }

         if(Double.compare(var6, 0.0D) != 0) {
            this.g(this.i().w(0.0D, 0.0D, var6));
         }
      }

      if(!this.k && (Double.compare(var4, var4) == 0 || var18 >= 0.0D)) {
         boolean var111 = false;
      } else {
         boolean var10000 = true;
      }

      _g var78 = new _g(true, (double)this.ha);
      if(this == net.nn.j.b().sf) {
         _x.m(var78);
      }

      if(Double.compare(var78.Q(), 0.0D) > 0 && (var16 != var2 || var20 != var6)) {
         double var27 = var2;
         double var29 = var4;
         double var31 = var6;
         net.u.e var33 = this.i();
         this.g(var24);
         var4 = var78.Q();
         List var34 = this.hl.h(this, this.i().T(var16, var4, var20));
         net.u.e var35 = this.i();
         net.u.e var36 = var35.T(var16, 0.0D, var20);
         double var37 = var4;
         int var39 = 0;
         int var40 = var34.size();
         if(var39 < var40) {
            var37 = ((net.u.e)var34.get(var39)).j(var36, var4);
            ++var39;
         }

         var35 = var35.w(0.0D, var37, 0.0D);
         double var94 = var16;
         int var42 = 0;
         int var43 = var34.size();
         if(var42 < var43) {
            var94 = ((net.u.e)var34.get(var42)).s(var35, var16);
            ++var42;
         }

         var35 = var35.w(var94, 0.0D, 0.0D);
         double var97 = var20;
         int var45 = 0;
         int var46 = var34.size();
         if(var45 < var46) {
            var97 = ((net.u.e)var34.get(var45)).N(var35, var20);
            ++var45;
         }

         var35 = var35.w(0.0D, 0.0D, var97);
         net.u.e var99 = this.i();
         double var47 = var4;
         int var49 = 0;
         int var50 = var34.size();
         if(var49 < var50) {
            var47 = ((net.u.e)var34.get(var49)).j(var99, var4);
            ++var49;
         }

         var99 = var99.w(0.0D, var47, 0.0D);
         double var104 = var16;
         int var52 = 0;
         int var53 = var34.size();
         if(var52 < var53) {
            var104 = ((net.u.e)var34.get(var52)).s(var99, var16);
            ++var52;
         }

         var99 = var99.w(var104, 0.0D, 0.0D);
         double var106 = var20;
         int var55 = 0;
         int var56 = var34.size();
         if(var55 < var56) {
            var106 = ((net.u.e)var34.get(var55)).N(var99, var20);
            ++var55;
         }

         var99 = var99.w(0.0D, 0.0D, var106);
         double var108 = var94 * var94 + var97 * var97;
         double var58 = var104 * var104 + var106 * var106;
         if(var108 > var58) {
            var4 = -var37;
            this.g(var35);
         }

         var2 = var104;
         var6 = var106;
         var4 = -var47;
         this.g(var99);
         int var60 = 0;
         int var61 = var34.size();
         if(var60 < var61) {
            var4 = ((net.u.e)var34.get(var60)).j(this.i(), var4);
            ++var60;
         }

         this.g(this.i().w(0.0D, var4, 0.0D));
         if(var27 * var27 + var31 * var31 >= var104 * var104 + var106 * var106) {
            var2 = var27;
            var4 = var29;
            var6 = var31;
            this.g(var33);
         }

         _g var110 = new _g(false, (double)this.ha, 1.0D + var4);
         if(this == net.nn.j.b().sf) {
            _x.m(var110);
         }
      }

      this.hl.M.N();
      this.hl.M.K("rest");
      this.k();
      this.t = Double.compare(var16, var2) != 0 || Double.compare(var20, var6) != 0;
      this.u = Double.compare(var4, var4) != 0;
      this.k = this.u && var18 < 0.0D;
      this.W = this.t || this.u;
      int var79 = net.u.t.L(this.b);
      int var28 = net.u.t.L(this.hS - 0.20000000298023224D);
      int var80 = net.u.t.L(this.hr);
      net.u.j var30 = new net.u.j(var79, var28, var80);
      net.yw.n var81 = this.hl.Z(var30);
      if(var81.n() == net.y1.l.q) {
         net.u.j var32 = var30.b();
         net.yw.n var83 = this.hl.Z(var32);
         net.y9.l var86 = var83.Q();
         if(var86 instanceof r3 || var86 instanceof ln || var86 instanceof re) {
            var81 = var83;
            var30 = var32;
         }
      }

      this.s(var4, this.k, var81, var30);
      if(Double.compare(var16, var2) != 0) {
         this.hf = 0.0D;
      }

      if(var20 != var6) {
         this.J = 0.0D;
      }

      net.y9.l var82 = var81.Q();
      if(Double.compare(var18, var4) != 0) {
         var82.w(this.hl, this);
      }

      if(this.k() && (!this.k || !this.Q() || !(this instanceof net.r.r)) && !this.M()) {
         double var84 = this.b - var64;
         double var90 = this.hS - var67;
         double var91 = this.hr - var14;
         if(var82 != net.nb.f.K) {
            var90 = 0.0D;
         }

         if(var82 != null && this.k) {
            var82.m(this.hl, var30, this);
         }

         this.i = (float)((double)this.i + (double)net.u.t.R(var84 * var84 + var91 * var91) * 0.6D);
         this.hU = (float)((double)this.hU + (double)net.u.t.R(var84 * var84 + var90 * var90 + var91 * var91) * 0.6D);
         if(Float.compare(this.hU, (float)this.o) > 0 && var81.n() != net.y1.l.q) {
            this.o = (int)this.hU + 1;
            if(this.p()) {
               l var93 = this.t() && this.C() != null?this.C():this;
               float var95 = var93 == this?0.35F:0.4F;
               float var41 = net.u.t.R(var93.hf * var93.hf * 0.20000000298023224D + var93.K * var93.K + var93.J * var93.J * 0.20000000298023224D) * var95;
               if(var41 > 1.0F) {
                  var41 = 1.0F;
               }

               this.I(this.X(), var41, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.4F);
            }

            this.B(var30, var82);
         }

         if(this.hU > this.ho && this.u() && var81.n() == net.y1.l.q) {
            this.ho = this.r(this.hU);
         }
      }

      boolean var85;
      label3286: {
         this.P();
         var85 = this.J();
         if(this.hl.j(this.i().d(0.001D))) {
            this.l(1);
            if(var85) {
               break label3286;
            }

            ++this.c;
            if(this.c != 0) {
               break label3286;
            }

            this.n(8);
         }

         if(this.c <= 0) {
            this.c = -this.I();
         }
      }

      if(var85 && this.a()) {
         this.I(net.nb.l.Dv, 0.7F, 1.6F + (this.p.nextFloat() - this.p.nextFloat()) * 0.4F);
         this.c = -this.I();
      }

      this.hl.M.N();
   }

   public void k() {
      net.u.e var1 = this.i();
      this.b = (var1.n + var1.d) / 2.0D;
      this.hS = var1.u;
      this.hr = (var1.N + var1.r) / 2.0D;
   }

   protected net.yz.a X() {
      return net.nb.l.PN;
   }

   protected net.yz.a q() {
      return net.nb.l.PY;
   }

   protected void P() {
      net.u.e var1 = this.i();
      net.u.j var2 = net.u.j.x(var1.n + 0.001D, var1.u + 0.001D, var1.N + 0.001D);
      net.u.j var3 = net.u.j.x(var1.d - 0.001D, var1.c - 0.001D, var1.r - 0.001D);
      net.u.j var4 = net.u.j.u();
      if(this.hl.C(var2, var3)) {
         for(int var5 = var2.t(); var5 <= var3.t(); ++var5) {
            for(int var6 = var2.h(); var6 <= var3.h(); ++var6) {
               for(int var7 = var2.y(); var7 <= var3.y(); ++var7) {
                  var4.c(var5, var6, var7);
                  net.yw.n var8 = this.hl.Z(var4);
                  var8.Q().N(this.hl, var4, var8, this);
                  this.f(var8);
               }
            }
         }
      }

      var2.T();
      var3.T();
      var4.T();
   }

   protected void f(net.yw.n var1) {
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      lk var3 = var2.X();
      if(this.hl.Z(var1.h()).Q() == net.nb.f.Tl) {
         var3 = net.nb.f.Tl.X();
         this.I(var3.H(), var3.m() * 0.15F, var3.X());
      } else if(!var2.p().n().y()) {
         this.I(var3.H(), var3.m() * 0.15F, var3.X());
      }

   }

   protected float r(float var1) {
      return 0.0F;
   }

   protected boolean u() {
      return false;
   }

   public void I(net.yz.a var1, float var2, float var3) {
      if(!this.c()) {
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, var1, this.E(), var2, var3);
      }

   }

   public boolean c() {
      return ((Boolean)this.G.a(hF)).booleanValue();
   }

   public void w(boolean var1) {
      this.G.d(hF, Boolean.valueOf(var1));
   }

   public boolean j() {
      return ((Boolean)this.G.a(N)).booleanValue();
   }

   public void I(boolean var1) {
      this.G.d(N, Boolean.valueOf(var1));
   }

   protected boolean k() {
      return true;
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
      if(this.hI > 0.0F) {
         var4.Q().f(this.hl, var5, this, this.hI);
      }

      this.hI = 0.0F;
   }

   @Nullable
   public net.u.e F() {
      return null;
   }

   protected void l(int var1) {
      if(!this.hw) {
         this.H(net.yz.z.p, (float)var1);
      }

   }

   public final boolean X() {
      return this.hw;
   }

   public void v(float var1, float var2) {
      if(this.t()) {
         for(l var4 : this.H()) {
            var4.v(var1, var2);
         }
      }

   }

   public boolean J() {
      if(this.hW) {
         return true;
      } else {
         net.u.j var1 = net.u.j.x(this.b, this.hS, this.hr);
         if(!this.hl.F((net.u.j)var1) && !this.hl.F((net.u.j)var1.E(this.b, this.hS + (double)this.m, this.hr))) {
            var1.T();
            return false;
         } else {
            var1.T();
            return true;
         }
      }
   }

   public boolean p() {
      return this.hW;
   }

   public boolean q() {
      return this.hl.q(this.i().f(0.0D, -20.0D, 0.0D).d(0.001D), net.y1.l.p, this);
   }

   public boolean r() {
      if(this.D() instanceof net.nm.b) {
         this.hW = false;
      } else if(this.hl.q(this.i().f(0.0D, -0.4000000059604645D, 0.0D).d(0.001D), net.y1.l.p, this)) {
         if(!this.hW && !this.Y) {
            this.c();
         }

         this.hI = 0.0F;
         this.hW = true;
         this.e();
      } else {
         this.hW = false;
      }

      return this.hW;
   }

   protected void c() {
      l var1 = this.t() && this.C() != null?this.C():this;
      float var2 = var1 == this?0.2F:0.9F;
      float var3 = net.u.t.R(var1.hf * var1.hf * 0.20000000298023224D + var1.K * var1.K + var1.J * var1.J * 0.20000000298023224D) * var2;
      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      this.I(this.q(), var3, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.4F);
      float var4 = (float)net.u.t.L(this.i().u);

      for(int var5 = 0; (float)var5 < 1.0F + this.h9 * 20.0F; ++var5) {
         float var6 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9;
         float var7 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9;
         this.hl.n(ai.WATER_BUBBLE, this.b + (double)var6, (double)(var4 + 1.0F), this.hr + (double)var7, this.hf, this.K - (double)(this.p.nextFloat() * 0.2F), this.J, new int[0]);
      }

      for(int var8 = 0; (float)var8 < 1.0F + this.h9 * 20.0F; ++var8) {
         float var9 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9;
         float var10 = (this.p.nextFloat() * 2.0F - 1.0F) * this.h9;
         this.hl.n(ai.WATER_SPLASH, this.b + (double)var9, (double)(var4 + 1.0F), this.hr + (double)var10, this.hf, this.K, this.J, new int[0]);
      }

   }

   public void M() {
      if(this.B() && !this.p()) {
         this.X();
      }

   }

   protected void X() {
      int var1 = net.u.t.L(this.b);
      int var2 = net.u.t.L(this.hS - 0.20000000298023224D);
      int var3 = net.u.t.L(this.hr);
      net.u.j var4 = new net.u.j(var1, var2, var3);
      net.yw.n var5 = this.hl.Z(var4);
      if(var5.C() != a5.INVISIBLE) {
         this.hl.n(ai.BLOCK_CRACK, this.b + ((double)this.p.nextFloat() - 0.5D) * (double)this.h9, this.i().u + 0.1D, this.hr + ((double)this.p.nextFloat() - 0.5D) * (double)this.h9, -this.hf * 4.0D, 1.5D, -this.J * 4.0D, new int[]{net.y9.l.m(var5)});
      }

   }

   public boolean A(net.y1.l var1) {
      if(this.D() instanceof net.nm.b) {
         return false;
      } else {
         double var2 = this.hS + (double)this.A();
         net.u.j var4 = new net.u.j(this.b, var2, this.hr);
         net.yw.n var5 = this.hl.Z(var4);
         if(var5.n() == var1) {
            float var6 = g5.P(var5.Q().d(var5)) - 0.11111111F;
            float var7 = (float)(var4.h() + 1) - var6;
            boolean var8 = var2 < (double)var7;
            return !(this instanceof net.r.r);
         } else {
            return false;
         }
      }
   }

   public boolean h() {
      return this.hl.I(this.i().f(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), net.y1.l.U);
   }

   public void h(float var1, float var2, float var3, float var4) {
      zj var5 = new zj(this.hN, var1, var3, var4);
      _x.m(var5);
      if(!var5.t()) {
         float var6 = this instanceof net.yy.g?var5.f():this.hN;
         float var7 = var1 * var1 + var2 * var2 + var3 * var3;
         if(var7 >= 1.0E-4F) {
            var7 = net.u.t.g(var7);
            if(var7 < 1.0F) {
               var7 = 1.0F;
            }

            var7 = var4 / var7;
            var1 = var1 * var7;
            var2 = var2 * var7;
            var3 = var3 * var7;
            float var8 = net.u.t.A(var6 * 3.1415927F / 180.0F);
            float var9 = net.u.t.m(var6 * 3.1415927F / 180.0F);
            this.hf += (double)(var1 * var9 - var3 * var8);
            this.K += (double)var2;
            this.J += (double)(var3 * var9 + var1 * var8);
         }

      }
   }

   public int L() {
      net.u.j var1 = new net.u.j(net.u.t.L(this.b), 0, net.u.t.L(this.hr));
      if(this.hl.o((net.u.j)var1)) {
         var1.U(net.u.t.L(this.hS + (double)this.A()));
         return this.hl.z(var1, 0);
      } else {
         return 0;
      }
   }

   public float d() {
      net.u.j var1 = new net.u.j(net.u.t.L(this.b), 0, net.u.t.L(this.hr));
      if(this.hl.o((net.u.j)var1)) {
         var1.U(net.u.t.L(this.hS + (double)this.A()));
         return this.hl.u(var1);
      } else {
         return 0.0F;
      }
   }

   public void B(net.yv.r var1) {
      this.hl = var1;
   }

   public void D(double var1, double var3, double var5, float var7, float var8) {
      this.b = net.u.t.F(var1, -3.0E7D, 3.0E7D);
      this.hS = var3;
      this.hr = net.u.t.F(var5, -3.0E7D, 3.0E7D);
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      var8 = net.u.t.T(var8, -90.0F, 90.0F);
      this.hN = var7;
      this.V = var8;
      this.hq = this.hN;
      this.d = this.V;
      double var9 = (double)(this.hq - var7);
      if(var9 < -180.0D) {
         this.hq += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.hq -= 360.0F;
      }

      this.t(this.b, this.hS, this.hr);
      this.r(var7, var8);
   }

   public void L(net.u.j var1, float var2, float var3) {
      this.S((double)var1.t() + 0.5D, (double)var1.h(), (double)var1.y() + 0.5D, var2, var3);
   }

   public void S(double var1, double var3, double var5, float var7, float var8) {
      this.b = var1;
      this.hS = var3;
      this.hr = var5;
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      this.hL = this.b;
      this.F = this.hS;
      this.A = this.hr;
      this.hN = var7;
      this.V = var8;
      this.t(this.b, this.hS, this.hr);
   }

   public float d(l var1) {
      float var2 = (float)(this.b - var1.b);
      float var3 = (float)(this.hS - var1.hS);
      float var4 = (float)(this.hr - var1.hr);
      return net.u.t.g(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double o(double var1, double var3, double var5) {
      double var7 = this.b - var1;
      double var9 = this.hS - var3;
      double var11 = this.hr - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double x(net.u.j var1) {
      return var1.s(this.b, this.hS, this.hr);
   }

   public double H(net.u.j var1) {
      return var1.S(this.b, this.hS, this.hr);
   }

   public double R(double var1, double var3, double var5) {
      double var7 = this.b - var1;
      double var9 = this.hS - var3;
      double var11 = this.hr - var5;
      return (double)net.u.t.R(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double F(l var1) {
      double var2 = this.b - var1.b;
      double var4 = this.hS - var1.hS;
      double var6 = this.hr - var1.hr;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void H(net.r.r var1) {
   }

   public void W(l var1) {
      if(!gn.Q.j.d(s_.class).v() || !s_.X.Q()) {
         if(!this.i(var1) && !var1.r && !this.r) {
            double var2 = var1.b - this.b;
            double var4 = var1.hr - this.hr;
            double var6 = net.u.t.p(var2, var4);
            if(var6 >= 0.009999999776482582D) {
               var6 = (double)net.u.t.R(var6);
               var2 = var2 / var6;
               var4 = var4 / var6;
               double var8 = 1.0D / var6;
               if(var8 > 1.0D) {
                  var8 = 1.0D;
               }

               var2 = var2 * var8;
               var4 = var4 * var8;
               var2 = var2 * 0.05000000074505806D;
               var4 = var4 * 0.05000000074505806D;
               var2 = var2 * (double)(1.0F - this.M);
               var4 = var4 * (double)(1.0F - this.M);
               if(!this.t()) {
                  this.u(-var2, 0.0D, -var4);
               }

               if(!var1.t()) {
                  var1.u(var2, 0.0D, var4);
               }
            }
         }

      }
   }

   public void u(double var1, double var3, double var5) {
      this.hf += var1;
      this.K += var3;
      this.J += var5;
      this.w = true;
   }

   protected void E() {
      this.hV = true;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         this.E();
         return false;
      }
   }

   public net.u.r r(float var1) {
      if(var1 == 1.0F) {
         return z(this.V, this.hN);
      } else {
         float var2 = this.d + (this.V - this.d) * var1;
         float var3 = this.hq + (this.hN - this.hq) * var1;
         return z(var2, var3);
      }
   }

   public static final net.u.r z(float var0, float var1) {
      float var2 = net.u.t.m(-var1 * 0.017453292F - 3.1415927F);
      float var3 = net.u.t.A(-var1 * 0.017453292F - 3.1415927F);
      float var4 = -net.u.t.m(-var0 * 0.017453292F);
      float var5 = net.u.t.A(-var0 * 0.017453292F);
      return new net.u.r((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public net.u.r E(float var1) {
      if(var1 == 1.0F) {
         return new net.u.r(this.b, this.hS + (double)this.A(), this.hr);
      } else {
         double var2 = this.h + (this.b - this.h) * (double)var1;
         double var4 = this.h6 + (this.hS - this.h6) * (double)var1 + (double)this.A();
         double var6 = this.l + (this.hr - this.l) * (double)var1;
         return new net.u.r(var2, var4, var6);
      }
   }

   @Nullable
   public net.u.m U(double var1, float var3) {
      net.u.r var4 = this.E(var3);
      net.u.r var5 = this.r(var3);
      net.u.r var6 = var4.s(var5.p * var1, var5.H * var1, var5.a * var1);
      return this.hl.s(var4, var6, false, false, true);
   }

   public boolean w() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void D(l var1, int var2, net.yz.z var3) {
      if(var1 instanceof net.r.h) {
         b2.q.z((net.r.h)var1, this, var3);
      }

   }

   public boolean e(double var1, double var3, double var5) {
      double var7 = this.b - var1;
      double var9 = this.hS - var3;
      double var11 = this.hr - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.p(var13);
   }

   public boolean p(double var1) {
      double var3 = this.i().O();
      if(Double.isNaN(var3)) {
         var3 = 1.0D;
      }

      var3 = var3 * 64.0D * hB;
      return var1 < var3 * var3;
   }

   public boolean k(net.nj.f var1) {
      String var2 = this.v();
      if(!this.Z) {
         var1.b("id", var2);
         this.G(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean d(net.nj.f var1) {
      String var2 = this.v();
      if(!this.Z && !this.M()) {
         var1.b("id", var2);
         this.G(var1);
         return true;
      } else {
         return false;
      }
   }

   public static void q(net.c0.d var0) {
      var0.U(net.c0.q.ENTITY, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            boolean var4 = d.p();
            if(var2.K("Passengers", 9)) {
               net.nj.h var5 = var2.A("Passengers", 10);
               int var6 = 0;
               if(var6 < var5.z()) {
                  var5.S(var6, var1.w(net.c0.q.ENTITY, var5.i(var6), var3));
                  ++var6;
               }
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public net.nj.f G(net.nj.f var1) {
      var1.K("Pos", this.p(new double[]{this.b, this.hS, this.hr}));
      var1.K("Motion", this.p(new double[]{this.hf, this.K, this.J}));
      var1.K("Rotation", this.o(new float[]{this.hN, this.V}));
      var1.d("FallDistance", this.hI);
      var1.h("Fire", (short)this.c);
      var1.h("Air", (short)this.b());
      var1.c("OnGround", this.k);
      var1.r("Dimension", this.y);
      var1.c("Invulnerable", this.O);
      var1.r("PortalCooldown", this.hH);
      var1.h("UUID", this.O());
      if(this.H()) {
         var1.b("CustomName", this.X());
      }

      if(this.y()) {
         var1.c("CustomNameVisible", this.y());
      }

      this.T.y(var1);
      if(this.c()) {
         var1.c("Silent", this.c());
      }

      if(this.j()) {
         var1.c("NoGravity", this.j());
      }

      if(this.hP) {
         var1.c("Glowing", this.hP);
      }

      if(!this.e.isEmpty()) {
         net.nj.h var2 = new net.nj.h();

         for(String var4 : this.e) {
            var2.m(new net.nj.y(var4));
         }

         var1.K("Tags", var2);
      }

      this.I(var1);
      if(this.t()) {
         net.nj.h var6 = new net.nj.h();

         for(l var8 : this.H()) {
            net.nj.f var5 = new net.nj.f();
            if(var8.k(var5)) {
               var6.m(var5);
            }
         }

         if(!var6.N()) {
            var1.K("Passengers", var6);
         }
      }

      return var1;
   }

   public void B(net.nj.f var1) {
      net.nj.h var2 = var1.A("Pos", 6);
      net.nj.h var3 = var1.A("Motion", 6);
      net.nj.h var4 = var1.A("Rotation", 5);
      this.hf = var3.U(0);
      this.K = var3.U(1);
      this.J = var3.U(2);
      if(Math.abs(this.hf) > 10.0D) {
         this.hf = 0.0D;
      }

      if(Math.abs(this.K) > 10.0D) {
         this.K = 0.0D;
      }

      if(Math.abs(this.J) > 10.0D) {
         this.J = 0.0D;
      }

      this.b = var2.U(0);
      this.hS = var2.U(1);
      this.hr = var2.U(2);
      this.hL = this.b;
      this.F = this.hS;
      this.A = this.hr;
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      this.hN = var4.h(0);
      this.V = var4.h(1);
      this.hq = this.hN;
      this.d = this.V;
      this.A(this.hN);
      this.X(this.hN);
      this.hI = var1.S("FallDistance");
      this.c = var1.E("Fire");
      this.J(var1.E("Air"));
      this.k = var1.i("OnGround");
      if(var1.G("Dimension")) {
         this.y = var1.P("Dimension");
      }

      this.O = var1.i("Invulnerable");
      this.hH = var1.P("PortalCooldown");
      if(var1.H("UUID")) {
         this.z = var1.R("UUID");
         this.B = this.z.toString();
      }

      this.t(this.b, this.hS, this.hr);
      this.r(this.hN, this.V);
      if(var1.K("CustomName", 8)) {
         this.K(var1.J("CustomName"));
      }

      this.r(var1.i("CustomNameVisible"));
      this.T.S(var1);
      this.w(var1.i("Silent"));
      this.I(var1.i("NoGravity"));
      this.o(var1.i("Glowing"));
      if(var1.K("Tags", 9)) {
         this.e.clear();
         net.nj.h var5 = var1.A("Tags", 8);
         int var6 = Math.min(var5.z(), 1024);

         for(int var7 = 0; var7 < var6; ++var7) {
            this.e.add(var5.w(var7));
         }
      }

      this.o(var1);
      if(this.g()) {
         this.t(this.b, this.hS, this.hr);
      }

   }

   protected boolean g() {
      return true;
   }

   @Nullable
   protected final String v() {
      m_ var1 = v.K(this);
      return null;
   }

   protected abstract void o(net.nj.f var1);

   protected abstract void I(net.nj.f var1);

   protected net.nj.h p(double... var1) {
      net.nj.h var2 = new net.nj.h();

      for(double var6 : var1) {
         var2.m(new net.nj.v(var6));
      }

      return var2;
   }

   protected net.nj.h o(float... var1) {
      net.nj.h var2 = new net.nj.h();

      for(float var6 : var1) {
         var2.m(new net.nj.j(var6));
      }

      return var2;
   }

   @Nullable
   public net.nm.i S(net.n0.y var1, int var2) {
      return this.v(var1, var2, 0.0F);
   }

   @Nullable
   public net.nm.i v(net.n0.y var1, int var2, float var3) {
      return this.O(new ks(var1, var2, 0), var3);
   }

   @Nullable
   public net.nm.i O(ks var1, float var2) {
      if(var1.B()) {
         return null;
      } else {
         net.nm.i var3 = new net.nm.i(this.hl, this.b, this.hS + (double)var2, this.hr, var1);
         var3.b();
         this.hl.S(var3);
         return var3;
      }
   }

   public boolean P() {
      return !this.Z;
   }

   public boolean A() {
      if(this.r) {
         return false;
      } else {
         net.u.j var1 = net.u.j.u();
         int var2 = 0;

         while(true) {
            int var3 = net.u.t.L(this.hS + (double)(((float)((var2 >> 0) % 2) - 0.5F) * 0.1F) + (double)this.A());
            int var4 = net.u.t.L(this.b + (double)(((float)((var2 >> 1) % 2) - 0.5F) * this.h9 * 0.8F));
            int var5 = net.u.t.L(this.hr + (double)(((float)((var2 >> 2) % 2) - 0.5F) * this.h9 * 0.8F));
            if(var1.t() != var4 || var1.h() != var3 || var1.y() != var5) {
               var1.c(var4, var3, var5);
               if(this.hl.Z(var1).b()) {
                  var1.T();
                  return true;
               }
            }

            ++var2;
         }
      }
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      return false;
   }

   @Nullable
   public net.u.e a(l var1) {
      return null;
   }

   public void C() {
      l var1 = this.D();
      if(this.M() && var1.Z) {
         this.O();
      } else {
         this.hf = 0.0D;
         this.K = 0.0D;
         this.J = 0.0D;
         this.A();
         if(this.M()) {
            var1.F(this);
         }
      }

   }

   public void F(l var1) {
      if(this.m(var1)) {
         var1.t(this.b, this.hS + this.e() + var1.O(), this.hr);
      }

   }

   public void k(l var1) {
   }

   public double O() {
      return 0.0D;
   }

   public double e() {
      return (double)this.m * 0.75D;
   }

   public boolean W(l var1) {
      return this.E(var1, false);
   }

   public boolean E(l var1, boolean var2) {
      for(l var3 = var1; var3.X != null; var3 = var3.X) {
         if(var3.X == this) {
            return false;
         }
      }

      if(this.P(var1) && var1.C(this)) {
         if(this.M()) {
            this.O();
         }

         this.X = var1;
         this.X.N(this);
         return true;
      } else {
         return false;
      }
   }

   protected boolean P(l var1) {
      return this.hT <= 0;
   }

   public void Y() {
      int var1 = this.hM.size() - 1;

      while(true) {
         ((l)this.hM.get(var1)).O();
         --var1;
      }
   }

   public void O() {
      if(this.X != null) {
         l var1 = this.X;
         this.X = null;
         var1.j(this);
      }

   }

   protected void N(l var1) {
      if(var1.D() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if(!this.hl.x && var1 instanceof net.r.r && !(this.C() instanceof net.r.r)) {
            this.hM.add(0, var1);
         } else {
            this.hM.add(var1);
         }

      }
   }

   protected void j(l var1) {
      if(var1.D() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         this.hM.remove(var1);
         var1.hT = 60;
      }
   }

   protected boolean C(l var1) {
      return this.H().size() < 1;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.t(var1, var3, var5);
      this.r(var7, var8);
   }

   public float t() {
      return 0.0F;
   }

   public net.u.r g() {
      return z(this.V, this.hN);
   }

   public net.u.x h() {
      return new net.u.x(this.V, this.hN);
   }

   public net.u.r y() {
      return net.u.r.W(this.h());
   }

   public void k(net.u.j var1) {
      if(this.hH > 0) {
         this.hH = this.S();
      } else {
         if(!this.hl.x && !var1.equals(this.R)) {
            this.R = new net.u.j(var1);
            net.cw.t var2 = net.nb.f.uJ.I(this.hl, this.R);
            double var3 = var2.q().r() == aq.l.X?(double)var2.W().y():(double)var2.W().t();
            double var5 = var2.q().r() == aq.l.X?this.hr:this.b;
            var5 = Math.abs(net.u.t.b(var5 - (double)(var2.q().R().i() == aq.n.NEGATIVE?1:0), var3, var3 - (double)var2.J()));
            double var7 = net.u.t.b(this.hS - 1.0D, (double)var2.W().h(), (double)(var2.W().h() - var2.I()));
            this.hZ = new net.u.r(var5, var7, 0.0D);
            this.s = var2.q();
         }

         this.n = true;
      }

   }

   public int S() {
      return 300;
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
   }

   public void R(byte var1) {
   }

   public void I() {
   }

   public Iterable g() {
      return hp;
   }

   public Iterable J() {
      return hp;
   }

   public Iterable p() {
      return Iterables.concat(this.g(), this.J());
   }

   public void u(z2 var1, ks var2) {
   }

   public boolean a() {
      boolean var1 = this.hl != null && this.hl.x;
      return !this.hw && (this.c > 0 || this.J(0));
   }

   public boolean M() {
      return this.D() != null;
   }

   public boolean t() {
      return !this.H().isEmpty();
   }

   public boolean Q() {
      return this.J(1);
   }

   public void K(boolean var1) {
      this.I(1, var1);
   }

   public boolean B() {
      return this.J(3);
   }

   public void j(boolean var1) {
      this.I(3, var1);
   }

   public boolean o() {
      return this.hP || this.hl.x && this.J(6);
   }

   public void o(boolean var1) {
      this.hP = var1;
      if(!this.hl.x) {
         this.I(6, this.hP);
      }

   }

   public boolean e() {
      return this.J(5);
   }

   public boolean d(net.r.r var1) {
      if(var1.VX()) {
         return false;
      } else {
         net.nc.m var2 = this.f();
         return (var1.f() != var2 || !var2.e()) && this.e();
      }
   }

   @Nullable
   public net.nc.m f() {
      return this.hl.J().A(this.r());
   }

   public boolean M(l var1) {
      return this.L(var1.f());
   }

   public boolean L(net.nc.m var1) {
      return this.f() != null && this.f().w(var1);
   }

   public void i(boolean var1) {
      this.I(5, var1);
   }

   protected boolean J(int var1) {
      return (((Byte)this.G.a(hy)).byteValue() & 1 << var1) != 0;
   }

   protected void I(int var1, boolean var2) {
      byte var3 = ((Byte)this.G.a(hy)).byteValue();
      this.G.d(hy, Byte.valueOf((byte)(var3 | 1 << var1)));
   }

   public int b() {
      return ((Integer)this.G.a(v)).intValue();
   }

   public void J(int var1) {
      this.G.d(v, Integer.valueOf(var1));
   }

   public void j(net.yi.e var1) {
      this.H(net.yz.z.i, 5.0F);
      ++this.c;
      if(this.c == 0) {
         this.n(8);
      }

   }

   public void M(a var1) {
   }

   protected boolean c(double var1, double var3, double var5) {
      net.u.j var7 = new net.u.j(var1, var3, var5);
      double var8 = var1 - (double)var7.t();
      double var10 = var3 - (double)var7.h();
      double var12 = var5 - (double)var7.y();
      if(!this.hl.v(this.i())) {
         return false;
      } else {
         aq var14 = aq.UP;
         double var15 = Double.MAX_VALUE;
         if(!this.hl.E(var7.H()) && var8 < var15) {
            var15 = var8;
            var14 = aq.WEST;
         }

         if(!this.hl.E(var7.g()) && 1.0D - var8 < var15) {
            var15 = 1.0D - var8;
            var14 = aq.EAST;
         }

         if(!this.hl.E(var7.D()) && var12 < var15) {
            var15 = var12;
            var14 = aq.NORTH;
         }

         if(!this.hl.E(var7.d()) && 1.0D - var12 < var15) {
            var15 = 1.0D - var12;
            var14 = aq.SOUTH;
         }

         if(!this.hl.E(var7.h()) && 1.0D - var10 < var15) {
            var15 = 1.0D - var10;
            var14 = aq.UP;
         }

         float var17 = this.p.nextFloat() * 0.2F + 0.1F;
         float var18 = (float)var14.i().q();
         if(var14.r() == aq.l.X) {
            this.hf = (double)(var18 * var17);
            this.K *= 0.75D;
            this.J *= 0.75D;
         } else if(var14.r() == aq.l.Y) {
            this.hf *= 0.75D;
            this.K = (double)(var18 * var17);
            this.J *= 0.75D;
         } else if(var14.r() == aq.l.Z) {
            this.hf *= 0.75D;
            this.K *= 0.75D;
            this.J = (double)(var18 * var17);
         }

         return true;
      }
   }

   public void K() {
      this.L = true;
      this.hI = 0.0F;
   }

   public String Q() {
      if(this.H()) {
         return this.X();
      } else {
         String var1 = v.h(this);
         var1 = "generic";
         return net.yq.e.E("entity." + var1 + ".name");
      }
   }

   @Nullable
   public l[] T() {
      return null;
   }

   public boolean Z(l var1) {
      return this == var1;
   }

   public float X() {
      return 0.0F;
   }

   public void A(float var1) {
   }

   public void X(float var1) {
   }

   public boolean C() {
      return true;
   }

   public boolean U(l var1) {
      return false;
   }

   public String toString() {
      return String.format("%s[\'%s\'/%d, l=\'%s\', x=%.2f, y=%.2f, z=%.2f]", new Object[]{this.getClass().getSimpleName(), this.Q(), Integer.valueOf(this.S), this.hl == null?"~NULL~":this.hl.B().M(), Double.valueOf(this.b), Double.valueOf(this.hS), Double.valueOf(this.hr)});
   }

   public boolean w(net.yz.z var1) {
      return this.O && var1 != net.yz.z.s && !var1.Q();
   }

   public boolean s() {
      return this.O;
   }

   public void T(boolean var1) {
      this.O = var1;
   }

   public void e(l var1) {
      this.S(var1.b, var1.hS, var1.hr, var1.hN, var1.V);
   }

   private void u(l var1) {
      net.nj.f var2 = var1.G(new net.nj.f());
      var2.A("Dimension");
      this.B(var2);
      this.hH = var1.hH;
      this.R = var1.R;
      this.hZ = var1.hZ;
      this.s = var1.s;
   }

   @Nullable
   public l V(int var1) {
      if(!this.hl.x && !this.Z) {
         this.hl.M.K("changeDimension");
         net.nx.f var2 = this.E();
         int var3 = this.y;
         net.yv.d var4 = var2.n(var3);
         net.yv.d var5 = var2.n(var1);
         this.y = var1;
         if(var3 == 1 && var1 == 1) {
            var5 = var2.n(0);
            this.y = 0;
         }

         this.hl.W(this);
         this.Z = false;
         this.hl.M.K("reposition");
         net.u.j var6;
         if(var1 == 1) {
            var6 = var5.q();
         } else {
            double var7 = this.b;
            double var9 = this.hr;
            double var10000 = 8.0D;
            if(var1 == -1) {
               var7 = net.u.t.F(var7 / 8.0D, var5.T().S() + 16.0D, var5.T().M() - 16.0D);
               var9 = net.u.t.F(var9 / 8.0D, var5.T().U() + 16.0D, var5.T().Z() - 16.0D);
            } else {
               var7 = net.u.t.F(var7 * 8.0D, var5.T().S() + 16.0D, var5.T().M() - 16.0D);
               var9 = net.u.t.F(var9 * 8.0D, var5.T().U() + 16.0D, var5.T().Z() - 16.0D);
            }

            var7 = (double)net.u.t.g((int)var7, -29999872, 29999872);
            var9 = (double)net.u.t.g((int)var9, -29999872, 29999872);
            float var13 = this.hN;
            this.S(var7, this.hS, var9, 90.0F, 0.0F);
            net.yv.n var14 = var5.A();
            var14.t(this, var13);
            var6 = new net.u.j(this);
         }

         var4.s(this, false);
         this.hl.M.F("reloading");
         l var17 = v.U(this.getClass(), var5);
         var17.u(this);
         if(var3 == 1 && var1 == 1) {
            net.u.j var8 = var5.D(var5.y());
            var17.L(var8, var17.hN, var17.V);
         } else {
            var17.L(var6, var17.hN, var17.V);
         }

         boolean var18 = var17.hK;
         var17.hK = true;
         var5.S(var17);
         var17.hK = var18;
         var5.s(var17, false);
         this.Z = true;
         this.hl.M.N();
         var4.w();
         var5.w();
         this.hl.M.N();
         return var17;
      } else {
         return null;
      }
   }

   public boolean S() {
      return true;
   }

   public float x(net.yv.u var1, net.yv.r var2, net.u.j var3, net.yw.n var4) {
      return var4.Q().b(this);
   }

   public boolean Z(net.yv.u var1, net.yv.r var2, net.u.j var3, net.yw.n var4, float var5) {
      return true;
   }

   public int q() {
      return 3;
   }

   public net.u.r N() {
      return this.hZ;
   }

   public aq Q() {
      return this.s;
   }

   public boolean v() {
      return false;
   }

   public void x(net.d.l var1) {
      var1.L("Entity Type", new net.d.t() {
         public String F() throws Exception {
            return v.K(l.this) + " (" + l.this.getClass().getCanonicalName() + ")";
         }
      });
      var1.e("Entity ID", Integer.valueOf(this.S));
      var1.L("Entity Name", new net.d.t() {
         public String k() throws Exception {
            return l.this.Q();
         }
      });
      var1.e("Entity\'s Exact location", String.format("%.2f, %.2f, %.2f", new Object[]{Double.valueOf(this.b), Double.valueOf(this.hS), Double.valueOf(this.hr)}));
      var1.e("Entity\'s Block location", net.d.l.U(net.u.t.L(this.b), net.u.t.L(this.hS), net.u.t.L(this.hr)));
      var1.e("Entity\'s Momentum", String.format("%.2f, %.2f, %.2f", new Object[]{Double.valueOf(this.hf), Double.valueOf(this.K), Double.valueOf(this.J)}));
      var1.L("Entity\'s Passengers", new net.d.t() {
         public String d() throws Exception {
            return l.this.H().toString();
         }
      });
      var1.L("Entity\'s Vehicle", new net.d.t() {
         public String n() throws Exception {
            return l.this.D().toString();
         }
      });
   }

   public boolean G() {
      return this.a();
   }

   public void k(UUID var1) {
      this.z = var1;
      this.B = this.z.toString();
   }

   public UUID O() {
      return this.z;
   }

   public String r() {
      return this.B;
   }

   public boolean i() {
      return true;
   }

   public static double v() {
      return hB;
   }

   public static void y(double var0) {
      hB = var0;
   }

   public net.cb.t b() {
      net.cb.l var1 = new net.cb.l(net.nc.y.s(this.f(), this.Q()));
      var1.E().G(this.Y());
      var1.E().H(this.r());
      return var1;
   }

   public void K(String var1) {
      this.G.d(hs, var1);
   }

   public String X() {
      return (String)this.G.a(hs);
   }

   public boolean H() {
      return !((String)this.G.a(hs)).isEmpty();
   }

   public void r(boolean var1) {
      this.G.d(hC, Boolean.valueOf(var1));
   }

   public boolean y() {
      return ((Boolean)this.G.a(hC)).booleanValue();
   }

   public void a(double var1, double var3, double var5) {
      this.g = true;
      this.S(var1, var3, var5, this.hN, this.V);
      this.hl.s(this, false);
   }

   public boolean z() {
      return this.y();
   }

   public void O(net.k.v var1) {
   }

   public aq V() {
      return aq.Q(net.u.t.L((double)(this.hN * 4.0F / 360.0F) + 0.5D) & 3);
   }

   public aq C() {
      return this.V();
   }

   protected net.n6.o Y() {
      net.nj.f var1 = new net.nj.f();
      m_ var2 = v.K(this);
      var1.b("id", this.r());
      var1.b("type", var2.toString());
      var1.b("name", this.Q());
      return new net.n6.o(net.n6.o.SHOW_ENTITY, new net.cb.l(var1.toString()));
   }

   public boolean b(net.r.h var1) {
      return true;
   }

   public net.u.e i() {
      return this.H;
   }

   public net.u.e S() {
      return this.i();
   }

   public void g(net.u.e var1) {
      this.H = var1;
   }

   public float A() {
      return this.m * 0.85F;
   }

   public boolean Y() {
      return this.q;
   }

   public void M(boolean var1) {
      this.q = var1;
   }

   public boolean K(int var1, ks var2) {
      return false;
   }

   public void r(net.cb.t var1) {
   }

   public boolean n(int var1, String var2) {
      return true;
   }

   public net.u.j z() {
      return new net.u.j(this.b, this.hS + 0.5D, this.hr);
   }

   public net.u.r A() {
      return new net.u.r(this.b, this.hS, this.hr);
   }

   public net.yv.r T() {
      return this.hl;
   }

   public l P() {
      return this;
   }

   public boolean x() {
      return false;
   }

   public void n(net.nv.l var1, int var2) {
      if(this.hl != null && !this.hl.x) {
         this.T.b(this.hl.v(), this, var1, var2);
      }

   }

   @Nullable
   public net.nx.f E() {
      return this.hl.v();
   }

   public net.nv.l w() {
      return this.T;
   }

   public void S(l var1) {
      this.T.M(var1.w());
   }

   public ad v(net.r.r var1, net.u.r var2, net.yz.k var3) {
      return ad.PASS;
   }

   public boolean T() {
      return false;
   }

   protected void q(a var1, l var2) {
      if(var2 instanceof a) {
         net.c1.y.f((a)((a)var2), (l)var1);
      }

      net.c1.y.Z(var1, var2);
   }

   public void b(net.r.h var1) {
   }

   public void Q(net.r.h var1) {
   }

   public float q(net.yz.l var1) {
      float var2 = net.u.t.k(this.hN);
      switch(null.n[var1.ordinal()]) {
      case 1:
         return var2 + 180.0F;
      case 2:
         return var2 + 270.0F;
      case 3:
         return var2 + 90.0F;
      default:
         return var2;
      }
   }

   public float r(ax var1) {
      float var2 = net.u.t.k(this.hN);
      switch(null.i[var1.ordinal()]) {
      case 1:
         return -var2;
      case 2:
         return 180.0F - var2;
      default:
         return var2;
      }
   }

   public boolean O() {
      return false;
   }

   public boolean n() {
      boolean var1 = this.g;
      this.g = false;
      return var1;
   }

   @Nullable
   public l C() {
      return null;
   }

   public List H() {
      return (List)(this.hM.isEmpty()?Collections.emptyList():Lists.newArrayList(this.hM));
   }

   public boolean m(l var1) {
      for(l var3 : this.H()) {
         if(var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public Collection m() {
      HashSet var1 = Sets.newHashSet();
      this.T(l.class, var1);
      return var1;
   }

   public Collection P(Class var1) {
      HashSet var2 = Sets.newHashSet();
      this.T(var1, var2);
      return var2;
   }

   private void T(Class var1, Set var2) {
      for(l var4 : this.H()) {
         if(var1.isAssignableFrom(var4.getClass())) {
            var2.add(var4);
         }

         var4.T(var1, var2);
      }

   }

   public l o() {
      l var1;
      for(var1 = this; var1.M(); var1 = var1.D()) {
         ;
      }

      return var1;
   }

   public boolean i(l var1) {
      return this.o() == var1.o();
   }

   public boolean B(l var1) {
      for(l var3 : this.H()) {
         if(var3.equals(var1)) {
            return true;
         }

         if(var3.B(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean V() {
      l var1 = this.C();
      return var1 instanceof net.r.r?((net.r.r)var1).VV():!this.hl.x;
   }

   @Nullable
   public l D() {
      return this.X;
   }

   public net.y1.v J() {
      return net.y1.v.NORMAL;
   }

   public net.yz.p E() {
      return net.yz.p.NEUTRAL;
   }

   protected int I() {
      return 1;
   }

   static {
      z(false);
   }

   public static void z(boolean var0) {
      h4 = var0;
   }

   public static boolean m() {
      return h4;
   }

   public static boolean d() {
      boolean var0 = m();
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
