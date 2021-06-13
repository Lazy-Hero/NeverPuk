package net;

import java.awt.Color;
import java.io.Serializable;
import net.bm;

public class bj extends bm implements Serializable {
   static final long serialVersionUID = -105080578052502155L;

   public bj(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
   }

   public bj(byte[] var1) {
      super(var1);
   }

   public bj(bj var1) {
      super((bm)var1);
   }

   public bj(bm var1) {
      super(var1);
   }

   public bj(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue(), (byte)var1.getAlpha());
   }

   public bj() {
   }

   public final void Q(Color var1) {
      this.T = (byte)var1.getRed();
      this.I = (byte)var1.getGreen();
      this.y = (byte)var1.getBlue();
      this.v = (byte)var1.getAlpha();
   }

   public final Color A() {
      int var1 = this.T & 255;
      int var2 = this.I & 255;
      int var3 = this.y & 255;
      int var4 = this.v & 255;
      return new Color(var1, var2, var3, var4);
   }
}
