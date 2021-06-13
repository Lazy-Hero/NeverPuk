package net.nv;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.nl.z1;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class yv extends h {
   public String k() {
      return "fill";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.fill.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 7) {
         throw new x("commands.fill.usage", new Object[0]);
      } else {
         var2.n(l.p.AFFECTED_BLOCKS, 0);
         net.u.j var5 = J(var2, var3, 0, false);
         net.u.j var6 = J(var2, var3, 3, false);
         net.y9.l var7 = h.I(var2, var3[6]);
         if(var3.length >= 8) {
            U(var7, var3[7]);
         }

         net.yw.n var8 = var7.p();
         net.u.j var9 = new net.u.j(Math.min(var5.t(), var6.t()), Math.min(var5.h(), var6.h()), Math.min(var5.y(), var6.y()));
         net.u.j var10 = new net.u.j(Math.max(var5.t(), var6.t()), Math.max(var5.h(), var6.h()), Math.max(var5.y(), var6.y()));
         int var11 = (var10.t() - var9.t() + 1) * (var10.h() - var9.h() + 1) * (var10.y() - var9.y() + 1);
         if(var11 > '耀') {
            throw new t("commands.fill.tooManyBlocks", new Object[]{Integer.valueOf(var11), Integer.valueOf('耀')});
         } else if(var9.h() >= 0 && var10.h() < 256) {
            net.yv.r var12 = var2.T();
            int var13 = var9.y();
            if(var13 <= var10.y()) {
               int var14 = var9.t();
               if(var14 <= var10.t()) {
                  if(!var12.o(new net.u.j(var14, var10.h() - var9.h(), var13))) {
                     throw new t("commands.fill.outOfWorld", new Object[0]);
                  }

                  var14 = var14 + 16;
               }

               var13 = var13 + 16;
            }

            new net.nj.f();
            boolean var27 = false;
            if(var3.length >= 10 && var7.W()) {
               String var15 = N(var3, 9);
               net.nj.f var25 = net.nj.g.c(var15);
               var27 = true;
            }

            ArrayList var29 = Lists.newArrayList();
            var11 = 0;
            int var16 = var9.y();
            if(var16 <= var10.y()) {
               int var17 = var9.h();
               if(var17 <= var10.h()) {
                  int var18 = var9.t();
                  if(var18 <= var10.t()) {
                     label528: {
                        net.u.j var19 = new net.u.j(var18, var17, var16);
                        if(var3.length >= 9) {
                           label559: {
                              if(!"outline".equals(var3[8]) && !"hollow".equals(var3[8])) {
                                 if("destroy".equals(var3[8])) {
                                    var12.e(var19, true);
                                 }

                                 if("keep".equals(var3[8]) && var12.y(var19) || !"replace".equals(var3[8]) || var7.W() || var3.length <= 9) {
                                    break label559;
                                 }

                                 net.y9.l var20 = h.I(var2, var3[9]);
                                 if(var12.Z(var19).Q() != var20) {
                                    break label528;
                                 }

                                 if(var3.length > 10 && !"-1".equals(var3[10]) && !"*".equals(var3[10]) && !h.L(var20, var3[10]).apply(var12.Z(var19))) {
                                    ;
                                 }
                              }

                              if(var18 != var9.t() && var18 != var10.t() && var17 != var9.h() && var17 != var10.h() && var16 != var9.y() && var16 != var10.y()) {
                                 if(!"hollow".equals(var3[8])) {
                                    break label528;
                                 }

                                 var12.k(var19, net.nb.f.ou.p(), 2);
                                 var29.add(var19);
                              }
                           }
                        }

                        net.ni.v var36 = var12.L(var19);
                        if(var36 != null && var36 instanceof z1) {
                           ((z1)var36).T();
                        }

                        if(var12.k(var19, var8, 2)) {
                           var29.add(var19);
                           ++var11;
                        }
                     }

                     ++var18;
                  }

                  ++var17;
               }

               ++var16;
            }

            Iterator var31 = var29.iterator();
            if(var31.hasNext()) {
               net.u.j var33 = (net.u.j)var31.next();
               net.y9.l var35 = var12.Z(var33).Q();
               var12.c(var33, var35, false);
            }

            throw new t("commands.fill.failed", new Object[0]);
         } else {
            throw new t("commands.fill.outOfWorld", new Object[0]);
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):(var3.length > 3 && var3.length <= 6?h(var3, 3, var4):(var3.length == 7?o(var3, net.y9.l.m.i()):(var3.length == 9?D(var3, new String[]{"replace", "destroy", "keep", "hollow", "outline"}):(var3.length == 10 && "replace".equals(var3[8])?o(var3, net.y9.l.m.i()):Collections.emptyList()))));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
