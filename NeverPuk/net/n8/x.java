package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.xn;
import net.n8.l;

public class x {
   public static final x l = new x((Float)null, (Float)null);
   private final Float u;
   private final Float V;

   public x(@Nullable Float var1, @Nullable Float var2) {
      this.u = var1;
      this.V = var2;
   }

   public boolean e(float var1) {
      return this.u != null && this.u.floatValue() > var1?false:this.V == null || this.V.floatValue() >= var1;
   }

   public boolean g(double var1) {
      return this.u != null && (double)(this.u.floatValue() * this.u.floatValue()) > var1?false:this.V == null || (double)(this.V.floatValue() * this.V.floatValue()) >= var1;
   }

   public static x G(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         if(net.yz.c.i(var0)) {
            float var5 = net.yz.c.T(var0, "value");
            return new x(Float.valueOf(var5), Float.valueOf(var5));
         } else {
            JsonObject var2 = net.yz.c.V(var0, "value");
            Float var3 = var2.has("min")?Float.valueOf(net.yz.c.t(var2, "min")):null;
            Float var4 = var2.has("max")?Float.valueOf(net.yz.c.t(var2, "max")):null;
            return new x(var3, var4);
         }
      } else {
         return l;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
