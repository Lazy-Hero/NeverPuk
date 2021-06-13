package net.y4;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y4.b;
import net.y4.c;
import net.y4.p;
import net.y4.v;
import net.y9.z_;
import net.yz.aq;
import net.yz.ax;
import net.yz.m_;

public class m {
   public static void K() {
      b.v(m.a.class, "WMP");
   }

   public static void U(net.yj.e var0, net.u.j var1, net.yz.l var2, List var3, Random var4) {
      m.z var5 = new m.z(var4);
      m.p var6 = new m.p(var0, var4);
      var6.b(var1, var2, var3, var5);
   }

   public static class a extends c {
      private String N;
      private net.yz.l O;
      private ax T;

      public a() {
      }

      public a(net.yj.e var1, String var2, net.u.j var3, net.yz.l var4) {
         this(var1, var2, var3, var4, ax.NONE);
      }

      public a(net.yj.e var1, String var2, net.u.j var3, net.yz.l var4, ax var5) {
         super(0);
         this.N = var2;
         this.l = var3;
         this.O = var4;
         this.T = var5;
         this.Q(var1);
      }

      private void Q(net.yj.e var1) {
         net.yj.f var2 = var1.O((net.nx.f)null, new m_("mansion/" + this.N));
         net.yj.y var3 = (new net.yj.y()).P(true).o(this.O).v(this.T);
         this.g(var2, this.l, var3);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.b("Template", this.N);
         var1.b("Rot", this.f.L().name());
         var1.b("Mi", this.f.O().name());
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.N = var1.J("Template");
         this.O = net.yz.l.valueOf(var1.J("Rot"));
         this.T = ax.valueOf(var1.J("Mi"));
         this.Q(var2);
      }

      protected void B(String var1, net.u.j var2, net.yv.r var3, Random var4, v var5) {
         int[] var6 = p.d();
         if(var1.startsWith("Chest")) {
            net.yz.l var7 = this.f.L();
            net.yw.n var8 = net.nb.f.uG.p();
            if("ChestWest".equals(var1)) {
               var8 = var8.s(z_.R, var7.d(aq.WEST));
            }

            if("ChestEast".equals(var1)) {
               var8 = var8.s(z_.R, var7.d(aq.EAST));
            }

            if("ChestSouth".equals(var1)) {
               var8 = var8.s(z_.R, var7.d(aq.SOUTH));
            }

            if("ChestNorth".equals(var1)) {
               var8 = var8.s(z_.R, var7.d(aq.NORTH));
            }

            this.y(var3, var5, var4, var2, net.y7.p.pm, var8);
         }

         if("Mage".equals(var1)) {
            net.nk.p var9 = new net.nk.p(var3);
            var9.gz();
            var9.L(var2, 0.0F, 0.0F);
            var3.S(var9);
            var3.k(var2, net.nb.f.ou.p(), 2);
         }

         if("Warrior".equals(var1)) {
            net.nk.h var10 = new net.nk.h(var3);
            var10.gz();
            var10.L(var2, 0.0F, 0.0F);
            var10.t(var3.G(new net.u.j(var10)), (net.ne.g)null);
            var3.S(var10);
            var3.k(var2, net.nb.f.ou.p(), 2);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class b extends m.l {
      private b() {
         super(null);
      }

      public String Z(Random var1) {
         return "1x1_b" + (var1.nextInt(4) + 1);
      }

      public String G(Random var1) {
         return "1x1_as" + (var1.nextInt(4) + 1);
      }

      public String H(Random var1, boolean var2) {
         return "1x2_c_stairs";
      }

      public String f(Random var1, boolean var2) {
         return "1x2_d_stairs";
      }

      public String C(Random var1) {
         return "1x2_se" + (var1.nextInt(1) + 1);
      }

      public String c(Random var1) {
         return "2x2_b" + (var1.nextInt(5) + 1);
      }

      public String B(Random var1) {
         return "2x2_s1";
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class c extends m.l {
      private c() {
         super(null);
      }

      public String Z(Random var1) {
         return "1x1_a" + (var1.nextInt(5) + 1);
      }

      public String G(Random var1) {
         return "1x1_as" + (var1.nextInt(4) + 1);
      }

      public String H(Random var1, boolean var2) {
         return "1x2_a" + (var1.nextInt(9) + 1);
      }

      public String f(Random var1, boolean var2) {
         return "1x2_b" + (var1.nextInt(5) + 1);
      }

      public String C(Random var1) {
         return "1x2_s" + (var1.nextInt(2) + 1);
      }

      public String c(Random var1) {
         return "2x2_a" + (var1.nextInt(4) + 1);
      }

      public String B(Random var1) {
         return "2x2_s1";
      }
   }

   static class g {
      private final int[][] P;
      private final int D;
      private final int G;
      private final int f;

      public g(int var1, int var2, int var3) {
         this.D = var1;
         this.G = var2;
         this.f = var3;
         this.P = new int[var1][var2];
      }

      public void e(int var1, int var2, int var3) {
         if(var1 < this.D && var2 < this.G) {
            this.P[var1][var2] = var3;
         }

      }

      public void E(int var1, int var2, int var3, int var4, int var5) {
         for(int var6 = var2; var6 <= var4; ++var6) {
            for(int var7 = var1; var7 <= var3; ++var7) {
               this.e(var7, var6, var5);
            }
         }

      }

      public int e(int var1, int var2) {
         return var1 < this.D && var2 < this.G?this.P[var1][var2]:this.f;
      }

      public void M(int var1, int var2, int var3, int var4) {
         if(this.e(var1, var2) == var3) {
            this.e(var1, var2, var4);
         }

      }

      public boolean l(int var1, int var2, int var3) {
         int[] var4 = p.d();
         return this.e(var1 - 1, var2) == var3 || this.e(var1 + 1, var2) == var3 || this.e(var1, var2 + 1) == var3 || this.e(var1, var2 - 1) == var3;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   abstract static class l {
      private l() {
      }

      public abstract String Z(Random var1);

      public abstract String G(Random var1);

      public abstract String H(Random var1, boolean var2);

      public abstract String f(Random var1, boolean var2);

      public abstract String C(Random var1);

      public abstract String c(Random var1);

      public abstract String B(Random var1);
   }

   static class o extends m.b {
      private o() {
         super(null);
      }
   }

   static class p {
      private final net.yj.e P;
      private final Random L;
      private int B;
      private int z;

      public p(net.yj.e var1, Random var2) {
         this.P = var1;
         this.L = var2;
      }

      public void b(net.u.j var1, net.yz.l var2, List var3, m.z var4) {
         p.d();
         m.x var6 = new m.x();
         var6.n = var1;
         var6.A = var2;
         var6.i = "wall_flat";
         m.x var7 = new m.x();
         this.P(var3, var6);
         var7.n = var6.n.J(8);
         var7.A = var6.A;
         var7.i = "wall_window";
         if(!var3.isEmpty()) {
            ;
         }

         m.g var8 = var4.B;
         m.g var9 = var4.r;
         this.B = var4.q + 1;
         this.z = var4.Y + 1;
         int var10 = var4.q + 1;
         int var11 = var4.Y;
         this.b(var3, var6, var8, aq.SOUTH, this.B, this.z, var10, var11);
         this.b(var3, var7, var8, aq.SOUTH, this.B, this.z, var10, var11);
         m.x var12 = new m.x();
         var12.n = var6.n.J(19);
         var12.A = var6.A;
         var12.i = "wall_window";
         boolean var13 = false;
         int var14 = 0;
         if(var14 < var9.G) {
            int var15 = var9.D - 1;
            if(m.z.p(var9, var15, var14)) {
               var12.n = var12.n.a(var2.d(aq.SOUTH), 8 + (var14 - this.z) * 8);
               var12.n = var12.n.a(var2.d(aq.EAST), (var15 - this.B) * 8);
               this.F(var3, var12);
               this.b(var3, var12, var9, aq.SOUTH, var15, var14, var15, var14);
               var13 = true;
            }

            --var15;
            ++var14;
         }

         this.G(var3, var1.J(16), var2, var8, var9);
         this.G(var3, var1.J(27), var2, var9, (m.g)null);
         if(!var3.isEmpty()) {
            ;
         }

         m.l[] var36 = new m.l[]{new m.c(), new m.b(), new m.o()};
         int var38 = 0;
         net.u.j var16 = var1.J(8 * var38 + 0);
         m.g var17 = var4.E[var38];
         String var19 = "carpet_south";
         String var20 = "carpet_west";
         int var21 = 0;
         if(var21 < var8.G) {
            int var22 = 0;
            if(var22 < var8.D) {
               if(var8.e(var22, var21) == 1) {
                  net.u.j var23 = var16.a(var2.d(aq.SOUTH), 8 + (var21 - this.z) * 8);
                  var23 = var23.a(var2.d(aq.EAST), (var22 - this.B) * 8);
                  var3.add(new m.a(this.P, "corridor_floor", var23, var2));
                  if(var8.e(var22, var21 - 1) == 1 || (var17.e(var22, var21 - 1) & 8388608) == 8388608) {
                     var3.add(new m.a(this.P, "carpet_north", var23.a(var2.d(aq.EAST), 1).h(), var2));
                  }

                  if(var8.e(var22 + 1, var21) == 1 || (var17.e(var22 + 1, var21) & 8388608) == 8388608) {
                     var3.add(new m.a(this.P, "carpet_east", var23.a(var2.d(aq.SOUTH), 1).a(var2.d(aq.EAST), 5).h(), var2));
                  }

                  if(var8.e(var22, var21 + 1) == 1 || (var17.e(var22, var21 + 1) & 8388608) == 8388608) {
                     var3.add(new m.a(this.P, var19, var23.a(var2.d(aq.SOUTH), 5).a(var2.d(aq.WEST), 1), var2));
                  }

                  if(var8.e(var22 - 1, var21) == 1 || (var17.e(var22 - 1, var21) & 8388608) == 8388608) {
                     var3.add(new m.a(this.P, var20, var23.a(var2.d(aq.WEST), 1).a(var2.d(aq.NORTH), 1), var2));
                  }
               }

               ++var22;
            }

            ++var21;
         }

         String var41 = "indoors_wall";
         String var43 = "indoors_door";
         ArrayList var45 = Lists.newArrayList();
         int var24 = 0;
         if(var24 < var8.G) {
            int var25 = 0;
            if(var25 < var8.D) {
               boolean var26 = false;
               if(var8.e(var25, var24) == 2) {
                  int var27 = var17.e(var25, var24);
                  int var28 = var27 & 983040;
                  int var29 = var27 & '\uffff';
                  var26 = false;
                  var45.clear();
                  if((var27 & 2097152) == 2097152) {
                     aq[] var30 = aq.u.HORIZONTAL.A();
                     int var31 = var30.length;
                     int var32 = 0;
                     if(var32 < var31) {
                        aq var33 = var30[var32];
                        if(var8.e(var25 + var33.v(), var24 + var33.P()) == 1) {
                           var45.add(var33);
                        }

                        ++var32;
                     }
                  }

                  aq var49 = null;
                  if(!var45.isEmpty()) {
                     var49 = (aq)var45.get(this.L.nextInt(var45.size()));
                  } else if((var27 & 1048576) == 1048576) {
                     var49 = aq.UP;
                  }

                  net.u.j var50 = var16.a(var2.d(aq.SOUTH), 8 + (var24 - this.z) * 8);
                  var50 = var50.a(var2.d(aq.EAST), -1 + (var25 - this.B) * 8);
                  if(m.z.p(var8, var25 - 1, var24) && !var4.C(var8, var25 - 1, var24, var38, var29)) {
                     var3.add(new m.a(this.P, var49 == aq.WEST?var43:var41, var50, var2));
                  }

                  if(var8.e(var25 + 1, var24) == 1) {
                     net.u.j var53 = var50.a(var2.d(aq.EAST), 8);
                     var3.add(new m.a(this.P, var49 == aq.EAST?var43:var41, var53, var2));
                  }

                  if(m.z.p(var8, var25, var24 + 1) && !var4.C(var8, var25, var24 + 1, var38, var29)) {
                     net.u.j var54 = var50.a(var2.d(aq.SOUTH), 7);
                     var54 = var54.a(var2.d(aq.EAST), 7);
                     var3.add(new m.a(this.P, var49 == aq.SOUTH?var43:var41, var54, var2.B(net.yz.l.CLOCKWISE_90)));
                  }

                  if(var8.e(var25, var24 - 1) == 1) {
                     net.u.j var56 = var50.a(var2.d(aq.NORTH), 1);
                     var56 = var56.a(var2.d(aq.EAST), 7);
                     var3.add(new m.a(this.P, var49 == aq.NORTH?var43:var41, var56, var2.B(net.yz.l.CLOCKWISE_90)));
                  }

                  if(var28 == 65536) {
                     this.c(var3, var50, var2, var49, var36[var38]);
                  }

                  if(var28 == 131072 && var49 != null) {
                     aq var58 = var4.Z(var8, var25, var24, var38, var29);
                     boolean var60 = (var27 & 4194304) == 4194304;
                     this.R(var3, var50, var2, var58, var49, var36[var38], var60);
                  }

                  if(var28 == 262144 && var49 != null && var49 != aq.UP) {
                     aq var59 = var49.R();
                     if(!var4.C(var8, var25 + var59.v(), var24 + var59.P(), var38, var29)) {
                        var59 = var59.f();
                     }

                     this.o(var3, var50, var2, var59, var49, var36[var38]);
                  }

                  if(var28 == 262144 && var49 == aq.UP) {
                     this.x(var3, var50, var2, var36[var38]);
                  }
               }

               ++var25;
            }

            ++var24;
         }

         ++var38;
      }

      private void b(List var1, m.x var2, m.g var3, aq var4, int var5, int var6, int var7, int var8) {
         int var9 = var5;
         int var10 = var6;
         aq var11 = var4;

         while(true) {
            if(!m.z.p(var3, var9 + var4.v(), var10 + var4.P())) {
               this.d(var1, var2);
               var4 = var4.R();
               if(var9 != var7 || var10 != var8 || var11 != var4) {
                  this.F(var1, var2);
               }
            } else if(m.z.p(var3, var9 + var4.v(), var10 + var4.P()) && m.z.p(var3, var9 + var4.v() + var4.i().v(), var10 + var4.P() + var4.i().P())) {
               this.H(var1, var2);
               var9 += var4.v();
               var10 += var4.P();
               var4 = var4.i();
            } else {
               var9 += var4.v();
               var10 += var4.P();
               if(var9 != var7 || var10 != var8 || var11 != var4) {
                  this.F(var1, var2);
               }
            }

            if(var9 == var7 && var10 == var8 && var11 == var4) {
               break;
            }
         }

      }

      private void G(List var1, net.u.j var2, net.yz.l var3, m.g var4, @Nullable m.g var5) {
         for(int var6 = 0; var6 < var4.G; ++var6) {
            for(int var7 = 0; var7 < var4.D; ++var7) {
               net.u.j var8 = var2.a(var3.d(aq.SOUTH), 8 + (var6 - this.z) * 8);
               var8 = var8.a(var3.d(aq.EAST), (var7 - this.B) * 8);
               boolean var9 = m.z.p(var5, var7, var6);
               if(m.z.p(var4, var7, var6)) {
                  var1.add(new m.a(this.P, "roof", var8.J(3), var3));
                  if(!m.z.p(var4, var7 + 1, var6)) {
                     net.u.j var10 = var8.a(var3.d(aq.EAST), 6);
                     var1.add(new m.a(this.P, "roof_front", var10, var3));
                  }

                  if(!m.z.p(var4, var7 - 1, var6)) {
                     net.u.j var23 = var8.a(var3.d(aq.EAST), 0);
                     var23 = var23.a(var3.d(aq.SOUTH), 7);
                     var1.add(new m.a(this.P, "roof_front", var23, var3.B(net.yz.l.CLOCKWISE_180)));
                  }

                  if(!m.z.p(var4, var7, var6 - 1)) {
                     net.u.j var25 = var8.a(var3.d(aq.WEST), 1);
                     var1.add(new m.a(this.P, "roof_front", var25, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
                  }

                  if(!m.z.p(var4, var7, var6 + 1)) {
                     net.u.j var26 = var8.a(var3.d(aq.EAST), 6);
                     var26 = var26.a(var3.d(aq.SOUTH), 6);
                     var1.add(new m.a(this.P, "roof_front", var26, var3.B(net.yz.l.CLOCKWISE_90)));
                  }
               }
            }
         }

         for(int var12 = 0; var12 < var4.G; ++var12) {
            for(int var14 = 0; var14 < var4.D; ++var14) {
               net.u.j var17 = var2.a(var3.d(aq.SOUTH), 8 + (var12 - this.z) * 8);
               var17 = var17.a(var3.d(aq.EAST), (var14 - this.B) * 8);
               boolean var21 = m.z.p(var5, var14, var12);
               if(m.z.p(var4, var14, var12)) {
                  if(!m.z.p(var4, var14 + 1, var12)) {
                     net.u.j var28 = var17.a(var3.d(aq.EAST), 7);
                     var1.add(new m.a(this.P, "small_wall", var28, var3));
                  }

                  if(!m.z.p(var4, var14 - 1, var12)) {
                     net.u.j var29 = var17.a(var3.d(aq.WEST), 1);
                     var29 = var29.a(var3.d(aq.SOUTH), 6);
                     var1.add(new m.a(this.P, "small_wall", var29, var3.B(net.yz.l.CLOCKWISE_180)));
                  }

                  if(!m.z.p(var4, var14, var12 - 1)) {
                     net.u.j var31 = var17.a(var3.d(aq.WEST), 0);
                     var31 = var31.a(var3.d(aq.NORTH), 1);
                     var1.add(new m.a(this.P, "small_wall", var31, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
                  }

                  if(!m.z.p(var4, var14, var12 + 1)) {
                     net.u.j var33 = var17.a(var3.d(aq.EAST), 6);
                     var33 = var33.a(var3.d(aq.SOUTH), 7);
                     var1.add(new m.a(this.P, "small_wall", var33, var3.B(net.yz.l.CLOCKWISE_90)));
                  }

                  if(!m.z.p(var4, var14 + 1, var12)) {
                     if(!m.z.p(var4, var14, var12 - 1)) {
                        net.u.j var35 = var17.a(var3.d(aq.EAST), 7);
                        var35 = var35.a(var3.d(aq.NORTH), 2);
                        var1.add(new m.a(this.P, "small_wall_corner", var35, var3));
                     }

                     if(!m.z.p(var4, var14, var12 + 1)) {
                        net.u.j var37 = var17.a(var3.d(aq.EAST), 8);
                        var37 = var37.a(var3.d(aq.SOUTH), 7);
                        var1.add(new m.a(this.P, "small_wall_corner", var37, var3.B(net.yz.l.CLOCKWISE_90)));
                     }
                  }

                  if(!m.z.p(var4, var14 - 1, var12)) {
                     if(!m.z.p(var4, var14, var12 - 1)) {
                        net.u.j var39 = var17.a(var3.d(aq.WEST), 2);
                        var39 = var39.a(var3.d(aq.NORTH), 1);
                        var1.add(new m.a(this.P, "small_wall_corner", var39, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
                     }

                     if(!m.z.p(var4, var14, var12 + 1)) {
                        net.u.j var41 = var17.a(var3.d(aq.WEST), 1);
                        var41 = var41.a(var3.d(aq.SOUTH), 8);
                        var1.add(new m.a(this.P, "small_wall_corner", var41, var3.B(net.yz.l.CLOCKWISE_180)));
                     }
                  }
               }
            }
         }

         for(int var13 = 0; var13 < var4.G; ++var13) {
            for(int var15 = 0; var15 < var4.D; ++var15) {
               net.u.j var19 = var2.a(var3.d(aq.SOUTH), 8 + (var13 - this.z) * 8);
               var19 = var19.a(var3.d(aq.EAST), (var15 - this.B) * 8);
               boolean var22 = m.z.p(var5, var15, var13);
               if(m.z.p(var4, var15, var13)) {
                  if(!m.z.p(var4, var15 + 1, var13)) {
                     net.u.j var43 = var19.a(var3.d(aq.EAST), 6);
                     if(!m.z.p(var4, var15, var13 + 1)) {
                        net.u.j var11 = var43.a(var3.d(aq.SOUTH), 6);
                        var1.add(new m.a(this.P, "roof_corner", var11, var3));
                     } else if(m.z.p(var4, var15 + 1, var13 + 1)) {
                        net.u.j var46 = var43.a(var3.d(aq.SOUTH), 5);
                        var1.add(new m.a(this.P, "roof_inner_corner", var46, var3));
                     }

                     if(!m.z.p(var4, var15, var13 - 1)) {
                        var1.add(new m.a(this.P, "roof_corner", var43, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
                     } else if(m.z.p(var4, var15 + 1, var13 - 1)) {
                        net.u.j var47 = var19.a(var3.d(aq.EAST), 9);
                        var47 = var47.a(var3.d(aq.NORTH), 2);
                        var1.add(new m.a(this.P, "roof_inner_corner", var47, var3.B(net.yz.l.CLOCKWISE_90)));
                     }
                  }

                  if(!m.z.p(var4, var15 - 1, var13)) {
                     net.u.j var44 = var19.a(var3.d(aq.EAST), 0);
                     var44 = var44.a(var3.d(aq.SOUTH), 0);
                     if(!m.z.p(var4, var15, var13 + 1)) {
                        net.u.j var49 = var44.a(var3.d(aq.SOUTH), 6);
                        var1.add(new m.a(this.P, "roof_corner", var49, var3.B(net.yz.l.CLOCKWISE_90)));
                     } else if(m.z.p(var4, var15 - 1, var13 + 1)) {
                        net.u.j var50 = var44.a(var3.d(aq.SOUTH), 8);
                        var50 = var50.a(var3.d(aq.WEST), 3);
                        var1.add(new m.a(this.P, "roof_inner_corner", var50, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
                     }

                     if(!m.z.p(var4, var15, var13 - 1)) {
                        var1.add(new m.a(this.P, "roof_corner", var44, var3.B(net.yz.l.CLOCKWISE_180)));
                     } else if(m.z.p(var4, var15 - 1, var13 - 1)) {
                        net.u.j var52 = var44.a(var3.d(aq.SOUTH), 1);
                        var1.add(new m.a(this.P, "roof_inner_corner", var52, var3.B(net.yz.l.CLOCKWISE_180)));
                     }
                  }
               }
            }
         }

      }

      private void P(List var1, m.x var2) {
         aq var3 = var2.A.d(aq.WEST);
         var1.add(new m.a(this.P, "entrance", var2.n.a(var3, 9), var2.A));
         var2.n = var2.n.a(var2.A.d(aq.SOUTH), 16);
      }

      private void F(List var1, m.x var2) {
         var1.add(new m.a(this.P, var2.i, var2.n.a(var2.A.d(aq.EAST), 7), var2.A));
         var2.n = var2.n.a(var2.A.d(aq.SOUTH), 8);
      }

      private void d(List var1, m.x var2) {
         var2.n = var2.n.a(var2.A.d(aq.SOUTH), -1);
         var1.add(new m.a(this.P, "wall_corner", var2.n, var2.A));
         var2.n = var2.n.a(var2.A.d(aq.SOUTH), -7);
         var2.n = var2.n.a(var2.A.d(aq.WEST), -6);
         var2.A = var2.A.B(net.yz.l.CLOCKWISE_90);
      }

      private void H(List var1, m.x var2) {
         var2.n = var2.n.a(var2.A.d(aq.SOUTH), 6);
         var2.n = var2.n.a(var2.A.d(aq.EAST), 8);
         var2.A = var2.A.B(net.yz.l.COUNTERCLOCKWISE_90);
      }

      private void c(List var1, net.u.j var2, net.yz.l var3, aq var4, m.l var5) {
         net.yz.l var6 = net.yz.l.NONE;
         String var7 = var5.Z(this.L);
         if(var4 != aq.EAST) {
            if(var4 == aq.NORTH) {
               var6 = var6.B(net.yz.l.COUNTERCLOCKWISE_90);
            } else if(var4 == aq.WEST) {
               var6 = var6.B(net.yz.l.CLOCKWISE_180);
            } else if(var4 == aq.SOUTH) {
               var6 = var6.B(net.yz.l.CLOCKWISE_90);
            } else {
               var7 = var5.G(this.L);
            }
         }

         net.u.j var8 = net.yj.f.d(new net.u.j(1, 0, 0), ax.NONE, var6, 7, 7);
         var6 = var6.B(var3);
         var8 = var8.N(var3);
         net.u.j var9 = var2.F(var8.t(), 0, var8.y());
         var1.add(new m.a(this.P, var7, var9, var6));
      }

      private void R(List var1, net.u.j var2, net.yz.l var3, aq var4, aq var5, m.l var6, boolean var7) {
         if(var5 == aq.EAST && var4 == aq.SOUTH) {
            net.u.j var29 = var2.a(var3.d(aq.EAST), 1);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var29, var3));
         } else if(var5 == aq.EAST && var4 == aq.NORTH) {
            net.u.j var27 = var2.a(var3.d(aq.EAST), 1);
            var27 = var27.a(var3.d(aq.SOUTH), 6);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var27, var3, ax.LEFT_RIGHT));
         } else if(var5 == aq.WEST && var4 == aq.NORTH) {
            net.u.j var25 = var2.a(var3.d(aq.EAST), 7);
            var25 = var25.a(var3.d(aq.SOUTH), 6);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var25, var3.B(net.yz.l.CLOCKWISE_180)));
         } else if(var5 == aq.WEST && var4 == aq.SOUTH) {
            net.u.j var24 = var2.a(var3.d(aq.EAST), 7);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var24, var3, ax.FRONT_BACK));
         } else if(var5 == aq.SOUTH && var4 == aq.EAST) {
            net.u.j var23 = var2.a(var3.d(aq.EAST), 1);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var23, var3.B(net.yz.l.CLOCKWISE_90), ax.LEFT_RIGHT));
         } else if(var5 == aq.SOUTH && var4 == aq.WEST) {
            net.u.j var22 = var2.a(var3.d(aq.EAST), 7);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var22, var3.B(net.yz.l.CLOCKWISE_90)));
         } else if(var5 == aq.NORTH && var4 == aq.WEST) {
            net.u.j var20 = var2.a(var3.d(aq.EAST), 7);
            var20 = var20.a(var3.d(aq.SOUTH), 6);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var20, var3.B(net.yz.l.CLOCKWISE_90), ax.FRONT_BACK));
         } else if(var5 == aq.NORTH && var4 == aq.EAST) {
            net.u.j var18 = var2.a(var3.d(aq.EAST), 1);
            var18 = var18.a(var3.d(aq.SOUTH), 6);
            var1.add(new m.a(this.P, var6.H(this.L, var7), var18, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
         } else if(var5 == aq.SOUTH && var4 == aq.NORTH) {
            net.u.j var16 = var2.a(var3.d(aq.EAST), 1);
            var16 = var16.a(var3.d(aq.NORTH), 8);
            var1.add(new m.a(this.P, var6.f(this.L, var7), var16, var3));
         } else if(var5 == aq.NORTH && var4 == aq.SOUTH) {
            net.u.j var14 = var2.a(var3.d(aq.EAST), 7);
            var14 = var14.a(var3.d(aq.SOUTH), 14);
            var1.add(new m.a(this.P, var6.f(this.L, var7), var14, var3.B(net.yz.l.CLOCKWISE_180)));
         } else if(var5 == aq.WEST && var4 == aq.EAST) {
            net.u.j var13 = var2.a(var3.d(aq.EAST), 15);
            var1.add(new m.a(this.P, var6.f(this.L, var7), var13, var3.B(net.yz.l.CLOCKWISE_90)));
         } else if(var5 == aq.EAST && var4 == aq.WEST) {
            net.u.j var11 = var2.a(var3.d(aq.WEST), 7);
            var11 = var11.a(var3.d(aq.SOUTH), 6);
            var1.add(new m.a(this.P, var6.f(this.L, var7), var11, var3.B(net.yz.l.COUNTERCLOCKWISE_90)));
         } else if(var5 == aq.UP && var4 == aq.EAST) {
            net.u.j var10 = var2.a(var3.d(aq.EAST), 15);
            var1.add(new m.a(this.P, var6.C(this.L), var10, var3.B(net.yz.l.CLOCKWISE_90)));
         } else if(var5 == aq.UP && var4 == aq.SOUTH) {
            net.u.j var8 = var2.a(var3.d(aq.EAST), 1);
            var8 = var8.a(var3.d(aq.NORTH), 0);
            var1.add(new m.a(this.P, var6.C(this.L), var8, var3));
         }

      }

      private void o(List var1, net.u.j var2, net.yz.l var3, aq var4, aq var5, m.l var6) {
         byte var7 = 0;
         byte var8 = 0;
         net.yz.l var9 = var3;
         ax var10 = ax.NONE;
         if(var5 == aq.EAST && var4 == aq.SOUTH) {
            var7 = -7;
         } else if(var5 == aq.EAST && var4 == aq.NORTH) {
            var7 = -7;
            var8 = 6;
            var10 = ax.LEFT_RIGHT;
         } else if(var5 == aq.NORTH && var4 == aq.EAST) {
            var7 = 1;
            var8 = 14;
            var9 = var3.B(net.yz.l.COUNTERCLOCKWISE_90);
         } else if(var5 == aq.NORTH && var4 == aq.WEST) {
            var7 = 7;
            var8 = 14;
            var9 = var3.B(net.yz.l.COUNTERCLOCKWISE_90);
            var10 = ax.LEFT_RIGHT;
         } else if(var5 == aq.SOUTH && var4 == aq.WEST) {
            var7 = 7;
            var8 = -8;
            var9 = var3.B(net.yz.l.CLOCKWISE_90);
         } else if(var5 == aq.SOUTH && var4 == aq.EAST) {
            var7 = 1;
            var8 = -8;
            var9 = var3.B(net.yz.l.CLOCKWISE_90);
            var10 = ax.LEFT_RIGHT;
         } else if(var5 == aq.WEST && var4 == aq.NORTH) {
            var7 = 15;
            var8 = 6;
            var9 = var3.B(net.yz.l.CLOCKWISE_180);
         } else if(var5 == aq.WEST && var4 == aq.SOUTH) {
            var7 = 15;
            var10 = ax.FRONT_BACK;
         }

         net.u.j var11 = var2.a(var3.d(aq.EAST), var7);
         var11 = var11.a(var3.d(aq.SOUTH), var8);
         var1.add(new m.a(this.P, var6.c(this.L), var11, var9, var10));
      }

      private void x(List var1, net.u.j var2, net.yz.l var3, m.l var4) {
         net.u.j var5 = var2.a(var3.d(aq.EAST), 1);
         var1.add(new m.a(this.P, var4.B(this.L), var5, var3, ax.NONE));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class x {
      public net.yz.l A;
      public net.u.j n;
      public String i;

      private x() {
      }
   }

   static class z {
      private final Random o;
      private final m.g B;
      private final m.g r;
      private final m.g[] E;
      private final int q;
      private final int Y;

      public z(Random var1) {
         this.o = var1;
         boolean var10000 = true;
         this.q = 7;
         this.Y = 4;
         this.B = new m.g(11, 11, 5);
         this.B.E(this.q, this.Y, this.q + 1, this.Y + 1, 3);
         this.B.E(this.q - 1, this.Y, this.q - 1, this.Y + 1, 2);
         this.B.E(this.q + 2, this.Y - 2, this.q + 3, this.Y + 3, 5);
         this.B.E(this.q + 1, this.Y - 2, this.q + 1, this.Y - 1, 1);
         this.B.E(this.q + 1, this.Y + 2, this.q + 1, this.Y + 3, 1);
         this.B.e(this.q - 1, this.Y - 1, 1);
         this.B.e(this.q - 1, this.Y + 2, 1);
         this.B.E(0, 0, 11, 1, 5);
         this.B.E(0, 9, 11, 11, 5);
         this.n(this.B, this.q, this.Y - 2, aq.WEST, 6);
         this.n(this.B, this.q, this.Y + 3, aq.WEST, 6);
         this.n(this.B, this.q - 2, this.Y - 1, aq.WEST, 3);
         this.n(this.B, this.q - 2, this.Y + 2, aq.WEST, 3);

         while(this.C(this.B)) {
            ;
         }

         this.E = new m.g[3];
         this.E[0] = new m.g(11, 11, 5);
         this.E[1] = new m.g(11, 11, 5);
         this.E[2] = new m.g(11, 11, 5);
         this.M(this.B, this.E[0]);
         this.M(this.B, this.E[1]);
         this.E[0].E(this.q + 1, this.Y, this.q + 1, this.Y + 1, 8388608);
         this.E[1].E(this.q + 1, this.Y, this.q + 1, this.Y + 1, 8388608);
         this.r = new m.g(this.B.D, this.B.G, 5);
         this.D();
         this.M(this.r, this.E[2]);
      }

      public static boolean p(m.g var0, int var1, int var2) {
         int var3 = var0.e(var1, var2);
         return var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4;
      }

      public boolean C(m.g var1, int var2, int var3, int var4, int var5) {
         return (this.E[var4].e(var2, var3) & '\uffff') == var5;
      }

      @Nullable
      public aq Z(m.g var1, int var2, int var3, int var4, int var5) {
         for(aq var9 : aq.u.HORIZONTAL.A()) {
            if(this.C(var1, var2 + var9.v(), var3 + var9.P(), var4, var5)) {
               return var9;
            }
         }

         return null;
      }

      private void n(m.g var1, int var2, int var3, aq var4, int var5) {
         var1.e(var2, var3, 1);
         var1.M(var2 + var4.v(), var3 + var4.P(), 0, 1);
         int var6 = 0;

         while(true) {
            aq var7 = aq.Q(this.o.nextInt(4));
            if(var7 != var4.f() && (var7 != aq.EAST || !this.o.nextBoolean())) {
               int var8 = var2 + var4.v();
               int var9 = var3 + var4.P();
               if(var1.e(var8 + var7.v(), var9 + var7.P()) == 0 && var1.e(var8 + var7.v() * 2, var9 + var7.P() * 2) == 0) {
                  this.n(var1, var2 + var4.v() + var7.v(), var3 + var4.P() + var7.P(), var7, var5 - 1);
                  aq var10 = var4.R();
                  var7 = var4.i();
                  var1.M(var2 + var10.v(), var3 + var10.P(), 0, 2);
                  var1.M(var2 + var7.v(), var3 + var7.P(), 0, 2);
                  var1.M(var2 + var4.v() + var10.v(), var3 + var4.P() + var10.P(), 0, 2);
                  var1.M(var2 + var4.v() + var7.v(), var3 + var4.P() + var7.P(), 0, 2);
                  var1.M(var2 + var4.v() * 2, var3 + var4.P() * 2, 0, 2);
                  var1.M(var2 + var10.v() * 2, var3 + var10.P() * 2, 0, 2);
                  var1.M(var2 + var7.v() * 2, var3 + var7.P() * 2, 0, 2);
                  return;
               }
            }

            ++var6;
         }
      }

      private boolean C(m.g var1) {
         boolean var2 = false;

         for(int var3 = 0; var3 < var1.G; ++var3) {
            for(int var4 = 0; var4 < var1.D; ++var4) {
               if(var1.e(var4, var3) == 0) {
                  int var5 = 0;
                  var5 = var5 + (p(var1, var4 + 1, var3)?1:0);
                  var5 = var5 + (p(var1, var4 - 1, var3)?1:0);
                  var5 = var5 + (p(var1, var4, var3 + 1)?1:0);
                  var5 = var5 + (p(var1, var4, var3 - 1)?1:0);
               }
            }
         }

         return var2;
      }

      private void D() {
         ArrayList var1 = Lists.newArrayList();
         m.g var2 = this.E[1];

         for(int var3 = 0; var3 < this.r.G; ++var3) {
            for(int var4 = 0; var4 < this.r.D; ++var4) {
               int var5 = var2.e(var4, var3);
               int var6 = var5 & 983040;
               if(var6 == 131072 && (var5 & 2097152) == 2097152) {
                  var1.add(new net.yz.y(Integer.valueOf(var4), Integer.valueOf(var3)));
               }
            }
         }

         if(var1.isEmpty()) {
            this.r.E(0, 0, this.r.D, this.r.G, 5);
         } else {
            net.yz.y var13 = (net.yz.y)var1.get(this.o.nextInt(var1.size()));
            int var14 = var2.e(((Integer)var13.e()).intValue(), ((Integer)var13.I()).intValue());
            var2.e(((Integer)var13.e()).intValue(), ((Integer)var13.I()).intValue(), var14 | 4194304);
            aq var15 = this.Z(this.B, ((Integer)var13.e()).intValue(), ((Integer)var13.I()).intValue(), 1, var14 & '\uffff');
            int var16 = ((Integer)var13.e()).intValue() + var15.v();
            int var7 = ((Integer)var13.I()).intValue() + var15.P();

            for(int var8 = 0; var8 < this.r.G; ++var8) {
               for(int var9 = 0; var9 < this.r.D; ++var9) {
                  if(!p(this.B, var9, var8)) {
                     this.r.e(var9, var8, 5);
                  } else if(var9 == ((Integer)var13.e()).intValue() && var8 == ((Integer)var13.I()).intValue()) {
                     this.r.e(var9, var8, 3);
                  } else if(var9 == var16 && var8 == var7) {
                     this.r.e(var9, var8, 3);
                     this.E[2].e(var9, var8, 8388608);
                  }
               }
            }

            ArrayList var17 = Lists.newArrayList();

            for(aq var12 : aq.u.HORIZONTAL.A()) {
               if(this.r.e(var16 + var12.v(), var7 + var12.P()) == 0) {
                  var17.add(var12);
               }
            }

            if(var17.isEmpty()) {
               this.r.E(0, 0, this.r.D, this.r.G, 5);
               var2.e(((Integer)var13.e()).intValue(), ((Integer)var13.I()).intValue(), var14);
            } else {
               aq var19 = (aq)var17.get(this.o.nextInt(var17.size()));
               this.n(this.r, var16 + var19.v(), var7 + var19.P(), var19, 4);

               while(true) {
                  if(this.C(this.r)) {
                     continue;
                  }
               }
            }
         }

      }

      private void M(m.g var1, m.g var2) {
         p.d();
         ArrayList var4 = Lists.newArrayList();
         int var5 = 0;
         if(var5 < var1.G) {
            int var6 = 0;
            if(var6 < var1.D) {
               if(var1.e(var6, var5) == 2) {
                  var4.add(new net.yz.y(Integer.valueOf(var6), Integer.valueOf(var5)));
               }

               ++var6;
            }

            ++var5;
         }

         Collections.shuffle(var4, this.o);
         var5 = 10;
         Iterator var24 = var4.iterator();
         if(var24.hasNext()) {
            net.yz.y var7 = (net.yz.y)var24.next();
            int var8 = ((Integer)var7.e()).intValue();
            int var9 = ((Integer)var7.I()).intValue();
            if(var2.e(var8, var9) == 0) {
               int var10 = var8;
               int var11 = var8;
               int var12 = var9;
               int var13 = var9;
               int var14 = 65536;
               if(var2.e(var8 + 1, var9) == 0 && var2.e(var8, var9 + 1) == 0 && var2.e(var8 + 1, var9 + 1) == 0 && var1.e(var8 + 1, var9) == 2 && var1.e(var8, var9 + 1) == 2 && var1.e(var8 + 1, var9 + 1) == 2) {
                  var11 = var8 + 1;
                  var13 = var9 + 1;
                  var14 = 262144;
               }

               if(var2.e(var8 - 1, var9) == 0 && var2.e(var8, var9 + 1) == 0 && var2.e(var8 - 1, var9 + 1) == 0 && var1.e(var8 - 1, var9) == 2 && var1.e(var8, var9 + 1) == 2 && var1.e(var8 - 1, var9 + 1) == 2) {
                  var10 = var8 - 1;
                  var13 = var9 + 1;
                  var14 = 262144;
               }

               if(var2.e(var8 - 1, var9) == 0 && var2.e(var8, var9 - 1) == 0 && var2.e(var8 - 1, var9 - 1) == 0 && var1.e(var8 - 1, var9) == 2 && var1.e(var8, var9 - 1) == 2 && var1.e(var8 - 1, var9 - 1) == 2) {
                  var10 = var8 - 1;
                  var12 = var9 - 1;
                  var14 = 262144;
               }

               if(var2.e(var8 + 1, var9) == 0 && var1.e(var8 + 1, var9) == 2) {
                  var11 = var8 + 1;
                  var14 = 131072;
               }

               if(var2.e(var8, var9 + 1) == 0 && var1.e(var8, var9 + 1) == 2) {
                  var13 = var9 + 1;
                  var14 = 131072;
               }

               if(var2.e(var8 - 1, var9) == 0 && var1.e(var8 - 1, var9) == 2) {
                  var10 = var8 - 1;
                  var14 = 131072;
               }

               if(var2.e(var8, var9 - 1) == 0 && var1.e(var8, var9 - 1) == 2) {
                  var12 = var9 - 1;
                  var14 = 131072;
               }

               int var15 = this.o.nextBoolean()?var10:var11;
               int var16 = this.o.nextBoolean()?var12:var13;
               int var17 = 2097152;
               if(!var1.l(var15, var16, 1)) {
                  var15 = var15 == var10?var11:var10;
                  var16 = var16 == var12?var13:var12;
                  if(!var1.l(var15, var16, 1)) {
                     var16 = var16 == var12?var13:var12;
                     if(!var1.l(var15, var16, 1)) {
                        var15 = var15 == var10?var11:var10;
                        var16 = var16 == var12?var13:var12;
                        if(!var1.l(var15, var16, 1)) {
                           var17 = 0;
                           var15 = var10;
                           var16 = var12;
                        }
                     }
                  }
               }

               if(var12 <= var13) {
                  if(var10 <= var11) {
                     if(var10 == var15 && var12 == var16) {
                        var2.e(var10, var12, 1048576 | var17 | var14 | var5);
                     }

                     var2.e(var10, var12, var14 | var5);
                     int var19 = var10 + 1;
                  }

                  int var18 = var12 + 1;
               }

               ++var5;
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
