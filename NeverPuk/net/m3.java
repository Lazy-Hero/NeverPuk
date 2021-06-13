package net;

import net.mf;
import net.ow;
import net.xn;

public class m3 {
   private String G;
   private boolean k;
   private Class L;

   public m3(String var1) {
      this(var1, false);
   }

   public m3(String var1, boolean var2) {
      this.G = null;
      this.k = false;
      this.L = null;
      this.G = var1;
      this.J();
   }

   public m3(Class var1) {
      this.G = null;
      this.k = false;
      this.L = null;
      this.L = var1;
      this.G = var1.getName();
      this.k = true;
   }

   public Class J() {
      return this.L;
   }

   public boolean l() {
      return this.J() != null;
   }

   public String U() {
      return this.G;
   }

   public boolean T(Object var1) {
      String var2 = mf.O();
      return this.J() != null && this.J().isInstance(var1);
   }

   public mf L(String var1) {
      return new mf(this, var1);
   }

   public ow X(String var1) {
      return new ow(this, var1);
   }

   public ow L(String var1, Class[] var2) {
      return new ow(this, var1, var2);
   }

   public ow u(String var1, Class[] var2, boolean var3) {
      return new ow(this, var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
