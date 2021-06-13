package net.m;

import java.io.IOException;
import net.m.qo;

public class c implements net.n2.k {
   private boolean R;
   private boolean K;
   private boolean X;
   private boolean a;
   private float W;
   private float w;

   public c() {
   }

   public c(net.r.n var1) {
      this.n(var1.T);
      this.V(var1.n);
      this.f(var1.P);
      this.H(var1.V);
      this.N(var1.m());
      this.C(var1.V());
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      byte var3 = var1.readByte();
      this.n((var3 & 1) > 0);
      this.V((var3 & 2) > 0);
      this.f((var3 & 4) > 0);
      this.H((var3 & 8) > 0);
      this.N(var1.readFloat());
      this.C(var1.readFloat());
      net.u.d.h(new net.u.d[5]);
   }

   public void O(net.n2.h var1) throws IOException {
      byte var2 = 0;
      if(this.i()) {
         var2 = (byte)(var2 | 1);
      }

      if(this.J()) {
         var2 = (byte)(var2 | 2);
      }

      if(this.G()) {
         var2 = (byte)(var2 | 4);
      }

      if(this.m()) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeFloat(this.W);
      var1.writeFloat(this.w);
   }

   public void f(net.x.x var1) {
      var1.M(this);
   }

   public boolean i() {
      return this.R;
   }

   public void n(boolean var1) {
      this.R = var1;
   }

   public boolean J() {
      return this.K;
   }

   public void V(boolean var1) {
      this.K = var1;
   }

   public boolean G() {
      return this.X;
   }

   public void f(boolean var1) {
      this.X = var1;
   }

   public boolean m() {
      return this.a;
   }

   public void H(boolean var1) {
      this.a = var1;
   }

   public void N(float var1) {
      this.W = var1;
   }

   public void C(float var1) {
      this.w = var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
