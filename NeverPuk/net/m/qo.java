package net.m;

import java.io.IOException;

public class qo implements net.n2.k {
   public double b;
   public double R;
   public double m;
   public float I;
   public float A;
   protected boolean u;
   protected boolean Q;
   public boolean C;
   private static net.u.d[] H;

   public qo() {
   }

   public qo(boolean var1) {
      this.u = var1;
   }

   public void c(net.x.x var1) {
      var1.B(this);
   }

   public void E(net.n2.h var1) throws IOException {
      net.u.d[] var2 = y();
      this.u = var1.readUnsignedByte() != 0;
   }

   public void O(net.n2.h var1) throws IOException {
      net.u.d[] var2 = y();
      var1.writeByte(this.u?1:0);
   }

   public double F(double var1) {
      return this.Q?this.b:var1;
   }

   public double S(double var1) {
      return this.Q?this.R:var1;
   }

   public double v(double var1) {
      net.u.d[] var3 = y();
      return this.Q?this.m:var1;
   }

   public float n(float var1) {
      return this.C?this.I:var1;
   }

   public float U(float var1) {
      return this.C?this.A:var1;
   }

   public boolean i() {
      return this.u;
   }

   public static void e(net.u.d[] var0) {
      H = var0;
   }

   public static net.u.d[] y() {
      return H;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      if(y() != null) {
         e(new net.u.d[4]);
      }

   }

   public static class k extends qo {
      public k() {
         this.Q = true;
      }

      public k(double var1, double var3, double var5, boolean var7) {
         this.b = var1;
         this.R = var3;
         this.m = var5;
         this.u = var7;
         this.Q = true;
      }

      public void E(net.n2.h var1) throws IOException {
         this.b = var1.readDouble();
         this.R = var1.readDouble();
         this.m = var1.readDouble();
         super.E(var1);
      }

      public void O(net.n2.h var1) throws IOException {
         var1.writeDouble(this.b);
         var1.writeDouble(this.R);
         var1.writeDouble(this.m);
         super.O(var1);
      }
   }

   public static class l extends qo {
      public l() {
         this.Q = true;
         this.C = true;
      }

      public l(double var1, double var3, double var5, float var7, float var8, boolean var9) {
         this.b = var1;
         this.R = var3;
         this.m = var5;
         this.I = var7;
         this.A = var8;
         this.u = var9;
         this.C = true;
         this.Q = true;
      }

      public void E(net.n2.h var1) throws IOException {
         this.b = var1.readDouble();
         this.R = var1.readDouble();
         this.m = var1.readDouble();
         this.I = var1.readFloat();
         this.A = var1.readFloat();
         super.E(var1);
      }

      public void O(net.n2.h var1) throws IOException {
         var1.writeDouble(this.b);
         var1.writeDouble(this.R);
         var1.writeDouble(this.m);
         var1.writeFloat(this.I);
         var1.writeFloat(this.A);
         super.O(var1);
      }
   }

   public static class q extends qo {
      public q() {
         this.C = true;
      }

      public q(float var1, float var2, boolean var3) {
         this.I = var1;
         this.A = var2;
         this.u = var3;
         this.C = true;
      }

      public void E(net.n2.h var1) throws IOException {
         this.I = var1.readFloat();
         this.A = var1.readFloat();
         super.E(var1);
      }

      public void O(net.n2.h var1) throws IOException {
         var1.writeFloat(this.I);
         var1.writeFloat(this.A);
         super.O(var1);
      }
   }
}
