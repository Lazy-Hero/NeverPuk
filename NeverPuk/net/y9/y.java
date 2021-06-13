package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lk;
import net.y9.lm;
import net.y9.rw;
import net.y9.t;
import net.y9.zu;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;

public class y extends t implements lm {
   public static final net.yr.w o = net.yr.w.l("variant", y.t.class);
   public static final net.yr.w J = net.yr.w.l("half", y.m.class);
   public static final net.yr.w u = rw.N;

   public y() {
      super(net.y1.l.Y);
      this.r(this.b.T().s(o, y.t.SUNFLOWER).s(J, y.m.LOWER).s(u, aq.NORTH));
      this.r(0.0F);
      this.i(lk.G);
      this.o("doublePlant");
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return I;
   }

   private y.t e(o8 var1, net.u.j var2, net.yw.n var3) {
      if(var3.Q() == this) {
         var3 = var3.J(var1, var2);
         return (y.t)var3.i(o);
      } else {
         return y.t.FERN;
      }
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && var1.y(var2.h());
   }

   public boolean X(o8 var1, net.u.j var2) {
      net.yw.n var3 = var1.Z(var2);
      if(var3.Q() != this) {
         return true;
      } else {
         y.t var4 = (y.t)var3.J(var1, var2).i(o);
         return var4 == y.t.FERN || var4 == y.t.GRASS;
      }
   }

   protected void F(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.p(var1, var2, var3)) {
         boolean var4 = var3.i(J) == y.m.UPPER;
         net.u.j var6 = var2.b();
         l var8 = var1.Z(var6).Q();
         if(this == this) {
            var1.k(var2, net.nb.f.ou.p(), 2);
         }

         if(var8 == this) {
            var1.k(var6, net.nb.f.ou.p(), 3);
            this.N(var1, var6, var3, 0);
         }
      }

   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(var3.i(J) == y.m.UPPER) {
         return var1.Z(var2.b()).Q() == this;
      } else {
         net.yw.n var4 = var1.Z(var2.h());
         return var4.Q() == this && super.p(var1, var2, var4);
      }
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      if(var1.i(J) == y.m.UPPER) {
         return net.nb.j.SL;
      } else {
         y.t var4 = (y.t)var1.i(o);
         return var4 == y.t.FERN?net.nb.j.SL:(var4 == y.t.GRASS?(var2.nextInt(8) == 0?net.nb.j.Q:net.nb.j.SL):super.X(var1, var2, var3));
      }
   }

   public int z(net.yw.n var1) {
      return var1.i(J) != y.m.UPPER && var1.i(o) != y.t.GRASS?((y.t)var1.i(o)).l():0;
   }

   public void p(net.yv.r var1, net.u.j var2, y.t var3, int var4) {
      var1.k(var2, this.p().s(J, y.m.LOWER).s(o, var3), var4);
      var1.k(var2.h(), this.p().s(J, y.m.UPPER), var4);
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      var1.k(var2.h(), this.p().s(J, y.m.UPPER), 2);
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      if(var1.x || var6.Z() != net.nb.j.W5 || var4.i(J) != y.m.LOWER || !this.J(var1, var3, var4, var2)) {
         super.U(var1, var2, var3, var4, var5, var6);
      }

   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      label0: {
         int[] var5 = g3.v.w();
         if(var3.i(J) == y.m.UPPER) {
            if(var1.Z(var2.b()).Q() != this) {
               break label0;
            }

            if(var4.a6.V) {
               var1.J(var2.b());
            }

            net.yw.n var6 = var1.Z(var2.b());
            y.t var7 = (y.t)var6.i(o);
            if(var7 != y.t.FERN && var7 != y.t.GRASS) {
               var1.e(var2.b(), true);
            }

            if(var1.x) {
               var1.J(var2.b());
            }

            if(!var4.S().B() && var4.S().Z() == net.nb.j.W5) {
               this.J(var1, var2, var6, var4);
               var1.J(var2.b());
            }

            var1.e(var2.b(), true);
         }

         if(var1.Z(var2.h()).Q() == this) {
            var1.k(var2.h(), net.nb.f.ou.p(), 2);
         }
      }

      super.X(var1, var2, var3, var4);
   }

   private boolean J(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      y.t var5 = (y.t)var3.i(o);
      if(var5 != y.t.FERN && var5 != y.t.GRASS) {
         return false;
      } else {
         var4.S(net.v.q.i(this));
         int var6 = (var5 == y.t.GRASS?zu.i.GRASS:zu.i.FERN).j();
         e(var1, var2, new ks(net.nb.f.TU, 2, var6));
         return true;
      }
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(y.t var6 : y.t.values()) {
         var2.add(new ks(this, 1, var6.l()));
      }

   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this, 1, this.e(var1, var2, var3).l());
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      y.t var5 = this.e(var1, var2, var3);
      return var5 != y.t.GRASS && var5 != y.t.FERN;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      e(var1, var3, new ks(this, 1, this.e(var1, var3, var4).l()));
   }

   public net.yw.n D(int var1) {
      return (var1 & 8) > 0?this.p().s(J, y.m.UPPER):this.p().s(J, y.m.LOWER).s(o, y.t.l(var1 & 7));
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      if(var1.i(J) == y.m.UPPER) {
         net.yw.n var4 = var2.Z(var3.b());
         if(var4.Q() == this) {
            var1 = var1.s(o, var4.i(o));
         }
      }

      return var1;
   }

   public int d(net.yw.n var1) {
      return var1.i(J) == y.m.UPPER?8 | ((aq)var1.i(u)).u():((y.t)var1.i(o)).l();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{J, o, u});
   }

   public l.z V() {
      return l.z.XZ;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum m implements au {
      UPPER,
      LOWER;

      public String toString() {
         return this.f();
      }

      public String f() {
         return this == UPPER?"upper":"lower";
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum t implements au {
      SUNFLOWER,
      SYRINGA,
      GRASS,
      FERN,
      ROSE,
      PAEONIA;

      private static final y.t[] F;
      private final int Y;
      private final String x;
      private final String Q;

      private t(int var3, String var4) {
         this(var3, var4, var4);
      }

      private t(int var3, String var4, String var5) {
         this.Y = var3;
         this.x = var4;
         this.Q = var5;
      }

      public int l() {
         return this.Y;
      }

      public String toString() {
         return this.x;
      }

      public static y.t l(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= F.length) {
            var0 = 0;
         }

         return F[var0];
      }

      public String f() {
         return this.x;
      }

      public String P() {
         return this.Q;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
