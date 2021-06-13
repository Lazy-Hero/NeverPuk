package com.sun.jna;

import com.sun.jna.r;
import com.sun.jna.s;
import java.lang.reflect.Field;

public class i extends r {
   private s u;
   private Field t;

   i(s var1, Field var2) {
      super(var2.getType());
      this.u = var1;
      this.t = var2;
   }

   public s c() {
      return this.u;
   }

   public Field j() {
      return this.t;
   }
}
