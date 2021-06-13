package net.yh;

import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import javax.annotation.Nullable;
import net.i6;
import net.z9;
import net.yh.a;
import net.yh.b;
import net.yh.c;
import net.yh.c1;
import net.yh.c5;
import net.yh.c8;
import net.yh.c9;
import net.yh.cc;
import net.yh.ce;
import net.yh.cf;
import net.yh.cg;
import net.yh.ck;
import net.yh.cl;
import net.yh.cm;
import net.yh.cp;
import net.yh.cu;
import net.yh.cv;
import net.yh.d;
import net.yh.e;
import net.yh.f;
import net.yh.g;
import net.yh.i;
import net.yh.j;
import net.yh.k;
import net.yh.l;
import net.yh.m;
import net.yh.n;
import net.yh.o;
import net.yh.p;
import net.yh.q;
import net.yh.r;
import net.yh.s;
import net.yh.t;
import net.yh.u;
import net.yh.v;
import net.yh.w;
import net.yh.x;
import net.yh.y;
import net.yz.a5;
import net.yz.ai;
import net.yz.aq;
import net.yz.m_;

public class c7 {
   private static final m_ f = new m_("textures/particle/particles.png");
   protected net.yv.r H;
   private final ArrayDeque[][] u = new ArrayDeque[4][];
   private final Queue B = Queues.newArrayDeque();
   private final net.n9.e K;
   private final Random P = new Random();
   private final Map t = Maps.newHashMap();
   private final Queue i = Queues.newArrayDeque();

   public c7(net.yv.r var1, net.n9.e var2) {
      this.H = var1;
      this.K = var2;
      byte var3 = 0;
      this.u[var3] = new ArrayDeque[2];
      int var4 = 0;

      while(true) {
         this.u[var3][var4] = Queues.newArrayDeque();
         ++var4;
      }
   }

   private void w() {
      this.B(ai.EXPLOSION_NORMAL.b(), new v.h());
      this.B(ai.SPIT.b(), new net.yh.z());
      this.B(ai.WATER_BUBBLE.b(), new n.u());
      this.B(ai.WATER_SPLASH.b(), new ck.n());
      this.B(ai.WATER_WAKE.b(), new cp.n());
      this.B(ai.WATER_DROP.b(), new cv.z());
      this.B(ai.SUSPENDED.b(), new c9.c());
      this.B(ai.SUSPENDED_DEPTH.b(), new c8.l());
      this.B(ai.CRIT.b(), new p.a());
      this.B(ai.CRIT_MAGIC.b(), new p.r());
      this.B(ai.SMOKE_NORMAL.b(), new cc.a());
      this.B(ai.SMOKE_LARGE.b(), new cl.n());
      this.B(ai.SPELL.b(), new cg.g());
      this.B(ai.SPELL_INSTANT.b(), new cg.p());
      this.B(ai.SPELL_MOB.b(), new cg.z());
      this.B(ai.SPELL_MOB_AMBIENT.b(), new cg.l());
      this.B(ai.SPELL_WITCH.b(), new cg.d());
      this.B(ai.DRIP_WATER.b(), new g.h());
      this.B(ai.DRIP_LAVA.b(), new g.m());
      this.B(ai.VILLAGER_ANGRY.b(), new k.b());
      this.B(ai.VILLAGER_HAPPY.b(), new c8.n());
      this.B(ai.TOWN_AURA.b(), new c8.l());
      this.B(ai.NOTE.b(), new t.z());
      this.B(ai.PORTAL.b(), new f.q());
      this.B(ai.ENCHANTMENT_TABLE.b(), new y.w());
      this.B(ai.FLAME.b(), new d.r());
      this.B(ai.LAVA.b(), new u.c());
      this.B(ai.FOOTSTEP.b(), new i.e());
      this.B(ai.CLOUD.b(), new s.f());
      this.B(ai.REDSTONE.b(), new c1.a());
      this.B(ai.FALLING_DUST.b(), new a.x());
      this.B(ai.SNOWBALL.b(), new e.t());
      this.B(ai.SNOW_SHOVEL.b(), new cu.a());
      this.B(ai.SLIME.b(), new e.p());
      this.B(ai.HEART.b(), new k.q());
      this.B(ai.BARRIER.b(), new r.k());
      this.B(ai.ITEM_CRACK.b(), new e.r());
      this.B(ai.BLOCK_CRACK.b(), new o.h());
      this.B(ai.BLOCK_DUST.b(), new b.w());
      this.B(ai.EXPLOSION_HUGE.b(), new m.k());
      this.B(ai.EXPLOSION_LARGE.b(), new l.u());
      this.B(ai.FIREWORKS_SPARK.b(), new cf.v());
      this.B(ai.MOB_APPEARANCE.b(), new w.d());
      this.B(ai.DRAGON_BREATH.b(), new q.t());
      this.B(ai.END_ROD.b(), new ce.a());
      this.B(ai.DAMAGE_INDICATOR.b(), new p.q());
      this.B(ai.SWEEP_ATTACK.b(), new cm.q());
      this.B(ai.TOTEM.b(), new c5.l());
   }

   public void B(int var1, c var2) {
      this.t.put(Integer.valueOf(var1), var2);
   }

   public void Z(net.ne.l var1, ai var2) {
      this.B.add(new j(this.H, var1, var2));
   }

   public void M(net.ne.l var1, ai var2, int var3) {
      this.B.add(new j(this.H, var1, var2, var3));
   }

   @Nullable
   public x r(int var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      c var15 = (c)this.t.get(Integer.valueOf(var1));
      x var16 = var15.v(var1, this.H, var2, var4, var6, var8, var10, var12, var14);
      this.N(var16);
      return var16;
   }

   public void N(x var1) {
      if(!(var1 instanceof cf.z) || z9.W()) {
         this.i.add(var1);
      }

   }

   public void p() {
      int var1 = 0;

      while(true) {
         this.u(var1);
         ++var1;
      }
   }

   private void u(int var1) {
      this.H.M.K(String.valueOf(var1));
      int var2 = 0;

      while(true) {
         this.H.M.K(String.valueOf(var2));
         this.k(this.u[var1][var2]);
         this.H.M.N();
         ++var2;
      }
   }

   private void k(Queue var1) {
      if(!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            x var3 = (x)var2.next();
            this.o(var3);
            if(!var3.O()) {
               var2.remove();
            }
         }
      }

   }

   private void o(x var1) {
      var1.f();
   }

   public void W(net.ne.l var1, float var2) {
      float var4 = net.y.h.y();
      float var5 = net.y.h.P();
      float var6 = net.y.h.t();
      float var7 = net.y.h.d();
      float var8 = net.y.h.c();
      x.X = var1.hL + (var1.b - var1.hL) * (double)var2;
      x.z = var1.F + (var1.hS - var1.F) * (double)var2;
      x.f();
      x.U = var1.A + (var1.hr - var1.A) * (double)var2;
      x.c = var1.r(var2);
      net.y.d.C();
      net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
      net.y.d.d(516, 0.003921569F);
      int var9 = 0;
      int var11 = 0;
      if(!this.u[var9][var11].isEmpty()) {
         net.y.d.Y(false);
         net.y.d.Y(true);
         this.K.E(f);
         this.K.E(net.n9.b.N);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.r var12 = net.y.r.f();
         net.y.p var13 = var12.k();
         var13.m(7, net.y8.x.W);
         Iterator var14 = this.u[var9][var11].iterator();
         if(var14.hasNext()) {
            x var15 = (x)var14.next();
            var15.A(var13, var1, var2, var4, var8, var5, var6, var7);
         }

         var12.p();
      }

      ++var11;
      ++var9;
      net.y.d.Y(true);
      net.y.d.E();
      net.y.d.d(516, 0.1F);
   }

   public void c(net.ne.l var1, float var2) {
      float var10000 = 0.017453292F;
      float var4 = net.u.t.m(var1.hN * 0.017453292F);
      float var5 = net.u.t.A(var1.hN * 0.017453292F);
      float var6 = -var5 * net.u.t.A(var1.V * 0.017453292F);
      float var7 = var4 * net.u.t.A(var1.V * 0.017453292F);
      float var8 = net.u.t.m(var1.V * 0.017453292F);
      int var9 = 0;

      while(true) {
         ArrayDeque var10 = this.u[3][var9];
         if(!var10.isEmpty()) {
            net.y.r var11 = net.y.r.f();
            net.y.p var12 = var11.k();

            for(x var14 : var10) {
               var14.A(var12, var1, var2, var4, var8, var5, var6, var7);
            }
         }

         ++var9;
      }
   }

   public void I(@Nullable net.yv.r var1) {
      this.H = var1;
      byte var2 = 0;
      int var3 = 0;

      while(true) {
         this.u[var2][var3].clear();
         ++var3;
      }
   }

   public void j(net.u.j var1, net.yw.n var2) {
      if(i6.Md.r() && i6.CZ.r()) {
         net.y9.l var4 = var2.Q();
         if(!i6.I(var4, i6.CZ, new Object[]{var2, this.H, var1}) && !i6.I(var4, i6.Md, new Object[]{this.H, var1, this})) {
            boolean var16 = true;
         } else {
            boolean var10000 = false;
         }
      } else {
         boolean var3 = var2.n() != net.y1.l.q;
      }

      var2 = var2.J(this.H, var1);
      boolean var15 = true;
      byte var5 = 0;
      byte var6 = 0;
      int var7 = 0;

      while(true) {
         double var8 = ((double)var5 + 0.5D) / 4.0D;
         double var10 = ((double)var6 + 0.5D) / 4.0D;
         double var12 = ((double)var7 + 0.5D) / 4.0D;
         this.N((new o(this.H, (double)var1.t() + var8, (double)var1.h() + var10, (double)var1.y() + var12, var8 - 0.5D, var10 - 0.5D, var12 - 0.5D, var2)).i(var1));
         ++var7;
      }
   }

   public void r(net.u.j var1, aq var2) {
      net.yw.n var3 = this.H.Z(var1);
      if(var3.C() != a5.INVISIBLE) {
         int var4 = var1.t();
         int var5 = var1.h();
         int var6 = var1.y();
         float var10000 = 0.1F;
         net.u.e var8 = var3.q(this.H, var1);
         double var9 = (double)var4 + this.P.nextDouble() * (var8.d - var8.n - 0.20000000298023224D) + 0.10000000149011612D + var8.n;
         double var11 = (double)var5 + this.P.nextDouble() * (var8.c - var8.u - 0.20000000298023224D) + 0.10000000149011612D + var8.u;
         double var13 = (double)var6 + this.P.nextDouble() * (var8.r - var8.N - 0.20000000298023224D) + 0.10000000149011612D + var8.N;
         if(var2 == aq.DOWN) {
            var11 = (double)var5 + var8.u - 0.10000000149011612D;
         }

         if(var2 == aq.UP) {
            var11 = (double)var5 + var8.c + 0.10000000149011612D;
         }

         if(var2 == aq.NORTH) {
            var13 = (double)var6 + var8.N - 0.10000000149011612D;
         }

         if(var2 == aq.SOUTH) {
            var13 = (double)var6 + var8.r + 0.10000000149011612D;
         }

         if(var2 == aq.WEST) {
            var9 = (double)var4 + var8.n - 0.10000000149011612D;
         }

         if(var2 == aq.EAST) {
            var9 = (double)var4 + var8.d + 0.10000000149011612D;
         }

         this.N((new o(this.H, var9, var11, var13, 0.0D, 0.0D, 0.0D, var3)).i(var1).N(0.2F).A(0.6F));
      }

   }

   public String J() {
      int var1 = 0;
      byte var2 = 0;
      int var3 = 0;

      while(true) {
         var1 += this.u[var2][var3].size();
         ++var3;
      }
   }

   private boolean M(x var1, ArrayDeque var2) {
      for(x var4 : var2) {
         if(var4 instanceof r && var1.i == var4.i && var1.m == var4.m && var1.O == var4.O) {
            var4.x = 0;
            return true;
         }
      }

      return false;
   }

   public void Z(net.u.j var1, net.u.m var2) {
      net.yw.n var3 = this.H.Z(var1);
      boolean var4 = i6.I(var3.Q(), i6.uR, new Object[]{var3, this.H, var2, this});
      this.r(var1, var2.d);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
