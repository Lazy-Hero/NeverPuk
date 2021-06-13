package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.c1.y;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.y7.b;
import net.yz.c;
import net.yz.m_;

public class n extends a {
   private final b X;
   private final int A;

   public n(x[] var1, b var2, int var3) {
      super(var1);
      this.X = var2;
      this.A = var3;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      a.D();
      net.ne.l var5 = var3.i();
      if(var5 instanceof net.ne.a) {
         int var6 = y.m((net.ne.a)var5);
         if(var6 == 0) {
            return var1;
         }

         float var7 = (float)var6 * this.X.c(var2);
         var1.A(Math.round(var7));
         if(this.A != 0 && var1.U() > this.A) {
            var1.u(this.A);
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class z extends a.p {
      protected z() {
         super(new m_("looting_enchant"), n.class);
      }

      public void C(JsonObject var1, n var2, JsonSerializationContext var3) {
         String[] var4 = a.D();
         var1.add("count", var3.serialize(var2.X));
         if(var2.A > 0) {
            var1.add("limit", var3.serialize(Integer.valueOf(var2.A)));
         }

      }

      public n t(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         int var4 = c.t(var1, "limit", 0);
         return new n(var3, (b)c.m(var1, "count", var2, b.class), var4);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
