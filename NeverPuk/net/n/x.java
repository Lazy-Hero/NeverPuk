package net.n;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.n.a;
import net.n.y;

public class x extends a {
   public x(GameProfile var1) {
      super(var1);
   }

   public x(JsonObject var1) {
      super(f(var1), var1);
   }

   protected void H(JsonObject var1) {
      int[] var2 = y.c();
      if(this.u() != null) {
         var1.addProperty("uuid", ((GameProfile)this.u()).getId() == null?"":((GameProfile)this.u()).getId().toString());
         var1.addProperty("name", ((GameProfile)this.u()).getName());
         super.H(var1);
      }

   }

   private static GameProfile f(JsonObject var0) {
      int[] var1 = y.c();
      if(var0.has("uuid") && var0.has("name")) {
         String var2 = var0.get("uuid").getAsString();
         UUID var3 = UUID.fromString(var2);
         return new GameProfile(var3, var0.get("name").getAsString());
      } else {
         return null;
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
