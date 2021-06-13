package net;

import com.google.gson.annotations.SerializedName;
import net.xn;
import net.u.d;

public class pr {
   @SerializedName("hypixel.lvl")
   private int b;
   @SerializedName("hypixel.rank")
   private String U;
   @SerializedName("mineplex.lvl")
   private int R;
   @SerializedName("mineplex.rank")
   private String W;
   @SerializedName("labymod.cape")
   private boolean D;
   @SerializedName("5zig.cape")
   private boolean K;
   private static int[] x;

   public int L() {
      return this.b;
   }

   public String F() {
      return this.U;
   }

   public int U() {
      return this.R;
   }

   public String v() {
      return this.W;
   }

   public boolean O() {
      return this.D;
   }

   public boolean y() {
      return this.K;
   }

   public String toString() {
      int[] var1 = S();
      String var10000 = String.format("AccountInfo[%s:%s:%s:%s:%s:%s]", new Object[]{Integer.valueOf(this.b), this.U, Integer.valueOf(this.R), this.W, Boolean.valueOf(this.D), Boolean.valueOf(this.K)});
      d.h(new d[2]);
      return var10000;
   }

   public static void B(int[] var0) {
      x = var0;
   }

   public static int[] S() {
      return x;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(S() != null) {
         B(new int[1]);
      }

   }
}
