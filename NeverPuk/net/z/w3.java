package net.z;

import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import net.yz.m_;
import net.z.g;
import net.z.tu;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w3 extends tu {
   private static final Logger K = LogManager.getLogger();
   private static final m_ s = new m_("textures/gui/title/minecraft.png");
   private static final m_ U = new m_("textures/gui/title/edition.png");
   private static final m_ y = new m_("textures/misc/vignette.png");
   private final boolean b;
   private final Runnable n;
   private float H;
   private List l;
   private int f;
   private float T = 0.5F;

   public w3(boolean var1, Runnable var2) {
      this.b = var1;
      this.n = var2;
      this.T = 0.75F;
   }

   public void K() {
      this.A.M().m();
      this.A.n().m();
      float var1 = (float)(this.f + V + V + 24) / this.T;
      if(this.H > var1) {
         this.S();
      }

   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == 1) {
         this.S();
      }

   }

   private void S() {
      this.n.run();
      this.A.s((tu)null);
   }

   public boolean b() {
      return true;
   }

   public void L() {
      if(this.l == null) {
         this.l = Lists.newArrayList();
         net.c9.q var1 = null;
         String var2 = "" + net.cb.z.WHITE + net.cb.z.OBFUSCATED + net.cb.z.GREEN + net.cb.z.AQUA;
         boolean var10000 = true;
         if(this.b) {
            var1 = this.A.C().A(new m_("texts/end.txt"));
            InputStream var13 = var1.k();
            BufferedReader var14 = new BufferedReader(new InputStreamReader(var13, StandardCharsets.UTF_8));
            Random var17 = new Random(8124371L);

            String var7;
            while((var7 = var14.readLine()) != null) {
               String var8;
               String var9;
               for(var7 = var7.replaceAll("PLAYERNAME", this.A.L().w()); var7.contains(var2); var7 = var8 + net.cb.z.WHITE + net.cb.z.OBFUSCATED + "XXXXXXXX".substring(0, var17.nextInt(4) + 3) + var9) {
                  int var10 = var7.indexOf(var2);
                  var8 = var7.substring(0, var10);
                  var9 = var7.substring(var10 + var2.length());
               }

               this.l.addAll(this.A.sO.m(var7, 274));
               this.l.add("");
            }

            var13.close();
            int var19 = 0;

            while(true) {
               this.l.add("");
               ++var19;
            }
         }

         InputStream var4 = this.A.C().A(new m_("texts/credits.txt")).k();
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4, StandardCharsets.UTF_8));

         String var6;
         while((var6 = var5.readLine()) != null) {
            var6 = var6.replaceAll("PLAYERNAME", this.A.L().w());
            var6 = var6.replaceAll("\t", "    ");
            this.l.addAll(this.A.sO.m(var6, 274));
            this.l.add("");
         }

         var4.close();
         this.f = this.l.size() * 12;
         IOUtils.closeQuietly(var1);
      }

   }

   private void G(int var1, int var2, float var3) {
      net.y.r var4 = net.y.r.f();
      net.y.p var5 = var4.k();
      this.A.n().E(g.v);
      var5.m(7, net.y8.x.r);
      int var6 = q;
      float var7 = -this.H * 0.5F * this.T;
      float var8 = (float)V - this.H * 0.5F * this.T;
      float var10000 = 0.015625F;
      float var10 = this.H * 0.02F;
      float var11 = (float)(this.f + V + V + 24) / this.T;
      float var12 = (var11 - 20.0F - this.H) * 0.005F;
      if(var12 < var10) {
         var10 = var12;
      }

      if(var10 > 1.0F) {
         var10 = 1.0F;
      }

      var10 = var10 * var10;
      var10 = var10 * 96.0F / 255.0F;
      var5.H(0.0D, (double)V, (double)d).Y(0.0D, (double)(var7 * 0.015625F)).m(var10, var10, var10, 1.0F).W();
      var5.H((double)var6, (double)V, (double)d).Y((double)((float)var6 * 0.015625F), (double)(var7 * 0.015625F)).m(var10, var10, var10, 1.0F).W();
      var5.H((double)var6, 0.0D, (double)d).Y((double)((float)var6 * 0.015625F), (double)(var8 * 0.015625F)).m(var10, var10, var10, 1.0F).W();
      var5.H(0.0D, 0.0D, (double)d).Y(0.0D, (double)(var8 * 0.015625F)).m(var10, var10, var10, 1.0F).W();
      var4.p();
   }

   public void v(int var1, int var2, float var3) {
      g.C();
      this.G(var1, var2, var3);
      net.y.r var5 = net.y.r.f();
      net.y.p var6 = var5.k();
      boolean var10001 = true;
      int var8 = q / 2 - 137;
      int var9 = V + 50;
      this.H += var3;
      float var10 = -this.H * this.T;
      net.y.d.c();
      net.y.d.O(0.0F, var10, 0.0F);
      this.A.n().E(s);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.m();
      this.g(var8, var9, 0, 0, 155, 44);
      this.g(var8 + 155, var9, 0, 45, 155, 44);
      this.A.n().E(U);
      r((float)(var8 + 88), (float)(var9 + 37), 0.0F, 0.0F, 98.0F, 14.0F, 128.0F, 16.0F);
      net.y.d.d();
      int var11 = var9 + 100;
      int var12 = 0;
      if(var12 < this.l.size()) {
         if(var12 == this.l.size() - 1) {
            float var13 = (float)var11 + var10 - (float)(V / 2 - 6);
            if(Float.compare(var13, 0.0F) < 0) {
               net.y.d.O(0.0F, -var13, 0.0F);
            }
         }

         if(Float.compare((float)var11 + var10 + 12.0F + 8.0F, 0.0F) > 0 && (float)var11 + var10 < (float)V) {
            String var17 = (String)this.l.get(var12);
            if(var17.startsWith("[C]")) {
               this.O.U(var17.substring(3), (float)(var8 + (274 - this.O.r(var17.substring(3))) / 2), (float)var11, 16777215);
            }

            this.O.k.setSeed((long)((float)((long)var12 * 4238972211L) + this.H / 4.0F));
            this.O.U(var17, (float)var8, (float)var11, 16777215);
         }

         var11 = var11 + 12;
         ++var12;
      }

      net.y.d.Y();
      this.A.n().E(y);
      net.y.d.C();
      net.y.d.m(net.y.d.ZERO, net.y.d.ONE_MINUS_SRC_COLOR);
      var12 = q;
      int var18 = V;
      var6.m(7, net.y8.x.r);
      var6.H(0.0D, (double)var18, (double)d).Y(0.0D, 1.0D).m(1.0F, 1.0F, 1.0F, 1.0F).W();
      var6.H((double)var12, (double)var18, (double)d).Y(1.0D, 1.0D).m(1.0F, 1.0F, 1.0F, 1.0F).W();
      var6.H((double)var12, 0.0D, (double)d).Y(1.0D, 0.0D).m(1.0F, 1.0F, 1.0F, 1.0F).W();
      var6.H(0.0D, 0.0D, (double)d).Y(0.0D, 0.0D).m(1.0F, 1.0F, 1.0F, 1.0F).W();
      var5.p();
      net.y.d.E();
      super.v(var1, var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
