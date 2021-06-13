package net.no;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class sl implements net.n2.k {
   private net.yz.a M;
   private net.yz.p a;
   private int N;
   private int z;
   private int x;
   private float T;
   private float b;

   public sl() {
   }

   public sl(net.yz.a var1, net.yz.p var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.M = var1;
      this.a = var2;
      this.N = (int)(var3 * 8.0D);
      this.z = (int)(var5 * 8.0D);
      this.x = (int)(var7 * 8.0D);
      this.T = var9;
      this.b = var10;
   }

   public void E(net.n2.h var1) throws IOException {
      this.M = (net.yz.a)net.yz.a.h.T(var1.q());
      this.a = (net.yz.p)var1.S(net.yz.p.class);
      this.N = var1.readInt();
      this.z = var1.readInt();
      this.x = var1.readInt();
      this.T = var1.readFloat();
      this.b = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(net.yz.a.h.D(this.M));
      var1.A(this.a);
      var1.writeInt(this.N);
      var1.writeInt(this.z);
      var1.writeInt(this.x);
      var1.writeFloat(this.T);
      var1.writeFloat(this.b);
   }

   public net.yz.a U() {
      return this.M;
   }

   public net.yz.p x() {
      return this.a;
   }

   public double j() {
      return (double)((float)this.N / 8.0F);
   }

   public double I() {
      return (double)((float)this.z / 8.0F);
   }

   public double w() {
      return (double)((float)this.x / 8.0F);
   }

   public float P() {
      return this.T;
   }

   public float d() {
      return this.b;
   }

   public void u(net.x.t var1) {
      var1.y(this);
   }
}
