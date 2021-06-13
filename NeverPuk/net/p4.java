package net;

import com.google.gson.annotations.SerializedName;
import net.iq;
import net.xn;

public class p4 {
   private String v;
   private boolean R;
   @SerializedName("premium_name")
   private String t;
   @SerializedName("expires")
   private String k;

   public String W() {
      return this.v;
   }

   public boolean V() {
      return this.R;
   }

   public String T() {
      return this.t;
   }

   public String l() {
      return this.k;
   }

   public String toString() {
      return String.format("LicenseData[%s:%s:%s:%s]", new Object[]{this.v, Boolean.valueOf(this.R), this.t, this.k});
   }

   public boolean equals(Object var1) {
      String[] var2 = iq.Y();
      if(!(var1 instanceof p4)) {
         return false;
      } else {
         p4 var3 = (p4)var1;
         return var3.l().equals(this.l()) && var3.T().equals(this.T()) && var3.V() == this.V() && var3.W().equals(this.W());
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
