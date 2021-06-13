package net.z;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.yz.m_;
import net.z.g;
import net.z.t9;
import net.z.tu;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w4 implements net.z.z {
   private static final Logger D = LogManager.getLogger();
   private static final ThreadPoolExecutor E = new ScheduledThreadPoolExecutor(5, (new ThreadFactoryBuilder()).setNameFormat("Server Pinger #%d").setDaemon(true).build());
   private static final m_ d = new m_("textures/misc/unknown_server.png");
   private static final m_ l = new m_("textures/gui/server_selection.png");
   private final t9 W;
   private final net.nn.j I;
   private final net.cp.d w;
   private final m_ Y;
   private String C;
   private net.n9.x V;
   private long A;

   protected w4(t9 var1, net.cp.d var2) {
      this.W = var1;
      this.w = var2;
      this.I = net.nn.j.b();
      this.Y = new m_("servers/" + var2.C + "/icon");
      this.V = (net.n9.x)this.I.n().m(this.Y);
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      boolean var10 = g.B();
      if(!this.w.H) {
         this.w.H = true;
         this.w.o = -2L;
         this.w.I = "";
         this.w.X = "";
         E.submit(new Runnable() {
            public void run() {
               w4.this.W.N().d(w4.this.w);
            }
         });
      }

      boolean var11 = this.w.Z > 340;
      boolean var12 = this.w.Z < 340;
      boolean var13 = false;
      this.I.sO.v(this.w.U, (float)(var2 + 32 + 3), (float)(var3 + 1), 16777215);
      List var14 = this.I.sO.m(this.w.I, var4 - 32 - 2);
      int var15 = 0;
      if(var15 < Math.min(var14.size(), 2)) {
         this.I.sO.v((String)var14.get(var15), (float)(var2 + 32 + 3), (float)(var3 + 12 + this.I.sO.R * var15), 8421504);
         ++var15;
      }

      String var26 = net.cb.z.DARK_RED + this.w.c;
      int var16 = this.I.sO.r(var26);
      this.I.sO.v(var26, (float)(var2 + var4 - var16 - 15 - 2), (float)(var3 + 1), 8421504);
      byte var17 = 0;
      String var18 = null;
      byte var19 = 5;
      String var20 = net.c9.b.x("multiplayer.status.client_out_of_date", new Object[0]);
      var18 = this.w.d;
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.I.n().E(g.e);
      g.r((float)(var2 + var4 - 15), (float)var3, (float)(var17 * 10), (float)(176 + var19 * 8), 10.0F, 8.0F, 256.0F, 256.0F);
      if(this.w.f() != null && !this.w.f().equals(this.C)) {
         this.C = this.w.f();
         this.q();
         this.W.N().h();
      }

      if(this.V != null) {
         this.h(var2, var3, this.Y);
      }

      this.h(var2, var3, d);
      int var21 = var6 - var2;
      int var22 = var7 - var3;
      if(var21 >= var4 - 15 && var21 <= var4 - 5 && var22 >= 0 && var22 <= 8) {
         this.W.r(var20);
      }

      if(var21 >= var4 - var16 - 15 - 2 && var21 <= var4 - 15 - 2 && var22 >= 0 && var22 <= 8) {
         this.W.r(var18);
      }

      if(this.I.T.iI || var8) {
         this.I.n().E(l);
         g.u(var2, var3, var2 + 32, var3 + 32, -1601138544);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         int var23 = var6 - var2;
         int var24 = var7 - var3;
         if(this.y()) {
            if(var23 < 32 && var23 > 16) {
               g.r((float)var2, (float)var3, 0.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            g.r((float)var2, (float)var3, 0.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }

         if(this.W.Z(this, var1)) {
            if(var23 < 16 && var24 < 16) {
               g.r((float)var2, (float)var3, 96.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            g.r((float)var2, (float)var3, 96.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }

         if(this.W.G(this, var1)) {
            if(var23 < 16 && var24 > 16) {
               g.r((float)var2, (float)var3, 64.0F, 32.0F, 32.0F, 32.0F, 256.0F, 256.0F);
            }

            g.r((float)var2, (float)var3, 64.0F, 0.0F, 32.0F, 32.0F, 256.0F, 256.0F);
         }
      }

   }

   protected void h(int var1, int var2, m_ var3) {
      this.I.n().E(var3);
      net.y.d.C();
      g.r((float)var1, (float)var2, 0.0F, 0.0F, 32.0F, 32.0F, 32.0F, 32.0F);
      net.y.d.E();
   }

   private boolean y() {
      return true;
   }

   private void q() {
      if(this.w.f() == null) {
         this.I.n().q(this.Y);
         this.V = null;
      } else {
         ByteBuf var1 = Unpooled.copiedBuffer(this.w.f(), StandardCharsets.UTF_8);
         ByteBuf var2 = null;
         var2 = Base64.decode(var1);
         BufferedImage var3 = net.n9.y.T(new ByteBufInputStream(var2));
         Validate.validState(var3.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
         Validate.validState(var3.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
         var1.release();
         var2.release();
         if(this.V == null) {
            this.V = new net.n9.x(var3.getWidth(), var3.getHeight());
            this.I.n().E(this.Y, this.V);
         }

         var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), this.V.X(), 0, var3.getWidth());
         this.V.g();
      }

   }

   public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 <= 32) {
         if(var5 < 32 && var5 > 16 && this.y()) {
            this.W.M(var1);
            this.W.v();
            return true;
         }

         if(var5 < 16 && var6 < 16 && this.W.Z(this, var1)) {
            this.W.W(this, var1, tu.s());
            return true;
         }

         if(var5 < 16 && var6 > 16 && this.W.G(this, var1)) {
            this.W.x(this, var1, tu.s());
            return true;
         }
      }

      this.W.M(var1);
      if(net.nn.j.E() - this.A < 250L) {
         this.W.v();
      }

      this.A = net.nn.j.E();
      return false;
   }

   public void h(int var1, int var2, int var3, float var4) {
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public net.cp.d S() {
      return this.w;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
