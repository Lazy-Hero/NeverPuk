package net.m;

import java.io.IOException;
import net.m.qo;

public class x implements net.n2.k {
   private float h;
   private float P;
   private boolean F;
   private boolean T;

   public x() {
   }

   public x(float var1, float var2, boolean var3, boolean var4) {
      this.h = var1;
      this.P = var2;
      this.F = var3;
      this.T = var4;
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.h = var1.readFloat();
      this.P = var1.readFloat();
      byte var3 = var1.readByte();
      this.F = (var3 & 1) > 0;
      this.T = (var3 & 2) > 0;
   }

   public void O(net.n2.h var1) throws IOException {
      qo.y();
      var1.writeFloat(this.h);
      var1.writeFloat(this.P);
      byte var3 = 0;
      if(this.F) {
         var3 = (byte)(var3 | 1);
      }

      if(this.T) {
         var3 = (byte)(var3 | 2);
      }

      var1.writeByte(var3);
   }

   public void b(net.x.x var1) {
      var1.y(this);
   }

   public float Z() {
      return this.h;
   }

   public float k() {
      return this.P;
   }

   public boolean Q() {
      return this.F;
   }

   public boolean P() {
      return this.T;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
