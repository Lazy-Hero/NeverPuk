package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class sk implements net.n2.k {
   private long O;
   private long A;

   public sk() {
   }

   public sk(long var1, long var3, boolean var5) {
      s8.x();
      super();
      this.O = var1;
      this.A = var3;
      if(!var5) {
         this.A = -this.A;
         if(this.A == 0L) {
            this.A = -1L;
         }
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.O = var1.readLong();
      this.A = var1.readLong();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeLong(this.O);
      var1.writeLong(this.A);
   }

   public void E(net.x.t var1) {
      var1.M(this);
   }

   public long O() {
      return this.O;
   }

   public long g() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
