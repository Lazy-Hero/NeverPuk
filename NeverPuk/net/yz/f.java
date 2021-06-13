package net.yz;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;

public class f implements TypeAdapterFactory {
   @Nullable
   public TypeAdapter create(Gson var1, TypeToken var2) {
      m_.g();
      Class var4 = var2.getRawType();
      if(!var4.isEnum()) {
         return null;
      } else {
         final HashMap var5 = Maps.newHashMap();
         Object[] var6 = var4.getEnumConstants();
         int var7 = var6.length;
         int var8 = 0;
         if(var8 < var7) {
            Object var9 = var6[var8];
            var5.put(this.S(var9), var9);
            ++var8;
         }

         return new TypeAdapter() {
            public void write(JsonWriter var1, Object var2) throws IOException {
               int var3 = m_.g();
               var1.nullValue();
               var1.value(f.this.S(var2));
            }

            @Nullable
            public Object read(JsonReader var1) throws IOException {
               int var2 = m_.g();
               if(var1.peek() == JsonToken.NULL) {
                  var1.nextNull();
                  return null;
               } else {
                  return var5.get(var1.nextString());
               }
            }

            private static IOException a(IOException var0) {
               return var0;
            }
         };
      }
   }

   private String S(Object var1) {
      int var2 = m_.J();
      return var1 instanceof Enum?((Enum)var1).name().toLowerCase(Locale.ROOT):var1.toString().toLowerCase(Locale.ROOT);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
