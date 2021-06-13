package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.yz.c;
import net.yz.m_;

public class h extends a {
   private final net.y7.b P;

   public h(x[] var1, net.y7.b var2) {
      super(var1);
      this.P = var2;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      var1.u(this.P.O(var2));
      return var1;
   }

   public static class b extends a.p {
      protected b() {
         super(new m_("set_count"), h.class);
      }

      public void e(JsonObject var1, h var2, JsonSerializationContext var3) {
         var1.add("count", var3.serialize(var2.P));
      }

      public h I(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         return new h(var3, (net.y7.b)c.m(var1, "count", var2, net.y7.b.class));
      }
   }
}
