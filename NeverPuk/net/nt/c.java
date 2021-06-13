package net.nt;

import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class c extends net.nv.h {
   public String k() {
      return "tellraw";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.tellraw.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      if(var3.length < 2) {
         throw new net.nv.x("commands.tellraw.usage", new Object[0]);
      } else {
         net.r.h var4 = l(var1, var2, var3[0]);
         String var5 = N(var3, 1);
         net.cb.t var6 = net.cb.t.m(var5);
         var4.r(net.cb.y.x(var2, var6, var4));
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      net.u.d[] var5 = x.O();
      return var3.length == 1?D(var3, var1.k()):Collections.emptyList();
   }

   public boolean T(String[] var1, int var2) {
      net.u.d[] var3 = x.O();
      return var2 == 0;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
