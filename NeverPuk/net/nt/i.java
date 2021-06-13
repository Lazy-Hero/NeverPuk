package net.nt;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import net.no.s1;
import net.nt.x;

public class i extends net.nv.h {
   public String k() {
      return "teleport";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.teleport.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 4) {
         throw new net.nv.x("commands.teleport.usage", new Object[0]);
      } else {
         net.ne.l var5 = w(var1, var2, var3[0]);
         if(var5.hl != null) {
            boolean var10000 = true;
            net.u.r var7 = var2.A();
            int var8 = 1;
            net.nv.h var9 = R(var7.p, var3[var8++], true);
            net.nv.h var10 = r(var7.H, var3[var8++], -4096, 4096, false);
            net.nv.h var11 = R(var7.a, var3[var8++], true);
            net.ne.l var12 = var2.P() == null?var5:var2.P();
            net.nv.h var13 = R(var3.length > var8?(double)var12.hN:(double)var5.hN, var3.length > var8?var3[var8]:"~", false);
            ++var8;
            net.nv.h var14 = R(var3.length > var8?(double)var12.V:(double)var5.V, var3.length > var8?var3[var8]:"~", false);
            i(var5, var9, var10, var11, var13, var14);
            g(var2, this, "commands.teleport.success.coordinates", new Object[]{var5.Q(), Double.valueOf(var9.Z()), Double.valueOf(var10.Z()), Double.valueOf(var11.Z())});
         }

      }
   }

   private static void i(net.ne.l var0, net.nv.h var1, net.nv.h var2, net.nv.h var3, net.nv.h var4, net.nv.h var5) {
      if(var0 instanceof net.r.h) {
         EnumSet var6 = EnumSet.noneOf(s1.c.class);
         float var7 = (float)var4.j();
         if(var4.y()) {
            var6.add(s1.c.Y_ROT);
         } else {
            var7 = net.u.t.k(var7);
         }

         float var8 = (float)var5.j();
         if(var5.y()) {
            var6.add(s1.c.X_ROT);
         } else {
            var8 = net.u.t.k(var8);
         }

         var0.O();
         ((net.r.h)var0).t1.G(var1.Z(), var2.Z(), var3.Z(), var7, var8, var6);
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

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length > 1 && var3.length <= 4?h(var3, 1, var4):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
