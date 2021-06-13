package net.y4;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.kw;
import net.nk.fy;
import net.ns.i9;
import net.y4.b;
import net.y4.p;
import net.y4.v;
import net.y9.gc;
import net.y9.gp;
import net.y9.l2;
import net.y9.l7;
import net.y9.l_;
import net.y9.lg;
import net.y9.lo;
import net.y9.lt;
import net.y9.r9;
import net.yz.aq;

public class r {
   public static void q() {
      b.v(r.w.class, "ViBH");
      b.v(r.s.class, "ViDF");
      b.v(r.f.class, "ViF");
      b.v(r.o.class, "ViL");
      b.v(r.y.class, "ViPH");
      b.v(r.e.class, "ViSH");
      b.v(r.a.class, "ViSmH");
      b.v(r.p.class, "ViST");
      b.v(r.d.class, "ViS");
      b.v(r.g.class, "ViStart");
      b.v(r.u.class, "ViSR");
      b.v(r.i.class, "ViTRH");
      b.v(r.z.class, "ViW");
   }

   public static List A(Random var0, int var1) {
      ArrayList var3 = Lists.newArrayList();
      var3.add(new r.k(r.e.class, 4, net.u.t.A(var0, 2 + var1, 4 + var1 * 2)));
      var3.add(new r.k(r.p.class, 20, net.u.t.A(var0, 0 + var1, 1 + var1)));
      p.d();
      var3.add(new r.k(r.w.class, 20, net.u.t.A(var0, 0 + var1, 2 + var1)));
      var3.add(new r.k(r.a.class, 3, net.u.t.A(var0, 2 + var1, 5 + var1 * 3)));
      var3.add(new r.k(r.y.class, 15, net.u.t.A(var0, 0 + var1, 2 + var1)));
      var3.add(new r.k(r.s.class, 3, net.u.t.A(var0, 1 + var1, 4 + var1)));
      var3.add(new r.k(r.f.class, 3, net.u.t.A(var0, 2 + var1, 4 + var1 * 2)));
      var3.add(new r.k(r.d.class, 15, net.u.t.A(var0, 0, 1 + var1)));
      var3.add(new r.k(r.i.class, 8, net.u.t.A(var0, 0 + var1, 3 + var1 * 2)));
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         if(((r.k)var4.next()).R == 0) {
            var4.remove();
            break;
         }
      }

      return var3;
   }

   private static int B(List var0) {
      boolean var1 = false;
      int var2 = 0;

      for(r.k var4 : var0) {
         if(var4.R > 0 && var4.b < var4.R) {
            var1 = true;
         }

         var2 += var4.M;
      }

      return var2;
   }

   private static r.h L(r.g var0, r.k var1, List var2, Random var3, int var4, int var5, int var6, aq var7, int var8) {
      p.d();
      Class var10 = var1.G;
      Object var11 = null;
      if(var10 == r.e.class) {
         var11 = r.e.o(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.p.class) {
         var11 = r.p.H(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.w.class) {
         var11 = r.w.d(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.a.class) {
         var11 = r.a.A(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.y.class) {
         var11 = r.y.U(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.s.class) {
         var11 = r.s.L(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.f.class) {
         var11 = r.f.c(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.d.class) {
         var11 = r.d.K(var0, var2, var3, var4, var5, var6, var7, var8);
      } else if(var10 == r.i.class) {
         var11 = r.i.H(var0, var2, var3, var4, var5, var6, var7, var8);
      }

      return (r.h)var11;
   }

   private static r.h y(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      int var8 = B(var0.v);
      return null;
   }

   private static p t(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.J().i) <= 112 && Math.abs(var5 - var0.J().p) <= 112) {
         r.h var8 = y(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         var1.add(var8);
         var0.d.add(var8);
         return var8;
      } else {
         return null;
      }
   }

   private static p h(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
      if(var7 > 3 + var0.W) {
         return null;
      } else if(Math.abs(var3 - var0.J().i) <= 112 && Math.abs(var5 - var0.J().p) <= 112) {
         v var8 = r.u.H(var0, var1, var2, var3, var4, var5, var6);
         if(var8.D > 10) {
            r.u var9 = new r.u(var0, var7, var2, var8, var6);
            var1.add(var9);
            var0.x.add(var9);
            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class a extends r.h {
      private boolean j;
      private int Z;

      public a() {
      }

      public a(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
         this.j = var3.nextBoolean();
         this.Z = var3.nextInt(3);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("T", this.Z);
         var1.c("C", this.j);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.Z = var1.P("T");
         this.j = var1.i("C");
      }

      public static r.a A(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
         return H(var8) && p.H(var1, var8) == null?new r.a(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 6 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.oN.p());
         net.yw.n var7 = this.U(net.nb.f.uI.p().s(l_.F, aq.NORTH));
         net.yw.n var8 = this.U(net.nb.f.u6.p());
         net.yw.n var9 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 1, 1, 1, 3, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 0, 0, 3, 0, 4, var5, var5, false);
         this.E(var1, var3, 1, 0, 1, 2, 0, 3, net.nb.f.dl.p(), net.nb.f.dl.p(), false);
         if(this.j) {
            this.E(var1, var3, 1, 4, 1, 2, 4, 3, var8, var8, false);
         }

         this.E(var1, var3, 1, 5, 1, 2, 5, 3, var8, var8, false);
         this.N(var1, var8, 1, 4, 0, var3);
         this.N(var1, var8, 2, 4, 0, var3);
         this.N(var1, var8, 1, 4, 4, var3);
         this.N(var1, var8, 2, 4, 4, var3);
         this.N(var1, var8, 0, 4, 1, var3);
         this.N(var1, var8, 0, 4, 2, var3);
         this.N(var1, var8, 0, 4, 3, var3);
         this.N(var1, var8, 3, 4, 1, var3);
         this.N(var1, var8, 3, 4, 2, var3);
         this.N(var1, var8, 3, 4, 3, var3);
         this.E(var1, var3, 0, 1, 0, 0, 3, 0, var8, var8, false);
         this.E(var1, var3, 3, 1, 0, 3, 3, 0, var8, var8, false);
         this.E(var1, var3, 0, 1, 4, 0, 3, 4, var8, var8, false);
         this.E(var1, var3, 3, 1, 4, 3, 3, 4, var8, var8, false);
         this.E(var1, var3, 0, 1, 1, 0, 3, 3, var6, var6, false);
         this.E(var1, var3, 3, 1, 1, 3, 3, 3, var6, var6, false);
         this.E(var1, var3, 1, 1, 0, 2, 3, 0, var6, var6, false);
         this.E(var1, var3, 1, 1, 4, 2, 3, 4, var6, var6, false);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 3, 2, 2, var3);
         if(this.Z > 0) {
            this.N(var1, var9, this.Z, 1, 3, var3);
            this.N(var1, net.nb.f.dp.p(), this.Z, 2, 3, var3);
         }

         this.N(var1, net.nb.f.ou.p(), 1, 1, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 1, 2, 0, var3);
         this.a(var1, var3, var2, 1, 1, 0, aq.NORTH);
         if(this.r(var1, 1, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 1, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var7, 1, 0, -1, var3);
            if(this.r(var1, 1, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 1, -1, -1, var3);
            }
         }

         int var10 = 0;
         int var11 = 0;
         this.T(var1, var11, 6, var10, var3);
         this.X(var1, var5, var11, -1, var10, var3);
         ++var11;
         ++var10;
         this.c(var1, var3, 1, 1, 2, 1);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public abstract static class c extends r.h {
      public c() {
      }

      protected c(r.g var1, int var2) {
         super(var1, var2);
      }
   }

   public static class d extends r.h {
      private boolean K;

      public d() {
      }

      public d(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static r.d K(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 10, 6, 7, var6);
         return H(var8) && p.H(var1, var8) == null?new r.d(var0, var7, var2, var8, var6):null;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Chest", this.K);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.K = var1.i("Chest");
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 6 - 1, 0);
         }

         net.yw.n var5 = net.nb.f.TD.p();
         net.yw.n var6 = this.U(net.nb.f.TQ.p().s(l_.F, aq.NORTH));
         net.yw.n var7 = this.U(net.nb.f.TQ.p().s(l_.F, aq.WEST));
         net.yw.n var8 = this.U(net.nb.f.oN.p());
         net.yw.n var9 = this.U(net.nb.f.uI.p().s(l_.F, aq.NORTH));
         net.yw.n var10 = this.U(net.nb.f.u6.p());
         net.yw.n var11 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 0, 1, 0, 9, 4, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 0, 0, 9, 0, 6, var5, var5, false);
         this.E(var1, var3, 0, 4, 0, 9, 4, 6, var5, var5, false);
         this.E(var1, var3, 0, 5, 0, 9, 5, 6, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
         this.E(var1, var3, 1, 5, 1, 8, 5, 5, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 1, 0, 2, 3, 0, var8, var8, false);
         this.E(var1, var3, 0, 1, 0, 0, 4, 0, var10, var10, false);
         this.E(var1, var3, 3, 1, 0, 3, 4, 0, var10, var10, false);
         this.E(var1, var3, 0, 1, 6, 0, 4, 6, var10, var10, false);
         this.N(var1, var8, 3, 3, 1, var3);
         this.E(var1, var3, 3, 1, 2, 3, 3, 2, var8, var8, false);
         this.E(var1, var3, 4, 1, 3, 5, 3, 3, var8, var8, false);
         this.E(var1, var3, 0, 1, 1, 0, 3, 5, var8, var8, false);
         this.E(var1, var3, 1, 1, 6, 5, 3, 6, var8, var8, false);
         this.E(var1, var3, 5, 1, 0, 5, 3, 0, var11, var11, false);
         this.E(var1, var3, 9, 1, 0, 9, 3, 0, var11, var11, false);
         this.E(var1, var3, 6, 1, 4, 9, 4, 6, var5, var5, false);
         this.N(var1, net.nb.f.dj.p(), 7, 1, 5, var3);
         this.N(var1, net.nb.f.dj.p(), 8, 1, 5, var3);
         this.N(var1, net.nb.f.d8.p(), 9, 2, 5, var3);
         this.N(var1, net.nb.f.d8.p(), 9, 2, 4, var3);
         this.E(var1, var3, 7, 2, 4, 8, 2, 5, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, var5, 6, 1, 3, var3);
         this.N(var1, net.nb.f.uY.p(), 6, 2, 3, var3);
         this.N(var1, net.nb.f.uY.p(), 6, 3, 3, var3);
         this.N(var1, net.nb.f.dn.p(), 8, 1, 1, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 4, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 6, var3);
         this.N(var1, net.nb.f.L.p(), 4, 2, 6, var3);
         this.N(var1, var11, 2, 1, 4, var3);
         this.N(var1, net.nb.f.dp.p(), 2, 2, 4, var3);
         this.N(var1, var8, 1, 1, 5, var3);
         this.N(var1, var6, 2, 1, 5, var3);
         this.N(var1, var7, 1, 1, 4, var3);
         if(!this.K && var3.Y(new net.u.j(this.g(5, 5), this.Z(1), this.w(5, 5)))) {
            this.K = true;
            this.Y(var1, var3, var2, 5, 1, 5, net.y7.p.pj);
         }

         int var12 = 6;
         if(this.r(var1, var12, 0, -1, var3).n() == net.y1.l.q && this.r(var1, var12, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var9, var12, 0, -1, var3);
            if(this.r(var1, var12, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), var12, -1, -1, var3);
            }
         }

         ++var12;
         var12 = 0;
         int var13 = 0;
         this.T(var1, var13, 6, var12, var3);
         this.X(var1, var5, var13, -1, var12, var3);
         ++var13;
         ++var12;
         this.c(var1, var3, 7, 1, 1, 1);
         return true;
      }

      protected int J(int var1, int var2) {
         return 3;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class e extends r.h {
      private boolean x;

      public e() {
      }

      public e(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
         this.x = var3.nextBoolean();
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Terrace", this.x);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.x = var1.i("Terrace");
      }

      public static r.e o(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);
         return p.H(var1, var8) != null?null:new r.e(var0, var7, var2, var8, var6);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 6 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.oN.p());
         net.yw.n var7 = this.U(net.nb.f.uI.p().s(l_.F, aq.NORTH));
         net.yw.n var8 = this.U(net.nb.f.u6.p());
         net.yw.n var9 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 0, 0, 0, 4, 0, 4, var5, var5, false);
         this.E(var1, var3, 0, 4, 0, 4, 4, 4, var8, var8, false);
         this.E(var1, var3, 1, 4, 1, 3, 4, 3, var6, var6, false);
         this.N(var1, var5, 0, 1, 0, var3);
         this.N(var1, var5, 0, 2, 0, var3);
         this.N(var1, var5, 0, 3, 0, var3);
         this.N(var1, var5, 4, 1, 0, var3);
         this.N(var1, var5, 4, 2, 0, var3);
         this.N(var1, var5, 4, 3, 0, var3);
         this.N(var1, var5, 0, 1, 4, var3);
         this.N(var1, var5, 0, 2, 4, var3);
         this.N(var1, var5, 0, 3, 4, var3);
         this.N(var1, var5, 4, 1, 4, var3);
         this.N(var1, var5, 4, 2, 4, var3);
         this.N(var1, var5, 4, 3, 4, var3);
         this.E(var1, var3, 0, 1, 1, 0, 3, 3, var6, var6, false);
         this.E(var1, var3, 4, 1, 1, 4, 3, 3, var6, var6, false);
         this.E(var1, var3, 1, 1, 4, 3, 3, 4, var6, var6, false);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 4, var3);
         this.N(var1, net.nb.f.L.p(), 4, 2, 2, var3);
         this.N(var1, var6, 1, 1, 0, var3);
         this.N(var1, var6, 1, 2, 0, var3);
         this.N(var1, var6, 1, 3, 0, var3);
         this.N(var1, var6, 2, 3, 0, var3);
         this.N(var1, var6, 3, 3, 0, var3);
         this.N(var1, var6, 3, 2, 0, var3);
         this.N(var1, var6, 3, 1, 0, var3);
         if(this.r(var1, 2, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 2, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var7, 2, 0, -1, var3);
            if(this.r(var1, 2, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 2, -1, -1, var3);
            }
         }

         this.E(var1, var3, 1, 1, 1, 3, 3, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         if(this.x) {
            this.N(var1, var9, 0, 5, 0, var3);
            this.N(var1, var9, 1, 5, 0, var3);
            this.N(var1, var9, 2, 5, 0, var3);
            this.N(var1, var9, 3, 5, 0, var3);
            this.N(var1, var9, 4, 5, 0, var3);
            this.N(var1, var9, 0, 5, 4, var3);
            this.N(var1, var9, 1, 5, 4, var3);
            this.N(var1, var9, 2, 5, 4, var3);
            this.N(var1, var9, 3, 5, 4, var3);
            this.N(var1, var9, 4, 5, 4, var3);
            this.N(var1, var9, 4, 5, 1, var3);
            this.N(var1, var9, 4, 5, 2, var3);
            this.N(var1, var9, 4, 5, 3, var3);
            this.N(var1, var9, 0, 5, 1, var3);
            this.N(var1, var9, 0, 5, 2, var3);
            this.N(var1, var9, 0, 5, 3, var3);
         }

         if(this.x) {
            net.yw.n var10 = net.nb.f.K.p().s(gp.i, aq.SOUTH);
            this.N(var1, var10, 3, 1, 3, var3);
            this.N(var1, var10, 3, 2, 3, var3);
            this.N(var1, var10, 3, 3, 3, var3);
            this.N(var1, var10, 3, 4, 3, var3);
         }

         this.e(var1, aq.NORTH, 2, 3, 1, var3);
         int var12 = 0;
         int var11 = 0;
         this.T(var1, var11, 6, var12, var3);
         this.X(var1, var5, var11, -1, var12, var3);
         ++var11;
         ++var12;
         this.c(var1, var3, 1, 1, 2, 1);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class f extends r.h {
      private net.y9.l j;
      private net.y9.l N;

      public f() {
      }

      public f(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
         this.j = this.Q(var3);
         this.N = this.Q(var3);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("CA", net.y9.l.m.D(this.j));
         var1.r("CB", net.y9.l.m.D(this.N));
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.j = net.y9.l.I(var1.P("CA"));
         this.N = net.y9.l.I(var1.P("CB"));
      }

      private net.y9.l Q(Random var1) {
         switch(var1.nextInt(10)) {
         case 0:
         case 1:
            return net.nb.f.a;
         case 2:
         case 3:
            return net.nb.f.T0;
         case 4:
            return net.nb.f.Tf;
         default:
            return net.nb.f.uN;
         }
      }

      public static r.f c(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 7, 4, 9, var6);
         return H(var8) && p.H(var1, var8) == null?new r.f(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 4 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.u6.p());
         this.E(var1, var3, 0, 1, 0, 6, 4, 8, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 0, 1, 2, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 4, 0, 1, 5, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 0, 0, 0, 0, 0, 8, var5, var5, false);
         this.E(var1, var3, 6, 0, 0, 6, 0, 8, var5, var5, false);
         this.E(var1, var3, 1, 0, 0, 5, 0, 0, var5, var5, false);
         this.E(var1, var3, 1, 0, 8, 5, 0, 8, var5, var5, false);
         this.E(var1, var3, 3, 0, 1, 3, 0, 7, net.nb.f.uM.p(), net.nb.f.uM.p(), false);
         int var6 = 1;
         int var7 = ((net.y9.v)this.j).E();
         int var8 = var7 / 3;
         this.N(var1, this.j.D(net.u.t.A(var2, var8, var7)), 1, 1, var6, var3);
         this.N(var1, this.j.D(net.u.t.A(var2, var8, var7)), 2, 1, var6, var3);
         int var9 = ((net.y9.v)this.N).E();
         int var10 = var9 / 3;
         this.N(var1, this.N.D(net.u.t.A(var2, var10, var9)), 4, 1, var6, var3);
         this.N(var1, this.N.D(net.u.t.A(var2, var10, var9)), 5, 1, var6, var3);
         ++var6;
         var6 = 0;
         var7 = 0;
         this.T(var1, var7, 4, var6, var3);
         this.X(var1, net.nb.f.dl.p(), var7, -1, var6, var3);
         ++var7;
         ++var6;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class g extends r.z {
      public i9 B;
      public int W;
      public r.k E;
      public List v;
      public List d;
      public List x;

      public g() {
         this.d = Lists.newArrayList();
         this.x = Lists.newArrayList();
      }

      public g(i9 var1, int var2, Random var3, int var4, int var5, List var6, int var7) {
         p.d();
         super((r.g)null, 0, var3, var4, var5);
         this.d = Lists.newArrayList();
         this.x = Lists.newArrayList();
         this.B = var1;
         this.v = var6;
         this.W = var7;
         net.ns.i var9 = var1.L(new net.u.j(var4, 0, var5), net.nb.x.Q);
         if(var9 instanceof net.ns.l) {
            this.r = 1;
         }

         if(var9 instanceof net.ns.q) {
            this.r = 2;
         }

         if(var9 instanceof net.ns.f) {
            this.r = 3;
         }

         this.G(this.r);
         this.V = var3.nextInt(50) == 0;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   abstract static class h extends p {
      protected int I = -1;
      private int p;
      protected int r;
      protected boolean V;

      public h() {
      }

      protected h(r.g var1, int var2) {
         super(var2);
         this.r = var1.r;
         this.V = var1.V;
      }

      protected void x(net.nj.f var1) {
         var1.r("HPos", this.I);
         var1.r("VCount", this.p);
         var1.D("Type", (byte)this.r);
         var1.c("Zombie", this.V);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         this.I = var1.P("HPos");
         this.p = var1.P("VCount");
         this.r = var1.R("Type");
         if(var1.i("Desert")) {
            this.r = 1;
         }

         this.V = var1.i("Zombie");
      }

      @Nullable
      protected p U(r.g var1, List var2, Random var3, int var4, int var5) {
         aq var6 = this.L();
         switch(null.F[var6.ordinal()]) {
         case 1:
         default:
            return r.t(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q());
         case 2:
            return r.t(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q());
         case 3:
            return r.t(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q());
         case 4:
            return r.t(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q());
         }
      }

      @Nullable
      protected p w(r.g var1, List var2, Random var3, int var4, int var5) {
         aq var6 = this.L();
         switch(null.F[var6.ordinal()]) {
         case 1:
         default:
            return r.t(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q());
         case 2:
            return r.t(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q());
         case 3:
            return r.t(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q());
         case 4:
            return r.t(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q());
         }
      }

      protected int F(net.yv.r var1, v var2) {
         int var3 = 0;
         int var4 = 0;
         net.u.j var5 = new net.u.j();

         for(int var6 = this.w.p; var6 <= this.w.J; ++var6) {
            for(int var7 = this.w.i; var7 <= this.w.e; ++var7) {
               var5.V(var7, 64, var6);
               if(var2.Y(var5)) {
                  var3 += Math.max(var1.D((net.u.j)var5).h(), var1.F.v() - 1);
                  ++var4;
               }
            }
         }

         return -1;
      }

      protected static boolean H(v var0) {
         return var0.D > 10;
      }

      protected void c(net.yv.r var1, v var2, int var3, int var4, int var5, int var6) {
         if(this.p < var6) {
            for(int var7 = this.p; var7 < var6; ++var7) {
               int var8 = this.g(var3 + var7, var5);
               int var9 = this.Z(var4);
               int var10 = this.w(var3 + var7, var5);
               if(!var2.Y(new net.u.j(var8, var9, var10))) {
                  break;
               }

               ++this.p;
               if(this.V) {
                  fy var11 = new fy(var1);
                  var11.S((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
                  var11.t(var1.G(new net.u.j(var11)), (net.ne.g)null);
                  var11.h(this.J(var7, 0));
                  var11.gz();
                  var1.S(var11);
               } else {
                  net.yn.s var12 = new net.yn.s(var1);
                  var12.S((double)var8 + 0.5D, (double)var9, (double)var10 + 0.5D, 0.0F, 0.0F);
                  var12.f(this.J(var7, var1.G.nextInt(6)));
                  var12.C(var1.G(new net.u.j(var12)), (net.ne.g)null, false);
                  var1.S(var12);
               }
            }
         }

      }

      protected int J(int var1, int var2) {
         return var2;
      }

      protected net.yw.n U(net.yw.n var1) {
         int[] var2 = p.d();
         if(this.r == 1) {
            if(var1.Q() == net.nb.f.u6 || var1.Q() == net.nb.f.ub) {
               return net.nb.f.ul.p();
            }

            if(var1.Q() == net.nb.f.TD) {
               return net.nb.f.ul.D(lo.h.DEFAULT.r());
            }

            if(var1.Q() == net.nb.f.oN) {
               return net.nb.f.ul.D(lo.h.SMOOTH.r());
            }

            if(var1.Q() == net.nb.f.TQ) {
               return net.nb.f.TA.p().s(l_.F, var1.i(l_.F));
            }

            if(var1.Q() == net.nb.f.uI) {
               return net.nb.f.TA.p().s(l_.F, var1.i(l_.F));
            }

            if(var1.Q() == net.nb.f.D) {
               return net.nb.f.ul.p();
            }
         } else if(this.r == 3) {
            if(var1.Q() == net.nb.f.u6 || var1.Q() == net.nb.f.ub) {
               return net.nb.f.u6.p().s(l7.d, gc.i.SPRUCE).s(l2.l, var1.i(l2.l));
            }

            if(var1.Q() == net.nb.f.oN) {
               return net.nb.f.oN.p().s(gc.F, gc.i.SPRUCE);
            }

            if(var1.Q() == net.nb.f.TQ) {
               return net.nb.f.TK.p().s(l_.F, var1.i(l_.F));
            }

            if(var1.Q() == net.nb.f.I) {
               return net.nb.f.u4.p();
            }
         } else if(this.r == 2) {
            if(var1.Q() == net.nb.f.u6 || var1.Q() == net.nb.f.ub) {
               return net.nb.f.ub.p().s(lt.k, gc.i.ACACIA).s(l2.l, var1.i(l2.l));
            }

            if(var1.Q() == net.nb.f.oN) {
               return net.nb.f.oN.p().s(gc.F, gc.i.ACACIA);
            }

            if(var1.Q() == net.nb.f.TQ) {
               return net.nb.f.dN.p().s(l_.F, var1.i(l_.F));
            }

            if(var1.Q() == net.nb.f.TD) {
               return net.nb.f.ub.p().s(lt.k, gc.i.ACACIA).s(l2.l, l2.g.Y);
            }

            if(var1.Q() == net.nb.f.I) {
               return net.nb.f.op.p();
            }
         }

         return var1;
      }

      protected r9 n() {
         switch(this.r) {
         case 2:
            return net.nb.f.dH;
         case 3:
            return net.nb.f.d0;
         default:
            return net.nb.f.dc;
         }
      }

      protected void a(net.yv.r var1, v var2, Random var3, int var4, int var5, int var6, aq var7) {
         if(!this.V) {
            this.S(var1, var2, var3, var4, var5, var6, aq.NORTH, this.n());
         }

      }

      protected void e(net.yv.r var1, aq var2, int var3, int var4, int var5, v var6) {
         if(!this.V) {
            this.N(var1, net.nb.f.uZ.p().s(lg.n, var2), var3, var4, var5, var6);
         }

      }

      protected void X(net.yv.r var1, net.yw.n var2, int var3, int var4, int var5, v var6) {
         net.yw.n var7 = this.U(var2);
         super.X(var1, var7, var3, var4, var5, var6);
      }

      protected void G(int var1) {
         this.r = var1;
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class i extends r.h {
      public i() {
      }

      public i(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static r.i H(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
         return H(var8) && p.H(var1, var8) == null?new r.i(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 7 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.TQ.p().s(l_.F, aq.NORTH));
         net.yw.n var7 = this.U(net.nb.f.TQ.p().s(l_.F, aq.SOUTH));
         net.yw.n var8 = this.U(net.nb.f.TQ.p().s(l_.F, aq.EAST));
         net.yw.n var9 = this.U(net.nb.f.TQ.p().s(l_.F, aq.WEST));
         net.yw.n var10 = this.U(net.nb.f.oN.p());
         net.yw.n var11 = this.U(net.nb.f.u6.p());
         this.E(var1, var3, 1, 1, 1, 7, 4, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 1, 6, 8, 4, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 0, 5, 8, 0, 10, var10, var10, false);
         this.E(var1, var3, 1, 0, 1, 7, 0, 4, var10, var10, false);
         this.E(var1, var3, 0, 0, 0, 0, 3, 5, var5, var5, false);
         this.E(var1, var3, 8, 0, 0, 8, 3, 10, var5, var5, false);
         this.E(var1, var3, 1, 0, 0, 7, 2, 0, var5, var5, false);
         this.E(var1, var3, 1, 0, 5, 2, 1, 5, var5, var5, false);
         this.E(var1, var3, 2, 0, 6, 2, 3, 10, var5, var5, false);
         this.E(var1, var3, 3, 0, 10, 7, 3, 10, var5, var5, false);
         this.E(var1, var3, 1, 2, 0, 7, 3, 0, var10, var10, false);
         this.E(var1, var3, 1, 2, 5, 2, 3, 5, var10, var10, false);
         this.E(var1, var3, 0, 4, 1, 8, 4, 1, var10, var10, false);
         this.E(var1, var3, 0, 4, 4, 3, 4, 4, var10, var10, false);
         this.E(var1, var3, 0, 5, 2, 8, 5, 3, var10, var10, false);
         this.N(var1, var10, 0, 4, 2, var3);
         this.N(var1, var10, 0, 4, 3, var3);
         this.N(var1, var10, 8, 4, 2, var3);
         this.N(var1, var10, 8, 4, 3, var3);
         this.N(var1, var10, 8, 4, 4, var3);
         int var16 = -1;
         int var17 = 0;
         this.N(var1, var6, var17, 4 + var16, var16, var3);
         this.N(var1, var7, var17, 4 + var16, 5 - var16, var3);
         ++var17;
         ++var16;
         this.E(var1, var3, 3, 4, 5, 3, 4, 10, var10, var10, false);
         this.E(var1, var3, 7, 4, 2, 7, 4, 10, var10, var10, false);
         this.E(var1, var3, 4, 5, 4, 4, 5, 10, var10, var10, false);
         this.E(var1, var3, 6, 5, 4, 6, 5, 10, var10, var10, false);
         this.E(var1, var3, 5, 6, 3, 5, 6, 10, var10, var10, false);
         var16 = 4;
         this.N(var1, var10, var16, 2 + var16, 7 - var16, var3);
         var17 = 8 - var16;
         this.N(var1, var8, var16, 2 + var16, var17, var3);
         ++var17;
         --var16;
         this.N(var1, var10, 6, 6, 3, var3);
         this.N(var1, var10, 7, 5, 4, var3);
         this.N(var1, var9, 6, 6, 4, var3);
         var16 = 6;
         var17 = 5;
         this.N(var1, var9, var16, 12 - var16, var17, var3);
         ++var17;
         ++var16;
         this.N(var1, var11, 0, 2, 1, var3);
         this.N(var1, var11, 0, 2, 4, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 3, var3);
         this.N(var1, var11, 4, 2, 0, var3);
         this.N(var1, net.nb.f.L.p(), 5, 2, 0, var3);
         this.N(var1, var11, 6, 2, 0, var3);
         this.N(var1, var11, 8, 2, 1, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 3, var3);
         this.N(var1, var11, 8, 2, 4, var3);
         this.N(var1, var10, 8, 2, 5, var3);
         this.N(var1, var11, 8, 2, 6, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 7, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 8, var3);
         this.N(var1, var11, 8, 2, 9, var3);
         this.N(var1, var11, 2, 2, 6, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 7, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 8, var3);
         this.N(var1, var11, 2, 2, 9, var3);
         this.N(var1, var11, 4, 4, 10, var3);
         this.N(var1, net.nb.f.L.p(), 5, 4, 10, var3);
         this.N(var1, var11, 6, 4, 10, var3);
         this.N(var1, var10, 5, 5, 10, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 1, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 2, 0, var3);
         this.e(var1, aq.NORTH, 2, 3, 1, var3);
         this.a(var1, var3, var2, 2, 1, 0, aq.NORTH);
         this.E(var1, var3, 1, 0, -1, 3, 2, -1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         if(this.r(var1, 2, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 2, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var6, 2, 0, -1, var3);
            if(this.r(var1, 2, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 2, -1, -1, var3);
            }
         }

         var16 = 0;
         var17 = 0;
         this.T(var1, var17, 7, var16, var3);
         this.X(var1, var5, var17, -1, var16, var3);
         ++var17;
         ++var16;
         var16 = 5;
         var17 = 2;
         this.T(var1, var17, 7, var16, var3);
         this.X(var1, var5, var17, -1, var16, var3);
         ++var17;
         ++var16;
         this.c(var1, var3, 4, 1, 2, 2);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class k {
      public Class G;
      public final int M;
      public int b;
      public int R;

      public k(Class var1, int var2, int var3) {
         this.G = var1;
         this.M = var2;
         this.R = var3;
      }

      public boolean i(int var1) {
         int[] var2 = p.d();
         return this.R == 0 || this.b < this.R;
      }

      public boolean P() {
         int[] var1 = p.d();
         return this.R == 0 || this.b < this.R;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class o extends r.h {
      public o() {
      }

      public o(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static v c(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6) {
         v var7 = v.V(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);
         return p.H(var1, var7) != null?null:var7;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 4 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 0, 0, 0, 2, 3, 1, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.N(var1, var5, 1, 0, 0, var3);
         this.N(var1, var5, 1, 1, 0, var3);
         this.N(var1, var5, 1, 2, 0, var3);
         this.N(var1, net.nb.f.ur.D(kw.WHITE.G()), 1, 3, 0, var3);
         this.e(var1, aq.EAST, 2, 3, 0, var3);
         this.e(var1, aq.NORTH, 1, 3, 1, var3);
         this.e(var1, aq.WEST, 0, 3, 0, var3);
         this.e(var1, aq.SOUTH, 1, 3, -1, var3);
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class p extends r.h {
      public p() {
      }

      public p(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static r.p H(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
         return H(var8) && p.H(var1, var8) == null?new r.p(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 12 - 1, 0);
         }

         net.yw.n var5 = net.nb.f.TD.p();
         net.yw.n var6 = this.U(net.nb.f.uI.p().s(l_.F, aq.NORTH));
         net.yw.n var7 = this.U(net.nb.f.uI.p().s(l_.F, aq.WEST));
         net.yw.n var8 = this.U(net.nb.f.uI.p().s(l_.F, aq.EAST));
         this.E(var1, var3, 1, 1, 1, 3, 3, 7, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 5, 1, 3, 9, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 0, 0, 3, 0, 8, var5, var5, false);
         this.E(var1, var3, 1, 1, 0, 3, 10, 0, var5, var5, false);
         this.E(var1, var3, 0, 1, 1, 0, 10, 3, var5, var5, false);
         this.E(var1, var3, 4, 1, 1, 4, 10, 3, var5, var5, false);
         this.E(var1, var3, 0, 0, 4, 0, 4, 7, var5, var5, false);
         this.E(var1, var3, 4, 0, 4, 4, 4, 7, var5, var5, false);
         this.E(var1, var3, 1, 1, 8, 3, 4, 8, var5, var5, false);
         this.E(var1, var3, 1, 5, 4, 3, 10, 4, var5, var5, false);
         this.E(var1, var3, 1, 5, 5, 3, 5, 7, var5, var5, false);
         this.E(var1, var3, 0, 9, 0, 4, 9, 4, var5, var5, false);
         this.E(var1, var3, 0, 4, 0, 4, 4, 4, var5, var5, false);
         this.N(var1, var5, 0, 11, 2, var3);
         this.N(var1, var5, 4, 11, 2, var3);
         this.N(var1, var5, 2, 11, 0, var3);
         this.N(var1, var5, 2, 11, 4, var3);
         this.N(var1, var5, 1, 1, 6, var3);
         this.N(var1, var5, 1, 1, 7, var3);
         this.N(var1, var5, 2, 1, 7, var3);
         this.N(var1, var5, 3, 1, 6, var3);
         this.N(var1, var5, 3, 1, 7, var3);
         this.N(var1, var6, 1, 1, 5, var3);
         this.N(var1, var6, 2, 1, 6, var3);
         this.N(var1, var6, 3, 1, 5, var3);
         this.N(var1, var7, 1, 2, 7, var3);
         this.N(var1, var8, 3, 2, 7, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 3, 2, var3);
         this.N(var1, net.nb.f.L.p(), 4, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 4, 3, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 6, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 7, 2, var3);
         this.N(var1, net.nb.f.L.p(), 4, 6, 2, var3);
         this.N(var1, net.nb.f.L.p(), 4, 7, 2, var3);
         this.N(var1, net.nb.f.L.p(), 2, 6, 0, var3);
         this.N(var1, net.nb.f.L.p(), 2, 7, 0, var3);
         this.N(var1, net.nb.f.L.p(), 2, 6, 4, var3);
         this.N(var1, net.nb.f.L.p(), 2, 7, 4, var3);
         this.N(var1, net.nb.f.L.p(), 0, 3, 6, var3);
         this.N(var1, net.nb.f.L.p(), 4, 3, 6, var3);
         this.N(var1, net.nb.f.L.p(), 2, 3, 8, var3);
         this.e(var1, aq.SOUTH, 2, 4, 7, var3);
         this.e(var1, aq.EAST, 1, 4, 6, var3);
         this.e(var1, aq.WEST, 3, 4, 6, var3);
         this.e(var1, aq.NORTH, 2, 4, 5, var3);
         net.yw.n var9 = net.nb.f.K.p().s(gp.i, aq.WEST);
         int var10 = 1;
         this.N(var1, var9, 3, var10, 3, var3);
         ++var10;
         this.N(var1, net.nb.f.ou.p(), 2, 1, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 2, 0, var3);
         this.a(var1, var3, var2, 2, 1, 0, aq.NORTH);
         if(this.r(var1, 2, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 2, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var6, 2, 0, -1, var3);
            if(this.r(var1, 2, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 2, -1, -1, var3);
            }
         }

         var10 = 0;
         int var11 = 0;
         this.T(var1, var11, 12, var10, var3);
         this.X(var1, var5, var11, -1, var10, var3);
         ++var11;
         ++var10;
         this.c(var1, var3, 2, 1, 2, 1);
         return true;
      }

      protected int J(int var1, int var2) {
         return 2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class s extends r.h {
      private net.y9.l G;
      private net.y9.l R;
      private net.y9.l a;
      private net.y9.l c;

      public s() {
      }

      public s(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
         this.G = this.s(var3);
         this.R = this.s(var3);
         this.a = this.s(var3);
         this.c = this.s(var3);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("CA", net.y9.l.m.D(this.G));
         var1.r("CB", net.y9.l.m.D(this.R));
         var1.r("CC", net.y9.l.m.D(this.a));
         var1.r("CD", net.y9.l.m.D(this.c));
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.G = net.y9.l.I(var1.P("CA"));
         this.R = net.y9.l.I(var1.P("CB"));
         this.a = net.y9.l.I(var1.P("CC"));
         this.c = net.y9.l.I(var1.P("CD"));
         if(!(this.G instanceof net.y9.v)) {
            this.G = net.nb.f.uN;
         }

         if(!(this.R instanceof net.y9.v)) {
            this.R = net.nb.f.a;
         }

         if(!(this.a instanceof net.y9.v)) {
            this.a = net.nb.f.T0;
         }

         if(!(this.c instanceof net.y9.v)) {
            this.c = net.nb.f.Tf;
         }

      }

      private net.y9.l s(Random var1) {
         switch(var1.nextInt(10)) {
         case 0:
         case 1:
            return net.nb.f.a;
         case 2:
         case 3:
            return net.nb.f.T0;
         case 4:
            return net.nb.f.Tf;
         default:
            return net.nb.f.uN;
         }
      }

      public static r.s L(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
         return H(var8) && p.H(var1, var8) == null?new r.s(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 4 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.u6.p());
         this.E(var1, var3, 0, 1, 0, 12, 4, 8, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 1, 0, 1, 2, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 4, 0, 1, 5, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 7, 0, 1, 8, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 10, 0, 1, 11, 0, 7, net.nb.f.dJ.p(), net.nb.f.dJ.p(), false);
         this.E(var1, var3, 0, 0, 0, 0, 0, 8, var5, var5, false);
         this.E(var1, var3, 6, 0, 0, 6, 0, 8, var5, var5, false);
         this.E(var1, var3, 12, 0, 0, 12, 0, 8, var5, var5, false);
         this.E(var1, var3, 1, 0, 0, 11, 0, 0, var5, var5, false);
         this.E(var1, var3, 1, 0, 8, 11, 0, 8, var5, var5, false);
         this.E(var1, var3, 3, 0, 1, 3, 0, 7, net.nb.f.uM.p(), net.nb.f.uM.p(), false);
         this.E(var1, var3, 9, 0, 1, 9, 0, 7, net.nb.f.uM.p(), net.nb.f.uM.p(), false);
         int var6 = 1;
         int var7 = ((net.y9.v)this.G).E();
         int var8 = var7 / 3;
         this.N(var1, this.G.D(net.u.t.A(var2, var8, var7)), 1, 1, var6, var3);
         this.N(var1, this.G.D(net.u.t.A(var2, var8, var7)), 2, 1, var6, var3);
         int var9 = ((net.y9.v)this.R).E();
         int var10 = var9 / 3;
         this.N(var1, this.R.D(net.u.t.A(var2, var10, var9)), 4, 1, var6, var3);
         this.N(var1, this.R.D(net.u.t.A(var2, var10, var9)), 5, 1, var6, var3);
         int var11 = ((net.y9.v)this.a).E();
         int var12 = var11 / 3;
         this.N(var1, this.a.D(net.u.t.A(var2, var12, var11)), 7, 1, var6, var3);
         this.N(var1, this.a.D(net.u.t.A(var2, var12, var11)), 8, 1, var6, var3);
         int var13 = ((net.y9.v)this.c).E();
         int var14 = var13 / 3;
         this.N(var1, this.c.D(net.u.t.A(var2, var14, var13)), 10, 1, var6, var3);
         this.N(var1, this.c.D(net.u.t.A(var2, var14, var13)), 11, 1, var6, var3);
         ++var6;
         var6 = 0;
         var7 = 0;
         this.T(var1, var7, 4, var6, var3);
         this.X(var1, net.nb.f.dl.p(), var7, -1, var6, var3);
         ++var7;
         ++var6;
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class u extends r.c {
      private int n;

      public u() {
      }

      public u(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
         this.n = Math.max(var4.t(), var4.X());
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("Length", this.n);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.n = var1.P("Length");
      }

      public void S(p var1, List var2, Random var3) {
         p.d();
         boolean var5 = false;
         int var6 = var3.nextInt(5);
         if(var6 < this.n - 8) {
            p var7 = this.U((r.g)var1, var2, var3, 0, var6);
            if(var7 != null) {
               var6 += Math.max(var7.w.t(), var7.w.X());
               var5 = true;
            }

            int var10000 = var6 + 2 + var3.nextInt(5);
         }

         var6 = var3.nextInt(5);
         if(var6 < this.n - 8) {
            p var12 = this.w((r.g)var1, var2, var3, 0, var6);
            if(var12 != null) {
               var6 += Math.max(var12.w.t(), var12.w.X());
               var5 = true;
            }

            int var13 = var6 + 2 + var3.nextInt(5);
         }

         aq var11 = this.L();
      }

      public static v H(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6) {
         for(int var7 = 7 * net.u.t.A(var2, 3, 5); var7 >= 7; var7 -= 7) {
            v var8 = v.V(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
            if(p.H(var1, var8) == null) {
               return var8;
            }
         }

         return null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         net.yw.n var4 = this.U(net.nb.f.A.p());
         net.yw.n var5 = this.U(net.nb.f.oN.p());
         net.yw.n var6 = this.U(net.nb.f.D.p());
         net.yw.n var7 = this.U(net.nb.f.TD.p());

         for(int var8 = this.w.i; var8 <= this.w.e; ++var8) {
            for(int var9 = this.w.p; var9 <= this.w.J; ++var9) {
               net.u.j var10 = new net.u.j(var8, 64, var9);
               if(var3.Y(var10)) {
                  var10 = var1.D(var10).b();
                  if(var10.h() < var1.k()) {
                     var10 = new net.u.j(var10.t(), var1.k() - 1, var10.y());
                  }

                  while(var10.h() >= var1.k() - 1) {
                     net.yw.n var11 = var1.Z(var10);
                     if(var11.Q() == net.nb.f.p && var1.y(var10.h())) {
                        var1.k(var10, var4, 2);
                        break;
                     }

                     if(var11.n().y()) {
                        var1.k(var10, var5, 2);
                        break;
                     }

                     if(var11.Q() == net.nb.f.TF || var11.Q() == net.nb.f.ul || var11.Q() == net.nb.f.Tj) {
                        var1.k(var10, var6, 2);
                        var1.k(var10.b(), var7, 2);
                        break;
                     }

                     var10 = var10.b();
                  }
               }
            }
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class w extends r.h {
      public w() {
      }

      public w(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static r.w d(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
         return H(var8) && p.H(var1, var8) == null?new r.w(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 9 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.TQ.p().s(l_.F, aq.NORTH));
         net.yw.n var7 = this.U(net.nb.f.TQ.p().s(l_.F, aq.SOUTH));
         net.yw.n var8 = this.U(net.nb.f.TQ.p().s(l_.F, aq.EAST));
         net.yw.n var9 = this.U(net.nb.f.oN.p());
         net.yw.n var10 = this.U(net.nb.f.uI.p().s(l_.F, aq.NORTH));
         net.yw.n var11 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 1, 1, 1, 7, 5, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 0, 0, 0, 8, 0, 5, var5, var5, false);
         this.E(var1, var3, 0, 5, 0, 8, 5, 5, var5, var5, false);
         this.E(var1, var3, 0, 6, 1, 8, 6, 4, var5, var5, false);
         this.E(var1, var3, 0, 7, 2, 8, 7, 3, var5, var5, false);
         int var12 = -1;
         int var13 = 0;
         this.N(var1, var6, var13, 6 + var12, var12, var3);
         this.N(var1, var7, var13, 6 + var12, 5 - var12, var3);
         ++var13;
         ++var12;
         this.E(var1, var3, 0, 1, 0, 0, 1, 5, var5, var5, false);
         this.E(var1, var3, 1, 1, 5, 8, 1, 5, var5, var5, false);
         this.E(var1, var3, 8, 1, 0, 8, 1, 4, var5, var5, false);
         this.E(var1, var3, 2, 1, 0, 7, 1, 0, var5, var5, false);
         this.E(var1, var3, 0, 2, 0, 0, 4, 0, var5, var5, false);
         this.E(var1, var3, 0, 2, 5, 0, 4, 5, var5, var5, false);
         this.E(var1, var3, 8, 2, 5, 8, 4, 5, var5, var5, false);
         this.E(var1, var3, 8, 2, 0, 8, 4, 0, var5, var5, false);
         this.E(var1, var3, 0, 2, 1, 0, 4, 4, var9, var9, false);
         this.E(var1, var3, 1, 2, 5, 7, 4, 5, var9, var9, false);
         this.E(var1, var3, 8, 2, 1, 8, 4, 4, var9, var9, false);
         this.E(var1, var3, 1, 2, 0, 7, 4, 0, var9, var9, false);
         this.N(var1, net.nb.f.L.p(), 4, 2, 0, var3);
         this.N(var1, net.nb.f.L.p(), 5, 2, 0, var3);
         this.N(var1, net.nb.f.L.p(), 6, 2, 0, var3);
         this.N(var1, net.nb.f.L.p(), 4, 3, 0, var3);
         this.N(var1, net.nb.f.L.p(), 5, 3, 0, var3);
         this.N(var1, net.nb.f.L.p(), 6, 3, 0, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 3, var3);
         this.N(var1, net.nb.f.L.p(), 0, 3, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 3, 3, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 3, var3);
         this.N(var1, net.nb.f.L.p(), 8, 3, 2, var3);
         this.N(var1, net.nb.f.L.p(), 8, 3, 3, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 5, var3);
         this.N(var1, net.nb.f.L.p(), 3, 2, 5, var3);
         this.N(var1, net.nb.f.L.p(), 5, 2, 5, var3);
         this.N(var1, net.nb.f.L.p(), 6, 2, 5, var3);
         this.E(var1, var3, 1, 4, 1, 7, 4, 1, var9, var9, false);
         this.E(var1, var3, 1, 4, 4, 7, 4, 4, var9, var9, false);
         this.E(var1, var3, 1, 3, 4, 7, 3, 4, net.nb.f.W.p(), net.nb.f.W.p(), false);
         this.N(var1, var9, 7, 1, 4, var3);
         this.N(var1, var8, 7, 1, 3, var3);
         this.N(var1, var6, 6, 1, 4, var3);
         this.N(var1, var6, 5, 1, 4, var3);
         this.N(var1, var6, 4, 1, 4, var3);
         this.N(var1, var6, 3, 1, 4, var3);
         this.N(var1, var11, 6, 1, 3, var3);
         this.N(var1, net.nb.f.dp.p(), 6, 2, 3, var3);
         this.N(var1, var11, 4, 1, 3, var3);
         this.N(var1, net.nb.f.dp.p(), 4, 2, 3, var3);
         this.N(var1, net.nb.f.uj.p(), 7, 1, 1, var3);
         this.N(var1, net.nb.f.ou.p(), 1, 1, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 1, 2, 0, var3);
         this.a(var1, var3, var2, 1, 1, 0, aq.NORTH);
         if(this.r(var1, 1, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 1, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var10, 1, 0, -1, var3);
            if(this.r(var1, 1, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 1, -1, -1, var3);
            }
         }

         var12 = 0;
         var13 = 0;
         this.T(var1, var13, 9, var12, var3);
         this.X(var1, var5, var13, -1, var12, var3);
         ++var13;
         ++var12;
         this.c(var1, var3, 2, 1, 2, 1);
         return true;
      }

      protected int J(int var1, int var2) {
         return 1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class y extends r.h {
      public y() {
      }

      public y(r.g var1, int var2, Random var3, v var4, aq var5) {
         super(var1, var2);
         this.n(var5);
         this.w = var4;
      }

      public static r.y U(r.g var0, List var1, Random var2, int var3, int var4, int var5, aq var6, int var7) {
         v var8 = v.V(var3, var4, var5, 0, 0, 0, 9, 7, 11, var6);
         return H(var8) && p.H(var1, var8) == null?new r.y(var0, var7, var2, var8, var6):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 7 - 1, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.TQ.p().s(l_.F, aq.NORTH));
         net.yw.n var7 = this.U(net.nb.f.TQ.p().s(l_.F, aq.SOUTH));
         net.yw.n var8 = this.U(net.nb.f.TQ.p().s(l_.F, aq.WEST));
         net.yw.n var9 = this.U(net.nb.f.oN.p());
         net.yw.n var10 = this.U(net.nb.f.u6.p());
         net.yw.n var11 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 1, 1, 1, 7, 4, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 1, 6, 8, 4, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         this.E(var1, var3, 2, 0, 6, 8, 0, 10, net.nb.f.dl.p(), net.nb.f.dl.p(), false);
         this.N(var1, var5, 6, 0, 6, var3);
         this.E(var1, var3, 2, 1, 6, 2, 1, 10, var11, var11, false);
         this.E(var1, var3, 8, 1, 6, 8, 1, 10, var11, var11, false);
         this.E(var1, var3, 3, 1, 10, 7, 1, 10, var11, var11, false);
         this.E(var1, var3, 1, 0, 1, 7, 0, 4, var9, var9, false);
         this.E(var1, var3, 0, 0, 0, 0, 3, 5, var5, var5, false);
         this.E(var1, var3, 8, 0, 0, 8, 3, 5, var5, var5, false);
         this.E(var1, var3, 1, 0, 0, 7, 1, 0, var5, var5, false);
         this.E(var1, var3, 1, 0, 5, 7, 1, 5, var5, var5, false);
         this.E(var1, var3, 1, 2, 0, 7, 3, 0, var9, var9, false);
         this.E(var1, var3, 1, 2, 5, 7, 3, 5, var9, var9, false);
         this.E(var1, var3, 0, 4, 1, 8, 4, 1, var9, var9, false);
         this.E(var1, var3, 0, 4, 4, 8, 4, 4, var9, var9, false);
         this.E(var1, var3, 0, 5, 2, 8, 5, 3, var9, var9, false);
         this.N(var1, var9, 0, 4, 2, var3);
         this.N(var1, var9, 0, 4, 3, var3);
         this.N(var1, var9, 8, 4, 2, var3);
         this.N(var1, var9, 8, 4, 3, var3);
         int var14 = -1;
         int var15 = 0;
         this.N(var1, var6, var15, 4 + var14, var14, var3);
         this.N(var1, var7, var15, 4 + var14, 5 - var14, var3);
         ++var15;
         ++var14;
         this.N(var1, var10, 0, 2, 1, var3);
         this.N(var1, var10, 0, 2, 4, var3);
         this.N(var1, var10, 8, 2, 1, var3);
         this.N(var1, var10, 8, 2, 4, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 0, 2, 3, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 2, var3);
         this.N(var1, net.nb.f.L.p(), 8, 2, 3, var3);
         this.N(var1, net.nb.f.L.p(), 2, 2, 5, var3);
         this.N(var1, net.nb.f.L.p(), 3, 2, 5, var3);
         this.N(var1, net.nb.f.L.p(), 5, 2, 0, var3);
         this.N(var1, net.nb.f.L.p(), 6, 2, 5, var3);
         this.N(var1, var11, 2, 1, 3, var3);
         this.N(var1, net.nb.f.dp.p(), 2, 2, 3, var3);
         this.N(var1, var9, 1, 1, 4, var3);
         this.N(var1, var6, 2, 1, 4, var3);
         this.N(var1, var8, 1, 1, 3, var3);
         this.E(var1, var3, 5, 0, 1, 7, 0, 3, net.nb.f.dn.p(), net.nb.f.dn.p(), false);
         this.N(var1, net.nb.f.dn.p(), 6, 1, 1, var3);
         this.N(var1, net.nb.f.dn.p(), 6, 1, 2, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 1, 0, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 2, 0, var3);
         this.e(var1, aq.NORTH, 2, 3, 1, var3);
         this.a(var1, var3, var2, 2, 1, 0, aq.NORTH);
         if(this.r(var1, 2, 0, -1, var3).n() == net.y1.l.q && this.r(var1, 2, -1, -1, var3).n() != net.y1.l.q) {
            this.N(var1, var6, 2, 0, -1, var3);
            if(this.r(var1, 2, -1, -1, var3).Q() == net.nb.f.A) {
               this.N(var1, net.nb.f.p.p(), 2, -1, -1, var3);
            }
         }

         this.N(var1, net.nb.f.ou.p(), 6, 1, 5, var3);
         this.N(var1, net.nb.f.ou.p(), 6, 2, 5, var3);
         this.e(var1, aq.SOUTH, 6, 3, 4, var3);
         this.a(var1, var3, var2, 6, 1, 5, aq.SOUTH);
         var14 = 0;
         var15 = 0;
         this.T(var1, var15, 7, var14, var3);
         this.X(var1, var5, var15, -1, var14, var3);
         ++var15;
         ++var14;
         this.c(var1, var3, 4, 1, 2, 2);
         return true;
      }

      protected int J(int var1, int var2) {
         return 4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends r.h {
      public z() {
      }

      public z(r.g var1, int var2, Random var3, int var4, int var5) {
         super(var1, var2);
         this.n(aq.u.HORIZONTAL.N(var3));
         if(this.L().r() == aq.l.Z) {
            this.w = new v(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
         } else {
            this.w = new v(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
         }

      }

      public void S(p var1, List var2, Random var3) {
         r.h((r.g)var1, var2, var3, this.w.i - 1, this.w.P - 4, this.w.p + 1, aq.WEST, this.Q());
         r.h((r.g)var1, var2, var3, this.w.e + 1, this.w.P - 4, this.w.p + 1, aq.EAST, this.Q());
         r.h((r.g)var1, var2, var3, this.w.i + 1, this.w.P - 4, this.w.p - 1, aq.NORTH, this.Q());
         r.h((r.g)var1, var2, var3, this.w.i + 1, this.w.P - 4, this.w.J + 1, aq.SOUTH, this.Q());
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.I < 0) {
            this.I = this.F(var1, var3);
            if(this.I < 0) {
               return true;
            }

            this.w.D(0, this.I - this.w.P + 3, 0);
         }

         net.yw.n var5 = this.U(net.nb.f.TD.p());
         net.yw.n var6 = this.U(net.nb.f.I.p());
         this.E(var1, var3, 1, 0, 1, 4, 12, 4, var5, net.nb.f.dy.p(), false);
         this.N(var1, net.nb.f.ou.p(), 2, 12, 2, var3);
         this.N(var1, net.nb.f.ou.p(), 3, 12, 2, var3);
         this.N(var1, net.nb.f.ou.p(), 2, 12, 3, var3);
         this.N(var1, net.nb.f.ou.p(), 3, 12, 3, var3);
         this.N(var1, var6, 1, 13, 1, var3);
         this.N(var1, var6, 1, 14, 1, var3);
         this.N(var1, var6, 4, 13, 1, var3);
         this.N(var1, var6, 4, 14, 1, var3);
         this.N(var1, var6, 1, 13, 4, var3);
         this.N(var1, var6, 1, 14, 4, var3);
         this.N(var1, var6, 4, 13, 4, var3);
         this.N(var1, var6, 4, 14, 4, var3);
         this.E(var1, var3, 1, 15, 1, 4, 15, 4, var5, var5, false);
         int var7 = 0;
         int var8 = 0;
         this.N(var1, var5, var8, 11, var7, var3);
         this.T(var1, var8, 12, var7, var3);
         ++var8;
         ++var7;
         return true;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
