package net.n8;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.xn;
import net.n8.l;
import net.n8.x;

public class j {
   public static final j s = new j(x.l, x.l, x.l, x.l, x.l);
   private final x U;
   private final x i;
   private final x l;
   private final x X;
   private final x c;

   public j(x var1, x var2, x var3, x var4, x var5) {
      this.U = var1;
      this.i = var2;
      this.l = var3;
      this.X = var4;
      this.c = var5;
   }

   public boolean C(double var1, double var3, double var5, double var7, double var9, double var11) {
      float var14 = (float)(var1 - var7);
      float var15 = (float)(var3 - var9);
      l.O();
      float var16 = (float)(var5 - var11);
      return this.U.e(net.u.t.J(var14)) && this.i.e(net.u.t.J(var15)) && this.l.e(net.u.t.J(var16))?(!this.X.g((double)(var14 * var14 + var16 * var16))?false:this.c.g((double)(var14 * var14 + var15 * var15 + var16 * var16))):false;
   }

   public static j u(@Nullable JsonElement var0) {
      if(!var0.isJsonNull()) {
         JsonObject var1 = net.yz.c.V(var0, "distance");
         x var2 = x.G(var1.get("x"));
         x var3 = x.G(var1.get("y"));
         x var4 = x.G(var1.get("z"));
         x var5 = x.G(var1.get("horizontal"));
         x var6 = x.G(var1.get("absolute"));
         return new j(var2, var3, var4, var5, var6);
      } else {
         return s;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
