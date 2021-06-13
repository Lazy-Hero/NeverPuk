package net.y;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.Proxy.Type;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.oo;
import net.w2;
import net.xq;
import net.xw;
import net.z9;
import net.y.p;
import net.y.um;
import net.yz.m_;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uh extends net.n9.p {
   private static final Logger U = LogManager.getLogger();
   private static final AtomicInteger t = new AtomicInteger(0);
   @Nullable
   private final File s;
   private final String p;
   @Nullable
   private final um A;
   @Nullable
   private BufferedImage v;
   @Nullable
   private Thread L;
   private boolean T;
   public Boolean C = null;
   public boolean F = false;

   public uh(@Nullable File var1, String var2, m_ var3, @Nullable um var4) {
      super(var3);
      this.s = var1;
      this.p = var2;
      this.A = var4;
   }

   private void D() {
      if(!this.T && this.v != null) {
         this.T = true;
         if(this.a != null) {
            this.P();
         }

         net.n9.y.s(super.L(), this.v);
      }

   }

   public int L() {
      this.D();
      return super.L();
   }

   public void F(BufferedImage var1) {
      this.v = var1;
      if(this.A != null) {
         this.A.X();
      }

      this.C = Boolean.valueOf(this.v != null);
   }

   public void c(net.c9.p var1) throws IOException {
      if(this.v == null && this.a != null) {
         super.c(var1);
      }

      if(this.L == null) {
         if(this.s != null && this.s.isFile()) {
            U.debug("Loading http texture from local cache ({})", this.s);
            this.v = ImageIO.read(this.s);
            if(this.A != null) {
               this.F(this.A.i(this.v));
            }

            this.j();
         } else {
            this.E();
         }
      }

   }

   protected void E() {
      this.L = new Thread("Texture Downloader #" + t.incrementAndGet()) {
         public void run() {
            p.S();
            HttpURLConnection var2 = null;
            uh.U.debug("Downloading http texture from {} to {}", uh.this.p, uh.this.s);
            if(uh.this.n()) {
               uh.this.Z();
            }

            var2 = (HttpURLConnection)(new URL(uh.this.p)).openConnection(net.nn.j.b().u());
            var2.setDoInput(true);
            var2.setDoOutput(false);
            var2.connect();
            if(var2.getResponseCode() / 100 != 2) {
               if(var2.getErrorStream() != null) {
                  z9.D(var2.getErrorStream());
               }

               if(var2 != null) {
                  var2.disconnect();
               }

               uh.this.j();
            } else {
               if(uh.this.s != null) {
                  FileUtils.copyInputStreamToFile(var2.getInputStream(), uh.this.s);
                  BufferedImage var3 = ImageIO.read(uh.this.s);
               }

               BufferedImage var6 = net.n9.y.T(var2.getInputStream());
               if(uh.this.A != null) {
                  var6 = uh.this.A.i(var6);
               }

               uh.this.F(var6);
               var2.disconnect();
               uh.this.j();
            }
         }

         private static Exception a(Exception var0) {
            return var0;
         }
      };
      this.L.setDaemon(true);
      this.L.start();
   }

   private boolean n() {
      if(!this.F) {
         return false;
      } else {
         Proxy var1 = net.nn.j.b().u();
         return var1.type() != Type.DIRECT && var1.type() != Type.SOCKS?false:this.p.startsWith("http://");
      }
   }

   private void Z() {
      String var1 = p.S();
      xw var2 = oo.l(this.p, net.nn.j.b().u());
      w2 var3 = oo.D(var2);
      if(var3.q() / 100 != 2) {
         this.j();
      } else {
         byte[] var4 = var3.g();
         ByteArrayInputStream var5 = new ByteArrayInputStream(var4);
         if(this.s != null) {
            FileUtils.copyInputStreamToFile(var5, this.s);
            BufferedImage var6 = ImageIO.read(this.s);
         }

         BufferedImage var8 = net.n9.y.T(var5);
         if(this.A != null) {
            var8 = this.A.i(var8);
         }

         this.F(var8);
         this.j();
      }
   }

   private void j() {
      this.C = Boolean.valueOf(this.v != null);
      if(this.A instanceof xq) {
         xq var1 = (xq)this.A;
         var1.f();
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
