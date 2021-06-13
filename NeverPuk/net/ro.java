package net;

import java.io.Serializable;
import net.ra;
import net.uo;

public class ro extends ra implements Serializable {
   static final long serialVersionUID = -3517736544731446513L;

   public ro(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public ro(float[] var1) {
      super(var1);
   }

   public ro(ro var1) {
      super((ra)var1);
   }

   public ro(ra var1) {
      super(var1);
   }

   public ro(uo var1) {
      super(var1);
   }

   public ro() {
   }
}
