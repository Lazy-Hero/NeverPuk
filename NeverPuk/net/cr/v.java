package net.cr;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Iterator;
import net.cr.j;
import net.cr.l;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;

public class v implements s {
   private final ks Q;
   private final net.yz.w G;
   private final String a;

   public v(String var1, ks var2, net.yz.w var3) {
      this.a = var1;
      this.Q = var2;
      this.G = var3;
   }

   public String X() {
      return this.a;
   }

   public ks E() {
      return this.Q;
   }

   public net.yz.w p() {
      return this.G;
   }

   public net.yz.w K(ze var1) {
      net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ks var4 = var1.A(var3);
         if(var4.Z().U()) {
            var2.set(var3, new ks(var4.Z().y()));
         }
      }

      return var2;
   }

   public boolean c(ze var1, net.yv.r var2) {
      j.Y();
      ArrayList var4 = Lists.newArrayList(this.G);
      int var5 = 0;
      if(var5 < var1.X()) {
         int var6 = 0;
         if(var6 < var1.Q()) {
            ks var7 = var1.P(var6, var5);
            if(!var7.B()) {
               boolean var8 = false;
               Iterator var9 = var4.iterator();
               if(var9.hasNext()) {
                  l var10 = (l)var9.next();
                  if(var10.j(var7)) {
                     var8 = true;
                     var4.remove(var10);
                  }
               }

               return false;
            }

            ++var6;
         }

         ++var5;
      }

      return var4.isEmpty();
   }

   public ks h(ze var1) {
      return this.Q.s();
   }

   public static v O(JsonObject var0) {
      String var1 = net.yz.c.x(var0, "group", "");
      net.yz.w var2 = A(net.yz.c.P(var0, "ingredients"));
      if(var2.isEmpty()) {
         throw new JsonParseException("No ingredients for shapeless recipe");
      } else if(var2.size() > 9) {
         throw new JsonParseException("Too many ingredients for shapeless recipe");
      } else {
         ks var3 = j.s(net.yz.c.b(var0, "result"), true);
         return new v(var1, var3, var2);
      }
   }

   private static net.yz.w A(JsonArray var0) {
      net.yz.w var1 = net.yz.w.T();

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         l var3 = j.o(var0.get(var2));
         if(var3 != l.r) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public boolean T(int var1, int var2) {
      return var1 * var2 >= this.G.size();
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
