package net.no;

import java.io.IOException;

public class i1 implements net.n2.k {
   public static final String[] r = new String[]{"tile.bed.notValid"};
   private int p;
   private float f;

   public i1() {
   }

   public i1(int var1, float var2) {
      this.p = var1;
      this.f = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.p = var1.readUnsignedByte();
      this.f = var1.readFloat();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.p);
      var1.writeFloat(this.f);
   }

   public void P(net.x.t var1) {
      var1.b(this);
   }

   public int a() {
      return this.p;
   }

   public float E() {
      return this.f;
   }

   static {
      String[] var10001 = new String[]{"tile.bed.notValid"};
   }
}
