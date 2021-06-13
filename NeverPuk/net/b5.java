package net;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import net.rx;
import net.uv;
import net.wh;

public class b5 implements rx {
   protected File d;

   public b5(String var1, File var2) {
      this.d = var2;
   }

   public void B() {
   }

   public InputStream b(String var1) {
      String var2 = wh.F(var1, "/", "/");
      File var3 = new File(this.d, var2);
      return !var3.exists()?null:new BufferedInputStream(new FileInputStream(var3));
   }

   public boolean P(String var1) {
      uv.l();
      File var3 = new File(this.d, var1.substring(1));
      return !var3.exists()?false:var3.isDirectory();
   }

   public String H() {
      return this.d.getName();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
