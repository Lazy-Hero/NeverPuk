package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.n8.j;
import net.n8.l;
import net.n8.t;
import net.n8.vo;
import net.n8.vx;
import net.yz.m_;

public class g {
   public static final g Q = new g((m_)null, j.s, vx.U, vo.r, t.S);
   private final m_ q;
   private final j f;
   private final vx b;
   private final vo i;
   private final t P;

   public g(@Nullable m_ var1, j var2, vx var3, vo var4, t var5) {
      this.q = var1;
      this.f = var2;
      this.b = var3;
      this.i = var4;
      this.P = var5;
   }

   public boolean k(net.r.h var1, @Nullable net.ne.l var2) {
      l.O();
      return this == Q;
   }

   public static g Y(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         JsonObject var2 = net.yz.c.V(var0, "entity");
         m_ var3 = null;
         if(var2.has("type")) {
            var3 = new m_(net.yz.c.X(var2, "type"));
            if(!net.ne.v.f(var3)) {
               throw new JsonSyntaxException("Unknown entity type \'" + var3 + "\', valid types are: " + net.ne.v.K());
            }
         }

         j var4 = j.u(var2.get("distance"));
         vx var5 = vx.n(var2.get("location"));
         vo var6 = vo.P(var2.get("effects"));
         t var7 = t.u(var2.get("nbt"));
         return new g(var3, var4, var5, var6, var7);
      } else {
         return Q;
      }
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
