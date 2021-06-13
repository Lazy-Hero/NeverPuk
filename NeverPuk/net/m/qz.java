package net.m;

import java.io.IOException;
import net.n0.ks;

public class qz implements net.n2.k {
   private int u;
   private int H;
   private int F;
   private short h;
   private ks Y = ks.a;
   private net.nl.c X;

   public qz() {
   }

   public qz(int var1, int var2, int var3, net.nl.c var4, ks var5, short var6) {
      this.u = var1;
      this.H = var2;
      this.F = var3;
      this.Y = var5.s();
      this.h = var6;
      this.X = var4;
   }

   public void Z(net.x.x var1) {
      var1.q(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.u = var1.readByte();
      this.H = var1.readShort();
      this.F = var1.readByte();
      this.h = var1.readShort();
      this.X = (net.nl.c)var1.S(net.nl.c.class);
      this.Y = var1.C();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.u);
      var1.writeShort(this.H);
      var1.writeByte(this.F);
      var1.writeShort(this.h);
      var1.A(this.X);
      var1.D(this.Y);
   }

   public int E() {
      return this.u;
   }

   public int j() {
      return this.H;
   }

   public int B() {
      return this.F;
   }

   public short y() {
      return this.h;
   }

   public ks e() {
      return this.Y;
   }

   public net.nl.c l() {
      return this.X;
   }
}
