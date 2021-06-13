package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class t extends l {
   protected static final net.u.e a = new net.u.e(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.6000000238418579D, 0.699999988079071D);

   protected t() {
      this(net.y1.l.u);
   }

   protected t(net.y1.l var1) {
      this(var1, var1.f());
   }

   protected t(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
      this.R(true);
      this.f(net.ys.r.X);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.H(var1.Z(var2.b()));
   }

   protected boolean H(net.yw.n var1) {
      int[] var2 = g3.v.w();
      return var1.Q() == net.nb.f.p || var1.Q() == net.nb.f.dl || var1.Q() == net.nb.f.dJ;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      super.Z(var1, var2, var3, var4, var5);
      this.F(var2, var3, var1);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      this.F(var1, var2, var3);
   }

   protected void F(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!this.p(var1, var2, var3)) {
         this.N(var1, var2, var3, 0);
         var1.k(var2, net.nb.f.ou.p(), 3);
      }

   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return this.H(var1.Z(var2.b()));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return a;
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

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
