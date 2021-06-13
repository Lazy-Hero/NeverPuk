package net.y7;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.g.s;
import net.o.v;
import net.y7.a;
import net.y7.b;
import net.y7.o;
import net.y7.p;
import net.y7.r;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t {
   private static final Logger Q = LogManager.getLogger();
   private static final Gson Y = (new GsonBuilder()).registerTypeAdapter(b.class, new b.g()).registerTypeAdapter(a.class, new a.o()).registerTypeAdapter(net.y7.z.class, new net.y7.z()).registerTypeHierarchyAdapter(o.class, new o.g()).registerTypeHierarchyAdapter(net.o.a.class, new v.j()).registerTypeHierarchyAdapter(net.g.x.class, new s.j()).registerTypeHierarchyAdapter(r.h.class, new r.h.t()).create();
   private final LoadingCache B = CacheBuilder.newBuilder().build(new t.u());
   private final File M;

   public t(@Nullable File var1) {
      this.M = var1;
      this.k();
   }

   public net.y7.z k(m_ var1) {
      return (net.y7.z)this.B.getUnchecked(var1);
   }

   public void k() {
      this.B.invalidateAll();
      p.h();
      Iterator var2 = p.g().iterator();
      if(var2.hasNext()) {
         m_ var3 = (m_)var2.next();
         this.k(var3);
      }

   }

   class u extends CacheLoader {
      private u() {
      }

      public net.y7.z m(m_ var1) throws Exception {
         if(var1.v().contains(".")) {
            t.Q.debug("Invalid loot table name \'{}\' (can\'t contain periods)", var1);
            return net.y7.z.G;
         } else {
            net.y7.z var2 = this.G(var1);
            var2 = this.j(var1);
            var2 = net.y7.z.G;
            t.Q.warn("Couldn\'t find resource table {}", var1);
            return var2;
         }
      }

      @Nullable
      private net.y7.z G(m_ var1) {
         int[] var2 = p.h();
         if(t.this.M == null) {
            return null;
         } else {
            File var3 = new File(new File(t.this.M, var1.A()), var1.v() + ".json");
            if(var3.exists()) {
               if(var3.isFile()) {
                  String var4 = Files.toString(var3, StandardCharsets.UTF_8);
                  return (net.y7.z)net.yz.c.b(t.Y, var4, net.y7.z.class);
               } else {
                  t.Q.warn("Expected to find loot table {} at {} but it was a folder.", var1, var3);
                  return net.y7.z.G;
               }
            } else {
               return null;
            }
         }
      }

      @Nullable
      private net.y7.z j(m_ var1) {
         URL var2 = t.class.getResource("/assets/" + var1.A() + "/loot_tables/" + var1.v() + ".json");
         String var3 = Resources.toString(var2, StandardCharsets.UTF_8);
         return (net.y7.z)net.yz.c.b(t.Y, var3, net.y7.z.class);
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
