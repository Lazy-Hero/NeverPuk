package net.n8;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.n8.l;
import net.n8.x;
import net.yz.m_;

public class q {
   public static final q X = new q();
   private final net.c1.c y;
   private final x P;

   public q() {
      this.y = null;
      this.P = x.l;
   }

   public q(@Nullable net.c1.c var1, x var2) {
      this.y = var1;
      this.P = var2;
   }

   public boolean z(Map var1) {
      String var2 = l.O();
      if(this.y != null) {
         if(!var1.containsKey(this.y)) {
            return false;
         } else {
            int var5 = ((Integer)var1.get(this.y)).intValue();
            return this.P == null || this.P.e((float)var5);
         }
      } else if(this.P != null) {
         Iterator var3 = var1.values().iterator();
         if(var3.hasNext()) {
            Integer var4 = (Integer)var3.next();
            if(this.P.e((float)var4.intValue())) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static q W(@Nullable JsonElement var0) {
      if(!var0.isJsonNull()) {
         JsonObject var1 = net.yz.c.V(var0, "enchantment");
         net.c1.c var2 = null;
         if(var1.has("enchantment")) {
            m_ var5 = new m_(net.yz.c.X(var1, "enchantment"));
            var2 = (net.c1.c)net.c1.c.i.B(var5);
            throw new JsonSyntaxException("Unknown enchantment \'" + var5 + "\'");
         } else {
            x var3 = x.G(var1.get("levels"));
            return new q(var2, var3);
         }
      } else {
         return X;
      }
   }

   public static q[] O(@Nullable JsonElement var0) {
      if(var0.isJsonNull()) {
         return new q[0];
      } else {
         JsonArray var1 = net.yz.c.m(var0, "enchantments");
         q[] var2 = new q[var1.size()];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = W(var1.get(var3));
         }

         return var2;
      }
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
