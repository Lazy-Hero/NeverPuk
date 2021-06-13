package net.ny;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.cg.e;
import net.nb.x;
import net.nn.o;
import net.ns.i6;
import net.ns.i9;
import net.ny.b;
import net.ny.f;
import net.ny.i;
import net.ny.t;
import net.yz.ao;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d extends e {
   private static final Logger u = LogManager.getLogger();

   public d(File var1, net.c0.d var2) {
      super(var1, var2);
   }

   public String M() {
      return "Anvil";
   }

   public List Q() throws o {
      if(this.i != null && this.i.exists() && this.i.isDirectory()) {
         ArrayList var1 = Lists.newArrayList();
         File[] var2 = this.i.listFiles();

         for(File var6 : var2) {
            if(var6.isDirectory()) {
               String var7 = var6.getName();
               net.cg.z var8 = this.y(var7);
               if(var8.t() == 19132 || var8.t() == 19133) {
                  boolean var9 = var8.t() != this.M();
                  String var10 = var8.M();
                  if(StringUtils.isEmpty(var10)) {
                     var10 = var7;
                  }

                  long var10000 = 0L;
                  var1.add(new net.cg.r(var8, var7, var10, 0L, var9));
               }
            }
         }

         return var1;
      } else {
         throw new o(net.yq.e.E("selectWorld.load_folder_access"));
      }
   }

   protected int M() {
      return 19133;
   }

   public void h() {
      b.h();
   }

   public net.cg.d i(String var1, boolean var2) {
      return new t(this.i, var1, var2, this.D);
   }

   public boolean y(String var1) {
      net.cg.z var2 = this.y(var1);
      return var2.t() == 19132;
   }

   public boolean A(String var1) {
      net.cg.z var2 = this.y(var1);
      return var2.t() != this.M();
   }

   public boolean C(String var1, ao var2) {
      f.h();
      var2.H(0);
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      File var7 = new File(this.i, var1);
      File var8 = new File(var7, "DIM-1");
      File var9 = new File(var7, "DIM1");
      u.info("Scanning folders...");
      this.k(var7, var4);
      if(var8.exists()) {
         this.k(var8, var5);
      }

      if(var9.exists()) {
         this.k(var9, var6);
      }

      int var10 = var4.size() + var5.size() + var6.size();
      u.info("Total conversion count is {}", Integer.valueOf(var10));
      net.cg.z var11 = this.y(var1);
      if(var11 != null && var11.h() == net.yv.j.T) {
         new i6(x.v);
         net.u.d.h(new net.u.d[3]);
      }

      i9 var12 = new i9(var11);
      this.k(new File(var7, "region"), var4, var12, 0, var10, var2);
      this.k(new File(var8, "region"), var5, new i6(x.l), var4.size(), var10, var2);
      this.k(new File(var9, "region"), var6, new i6(x.P), var4.size() + var5.size(), var10, var2);
      var11.z(19133);
      if(var11.h() == net.yv.j.f) {
         var11.N(net.yv.j.R);
      }

      this.q(var1);
      net.cg.d var13 = this.i(var1, false);
      var13.g(var11);
      return true;
   }

   private void q(String var1) {
      File var2 = new File(this.i, var1);
      if(!var2.exists()) {
         u.warn("Unable to create level.dat_mcr backup");
      } else {
         File var3 = new File(var2, "level.dat");
         if(!var3.exists()) {
            u.warn("Unable to create level.dat_mcr backup");
         } else {
            File var4 = new File(var2, "level.dat_mcr");
            if(!var3.renameTo(var4)) {
               u.warn("Unable to create level.dat_mcr backup");
            }
         }
      }

   }

   private void k(File var1, Iterable var2, i9 var3, int var4, int var5, ao var6) {
      for(File var8 : var2) {
         this.u(var1, var8, var3, var4, var5, var6);
         ++var4;
         int var9 = (int)Math.round(100.0D * (double)var4 / (double)var5);
         var6.H(var9);
      }

   }

   private void u(File var1, File var2, i9 var3, int var4, int var5, ao var6) {
      String var7 = var2.getName();
      i var8 = new i(var2);
      i var9 = new i(new File(var1, var7.substring(0, var7.length() - ".mcr".length()) + ".mca"));
      byte var10 = 0;
      int var11 = 0;

      while(true) {
         if(var8.f(var10, var11) && !var9.f(var10, var11)) {
            DataInputStream var12 = var8.z(var10, var11);
            u.warn("Failed to fetch input stream");
         }

         ++var11;
      }
   }

   private void k(File var1, Collection var2) {
      File var3 = new File(var1, "region");
      File[] var4 = var3.listFiles(new FilenameFilter() {
         public boolean accept(File var1, String var2) {
            return var2.endsWith(".mcr");
         }
      });
      Collections.addAll(var2, var4);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
