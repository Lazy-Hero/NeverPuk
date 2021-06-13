package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.yz.ax;
import net.yz.m_;

public class fd extends f {
   private static final m_ u = new m_("fossils/fossil_spine_01");
   private static final m_ z = new m_("fossils/fossil_spine_02");
   private static final m_ j = new m_("fossils/fossil_spine_03");
   private static final m_ d = new m_("fossils/fossil_spine_04");
   private static final m_ J = new m_("fossils/fossil_spine_01_coal");
   private static final m_ V = new m_("fossils/fossil_spine_02_coal");
   private static final m_ W = new m_("fossils/fossil_spine_03_coal");
   private static final m_ h = new m_("fossils/fossil_spine_04_coal");
   private static final m_ w = new m_("fossils/fossil_skull_01");
   private static final m_ s = new m_("fossils/fossil_skull_02");
   private static final m_ M = new m_("fossils/fossil_skull_03");
   private static final m_ l = new m_("fossils/fossil_skull_04");
   private static final m_ o = new m_("fossils/fossil_skull_01_coal");
   private static final m_ E = new m_("fossils/fossil_skull_02_coal");
   private static final m_ Q = new m_("fossils/fossil_skull_03_coal");
   private static final m_ f = new m_("fossils/fossil_skull_04_coal");
   private static final m_[] I = new m_[]{u, z, j, d, w, s, M, l};
   private static final m_[] N = new m_[]{J, V, W, h, o, E, Q, f};

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      Random var5 = var1.d(var3).y(987234911L);
      net.nx.f var6 = var1.v();
      net.yz.l[] var7 = net.yz.l.values();
      net.yz.l var8 = var7[var5.nextInt(var7.length)];
      int var9 = var5.nextInt(I.length);
      f.j();
      net.yj.e var10 = var1.q().N();
      net.yj.f var11 = var10.O(var6, I[var9]);
      net.yj.f var12 = var10.O(var6, N[var9]);
      net.u.p var13 = new net.u.p(var3);
      net.y4.v var14 = new net.y4.v(var13.e(), 0, var13.P(), var13.S(), 256, var13.o());
      net.yj.y var15 = (new net.yj.y()).o(var8).X(var14).G(var5);
      net.u.j var16 = var11.e(var8);
      int var17 = var5.nextInt(16 - var16.t());
      int var18 = var5.nextInt(16 - var16.y());
      int var19 = 256;
      int var20 = 0;
      if(var20 < var16.t()) {
         int var21 = 0;
         if(var21 < var16.t()) {
            var19 = Math.min(var19, var1.J(var3.t() + var20 + var17, var3.y() + var21 + var18));
            ++var21;
            net.u.d.h(new net.u.d[1]);
         }

         ++var20;
      }

      var20 = Math.max(var19 - 15 - var5.nextInt(10), 10);
      net.u.j var25 = var11.J(var3.F(var17, var20, var18), ax.NONE, var8);
      var15.U(0.9F);
      var11.b(var1, var25, var15, 20);
      var15.U(0.1F);
      var12.b(var1, var25, var15, 20);
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
