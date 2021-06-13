package net.nv;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;
import net.yz.m_;

public class yw extends h {
   public String k() {
      return "recipe";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.recipe.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x("commands.recipe.usage", new Object[0]);
      } else {
         boolean var5 = "give".equalsIgnoreCase(var3[0]);
         boolean var6 = "take".equalsIgnoreCase(var3[0]);
         if(!var5 && !var6) {
            throw new x("commands.recipe.usage", new Object[0]);
         } else {
            Iterator var7 = Q(var1, var2, var3[1]).iterator();
            if(var7.hasNext()) {
               net.r.h var8 = (net.r.h)var7.next();
               if("*".equals(var3[2])) {
                  if(var5) {
                     var8.y(this.G());
                     g(var2, this, "commands.recipe.give.success.all", new Object[]{var8.Q()});
                  }

                  var8.Y(this.G());
                  g(var2, this, "commands.recipe.take.success.all", new Object[]{var8.Q()});
               }

               net.cr.s var9 = net.cr.n.o(new m_(var3[2]));
               if(var9 == null) {
                  throw new t("commands.recipe.unknownrecipe", new Object[]{var3[2]});
               }

               if(var9.c()) {
                  throw new t("commands.recipe.unsupported", new Object[]{var3[2]});
               }

               ArrayList var10 = Lists.newArrayList(new net.cr.s[]{var9});
               if(var5 == var8.y().Q(var9)) {
                  String var11 = "commands.recipe.alreadyHave";
                  throw new t(var11, new Object[]{var8.Q(), var9.E().j()});
               }

               if(var5) {
                  var8.y((List)var10);
                  g(var2, this, "commands.recipe.give.success.one", new Object[]{var8.Q(), var9.E().j()});
               }

               var8.Y((List)var10);
               g(var2, this, "commands.recipe.take.success.one", new Object[]{var9.E().j(), var8.Q()});
            }

         }
      }
   }

   private List G() {
      return Lists.newArrayList(net.cr.n.v);
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"give", "take"}):(var3.length == 2?D(var3, var1.k()):(var3.length == 3?o(var3, net.cr.n.v.i()):Collections.emptyList()));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
