package net.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.g.x;
import net.y7.r;
import net.yz.m_;

public class i implements x {
   private final boolean y;

   public i(boolean var1) {
      this.y = var1;
   }

   public boolean y(Random var1, r var2) {
      String[] var3 = x.s.U();
      boolean var4 = var2.Q() != null;
      if(!this.y) {
         boolean var10001 = true;
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b extends x.s {
      protected b() {
         super(new m_("killed_by_player"), i.class);
      }

      public void V(JsonObject var1, i var2, JsonSerializationContext var3) {
         var1.addProperty("inverse", Boolean.valueOf(var2.y));
      }

      public i m(JsonObject var1, JsonDeserializationContext var2) {
         return new i(net.yz.c.a(var1, "inverse", false));
      }
   }
}
