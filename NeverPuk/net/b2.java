package net;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.zk;
import net.n8.a;
import net.n8.b;
import net.n8.c;
import net.n8.d;
import net.n8.e;
import net.n8.f;
import net.n8.h;
import net.n8.i;
import net.n8.k;
import net.n8.m;
import net.n8.n;
import net.n8.o;
import net.n8.p;
import net.n8.r;
import net.n8.s;
import net.n8.u;
import net.n8.y;

public class b2 {
   private static final Map z = Maps.newHashMap();
   public static final c B = (c)F(new c());
   public static final f Q = (f)F(new f(new net.yz.m_("player_killed_entity")));
   public static final f q = (f)F(new f(new net.yz.m_("entity_killed_player")));
   public static final net.n8.v_ F = (net.n8.v_)F(new net.n8.v_());
   public static final d d = (d)F(new d());
   public static final u C = (u)F(new u());
   public static final net.n8.vr i = (net.n8.vr)F(new net.n8.vr());
   public static final e K = (e)F(new e());
   public static final a I = (a)F(new a());
   public static final b b = (b)F(new b());
   public static final net.n8.z G = (net.n8.z)F(new net.n8.z());
   public static final net.n8.v V = (net.n8.v)F(new net.n8.v());
   public static final net.n8.vy O = (net.n8.vy)F(new net.n8.vy());
   public static final net.n8.v8 T = (net.n8.v8)F(new net.n8.v8());
   public static final s u = (s)F(new s(new net.yz.m_("location")));
   public static final s e = (s)F(new s(new net.yz.m_("slept_in_bed")));
   public static final m U = (m)F(new m());
   public static final net.n8.vd w = (net.n8.vd)F(new net.n8.vd());
   public static final p h = (p)F(new p());
   public static final h g = (h)F(new h());
   public static final net.n8.ve v = (net.n8.ve)F(new net.n8.ve());
   public static final i x = (i)F(new i());
   public static final k t = (k)F(new k());
   public static final n D = (n)F(new n());
   public static final y j = (y)F(new y());
   public static final r s = (r)F(new r());
   public static final net.n8.v6 W = (net.n8.v6)F(new net.n8.v6());
   public static final o R = (o)F(new o());

   private static zk F(zk var0) {
      if(z.containsKey(var0.y())) {
         throw new IllegalArgumentException("Duplicate criterion id " + var0.y());
      } else {
         z.put(var0.y(), var0);
         return var0;
      }
   }

   @Nullable
   public static zk Z(net.yz.m_ var0) {
      return (zk)z.get(var0);
   }

   public static Iterable z() {
      return z.values();
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
