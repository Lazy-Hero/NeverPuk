package net.no;

import java.io.IOException;
import net.no.s8;

public class ss implements net.n2.k {
   private net.u.p H;
   private ss.c[] z;

   public ss() {
   }

   public ss(int var1, short[] var2, net.l.q var3) {
      s8.x();
      super();
      this.H = new net.u.p(var3.Q, var3.U);
      this.z = new ss.c[var1];
      int var5 = 0;
      if(var5 < this.z.length) {
         this.z[var5] = new ss.c(var2[var5], var3);
         ++var5;
      }

   }

   public void E(net.n2.h var1) throws IOException {
      this.H = new net.u.p(var1.readInt(), var1.readInt());
      s8.x();
      this.z = new ss.c[var1.q()];
      int var3 = 0;
      if(var3 < this.z.length) {
         this.z[var3] = new ss.c(var1.readShort(), (net.yw.n)net.y9.l.x.j(var1.q()));
         ++var3;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.H.i);
      s8.Y();
      var1.writeInt(this.H.y);
      var1.a(this.z.length);
      ss.c[] var3 = this.z;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         ss.c var6 = var3[var5];
         var1.writeShort(var6.E());
         var1.a(net.y9.l.x.X(var6.l()));
         ++var5;
      }

   }

   public void W(net.x.t var1) {
      var1.R(this);
   }

   public ss.c[] y() {
      return this.z;
   }

   public class c {
      private final short r;
      private final net.yw.n A;

      public c(short var2, net.yw.n var3) {
         this.r = var2;
         this.A = var3;
      }

      public c(short var2, net.l.q var3) {
         this.r = var2;
         this.A = var3.u(this.C());
      }

      public net.u.j C() {
         return new net.u.j(ss.this.H.S(this.r >> 12 & 15, this.r & 255, this.r >> 8 & 15));
      }

      public short E() {
         return this.r;
      }

      public net.yw.n l() {
         return this.A;
      }
   }
}
