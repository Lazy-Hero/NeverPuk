package net.no;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class o implements net.n2.k {
   private String b;
   private net.yz.p R;
   private int r;
   private int O = Integer.MAX_VALUE;
   private int A;
   private float H;
   private float j;

   public o() {
   }

   public o(String var1, net.yz.p var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "name", new Object[0]);
      this.b = var1;
      this.R = var2;
      this.r = (int)(var3 * 8.0D);
      this.O = (int)(var5 * 8.0D);
      this.A = (int)(var7 * 8.0D);
      this.H = var9;
      this.j = var10;
   }

   public void E(net.n2.h var1) throws IOException {
      this.b = var1.Z(256);
      this.R = (net.yz.p)var1.S(net.yz.p.class);
      this.r = var1.readInt();
      this.O = var1.readInt();
      this.A = var1.readInt();
      this.H = var1.readFloat();
      this.j = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.b);
      var1.A(this.R);
      var1.writeInt(this.r);
      var1.writeInt(this.O);
      var1.writeInt(this.A);
      var1.writeFloat(this.H);
      var1.writeFloat(this.j);
   }

   public String u() {
      return this.b;
   }

   public net.yz.p t() {
      return this.R;
   }

   public double k() {
      return (double)((float)this.r / 8.0F);
   }

   public double e() {
      return (double)((float)this.O / 8.0F);
   }

   public double w() {
      return (double)((float)this.A / 8.0F);
   }

   public float D() {
      return this.H;
   }

   public float j() {
      return this.j;
   }

   public void M(net.x.t var1) {
      var1.q(this);
   }
}
