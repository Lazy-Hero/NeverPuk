package com.sun.jna;

import com.sun.jna.cd;

public class ci extends cd {
   public ci() {
      this((short)0);
   }

   public ci(short var1) {
      super(2);
      this.O(var1);
   }

   public void O(short var1) {
      this.o().J(0L, var1);
   }

   public short C() {
      return this.o().H(0L);
   }
}
