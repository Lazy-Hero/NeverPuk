package net.cg;

import net.cg.h;

public class x implements Runnable {
   private final h l;

   public x(h var1) {
      this.l = var1;
   }

   public void run() {
      this.l.f();
   }
}
