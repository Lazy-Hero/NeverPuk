package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.c1.y;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.y7.b;
import net.yz.c;
import net.yz.m_;

public class r extends a {
   private final b g;
   private final boolean b;

   public r(x[] var1, b var2, boolean var3) {
      super(var1);
      this.g = var2;
      this.b = var3;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      return y.Y(var2, var1, this.g.O(var2), this.b);
   }

   public static class q extends a.p {
      public q() {
         super(new m_("enchant_with_levels"), r.class);
      }

      public void z(JsonObject var1, r var2, JsonSerializationContext var3) {
         var1.add("levels", var3.serialize(var2.g));
         var1.addProperty("treasure", Boolean.valueOf(var2.b));
      }

      public r F(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         b var4 = (b)c.m(var1, "levels", var2, b.class);
         boolean var5 = c.a(var1, "treasure", false);
         return new r(var3, var4, var5);
      }
   }
}
