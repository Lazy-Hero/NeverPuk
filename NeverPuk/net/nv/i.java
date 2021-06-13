package net.nv;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i extends h {
   private static final Logger N = LogManager.getLogger();
   private long Y;
   private int w;

   public String k() {
      return "debug";
   }

   public int o() {
      return 3;
   }

   public String K(f var1) {
      return "commands.debug.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      if(var3.length < 1) {
         throw new x("commands.debug.usage", new Object[0]);
      } else {
         if("start".equals(var3[0])) {
            if(var3.length != 1) {
               throw new x("commands.debug.usage", new Object[0]);
            }

            g(var2, this, "commands.debug.start", new Object[0]);
            var1.W();
            this.Y = net.nx.f.X();
            this.w = var1.s();
         } else {
            if(!"stop".equals(var3[0])) {
               throw new x("commands.debug.usage", new Object[0]);
            }

            if(var3.length != 1) {
               throw new x("commands.debug.usage", new Object[0]);
            }

            if(!var1.a.R) {
               throw new t("commands.debug.notStarted", new Object[0]);
            }

            long var4 = net.nx.f.X();
            int var6 = var1.s();
            long var7 = var4 - this.Y;
            int var9 = var6 - this.w;
            this.t(var7, var9, var1);
            var1.a.R = false;
            g(var2, this, "commands.debug.stop", new Object[]{String.format("%.2f", new Object[]{Float.valueOf((float)var7 / 1000.0F)}), Integer.valueOf(var9)});
         }

      }
   }

   private void t(long var1, int var3, net.nx.f var4) {
      File var5 = new File(var4.A("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
      var5.getParentFile().mkdirs();
      OutputStreamWriter var6 = null;
      var6 = new OutputStreamWriter(new FileOutputStream(var5), StandardCharsets.UTF_8);
      var6.write(this.T(var1, var3, var4));
      IOUtils.closeQuietly(var6);
   }

   private String T(long var1, int var3, net.nx.f var4) {
      StringBuilder var5 = new StringBuilder();
      var5.append("---- Minecraft Profiler Results ----\n");
      var5.append("// ");
      var5.append(K());
      var5.append("\n\n");
      var5.append("Time span: ").append(var1).append(" ms\n");
      var5.append("Tick span: ").append(var3).append(" ticks\n");
      var5.append("// This is approximately ").append(String.format("%.2f", new Object[]{Float.valueOf((float)var3 / ((float)var1 / 1000.0F))})).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
      var5.append("--- BEGIN PROFILE DUMP ---\n\n");
      this.a(0, "root", var5, var4);
      var5.append("--- END PROFILE DUMP ---\n\n");
      return var5.toString();
   }

   private void a(int var1, String var2, StringBuilder var3, net.nx.f var4) {
      t.Y();
      List var6 = var4.a.b(var2);
      if(var6 != null && var6.size() >= 3) {
         int var7 = 1;
         if(var7 < var6.size()) {
            net.yk.t var8 = (net.yk.t)var6.get(var7);
            var3.append(String.format("[%02d] ", new Object[]{Integer.valueOf(var1)}));
            int var9 = 0;
            if(var9 < var1) {
               var3.append("|   ");
               ++var9;
            }

            var3.append(var8.c).append(" - ").append(String.format("%.2f", new Object[]{Double.valueOf(var8.i)})).append("%/").append(String.format("%.2f", new Object[]{Double.valueOf(var8.M)})).append("%\n");
            if(!"unspecified".equals(var8.c)) {
               this.a(var1 + 1, var2 + "." + var8.c, var3, var4);
            }

            ++var7;
         }
      }

   }

   private static String K() {
      String[] var0 = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I\'m working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it\'ll have more motivation to work faster! Poor server."};
      return var0[(int)(System.nanoTime() % (long)var0.length)];
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"start", "stop"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
