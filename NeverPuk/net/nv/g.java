package net.nv;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import net.nl.z1;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class g extends h {
   public String k() {
      return "clone";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.clone.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 9) {
         throw new x("commands.clone.usage", new Object[0]);
      } else {
         var2.n(l.p.AFFECTED_BLOCKS, 0);
         net.u.j var5 = J(var2, var3, 0, false);
         net.u.j var6 = J(var2, var3, 3, false);
         net.u.j var7 = J(var2, var3, 6, false);
         net.y4.v var8 = new net.y4.v(var5, var6);
         net.y4.v var9 = new net.y4.v(var7, var7.z(var8.C()));
         int var10 = var8.t() * var8.I() * var8.X();
         if(var10 > '耀') {
            throw new t("commands.clone.tooManyBlocks", new Object[]{Integer.valueOf(var10), Integer.valueOf('耀')});
         } else {
            boolean var11 = false;
            net.y9.l var12 = null;
            Predicate var13 = null;
            if((var3.length < 11 || !"force".equals(var3[10]) && !"move".equals(var3[10])) && var8.F(var9)) {
               throw new t("commands.clone.noOverlap", new Object[0]);
            } else {
               if(var3.length >= 11 && "move".equals(var3[10])) {
                  var11 = true;
               }

               if(var8.D >= 0 && var8.P < 256 && var9.D >= 0 && var9.P < 256) {
                  net.yv.r var14 = var2.T();
                  if(var14.z(var8) && var14.z(var9)) {
                     boolean var15 = false;
                     if(var3.length >= 10) {
                        if("masked".equals(var3[9])) {
                           var15 = true;
                        }

                        if("filtered".equals(var3[9])) {
                           if(var3.length < 12) {
                              throw new x("commands.clone.usage", new Object[0]);
                           }

                           var12 = I(var2, var3[11]);
                           if(var3.length >= 13) {
                              var13 = L(var12, var3[12]);
                           }
                        }
                     }

                     ArrayList var16 = Lists.newArrayList();
                     ArrayList var17 = Lists.newArrayList();
                     ArrayList var18 = Lists.newArrayList();
                     LinkedList var19 = Lists.newLinkedList();
                     net.u.j var20 = new net.u.j(var9.i - var8.i, var9.D - var8.D, var9.p - var8.p);
                     int var21 = var8.p;
                     if(var21 <= var8.J) {
                        int var22 = var8.D;
                        if(var22 <= var8.P) {
                           int var23 = var8.i;
                           if(var23 <= var8.e) {
                              net.u.j var24 = new net.u.j(var23, var22, var21);
                              net.u.j var25 = var24.z(var20);
                              net.yw.n var26 = var14.Z(var24);
                              if(var12 == null || var26.Q() == var12 && (var13 == null || var13.apply(var26))) {
                                 net.ni.v var27 = var14.L(var24);
                                 if(var27 != null) {
                                    net.nj.f var28 = var27.b(new net.nj.f());
                                    var17.add(new g.x(var25, var26, var28));
                                    var19.addLast(var24);
                                 }

                                 if(!var26.E() && !var26.O()) {
                                    var18.add(new g.x(var25, var26, (net.nj.f)null));
                                    var19.addFirst(var24);
                                 }

                                 var16.add(new g.x(var25, var26, (net.nj.f)null));
                                 var19.addLast(var24);
                              }

                              ++var23;
                           }

                           ++var22;
                        }

                        ++var21;
                     }

                     ArrayList var34 = Lists.newArrayList();
                     var34.addAll(var16);
                     var34.addAll(var17);
                     var34.addAll(var18);
                     List var36 = Lists.reverse(var34);
                     Iterator var38 = var36.iterator();
                     if(var38.hasNext()) {
                        g.x var43 = (g.x)var38.next();
                        net.ni.v var48 = var14.L(var43.c);
                        if(var48 instanceof z1) {
                           ((z1)var48).T();
                        }

                        var14.k(var43.c, net.nb.f.dr.p(), 2);
                     }

                     var10 = 0;
                     var38 = var34.iterator();
                     if(var38.hasNext()) {
                        g.x var44 = (g.x)var38.next();
                        if(var14.k(var44.c, var44.p, 2)) {
                           ++var10;
                        }
                     }

                     var38 = var17.iterator();
                     if(var38.hasNext()) {
                        g.x var45 = (g.x)var38.next();
                        net.ni.v var49 = var14.L(var45.c);
                        if(var45.D != null && var49 != null) {
                           var45.D.r("x", var45.c.t());
                           var45.D.r("y", var45.c.h());
                           var45.D.r("z", var45.c.y());
                           var49.G(var45.D);
                           var49.W();
                        }

                        var14.k(var45.c, var45.p, 2);
                     }

                     var38 = var36.iterator();
                     if(var38.hasNext()) {
                        g.x var46 = (g.x)var38.next();
                        var14.c(var46.c, var46.p.Q(), false);
                     }

                     List var42 = var14.d(var8, false);
                     if(var42 != null) {
                        Iterator var47 = var42.iterator();
                        if(var47.hasNext()) {
                           net.yv.o var50 = (net.yv.o)var47.next();
                           if(var8.Y(var50.z)) {
                              net.u.j var51 = var50.z.z(var20);
                              var14.c(var51, var50.l(), (int)(var50.p - var14.B().m()), var50.l);
                           }
                        }
                     }

                     throw new t("commands.clone.failed", new Object[0]);
                  } else {
                     throw new t("commands.clone.outOfWorld", new Object[0]);
                  }
               } else {
                  throw new t("commands.clone.outOfWorld", new Object[0]);
               }
            }
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):(var3.length > 3 && var3.length <= 6?h(var3, 3, var4):(var3.length > 6 && var3.length <= 9?h(var3, 6, var4):(var3.length == 10?D(var3, new String[]{"replace", "masked", "filtered"}):(var3.length == 11?D(var3, new String[]{"normal", "force", "move"}):(var3.length == 12 && "filtered".equals(var3[9])?o(var3, net.y9.l.m.i()):Collections.emptyList())))));
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static class x {
      public final net.u.j c;
      public final net.yw.n p;
      public final net.nj.f D;

      public x(net.u.j var1, net.yw.n var2, net.nj.f var3) {
         this.c = var1;
         this.p = var2;
         this.D = var3;
      }
   }
}
