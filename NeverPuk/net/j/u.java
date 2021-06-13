package net.j;

import java.io.IOException;
import net.n2.h;
import net.n2.k;
import net.nh.p;

public class u implements k {
   private long J;
   private static String h;

   public u() {
   }

   public u(long var1) {
      this.J = var1;
   }

   public void E(h var1) throws IOException {
      this.J = var1.readLong();
   }

   public void O(h var1) throws IOException {
      var1.writeLong(this.J);
   }

   public void H(p var1) {
      var1.c(this);
   }

   public static void u(String var0) {
      h = var0;
   }

   public static String G() {
      return h;
   }

   static {
      if(G() == null) {
         u("Xea1kc");
      }

   }
}
