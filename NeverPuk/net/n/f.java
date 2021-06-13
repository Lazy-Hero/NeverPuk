package net.n;

import com.google.gson.JsonObject;
import java.util.Date;
import net.xn;
import net.n.i;
import net.n.y;

public class f extends i {
   public f(String var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public f(String var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public f(JsonObject var1) {
      super(a(var1), var1);
   }

   private static String a(JsonObject var0) {
      int[] var1 = y.c();
      return var0.has("ip")?var0.get("ip").getAsString():null;
   }

   protected void H(JsonObject var1) {
      int[] var2 = y.c();
      if(this.u() != null) {
         var1.addProperty("ip", (String)this.u());
         super.H(var1);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
