package net;

import java.awt.Color;
import java.io.Serializable;
import net.uw;

public class um extends uw implements Serializable {
   static final long serialVersionUID = 6632576088353444794L;

   public um(byte var1, byte var2, byte var3) {
      super(var1, var2, var3);
   }

   public um(byte[] var1) {
      super(var1);
   }

   public um(um var1) {
      super((uw)var1);
   }

   public um(uw var1) {
      super(var1);
   }

   public um(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue());
   }

   public um() {
   }

   public final void O(Color var1) {
      this.m = (byte)var1.getRed();
      this.A = (byte)var1.getGreen();
      this.Q = (byte)var1.getBlue();
   }

   public final Color H() {
      int var1 = this.m & 255;
      int var2 = this.A & 255;
      int var3 = this.Q & 255;
      return new Color(var1, var2, var3);
   }
}
