package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.sg;
import net.y9.g3;
import net.y9.z4;
import net.yv.o8;
import net.yz.aq;

public class rt extends z4 {
   protected static final net.u.e a = new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);

   protected rt() {
      super(net.y1.l.S);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return a;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean j(net.yw.n var1) {
      return true;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return true;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean a() {
      return true;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new sg();
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Wj;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.Wj);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(var1.x) {
         return true;
      } else {
         net.ni.v var11 = var1.L(var2);
         return var11 instanceof sg && ((sg)var11).a(var4);
      }
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return !this.H(var1, var2) && super.J(var1, var2);
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
