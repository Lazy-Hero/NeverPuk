package net.y;

import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.y.p;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.gi;
import net.y9.gn;
import net.y9.gq;
import net.y9.gu;
import net.y9.gy;
import net.y9.gz;
import net.y9.l0;
import net.y9.l3;
import net.y9.l7;
import net.y9.lb;
import net.y9.lc;
import net.y9.lh;
import net.y9.li;
import net.y9.ln;
import net.y9.lo;
import net.y9.lt;
import net.y9.ly;
import net.y9.r9;
import net.y9.re;
import net.y9.rg;
import net.y9.ri;
import net.y9.rv;
import net.y9.z3;
import net.y9.z6;
import net.y9.zh;
import net.y9.zn;
import net.y9.zp;
import net.y9.zq;
import net.y9.zr;
import net.y9.zu;
import net.y9.zv;
import net.y9.zz;
import net.yz.aq;
import net.yz.m_;

public class o {
   private final Map Q = Maps.newIdentityHashMap();
   private final net.i.s Y = new net.i.s();
   private final net.ym.v i;

   public o(net.ym.v var1) {
      this.i = var1;
      this.q();
   }

   public net.i.s G() {
      return this.Y;
   }

   public net.n9.v I(net.yw.n var1) {
      net.y9.l var3 = var1.Q();
      p.S();
      net.ym.j var4 = this.Z(var1);
      if(var4 == null || var4 == this.i.f()) {
         if(var3 == net.nb.f.l || var3 == net.nb.f.uL || var3 == net.nb.f.uG || var3 == net.nb.f.dI || var3 == net.nb.f.uf || var3 == net.nb.f.TO || var3 == net.nb.f.uP) {
            return this.i.z().O("minecraft:blocks/planks_oak");
         }

         if(var3 == net.nb.f.uy) {
            return this.i.z().O("minecraft:blocks/obsidian");
         }

         if(var3 == net.nb.f.dj || var3 == net.nb.f.TL) {
            return this.i.z().O("minecraft:blocks/lava_still");
         }

         if(var3 == net.nb.f.dy || var3 == net.nb.f.uM) {
            return this.i.z().O("minecraft:blocks/water_still");
         }

         if(var3 == net.nb.f.dB) {
            return this.i.z().O("minecraft:blocks/soul_sand");
         }

         if(var3 == net.nb.f.dr) {
            return this.i.z().O("minecraft:items/barrier");
         }

         if(var3 == net.nb.f.f) {
            return this.i.z().O("minecraft:items/structure_void");
         }

         if(var3 == net.nb.f.Tv) {
            return this.i.z().O("minecraft:blocks/shulker_top_white");
         }

         if(var3 == net.nb.f.uH) {
            return this.i.z().O("minecraft:blocks/shulker_top_orange");
         }

         if(var3 == net.nb.f.TC) {
            return this.i.z().O("minecraft:blocks/shulker_top_magenta");
         }

         if(var3 == net.nb.f.d3) {
            return this.i.z().O("minecraft:blocks/shulker_top_light_blue");
         }

         if(var3 == net.nb.f.dq) {
            return this.i.z().O("minecraft:blocks/shulker_top_yellow");
         }

         if(var3 == net.nb.f.Tp) {
            return this.i.z().O("minecraft:blocks/shulker_top_lime");
         }

         if(var3 == net.nb.f.Z) {
            return this.i.z().O("minecraft:blocks/shulker_top_pink");
         }

         if(var3 == net.nb.f.dx) {
            return this.i.z().O("minecraft:blocks/shulker_top_gray");
         }

         if(var3 == net.nb.f.dC) {
            return this.i.z().O("minecraft:blocks/shulker_top_silver");
         }

         if(var3 == net.nb.f.Tw) {
            return this.i.z().O("minecraft:blocks/shulker_top_cyan");
         }

         if(var3 == net.nb.f.u0) {
            return this.i.z().O("minecraft:blocks/shulker_top_purple");
         }

         if(var3 == net.nb.f.h) {
            return this.i.z().O("minecraft:blocks/shulker_top_blue");
         }

         if(var3 == net.nb.f.t) {
            return this.i.z().O("minecraft:blocks/shulker_top_brown");
         }

         if(var3 == net.nb.f.dk) {
            return this.i.z().O("minecraft:blocks/shulker_top_green");
         }

         if(var3 == net.nb.f.dt) {
            return this.i.z().O("minecraft:blocks/shulker_top_red");
         }

         if(var3 == net.nb.f.Te) {
            return this.i.z().O("minecraft:blocks/shulker_top_black");
         }
      }

      if(var4 == null) {
         var4 = this.i.f();
      }

      return var4.o();
   }

   public net.ym.j Z(net.yw.n var1) {
      net.ym.j var2 = (net.ym.j)this.Q.get(var1);
      var2 = this.i.f();
      return var2;
   }

   public net.ym.v l() {
      return this.i;
   }

   public void A() {
      this.Q.clear();

      for(Entry var2 : this.Y.u().entrySet()) {
         this.Q.put(var2.getKey(), this.i.Y((net.ym.a)var2.getValue()));
      }

   }

   public void T(net.y9.l var1, net.i.b var2) {
      this.Y.P(var1, var2);
   }

   public void Y(net.y9.l... var1) {
      this.Y.m(var1);
   }

   private void q() {
      this.Y(new net.y9.l[]{net.nb.f.ou, net.nb.f.dy, net.nb.f.uM, net.nb.f.dj, net.nb.f.TL, net.nb.f.dK, net.nb.f.uG, net.nb.f.uy, net.nb.f.dI, net.nb.f.uL, net.nb.f.dB, net.nb.f.TG, net.nb.f.dr, net.nb.f.l, net.nb.f.TO, net.nb.f.uf, net.nb.f.dU, net.nb.f.f, net.nb.f.Tv, net.nb.f.uH, net.nb.f.TC, net.nb.f.d3, net.nb.f.dq, net.nb.f.Tp, net.nb.f.Z, net.nb.f.dx, net.nb.f.dC, net.nb.f.Tw, net.nb.f.u0, net.nb.f.h, net.nb.f.t, net.nb.f.dk, net.nb.f.dt, net.nb.f.Te, net.nb.f.uP});
      this.T(net.nb.f.oy, (new net.i.j()).r(lc.W).H());
      this.T(net.nb.f.oT, (new net.i.j()).r(gi.n).H());
      this.T(net.nb.f.Tu, (new net.i.j()).r(g6.A).O("_leaves").X(new net.yr.h[]{gh.u, gh.N}).H());
      this.T(net.nb.f.G, (new net.i.j()).r(gu.E).O("_leaves").X(new net.yr.h[]{gh.u, gh.N}).H());
      this.T(net.nb.f.dW, (new net.i.j()).X(new net.yr.h[]{z6.f}).H());
      this.T(net.nb.f.dF, (new net.i.j()).X(new net.yr.h[]{gq.R}).H());
      this.T(net.nb.f.ue, (new net.i.j()).X(new net.yr.h[]{zq.O}).H());
      this.T(net.nb.f.od, (new net.i.j()).r(ln.Q).O("_wall").H());
      this.T(net.nb.f.Tg, (new net.i.j()).r(net.y9.y.o).X(new net.yr.h[]{net.y9.y.u}).H());
      this.T(net.nb.f.P, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.u, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.u_, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.C, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.q, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.T2, (new net.i.j()).X(new net.yr.h[]{re.W}).H());
      this.T(net.nb.f.u1, (new net.i.j()).X(new net.yr.h[]{ly.u, ly.n}).H());
      this.T(net.nb.f.d6, (new net.i.j()).r(gc.F).O("_double_slab").H());
      this.T(net.nb.f.S, (new net.i.j()).r(gc.F).O("_slab").H());
      this.T(net.nb.f.T7, (new net.i.j()).X(new net.yr.h[]{l3.R}).H());
      this.T(net.nb.f.g, (new net.i.j()).X(new net.yr.h[]{rg.a}).H());
      this.T(net.nb.f.dv, (new net.i.j()).X(new net.yr.h[]{gn.J}).H());
      this.T(net.nb.f.dc, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.d0, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.T1, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.b, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.dH, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.uV, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.o2, (new net.i.j()).X(new net.yr.h[]{r9.Y}).H());
      this.T(net.nb.f.ur, (new net.i.j()).r(zv.D).O("_wool").H());
      this.T(net.nb.f.uK, (new net.i.j()).r(zv.D).O("_carpet").H());
      this.T(net.nb.f.Ty, (new net.i.j()).r(zv.D).O("_stained_hardened_clay").H());
      this.T(net.nb.f.J, (new net.i.j()).r(zv.D).O("_stained_glass_pane").H());
      this.T(net.nb.f.T5, (new net.i.j()).r(zv.D).O("_stained_glass").H());
      this.T(net.nb.f.ul, (new net.i.j()).r(lo.c).H());
      this.T(net.nb.f.Tj, (new net.i.j()).r(gy.J).H());
      this.T(net.nb.f.TU, (new net.i.j()).r(zu.p).H());
      this.T(net.nb.f.dO, (new net.i.j()).r(net.nb.f.dO.k()).H());
      this.T(net.nb.f.d2, (new net.i.j()).r(net.nb.f.d2.k()).H());
      this.T(net.nb.f.Tt, (new net.i.j()).r(lb.v).O("_slab").H());
      this.T(net.nb.f.T4, (new net.i.j()).r(l0.A).O("_slab").H());
      this.T(net.nb.f.uX, (new net.i.j()).r(lh.a).O("_monster_egg").H());
      this.T(net.nb.f.TM, (new net.i.j()).r(li.F).H());
      this.T(net.nb.f.v, (new net.i.j()).X(new net.yr.h[]{zz.J}).H());
      this.T(net.nb.f.Ta, (new net.i.j()).X(new net.yr.h[]{z3.J}).H());
      this.T(net.nb.f.u6, (new net.i.j()).r(l7.d).O("_log").H());
      this.T(net.nb.f.ub, (new net.i.j()).r(lt.k).O("_log").H());
      this.T(net.nb.f.oN, (new net.i.j()).r(gc.F).O("_planks").H());
      this.T(net.nb.f.X, (new net.i.j()).r(zp.O).O("_sapling").H());
      this.T(net.nb.f.TF, (new net.i.j()).r(ri.F).H());
      this.T(net.nb.f.uq, (new net.i.j()).X(new net.yr.h[]{zn.R}).H());
      this.T(net.nb.f.uh, (new net.i.j()).X(new net.yr.h[]{zr.k}).H());
      this.T(net.nb.f.w, (new net.i.j()).r(zv.D).O("_concrete").H());
      this.T(net.nb.f.db, (new net.i.j()).r(zv.D).O("_concrete_powder").H());
      this.T(net.nb.f.dd, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            gz.b var2 = (gz.b)var1.i(gz.D);
            switch(null.j[var2.ordinal()]) {
            case 1:
            default:
               return new net.ym.a("quartz_block", "normal");
            case 2:
               return new net.ym.a("chiseled_quartz_block", "normal");
            case 3:
               return new net.ym.a("quartz_column", "axis=y");
            case 4:
               return new net.ym.a("quartz_column", "axis=x");
            case 5:
               return new net.ym.a("quartz_column", "axis=z");
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.T(net.nb.f.dY, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            return new net.ym.a("dead_bush", "normal");
         }
      });
      this.T(net.nb.f.H, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            p.S();
            LinkedHashMap var3 = Maps.newLinkedHashMap(var1.A());
            if(var1.i(zh.p) != aq.UP) {
               var3.remove(zh.l);
            }

            return new net.ym.a((m_)net.y9.l.m.t(var1.Q()), this.o(var3));
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.T(net.nb.f.TB, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            p.S();
            LinkedHashMap var3 = Maps.newLinkedHashMap(var1.A());
            if(var1.i(zh.p) != aq.UP) {
               var3.remove(zh.l);
            }

            return new net.ym.a((m_)net.y9.l.m.t(var1.Q()), this.o(var3));
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.T(net.nb.f.dl, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            p.S();
            LinkedHashMap var3 = Maps.newLinkedHashMap(var1.A());
            String var4 = rv.l.p((Enum)((rv.m)var3.remove(rv.l)));
            if(rv.m.PODZOL != var1.i(rv.l)) {
               var3.remove(rv.Y);
            }

            return new net.ym.a(var4, this.o(var3));
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.T(net.nb.f.dn, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            LinkedHashMap var2 = Maps.newLinkedHashMap(var1.A());
            String var3 = lb.v.p((Enum)((lb.p)var2.remove(lb.v)));
            var2.remove(lb.r);
            String var4 = ((Boolean)var1.i(lb.r)).booleanValue()?"all":"normal";
            return new net.ym.a(var3 + "_double_slab", var4);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.T(net.nb.f.d_, new net.i.o() {
         protected net.ym.a g(net.yw.n var1) {
            LinkedHashMap var2 = Maps.newLinkedHashMap(var1.A());
            String var3 = l0.A.p((Enum)((l0.u)var2.remove(l0.A)));
            var2.remove(lb.r);
            String var4 = ((Boolean)var1.i(l0.n)).booleanValue()?"all":"normal";
            return new net.ym.a(var3 + "_double_slab", var4);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   private static xn a(xn var0) {
      return var0;
   }
}
