package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.y7.b;
import net.yz.c;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class s extends a {
   private static final Logger P = LogManager.getLogger();
   private final b V;

   public s(x[] var1, b var2) {
      super(var1);
      this.V = var2;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      String[] var4 = a.D();
      if(var1.M()) {
         P.warn("Couldn\'t set data of loot item {}", var1);
      }

      var1.d(this.V.O(var2));
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class i extends a.p {
      protected i() {
         super(new m_("set_data"), s.class);
      }

      public void D(JsonObject var1, s var2, JsonSerializationContext var3) {
         var1.add("data", var3.serialize(var2.V));
      }

      public s B(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         return new s(var3, (b)c.m(var1, "data", var2, b.class));
      }
   }
}
