package net.yz;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.i6;
import net.z9;
import net.y.ui;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;

public class av {
   private static final Logger q = LogManager.getLogger();
   private static final DateFormat i = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
   private static IntBuffer o;
   private static int[] s;

   public static net.cb.t d(File var0, int var1, int var2, net.y2.t var3) {
      return j(var0, (String)null, var1, var2, var3);
   }

   public static net.cb.t j(File var0, @Nullable String var1, int var2, int var3, net.y2.t var4) {
      int var5 = m_.J();
      File var6 = new File(var0, "screenshots");
      var6.mkdir();
      net.nn.j var7 = net.nn.j.b();
      int var10000 = z9.d().iL;
      new net.z.t(var7);
      net.z.t.K();
      int var11 = z9.R();
      boolean var12 = ui.R() && var11 > 1;
      BufferedImage var13 = R(var2, var3, var4);
      File var14 = O(var6);
      var14 = new File(var6, var1);
      var14 = var14.getCanonicalFile();
      Object var15 = null;
      if(i6.M_.r()) {
         var15 = i6.H(i6.M_, new Object[]{var13, var14});
         if(i6.I(var15, i6.BF, new Object[0])) {
            return (net.cb.t)i6.b(var15, i6.Bo, new Object[0]);
         }

         var14 = (File)i6.b(var15, i6.M0, new Object[0]);
      }

      ImageIO.write(var13, "png", var14);
      net.cb.l var16 = new net.cb.l(var14.getName());
      var16.E().V(new net.n6.k(net.n6.k.OPEN_FILE, var14.getAbsolutePath()));
      var16.E().o(Boolean.valueOf(true));
      if(var15 != null) {
         net.cb.t var17 = (net.cb.t)i6.b(var15, i6.Cq, new Object[0]);
         if(var17 != null) {
            return var17;
         }
      }

      return new net.cb.h("screenshot.success", new Object[]{var16});
   }

   public static BufferedImage R(int var0, int var1, net.y2.t var2) {
      if(ui.R()) {
         var0 = var2.A;
         var1 = var2.m;
      }

      int var3 = var0 * var1;
      if(o == null || o.capacity() < var3) {
         o = BufferUtils.createIntBuffer(var3);
         s = new int[var3];
      }

      net.y.d.u(3333, 1);
      net.y.d.u(3317, 1);
      o.clear();
      if(ui.R()) {
         net.y.d.z(var2.U);
         net.y.d.m(3553, 0, '胡', '荧', o);
      } else {
         net.y.d.I(0, 0, var0, var1, '胡', '荧', o);
      }

      o.get(s);
      net.n9.y.E(s, var0, var1);
      BufferedImage var4 = new BufferedImage(var0, var1, 1);
      var4.setRGB(0, 0, var0, var1, s, 0, var0);
      return var4;
   }

   private static File O(File var0) {
      String var1 = i.format(new Date());
      int var2 = 1;

      while(true) {
         File var3 = new File(var0, var1 + "" + ".png");
         if(!var3.exists()) {
            return var3;
         }

         ++var2;
      }
   }

   private static void b(int var0, int var1) {
      net.nn.j var2 = net.nn.j.b();
      var2.sB = Math.max(1, var0);
      var2.st = Math.max(1, var1);
      if(var2.s5 != null) {
         net.z.t var3 = new net.z.t(var2);
         var2.s5.H(var2, var3.u(), var3.v());
      }

      t();
   }

   private static void t() {
      net.nn.j var0 = net.nn.j.b();
      var0.O().H(var0.sB, var0.st);
      if(var0.s4 != null) {
         var0.s4.R(var0.sB, var0.st);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
