package net.n;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;
import net.xn;
import net.n.a;
import net.n.g;
import net.n.r;
import net.n.y;

public class v extends r {
   public v(File var1) {
      super(var1);
   }

   protected a x(JsonObject var1) {
      return new g(var1);
   }

   public String[] g() {
      y.c();
      String[] var2 = new String[this.q().size()];
      int var3 = 0;
      Iterator var4 = this.q().values().iterator();
      if(var4.hasNext()) {
         g var5 = (g)var4.next();
         var2[var3++] = ((GameProfile)var5.u()).getName();
      }

      return var2;
   }

   public int L(GameProfile var1) {
      g var2 = (g)this.g(var1);
      return var2.x();
   }

   public boolean G(GameProfile var1) {
      g var2 = (g)this.g(var1);
      return var2.C();
   }

   protected String r(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile Z(String var1) {
      y.c();
      Iterator var3 = this.q().values().iterator();
      if(var3.hasNext()) {
         g var4 = (g)var3.next();
         if(var1.equalsIgnoreCase(((GameProfile)var4.u()).getName())) {
            return (GameProfile)var4.u();
         }
      }

      return null;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
