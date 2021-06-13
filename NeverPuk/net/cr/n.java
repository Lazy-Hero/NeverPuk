package net.cr;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.c.d;
import net.cr.a;
import net.cr.c;
import net.cr.e;
import net.cr.g;
import net.cr.j;
import net.cr.k;
import net.cr.r;
import net.cr.s;
import net.cr.t;
import net.cr.v;
import net.cr.w;
import net.cr.y;
import net.n0.ks;
import net.nl.ze;
import net.yz.m_;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n {
   private static final Logger X = LogManager.getLogger();
   private static int x;
   public static final d v = new d();

   public static boolean q() {
      n("armordye", new c());
      n("bookcloning", new g());
      n("mapcloning", new r());
      n("mapextending", new a());
      n("fireworks", new k());
      n("repairitem", new net.cr.z());
      n("tippedarrow", new t());
      n("bannerduplicate", new e.g());
      n("banneraddpattern", new e.p());
      n("shielddecoration", new w.e());
      n("shulkerboxcoloring", new y.m());
      return F();
   }

   private static boolean F() {
      j.Y();
      FileSystem var1 = null;
      Gson var2 = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
      URL var4 = n.class.getResource("/assets/.mcassetsroot");
      URI var5 = var4.toURI();
      if("file".equals(var5.getScheme())) {
         Path var6 = Paths.get(n.class.getResource("/assets/minecraft/recipes").toURI());
      }

      if(!"jar".equals(var5.getScheme())) {
         X.error("Unsupported scheme " + var5 + " trying to list all recipes");
         boolean var20 = false;
         IOUtils.closeQuietly(var1);
         return var20;
      } else {
         var1 = FileSystems.newFileSystem(var5, Collections.emptyMap());
         Path var19 = var1.getPath("/assets/minecraft/recipes", new String[0]);
         Iterator var7 = Files.walk(var19, new FileVisitOption[0]).iterator();
         if(var7.hasNext()) {
            Path var8 = (Path)var7.next();
            if("json".equals(FilenameUtils.getExtension(var8.toString()))) {
               Path var9 = var19.relativize(var8);
               String var10 = FilenameUtils.removeExtension(var9.toString()).replaceAll("\\\\", "/");
               new m_(var10);
               BufferedReader var12 = null;
               var12 = Files.newBufferedReader(var8);
               n(var10, s((JsonObject)net.yz.c.A(var2, var12, JsonObject.class)));
               IOUtils.closeQuietly(var12);
            }
         }

         boolean var21 = true;
         IOUtils.closeQuietly(var1);
         return var21;
      }
   }

   private static s s(JsonObject var0) {
      String var1 = net.yz.c.X(var0, "type");
      if("crafting_shaped".equals(var1)) {
         return j.S(var0);
      } else if("crafting_shapeless".equals(var1)) {
         return v.O(var0);
      } else {
         throw new JsonSyntaxException("Invalid or unsupported recipe type \'" + var1 + "\'");
      }
   }

   public static void n(String var0, s var1) {
      O(new m_(var0), var1);
   }

   public static void O(m_ var0, s var1) {
      if(v.l(var0)) {
         throw new IllegalStateException("Duplicate recipe ignored with ID " + var0);
      } else {
         v.D(x++, var0, var1);
      }
   }

   public static ks d(ze var0, net.yv.r var1) {
      for(s var3 : v) {
         if(var3.c(var0, var1)) {
            return var3.h(var0);
         }
      }

      return ks.a;
   }

   @Nullable
   public static s m(ze var0, net.yv.r var1) {
      for(s var3 : v) {
         if(var3.c(var0, var1)) {
            return var3;
         }
      }

      return null;
   }

   public static net.yz.w S(ze var0, net.yv.r var1) {
      for(s var3 : v) {
         if(var3.c(var0, var1)) {
            return var3.K(var0);
         }
      }

      net.yz.w var4 = net.yz.w.C(var0.e(), ks.a);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         var4.set(var5, var0.A(var5));
      }

      return var4;
   }

   @Nullable
   public static s o(m_ var0) {
      return (s)v.B(var0);
   }

   public static int x(s var0) {
      return v.D(var0);
   }

   @Nullable
   public static s E(int var0) {
      return (s)v.T(var0);
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
