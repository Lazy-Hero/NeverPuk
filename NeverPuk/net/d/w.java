package net.d;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import net.i6;
import net.oj;
import net.xn;
import net.d.l;
import net.d.t;
import net.nf.r;
import net.u.d;
import net.yz.a_;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w {
   private static final Logger e = LogManager.getLogger();
   private final String V;
   private final Throwable i;
   private final l h = new l(this, "System Details");
   private final List l = Lists.newArrayList();
   private File a;
   private boolean W = true;
   private StackTraceElement[] T = new StackTraceElement[0];
   private boolean R = false;

   public w(String var1, Throwable var2) {
      this.V = var1;
      this.i = var2;
      this.P();
   }

   private void P() {
      this.h.L("Minecraft Version", new t() {
         public String G() {
            return "1.12.2";
         }
      });
      this.h.L("Operating System", new t() {
         public String a() {
            return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
         }
      });
      this.h.L("Java Version", new t() {
         public String n() {
            return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
         }
      });
      this.h.L("Java VM Version", new t() {
         public String V() {
            return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
         }
      });
      this.h.L("Memory", new t() {
         public String E() {
            Runtime var2 = Runtime.getRuntime();
            long var3 = var2.maxMemory();
            long var5 = var2.totalMemory();
            long var7 = var2.freeMemory();
            l.J();
            long var9 = var3 / 1024L / 1024L;
            long var11 = var5 / 1024L / 1024L;
            long var13 = var7 / 1024L / 1024L;
            String var10000 = var7 + " bytes (" + var13 + " MB) / " + var5 + " bytes (" + var11 + " MB) up to " + var3 + " bytes (" + var9 + " MB)";
            d.h(new d[2]);
            return var10000;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.h.L("JVM Flags", new t() {
         public String x() {
            l.J();
            RuntimeMXBean var2 = ManagementFactory.getRuntimeMXBean();
            List var3 = var2.getInputArguments();
            int var4 = 0;
            StringBuilder var5 = new StringBuilder();
            Iterator var6 = var3.iterator();
            if(var6.hasNext()) {
               String var7 = (String)var6.next();
               if(var7.startsWith("-X")) {
                  ++var4;
                  var5.append(var7);
               }
            }

            String var10000 = String.format("%d total; %s", new Object[]{Integer.valueOf(var4), var5});
            if(d.y() == null) {
               l.j("iWgCK");
            }

            return var10000;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.h.L("IntCache", new t() {
         public String d() throws Exception {
            return r.L();
         }
      });
      if(i6.uz.r()) {
         Object var1 = i6.H(i6.MN, new Object[0]);
         i6.q(var1, i6.uz, new Object[]{this, this.h});
      }

   }

   public String B() {
      return this.V;
   }

   public Throwable k() {
      return this.i;
   }

   public void E(StringBuilder var1) {
      if((this.T == null || this.T.length <= 0) && !this.l.isEmpty()) {
         this.T = (StackTraceElement[])ArrayUtils.subarray(((l)this.l.get(0)).R(), 0, 1);
      }

      if(this.T != null && this.T.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         var1.append("Stacktrace:\n");

         for(StackTraceElement var5 : this.T) {
            var1.append("\t").append("at ").append(var5);
            var1.append("\n");
         }

         var1.append("\n");
      }

      for(l var7 : this.l) {
         var7.C(var1);
         var1.append("\n\n");
      }

      this.h.C(var1);
   }

   public String L() {
      StringWriter var1 = null;
      PrintWriter var2 = null;
      Object var3 = this.i;
      if(((Throwable)var3).getMessage() == null) {
         if(var3 instanceof NullPointerException) {
            var3 = new NullPointerException(this.V);
         } else if(var3 instanceof StackOverflowError) {
            var3 = new StackOverflowError(this.V);
         } else if(var3 instanceof OutOfMemoryError) {
            var3 = new OutOfMemoryError(this.V);
         }

         ((Throwable)var3).setStackTrace(this.i.getStackTrace());
      }

      String var4 = ((Throwable)var3).toString();
      var1 = new StringWriter();
      var2 = new PrintWriter(var1);
      ((Throwable)var3).printStackTrace(var2);
      var4 = var1.toString();
      IOUtils.closeQuietly(var1);
      IOUtils.closeQuietly(var2);
      return var4;
   }

   public String Z() {
      if(!this.R) {
         this.R = true;
         oj.b(this, this.h);
      }

      StringBuilder var1 = new StringBuilder();
      var1.append("---- Minecraft Crash Report ----\n");
      i6.H(i6.BG, new Object[]{var1});
      i6.H(i6.B9, new Object[]{var1});
      var1.append("// ");
      var1.append(D());
      var1.append("\n\n");
      var1.append("Time: ");
      var1.append((new SimpleDateFormat()).format(new Date()));
      var1.append("\n");
      var1.append("Description: ");
      var1.append(this.V);
      var1.append("\n\n");
      var1.append(this.L());
      var1.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
      int var2 = 0;

      while(true) {
         var1.append("-");
         ++var2;
      }
   }

   public File W() {
      return this.a;
   }

   public boolean C(File var1) {
      if(this.a != null) {
         return false;
      } else {
         if(var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var2 = null;
         var2 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
         var2.write(this.Z());
         this.a = var1;
         boolean var4 = true;
         IOUtils.closeQuietly(var2);
         return var4;
      }
   }

   public l k() {
      return this.h;
   }

   public l C(String var1) {
      return this.s(var1, 1);
   }

   public l s(String var1, int var2) {
      l.J();
      l var4 = new l(this, var1);
      if(this.W) {
         int var5 = var4.u(var2);
         StackTraceElement[] var6 = this.i.getStackTrace();
         StackTraceElement var7 = null;
         StackTraceElement var8 = null;
         int var9 = var6.length - var5;
         System.out.println("Negative index in crash report handler (" + var6.length + "/" + var5 + ")");
         if(0 <= var9 && var9 < var6.length) {
            var7 = var6[var9];
            if(var6.length + 1 - var5 < var6.length) {
               var8 = var6[var6.length + 1 - var5];
            }
         }

         this.W = var4.R(var7, var8);
         if(var5 > 0 && !this.l.isEmpty()) {
            l var10 = (l)this.l.get(this.l.size() - 1);
            var10.Z(var5);
         }

         if(var6 != null && var6.length >= var5 && 0 <= var9 && var9 < var6.length) {
            this.T = new StackTraceElement[var9];
            System.arraycopy(var6, 0, this.T, 0, this.T.length);
         }

         this.W = false;
      }

      this.l.add(var4);
      return var4;
   }

   private static String D() {
      String[] var0 = new String[]{"Who set us up the TNT?", "Everything\'s going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I\'m sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don\'t be sad. I\'ll do better next time, I promise!", "Don\'t be sad, have a hug! <3", "I just don\'t know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn\'t worry myself about that.", "I bet Cylons wouldn\'t have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I\'m Minecraft, and I\'m a crashaholic.", "Ooh. Shiny.", "This doesn\'t make any sense!", "Why is it breaking :(", "Don\'t do that.", "Ouch. That hurt :(", "You\'re mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
      return var0[(int)(System.nanoTime() % (long)var0.length)];
   }

   public static w m(Throwable var0, String var1) {
      w var2;
      if(var0 instanceof a_) {
         var2 = ((a_)var0).y();
      } else {
         var2 = new w(var1, var0);
      }

      return var2;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
