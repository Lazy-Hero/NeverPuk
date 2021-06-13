package net;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.mf;
import net.mq;
import net.oz;
import net.xl;
import net.z9;
import net.d.l;
import net.d.w;
import net.nr.d;

public class oj {
   public static void b(w var0, l var1) {
      String var2 = mf.O();
      d var3 = z9.d();
      if(var3 != null) {
         if(var3.wp) {
            Throwable var4 = var0.k();
            if(var4 != null) {
               if(var4.getClass() != Throwable.class) {
                  if(!var4.getClass().getName().contains(".fml.client.SplashProgress")) {
                     c(var1);
                     String var5 = "http://optifine.net/crashReport";
                     String var6 = a(var0);
                     byte[] var7 = var6.getBytes(StandardCharsets.US_ASCII);
                     xl var8 = new xl() {
                        public void b(String var1, byte[] var2, Throwable var3) {
                        }
                     };
                     HashMap var9 = new HashMap();
                     var9.put("OF-Version", z9.U());
                     var9.put("OF-Summary", p(var0));
                     mq var10 = new mq(var5, var9, var7, var8);
                     var10.setPriority(10);
                     var10.start();
                     Thread.sleep(1000L);
                  }
               }
            }
         }
      }
   }

   private static String a(w var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append("OptiFineVersion: " + z9.U() + "\n");
      var1.append("Summary: " + p(var0) + "\n");
      var1.append("\n");
      var1.append(var0.Z());
      var1.append("\n");
      return var1.toString();
   }

   private static String p(w var0) {
      Throwable var1 = var0.k();
      return "Unknown";
   }

   public static void c(l var0) {
      mf.O();
      var0.e("OptiFine Version", z9.U());
      if(z9.d() != null) {
         var0.e("Render Distance Chunks", "" + z9.b());
         var0.e("Mipmaps", "" + z9.w());
         var0.e("Anisotropic Filtering", "" + z9.W());
         var0.e("Antialiasing", "" + z9.A());
         var0.e("Multitexture", "" + z9.Sk());
      }

      var0.e("Shaders", "" + oz.J());
      var0.e("OpenGlVersion", "" + z9.e);
      var0.e("OpenGlRenderer", "" + z9.V);
      var0.e("OpenGlVendor", "" + z9.S);
      var0.e("CpuCount", "" + z9.y());
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
