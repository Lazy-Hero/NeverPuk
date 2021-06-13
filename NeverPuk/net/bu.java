package net;

import net.b7;
import net.m8;
import net.uv;
import net.xn;

public class bu extends b7 {
   public static final String[] X = new String[]{"default", "true", "false"};
   public static final String[] L = new String[]{"Default", "ON", "OFF"};

   public bu(String var1, String var2, int var3) {
      super(var1, X, var2, L, var3);
   }

   public String e() {
      int[] var1 = uv.l();
      return this.f()?m8.N():(this.y()?m8.b():(this.r()?m8.o():super.e()));
   }

   public boolean f() {
      return this.s() == 0;
   }

   public boolean y() {
      return this.s() == 1;
   }

   public boolean r() {
      return this.s() == 2;
   }

   static {
      String[] var10000 = new String[]{"default", "true", "false"};
      var10000 = new String[]{"Default", "ON", "OFF"};
   }

   private static xn a(xn var0) {
      return var0;
   }
}
