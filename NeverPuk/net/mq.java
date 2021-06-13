package net;

import java.util.Map;
import net.of;
import net.xl;

public class mq extends Thread {
   private final String O;
   private final Map v;
   private final byte[] Z;
   private final xl E;

   public mq(String var1, Map var2, byte[] var3, xl var4) {
      this.O = var1;
      this.v = var2;
      this.Z = var3;
      this.E = var4;
   }

   public void run() {
      of.z(this.O, this.v, this.Z);
      this.E.b(this.O, this.Z, (Throwable)null);
   }

   public String G() {
      return this.O;
   }

   public byte[] B() {
      return this.Z;
   }

   public xl V() {
      return this.E;
   }
}
