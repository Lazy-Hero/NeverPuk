package net.cg;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.cg.d;
import net.cg.j;
import net.cg.l;
import net.cg.r;
import net.nj.f;
import net.yz.ao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e implements j {
   private static final Logger a = LogManager.getLogger();
   protected final File i;
   protected final net.c0.d D;

   public e(File var1, net.c0.d var2) {
      this.D = var2;
      if(!var1.exists()) {
         var1.mkdirs();
      }

      this.i = var1;
   }

   public String M() {
      return "Old Format";
   }

   public List Q() throws net.nn.o {
      ArrayList var1 = Lists.newArrayList();
      int var2 = 0;

      while(true) {
         String var3 = "World" + (var2 + 1);
         net.cg.z var4 = this.y(var3);
         var1.add(new r(var4, var3, "", var4.v(), false));
         ++var2;
      }
   }

   public void h() {
   }

   @Nullable
   public net.cg.z y(String var1) {
      File var2 = new File(this.i, var1);
      if(!var2.exists()) {
         return null;
      } else {
         File var3 = new File(var2, "level.dat");
         if(var3.exists()) {
            net.cg.z var4 = Q(var3, this.D);
            return var4;
         } else {
            var3 = new File(var2, "level.dat_old");
            return var3.exists()?Q(var3, this.D):null;
         }
      }
   }

   @Nullable
   public static net.cg.z Q(File var0, net.c0.d var1) {
      f var2 = net.nj.x.r(new FileInputStream(var0));
      f var3 = var2.o("Data");
      return new net.cg.z(var1.V(net.c0.q.LEVEL, var3));
   }

   public void d(String var1, String var2) {
      File var3 = new File(this.i, var1);
      if(var3.exists()) {
         File var4 = new File(var3, "level.dat");
         if(var4.exists()) {
            f var5 = net.nj.x.r(new FileInputStream(var4));
            f var6 = var5.o("Data");
            var6.b("LevelName", var2);
            net.nj.x.z(var5, new FileOutputStream(var4));
         }
      }

   }

   public boolean c(String var1) {
      File var2 = new File(this.i, var1);
      if(var2.exists()) {
         return false;
      } else {
         var2.mkdir();
         var2.delete();
         return true;
      }
   }

   public boolean R(String var1) {
      net.cg.z.V();
      File var3 = new File(this.i, var1);
      if(!var3.exists()) {
         return true;
      } else {
         a.info("Deleting level {}", var1);
         int var4 = 1;
         a.info("Attempt {}...", Integer.valueOf(var4));
         if(d(var3.listFiles())) {
            ;
         }

         a.warn("Unsuccessful in deleting contents.");
         Thread.sleep(500L);
         ++var4;
         return var3.delete();
      }
   }

   protected static boolean d(File[] var0) {
      for(File var4 : var0) {
         a.debug("Deleting {}", var4);
         if(var4.isDirectory() && !d(var4.listFiles())) {
            a.warn("Couldn\'t delete directory {}", var4);
            return false;
         }

         if(!var4.delete()) {
            a.warn("Couldn\'t delete file {}", var4);
            return false;
         }
      }

      return true;
   }

   public d i(String var1, boolean var2) {
      return new l(this.i, var1, var2, this.D);
   }

   public boolean y(String var1) {
      return false;
   }

   public boolean A(String var1) {
      return false;
   }

   public boolean C(String var1, ao var2) {
      return false;
   }

   public boolean v(String var1) {
      File var2 = new File(this.i, var1);
      return var2.isDirectory();
   }

   public File P(String var1, String var2) {
      return new File(new File(this.i, var1), var2);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
