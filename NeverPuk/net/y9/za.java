package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class za extends l {
   public static final net.yr.o l = net.yr.o.k("north");
   public static final net.yr.o Y = net.yr.o.k("east");
   public static final net.yr.o d = net.yr.o.k("south");
   public static final net.yr.o W = net.yr.o.k("west");
   public static final net.yr.o n = net.yr.o.k("up");
   public static final net.yr.o o = net.yr.o.k("down");

   protected za() {
      super(net.y1.l.u, net.y1.h.Q);
      this.f(net.ys.r.X);
      this.r(this.b.T().s(l, Boolean.valueOf(false)).s(Y, Boolean.valueOf(false)).s(d, Boolean.valueOf(false)).s(W, Boolean.valueOf(false)).s(n, Boolean.valueOf(false)).s(o, Boolean.valueOf(false)));
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      l var4 = var2.Z(var3.b()).Q();
      l var5 = var2.Z(var3.h()).Q();
      l var6 = var2.Z(var3.D()).Q();
      l var7 = var2.Z(var3.g()).Q();
      l var8 = var2.Z(var3.d()).Q();
      l var9 = var2.Z(var3.H()).Q();
      return var1.s(o, Boolean.valueOf(var4 == this || var4 == net.nb.f.Tn || var4 == net.nb.f.Tz)).s(n, Boolean.valueOf(var5 == this || var5 == net.nb.f.Tn)).s(l, Boolean.valueOf(var6 == this || var6 == net.nb.f.Tn)).s(Y, Boolean.valueOf(var7 == this || var7 == net.nb.f.Tn)).s(d, Boolean.valueOf(var8 == this || var8 == net.nb.f.Tn)).s(W, Boolean.valueOf(var9 == this || var9 == net.nb.f.Tn));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = var1.J(var2, var3);
      float var10000 = 0.1875F;
      float var5 = ((Boolean)var1.i(W)).booleanValue()?0.0F:0.1875F;
      float var6 = ((Boolean)var1.i(o)).booleanValue()?0.0F:0.1875F;
      float var7 = ((Boolean)var1.i(l)).booleanValue()?0.0F:0.1875F;
      float var8 = ((Boolean)var1.i(Y)).booleanValue()?1.0F:0.8125F;
      float var9 = ((Boolean)var1.i(n)).booleanValue()?1.0F:0.8125F;
      float var10 = ((Boolean)var1.i(d)).booleanValue()?1.0F:0.8125F;
      return new net.u.e((double)var5, (double)var6, (double)var7, (double)var8, (double)var9, (double)var10);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      int[] var8 = g3.v.w();
      var1 = var1.J(var2, var3);
      float var10000 = 0.1875F;
      var10000 = 0.8125F;
      F(var3, var4, var5, new net.u.e(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.8125D, 0.8125D));
      if(((Boolean)var1.i(W)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.0D, 0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.8125D));
      }

      if(((Boolean)var1.i(Y)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.8125D, 0.1875D, 0.1875D, 1.0D, 0.8125D, 0.8125D));
      }

      if(((Boolean)var1.i(n)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.1875D, 0.8125D, 0.1875D, 0.8125D, 1.0D, 0.8125D));
      }

      if(((Boolean)var1.i(o)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.1875D, 0.8125D));
      }

      if(((Boolean)var1.i(l)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.1875D, 0.1875D, 0.0D, 0.8125D, 0.8125D, 0.1875D));
      }

      if(((Boolean)var1.i(d)).booleanValue()) {
         F(var3, var4, var5, new net.u.e(0.1875D, 0.1875D, 0.8125D, 0.8125D, 0.8125D, 1.0D));
      }

   }

   public int d(net.yw.n var1) {
      return 0;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!this.v(var1, var2)) {
         var1.e(var2, true);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Y1;
   }

   public int T(Random var1) {
      return var1.nextInt(2);
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.v(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.v(var2, var3)) {
         var2.c(var3, this, 1);
      }

   }

   public boolean v(net.yv.r var1, net.u.j var2) {
      boolean var3 = var1.y(var2.h());
      boolean var4 = var1.y(var2.b());

      for(aq var6 : aq.u.HORIZONTAL) {
         net.u.j var7 = var2.C(var6);
         l var8 = var1.Z(var7).Q();
         if(var8 == this) {
            return false;
         }
      }

      l var10 = var1.Z(var2.b()).Q();
      return var10 == this || var10 == net.nb.f.Tz;
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      l var5 = var2.Z(var3.C(var4)).Q();
      return var5 != this && var5 != net.nb.f.Tn && (var4 != aq.DOWN || var5 != net.nb.f.Tz);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l, Y, d, W, n, o});
   }

   public boolean c(o8 var1, net.u.j var2) {
      return false;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
