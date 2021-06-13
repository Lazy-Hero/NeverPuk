package net.n;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.n.a;
import net.n.y;

public class g extends a {
   private final int Z;
   private final boolean R;

   public g(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.Z = var2;
      this.R = var3;
   }

   public g(JsonObject var1) {
      y.c();
      super(k(var1), var1);
      this.Z = var1.has("level")?var1.get("level").getAsInt():0;
      this.R = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   public int x() {
      return this.Z;
   }

   public boolean C() {
      return this.R;
   }

   protected void H(JsonObject var1) {
      int[] var2 = y.c();
      if(this.u() != null) {
         var1.addProperty("uuid", ((GameProfile)this.u()).getId() == null?"":((GameProfile)this.u()).getId().toString());
         var1.addProperty("name", ((GameProfile)this.u()).getName());
         super.H(var1);
         var1.addProperty("level", Integer.valueOf(this.Z));
         var1.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.R));
      }

   }

   private static GameProfile k(JsonObject var0) {
      if(var0.has("uuid") && var0.has("name")) {
         String var1 = var0.get("uuid").getAsString();
         UUID var2 = UUID.fromString(var1);
         return new GameProfile(var2, var0.get("name").getAsString());
      } else {
         return null;
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
