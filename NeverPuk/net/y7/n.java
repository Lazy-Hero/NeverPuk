package net.y7;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import net.y7.o;
import net.y7.r;
import net.yz.m_;

public class n extends o {
   protected final m_ f;

   public n(m_ var1, int var2, int var3, net.g.x[] var4) {
      super(var2, var3, var4);
      this.f = var1;
   }

   public void n(Collection var1, Random var2, r var3) {
      net.y7.z var4 = var3.V().k(this.f);
      List var5 = var4.g(var2, var3);
      var1.addAll(var5);
   }

   protected void j(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("name", this.f.toString());
   }

   public static n o(JsonObject var0, JsonDeserializationContext var1, int var2, int var3, net.g.x[] var4) {
      m_ var5 = new m_(net.yz.c.X(var0, "name"));
      return new n(var5, var2, var3, var4);
   }
}
