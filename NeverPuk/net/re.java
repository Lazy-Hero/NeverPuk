package net;

import java.awt.Color;
import java.io.Serializable;
import net.ra;
import net.uo;

public class re extends ra implements Serializable {
   static final long serialVersionUID = 8577680141580006740L;

   public re(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public re(float[] var1) {
      super(var1);
   }

   public re(re var1) {
      super((ra)var1);
   }

   public re(ra var1) {
      super(var1);
   }

   public re(uo var1) {
      super(var1);
   }

   public re(Color var1) {
      super((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, (float)var1.getAlpha() / 255.0F);
   }

   public re() {
   }

   public final void k(Color var1) {
      this.j = (float)var1.getRed() / 255.0F;
      this.v = (float)var1.getGreen() / 255.0F;
      this.M = (float)var1.getBlue() / 255.0F;
      this.U = (float)var1.getAlpha() / 255.0F;
   }

   public final Color l() {
      int var1 = Math.round(this.j * 255.0F);
      int var2 = Math.round(this.v * 255.0F);
      int var3 = Math.round(this.M * 255.0F);
      int var4 = Math.round(this.U * 255.0F);
      return new Color(var1, var2, var3, var4);
   }
}
