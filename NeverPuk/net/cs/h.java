package net.cs;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import net.cs.c;
import net.n2.k;
import net.u.d;
import net.ya.s;

public class h implements k {
   private GameProfile d;

   public h() {
   }

   public h(GameProfile var1) {
      this.d = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      c.I();
      String var3 = var1.Z(36);
      String var4 = var1.Z(16);
      UUID var5 = UUID.fromString(var3);
      this.d = new GameProfile(var5, var4);
      d.h(new d[4]);
   }

   public void O(net.n2.h var1) throws IOException {
      c.i();
      UUID var3 = this.d.getId();
      var1.R(var3 == null?"":var3.toString());
      var1.R(this.d.getName());
      if(d.y() == null) {
         c.l(false);
      }

   }

   public void o(s var1) {
      var1.R(this);
   }

   public GameProfile S() {
      return this.d;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
