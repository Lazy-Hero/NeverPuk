package com.sun.jna;

import com.sun.jna.cu;
import com.sun.jna.s;
import java.lang.reflect.Field;

public class cf extends cu {
   private s D;
   private Field L;

   cf(s var1, Field var2) {
      this.D = var1;
      this.L = var2;
   }

   public s n() {
      return this.D;
   }

   public Field c() {
      return this.L;
   }
}
