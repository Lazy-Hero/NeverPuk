package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.cr.i;
import net.g.x;
import net.n0.ks;
import net.o.a;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l extends a {
   private static final Logger C = LogManager.getLogger();

   public l(x[] var1) {
      super(var1);
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      String[] var4 = a.D();
      if(var1.B()) {
         return var1;
      } else {
         ks var5 = i.z().Q(var1);
         if(var5.B()) {
            C.warn("Couldn\'t smelt {} because there is no smelting recipe", var1);
            return var1;
         } else {
            ks var6 = var5.s();
            var6.u(var1.U());
            return var6;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class r extends a.p {
      protected r() {
         super(new m_("furnace_smelt"), l.class);
      }

      public void N(JsonObject var1, l var2, JsonSerializationContext var3) {
      }

      public l O(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         return new l(var3);
      }
   }
}
