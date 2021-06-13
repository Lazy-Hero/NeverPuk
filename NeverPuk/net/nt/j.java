package net.nt;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class j extends net.nv.h {
   public List s() {
      return Arrays.asList(new String[]{"w", "msg"});
   }

   public String k() {
      return "tell";
   }

   public int o() {
      return 0;
   }

   public String K(net.nv.f var1) {
      return "commands.message.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 2) {
         throw new net.nv.x("commands.message.usage", new Object[0]);
      } else {
         net.r.h var5 = l(var1, var2, var3[0]);
         if(var5 == var2) {
            throw new net.nv.k("commands.message.sameTarget");
         } else {
            net.cb.t var6 = F(var2, var3, 1, !(var2 instanceof net.r.r));
            net.cb.h var7 = new net.cb.h("commands.message.display.incoming", new Object[]{var2.b(), var6.c()});
            net.cb.h var8 = new net.cb.h("commands.message.display.outgoing", new Object[]{var5.b(), var6.c()});
            var7.E().i(net.cb.z.GRAY).P(Boolean.valueOf(true));
            var8.E().i(net.cb.z.GRAY).P(Boolean.valueOf(true));
            var5.r(var7);
            var2.r(var8);
            if(net.u.d.y() == null) {
               x.d(new net.u.d[3]);
            }

         }
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return D(var3, var1.k());
   }

   public boolean T(String[] var1, int var2) {
      net.u.d[] var3 = x.O();
      return var2 == 0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
