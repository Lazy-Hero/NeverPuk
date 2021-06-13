package net.cb;

import java.util.Iterator;
import java.util.List;
import net.cb.f;
import net.cb.g;
import net.cb.h;
import net.cb.k;
import net.cb.l;
import net.cb.p;
import net.cb.q;
import net.cb.t;
import net.nv.m;
import net.r.r;

public class y {
   public static t x(net.nv.f var0, t var1, net.ne.l var2) throws net.nv.t {
      String[] var3 = k.B();
      if(var1 instanceof g) {
         g var5 = (g)var1;
         String var6 = var5.P();
         if(m.q(var6)) {
            List var7 = m.F(var0, var6, net.ne.l.class);
            if(var7.size() != 1) {
               throw new net.nv.p("commands.generic.selector.notFound", new Object[]{var6});
            }

            net.ne.l var8 = (net.ne.l)var7.get(0);
            if(var8 instanceof r) {
               var6 = var8.Q();
            }

            var6 = var8.r();
         }

         String var18 = var6.equals("*")?var2.Q():var6;
         g var4 = new g(var18, var5.S());
         ((g)var4).s(var5.Y());
         ((g)var4).P(var0);
      }

      if(var1 instanceof p) {
         String var11 = ((p)var1).o();
         t var9 = m.f(var0, var11);
         new l("");
      }

      if(var1 instanceof l) {
         new l(((l)var1).N());
      }

      if(var1 instanceof q) {
         new q(((q)var1).W());
      }

      if(!(var1 instanceof h)) {
         return var1;
      } else {
         Object[] var12 = ((h)var1).S();
         int var15 = 0;
         if(var15 < var12.length) {
            Object var19 = var12[var15];
            if(var19 instanceof t) {
               var12[var15] = x(var0, (t)var19, var2);
            }

            ++var15;
         }

         h var10 = new h(((h)var1).X(), var12);
         f var13 = var1.E();
         var10.r(var13.A());
         Iterator var17 = var1.I().iterator();
         if(var17.hasNext()) {
            t var20 = (t)var17.next();
            var10.h(x(var0, var20, var2));
         }

         return var10;
      }
   }

   private static net.nv.t a(net.nv.t var0) {
      return var0;
   }
}
