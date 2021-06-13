package net.y9;

import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.a5;
import net.yz.aq;

public class o extends l {
   private static final Map Y = new IdentityHashMap();

   protected o() {
      super(net.y1.l.q);
   }

   public a5 o(net.yw.n var1) {
      return a5.INVISIBLE;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean f(net.yw.n var1, boolean var2) {
      return false;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
   }

   public boolean X(o8 var1, net.u.j var2) {
      return true;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public static void x(l var0, int var1) {
      int[] var2 = g3.v.w();
      if(!Y.containsKey(var0)) {
         Y.put(var0, Integer.valueOf(var0.y));
      }

      var0.y = var1;
   }

   public static void p(l var0) {
      int[] var1 = g3.v.w();
      if(Y.containsKey(var0)) {
         int var2 = ((Integer)Y.get(var0)).intValue();
         x(var0, var2);
      }

   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
