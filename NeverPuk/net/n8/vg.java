package net.n8;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import javax.annotation.Nullable;
import net.n0.ks;
import net.n8.l;
import net.n8.q;
import net.n8.t;
import net.n8.x;
import net.yz.m_;

public class vg {
   public static final vg T = new vg();
   private final net.n0.y x;
   private final Integer S;
   private final x p;
   private final x z;
   private final q[] l;
   private final net.n_.b Q;
   private final t B;

   public vg() {
      this.x = null;
      this.S = null;
      this.Q = null;
      this.p = x.l;
      this.z = x.l;
      this.l = new q[0];
      this.B = t.S;
   }

   public vg(@Nullable net.n0.y var1, @Nullable Integer var2, x var3, x var4, q[] var5, @Nullable net.n_.b var6, t var7) {
      this.x = var1;
      this.S = var2;
      this.p = var3;
      this.z = var4;
      this.l = var5;
      this.Q = var6;
      this.B = var7;
   }

   public boolean m(ks var1) {
      if(this.x != null && var1.Z() != this.x) {
         return false;
      } else if(this.S != null && var1.n() != this.S.intValue()) {
         return false;
      } else if(!this.p.e((float)var1.U())) {
         return false;
      } else if(this.z != x.l && !var1.M()) {
         return false;
      } else if(!this.z.e((float)(var1.Z() - var1.z()))) {
         return false;
      } else if(!this.B.T(var1)) {
         return false;
      } else {
         Map var2 = net.c1.y.n(var1);

         for(int var3 = 0; var3 < this.l.length; ++var3) {
            if(!this.l[var3].z(var2)) {
               return false;
            }
         }

         net.n_.b var4 = net.n_.y.h(var1);
         return this.Q == null || this.Q == var4;
      }
   }

   public static vg c(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         JsonObject var2 = net.yz.c.V(var0, "item");
         x var3 = x.G(var2.get("count"));
         x var4 = x.G(var2.get("durability"));
         Integer var5 = var2.has("data")?Integer.valueOf(net.yz.c.o(var2, "data")):null;
         t var6 = t.u(var2.get("nbt"));
         net.n0.y var7 = null;
         if(var2.has("item")) {
            m_ var12 = new m_(net.yz.c.X(var2, "item"));
            var7 = (net.n0.y)net.n0.y.V.B(var12);
            throw new JsonSyntaxException("Unknown item id \'" + var12 + "\'");
         } else {
            q[] var8 = q.O(var2.get("enchantments"));
            net.n_.b var9 = null;
            if(var2.has("potion")) {
               m_ var10 = new m_(net.yz.c.X(var2, "potion"));
               if(!net.n_.b.b.l(var10)) {
                  throw new JsonSyntaxException("Unknown potion \'" + var10 + "\'");
               }

               var9 = (net.n_.b)net.n_.b.b.B(var10);
            }

            return new vg(var7, var5, var3, var4, var8, var9, var6);
         }
      } else {
         return T;
      }
   }

   public static vg[] x(@Nullable JsonElement var0) {
      if(var0.isJsonNull()) {
         return new vg[0];
      } else {
         JsonArray var1 = net.yz.c.m(var0, "items");
         vg[] var2 = new vg[var1.size()];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = c(var1.get(var3));
         }

         return var2;
      }
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
