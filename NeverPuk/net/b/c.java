package net.b;

import net.xn;
import net.b.m;
import net.b.n;
import net.n2.h;

public class c {
   public final int H;
   public final int E;
   public final int i;
   private final int a;
   public int K = -1;
   public float z;
   public float x;
   public float Y;
   public c c;
   public boolean e;
   public float Q;
   public float O;
   public float v;
   public m j = m.BLOCKED;

   public c(int var1, int var2, int var3) {
      this.H = var1;
      this.E = var2;
      this.i = var3;
      this.a = z(var1, var2, var3);
   }

   public c F(int var1, int var2, int var3) {
      c var4 = new c(var1, var2, var3);
      var4.K = this.K;
      var4.z = this.z;
      var4.x = this.x;
      var4.Y = this.Y;
      var4.c = this.c;
      var4.e = this.e;
      var4.Q = this.Q;
      var4.O = this.O;
      var4.v = this.v;
      var4.j = this.j;
      return var4;
   }

   public static int z(int var0, int var1, int var2) {
      return var1 & 255 | (var0 & 32767) << 8 | (var2 & 32767) << 24 | Integer.MIN_VALUE | '耀';
   }

   public float a(c var1) {
      float var2 = (float)(var1.H - this.H);
      float var3 = (float)(var1.E - this.E);
      float var4 = (float)(var1.i - this.i);
      return net.u.t.g(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public float Q(c var1) {
      float var2 = (float)(var1.H - this.H);
      float var3 = (float)(var1.E - this.E);
      float var4 = (float)(var1.i - this.i);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public float W(c var1) {
      float var2 = (float)Math.abs(var1.H - this.H);
      float var3 = (float)Math.abs(var1.E - this.E);
      float var4 = (float)Math.abs(var1.i - this.i);
      return var2 + var3 + var4;
   }

   public boolean equals(Object var1) {
      String var2 = n.q();
      if(!(var1 instanceof c)) {
         return false;
      } else {
         c var3 = (c)var1;
         return this.a == var3.a && this.H == var3.H && this.E == var3.E && this.i == var3.i;
      }
   }

   public int hashCode() {
      return this.a;
   }

   public boolean Z() {
      return this.K >= 0;
   }

   public String toString() {
      return this.H + ", " + this.E + ", " + this.i;
   }

   public static c K(h var0) {
      c var1 = new c(var0.readInt(), var0.readInt(), var0.readInt());
      var1.Q = var0.readFloat();
      var1.O = var0.readFloat();
      var1.v = var0.readFloat();
      var1.e = var0.readBoolean();
      var1.j = m.values()[var0.readInt()];
      var1.Y = var0.readFloat();
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
