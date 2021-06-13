package net.y8;

import net.xn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
   private static final Logger Y;
   private final h.e o;
   private final h.q g;
   private final int k;
   private final int V;
   private static boolean r;

   public h(int var1, h.e var2, h.q var3, int var4) {
      if(this.o(var1, var3)) {
         this.g = var3;
      } else {
         Y.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
         this.g = h.q.UV;
      }

      this.o = var2;
      this.k = var1;
      this.V = var4;
   }

   private final boolean o(int var1, h.q var2) {
      return var2 == h.q.UV;
   }

   public final h.e t() {
      return this.o;
   }

   public final h.q P() {
      return this.g;
   }

   public final int R() {
      return this.V;
   }

   public final int G() {
      return this.k;
   }

   public String toString() {
      return this.V + "," + this.g.R() + "," + this.o.e();
   }

   public final int l() {
      return this.o.R() * this.V;
   }

   public final boolean t() {
      return this.g == h.q.POSITION;
   }

   public boolean equals(Object var1) {
      boolean var2 = W();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         h var3 = (h)var1;
         return this.V != var3.V?false:(this.k != var3.k?false:(this.o != var3.o?false:this.g == var3.g));
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = this.o.hashCode();
      var1 = 31 * var1 + this.g.hashCode();
      var1 = 31 * var1 + this.k;
      var1 = 31 * var1 + this.V;
      return var1;
   }

   static {
      if(!W()) {
         y(true);
      }

      Y = LogManager.getLogger();
   }

   public static void y(boolean var0) {
      r = var0;
   }

   public static boolean W() {
      return r;
   }

   public static boolean C() {
      boolean var0 = W();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum e {
      FLOAT(4, "Float", 5126),
      UBYTE(1, "Unsigned Byte", 5121),
      BYTE(1, "Byte", 5120),
      USHORT(2, "Unsigned Short", 5123),
      SHORT(2, "Short", 5122),
      UINT(4, "Unsigned Int", 5125),
      INT(4, "Int", 5124);

      private final int m;
      private final String O;
      private final int u;

      private e(int var3, String var4, int var5) {
         this.m = var3;
         this.O = var4;
         this.u = var5;
      }

      public int R() {
         return this.m;
      }

      public String e() {
         return this.O;
      }

      public int O() {
         return this.u;
      }
   }

   public static enum q {
      POSITION("Position"),
      NORMAL("Normal"),
      COLOR("Vertex Color"),
      UV("UV"),
      MATRIX("Bone Matrix"),
      BLEND_WEIGHT("Blend Weight"),
      PADDING("Padding");

      private final String U;

      private q(String var3) {
         this.U = var3;
      }

      public String R() {
         return this.U;
      }
   }
}
