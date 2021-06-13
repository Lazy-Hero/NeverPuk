package net.n;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;
import net.xn;
import net.n.a;
import net.n.r;
import net.n.x;
import net.n.y;

public class b extends r {
   public b(File var1) {
      super(var1);
   }

   protected a x(JsonObject var1) {
      return new x(var1);
   }

   public String[] g() {
      String[] var2 = new String[this.q().size()];
      y.c();
      int var3 = 0;
      Iterator var4 = this.q().values().iterator();
      if(var4.hasNext()) {
         x var5 = (x)var4.next();
         var2[var3++] = ((GameProfile)var5.u()).getName();
      }

      return var2;
   }

   protected String A(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile C(String var1) {
      y.c();
      Iterator var3 = this.q().values().iterator();
      if(var3.hasNext()) {
         x var4 = (x)var3.next();
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
