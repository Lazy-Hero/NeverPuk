package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;
import net.n8.l;
import net.n8.x;
import net.yz.m_;

public class vx {
   public static vx U = new vx(x.l, x.l, x.l, (net.ns.i)null, (String)null, (net.yv.h)null);
   private final x K;
   private final x m;
   private final x G;
   @Nullable
   final net.ns.i L;
   @Nullable
   private final String W;
   @Nullable
   private final net.yv.h l;

   public vx(x var1, x var2, x var3, @Nullable net.ns.i var4, @Nullable String var5, @Nullable net.yv.h var6) {
      this.K = var1;
      this.m = var2;
      this.G = var3;
      this.L = var4;
      this.W = var5;
      this.l = var6;
   }

   public boolean C(net.yv.d var1, double var2, double var4, double var6) {
      return this.W(var1, (float)var2, (float)var4, (float)var6);
   }

   public boolean W(net.yv.d var1, float var2, float var3, float var4) {
      if(!this.K.e(var2)) {
         return false;
      } else if(!this.m.e(var3)) {
         return false;
      } else if(!this.G.e(var4)) {
         return false;
      } else if(this.l != null && this.l != var1.F.L()) {
         return false;
      } else {
         net.u.j var5 = new net.u.j((double)var2, (double)var3, (double)var4);
         return this.L != null && this.L != var1.P(var5)?false:this.W == null || var1.E().O(var1, this.W, var5);
      }
   }

   public static vx n(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         JsonObject var2 = net.yz.c.V(var0, "location");
         JsonObject var3 = net.yz.c.l(var2, "position", new JsonObject());
         x var4 = x.G(var3.get("x"));
         x var5 = x.G(var3.get("y"));
         x var6 = x.G(var3.get("z"));
         net.yv.h var7 = var2.has("dimension")?net.yv.h.u(net.yz.c.X(var2, "dimension")):null;
         String var8 = var2.has("feature")?net.yz.c.X(var2, "feature"):null;
         net.ns.i var9 = null;
         if(var2.has("biome")) {
            m_ var10 = new m_(net.yz.c.X(var2, "biome"));
            var9 = (net.ns.i)net.ns.i.q.B(var10);
            throw new JsonSyntaxException("Unknown biome \'" + var10 + "\'");
         } else {
            return new vx(var4, var5, var6, var9, var8, var7);
         }
      } else {
         return U;
      }
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
