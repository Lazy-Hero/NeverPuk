package net;

import java.awt.Color;
import java.io.Serializable;
import net.go;
import net.x_;

public class xd extends x_ implements Serializable {
   static final long serialVersionUID = -1861792981817493659L;

   public xd(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public xd(float[] var1) {
      super(var1);
   }

   public xd(xd var1) {
      super((x_)var1);
   }

   public xd(x_ var1) {
      super(var1);
   }

   public xd(go var1) {
      super(var1);
   }

   public xd(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F);
   }

   public xd() {
   }

   public final void A(Color var1) {
      this.q = (float)var1.getRed() / 255.0F;
      this.Q = (float)var1.getGreen() / 255.0F;
      this.G = (float)var1.getBlue() / 255.0F;
   }

   public final Color q() {
      int var1 = Math.round(this.q * 255.0F);
      int var2 = Math.round(this.Q * 255.0F);
      int var3 = Math.round(this.G * 255.0F);
      return new Color(var1, var2, var3);
   }
}
