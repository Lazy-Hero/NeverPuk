package net.yz;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Locale;
import net.xn;
import net.yz.c;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class m_ implements Comparable {
   protected final String j;
   protected final String G;
   private static int v;

   public m_(int var1, String... var2) {
      this.j = StringUtils.isEmpty(var2[0])?"minecraft":var2[0].toLowerCase(Locale.ROOT);
      this.G = var2[1].toLowerCase(Locale.ROOT);
      Validate.notNull(this.G);
   }

   public m_(String var1) {
      this(0, E(var1));
   }

   public m_(String var1, String var2) {
      this(0, new String[]{var1, var2});
   }

   protected static String[] E(String var0) {
      String[] var1 = new String[]{"minecraft", var0};
      int var2 = var0.indexOf(58);
      var1[1] = var0.substring(var2 + 1);
      if(var2 > 1) {
         var1[0] = var0.substring(0, var2);
      }

      return var1;
   }

   public String v() {
      return this.G;
   }

   public String A() {
      return this.j;
   }

   public String toString() {
      return this.j + ':' + this.G;
   }

   public boolean equals(Object var1) {
      int var2 = g();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof m_)) {
         return false;
      } else {
         m_ var3 = (m_)var1;
         return this.j.equals(var3.j) && this.G.equals(var3.G);
      }
   }

   public int hashCode() {
      return 31 * this.j.hashCode() + this.G.hashCode();
   }

   public int v(m_ var1) {
      int var2 = this.j.compareTo(var1.j);
      var2 = this.G.compareTo(var1.G);
      return var2;
   }

   public static void p(int var0) {
      v = var0;
   }

   public static int J() {
      return v;
   }

   public static int g() {
      int var0 = J();
      return 55;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      p(53);
   }

   public static class n implements JsonDeserializer, JsonSerializer {
      public m_ Z(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         return new m_(c.m(var1, "location"));
      }

      public JsonElement A(m_ var1, Type var2, JsonSerializationContext var3) {
         return new JsonPrimitive(var1.toString());
      }
   }
}
