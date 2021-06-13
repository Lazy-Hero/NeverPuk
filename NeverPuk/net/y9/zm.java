package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.su;
import net.y9.g3;
import net.y9.l;
import net.y9.ra;
import net.y9.rj;
import net.y9.z4;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class zm extends z4 {
   public static final net.yr.g c = rj.n;
   public static final net.yr.w f = rj.Y;

   public zm() {
      super(net.y1.l.a);
      this.r(this.b.T().s(c, aq.NORTH).s(f, rj.n.DEFAULT));
      this.r(-1.0F);
   }

   @Nullable
   public net.ni.v J(net.yv.r var1, int var2) {
      return null;
   }

   public static net.ni.v z(net.yw.n var0, aq var1, boolean var2, boolean var3) {
      return new su(var0, var1, var2, var3);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof su) {
         ((su)var4).u();
      } else {
         super.V(var1, var2, var3);
      }

   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return false;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.u.j var5 = var2.C(((aq)var3.i(c)).f());
      g3.v.w();
      net.yw.n var6 = var1.Z(var5);
      if(var6.Q() instanceof ra && ((Boolean)var6.i(ra.o)).booleanValue()) {
         var1.J(var5);
      }

   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(!var1.x && var1.L(var2) == null) {
         var1.J(var2);
         return true;
      } else {
         return false;
      }
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      int[] var6 = g3.v.w();
      if(!var1.x) {
         su var7 = this.q(var1, var2);
         if(var7 != null) {
            net.yw.n var8 = var7.w();
            var8.Q().N(var1, var2, var8, 0);
         }
      }

   }

   @Nullable
   public net.u.m o(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.r var4, net.u.r var5) {
      return null;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         var2.L(var3);
      }

   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      su var4 = this.q(var2, var3);
      return null;
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      su var8 = this.q(var2, var3);
      var8.c(var2, var3, var4, var5, var6);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      su var4 = this.q(var2, var3);
      return var4.a(var2, var3);
   }

   @Nullable
   private su q(o8 var1, net.u.j var2) {
      net.ni.v var3 = var1.L(var2);
      return var3 instanceof su?(su)var3:null;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return ks.a;
   }

   public net.yw.n D(int var1) {
      return this.p().s(c, rj.r(var1)).s(f, (var1 & 8) > 0?rj.n.STICKY:rj.n.DEFAULT);
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(c, var2.d((aq)var1.i(c)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(c)));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(c)).w();
      if(var1.i(f) == rj.n.STICKY) {
         var2 |= 8;
      }

      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{c, f});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
