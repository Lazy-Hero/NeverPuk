package com.sun.jna;

import com.sun.jna.Pointer;
import com.sun.jna.cd;

public class cn extends cd {
   public cn() {
      this((Pointer)null);
   }

   public cn(Pointer var1) {
      super(Pointer.i);
      this.d(var1);
   }

   public void d(Pointer var1) {
      this.o().U(0L, var1);
   }

   public Pointer e() {
      return this.o().f(0L);
   }
}
