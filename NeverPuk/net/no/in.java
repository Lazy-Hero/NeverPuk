package net.no;

import java.io.IOException;
import java.util.UUID;
import net.xn;
import net.no.s8;

public class in implements net.n2.k {
   private int x;
   private UUID E;
   private double H;
   private double T;
   private double Z;
   private int F;
   private int j;
   private int Q;
   private int U;
   private int C;
   private int c;
   private int X;

   public in() {
   }

   public in(net.ne.l var1, int var2) {
      this(var1, var2, 0);
   }

   public in(net.ne.l var1, int var2, int var3) {
      int var10000 = s8.Y();
      super();
      this.x = var1.G();
      this.E = var1.O();
      this.H = var1.b;
      this.T = var1.hS;
      this.Z = var1.hr;
      this.U = net.u.t.M(var1.V * 256.0F / 360.0F);
      this.C = net.u.t.M(var1.hN * 256.0F / 360.0F);
      this.c = var2;
      this.X = var3;
      double var10001 = 3.9D;
      this.F = (int)(net.u.t.F(var1.hf, -3.9D, 3.9D) * 8000.0D);
      int var4 = var10000;
      this.j = (int)(net.u.t.F(var1.K, -3.9D, 3.9D) * 8000.0D);
      this.Q = (int)(net.u.t.F(var1.J, -3.9D, 3.9D) * 8000.0D);
      if(net.u.d.y() == null) {
         ++var4;
         s8.u(var4);
      }

   }

   public in(net.ne.l var1, int var2, int var3, net.u.j var4) {
      this(var1, var2, var3);
      this.H = (double)var4.t();
      this.T = (double)var4.h();
      this.Z = (double)var4.y();
   }

   public void E(net.n2.h var1) throws IOException {
      this.x = var1.q();
      this.E = var1.J();
      this.c = var1.readByte();
      this.H = var1.readDouble();
      this.T = var1.readDouble();
      this.Z = var1.readDouble();
      this.U = var1.readByte();
      this.C = var1.readByte();
      this.X = var1.readInt();
      this.F = var1.readShort();
      this.j = var1.readShort();
      this.Q = var1.readShort();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.x);
      var1.l(this.E);
      var1.writeByte(this.c);
      var1.writeDouble(this.H);
      var1.writeDouble(this.T);
      var1.writeDouble(this.Z);
      var1.writeByte(this.U);
      var1.writeByte(this.C);
      var1.writeInt(this.X);
      var1.writeShort(this.F);
      var1.writeShort(this.j);
      var1.writeShort(this.Q);
   }

   public void v(net.x.t var1) {
      var1.u(this);
   }

   public int n() {
      return this.x;
   }

   public UUID o() {
      return this.E;
   }

   public double E() {
      return this.H;
   }

   public double m() {
      return this.T;
   }

   public double b() {
      return this.Z;
   }

   public int o() {
      return this.F;
   }

   public int p() {
      return this.j;
   }

   public int D() {
      return this.Q;
   }

   public int c() {
      return this.U;
   }

   public int g() {
      return this.C;
   }

   public int U() {
      return this.c;
   }

   public int P() {
      return this.X;
   }

   public void x(int var1) {
      this.F = var1;
   }

   public void E(int var1) {
      this.j = var1;
   }

   public void Q(int var1) {
      this.Q = var1;
   }

   public void A(int var1) {
      this.X = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
