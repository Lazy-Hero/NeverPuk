package net.nc;

import net.nc.b;
import net.nc.u;

public class l {
   private final b S;
   private final String r;
   private final u E;
   private u.o L;
   private String u;

   public l(b var1, String var2, u var3) {
      this.S = var1;
      this.r = var2;
      this.E = var3;
      this.u = var2;
      this.L = var3.I();
   }

   public b J() {
      return this.S;
   }

   public String e() {
      return this.r;
   }

   public u v() {
      return this.E;
   }

   public String a() {
      return this.u;
   }

   public void J(String var1) {
      this.u = var1;
      this.S.t(this);
   }

   public u.o t() {
      return this.L;
   }

   public void I(u.o var1) {
      this.L = var1;
      this.S.t(this);
   }
}
