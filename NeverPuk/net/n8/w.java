package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.xn;
import net.n8.g;
import net.n8.l;
import net.n8.v7;
import net.n8.x;

public class w {
   public static w q = new w();
   private final x L;
   private final x y;
   private final g d;
   private final Boolean s;
   private final v7 p;

   public w() {
      this.L = x.l;
      this.y = x.l;
      this.d = g.Q;
      this.s = null;
      this.p = v7.z;
   }

   public w(x var1, x var2, g var3, @Nullable Boolean var4, v7 var5) {
      this.L = var1;
      this.y = var2;
      this.d = var3;
      this.s = var4;
      this.p = var5;
   }

   public boolean D(net.r.h var1, net.yz.z var2, float var3, float var4, boolean var5) {
      return this == q?true:(!this.L.e(var3)?false:(!this.y.e(var4)?false:(!this.d.k(var1, var2.v())?false:(this.s != null && this.s.booleanValue() != var5?false:this.p.U(var1, var2)))));
   }

   public static w N(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         JsonObject var2 = net.yz.c.V(var0, "damage");
         x var3 = x.G(var2.get("dealt"));
         x var4 = x.G(var2.get("taken"));
         Boolean var5 = var2.has("blocked")?Boolean.valueOf(net.yz.c.A(var2, "blocked")):null;
         g var6 = g.Y(var2.get("source_entity"));
         v7 var7 = v7.P(var2.get("type"));
         return new w(var3, var4, var6, var5, var7);
      } else {
         return q;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
