package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.r3;
import net.yv.o8;
import net.yz.aq;

public abstract class q extends l {
   protected static final net.u.e c = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.03125D, 0.9375D);
   protected static final net.u.e W = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.0625D, 0.9375D);
   protected static final net.u.e a = new net.u.e(0.125D, 0.0D, 0.125D, 0.875D, 0.25D, 0.875D);

   protected q(net.y1.l var1) {
      this(var1, var1.f());
   }

   protected q(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
      this.f(net.ys.r.i);
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      boolean var4 = this.V(var1) > 0;
      return c;
   }

   public int u(net.yv.r var1) {
      return 20;
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

   public boolean c(o8 var1, net.u.j var2) {
      return true;
   }

   public boolean a() {
      return true;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return this.t(var1, var2.b());
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.t(var2, var3.b())) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

   }

   private boolean t(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2).z() || var1.Z(var2).Q() instanceof r3;
   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         int var5 = this.V(var3);
         this.V(var1, var2, var3, var5);
      }

   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var1.x) {
         int var5 = this.V(var3);
         this.V(var1, var2, var3, var5);
      }

   }

   protected void V(net.yv.r var1, net.u.j var2, net.yw.n var3, int var4) {
      g3.v.w();
      int var6 = this.v(var1, var2);
      boolean var7 = var4 > 0;
      boolean var8 = var6 > 0;
      if(var4 != var6) {
         var3 = this.h(var3, var6);
         var1.k(var2, var3, 2);
         this.C(var1, var2);
         var1.k(var2, var2);
      }

   }

   protected abstract void z(net.yv.r var1, net.u.j var2);

   protected abstract void p(net.yv.r var1, net.u.j var2);

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.V(var3) > 0) {
         this.C(var1, var2);
      }

      super.V(var1, var2, var3);
   }

   protected void C(net.yv.r var1, net.u.j var2) {
      var1.b(var2, this, false);
      var1.b(var2.b(), this, false);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return this.V(var1);
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4 == aq.UP?this.V(var1):0;
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.DESTROY;
   }

   protected abstract int v(net.yv.r var1, net.u.j var2);

   protected abstract int V(net.yw.n var1);

   protected abstract net.yw.n h(net.yw.n var1, int var2);

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
