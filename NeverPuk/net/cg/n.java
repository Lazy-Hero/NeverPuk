package net.cg;

import net.xn;
import net.u.t;

public class n {
   private final n.q l;
   private final byte T;
   private final byte m;
   private final byte z;

   public n(n.q var1, byte var2, byte var3, byte var4) {
      this.l = var1;
      this.T = var2;
      this.m = var3;
      this.z = var4;
   }

   public byte Y() {
      return this.l.U();
   }

   public n.q H() {
      return this.l;
   }

   public byte k() {
      return this.T;
   }

   public byte A() {
      return this.m;
   }

   public byte h() {
      return this.z;
   }

   public boolean m() {
      return this.l.J();
   }

   public boolean equals(Object var1) {
      boolean var2 = net.cg.z.V();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof n)) {
         return false;
      } else {
         n var3 = (n)var1;
         return this.l != var3.l?false:(this.z != var3.z?false:(this.T != var3.T?false:this.m == var3.m));
      }
   }

   public int hashCode() {
      int var1 = this.l.U();
      var1 = 31 * var1 + this.T;
      var1 = 31 * var1 + this.m;
      var1 = 31 * var1 + this.z;
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum q {
      PLAYER(false),
      FRAME(true),
      RED_MARKER(false),
      BLUE_MARKER(false),
      TARGET_X(true),
      TARGET_POINT(true),
      PLAYER_OFF_MAP(false),
      PLAYER_OFF_LIMITS(false),
      MANSION(true, 5393476),
      MONUMENT(true, 3830373);

      private final byte b;
      private final boolean Y;
      private final int U;

      private q(boolean var3) {
         this(var3, -1);
      }

      private q(boolean var3, int var4) {
         this.b = (byte)this.ordinal();
         this.Y = var3;
         this.U = var4;
      }

      public byte U() {
         return this.b;
      }

      public boolean J() {
         return this.Y;
      }

      public boolean l() {
         boolean var1 = net.cg.z.z();
         return this.U >= 0;
      }

      public int D() {
         return this.U;
      }

      public static n.q V(byte var0) {
         return values()[t.g(var0, 0, values().length - 1)];
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
