package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.u.t;
import net.y7.b;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g extends a {
   private static final Logger Z = LogManager.getLogger();
   private final b R;

   public g(x[] var1, b var2) {
      super(var1);
      this.R = var2;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      String[] var4 = a.D();
      if(var1.M()) {
         float var5 = 1.0F - this.R.c(var2);
         var1.d(t.M(var5 * (float)var1.Z()));
      }

      Z.warn("Couldn\'t set damage of loot item {}", var1);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c extends a.p {
      protected c() {
         super(new m_("set_damage"), g.class);
      }

      public void w(JsonObject var1, g var2, JsonSerializationContext var3) {
         var1.add("damage", var3.serialize(var2.R));
      }

      public g K(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         return new g(var3, (b)net.yz.c.m(var1, "damage", var2, b.class));
      }
   }
}
