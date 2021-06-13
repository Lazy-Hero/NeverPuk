package net.na;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.na.e;
import net.yz.c;
import net.yz.m_;

public class u implements e {
   private final boolean U;

   public u(boolean var1) {
      this.U = var1;
   }

   public boolean H(Random var1, net.ne.l var2) {
      int var3 = e.w.J();
      return var2.a() == this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class j extends e.w {
      protected j() {
         super(new m_("on_fire"), u.class);
      }

      public JsonElement m(u var1, JsonSerializationContext var2) {
         return new JsonPrimitive(Boolean.valueOf(var1.U));
      }

      public u n(JsonElement var1, JsonDeserializationContext var2) {
         return new u(c.w(var1, "on_fire"));
      }
   }
}
