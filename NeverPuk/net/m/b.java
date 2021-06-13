package net.m;

import java.io.IOException;
import net.m.qo;

public class b implements net.n2.k {
   private int k;
   private short g;
   private boolean B;

   public b() {
   }

   public b(int var1, short var2, boolean var3) {
      this.k = var1;
      this.g = var2;
      this.B = var3;
   }

   public void k(net.x.x var1) {
      var1.K(this);
   }

   public void E(net.n2.h var1) throws IOException {
      qo.y();
      this.k = var1.readByte();
      this.g = var1.readShort();
      this.B = var1.readByte() != 0;
   }

   public boolean m() {
      return this.B;
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.k);
      qo.y();
      var1.writeShort(this.g);
      var1.writeByte(this.B?1:0);
   }

   public int g() {
      return this.k;
   }

   public short F() {
      return this.g;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
