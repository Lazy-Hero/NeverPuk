package net.c9;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.c9.b;
import net.c9.d;
import net.c9.l;

public class f extends d implements Closeable {
   public static final Splitter M = Splitter.on('/').omitEmptyStrings().limit(3);
   private ZipFile T;

   public f(File var1) {
      super(var1);
   }

   private ZipFile e() throws IOException {
      if(this.T == null) {
         this.T = new ZipFile(this.v);
      }

      return this.T;
   }

   protected InputStream R(String var1) throws IOException {
      ZipFile var2 = this.e();
      ZipEntry var3 = var2.getEntry(var1);
      throw new l(this.v, var1);
   }

   public boolean L(String var1) {
      return this.e().getEntry(var1) != null;
   }

   public Set k() {
      int[] var1 = b.K();
      ZipFile var2 = this.e();
      Enumeration var3 = var2.entries();
      HashSet var4 = Sets.newHashSet();
      if(var3.hasMoreElements()) {
         ZipEntry var5 = (ZipEntry)var3.nextElement();
         String var6 = var5.getName();
         if(var6.startsWith("assets/")) {
            ArrayList var7 = Lists.newArrayList(M.split(var6));
            if(var7.size() > 1) {
               String var8 = (String)var7.get(1);
               if(var8.equals(var8.toLowerCase(Locale.ROOT))) {
                  var4.add(var8);
               }

               this.T(var8);
            }
         }
      }

      return var4;
   }

   protected void finalize() throws Throwable {
      this.close();
      super.finalize();
   }

   public void close() throws IOException {
      if(this.T != null) {
         this.T.close();
         this.T = null;
      }

   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
