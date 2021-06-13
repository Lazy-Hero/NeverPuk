package net.y4;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y4.b;
import net.y4.p;
import net.y4.v;
import net.y9.gp;
import net.y9.l_;
import net.y9.lb;
import net.y9.lg;
import net.y9.lh;
import net.y9.li;
import net.y9.r6;
import net.y9.r9;
import net.y9.rf;
import net.yz.aq;

public class w {
   private static final w.o[] n = new w.o[]{new w.o(w.x.class, 40, 0), new w.o(w.d.class, 5, 5), new w.o(w.j.class, 20, 0), new w.o(w.u.class, 20, 0), new w.o(w.q.class, 10, 6), new w.o(w.e.class, 5, 5), new w.o(w.k.class, 5, 5), new w.o(w.z.class, 5, 4), new w.o(w.l.class, 5, 4), new w.o(w.p.class, 10, 2) {
      public boolean Q(int var1) {
         int[] var2 = p.d();
         return super.Q(var1) && var1 > 4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }, new w.o(w.y.class, 20, 1) {
      public boolean Q(int var1) {
         int[] var2 = p.d();
         return super.Q(var1) && var1 > 5;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }};
   private static List H;
   private static Class d;
   static int I;
   private static final w.r K = new w.r();

   public static void P() {
      b.v(w.l.class, "SHCC");
      b.v(w.s.class, "SHFC");
      b.v(w.z.class, "SH5C");
      b.v(w.j.class, "SHLT");
      b.v(w.p.class, "SHLi");
      b.v(w.y.class, "SHPR");
      b.v(w.d.class, "SHPH");
      b.v(w.u.class, "SHRT");
      b.v(w.q.class, "SHRC");
      b.v(w.k.class, "SHSD");
      b.v(w.c.class, "SHStart");
      b.v(w.x.class, "SHS");
      b.v(w.e.class, "SHSSD");
   }

   public static void l() {
      H = Lists.newArrayList();

      for(w.o var3 : n) {
         var3.H = 0;
         H.add(var3);
      }

      d = null;
   }

   private static boolean i() {
      boolean var0 = false;
      I = 0;

      for(w.o var2 : H) {
         if(var2.Q > 0 && var2.H < var2.Q) {
            var0 = true;
         }

         I += var2.O;
      }

      return var0;
   }

   private static w.b K(Class var0, List var1, Random var2, int var3, int var4, int var5, @Nullable aq var6, int var7) {
      p.d();
      Object var9 = null;
      if(var0 == w.x.class) {
         var9 = w.x.t(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.d.class) {
         var9 = w.d.C(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.j.class) {
         var9 = w.j.U(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.u.class) {
         var9 = w.u.U(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.q.class) {
         var9 = w.q.u(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.e.class) {
         var9 = w.e.L(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.k.class) {
         var9 = w.k.o(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.z.class) {
         var9 = w.z.d(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.l.class) {
         var9 = w.l.Z(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.p.class) {
         var9 = w.p.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var0 == w.y.class) {
         var9 = w.y.n(var1, var2, var3, var4, var5, var6, var7);
      }

      return (w.b)var9;
   }

   private static w.b C(w.c param0, List param1, Random param2, int param3, int param4, int param5, aq param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   private static p k(w.c var0, List var1, Random var2, int var3, int var4, int var5, @Nullable aq var6, int var7) {
      if(var7 > 50) {
         return null;
      } else if(Math.abs(var3 - var0.J().i) <= 112 && Math.abs(var5 - var0.J().p) <= 112) {
         w.b var8 = C(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         var1.add(var8);
         var0.j.add(var8);
         return var8;
      } else {
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   abstract static class b extends p {
      protected w.b.i Z = w.b.i.OPENING;

      public b() {
      }

      protected b(int var1) {
         super(var1);
      }

      protected void x(net.nj.f var1) {
         var1.b("EntryDoor", this.Z.name());
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         this.Z = w.b.i.valueOf(var1.J("EntryDoor"));
      }

      protected void F(net.yv.r var1, Random var2, v var3, w.b.i var4, int var5, int var6, int var7) {
         int[] var8 = p.d();
         switch(null.C[var4.ordinal()]) {
         case 1:
            this.E(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
         case 2:
            this.N(var1, net.nb.f.TM.p(), var5, var6, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 1, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6, var7, var3);
            this.N(var1, net.nb.f.dc.p(), var5 + 1, var6, var7, var3);
            this.N(var1, net.nb.f.dc.p().s(r9.W, r9.k.UPPER), var5 + 1, var6 + 1, var7, var3);
         case 3:
            this.N(var1, net.nb.f.ou.p(), var5 + 1, var6, var7, var3);
            this.N(var1, net.nb.f.ou.p(), var5 + 1, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5, var6, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5 + 1, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5 + 2, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5 + 2, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.d8.p(), var5 + 2, var6, var7, var3);
         case 4:
            this.N(var1, net.nb.f.TM.p(), var5, var6, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 1, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6 + 2, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.TM.p(), var5 + 2, var6, var7, var3);
            this.N(var1, net.nb.f.o2.p(), var5 + 1, var6, var7, var3);
            this.N(var1, net.nb.f.o2.p().s(r9.W, r9.k.UPPER), var5 + 1, var6 + 1, var7, var3);
            this.N(var1, net.nb.f.uE.p().s(r6.n, aq.NORTH), var5 + 2, var6 + 1, var7 + 1, var3);
            this.N(var1, net.nb.f.uE.p().s(r6.n, aq.SOUTH), var5 + 2, var6 + 1, var7 - 1, var3);
         default:
         }
      }

      protected w.b.i e(Random var1) {
         int var2 = var1.nextInt(5);
         switch(var2) {
         case 0:
         case 1:
         default:
            return w.b.i.OPENING;
         case 2:
            return w.b.i.WOOD_DOOR;
         case 3:
            return w.b.i.GRATES;
         case 4:
            return w.b.i.IRON_DOOR;
         }
      }

      @Nullable
      protected p F(w.c var1, List var2, Random var3, int var4, int var5) {
         aq var6 = this.L();
         switch(null.k[var6.ordinal()]) {
         case 1:
            return w.k(var1, var2, var3, this.w.i + var4, this.w.D + var5, this.w.p - 1, var6, this.Q());
         case 2:
            return w.k(var1, var2, var3, this.w.i + var4, this.w.D + var5, this.w.J + 1, var6, this.Q());
         case 3:
            return w.k(var1, var2, var3, this.w.i - 1, this.w.D + var5, this.w.p + var4, var6, this.Q());
         case 4:
            return w.k(var1, var2, var3, this.w.e + 1, this.w.D + var5, this.w.p + var4, var6, this.Q());
         default:
            return null;
         }
      }

      @Nullable
      protected p r(w.c var1, List var2, Random var3, int var4, int var5) {
         aq var6 = this.L();
         switch(null.k[var6.ordinal()]) {
         case 1:
            return w.k(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q());
         case 2:
            return w.k(var1, var2, var3, this.w.i - 1, this.w.D + var4, this.w.p + var5, aq.WEST, this.Q());
         case 3:
            return w.k(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q());
         case 4:
            return w.k(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.p - 1, aq.NORTH, this.Q());
         default:
            return null;
         }
      }

      @Nullable
      protected p H(w.c var1, List var2, Random var3, int var4, int var5) {
         aq var6 = this.L();
         switch(null.k[var6.ordinal()]) {
         case 1:
            return w.k(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q());
         case 2:
            return w.k(var1, var2, var3, this.w.e + 1, this.w.D + var4, this.w.p + var5, aq.EAST, this.Q());
         case 3:
            return w.k(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q());
         case 4:
            return w.k(var1, var2, var3, this.w.i + var5, this.w.D + var4, this.w.J + 1, aq.SOUTH, this.Q());
         default:
            return null;
         }
      }

      protected static boolean A(v var0) {
         return var0.D > 10;
      }

      private static xn c(xn var0) {
         return var0;
      }

      public static enum i {
         OPENING,
         WOOD_DOOR,
         GRATES,
         IRON_DOOR;
      }
   }

   public static class c extends w.k {
      public w.o F;
      public w.y L;
      public List j = Lists.newArrayList();

      public c() {
      }

      public c(int var1, Random var2, int var3, int var4) {
         super(0, var2, var3, var4);
      }
   }

   public static class d extends w.b {
      public d() {
      }

      public d(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.F((w.c)var1, var2, var3, 1, 1);
      }

      public static w.d C(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
         return A(var7) && p.H(var0, var7) == null?new w.d(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 8, 4, 10, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 1, 0);
            this.E(var1, var3, 1, 1, 10, 3, 3, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.u(var1, var3, 4, 1, 1, 4, 3, 1, false, var2, w.K);
            this.u(var1, var3, 4, 1, 3, 4, 3, 3, false, var2, w.K);
            this.u(var1, var3, 4, 1, 7, 4, 3, 7, false, var2, w.K);
            this.u(var1, var3, 4, 1, 9, 4, 3, 9, false, var2, w.K);
            this.E(var1, var3, 4, 1, 4, 4, 3, 6, net.nb.f.d8.p(), net.nb.f.d8.p(), false);
            this.E(var1, var3, 5, 1, 5, 7, 3, 5, net.nb.f.d8.p(), net.nb.f.d8.p(), false);
            this.N(var1, net.nb.f.d8.p(), 4, 3, 2, var3);
            this.N(var1, net.nb.f.d8.p(), 4, 3, 8, var3);
            net.yw.n var5 = net.nb.f.o2.p().s(r9.D, aq.WEST);
            net.yw.n var6 = net.nb.f.o2.p().s(r9.D, aq.WEST).s(r9.W, r9.k.UPPER);
            this.N(var1, var5, 4, 1, 2, var3);
            this.N(var1, var6, 4, 2, 2, var3);
            this.N(var1, var5, 4, 1, 8, var3);
            this.N(var1, var6, 4, 2, 8, var3);
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class e extends w.b {
      public e() {
      }

      public e(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         this.F((w.c)var1, var2, var3, 1, 1);
      }

      public static w.e L(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
         return A(var7) && p.H(var0, var7) == null?new w.e(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 7, 0);
            this.F(var1, var2, var3, w.b.i.OPENING, 1, 1, 7);
            net.yw.n var5 = net.nb.f.uI.p().s(l_.F, aq.SOUTH);
            int var6 = 0;
            this.N(var1, var5, 1, 6 - var6, 1 + var6, var3);
            this.N(var1, var5, 2, 6 - var6, 1 + var6, var3);
            this.N(var1, var5, 3, 6 - var6, 1 + var6, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 5 - var6, 1 + var6, var3);
            this.N(var1, net.nb.f.TM.p(), 2, 5 - var6, 1 + var6, var3);
            this.N(var1, net.nb.f.TM.p(), 3, 5 - var6, 1 + var6, var3);
            ++var6;
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class j extends w.b {
      public j() {
      }

      public j(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
      }

      public void S(p var1, List var2, Random var3) {
         aq var4 = this.L();
         if(var4 != aq.NORTH && var4 != aq.EAST) {
            this.H((w.c)var1, var2, var3, 1, 1);
         } else {
            this.r((w.c)var1, var2, var3, 1, 1);
         }

      }

      public static w.j U(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
         return A(var7) && p.H(var0, var7) == null?new w.j(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 1, 0);
            aq var5 = this.L();
            if(var5 != aq.NORTH && var5 != aq.EAST) {
               this.E(var1, var3, 4, 1, 1, 4, 3, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            this.E(var1, var3, 0, 1, 1, 0, 3, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class k extends w.b {
      private boolean y;

      public k() {
      }

      public k(int var1, Random var2, int var3, int var4) {
         p.d();
         super(var1);
         this.y = true;
         this.n(aq.u.HORIZONTAL.N(var2));
         this.Z = w.b.i.OPENING;
         if(this.L().r() == aq.l.Z) {
            this.w = new v(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
         }

         this.w = new v(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

      public k(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.y = false;
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Source", this.y);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.y = var1.i("Source");
      }

      public void S(p var1, List var2, Random var3) {
         if(this.y) {
            w.d = w.z.class;
         }

         this.F((w.c)var1, var2, var3, 1, 1);
      }

      public static w.k o(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
         return A(var7) && p.H(var0, var7) == null?new w.k(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 7, 0);
            this.F(var1, var2, var3, w.b.i.OPENING, 1, 1, 4);
            this.N(var1, net.nb.f.TM.p(), 2, 6, 1, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 5, 1, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 1, 6, 1, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 5, 2, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 4, 3, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 1, 5, 3, var3);
            this.N(var1, net.nb.f.TM.p(), 2, 4, 3, var3);
            this.N(var1, net.nb.f.TM.p(), 3, 3, 3, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 3, 4, 3, var3);
            this.N(var1, net.nb.f.TM.p(), 3, 3, 2, var3);
            this.N(var1, net.nb.f.TM.p(), 3, 2, 1, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 3, 3, 1, var3);
            this.N(var1, net.nb.f.TM.p(), 2, 2, 1, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 1, 1, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 1, 2, 1, var3);
            this.N(var1, net.nb.f.TM.p(), 1, 1, 2, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.STONE.e()), 1, 1, 3, var3);
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class l extends w.b {
      private boolean V;

      public l() {
      }

      public l(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Chest", this.V);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.V = var1.i("Chest");
      }

      public void S(p var1, List var2, Random var3) {
         this.F((w.c)var1, var2, var3, 1, 1);
      }

      public static w.l Z(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
         return A(var7) && p.H(var0, var7) == null?new w.l(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 1, 0);
            this.F(var1, var2, var3, w.b.i.OPENING, 1, 1, 6);
            this.E(var1, var3, 3, 1, 2, 3, 1, 4, net.nb.f.TM.p(), net.nb.f.TM.p(), false);
            this.N(var1, net.nb.f.Tt.D(lb.p.SMOOTHBRICK.e()), 3, 1, 1, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.SMOOTHBRICK.e()), 3, 1, 5, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.SMOOTHBRICK.e()), 3, 2, 2, var3);
            this.N(var1, net.nb.f.Tt.D(lb.p.SMOOTHBRICK.e()), 3, 2, 4, var3);
            int var5 = 2;
            this.N(var1, net.nb.f.Tt.D(lb.p.SMOOTHBRICK.e()), 2, 1, var5, var3);
            ++var5;
            if(!this.V && var3.Y(new net.u.j(this.g(3, 3), this.Z(2), this.w(3, 3)))) {
               this.V = true;
               this.Y(var1, var3, var2, 3, 2, 3, net.y7.p.s);
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class o {
      public Class W;
      public final int O;
      public int H;
      public int Q;

      public o(Class var1, int var2, int var3) {
         this.W = var1;
         this.O = var2;
         this.Q = var3;
      }

      public boolean Q(int var1) {
         int[] var2 = p.d();
         return this.Q == 0 || this.H < this.Q;
      }

      public boolean S() {
         int[] var1 = p.d();
         return this.Q == 0 || this.H < this.Q;
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class p extends w.b {
      private boolean c;

      public p() {
      }

      public p(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
         this.c = var3.I() > 6;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Tall", this.c);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.c = var1.i("Tall");
      }

      public static w.p a(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
         if(!A(var7) || p.H(var0, var7) != null) {
            var7 = v.V(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
            if(!A(var7) || p.H(var0, var7) != null) {
               return null;
            }
         }

         return new w.p(var6, var1, var7, var5);
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            byte var5 = 11;
            if(!this.c) {
               var5 = 6;
            }

            this.u(var1, var3, 0, 0, 0, 13, var5 - 1, 14, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 4, 1, 0);
            this.A(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, net.nb.f.o.p(), net.nb.f.o.p(), false, 0);
            int var10000 = 1;
            var10000 = (boolean)12;
            int var8 = 1;
            var10000 = (var8 - 1) % 4;
            this.E(var1, var3, 1, 1, var8, 1, 4, var8, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
            this.E(var1, var3, 12, 1, var8, 12, 4, var8, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
            this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.EAST), 2, 3, var8, var3);
            this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.WEST), 11, 3, var8, var3);
            if(this.c) {
               this.E(var1, var3, 1, 6, var8, 1, 9, var8, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.E(var1, var3, 12, 6, var8, 12, 9, var8, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.E(var1, var3, 1, 1, var8, 1, 4, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
               this.E(var1, var3, 12, 1, var8, 12, 4, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
               if(this.c) {
                  this.E(var1, var3, 1, 6, var8, 1, 9, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
                  this.E(var1, var3, 12, 6, var8, 12, 9, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
               }
            }

            ++var8;
            var8 = 3;
            this.E(var1, var3, 3, 1, var8, 4, 3, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
            this.E(var1, var3, 6, 1, var8, 7, 3, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
            this.E(var1, var3, 9, 1, var8, 10, 3, var8, net.nb.f.W.p(), net.nb.f.W.p(), false);
            var8 = var8 + 2;
            if(this.c) {
               this.E(var1, var3, 1, 5, 1, 3, 5, 13, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.E(var1, var3, 10, 5, 1, 12, 5, 13, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.E(var1, var3, 4, 5, 1, 9, 5, 2, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.E(var1, var3, 4, 5, 12, 9, 5, 13, net.nb.f.oN.p(), net.nb.f.oN.p(), false);
               this.N(var1, net.nb.f.oN.p(), 9, 5, 11, var3);
               this.N(var1, net.nb.f.oN.p(), 8, 5, 11, var3);
               this.N(var1, net.nb.f.oN.p(), 9, 5, 10, var3);
               this.E(var1, var3, 3, 6, 2, 3, 6, 12, net.nb.f.I.p(), net.nb.f.I.p(), false);
               this.E(var1, var3, 10, 6, 2, 10, 6, 10, net.nb.f.I.p(), net.nb.f.I.p(), false);
               this.E(var1, var3, 4, 6, 2, 9, 6, 2, net.nb.f.I.p(), net.nb.f.I.p(), false);
               this.E(var1, var3, 4, 6, 12, 8, 6, 12, net.nb.f.I.p(), net.nb.f.I.p(), false);
               this.N(var1, net.nb.f.I.p(), 9, 6, 11, var3);
               this.N(var1, net.nb.f.I.p(), 8, 6, 11, var3);
               this.N(var1, net.nb.f.I.p(), 9, 6, 10, var3);
               net.yw.n var15 = net.nb.f.K.p().s(gp.i, aq.SOUTH);
               this.N(var1, var15, 10, 1, 13, var3);
               this.N(var1, var15, 10, 2, 13, var3);
               this.N(var1, var15, 10, 3, 13, var3);
               this.N(var1, var15, 10, 4, 13, var3);
               this.N(var1, var15, 10, 5, 13, var3);
               this.N(var1, var15, 10, 6, 13, var3);
               this.N(var1, var15, 10, 7, 13, var3);
               var10000 = 7;
               var10000 = 7;
               this.N(var1, net.nb.f.I.p(), 6, 9, 7, var3);
               this.N(var1, net.nb.f.I.p(), 7, 9, 7, var3);
               this.N(var1, net.nb.f.I.p(), 6, 8, 7, var3);
               this.N(var1, net.nb.f.I.p(), 7, 8, 7, var3);
               this.N(var1, net.nb.f.I.p(), 6, 7, 7, var3);
               this.N(var1, net.nb.f.I.p(), 7, 7, 7, var3);
               this.N(var1, net.nb.f.I.p(), 5, 7, 7, var3);
               this.N(var1, net.nb.f.I.p(), 8, 7, 7, var3);
               this.N(var1, net.nb.f.I.p(), 6, 7, 6, var3);
               this.N(var1, net.nb.f.I.p(), 6, 7, 8, var3);
               this.N(var1, net.nb.f.I.p(), 7, 7, 6, var3);
               this.N(var1, net.nb.f.I.p(), 7, 7, 8, var3);
               net.yw.n var11 = net.nb.f.uZ.p().s(lg.n, aq.UP);
               this.N(var1, var11, 5, 8, 7, var3);
               this.N(var1, var11, 8, 8, 7, var3);
               this.N(var1, var11, 6, 8, 6, var3);
               this.N(var1, var11, 6, 8, 8, var3);
               this.N(var1, var11, 7, 8, 6, var3);
               this.N(var1, var11, 7, 8, 8, var3);
            }

            this.Y(var1, var3, var2, 3, 3, 5, net.y7.p.pA);
            if(this.c) {
               this.N(var1, net.nb.f.ou.p(), 12, 9, 1, var3);
               this.Y(var1, var3, var2, 12, 8, 1, net.y7.p.pA);
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class q extends w.b {
      protected int d;

      public q() {
      }

      public q(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
         this.d = var2.nextInt(5);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("Type", this.d);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.d = var1.P("Type");
      }

      public void S(p var1, List var2, Random var3) {
         this.F((w.c)var1, var2, var3, 4, 1);
         this.r((w.c)var1, var2, var3, 1, 4);
         this.H((w.c)var1, var2, var3, 1, 4);
      }

      public static w.q u(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
         return A(var7) && p.H(var0, var7) == null?new w.q(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 4, 1, 0);
            this.E(var1, var3, 4, 1, 10, 6, 3, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.E(var1, var3, 0, 1, 4, 0, 3, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.E(var1, var3, 10, 1, 4, 10, 3, 6, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            switch(this.d) {
            case 0:
               this.N(var1, net.nb.f.TM.p(), 5, 1, 5, var3);
               this.N(var1, net.nb.f.TM.p(), 5, 2, 5, var3);
               this.N(var1, net.nb.f.TM.p(), 5, 3, 5, var3);
               this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.WEST), 4, 3, 5, var3);
               this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.EAST), 6, 3, 5, var3);
               this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.SOUTH), 5, 3, 4, var3);
               this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.NORTH), 5, 3, 6, var3);
               this.N(var1, net.nb.f.Tt.p(), 4, 1, 4, var3);
               this.N(var1, net.nb.f.Tt.p(), 4, 1, 5, var3);
               this.N(var1, net.nb.f.Tt.p(), 4, 1, 6, var3);
               this.N(var1, net.nb.f.Tt.p(), 6, 1, 4, var3);
               this.N(var1, net.nb.f.Tt.p(), 6, 1, 5, var3);
               this.N(var1, net.nb.f.Tt.p(), 6, 1, 6, var3);
               this.N(var1, net.nb.f.Tt.p(), 5, 1, 4, var3);
               this.N(var1, net.nb.f.Tt.p(), 5, 1, 6, var3);
            case 1:
               int var5 = 0;
               this.N(var1, net.nb.f.TM.p(), 3, 1, 3 + var5, var3);
               this.N(var1, net.nb.f.TM.p(), 7, 1, 3 + var5, var3);
               this.N(var1, net.nb.f.TM.p(), 3 + var5, 1, 3, var3);
               this.N(var1, net.nb.f.TM.p(), 3 + var5, 1, 7, var3);
               ++var5;
               this.N(var1, net.nb.f.TM.p(), 5, 1, 5, var3);
               this.N(var1, net.nb.f.TM.p(), 5, 2, 5, var3);
               this.N(var1, net.nb.f.TM.p(), 5, 3, 5, var3);
               this.N(var1, net.nb.f.dy.p(), 5, 4, 5, var3);
            case 2:
               int var7 = 1;
               this.N(var1, net.nb.f.TD.p(), 1, 3, var7, var3);
               this.N(var1, net.nb.f.TD.p(), 9, 3, var7, var3);
               ++var7;
               var7 = 1;
               this.N(var1, net.nb.f.TD.p(), var7, 3, 1, var3);
               this.N(var1, net.nb.f.TD.p(), var7, 3, 9, var3);
               ++var7;
               this.N(var1, net.nb.f.TD.p(), 5, 1, 4, var3);
               this.N(var1, net.nb.f.TD.p(), 5, 1, 6, var3);
               this.N(var1, net.nb.f.TD.p(), 5, 3, 4, var3);
               this.N(var1, net.nb.f.TD.p(), 5, 3, 6, var3);
               this.N(var1, net.nb.f.TD.p(), 4, 1, 5, var3);
               this.N(var1, net.nb.f.TD.p(), 6, 1, 5, var3);
               this.N(var1, net.nb.f.TD.p(), 4, 3, 5, var3);
               this.N(var1, net.nb.f.TD.p(), 6, 3, 5, var3);
               var7 = 1;
               this.N(var1, net.nb.f.TD.p(), 4, var7, 4, var3);
               this.N(var1, net.nb.f.TD.p(), 6, var7, 4, var3);
               this.N(var1, net.nb.f.TD.p(), 4, var7, 6, var3);
               this.N(var1, net.nb.f.TD.p(), 6, var7, 6, var3);
               ++var7;
               this.N(var1, net.nb.f.uZ.p(), 5, 3, 5, var3);
               var7 = 2;
               this.N(var1, net.nb.f.oN.p(), 2, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 3, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 4, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 5, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 6, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 7, 3, var7, var3);
               this.N(var1, net.nb.f.oN.p(), 8, 3, var7, var3);
               ++var7;
               net.yw.n var15 = net.nb.f.K.p().s(gp.i, aq.WEST);
               this.N(var1, var15, 9, 1, 3, var3);
               this.N(var1, var15, 9, 2, 3, var3);
               this.N(var1, var15, 9, 3, 3, var3);
               this.Y(var1, var3, var2, 3, 4, 8, net.y7.p.t);
            default:
               return true;
            }
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class r extends p.s {
      private r() {
      }

      public void N(Random var1, int var2, int var3, int var4, boolean var5) {
         int[] var6 = p.d();
         float var7 = var1.nextFloat();
         if(Float.compare(var7, 0.2F) < 0) {
            this.R = net.nb.f.TM.D(li.k);
         }

         if(var7 < 0.5F) {
            this.R = net.nb.f.TM.D(li.N);
         }

         if(var7 < 0.55F) {
            this.R = net.nb.f.uX.D(lh.m.STONEBRICK.U());
         }

         this.R = net.nb.f.TM.p();
         this.R = net.nb.f.ou.p();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class s extends w.b {
      private int P;

      public s() {
      }

      public s(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
         this.P = var4 != aq.NORTH && var4 != aq.SOUTH?var3.t():var3.X();
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.r("Steps", this.P);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.P = var1.P("Steps");
      }

      public static v o(List var0, Random var1, int var2, int var3, int var4, aq var5) {
         boolean var10000 = true;
         v var7 = v.V(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
         p var8 = p.H(var0, var7);
         return null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            int var5 = 0;
            if(var5 < this.P) {
               this.N(var1, net.nb.f.TM.p(), 0, 0, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 1, 0, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 2, 0, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 3, 0, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 4, 0, var5, var3);
               int var6 = 1;
               this.N(var1, net.nb.f.TM.p(), 0, var6, var5, var3);
               this.N(var1, net.nb.f.ou.p(), 1, var6, var5, var3);
               this.N(var1, net.nb.f.ou.p(), 2, var6, var5, var3);
               this.N(var1, net.nb.f.ou.p(), 3, var6, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 4, var6, var5, var3);
               ++var6;
               this.N(var1, net.nb.f.TM.p(), 0, 4, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 1, 4, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 2, 4, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 3, 4, var5, var3);
               this.N(var1, net.nb.f.TM.p(), 4, 4, var5, var3);
               ++var5;
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class u extends w.j {
      public void S(p var1, List var2, Random var3) {
         aq var4 = this.L();
         if(var4 != aq.NORTH && var4 != aq.EAST) {
            this.r((w.c)var1, var2, var3, 1, 1);
         } else {
            this.H((w.c)var1, var2, var3, 1, 1);
         }

      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 4, 4, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 1, 0);
            aq var5 = this.L();
            if(var5 != aq.NORTH && var5 != aq.EAST) {
               this.E(var1, var3, 0, 1, 1, 0, 3, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            this.E(var1, var3, 4, 1, 1, 4, 3, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            return true;
         }
      }

      private static xn b(xn var0) {
         return var0;
      }
   }

   public static class x extends w.b {
      private boolean F;
      private boolean s;

      public x() {
      }

      public x(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
         this.F = var2.nextInt(2) == 0;
         this.s = var2.nextInt(2) == 0;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Left", this.F);
         var1.c("Right", this.s);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.F = var1.i("Left");
         this.s = var1.i("Right");
      }

      public void S(p var1, List var2, Random var3) {
         this.F((w.c)var1, var2, var3, 1, 1);
         if(this.F) {
            this.r((w.c)var1, var2, var3, 1, 2);
         }

         if(this.s) {
            this.H((w.c)var1, var2, var3, 1, 2);
         }

      }

      public static w.x t(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
         return A(var7) && p.H(var0, var7) == null?new w.x(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 1, 1, 0);
            this.F(var1, var2, var3, w.b.i.OPENING, 1, 1, 6);
            net.yw.n var5 = net.nb.f.uZ.p().s(lg.n, aq.EAST);
            net.yw.n var6 = net.nb.f.uZ.p().s(lg.n, aq.WEST);
            this.e(var1, var3, var2, 0.1F, 1, 2, 1, var5);
            this.e(var1, var3, var2, 0.1F, 3, 2, 1, var6);
            this.e(var1, var3, var2, 0.1F, 1, 2, 5, var5);
            this.e(var1, var3, var2, 0.1F, 3, 2, 5, var6);
            if(this.F) {
               this.E(var1, var3, 0, 1, 2, 0, 3, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            if(this.s) {
               this.E(var1, var3, 4, 1, 2, 4, 3, 4, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class y extends w.b {
      private boolean D;

      public y() {
      }

      public y(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.w = var3;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("Mob", this.D);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.D = var1.i("Mob");
      }

      public void S(p var1, List var2, Random var3) {
         ((w.c)var1).L = this;
      }

      public static w.y n(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
         return A(var7) && p.H(var0, var7) == null?new w.y(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         p.d();
         this.u(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, w.K);
         this.F(var1, var2, var3, w.b.i.GRATES, 4, 1, 0);
         int var5 = 6;
         this.u(var1, var3, 1, var5, 1, 1, var5, 14, false, var2, w.K);
         this.u(var1, var3, 9, var5, 1, 9, var5, 14, false, var2, w.K);
         this.u(var1, var3, 2, var5, 1, 8, var5, 2, false, var2, w.K);
         this.u(var1, var3, 2, var5, 14, 8, var5, 14, false, var2, w.K);
         this.u(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, w.K);
         this.u(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, w.K);
         this.E(var1, var3, 1, 1, 1, 1, 1, 3, net.nb.f.dj.p(), net.nb.f.dj.p(), false);
         this.E(var1, var3, 9, 1, 1, 9, 1, 3, net.nb.f.dj.p(), net.nb.f.dj.p(), false);
         this.u(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, w.K);
         this.E(var1, var3, 4, 1, 9, 6, 1, 11, net.nb.f.dj.p(), net.nb.f.dj.p(), false);
         int var6 = 3;
         this.E(var1, var3, 0, 3, var6, 0, 4, var6, net.nb.f.d8.p(), net.nb.f.d8.p(), false);
         this.E(var1, var3, 10, 3, var6, 10, 4, var6, net.nb.f.d8.p(), net.nb.f.d8.p(), false);
         var6 = var6 + 2;
         var6 = 2;
         this.E(var1, var3, var6, 3, 15, var6, 4, 15, net.nb.f.d8.p(), net.nb.f.d8.p(), false);
         var6 = var6 + 2;
         net.yw.n var19 = net.nb.f.TV.p().s(l_.F, aq.NORTH);
         this.u(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, w.K);
         this.u(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, w.K);
         this.u(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, w.K);
         int var7 = 4;
         this.N(var1, var19, var7, 1, 4, var3);
         this.N(var1, var19, var7, 2, 5, var3);
         this.N(var1, var19, var7, 3, 6, var3);
         ++var7;
         net.yw.n var21 = net.nb.f.dE.p().s(rf.h, aq.NORTH);
         net.yw.n var8 = net.nb.f.dE.p().s(rf.h, aq.SOUTH);
         net.yw.n var9 = net.nb.f.dE.p().s(rf.h, aq.EAST);
         net.yw.n var10 = net.nb.f.dE.p().s(rf.h, aq.WEST);
         boolean var11 = true;
         boolean[] var12 = new boolean[12];
         int var13 = 0;
         int var10001 = var12.length;
         var12[var13] = Float.compare(var2.nextFloat(), 0.9F) > 0;
         var11 = var11 & var12[var13];
         ++var13;
         this.N(var1, var21.s(rf.N, Boolean.valueOf(var12[0])), 4, 3, 8, var3);
         this.N(var1, var21.s(rf.N, Boolean.valueOf(var12[1])), 5, 3, 8, var3);
         this.N(var1, var21.s(rf.N, Boolean.valueOf(var12[2])), 6, 3, 8, var3);
         this.N(var1, var8.s(rf.N, Boolean.valueOf(var12[3])), 4, 3, 12, var3);
         this.N(var1, var8.s(rf.N, Boolean.valueOf(var12[4])), 5, 3, 12, var3);
         this.N(var1, var8.s(rf.N, Boolean.valueOf(var12[5])), 6, 3, 12, var3);
         this.N(var1, var9.s(rf.N, Boolean.valueOf(var12[6])), 3, 3, 9, var3);
         this.N(var1, var9.s(rf.N, Boolean.valueOf(var12[7])), 3, 3, 10, var3);
         this.N(var1, var9.s(rf.N, Boolean.valueOf(var12[8])), 3, 3, 11, var3);
         this.N(var1, var10.s(rf.N, Boolean.valueOf(var12[9])), 7, 3, 9, var3);
         this.N(var1, var10.s(rf.N, Boolean.valueOf(var12[10])), 7, 3, 10, var3);
         this.N(var1, var10.s(rf.N, Boolean.valueOf(var12[11])), 7, 3, 11, var3);
         net.yw.n var24 = net.nb.f.TG.p();
         this.N(var1, var24, 4, 3, 9, var3);
         this.N(var1, var24, 5, 3, 9, var3);
         this.N(var1, var24, 6, 3, 9, var3);
         this.N(var1, var24, 4, 3, 10, var3);
         this.N(var1, var24, 5, 3, 10, var3);
         this.N(var1, var24, 6, 3, 10, var3);
         this.N(var1, var24, 4, 3, 11, var3);
         this.N(var1, var24, 5, 3, 11, var3);
         this.N(var1, var24, 6, 3, 11, var3);
         if(!this.D) {
            var5 = this.Z(3);
            net.u.j var25 = new net.u.j(this.g(5, 6), var5, this.w(5, 6));
            if(var3.Y(var25)) {
               this.D = true;
               var1.k(var25, net.nb.f.uw.p(), 2);
               net.ni.v var14 = var1.L(var25);
               if(var14 instanceof net.ni.u) {
                  ((net.ni.u)var14).H().S(net.ne.v.P(net.nk.e.class));
               }
            }
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends w.b {
      private boolean b;
      private boolean F;
      private boolean R;
      private boolean S;

      public z() {
      }

      public z(int var1, Random var2, v var3, aq var4) {
         super(var1);
         this.n(var4);
         this.Z = this.e(var2);
         this.w = var3;
         this.b = var2.nextBoolean();
         this.F = var2.nextBoolean();
         this.R = var2.nextBoolean();
         this.S = var2.nextInt(3) > 0;
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.c("leftLow", this.b);
         var1.c("leftHigh", this.F);
         var1.c("rightLow", this.R);
         var1.c("rightHigh", this.S);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.b = var1.i("leftLow");
         this.F = var1.i("leftHigh");
         this.R = var1.i("rightLow");
         this.S = var1.i("rightHigh");
      }

      public void S(p var1, List var2, Random var3) {
         int var4 = 3;
         int var5 = 5;
         aq var6 = this.L();
         if(var6 == aq.WEST || var6 == aq.NORTH) {
            var4 = 8 - var4;
            var5 = 8 - var5;
         }

         this.F((w.c)var1, var2, var3, 5, 1);
         if(this.b) {
            this.r((w.c)var1, var2, var3, var4, 1);
         }

         if(this.F) {
            this.r((w.c)var1, var2, var3, var5, 7);
         }

         if(this.R) {
            this.H((w.c)var1, var2, var3, var4, 1);
         }

         if(this.S) {
            this.H((w.c)var1, var2, var3, var5, 7);
         }

      }

      public static w.z d(List var0, Random var1, int var2, int var3, int var4, aq var5, int var6) {
         v var7 = v.V(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
         return A(var7) && p.H(var0, var7) == null?new w.z(var6, var1, var7, var5):null;
      }

      public boolean Q(net.yv.r var1, Random var2, v var3) {
         int[] var4 = p.d();
         if(this.w(var1, var3)) {
            return false;
         } else {
            this.u(var1, var3, 0, 0, 0, 9, 8, 10, true, var2, w.K);
            this.F(var1, var2, var3, this.Z, 4, 3, 0);
            if(this.b) {
               this.E(var1, var3, 0, 3, 1, 0, 5, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            if(this.R) {
               this.E(var1, var3, 9, 3, 1, 9, 5, 3, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            if(this.F) {
               this.E(var1, var3, 0, 5, 7, 0, 7, 9, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            if(this.S) {
               this.E(var1, var3, 9, 5, 7, 9, 7, 9, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            }

            this.E(var1, var3, 5, 1, 10, 7, 3, 10, net.nb.f.ou.p(), net.nb.f.ou.p(), false);
            this.u(var1, var3, 1, 2, 1, 8, 2, 6, false, var2, w.K);
            this.u(var1, var3, 4, 1, 5, 4, 4, 9, false, var2, w.K);
            this.u(var1, var3, 8, 1, 5, 8, 4, 9, false, var2, w.K);
            this.u(var1, var3, 1, 4, 7, 3, 4, 9, false, var2, w.K);
            this.u(var1, var3, 1, 3, 5, 3, 3, 6, false, var2, w.K);
            this.E(var1, var3, 1, 3, 4, 3, 3, 4, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.E(var1, var3, 1, 4, 6, 3, 4, 6, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.u(var1, var3, 5, 1, 7, 7, 1, 8, false, var2, w.K);
            this.E(var1, var3, 5, 1, 9, 7, 1, 9, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.E(var1, var3, 5, 2, 7, 7, 2, 7, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.E(var1, var3, 4, 5, 7, 4, 5, 9, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.E(var1, var3, 8, 5, 7, 8, 5, 9, net.nb.f.Tt.p(), net.nb.f.Tt.p(), false);
            this.E(var1, var3, 5, 5, 7, 7, 5, 9, net.nb.f.dn.p(), net.nb.f.dn.p(), false);
            this.N(var1, net.nb.f.uZ.p().s(lg.n, aq.SOUTH), 6, 5, 6, var3);
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
