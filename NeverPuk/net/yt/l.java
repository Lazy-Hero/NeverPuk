package net.yt;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import net.n2.h;
import net.n2.k;

public class l implements k {
   private GameProfile y;
   private static String[] d;

   public l() {
   }

   public l(GameProfile var1) {
      this.y = var1;
   }

   public void E(h var1) throws IOException {
      this.y = new GameProfile((UUID)null, var1.Z(16));
   }

   public void O(h var1) throws IOException {
      var1.R(this.y.getName());
   }

   public void W(net.ya.z var1) {
      var1.F(this);
   }

   public GameProfile L() {
      return this.y;
   }

   public static void M(String[] var0) {
      d = var0;
   }

   public static String[] z() {
      return d;
   }

   static {
      if(z() != null) {
         M(new String[1]);
      }

   }
}
