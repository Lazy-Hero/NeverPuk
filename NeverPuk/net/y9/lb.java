package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.lu;
import net.yv.o8;
import net.yz.au;

public abstract class lb extends lu {
   public static final net.yr.o r = net.yr.o.k("seamless");
   public static final net.yr.w v = net.yr.w.l("variant", lb.p.class);

   public lb() {
      g3.v.w();
      super(net.y1.l.z);
      net.yw.n var2 = this.b.T();
      if(this.l()) {
         var2 = var2.s(r, Boolean.valueOf(false));
      }

      var2 = var2.s(R, lu.k.BOTTOM);
      this.r(var2.s(v, lb.p.STONE));
      this.f(net.ys.r.M);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.Tt);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.Tt, 1, ((lb.p)var3.i(v)).e());
   }

   public String G(int var1) {
      return super.j() + "." + lb.p.W(var1).A();
   }

   public net.yr.h R() {
      return v;
   }

   public Comparable b(ks var1) {
      return lb.p.W(var1.n() & 7);
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(lb.p var6 : lb.p.values()) {
         if(var6 != lb.p.WOOD) {
            var2.add(new ks(this, 1, var6.e()));
         }
      }

   }

   public net.yw.n D(int var1) {
      g3.v.w();
      net.yw.n var3 = this.p().s(v, lb.p.W(var1 & 7));
      if(this.l()) {
         var3 = var3.s(r, Boolean.valueOf((var1 & 8) != 0));
      }

      var3 = var3.s(R, (var1 & 8) == 0?lu.k.BOTTOM:lu.k.TOP);
      return var3;
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((lb.p)var1.i(v)).e();
      if(this.l()) {
         if(((Boolean)var1.i(r)).booleanValue()) {
            var2 |= 8;
         }
      } else if(var1.i(R) == lu.k.TOP) {
         var2 |= 8;
      }

      return var2;
   }

   protected net.yw.q k() {
      return this.l()?new net.yw.q(this, new net.yr.h[]{r, v}):new net.yw.q(this, new net.yr.h[]{R, v});
   }

   public int z(net.yw.n var1) {
      return ((lb.p)var1.i(v)).e();
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((lb.p)var1.i(v)).c();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum p implements au {
      STONE,
      SAND,
      WOOD,
      COBBLESTONE,
      BRICK,
      SMOOTHBRICK,
      NETHERBRICK,
      QUARTZ;

      private static final lb.p[] o;
      private final int d;
      private final net.y1.h r;
      private final String A;
      private final String U;

      private p(int var3, net.y1.h var4, String var5) {
         this(var3, var4, var5, var5);
      }

      private p(int var3, net.y1.h var4, String var5, String var6) {
         this.d = var3;
         this.r = var4;
         this.A = var5;
         this.U = var6;
      }

      public int e() {
         return this.d;
      }

      public net.y1.h c() {
         return this.r;
      }

      public String toString() {
         return this.A;
      }

      public static lb.p W(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= o.length) {
            var0 = 0;
         }

         return o[var0];
      }

      public String f() {
         return this.A;
      }

      public String A() {
         return this.U;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
