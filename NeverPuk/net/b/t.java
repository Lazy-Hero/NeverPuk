package net.b;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.n;
import net.n2.h;

public class t {
   private final c[] d;
   private c[] X = new c[0];
   private c[] t = new c[0];
   private c s;
   private int N;
   private int Y;

   public t(c[] var1) {
      this.d = var1;
      this.Y = var1.length;
   }

   public void u() {
      ++this.N;
   }

   public boolean P() {
      return this.N >= this.Y;
   }

   @Nullable
   public c c() {
      return this.Y > 0?this.d[this.Y - 1]:null;
   }

   public c y(int var1) {
      return this.d[var1];
   }

   public void a(int var1, c var2) {
      this.d[var1] = var2;
   }

   public int R() {
      return this.Y;
   }

   public void H(int var1) {
      this.Y = var1;
   }

   public int P() {
      return this.N;
   }

   public void X(int var1) {
      this.N = var1;
   }

   public net.u.r C(net.ne.l var1, int var2) {
      double var3 = (double)this.d[var2].H + (double)((int)(var1.h9 + 1.0F)) * 0.5D;
      double var5 = (double)this.d[var2].E;
      double var7 = (double)this.d[var2].i + (double)((int)(var1.h9 + 1.0F)) * 0.5D;
      return new net.u.r(var3, var5, var7);
   }

   public net.u.r i(net.ne.l var1) {
      return this.C(var1, this.N);
   }

   public net.u.r k() {
      c var1 = this.d[this.N];
      return new net.u.r((double)var1.H, (double)var1.E, (double)var1.i);
   }

   public boolean M(t var1) {
      return false;
   }

   public c[] Q() {
      return this.X;
   }

   public c[] N() {
      return this.t;
   }

   public c W() {
      return this.s;
   }

   public static t L(h var0) {
      int var2 = var0.readInt();
      n.q();
      c var3 = c.K(var0);
      c[] var4 = new c[var0.readInt()];
      int var5 = 0;
      if(var5 < var4.length) {
         var4[var5] = c.K(var0);
         ++var5;
      }

      c[] var9 = new c[var0.readInt()];
      int var6 = 0;
      if(var6 < var9.length) {
         var9[var6] = c.K(var0);
         ++var6;
      }

      c[] var11 = new c[var0.readInt()];
      int var7 = 0;
      if(var7 < var11.length) {
         var11[var7] = c.K(var0);
         ++var7;
      }

      t var13 = new t(var4);
      var13.X = var9;
      var13.t = var11;
      var13.s = var3;
      var13.N = var2;
      return var13;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
