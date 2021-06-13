package net.ym;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.xn;
import net.ym.c;
import net.ym.t;
import org.lwjgl.util.vector.Quaternion;

public class s {
   public static final s w = new s();
   public static float F;
   public static float m;
   public static float Q;
   public static float z;
   public static float i;
   public static float a;
   public static float o;
   public static float T;
   public static float I;
   public final c V;
   public final c W;
   public final c b;
   public final c U;
   public final c R;
   public final c H;
   public final c Z;
   public final c g;

   private s() {
      this(c.y, c.y, c.y, c.y, c.y, c.y, c.y, c.y);
   }

   public s(s var1) {
      this.V = var1.V;
      this.W = var1.W;
      this.b = var1.b;
      this.U = var1.U;
      this.R = var1.R;
      this.H = var1.H;
      this.Z = var1.Z;
      this.g = var1.g;
   }

   public s(c var1, c var2, c var3, c var4, c var5, c var6, c var7, c var8) {
      this.V = var1;
      this.W = var2;
      this.b = var3;
      this.U = var4;
      this.R = var5;
      this.H = var6;
      this.Z = var7;
      this.g = var8;
   }

   public void q(s.r var1) {
      r(this.v(var1), false);
   }

   public static void r(c var0, boolean var1) {
      int var2 = t.v();
      if(var0 != c.y) {
         int var3 = var1?-1:1;
         net.y.d.O((float)var3 * (F + var0.Q.x), m + var0.Q.y, Q + var0.Q.z);
         float var4 = z + var0.X.x;
         float var5 = i + var0.X.y;
         float var6 = a + var0.X.z;
         var5 = -var5;
         var6 = -var6;
         net.y.d.r(N(var4, var5, var6));
         net.y.d.W(o + var0.N.x, T + var0.N.y, I + var0.N.z);
      }

   }

   private static Quaternion N(float var0, float var1, float var2) {
      float var3 = var0 * 0.017453292F;
      float var4 = var1 * 0.017453292F;
      float var5 = var2 * 0.017453292F;
      float var6 = net.u.t.A(0.5F * var3);
      float var7 = net.u.t.m(0.5F * var3);
      float var8 = net.u.t.A(0.5F * var4);
      float var9 = net.u.t.m(0.5F * var4);
      float var10 = net.u.t.A(0.5F * var5);
      float var11 = net.u.t.m(0.5F * var5);
      return new Quaternion(var6 * var9 * var11 + var7 * var8 * var10, var7 * var8 * var11 - var6 * var9 * var10, var6 * var8 * var11 + var7 * var9 * var10, var7 * var9 * var11 - var6 * var8 * var10);
   }

   public c v(s.r var1) {
      switch(null.A[var1.ordinal()]) {
      case 1:
         return this.V;
      case 2:
         return this.W;
      case 3:
         return this.b;
      case 4:
         return this.U;
      case 5:
         return this.R;
      case 6:
         return this.H;
      case 7:
         return this.Z;
      case 8:
         return this.g;
      default:
         return c.y;
      }
   }

   public boolean E(s.r var1) {
      return this.v(var1) != c.y;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum r {
      NONE,
      THIRD_PERSON_LEFT_HAND,
      THIRD_PERSON_RIGHT_HAND,
      FIRST_PERSON_LEFT_HAND,
      FIRST_PERSON_RIGHT_HAND,
      HEAD,
      GUI,
      GROUND,
      FIXED;
   }

   static class w implements JsonDeserializer {
      public s l(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         int var10000 = t.v();
         JsonObject var5 = var1.getAsJsonObject();
         int var4 = var10000;
         c var6 = this.n(var3, var5, "thirdperson_righthand");
         c var7 = this.n(var3, var5, "thirdperson_lefthand");
         if(var7 == c.y) {
            var7 = var6;
         }

         c var8 = this.n(var3, var5, "firstperson_righthand");
         c var9 = this.n(var3, var5, "firstperson_lefthand");
         if(var9 == c.y) {
            var9 = var8;
         }

         c var10 = this.n(var3, var5, "head");
         c var11 = this.n(var3, var5, "gui");
         c var12 = this.n(var3, var5, "ground");
         c var13 = this.n(var3, var5, "fixed");
         s var15 = new s(var7, var6, var9, var8, var10, var11, var12, var13);
         if(net.u.d.y() == null) {
            ++var4;
            t.H(var4);
         }

         return var15;
      }

      private c n(JsonDeserializationContext var1, JsonObject var2, String var3) {
         int var4 = t.V();
         return var2.has(var3)?(c)var1.deserialize(var2.get(var3), c.class):c.y;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
