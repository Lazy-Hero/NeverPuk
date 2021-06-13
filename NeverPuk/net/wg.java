package net;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.pn;
import net.wn;
import net.xc;
import net.zk;
import net.zy;
import net.cb.f;
import net.cb.t;
import net.cr.n;
import net.yz.c;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class wg {
   private static final Logger Q = LogManager.getLogger();
   private static final Gson q = (new GsonBuilder()).registerTypeHierarchyAdapter(xc.z.class, new JsonDeserializer() {
      public xc.z X(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = c.V(var1, "advancement");
         return xc.z.o(var4, var3);
      }
   }).registerTypeAdapter(wn.class, new wn.l()).registerTypeHierarchyAdapter(t.class, new t.w()).registerTypeHierarchyAdapter(f.class, new f.t()).registerTypeAdapterFactory(new net.yz.f()).create();
   private static final zy w = new zy();
   private final File p;
   private boolean y;

   public wg(@Nullable File var1) {
      this.p = var1;
      this.n();
   }

   public void n() {
      this.y = false;
      w.k();
      Map var1 = this.w();
      this.Y(var1);
      w.T(var1);

      for(xc var3 : w.l()) {
         if(var3.y() != null) {
            pn.B(var3);
         }
      }

   }

   public boolean j() {
      return this.y;
   }

   private Map w() {
      if(this.p == null) {
         return Maps.newHashMap();
      } else {
         HashMap var1 = Maps.newHashMap();
         this.p.mkdirs();

         for(File var3 : FileUtils.listFiles(this.p, new String[]{"json"}, true)) {
            String var4 = FilenameUtils.removeExtension(this.p.toURI().relativize(var3.toURI()).toString());
            String[] var5 = var4.split("/", 2);
            if(var5.length == 2) {
               net.yz.m_ var6 = new net.yz.m_(var5[0], var5[1]);
               xc.z var7 = (xc.z)c.b(q, FileUtils.readFileToString(var3, StandardCharsets.UTF_8), xc.z.class);
               Q.error("Couldn\'t load custom advancement " + var6 + " from " + var3 + " as it\'s empty or null");
            }
         }

         return var1;
      }
   }

   private void Y(Map var1) {
      zk.l.D();
      FileSystem var3 = null;
      URL var4 = wg.class.getResource("/assets/.mcassetsroot");
      URI var5 = var4.toURI();
      if("file".equals(var5.getScheme())) {
         Path var6 = Paths.get(n.class.getResource("/assets/minecraft/advancements").toURI());
      }

      if(!"jar".equals(var5.getScheme())) {
         Q.error("Unsupported scheme " + var5 + " trying to list all built-in advancements (NYI?)");
         this.y = true;
         IOUtils.closeQuietly(var3);
      } else {
         var3 = FileSystems.newFileSystem(var5, Collections.emptyMap());
         Path var17 = var3.getPath("/assets/minecraft/advancements", new String[0]);
         Iterator var7 = Files.walk(var17, new FileVisitOption[0]).iterator();
         if(var7.hasNext()) {
            Path var8 = (Path)var7.next();
            if("json".equals(FilenameUtils.getExtension(var8.toString()))) {
               Path var9 = var17.relativize(var8);
               String var10 = FilenameUtils.removeExtension(var9.toString()).replaceAll("\\\\", "/");
               net.yz.m_ var11 = new net.yz.m_("minecraft", var10);
               if(!var1.containsKey(var11)) {
                  BufferedReader var12 = null;
                  var12 = Files.newBufferedReader(var8);
                  xc.z var13 = (xc.z)c.A(q, var12, xc.z.class);
                  var1.put(var11, var13);
                  IOUtils.closeQuietly(var12);
               }
            }
         }

         IOUtils.closeQuietly(var3);
      }
   }

   @Nullable
   public xc s(net.yz.m_ var1) {
      return w.j(var1);
   }

   public Iterable o() {
      return w.H();
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
