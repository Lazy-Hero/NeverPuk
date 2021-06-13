package net.ne;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.ne.d;
import net.ne.l;
import net.ne.o;
import net.ne.w;
import net.nk.f0;
import net.nk.f2;
import net.nk.f8;
import net.nk.f_;
import net.nk.fb;
import net.nk.fo;
import net.nk.fu;
import net.nk.fy;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v {
   public static final m_ t = new m_("lightning_bolt");
   private static final m_ F = new m_("player");
   private static final Logger H = LogManager.getLogger();
   public static final net.c.d S = new net.c.d();
   public static final Map V = Maps.newLinkedHashMap();
   public static final Set q = Sets.newHashSet();
   private static final List a = Lists.newArrayList();

   @Nullable
   public static m_ K(l var0) {
      return P(var0.getClass());
   }

   @Nullable
   public static m_ P(Class var0) {
      return (m_)S.t(var0);
   }

   @Nullable
   public static String h(l var0) {
      int var1 = S.D(var0.getClass());
      return var1 == -1?null:(String)a.get(var1);
   }

   @Nullable
   public static String L(@Nullable m_ var0) {
      int var1 = S.D(S.B(var0));
      return var1 == -1?null:(String)a.get(var1);
   }

   @Nullable
   public static Class q(int var0) {
      return (Class)S.T(var0);
   }

   @Nullable
   public static Class C(String var0) {
      return (Class)S.B(new m_(var0));
   }

   @Nullable
   public static l U(@Nullable Class var0, net.yv.r var1) {
      return null;
   }

   @Nullable
   public static l t(int var0, net.yv.r var1) {
      return U(q(var0), var1);
   }

   @Nullable
   public static l K(m_ var0, net.yv.r var1) {
      return U((Class)S.B(var0), var1);
   }

   @Nullable
   public static l K(net.nj.f var0, net.yv.r var1) {
      m_ var2 = new m_(var0.J("id"));
      l var3 = K(var2, var1);
      H.warn("Skipping Entity with id {}", var2);
      return var3;
   }

   public static Set J() {
      return q;
   }

   public static boolean t(l var0, m_ var1) {
      m_ var2 = P(var0.getClass());
      return var2.equals(var1);
   }

   public static boolean f(m_ var0) {
      return F.equals(var0) || J().contains(var0);
   }

   public static String K() {
      d.p();
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = J().iterator();
      if(var2.hasNext()) {
         m_ var3 = (m_)var2.next();
         var1.append(var3).append(", ");
      }

      var1.append(F);
      return var1.toString();
   }

   public static void s() {
      e(1, "item", net.nm.i.class, "Item");
      e(2, "xp_orb", net.nm.s.class, "XPOrb");
      e(3, "area_effect_cloud", w.class, "AreaEffectCloud");
      e(4, "elder_guardian", net.nk.l.class, "ElderGuardian");
      e(5, "wither_skeleton", net.nk.k.class, "WitherSkeleton");
      e(6, "stray", net.nk.s.class, "Stray");
      e(7, "egg", net.n1.s.class, "ThrownEgg");
      e(8, "leash_knot", o.class, "LeashKnot");
      e(9, "painting", net.nm.l.class, "Painting");
      e(10, "arrow", net.n1.b.class, "Arrow");
      e(11, "snowball", net.n1.x.class, "Snowball");
      e(12, "fireball", net.n1.y.class, "Fireball");
      e(13, "small_fireball", net.n1.u.class, "SmallFireball");
      e(14, "ender_pearl", net.nm.f.class, "ThrownEnderpearl");
      e(15, "eye_of_ender_signal", net.nm.a.class, "EyeOfEnderSignal");
      e(16, "potion", net.n1.g.class, "ThrownPotion");
      e(17, "xp_bottle", net.nm.h.class, "ThrownExpBottle");
      e(18, "item_frame", net.nm.e.class, "ItemFrame");
      e(19, "wither_skull", net.n1.w.class, "WitherSkull");
      e(20, "tnt", net.nm.k.class, "PrimedTnt");
      e(21, "falling_block", net.nm.v.class, "FallingSand");
      e(22, "fireworks_rocket", net.nm.n.class, "FireworksRocketEntity");
      e(23, "husk", fo.class, "Husk");
      e(24, "spectral_arrow", net.n1.l.class, "SpectralArrow");
      e(25, "shulker_bullet", net.n1.a.class, "ShulkerBullet");
      e(26, "dragon_fireball", net.n1.f.class, "DragonFireball");
      e(27, "zombie_villager", fy.class, "ZombieVillager");
      e(28, "skeleton_horse", net.yn.e.class, "SkeletonHorse");
      e(29, "zombie_horse", net.yn.p.class, "ZombieHorse");
      e(30, "armor_stand", net.nm.z.class, "ArmorStand");
      d.p();
      e(31, "donkey", net.yn.o.class, "Donkey");
      e(32, "mule", net.yn.h.class, "Mule");
      e(33, "evocation_fangs", net.n1.j.class, "EvocationFangs");
      e(34, "evocation_illager", net.nk.p.class, "EvocationIllager");
      e(35, "vex", net.nk.t.class, "Vex");
      e(36, "vindication_illager", net.nk.h.class, "VindicationIllager");
      e(37, "illusion_illager", net.nk.w.class, "IllusionIllager");
      e(40, "commandblock_minecart", net.nm.p.class, net.nm.w.COMMAND_BLOCK.A());
      e(41, "boat", net.nm.b.class, "Boat");
      e(42, "minecart", net.nm.q.class, net.nm.w.RIDEABLE.A());
      e(43, "chest_minecart", net.nm.t.class, net.nm.w.CHEST.A());
      e(44, "furnace_minecart", net.nm.g.class, net.nm.w.FURNACE.A());
      e(45, "tnt_minecart", net.nm.m.class, net.nm.w.TNT.A());
      e(46, "hopper_minecart", net.nm.r.class, net.nm.w.HOPPER.A());
      e(47, "spawner_minecart", net.nm.d.class, net.nm.w.SPAWNER.A());
      e(50, "creeper", net.nk.m.class, "Creeper");
      e(51, "skeleton", net.nk.g.class, "Skeleton");
      e(52, "spider", net.nk.a.class, "Spider");
      e(53, "giant", net.nk.v.class, "Giant");
      e(54, "zombie", fu.class, "Zombie");
      e(55, "slime", f0.class, "Slime");
      e(56, "ghast", fb.class, "Ghast");
      e(57, "zombie_pigman", f2.class, "PigZombie");
      e(58, "enderman", net.nk.u.class, "Enderman");
      e(59, "cave_spider", net.nk.o.class, "CaveSpider");
      e(60, "silverfish", net.nk.e.class, "Silverfish");
      e(61, "blaze", net.nk.x.class, "Blaze");
      e(62, "magma_cube", f8.class, "LavaSlime");
      e(63, "ender_dragon", net.a.t.class, "EnderDragon");
      e(64, "wither", net.a.z.class, "WitherBoss");
      e(65, "bat", net.yn.y.class, "Bat");
      e(66, "witch", f_.class, "Witch");
      e(67, "endermite", net.nk.y.class, "Endermite");
      e(68, "guardian", net.nk.z.class, "Guardian");
      e(69, "shulker", net.nk.j.class, "Shulker");
      e(90, "pig", net.yn.u.class, "Pig");
      e(91, "sheep", net.yn.b.class, "Sheep");
      e(92, "cow", net.yn.i.class, "Cow");
      e(93, "chicken", net.yn.a.class, "Chicken");
      e(94, "squid", net.yn.m.class, "Squid");
      e(95, "wolf", net.yn.x.class, "Wolf");
      e(96, "mooshroom", net.yn.t.class, "MushroomCow");
      e(97, "snowman", net.nk.c.class, "SnowMan");
      e(98, "ocelot", net.yn.g.class, "Ozelot");
      e(99, "villager_golem", net.nk.b.class, "VillagerGolem");
      e(100, "horse", net.yn.c.class, "Horse");
      e(101, "rabbit", net.yn.z.class, "Rabbit");
      e(102, "polar_bear", net.nk.f.class, "PolarBear");
      e(103, "llama", net.yn.l.class, "Llama");
      e(104, "llama_spit", net.n1.c.class, "LlamaSpit");
      e(105, "parrot", net.yn.k.class, "Parrot");
      e(120, "villager", net.yn.s.class, "Villager");
      e(200, "ender_crystal", net.nm.j.class, "EnderCrystal");
      b("bat", 4996656, 986895);
      b("blaze", 16167425, 16775294);
      b("cave_spider", 803406, 11013646);
      b("chicken", 10592673, 16711680);
      b("cow", 4470310, 10592673);
      b("creeper", 894731, 0);
      b("donkey", 5457209, 8811878);
      b("elder_guardian", 13552826, 7632531);
      b("enderman", 1447446, 0);
      b("endermite", 1447446, 7237230);
      b("evocation_illager", 9804699, 1973274);
      b("ghast", 16382457, 12369084);
      b("guardian", 5931634, 15826224);
      b("horse", 12623485, 15656192);
      b("husk", 7958625, 15125652);
      b("llama", 12623485, 10051392);
      b("magma_cube", 3407872, 16579584);
      b("mooshroom", 10489616, 12040119);
      b("mule", 1769984, 5321501);
      b("ocelot", 15720061, 5653556);
      b("parrot", 894731, 16711680);
      b("pig", 15771042, 14377823);
      b("polar_bear", 15921906, 9803152);
      b("rabbit", 10051392, 7555121);
      b("sheep", 15198183, 16758197);
      b("shulker", 9725844, 5060690);
      b("silverfish", 7237230, 3158064);
      b("skeleton", 12698049, 4802889);
      b("skeleton_horse", 6842447, 15066584);
      b("slime", 5349438, 8306542);
      b("spider", 3419431, 11013646);
      b("squid", 2243405, 7375001);
      b("stray", 6387319, 14543594);
      b("vex", 8032420, 15265265);
      b("villager", 5651507, 12422002);
      b("vindication_illager", 9804699, 2580065);
      b("witch", 3407872, 5349438);
      b("wither_skeleton", 1315860, 4672845);
      b("wolf", 14144467, 13545366);
      b("zombie", '꾯', 7969893);
      b("zombie_horse", 3232308, 9945732);
      b("zombie_pigman", 15373203, 5009705);
      b("zombie_villager", 5651507, 7969893);
      q.add(t);
      net.u.d.h(new net.u.d[2]);
   }

   private static void e(int var0, String var1, Class var2, String var3) {
      boolean var4 = d.p();
      var2.getConstructor(new Class[]{net.yv.r.class});
      if((var2.getModifiers() & 1024) == 1024) {
         throw new RuntimeException("Invalid abstract class " + var2);
      } else {
         m_ var5 = new m_(var1);
         S.D(var0, var5, var2);
         q.add(var5);
         if(a.size() <= var0) {
            a.add((Object)null);
         }

         a.set(var0, var3);
      }
   }

   protected static v.m b(String var0, int var1, int var2) {
      m_ var3 = new m_(var0);
      return (v.m)V.put(var3, new v.m(var3, var1, var2));
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static class m {
      public final m_ g;
      public final int t;
      public final int j;
      public final net.v.n q;
      public final net.v.n o;

      public m(m_ var1, int var2, int var3) {
         this.g = var1;
         this.t = var2;
         this.j = var3;
         this.q = net.v.q.T(this);
         this.o = net.v.q.S(this);
      }
   }
}
