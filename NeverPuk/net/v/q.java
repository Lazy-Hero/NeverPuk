package net.v;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.cb.h;
import net.cr.i;
import net.cr.s;
import net.n0.ks;
import net.nb.j;
import net.ne.v;
import net.v.f;
import net.v.n;
import net.v.o;
import net.y9.l;
import net.yz.m_;

public class q {
   protected static final Map g = Maps.newHashMap();
   public static final List gq = Lists.newArrayList();
   public static final List L = Lists.newArrayList();
   public static final List h = Lists.newArrayList();
   public static final List y = Lists.newArrayList();
   public static final n M = (new o("stat.leaveGame", new h("stat.leaveGame", new Object[0]))).h().i();
   public static final n gS = (new o("stat.playOneMinute", new h("stat.playOneMinute", new Object[0]), n.y)).h().i();
   public static final n t = (new o("stat.timeSinceDeath", new h("stat.timeSinceDeath", new Object[0]), n.y)).h().i();
   public static final n b = (new o("stat.sneakTime", new h("stat.sneakTime", new Object[0]), n.y)).h().i();
   public static final n l = (new o("stat.walkOneCm", new h("stat.walkOneCm", new Object[0]), n.O)).h().i();
   public static final n q = (new o("stat.crouchOneCm", new h("stat.crouchOneCm", new Object[0]), n.O)).h().i();
   public static final n K = (new o("stat.sprintOneCm", new h("stat.sprintOneCm", new Object[0]), n.O)).h().i();
   public static final n E = (new o("stat.swimOneCm", new h("stat.swimOneCm", new Object[0]), n.O)).h().i();
   public static final n z = (new o("stat.fallOneCm", new h("stat.fallOneCm", new Object[0]), n.O)).h().i();
   public static final n N = (new o("stat.climbOneCm", new h("stat.climbOneCm", new Object[0]), n.O)).h().i();
   public static final n k = (new o("stat.flyOneCm", new h("stat.flyOneCm", new Object[0]), n.O)).h().i();
   public static final n a = (new o("stat.diveOneCm", new h("stat.diveOneCm", new Object[0]), n.O)).h().i();
   public static final n Q = (new o("stat.minecartOneCm", new h("stat.minecartOneCm", new Object[0]), n.O)).h().i();
   public static final n s = (new o("stat.boatOneCm", new h("stat.boatOneCm", new Object[0]), n.O)).h().i();
   public static final n F = (new o("stat.pigOneCm", new h("stat.pigOneCm", new Object[0]), n.O)).h().i();
   public static final n g0 = (new o("stat.horseOneCm", new h("stat.horseOneCm", new Object[0]), n.O)).h().i();
   public static final n B = (new o("stat.aviateOneCm", new h("stat.aviateOneCm", new Object[0]), n.O)).h().i();
   public static final n U = (new o("stat.jump", new h("stat.jump", new Object[0]))).h().i();
   public static final n m = (new o("stat.drop", new h("stat.drop", new Object[0]))).h().i();
   public static final n H = (new o("stat.damageDealt", new h("stat.damageDealt", new Object[0]), n.a)).i();
   public static final n r = (new o("stat.damageTaken", new h("stat.damageTaken", new Object[0]), n.a)).i();
   public static final n n = (new o("stat.deaths", new h("stat.deaths", new Object[0]))).i();
   public static final n V = (new o("stat.mobKills", new h("stat.mobKills", new Object[0]))).i();
   public static final n I = (new o("stat.animalsBred", new h("stat.animalsBred", new Object[0]))).i();
   public static final n Y = (new o("stat.playerKills", new h("stat.playerKills", new Object[0]))).i();
   public static final n j = (new o("stat.fishCaught", new h("stat.fishCaught", new Object[0]))).i();
   public static final n D = (new o("stat.talkedToVillager", new h("stat.talkedToVillager", new Object[0]))).i();
   public static final n T = (new o("stat.tradedWithVillager", new h("stat.tradedWithVillager", new Object[0]))).i();
   public static final n C = (new o("stat.cakeSlicesEaten", new h("stat.cakeSlicesEaten", new Object[0]))).i();
   public static final n O = (new o("stat.cauldronFilled", new h("stat.cauldronFilled", new Object[0]))).i();
   public static final n gr = (new o("stat.cauldronUsed", new h("stat.cauldronUsed", new Object[0]))).i();
   public static final n S = (new o("stat.armorCleaned", new h("stat.armorCleaned", new Object[0]))).i();
   public static final n c = (new o("stat.bannerCleaned", new h("stat.bannerCleaned", new Object[0]))).i();
   public static final n Z = (new o("stat.brewingstandInteraction", new h("stat.brewingstandInteraction", new Object[0]))).i();
   public static final n J = (new o("stat.beaconInteraction", new h("stat.beaconInteraction", new Object[0]))).i();
   public static final n i = (new o("stat.dropperInspected", new h("stat.dropperInspected", new Object[0]))).i();
   public static final n v = (new o("stat.hopperInspected", new h("stat.hopperInspected", new Object[0]))).i();
   public static final n gz = (new o("stat.dispenserInspected", new h("stat.dispenserInspected", new Object[0]))).i();
   public static final n P = (new o("stat.noteblockPlayed", new h("stat.noteblockPlayed", new Object[0]))).i();
   public static final n gP = (new o("stat.noteblockTuned", new h("stat.noteblockTuned", new Object[0]))).i();
   public static final n x = (new o("stat.flowerPotted", new h("stat.flowerPotted", new Object[0]))).i();
   public static final n G = (new o("stat.trappedChestTriggered", new h("stat.trappedChestTriggered", new Object[0]))).i();
   public static final n R = (new o("stat.enderchestOpened", new h("stat.enderchestOpened", new Object[0]))).i();
   public static final n p = (new o("stat.itemEnchanted", new h("stat.itemEnchanted", new Object[0]))).i();
   public static final n e = (new o("stat.recordPlayed", new h("stat.recordPlayed", new Object[0]))).i();
   public static final n W = (new o("stat.furnaceInteraction", new h("stat.furnaceInteraction", new Object[0]))).i();
   public static final n gL = (new o("stat.craftingTableInteraction", new h("stat.workbenchInteraction", new Object[0]))).i();
   public static final n A = (new o("stat.chestOpened", new h("stat.chestOpened", new Object[0]))).i();
   public static final n w = (new o("stat.sleepInBed", new h("stat.sleepInBed", new Object[0]))).i();
   public static final n u = (new o("stat.shulkerBoxOpened", new h("stat.shulkerBoxOpened", new Object[0]))).i();
   private static final n[] X = new n[4096];
   private static final n[] f = new n[32000];
   private static final n[] o = new n[32000];
   private static final n[] g2 = new n[32000];
   private static final n[] d = new n[32000];
   private static final n[] gH = new n[32000];

   @Nullable
   public static n i(l var0) {
      return X[l.h(var0)];
   }

   @Nullable
   public static n W(net.n0.y var0) {
      return f[net.n0.y.h(var0)];
   }

   @Nullable
   public static n H(net.n0.y var0) {
      return o[net.n0.y.h(var0)];
   }

   @Nullable
   public static n u(net.n0.y var0) {
      return g2[net.n0.y.h(var0)];
   }

   @Nullable
   public static n y(net.n0.y var0) {
      return d[net.n0.y.h(var0)];
   }

   @Nullable
   public static n R(net.n0.y var0) {
      return gH[net.n0.y.h(var0)];
   }

   public static void l() {
      T();
      Z();
      N();
      P();
      B();
   }

   private static void P() {
      n.h();
      HashSet var1 = Sets.newHashSet();
      Iterator var2 = net.cr.n.v.iterator();
      if(var2.hasNext()) {
         s var3 = (s)var2.next();
         ks var4 = var3.E();
         if(!var4.B()) {
            var1.add(var3.E().Z());
         }
      }

      var2 = i.z().e().values().iterator();
      if(var2.hasNext()) {
         ks var8 = (ks)var2.next();
         var1.add(var8.Z());
      }

      var2 = var1.iterator();
      if(var2.hasNext()) {
         net.n0.y var9 = (net.n0.y)var2.next();
         if(var9 != null) {
            int var10 = net.n0.y.h(var9);
            String var5 = R(var9);
            f[var10] = (new f("stat.craftItem.", var5, new h("stat.craftItem", new Object[]{(new ks(var9)).b()}), var9)).i();
         }
      }

      K(f);
   }

   private static void T() {
      for(l var1 : l.m) {
         net.n0.y var2 = net.n0.y.q(var1);
         if(var2 != j.SL) {
            int var3 = l.h(var1);
            String var4 = R(var2);
            if(var1.Z()) {
               X[var3] = (new f("stat.mineBlock.", var4, new h("stat.mineBlock", new Object[]{(new ks(var1)).b()}), var2)).i();
               y.add((f)X[var3]);
            }
         }
      }

      K(X);
   }

   private static void Z() {
      for(net.n0.y var1 : net.n0.y.V) {
         int var2 = net.n0.y.h(var1);
         String var3 = R(var1);
         o[var2] = (new f("stat.useItem.", var3, new h("stat.useItem", new Object[]{(new ks(var1)).b()}), var1)).i();
         if(!(var1 instanceof net.n0.q)) {
            h.add((f)o[var2]);
         }
      }

      K(o);
   }

   private static void N() {
      for(net.n0.y var1 : net.n0.y.V) {
         int var2 = net.n0.y.h(var1);
         String var3 = R(var1);
         if(var1.P()) {
            g2[var2] = (new f("stat.breakItem.", var3, new h("stat.breakItem", new Object[]{(new ks(var1)).b()}), var1)).i();
         }
      }

      K(g2);
   }

   private static void B() {
      for(net.n0.y var1 : net.n0.y.V) {
         int var2 = net.n0.y.h(var1);
         String var3 = R(var1);
         d[var2] = (new f("stat.pickup.", var3, new h("stat.pickup", new Object[]{(new ks(var1)).b()}), var1)).i();
         gH[var2] = (new f("stat.drop.", var3, new h("stat.drop", new Object[]{(new ks(var1)).b()}), var1)).i();
      }

      K(g2);
   }

   private static String R(net.n0.y var0) {
      m_ var1 = (m_)net.n0.y.V.t(var0);
      return var1.toString().replace(':', '.');
   }

   private static void K(n[] var0) {
      y(var0, net.nb.f.uM, net.nb.f.dy);
      y(var0, net.nb.f.TL, net.nb.f.dj);
      y(var0, net.nb.f.N, net.nb.f.TS);
      y(var0, net.nb.f.d7, net.nb.f.uY);
      y(var0, net.nb.f.r, net.nb.f.uT);
      y(var0, net.nb.f.da, net.nb.f.dQ);
      y(var0, net.nb.f.B, net.nb.f.dA);
      y(var0, net.nb.f.ut, net.nb.f.dz);
      y(var0, net.nb.f.F, net.nb.f.uv);
      y(var0, net.nb.f.dn, net.nb.f.Tt);
      y(var0, net.nb.f.d6, net.nb.f.S);
      y(var0, net.nb.f.d_, net.nb.f.T4);
      y(var0, net.nb.f.p, net.nb.f.dl);
      y(var0, net.nb.f.dJ, net.nb.f.dl);
   }

   private static void y(n[] var0, l var1, l var2) {
      int var3 = l.h(var1);
      int var4 = l.h(var2);
      if(var0[var3] != null && var0[var4] == null) {
         var0[var4] = var0[var3];
      } else {
         gq.remove(var0[var3]);
         y.remove(var0[var3]);
         L.remove(var0[var3]);
         var0[var3] = var0[var4];
      }

   }

   public static n T(v.m var0) {
      String var1 = v.L(var0.g);
      return null;
   }

   public static n S(v.m var0) {
      String var1 = v.L(var0.g);
      return null;
   }

   @Nullable
   public static n O(String var0) {
      return (n)g.get(var0);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
