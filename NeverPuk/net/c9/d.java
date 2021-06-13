package net.c9;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import net.c9.x;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class d implements x {
   private static final Logger k = LogManager.getLogger();
   public final File v;

   public d(File var1) {
      this.v = var1;
   }

   private static String k(m_ var0) {
      return String.format("%s/%s/%s", new Object[]{"assets", var0.A(), var0.v()});
   }

   protected static String b(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   public InputStream q(m_ var1) throws IOException {
      return this.R(k(var1));
   }

   public boolean E(m_ var1) {
      return this.L(k(var1));
   }

   protected abstract InputStream R(String var1) throws IOException;

   protected abstract boolean L(String var1);

   protected void T(String var1) {
      k.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", var1, this.v);
   }

   public net.y3.n K(net.y3.c var1, String var2) throws IOException {
      return x(var1, this.R("pack.mcmeta"), var2);
   }

   static net.y3.n x(net.y3.c var0, InputStream var1, String var2) {
      JsonObject var3 = null;
      BufferedReader var4 = null;
      var4 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8));
      var3 = (new JsonParser()).parse(var4).getAsJsonObject();
      IOUtils.closeQuietly(var4);
      return var0.t(var2, var3);
   }

   public BufferedImage y() throws IOException {
      return net.n9.y.T(this.R("pack.png"));
   }

   public String U() {
      return this.v.getName();
   }
}
