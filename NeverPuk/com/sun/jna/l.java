package com.sun.jna;

import com.sun.jna.Callback;

public class l {
   private boolean O;
   private boolean W;
   private String S;
   private ThreadGroup P;

   public l() {
      this(true);
   }

   public l(boolean var1) {
      this(var1, false);
   }

   public l(boolean var1, boolean var2) {
      this(var1, var2, (String)null);
   }

   public l(boolean var1, boolean var2, String var3) {
      this(var1, var2, var3, (ThreadGroup)null);
   }

   public l(boolean var1, boolean var2, String var3, ThreadGroup var4) {
      this.O = var1;
      this.W = var2;
      this.S = var3;
      this.P = var4;
   }

   public String L(Callback var1) {
      return this.S;
   }

   public ThreadGroup s(Callback var1) {
      return this.P;
   }

   public boolean J(Callback var1) {
      return this.O;
   }

   public boolean L(Callback var1) {
      return this.W;
   }
}
