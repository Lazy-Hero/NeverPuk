package net.yj;

import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;
import net.c0.d;
import net.c0.q;
import net.nj.x;
import net.yj.f;
import net.yz.m_;
import org.apache.commons.io.IOUtils;

public class e {
   private final Map Z = Maps.newHashMap();
   private final String e;
   private final d f;

   public e(String var1, d var2) {
      this.e = var1;
      this.f = var2;
   }

   public f O(@Nullable net.nx.f var1, m_ var2) {
      f var3 = this.p(var1, var2);
      var3 = new f();
      this.Z.put(var2.v(), var3);
      return var3;
   }

   @Nullable
   public f p(@Nullable net.nx.f var1, m_ var2) {
      String var3 = var2.v();
      if(this.Z.containsKey(var3)) {
         return (f)this.Z.get(var3);
      } else {
         this.e(var2);
         return this.Z.containsKey(var3)?(f)this.Z.get(var3):null;
      }
   }

   public boolean X(m_ var1) {
      String var2 = var1.v();
      File var3 = new File(this.e, var2 + ".nbt");
      if(!var3.exists()) {
         return this.e(var1);
      } else {
         FileInputStream var4 = null;
         var4 = new FileInputStream(var3);
         this.X(var2, var4);
         boolean var6 = true;
         IOUtils.closeQuietly(var4);
         return var6;
      }
   }

   private boolean e(m_ var1) {
      String var2 = var1.A();
      String var3 = var1.v();
      InputStream var4 = null;
      var4 = net.nx.f.class.getResourceAsStream("/assets/" + var2 + "/structures/" + var3 + ".nbt");
      this.X(var3, var4);
      boolean var6 = true;
      IOUtils.closeQuietly(var4);
      return var6;
   }

   private void X(String var1, InputStream var2) throws IOException {
      net.nj.f var3 = x.r(var2);
      if(!var3.K("DataVersion", 99)) {
         var3.r("DataVersion", 500);
      }

      f var4 = new f();
      var4.t(this.f.V(q.STRUCTURE, var3));
      this.Z.put(var1, var4);
   }

   public boolean v(@Nullable net.nx.f var1, m_ var2) {
      f.W();
      String var4 = var2.v();
      if(this.Z.containsKey(var4)) {
         File var5 = new File(this.e);
         if(!var5.exists()) {
            if(!var5.mkdirs()) {
               return false;
            }
         } else if(!var5.isDirectory()) {
            return false;
         }

         File var6 = new File(var5, var4 + ".nbt");
         f var7 = (f)this.Z.get(var4);
         FileOutputStream var8 = null;
         net.nj.f var10 = var7.Z(new net.nj.f());
         var8 = new FileOutputStream(var6);
         x.z(var10, var8);
         boolean var11 = true;
         IOUtils.closeQuietly(var8);
         return var11;
      } else {
         return false;
      }
   }

   public void r(m_ var1) {
      this.Z.remove(var1.v());
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
