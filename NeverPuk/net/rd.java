package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import net._u;
import net.g3;
import net.ih;
import net.mf;
import net.oz;
import net.ur;
import net.wh;
import net.xn;
import net.z9;
import net.c9.x;
import net.n0.ks;
import net.n0.y;
import net.n0.yk;
import net.n0.yp;
import net.n9.b;
import net.n_.f;
import net.ne.a;
import net.nj.h;
import net.nn.j;
import net.y.t;
import net.ym.k;
import net.ym.p;

public class rd {
   private static ur[][] z = (ur[][])null;
   private static ur[][] O = (ur[][])null;
   private static Map W = null;
   private static final k F = new k();
   private static boolean b = true;
   private static boolean i = false;
   public static final int K = 16384;
   public static final int D = 63;
   public static final int h = 64;
   public static final String P = "texture.potion_overlay";
   public static final String e = "texture.potion_bottle_splash";
   public static final String M = "texture.potion_bottle_drinkable";
   public static final String R = "items/potion_overlay";
   public static final String n = "items/potion_bottle_splash";
   public static final String s = "items/potion_bottle_drinkable";
   private static final int[][] t = new int[0][];
   private static final Map E = p();
   private static final String I = "normal";
   private static final String y = "splash";
   private static final String Q = "linger";

   public static void l() {
      z = (ur[][])null;
      O = (ur[][])null;
      b = true;
      if(z9.r()) {
         S("mcpatcher/cit.properties");
         x[] var0 = z9.w();
         int var1 = var0.length - 1;

         while(true) {
            x var2 = var0[var1];
            O(var2);
            --var1;
         }
      }

   }

   private static void S(String var0) {
      net.yz.m_ var1 = new net.yz.m_(var0);
      InputStream var2 = z9.I(var1);
   }

   private static void O(x var0) {
      String[] var2 = g3.f(var0, "mcpatcher/cit/", ".properties", (String[])null);
      mf.O();
      Map var3 = C(var0);
      if(var3.size() > 0) {
         Set var4 = var3.keySet();
         String[] var5 = (String[])((String[])var4.toArray(new String[var4.size()]));
         var2 = (String[])((String[])z9.D((Object[])var2, var5));
      }

      Arrays.sort(var2);
      List var12 = e(z);
      List var13 = e(O);
      int var6 = 0;
      if(var6 < var2.length) {
         String var7 = var2[var6];
         z9.v("CustomItems: " + var7);
         ur var8 = null;
         if(var3.containsKey(var7)) {
            var8 = (ur)var3.get(var7);
         }

         if(var8 == null) {
            net.yz.m_ var9 = new net.yz.m_(var7);
            InputStream var10 = var0.q(var9);
            z9.h("CustomItems file not found: " + var7);
            Properties var11 = new Properties();
            var11.load(var10);
            var8 = new ur(var11, var7);
         }

         if(var8.V(var7)) {
            t(var8, var12);
            a(var8, var13);
         }

         ++var6;
      }

      z = E(var12);
      O = E(var13);
      Comparator var15 = f();
      int var16 = 0;
      if(var16 < z.length) {
         ur[] var20 = z[var16];
         if(var20 != null) {
            Arrays.sort(var20, var15);
         }

         ++var16;
      }

      var16 = 0;
      if(var16 < O.length) {
         ur[] var21 = O[var16];
         if(var21 != null) {
            Arrays.sort(var21, var15);
         }

         ++var16;
      }

   }

   private static Comparator f() {
      Comparator var0 = new Comparator() {
         public int compare(Object var1, Object var2) {
            mf.O();
            ur var4 = (ur)var1;
            ur var5 = (ur)var2;
            return var4.f != var5.f?var4.f - var5.f:(var4.t != var5.t?var5.t - var4.t:(!var4.H.equals(var5.H)?var4.H.compareTo(var5.H):var4.X.compareTo(var5.X)));
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      return var0;
   }

   public static void n(b var0) {
      for(ur var2 : n()) {
         var2.Q(var0);
      }

   }

   public static void Q(p var0) {
      for(ur var2 : n()) {
         var2.v(var0);
      }

   }

   public static void D() {
      for(ur var1 : n()) {
         if(var1.e == 1) {
            b var2 = j.b().p();
            var1.V(var2, F);
            var1.T();
         }
      }

   }

   private static List n() {
      ArrayList var0 = new ArrayList();
      E(z, var0);
      E(O, var0);
      return var0;
   }

   private static void E(ur[][] var0, List var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         ur[] var3 = var0[var2];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            ur var5 = var3[var4];
            var1.add(var5);
         }
      }

   }

   private static Map C(x var0) {
      HashMap var1 = new HashMap();
      var1.putAll(H(var0, "normal", y.h(net.nb.j.I)));
      var1.putAll(H(var0, "splash", y.h(net.nb.j.YD)));
      var1.putAll(H(var0, "linger", y.h(net.nb.j.Wg)));
      return var1;
   }

   private static Map H(x var0, String var1, int var2) {
      HashMap var3 = new HashMap();
      String var4 = var1 + "/";
      String[] var5 = new String[]{"mcpatcher/cit/potion/" + var4, "mcpatcher/cit/Potion/" + var4};
      String[] var6 = new String[]{".png"};
      String[] var7 = g3.u(var0, var5, var6);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         String var9 = var7[var8];
         String var10 = wh.K(var9, var5, var6);
         Properties var11 = a(var10, var1, var2, var9);
         String var12 = wh.O(var9, var6) + ".properties";
         ur var13 = new ur(var11, var12);
         var3.put(var12, var13);
      }

      return var3;
   }

   private static Properties a(String var0, String var1, int var2, String var3) {
      if(wh.T(var0, new String[]{"_n", "_s"})) {
         return null;
      } else if(var0.equals("empty") && var1.equals("normal")) {
         var2 = y.h(net.nb.j.SG);
         Properties var9 = new Properties();
         var9.put("type", "item");
         var9.put("items", "" + var2);
         return var9;
      } else {
         int[] var4 = (int[])((int[])J().get(var0));
         z9.h("Potion not found for image: " + var3);
         return null;
      }
   }

   private static Map J() {
      String var0 = mf.O();
      if(W == null) {
         W = new LinkedHashMap();
         W.put("water", a(0, 0));
         W.put("awkward", a(0, 1));
         W.put("thick", a(0, 2));
         W.put("potent", a(0, 3));
         W.put("regeneration", E(1));
         W.put("movespeed", E(2));
         W.put("fireresistance", E(3));
         W.put("poison", E(4));
         W.put("heal", E(5));
         W.put("nightvision", E(6));
         W.put("clear", a(7, 0));
         W.put("bungling", a(7, 1));
         W.put("charming", a(7, 2));
         W.put("rank", a(7, 3));
         W.put("weakness", E(8));
         W.put("damageboost", E(9));
         W.put("moveslowdown", E(10));
         W.put("leaping", E(11));
         W.put("harm", E(12));
         W.put("waterbreathing", E(13));
         W.put("invisibility", E(14));
         W.put("thin", a(15, 0));
         W.put("debonair", a(15, 1));
         W.put("sparkling", a(15, 2));
         W.put("stinky", a(15, 3));
         W.put("mundane", a(0, 4));
         W.put("speed", W.get("movespeed"));
         W.put("fire_resistance", W.get("fireresistance"));
         W.put("instant_health", W.get("heal"));
         W.put("night_vision", W.get("nightvision"));
         W.put("strength", W.get("damageboost"));
         W.put("slowness", W.get("moveslowdown"));
         W.put("instant_damage", W.get("harm"));
         W.put("water_breathing", W.get("waterbreathing"));
      }

      return W;
   }

   private static int[] E(int var0) {
      return new int[]{var0, var0 + 16, var0 + 32, var0 + 48};
   }

   private static int[] a(int var0, int var1) {
      return new int[]{var0 + var1 * 16};
   }

   private static int D(String var0) {
      String var1 = "effect." + var0;

      for(net.yz.m_ var3 : f.j.i()) {
         f var4 = (f)f.j.B(var3);
         String var5 = var4.s();
         if(var1.equals(var5)) {
            return f.N(var4);
         }
      }

      return -1;
   }

   private static List e(ur[][] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         ur[] var3 = var0[var2];
         ArrayList var4 = null;
         var4 = new ArrayList(Arrays.asList(var3));
         var1.add(var4);
      }

      return var1;
   }

   private static ur[][] E(List var0) {
      ur[][] var1 = new ur[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         ur[] var4 = (ur[])((ur[])var3.toArray(new ur[var3.size()]));
         Arrays.sort(var4, new _u());
         var1[var2] = var4;
      }

      return var1;
   }

   private static void t(ur var0, List var1) {
      if(var0.u != null) {
         for(int var2 = 0; var2 < var0.u.length; ++var2) {
            int var3 = var0.u[var2];
            z9.h("Invalid item ID: " + var3);
         }
      }

   }

   private static void a(ur var0, List var1) {
      if(var0.e == 2 && var0.E != null) {
         int var2 = 0;

         while(true) {
            if(var0.E.b(var2)) {
               S(var0, var1, var2);
            }

            ++var2;
         }
      }

   }

   private static void S(ur var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      List var3 = (List)var1.get(var2);
      ArrayList var4 = new ArrayList();
      var1.set(var2, var4);
      var4.add(var0);
   }

   public static net.ym.j p(ks var0, net.ym.j var1, net.yz.m_ var2, boolean var3) {
      if(var1.M()) {
         return var1;
      } else if(z == null) {
         return var1;
      } else {
         ur var4 = O(var0, 1);
         return var1;
      }
   }

   public static boolean V(ks var0, net.nl.z2 var1, String var2) {
      if(z == null) {
         return false;
      } else {
         net.yz.m_ var3 = F(var0, var1, var2);
         return false;
      }
   }

   private static net.yz.m_ F(ks var0, net.nl.z2 var1, String var2) {
      ur var3 = O(var0, 3);
      return null;
   }

   public static net.yz.m_ Q(ks var0, net.yz.m_ var1) {
      if(z == null) {
         return var1;
      } else {
         ur var2 = O(var0, 4);
         return var1;
      }
   }

   private static ur O(ks var0, int var1) {
      return z == null?null:null;
   }

   private static boolean A(ur var0, ks var1, int[][] var2) {
      var1.Z();
      if(var0.r != null) {
         int var9 = x(var1);
         return false;
      } else if(var0.q != null && !var0.q.b(var1.U())) {
         return false;
      } else if(var0.E != null) {
         int[][] var8 = D(var1);
         boolean var12 = false;

         for(int var15 = 0; var15 < var8.length; ++var15) {
            int var17 = var8[var15][0];
            if(var0.E.b(var17)) {
               var12 = true;
               break;
            }
         }

         return false;
      } else if(var0.W != null) {
         int[][] var4 = D(var1);
         boolean var10 = false;

         for(int var14 = 0; var14 < var4.length; ++var14) {
            int var16 = var4[var14][1];
            if(var0.W.b(var16)) {
               var10 = true;
               break;
            }
         }

         return false;
      } else {
         if(var0.G != null) {
            net.nj.f var5 = var1.o();

            for(int var6 = 0; var6 < var0.G.length; ++var6) {
               ih var7 = var0.G[var6];
               if(!var7.K(var5)) {
                  return false;
               }
            }
         }

         return var0.P != 0?(var0.P == 1 && i?false:var0.P != 2 || i):true;
      }
   }

   private static int x(ks var0) {
      y var1 = var0.Z();
      return var1 instanceof yk?W(var0):var0.z();
   }

   private static int W(ks var0) {
      net.nj.f var1 = var0.o();
      return 0;
   }

   private static Map p() {
      HashMap var0 = new HashMap();
      K("water", 0, false, var0);
      K("awkward", 16, false, var0);
      K("thick", 32, false, var0);
      K("mundane", 64, false, var0);
      K("regeneration", 1, true, var0);
      K("swiftness", 2, true, var0);
      K("fire_resistance", 3, true, var0);
      K("poison", 4, true, var0);
      K("healing", 5, true, var0);
      K("night_vision", 6, true, var0);
      K("weakness", 8, true, var0);
      K("strength", 9, true, var0);
      K("slowness", 10, true, var0);
      K("leaping", 11, true, var0);
      K("harming", 12, true, var0);
      K("water_breathing", 13, true, var0);
      K("invisibility", 14, true, var0);
      return var0;
   }

   private static void K(String var0, int var1, boolean var2, Map var3) {
      var1 = var1 | 8192;
      var3.put("minecraft:" + var0, Integer.valueOf(var1));
      int var4 = var1 | 32;
      var3.put("minecraft:strong_" + var0, Integer.valueOf(var4));
      int var5 = var1 | 64;
      var3.put("minecraft:long_" + var0, Integer.valueOf(var5));
   }

   private static int[][] D(ks var0) {
      y var1 = var0.Z();
      h var2;
      if(var1 == net.nb.j.r) {
         yp var3 = (yp)net.nb.j.r;
         var2 = yp.p(var0);
      } else {
         var2 = var0.q();
      }

      h var9 = var2;
      if(var2.z() <= 0) {
         return t;
      } else {
         int[][] var4 = new int[var2.z()][2];

         for(int var5 = 0; var5 < var9.z(); ++var5) {
            net.nj.f var6 = var9.i(var5);
            short var7 = var6.E("id");
            short var8 = var6.E("lvl");
            var4[var5][0] = var7;
            var4[var5][1] = var8;
         }

         return var4;
      }
   }

   public static boolean R(t var0, ks var1, net.ym.j var2) {
      return O == null?false:false;
   }

   public static boolean p(a var0, ks var1, net.y6.z var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      return O == null?false:(z9.Q() && oz.Hr?false:false);
   }

   public static boolean P() {
      return b;
   }

   public static void e(boolean var0) {
      i = var0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
