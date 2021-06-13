package net;

import net.b7;
import net.uv;
import net.xn;
import net.z9;

public class bq extends b7 {
   public static final String[] r = new String[]{"default", "fast", "fancy", "off"};
   public static final String[] W = new String[]{"Default", "Fast", "Fancy", "OFF"};

   public bq(String var1, String var2, int var3) {
      super(var1, r, var2, W, var3);
   }

   public boolean n() {
      return this.s() == 0;
   }

   public boolean w() {
      int[] var1 = uv.l();
      return this.s() == 1;
   }

   public boolean N() {
      return this.s() == 2;
   }

   public boolean T() {
      int[] var1 = uv.l();
      return this.s() == 3;
   }

   public boolean d(String var1) {
      int[] var2 = uv.l();
      if(z9.Z(var1, "none")) {
         var1 = "off";
      }

      return super.d(var1);
   }

   static {
      String[] var10000 = new String[]{"default", "fast", "fancy", "off"};
      var10000 = new String[]{"Default", "Fast", "Fancy", "OFF"};
   }

   private static xn a(xn var0) {
      return var0;
   }
}
