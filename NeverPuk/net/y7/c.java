package net.y7;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;
import net.y7.o;
import net.y7.r;

public class c extends o {
   public c(int var1, int var2, net.g.x[] var3) {
      super(var1, var2, var3);
   }

   public void n(Collection var1, Random var2, r var3) {
   }

   protected void j(JsonObject var1, JsonSerializationContext var2) {
   }

   public static c A(JsonObject var0, JsonDeserializationContext var1, int var2, int var3, net.g.x[] var4) {
      return new c(var2, var3, var4);
   }
}
