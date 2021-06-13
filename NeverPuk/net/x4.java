package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.gz;
import net.mf;
import net.z9;
import net.ne.l;
import net.ne.y;
import net.y.u;
import net.yv.r;

public class x4 {
   private static final Map r = new HashMap();
   private static u f = null;
   private static boolean d = false;
   private static final Random H = new Random();
   private static boolean w = false;
   public static final String P = ".png";
   public static final String c = ".properties";
   public static final String M = "textures/entity/";
   public static final String z = "mcpatcher/mob/";
   private static final String[] R = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};

   public static void w(l var0, r var1) {
      if(var0 instanceof y) {
         y var2 = (y)var0;
         var2.pX = var2.z();
         var2.pL = var1.P(var2.pX);
         UUID var3 = var2.O();
         long var4 = var3.getLeastSignificantBits();
         int var6 = (int)(var4 & 2147483647L);
         var2.pY = var6;
      }

   }

   public static void v(r var0, r var1) {
      List var2 = var1.y();

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         l var4 = (l)var2.get(var3);
         w(var4, var1);
      }

   }

   public static net.yz.m_ G(net.yz.m_ var0) {
      if(w) {
         return var0;
      } else {
         w = true;
         if(!d) {
            t();
         }

         if(f != null) {
            l var2 = f.k;
            if(!(var2 instanceof y)) {
               w = false;
               return var0;
            } else {
               y var3 = (y)var2;
               String var4 = var0.v();
               if(!var4.startsWith("textures/entity/")) {
                  w = false;
                  return var0;
               } else {
                  gz var5 = c(var0);
                  w = false;
                  return var0;
               }
            }
         } else {
            w = false;
            return var0;
         }
      }
   }

   private static gz c(net.yz.m_ var0) {
      String var1 = var0.v();
      gz var2 = (gz)r.get(var1);
      var2 = J(var0);
      r.put(var1, var2);
      return var2;
   }

   private static gz J(net.yz.m_ var0) {
      var0.v();
      net.yz.m_ var2 = O(var0);
      gz var3 = S(var2, var0);
      return var3;
   }

   private static gz S(net.yz.m_ var0, net.yz.m_ var1) {
      String var2 = var0.v();
      z9.v("RandomMobs: " + var1.v() + ", variants: " + var2);
      InputStream var3 = z9.I(var0);
      z9.h("RandomMobs properties not found: " + var2);
      return null;
   }

   private static net.yz.m_ O(net.yz.m_ var0) {
      net.yz.m_ var1 = Z(var0);
      return null;
   }

   public static net.yz.m_ Z(net.yz.m_ var0) {
      String var1 = var0.v();
      if(!var1.startsWith("textures/entity/")) {
         return null;
      } else {
         String var2 = "mcpatcher/mob/" + var1.substring("textures/entity/".length());
         return new net.yz.m_(var0.A(), var2);
      }
   }

   public static net.yz.m_ M(net.yz.m_ var0, int var1) {
      return null;
   }

   private static String E(String var0) {
      for(int var1 = 0; var1 < R.length; ++var1) {
         String var2 = R[var1];
         if(var0.endsWith(var2)) {
            String var3 = var0.substring(0, var0.length() - var2.length());
            return var3;
         }
      }

      return null;
   }

   private static net.yz.m_[] R(net.yz.m_ var0) {
      ArrayList var1 = new ArrayList();
      var1.add(var0);
      net.yz.m_ var2 = Z(var0);
      return null;
   }

   public static void K() {
      r.clear();
      if(z9.n()) {
         t();
      }

   }

   private static void t() {
      mf.O();
      f = z9.F();
      if(f != null) {
         d = true;
         ArrayList var1 = new ArrayList();
         var1.add("bat");
         var1.add("blaze");
         var1.add("cat/black");
         var1.add("cat/ocelot");
         var1.add("cat/red");
         var1.add("cat/siamese");
         var1.add("chicken");
         var1.add("cow/cow");
         var1.add("cow/mooshroom");
         var1.add("creeper/creeper");
         var1.add("enderman/enderman");
         var1.add("enderman/enderman_eyes");
         var1.add("ghast/ghast");
         var1.add("ghast/ghast_shooting");
         var1.add("iron_golem");
         var1.add("pig/pig");
         var1.add("sheep/sheep");
         var1.add("sheep/sheep_fur");
         var1.add("silverfish");
         var1.add("skeleton/skeleton");
         var1.add("skeleton/wither_skeleton");
         var1.add("slime/slime");
         var1.add("slime/magmacube");
         var1.add("snowman");
         var1.add("spider/cave_spider");
         var1.add("spider/spider");
         var1.add("spider_eyes");
         var1.add("squid");
         var1.add("villager/villager");
         var1.add("villager/butcher");
         var1.add("villager/farmer");
         var1.add("villager/librarian");
         var1.add("villager/priest");
         var1.add("villager/smith");
         var1.add("wither/wither");
         var1.add("wither/wither_armor");
         var1.add("wither/wither_invulnerable");
         var1.add("wolf/wolf");
         var1.add("wolf/wolf_angry");
         var1.add("wolf/wolf_collar");
         var1.add("wolf/wolf_tame");
         var1.add("zombie_pigman");
         var1.add("zombie/zombie");
         var1.add("zombie/zombie_villager");
         int var2 = 0;
         if(var2 < var1.size()) {
            String var3 = (String)var1.get(var2);
            String var4 = "textures/entity/" + var3 + ".png";
            net.yz.m_ var5 = new net.yz.m_(var4);
            if(!z9.Y(var5)) {
               z9.h("Not found: " + var5);
            }

            c(var5);
            ++var2;
         }
      }

   }

   static {
      String[] var10000 = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
