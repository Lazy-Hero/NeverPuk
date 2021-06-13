package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.xn;
import net.n8.g;
import net.n8.l;

public class v7 {
   public static v7 z = new v7();
   private final Boolean M;
   private final Boolean P;
   private final Boolean X;
   private final Boolean Y;
   private final Boolean a;
   private final Boolean T;
   private final Boolean v;
   private final g c;
   private final g q;

   public v7() {
      this.M = null;
      this.P = null;
      this.X = null;
      this.Y = null;
      this.a = null;
      this.T = null;
      this.v = null;
      this.c = g.Q;
      this.q = g.Q;
   }

   public v7(@Nullable Boolean var1, @Nullable Boolean var2, @Nullable Boolean var3, @Nullable Boolean var4, @Nullable Boolean var5, @Nullable Boolean var6, @Nullable Boolean var7, g var8, g var9) {
      this.M = var1;
      this.P = var2;
      this.X = var3;
      this.Y = var4;
      this.a = var5;
      this.T = var6;
      this.v = var7;
      this.c = var8;
      this.q = var9;
   }

   public boolean U(net.r.h var1, net.yz.z var2) {
      String var3 = l.O();
      return this == z?true:(this.M != null && this.M.booleanValue() != var2.R()?false:(this.P != null && this.P.booleanValue() != var2.e()?false:(this.X != null && this.X.booleanValue() != var2.i()?false:(this.Y != null && this.Y.booleanValue() != var2.a()?false:(this.a != null && this.a.booleanValue() != var2.v()?false:(this.T != null && this.T.booleanValue() != var2.q()?false:(this.v != null && this.v.booleanValue() != var2.p()?false:(!this.c.k(var1, var2.g())?false:this.q.k(var1, var2.v())))))))));
   }

   public static v7 P(@Nullable JsonElement var0) {
      if(!var0.isJsonNull()) {
         JsonObject var1 = net.yz.c.V(var0, "damage type");
         Boolean var2 = Q(var1, "is_projectile");
         Boolean var3 = Q(var1, "is_explosion");
         Boolean var4 = Q(var1, "bypasses_armor");
         Boolean var5 = Q(var1, "bypasses_invulnerability");
         Boolean var6 = Q(var1, "bypasses_magic");
         Boolean var7 = Q(var1, "is_fire");
         Boolean var8 = Q(var1, "is_magic");
         g var9 = g.Y(var1.get("direct_entity"));
         g var10 = g.Y(var1.get("source_entity"));
         return new v7(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } else {
         return z;
      }
   }

   @Nullable
   private static Boolean Q(JsonObject var0, String var1) {
      return var0.has(var1)?Boolean.valueOf(net.yz.c.A(var0, var1)):null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
