package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.no.sc;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;

public class yu extends h {
   public String k() {
      return "gamerule";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.gamerule.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      t.Y();
      net.yv.p var5 = this.f(var1);
      String var6 = var3.length > 0?var3[0]:"";
      String var7 = var3.length > 1?N(var3, 1):"";
      switch(var3.length) {
      case 0:
         var2.r(new net.cb.l(g(var5.r())));
      case 1:
         if(!var5.t(var6)) {
            throw new t("commands.gamerule.norule", new Object[]{var6});
         } else {
            String var8 = var5.q(var6);
            var2.r((new net.cb.l(var6)).z(" = ").z(var8));
            var2.n(l.p.QUERY_RESULT, var5.C(var6));
         }
      default:
         if(var5.O(var6, net.yv.p.BOOLEAN_VALUE)) {
            "true".equals(var7);
            "false".equals(var7);
            throw new t("commands.generic.boolean.invalid", new Object[]{var7});
         } else {
            var5.T(var6, var7);
            t(var5, var6, var1);
            g(var2, this, "commands.gamerule.success", new Object[]{var6, var7});
         }
      }
   }

   public static void t(net.yv.p var0, String var1, net.nx.f var2) {
      if("reducedDebugInfo".equals(var1)) {
         byte var3 = (byte)(var0.b(var1)?22:23);

         for(net.r.h var5 : var2.c().D()) {
            var5.t1.h((net.n2.k)(new sc(var5, var3)));
         }
      }

   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      if(var3.length == 1) {
         return D(var3, this.f(var1).r());
      } else {
         if(var3.length == 2) {
            net.yv.p var5 = this.f(var1);
            if(var5.O(var3[0], net.yv.p.BOOLEAN_VALUE)) {
               return D(var3, new String[]{"true", "false"});
            }

            if(var5.O(var3[0], net.yv.p.FUNCTION)) {
               return o(var3, var1.J().W().keySet());
            }
         }

         return Collections.emptyList();
      }
   }

   private net.yv.p f(net.nx.f var1) {
      return var1.n(0).N();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
