package net.nv;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import net.no.s1;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class y1 extends h {
   public String k() {
      return "tp";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.tp.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 1) {
         throw new x("commands.tp.usage", new Object[0]);
      } else {
         byte var5 = 0;
         if(var3.length != 2 && var3.length != 4 && var3.length != 6) {
            net.r.h var6 = x(var2);
         }

         net.ne.l var15 = w(var1, var2, var3[0]);
         var5 = 1;
         if(var3.length != 1 && var3.length != 2) {
            if(var3.length < var5 + 3) {
               throw new x("commands.tp.usage", new Object[0]);
            }

            if(var15.hl == null) {
               return;
            }

            boolean var7 = true;
            int var8 = var5 + 1;
            h.o var9 = R(var15.b, var3[var5], true);
            h.o var10 = r(var15.hS, var3[var8++], -4096, 4096, false);
            h.o var11 = R(var15.hr, var3[var8++], true);
            h.o var12 = R((double)var15.hN, var3.length > var8?var3[var8++]:"~", false);
            h.o var13 = R((double)var15.V, var3.length > var8?var3[var8]:"~", false);
            l(var15, var9, var10, var11, var12, var13);
            g(var2, this, "commands.tp.success.coordinates", new Object[]{var15.Q(), Double.valueOf(var9.Z()), Double.valueOf(var10.Z()), Double.valueOf(var11.Z())});
         }

         net.ne.l var16 = w(var1, var2, var3[var3.length - 1]);
         if(var16.hl != var15.hl) {
            throw new t("commands.tp.notSameDimension", new Object[0]);
         } else {
            var15.O();
            if(var15 instanceof net.r.h) {
               ((net.r.h)var15).t1.k(var16.b, var16.hS, var16.hr, var16.hN, var16.V);
            }

            var15.S(var16.b, var16.hS, var16.hr, var16.hN, var16.V);
            g(var2, this, "commands.tp.success", new Object[]{var15.Q(), var16.Q()});
         }
      }
   }

   private static void l(net.ne.l var0, h.o var1, h.o var2, h.o var3, h.o var4, h.o var5) {
      if(var0 instanceof net.r.h) {
         EnumSet var6 = EnumSet.noneOf(s1.c.class);
         if(var1.y()) {
            var6.add(s1.c.X);
         }

         if(var2.y()) {
            var6.add(s1.c.Y);
         }

         if(var3.y()) {
            var6.add(s1.c.Z);
         }

         if(var5.y()) {
            var6.add(s1.c.X_ROT);
         }

         if(var4.y()) {
            var6.add(s1.c.Y_ROT);
         }

         float var7 = (float)var4.j();
         if(!var4.y()) {
            var7 = net.u.t.k(var7);
         }

         float var8 = (float)var5.j();
         if(!var5.y()) {
            var8 = net.u.t.k(var8);
         }

         var0.O();
         ((net.r.h)var0).t1.G(var1.j(), var2.j(), var3.j(), var7, var8, var6);
         var0.A(var7);
      } else {
         float var9 = (float)net.u.t.p(var4.Z());
         float var10 = (float)net.u.t.p(var5.Z());
         var10 = net.u.t.T(var10, -90.0F, 90.0F);
         var0.S(var1.Z(), var2.Z(), var3.Z(), var9, var10);
         var0.A(var9);
      }

      if(!(var0 instanceof net.ne.a) || !((net.ne.a)var0).I()) {
         var0.K = 0.0D;
         var0.k = true;
      }

   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length != 1 && var3.length != 2?Collections.emptyList():D(var3, var1.k());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
