package net.c9;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.annotation.Nullable;
import net.c9.b;
import net.c9.q;
import net.yz.m_;
import org.apache.commons.io.IOUtils;

public class g implements q {
   private final Map f = Maps.newHashMap();
   private final String e;
   private final m_ i;
   private final InputStream y;
   private final InputStream B;
   private final net.y3.c K;
   private boolean r;
   private JsonObject X;

   public g(String var1, m_ var2, InputStream var3, InputStream var4, net.y3.c var5) {
      this.e = var1;
      this.i = var2;
      this.y = var3;
      this.B = var4;
      this.K = var5;
   }

   public m_ O() {
      return this.i;
   }

   public InputStream k() {
      return this.y;
   }

   public boolean z() {
      return this.B != null;
   }

   @Nullable
   public net.y3.n S(String var1) {
      int[] var2 = b.K();
      if(!this.z()) {
         return null;
      } else {
         if(this.X == null && !this.r) {
            this.r = true;
            BufferedReader var3 = null;
            var3 = new BufferedReader(new InputStreamReader(this.B, StandardCharsets.UTF_8));
            this.X = (new JsonParser()).parse(var3).getAsJsonObject();
            IOUtils.closeQuietly(var3);
         }

         net.y3.n var6 = (net.y3.n)this.f.get(var1);
         if(var6 == null) {
            var6 = this.K.t(var1, this.X);
         }

         return var6;
      }
   }

   public String A() {
      return this.e;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof g)) {
         return false;
      } else {
         g var2 = (g)var1;
         if(this.i != null) {
            if(!this.i.equals(var2.i)) {
               return false;
            }
         } else if(var2.i != null) {
            return false;
         }

         return this.e != null?this.e.equals(var2.e):var2.e == null;
      }
   }

   public int hashCode() {
      int var1 = this.e != null?this.e.hashCode():0;
      var1 = 31 * var1 + (this.i != null?this.i.hashCode():0);
      return var1;
   }

   public void close() throws IOException {
      this.y.close();
      if(this.B != null) {
         this.B.close();
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
