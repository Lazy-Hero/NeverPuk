package net.no;

import java.io.IOException;
import net.xn;

public class s8 implements net.n2.k {
   protected int O;
   protected int g;
   protected int U;
   protected int X;
   protected byte f;
   protected byte B;
   protected boolean m;
   protected boolean p;
   private static int x;

   public s8() {
   }

   public s8(int var1) {
      this.O = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.O = var1.q();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.O);
   }

   public void F(net.x.t var1) {
      var1.H(this);
   }

   public String toString() {
      return "Entity_" + super.toString();
   }

   public net.ne.l X(net.yv.r var1) {
      return var1.S(this.O);
   }

   public int w() {
      return this.g;
   }

   public int z() {
      return this.U;
   }

   public int G() {
      return this.X;
   }

   public byte F() {
      return this.f;
   }

   public byte G() {
      return this.B;
   }

   public boolean k() {
      return this.p;
   }

   public boolean l() {
      return this.m;
   }

   public static void u(int var0) {
      x = var0;
   }

   public static int x() {
      return x;
   }

   public static int Y() {
      int var0 = x();
      return 60;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(x() != 0) {
         u(16);
      }

   }

   public static class i extends s8 {
      public i() {
         this.p = true;
      }

      public i(int var1, long var2, long var4, long var6, byte var8, byte var9, boolean var10) {
         super(var1);
         this.g = (int)var2;
         this.U = (int)var4;
         this.X = (int)var6;
         this.f = var8;
         this.B = var9;
         this.m = var10;
         this.p = true;
      }

      public void E(net.n2.h var1) throws IOException {
         super.E(var1);
         this.g = var1.readShort();
         this.U = var1.readShort();
         this.X = var1.readShort();
         this.f = var1.readByte();
         this.B = var1.readByte();
         this.m = var1.readBoolean();
      }

      public void O(net.n2.h var1) throws IOException {
         super.O(var1);
         var1.writeShort(this.g);
         var1.writeShort(this.U);
         var1.writeShort(this.X);
         var1.writeByte(this.f);
         var1.writeByte(this.B);
         var1.writeBoolean(this.m);
      }
   }

   public static class q extends s8 {
      public q() {
         this.p = true;
      }

      public q(int var1, byte var2, byte var3, boolean var4) {
         super(var1);
         this.f = var2;
         this.B = var3;
         this.p = true;
         this.m = var4;
      }

      public void E(net.n2.h var1) throws IOException {
         super.E(var1);
         this.f = var1.readByte();
         this.B = var1.readByte();
         this.m = var1.readBoolean();
      }

      public void O(net.n2.h var1) throws IOException {
         super.O(var1);
         var1.writeByte(this.f);
         var1.writeByte(this.B);
         var1.writeBoolean(this.m);
      }
   }

   public static class s extends s8 {
      public s() {
      }

      public s(int var1, long var2, long var4, long var6, boolean var8) {
         super(var1);
         this.g = (int)var2;
         this.U = (int)var4;
         this.X = (int)var6;
         this.m = var8;
      }

      public void E(net.n2.h var1) throws IOException {
         super.E(var1);
         this.g = var1.readShort();
         this.U = var1.readShort();
         this.X = var1.readShort();
         this.m = var1.readBoolean();
      }

      public void O(net.n2.h var1) throws IOException {
         super.O(var1);
         var1.writeShort(this.g);
         var1.writeShort(this.U);
         var1.writeShort(this.X);
         var1.writeBoolean(this.m);
      }
   }
}
