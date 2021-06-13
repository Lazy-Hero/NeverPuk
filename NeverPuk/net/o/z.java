package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.g.x;
import net.n0.ks;
import net.nj.f;
import net.o.a;
import net.yz.c;
import net.yz.m_;

public class z extends a {
   private final f l;

   public z(x[] var1, f var2) {
      super(var1);
      this.l = var2;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      a.D();
      f var5 = var1.o();
      if(var5 == null) {
         var5 = this.l.F();
      }

      var5.I(this.l);
      var1.t(var5);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class s extends a.p {
      public s() {
         super(new m_("set_nbt"), net.o.z.class);
      }

      public void Z(JsonObject var1, net.o.z var2, JsonSerializationContext var3) {
         var1.addProperty("tag", var2.l.toString());
      }

      public net.o.z I(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         f var4 = net.nj.g.c(c.X(var1, "tag"));
         return new net.o.z(var3, var4);
      }
   }
}
