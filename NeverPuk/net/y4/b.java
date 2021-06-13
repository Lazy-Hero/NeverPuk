package net.y4;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.y4.e;
import net.y4.f;
import net.y4.g;
import net.y4.h;
import net.y4.j;
import net.y4.l;
import net.y4.m;
import net.y4.n;
import net.y4.o;
import net.y4.p;
import net.y4.q;
import net.y4.r;
import net.y4.s;
import net.y4.t;
import net.y4.u;
import net.y4.w;
import net.y4.x;
import net.y4.y;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
   private static final Logger v = LogManager.getLogger();
   private static final Map x = Maps.newHashMap();
   private static final Map E = Maps.newHashMap();
   private static final Map f = Maps.newHashMap();
   private static final Map c = Maps.newHashMap();

   private static void M(Class var0, String var1) {
      x.put(var1, var0);
      E.put(var0, var1);
   }

   static void v(Class var0, String var1) {
      f.put(var1, var0);
      c.put(var0, var1);
   }

   public static String y(s var0) {
      return (String)E.get(var0.getClass());
   }

   public static String M(p var0) {
      return (String)c.get(var0.getClass());
   }

   @Nullable
   public static s j(net.nj.f var0, net.yv.r var1) {
      p.d();
      s var3 = null;
      Class var4 = (Class)x.get(var0.J("id"));
      if(var4 != null) {
         var3 = (s)var4.newInstance();
      }

      if(var3 != null) {
         var3.U(var1, var0);
      }

      v.warn("Skipping Structure with id {}", var0.J("id"));
      return var3;
   }

   public static p h(net.nj.f var0, net.yv.r var1) {
      p var2 = null;
      Class var3 = (Class)f.get(var0.J("id"));
      var2 = (p)var3.newInstance();
      var2.h(var1, var0);
      return var2;
   }

   static {
      M(x.class, "Mineshaft");
      M(q.b.class, "Village");
      M(n.d.class, "Fortress");
      M(l.b.class, "Stronghold");
      M(j.o.class, "Temple");
      M(y.t.class, "Monument");
      M(t.w.class, "EndCity");
      M(u.y.class, "Mansion");
      f.A();
      r.q();
      e.i();
      w.P();
      h.y();
      g.f();
      o.r();
      m.K();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
