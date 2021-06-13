package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class b extends h {
   public String k() {
      return "blockdata";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.blockdata.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 4) {
         throw new x("commands.blockdata.usage", new Object[0]);
      } else {
         var2.n(l.p.AFFECTED_BLOCKS, 0);
         net.u.j var5 = J(var2, var3, 0, false);
         net.yv.r var6 = var2.T();
         if(!var6.o(var5)) {
            throw new t("commands.blockdata.outOfWorld", new Object[0]);
         } else {
            net.yw.n var7 = var6.Z(var5);
            net.ni.v var8 = var6.L(var5);
            if(var8 == null) {
               throw new t("commands.blockdata.notValid", new Object[0]);
            } else {
               net.nj.f var9 = var8.b(new net.nj.f());
               net.nj.f var10 = var9.F();
               net.nj.f var11 = net.nj.g.c(N(var3, 3));
               var9.I(var11);
               var9.r("x", var5.t());
               var9.r("y", var5.h());
               var9.r("z", var5.y());
               if(var9.equals(var10)) {
                  throw new t("commands.blockdata.failed", new Object[]{var9.toString()});
               } else {
                  var8.G(var9);
                  var8.W();
                  var6.V(var5, var7, var7, 3);
                  var2.n(l.p.AFFECTED_BLOCKS, 1);
                  g(var2, this, "commands.blockdata.success", new Object[]{var9.toString()});
               }
            }
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
