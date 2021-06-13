package net.ym;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.xn;
import net.ym.t;
import org.lwjgl.util.vector.Vector3f;

public class c {
   public static final c y = new c(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
   public final Vector3f X;
   public final Vector3f Q;
   public final Vector3f N;

   public c(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.X = new Vector3f(var1);
      this.Q = new Vector3f(var2);
      this.N = new Vector3f(var3);
   }

   public boolean equals(Object var1) {
      int var2 = t.v();
      if(this == var1) {
         return true;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         c var3 = (c)var1;
         return this.X.equals(var3.X) && this.N.equals(var3.N) && this.Q.equals(var3.Q);
      }
   }

   public int hashCode() {
      int var1 = this.X.hashCode();
      var1 = 31 * var1 + this.Q.hashCode();
      var1 = 31 * var1 + this.N.hashCode();
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class l implements JsonDeserializer {
      private static final Vector3f g = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f V = new Vector3f(0.0F, 0.0F, 0.0F);
      private static final Vector3f j = new Vector3f(1.0F, 1.0F, 1.0F);

      public c a(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var5 = var1.getAsJsonObject();
         Vector3f var6 = this.g(var5, "rotation", g);
         Vector3f var7 = this.g(var5, "translation", V);
         var7.scale(0.0625F);
         t.V();
         var7.x = net.u.t.T(var7.x, -5.0F, 5.0F);
         var7.y = net.u.t.T(var7.y, -5.0F, 5.0F);
         var7.z = net.u.t.T(var7.z, -5.0F, 5.0F);
         Vector3f var8 = this.g(var5, "scale", j);
         var8.x = net.u.t.T(var8.x, -4.0F, 4.0F);
         var8.y = net.u.t.T(var8.y, -4.0F, 4.0F);
         var8.z = net.u.t.T(var8.z, -4.0F, 4.0F);
         c var10000 = new c(var6, var7, var8);
         net.u.d.h(new net.u.d[2]);
         return var10000;
      }

      private Vector3f g(JsonObject var1, String var2, Vector3f var3) {
         int var4 = t.V();
         if(!var1.has(var2)) {
            return var3;
         } else {
            JsonArray var5 = net.yz.c.P(var1, var2);
            if(var5.size() != 3) {
               throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var5.size());
            } else {
               float[] var6 = new float[3];
               int var7 = 0;
               int var10001 = var6.length;
               var6[var7] = net.yz.c.T(var5.get(var7), var2 + "[" + var7 + "]");
               ++var7;
               return new Vector3f(var6[0], var6[1], var6[2]);
            }
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
