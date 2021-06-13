package net.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.c1.y;
import net.g.x;
import net.ne.a;
import net.y7.r;
import net.yz.m_;

public class h implements x {
   private final float i;
   private final float S;

   public h(float var1, float var2) {
      this.i = var1;
      this.S = var2;
   }

   public boolean y(Random var1, r var2) {
      x.s.U();
      int var4 = 0;
      if(var2.i() instanceof a) {
         var4 = y.m((a)var2.i());
      }

      return Float.compare(var1.nextFloat(), this.i + (float)var4 * this.S) < 0;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class v extends x.s {
      protected v() {
         super(new m_("random_chance_with_looting"), h.class);
      }

      public void I(JsonObject var1, h var2, JsonSerializationContext var3) {
         var1.addProperty("chance", Float.valueOf(var2.i));
         var1.addProperty("looting_multiplier", Float.valueOf(var2.S));
      }

      public h h(JsonObject var1, JsonDeserializationContext var2) {
         return new h(net.yz.c.t(var1, "chance"), net.yz.c.t(var1, "looting_multiplier"));
      }
   }
}
