package net;

import net.oo;
import net.ot;
import net.nn.j;

public class ws extends Thread {
   private String b = null;
   private ot f = null;

   public ws(String var1, ot var2) {
      this.b = var1;
      this.f = var2;
   }

   public void run() {
      byte[] var1 = oo.a(this.b, j.b().u());
      this.f.G(this.b, var1, (Throwable)null);
   }

   public String u() {
      return this.b;
   }

   public ot Q() {
      return this.f;
   }
}
