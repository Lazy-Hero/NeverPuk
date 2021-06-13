package net.z;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import net.xn;
import net.yz.m_;
import net.z.f;
import net.z.g;
import net.z.p;
import net.z.t1;
import net.z.w0;
import net.z.w_;
import net.z.wk;
import net.z.wz;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w implements net.z.z {
   private static final Logger M = LogManager.getLogger();
   private static final DateFormat U = new SimpleDateFormat();
   private static final m_ x = new m_("textures/misc/unknown_server.png");
   private static final m_ n = new m_("textures/gui/world_selection.png");
   private final net.nn.j J;
   private final w_ p;
   private final net.cg.r Z;
   private final m_ b;
   private final p S;
   private File l;
   private net.n9.x q;
   private long C;

   public w(p var1, net.cg.r var2, net.cg.j var3) {
      this.S = var1;
      this.p = var1.L();
      this.Z = var2;
      this.J = net.nn.j.b();
      this.b = new m_("worlds/" + var2.X() + "/icon");
      this.l = var3.P(var2.X(), "icon.png");
      if(!this.l.isFile()) {
         this.l = null;
      }

      this.l();
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      g.C();
      String var11 = this.Z.I();
      String var12 = this.Z.X() + " (" + U.format(new Date(this.Z.k())) + ")";
      String var13 = "";
      if(StringUtils.isEmpty(var11)) {
         var11 = net.c9.b.x("selectWorld.world", new Object[0]) + " " + (var1 + 1);
      }

      if(this.Z.I()) {
         (new StringBuilder()).append(net.c9.b.x("selectWorld.conversion", new Object[0])).append(" ").append(var13).toString();
      }

      var13 = net.c9.b.x("gameMode." + this.Z.Y().t(), new Object[0]);
      if(this.Z.Y()) {
         var13 = net.cb.z.DARK_RED + net.c9.b.x("gameMode.hardcore", new Object[0]) + net.cb.z.RESET;
      }

      if(this.Z.j()) {
         var13 = var13 + ", " + net.c9.b.x("selectWorld.cheats", new Object[0]);
      }

      String var14 = this.Z.S();
      if(this.Z.Q()) {
         if(this.Z.K()) {
            var13 = var13 + ", " + net.c9.b.x("selectWorld.version", new Object[0]) + " " + net.cb.z.RED + var14 + net.cb.z.RESET;
         }

         var13 = var13 + ", " + net.c9.b.x("selectWorld.version", new Object[0]) + " " + net.cb.z.ITALIC + var14 + net.cb.z.RESET;
      }

      var13 = var13 + ", " + net.c9.b.x("selectWorld.version", new Object[0]) + " " + var14;
      this.J.sO.v(var11, (float)(var2 + 32 + 3), (float)(var3 + 1), 16777215);
      this.J.sO.v(var12, (float)(var2 + 32 + 3), (float)(var3 + this.J.sO.R + 3), 8421504);
      this.J.sO.v(var13, (float)(var2 + 32 + 3), (float)(var3 + this.J.sO.R + this.J.sO.R + 3), 8421504);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.J.n().E(this.q != null?this.b:x);
      net.y.d.C();
      g.r((float)var2, (float)var3, 0.0F, 0.0F, 32.0F, 32.0F, 32.0F, 32.0F);
      net.y.d.E();
      if(this.J.T.iI || var8) {
         this.J.n().E(n);
         g.u(var2, var3, var2 + 32, var3 + 32, -1601138544);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         int var18 = var6 - var2;
         int var15 = var18 < 32?32:0;
         if(this.Z.Q()) {
            g.r((float)var2, (float)var3, 32.0F, (float)var15, 32.0F, 32.0F, 256.0F, 256.0F);
            if(this.Z.K()) {
               g.r((float)var2, (float)var3, 96.0F, (float)var15, 32.0F, 32.0F, 256.0F, 256.0F);
               if(var18 >= 32) {
                  return;
               }

               this.p.f(net.cb.z.RED + net.c9.b.x("selectWorld.tooltip.fromNewerVersion1", new Object[0]) + "\n" + net.cb.z.RED + net.c9.b.x("selectWorld.tooltip.fromNewerVersion2", new Object[0]));
            }

            g.r((float)var2, (float)var3, 64.0F, (float)var15, 32.0F, 32.0F, 256.0F, 256.0F);
            if(var18 >= 32) {
               return;
            }

            this.p.f(net.cb.z.GOLD + net.c9.b.x("selectWorld.tooltip.snapshot1", new Object[0]) + "\n" + net.cb.z.GOLD + net.c9.b.x("selectWorld.tooltip.snapshot2", new Object[0]));
         }

         g.r((float)var2, (float)var3, 0.0F, (float)var15, 32.0F, 32.0F, 256.0F, 256.0F);
      }

   }

   public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.S.U(var1);
      if(var5 <= 32 && var5 < 32) {
         this.e();
         return true;
      } else if(net.nn.j.E() - this.C < 250L) {
         this.e();
         return true;
      } else {
         this.C = net.nn.j.E();
         return false;
      }
   }

   public void e() {
      if(this.Z.K()) {
         this.J.s(new wz(new f() {
            public void y(boolean var1, int var2) {
               boolean var3 = g.B();
               w.this.A();
               w.this.J.s(w.this.p);
            }

            private static xn a(xn var0) {
               return var0;
            }
         }, net.c9.b.x("selectWorld.versionQuestion", new Object[0]), net.c9.b.x("selectWorld.versionWarning", new Object[]{this.Z.S()}), net.c9.b.x("selectWorld.versionJoinButton", new Object[0]), net.c9.b.x("gui.cancel", new Object[0]), 0));
      } else {
         this.A();
      }

   }

   public void S() {
      this.J.s(new wz(new f() {
         public void y(boolean var1, int var2) {
            boolean var3 = g.C();
            w.this.J.s(new w0());
            net.cg.j var4 = w.this.J.l();
            var4.h();
            var4.R(w.this.Z.X());
            w.this.S.V();
            w.this.J.s(w.this.p);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, net.c9.b.x("selectWorld.deleteQuestion", new Object[0]), "\'" + this.Z.I() + "\' " + net.c9.b.x("selectWorld.deleteWarning", new Object[0]), net.c9.b.x("selectWorld.deleteButton", new Object[0]), net.c9.b.x("gui.cancel", new Object[0]), 0));
   }

   public void g() {
      this.J.s(new wk(this.p, this.Z.X()));
   }

   public void I() {
      this.J.s(new w0());
      t1 var1 = new t1(this.p);
      net.cg.d var2 = this.J.l().i(this.Z.X(), false);
      net.cg.z var3 = var2.F();
      var2.K();
      var1.O(var3);
      this.J.s(var1);
   }

   private void A() {
      this.J.n().g((net.h.d)net.h.a.v(net.nb.l.Ku, 1.0F));
      if(this.J.l().v(this.Z.X())) {
         this.J.p(this.Z.X(), this.Z.I(), (net.yv.t)null);
      }

   }

   private void l() {
      boolean var1 = this.l != null && this.l.isFile();
      BufferedImage var2 = ImageIO.read(this.l);
      Validate.validState(var2.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
      Validate.validState(var2.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
      if(this.q == null) {
         this.q = new net.n9.x(var2.getWidth(), var2.getHeight());
         this.J.n().E(this.b, this.q);
      }

      var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), this.q.X(), 0, var2.getWidth());
      this.q.g();
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void h(int var1, int var2, int var3, float var4) {
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
