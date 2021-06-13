package net.y9;

import com.google.common.base.Predicate;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.r3;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class lg extends l {
   public static final net.yr.g n = net.yr.g.B("facing", new Predicate() {
      public boolean s(@Nullable aq var1) {
         return var1 != aq.DOWN;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });
   protected static final net.u.e a = new net.u.e(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
   protected static final net.u.e k = new net.u.e(0.3499999940395355D, 0.20000000298023224D, 0.699999988079071D, 0.6499999761581421D, 0.800000011920929D, 1.0D);
   protected static final net.u.e N = new net.u.e(0.3499999940395355D, 0.20000000298023224D, 0.0D, 0.6499999761581421D, 0.800000011920929D, 0.30000001192092896D);
   protected static final net.u.e R = new net.u.e(0.699999988079071D, 0.20000000298023224D, 0.3499999940395355D, 1.0D, 0.800000011920929D, 0.6499999761581421D);
   protected static final net.u.e Y = new net.u.e(0.0D, 0.20000000298023224D, 0.3499999940395355D, 0.30000001192092896D, 0.800000011920929D, 0.6499999761581421D);

   protected lg() {
      super(net.y1.l.c);
      this.r(this.b.T().s(n, aq.UP));
      this.R(true);
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.n[((aq)var1.i(n)).ordinal()]) {
      case 1:
         return Y;
      case 2:
         return R;
      case 3:
         return N;
      case 4:
         return k;
      default:
         return a;
      }
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   private boolean M(net.yv.r var1, net.u.j var2) {
      l var3 = var1.Z(var2).Q();
      boolean var4 = var3 == net.nb.f.dU || var3 == net.nb.f.N;
      if(var1.Z(var2).z()) {
         return true;
      } else {
         boolean var5 = var3 instanceof r3 || var3 == net.nb.f.Tm || var3 == net.nb.f.od || var3 == net.nb.f.T5;
         return true;
      }
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      for(aq var4 : n.Z()) {
         if(this.a(var1, var2, var4)) {
            return true;
         }
      }

      return false;
   }

   private boolean a(net.yv.r var1, net.u.j var2, aq var3) {
      net.u.j var4 = var2.C(var3.f());
      net.yw.n var5 = var1.Z(var4);
      l var6 = var5.Q();
      net.yw.g var7 = var5.B(var1, var4, var3);
      return var3.equals(aq.UP) && this.M(var1, var4)?true:(var3 != aq.UP && var3 != aq.DOWN?!m(var6) && var7 == net.yw.g.SOLID:false);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      if(this.a(var1, var2, var3)) {
         return this.p().s(n, var3);
      } else {
         for(aq var10 : aq.u.HORIZONTAL) {
            if(this.a(var1, var2, var10)) {
               return this.p().s(n, var10);
            }
         }

         return this.p();
      }
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.e(var1, var2, var3);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.X(var2, var3, var1);
   }

   protected boolean X(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!this.e(var1, var2, var3)) {
         return true;
      } else {
         aq var5 = (aq)var3.i(n);
         aq.l var6 = var5.r();
         aq var7 = var5.f();
         net.u.j var8 = var2.C(var7);
         boolean var9 = false;
         if(var6.P() && var1.Z(var8).B(var1, var8, var5) != net.yw.g.SOLID) {
            var9 = true;
         }

         if(var6.v() && !this.M(var1, var8)) {
            var9 = true;
         }

         return false;
      }
   }

   protected boolean e(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(var3.Q() == this && this.a(var1, var2, (aq)var3.i(n))) {
         return true;
      } else {
         if(var1.Z(var2).Q() == this) {
            this.N(var1, var2, var3, 0);
            var1.J(var2);
         }

         return false;
      }
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      aq var6 = (aq)var1.i(n);
      double var7 = (double)var3.t() + 0.5D;
      g3.v.w();
      double var9 = (double)var3.h() + 0.7D;
      double var11 = (double)var3.y() + 0.5D;
      double var10000 = 0.22D;
      var10000 = 0.27D;
      if(var6.r().P()) {
         aq var17 = var6.f();
         var2.n(ai.SMOKE_NORMAL, var7 + 0.27D * (double)var17.v(), var9 + 0.22D, var11 + 0.27D * (double)var17.P(), 0.0D, 0.0D, 0.0D, new int[0]);
         var2.n(ai.FLAME, var7 + 0.27D * (double)var17.v(), var9 + 0.22D, var11 + 0.27D * (double)var17.P(), 0.0D, 0.0D, 0.0D, new int[0]);
      }

      var2.n(ai.SMOKE_NORMAL, var7, var9, var11, 0.0D, 0.0D, 0.0D, new int[0]);
      var2.n(ai.FLAME, var7, var9, var11, 0.0D, 0.0D, 0.0D, new int[0]);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      net.yw.n var2 = this.p();
      switch(var1) {
      case 1:
         var2 = var2.s(n, aq.EAST);
         break;
      case 2:
         var2 = var2.s(n, aq.WEST);
         break;
      case 3:
         var2 = var2.s(n, aq.SOUTH);
         break;
      case 4:
         var2 = var2.s(n, aq.NORTH);
         break;
      case 5:
      default:
         var2 = var2.s(n, aq.UP);
      }

      return var2;
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      switch(null.n[((aq)var1.i(n)).ordinal()]) {
      case 1:
         var2 = var2 | 1;
         break;
      case 2:
         var2 = var2 | 2;
         break;
      case 3:
         var2 = var2 | 3;
         break;
      case 4:
         var2 = var2 | 4;
         break;
      case 5:
      case 6:
      default:
         var2 = var2 | 5;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(n)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
