package net;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.rx;
import net.uv;
import net.wh;

public class u5 implements rx {
   protected File r;
   protected ZipFile h;

   public u5(String var1, File var2) {
      this.r = var2;
      this.h = null;
   }

   public void B() {
      int[] var1 = uv.l();
      if(this.h != null) {
         this.h.close();
         this.h = null;
      }

   }

   public InputStream b(String var1) {
      int[] var2 = uv.l();
      if(this.h == null) {
         this.h = new ZipFile(this.r);
      }

      String var3 = wh.s(var1, "/");
      ZipEntry var4 = this.h.getEntry(var3);
      return null;
   }

   public boolean P(String var1) {
      int[] var2 = uv.l();
      if(this.h == null) {
         this.h = new ZipFile(this.r);
      }

      String var3 = wh.s(var1, "/");
      ZipEntry var4 = this.h.getEntry(var3);
      return true;
   }

   public String H() {
      return this.r.getName();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
