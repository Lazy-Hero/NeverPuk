package net.c9;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;
import net.c9.b;
import net.c9.d;
import net.c9.l;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class t extends d {
   private static final boolean F = net.yz.h.M() == net.yz.h.WINDOWS;
   private static final CharMatcher I = CharMatcher.is('\\');

   public t(File var1) {
      super(var1);
   }

   protected static boolean D(File var0, String var1) throws IOException {
      String var2 = var0.getCanonicalPath();
      if(F) {
         var2 = I.replaceFrom(var2, '/');
      }

      return var2.endsWith(var1);
   }

   protected InputStream R(String var1) throws IOException {
      File var2 = this.I(var1);
      throw new l(this.v, var1);
   }

   protected boolean L(String var1) {
      return this.I(var1) != null;
   }

   @Nullable
   private File I(String var1) {
      File var2 = new File(this.v, var1);
      return var2.isFile() && D(var2, var1)?var2:null;
   }

   public Set k() {
      b.K();
      HashSet var2 = Sets.newHashSet();
      File var3 = new File(this.v, "assets/");
      if(var3.isDirectory()) {
         File[] var4 = var3.listFiles(DirectoryFileFilter.DIRECTORY);
         int var5 = var4.length;
         int var6 = 0;
         if(var6 < var5) {
            File var7 = var4[var6];
            String var8 = b(var3, var7);
            if(var8.equals(var8.toLowerCase(Locale.ROOT))) {
               var2.add(var8.substring(0, var8.length() - 1));
            }

            this.T(var8);
            ++var6;
         }
      }

      return var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
