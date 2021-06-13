package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class r extends h {
   public String k() {
      return "testforblocks";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.compare.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 9) {
         throw new x("commands.compare.usage", new Object[0]);
      } else {
         var2.n(l.p.AFFECTED_BLOCKS, 0);
         net.u.j var5 = J(var2, var3, 0, false);
         net.u.j var6 = J(var2, var3, 3, false);
         net.u.j var7 = J(var2, var3, 6, false);
         net.y4.v var8 = new net.y4.v(var5, var6);
         net.y4.v var9 = new net.y4.v(var7, var7.z(var8.C()));
         int var10 = var8.t() * var8.I() * var8.X();
         if(var10 > 524288) {
            throw new t("commands.compare.tooManyBlocks", new Object[]{Integer.valueOf(var10), Integer.valueOf(524288)});
         } else if(var8.D >= 0 && var8.P < 256 && var9.D >= 0 && var9.P < 256) {
            net.yv.r var11 = var2.T();
            if(var11.z(var8) && var11.z(var9)) {
               if(var3.length > 9 && "masked".equals(var3[9])) {
                  boolean var32 = true;
               } else {
                  boolean var10000 = false;
               }

               var10 = 0;
               net.u.j var13 = new net.u.j(var9.i - var8.i, var9.D - var8.D, var9.p - var8.p);
               net.u.j var14 = new net.u.j();
               net.u.j var15 = new net.u.j();
               int var16 = var8.p;
               if(var16 <= var8.J) {
                  int var17 = var8.D;
                  if(var17 <= var8.P) {
                     int var18 = var8.i;
                     if(var18 <= var8.e) {
                        var14.V(var18, var17, var16);
                        var15.V(var18 + var13.t(), var17 + var13.h(), var16 + var13.y());
                        boolean var19 = false;
                        net.yw.n var20 = var11.Z(var14);
                        if(var20 == var11.Z(var15)) {
                           net.ni.v var21 = var11.L(var14);
                           net.ni.v var22 = var11.L(var15);
                           if(var21 != null && var22 != null) {
                              net.nj.f var23 = var21.b(new net.nj.f());
                              var23.A("x");
                              var23.A("y");
                              var23.A("z");
                              net.nj.f var24 = var22.b(new net.nj.f());
                              var24.A("x");
                              var24.A("y");
                              var24.A("z");
                              if(!var23.equals(var24)) {
                                 var19 = true;
                              }
                           }

                           if(var21 != null) {
                              var19 = true;
                           }
                        }

                        var19 = true;
                        ++var10;
                        throw new t("commands.compare.failed", new Object[0]);
                     }

                     ++var17;
                  }

                  ++var16;
               }

               var2.n(l.p.AFFECTED_BLOCKS, var10);
               g(var2, this, "commands.compare.success", new Object[]{Integer.valueOf(var10)});
            }

            throw new t("commands.compare.outOfWorld", new Object[0]);
         } else {
            throw new t("commands.compare.outOfWorld", new Object[0]);
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):(var3.length > 3 && var3.length <= 6?h(var3, 3, var4):(var3.length > 6 && var3.length <= 9?h(var3, 6, var4):(var3.length == 10?D(var3, new String[]{"masked", "all"}):Collections.emptyList())));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
