package net.no;

import java.io.IOException;

public class iu implements net.n2.k {
   private String U;
   private String P;

   public iu() {
   }

   public iu(String var1, String var2) {
      this.U = var1;
      this.P = var2;
      if(var2.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + var2.length() + ")");
      }
   }

   public void E(net.n2.h var1) throws IOException {
      this.U = var1.Z(32767);
      this.P = var1.Z(40);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.R(this.U);
      var1.R(this.P);
   }

   public void f(net.x.t var1) {
      var1.o(this);
   }

   public String C() {
      return this.U;
   }

   public String G() {
      return this.P;
   }
}
