package net.no;

import java.io.IOException;
import net.no.s8;
import net.yz.ai;

public class s6 implements net.n2.k {
   private ai v;
   private float n;
   private float Y;
   private float j;
   private float W;
   private float d;
   private float a;
   private float L;
   private int G;
   private boolean A;
   private int[] e;

   public s6() {
   }

   public s6(ai var1, boolean var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int... var11) {
      this.v = var1;
      this.A = var2;
      this.n = var3;
      this.Y = var4;
      this.j = var5;
      this.W = var6;
      this.d = var7;
      this.a = var8;
      this.L = var9;
      this.G = var10;
      this.e = var11;
   }

   public void E(net.n2.h var1) throws IOException {
      s8.Y();
      this.v = ai.P(var1.readInt());
      if(this.v == null) {
         this.v = ai.BARRIER;
      }

      this.A = var1.readBoolean();
      this.n = var1.readFloat();
      this.Y = var1.readFloat();
      this.j = var1.readFloat();
      this.W = var1.readFloat();
      this.d = var1.readFloat();
      this.a = var1.readFloat();
      this.L = var1.readFloat();
      this.G = var1.readInt();
      int var3 = this.v.D();
      this.e = new int[var3];
      int var4 = 0;
      if(var4 < var3) {
         this.e[var4] = var1.q();
         ++var4;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.writeInt(this.v.b());
      var1.writeBoolean(this.A);
      var1.writeFloat(this.n);
      var1.writeFloat(this.Y);
      var1.writeFloat(this.j);
      var1.writeFloat(this.W);
      var1.writeFloat(this.d);
      var1.writeFloat(this.a);
      var1.writeFloat(this.L);
      var1.writeInt(this.G);
      int var3 = this.v.D();
      int var4 = 0;
      if(var4 < var3) {
         var1.a(this.e[var4]);
         ++var4;
      }

   }

   public ai o() {
      return this.v;
   }

   public boolean Y() {
      return this.A;
   }

   public double g() {
      return (double)this.n;
   }

   public double n() {
      return (double)this.Y;
   }

   public double F() {
      return (double)this.j;
   }

   public float W() {
      return this.W;
   }

   public float y() {
      return this.d;
   }

   public float G() {
      return this.a;
   }

   public float o() {
      return this.L;
   }

   public int m() {
      return this.G;
   }

   public int[] D() {
      return this.e;
   }

   public void D(net.x.t var1) {
      var1.f(this);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
