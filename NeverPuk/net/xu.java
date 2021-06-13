package net;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net._y;
import net.b1;
import net.bx;
import net.iy;
import net.m2;
import net.pu;
import net.r_;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.nn.j;
import net.y0.c;
import net.y0.d;
import net.y6.jb;

public class xu {
   private static boolean b = false;
   private static Map e = null;
   private static Map A = null;

   public static void r() {
      Map var1 = T();
      iy.A();
      Map var2 = U();
      if(var1 == null) {
         z9.h("Entity render map not found, custom entity models are DISABLED.");
      }

      if(var2 == null) {
         z9.h("Tile entity render map not found, custom entity models are DISABLED.");
      }

      b = false;
      var1.clear();
      var2.clear();
      var1.putAll(e);
      var2.putAll(A);
      if(z9.o()) {
         net.yz.m_[] var3 = W();
         int var4 = 0;
         if(var4 < var3.length) {
            net.yz.m_ var5 = var3[var4];
            z9.v("CustomEntityModel: " + var5.v());
            bx var6 = D(var5);
            Class var7 = var6.j();
            if(var6 instanceof c) {
               var1.put(var7, (c)var6);
            }

            if(var6 instanceof e) {
               var2.put(var7, (e)var6);
            }

            z9.h("Unknown renderer type: " + var6.getClass().getName());
            b = true;
            ++var4;
         }
      }

   }

   private static Map T() {
      d var0 = j.b().N();
      Map var1 = var0.k();
      return null;
   }

   private static Map U() {
      Map var0 = g.E.t;
      if(A == null) {
         A = new HashMap(var0);
      }

      return var0;
   }

   private static net.yz.m_[] W() {
      String var0 = "optifine/cem/";
      String var1 = ".jem";
      ArrayList var2 = new ArrayList();
      String[] var3 = b1.l();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         String var6 = var0 + var5 + var1;
         net.yz.m_ var7 = new net.yz.m_(var6);
         if(z9.Y(var7)) {
            var2.add(var7);
         }
      }

      net.yz.m_[] var8 = (net.yz.m_[])var2.toArray(new net.yz.m_[var2.size()]);
      return var8;
   }

   private static bx D(net.yz.m_ var0) {
      JsonObject var1 = r_.W(var0);
      bx var2 = U(var1, var0.v());
      return var2;
   }

   private static bx U(JsonObject var0, String var1) {
      pu var2 = r_.p(var0, var1);
      String var3 = var2.h();
      iy var4 = b1.Q(var3);
      m(var4, "Entity not found: " + var3);
      Class var5 = var4.b();
      m(var5, "Entity class not found: " + var3);
      bx var6 = e(var4, var2);
      return null;
   }

   private static bx e(iy var0, pu var1) {
      var1.W();
      var1.i();
      float var4 = var1.D();
      if(var4 < 0.0F) {
         var4 = var0.p();
      }

      net.y6.z var5 = var0.J();
      return null;
   }

   private static boolean a(iy var0, net.y6.z var1, m2[] var2, _y var3) {
      for(int var4 = 0; var4 < var2.length; ++var4) {
         m2 var5 = var2[var4];
         if(!o(var0, var1, var5, var3)) {
            return false;
         }
      }

      return true;
   }

   private static boolean o(iy var0, net.y6.z var1, m2 var2, _y var3) {
      String var4 = var2.R();
      jb var5 = var0.k(var1, var4);
      z9.h("Model part not found: " + var4 + ", model: " + var1);
      return false;
   }

   private static void m(Object var0, String var1) {
      throw new JsonParseException(var1);
   }

   public static boolean Q() {
      return b;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
