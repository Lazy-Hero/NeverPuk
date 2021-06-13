package net;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.oz;
import net.uv;
import net.c9.p;
import net.n9.f;
import net.n9.y;
import net.y3.b;
import net.y3.c;
import net.y3.d;
import net.y3.e;
import net.y3.g;
import net.y3.m;
import net.y3.r;
import net.y3.s;
import org.apache.commons.io.IOUtils;

public class zz extends f {
   private final String l;
   private static final c t = z();

   public zz(String var1) {
      this.l = var1;
   }

   public void c(p var1) throws IOException {
      uv.l();
      this.P();
      InputStream var3 = oz.K(this.l);
      if(var3 == null) {
         throw new FileNotFoundException("Shader texture not found: " + this.l);
      } else {
         BufferedImage var4 = y.T(var3);
         d var5 = this.p();
         y.c(this.L(), var4, var5.w(), var5.s());
         IOUtils.closeQuietly(var3);
      }
   }

   private d p() {
      String var2 = this.l + ".mcmeta";
      uv.l();
      String var3 = "texture";
      InputStream var4 = oz.K(var2);
      c var5 = t;
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4));
      JsonObject var8 = (new JsonParser()).parse(var6).getAsJsonObject();
      d var9 = (d)var5.t(var3, var8);
      if(var9 == null) {
         d var10 = new d(false, false);
         IOUtils.closeQuietly(var6);
         IOUtils.closeQuietly(var4);
         return var10;
      } else {
         IOUtils.closeQuietly(var6);
         IOUtils.closeQuietly(var4);
         return var9;
      }
   }

   private static c z() {
      c var0 = new c();
      var0.w(new b(), d.class);
      var0.w(new m(), net.y3.y.class);
      var0.w(new net.y3.v(), r.class);
      var0.w(new s(), net.y3.p.class);
      var0.w(new g(), e.class);
      return var0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
