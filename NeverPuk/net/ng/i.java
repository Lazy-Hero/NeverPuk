package net.ng;

import net.xn;
import net.c0.w;
import net.ne.l;
import net.ne.v;
import net.nj.f;
import net.u.d;
import net.yz.m_;

public abstract class i implements w {
   private final m_ o;
   private static d[] Z;

   public i(Class var1) {
      V();
      super();
      if(l.class.isAssignableFrom(var1)) {
         this.o = v.P(var1);
         d.h(new d[1]);
      }

      if(net.ni.v.class.isAssignableFrom(var1)) {
         this.o = net.ni.v.p(var1);
      }

      this.o = null;
   }

   public f X(net.c0.l var1, f var2, int var3) {
      if((new m_(var2.J("id"))).equals(this.o)) {
         var2 = this.m(var1, var2, var3);
      }

      return var2;
   }

   abstract f m(net.c0.l var1, f var2, int var3);

   public static void W(d[] var0) {
      Z = var0;
   }

   public static d[] V() {
      return Z;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(V() != null) {
         W(new d[5]);
      }

   }
}
