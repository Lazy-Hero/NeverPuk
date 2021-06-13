package net.ym;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.b4;
import net.du;
import net.i6;
import net.mf;
import net.os;
import net.rd;
import net.wh;
import net.xm;
import net.y.o;
import net.ym.a;
import net.ym.b;
import net.ym.d;
import net.ym.f;
import net.ym.g;
import net.ym.i;
import net.ym.j;
import net.ym.k;
import net.ym.m;
import net.ym.r;
import net.ym.t;
import net.ym.u;
import net.ym.w;
import net.ym.x;
import net.ym.y;
import net.yz.aq;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p {
   private static final Set a = Sets.newHashSet(new m_[]{new m_("blocks/water_flow"), new m_("blocks/water_still"), new m_("blocks/lava_flow"), new m_("blocks/lava_still"), new m_("blocks/water_overlay"), new m_("blocks/destroy_stage_0"), new m_("blocks/destroy_stage_1"), new m_("blocks/destroy_stage_2"), new m_("blocks/destroy_stage_3"), new m_("blocks/destroy_stage_4"), new m_("blocks/destroy_stage_5"), new m_("blocks/destroy_stage_6"), new m_("blocks/destroy_stage_7"), new m_("blocks/destroy_stage_8"), new m_("blocks/destroy_stage_9"), new m_("items/empty_armor_slot_helmet"), new m_("items/empty_armor_slot_chestplate"), new m_("items/empty_armor_slot_leggings"), new m_("items/empty_armor_slot_boots"), new m_("items/empty_armor_slot_shield"), new m_("blocks/shulker_top_white"), new m_("blocks/shulker_top_orange"), new m_("blocks/shulker_top_magenta"), new m_("blocks/shulker_top_light_blue"), new m_("blocks/shulker_top_yellow"), new m_("blocks/shulker_top_lime"), new m_("blocks/shulker_top_pink"), new m_("blocks/shulker_top_gray"), new m_("blocks/shulker_top_silver"), new m_("blocks/shulker_top_cyan"), new m_("blocks/shulker_top_purple"), new m_("blocks/shulker_top_blue"), new m_("blocks/shulker_top_brown"), new m_("blocks/shulker_top_green"), new m_("blocks/shulker_top_red"), new m_("blocks/shulker_top_black")});
   private static final Logger g = LogManager.getLogger();
   protected static final a K = new a("builtin/missing", "missing");
   private static final String z = "{    \'textures\': {       \'particle\': \'missingno\',       \'missingno\': \'missingno\'    },    \'elements\': [         {  \'from\': [ 0, 0, 0 ],            \'to\': [ 16, 16, 16 ],            \'faces\': {                \'down\':  { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'down\',  \'texture\': \'#missingno\' },                \'up\':    { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'up\',    \'texture\': \'#missingno\' },                \'north\': { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'north\', \'texture\': \'#missingno\' },                \'south\': { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'south\', \'texture\': \'#missingno\' },                \'west\':  { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'west\',  \'texture\': \'#missingno\' },                \'east\':  { \'uv\': [ 0, 0, 16, 16 ], \'cullface\': \'east\',  \'texture\': \'#missingno\' }            }        }    ]}".replaceAll("\'", "\"");
   private static final Map s = Maps.newHashMap();
   private static final Joiner A = Joiner.on(" -> ");
   private final net.c9.p b;
   private final Map U = Maps.newHashMap();
   private final Map Y = Maps.newLinkedHashMap();
   private final Map w = Maps.newLinkedHashMap();
   private final Map F = Maps.newLinkedHashMap();
   private final net.n9.b j;
   private final o d;
   private final i T = new i();
   private final k V = new k();
   private final net.c.w O = new net.c.w();
   private static final String i = "{    \'elements\': [        {   \'from\': [0, 0, 0],            \'to\': [16, 16, 16],            \'faces\': {                \'down\': {\'uv\': [0, 0, 16, 16], \'texture\': \'\' }            }        }    ]}".replaceAll("\'", "\"");
   private static final y L = y.z(i);
   private static final y f = y.z(i);
   private final Map r = Maps.newLinkedHashMap();
   private final Map v = Maps.newHashMap();
   private final Map M = Maps.newIdentityHashMap();
   private static final Map q = Maps.newHashMap();

   public p(net.c9.p var1, net.n9.b var2, o var3) {
      this.b = var1;
      this.j = var2;
      this.d = var3;
   }

   public net.c.r R() {
      this.S();
      this.n();
      this.N();
      this.P();
      this.l();
      this.G();
      this.f();
      return this.O;
   }

   private void S() {
      net.i.s var1 = this.d.G();

      for(net.y9.l var3 : net.y9.l.m) {
         for(m_ var5 : var1.M(var3)) {
            this.F(var1, var3, var5);
         }
      }

   }

   protected void F(net.i.s var1, net.y9.l var2, final m_ var3) {
      x var4 = this.m(var3);
      Map var5 = var1.I(var2);
      if(var4.F()) {
         HashSet var6 = Sets.newHashSet(var5.values());
         var4.j().i(var2.j());
         Collection var7 = (Collection)this.F.get(var4);
         ArrayList var11 = Lists.newArrayList();
         var11.addAll(Lists.newArrayList(Iterables.filter(var6, new Predicate() {
            public boolean R(@Nullable a var1) {
               return var3.equals(var1);
            }
         })));
         this.T((x)var4, (Collection)var11);
      }

      for(Entry var12 : var5.entrySet()) {
         a var8 = (a)var12.getValue();
         if(var3.equals(var8)) {
            if(i6.MF.I()) {
               this.n(var4, var8);
            } else {
               this.w.put(var8, var4.k(var8.w()));
            }
         }
      }

   }

   private void n() {
      this.w.put(K, new w(Lists.newArrayList(new u[]{new u(new m_(K.v()), d.X0_Y0, false, 1)})));
      this.x();
      this.Z();
      this.E();
      this.a();
      rd.l();
      rd.Q(this);
   }

   private void x() {
      m_ var1 = new m_("item_frame");
      x var2 = this.m(var1);
      this.n(var2, new a(var1, "normal"));
      this.n(var2, new a(var1, "map"));
   }

   private void n(x var1, a var2) {
      this.w.put(var2, var1.k(var2.w()));
   }

   private x m(m_ var1) {
      m_ var2 = this.Z(var1);
      x var3 = (x)this.v.get(var2);
      var3 = this.q(var1, var2);
      this.v.put(var2, var3);
      return var3;
   }

   private x q(m_ var1, m_ var2) {
      ArrayList var3 = Lists.newArrayList();

      for(net.c9.q var5 : this.b.R(var2)) {
         var3.add(this.X(var1, var5));
      }

      return new x(var3);
   }

   private x X(m_ var1, net.c9.q var2) {
      InputStream var3 = null;
      var3 = var2.k();
      x var4;
      if(i6.Ci.r()) {
         var4 = (x)i6.H(i6.Ci, new Object[]{new InputStreamReader(var3, StandardCharsets.UTF_8), var1});
      } else {
         var4 = x.Z(new InputStreamReader(var3, StandardCharsets.UTF_8));
      }

      IOUtils.closeQuietly(var3);
      return var4;
   }

   private m_ Z(m_ var1) {
      return new m_(var1.A(), "blockstates/" + var1.v() + ".json");
   }

   private void Z() {
      for(Entry var2 : this.w.entrySet()) {
         this.L((a)var2.getKey(), (w)var2.getValue());
      }

   }

   private void E() {
      for(Entry var2 : this.F.entrySet()) {
         a var3 = (a)((Collection)var2.getValue()).iterator().next();

         for(w var5 : ((x)var2.getKey()).J()) {
            this.L(var3, var5);
         }
      }

   }

   private void L(a var1, w var2) {
      for(u var4 : var2.k()) {
         m_ var5 = var4.z();
         if(this.Y.get(var5) == null) {
            this.Y.put(var5, this.P(var5));
         }
      }

   }

   private y P(m_ var1) throws IOException {
      InputStreamReader var2 = null;
      net.c9.q var3 = null;
      String var5 = var1.v();
      if("builtin/generated".equals(var5)) {
         y var16 = L;
         IOUtils.closeQuietly(var2);
         IOUtils.closeQuietly(var3);
         return var16;
      } else if(!"builtin/entity".equals(var5)) {
         if(var5.startsWith("builtin/")) {
            String var15 = var5.substring("builtin/".length());
            String var17 = (String)s.get(var15);
            throw new FileNotFoundException(var1.toString());
         } else {
            var1 = this.W(var1);
            var3 = this.b.A(var1);
            var2 = new InputStreamReader(var3.k(), StandardCharsets.UTF_8);
            y var14 = y.N(var2);
            var14.I = var1.toString();
            String var7 = os.K(var1.v());
            T(var14, var7);
            IOUtils.closeQuietly(var2);
            IOUtils.closeQuietly(var3);
            return var14;
         }
      } else {
         y var6 = f;
         IOUtils.closeQuietly(var2);
         IOUtils.closeQuietly(var3);
         return var6;
      }
   }

   private m_ W(m_ var1) {
      String var2 = var1.v();
      if(!var2.startsWith("mcpatcher") && !var2.startsWith("optifine")) {
         return new m_(var1.A(), "models/" + var1.v() + ".json");
      } else {
         if(!var2.endsWith(".json")) {
            var1 = new m_(var1.A(), var2 + ".json");
         }

         return var1;
      }
   }

   private void a() {
      this.M();

      for(net.n0.y var2 : net.n0.y.V) {
         for(String var4 : this.v(var2)) {
            m_ var5 = this.Y(var4);
            m_ var6 = (m_)net.n0.y.V.t(var2);
            this.E(var4, var5, var6);
            if(var2.v()) {
               y var7 = (y)this.Y.get(var5);

               for(m_ var9 : var7.T()) {
                  this.E(var9.toString(), var9, var6);
               }
            }
         }
      }

   }

   public void E(String var1, m_ var2, m_ var3) {
      this.r.put(var1, var2);
      if(this.Y.get(var2) == null) {
         y var4 = this.P(var2);
         this.Y.put(var2, var4);
      }

   }

   private void M() {
      this.M.clear();
      this.M.put(net.n0.y.q(net.nb.f.oy), Lists.newArrayList(new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"}));
      this.M.put(net.n0.y.q(net.nb.f.dl), Lists.newArrayList(new String[]{"dirt", "coarse_dirt", "podzol"}));
      this.M.put(net.n0.y.q(net.nb.f.oN), Lists.newArrayList(new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"}));
      this.M.put(net.n0.y.q(net.nb.f.X), Lists.newArrayList(new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"}));
      this.M.put(net.n0.y.q(net.nb.f.TF), Lists.newArrayList(new String[]{"sand", "red_sand"}));
      this.M.put(net.n0.y.q(net.nb.f.u6), Lists.newArrayList(new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"}));
      this.M.put(net.n0.y.q(net.nb.f.Tu), Lists.newArrayList(new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"}));
      this.M.put(net.n0.y.q(net.nb.f.um), Lists.newArrayList(new String[]{"sponge", "sponge_wet"}));
      this.M.put(net.n0.y.q(net.nb.f.ul), Lists.newArrayList(new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"}));
      this.M.put(net.n0.y.q(net.nb.f.Tj), Lists.newArrayList(new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"}));
      this.M.put(net.n0.y.q(net.nb.f.TU), Lists.newArrayList(new String[]{"dead_bush", "tall_grass", "fern"}));
      this.M.put(net.n0.y.q(net.nb.f.dY), Lists.newArrayList(new String[]{"dead_bush"}));
      this.M.put(net.n0.y.q(net.nb.f.ur), Lists.newArrayList(new String[]{"black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"}));
      this.M.put(net.n0.y.q(net.nb.f.dO), Lists.newArrayList(new String[]{"dandelion"}));
      this.M.put(net.n0.y.q(net.nb.f.d2), Lists.newArrayList(new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}));
      this.M.put(net.n0.y.q(net.nb.f.Tt), Lists.newArrayList(new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}));
      this.M.put(net.n0.y.q(net.nb.f.T4), Lists.newArrayList(new String[]{"red_sandstone_slab"}));
      this.M.put(net.n0.y.q(net.nb.f.T5), Lists.newArrayList(new String[]{"black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"}));
      this.M.put(net.n0.y.q(net.nb.f.uX), Lists.newArrayList(new String[]{"stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"}));
      this.M.put(net.n0.y.q(net.nb.f.TM), Lists.newArrayList(new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"}));
      this.M.put(net.n0.y.q(net.nb.f.S), Lists.newArrayList(new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"}));
      this.M.put(net.n0.y.q(net.nb.f.od), Lists.newArrayList(new String[]{"cobblestone_wall", "mossy_cobblestone_wall"}));
      this.M.put(net.n0.y.q(net.nb.f.uc), Lists.newArrayList(new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"}));
      this.M.put(net.n0.y.q(net.nb.f.dd), Lists.newArrayList(new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"}));
      t.v();
      this.M.put(net.n0.y.q(net.nb.f.Ty), Lists.newArrayList(new String[]{"black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"}));
      this.M.put(net.n0.y.q(net.nb.f.J), Lists.newArrayList(new String[]{"black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"}));
      this.M.put(net.n0.y.q(net.nb.f.G), Lists.newArrayList(new String[]{"acacia_leaves", "dark_oak_leaves"}));
      this.M.put(net.n0.y.q(net.nb.f.ub), Lists.newArrayList(new String[]{"acacia_log", "dark_oak_log"}));
      this.M.put(net.n0.y.q(net.nb.f.oT), Lists.newArrayList(new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"}));
      this.M.put(net.n0.y.q(net.nb.f.uK), Lists.newArrayList(new String[]{"black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"}));
      this.M.put(net.n0.y.q(net.nb.f.Tg), Lists.newArrayList(new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"}));
      this.M.put(net.nb.j.u, Lists.newArrayList(new String[]{"coal", "charcoal"}));
      this.M.put(net.nb.j.YB, Lists.newArrayList(new String[]{"cod", "salmon", "clownfish", "pufferfish"}));
      this.M.put(net.nb.j.YY, Lists.newArrayList(new String[]{"cooked_cod", "cooked_salmon"}));
      this.M.put(net.nb.j.n, Lists.newArrayList(new String[]{"dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"}));
      this.M.put(net.nb.j.I, Lists.newArrayList(new String[]{"bottle_drinkable"}));
      this.M.put(net.nb.j.Y9, Lists.newArrayList(new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"}));
      this.M.put(net.nb.j.YD, Lists.newArrayList(new String[]{"bottle_splash"}));
      this.M.put(net.nb.j.Wg, Lists.newArrayList(new String[]{"bottle_lingering"}));
      this.M.put(net.n0.y.q(net.nb.f.w), Lists.newArrayList(new String[]{"black_concrete", "red_concrete", "green_concrete", "brown_concrete", "blue_concrete", "purple_concrete", "cyan_concrete", "silver_concrete", "gray_concrete", "pink_concrete", "lime_concrete", "yellow_concrete", "light_blue_concrete", "magenta_concrete", "orange_concrete", "white_concrete"}));
      this.M.put(net.n0.y.q(net.nb.f.db), Lists.newArrayList(new String[]{"black_concrete_powder", "red_concrete_powder", "green_concrete_powder", "brown_concrete_powder", "blue_concrete_powder", "purple_concrete_powder", "cyan_concrete_powder", "silver_concrete_powder", "gray_concrete_powder", "pink_concrete_powder", "lime_concrete_powder", "yellow_concrete_powder", "light_blue_concrete_powder", "magenta_concrete_powder", "orange_concrete_powder", "white_concrete_powder"}));
      this.M.put(net.n0.y.q(net.nb.f.ou), Collections.emptyList());
      this.M.put(net.n0.y.q(net.nb.f.P), Lists.newArrayList(new String[]{"oak_fence_gate"}));
      this.M.put(net.n0.y.q(net.nb.f.I), Lists.newArrayList(new String[]{"oak_fence"}));
      this.M.put(net.nb.j.s, Lists.newArrayList(new String[]{"oak_door"}));
      this.M.put(net.nb.j.Yb, Lists.newArrayList(new String[]{"oak_boat"}));
      this.M.put(net.nb.j.YJ, Lists.newArrayList(new String[]{"totem"}));
      Iterator var2 = q.entrySet().iterator();
      if(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.M.put(((du)var3.getKey()).t(), Lists.newArrayList(((Set)var3.getValue()).iterator()));
      }

   }

   private List v(net.n0.y var1) {
      List var2 = (List)this.M.get(var1);
      var2 = Collections.singletonList(((m_)net.n0.y.V.t(var1)).toString());
      return var2;
   }

   private m_ Y(String var1) {
      m_ var2 = new m_(var1);
      if(i6.MI.l()) {
         var2 = new m_(var1.replaceAll("#.*", ""));
      }

      return new m_(var2.A(), "item/" + var2.v());
   }

   private void G() {
      for(a var2 : this.w.keySet()) {
         j var3 = this.w((w)this.w.get(var2), var2.toString());
         this.O.H(var2, var3);
      }

      for(Entry var11 : this.F.entrySet()) {
         x var12 = (x)var11.getKey();
         net.y5.n var4 = var12.j();
         String var5 = ((m_)net.y9.l.m.t(var4.k().b())).toString();
         r.m var6 = new r.m();

         for(net.y5.y var8 : var4.P()) {
            j var9 = this.w(var8.L(), "selector of " + var5);
            var6.J(var8.b(var4.k()), var9);
         }

         j var13 = var6.i();

         for(a var15 : (Collection)var11.getValue()) {
            if(!var12.v(var15.w())) {
               this.O.H(var15, var13);
            }
         }
      }

   }

   @Nullable
   private j w(w var1, String var2) {
      if(var1.k().isEmpty()) {
         return null;
      } else {
         f.r var3 = new f.r();
         int var4 = 0;

         for(u var6 : var1.k()) {
            y var7 = (y)this.Y.get(var6.z());
            if(var7.t()) {
               if(var7.s().isEmpty()) {
                  g.warn("Missing elements for: {}", var2);
               } else {
                  j var8 = this.a(var7, var6.p(), var6.a());
                  ++var4;
                  var3.l(var8, var6.t());
               }
            } else {
               g.warn("Missing model for: {}", var2);
            }
         }

         Object var9 = null;
         g.warn("No weighted models for: {}", var2);
         return (j)var9;
      }
   }

   private void f() {
      for(Entry var2 : this.r.entrySet()) {
         m_ var3 = (m_)var2.getValue();
         a var4 = new a((String)var2.getKey(), "inventory");
         if(i6.MI.l()) {
            var4 = (a)i6.H(i6.MM, new Object[]{var2.getKey()});
         }

         y var5 = (y)this.Y.get(var3);
         if(var5.t()) {
            if(var5.s().isEmpty()) {
               g.warn("Missing elements for: {}", var3);
            } else if(this.j(var5)) {
               this.O.H(var4, new m(var5.H(), var5.p()));
            } else {
               j var6 = this.a(var5, d.X0_Y0, false);
               this.O.H(var4, var6);
            }
         } else {
            g.warn("Missing model for: {}", var3);
         }
      }

   }

   private Set T() {
      t.V();
      HashSet var2 = Sets.newHashSet();
      ArrayList var3 = Lists.newArrayList(this.w.keySet());
      Collections.sort(var3, new Comparator() {
         public int O(a var1, a var2) {
            return var1.toString().compareTo(var2.toString());
         }
      });
      Iterator var4 = var3.iterator();
      if(var4.hasNext()) {
         a var5 = (a)var4.next();
         w var6 = (w)this.w.get(var5);
         Iterator var7 = var6.k().iterator();
         if(var7.hasNext()) {
            u var8 = (u)var7.next();
            y var9 = (y)this.Y.get(var8.z());
            if(var9 == null) {
               g.warn("Missing model for: {}", var5);
            }

            var2.addAll(this.Y(var9));
         }
      }

      var4 = this.F.keySet().iterator();
      if(var4.hasNext()) {
         x var12 = (x)var4.next();
         Iterator var13 = var12.j().K().iterator();
         if(var13.hasNext()) {
            w var14 = (w)var13.next();
            Iterator var15 = var14.k().iterator();
            if(var15.hasNext()) {
               u var16 = (u)var15.next();
               y var10 = (y)this.Y.get(var16.z());
               if(var10 == null) {
                  g.warn("Missing model for: {}", net.y9.l.m.t(var12.j().k().b()));
               }

               var2.addAll(this.Y(var10));
            }
         }
      }

      var2.addAll(a);
      return var2;
   }

   @Nullable
   public j a(y var1, d var2, boolean var3) {
      net.n9.v var4 = (net.n9.v)this.U.get(new m_(var1.Y("particle")));
      b.o var5 = (new b.o(var1, var1.p())).X(var4);
      if(var1.s().isEmpty()) {
         return null;
      } else {
         for(g var7 : var1.s()) {
            for(aq var9 : var7.X.keySet()) {
               net.ym.z var10 = (net.ym.z)var7.X.get(var9);
               net.n9.v var11 = (net.n9.v)this.U.get(new m_(var1.Y(var10.V)));
               if(var10.M == null) {
                  var5.e(this.y(var7, var10, var11, var9, var2, var3));
               } else {
                  var5.T(var2.q(var10.M), this.y(var7, var10, var11, var9, var2, var3));
               }
            }
         }

         return var5.F();
      }
   }

   protected j q(y var1, b4 var2, boolean var3) {
      net.n9.v var4 = (net.n9.v)this.U.get(new m_(var1.Y("particle")));
      b.o var5 = (new b.o(var1, var1.p())).X(var4);
      if(var1.s().isEmpty()) {
         return null;
      } else {
         for(g var7 : var1.s()) {
            for(aq var9 : var7.X.keySet()) {
               net.ym.z var10 = (net.ym.z)var7.X.get(var9);
               net.n9.v var11 = (net.n9.v)this.U.get(new m_(var1.Y(var10.V)));
               boolean var12 = true;
               if(i6.MI.l()) {
                  var12 = xm.s(var2.j());
               }

               if(var10.M != null) {
                  var5.T(var2.O(var10.M), this.V(var7, var10, var11, var9, var2, var3));
               } else {
                  var5.e(this.V(var7, var10, var11, var9, var2, var3));
               }
            }
         }

         return var5.F();
      }
   }

   private t y(g var1, net.ym.z var2, net.n9.v var3, aq var4, d var5, boolean var6) {
      return i6.MI.l()?this.y(var1, var2, var3, var4, var5, var6):this.T.d(var1.Z, var1.e, var2, var3, var4, var5, var1.L, var6, var1.H);
   }

   protected t V(g var1, net.ym.z var2, net.n9.v var3, aq var4, b4 var5, boolean var6) {
      return this.T.k(var1.Z, var1.e, var2, var3, var4, var5, var1.L, var6, var1.H);
   }

   private void N() {
      this.c();

      for(y var2 : this.Y.values()) {
         var2.A(this.Y);
      }

      y.n(this.Y);
   }

   private void c() {
      ArrayDeque var1 = Queues.newArrayDeque();
      HashSet var2 = Sets.newHashSet();

      for(m_ var4 : this.Y.keySet()) {
         var2.add(var4);
         this.Y(var1, var2, (y)this.Y.get(var4));
      }

      while(!var1.isEmpty()) {
         m_ var5 = (m_)var1.pop();
         if(this.Y.get(var5) == null) {
            y var6 = this.P(var5);
            this.Y.put(var5, var6);
            this.Y(var1, var2, var6);
            var2.add(var5);
         }
      }

   }

   private void Y(Deque var1, Set var2, y var3) {
      m_ var4 = var3.V();
      if(!var2.contains(var4)) {
         var1.add(var4);
      }

   }

   private List K(m_ var1) {
      ArrayList var2 = Lists.newArrayList(new m_[]{var1});
      m_ var3 = var1;

      while((var3 = this.f(var3)) != null) {
         var2.add(0, var3);
      }

      return var2;
   }

   @Nullable
   private m_ f(m_ var1) {
      for(Entry var3 : this.Y.entrySet()) {
         y var4 = (y)var3.getValue();
         if(var1.equals(var4.V())) {
            return (m_)var3.getKey();
         }
      }

      return null;
   }

   private Set Y(y var1) {
      HashSet var2 = Sets.newHashSet();

      for(g var4 : var1.s()) {
         for(net.ym.z var6 : var4.X.values()) {
            m_ var7 = new m_(var1.Y(var6.V));
            var2.add(var7);
         }
      }

      var2.add(new m_(var1.Y("particle")));
      return var2;
   }

   private void P() {
      final Set var1 = this.T();
      var1.addAll(this.J());
      var1.remove(net.n9.b.i);
      net.n9.u var2 = new net.n9.u() {
         public void w(net.n9.b var1x) {
            t.V();
            Iterator var3 = var1.iterator();
            if(var3.hasNext()) {
               m_ var4 = (m_)var3.next();
               net.n9.v var5 = var1x.f(var4);
               p.this.U.put(var4, var5);
            }

         }
      };
      this.j.Z(this.b, var2);
      this.U.put(new m_("missingno"), this.j.s());
   }

   private Set J() {
      HashSet var1 = Sets.newHashSet();

      for(m_ var3 : this.r.values()) {
         y var4 = (y)this.Y.get(var3);
         var1.add(new m_(var4.Y("particle")));
         if(this.A(var4)) {
            for(String var11 : k.w) {
               var1.add(new m_(var4.Y(var11)));
            }
         } else if(!this.j(var4)) {
            for(g var6 : var4.s()) {
               for(net.ym.z var8 : var6.X.values()) {
                  m_ var9 = new m_(var4.Y(var8.V));
                  var1.add(var9);
               }
            }
         }
      }

      return var1;
   }

   private boolean A(@Nullable y var1) {
      return false;
   }

   private boolean j(@Nullable y var1) {
      return false;
   }

   private void l() {
      for(m_ var2 : this.r.values()) {
         y var3 = (y)this.Y.get(var2);
         if(this.A(var3)) {
            y var4 = this.m(var3);
            var4.I = var2.toString();
            this.Y.put(var2, var4);
         } else if(this.j(var3)) {
            this.Y.put(var2, var3);
         }
      }

      for(net.n9.v var6 : this.U.values()) {
         if(!var6.Q()) {
            var6.J();
         }
      }

   }

   private y m(y var1) {
      return this.V.C(this.j, var1);
   }

   public y N(m_ var1) {
      y var2 = (y)this.Y.get(var1);
      return var2;
   }

   public static void T(y var0, String var1) {
      m_ var2 = I(var0.Q, var1);
      if(var2 != var0.Q) {
         var0.Q = var2;
      }

      if(var0.F != null) {
         for(Entry var4 : var0.F.entrySet()) {
            String var5 = (String)var4.getValue();
            String var6 = x(var5, var1);
            if(var6 != var5) {
               var4.setValue(var6);
            }
         }
      }

   }

   public static m_ I(m_ var0, String var1) {
      if(!var0.A().equals("minecraft")) {
         return var0;
      } else {
         String var2 = var0.v();
         String var3 = x(var2, var1);
         if(var3 != var2) {
            var0 = new m_(var0.A(), var3);
         }

         return var0;
      }
   }

   private static String x(String var0, String var1) {
      var0 = os.b(var0, var1);
      var0 = wh.u(var0, ".json");
      var0 = wh.u(var0, ".png");
      return var0;
   }

   protected void T(x var1, Collection var2) {
      this.F.put(var1, var2);
   }

   public static void z(net.n0.y var0, m_... var1) {
      du var2 = (du)i6.G((Object)var0, (mf)i6.MF);
      if(!q.containsKey(var2)) {
         q.put(var2, Sets.newHashSet());
      }

      for(m_ var6 : var1) {
         ((Set)q.get(var2)).add(var6.toString());
      }

   }

   static {
      s.put("missing", z);
      L.I = "generation marker";
      f.I = "block entity marker";
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
