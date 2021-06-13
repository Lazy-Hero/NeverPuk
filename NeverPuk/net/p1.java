package net;

import net.xn;

public final class p1 {
   private final String y;
   private String V;
   private String j;
   private p1.q B;
   private static int f;

   public p1(String var1, String var2) {
      this(var1, var2, p1.q.Unchecked);
   }

   public p1(String var1, String var2, p1.q var3) {
      this(var1, var2, "", var3);
   }

   public p1(String var1, String var2, String var3, p1.q var4) {
      this.V = "";
      this.y = var1;
      this.j = var2;
      this.V = var3;
      this.B = var4;
   }

   public p1.q I() {
      return this.B;
   }

   public void d(p1.q var1) {
      this.B = var1;
   }

   public String E() {
      return this.V;
   }

   public void G(String var1) {
      this.V = var1;
   }

   public String Z() {
      return this.j;
   }

   public void v(String var1) {
      this.j = var1;
   }

   public String N() {
      return this.y;
   }

   public static void w(int var0) {
      f = var0;
   }

   public static int o() {
      return f;
   }

   public static int K() {
      int var0 = o();
      return 88;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(K() == 0) {
         w(115);
      }

   }

   public static enum q {
      Working("§aWorking"),
      Banned("§cBanned"),
      Unchecked("§eUnchecked"),
      NotWorking("§4Not Working");

      private final String U;

      private q(String var3) {
         this.U = var3;
      }

      public String F() {
         return this.U;
      }
   }
}
