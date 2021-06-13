package net;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import net.dj;
import net.mf;
import net.z9;
import net.n9.b;
import net.nb.f;
import net.y9.l;
import net.ym.j;
import net.yw.n;
import net.yz.aq;

public class x3 {
   private static boolean O = true;
   private static boolean W = true;
   private static boolean y = true;
   private static boolean f = true;
   private static boolean t = true;
   private static boolean N = true;
   private static boolean v = true;
   private static boolean B = false;
   private static net.n9.v L = null;
   private static net.n9.v K = null;
   private static net.n9.v a = null;
   private static net.n9.v Y = null;
   private static net.n9.v m = null;
   private static net.n9.v u = null;
   private static boolean F = false;
   private static j R = null;
   private static j Q = null;
   private static j j = null;
   private static j E = null;
   private static j Z = null;
   private static j U = null;
   private static boolean e = false;
   private static final String M = "blocks/grass_top";
   private static final String V = "blocks/grass_side";
   private static final String k = "blocks/grass_path_top";
   private static final String X = "blocks/mycelium_top";
   private static final String b = "blocks/dirt_podzol_top";
   private static final String h = "blocks/snow";

   public static void i(b var0) {
      F = false;
      e = false;
      H(var0);
   }

   public static void g() {
      if(F) {
         R = dj.B(L, 0);
         if(B) {
            j var0 = dj.B(K, -1);
            R = dj.b(var0, R);
         }

         net.n9.v var1 = z9.h().f(new net.yz.m_("blocks/grass_path_side"));
         Q = dj.G("grass_path", var1, a);
         j = dj.B(a, -1);
         E = dj.B(Y, -1);
         Z = dj.B(m, 0);
         U = dj.B(u, -1);
         e = true;
      }

   }

   private static void H(b var0) {
      mf.O();
      O = true;
      W = true;
      y = true;
      f = true;
      t = true;
      N = true;
      v = true;
      L = var0.f(new net.yz.m_("blocks/grass_top"));
      K = var0.f(new net.yz.m_("blocks/grass_side"));
      a = var0.f(new net.yz.m_("blocks/grass_path_top"));
      Y = var0.f(new net.yz.m_("blocks/mycelium_top"));
      m = var0.f(new net.yz.m_("blocks/dirt_podzol_top"));
      u = var0.f(new net.yz.m_("blocks/snow"));
      F = true;
      String var2 = "optifine/bettergrass.properties";
      net.yz.m_ var3 = new net.yz.m_(var2);
      if(z9.Y(var3)) {
         InputStream var4 = z9.I(var3);
      }
   }

   private static net.n9.v Y(Properties var0, String var1, String var2, b var3) {
      String var4 = var0.getProperty(var1);
      var4 = var2;
      net.yz.m_ var5 = new net.yz.m_("textures/" + var2 + ".png");
      if(!z9.Y(var5)) {
         z9.h("BetterGrass texture not found: " + var5);
         var4 = var2;
      }

      net.yz.m_ var6 = new net.yz.m_(var4);
      net.n9.v var7 = var3.f(var6);
      return var7;
   }

   public static List g(net.yv.o8 var0, n var1, net.u.j var2, aq var3, List var4) {
      if(var3 != aq.UP && var3 != aq.DOWN) {
         if(!e) {
            return var4;
         } else {
            l var5 = var1.Q();
            return var5 instanceof net.y9.gv?B(var0, var1, var2, var3, var4):(var5 instanceof net.y9.ry?Q(var0, var1, var2, var3, var4):(var5 instanceof net.y9.rv?A(var0, var1, var2, var3, var4):(var5 instanceof net.y9.rs?h(var0, var1, var2, var3, var4):var4)));
         }
      } else {
         return var4;
      }
   }

   private static List B(net.yv.o8 var0, n var1, net.u.j var2, aq var3, List var4) {
      l var5 = var0.Z(var2.h()).Q();
      boolean var6 = var5 == f.V || var5 == f.Tl;
      if(z9.B()) {
         if(N && O(var2, var3, var0) == f.Tl) {
            return U.h(var1, var3, 0L);
         }
      } else if(N) {
         return U.h(var1, var3, 0L);
      }

      return var4;
   }

   private static List Q(net.yv.o8 var0, n var1, net.u.j var2, aq var3, List var4) {
      return !W?var4:(z9.B()?(O(var2.b(), var3, var0) == f.A?Q.h(var1, var3, 0L):var4):Q.h(var1, var3, 0L));
   }

   private static List A(net.yv.o8 var0, n var1, net.u.j var2, aq var3, List var4) {
      l var5 = O(var2, aq.UP, var0);
      if(var1.i(net.y9.rv.l) != net.y9.rv.PODZOL) {
         return var5 != f.A?var4:(W && O(var2, var3, var0) == f.A?j.h(var1, var3, 0L):var4);
      } else {
         boolean var6 = var5 == f.V || var5 == f.Tl;
         if(z9.B()) {
            if(v && O(var2, var3, var0) == f.Tl) {
               return U.h(var1, var3, 0L);
            }
         } else if(v) {
            return U.h(var1, var3, 0L);
         }

         return var4;
      }
   }

   private static List h(net.yv.o8 var0, n var1, net.u.j var2, aq var3, List var4) {
      l var5 = var0.Z(var2.h()).Q();
      boolean var6 = var5 == f.V || var5 == f.Tl;
      if(z9.B()) {
         if(t && O(var2, var3, var0) == f.Tl) {
            return U.h(var1, var3, 0L);
         }
      } else if(t) {
         return U.h(var1, var3, 0L);
      }

      return var4;
   }

   private static l O(net.u.j var0, aq var1, net.yv.o8 var2) {
      net.u.j var3 = var0.C(var1);
      l var4 = var2.Z(var3).Q();
      return var4;
   }

   private static boolean G(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
