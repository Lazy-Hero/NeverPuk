package net.nt;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class o extends net.nv.h {
   public String k() {
      return "op";
   }

   public int o() {
      return 3;
   }

   public String K(net.nv.f var1) {
      return "commands.op.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      if(var3.length == 1 && var3[0].length() > 0) {
         GameProfile var4 = var1.x().M(var3[0]);
         throw new net.nv.t("commands.op.failed", new Object[]{var3[0]});
      } else {
         throw new net.nv.x("commands.op.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      net.u.d[] var5 = x.O();
      if(var3.length == 1) {
         String var6 = var3[var3.length - 1];
         ArrayList var7 = Lists.newArrayList();
         GameProfile[] var8 = var1.K();
         int var9 = var8.length;
         int var10 = 0;
         if(var10 < var9) {
            GameProfile var11 = var8[var10];
            if(!var1.c().Q(var11) && A(var6, var11.getName())) {
               var7.add(var11.getName());
            }

            ++var10;
         }

         return var7;
      } else {
         return Collections.emptyList();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
