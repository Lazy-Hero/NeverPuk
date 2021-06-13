package net.n0;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multisets;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y6;
import net.y9.lc;
import net.y9.rv;

public class yn extends y6 {
   protected yn() {
      this.z(true);
   }

   public static ks i(net.yv.r var0, double var1, double var3, byte var5, boolean var6, boolean var7) {
      ks var8 = new ks(net.nb.j.WN, 1, var0.t("map"));
      String var9 = "map_" + var8.n();
      net.cg.s var10 = new net.cg.s(var9);
      var0.Z((String)var9, (net.cg.h)var10);
      var10.J = var5;
      var10.g(var1, var3, var10.J);
      var10.q = (byte)var0.F.L().M();
      var10.i = var6;
      var10.V = var7;
      var10.f();
      return var8;
   }

   @Nullable
   public static net.cg.s R(int var0, net.yv.r var1) {
      String var2 = "map_" + var0;
      return (net.cg.s)var1.L(net.cg.s.class, var2);
   }

   @Nullable
   public net.cg.s t(ks var1, net.yv.r var2) {
      String var3 = "map_" + var1.n();
      net.cg.s var4 = (net.cg.s)var2.L(net.cg.s.class, var3);
      if(!var2.x) {
         var1.d(var2.t("map"));
         var3 = "map_" + var1.n();
         var4 = new net.cg.s(var3);
         var4.J = 3;
         var4.g((double)var2.B().h(), (double)var2.B().Q(), var4.J);
         var4.q = (byte)var2.F.L().M();
         var4.f();
         var2.Z((String)var3, (net.cg.h)var4);
      }

      return var4;
   }

   public void k(net.yv.r var1, net.ne.l var2, net.cg.s var3) {
      int[] var4 = kw.b();
      if(var1.F.L().M() == var3.q && var2 instanceof net.r.r) {
         int var5 = 1 << var3.J;
         int var6 = var3.f;
         int var7 = var3.o;
         int var8 = net.u.t.L(var2.b - (double)var6) / var5 + 64;
         int var9 = net.u.t.L(var2.hr - (double)var7) / var5 + 64;
         int var10 = 128 / var5;
         if(var1.F.k()) {
            var10 /= 2;
         }

         net.cg.s var11 = var3.D((net.r.r)var2);
         ++var11.V;
         boolean var12 = false;
         int var13 = var8 - var10 + 1;
         if(var13 < var8 + var10) {
            if((var13 & 15) == (var11.V & 15)) {
               var12 = false;
               double var14 = 0.0D;
               int var16 = var9 - var10 - 1;
               if(var16 < var9 + var10) {
                  if(var13 >= 0 && var16 >= -1 && var13 < 128 && var16 < 128) {
                     int var17 = var13 - var8;
                     int var18 = var16 - var9;
                     boolean var19 = var17 * var17 + var18 * var18 > (var10 - 2) * (var10 - 2);
                     int var20 = (var6 / var5 + var13 - 64) * var5;
                     int var21 = (var7 / var5 + var16 - 64) * var5;
                     HashMultiset var22 = HashMultiset.create();
                     net.l.q var23 = var1.d(new net.u.j(var20, 0, var21));
                     if(!var23.z()) {
                        int var24 = var20 & 15;
                        int var25 = var21 & 15;
                        int var26 = 0;
                        double var27 = 0.0D;
                        if(var1.F.k()) {
                           int var29 = var20 + var21 * 231871;
                           var29 = var29 * var29 * 31287121 + var29 * 11;
                           if((var29 >> 20 & 1) == 0) {
                              var22.add(net.nb.f.dl.p().s(rv.l, rv.m.DIRT).c(var1, net.u.j.V), 10);
                           }

                           var22.add(net.nb.f.oy.p().s(lc.W, lc.d.STONE).c(var1, net.u.j.V), 100);
                           var27 = 100.0D;
                        }

                        net.u.j var42 = new net.u.j();
                        int var30 = 0;
                        if(var30 < var5) {
                           int var31 = 0;
                           if(var31 < var5) {
                              int var32 = var23.s(var30 + var24, var31 + var25) + 1;
                              net.yw.n var33 = net.nb.f.ou.p();
                              if(var32 <= 1) {
                                 var33 = net.nb.f.T8.p();
                              }

                              --var32;
                              var33 = var23.R(var30 + var24, var32, var31 + var25);
                              var42.V((var23.Q << 4) + var30 + var24, var32, (var23.U << 4) + var31 + var25);
                              if(var33.c(var1, var42) == net.y1.h.d) {
                                 ;
                              }

                              if(var32 > 0 && var33.n().y()) {
                                 int var34 = var32 - 1;
                                 net.yw.n var35 = var23.R(var30 + var24, var34--, var31 + var25);
                                 ++var26;
                                 if(!var35.n().y()) {
                                    ;
                                 }
                              }

                              var27 += (double)var32 / (double)(var5 * var5);
                              var22.add(var33.c(var1, var42));
                              ++var31;
                           }

                           ++var30;
                        }

                        var26 = var26 / (var5 * var5);
                        double var43 = (var27 - var14) * 4.0D / (double)(var5 + 4) + ((double)(var13 + var16 & 1) - 0.5D) * 0.4D;
                        byte var47 = 1;
                        if(Double.compare(var43, 0.6D) > 0) {
                           var47 = 2;
                        }

                        if(Double.compare(var43, -0.6D) < 0) {
                           var47 = 0;
                        }

                        net.y1.h var49 = (net.y1.h)Iterables.getFirst(Multisets.copyHighestCountFirst(var22), net.y1.h.d);
                        if(var49 == net.y1.h.y) {
                           var43 = (double)var26 * 0.1D + (double)(var13 + var16 & 1) * 0.2D;
                           var47 = 1;
                           if(Double.compare(var43, 0.5D) < 0) {
                              var47 = 2;
                           }

                           if(Double.compare(var43, 0.9D) > 0) {
                              var47 = 0;
                           }
                        }

                        if(var16 >= 0 && var17 * var17 + var18 * var18 < var10 * var10) {
                           byte var52 = var3.E[var13 + var16 * 128];
                           byte var54 = (byte)(var49.v * 4 + var47);
                           if(var52 != var54) {
                              var3.E[var13 + var16 * 128] = var54;
                              var3.n(var13, var16);
                              var12 = true;
                           }
                        }
                     }
                  }

                  ++var16;
               }
            }

            ++var13;
         }
      }

   }

   public static void p(net.yv.r var0, ks var1) {
      if(var1.Z() == net.nb.j.WN) {
         net.cg.s var2 = net.nb.j.WN.t(var1, var0);
         if(var0.F.L().M() == var2.q) {
            int var3 = 1 << var2.J;
            int var4 = var2.f;
            int var5 = var2.o;
            net.ns.i[] var6 = var0.V().y((net.ns.i[])null, (var4 / var3 - 64) * var3, (var5 / var3 - 64) * var3, 128 * var3, 128 * var3, false);
            byte var7 = 0;
            int var8 = 0;

            while(true) {
               int var9 = var7 * var3;
               int var10 = var8 * var3;
               net.ns.i var11 = var6[var9 + var10 * 128 * var3];
               net.y1.h var12 = net.y1.h.d;
               int var13 = 3;
               int var14 = 8;
               if(var6[(var7 - 1) * var3 + (var8 - 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[(var7 - 1) * var3 + (var8 + 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[(var7 - 1) * var3 + var8 * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[(var7 + 1) * var3 + (var8 - 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[(var7 + 1) * var3 + (var8 + 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[(var7 + 1) * var3 + var8 * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[var7 * var3 + (var8 - 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var6[var7 * var3 + (var8 + 1) * var3 * 128 * var3].Q() >= 0.0F) {
                  --var14;
               }

               if(var11.Q() < 0.0F) {
                  var12 = net.y1.h.p;
                  int var10000 = var8 % 2;
                  var13 = (var7 + (int)(net.u.t.A((float)var8 + 0.0F) * 7.0F)) / 8 % 5;
                  if(var13 == 3) {
                     var13 = 1;
                  } else if(var13 == 4) {
                     var13 = 0;
                  }
               } else {
                  var12 = net.y1.h.o;
                  var13 = 1;
               }

               if(var12 != net.y1.h.d) {
                  var2.E[var7 + var8 * 128] = (byte)(var12.v * 4 + var13);
                  var2.n(var7, var8);
               }

               ++var8;
            }
         }
      }

   }

   public void j(ks var1, net.yv.r var2, net.ne.l var3, int var4, boolean var5) {
      if(!var2.x) {
         net.cg.s var6 = this.t(var1, var2);
         if(var3 instanceof net.r.r) {
            net.r.r var7 = (net.r.r)var3;
            var6.i(var7, var1);
         }

         if(var3 instanceof net.r.r && ((net.r.r)var3).L() == var1) {
            this.k(var2, var3, var6);
         }
      }

   }

   @Nullable
   public net.n2.k U(ks var1, net.yv.r var2, net.r.r var3) {
      return this.t(var1, var2).K(var1, var2, var3);
   }

   public void g(ks var1, net.yv.r var2, net.r.r var3) {
      net.nj.f var4 = var1.o();
      if(var4.K("map_scale_direction", 99)) {
         B(var1, var2, var4.P("map_scale_direction"));
         var4.A("map_scale_direction");
      } else if(var4.i("map_tracking_position")) {
         q(var1, var2);
         var4.A("map_tracking_position");
      }

   }

   protected static void B(ks var0, net.yv.r var1, int var2) {
      net.cg.s var3 = net.nb.j.WN.t(var0, var1);
      var0.d(var1.t("map"));
      net.cg.s var4 = new net.cg.s("map_" + var0.n());
      var4.J = (byte)net.u.t.g(var3.J + var2, 0, 4);
      var4.i = var3.i;
      var4.g((double)var3.f, (double)var3.o, var4.J);
      var4.q = var3.q;
      var4.f();
      var1.Z((String)("map_" + var0.n()), (net.cg.h)var4);
   }

   protected static void q(ks var0, net.yv.r var1) {
      net.cg.s var2 = net.nb.j.WN.t(var0, var1);
      var0.d(var1.t("map"));
      net.cg.s var3 = new net.cg.s("map_" + var0.n());
      var3.i = true;
      var3.f = var2.f;
      var3.o = var2.o;
      var3.J = var2.J;
      var3.q = var2.q;
      var3.f();
      var1.Z((String)("map_" + var0.n()), (net.cg.h)var3);
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      if(var4.c()) {
         Object var5 = null;
         var3.add(net.yq.e.x("filled_map.scale", new Object[]{Integer.valueOf(1 << ((net.cg.s)var5).J)}));
         var3.add(net.yq.e.x("filled_map.level", new Object[]{Byte.valueOf(((net.cg.s)var5).J), Integer.valueOf(4)}));
      }

   }

   public static int O(ks var0) {
      net.nj.f var1 = var0.j("display");
      if(var1.K("MapColor", 99)) {
         int var2 = var1.P("MapColor");
         return -16777216 | var2 & 16777215;
      } else {
         return -12173266;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
