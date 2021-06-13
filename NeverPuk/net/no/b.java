package net.no;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.no.s8;

public class b implements net.n2.k {
   private int B;
   private UUID U;
   private int H;
   private double h;
   private double x;
   private double M;
   private int i;
   private int E;
   private int c;
   private byte R;
   private byte V;
   private byte A;
   private net.k.n T;
   private List z;

   public b() {
   }

   public b(net.ne.a var1) {
      this.B = var1.G();
      this.U = var1.O();
      s8.x();
      this.H = net.ne.v.S.D(var1.getClass());
      this.h = var1.b;
      this.x = var1.hS;
      this.M = var1.hr;
      this.R = (byte)((int)(var1.hN * 256.0F / 360.0F));
      this.V = (byte)((int)(var1.V * 256.0F / 360.0F));
      this.A = (byte)((int)(var1.A3 * 256.0F / 360.0F));
      double var10000 = 3.9D;
      double var5 = var1.hf;
      double var7 = var1.K;
      double var9 = var1.J;
      if(Double.compare(var5, -3.9D) < 0) {
         var5 = -3.9D;
      }

      if(Double.compare(var7, -3.9D) < 0) {
         var7 = -3.9D;
      }

      if(Double.compare(var9, -3.9D) < 0) {
         var9 = -3.9D;
      }

      if(Double.compare(var5, 3.9D) > 0) {
         var5 = 3.9D;
      }

      if(Double.compare(var7, 3.9D) > 0) {
         var7 = 3.9D;
      }

      if(var9 > 3.9D) {
         var9 = 3.9D;
      }

      this.i = (int)(var5 * 8000.0D);
      this.E = (int)(var7 * 8000.0D);
      this.c = (int)(var9 * 8000.0D);
      this.T = var1.A();
      net.u.d.h(new net.u.d[4]);
   }

   public void E(net.n2.h var1) throws IOException {
      this.B = var1.q();
      this.U = var1.J();
      this.H = var1.q();
      this.h = var1.readDouble();
      this.x = var1.readDouble();
      this.M = var1.readDouble();
      this.R = var1.readByte();
      this.V = var1.readByte();
      this.A = var1.readByte();
      this.i = var1.readShort();
      this.E = var1.readShort();
      this.c = var1.readShort();
      this.z = net.k.n.s(var1);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.B);
      var1.l(this.U);
      var1.a(this.H);
      var1.writeDouble(this.h);
      var1.writeDouble(this.x);
      var1.writeDouble(this.M);
      var1.writeByte(this.R);
      var1.writeByte(this.V);
      var1.writeByte(this.A);
      var1.writeShort(this.i);
      var1.writeShort(this.E);
      var1.writeShort(this.c);
      this.T.l(var1);
   }

   public void f(net.x.t var1) {
      var1.B(this);
   }

   @Nullable
   public List e() {
      return this.z;
   }

   public int d() {
      return this.B;
   }

   public UUID p() {
      return this.U;
   }

   public int g() {
      return this.H;
   }

   public double l() {
      return this.h;
   }

   public double c() {
      return this.x;
   }

   public double Y() {
      return this.M;
   }

   public int u() {
      return this.i;
   }

   public int O() {
      return this.E;
   }

   public int K() {
      return this.c;
   }

   public byte u() {
      return this.R;
   }

   public byte c() {
      return this.V;
   }

   public byte S() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
