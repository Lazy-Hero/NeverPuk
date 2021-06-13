package net.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.g.x;
import net.y7.r;
import net.yz.m_;

public class n implements x {
   private final float v;

   public n(float var1) {
      this.v = var1;
   }

   public boolean y(Random var1, r var2) {
      String[] var3 = x.s.U();
      return Float.compare(var1.nextFloat(), this.v) < 0;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class w extends x.s {
      protected w() {
         super(new m_("random_chance"), n.class);
      }

      public void a(JsonObject var1, n var2, JsonSerializationContext var3) {
         var1.addProperty("chance", Float.valueOf(var2.v));
      }

      public n L(JsonObject var1, JsonDeserializationContext var2) {
         return new n(net.yz.c.t(var1, "chance"));
      }
   }
}
