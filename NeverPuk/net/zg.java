package net;

import net.od;
import net.xn;
import net.nn.j;
import net.r.r;
import net.u.d;

public class zg extends od {
   public double Z;
   public double u;
   public double d;
   private float A;
   private float C;
   private boolean z;
   private static String Y;

   public zg(float var1, float var2, boolean var3, double var4, double var6, double var8) {
      this.A = var1;
      this.C = var2;
      L();
      this.z = var3;
      this.Z = var4;
      this.u = var6;
      this.d = var8;
      if(d.y() == null) {
         u("dU3mi");
      }

   }

   public float x() {
      return this.A;
   }

   public void R(float var1) {
      this.A = var1;
      j.b().sf.A3 = var1;
      j.b().sf.AK = var1;
   }

   public void H(float var1) {
      this.A = var1;
      j.b().sf.hN = var1;
   }

   public double t() {
      return this.Z;
   }

   public void W(double var1) {
      this.Z = var1;
   }

   public double a() {
      return this.u;
   }

   public void d(double var1) {
      this.u = var1;
   }

   public double E() {
      return this.d;
   }

   public void y(double var1) {
      this.d = var1;
   }

   public boolean U() {
      return this.z;
   }

   public void B(boolean var1) {
      this.z = var1;
   }

   public float p() {
      return this.C;
   }

   public void v(float var1) {
      this.C = var1;
      j.b().sf.AX = var1;
   }

   public boolean I() {
      return this.z;
   }

   public static void u(String var0) {
      Y = var0;
   }

   public static String L() {
      return Y;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(L() == null) {
         u("wX1TCc");
      }

   }

   public static class b extends od {
      private r K;

      public b(r var1) {
         this.K = var1;
      }

      public r A() {
         return this.K;
      }

      public void X(r var1) {
         this.K = var1;
      }
   }
}
