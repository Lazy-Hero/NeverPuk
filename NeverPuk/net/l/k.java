package net.l;

import javax.annotation.Nullable;
import net.xn;
import net.l.a;
import net.l.e;
import net.l.g;
import net.l.i;
import net.l.q;
import net.l.t;
import net.l.x;
import net.nb.f;
import net.y9.l;
import net.yz.ap;

public class k implements x {
   private static final g s = new t();
   protected static final net.yw.n f = f.ou.p();
   protected ap q;
   protected g J;
   private int D;

   public k() {
      this.u(4);
   }

   private static int c(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private void u(int var1) {
      if(var1 != this.D) {
         this.D = var1;
         if(this.D <= 4) {
            this.D = 4;
            this.J = new e(this.D, this);
         } else if(this.D <= 8) {
            this.J = new a(this.D, this);
         } else {
            this.J = s;
            this.D = net.u.t.W(l.x.C());
         }

         this.J.j(f);
         this.q = new ap(this.D, 4096);
      }

   }

   public int K(int var1, net.yw.n var2) {
      ap var3 = this.q;
      g var4 = this.J;
      this.u(var1);

      for(int var5 = 0; var5 < var3.X(); ++var5) {
         net.yw.n var6 = var4.z(var3.h(var5));
         this.L(var5, var6);
      }

      return this.J.j(var2);
   }

   public void G(int var1, int var2, int var3, net.yw.n var4) {
      this.L(c(var1, var2, var3), var4);
   }

   protected void L(int var1, net.yw.n var2) {
      int var3 = this.J.j(var2);
      this.q.H(var1, var3);
   }

   public net.yw.n C(int var1, int var2, int var3) {
      return this.P(c(var1, var2, var3));
   }

   protected net.yw.n P(int var1) {
      net.yw.n var2 = this.J.z(this.q.h(var1));
      return f;
   }

   public void X(net.n2.h var1) {
      byte var2 = var1.readByte();
      if(this.D != var2) {
         this.u(var2);
      }

      this.J.J(var1);
      var1.V(this.q.x());
   }

   public void H(net.n2.h var1) {
      var1.writeByte(this.D);
      this.J.x(var1);
      var1.M(this.q.x());
   }

   @Nullable
   public i a(byte[] var1, i var2) {
      i var4 = null;
      q.O();
      int var5 = 0;
      int var6 = l.x.X(this.P(var5));
      int var7 = var5 & 15;
      int var8 = var5 >> 8 & 15;
      int var9 = var5 >> 4 & 15;
      if((var6 >> 12 & 15) != 0) {
         if(var4 == null) {
            var4 = new i();
         }

         var4.i(var7, var8, var9, var6 >> 12 & 15);
      }

      var1[var5] = (byte)(var6 >> 4 & 255);
      var2.i(var7, var8, var9, var6 & 15);
      ++var5;
      return var4;
   }

   public void r(byte[] var1, i var2, @Nullable i var3) {
      int var4 = 0;

      while(true) {
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 4 & 15;
         byte var8 = 0;
         int var9 = var8 << 12 | (var1[var4] & 255) << 4 | var2.J(var5, var6, var7);
         this.L(var4, (net.yw.n)l.x.j(var9));
         ++var4;
      }
   }

   public int f() {
      return 1 + this.J.I() + net.n2.h.c(this.q.X()) + this.q.x().length * 8;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
