package net.yv;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.y9.g3;
import net.yv.d;
import net.yv.r;

public final class o4 {
   private static final int C = (int)Math.pow(17.0D, 2.0D);
   private final Set B = Sets.newHashSet();

   public int X(d var1, boolean var2, boolean var3, boolean var4) {
      net.u.d[] var5 = r.C();
      if(!var2 && !var3) {
         return 0;
      } else {
         this.B.clear();
         int var6 = 0;
         Iterator var7 = var1.A.iterator();
         if(var7.hasNext()) {
            net.r.r var8 = (net.r.r)var7.next();
            if(!var8.VX()) {
               int var9 = net.u.t.L(var8.b / 16.0D);
               int var10 = net.u.t.L(var8.hr / 16.0D);
               boolean var11 = true;
               int var12 = -8;
               int var13 = -8;
               boolean var14 = true;
               net.u.p var15 = new net.u.p(var12 + var9, var13 + var10);
               if(!this.B.contains(var15)) {
                  ++var6;
                  if(var1.T().s(var15)) {
                     net.n.e var16 = var1.m().h(var15.i, var15.y);
                     if(var16.Q()) {
                        this.B.add(var15);
                     }
                  }
               }

               ++var13;
               ++var12;
            }
         }

         int var37 = 0;
         net.u.j var38 = var1.y();
         net.ne.q[] var39 = net.ne.q.values();
         int var40 = var39.length;
         int var41 = 0;
         if(var41 < var40) {
            net.ne.q var44 = var39[var41];
            if((!var44.h() || var3) && (var44.h() || var2) && (!var44.r() || var4)) {
               int var46 = var1.h(var44.z());
               int var47 = var44.y() * var6 / C;
               if(var46 <= var47) {
                  net.u.j var48 = new net.u.j();
                  Iterator var49 = this.B.iterator();
                  if(var49.hasNext()) {
                     net.u.p var17 = (net.u.p)var49.next();
                     net.u.j var18 = a(var1, var17.i, var17.y);
                     int var19 = var18.t();
                     int var20 = var18.h();
                     int var21 = var18.y();
                     net.yw.n var22 = var1.Z(var18);
                     if(!var22.i()) {
                        int var23 = 0;
                        int var24 = 0;
                        boolean var10000 = true;
                        net.ns.i var29 = null;
                        Object var30 = null;
                        int var31 = net.u.t.o(Math.random() * 4.0D);
                        int var32 = 0;
                        if(var32 < var31) {
                           int var25 = var19 + (var1.G.nextInt(6) - var1.G.nextInt(6));
                           int var26 = var20 + (var1.G.nextInt(1) - var1.G.nextInt(1));
                           int var27 = var21 + (var1.G.nextInt(6) - var1.G.nextInt(6));
                           var48.V(var25, var26, var27);
                           float var33 = (float)var25 + 0.5F;
                           float var34 = (float)var27 + 0.5F;
                           if(!var1.g((double)var33, (double)var26, (double)var34, 24.0D) && var38.s((double)var33, (double)var26, (double)var34) >= 576.0D) {
                              if(var29 == null) {
                                 var29 = var1.L(var44, var48);
                                 if(var29 == null) {
                                    ;
                                 }
                              }

                              if(var1.d(var44, var29, var48) && x(net.ne.k.I(var29.N), var1, var48)) {
                                 net.ne.y var35 = (net.ne.y)var29.N.getConstructor(new Class[]{r.class}).newInstance(new Object[]{var1});
                                 var35.S((double)var33, (double)var26, (double)var34, var1.G.nextFloat() * 360.0F, 0.0F);
                                 if(var35.l4() && var35.l1()) {
                                    var35.t(var1.G(new net.u.j(var35)), (net.ne.g)var30);
                                    if(var35.l1()) {
                                       ++var23;
                                       var1.S(var35);
                                    }

                                    var35.B();
                                    if(var23 >= var35.W()) {
                                       ;
                                    }
                                 }

                                 var37 += var23;
                              }
                           }

                           ++var32;
                        }

                        ++var24;
                     }
                  }
               }
            }

            ++var41;
         }

         return var37;
      }
   }

   private static net.u.j a(r var0, int var1, int var2) {
      net.l.q var3 = var0.q(var1, var2);
      int var4 = var1 * 16 + var0.G.nextInt(16);
      int var5 = var2 * 16 + var0.G.nextInt(16);
      int var6 = net.u.t.s(var3.r(new net.u.j(var4, 0, var5)) + 1, 16);
      int var7 = var0.G.nextInt(var6);
      return new net.u.j(var4, var7, var5);
   }

   public static boolean a(net.yw.n var0) {
      return var0.w()?false:(var0.o()?false:(var0.n().y()?false:!g3.B(var0)));
   }

   public static boolean x(net.ne.y var0, r var1, net.u.j var2) {
      if(!var1.T().U(var2)) {
         return false;
      } else {
         net.yw.n var3 = var1.Z(var2);
         if(var0 == net.ne.y.IN_WATER) {
            return var3.n() == net.y1.l.p && var1.Z(var2.b()).n() == net.y1.l.p && !var1.Z(var2.h()).i();
         } else {
            net.u.j var4 = var2.b();
            if(!var1.Z(var4).z()) {
               return false;
            } else {
               net.y9.l var5 = var1.Z(var4).Q();
               boolean var6 = var5 != net.nb.f.T8 && var5 != net.nb.f.dr;
               return a(var3) && a(var1.Z(var2.h()));
            }
         }
      }
   }

   public static void F(r var0, net.ns.i var1, int var2, int var3, int var4, int var5, Random var6) {
      List var7 = var1.v(net.ne.q.CREATURE);
      if(!var7.isEmpty()) {
         while(var6.nextFloat() < var1.J()) {
            net.ns.i var8 = (net.ns.i)net.yz.b.g(var0.G, var7);
            int var9 = var8.q + var6.nextInt(1 + var8.k - var8.q);
            net.ne.g var10 = null;
            int var11 = var2 + var6.nextInt(var4);
            int var12 = var3 + var6.nextInt(var5);
            int var13 = var11;
            int var14 = var12;
            byte var15 = 0;
            if(var15 < var9) {
               boolean var16 = false;
               int var17 = 0;

               while(true) {
                  net.u.j var18 = var0.D(new net.u.j(var11, 0, var12));
                  if(x(net.ne.y.ON_GROUND, var0, var18)) {
                     net.ne.y var19 = (net.ne.y)var8.N.getConstructor(new Class[]{r.class}).newInstance(new Object[]{var0});
                     var19.S((double)((float)var11 + 0.5F), (double)var18.h(), (double)((float)var12 + 0.5F), var6.nextFloat() * 360.0F, 0.0F);
                     var0.S(var19);
                     var10 = var19.t(var0.G(new net.u.j(var19)), var10);
                     var16 = true;
                  }

                  var11 += var6.nextInt(5) - var6.nextInt(5);

                  for(var12 += var6.nextInt(5) - var6.nextInt(5); var11 < var2 || var11 >= var2 + var4 || var12 < var3 || var12 >= var3 + var4; var12 = var14 + var6.nextInt(5) - var6.nextInt(5)) {
                     var11 = var13 + var6.nextInt(5) - var6.nextInt(5);
                  }

                  ++var17;
               }
            }
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
