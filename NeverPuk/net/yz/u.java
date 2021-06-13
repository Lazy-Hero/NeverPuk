package net.yz;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class u {
   private final String O;
   private final String y;
   private final String J;
   private final u.x n;

   public u(String var1, String var2, String var3, String var4) {
      this.O = var1;
      this.y = var2;
      this.J = var3;
      this.n = u.x.D(var4);
   }

   public String A() {
      return "token:" + this.J + ":" + this.y;
   }

   public String m() {
      return this.y;
   }

   public String w() {
      return this.O;
   }

   public String v() {
      return this.J;
   }

   public GameProfile w() {
      UUID var1 = UUIDTypeAdapter.fromString(this.m());
      return new GameProfile(var1, this.w());
   }

   public static enum x {
      LEGACY,
      MOJANG;

      private static final Map E;
      private final String D;

      private x(String var3) {
         this.D = var3;
      }

      @Nullable
      public static u.x D(String var0) {
         return (u.x)E.get(var0.toLowerCase(Locale.ROOT));
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }
}
