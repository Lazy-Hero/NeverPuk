package net.h;

import java.util.Random;
import net.xn;
import net.h.a;
import net.h.d;
import net.h.l;
import net.u.t;

public class y implements net.yz.i {
   private final Random K = new Random();
   private final net.nn.j Z;
   private d p;
   private int A = 100;

   public y(net.nn.j var1) {
      this.Z = var1;
   }

   public void m() {
      l.l();
      y.i var2 = this.Z.R();
      if(this.p != null) {
         if(!var2.d().J().equals(this.p.o())) {
            this.Z.n().E(this.p);
            this.A = t.A(this.K, 0, var2.O() / 2);
         }

         if(!this.Z.n().J(this.p)) {
            this.p = null;
            this.A = Math.min(t.A(this.K, var2.O(), var2.z()), this.A);
         }
      }

      this.A = Math.min(this.A, var2.z());
      if(this.p == null && this.A-- <= 0) {
         this.x(var2);
      }

   }

   public void x(y.i var1) {
      this.p = a.A(var1.d());
      this.Z.n().g(this.p);
      this.A = Integer.MAX_VALUE;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum i {
      MENU(net.nb.l.HY, 20, 600),
      GAME(net.nb.l.Kx, 12000, 24000),
      CREATIVE(net.nb.l.C7, 1200, 3600),
      CREDITS(net.nb.l.w8, 0, 0),
      NETHER(net.nb.l.CR, 1200, 3600),
      END_BOSS(net.nb.l.Mm, 0, 0),
      END(net.nb.l.Ho, 6000, 24000);

      private final net.yz.a M;
      private final int S;
      private final int W;

      private i(net.yz.a var3, int var4, int var5) {
         this.M = var3;
         this.S = var4;
         this.W = var5;
      }

      public net.yz.a d() {
         return this.M;
      }

      public int O() {
         return this.S;
      }

      public int z() {
         return this.W;
      }
   }
}
