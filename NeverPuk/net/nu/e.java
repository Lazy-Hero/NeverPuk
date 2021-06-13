package net.nu;

import java.io.IOException;
import net.xn;
import net.n2.h;
import net.n2.k;
import net.nh.f;
import net.u.d;

public class e implements k {
   private long W;
   private static int[] X;

   public e() {
   }

   public e(long var1) {
      C();
      super();
      this.W = var1;
      d.h(new d[1]);
   }

   public void E(h var1) throws IOException {
      this.W = var1.readLong();
   }

   public void O(h var1) throws IOException {
      var1.writeLong(this.W);
   }

   public void U(f var1) {
      var1.V(this);
   }

   public long M() {
      return this.W;
   }

   public static void q(int[] var0) {
      X = var0;
   }

   public static int[] C() {
      return X;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(C() != null) {
         q(new int[2]);
      }

   }
}
