package net.nb;

import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.UUID;
import net.wg;
import net.xn;
import net.c1.c;
import net.n0.ks;
import net.n0.kw;
import net.n0.y4;
import net.n0.yv;
import net.n1.g;
import net.n1.o;
import net.n1.s;
import net.n4.i;
import net.n4.k;
import net.n4.v;
import net.n4.y;
import net.nb.f;
import net.nb.j;
import net.nb.l;
import net.ne.a;
import net.ne.bl;
import net.ni.p;
import net.ni.s0;
import net.nj.e;
import net.nm.n;
import net.v.q;
import net.y9.g5;
import net.y9.l3;
import net.y9.r2;
import net.y9.rg;
import net.y9.rm;
import net.y9.rp;
import net.y9.zz;
import net.yv.r;
import net.yz.a7;
import net.yz.an;
import net.yz.aq;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z {
   public static final PrintStream N = System.out;
   private static boolean T;
   public static boolean z;
   private static final Logger k = LogManager.getLogger();
   private static boolean x;

   public static boolean o() {
      return T;
   }

   static void a() {
      zz.f.H(j.W_, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            net.n1.b var4 = new net.n1.b(var1, var2.e(), var2.A(), var2.x());
            var4.kc = o.s.ALLOWED;
            return var4;
         }
      });
      zz.f.H(j.l, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            net.n1.b var4 = new net.n1.b(var1, var2.e(), var2.A(), var2.x());
            var4.b(var3);
            var4.kc = o.s.ALLOWED;
            return var4;
         }
      });
      zz.f.H(j.WT, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            net.n1.l var4 = new net.n1.l(var1, var2.e(), var2.A(), var2.x());
            var4.kc = o.s.ALLOWED;
            return var4;
         }
      });
      zz.f.H(j.YV, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            return new s(var1, var2.e(), var2.A(), var2.x());
         }
      });
      zz.f.H(j.f, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            return new net.n1.x(var1, var2.e(), var2.A(), var2.x());
         }
      });
      zz.f.H(j.Yg, new v() {
         protected bl A(r var1, net.n4.h var2, ks var3) {
            return new net.nm.h(var1, var2.e(), var2.A(), var2.x());
         }

         protected float M() {
            return super.M() * 0.5F;
         }

         protected float o() {
            return super.o() * 1.25F;
         }
      });
      zz.f.H(j.YD, new k() {
         public ks M(i var1, final ks var2) {
            return (new v() {
               protected bl A(r var1, net.n4.h var2x, ks var3) {
                  return new g(var1, var2x.e(), var2x.A(), var2x.x(), var2.s());
               }

               protected float M() {
                  return super.M() * 0.5F;
               }

               protected float o() {
                  return super.o() * 1.25F;
               }
            }).M(var1, var2);
         }
      });
      zz.f.H(j.Wg, new k() {
         public ks M(i var1, final ks var2) {
            return (new v() {
               protected bl A(r var1, net.n4.h var2x, ks var3) {
                  return new g(var1, var2x.e(), var2x.A(), var2x.x(), var2.s());
               }

               protected float M() {
                  return super.M() * 0.5F;
               }

               protected float o() {
                  return super.o() * 1.25F;
               }
            }).M(var1, var2);
         }
      });
      zz.f.H(j.N, new y() {
         public ks B(i var1, ks var2) {
            aq var4 = (aq)var1.K().i(zz.H);
            net.nb.z.d();
            double var5 = var1.e() + (double)var4.v();
            double var7 = (double)((float)(var1.X().h() + var4.z()) + 0.2F);
            double var9 = var1.x() + (double)var4.P();
            net.ne.l var11 = yv.E(var1.v(), yv.F(var2), var5, var7, var9);
            if(var11 instanceof a && var2.v()) {
               var11.K(var2.j());
            }

            yv.v(var1.v(), (net.r.r)null, var2, var11);
            var2.H(1);
            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(j.Wp, new y() {
         public ks B(i var1, ks var2) {
            aq var3 = (aq)var1.K().i(zz.H);
            double var4 = var1.e() + (double)var3.v();
            double var6 = (double)((float)var1.X().h() + 0.2F);
            double var8 = var1.x() + (double)var3.P();
            n var10 = new n(var1.v(), var4, var6, var8, var2);
            var1.v().S(var10);
            var2.H(1);
            return var2;
         }

         protected void Q(i var1) {
            var1.v().s(1004, var1.X(), 0);
         }
      });
      zz.f.H(j.Yu, new y() {
         public ks B(i var1, ks var2) {
            aq var4 = (aq)var1.K().i(zz.H);
            net.nb.z.x;
            net.n4.h var5 = zz.S(var1);
            double var6 = var5.e() + (double)((float)var4.v() * 0.3F);
            double var8 = var5.A() + (double)((float)var4.z() * 0.3F);
            double var10 = var5.x() + (double)((float)var4.P() * 0.3F);
            r var12 = var1.v();
            Random var13 = var12.G;
            double var14 = var13.nextGaussian() * 0.05D + (double)var4.v();
            double var16 = var13.nextGaussian() * 0.05D + (double)var4.z();
            double var18 = var13.nextGaussian() * 0.05D + (double)var4.P();
            var12.S(new net.n1.u(var12, var6, var8, var10, var14, var16, var18));
            var2.H(1);
            if(net.u.d.y() == null) {
               net.nb.z.x = false;
            }

            return var2;
         }

         protected void Q(i var1) {
            var1.v().s(1018, var1.X(), 0);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      I();
      zz.f.H(j.Yb, new net.nb.z(net.nm.b.OAK));
      zz.f.H(j.M, new net.nb.z(net.nm.b.SPRUCE));
      zz.f.H(j.S, new net.nb.z(net.nm.b.BIRCH));
      zz.f.H(j.Yx, new net.nb.z(net.nm.b.JUNGLE));
      zz.f.H(j.Wf, new net.nb.z(net.nm.b.DARK_OAK));
      zz.f.H(j.d, new net.nb.z(net.nm.b.ACACIA));
      y var1 = new y() {
         private final y S = new y();

         public ks B(i var1, ks var2) {
            net.n0.i var3 = (net.n0.i)var2.Z();
            net.u.j var4 = var1.X().C((aq)var1.K().i(zz.H));
            return var3.k((net.r.r)null, var1.v(), var4)?new ks(j.YF):this.S.M(var1, var2);
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      zz.f.H(j.T, var1);
      zz.f.H(j.Wb, var1);
      zz.f.H(j.YF, new y() {
         private final y O = new y();

         public ks B(i var1, ks var2) {
            r var4 = var1.v();
            net.nb.z.d();
            net.u.j var5 = var1.X().C((aq)var1.K().i(zz.H));
            net.yw.n var6 = var4.Z(var5);
            net.y9.l var7 = var6.Q();
            net.y1.l var8 = var6.n();
            if(net.y1.l.p.equals(var8) && var7 instanceof g5 && ((Integer)var6.i(g5.J)).intValue() == 0) {
               net.n0.y var9 = j.Wb;
            }

            if(net.y1.l.U.equals(var8) && var7 instanceof g5 && ((Integer)var6.i(g5.J)).intValue() == 0) {
               net.n0.y var10 = j.T;
               var4.J(var5);
               var2.H(1);
               if(var2.B()) {
                  return new ks(var10);
               } else {
                  if(((p)var1.L()).t(new ks(var10)) < 0) {
                     this.O.M(var1, new ks(var10));
                  }

                  return var2;
               }
            } else {
               return super.B(var1, var2);
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(j.YU, new net.nb.z() {
         protected ks B(i var1, ks var2) {
            r var4 = var1.v();
            net.nb.z.d();
            this.y = true;
            net.u.j var5 = var1.X().C((aq)var1.K().i(zz.H));
            if(var4.y(var5)) {
               var4.U(var5, f.g.p());
               if(!var2.M(1, var4.G, (net.r.h)null)) {
                  return var2;
               }

               var2.u(0);
            }

            if(var4.Z(var5).Q() == f.T7) {
               f.T7.N(var4, var5, f.T7.p().s(l3.R, Boolean.valueOf(true)));
               var4.J(var5);
            }

            this.y = false;
            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(j.n, new net.nb.z() {
         protected ks B(i var1, ks var2) {
            boolean var3 = net.nb.z.d();
            this.y = true;
            if(kw.WHITE != kw.q(var2.n())) {
               return super.B(var1, var2);
            } else {
               r var4 = var1.v();
               net.u.j var5 = var1.X().C((aq)var1.K().i(zz.H));
               if(y4.W(var2, var4, var5)) {
                  if(var4.x) {
                     return var2;
                  }

                  var4.s(2005, var5, 0);
               }

               this.y = false;
               return var2;
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(net.n0.y.q(f.T7), new y() {
         protected ks B(i var1, ks var2) {
            r var3 = var1.v();
            net.u.j var4 = var1.X().C((aq)var1.K().i(zz.H));
            net.nm.k var5 = new net.nm.k(var3, (double)var4.t() + 0.5D, (double)var4.h(), (double)var4.y() + 0.5D, (a)null);
            var3.S(var5);
            var3.L((net.r.r)null, var5.b, var5.hS, var5.hr, l.H8, net.yz.p.BLOCKS, 1.0F, 1.0F);
            var2.H(1);
            return var2;
         }
      });
      zz.f.H(j.Y9, new net.nb.z() {
         protected ks B(i var1, ks var2) {
            r var4 = var1.v();
            aq var5 = (aq)var1.K().i(zz.H);
            net.u.j var6 = var1.X().C(var5);
            rp var7 = f.dB;
            net.nb.z.d();
            this.y = true;
            if(var4.y(var6) && var7.i(var4, var6, var2)) {
               if(var4.x) {
                  return var2;
               }

               var4.k(var6, var7.p().s(rp.N, aq.UP), 3);
               net.ni.v var8 = var4.L(var6);
               if(var8 instanceof s0) {
                  if(var2.n() == 3) {
                     GameProfile var9 = null;
                     if(var2.D()) {
                        net.nj.f var10 = var2.o();
                        if(var10.K("SkullOwner", 10)) {
                           var9 = e.g(var10.o("SkullOwner"));
                        } else if(var10.K("SkullOwner", 8)) {
                           String var11 = var10.J("SkullOwner");
                           if(!a7.Y(var11)) {
                              var9 = new GameProfile((UUID)null, var11);
                           }
                        }
                     }

                     ((s0)var8).B(var9);
                  }

                  ((s0)var8).M(var2.n());
                  ((s0)var8).T(var5.f().u() * 4);
                  f.dB.w(var4, var6, (s0)var8);
               }

               var2.H(1);
            }

            if(net.n0.j.N(var1, var2).B()) {
               this.y = false;
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(net.n0.y.q(f.TS), new net.nb.z() {
         protected ks B(i var1, ks var2) {
            r var4 = var1.v();
            net.nb.z.x;
            net.u.j var5 = var1.X().C((aq)var1.K().i(zz.H));
            rm var6 = (rm)f.TS;
            this.y = true;
            if(var4.y(var5) && var6.V(var4, var5)) {
               if(!var4.x) {
                  var4.k(var5, var6.p(), 3);
               }

               var2.H(1);
            }

            ks var7 = net.n0.j.N(var1, var2);
            if(var7.B()) {
               this.y = false;
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      kw[] var2 = kw.values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         kw var5 = var2[var4];
         zz.f.H(net.n0.y.q(r2.j(var5)), new net.nb.z());
         ++var4;
         net.u.d.h(new net.u.d[2]);
      }

   }

   public static void r() {
      boolean var0 = I();
      if(!T) {
         T = true;
         A();
         net.yz.a.c();
         net.y9.l.R();
         rg.N();
         net.n_.f.n();
         c.A();
         net.n0.y.r();
         net.n_.b.r();
         net.n_.j.a();
         net.ne.v.s();
         net.ns.i.J();
         a();
         if(!net.cr.n.q()) {
            z = true;
            k.error("Errors with built-in recipes!");
         }

         q.l();
         if(k.isDebugEnabled()) {
            if((new wg((File)null)).j()) {
               z = true;
               k.error("Errors with built-in advancements!");
            }

            if(!net.y7.p.c()) {
               z = true;
               k.error("Errors with built-in loot tables");
            }
         }
      }

   }

   private static void A() {
      if(k.isDebugEnabled()) {
         System.setErr(new net.nx.x("STDERR", System.err));
         System.setOut(new net.nx.x("STDOUT", N));
      } else {
         System.setErr(new an("STDERR", System.err));
         System.setOut(new an("STDOUT", N));
      }

   }

   public static void n(String var0) {
      N.println(var0);
   }

   static {
      h(false);
   }

   public static void h(boolean var0) {
      x = var0;
   }

   public static boolean I() {
      return x;
   }

   public static boolean d() {
      boolean var0 = I();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public abstract static class d extends y {
      protected boolean y = true;

      protected void Q(i var1) {
         boolean var2 = net.nb.z.x;
         var1.v().s(this.y?1000:1001, var1.X(), 0);
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class h extends y {
      private final y v = new y();
      private final net.nm.b y;

      public h(net.nm.b var1) {
         this.y = var1;
      }

      public ks B(i var1, ks var2) {
         net.nb.z.d();
         aq var4 = (aq)var1.K().i(zz.H);
         r var5 = var1.v();
         double var6 = var1.e() + (double)((float)var4.v() * 1.125F);
         double var8 = var1.A() + (double)((float)var4.z() * 1.125F);
         double var10 = var1.x() + (double)((float)var4.P() * 1.125F);
         net.u.j var12 = var1.X().C(var4);
         net.y1.l var13 = var5.Z(var12).n();
         if(net.y1.l.p.equals(var13)) {
            double var14 = 1.0D;
         }

         if(net.y1.l.q.equals(var13) && net.y1.l.p.equals(var5.Z(var12.b()).n())) {
            double var17 = 0.0D;
            net.nm.b var16 = new net.nm.b(var5, var6, var8 + var17, var10);
            var16.e(this.y);
            var16.hN = var4.F();
            var5.S(var16);
            var2.H(1);
            return var2;
         } else {
            return this.v.M(var1, var2);
         }
      }

      protected void Q(i var1) {
         var1.v().s(1000, var1.X(), 0);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class u extends net.nb.z {
      private u() {
      }

      protected ks B(i var1, ks var2) {
         net.y9.l var4 = net.y9.l.F(var2.Z());
         r var5 = var1.v();
         net.nb.z.x;
         aq var6 = (aq)var1.K().i(zz.H);
         net.u.j var7 = var1.X().C(var6);
         this.y = var5.j(var4, var7, false, aq.DOWN, (net.ne.l)null);
         if(this.y) {
            aq var8 = var5.y(var7.b())?var6:aq.UP;
            net.yw.n var9 = var4.p().s(r2.n, var8);
            var5.U(var7, var9);
            net.ni.v var10 = var5.L(var7);
            ks var11 = var2.w(1);
            if(var11.D()) {
               ((net.ni.e)var10).R(var11.o().o("BlockEntityTag"));
            }

            if(var11.v()) {
               ((net.ni.e)var10).b((String)var11.j());
            }

            var5.Z(var7, var9.Q());
         }

         return var2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
