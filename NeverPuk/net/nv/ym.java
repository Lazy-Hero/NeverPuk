package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class ym extends h {
   public String k() {
      return "worldborder";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.worldborder.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 1) {
         throw new x("commands.worldborder.usage", new Object[0]);
      } else {
         net.nz.p var5 = this.E(var1);
         if("set".equals(var3[0])) {
            if(var3.length != 2 && var3.length != 3) {
               throw new x("commands.worldborder.set.usage", new Object[0]);
            }

            double var6 = var5.E();
            double var8 = c(var3[1], 1.0D, 6.0E7D);
            long var10 = var3.length > 2?r(var3[2], 0L, 9223372036854775L) * 1000L:0L;
            long var25;
            int var10000 = (var25 = var10 - 0L) == 0L?0:(var25 < 0L?-1:1);
            var5.h(var8);
            g(var2, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", new Object[]{Double.valueOf(var8)}), String.format("%.1f", new Object[]{Double.valueOf(var6)})});
         }

         if("add".equals(var3[0])) {
            if(var3.length != 2 && var3.length != 3) {
               throw new x("commands.worldborder.add.usage", new Object[0]);
            }

            double var12 = var5.b();
            double var21 = var12 + c(var3[1], -var12, 6.0E7D - var12);
            long var24 = var5.P() + (var3.length > 2?r(var3[2], 0L, 9223372036854775L) * 1000L:0L);
            if(var24 > 0L) {
               var5.n(var12, var21, var24);
               if(var12 > var21) {
                  g(var2, this, "commands.worldborder.setSlowly.shrink.success", new Object[]{String.format("%.1f", new Object[]{Double.valueOf(var21)}), String.format("%.1f", new Object[]{Double.valueOf(var12)}), Long.toString(var24 / 1000L)});
               }

               g(var2, this, "commands.worldborder.setSlowly.grow.success", new Object[]{String.format("%.1f", new Object[]{Double.valueOf(var21)}), String.format("%.1f", new Object[]{Double.valueOf(var12)}), Long.toString(var24 / 1000L)});
            }

            var5.h(var21);
            g(var2, this, "commands.worldborder.set.success", new Object[]{String.format("%.1f", new Object[]{Double.valueOf(var21)}), String.format("%.1f", new Object[]{Double.valueOf(var12)})});
         }

         if("center".equals(var3[0])) {
            if(var3.length != 3) {
               throw new x("commands.worldborder.center.usage", new Object[0]);
            }

            net.u.j var13 = var2.z();
            double var7 = K((double)var13.t() + 0.5D, var3[1], true);
            double var9 = K((double)var13.y() + 0.5D, var3[2], true);
            var5.w(var7, var9);
            g(var2, this, "commands.worldborder.center.success", new Object[]{Double.valueOf(var7), Double.valueOf(var9)});
         }

         if("damage".equals(var3[0])) {
            if(var3.length < 2) {
               throw new x("commands.worldborder.damage.usage", new Object[0]);
            }

            if("buffer".equals(var3[1])) {
               if(var3.length != 3) {
                  throw new x("commands.worldborder.damage.buffer.usage", new Object[0]);
               }

               double var14 = b(var3[2], 0.0D);
               double var22 = var5.C();
               var5.B(var14);
               g(var2, this, "commands.worldborder.damage.buffer.success", new Object[]{String.format("%.1f", new Object[]{Double.valueOf(var14)}), String.format("%.1f", new Object[]{Double.valueOf(var22)})});
            }

            if(!"amount".equals(var3[1])) {
               return;
            }

            if(var3.length != 3) {
               throw new x("commands.worldborder.damage.amount.usage", new Object[0]);
            }

            double var15 = b(var3[2], 0.0D);
            double var23 = var5.t();
            var5.t(var15);
            g(var2, this, "commands.worldborder.damage.amount.success", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var15)}), String.format("%.2f", new Object[]{Double.valueOf(var23)})});
         }

         if("warning".equals(var3[0])) {
            if(var3.length < 2) {
               throw new x("commands.worldborder.warning.usage", new Object[0]);
            }

            if("time".equals(var3[1])) {
               if(var3.length != 3) {
                  throw new x("commands.worldborder.warning.time.usage", new Object[0]);
               }

               int var16 = h(var3[2], 0);
               int var19 = var5.N();
               var5.D(var16);
               g(var2, this, "commands.worldborder.warning.time.success", new Object[]{Integer.valueOf(var16), Integer.valueOf(var19)});
            }

            if(!"distance".equals(var3[1])) {
               return;
            }

            if(var3.length != 3) {
               throw new x("commands.worldborder.warning.distance.usage", new Object[0]);
            }

            int var17 = h(var3[2], 0);
            int var20 = var5.l();
            var5.H(var17);
            g(var2, this, "commands.worldborder.warning.distance.success", new Object[]{Integer.valueOf(var17), Integer.valueOf(var20)});
         }

         if(!"get".equals(var3[0])) {
            throw new x("commands.worldborder.usage", new Object[0]);
         } else {
            double var18 = var5.b();
            var2.n(l.p.QUERY_RESULT, net.u.t.L(var18 + 0.5D));
            var2.r(new net.cb.h("commands.worldborder.get.success", new Object[]{String.format("%.0f", new Object[]{Double.valueOf(var18)})}));
         }
      }
   }

   protected net.nz.p E(net.nx.f var1) {
      return var1.w1[0].T();
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"set", "center", "damage", "warning", "add", "get"}):(var3.length == 2 && "damage".equals(var3[0])?D(var3, new String[]{"buffer", "amount"}):(var3.length >= 2 && var3.length <= 3 && "center".equals(var3[0])?n(var3, 1, var4):(var3.length == 2 && "warning".equals(var3[0])?D(var3, new String[]{"time", "distance"}):Collections.emptyList())));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
