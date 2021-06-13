package net.yv;

import net.xn;
import net.yv.r;

public class o implements Comparable {
   private static long F;
   private final net.y9.l W;
   public final net.u.j z;
   public long p;
   public int l;
   private final long E;

   public o(net.u.j var1, net.y9.l var2) {
      this.E = (long)(F++);
      this.z = var1.F();
      this.W = var2;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof o)) {
         return false;
      } else {
         o var2 = (o)var1;
         return this.z.equals(var2.z) && net.y9.l.f(this.W, var2.W);
      }
   }

   public int hashCode() {
      return this.z.hashCode();
   }

   public o D(long var1) {
      this.p = var1;
      return this;
   }

   public void E(int var1) {
      this.l = var1;
   }

   public int d(o var1) {
      net.u.d[] var2 = r.C();
      return Long.compare(this.p, var1.p) < 0?-1:(Long.compare(this.p, var1.p) > 0?1:(this.l != var1.l?this.l - var1.l:(Long.compare(this.E, var1.E) < 0?-1:(Long.compare(this.E, var1.E) > 0?1:0))));
   }

   public String toString() {
      return net.y9.l.h(this.W) + ": " + this.z + ", " + this.p + ", " + this.l + ", " + this.E;
   }

   public net.y9.l l() {
      return this.W;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
