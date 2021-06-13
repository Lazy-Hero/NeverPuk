package net.no;

import java.io.IOException;

public class sz implements net.n2.k {
   private int R;
   private short Z;
   private boolean X;

   public sz() {
   }

   public sz(int var1, short var2, boolean var3) {
      this.R = var1;
      this.Z = var2;
      this.X = var3;
   }

   public void Y(net.x.t var1) {
      var1.q(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.R = var1.readUnsignedByte();
      this.Z = var1.readShort();
      this.X = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.R);
      var1.writeShort(this.Z);
      var1.writeBoolean(this.X);
   }

   public int Q() {
      return this.R;
   }

   public short m() {
      return this.Z;
   }

   public boolean y() {
      return this.X;
   }
}
