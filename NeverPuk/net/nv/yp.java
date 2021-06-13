package net.nv;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class yp extends h {
   public String k() {
      return "stats";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.stats.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 1) {
         throw new x("commands.stats.usage", new Object[0]);
      } else {
         if("entity".equals(var3[0])) {
            boolean var5 = false;
         }

         if(!"block".equals(var3[0])) {
            throw new x("commands.stats.usage", new Object[0]);
         } else {
            boolean var13 = true;
            if(var3.length < 5) {
               throw new x("commands.stats.block.usage", new Object[0]);
            } else {
               int var6 = 4;
               if(var3.length < 3) {
                  throw new x("commands.stats.entity.usage", new Object[0]);
               } else {
                  var6 = 2;
                  String var7 = var3[var6++];
                  if("set".equals(var7)) {
                     if(var3.length < var6 + 3) {
                        if(var6 == 5) {
                           throw new x("commands.stats.block.set.usage", new Object[0]);
                        }

                        throw new x("commands.stats.entity.set.usage", new Object[0]);
                     }
                  } else {
                     if(!"clear".equals(var7)) {
                        throw new x("commands.stats.usage", new Object[0]);
                     }

                     if(var3.length < var6 + 1) {
                        if(var6 == 5) {
                           throw new x("commands.stats.block.clear.usage", new Object[0]);
                        }

                        throw new x("commands.stats.entity.clear.usage", new Object[0]);
                     }
                  }

                  l.p var8 = l.p.B(var3[var6++]);
                  throw new t("commands.stats.failed", new Object[0]);
               }
            }
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"entity", "block"}):(var3.length == 2 && "entity".equals(var3[0])?D(var3, var1.k()):(var3.length >= 2 && var3.length <= 4 && "block".equals(var3[0])?h(var3, 1, var4):((var3.length != 3 || !"entity".equals(var3[0])) && (var3.length != 5 || !"block".equals(var3[0]))?((var3.length != 4 || !"entity".equals(var3[0])) && (var3.length != 6 || !"block".equals(var3[0]))?(var3.length == 6 && "entity".equals(var3[0]) || var3.length == 8 && "block".equals(var3[0])?o(var3, this.F(var1)):Collections.emptyList()):D(var3, l.p.Z())):D(var3, new String[]{"set", "clear"}))));
   }

   protected List F(net.nx.f var1) {
      Collection var2 = var1.n(0).J().q();
      ArrayList var3 = Lists.newArrayList();

      for(net.nc.l var5 : var2) {
         if(!var5.v().B()) {
            var3.add(var5.e());
         }
      }

      return var3;
   }

   public boolean T(String[] var1, int var2) {
      return var1.length > 0 && "entity".equals(var1[0]) && var2 == 1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
