package net.no;

import java.io.IOException;
import net.xn;
import net.no.s8;

public class sp implements net.n2.k {
   private int L;
   public int O;
   public int m;
   public int N;

   public sp() {
   }

   public sp(net.ne.l var1) {
      this(var1.G(), var1.hf, var1.K, var1.J);
   }

   public sp(int var1, double var2, double var4, double var6) {
      s8.Y();
      super();
      this.L = var1;
      double var10000 = 3.9D;
      if(Double.compare(var2, -3.9D) < 0) {
         var2 = -3.9D;
      }

      if(Double.compare(var4, -3.9D) < 0) {
         var4 = -3.9D;
      }

      if(Double.compare(var6, -3.9D) < 0) {
         var6 = -3.9D;
      }

      if(Double.compare(var2, 3.9D) > 0) {
         var2 = 3.9D;
      }

      if(Double.compare(var4, 3.9D) > 0) {
         var4 = 3.9D;
      }

      if(var6 > 3.9D) {
         var6 = 3.9D;
      }

      this.O = (int)(var2 * 8000.0D);
      this.m = (int)(var4 * 8000.0D);
      this.N = (int)(var6 * 8000.0D);
   }

   public void E(net.n2.h var1) throws IOException {
      this.L = var1.q();
      this.O = var1.readShort();
      this.m = var1.readShort();
      this.N = var1.readShort();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.L);
      var1.writeShort(this.O);
      var1.writeShort(this.m);
      var1.writeShort(this.N);
   }

   public void p(net.x.t var1) {
      var1.d(this);
   }

   public int F() {
      return this.L;
   }

   public int K() {
      return this.O;
   }

   public int t() {
      return this.m;
   }

   public int o() {
      return this.N;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
