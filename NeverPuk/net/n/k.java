package net.n;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n.y;
import net.yz.a7;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k {
   private static final Logger m = LogManager.getLogger();
   public static final File B = new File("banned-ips.txt");
   public static final File s = new File("banned-players.txt");
   public static final File n = new File("ops.txt");
   public static final File G = new File("white-list.txt");

   private static void t(net.nx.f var0, Collection var1, ProfileLookupCallback var2) {
      String[] var3 = (String[])Iterators.toArray(Iterators.filter(var1.iterator(), new Predicate() {
         public boolean W(@Nullable String var1) {
            int[] var2 = y.c();
            return !a7.Y(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }), String.class);
      if(var0.E()) {
         var0.y().findProfilesByNames(var3, Agent.MINECRAFT, var2);
      } else {
         for(String var7 : var3) {
            UUID var8 = net.r.r.D(new GameProfile((UUID)null, var7));
            GameProfile var9 = new GameProfile(var8, var7);
            var2.onProfileLookupSucceeded(var9);
         }
      }

   }

   public static String T(final net.nx.f var0, String var1) {
      int[] var2 = y.c();
      if(!a7.Y(var1) && var1.length() <= 16) {
         GameProfile var3 = var0.x().M(var1);
         if(var3 != null && var3.getId() != null) {
            return var3.getId().toString();
         } else if(!var0.n() && var0.E()) {
            final ArrayList var4 = Lists.newArrayList();
            ProfileLookupCallback var5 = new ProfileLookupCallback() {
               public void onProfileLookupSucceeded(GameProfile var1) {
                  var0.x().U(var1);
                  var4.add(var1);
               }

               public void onProfileLookupFailed(GameProfile var1, Exception var2) {
                  k.m.warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
               }
            };
            t(var0, Lists.newArrayList(new String[]{var1}), var5);
            return !var4.isEmpty() && ((GameProfile)var4.get(0)).getId() != null?((GameProfile)var4.get(0)).getId().toString():"";
         } else {
            return net.r.r.D(new GameProfile((UUID)null, var1)).toString();
         }
      } else {
         return var1;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
