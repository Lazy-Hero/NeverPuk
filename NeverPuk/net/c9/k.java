package net.c9;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.c9.b;
import net.c9.x;
import net.yz.m_;

public class k implements x {
   private final x m;

   public k(x var1) {
      this.m = var1;
   }

   public InputStream q(m_ var1) throws IOException {
      return this.m.q(this.b(var1));
   }

   private m_ b(m_ var1) {
      b.K();
      String var3 = var1.v();
      if(!"lang/swg_de.lang".equals(var3) && var3.startsWith("lang/") && var3.endsWith(".lang")) {
         int var4 = var3.indexOf(95);
         if(var4 != -1) {
            final String var5 = var3.substring(0, var4 + 1) + var3.substring(var4 + 1, var3.indexOf(46, var4)).toUpperCase() + ".lang";
            return new m_(var1.A(), "") {
               public String v() {
                  return var5;
               }
            };
         }
      }

      return var1;
   }

   public boolean E(m_ var1) {
      return this.m.E(this.b(var1));
   }

   public Set k() {
      return this.m.k();
   }

   @Nullable
   public net.y3.n K(net.y3.c var1, String var2) throws IOException {
      return this.m.K(var1, var2);
   }

   public BufferedImage y() throws IOException {
      return this.m.y();
   }

   public String U() {
      return this.m.U();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
